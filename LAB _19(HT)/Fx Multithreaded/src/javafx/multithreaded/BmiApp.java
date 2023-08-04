package javafx.multithreaded;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.geometry.Pos;
import java.util.concurrent.Executors;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import javafx.scene.paint.Color;

public class BmiApp extends Application {
  private Stage bmiOutputStage = null;
  private ExecutorService threadExecutor = Executors.newFixedThreadPool(2);  
  
  @Override
  public void start(Stage primaryStage) {
    Pane bmiInputLayout = new BmiInputLayout().getBmiInputLayout();

    Scene primaryScene = new Scene(bmiInputLayout);
    primaryStage.setTitle("BMI Calculator");
    primaryStage.setScene(primaryScene);
    primaryStage.setMinHeight(200);
    primaryStage.setMinWidth(700);
    primaryStage.show();

    ((Button) bmiInputLayout.lookup("#calculate-bmi-btn")).setOnAction(e -> {
        Runnable processBMIRunnableTask = new Runnable() {
          @Override
          public void run() {
            processBMI(bmiInputLayout);
          }
        };

        this.threadExecutor.execute(processBMIRunnableTask);
    });

    ((Button) bmiInputLayout.lookup("#exit-btn")).setOnAction(event -> {
      primaryStage.close();
    });

    primaryStage.setOnHiding(e -> this.threadExecutor.shutdown());
  }

  public static void main(String[] args) {
    Application.launch(args);
  }

  public void showErrorWindow(Pane parentPane, String errorText) {
    Button okButton = new Button("OK");
    Label errorLabel = new Label(errorText);

    VBox errorWindowLayout = new VBox();
    errorWindowLayout.setAlignment(Pos.CENTER);
    errorWindowLayout.setSpacing(20);
    errorWindowLayout.setPadding(new Insets(20, 20, 20, 20));
    errorWindowLayout.getChildren().addAll(errorLabel, okButton);

    Stage errorStage = new Stage();
    errorStage.initModality(Modality.APPLICATION_MODAL);
    errorStage.initOwner(parentPane.getScene().getWindow());
    errorStage.setScene(new Scene(errorWindowLayout));
    errorStage.setTitle("Error!");
    errorStage.setResizable(false);

    okButton.setOnAction(event -> errorStage.close());

    errorStage.show();
  }

  public void processBMI(Pane bmiInputLayout) {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        TextField weightTextField = (TextField) bmiInputLayout.lookup("#weight-text-field");
        TextField heightTextField = (TextField) bmiInputLayout.lookup("#height-text-field");

        double weight, height;
        
        Map<String, Color> bmiStatus = new HashMap<>();
        bmiStatus.put("UnderWeight", Color.RED);
        bmiStatus.put("Overweight", Color.YELLOW);
        bmiStatus.put("Obese", Color.GREEN);
        bmiStatus.put("Normal", Color.BLUE);

        try {
          weight = Double.parseDouble(weightTextField.getText());
          height = Double.parseDouble(heightTextField.getText());

          String bmi = BmiCalculator.calculateBMI(weight, height);
          
          //DecimalFormat bmiDecimalFormat = new DecimalFormat("##.##");
          //String bmiString = bmiDecimalFormat.format(bmi);

          // the stage was created already
          if (bmiOutputStage != null) {
            ((Label) bmiOutputStage.getScene().getRoot().lookup("#bmi-status")).setText(bmi);
            ((Label) bmiOutputStage.getScene().getRoot().lookup("#bmi-status")).setTextFill(bmiStatus.get(bmi));

            bmiOutputStage.show();
          } else {
            Pane bmiOutputLayout = new BmiOutputLayout().getBmiOutputLayout();
            bmiOutputStage = new Stage();

            ((Label) bmiOutputLayout.lookup("#bmi-status")).setText(bmi);
            ((Label) bmiOutputLayout.lookup("#bmi-status")).setTextFill(bmiStatus.get(bmi));

            ((Button) bmiOutputLayout.lookup("#ok-btn")).setOnAction(event -> {
              bmiOutputStage.close();
            });

            Scene outputScene = new Scene(bmiOutputLayout);
            bmiOutputStage.setScene(outputScene);
            bmiOutputStage.setTitle("BMI Status");
            bmiOutputStage.setMinWidth(300);
            bmiOutputStage.setResizable(false);
            bmiOutputStage.show();
          }
        } catch (NumberFormatException invalidNumber) {
          showErrorWindow(bmiInputLayout, "Invalid height/weight.");
        } catch (IllegalArgumentException illegalArgument) {
          showErrorWindow(bmiInputLayout, illegalArgument.getMessage());
        }
      }
    });
  }
}
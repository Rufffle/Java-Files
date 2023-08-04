
package lab.pkg18.ht;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.*;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TraficLight extends Application{
  
  public static BorderPane bPane = new BorderPane();
  public static GraphicsContext lights;
  public static Circle redCircle = new Circle(450, 50, 40);
  public static Circle yellowCircle = new Circle(450, 140, 40);
  public static Circle greenCircle = new Circle(450, 230, 40);
  
  public static void main(String[] args) {
    launch(args);
  }

  public static VBox setTrafficLight(){
    StackPane pane = new StackPane();
    VBox panelForLight = new VBox(16);
    panelForLight.setPadding(new Insets(20, 20, 20, 20));
    //panelForLight.setStyle("-fx-border-color:black;");
    
    //Circle redCircle = new Circle(450, 50, 40);
    redCircle.setStroke(Color.BLACK);
    redCircle.setFill(Color.WHITE);
    
    //Circle yellowCircle = new Circle(450, 50, 40);
    yellowCircle.setStroke(Color.BLACK);
    yellowCircle.setFill(Color.WHITE);
    
    //Circle greenCircle = new Circle(450, 50, 40);
    greenCircle.setStroke(Color.BLACK);
    greenCircle.setFill(Color.WHITE);
    
    panelForLight.setSpacing(10);
    panelForLight.setAlignment(Pos.CENTER);
    bPane.getChildren().addAll(redCircle,yellowCircle,greenCircle);
    
    return panelForLight;
  }
  
  public static HBox setPanelForRadioButton(){
    
    HBox panelForRadioButton = new HBox(16);
    RadioButton rbRed = new RadioButton("Red");
    RadioButton rbGreen = new RadioButton("Green");
    RadioButton rbYellow = new RadioButton("Yellow");
    panelForRadioButton.setPadding(new Insets(20, 20, 20, 20));
    panelForRadioButton.setStyle("-fx-border-color: black;");
    panelForRadioButton.getChildren().addAll(rbRed,rbYellow,rbGreen);
    EventHandler<ActionEvent> handler = e->{
      if(rbRed.isSelected() && !rbYellow.isSelected() && !rbYellow.isSelected()){
        Circle circleRed = new Circle(450, 50, 40);
        circleRed.setFill(RED);
      }
    };
    
    return panelForRadioButton;
  }
  
  @Override
  public void start(Stage primaryStage) throws Exception {
    
    bPane.setPadding(new Insets(20, 20, 20, 20));
    bPane.setBottom(setPanelForRadioButton());
    bPane.setCenter(setTrafficLight());
    //bPane.setAlignment(setTrafficLight(), Pos.BOTTOM_CENTER);
    BorderPane.setMargin(setPanelForRadioButton(), new Insets(10));
    
    Scene scene = new Scene(bPane, 900, 400);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Trafic Light");
    primaryStage.show();
  }
  
}

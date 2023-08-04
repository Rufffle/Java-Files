package javafx.multithreaded;

import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class BmiInputLayout {
    private Pane bmiInputLayout;

    public BmiInputLayout() {
        Button calculateBMIButton = new Button("Calculate BMI");
        calculateBMIButton.setId("calculate-bmi-btn");

        Button exitButton = new Button("Exit");
        exitButton.setId("exit-btn");

        Label weightTextFieldLabel = new Label("Your Weight (Kilograms): ");
        Label heightTextFieldLabel = new Label("Your Height (Feet): ");

        TextField weightTextField = new TextField();
        weightTextField.setId("weight-text-field");

        TextField heightTextField = new TextField();
        heightTextField.setId("height-text-field");

        // set up positioning of the UI components
        HBox weightTextAndLabelLayout = new HBox();
        weightTextAndLabelLayout.setSpacing(20);
        weightTextAndLabelLayout.getChildren().addAll(weightTextFieldLabel, weightTextField);

        HBox heightTextAndLabelLayout = new HBox();
        heightTextAndLabelLayout.setSpacing(50);
        heightTextAndLabelLayout.getChildren().addAll(heightTextFieldLabel, heightTextField);
        
        HBox buttonLayout = new HBox();
        buttonLayout.setSpacing(30);
        buttonLayout.getChildren().addAll(calculateBMIButton, exitButton);

        // parent pane
        GridPane parentLayout = new GridPane();
        parentLayout.setPadding(new Insets(20, 30, 20, 30));
        parentLayout.setHgap(20);
        parentLayout.setVgap(20);

        ColumnConstraints gridLayoutColumn1 = new ColumnConstraints();
        gridLayoutColumn1.setPercentWidth(60);
        ColumnConstraints gridLayoutColumn2 = new ColumnConstraints();
        gridLayoutColumn2.setPercentWidth(40);

        parentLayout.getColumnConstraints().addAll(gridLayoutColumn1, gridLayoutColumn2);

        RowConstraints gridLayoutRow1 = new RowConstraints();
        gridLayoutRow1.setPercentHeight(75.0 / 2);
        RowConstraints gridLayoutRow2 = new RowConstraints();
        gridLayoutRow2.setPercentHeight(75.0 / 2);
        RowConstraints gridLayoutRow3 = new RowConstraints();
        gridLayoutRow3.setPercentHeight(25);

        parentLayout.getRowConstraints().addAll(gridLayoutRow1, gridLayoutRow2, gridLayoutRow3);

        parentLayout.add(weightTextAndLabelLayout, 0, 0);
        parentLayout.add(heightTextAndLabelLayout, 0, 1);
        parentLayout.add(buttonLayout, 1, 2);

        this.bmiInputLayout = parentLayout;
    }

    public Pane getBmiInputLayout() {
        return this.bmiInputLayout;
    }

}
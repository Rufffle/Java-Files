package javafx.multithreaded;

import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class BmiOutputLayout {
    private Pane bmiOutputLayout;

    public BmiOutputLayout() {
        Button okButton = new Button("OK");
        okButton.setId("ok-btn");

        Label bmiInfoLabel = new Label("Your BMI result indicat that you are ");
        Label bmiStatusLabel = new Label();
        bmiStatusLabel.setId("bmi-status");
        
        HBox bmiInfoandResultLayout = new HBox();
        bmiInfoandResultLayout.setSpacing(10);
        bmiInfoandResultLayout.getChildren().addAll(bmiInfoLabel, bmiStatusLabel);

        // parent pane
        GridPane parentLayout = new GridPane();
        parentLayout.setPadding(new Insets(10, 30, 20, 30));
        parentLayout.setHgap(20);
        parentLayout.setVgap(20);

        parentLayout.add(bmiInfoandResultLayout, 0, 1);
        parentLayout.add(okButton, 1, 4);

        this.bmiOutputLayout = parentLayout;
    }

    public Pane getBmiOutputLayout() {
        return this.bmiOutputLayout;
    }

}
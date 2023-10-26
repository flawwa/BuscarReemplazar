package BuscarYReemplazar;

import javafx.application.Application;
import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class App extends Application {
    private Stage primaryStage;
    private StringProperty buscar = new SimpleStringProperty();
    private StringProperty reemplazar = new SimpleStringProperty();

    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;

        TextField buscarText = new TextField();
        buscarText.setPromptText("Buscar aquí");

        TextField reemplazarText = new TextField();
        reemplazarText.setPromptText("Reemplazar aquí");

        CheckBox casesCheckBox = new CheckBox("Mayúsculas y minúsculas");
        CheckBox expresionCheckBox = new CheckBox("Expresión regular");
        CheckBox buscarCheckBox = new CheckBox("Buscar hacia atrás");
        CheckBox resaltarCheckBox = new CheckBox("Resaltar resultados");

        GridPane gridPane = new GridPane();
        gridPane.setVgap(5);
        gridPane.setHgap(10);
        gridPane.add(new Label("Buscar:"), 0, 0);
        gridPane.add(buscarText, 1, 0);
        gridPane.add(new Label("Reemplazar:"), 0, 1);
        gridPane.add(reemplazarText, 1, 1);

        // Organiza los CheckBox en dos filas
        gridPane.add(casesCheckBox, 0, 2);
        gridPane.add(expresionCheckBox, 1, 2);
        gridPane.add(buscarCheckBox, 0, 3);
        gridPane.add(resaltarCheckBox, 1, 3);

        VBox rightVBox = new VBox(5);
        rightVBox.setAlignment(Pos.TOP_LEFT);
        rightVBox.getChildren().add(new Button("Buscar"));
        rightVBox.getChildren().add(new Button("Reemplazar"));
        rightVBox.getChildren().add(new Button("Reemplazar todo"));
        rightVBox.getChildren().add(new Button("Cerrar"));
        rightVBox.getChildren().add(new Button("Ayuda"));

        // Crear un BorderPane para organizar los elementos
        BorderPane root = new BorderPane();
        root.setCenter(gridPane);
        root.setRight(rightVBox);

        // Crear una nueva Scene con el BorderPane como contenido
        Scene scene = new Scene(root, 530, 320);

        // Establecer la Scene en el Stage y mostrarlo
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mi Aplicación JavaFX");
        primaryStage.show();
    }
}

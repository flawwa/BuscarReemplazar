package BuscarYReemplazar;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class AppGrid extends Application {

    private Stage primaryStage;

    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;

        // Crear los elementos del formulario
        TextField buscarText = new TextField();
        buscarText.setPromptText("Buscar");

        TextField reemplazarText = new TextField();
        reemplazarText.setPromptText("Reemplazar");

        RadioButton casesRadio = new RadioButton("Mayúsculas y minúsculas");
        RadioButton expresionRadio = new RadioButton("Expresión regular");
        RadioButton buscarRadio = new RadioButton("Buscar hacia atrás");
        RadioButton resaltarRadio = new RadioButton("Resaltar resultados");

        ToggleGroup opcionesGroup = new ToggleGroup();
        opcionesGroup.getToggles().setAll(casesRadio, expresionRadio, buscarRadio, resaltarRadio);

        // Crear un contenedor para los elementos del formulario
        VBox formVBox = new VBox(10);
        formVBox.getChildren().addAll(
                new Label("Buscar:"),
                buscarText,
                new Label("Reemplazar con:"),
                reemplazarText,
                casesRadio,
                expresionRadio,
                buscarRadio,
                resaltarRadio
        );

        // Crear el contenedor de los botones
        VBox buttonsVBox = new VBox(5); // Espacio vertical entre botones
        buttonsVBox.setAlignment(Pos.TOP_RIGHT);
        Button buscarButton = new Button("Buscar");
        Button reemplazarButton = new Button("Reemplazar");
        Button reemplazarTodoButton = new Button("Reemplazar todo");
        Button cerrarButton = new Button("Cerrar");
        Button ayudaButton = new Button("Ayuda");

        buttonsVBox.getChildren().addAll(
                buscarButton,
                reemplazarButton,
                reemplazarTodoButton,
                cerrarButton,
                ayudaButton
        );

        // Crear el contenedor principal usando BorderPane
        BorderPane root = new BorderPane();
        root.setCenter(formVBox);
        root.setRight(buttonsVBox);

        Scene scene = new Scene(root, 640, 480);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Mi Aplicación JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}




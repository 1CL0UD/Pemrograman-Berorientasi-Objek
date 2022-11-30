/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum14_shalahuddin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;


/**
 *
 * @author Praktikan
 */
public class Praktikum14_Shalahuddin extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("login page.fxml"));
        
        Scene scene = new Scene(root);
//        
        stage.setScene(scene);
        stage.show();
//        Button btn = new Button("Click Me");
//        Label txt = new Label(" ");
//        
//        
////        btn.setOnAction(new EventHandler<ActionEvent>(){
////            @Override
////            public void handle(ActionEvent event){
////                txt.setText("Hello World");
////            }
////        });
//        btn.setOnAction((ActionEvent event) -> {
//            txt.setText("Hello World");
//        });
//        
//        
//        VBox root = new VBox();
////        StackPane root = new StackPane();
//        root.setAlignment(Pos.CENTER);
//        root.getChildren().add(txt);
//        root.getChildren().add(btn);
//        
//        Scene scene = new Scene(root);
//        
//        stage.setHeight(300);
//        stage.setWidth(300);
//        stage.setScene(scene);
        stage.setTitle("Shalahuddin Abdul Aziz - 2117051083");
//        stage.show();
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

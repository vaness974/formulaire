package view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ViewHandler extends Application {
    private Stage primaryStage;
    private ViewInscription formulaireInscription;



    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 350, 250, Color.ANTIQUEWHITE);
        formulaireInscription = new ViewInscription(root);


        //VBox vbox = new VBox(20);
        afficherFormInscription();
        primaryStage.setTitle("Formulaire");
        primaryStage.setFullScreen(true);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void afficherFormInscription() { formulaireInscription.setVueInscription();}



}

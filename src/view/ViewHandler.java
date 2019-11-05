package view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ViewHandler extends Application {
    private Stage primaryStage;
    private ViewInscription formulaireInscription;
    private ViewConnexion formulaireConnexion;

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 350, 250, Color.ANTIQUEWHITE);
        formulaireInscription = new ViewInscription(formulaireInscription, root);
        formulaireConnexion = new ViewConnexion(root);


        //VBox vbox = new VBox(20);
        afficherFormInscription();
        afficherFormConnexion();
        primaryStage.setTitle("Formulaire");
        primaryStage.setFullScreen(true);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void afficherFormInscription() { formulaireInscription.setVueInscription();}

    public void afficherFormConnexion() {formulaireConnexion.setVueConnexion();}

}

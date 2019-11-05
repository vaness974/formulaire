package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.security.acl.Group;

public class ViewConnexion {

    private Group root;
    private Text textTitre;
    private Label labelLogin;
    private TextField textFieldLogin;
    private Label labelMdp;
    private PasswordField passwordFieldMdp;
    private Button btnConnexion;


     ViewConnexion(Group root) {
        this.root = (Group) root;

        textTitre = initTitre(650, 100, "Connectez-vous", "Indie Flower", 100);
        labelLogin = initLabel(350,750,"Login");
        textFieldLogin = initField(350, 770, 250, 30);
        labelMdp = initLabel(350, 850, "Mot de passe");
        passwordFieldMdp = initMdp(350, 870, 250, 30);
        btnConnexion = initButton(450, 950, "Valider", 90, 30);
    }
    private Text initTitre(int posX, int posY, String titre, String police, int taillePolice){
        Text text = new Text(650, 100, "Incrivez-vous");
        text.setFont(new Font("Indie flower",100));
        text.setFill(Color.CHOCOLATE);
        return text;
    }
    private Label initLabel(int posX, int posY, String text){
        Label L = new Label();
        L.setLayoutX(posX);
        L.setLayoutY(posY);
        L.setText(text);
        return L;
    }
    private TextField initField(int posX, int posY, int tailleBoutonLargeur, int tailleBoutonHauteur){
        TextField T = new TextField();
        T.setLayoutX(posX);
        T.setLayoutY(posY);
        T.setPrefSize(tailleBoutonLargeur, tailleBoutonHauteur);
        return T;
    }
    private PasswordField initMdp(int posX, int posY, int tailleBoutonLargeur, int tailleBoutonHauteur){
        PasswordField mdp = new PasswordField();
        mdp.setLayoutX(posX);
        mdp.setLayoutY(posY);
        mdp.setPrefSize(tailleBoutonLargeur, tailleBoutonHauteur);
        return mdp;
    }
    private Button  initButton(int posX, int posY, String textButton, int tailleBoutonLargeur, int tailleBoutonHauteur){
        Button b = new Button();
        b.setLayoutX(posX);
        b.setLayoutY(posY);
        b.setText(textButton);
        b.setPrefSize(tailleBoutonLargeur, tailleBoutonHauteur);
        return b;
    }

    void setVueConnexion() {
    }
    public ViewConnexion(javafx.scene.Group root) {
    }
}

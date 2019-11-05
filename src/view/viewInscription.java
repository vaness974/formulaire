package view;

import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ViewInscription {
    private Group root;
    private Text textTitre;
    private Label labelNom;
    private TextField textFieldNom;
    private Label labelPrenom;
    private TextField textFieldPrenom;
    private Label labelAdresse;
    private TextField textFieldAdresse;
    private Label labelCodePostal;
    private TextField textFieldCodePostal;
    private Label labelVille;
    private TextField textFieldVille;
    private Label labelAdresseMail;
    private TextField textFieldAdresseMail;
    private Label labelLogin;
    private TextField textFieldLogin;
    private Label labelMdp;
    private PasswordField passwordFieldMdp;
    private Button btnValider;
    private ViewInscription formulaireInscription;

    ViewInscription(Group root){
       this.root = root;
        textTitre = initTitre(650, 100, "Inscrivez-vous", "Indie Flower", 100);
        labelNom = initLabel(350, 150, "Nom");
        labelPrenom = initLabel(350, 250, "Prénom");
        labelAdresse = initLabel(350, 350, "Adresse");
        labelCodePostal = initLabel(350, 450, "Code Postal");
        labelVille = initLabel(350, 550,"Ville");
        labelAdresseMail = initLabel(350,650, "Adresse Mail");
        labelLogin = initLabel(350,750,"Login");
        labelMdp = initLabel(350, 850, "Mot de passe");
        textFieldNom = initField(350, 170,250, 30);
        textFieldPrenom = initField(350, 270, 250, 30);
        textFieldAdresse = initField(350,370, 250, 30);
        textFieldCodePostal = initField(350, 470,250, 30 );
        textFieldVille = initField(350, 570, 250, 30);
        textFieldAdresseMail = initField(350,670, 250, 30);
        textFieldLogin = initField(350, 770, 250, 30);
        passwordFieldMdp = initMdp(350, 870, 250, 30);
        btnValider = initButton(450, 950, "Valider", 90, 30);

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

    void setVueInscription() {
       root.getChildren().clear();
       root.getChildren().add(textTitre);
       root.getChildren().add(labelNom);
       root.getChildren().add(textFieldNom);
       root.getChildren().add(labelPrenom);
       root.getChildren().add(textFieldPrenom);
       root.getChildren().add(labelAdresse);
       root.getChildren().add(textFieldAdresse);
       root.getChildren().add(labelCodePostal);
       root.getChildren().add(textFieldCodePostal);
       root.getChildren().add(labelVille);
       root.getChildren().add(textFieldVille);
       root.getChildren().add(labelAdresseMail);
       root.getChildren().add(textFieldAdresseMail);
       root.getChildren().add(labelLogin);
       root.getChildren().add(textFieldLogin);
       root.getChildren().add(labelMdp);
       root.getChildren().add(passwordFieldMdp);
       root.getChildren().add(btnValider);

    }

    public ViewInscription(ViewInscription formulaireInscription) {
        this.formulaireInscription = formulaireInscription;
    }

}

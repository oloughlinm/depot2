package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeClear extends CommandeDocument{

    /**
     * initialize la commande
     * @param document la destination
     * @param parameters les attributs de la commande
     */
    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 1) {
            System.err.println("Format attendu : clear;"); // ON VERIFIE LES 4 PARAMETRES
            return;
        }
        this.document.clear(); //appel de la fonction de remplacement de document
        super.executer();
    }
}

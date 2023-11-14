package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument{

    /**
     * initialize la commande
     * @param document la destination
     * @param parameters les attributs de la commande
     */
    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : inserer;index;chaine"); // ON VERIFIE LES 4 PARAMETRES
            return;
        }
        String texte = parameters[2];
        this.document.inserer(Integer.parseInt(parameters[1]), texte); //appel de la fonction de remplacement de document
        super.executer();
    }
}
package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * ajoute du texte
     * @param texte le texte ajouté
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * remplace une partie du texte
     * @param start l'indice de début du remplacement
     * @param end l'indice de fin du remplacement
     * @param remplacement le nouveau texte
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    /**
     * met une partie du texte en majuscules
     * @param start l'indice de début du passage en majuscules
     * @param end l'indice de fin du passage en majuscules
     */
    public void majuscules(int start, int end) {
        remplacer(start, end,  texte.substring(start, end).toUpperCase());
    }

    /**
     * efface une partie du texte
     * @param i l'indice de début de l'extrait effacé
     * @param i1 l'indice de fin de l'extrait effacé
     */
    public void effacer(int i, int i1) {
        remplacer(i, i1, "");
    }

    /**
     * efface le texte
     */
    public void clear() {
        effacer(0, texte.length()-1);
    }

    /**
     * insere un extrait au milieu du texte original
     * @param index l'indice de début de l'insertion
     * @param insertion le texte inséré
     */
    public void inserer(int index, String insertion){
        remplacer(index, index, insertion);
    }

    /**
     * met une partie du texte en minuscules
     * @param start l'indice de début du passage en minuscules
     * @param end l'indice de fin du passage en minuscules
     */
    public void minuscules(int start, int end){
        remplacer(start, end, texte.substring(start, end).toLowerCase());
    }

    @Override
    public String toString() {
        return this.texte;
    }


}

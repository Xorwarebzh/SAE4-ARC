import java.util.ArrayList;
import java.util.Date;

public class Volee {
    private int id;
    private int nbFleches;
    private ArrayList<Fleche> listeFleche;

    public Volee(int id, int nbFleches) {
        this.id = id;
        this.nbFleches = nbFleches;
        this.listeFleche = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public int getNbFleches() {
        return nbFleches;
    }

    public Date getTempsDebut() {
        return listeFleche.get(0).getTemps();
    }

    public Date getTempsFin() {
        return listeFleche.get(listeFleche.size() - 1).getTemps();
    }
    public int tempsEntreFleches(Fleche fleche1, Fleche fleche2) {
        long temps1 = fleche1.getTemps().getTime();
        long temps2 = fleche2.getTemps().getTime();
        return (int) Math.abs(temps1 - temps2);
    }

    public void tirFleche() {
        Fleche fleche = new Fleche(listeFleche.size() + 1);
        listeFleche.add(fleche);
    }

    public ArrayList<Fleche> getListeFleche() {
        return listeFleche;
    }
}
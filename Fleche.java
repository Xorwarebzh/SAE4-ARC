import java.util.Date;

public class Fleche {
    private int id;
    private boolean etat;
    private Date temps;

    public Fleche(int id) {
        this.id = id;
        this.etat = false;
        this.temps = new Date();
    }

    public int getId() {
        return id;
    }

    public boolean isEtat() {
        return etat;
    }

    public Date getTemps() {
        return temps;
    }
}

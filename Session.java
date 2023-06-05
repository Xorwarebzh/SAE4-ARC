import java.util.ArrayList;

public class Session {
    private int id;
    private ArrayList<Volee> listeVolee;

    public Session(int id) {
        this.id = id;
        this.listeVolee = new ArrayList<>();
    }

    public void ajoutVolee(Volee volee) {
        this.listeVolee.add(volee);
    }

    public Volee finVolee() {
        return listeVolee.get(listeVolee.size() - 1);
    }

    public ArrayList<Volee> getListeVolee() {
        return listeVolee;
    }
}
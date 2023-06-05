public class TestApplication {

    public static void main(String[] args) {

        // Créer une session
        Session session = new Session(1);

        // Ajouter une volée à la session
        Volee volee1 = new Volee(1, 5);
        session.ajoutVolee(volee1);

        // Tirer des flèches pour la volée 1
        volee1.tirFleche();


        try{
            Thread.sleep(300);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        volee1.tirFleche();

        try{
            Thread.sleep(400);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        volee1.tirFleche();

        try{
            Thread.sleep(500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        volee1.tirFleche();

        try{
            Thread.sleep(600);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        volee1.tirFleche();
        // Ajouter une autre volée à la session
        Volee volee2 = new Volee(2, 2);
        session.ajoutVolee(volee2);

        // Tirer des flèches pour la volée 2
        volee2.tirFleche();
        volee2.tirFleche();

       // Afficher le temps de début, de fin et la durée pour chaque volée
        System.out.println("Volée 1 - Temps de début : " + volee1.getTempsDebut());
        System.out.println("Volée 1 - Temps de fin : " + volee1.getTempsFin());
        long dureeVolee1 = volee1.getTempsFin().getTime() - volee1.getTempsDebut().getTime();
        System.out.println("Volée 1 - Durée : " + dureeVolee1 + " ms");

        System.out.println();

        System.out.println("Volée 2 - Temps de début : " + volee2.getTempsDebut());
        System.out.println("Volée 2 - Temps de fin : " + volee2.getTempsFin());
        long dureeVolee2 = volee2.getTempsFin().getTime() - volee2.getTempsDebut().getTime();
        System.out.println("Volée 2 - Durée : " + dureeVolee2 + " ms");

        // Calculer le temps entre les flèches pour chaque volée
        for (int i = 0; i < volee1.getNbFleches() - 1; i++) { 
            int tempsEntreFlechesVolee1 = volee1.tempsEntreFleches(volee1.getListeFleche().get(i), volee1.getListeFleche().get(i + 1));
            System.out.println("Temps entre les flèches " + (i + 1) + " et " + (i + 2) + " de la volée 1 : " + tempsEntreFlechesVolee1 + " ms");
        }

        // Afficher le nombre de flèches pour chaque volée
        System.out.println("Nombre de flèches pour la volée 1 : " + volee1.getNbFleches());
        System.out.println("Nombre de flèches pour la volée 2 : " + volee2.getNbFleches());
        // Afficher les informations des flèches pour chaque volée

        System.out.println("Flèches pour la volée 1 :");
        for (Fleche fleche : volee1.getListeFleche()) {
            System.out.println(" - Flèche " + fleche.getId() + " : état = " + fleche.isEtat() + ", temps = " + fleche.getTemps());
        }

        System.out.println("Flèches pour la volée 2 :");
        for (Fleche fleche : volee2.getListeFleche()) {
            System.out.println(" - Flèche " + fleche.getId() + " : état = " + fleche.isEtat() + ", temps = " + fleche.getTemps());
        }

        // Afficher les informations des volées pour la session
        System.out.println("Volées pour la session :");
        for (Volee volee : session.getListeVolee()) {
            System.out.println(" - Volée " + volee.getId() + " : nombre de flèches = " + volee.getNbFleches());
        }

    
    }
}
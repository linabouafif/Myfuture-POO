public class MainApp {

    public static void main(String[] args) {

        Client c1 = new Client(
                "07123456",
                "Ben Salah",
                "Sonia",
                "98765432");

        Client c2 = new Client(
                "09876543",
                "Kacem",
                "Ahmed",
                "50112233");

        CompteBancaire compte1 = new CompteBancaire(
                "CB-1001", 500.0, c1);

        CompteBancaire compte2 = new CompteBancaire(
                "CB-1002", 1500.0, c2);

        System.out.println("=== ÉTAT INITIAL DES COMPTES ===");

        compte1.afficherDetails();
        compte2.afficherDetails();

        System.out.println("\n=== TEST DES OPÉRATIONS ===");

        compte1.deposer(200.0);

        compte1.retirer(1000.0);

        compte1.retirer(300.0);

        System.out.println("\n=== TEST DU VIREMENT ===");

        compte2.virement(compte1, 500.0);

        System.out.println("\n=== ÉTAT FINAL DES COMPTES ===");

        compte1.afficherDetails();
        compte2.afficherDetails();

        System.out.println(
                "\nNombre total de comptes créés : "
                        + CompteBancaire.getNombreComptes());
    }
}
import java.util.Scanner;

public class CalculateZinsenRechner {

    Scanner scanner = new Scanner(System.in);

    public int getPrincipal() {
        int principal;
        while (true) {
            System.out.print("Darlehen(10k-1M): ");
            principal = scanner.nextInt();
            if (principal >= 10000 && principal <= 1_000_000) {
                return principal;
            }
            System.out.print("Geben Sie Bitte Wert zwischen 10k - 1M ");
        }

    }

    public float getJahresZinssatz(float PERCENT, int MONTHS_IN_YEAR){
        float jahresZinssatz;
        while (true) {
            System.out.print("Jahreszinssatz: ");
            jahresZinssatz = scanner.nextFloat();
            if (jahresZinssatz >= 3 && jahresZinssatz <= 6){

                jahresZinssatz = jahresZinssatz / PERCENT / MONTHS_IN_YEAR;
                return jahresZinssatz;
            }
            System.out.println("Geben Sie bitte Jahreszinssatz zwischen 3 und 6");
        }
    }

    public float getNumberOfPaymrntd(int MONTHS_IN_YEAR) {
        float numberOfPaymrntd;
        while (true){
            System.out.print("Laufzeit der Ratenzahlungen (Years):");
            float years = scanner.nextFloat();
            if (years >= 3 && years <= 30) {
                numberOfPaymrntd = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Geben Sie bitte wert zwischen 3 und 30");
        }
        return numberOfPaymrntd;
    }
}

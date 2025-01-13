import java.text.NumberFormat;

public class ZinsenRechner {
    private int MONTHS_IN_YEAR = 12;
    private float PERCENT = 100;

    CalculateZinsenRechner calculateZinsenRechner = new CalculateZinsenRechner();

    public void rechner(){
        int principal = calculateZinsenRechner.getPrincipal();
        float jahresZinssatz = calculateZinsenRechner.getJahresZinssatz(PERCENT, MONTHS_IN_YEAR);
        float numberOfPaymrntd = calculateZinsenRechner.getNumberOfPaymrntd(MONTHS_IN_YEAR);

        double mortgage = principal
                * (jahresZinssatz * Math.pow(1 + jahresZinssatz, numberOfPaymrntd) )
                / (Math.pow(1 + jahresZinssatz, numberOfPaymrntd)-1);
        String sam = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Verpfändung: "+ sam + "\n\n\n\n");

    }
}

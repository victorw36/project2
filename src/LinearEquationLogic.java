import java.util.Scanner;

public class LinearEquationLogic {

    private Scanner myScanner;
    private int x1;
    private int x2;
    private int y1;
    private int y2;


    public void LinearEquation () {
        myScanner = new Scanner(System.in);

    }
    private void enterOrderedPair() {
        String orderedPair = "";
        String orderedPair2 = "";
        System.out.print("Hello, enter an ordered pair(in this format (x, y): ");
        orderedPair = myScanner.nextLine();

        int index = orderedPair.indexOf(",");
        String digit1 = orderedPair.substring(1, index);
        int x1 = Integer.parseInt(digit1);

        String digit2 = orderedPair.substring(index + 2, orderedPair.length() - 1);
        int y1 = Integer.parseInt(digit2);

        System.out.print("Hello, enter another ordered pair(in this format (x, y): ");
        orderedPair2 = myScanner.nextLine();

        String digit3 = orderedPair2.substring(1, index);
        int x2 = Integer.parseInt(digit3);

        String digit4 = orderedPair2.substring(index + 2, orderedPair2.length() - 1);
        int y2 = Integer.parseInt(digit4);
    }
    private void start() {
        enterOrderedPair();

    }


}

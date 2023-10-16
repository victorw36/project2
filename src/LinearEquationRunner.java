public class LinearEquationRunner {
    public static void main(String[] args) {
        String orderedPair = ("(9000, 2000000)");
        int index = orderedPair.indexOf("(");
        int index2 = orderedPair.indexOf(",");

        String digit1 = orderedPair.substring(index + 1, index2);
        int newDigit1 = Integer.parseInt(digit1);
        System.out.println(newDigit1);

        String digit2 = orderedPair.substring(index2 + 2, orderedPair.length()-1);
        int newDigit2 = Integer.parseInt(digit2);
        System.out.println(newDigit2);


    }
}

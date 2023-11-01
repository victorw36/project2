public class LinearEquation {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double distance() {

        double distance = Math.sqrt((Math.pow(x1-x2,2) + (Math.pow(y1-y2, 2))));
        return roundedToHundred(distance);
    }

    public double slope() {
        double slope = (y2- 0.0 - y1) / (x2 - 0.0 - x1);
        return roundedToHundred(slope);
    }

    public double yIntercept() {

        double y =  (y2) - (x2 * slope());
        return roundedToHundred(y);
    }

    public String equation() {
        int numerator = y2 -y1;
        int denominator = x2 - x1;
        if (numerator == 0) {
            return "y = " +yIntercept();
        } else {
            return "y = " + numerator + "/" + denominator + "x + " + yIntercept();
        }
    }

    public String coordinateForX(double x) {
        double y = (slope() * x) + yIntercept();
        return "(" + x + ", " + y +")";
    }

    public String lineInfo() {
        return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\nThe equation of the line between the points is: " + equation() + "\nThe slope of this line is: " + slope() + "\nThe y-Intercept of the line is is: " + yIntercept() + "\nThe distance between these points is: " + distance();
    }
    public double roundedToHundred(double toRound) {
        return Math.round(toRound * 100.00) / 100.00;
    }
}
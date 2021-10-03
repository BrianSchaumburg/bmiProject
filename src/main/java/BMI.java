package main.java;
/*Dit is een berekeningsklasse*/
public class BMI {
    private double gewicht;
    private double lengte;
    public BMI(double gewicht , double lengte)
    {
        if (gewicht<0 || lengte<0) {
            throw new IllegalArgumentException("Het gewicht of de lengte is niet juist");
        }
        this.gewicht = gewicht; this.lengte = lengte;
    }
    public double berekenBMI()
    {
        return gewicht / (lengte * lengte);
    }
}

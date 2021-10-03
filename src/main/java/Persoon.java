package main.java;

import java.util.Date;

public class Persoon {
    private String naam; private double gewicht,lengte;
    private Date geboortedatum;
    public Date getDate()
    {
        return geboortedatum;
    }
    public String getNaam() {
        return naam;
    }

    public double getGewicht() {
        return gewicht;
    }

    public double getLengte() {
        return lengte;
    }

    public Persoon(String naam, double gewichtn, double lengte, Date geboortedatum)
    {   if(naam == null || gewicht <0 || lengte < 0 ||geboortedatum == null )
    {
        throw new IllegalArgumentException("Controleer de gegevens")    ;
    }
    else
    {
        this.naam = naam;
        this.gewicht = gewichtn;
        this.geboortedatum = geboortedatum;
        this.lengte = lengte
                ;
    }

    }
}

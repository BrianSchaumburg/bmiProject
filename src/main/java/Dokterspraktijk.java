package main.java;
public class Dokterspraktijk {
    //aanmaken van 3 personen
    private Persoon eerstePersoon, tweedePersoon, derdePersoon, vierdePersoon, vijfdePersoon;
    public Dokterspraktijk (Persoon x, Persoon y , Persoon z, Persoon a, Persoon b  )
    {   if(x == null || y == null || z == null || a == null || b == null)
        throw new IllegalArgumentException("Controleer de gegevens");

        eerstePersoon = x; tweedePersoon = y ; derdePersoon = z; vierdePersoon = a; vijfdePersoon = b;
    }
    public double berekeningPersoonBMI(Persoon x )
    {   if(x.equals(eerstePersoon ) || x.equals(tweedePersoon) || x.equals(derdePersoon))
        return new BMI(x.getGewicht(), x.getLengte()).berekenBMI();
        else
            throw new IllegalArgumentException("De persoon zit niet in deze praktijk");
    }
    public double berekenGemiddeldeBMI()
    {
        BMI bmi1 = new BMI(eerstePersoon.getGewicht(), eerstePersoon.getLengte())   ;
        BMI bmi2 = new BMI(this.tweedePersoon.getGewicht(), tweedePersoon.getLengte());
        BMI bmi3 = new BMI(this.derdePersoon.getGewicht(), this.derdePersoon.getLengte());
        BMI bmi4 = new BMI(this.vierdePersoon.getGewicht(), this.vierdePersoon.getLengte());
        BMI bmi5 = new BMI(this.vijfdePersoon.getGewicht(), this.vijfdePersoon.getLengte());
       return (bmi1.berekenBMI() + bmi2.berekenBMI() + bmi3.berekenBMI() + bmi4.berekenBMI()+ bmi5.berekenBMI())/5;
    }
}

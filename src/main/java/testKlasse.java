package main.java;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class testKlasse {
    public static void main(String[]args) throws ParseException {String sDate1="31/12/1998";

        try { Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
            Persoon brian = new Persoon("brian", 59, 1.73, new SimpleDateFormat("dd/MM/yyyy").parse("18/06/2001"));
            Persoon alexaneder = new Persoon("Alexander", 60, 1.80, new SimpleDateFormat("dd/MM/yyyy").parse("01/12/1998"));
            Persoon marianne = new Persoon("marianne", 55, 1.60, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2001"));
            Persoon marie = new Persoon("marie", 60, 1.72, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2001"));
            Persoon thomas = new Persoon("thomas", 99, 1.90, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2001"));
            Dokterspraktijk praktijk = new Dokterspraktijk(brian, alexaneder, marianne, marie, thomas);
            System.out.println(Math.round(praktijk.berekenGemiddeldeBMI()));
        }
        catch(IllegalArgumentException exception )
        {
            System.out.println(exception.getMessage());

        }
        catch(Exception e )
        {

            System.out.println(e.getMessage());
        }
    finally {
            System.out.println("De foutcontrole is afgelopen");
        }
    }
}

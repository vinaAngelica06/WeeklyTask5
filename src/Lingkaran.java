import java.text.DecimalFormat;
public class Lingkaran extends BangunDatar{
    DecimalFormat df = new DecimalFormat("#.##");

    // jari-jari lingkaran
    double r;

    @Override
    double luas(){
        double luas = (double) (Math.PI * r * r);
        System.out.println("Luas lingkaran: " + df.format(luas)+ " cm^2");
        return luas;
    }

    @Override
    double keliling(){
        double keliling = (double) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran: " + df.format(keliling)+ " cm");
        return keliling;
    }

}
public class Segitiga extends BangunDatar {

    double  alas;
    double  tinggi;
    double  sisiA;
    double  sisiB;
    double  sisiC;

    @Override
    double  luas() {
        double  luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga:" + luas+ " cm^2");
        return luas;
    }
    @Override
    double  keliling() {
        double  keliling = (sisiA + sisiB + sisiC);
        System.out.println("Keliling Segitiga: " + keliling+ " cm");
        return keliling;
    }


}
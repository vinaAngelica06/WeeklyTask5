public class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;

    @Override
    double luas(){
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang:" + luas + " cm^2");
        return luas;
    }

    @Override
    double keliling(){
        double keliling = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang: " + keliling + " cm");
        return keliling;
    }
}
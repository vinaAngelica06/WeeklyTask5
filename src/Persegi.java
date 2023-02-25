class Persegi extends BangunDatar {
    double sisi;

    @Override
    double  luas(){
        double  luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas + " cm^2");
        return luas;
    }

    @Override
    double  keliling(){
        double  keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling+ " cm");
        return keliling;
    }
}
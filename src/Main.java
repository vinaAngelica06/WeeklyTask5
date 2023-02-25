public class Main {
    public static void main(String[] args) {

        System.out.println( "Luas dan Keliling Tanah Pak Dengklek:");
        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();

        // membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        persegi.sisi = 5;

        // membuat objek Lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 7;

        // membuat objek Persegi Panjang dan mengisi nilai properti
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 5;
        persegiPanjang.lebar = 10;

        // membuat objek Segitiga dan mengisi nilai properti
        Segitiga Segitiga = new Segitiga();
        Segitiga.alas = 10;
        Segitiga.tinggi = 7;
        Segitiga.sisiA = 10;
        Segitiga.sisiB = 8;
        Segitiga.sisiC = 9;

        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        Segitiga.luas();
        Segitiga.keliling();
    }
}
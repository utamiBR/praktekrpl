import java.util.Scanner;

public class RecomendedSampleOOP 
{
  public static void main(String[] args) 
  {
    Scanner masuk = new Scanner(System.in);
		
        BujurSangkar bs = new BujurSangkar();
		System.out.println("Masukkan sisi = ");
		sisi = masuk.nextInt();
        System.out.println("Luas bujur sangkar dengan sisi"+sisi+ " = " + bs.CariLuas());
        
        PersegiPanjang pp = new PersegiPanjang();
		System.out.println("Masukkan panjang = ");
		panjang = masuk.nextInt();
		System.out.println("Masukkan lebar = ");
		lebar = masuk.nextInt();
		System.out.println("Luas persegi panjang dengan panjang = "+panjang+" dan lebar = "+lebar+" adalah " +
                pp.CariLuas());
				
        // polimorfisme
        BangunDatar bd = new BujurSangkar();
        System.out.println("Luas bangun datar dengan sisi "+sisi+" adalah"  + bs.CariLuas());
        bd = new PersegiPanjang();
        System.out.println("Luas bangun datar dengan "+panjang+" dan "+lebar+" adalah " +
                pp.CariLuas());
        
        
    }
}

abstract class BangunDatar {
    abstract double CariLuas();
    abstract double CariKeliling();
}

class PersegiPanjang extends BangunDatar {
   protected int lebar;
   protected int panjang;

    PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
        //Jika p dan l kurang dari atau sama dengan 0,
        //throw exception di sini
    }

    double CariLuas() {
        return panjang * lebar;
    }

    double CariKeliling() {
        return 2 * (panjang + lebar);
    }
}

class BujurSangkar extends BangunDatar {
    protected int sisi;

    BujurSangkar (int s) {
        sisi = s;
        //Jika s kurang dari atau sama dengan 0,
        //throw exception di sini
    }

    double CariLuas() {
        return sisi * sisi;
    }

    double CariKeliling() {
        return 4 * sisi;
    }
}
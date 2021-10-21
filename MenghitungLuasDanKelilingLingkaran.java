import java.util.Scanner;
public class MenghitungLuasDanKelilingLingkaran{
    public static void main (String[] args){     
        double luas,r,keliling,phi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("=============");
        System.out.println("= LINGKARAN =");
        System.out.println("=============");
        System.out.println();
        System.out.print("Masukkan jari-jari : ");
        r = input.nextDouble();
        luas = phi*r*r;
        keliling = 2*phi*r;
        System.out.println("---------------------------------");
        System.out.println("Luas Lingkaran adalah : "+luas);
        System.out.println("Keliling Lingkaran adalah : "+keliling);
   }
}
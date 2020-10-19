
package tugasguru;

import java.util.Scanner;
public class konvertsuhu {


    public static void main(String[] args) {
        String suhu1, konv;
        double suhu2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== Konversi Suhu =====");
        System.out.println("masukan derajat suhu");
        suhu1 = input.nextLine();
        
        suhu2 = Double.parseDouble(suhu1);
        
        System.out.println("masukan satuan konverensi perubahan\n1. kelvin\n2. fahrenheit\n3. reamur");
        konv = input.nextLine();
        
        System.out.println("hasil konverensi suhu adalah....");
        if (konv.equalsIgnoreCase("1")){
            System.out.println(kelvin(suhu2)+"kelvin");
        }
        else if (konv.equalsIgnoreCase("2")){
            System.out.println(fahrenheit(suhu2)+"fahrenheit");
        }
        else if (konv.equalsIgnoreCase("3")){
            System.out.println(reamur(suhu2)+"reamur");
        }
        else {
            System.out.println("maaf format yang anda masukan tidak valid");
        }
        
        
        
    }
    public static double reamur(double a){
        double r = (a*4/5);
        return r;
    }
    public static double fahrenheit(double a){
        double f = (a*9/5)+32;
        return f;
    }
    public static double kelvin(double a){
        double k = a + 273;
        return k;
    }
    
}

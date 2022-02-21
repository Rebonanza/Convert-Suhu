/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
class Konversi{
    double celcius, fahrenheit, reamur, kelvin;
    
    Konversi(double celcius){
        this.celcius = celcius;
    }
    
    public void convert(){
        this.fahrenheit = (9*this.celcius)/5 + 32; 
        this.reamur = (4*this.celcius)/5;
        this.kelvin = this.celcius + 273.15;
    }
    
    public void show(){
        
        System.out.println(" Suhu dalam celcius\t: " + this.celcius + "\u00B0" + "C");
        System.out.println(" Dalam Fahrenheit\t: " + this.fahrenheit + "\u00B0" + "F");
        System.out.println(" Dalam Reamur\t\t: " + this.reamur + "\u00B0" + "R");
        System.out.println(" Dalam Kelvin\t\t: " + this.kelvin + "\u00B0" + "K");
    }

    public String status(){
        String kondisi = "";
        if(this.celcius < 100 && this.celcius > 0){
            kondisi = "Normal";
        }else if(this.celcius >= 100){
            kondisi = "Mendidih";
        }else if(this.celcius <= 0){
            kondisi = "Beku";
        }
        return kondisi;
    }
}
/**
 *
 * @author GIVEN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("+=======================+");
        System.out.println("| Program Konversi Suhu |");
        System.out.println("+=======================+");
        int edit = 0, rep;
        do{
            System.out.println(" Input Data ");
            System.out.println(" ==========");
            System.out.print(" Suhu dalam celcius : ");
            double c = input.nextDouble();
            Konversi converter = new Konversi(c);
            rep = 1;
            while(rep == 1){
                System.out.print("\n");
                System.out.println(" OPSI ");
                System.out.println(" ==== ");
                System.out.println(" 1. Lihat data konversi ");
                System.out.println(" 2. Edit data konversi ");
                System.out.println(" 3. Exit ");
                System.out.print(" Pilih : ");
                int pilihan = input.nextInt();
                System.out.print("\n");
                switch (pilihan) {
                    case 1: converter.convert();
                            converter.show();
                            System.out.println(" Kondisi air " + converter.status());
                            rep = 1;
                            break;
                    case 2: edit = 1;
                            rep = 0;
                            break;
                    case 3: System.exit(0);
                            break;
                    default: System.out.println("Opsi tidak ada, Mohon masukkan opsi dengan benar");
                            rep = 1;
                            break;
                }
            }
        }while(edit == 1);
    }
 }
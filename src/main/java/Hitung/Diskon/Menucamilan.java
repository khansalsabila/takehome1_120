/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hitung.Diskon;

import org.springframework.stereotype.Controller;

/**
 *
 * @author USER DJOGJA
 */
@Controller
public class Menucamilan {
     public int gethitung(int jumlah, int harga) {
        int hargatotal;
        int total = harga*jumlah;
        
        if(total<10000){
            hargatotal = total - (total * 0);
        }
        else if ((total > 10000) && (total < 50000)){
            hargatotal = total - (total * 5/100);
        }
        else{
            hargatotal = total - (total * 10/100);
        }
        return hargatotal;
    }
    
    public int getharga(int jumlah, int harga){
        int total = harga*jumlah;
        int totalDiskon;
        
        if(total < 10000){
            totalDiskon = 0;
        }
        else if((total > 10000)&&(total < 50000)){
            totalDiskon = 5;
        }
        else{
            totalDiskon = 10;
        }
        return totalDiskon;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hitung.Diskon;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author USER DJOGJA
 */
@Controller
public class DiskonController {
    Menucamilan Mc = new Menucamilan();
    @RequestMapping("/submit")
                
        
      public String getHasil(HttpServletRequest data, Model model) {
        String getNama = data.getParameter("Nama_Kue");
        int getJumlah = Integer.parseInt(data.getParameter("Jumlah_Kue"));
        int getHarga = Integer.parseInt(data.getParameter("Harga_Kue"));
        
        int diskon = Mc.getharga(getJumlah, getHarga);
        int compute = Mc.gethitung(getJumlah, getHarga);
        
        model.addAttribute("Nama",getNama);
        model.addAttribute("Barang", getJumlah);
        model.addAttribute("Harga", ("Rp. "+ getHarga));
        model.addAttribute("Total", ("Rp. "+(getHarga*getJumlah)));
        model.addAttribute("Diskon", "Rp. "+ compute);
        model.addAttribute("TotalDiskon", diskon + " %");
        
        return "tableviewer";
    }
    
}

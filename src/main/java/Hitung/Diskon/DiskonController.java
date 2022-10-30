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
    
    @RequestMapping("/bayar")
    public String notamakanan(HttpServletRequest data, Model makanan){
        
        Menumakanan Mm = new Menumakanan();
        
        String nmakanan = data.getParameter(string:"var_namamakanan"
    }
    
}

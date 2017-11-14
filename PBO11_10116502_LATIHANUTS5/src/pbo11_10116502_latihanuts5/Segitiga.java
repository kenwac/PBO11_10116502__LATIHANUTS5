/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11_10116502_latihanuts5;

/**
 *
 * @author ASUS
 */
public class Segitiga implements BangunDatar {
    int luas, keliling;

    final int sisiAb = 50;
    final int sisiBc = 60;
    final int sisiCa = 70;
    final int alas = 100;
    final int tinggi = 120;
    
    @Override
    public void HitungLuas(){
        luas=(alas*tinggi)/2;
        System.out.println("Luas Segitiga = "+luas);
        
    }
    
    @Override
    public void HitungKeliling(){
        keliling= sisiAb + sisiBc + sisiCa + alas + tinggi ;
        System.out.println("Keliling = "+keliling);
    }
    
            
}

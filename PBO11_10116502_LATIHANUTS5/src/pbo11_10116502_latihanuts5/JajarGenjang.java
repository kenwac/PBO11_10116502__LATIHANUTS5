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


public class JajarGenjang implements BangunDatar {
    
    int luas;
    int keliling;
    final int sisiAb = 50;
    final int sisiBc = 60;
    final int sisiCd = 70;
    final int sisiDa = 80;
    final int alas = 100;
    final int tinggi = 120;

    
    @Override
    public void HitungKeliling() {
        keliling = sisiAb + sisiBc + sisiCd + sisiDa;
        System.out.println("Keliling Jajar Genjang : "+keliling);
    
    }

    @Override
    public void HitungLuas() {
    
        luas = alas * tinggi;
        System.out.println("Luas Jajar Genjang : "+luas);
    }

   
    
}

    


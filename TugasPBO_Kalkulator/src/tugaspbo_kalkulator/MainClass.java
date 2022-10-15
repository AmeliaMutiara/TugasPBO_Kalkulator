/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo_kalkulator;

/**
 *
 * @author AMEL
 */
public class MainClass {
    public static void main(String[] args) {
        keramik akses = new keramik();
        
        akses.setLuasTanah(100);
        akses.setPanjangA(20);
        akses.setLebarA(20);
        akses.setPanjangB(40);
        akses.setLebarB(40);
        akses.setPanjangC(60);
        akses.setLebarC(60);
        akses.infoKeramik();
        akses.hitungHarga();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118026.latihan48.kalkulator;

/**
 *
 * @author 
 * NAMA  : Riski Dwi Sabariyanto   
 * KELAS : IF 1
 * NIM   : 10118026
 * Deskripsi Program : Program ini untuk membuat operasi kalkulator.
 */
public class IF110118026Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kalkulator objKal = new Kalkulator();
        objKal.setValue1(7.0);
        objKal.setValue2(5.0);
        System.out.println("VALUE 1 = "+objKal.getValue1());
        System.out.println("VALUE 2 = "+objKal.getValue2());
        objKal.setNameProject();
        objKal.setNoteProject("");
        System.out.println("Result Add is = "+objKal.add());
        System.out.println("Result Minus is = "+objKal.minus());
        System.out.println("Result Multiple is = "+objKal.multiplication());
        System.out.println("Result Division is = "+objKal.division());
    }
    
}

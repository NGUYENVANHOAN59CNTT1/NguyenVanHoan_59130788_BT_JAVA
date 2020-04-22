/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;


/**
 *
 * @author Admin
 */
public class MainBT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Context id = new Context();
        id.setTinhToan(new Cong());
        System.out.println( "Thực hiện việt tính toán biểu thức 75+12 = " + id.tinh(75,12 ));
        id.setTinhToan(new Tru());
        System.out.println( "Thực hiện việt tính toán biểu thức 75+12 = " + id.tinh(54,78 ));  
    }
    
}

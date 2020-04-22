/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Admin
 */
public class ThanhToanCOD implements IThanhToan{

    @Override
    public double Thanhtoan(int tienhang) {
        if (tienhang > 2000000) return (double)tienhang*0.92;
        else return (double)tienhang*1;
    }
    
}

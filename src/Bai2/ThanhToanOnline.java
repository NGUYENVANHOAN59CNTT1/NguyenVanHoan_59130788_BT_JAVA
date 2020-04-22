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
public class ThanhToanOnline implements IThanhToan{

    @Override
    public double Thanhtoan(int tienhang) {
        if (tienhang < 1000000) return (double)tienhang*0.95;
        else return (double)tienhang*0.93;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String Hoten;
    private Date NgaySinh;
    private float Diem;

    public SinhVien() {
    }

    public SinhVien(String Hoten, Date NgaySinh, float Diem) {
        this.Hoten = Hoten;
        this.NgaySinh = NgaySinh;
        this.Diem = Diem;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public float getDiem() {
        return Diem;
    }

    public void setDiem(float Diem) {
        this.Diem = Diem;
    }
     public void HienThi(){  
         System.out.println("Họ và Tên:"+Hoten);
         System.out.println("Ngày Sinh:"+NgaySinh);
         System.out.println("Điểm Trung Bình là:"+Diem);
     }        
}

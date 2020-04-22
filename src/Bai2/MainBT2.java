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
public class MainBT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GioHang gh1 = new GioHang();
        GioHang gh2 = new GioHang();
        
        IThanhToan tt1 = new ThanhToanOnline();
        IThanhToan tt2 = new ThanhToanCOD();
        
        gh1.setHinhThucTT(tt1);
        gh2.setHinhThucTT(tt2);
        
        HangHoa hh1 = new HangHoa ("Ti Vi",7000000,"Ti Vi LG Chất lượng Cao");
        HangHoa hh2 = new HangHoa ("Tủ Lạnh",8000000,"Tủ Lạnh SANYO Chất lượng Cao");
        HangHoa hh3 = new HangHoa ("Bêp GA",9000000,"Bếp Ga SENDO Chất lượng Cao");
        HangHoa hh4 = new HangHoa ("Quạt Máy",3000000,"Quạt Máy HTL Chất lượng Cao");
        
        gh1.themHH(hh1);
        gh1.themHH(hh4);
        
        gh2.themHH(hh2);
        gh2.themHH(hh3);
        
        System.out.println("Giỏ hàng 1(Oline):");
        gh1.Xuat2();
        System.out.println("Tổng tiền hàng la:" + gh1.TienHang() + "\nTiền khách trả là:"+gh1.TienKhachHangTra());
        
        System.out.println("Giỏ hàng 2(COD):");
        gh2.Xuat2();
        System.out.println("Tổng tiền hàng la:" + gh2.TienHang() + "\nTiền khách trả là:"+gh2.TienKhachHangTra());
    }
    
}

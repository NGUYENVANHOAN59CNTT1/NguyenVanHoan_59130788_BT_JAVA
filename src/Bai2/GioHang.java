/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class GioHang {
    IThanhToan HinhThucTT;
    ArrayList<HangHoa> dsHH = new ArrayList<>();

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.HinhThucTT = hinhThucTT;
    }
    public void themHH(HangHoa hh){
        dsHH.add(hh);
    }
    public int TienHang(){
        int S=0;
        for(int i=0; i<dsHH.size();i++){
        S = S+ dsHH.get(i).getGia();
        }
        return S;
    }
    public double TienKhachHangTra(){
        return HinhThucTT.Thanhtoan(TienHang());
    }
    public void Xuat2(){
        for(int i=0; i<dsHH.size();i++){
            dsHH.get(i).Xuat1();
        }
    }
}

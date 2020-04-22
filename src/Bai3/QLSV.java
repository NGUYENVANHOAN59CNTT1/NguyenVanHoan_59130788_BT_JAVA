/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Admin
 */
public class QLSV {
    ISoSanh<SinhVien> sosanh;
    ArrayList<SinhVien> DSSV = new ArrayList<>();

    public void setSoSanh(ISoSanh<SinhVien> SoSanh) {
        this.sosanh = SoSanh;
    }
    public void ThemSV(SinhVien sv){
        DSSV.add(sv);
    }
    public void SapXep(){
        for(int i=0;i<DSSV.size()-1;i++)
            for(int j=i+1;j<DSSV.size();j++)
            {
                if(sosanh.SoSanh(DSSV.get(i),DSSV.get(j))>0)
                        Collections.swap(DSSV, i, j);
            }            
    }
    public void inDS(){
        for(int i=0;i<DSSV.size();i++)
            DSSV.get(i).HienThi();
    }
    
    public void Them(SinhVien them){
        DSSV.add(them);
    }
    
}

package Bai3;
import Bai3.ISoSanh;
import Bai3.QLSV;
import Bai3.SinhVien;
import Bai3.SoSanhTheoDiem;
import Bai3.SoSanhTheoTen;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main_Bai3 {


    public static void main(String[] args) throws ParseException {
        QLSV QLDS = new QLSV();
        
        
        SinhVien sv1 = new SinhVien("Nguyễn văn Hoàn",new SimpleDateFormat("dd/MM/yyyy").parse("30/06/1999"),(float) 8);
        SinhVien sv2 = new SinhVien("Võ Thế Anh",new SimpleDateFormat("dd/MM/yyyy").parse("13/01/1999"),(float) 7);
        SinhVien sv3 = new SinhVien("Mai Thị Hà ",new SimpleDateFormat("dd/MM/yyyy").parse("23/03/1999"),(float) 9);
        SinhVien sv4 = new SinhVien("Nguyễn Hoài Nam",new SimpleDateFormat("dd/MM/yyyy").parse("17/06/1999"),(float) 6);
        SinhVien sv5 = new SinhVien("Lê Văn Quân ",new SimpleDateFormat("dd/MM/yyyy").parse("27/07/1999"),(float) 5);
        
        QLDS.Them(sv1);
        QLDS.Them(sv2);
        QLDS.Them(sv3);
        QLDS.Them(sv4);
        QLDS.Them(sv5);
        
        ISoSanh sstt= new SoSanhTheoTen();
        ISoSanh sstd= new SoSanhTheoDiem();
        
        QLDS.setSoSanh(sstt);
        QLDS.SapXep();
        System.out.println("\n Danh Sách Sinh Vien Sắp Xếp Theo Tên là:");
        QLDS.inDS(); 
        
        QLDS.setSoSanh(sstd);
        QLDS.SapXep();
        System.out.println("\n Danh Sách Sinh Vien Sắp Xếp Theo Đi là:");
        QLDS.inDS();  
    }
    
}

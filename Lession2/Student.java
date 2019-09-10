package Lession2;

import java.util.Scanner;

public class Student {
    private String ID, Ten, Lop, Khoa;

    public Student() {
    }

    public Student(String ID, String ten, String lop, String khoa) {
        this.ID = ID;
        this.Ten = ten;
        this.Lop = lop;
        this.Khoa = khoa;
    }

    public void NhapTT() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ma SV");
        ID = scanner.nextLine();
        System.out.println("Nhap ten SV");
        Ten = scanner.nextLine();
        System.out.println("Nhap lop SV");
        Lop = scanner.nextLine();
        System.out.println("Nhap khoa SV");
        Khoa = scanner.nextLine();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String khoa) {
        Khoa = khoa;
    }

    public  void XuatTT(){
        System.out.println("Student = " +
                "ID='" + ID + '\'' +
                ", Ten='" + Ten + '\'' +
                ", Lop='" + Lop + '\'' +
                ", Khoa='" + Khoa );
    }
}

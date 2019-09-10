package Lession2;


import java.util.Scanner;

public class QLHS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        int lc = 5;
        lc = scanner.nextInt();
        System.out.println("========================*-*========================");
        System.out.println("Nhap lua chon cua ban: ");
        System.out.println("1.Them thong tin sinh vien. " +
                "\n2. Xuat danh sach sinh vien." +
                "\n3. Sap xep danh sach theo ten." +
                "\n4. Sap xep danh sach theo lop." +
                "\n5. Thoat");
        switch (lc){
            case 1:
                student.NhapTT();
                break;
            case 2:
                student.XuatTT();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
            default:
                break;
        }
    }
}

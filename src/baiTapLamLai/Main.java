package baiTapLamLai;

import org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhapLieu nhapLieu = new NhapLieu();
//new comment
        int luaChon;
        while (true) {
            System.out.println("chon 1 de them moi sinh vien");
            System.out.println("chon 2 de lay ra toan bo danh sach sinh vien");
            System.out.println("chon 3 de thay doi thong tin sinh vien");
            System.out.println("chon 4 de xoa thong tin cua sinh vien");
            System.out.println("chon 0 de thoat chuong trinh");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            switch (luaChon) {
                case 1:
                    nhapLieu.save();
                    break;
                case 2:
                    nhapLieu.render();
                    break;
                case 3:
                    nhapLieu.update();
                    break;
                case 4:
                    nhapLieu.delete();
                    break;
                case 0:
                    System.out.println("bye bye");
                    break;
            }
            if (luaChon == 0) {
                break;
            }
        }


    }
}

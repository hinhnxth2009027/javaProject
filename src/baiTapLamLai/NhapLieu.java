package baiTapLamLai;

import java.util.Scanner;

public class NhapLieu {
    Scanner scanner = new Scanner(System.in);
    controller controller = new controller();
    public void save(){
        System.out.println("vui long nhap vao id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("vui long nhap vao ten sinh vien");
        String name = scanner.nextLine();
        Student student = new Student(id , name);
        controller.create(student);
    }
    public void update(){
        System.out.println("de thay doi du lieu chumg toi yeu cau ban nhap day du thong tin id va name");
        System.out.println("vui long nhap vao id sinh vien");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("vui long nhap vao ten sinh vien");
        String name = scanner.nextLine();
        Student student = new Student(id,name);
        controller.update(student);
    }
    public void delete(){
        System.out.println("vui long nhap vao id cua sinh vien ban muon thay doi thong tin");
        int id = scanner.nextInt();
        controller.delete(id);
    }
    public void render(){
        controller.getList();
    }
}

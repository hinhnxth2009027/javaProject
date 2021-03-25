package baiTapLamLai;

import java.util.ArrayList;
import java.util.Scanner;

public class controller implements demo{
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> saveStudent = new ArrayList<>();
    @Override
    public boolean create(Student student) {
        saveStudent.add(student);
        System.out.printf("da them moi sinh vien: %s voi id:%d\n\n",student.getName(),student.getId());
        return false;
    }
    @Override
    public boolean update(Student student) {
        for (int i = 0 ; i < saveStudent.size() ; i++){
            int key = student.getId();
            int key2 = saveStudent.get(i).getId();
            if (key==key2){
                System.out.println("vui long nhap vao id moi");
                int newID = scanner.nextInt();
                scanner.nextLine();
                System.out.println("vui long nhap vao trn sinh vien moi");
                String newName = scanner.nextLine();
                Student upDate = new Student(newID,newName);
                saveStudent.set(i,upDate);
                System.out.println("thon tin sinh vien da thay doi");
            }
        }
        return false;
    }
    @Override
    public boolean delete(int id) {
        for (int i = 0 ; i < saveStudent.size() ; i++){
            if (id == saveStudent.get(i).getId()){
                saveStudent.remove(i);
                System.out.println("thong tin sinh vien da duoc dua vao kho luu tru");
            }
        }
        return false;
    }
    @Override
    public ArrayList<Student> getList() {
        for (int i = 0; i < saveStudent.size(); i++) {
            Student student = saveStudent.get(i);
            student.showInfomation(student);
        }
        return null;
    }
}

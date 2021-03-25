package baiTapLamLai;

public class Student {
    private int id;
    private String name;




    public Student(){}

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showInfomation(Student student){
        System.out.printf("Student code : %d Student Name : %s\n\n",this.getId(),this.getName());
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

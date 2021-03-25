package baiTapLamLai;

import java.util.ArrayList;

public interface demo {

    public boolean create(Student student);

    public boolean update(Student student);

    public boolean delete(int id);

    ArrayList<Student> getList();

}

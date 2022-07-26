import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readFromFile(String path) {
        List<Student> list = new ArrayList<>();
        try {
            FileInputStream input = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(input);
            list = (List<Student>) ois.readObject();
            input.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Kieu Anh", "HaNoi"));
        students.add(new Student(2, "Hong Quan", "HaNoi"));
        students.add(new Student(3, "Duc Anh", "HaNoi"));
        students.add(new Student(4, "Yolo", "HaNoi"));
        students.add(new Student(5, "BatRan", "HaNoi"));
//        writeToFile("BT1-ReadAndWriteList/src/danhsach.da", students);

        List<Student> list = readFromFile("BT1-ReadAndWriteList/src/danhsach.da");
        for (Student x: list
             ) {
            System.out.println(x);
        }
    }

}

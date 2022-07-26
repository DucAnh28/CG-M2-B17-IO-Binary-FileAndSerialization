import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("DucAnh",22,"yolo@gmail.com");
        Student student1 = new Student("DucAnh1",22,"yolo1@gmail.com");
        Student student2 = new Student("DucAnh2",22,"yolo2@gmail.com");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("DemoFileInputStream/src/Ds.da"));
        outputStream.writeObject(studentList);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("DemoFileInputStream/src/Ds.da"));
        Object input = inputStream.readObject();
        List<Student> listRead = (List<Student>) input;
        System.out.println(listRead);
    }
}

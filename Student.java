import java.rmi.StubNotFoundException;

public class Student {
    int rollno;
    String name;
    int age;
    private String pass;



    Student()
    {
        this.rollno = 1;
        this.name = "Default user";
        this.age =17;

    }

    Student(int rollno, String name, int age)
    {
        this.rollno = rollno;
       this.name = name;
       this.age = age;

    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String greet()
    {
        return "Welcome back,"+this.name+"👋";
    }

    //    display object
    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +

                '}';
    }
}

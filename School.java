interface student{
    void roll_no();
}
interface  sub{
    void sub1();
    void sub2();
}
interface  result{
    void result();
}
class Student implements student, sub,result{
    @Override
    public void sub1() {
        System.out.println("Marks of subject 1 is 90");
    }

    @Override
    public void sub2() {
        System.out.println("Marks of subject 2 is 80");
    }

    @Override
    public void roll_no() {
        System.out.println("Roll no is 2");
    }

    @Override
    public void result() {
        System.out.println("Result is 170");
    }
}
public class School {
    public static void main(String[] args) {
        Student school=new Student();
        school.roll_no();
        school.sub1();
        school.sub2();
        school.result();
    }
}


public class Student extends Person{
    String name = " ";
    Student(String id,String name) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() +" "+ name;
    }
}

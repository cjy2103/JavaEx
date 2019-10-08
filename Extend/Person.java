public class Person {
    String id = "";
    Person(String id){
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}

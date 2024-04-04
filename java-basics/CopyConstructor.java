class Student {
    public static void main(String[] args) {
        CopyConstructor s1 = new CopyConstructor();
        s1.name = "usman";
        s1.age = 21;

        CopyConstructor s2 = new CopyConstructor(s1);
        System.out.println(s2.name);
    }
}
public class CopyConstructor {
    String name;
    int age;

    CopyConstructor(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
    CopyConstructor(){

    }

    
}


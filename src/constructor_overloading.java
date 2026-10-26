public class constructor_overloading {
    String student_name;
    int age;
    long ID;
        constructor_overloading(){
            System.out.println("this is defaulst constructor");

        }
        constructor_overloading(String student_name, int age ){
            this.student_name=student_name;
            this.age=age;
            System.out.println(student_name);
            System.out.println(age);
        }
        constructor_overloading(int ID){
            this.ID=ID;
            System.out.println(ID);
        }
}

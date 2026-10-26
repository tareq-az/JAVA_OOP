public class Main {
    public static void main(String args[]){
        System.out.println("hello world");
        System.out.println("hello i am new at java");
        encapsulasion e1=new encapsulasion();
        e1.name="tareq";
        e1.age=40;
        e1.roll=44;
        e1.print();

        constructor_overloading co= new constructor_overloading();
        constructor_overloading co2= new constructor_overloading("Jamin",22);
        constructor_overloading co3= new constructor_overloading(244);
    }
}
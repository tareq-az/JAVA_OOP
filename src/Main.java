public class Main {
    public static void main(String args[]){
        System.out.println("hello world");
        System.out.println("hello i am new at java");



        //constructor overloading
        constructor_overloading co= new constructor_overloading();
        constructor_overloading co2= new constructor_overloading("Jamin",22);
        constructor_overloading co3= new constructor_overloading(244);
        //encapsulasion
        BankAccount b1=new BankAccount();
        b1.deposit(1000);
        b1.withdraw(5000);

        //Inheritance
        vehicle mycar= new vehicle();
        mycar.brand="Toyota";
        mycar.origin="Japan";
        mycar.start();
        mycar.printinfo();
        car mycar2=new car();
        mycar2.power=100;
        mycar2.type="SUV";
        mycar2.printcar();
    }
}
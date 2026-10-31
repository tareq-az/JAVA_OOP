public class dog extends Animal{
    public String color;
        public dog(String name, String color){
            super(name);
            this.color=color;
        }
        public void bark(){
            System.out.println("Dog is barking");
            System.out.println("dog's color is"+color);
        }

    @Override
    public void eat() {
        super.eat();
        System.out.println(name+"is eating meat");
    }
}

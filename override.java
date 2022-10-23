class Dog{
    public void eat(){
        System.out.println("DOGS");
    }
}
class puppy extends Dog{
    public void eat(){
        System.out.println("puppy");
}
public void bark(){
    System.out.println("Barking");
}
}
class Main{
    public static void main(String[] args){
      Dog labrador=new Dog();
      labrador.eat();
    }
}

public class OOPS{
    public static void main(String args[]){
Horse h=new Horse();
System.out.println(h.color);
h.changeColor("dark brown");
System.out.println(h.color);
}
}
class Animal{
    String color;
  
    Animal(){
        System.out.println("animalconstructor is called");
    }
   

}
class Horse extends Animal
{
    
    Horse(){
     super.color="brown";
      System.out.println("horse cons called");  
    }
    void changeColor(String color){
    super.color="Dark brown";
    }

}

package String;

public class LearnString {
    public static void main(String[] args) {
        String fruit = "apple";
        String anotherFruit = "apple"; //Java will check that it allocated String literal before"apple", so it will not give another space in memory
        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli");//with new Java doesn't check it would simply add a new address in memory


        //Here we're checking if it's located in the same memory location
        System.out.println(fruit == anotherFruit);//True
        System.out.println(vegetable == anotherVegetable);//False


    }


}

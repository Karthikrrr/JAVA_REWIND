import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String args []){
        //Interfaces Demo
        // area areas = new area();

        // System.out.println("Area of squre : " + areas.squar(2));
        // System.out.println("Area of circle : " + areas.circle(4));
        // System.out.println("main class running..!!!");

        //PIZZA Problem
        //1. display pizzas and deserts
        //2. if user choose any one display prizes
        //3. next choose quantity of the item
        //4. finally show total amount

        //NOTE :  do using interfaces !!!!! 👍👍👍👍👍👍👍
        String[] pizzas = {"plane pizza", "cheese burst pizza", "paneer pizza", "corn pizza"};
        int[] prizes = {49,109,89,79};

        String[] deserts = {"cone ice", "cup ice", "mango ice", "butter ice"};
        int[] prize = {30,20,40,60};
        

        System.out.println("Choose One Menu\n1. For Pizza\n2. For Deserts");
        System.out.println();

        Scanner userInput = new Scanner(System.in);
        System.out.print(">>");
        int input = userInput.nextInt();

        if(input == 1){
            Pizza pizza = new Pizza();
            pizza.display(pizzas, prizes);
            int check = pizza.choose(pizzas, prizes);
            if(check == -1){
                System.out.println("INVALED OPTION!!!!...."); 
            }
            else{
                int quantity = pizza.getQuantity();
                pizza.getTotal(quantity, check, pizzas, prizes);
            }
            
        }
        else if(input == 2){
            Deserts desert = new Deserts();
            desert.display(deserts, prize);
            int check = desert.choose(deserts, prize);
            if(check == -1){
                System.out.println("INVALED OPTION!!!!...."); 
            }
            else{
                int quantity = desert.getQuantity();
                desert.getTotal(quantity, check, deserts, prize);
            }
        }
        else{
            System.out.println("INVALID OPTION!!!!");
        }
 
    }
}

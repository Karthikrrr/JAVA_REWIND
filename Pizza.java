import java.util.Scanner;

public class Pizza implements PizzaServe{
    public void display(String[] pizzas, int[] prizes){
        System.out.println("|-----------------Pizzas Menu------------------|");
        for(int i = 0; i < pizzas.length; i++){
            System.out.println(i + ". "+ pizzas[i] + "  ---" + prizes[i] + "₹");
        }
        System.out.println();
    }


    public int choose(String[] item, int[] prize) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the item Number : ");
        int choose = sc.nextInt();

        for(int i = 0; i < item.length; i++){
            if(choose == i){
                System.out.println("You Have Chossen " + item[i] + "  ---" + prize[i] + "₹");
                System.out.println();
                return choose;
            }
        }
        System.out.println();
        return -1;
    }


    @SuppressWarnings("resource")
    @Override
    public int getQuantity() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Quantity : ");
        int input = sc.nextInt();
        System.out.println();
       return input;
    }


    @Override
    public void getTotal(int quantity, int choose, String[] pizzas, int[] prizes) {
        System.out.println("|-----------------BILL GENERATING.....-----------------|");
        for(int i = 0; i < pizzas.length; i++){
            if(choose == i){
                System.out.println("Your Pizza : " + pizzas[choose]);
                System.out.println("Total Amount : " + (prizes[choose] * quantity));
                break;
            }
        }
        System.out.println();
    }


   
}

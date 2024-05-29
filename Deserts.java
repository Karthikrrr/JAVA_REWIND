import java.util.Scanner;

public class Deserts implements PizzaServe {
    public void display(String[] deserts, int[] prizes){
        System.out.println("|-----------------Deserts Menu------------------|");
        for(int i = 0; i < deserts.length; i++){
            System.out.println(i + ". " + deserts[i] + "   ---" + prizes[i] + "₹");
        }
        System.out.println();
    }

    @SuppressWarnings("resource")
    @Override
    public int choose(String[] item, int[] prize) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the item Number : ");
        int choose = sc.nextInt();

        for(int i = 0; i < item.length; i++){
            if(choose == i){
                System.out.println("You Have Chossen " + item[i] + "  ---" + prize[i] + "₹");
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
    public void getTotal(int quantity, int choose, String[] deserts, int[] prizes) {
        System.out.println("|-----------------BILL GENERATING.....-----------------|");
        for(int i = 0; i < deserts.length; i++){
            if(choose == i){
                System.out.println("Your Deserts : " + deserts[choose]);
                System.out.println("Total Amount : " + (prizes[choose] * quantity));
            }
        }
        System.out.println();
    }

  
}

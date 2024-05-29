public interface PizzaServe {
    void display(String[] item, int[] prize);
    int choose(String[] item, int[] prize);
    int getQuantity();
    void getTotal(int quantity, int choose, String[] item, int[] prize);
}

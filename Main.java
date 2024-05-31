public class Main {
    public void displayEmpDetails(Name empname, int age){
        System.out.println("age : " + age + "\n" + "name : " + empname.firstName + " " +  empname.lastName);

    }

    public static void main(String args []){
        Main emp = new Main();
        Name empname = new Name("Karthik", "R");
        emp.displayEmpDetails(empname, 21);
    }
}

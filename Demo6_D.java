public class Demo6_D {
    public static void main(String[] args) {

        String item1="Apples";
        String item2="Oranges";

        int qty1=5;
        int qty2=10;

        double price1=0.99;
        double price2=1.49;

        System.out.println("+--------------+-----------+---------+");
        System.out.println("|    ITEM      | QUANTITY  |  PRICE  |");
        System.out.println("+--------------+-----------+---------+");
        System.out.printf("|%s        |\033[34;1m%d\033[m          |\033[32;1m$\033[0m\033[35;1m%.2f\033[0m    | \n",item1,qty1,price1);
        System.out.printf("|%s       |\033[34;1m%d\033[0m         |\033[32;1m$\033[0m\033[35;1m%.2f\033[0m    |      \n",item2,qty2,price2);
        System.out.println("+--------------+-----------+---------+");
        
    }
    
}

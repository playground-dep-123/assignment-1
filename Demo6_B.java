public class Demo6_B {
    public static void main(String[] args) {

        String name1="Alice";
        String name2="Bob";

        int age1=24;
        int age2=30;
        
        System.out.println("+--------+-------+");
        System.out.println("| \033[34;1mName\033[0m   |  \033[34;1mAge\033[0m  |");
        System.out.println("+--------+-------+");
        System.out.printf("| %s  |  \033[35;1m%d\033[0m   |\n",name1,age1);
        System.out.printf("| %s    |  \033[35;1m%d\033[0m   |\n",name2,age2);
        System.out.println("+--------+-------+");
    }
}

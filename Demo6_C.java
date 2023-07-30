public class Demo6_C {
    public static void main(String[] args) {

        String city1="Los Angeles";
        String city2="\033[32:1mNew\033[0m";
        String city3="York";

        String state1="California";
        
        int population1=3966936;
        int population2=8336817;
        
        System.out.println("+--------------+-----------+-----------+");
        System.out.println("|    CITY      |   STATE   |POPULATION |");
        System.out.println("+--------------+-----------+-----------+");
        System.out.printf("| %s  |%s | \033[35;1m%,d\033[0m |\n",city1,state1,population1);
        System.out.printf("| \033[32;1m%s %s\033[0m     |%s %s   | \033[35;1m%,d\033[0m |\n",city2,city3,city2,city3,population2);
        System.out.println("+--------------+-----------+-----------+");
    }
}

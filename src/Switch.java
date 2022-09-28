import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        int choice=0;
        greeting();

        while (!(choice==1)){
            alternatives();
            choice= reader.nextInt();
            switch (choice){
                case 1:
                    System.out.println("du valde rätt väg, fortsätt!");
                    break;
                case 2:
                    System.out.println("Sorry, fel håll.");
                default:
                    System.out.println("Välj mellan 1 och 2");
                    break;
            }
        }while (!(choice==2)){
            alternatives();
            choice= reader.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Inte rätt, välj en annan väg");
                    break;
                case 2:
                    System.out.println("Yes, ett steg närmare målet.");
                default:
                    System.out.println("Välj mellan 1 och 2");
                    break;
            }
        }while (!(choice==1)){
            alternatives();
            choice= reader.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Grattis, du klarade spelet.");
                    break;
                case 2:
                    System.out.println("Försök igen");
                    break;
                default:
                    System.out.println("Ditt val finns inte i menyn!");
            }
        }





    }
    static void greeting(){
        System.out.println("Hej och välkommen till spelet.");
    }
    static void alternatives(){
        System.out.println("Vilken väg ska du välja?");
        System.out.println("1. Till höger");
        System.out.println("2. Till vänster");
    }
}

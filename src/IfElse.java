import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        ;
        greeting();

        int choice=0;

        while (!(choice==1) ){

            alternatives();
            choice= reader.nextInt();

            if(choice==1){
                System.out.println("YES, fortsätt nu!");
            } else {
                System.out.println("Du valde fel väg, försök igen!");
            }

        }
        while (!(choice==2)){
            alternatives();
            choice= reader.nextInt();

            if(choice==2){
                System.out.println("Härligt, du valde rätt väg, fortsätt!");
            }else {
                System.out.println("Tyvärr, du är på fel väg.");
            }
        }
        while (!(choice==1)){
            alternatives();
            choice= reader.nextInt();

            if(choice==1){
                System.out.println("bra jobbat, du är nästa där.");
            }else{
                System.out.println("du måste skärpa dig nu!!!");
            }
        }
        while (!(choice==3)){
            alternatives();
            choice= reader.nextInt();

            if (choice == 3) {
                System.out.println("You are a champion, continue!!");
            }else {
                System.out.println("Sorry, det här var fel val.");
            }
        }while (!(choice==1)){
            alternatives();
            choice= reader.nextInt();

            if(choice==1){
                System.out.println("Grattis!!! du hittade vägen ut!");
            }else {
                System.out.println("Snart där! försök igen!");
            }
        }





    }

    static void greeting(){
        System.out.println("Hej och välkommen till min labyrinth. Du ska hitta väg ut.");
    }
    static void alternatives(){
        System.out.println("Vilken väg väljer du?");
        System.out.println("1. Rakt fram ");
        System.out.println("2. Höger ");
        System.out.println("3. Vänster ");
    }
}

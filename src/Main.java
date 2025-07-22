//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void Cheack(int a){
        int ran = (int) (Math.random() * 100);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int p=1;
        while (p==1){
            System.out.print("Guess the number: ");
            int input= sc.nextInt();
            if(input==10){
                break;
            }

            int ran = (int) (Math.random() * 10);

            if( ran == input){
                System.out.println("Yes your are correct!!");

            } else if (ran>input) {
                System.out.println("Sorry it is getter then "+ input);

            }else{
                System.out.println("Sorry it is smaller then "+ input);

            }




        }


    }
}
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Chose what do you wanna do" +
                            "\nSell car put 1 " +
                            "\nBuy car put 2");
        int choose = new Scanner(System.in).nextInt();

        if(choose==1){
            System.out.println("Type of car`s body");
            String typeOfBody = scan.next();
            System.out.println("Type of maker");
            String maker = scan.next();
            System.out.println("Type of car`s model");
            String model = scan.next();
            System.out.println("issue date");
            int issueDate = scan.nextInt();
            System.out.println("Mileage");
            int mileage = scan.nextInt();
            System.out.println("What kind of gas does your car use");
            String typeOfgas = scan.next();
            System.out.println("type of engine");
            String typeOfEngine = scan.next();
            System.out.println("has car been in accsident ? true/false");
            boolean haveBeenInAccsident = scan.nextBoolean();
            System.out.println("car location state");
            String state = scan.next();
            System.out.println("Price");
            double price = scan.nextInt();
            sell sell = new sell(typeOfBody,maker,model,issueDate,price,mileage,typeOfgas,typeOfEngine,haveBeenInAccsident,state);
            System.out.println("everything right? yes/no");
            System.out.println(sell.toString());
            String yesOrNo = scan.next();
            if(yesOrNo.equalsIgnoreCase("yes")){

            }else{

            }
        }

    }
}
//Create a Switch which is going to obtain the car model from the terminal and give back the price,
// if the price is greater than 100,000 RM shows the buyer is VIP
import java.util.Scanner;


public class SecondAssingment {
    
    public static void main(String[] args){
    
    //variable
    String carModel;
    int buyerType = 0;
    double price;
    
    //input detail from user
    Scanner scan = new Scanner(System.in);
    System.out.println ("Enter Car Model: " );
    carModel = scan.nextLine();

    System.out.println("Enter Car Price : RM");
    price = scan.nextDouble();

    // get buyer type from price is greater than 100,000
    if (price > 100000){
        
        buyerType = 1;

    }else if (price == 100000){

        buyerType = 2;

    }else if (price < 100000){
        buyerType = 3;
    } else{
    }
    
    switch(buyerType){
        case 1:
        System.out.println("Car Model: " + carModel + " Price : RM " + price);
        System.out.println("Vip");
        break;

        case 2:
        System.out.println("Car Model: " + carModel + "Price : RM " + price);
        System.out.println ("Non VIP");
        break;

        case 3:
        System.out.println("Car Model: " + carModel + "Price : RM " + price);
        System.out.println ("None");

        break;

        default:


    }
    }
}

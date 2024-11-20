//Create a Switch which is going to obtain the car model from the terminal and give back the price,
// if the price is greater than 100,000 RM shows the buyer is VIP


import java.util.Scanner;


public class SecondAssingment {
    private String carModel;
    private int buyerType;
    private double price;

    private SecondAssingment(String carModel, double price){
        this.carModel = carModel;
        this.price = price;

    }

    public void totalPrice(double price){
        if (price > 100000){
        
            buyerType = 1;
    
        }else if (price == 100000){
    
            buyerType = 2;
    
        }else{
            buyerType = 3;
        } 
    }
        public void display(){
            System.out.println("Your Car Model is  " + carModel);
            System.out.println("The Price is RM " + price);
        }

        public void getBuyerType(){
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
    
    
    
    public static void main(String[] args){
    
        String carModel ;
        double price;
    //input detail from user
    Scanner scan = new Scanner(System.in);
    System.out.println ("Enter Car Model: " );
    carModel = scan.nextLine();
    System.out.println("Enter Car Price : RM");
    price = scan.nextDouble();

    SecondAssingment sa = new SecondAssingment(carModel, price);
    sa.display();
    sa.getBuyerType();
    
 
    
    }
}


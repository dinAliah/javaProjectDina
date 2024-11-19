import java.util.Scanner;

//public class name
public class averagePrice{

    // private variable
    private String carModel;
    private String carMakes;
    private double price;


   //construct the variable
    public averagePrice(String carModel, String carMakes, double price){
        this.carModel = carModel;
        this.carMakes = carMakes;
        this.price = price;
    } 
    
    // show detail
    public void detailCard()
    {
        System.out.println("This car is" + carModel + "make from" + carMakes);
        System.out.println("This car price" + price);

    }

    //display 3 car detail 
        public static void main(String[] args) {

        // input car detail 1
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter car model 1:");
        String carModel1 = scan.nextLine();
        System.out.println("Please enter car from:");
        String carFrom1 = scan.nextLine();
        System.out.println("Please enter car price:");
        double price1 = scan.nextDouble();

        averagePrice car1 = new averagePrice( carModel1, carFrom1, price1);
        

        // input car detail 2
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Please enter car model 2:");
        String carName2 = scan2.nextLine();
        System.out.println("Please enter car from:");
        String carFrom2 = scan2.nextLine();
        System.out.println("Please enter car price:");
        double price2  = scan2.nextDouble();
        
        averagePrice car2 = new averagePrice(carName2, carFrom2, price2);
        
        System.out.println();

        // input car detail 3
        Scanner scan3 = new Scanner(System.in);

        System.out.println("Please enter car model 3:");
        String carName3 = scan3.nextLine();
        System.out.println("Please enter car from:");
        String carFrom3 = scan3.nextLine();
        System.out.println("Please enter car price:");
        double price3 = scan3.nextDouble();

        averagePrice car3 = new averagePrice(carName3, carFrom3, price3);

        

        double totalAveragePrice = (price1 + price2 + price3)/ 3 ;
       
        System.out.println("Average car price: RM " + totalAveragePrice);
        System.out.println();

        scan.close();
    }


}
    


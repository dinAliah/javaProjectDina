import java.util.Scanner;

public class averagePrice{
    private String carModel;
    private String carMakes;
    private double price;

    public averagePrice(String carModel, String carMakes, double price){
        this.carModel = carModel;
        this.carMakes = carMakes;
        this.price = price;
    } 
    
        public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter car model 1:");
        String carName1 = scan.nextLine();
        System.out.println("Please enter car from:");
        String carFrom1 = scan.nextLine();
        System.out.println("Please enter car price:");
        double price1 = scan.nextDouble();

        averagePrice car1 = new averagePrice( carName1, carFrom1, price1);
        
        System.out.println("Please enter car model 2:");
        String carName2 = scan.nextLine();
        System.out.println("Please enter car from:");
        String carFrom2 = scan.nextLine();
        System.out.println("Please enter car price:");
        double price2  = scan.nextDouble();
        
        averagePrice car2 = new averagePrice(carName2, carFrom2, price2);
        
        System.out.println("Please enter car model 3:");
        String carName3 = scan.nextLine();
        System.out.println("Please enter car from:");
        String carFrom3 = scan.nextLine();
        System.out.println("Please enter car price:");
        double price3 = scan.nextDouble();

        averagePrice car3 = new averagePrice(carName3, carFrom3, price3);
     
        double totalAveragePrice = (price1 + price2 + price3)/3 ;
        System.out.println("Average car price:" + totalAveragePrice);

        scan.close();
    }

}
    


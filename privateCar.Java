public class privateCar{
    private String carModel;
    private String carFrom;
    private double price;
    

    public privateCar(String carModel, String carFrom, double price){
        this.carModel= carModel;
        this.carFrom= carFrom;
        this.price= price;
    }
    public void displayCarDetails(){
        String model ="Model ";
        String from = "From ";
        double carPrice = price;
        System.out.println( model + carModel);
        System.out.println( from + carFrom);
        System.out.println("The price are very suitable it is: " + price);

    }
    public static void main(String[] args) {
        privateCar car = new privateCar("Proton","Malaysia", 546789.50);
        car.displayCarDetails();

    }

}
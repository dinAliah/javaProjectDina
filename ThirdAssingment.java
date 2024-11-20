//3- Create a Matrix with 3 rows and 3 columns which contains the car models 
//and prices then fetch the car which values above 50,000 RM and portray it in the terminal
public class ThirdAssingment{

    private String[][] carModel;
    private double[][] price;

    private ThirdAssingment( String[][] carModel, double[][] price ){
        this.carModel = carModel;
        this.price = price;
    }

    public void carDisplay(){
        for(int carRow = 0; carRow < carModel.length; carRow++){
            for (int carCol = 0; carCol< carModel.length; carCol++){

                if(price[carRow][carCol] > 50000){

                    System.out.println(" The Car Model: " + carModel[carRow][carCol] + " : " + "Car Price" + " : "+ price[carRow][carCol]);

                }else{
                    System.out.println();
                }

            }
        }



    }
    public static void main(String[] args) {


        String[][] carModel = new String [3][3];

        carModel [0][0] = "Toyota"; carModel [0][1] = "Proton"; carModel [0][2] = "Produa";
        carModel [1][0] = "Honda"; carModel [1][1] = "Ford"; carModel [1][2] = "Volkswagen";
        carModel [2][0] = " Tesla"; carModel [2][1] = " Renault"; carModel [2][2] = " ORA";
       

        double [][] price = {
            {1008760, 12367, 12345},
            {345678, 56893, 45678},
            {237876, 56743, 34567}
          
        };

        ThirdAssingment ta = new ThirdAssingment (carModel, price);
        System.out.println("The Price Value above RM500K:");
        ta.carDisplay();

    }
        
    
}
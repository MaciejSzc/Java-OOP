package bikes;

public class RentalOffice {
    private double income;

    public double getIncome() {
        return income;
    }



    public Bike orderBike(Color color, double tireWidth, boolean aluminium, int days){
        Bike bike = new Bike(color,tireWidth,aluminium);

          double b;
          double c;

        switch (color){
            case RED:
                c = 500;
                break;
            case BLUE:
                c = 250;
                break;
                default:
                    c = 100;
        }



        if(aluminium){
            b = 2;
        }else{
            b = 1;
        }


        income += days*((b*(c + tireWidth/3))/20);

        return bike;
    }
}



package bikes;

public class RentalOffice {
    private double income = 0;

    public double getIncome() {
        return income;
    }

    public Bike orderBike(Color color, double tireWidth, boolean aluminium, int days){
        Bike bike = new Bike(color,tireWidth,aluminium);
          double a = days;
          double b;
          double c;
          double d = tireWidth;

        if(color.equals("red")){
            c = 500;
        }else if(color.equals("blue")){
            c = 250;
        }else{
            c= 100;
        }
        if(aluminium){
            b = 1;
        }else{
            b = 2;
        }

        bike.setPrice(a*((b*(c + d/3))/20));
              income += a*((b*(c + d/3))/20);

        return bike;
    }
}

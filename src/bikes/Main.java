package bikes;

public class Main {
    public static void main(String[] args) {
        RentalOffice rentalOffice = new RentalOffice();

        rentalOffice.orderBike(Color.RED,25,true,15);
        rentalOffice.orderBike(Color.GREEN,85,false,40);
        rentalOffice.orderBike(Color.BLUE,43,true,20);

        System.out.println(rentalOffice.getIncome());
    }
}

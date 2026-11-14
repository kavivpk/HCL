import java.util.*;
class vehicle {
    double dailyRate;
    vehicle(double dailyRate) {
        this.dailyRate = dailyRate;
    }
    double calculateRent(int rentalDays) {
        return dailyRate * rentalDays;
    }
    String gettype() {
        return "Vehicle";
    }
}
class car extends vehicle {
    car() {
        super(1500.0);
    }
        String gettype() {
        return "Car";
    }
}
class bike extends vehicle {
    bike() {
        super(600.0);
    }
        String gettype() {
        return "Bike";
    }
}
class truck extends vehicle  {
    truck() {
        super(3000.0);
    }
    String gettype() {
        return "Truck";
    }
}
public class Vehiclerent{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        int days = sc.nextInt();
        vehicle vehicle;
        if (type==1) {
            vehicle=new car();
        }
        else if (type==2) {
            vehicle=new bike();
        }
        else {
            vehicle=new truck();
        }
        double charge=vehicle.calculateRent(days);
        System.out.println("Vehicle Type: " + vehicle.gettype());
        System.out.printf("Rental Charge: %.2f%n", charge);
    }
}

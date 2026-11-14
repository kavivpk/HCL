import java.util.*;
interface Payment {
    double calculateFee(double amount);
}
class CreditCardPayment implements Payment {
    public double calculateFee(double amount) {
        return amount * 2 / 100;
    }
}
class UpiPayment implements Payment {
    public double calculateFee(double amount) {
        return amount * 0.5 / 100;
    }
}
class WalletPayment implements Payment {
    public double calculateFee(double amount) {
        return amount * 1 / 100;
    }
}
public class onlinepay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int type=sc.nextInt();
        double amount=sc.nextDouble();
        Payment payment;
        if (type==1) {
            payment=new CreditCardPayment();
        } 
        else if (type==2) {
            payment=new UpiPayment();
        } 
        else {
            payment=new WalletPayment();
        }
        double fee=payment.calculateFee(amount);
        double finalAmount=amount+fee;
        System.out.printf("Payment amount: %.2f%n",amount);
        System.out.printf("Transaction fee: %.2f%n", fee);
        System.out.printf("Final amount: %.2f%n", finalAmount);
    }
}

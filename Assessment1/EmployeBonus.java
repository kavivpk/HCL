import java.util.*;
class employee {
    String empname;
    employee(String empname) {
        this.empname=empname;
    }
    double calbonus() {
        return 0.0;
    }
    double calbonus(double amount) {
        return 0.0;
    }
}
class Technical extends employee {
    double basic;
    int rating;
    Technical(String empname,double basic,int rating) {
        super(empname);
        this.basic=basic;
        this.rating=rating;
    }
    double calbonus() {
        return basic*rating*2/100;
    }
    double calbonus(double salary,int emprate) {
        return salary*emprate*2/100;
    }
}
class Salemp extends employee {
    double salesAmount;
    Salemp(String empname,double salesAmount) {
        super(empname);
        this.salesAmount=salesAmount;
    }
    double calbonus(){
        return salesAmount*3/100;
    }
    double calbonus(double amount) {
        return amount*3/100;
    }
}
public class EmployeBonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int type=sc.nextInt();
        employee emp;
        double total;
        if (type==1){
            String empname=sc.next();
            double basal=sc.nextDouble();
            int rate=sc.nextInt();
            emp = new Technical(empname,basal,rate);
            double bonus = emp.calbonus();
            total = basal+bonus;
            System.out.println("Employee Name: "+emp.empname);
            System.out.printf("Bonus: %.2f%n",bonus);
            System.out.printf("Total Earnings: %.2f%n", total);
        } else {
            String empname=sc.next();
            double salesAmount=sc.nextDouble();
            emp=new Salemp(empname, salesAmount);
            double bonus=emp.calbonus();
            total = salesAmount +bonus;
            System.out.println("Employee Name: "+emp.empname);
            System.out.printf("Bonus: %.2f%n",bonus);
            System.out.printf("Total Earnings: %.2f%n",total);
        }
    }
}

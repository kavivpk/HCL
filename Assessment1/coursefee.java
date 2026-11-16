import java.util.*;
abstract class course {
    double coursefee;
    course(double coursefee) {
        this.coursefee=coursefee;
    }
    abstract double discount();
    abstract String gettype();
    double calculatefee(){
        return coursefee-discount();
    }
}
class Program extends course{
    Program(double coursefee){
        super(coursefee);
    }
    double discount(){
        return coursefee*10/100;
    }
    String gettype(){
        return "Programming";
    }
}
class dscourse extends course {
    dscourse(double coursefee) {
        super(coursefee);
    }
    double discount() {
        return coursefee*15/100;
    }
    String gettype(){
        return "Data Science";
    } }
class cloud extends course{
    cloud(double coursefee){
        super(coursefee);
    }
    double discount(){
        return coursefee*5/100;
    }
    String gettype() {
        return "Cloud";}
}
public class coursefee{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int type=sc.nextInt();
        double fee=sc.nextDouble();
        course course;
        if (type==1){
            course = new Program(fee);
        }
        else if (type==2){
            course = new dscourse(fee); }
        else {
            course = new cloud(fee); }
        double discount = course.discount();
        double finalFee = course.calculatefee();
        System.out.println("course type:" + course.gettype());
        System.out.printf("discount:%.2f%n", discount);
        System.out.printf("final fee:%.2f%n", finalFee);
    }
}

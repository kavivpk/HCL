import java.util.*;
abstract class doctor{
    double consult;
    doctor(double consult){
        this.consult = consult;
    }
    abstract String gettype();
    double calculatebill(double testCharges) {
        return consult;
    }
}
class physician extends doctor{
    physician(){
        super(500.0);
    }
    String gettype(){
        return "general physician";
    } }
class specialist extends doctor {
    specialist() {
        super(1000.0);
    }
    String gettype(){
        return "specialist";
    } }
class emergency extends doctor{
    emergency(){
        super(1500.0);
    }
    String gettype(){
        return "emergency doctor";}
    double calculatebill(double charges){
        return consult + charges;
    }
}
public class hospital{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int type=sc.nextInt();
        double charge=sc.nextDouble();
        doctor doc;
        if (type==1){
            doc=new physician();
        }
        else if(type==2){
            doc=new specialist();
        }
        else{
            doc=new emergency();}
        double bill=doc.calculatebill(charge);
        System.out.println("doctor type:" + doc.gettype());
        System.out.printf("consultation charge:%.2f%n",doc.consult);
        System.out.printf("test charges:%.2f%n", charge);
        System.out.printf("total bill:%.2f%n", bill);
    }
}

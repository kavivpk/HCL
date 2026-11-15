import java.util.*;
class delivery{
    double order;
    delivery(double order){
        this.order=order;
    }
    double calculdeli(){
        return order;
    }
}
class regular extends delivery{
    regular(double order){
        super(order);
    }
    double calculdeli(){
        return order+40.0;
    }
}
class express extends delivery{
    express(double order){
        super(order);
    }
    double calculdeli(){
        return order+80.0+(order*5/100);
    }
}
public class Food {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int type=sc.nextInt();
        double order=sc.nextDouble();
        delivery deli;
        if (type==1) {
            deli=new regular(order);
        } else {
            deli=new express(order);
        }
        double finchar=deli.calculdeli();
        System.out.printf("%.2f%n",finchar);
    }
}

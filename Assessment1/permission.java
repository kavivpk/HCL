import java.util.*;
interface access{
    String getrole();
    int getacess();
    boolean canAccess(int require);
}
class developer implements access{
    public String getrole(){
        return "Developer";
    }
    public int getacess(){
        return 1;
    }
    public boolean canAccess(int require){
        return getacess() >= require;
    }
}
class manager implements access{
    public String getrole(){
        return "Manager";
    }
    public int getacess(){
        return 2;}
    public boolean canAccess(int require){
        return getacess() >= require;
    }}
class admin implements access{
    public String getrole(){
        return "admin";
    }
    public int getacess(){
        return 3;}
    public boolean canAccess(int require){
        return getacess()>=require;}
}
public class permission{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int type=sc.nextInt();
        int require=sc.nextInt();
        access acces;
        if(type==1){
            acces=new developer();
        }
        else if(type==2){
            acces=new manager();
        }
        else{
            acces=new admin();
        }
        System.out.println("Role: "+acces.getrole());
        System.out.println("Access Level: "+acces.getacess());
        System.out.println("Can Access: "+acces.canAccess(require));
    }
}
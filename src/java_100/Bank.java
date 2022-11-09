package java_100;

public class Bank {
    int getRateOfInterest(){return 0;};
}
class wellsFargo extends  Bank{
    int getRateOfInterest(){return 8;};
}
class TD extends Bank{
    int getRateOfInterest(){return 10;};
}

class test{
    public static void main(String[] args) {
   wellsFargo wf=new wellsFargo();
    TD td=new TD();
        System.out.println("Wells Fargo interest rate is "+ wf.getRateOfInterest());
        System.out.println("TD interest rate is "+td.getRateOfInterest());
    }
}
// output:
//         Wells Fargo interest rate is 8
//         TD interest rate is 10

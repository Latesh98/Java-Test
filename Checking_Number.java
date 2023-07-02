 class ChkNo {

        int no;

        ChkNo(int no){
            this.no=no;

           checking();

        }

        void checking(){
            if(no>0)

        {
            System.out.println("The Number is Positive");

        }
        else if(no<0){
            System.out.println("The Number is Negative");
        }
        else{
            System.out.println("The Number is Zero");
        }
        }
    }


public class Checking_Number {

   

    public static void main(String[] args) {
        int no1 =5;
        int no2=0;
        int no3 =-9;
        ChkNo ck1 = new ChkNo(no1);
        ChkNo ck2 = new ChkNo(no2);
        ChkNo ck3 = new ChkNo(no3);

    }
}
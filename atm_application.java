import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    static String name1="pava";
    static int noOf500,noOf100,noOf50,noOf10,noOf20,noOf2000;
    static int[] notes= {2000,500,100,50,20};
    static  int u = 1233;
    static int balance = 30000;

    static void add_amount(){
        System.out.print("Enter no.of.500: Rs.");
                int noOf500 = sc.nextInt();
                System.out.print("Enter no.of.100: Rs.");
                int noOf100 = sc.nextInt();
                System.out.print("Enter no.of.50: Rs.");
                int noOf50 = sc.nextInt();
                System.out.print("Enter no.of.20: Rs.");
                int noOf20 = sc.nextInt();
                int tot ;
                tot= noOf500*500 + noOf100*100 + noOf50*50 + noOf20*20;
                System.out.println("Total amount in atm: "+tot);
    }
    
    static void dispalay_amount(){
        System.out.println("no.of.2000: Rs."+ noOf2000);
        System.out.println("no.of.500: Rs."+ noOf500);
        System.out.println("no.of.100: Rs."+ noOf100);
        System.out.println("no.of.50: Rs."+ noOf50);
        System.out.println("no.of.20: Rs."+ noOf20);
        System.out.println("no.of.10: Rs."+ noOf10);
    }
    
    
    static void Admin_login(){
        System.out.println("****************Login****************");
            System.out.print("Enter Username:");
            String Username = sc.next();
            System.out.print("Enter Password:");
            int Password = sc.nextInt();
        if(Username.equals("Admin") && Password==1234){
                System.out.println("***************Welcome Admin!****************");
                System.out.println("1.Load atm ");
                System.out.println("2.Dispaly amount in ATM ");
                System.out.println("3.Exit ");
                System.out.println("Press any key 1, 2 or 3:: ");
                int dd =sc.nextInt();
                if(dd==1){
                    System.out.println("*******************Load ATM********************");
                    add_amount();
                }
                else if(dd==2){
                    System.out.println("*************Dispaly amount in ATM***************");
                    dispalay_amount();
                }
        else if(Username.equals("pava") && Password!=1233){
            System.out.println("Invalid Password. Please check your Password.");
        }
        else{
            System.out.println("Invalid Username");
        }
        }
    }
    
    
    static void user_login(){
        System.out.println("***************Welcome!!****************");
        System.out.println("Login");
        System.out.print("Enter your name: ");
        String name1 = sc.next();
        System.out.print("Enter Password: ");
        int pass = sc.nextInt();
        if(name1.equals("pava") && pass == u){
                System.out.println("**************Welcome "+name1+"****************");
        } 
        else if(name1.equals("pava") && pass!=1233){
                System.out.println("Invalid Password. Please check your Password.");
                System.out.println("Forget Password? Press 1:: ");
                int fo = sc.nextInt();
                if(fo==1){
                    System.out.println("Incorrect pin");
                    System.out.println("**OTP is sent to your mobile**");
                    System.out.println("Enter OTP:: ");
                    int oo = sc.nextInt();
                    int otp = 4321;
                        if(oo==otp){
                            System.out.print("Enter yor new pin:");
                            int newpass = sc.nextInt();
                            System.out.println("***********Pin changed successfully.************");
                            System.out.println("*****************Rs.50 is Charger***************");
                            //balance-=50;
                }
            }
            }
             else{
                System.out.println("-------------------Invalid Username-------------------");
            }
    }
    
    static void withdrawal(){
        System.out.println("Please enter the amount details below!!");
        System.out.print("Enter your bank: ");
        String bank  = sc.next();
        if(bank.equals("Indian")){
        System.out.print("Enter the amount: ");
        int amo=sc.nextInt();
        if (amo>balance){
            System.out.println("Insufficient amount.");
        }
        else {
            for(int i=0;i<notes.length && amo!=0;i++)
            {
                if(amo>=notes[i])
                    System.out.println("No of "+notes[i]+"'s"+" :"+amo/notes[i]);
                    amo=amo%notes[i];
                    int tot_aava=balance-amo;
                    System.out.println(" Total balance available : Rs."+tot_aava+".0");
                }
            }
        }
                    
        else{
            System.out.print("Enter the amount: ");
            int amo=sc.nextInt();
            if (amo>balance){
                 System.out.println("Insufficient amount... ");
            }
            else {
            for(int i=0;i<notes.length && amo!=0;i++){
            if(amo>=notes[i])
            System.out.println("No of "+notes[i]+"'s"+" :"+amo/notes[i]);
            amo=amo%notes[i];
            int bal = balance-amo-20;
            System.out.println(" Total balance available : Rs."+bal+".0");
            }
        }
    }
}
    
    static void change_pin(){
        System.out.println("      Change pin");
        System.out.print("Enter your old pin:");
        int d = sc.nextInt();
        if(d == 1233 ){
            System.out.print("Enter yor new pin:");
            int newpass = sc.nextInt();
            System.out.println("Pin changed successfully.");
        }
    }
    
    static void deposit_amount(){
        System.out.println("*************Deposit Amount**************");
                            System.out.print("Enter the total deposit amount: ");
                            int dep_amt = sc.nextInt();
                            System.out.println("Enter noOf20: Rs.");
                            int noOf20=sc.nextInt();
                            System.out.println("Enter noOf50: Rs.");
                            int noOf50=sc.nextInt();
                            System.out.print("Enter noOf100: Rs.");
                            int noOf100=sc.nextInt();
                            System.out.print("Enter noOf500: Rs.");
                            int noOf500=sc.nextInt();
                            System.out.print("Enter noOf2000: Rs.");
                            int noOf2000=sc.nextInt();
                            int total = noOf100*100 + noOf500*500 + noOf50*50 + noOf20*20 + noOf2000*2000;
                            if(total == dep_amt){
                                System.out.println("Amount OF Rs."+total+".0 is deposited successfully");
                            }
                            else{
                                System.out.println("************check your amount once************");
                            }
    }
    
    
    static void transfer_amt(){
        System.out.println("*************Welcome "+name1"!**************");
        System.out.println("Enter Bank ID to transfer :");
        String bank_id=sc.next();
        int amount_transfer=0;
        int flag=0;
         int t=0;
            if(bank_id.equals(name1)){
                
               amount_transfer=t;
               flag=1;
            }
        if(flag==1){
            System.out.println("Enter Amount to be transferred to "+amount_transfer);
        int amount=sc.nextInt();
        if(balance>=amount){
          balance-=amount;
          amount_transfer+=amount;
          balance-=amount_transfer;
            System.out.println("-------------------Amount Transferred Successfully....-------------------");
            System.out.println("Current balance :: "+balance);

        }else{
            System.out.println("-------------------Insufficient Balance------------------");
        }}
        
         else{
            System.out.println("-------------------Invalid ID-------------------");
        }
    }
    
    public static void main(String[] args){
        int d=0;
        while(true){
        System.out.println("-------------------Welcome!-------------------");
        System.out.println("        1.Admin");
        System.out.println("        2.User");
        System.out.println("        3.Exit");
        System.out.print("Press any option 1, 2 or 3:");
        int a = sc.nextInt();
        switch(a){
        case 1:
            System.out.print(" Login by pressing 1:::   ");
            int at = sc.nextInt();
            if(at==1){
                Admin_login();
           }
           break;
        case 2:
            user_login();
                System.out.println("1.Withdraw");
                System.out.println("2.Check Balance");
                System.out.println("3.Pin change");
                System.out.println("4.Direct Deposit");
                System.out.println("5.Amount Transfer");
                System.out.print("Press any option 1, 2, 3, 4 or 5:");
                int us = sc.nextInt();
                if(us ==1 || us==2 || us==3 || us==4 ||us==5){
                    if(us==1){
                        withdrawal();
                    }
                    if(us == 2){
                            System.out.println("***************** Your current balance is "+balance+"****************");
                    }
                    if(us ==3){
                               change_pin();
                        }
                    
                    if(us==4){
                        deposit_amount();
                    }
                    if(us==5){
                        transfer_amt();
                    }
                    
                }
                else{
                    System.out.println("-------------------Press valid options-------------------");
                }
            break;
        case 3:
            System.out.println("******************Thank You for Visiting....*********************");
            break;
        
        }
        }
    }
}


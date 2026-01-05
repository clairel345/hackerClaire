import java.util.*;

public class TheBlackHatRises {
    public static void main(String[] args) throws java.io.IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("What bank do you use?");
        String bankV = sc.nextLine();

        GUI x = new GUI();

        System.out.println(bankV + " accounts have been in a data leak. Check your account now.");

        Thread.sleep(2000);

        // Get and store the username and password using GUI class
        String userName = x.GuiQTitle(bankV, "Put in your full government name");
        Thread.sleep(1000);
        String userPassword = x.GuiQPassword(bankV, "Put in your password");

        //for mac
        new ProcessBuilder("clear").inheritIO().start().waitFor();
        //new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Verify you aren't a robot first.");
        System.out.println("Are you a robot? (true/false)");
        Boolean robotOrNo = sc.nextBoolean();
        
        if (robotOrNo == true){
            System.out.println("Sorry, you aren't a real human. You cannot access the bank account.");
            System.exit(0);
        }
        else{
            System.out.println("Hi, please solve these math problems next.");
            System.out.println("What is (6*3)/2 - 1?");
            int firstMath = sc.nextInt();
            if (firstMath == 8){
                System.out.println("Great! One more, What is 5+5/5?");
                int secondMath = sc.nextInt();
                if (secondMath == 6){
                    System.out.println("You are a verified human. The program will proceed.");
                }
                else{
                    System.out.println("Sorry, try another question. What is 5+1?");
                    int thirdMath = sc.nextInt();
                    if (thirdMath == 6){
                        System.out.println("You are a verified human. The program will proceed.");
                    }
                    else{
                        System.out.println("How did you fail the math problems, you are locked out of the account.");
                        System.exit(0);
                    }       
                }
            }
            else{
                System.out.println("Sorry, you are not a human.");
                System.exit(0);
            }
        
        }
        
        System.out.println("Suspicious activity has occurred in your account");
        System.out.println("For your safety, and the safety of your account, you will be logged out.\n ");
        Thread.sleep(2000);        

        //for mac
        new ProcessBuilder("clear").inheritIO().start().waitFor();
        //new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();


        // Create a Decode object and pass the password for decoding
        Decode decoder = new Decode();
        decoder.decodeViaNumber(userPassword);
        
        
    }
}

package regex;

import javax.sound.midi.Sequence;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question_1 {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("[+]?+[1]?+[-]?[(]?[0-9]{3,3}+[)]?+[-]?[.]?[0-9]{3,3}+[-]?[.]?+[0-9]{4,4}");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter 1 to check the validation of Phone Number");

            System.out.println("Enter 2 to stop");
            int num = sc.nextInt();
            if(num==1){
                sc.nextLine();
                System.out.println("Please enter Phone Number");
                String str = sc.nextLine();
                boolean m = Pattern.matches(String.valueOf(p), str);
                if(m){
                    System.out.println("This is a Valid Number");
                }
                else{
                    System.out.println("This is a Invalid Number");

                }
            }
            else if(num==2){
                System.out.println("Thank You for using my application");
                break;
            }
            else{
                System.out.println("Please enter either 1 to check or 2 to stop");
            }
        }



//          Number to test my program for ur comfortable
//        ● 2124567890
//        ● 212-456-7890
//        ● (212)456-7890
//        ● (212)-456-7890
//        ● 212.456.7890
//        ● 212 456 7890
//        ● +12124567890
//        ● +12124567890
//        ● +1 212.456.7890
//        ● +212-456-7890
//        ● 1-212-456-7890
    }


}

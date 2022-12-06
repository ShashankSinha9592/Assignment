package regex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        // Pardon I haven't learned spring boot yet so I have tried to add some url data to search manually to give some output on the selected input;

        String[] data = {
                "https://www.facebook.com/fulioTech/",
                "https://www.linkedin.com/company/ful-io/",
                "+1 343 303 6668",
                "support@ful.io"
        };
        String[] data2 = {
                "https://www.facebook.com/happy/",
                "https://www.linkedin.com/company/happydata/",
                "+1 345 567 6755",
                "support@happy.com"
        };
        String[] data3 = {
                "https://www.facebook.com/naukri.com/",
                "https://www.linkedin.com/company/naukri.com/",
                "+1 456 678 7898",
                "support@naukri.com"
        };

        Map<String,String[]> datas = new HashMap<>();

        datas.put("https://ful.io",data );
        datas.put("https://happy.io",data2);
        datas.put("https://naukri.com", data3);

        // enter url if matched you will get output for the particular data entered
        // https://naukri.com
        // https://happy.io
        // https://ful.io

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if(datas.get(str)!=null){
            System.out.println("Social links : "+datas.get(str)[0]+ " , " +datas.get(str)[1]);
            System.out.println("Email : "+datas.get(str)[2]);
            System.out.println("Contact : "+datas.get(str)[3]);
        }
        else{
            System.out.println("No Data Found");
        }

    }
}

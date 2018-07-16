package before;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    
    public static void main(String args[]) {
        String str = "2018-06-14 13:52:05";
        String pattern = "(?<=\\s)\\d{2}(?=:)";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        int hour = 0;
        while( m.find() )
        {
            hour = Integer.parseInt(m.group());
        }
        System.out.println(hour);
        
//        String s="abc";
//        int a=0;
//        switch(s){
//         case "a":a=1;break;
//         case "ab":a=2;break;
//         case "abc":a=3;break;
//        }
//        System.out.println(a);

//        int[] a = new int[]{1,2,1321,4,5,5,6};
//        int[] b = new int[42];
//        System.arraycopy(a, 0, b, 0, 7);
//        for(int x: b){
//
//            System.out.println(x);
        for(int i = 0;i < 24;i++){
            System.out.print("table.getValue()["+ i +"] + ");
        }
    }

}
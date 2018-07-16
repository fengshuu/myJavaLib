package before;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

    public static void main(String[] args){
        List<Map<String, Object>> listMaps = new ArrayList<Map<String, Object>>();
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("1", "a");
        map1.put("2", 2);
        map1.put("3", 3);
        listMaps.add(map1);
        
        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("11", "aa");
        map2.put("22", 2);
        map2.put("33", 2);
        listMaps.add(map2);
        
        for (Map<String, Object> map : listMaps) {
            for (String s : map.keySet()) {
                System.out.print(map.get(s).toString() + "  ");
            }
        }
    }

    
//    public static void main(String[] args){
//        sup a = new sub1();
//        a.pi();
//    }
//
//}
//
//class sup{
//    protected int a = 1;
//    protected void pi(){
//        System.out.println(a);
//    }
//}
//
//class sub1 extends sup{
//    sub1(){
//        a = 2;
//    }
//}
//
//class sub2 extends sup{
//    final int a=2;
//    sub2(){
//        super();
//    }
}

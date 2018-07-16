package before;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class testEqual {
    public static void main(String args[]){        
        LinkedHashMap<String,List> myR = new LinkedHashMap<>();
        LinkedHashMap<String,List> shR = new LinkedHashMap<>();
        myR.put("1", Arrays.asList(Arrays.asList("xxx1","yyy1","zzz"),Arrays.asList("xxx1","yyy1","zzz")));
        myR.put("2", Arrays.asList(Arrays.asList("xxx2","yyy2","zzz"),Arrays.asList("xxx2","yyy2","zzz")));
        myR.put("3", Arrays.asList(Arrays.asList("xxx3","yyy3","zzz"),Arrays.asList("xxx3","yyy3","zzz")));
        
        shR.put("1", Arrays.asList(Arrays.asList("xxx1","yyy1","zzz"),Arrays.asList("xxx1","yyy1","zzz")));
        shR.put("2", Arrays.asList(Arrays.asList("xxx2","yyy2","zzz"),Arrays.asList("xxx2","yyy2","zzz")));
        shR.put("3", Arrays.asList(Arrays.asList("xxx3","yyy3","zzz"),Arrays.asList("xxx3","yyy3","zzz")));
        
        
        
        for(Entry<String, List> a: myR.entrySet()){
            List<List> b = shR.get(a.getKey());
            List<List> c = a.getValue();
            if (null == b ) {                
                System.out.println(a.getKey()+"她没有");
            }else if(b.size() != c.size()){
                System.out.println("表长度不正确");
            }else if(!listEqual1(b,c)){
                System.out.println("表buy");
            }else{
                System.out.println("一样");
            }
        }        
    }

    public static boolean listEqual(List a,List b){
        boolean flag = false;
        if (b.size() != a.size()) {
            System.out.println("#####################");
            System.out.println("字段条目数不一致");
            for(Object b1: b){
                System.out.print(b1 + ",");
            }
            System.out.println("]");
            for(Object b1: a){
                System.out.print(b1 + ",");
            }
            System.out.println("]");
            System.out.println("#####################");
            return flag;
        }
        for(Object a1:a){
            boolean flag1 = false;
            for(Object b1: b){
                if(a1.equals(b1)){
                    flag1 = true;
                    break;
                }
            }
            if(!flag1){
                System.out.println("#####################");
                System.out.println("条目内容不一致");
                for(Object b1: b){
                    System.out.print(b1 + ",");
                }
                System.out.println("]");
                for(Object b1: a){
                    System.out.print(b1 + ",");
                }
                System.out.println("]");
                System.out.println("#####################");
                return flag;
            }
        }
        return flag;
    }
    
    public static boolean listEqual1(List<List> a,List<List> b){
        boolean flag = false;
        for(List a1:a){
            boolean flag1 = false;
            for(List b1: b){
                if(listEqual(a1,b1)){
                    flag1 = true;
                    break;
                }
            }
            if(!flag1){
                return flag;
            }
        }
        return flag;
    }
}

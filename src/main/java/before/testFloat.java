package before;

public class testFloat {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String sf = "12000.";
        if(sf.indexOf('.') == -1){  //查不到字符'.'，返回-1。另外注意是单引号。
            System.out.println("int"); 
        }
            else{
            System.out.println("float");
        }

    }

}

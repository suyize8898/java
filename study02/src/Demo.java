public class Demo {
    public static void main(String[] args) {
        String[]str=new String[10];
        str[0]="1";
        str[1]="2";
        str[2]="3";
        str[3]="4";
        str[4]="5";
        str[5]="6";
        str[6]="7";
        for(String s:str){
            System.out.println(s+" ");
            if(s=="3"){
                System.out.println("开始执行break");
                break;
            }
        }
        System.out.println("for循环执行结束");
    }
}

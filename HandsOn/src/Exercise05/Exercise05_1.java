package Exercise05;
import java.lang.String;

public class Exercise05_1 {
    public static void main(String[] args) {
        if(args.length >= 1){
            System.out.println("文字列：" + args[0]);
            System.out.println("文字数：" + args[0].length());
            System.out.println("cの位置：" + args[0].indexOf("c"));
            System.out.println("文字列は、Welcomeか:" + args[0].equals("Welcome"));
        }else{
            System.out.println("文字列を指定してください。");
            System.out.println("使用方法：java Exercise05_1 文字列");
        }
        
    }
}

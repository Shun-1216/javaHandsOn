package Exercise06;

public class Exercise06_1 {
    public static void main(String[] args) {
        
        try{
            int val1 = Integer.parseInt(args[0]);
            int val2 = Integer.parseInt(args[1]);
            System.out.println(val1 + "+" + val2 + "=" + (val1+val2));
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("２つの数値を指定してください。");
            System.out.println("使用方法：java Exercise06_1 数値１ 数値２");
            System.out.println(ex.toString());
        }catch(NumberFormatException ex){
            System.out.println("引数には整数値を指定してください。");
            System.out.println("使用方法：java Exercise06_1 数値１ 数値２");
            System.out.println(ex.toString());
        }
        
    }
}

package Exercise05;

public class Exercise05_2 {
    public static void main(String[] args) {
        int val1;
        int val2;

        if(args.length<2){
            System.out.println("２つの数値を指定してください。");
            System.out.println("使用方法：java Exercise05_2 数値１ 数値２");
        }else{
            val1 = Integer.parseInt(args[0]);
            val2 = Integer.parseInt(args[1]);
            System.out.println(val1 + "+" + val2 + "=" + (val1+val2));
        }

    }
}

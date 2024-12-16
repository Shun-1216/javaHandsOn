package Exercise06;

public class Exercise06_2 {
    public static void main(String[] args) {
        String msg = null;
        try{
            int val1 = Integer.parseInt(args[0]);
            int val2 = Integer.parseInt(args[1]);
            System.out.println(val1 + "/" + val2 + "=" + divide(val1,val2));
            System.out.println(val1 + "%" + val2 + "=" + remainder(val1,val2));
            msg = "正常終了";
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("２つの数値を指定してください。");
            System.out.println("使用方法：java Exercise06_2 数値１ 数値２");
            msg = ex.toString();
        }catch(NumberFormatException ex){
            System.out.println("引数には整数値を指定してください");
            System.out.println("使用方法：java Exercise06_2 数値１ 数値２");
            msg = ex.toString();
        }catch(ArithmeticException ex){
            System.out.println("第２引数には０以外を指定してください");
            System.out.println("使用方法：java Exercise06_2 数値１ 数値２");
            msg = ex.toString();
        }finally{
            System.out.println(msg);
        }
    }
    //除算メソッド
    static int divide(int val1,int val2) throws ArithmeticException{
        return val1 / val2;
    }
    //剰余メソッド
    static int remainder(int val1,int val2) throws ArithmeticException{
        return val1 % val2;
    }
}
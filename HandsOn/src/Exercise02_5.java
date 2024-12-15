public class Exercise02_5 {
    public static void main(String[] args){
        if (args.length <=1 ){     
            System.out.println("２つの文字列を指定してください。");
            System.out.println("使用方法：java Exercise02_5 文字列１ 文字列２");
        }else{
            String str = args[0] + ":" + args[1];
            System.out.println(str); 
        }
        
    }
}

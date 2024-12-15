public class Exercise02_6 {
    public static void main(String[] args){
        for(int i=1 ;i<=15;i++){
            if(i % 3 == 0){
                System.out.println(i+"を3で割ると"+i/3+"です");
            }else{
                System.out.println(i);
            }
        }
    }
}

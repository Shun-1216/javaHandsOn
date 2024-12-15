package Exercise04;

// Disp04_1.java

// メソッドのオーバーロードを確認するためのクラス
public class Disp04_1 {
    // 「なし」と表示する
    public void display() {
        System.out.println("なし");
    }
    public void display(String arg1){
        System.out.println(arg1);       
    }
    public void display(String arg1,int arg2){
        System.out.println(arg1+","+ arg2);
    }
}

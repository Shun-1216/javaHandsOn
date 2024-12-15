package Exercise04;

// Exercise04_1.java

// Disp04_1クラスを利用するクラス
public class Exercise04_1 {
    public static void main(String[] args) {
        // Disp04_1オブジェクトの生成
        Disp04_1 obj = new Disp04_1();

        // 引数なしのdisplayメソッドの呼び出し
        obj.display();

        obj.display("Java");
        obj.display("Java", 1996);
    }
}

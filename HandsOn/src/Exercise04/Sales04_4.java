package Exercise04;

// Sales04_4.java

// 営業を表現するクラス
public class Sales04_4 extends Employee04_4 {
    // Sales固有の属性の定義
    private int customerCount;        // 顧客数

    // コンストラクタ（引数あり）
    public Sales04_4(String id, String ename, int count) {
        super(id, ename);
        customerCount = count;
    }

    // 従業員情報（従業員番号、氏名、顧客数）を表示する
    public void printInfo() {
        super.printInfo();
        System.out.println("customerCount：" + customerCount);
    }
}

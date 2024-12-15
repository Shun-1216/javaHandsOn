package Exercise04;

// SE04_4.java

// SEを表現するクラス
public class SE04_4 extends Employee04_4 {
    // SE固有の属性の定義
    private String qualification;        // 資格

    // コンストラクタ（引数あり）
    public SE04_4(String id, String ename, String q) {
        super(id, ename);
        qualification = q;
    }

    // 従業員情報（従業員番号、氏名、資格）を表示する
    public void printInfo() {
        super.printInfo();
        System.out.println("qualification：" + qualification);
    }
}

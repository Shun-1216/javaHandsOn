package Exercise04;

// Staff04_4.java

// スタッフを表現するクラス
public class Staff04_4 extends Employee04_4 {
    // Staff固有の属性の定義
    private String specializedField;        // 専門分野

    // コンストラクタ（引数あり）
    public Staff04_4(String id, String ename, String field) {
        super(id, ename);
        specializedField = field;
    }

    // 従業員情報（従業員番号、氏名、専門分野）を表示する
    public void printInfo() {
        super.printInfo();
        System.out.println("specializedField：" + specializedField);
    }
}

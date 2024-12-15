package Exercise03;

// Employee03_4.java

// 従業員を表現するクラス
public class Employee03_4 {
    // 属性の定義
    private String name;                 // 氏名
    private int age;                     // 年齢
    public static String companyName;    // 会社名

    // コンストラクタ
    public Employee03_4(String n, int a) {
        name = n;
        age = a;
    }

    // 氏名を設定する
    public void setName(String n) {
        name = n;
    }

    // 年齢を１つ増やす
    public void addAge() {
        age++;
    }

    // 従業員情報を取得する
    public String getInfo() {
        String employeeData = "氏名：" + name + "、年齢：" + age;
        return employeeData;
    }

    // 会社名を設定する
    public static void setCompanyName(String cName) {
        companyName = cName;
    }
}

package Exercise03;

// Employee03_3.java

// 従業員を表現するクラス
public class Employee03_3 {
    // 属性の定義
    String name;        // 氏名
    int age;            // 年齢

    //コンストラクタ
    Employee03_3(String n ,int a){
        name = n;
        age = a;
    }
    // 氏名を設定する
    void setName(String n) {
        name = n;
    }

    // 年齢を１つ増やす
    void addAge() {
        age++;
    }

    // 従業員情報を取得する
    String getInfo() {
        String employeeData = "氏名：" + name + "、年齢：" + age;
        return employeeData;
    }
}

package Exercise04;

// Employee04_2.java

// 従業員を表現するクラス
public class Employee04_2 {
    // 属性の定義
    private String empId;          // 従業員番号
    private String empName;        // 氏名

    // コンストラクタ（引数なし）
    public Employee04_2() {
        empId = "123456";
        empName = "台場一郎";
    }

    // コンストラクタ（引数あり）
    public Employee04_2(String id, String ename) {
        empId = id;
        empName = ename;
    }

    // 従業員番号を取得する
    public String getEmpId() {
        return empId;
    }

    // 従業員番号を設定する
    public void setEmpId(String id) {
        empId = id;
    }

    // 氏名を取得する
    public String getEmpName() {
        return empName;
    }

    // 氏名を設定する
    public void setEmpName(String ename) {
        empName = ename;
    }

    // 従業員情報（従業員番号、氏名）を表示する
    public void printInfo() {
        System.out.println("empId：" + empId);
        System.out.println("empName：" + empName);
    }
}

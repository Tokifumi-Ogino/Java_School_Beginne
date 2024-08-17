/*新規Java ファイル「ComprehensiveBeginner02_03.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

以下の表示結果が表示されるよう、下記のクラスを使用してコーディングしてください。

buyDrink() メソッドを持つ、Coffee クラスを使用する
buyDrink() メソッドを持つ、Juice クラスを使用する

バヤリース の オレンジ 味です。130 円になります。
午後の紅茶 の レモンティー 味です。150 円になります。
(つまり必要な情報は銘柄、味、価格の３つ)

ボス の甘さは 控え目、 ミルク 無しです。 110 円になります。
ジョージア の甘さは 甘め、ミルク 入りです。 120 円になります。
（つまり必要な情報は銘柄、味、ミルクの有無、価格の４つ）*/

class Juice {
    // インスタンス変数
    String brand;
    String taste;
    int price;

    // コンストラクタ（コンストラクタ名はクラス名と同じ, 戻り値の型は指定しない）
    public Juice(String brand, String taste, int price) {
        // thisを使ってインスタンス変数とローカル変数を区別
        this.brand = brand;
        this.taste = taste;
        this.price = price;
    }

    // メソッド
    public void buyDrink() {
        System.out.println(this.brand + "の" + this.taste + "味です。" + this.price + "円になります。");
    }
}

class Coffee {
    String brand;
    String taste;
    String milk;
    int price;

    public Coffee(String brand, String taste, String milk, int price) {
        this.brand = brand;
        this.taste = taste;
        this.milk = milk;
        this.price = price;
    }

    public void buyDrink() {
        System.out.println(this.brand + "の" + this.taste + "です。" + "ミルクは" + this.milk + "です。" + this.price + "円になります。");
    }
}
public class ComprehensiveBeginner02_03 {
    public static void main(String[] args) {
        // オブジェクトの作成
        Juice juice01 = new Juice("バヤリース", "オレンジ", 130);
        juice01.buyDrink();

        Juice juice02 = new Juice("午後の紅茶", "レモンティー", 150);
        juice02.buyDrink();
        
        Coffee coffee01 = new Coffee("ボス", "甘さ控えめ", "なし", 110);
        coffee01.buyDrink();

        Coffee coffee02 = new Coffee("ジョージア", "甘め", "入り", 120);
        coffee02.buyDrink();
       
    }
}

package cap8;

public class Main {
  public static void main(String[] args) {
    // 勇者を生成
    Hero h = new Hero(); // Heroクラスからインスタンスを生成し、変数Hに入れる
    // お化けキノコを生成
    Matango m1 = new Matango();
    Matango m2 = new Matango();
    // フィールドに初期値をセット
    h.name = "ミナト";
    h.hp = 100;

    m1.hp = 50;
    m1.suffix = 'A';

    m2.hp = 48;
    m2.suffix = 'B';
    // 冒険の始まり
    System.out.println("勇者" + h.name + "を生み出しました！");
    h.slip();
    m1.run();
    m2.run();
    h.run();
    System.out.println("勇者" + h.name + "を生み出しました！");
    // 勇者のメソッドを呼び出してゆく
    h.sit(5); // 5秒座れ
    h.slip(); // 転べ
    h.sit(25); // 25秒座れ
    h.run(); // 逃げろ
  }

}

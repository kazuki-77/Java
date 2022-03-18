package cap8;

public class Main {
  public static void main(String[] args) {
    // 勇者を生成
    Hero h1 = new Hero("ミナト"); // Heroクラスからインスタンスを生成し、変数h1に入れる
    Hero h2 = new Hero("アサカ");

    // お化けキノコを生成
    Matango m1 = new Matango();
    Matango m2 = new Matango();

    // 剣を生成
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;

    Sword s2 = new Sword();
    s2.name = "氷の剣";
    s2.damage = 12;

    // フィールドに初期値をセット
    // h1.name = "ミナト";
    h1.hp = 100;
    h1.sword = s;

    // h2.name = "アサカ";
    h2.hp = 100;
    h2.sword = s2;

    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;

    m1.hp = 50;
    m1.suffix = 'A';

    m2.hp = 48;
    m2.suffix = 'B';
    // 冒険の始まり
    System.out.println("勇者" + h1.name + "を生み出しました！");
    System.out.println("現在の武器は" + h1.sword.name + "です");
    System.out.println(h1.name + "のHPは、" + h1.hp + "です");
    h1.slip();
    m1.run();
    m2.run();
    h1.run();
    System.out.println("");
    System.out.println("勇者" + h2.name + "を生み出しました！");
    System.out.println("現在の武器は" + h2.sword.name + "です");
    System.out.println(h2.name + "のHPは、" + h2.hp + "です");

    // 勇者のメソッドを呼び出してゆく
    h1.sit(5); // 5秒座れ
    h1.slip(); // 転べ
    h1.sit(25); // 25秒座れ
    h1.run(); // 逃げろ

    // 回復の呼び出し
    w.heal(h1); // ミナトのHPを回復させる (HP: 100 → 110)
    w.heal(h2); // アサカのHPを回復させる (HP: 100 → 110)
    w.heal(h2); // アサカのHPを回復させる (HP: 110 → 120)
    System.out.println(h2.name + "のHPは" + h2.hp + "です");
  }

}

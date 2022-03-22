package cap12;

public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    Hero h2 = new Hero();
    Thirf t1 = new Thief();
    Wizard w1 = new Wizard();
    Wizard w2 = new Wizard();

    // 冒険開始
    // まず宿屋に泊まる
    h1.hp += 50;
    h2.hp += 50;
    t1.hp += 50;
    w1.hp += 50;
    w2.hp += 50;
  }
}
// このコードの前提
// HeroやWizard、Thiefは、抽象クラスCharacterを継承している
// Characterはnameとhpフィールド、attack()とrun()のメソッドを持つ

// このプログラムには2つの課題がある。
// 1. コードに重複が多い
// ~hp += 50 という同じ処理が何度も登場するため、変数名の取り違えが発生する可能性がある
//
// 2. 将来的に多くの修正が必要
// パーティの人数が増えた場合、宿泊処理に行を追加をしなければならない
// インスタンス変数名が変更になった場合も、コードに修正が必要
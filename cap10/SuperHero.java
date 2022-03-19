package cap10;

// class SuperHero extends Heroという宣言は
// 「Heroクラスをベースにして SuperHeroクラスを定義するので
// Heroと同じメンバの定義は省略する(違いだけを記述する)」という意味となる。
public class SuperHero extends Hero{ // 基本的にはHeroと同じ宣言
  boolean flying; // 追加したflying

  public SuperHero() {
    System.out.println("SuperHeroのコンストラクタが動作");
  }
  public void attack(Matango m) {
    // superは今より一つ内側のインスタンス部分を表す予約語
    super.attack(m); // 親インスタンス部分の attack()を呼び出し
    if(this.flying) {
      super.attack(m); // 親インスタンス部分の attack()を呼び出し
    }
  }
  public void fly() { // 追加したfly()
    this.flying = true;
    System.out.println("飛び上がった");
  }
  public void land() { // 追加したland()
    this.flying = false;
    System.out.println("着地した");
  }
}
//  親インスタンス部分のフィールドを利用する
//  super.フィールド名
//  親インスタンス部分のメソッドを呼び出す
//  super.メソッド名(引数)
//  superを付けないとthis.attack()などと同じ意味になってしまうため、
//  必ず一つ内側のインスタンスを呼び出すときはsuperをつける

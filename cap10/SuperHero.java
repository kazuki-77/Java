package cap10;

// class SuperHero extends Heroという宣言は
// 「Heroクラスをベースにして SuperHeroクラスを定義するので
// Heroと同じメンバの定義は省略する(違いだけを記述する)」という意味となる。
public class SuperHero extends Hero{ // 基本的にはHeroと同じ宣言
  boolean flying; // 追加したflying
  public void fly() { // 追加したfly()
    this.flying = true;
    System.out.println("飛び上がった");
  }
  public void land() { // 追加したland()
    this.flying = false;
    System.out.println("着地した");
  }
}

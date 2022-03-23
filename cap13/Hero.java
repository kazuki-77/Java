package cap13;
// privateを利用する例え
public class Hero {
  private int hp; // privateを記述することで自分自身のクラスでしか変更できないようにする
  String name;
  Sword sword;
  
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は眠って回復した！");
  }

  // privateを記述することで、外部のクラスから呼び出せなくなる
  private void die() {
    System.out.println(this.name + "は死んでしまった！");
    System.out.println("GAME OVERです");
  }

}
// privateであっても、自分のクラスからthis. での読み書きは可能
// privateが使用されているフィールドでもメソッドを経由すればアクセスできる


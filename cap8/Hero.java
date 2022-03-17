package cap8;

public class Hero {
  // クラスプロック内で宣言された変数を、Javaでは「フィールド」という
  String name; // 名前の宣言
  int hp;      // HPの宣言　　　

  public void sleep() {
    this.hp = 100; // 自分自身のhpフィールド
    System.out.println(this.name + "は、眠って回復した！"); // 自分自身のnameフィールド
    // thisは特別に準備された変数で、「自分自身のインスタンス」を意味している
    // 「.」は日本語だと「の」と同じ意味がある
    // this.hp = 100;　は　「自分自身のインスタンスのhpフィールドに100を代入する」という意味になる
  }
  public void sit(int sec) { // 引数 int sec は何秒座るか引数で受け取る
    this.hp += sec; // 座る秒数だけ HP を増やす
    System.out.println(this.name + "は、 " + sec + "秒座った！");
    System.out.println("HPが" + sec + "ポイント回復した");
  }
  public void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ！");
    System.out.println("5のダメージ");
  }
  public void run() {
    System.out.println(this.name + "は、逃げ出した！");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした");
  }

  // thisは省略しないようにする
  // ローカル変数や引数にも同じhpという変数があるとそちらが優先されてしまうなど、予想外の動作になる可能性があるため
}

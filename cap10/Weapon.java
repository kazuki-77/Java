package cap10;

public class Weapon extends Item {
  public Weapon() {
    super("ななしの剣");
  }
}
// Itemクラスのコンストラクタ呼び出しには引数が1つまたは2つ必要なため、
// Weaponクラスのコンストラクタからでもsuper()の中に引数を入れないと呼び出せない
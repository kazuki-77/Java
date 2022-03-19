package cap10;

public class Matango {
  int hp; // HPの宣言
  final int LEVEL = 10; // お化けキノコのレベルに初期値10を設定

  char suffix;

  public void run() {
    System.out.println("お化けキノコ" + this.suffix + "は、逃げ出した！");
  }
}

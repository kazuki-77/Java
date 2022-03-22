package cap12;

public class Main2 {
  public static void main(String[] args) {
    Character[] c = new Character[5];
    c[0] = new Hero();
    c[1] = new Hero();
    c[2] = new Thief();
    c[3] = new Wizard();
    c[4] = new Wizard();
    // 宿泊に泊まる
    for (Character ch : c) { // 1名ずつ順番に取り出し
      ch.hp += 50;           // HPを50回復する
    }
  }
}

// 〜　ポイント　〜
// 5行目で配列を使っている点
// 従来のように5人のインスタンスを厳密にHeroやThiefとしてお使おうとする限り、
// それらを一括しては扱えないが、それぞれをCharacterだとざっくり見なせば
// 「どれもキャラクター」のため、5つのインスタンスをCharacter配列にまとめ、ループを回して一括で処理することが可能
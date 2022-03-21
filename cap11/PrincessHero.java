package cap11;

// クラスにはないインターフェースの特権
// 異なる実装が衝突する問題が発生しないため、複数の親インターフェースによる多重継承が認められている
// インターフェースの多重継承の書き方
// public class クラス名 implements 親インターフェース1, 親インターフェース2,・・・{}
public class PrincessHero implements Hero, Princess, Character {
  // Hero, Princess, Characterは全てインターフェースとなる
}

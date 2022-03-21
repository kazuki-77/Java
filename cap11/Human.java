package cap11;
/* 同種(クラス同士、インターフェース同士)の継承の場合はextends(拡張)を使う、
   異種ならimplements(実装)を使うと覚える。 */

// インターフェースの継承例
public interface Human extends Creature {
  void talk();

  void watch();

  void hear();
  // 例えばさらに親インターフェース(Creature)からrun()を継承する
}

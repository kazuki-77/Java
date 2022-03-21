package cap11;
// implements・・・インターフェースを継承し、クラスを宣言する場合はimplementsを使う
// インターフェースの継承の書き方
// public class クラス名 implements インターフェース名
public class KyotoCleaningShop implements CleaningService {
  String ownerName; //　店主の名前
  String address;   //　住所
  String phonel     //　電話番号

  /* シャツを洗う */
  public Shirt washShirt(Shirt s) {
    // 大型洗濯機15分
    return s;
  }
  /* タオルを洗う */
  public Towl washTowl(Towl t) {
    // 大型洗濯機10分
    return t;
  }
  /* コートを洗う */
  public Coat washCoat(Coat c) {
    // ドライ20分
    return c;
  }
}

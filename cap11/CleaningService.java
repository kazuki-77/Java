package cap11;
// インターフェースクラスの書き方
// punlic interface インターフェース名
public interface CleaningService {
  Shirt washShirt(Shirt s);

  Towl washTowl(Towl t);

  Coat washCoat(Coat c);
}

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;
/**
 * @version (20220601)
 * 
 * (注意) Heroクラス内に 3つのコンストラクタが
 * 　　　　宣言されるまで、このテストクラスはエラーが表示される
 **/
public class HeroTest {

    @Test
    public void testConstructor1()
    {
        // action
        Hero h = new Hero();

        // assertion
        assertEquals(120, h.hp, "Hero.Hero()でのhpの初期化が不正です!");
        assertEquals("??", h.name,"Hero.Hero()でのnameの初期化が不正です!");
    }

    @Test
    public void testConstructor2()
    {
        // action
        Hero h = new Hero("生命太郎");

        // assertion
        assertEquals(120, h.hp,"Hero.Hero(String )でのhpの初期化が不正です!");
        assertEquals("生命太郎", h.name, "Hero.Hero(String )でのnameの初期化が不正です!");
    }

    @Test
    public void testConstructor3()
    {
        // action
        Hero h = new Hero("生命太郎", 200);

        // assertion
        assertEquals(200, h.hp, "Hero.Hero(String , int ) でのhpの初期化が不正です!");
        assertEquals("生命太郎", h.name);
    }
}

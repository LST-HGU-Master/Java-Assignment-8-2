import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * @version (20220601)
 * @version (20261028) revised for lifecycle management and complete assertion messaging
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
        assertEquals(120, h.hp, "Hero.Hero() での hp の初期化が不正です!");
        assertEquals("??", h.name,"Hero.Hero() での name の初期化が不正です!");
    }

    @Test
    public void testConstructor2()
    {
        // action
        Hero h = new Hero("生命太郎");

        // assertion
        assertEquals(120, h.hp, "Hero.Hero(String) での hp の初期化が不正です!");
        assertEquals("生命太郎", h.name, "Hero.Hero(String) での name の初期化が不正です!");
    }

    @Test
    public void testConstructor3()
    {
        Hero h = new Hero("生命太郎", 200);

        assertEquals(200, h.hp, "Hero.Hero(String , int ) での hp の初期化が不正です!");
        assertEquals("生命太郎", h.name, "Hero(String, int) での name の初期化が不正です!");
    }
}

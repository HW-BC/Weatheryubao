package cn.wzhsun.weather;


import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        System.out.println(s());
        System.out.println(Integer.toHexString(s()));
    }

    public Integer s(){
        return 0x7A6AA7DF;
    }
}
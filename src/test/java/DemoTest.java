import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;



//GIven: AN array of numbers as strings
//Task: sort from smallest to largest
//Restriction: They must stay strings- no converting to numbrs



public class DemoTest {
    //Before
    Demo demo = new Demo();

    @Test
    public void SortArrayTest() {
        //Given
        String[] givenTest = {"1","15","6","9","4"};
        String[]expected = {"1","4","6","9","15"};
        //When
        String[] actual =  demo.SortArray(givenTest);
        //Then
        assertArrayEquals(expected,actual);
    }
}
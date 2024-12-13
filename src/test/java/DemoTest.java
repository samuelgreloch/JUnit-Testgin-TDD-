import org.junit.Test;

import java.util.Arrays;

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
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected,actual);
    }



    @Test
    public void LengthTest() {
        //Given
        String[] givenTest = {"1","333","4434","22","55555"};
        String[]expected = {"1","22","333","4434","55555"};
        //When
        String[] actual =  demo.SortArray(givenTest);
        //Then
        assertArrayEquals(expected,actual);
        System.out.println(Arrays.toString(actual));
    }


    @Test
    public void SortSameLengthTest() {
        //Given
        String[] givenTest = {"1","6","9","4"};
        String[]expected = {"1","4","6","9"};
        //When
        String[] actual =  demo.SortArray(givenTest);
        //Then
        assertArrayEquals(expected,actual);
        System.out.println(Arrays.toString(actual));
    }


    @Test
    public void NegativeNumbersTest() {
        //Given
        String[] givenTest = {"-1","-6","-9","-4"};
        String[]expected = {"-9","-6","-4","-1"};
        //When
        String[] actual =  demo.SortArray(givenTest);
        //Then
        assertArrayEquals(expected,actual);
        System.out.println(Arrays.toString(actual));
    }

    @Test
    public void NegativePositiveNumbersTest() {
        //Given
        String[] givenTest = {"-1","6","9","-4"};
        String[]expected = {"-4","-1","6","9"};
        //When
        String[] actual =  demo.SortArray(givenTest);
        //Then
        assertArrayEquals(expected,actual);
        System.out.println(Arrays.toString(actual));
    }

    @Test
    public void NegativePositiveFifteenNumberTest() {
        //Given
        String[] givenTest = {"-1","-15","-6","-9","-4"};
        String[]expected = {"-15","-9","-6","-4","-1"};
        //When
        String[] actual =  demo.SortArray(givenTest);
        //Then
        assertArrayEquals(expected,actual);
        System.out.println(Arrays.toString(actual));
    }


}
package project;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzQixTest {
    @Test
    public void oneShouldReturnOne() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(1);
        assertThat(spokenWord).isEqualTo("1");
    }

    @Test
    public void twoShouldReturnTwo() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(2);
        assertThat(spokenWord).isEqualTo("2");
    }

    @Test
    public void threeShouldReturnFizz() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(3);
        assertThat(spokenWord).isEqualTo("Fizz");
    }

    @Test
    public void fiveShouldReturnBuzz() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(5);
        assertThat(spokenWord).isEqualTo("Buzz");
    }

    @Test
    public void sevenShouldReturnQix() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(7);
        assertThat(spokenWord).isEqualTo("Qix");
    }

    @Test
    public void fifteenShouldReturnFizzBuzz() {
        FizzBuzzQix underTest = new FizzBuzzQix();
        String spokenWord = underTest.interpret(15);
        assertThat(spokenWord).isEqualTo("FizzBuzz");
    }

    private FizzBuzzQix underTest;

    private void assertSpokenWord(int numberToInterpret, String expectedWord) {
        String spokenWord = underTest.interpret(numberToInterpret);
        assertThat(spokenWord).isEqualTo(expectedWord);
    }

}


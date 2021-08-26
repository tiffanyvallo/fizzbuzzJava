import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class FizzbuzzTest {
    Fizzbuzz subject;
    @BeforeEach
    void setUp() {
        subject = new Fizzbuzz();
    }
    @Test
    void testGenerateListsNumbersUpToThree() {
        String result = subject.fizzbuzz(3);
        assertEquals("1, 2, Fizz", result);
    }
    @Test
    void testGenerateListsNumbersUpToFive() {
        String result = subject.fizzbuzz(5);
        assertEquals("1, 2, Fizz, 4, Buzz", result);
    }
    @Test
    void testGenerateListsNumbersUpToFifteen() {
        String result = subject.fizzbuzz(15);
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz", result);
    }
}
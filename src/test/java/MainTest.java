import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class MainTest {

    Main main = new Main();

    @Test
    public void shouldGive0For0() {
        //given
        int numberOfTerms = 0;

        //when
        int result = main.calculateSumOfEvenNumbers(numberOfTerms);

        //then
        assertThat(result, equalTo(0));

    }

    @Test
    public void shouldGive10For10() {
        //given
        int numberOfTerms = 10;

        //when
        int result = main.calculateSumOfEvenNumbers(numberOfTerms);

        //then
        assertThat(result, equalTo(10)); //2 + 8

    }

    @Test
    public void shouldGive10For20() {
        //given
        int numberOfTerms = 20;

        //when
        int result = main.calculateSumOfEvenNumbers(numberOfTerms);

        //then
        assertThat(result, equalTo(10)); //2 + 8

    }

    @Test
    public void shouldGive44For35() {
        //given
        int numberOfTerms = 35;

        //when
        int result = main.calculateSumOfEvenNumbers(numberOfTerms);

        //then
        assertThat(result, equalTo(44)); //2 + 8 + 34

    }

    @Test
    public void shouldGive188For145() {
        //given
        int numberOfTerms = 145;

        //when
        int result = main.calculateSumOfEvenNumbers(numberOfTerms);

        //then
        assertThat(result, equalTo(188)); //2 + 8 + 34 + 144

    }

}

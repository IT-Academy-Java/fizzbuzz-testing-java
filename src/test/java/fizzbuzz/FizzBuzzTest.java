package fizzbuzz;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @Before
  public void init(){
    fizzBuzz = new FizzBuzz();
  }

  @Test
  public void shouldPrintFizzWhenItReceives3(){
    assertThat(fizzBuzz.fizzbuzz(3), is("fizz"));
  }

  @Test
  public void shouldPrintFizzWhenItReceives5(){
    assertThat(fizzBuzz.fizzbuzz(5), is("buzz"));
  }

  @Test
  public void shouldPrintFizzbuzzWhenItReceivesMultipleOf3And5(){
    assertThat(fizzBuzz.fizzbuzz(15), is("fizzbuzz"));
  }

  @Test
  public void shouldPrint0WhenItReceives0(){
    assertThat(fizzBuzz.fizzbuzz(0), is("0"));
  }
}

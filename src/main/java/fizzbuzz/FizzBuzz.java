package fizzbuzz;

import static util.IsMultipleOf.*;

public class FizzBuzz {
  private int initialNumber;
  private int finalNumber;

  public FizzBuzz() {
  }

  public FizzBuzz(int initialNumber, int finalNumber) {
    this.initialNumber = initialNumber;
    this.finalNumber = finalNumber;
  }

  public int getInitialNumber() {
    return initialNumber;
  }

  public void setInitialNumber(int initialNumber) {
    this.initialNumber = initialNumber;
  }

  public int getFinalNumber() {
    return finalNumber;
  }

  public void setFinalNumber(int finalNumber) {
    this.finalNumber = finalNumber;
  }

  public String fizzbuzz(int number){
    if (number != 0) {
      if (divisible(number, 3) && divisible(number, 5)) {
        return "fizzbuzz";
      }
      if (divisible(number, 3)) {
        return "fizz";
      }
      if (divisible(number, 5)) {
        return "buzz";
      }
      return number + "";
    } else {
      return "0";
    }
  }

  public void printFizzBuzzResult(){
    for (int i = this.initialNumber; i <= this.finalNumber; i++) {
      System.out.println(i + ": " + fizzbuzz(i));
    }
  }
}

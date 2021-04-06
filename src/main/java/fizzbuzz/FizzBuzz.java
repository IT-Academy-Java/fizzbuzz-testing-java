package fizzbuzz;

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
    if(number == 0){
      return "0";
    }
    if((number % 3 == 0) && (number % 5 == 0)){
      return "fizzbuzz";
    }
    if(number % 3 == 0){
      return "fizz";
    }
    if(number % 5 == 0){
      return "buzz";
    }

    return number+"";
  }

  public void printFizzBuzzResult(){
    for (int i = this.initialNumber; i <= this.finalNumber; i++) {
      System.out.println(i + ": " + fizzbuzz(i));
    }
  }
}

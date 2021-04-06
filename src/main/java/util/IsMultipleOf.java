package util;

public class IsMultipleOf {

  public static boolean divisible(int number, int multiple){
    if(number % multiple == 0) {
      return true;
    }
    return false;
  }
}

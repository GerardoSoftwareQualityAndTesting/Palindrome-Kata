package mx.tec.kata;

public class PalindromeValidator {

  public boolean validate(String string) {
    string = string.replaceAll("\\s+", "");
    if (string.length() > 1) {
      for (int i = 0; i < Math.floorDiv(string.length(), 2); i++) {
        if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
          return false;
        }
      }
    }
    return true;
  }
}

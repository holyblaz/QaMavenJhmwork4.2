public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 1000_60;
    long expected = 30;
    boolean registered = true;

    long actual = service.calculate(amount, registered);

    boolean passedTest = expected == actual;
    System.out.println(passedTest);

    // System.out.println("ОР:" + expected + ", " + "ФР: " + actual);
  }
}


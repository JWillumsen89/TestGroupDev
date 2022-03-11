public class Test {

  void hello() {
    heyYou();
    whatSUp();
    answerWhatsUp();
    System.out.println("Hey you");
  }

  void heyYou() {
    System.out.println("Hey there!!!");
    System.out.println("hep hey!!");
  }

  void countToTen() {
    for (int i = 0; i < 10; i++) {
      System.out.println(i);

    }
  }

  void whatSUp() {
    System.out.println("Whats up?!");
  }


  void hello2(){
    System.out.println("Hey you you");
  }

  void answerWhatsUp(){
    System.out.println("not much, you?");
  }
  public static void main(String[] args) {

    new Test().hello();

    new Test().hello2();

    new Test().countToTen();

    System.out.println("Hello Basma");
    System.out.println("Hej Jonathan, Hej hej");
    System.out.println("Hello World!");
    System.out.println("Hellooooo");
  }
}

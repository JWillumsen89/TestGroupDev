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

  void countFrom0To15() {
    for (int i = 1; i < 15; i++) {
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

    new Test().countFrom0To15();

    System.out.println("Hello Basma");
    System.out.println("Hej Jonathan, Hej hej");
    System.out.println("Hello World!");
    System.out.println("Hellooooo");
  }
}

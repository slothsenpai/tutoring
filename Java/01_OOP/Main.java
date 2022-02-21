public class Main {
  public static void main(String[] args) {
    CardGame myGame = new CardGame("Addison");
    myGame.greeting();
    System.out.println("My health: " + myGame.getHealth());
    myGame.setHealth(1000);
    System.out.println("My health: " + myGame.getHealth());
  }
}

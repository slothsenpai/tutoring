public class CardGame {
  private int health = 100;
  private int ascencionLevel = 1;
  private float damageMultiplier = 1.5f * ascencionLevel;
  private String name = "";

  // Constructor method
  public CardGame(String providedName) {
    name = providedName;
  }

  public void greeting() {
    System.out.println("Hello there " + name.toUpperCase());
    secretGreeting();
  }

  private void secretGreeting() {
    System.out.println("Greetings, but in secret");
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int newHealth) {
    health = newHealth;
  }

  public int getAscencionLevel() {
    return ascencionLevel;
  }

  public void setAscencionLevel(int ascencionLevel) {
    this.ascencionLevel = ascencionLevel;
  }

  public float getDamageMultiplier() {
    return damageMultiplier;
  }

  public void setDamageMultiplier(float damageMultiplier) {
    this.damageMultiplier = damageMultiplier;
  }


}

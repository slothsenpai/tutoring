public class Types {
  public static void main(String[] args) {
    // Integer Types
    byte byteVar = (byte) 0;
    char charVar = 'A';
    short shortVar = (short) 0;
    int intVar = 0;
    long longVar = 0L;
    
    // Floating-point types
    float floatVar = 0.0f;
    double doubleVar = 0.0;

    System.out.println("Size of byte in bytes: " + Byte.BYTES);
    System.out.println("Size of char in bytes: " + Character.BYTES);
    System.out.println("Value of char as int: " + (int) charVar);
    System.out.println("Size of short in bytes: " + Short.BYTES);
    System.out.println("Size of int in bytes: " + Integer.BYTES);
    System.out.println("Size of long in bytes: " + Long.BYTES);
    System.out.println("==============");
    System.out.println("Size of float in bytes: " + Float.BYTES);
    System.out.println("Size of double in bytes: " + Double.BYTES);

    // Conversion
    // short result1 = intVar + shortVar;
    int result2 = intVar + shortVar;
    long result3 = intVar + 3L;
    double result4 = 1.0f + 2.0f;
  }
}

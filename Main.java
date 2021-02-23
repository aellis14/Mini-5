public class Main {
   public static void main(String[] args) {
    saySorry(10);
  }

  // Create a checkAge() method with an integer variable called age
  static void checkAge(int age) {

    // If age is less than 18, print "access denied"
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");

    // If age is greater than, or equal to, 18, print "access granted"
    } else {
      System.out.println("Access granted - You are old enough!");
    }

  }

    checkAge(20); // Call the checkAge method and pass along an age of 20

// Outputs "Access granted - You are old enough!"
  public static void saySorry(int n) {
    if(n == 0) {
      System.out.println("Done!");
    } else {
       System.out.println("sorry");
       n--;
       sayJump(n);
    }
  }
}
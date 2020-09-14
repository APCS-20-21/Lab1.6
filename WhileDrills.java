/**
 *  Do not use any of these methods to solve other methods.
 *  Do not create any other methods to solve these methods.
 *  Do not change the method headers (return type, name, parameters) of these methods.
 *  Do not delete the comments from the starter code
 *
 *  Remember: Comments describe the method that comes after them.
 */
public class WhileDrills
{
  /** The starting point of this program.
   *
   *  Write code here to test the methods you write.
   *
   *  @param String[] args Commandline arguments.
   */
  public static void main(String[] args)
  {
    // You need to test your work! Follow this example of how to test a method:

    // This statement invokes the hello method and stores its response in the answer variable
    int answer = countDigits(705);

    // This statement outputs the value of the answer variable to the console
    System.out.println( answer );
  }

  /**  Count how many times the letter A occurs in str
   *
   *   Examples:
   *    countA("TACOS") -> 1
   *    countA("ALPHABET") -> 2
   *    countA("COMPUTER SCIENCE!") -> 0
   *
   *   @param String str The target string
   *   @return int how many A's are in str
   *
   *  Precondition: str is upper case
   */
  public static int countA(String str)
  {
    return -1;
  }

  /**  Identify if there are any occurances of the letter A in str
   *
   *   Examples:
   *    anyA("TACOS") -> true
   *    anyA("ALPHABET") -> true
   *    anyA("COMPUTER SCIENCE!") -> false
   *
   *   @param String str The target string
   *   @return boolean true if there is at least 1 A in str
   *
   *  Precondition: str is upper case
   */
  public static boolean anyA(String str)
  {
    return false;
  }

  /**  Identify if there are no occurances of the letter A in str
   *
   *   Examples:
   *    noA("TACOS") -> false
   *    noA("ALPHABET") -> false
   *    noA("COMPUTER SCIENCE!") -> true
   *
   *   @param String str The target string
   *   @return boolean true if there are no A's in str
   *
   *  Precondition: str is upper case
   */
  public static boolean noA(String str)
  {
    return false;
  }

  /**  Count how many times the specified letter occurs in str
   *
   *   Examples:
   *    countLetter("BANANA", "N") -> 2
   *    countLetter("BANANA", "B") -> 1
   *    countLetter("COMPUTER SCIENCE!", "E") -> 3
   *
   *   @param String str The target string
   *   @param String letter The letter to count in str
   *   @return int how many A's are in str
   *
   *  Precondition: str is upper case, letter is upper case, and letter.length() == 1
   */
  public static int countLetter(String str, String letter)
  {
    return -1;
  }

  /**  Reverse the order of the letters in str
   *
   *   Examples:
   *    reverseLetters("BANANA") -> "ANANAB
   *    reverseLetters("TACOS") -> "SOCAT"
   *    reverseLetters("COMPUTER SCIENCE!) -> "!ECNEICS RETUPMOC"
   *
   *   @param String str The string to reverse
   *   @return String the value of str with the letters in the opposite order
   */
  public static String reverseLetters(String str)
  {
    return null;
  }

  /**  Remove all occurances of letter in str
   *
   *   Examples:
   *    removeLetter("BANANA", "N") -> "BAAA"
   *    removeLetter("BANANA", "A") -> "BNN"
   *    removeLetterremoveLetter("COMPUTER SCIENCE!", "E") -> "COMPUTR SCINC!"
   *
   *   @param String str The target string
   *   @param String letter The letter to remove from str
   *   @return String the value of str with all the specified letters removed
   *
   *  Precondition: str is upper case, letter is upper case, and letter.length() == 1
   */
  public static String removeLetter(String str, String letter)
  {
    return null;
  }

  /**  Replace all occurances of the specified letter in str with replacement
   *
   *   Examples:
   *    replaceLetter("BANANA", "A", "@") -> "B@N@N@"
   *    replaceLetter("BANANA", "N" "#") -> "BA#A#A"
   *    replaceLetter("COMPUTER SCIENCE!", "E", "*") -> "COMPUT*R SCI*NC*!"
   *
   *   @param String str The target string
   *   @param String letter The letter to replace
   *   @param String replacement The letter to replace A's with
   *   @return String the value of str with all specified letters replaced with the specified replacement
   *
   *  Precondition: str is upper case, replacement is upper case
   */
  public static String replaceLetter(String str, String letter, String replacement)
  {
    return null;
  }

  /**  Count how many digits are in a number
   *
   *   Examples:
   *    countDigits(2468) => 4
   *    countDigits(-369) => 3
   *    countDigits(7) => 1
   *
   *   @param int num The number to count the digits of
   *   @return int The number of digits in num
   *
   *  Precondition: num != 0
   */
  public static int countDigits(int num)
  {
    return -1;
  }

  /**  Sum the digits in a number
   *
   *   Examples:
   *    sumDigits(123) => 6
   *    sumDigits(78) => 15
   *
   *   @param int num The number to sum the digits of
   *   @return int The sum of the digits in num
   *
   *  Precondition: num > 0
   */
  public static int sumDigits(int num)
  {
    return -1;
  }

  /**  Calculate the average of the digits in num
   *
   *   To calculate an average you divide the sum by the count
   *    average = sum / count
   *
   *   Examples:
   *    averageDigits(123) => 3.0
   *    averageDigits(78) => 7.5
   *
   *   @param int num The number to calcualte the average of the digits
   *   @return int The average of the digits of num
   *
   *  Precondition: num > 0
   */
  public static double averageDigits(int num)
  {
    return -1;
  }

  /**  Identify if all the digits of num are even
   *
   *   Examples:
   *    allEvenDigits(246) => true
   *    allEvenDigits(234) => false
   *    allEvenDigits(369) => false
   *
   *   @param int num The number to check for even digits
   *   @return boolean true if all digits of num are even
   *
   *  Precondition: num > 0
   */
  public static boolean allEvenDigits(int num)
  {
    return false;
  }

  /**  Identify if any of the digits of num are even
   *
   *   Examples:
   *    anyEvenDigits(246) => true
   *    anyEvenDigits(234) => true
   *    anyEvenDigits(369) => false
   *
   *   @param int num The number to check for even digits
   *   @return boolean true if any digits of num are even
   *
   *  Precondition: num > 0
   */
  public static boolean anyEvenDigits(int num)
  {
    return false;
  }

  /**  Reverse the order of the digits
   *
   *   Examples:
   *    reverseDigits(246) => 642
   *    reverseDigits(234) => 432
   *    reverseDigits(5) => 5
   *
   *   @param int num The number to reverse
   *   @return int the reversed version of num
   *
   *  Precondition: num > 0
   */
  public static int reverseDigits(int num)
  {
    return -1;
  }

}

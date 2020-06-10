# Lab 1.6 WhileDrills

## Instructions

Complete each of the methods in WhileDrills.java so that they do what their comments say they should do.

Write code in the main method to test your methods as you complete them. It is recommended that you write one method, test it, fix it, then move on to another method.

You will be using while loops, if-statements, String methods, and math operations to solve these problems.

```
while( condition )
{
  // do something while condition is true
}
```

```
if( condition )
{
  // do something if condition is true
}
else
{
  // do something if condition is false
}
```

Your code must meet the following restrictions:

*  Do not use any of these methods to solve other methods.
*  Do not create any other methods to solve these methods.
*  Do not change the method headers (return type, name, parameters) of these methods.
*  Do not delete the comments from the starter code

Remember that comments describe the method that comes after them.

If you get stuck, there are hints for each method at the end of this document.

## Testing

You need to test your work! Follow this example of how to test a method:

This statement invokes the hello method and stores its response in the answer variable

```
int answer = countDigits(705);   // invoke the isEven method and stores its response in the answer variable
System.out.println( answer );   // output the value of the answer variable to the console
```

You should write code in the main method to test each method as you write it. Follow this pattern:

* Call the method you want to test and store its return value in a variable
* Use System.out.println to output that variable

Note: Make sure you declare the variable correctly. Its type should match the return type of the method.

If you are getting compile errors for your test code in this method then check these things:

* Did you write the method name correctly? Try copying and pasting the method name from the method header.
* Are the arguments you are passing to the method correct? Look at how many parameters the method has and the types of those variables.
* Is the type of your answer variable correct? Look at the return type of the method, this should match the type of your answer variable.

## Grading

You must *correctly complete at least 8* of these methods to pass this lab. If you correctly complete *all* of these methods, then you will earn 1 Above & Beyond point.

These methods will be tested by checking their output against several test cases. If you method fails any of those test cases it will be deemed *incorrect*.

## Turning it in

When you have finished this lab, upload it to [MrMayCS.com/turnitin](http://mrmaycs.com/turnitin)

## Hints

Try to solve these methods on your own before looking at the hints.

### int countA(String str)

To solve all these String methods you want to isolate and remove the first character of the String until there are no more characters to remove. Each character you isolate, you can check if that character is an A or not.

* How do you isolate a single character from a String?
* How do you remove a single character from a String?
* How do you check to see if the character you isolated is an A or not?
* How will you keep track of how many A's you have identified?
* What condition do you want your while loop to check so it stops looping when there are no more characters to isolate and remove?

### boolean anyA(String str)

This is similar to the countA method, but instead of counting how many A's there are, you only need to identify if there is at least one A.

At what point in your countA code do you know that there is at least one A in the string?

### boolean noA(String str)

How many characters of the string do you have to look at before you can be sure that there are no A's in the string?

### int countLetter(String str, String letter)

This is the same as countA, except you are counting *letter*'s instead of A's


### String reverseLetters(String str)

This is a Frankenstein problem. You need to build a new string that has all the same letters as str, except you want them in the opposite order.

You need to keep track of your answer, which will start as the empty string. Then as you iterate over each letter in str, you will add it to the BEGINNING of your answer.

Consider reversing the string "TACOS". The loop will iterate over the letters in the order "T", "A", "C", "O", and "S". Each time the loop iterates over a character we want to add the character to the BEGINNING of our answer. So the answer will look like this: (remember, it starts as the empty string before the loop begins)

""
"T"
"AT"
"CAT"
"OCAT"
"SOCAT"

Then, when the loop ends because there are no more letters in str, you are left with an answer that has all the letters from str in reverse order!

### String removeLetter(String str, String letter)

This is a Frankenstein problem. You need to build a new string that has all the same letters as str, except any of the specified letter.

Consider removing the letter A from the String "BANANA". We want to build up our answer one letter at a time.

The answer starts as the empty string. Then we loop over each letter of the string, one at a time.

The first loop iteration will see the letter B, so we will put the letter B into our answer.
The second loop iteration will see the letter A. Since we are removing A's, we will do nothing to our answer.
The third loop iteration will see the letter N, so we will put the letter N into out answer, making it "BN"
The fourth loop iteration will see the letter A. Since we are removing A's, we will do nothing to our answer.
The third loop iteration will see the letter N, so we will put the letter N into out answer, making it "BNN"
The fourth loop iteration will see the letter A. Since we are removing A's, we will do nothing to our answer.

Once the loop has completed (because we have looked at every letter of the original string), the final result is "BNN"

### String replaceLetter(String str, String letter, String replacement)

This is the same as removeLetter, except instead of doing nothing when you encounter a *letter* in str, you add *replacement* to your answer instead.

### int countDigits(int num)

You can solve this in a similar fashion to the string methods you solved above, however you need to use math to isolate and remove digits from a number.

* How do you isolate the ones digit from a number? (How do you make 1234 become 4)
* How do you remove the ones digit from a number? (How do you make 1234 becomes 123)
* What condition should you check to identify that there are no more digits in a number (Hint: the precondition is that num != 0)

### int sumDigits(int num)

This is the same as countDigits except you are adding the values of the digits to your answer rather than just counting each digit as 1.

### double averageDigits(int num)

This is a combination of countDigits and sumDigits. You can solve this with just one loop!

Note: Be wary of the types of your variables! This method wants to return a double!

### boolean allEvenDigits(int num)

This is similar to countDigits and sumDigits, except you are only counting digits that are even.

How can you identify whether a number is even or not?

### boolean anyEvenDigits(int num)

This is similar to countDigits, except you are only counting even digits.

### int reverseDigits(int num)

This is similar to reverseString, except you are doing it with numbers! You have to "make room" for each digit as you add it to the ones place. Consider adding the digit 4 to the beginning of the number 123.

You want to end up with 1234, not 127, so you need to change 123 into 1230 before adding the 4 to get 1234.

123 and 4 -> 1230 + 4 -> 1234

How do you change 123 into 1230?

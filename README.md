# Valid-Parentheses
Code Overview:
Class Solution:

Contains the method isValid(String s), which checks if a given string of parentheses is valid.
Method isValid:

This method uses a stack to ensure that every opening parenthesis has a corresponding closing one in the correct order.
It iterates over the characters in the string:
If the character is an opening bracket ((, {, [), it is pushed onto the stack.
If the character is a closing bracket (), }, ]), it checks if the stack is empty or if the top of the stack does not match the corresponding opening bracket.
At the end of the iteration, the stack should be empty for the string to be valid. If there are any unmatched opening brackets left in the stack, the method returns false.
Class Main:

This is the main class where program execution begins. The main method creates an instance of the Solution class and calls the isValid method with a test string.
Code Flow:
Input: The string "({[]})".
Output:
If the parentheses are correctly matched and nested, the program prints: The string has valid parentheses.
If the string is not valid, it prints: The string does not have valid parentheses.
Example of Valid Strings:
"()", "{}", "{[]}", "({[]})"
Example of Invalid Strings:
"(]", "([)]", "{", "(){"
Stack Behavior:
Opening brackets are pushed onto the stack.
Closing brackets are popped from the stack, and the program checks if they match the most recent opening bracket.
If the stack is empty at the end, the parentheses are valid; otherwise, they are not.

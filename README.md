# Debug Workshop
Code Workshop for debugging

## The Problem
You are given 4 different folders each containing some buggy code. In each of these folders, you'll find a main function which contains a test case that contains some error(s). Below is a list of each folder, along with an explanation of what each does. I would recommend solving them top to bottom using the built in IntelliJ debugger.
## Palindrome
Checks if a given string is a Palindrome. A palindrome is a string which is the same in reverse. For example:
* hannah
* racecar
* noon  
## Frequency
Returns the most common char found in a string. For example, "aaa1bc" should return 'a' as the most common char since it appears three times. If the string is null or "", the method should return '-'.
## FrameFactory
Builds string frames of nxn. For example, the frame 3x3 is:  
\###  
\#&nbsp;&nbsp;#  
\###  
## DoggyDaycare
A piece of software written for a dog daycare. This daycare has 5 play pens, where each pen can have 10 dogs. Each dog has a name, age, and an enemy. If a dog ends up in the same pen as its enemy, it will fight that dog. This must be avoided to prevent your daycare from shutting down. When the owner of a dog wants to collect their dog, they can give you the name of that dog, and you should then remove it from its pen and return it to the owner. This software attempts to prevent two dogs from fighting by placing them in different pens, as well as handling the returning of that dog to the owner.
## General Advice
For these problems, do not attempt to redevelop the methods. Your job is to debug the code, not create a better implementation. Each of these problems, except DoggyDaycare, have only one or two issues. Some of the issues found in these methods are not covered by the example code provided.

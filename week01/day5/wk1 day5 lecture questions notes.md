(int a = (b = (c = 2))); // assignment is rt-to-lf

operators of equal precedence go lf-to-rt normally
(a * b) + (c * d) + e

32 bits has 32 0's same with long 64 and byte 8 ?
000000000000000000000000000000000000011 int of 3
                                         always 
                                         still takes
     32 bits of memory space 

long will always take 64 bits of memory space even if it is storing a small value like 1 or 3
0000000000000000000000000000000000000000000000000000000000000000000000000000000000000011

so you do that to avoid allocating new memory every time the variable is called, replaced, renamed, etc? as long as the value is stored somewhere in the stack or heap, it will be just pointed to?

The important fact to remember:
- If you are passing around a memory address "reference"
    if you mutate the copy the original will change

- If you pass by value
    if you change the copy the original will not change

Learn how C works to understand how Java works 
   "high level" or "strongly typed" or "object oriented"

(Note C++ is an oop version of C if you are looking how Java and C are differnt)

TODO look up history of programming links from Sean


# StringCompressor
Description:
Scala object to compress a string for some characters, which are not less than minimum occurrence provided as input parameter, in serial as a substring in the string.

# Assumptions:
1. If there are no repetetive characters in the input string, not assigning any number to the characters as that would increase the string    length.
   eg: input string "abcde" is converted as "abcde" only instead of "1a1b1c1d1e"
2. If the 'minOccurrency' is less than or equal to 1, not assigning any number to the characters.
   eg: input ("asdf", 1) is compressed as "asdf" instead of "1a1s1d1f"
3. Allowed numerics and special characters as part of input string.
4. Space in the input string not handled as part of this code.
5. Case sensitivity of the string not handled as part of this code

# Getting Started:

Place the code directly into any Scala IDE by creating the scala object StringCompressor or copy the compressStr function to the scala REPL.

# Running the tests:

REPL: invoke the function by compressStr("message", minOccurrency) eg: compressStr("abbbccdd", 2).

IDE: Run the scala object by providing a string followed by a numeric as program arguments in run configuration.

# Unit test results:

input: abcdef 1
output: abcdef

input: abc 0
output: abc

input: QQQFAAABEEEDFFC 2
output: 3QF3AB3ED2FC

input: ABBBBCCCDDDDD 4
output: A4BCCC5D

input: QQQFAAABEEEDFFC1234135(*)))))))))))))))))))))))))))))))))))))))))))))))))))))@^*&^!#!((#*)24335ADFADFA  1   
output: 3QF3AB3ED2FC1234135(*53)@^*&^!#!2(#*)24235ADFADFA

input: Thisisanexampleofthe"Removespaces"facility.Itremovesspacesbetweenwordsaswellasattheendofsentenceoranywherethatthereisanyspaceatall.IntheOutputwindowyouwillseethisInputappearwithnospacesatall. 2

output:
ThisisanexampleoftheRemovespacesfacility.Itremove2spacesbetw2enwordsaswe2lasa2th2endofsentenceoranywheretha2thereisanyspaceata2l.IntheOutputwindowyouwi2ls2ethisInputa2pearwithnospacesata2l.

input:
aaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbdddddddddddddddddddddddeeeeeeeeeeeeeeeeeeessssssssssssssssssssssskkkkkkkkkkkkkkkkkkkkeeeeeeeeeeewqqqqqqqqqqqqqqeioiiiiiiiiiiiiiiiiiaaaaaaaaaappppppppppppppppccccccccccccccccccccccqqqqq7777777777777779000000MMMMMMMMMMEEEEEEEEEEEEEEEEEEEEEEEEEllllllllllllllllll))))))))))))))))))))))&&&&&&&&&&&&&&&&&&&&JJJJJJJJJJJJJJJJJJJJJJJJJDDDDDDDDDDLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll 8

output:
22a15b23d19e23s20k11ew14qeio17i10a16p22cqqqqq157900000010M25E18l22)20&25J10D36L140l

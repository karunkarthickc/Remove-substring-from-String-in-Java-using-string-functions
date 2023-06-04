# Remove-substring-from-String-in-Java-using-string-functions
In this program i have traversed the substring and replaced the character in the string by replace method the char is not accepted in replace method so i have converted char into string and removed the substring char from a string.
the replace method either takes a pair of char's or a pair of CharSequence's (of which String is a subclass, so it'll happily take a pair of String's). The replace method will replace all occurrences of a char or CharSequence.
On the other hand, the first String arguments of replaceFirst and replaceAll are regular expressions.

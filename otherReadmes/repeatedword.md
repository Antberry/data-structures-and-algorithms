# Repeated Word

## Challenge
Find the first word that repeats itself.

## Approach & Efficiency
Big O is (n log n), going through the array everytime to see if a word matches another word in the array.

## API

### Repeated word
I implemented an method where i took in a string and then lowercased the whole string.
I then split the string into an array of strings.
I then loop inside a loop to match the first word[i] to the words[j] to see if its the same.
If so I saved the string in a variable then returned it.

[Link to Code](https://github.com/Antberry/data-structures-and-algorithms/blob/master/401codechallenges/src/main/java/repeatedword/RepeatedWord.java)

[Link to Test](https://github.com/Antberry/data-structures-and-algorithms/blob/master/401codechallenges/src/test/java/repeatedword/RepeatedWordTest.java)

[Whiteboard](https://github.com/Antberry/data-structures-and-algorithms/blob/master/assets/repeatedword.jpg)

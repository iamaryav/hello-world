'''
design base algo
improve your algo for time and space complexity
while improving think in a data structure way which one you will use

start coding
Maintain coding standards
code for edge case also

Example:

Tact Coa

palindrome, permutation, no need of dictionary words


find all the permutation of the word
if any permutation is palindrome
Then string is permutation palindrome



Generate permutation 1 by one
if you find that if this permutation is palindrome 
Then string is permutation palindrome


What are the characterics of the Palindrome
can this string be written in palidrome
what are the characterics of palindrome
we need to have almost all words in even number
at most one character can have odd count

String with even length must have all even count letters
And string with odd length can have atmost one odd count letter

same no of words


Alog 1:

create frequency of each character in the word
and check word doesn't have more than one odd cound character

Time complexity: O(n)
Space complexity: O(1) 

Algo 2:

List of size 26 contains the integer
    Map > Array/List > Integer > Bit Vector
    can improve the size by using bit vector

looping through size of string



'''
# First Alog Solution

def isPalidromePermutation(word: str) -> bool:
    return calculateWordFrequency(word)

def calculateWordFrequency(word: str) -> list:
    word = word.lower()
    word = word.replace(" ", "")
    frequencyList = [0] * (ord("z") - ord("a") + 1)
    countMaxOdd = 0

    for char in word:
        index = ord(char) - ord('a') + 1
        frequencyList[index] += 1
        if(frequencyList[index] % 2 == 1):
            countMaxOdd += 1
        else:
            countMaxOdd -= 1

    return countMaxOdd <= 1 

###

# Second Solution

def isPalindromePermutationBitVector(word: str) -> bool:
    return calculateFrequencyBitVector(word)

def calculateFrequencyBitVector(word: str) -> bool:
    word = word.lower()
    word = word.replace(" ", "")

    frequencyVector = 0

    for char in word:
        index = (ord(char) - ord('a') + 1)
        frquencyChar = 1 << (ord(char) - ord('a'))
        frequencyVector ^= frquencyChar
        # print(f"Char: {char} -> {index:03d} -> {index:032b} -> {frquencyChar:032b}")
    
    # print(f"{frequencyVector} -> {frequencyVector:032b}")
    return (frequencyVector & (frequencyVector - 1)) == 0


if __name__ == "__main__":
    print(isPalidromePermutation("Tact Coa"))
    print(isPalidromePermutation("carrace"))
    print(isPalidromePermutation("windmill"))
    
    print(isPalindromePermutationBitVector("Tact Coa"))
    print(isPalindromePermutationBitVector("carrace"))
    print(isPalindromePermutationBitVector("windmill"))




def isPermutation(word: str, pWord: str) -> bool:
    word1 = [0] * 128

    for char in word:
        word1[ord(char)] += 1

    for char in pWord:
        index = ord(char)
        word1[index] -= 1
        if word1[index] < 0:
            return False 

    for i in range(0, 128):
        if word1[i] >= 1:
            return False
    
    return True

if __name__ == '__main__':
    print(isPermutation("abcde", "edabc"))
    print(isPermutation("abacde", "aedabc"))
    print(isPermutation("abcdefgh", "abcdefgh"))
    print(isPermutation("abbclcde", "laedcbcb"))
    print(isPermutation("abcde", "abcde"))
    print(isPermutation("abcdef", "abcdef"))
    print(isPermutation("abcde", "abcd"))
    print(isPermutation("aaaaa", "aaaaa"))
    print(isPermutation("course", "sercous"))
    print(isPermutation("dog", "god"))
    print(isPermutation("dog", "god  "))
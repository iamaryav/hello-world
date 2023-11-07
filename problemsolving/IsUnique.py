def isUnique(string: str) -> bool:
    if len(string) > 128:
        return False
    charPresent = [None] * 128
    for i in range(0, len(string)):
        if charPresent[ord(string[i])]:
            return False
        charPresent[ord(string[i])] = True
    return True 

def isUniqueWithBitArray(string: str) -> bool:
    # Assumption all string value must be smallcase alphabet only
    bitArray = 0
    for val in string:
        x = 1 << ord(val) - ord('a')
        if(bitArray & x) > 0:
            return False
        bitArray |= x
    return True
        
if __name__ == '__main__':
    print ("Result with isUnique function: ") 
    print(isUnique("abcdefghijkl"))
    print(isUnique("abcdefghijkla"))
    print(isUnique("abcdefghiijkl"))
    print(isUnique("zxuvwqrst"))
    print(isUnique("abcdefghijkll"))
    print(isUnique("aabcdefghijkl"))
    print("Results with isUniqueWithBitArray function: ")
    print(isUniqueWithBitArray("abcdefghijkl"))
    print(isUniqueWithBitArray("abcdefghijkla"))
    print(isUniqueWithBitArray("abcdefghiijkl"))
    print(isUniqueWithBitArray("zxuvwqrst"))
    print(isUniqueWithBitArray("abcdefghijkll"))
    print(isUniqueWithBitArray("aabcdefghijkl"))

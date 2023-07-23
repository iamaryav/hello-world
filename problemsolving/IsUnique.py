def isUnique(string: str) -> str:
    if len(string) > 128:
        return False:
    charPresent = [None] * 128
    for i in range(0, len(string)):
        if charPresent[ord(string[i])]:
            return False
        charPresent[ord(string[i])] = True
    return True 

if __name__ == '__main__':
    print(isUnique("abcdefghijkl"))
    print(isUnique("abcdefghijkla"))
    print(isUnique("abcdefghiijkl"))
    print(isUnique("zxuvwqrst"))
    print(isUnique("abcdefghijkll"))
    print(isUnique("aabcdefghijkl"))
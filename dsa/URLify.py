def urlify(string : str, length : int) -> str:
    listOfWords = string.rstrip().split(" ")
    formattedString = "%20".join(listOfWords)
    return formattedString

if __name__ == '__main__':
    print(urlify("Mr john Smith", 13))
    print(urlify("hi  hihi h   ", 9))
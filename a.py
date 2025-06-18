t = int(input())
test_cases = []

for _ in range(t):
    curTemp, a, b, x, y = list(map(int, input().split()))
    res = 0
    if x > y:
        a, b = b, a
        x, y = y, x
    while curTemp >= a:
        curTemp -= x
        res += 1
    while curTemp >= b:
        curTemp -= y
        res += 1
    print(res)



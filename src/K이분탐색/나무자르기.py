import sys
input = sys.stdin.readline

n, m = [int(v) for v in input().split()]
tree = list(map(int, input().split()))

start, end = 0, max(tree)

while start< end:
    mid = (start+end)// 2

    cut = 0
    for i in tree:
        if i > mid:
            cut += i - mid
    
    if cut < m:
        end = mid
    else:
        start = mid + 1

print(start - 1)
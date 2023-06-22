import sys
input = sys.stdin.readline

n = int(input())
n_list = [0] * n
for i in range(n):
    n_list[i] = int(input())

result = 0
stack= []
for i in n_list:
    # print(stack, result)
    while stack and stack[-1] < i:
        stack.pop()
        result += 1
    stack.append(i)

    if len(stack):
        result += len(stack)- 1

print(result)



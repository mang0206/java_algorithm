import sys
input = sys.stdin.readline

n = int(input())
n_list = [0] * n
for i in range(n):
    n_list[i] = int(input())

result = n-1
for i in range(n-2):
    stack = []
    stack.append(n_list[i])
    stack.append(n_list[i+1])
    idx = i+2
    while(idx < n):
        if(stack[0] < stack[-1]):
            break
        if(n_list[idx] >= stack[-1]):
            # print(stack)
            result += 1
        stack.append(n_list[idx])
        idx += 1

print(result)



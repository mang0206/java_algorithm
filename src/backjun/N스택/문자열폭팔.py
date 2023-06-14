string = input()
boam = input()
l = len(boam)
stack = []
for s in string:
    stack.append(s)

    if len(stack) >= l and "".join(stack[-l:]) == boam:
        for _ in range(l):
            stack.pop()

if len(stack):
    print("".join(stack))
else:
    print("FRULA")
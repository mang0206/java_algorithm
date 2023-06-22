from collections import deque

n = int(input())
t = int(input())

graph = [[] for _ in range(n+1)]

for _ in range(t):
    s, e = map(int, input().split())
    graph[s].append(e)
    graph[e].append(s)

visited = [False] * (n+1)

q = deque([1])

result = 0
while q:
    node = q.popleft()

    visited[node] = True

    for g in graph[node]:
        if not visited[g]:
            visited[g] = True
            result += 1
            q.append(g)
            
print(result)


# Quesiton: 1584
# Minimum spanning tree - Prims algorithm

class Solution:
    def minCostConnectPoints(self, points: List[List[int]]) -> int:
        # Adj list - key - vertex - distance with all other vertex
        # MST

        # Adj list
        N = len(points)
        adj = {i : [] for i in range(N)}
        for i in range(N):
            x1, y1 = points[i]
            for j in range(i + 1, N):
                x2, y2 = points[j]
                dist = abs(x1 - x2) + abs(y1 - y2)
                adj[i].append([dist, j])
                adj[j].append([dist, i])
        
        # Prims algo
        res = 0
        visited = set()
        minHeap = [[0, 0]]
        while len(visited) < N:
            wei, ver = heapq.heappop(minHeap)
            if ver in visited:
                continue
            res += wei
            visited.add(ver)
            for neiWeight, nei in adj[ver]:
                if nei not in visited:
                    heapq.heappush(minHeap, [neiWeight, nei])
        
        return res

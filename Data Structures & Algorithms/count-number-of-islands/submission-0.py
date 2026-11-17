from collections import deque

class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if grid is None:
            return 0 

        rows, cols = len(grid), len(grid[0])
        islands = 0 
        visit = set()

        def bfs(r,c):

            q = collections.deque()
                        #up.   #down     right.  down
            directions = [[1,0], [-1,0], [0,1], [0,-1]]
            visit.add((r,c))
            q.append((r,c))

            while q:
                curr_row, curr_col = q.popleft()

                for dr, dc in directions:
                    row, col = curr_row+dr, curr_col+dc 
                    if (row in range(rows) and col in range(cols) and (row,col) not in visit and grid[row][col] == "1"):
                        q.append((row, col))
                        visit.add((row, col))

        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == "1" and (r,c) not in visit: 
                    bfs(r,c)
                    islands += 1

        return islands
                    


from collections import deque

class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if grid is None:
            return 0 
        islands = 0
        visit = set()
        rowlen, collen = len(grid), len(grid[0])

        def bfs(r,c):
            q = collections.deque()
            visit.add((r,c))
            q.append((r,c))

            while q: 
                first_row, first_col = q.popleft()
                directions = [[0,-1], [1,0],[0, 1], [-1,0]]

                for dr, dc in directions:
                    curr_row, curr_col = first_row+dr, first_col+dc

                    if (curr_row in range(rowlen) and curr_col in range(collen) and grid[curr_row][curr_col] == "1" and (curr_row, curr_col) not in visit):
                        q.append((curr_row,curr_col))
                        visit.add((curr_row,curr_col))


        for row in range(rowlen):
            for col in range(collen):
                if grid[row][col] == "1" and (row, col) not in visit:
                    bfs(row, col)
                    islands +=1
        return islands

        

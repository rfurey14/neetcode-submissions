from collections import deque
class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        if grid is None:
            return 0 
        visit = set()
        maxArea = 0 

        rowlen, collen = len(grid), len(grid[0])
        def bfs(r,c):
            currArea = 1
            q = deque()
            q.append((r,c))
            visit.add((r,c))
            directions = [[0,-1],[1,0], [0,1],[-1,0]]
            while q:
                curr_row, curr_col = q.popleft()
                
                for dr, dc in directions:
                    row, col = dr+curr_row, dc+ curr_col 
                    if (row in range(rowlen) and col in range(collen) and grid[row][col] == 1 and (row, col) not in visit):
                        currArea +=1
                        q.append((row,col))
                        visit.add((row,col))
            return currArea


        
        for current_row in range(rowlen):
            for current_col in range(collen):
                if grid[current_row][current_col] == 1 and (current_row, current_col) not in visit:
                   maxArea =  max(maxArea, bfs(current_row, current_col))
        return maxArea
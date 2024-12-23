## Problem Description  

Given an `m x n` grid where each cell can have one of the following values:  
- `0`: representing an empty cell,  
- `1`: representing a fresh orange,  
- `2`: representing a rotten orange.  

Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.  

The task is to determine the **minimum number of minutes** required until no cell has a fresh orange. If this is not possible, return `-1`.  

---  

### Solution Approach  

The problem is solved using a **Breadth-First Search (BFS)** approach, where we simulate the process of oranges rotting minute by minute.  

---  

### Key Points  

1. **Initialization**:  
   - Traverse the grid to find all initially rotten oranges and count the total number of fresh oranges.  
   - Add the rotten oranges' coordinates to a queue for BFS traversal.  

2. **BFS Simulation**:  
   - Use a queue to process rotten oranges level by level.  
   - For each rotten orange, attempt to rot all adjacent fresh oranges.  
   - Update the grid and decrease the count of fresh oranges.  

3. **Direction Array**:  
   - Use a direction array to simplify checks for the 4-directional neighbors of each cell.  

4. **Edge Cases**:  
   - If there are no fresh oranges initially, return `0`.  
   - After BFS, if there are still fresh oranges left, return `-1`.  

5. **Final Step**:  
   - Return the time elapsed during the BFS traversal, subtracting one since the final increment occurs after all oranges rot.  

---  

### Time and Space Complexity  

- **Time Complexity**: O(m × n), where `m` is the number of rows and `n` is the number of columns. Each cell is visited at most once.  
- **Space Complexity**: O(m × n), for the queue storing coordinates of rotten oranges.  

---  


---  

For a detailed explanation, visit [here](https://leetcode.com/problems/rotting-oranges/).

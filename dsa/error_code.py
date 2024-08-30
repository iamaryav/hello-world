import heapq

def min_projects(errors, P, Q):
    # Convert errors list to a max-heap by negating the values
    max_heap = [-error for error in errors]
    heapq.heapify(max_heap)
    
    projects = 0
    
    while -max_heap[0] > 0:
        # Extract the maximum error value (revert the negation by multiplying by -1)
        max_error = -heapq.heappop(max_heap)
        
        # Increase the project count
        projects += 1
        
        # Decrease the max error by P
        max_error -= P
        
        # Decrease all other errors by Q
        new_heap = []
        while max_heap:
            current_error = -heapq.heappop(max_heap)
            current_error -= Q
            new_heap.append(-current_error)
        
        # Add the updated max_error back to the heap (if still positive)
        if max_error > 0:
            new_heap.append(-max_error)
        
        # Restore the heap property
        heapq.heapify(new_heap)
        max_heap = new_heap
    
    return projects

# Example Usage
errors = [10, 5, 4]
P = 5
Q = 2

result = min_projects(errors, P, Q)
print("Minimum projects required:", result)

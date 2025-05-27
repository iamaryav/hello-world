# Python3 program for flattening a Linked List

class Node:
    def __init__(self, new_data):
        self.data = new_data
        self.next = None
        self.bottom = None

# Utility function to merge two sorted linked lists 
# using their bottom pointers
def merge(head1, head2):
  
    # A dummy first node to store the result list
    dummy = Node(-1)
    tail = dummy

    # Iterate till either head1 or head2 does not reach None
    while head1 and head2:
        if head1.data <= head2.data:
          
            # Append head1 to the result
            tail.bottom = head1
            head1 = head1.bottom
        else:
          
            # Append head2 to the result
            tail.bottom = head2
            head2 = head2.bottom
        
        # Move tail pointer to the next node
        tail = tail.bottom

    # Append the remaining nodes of the non-null linked list
    if head1:
        tail.bottom = head1
    else:
        tail.bottom = head2
    
    return dummy.bottom

# Function to flatten the linked list
def flatten(root):
  
    # Base Cases
    if root is None or root.next is None:
        return root

    # Recur for next list
    root.next = flatten(root.next)

    # Now merge the current and next list
    root = merge(root, root.next)

    # Return the root
    return root

def printList(head):
    temp = head
    while temp is not None:
        print(temp.data, end=" ")
        temp = temp.bottom
    print()

if __name__ == "__main__":
  
    # Create a hard-coded linked list:
    #     5 -> 10 -> 19 -> 28
    #     |    |     |   
    #     V    V     V    
    #     7    20    22    
    #     |          |    
    #     V          V    
    #     8          50    
    #     |               
    #     V               
    #     30 
    
    head = Node(5)
    head.bottom = Node(7)
    head.bottom.bottom = Node(8)
    head.bottom.bottom.bottom = Node(30)

    head.next = Node(10)
    head.next.bottom = Node(20)

    head.next.next = Node(19)
    head.next.next.bottom = Node(22)
    head.next.next.bottom.bottom = Node(50)

    head.next.next.next = Node(28)

    head = flatten(head)

    printList(head)
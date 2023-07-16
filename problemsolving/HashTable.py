ARRAY_CAPACITY = 50

class Node:
    def __init__(self, key, value):
        self.key = key
        self.value = value
        self.next = None
    
    def __str__(self):
        return "<Node: (%s, %s), next: %s>" % (self.key, self.value, self.next != None)



class HashTable:
    def __init__(self):
       self.capacity = ARRAY_CAPACITY
       self.size = 0
       self.bucket = [None] * self.capacity

    def hash(self, key):
        hashIndex = 0
        for index, obj in enumerate(key):
            hashIndex += ord(obj) 
        hashIndex = hashIndex % self.capacity
        return hashIndex

    def insert(self, key, value):
        # check key and value for null

        index = self.hash(key)
        node = self.bucket[index]

        if node is None:
            self.bucket[index] = Node(key, value)
            self.size += 1
            return
        # Iterated through the node is if not empty
        prev = node
        while node is not None:
            prev = node
            node = node.next

        prev.next = Node(key, value) 
        size += 1
        return

    def find(self, key):
        index = self.hash(key)

        node = self.bucket[index]
        while node is not None and node.key != key:
            node = node.next

        if node is None:
            return None
        else:
            return node.value

    def remove(self, key):
        index = self.hash(key)
        node = self.bucket[index]
        prev = None

        while node is not None and node.key != key:
            prev = node
            node = node.next
        
        if node is None:
            return None
        else:
            self.size -= 1
            result = node.value

            if prev is None:
                self.bucket[index] = node.next
            else:
                prev.next = prev.next.next
            return result


        

if __name__ == '__main__':
    ht = HashTable()
    ht.insert('a', "hello")
    ht.insert('b', "hi")
    ht.insert('c', "test")
    print(ht.size)
    print(str(ht))
    print(ht.find('b'))
    print(ht.remove('c'))
    print(ht.size)
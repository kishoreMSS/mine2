class Node:
    def __init__(self, data):
        self.left = None
        self.right = None
        self.data = data        
    def insert(self, data):
        if self.data:
            if data &lt; self.data:
                if self.left is None:
                    self.left = Node(data)
                else:
                    self.left.insert(data)
                elif data &gt; self.data:
                    if self.right is None:
                        self.right = Node(data)
                        else:
                            self.right.insert(data)
                else:
                    self.data = data
    def PrintTree(self):
        if self.left:
            self.left.PrintTree()
        print(self.data)
        if self.right:
            self.right.PrintTree()
            

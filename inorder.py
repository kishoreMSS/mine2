class Node:
    def __init__(self,data):
        self.left=None
        self.right=None
        self.data=data
    def insert(self,data):
        if self.data:
            if data<self.data:
                if self.left is None:
                    self.left=Node(data)
                else:
                    self.left.insert(data)
            elif data>self.data:
                if self.right is None:
                    self.right=Node(data)
                else:
                    self.right.insert(data)
        else:
            self.data=data
    def PrintTree(self):
        if self.left:
            self.left.PrintTree()
            print(self.data)
        if self.right:
            self.right.PrintTree()
    def postorderTraversal(self,root):
        res=[]
        if root:
            res=self.postorderTraversal(root.left)
            res=res+self.postorderTraversal(root.right)
            res.append(root.data)
        return res
root=Node(12)
root.insert(23)
root.insert(15)
root.insert(24)
root.insert(26)
root.insert(25)
root.insert(16)
print(root.postorderTraversal(root))

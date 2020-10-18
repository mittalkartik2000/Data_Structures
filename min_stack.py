import heapq

class MinStack:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.mins = []
        self.stack = []
        self.mini = int(1e15)
        # print("null", self.stack, self.mins)
        

    def push(self, x: int) -> None:
        self.stack.append(x)        
        self.mini = min(x, self.mini)
        self.mins.append(self.mini)
        # print("null", self.stack, self.mins)
        

    def pop(self) -> None:
        res = self.stack.pop()
        temp = self.mins.pop()
        
        if len(self.stack) <= 0:
            self.mini = int(1e15)
        else:
            self.mini = self.mins[-1]
        
        # print("null", self.stack, self.mins)
        

    def top(self) -> int:
        if len(self.stack) > 0:
            # print(self.stack[-1], self.stack, self.mins)
            return self.stack[-1]
        else:
            # print("null", self.stack, self.mins)
            return None
        

    def getMin(self) -> int:
        # print(self.mini, self.stack, self.mins)
        return self.mini


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()

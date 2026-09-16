class MinStack:

    def __init__(self):
        self.stack = []
        self.minStack = []

    def push(self, val: int) -> None:
        previous_min = val
        if self.minStack:
            previous_min = self.minStack[-1]
            self.minStack.append(min(previous_min, val))
        else:
            self.minStack.append(val)
        self.stack.append(val)
            
    def pop(self) -> None:
        self.stack.pop()
        self.minStack.pop()

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        return self.minStack[-1]
        

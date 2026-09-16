class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        aDict = defaultdict(int)
        for num in nums:
            aDict[num] += 1
        arr = []
        for num, cnt in aDict.items():
            arr.append([cnt, num])
        arr.sort()
        #print(arr)
        ans = []
        while len(ans) < k:
            ans.append(arr.pop()[1])
        return ans


        
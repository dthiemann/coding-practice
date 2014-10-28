'''
Given a sorted array A[0...n], there will be
an element such that A[i] = i. Find this element
'''

myList = [-2,-1,0,1,2,3,4,5,6,8,9,10, 13, 14, 15]

def magicNumber(myList):
    return magicNumberHelper(myList, 0, len(myList))

def magicNumberHelper(myList,start, end):
    if (start >= end):
        return -1
    mid = int((end+start)/2)
    if (myList[mid] == mid):
        return mid
    if myList[mid] < mid:
        return magicNumberHelper(myList, mid+1, end)
    else:
        return magicNumberHelper(myList,start, mid)

print(magicNumber(myList))
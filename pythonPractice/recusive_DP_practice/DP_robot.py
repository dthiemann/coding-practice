'''
Given a sorted array A[0...n], there will be
an element such that A[i] = i. Find this element
'''

import sys

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


myList2 = [1, -2, 3, 10, -4, 7, 2, -5]
F = [None for x in range(0,len(myList2))]

def findMaxSumFromList(myList, helper):
    maxSum = -20
    for i in range(len(myList)):
        if i == 0 or helper[i-1] <= 0:
            helper[i] = myList[i]
        else:
            helper[i] = helper[i-1] + myList[i]
        if helper[i] > maxSum:
            maxSum = helper[i]
    return maxSum

# Minimal change problem

def minimalChange(value, listCoins):
    temp = value
    coinsUsed = 0
    coinToCheck = len(listCoins)-1
    while temp != 0:
        if temp < listCoins[coinToCheck]:
            coinToCheck -= 1
        else:
            temp = temp - listCoins[coinToCheck]
            coinsUsed += 1
    return coinsUsed

#print(minimalChange(15, [1,3,9,10]))

def permutations(word):
    if len(word)<=1:
        return [word]

    #get all permutations of length N-1
    perms=permutations(word[1:])
    char=word[0]
    result=[]
    #iterate over all permutations of length N-1
    for perm in perms:
        #insert the character into every possible location
        for i in range(len(perm)+1):
            result.append(perm[:i] + char + perm[i:])
    return result


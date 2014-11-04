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

def newFunctino():
    x = 0
    while x < 10:
        if x % 2 == 0:
            y = x + 1
            while (y < 11) :
                print("Line 1:", x, y)
                y = y + 4
        else:
            y = 11-x
            while (y > 1) :
                print("Line 2:", x, y)
                y = y - 3
        x = x + 3

def countDecreasing():
    count = 0
    lastInt = 0
    try:
        num = int(input("enter Number: "))
        while num > 0:
            if num < lastInt:
                count += 1
            lastInt = num
            num = int(input("enter Number: "))

    except:
        print("hello")
        pass
    return count


def raise1(n,m):
    loopNum = 0
    r = 1
    nn = n
    while nn > 0:
        r = r*m
        nn = nn - 1
        loopNum += 1
    print("raise1: ", loopNum)
    return r

def raise2(n,m ):
    r = 1
    b = m
    nn = n
    loopNum = 0
    while nn > 0:
        if nn%2 == 0:
            b = b * b
            nn = nn/2
        else:
            r = r * b
            nn = nn - 1
        loopNum += 1
    print("raise2: ", loopNum)
    return r

def countList(L):
    countList = []
    num = 1
    while num < 11:
        countList.append(L.count(num))
        num += 1

    newList = []
    count = 0
    while count < len(countList):
        newList.extend([count + 1 for x in range(0,countList[count])])
        count = count + 1
    return newList
__author__ = 'dylanthiemann'
import sys
import math


# Merge Sort
def mergeSort(A):
    n = len(A)
    if n > 1:
        B = A[0:n//2]
        C = A[(n//2): n]
        mergeSort(B)
        mergeSort(C)
        merge(B,C,A)

def merge(B,C,A):
    i, j, k, p, q = 0, 0, 0, len(B), len(C)
    while i < p and j < q:
        if (B[i] <= C[j]):
            A[k] = B[i]
            i = i + 1
        else:
            A[k] = C[j]
            j = j + 1
        k = k + 1
    if i == p:
        A[k:p+q] = C[j:q]
    else:
        A[k:p+q] = B[i:p]

# Insertion Sort
def insertionSort(A):
    for i in range(len(A)):
        v = A[i]
        j = i - 1
        while j >= 0 and A[j] > v:
            A[j+1] = A[j]
            j = j - 1
        A[j+1] = v

def selectionSort(A):
    for i in range(0,len(A)):
        currentMin = i
        for j in range(i, len(A)):
            if A[j] < A[currentMin]:
                currentMin = j
        temp = A[i]
        A[i] = A[currentMin]
        A[currentMin] = temp

def isPrime(n):
    for i in range(2, int(math.sqrt(n))):
        if n%i == 0:
            return False
    return True



def main():
    myList = [5,2,6,3,1,6,75,7,2,8,3,2]
    mergeSort(myList)
    print("Merge Sort: " + str(myList))

    myList = [5,2,6,3,1,6,75,7,2,8,3,2]
    insertionSort(myList)
    print("Insertion Sort: " + str(myList))

    myList = [5,2,6,3,1,6,75,7,2,8,3,2]
    selectionSort(myList)
    print("Selection Sort: " + str(myList))

    print(isPrime(17))
    print(isPrime(27))

main()
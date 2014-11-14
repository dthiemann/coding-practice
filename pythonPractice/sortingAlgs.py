__author__ = 'dylanthiemann'

# Merge Sort
def MergeSort(A):
    n = len(A)
    if n > 1:
        B = A[0:n//2]
        C = A[(n//2): n]
        MergeSort(B)
        MergeSort(C)
        Merge(B,C,A)

def Merge(B,C,A):
    i = 0
    j = 0
    k = 0
    p = len(B)
    q = len(C)
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
def InsertionSort(A):
    for i in range(len(A)):
        v = A[i]
        j = i - 1
        while j >= 0 and A[j] > v:
            A[j+1] = A[j]
            j = j - 1
        A[j+1] = v
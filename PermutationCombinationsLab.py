from sys import argv
#factorial function
def fact(n):
    if n==0:
        return 1
    else:
        return n * fact(n-1)
#permutation function
def P(n,r):
    return fact (n)/fact (n-r)
#combination function
def C(n,r):
    return P(n,r)/fact(r)
def combGenerator (n,r):
    d=[]
    n = int(argv[1])
    r = int(argv[2])
    #smallest combination
    for k in range(1,r+1):
        d.append(k)
    print (d[0:])
    #the rest of the combination
    for k in range(2,int((C(n,r))+1)):
        max = n
        i = r-1
        while d[i] == max:
            i -= 1
            max -= 1
        d[i] = d[i]+1
        for j in range(i+1,r):
            d[j] = d[j-1]+1
            # print(j)
        print (d[0:])

def permGenerator(n,r):
    e = []
    e.append(42)
    #smallest permutation
    for k in range(1,n+1):
        e.append(k)
    print (e[1:])
    #the rest of the permutation
    for k in range(2, fact(n)+1):
        i=n- 1
        j = n
        while e[i]>e[j]:
            i-=1
            j-=1
        j=n
        while e[i]>e[j]:
            j-=1
        ml = e[i]#swap positions
        e[i]=e[j]
        e[j]=ml

        i+=1
        j=n
        while i < j:
            ml2= e[i]#swap positions
            e[i] = e[j]
            e[j]=ml2
            i+=1
            j-=1
        print(e[1:])
#Main program
if len(argv) != 3:
    print ("Please input the n and r")
#error message if there are no n and r input on argv
#convert argv to int to use number comparisons
else:
    n = int(argv[1])
    r = int(argv[2])
    if int(argv[1])<2:
        print("n must be > or = 2")
    elif int(argv[2])<1:
        print("r must be > or = 1")
    #proceed to combGenerator and PermGenerator functions if all conditions are met
    else:
        print("The combinations are:")
        combGenerator(n,r)
        print("The permutations are:")
        permGenerator(n,r)

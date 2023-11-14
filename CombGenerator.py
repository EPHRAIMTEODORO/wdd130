def fact(n):
    if n==0:
        return 1
    else:
        return n * fact(n-1)
def P(n,r):
    return fact (n)/fact (n-r)
def C(n,r):
    return P(n,r)/fact(r)
Cnr = C(3,1)
Pnr = P(3,1)
nFact = fact(3)
print (Cnr)

d=[]
e = [55]
n = 3
r = 1
for k in range(1,r+1):
    d.append(k)
print (d[0:])
for k in range(2,int(Cnr+1)):
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

#permutation
for k in range(1,n+1):
    e.append(k)
print (e[1:])
for k in range(2, fact(n)+1):
    i=n- 1
    j = n
    while e[i]>e[j]:
        i-=1
        j-=1
    j=n
    while e[i]>e[j]:
        j-=1
    ml = e[i]
    e[i]=e[j]
    e[j]=ml

    i+=1
    j=n
    while i < j:
        ml2= e[i]
        e[i] = e[j]
        e[j]=ml2
        i+=1
        j-=1
    print(e[1:])


import random
'''
nums=[99,125,25,101,102,98,198,199,59,49,22,28,5,15,20]
for i in range (600):
    a=random.choice(nums)
    b=random.randrange(11,99)
    print("%d * %d =   %d"%(a,b,a*b))
'''
nums=[125,25]
for i in range(60):
    a=random.choice(nums)
    b=random.randrange(1,9)
    c=4*b
    print("%d * %d =   %d" % (a, c, a * c))
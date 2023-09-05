def linearsearch(list,key):
    for i in range(len(list)):
        if(list[i]==key):
            return i
    return-1
list=[19,28,43,11,16]
key=16
i=linearsearch(list,key)
if(i<=key):
    print("element is found at index",i);
else:
    print("element is not found");
   

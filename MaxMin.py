import random



def Maxer(array):
    for count in range(len(array)):
        max = 0
        if array[count] > max:
            max = array[count]
        
    return max

def Miner(array):
    for count in range(len(array)):
        min = 0
        if array[count] < min:
            min = array[count]
        
    return min

ranList = [] # Define ranList as an empty list

for i in range(10):
    ranList.append(random.randint(1,10))
    print(ranList)

print("The max number in the array is: " + str(Maxer(ranList)))
print("The min number in the array is: " + str(Miner(ranList)))
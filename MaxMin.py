
'''
---------------------------------------
-- Created by:     Alireza Teimoori  --
-- Created on:     Feb 9 2019        --
-- Created for:    Unit 1-08         --
-- Course Code:    ICS4U             --
-- Teacher Name:   Chris Atkinson    --
---------------------------------------
-- This program generates random     --
-- numbers and add them to array and --
-- find the maximum and minimum in it--
---------------------------------------

In this code, the user can even CHOOSE the length of the list!
'''

import random

def Maxer(array): # Max finder function
    max = array[0] # starts with letting max equal to the first box in the list
    for count in range(len(array)): # repeats for as long as the array goes
        
        if array[count] > max: # checks if it is higher than the previous max
            max = array[count] # if yes, replaces the max with the new number
        #print(max) # To show the replacing process for max
    return max # shoot out max

def Miner(array):
    min = array[0] # starts with letting min equal to the first box in the list
    for count in range(len(array)):
        
        if array[count] < min: # checks if it is higher than the previous min
            min = array[count] # if yes, replaces the min with the new number
            
        #print(min) # To show the replacing process for min
    return min # shoot out min

ranList = [] # Define ranList as an empty list
listLength = input("how long do you want the array to be? \n") # asking for and storing data

for i in range(int(listLength)): # adds as many elements as the user wants
    ranList.append(random.randint(1,99)) # generates random number between 1, 99

# output:
print (ranList)
print ("The max number in the array is: " + str(Maxer(ranList)))
print ("The min number in the array is: " + str(Miner(ranList)))
/*
WAP in C++ or Java for the following:- 

Students of the Department of Mathematics and Mechanics enjoy buying modern devices. Not having much money, they buy new devices rarely but expertly. They trust their friends’ opinion and choose a device of the type that the greatest number of their friends have. If there are several such devices, the students choose the cheapest of them. 

Student Arnav is no exception. He has questioned his six friends and now wants to choose a new device according to the above rule. Note that the friends could buy the same device in different places at different prices, and Arnav can buy this device at the smallest price. The details of the names, devices and cost is to be stored as a node in the linked list.

Input

The input contains descriptions of devices of six friends. Each description is in three lines. You are given the name of a friend in the first line, the name of this friend’s device in the second line, and the price of the device in the third line.

All the words are strings of size from 1 to 20 characters. The friends’ names contain only lowercase English letters, and the names of the devices consist of lowercase English letters and digits. The price is an integer from 1 to 106. Throw an exception/error if the number entered is out of range. The names of the friends may coincide.

Output

In the only line output the name of the device in possession of the greatest number of friends. If there are several such devices, output the name of the cheapest of them. If there are again several such devices, output the name of any of them.  
*/


#include<iostream>
#include<stdlib.h>
#include <map>
#include <climits>

using namespace std;


// One node of linked list
struct student{
    string friendName;
    string DeviceName;
    int cost;
    student *next;  // pointer to next student node of linked list
};

student* createNode(string name, string device, int cost){
    student *newStud = (student*) malloc(sizeof(student));
    newStud->friendName = name;
    newStud->DeviceName = device;
    newStud->cost = cost;
    newStud->next = NULL;
    return newStud;
}

int main(){
    string name, device;
    int cost;
    student *headNode = NULL, *curNode = NULL;
    map <string, int> DevicesFrequency;
    int maxFreq = INT_MIN;
    string maxDevice;

    for(int i = 0; i < 6; i++){
        cin>>name>>device>>cost;
        DevicesFrequency[device]++;   // a map between device name and no. of friends owning it;

        if(DevicesFrequency[device] > maxFreq){
            maxFreq = DevicesFrequency[device];
            maxDevice = device;
        }

        if(NULL == headNode) 
            headNode = curNode = createNode(name, device, cost);  //creating first node;
        else{
            curNode->next = createNode(name, device, cost); //appending to linked list;
            curNode = curNode->next;  //moving forward in linked list
        }
    }
    
    curNode = headNode;
    int minDevCost = INT_MAX;

    //finding the device with min cost
    while(curNode){
        if(curNode->DeviceName == maxDevice && curNode->cost < minDevCost)
            minDevCost = curNode->cost;

        curNode = curNode->next;
    }

    cout<<"Device with minimum cost = "<<minDevCost;
}
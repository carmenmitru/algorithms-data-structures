#include "./header.h"
#include <iostream>
using namespace std;
int main() {
    int elementToFind;
    Node *list = NULL;
    insertInList(list,2);
    insertInList(list,8);
    insertInList(list,3);
    insertInList(list,5);
    //displayListIterative(list);
    displayListRecursive(list);
    cout<< "Length of the list iterative : " << lengthListIterative(list) << "\n";
    cout<< "Length of the list recursive : " << lengthListRecursive(list) << "\n";
    cout<< "Insert element you want to search : ";
    cin >> elementToFind;
    /*if(findElementIterative(list, elementToFind) == true){
        cout<< "I have found element" << "\n";
    }else{
        cout<< "I haven't found element" << "\n";
    }*/
    
    if(findElementRecursive(list, elementToFind) == true){
        cout<< "I have found element" << "\n";
    }else{
        cout<< "I haven't found element" << "\n";
    }
    deleteElementOnPosRecursive(list,2);
    displayListRecursive(list);
    return 0;
}

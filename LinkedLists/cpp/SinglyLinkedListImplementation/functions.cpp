#include<iostream>
#include "header.h"
using namespace std;
void insertInList(Node *&list, int element){
    
    //Create the newNode
    Node  *newNode = new Node;
    newNode->data = element;
    newNode->next = NULL;
    
    if (list == NULL){
        list = newNode;
    }
    else{
        Node *point = list;
        while (point->next != NULL){
            point = point->next;
        }
        point->next = newNode;
        
    }
}
void displayListIterative(Node *list){
    Node *p = list;
    while (p != NULL) {
       cout<< p->data << " ";
        p = p->next;
    }
    cout<<"\n";
}

void displayListRecursive(Node *list){
    Node *p = list;
    if(p == NULL) {
        return;
    }
    cout << p->data << " ";
    displayListRecursive(p->next);
}

int lengthListIterative(Node *list){
    Node *p = list;
    int l = 0;
    while( p != NULL){
        l++;
        p = p->next;
    }
    return l;
}
int lengthListRecursive(Node *list){
    Node *p = list;
    
    if(p == NULL){
        return 0;
    }
    return 1 + lengthListRecursive(p->next);
}
bool findElementIterative(Node *list, int elementToFind){
    Node *p = list;
    while(p != NULL){
        if(p->data ==  elementToFind) return true;
        p = p->next;
    }
    return false;
}
bool findElementRecursive(Node *list, int elementToFind){
    if(list == NULL) return false;
    if(list->data == elementToFind) return true;
    
    return findElementRecursive(list->next, elementToFind);
}
Node* deleteElementOnPosIterative(Node *&list, int pos){
    Node* result = new Node;
    Node* p =  list;
    int l = lengthListIterative(list);
    if(pos > l){
        cout << "K is bigger than the length of the list!! ";
    }else if(pos == 0){
        result = p->next;
    }else{
        for (int i= 1; p!=NULL && i<pos-1; i++)
        {
            p = p->next;
        }
        if (p == NULL || p->next == NULL)
        {
            return NULL;
        }
    }
    
    p->next = p->next->next;
    return list;
    
}
Node* deleteElementOnPosRecursive(Node *&list, int pos){
    if (pos < 1)
        return list;
    
    // If linked list is empty
    if (list == NULL)
        return NULL;
    
    // Base case (head of the list needs to be deleted)
    if (pos == 1)
    {
        Node *res = list->next;
        delete list;
        return res;
    }
    
    list->next = deleteElementOnPosRecursive(list->next, pos-1);
    return list;
}



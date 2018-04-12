#pragma once

//Singly Linked List
struct Node{
    int data;
    Node *next;
};

void insertInList(Node *&list, int element);
void displayListIterative(Node *list);
void displayListRecursive(Node *list);
int  lengthListIterative(Node *list);
int  lengthListRecursive(Node *list);
bool findElementIterative(Node *list, int elementToFind);
bool findElementRecursive(Node *list, int elementToFind);
Node* deleteElementOnPosIterative(Node *&list, int pos);
Node* deleteElementOnPosRecursive(Node *&list, int pos);

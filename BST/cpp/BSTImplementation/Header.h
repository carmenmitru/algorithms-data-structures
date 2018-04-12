#pragma once
// BST

struct Node{
    int data;
    Node *left, *right;
};

Node* makeNode(int val);
void insert(Node *& root, int val);
void buildTree(Node *&root);


void preorder(Node *root);
void inorder(Node *root);
void postorder(Node *root);

Node* search(Node *root, int val);

Node *deleteNode(Node* &root, int val);
void deleteRoot(Node* &root);
void removeGreatest(Node *& root);

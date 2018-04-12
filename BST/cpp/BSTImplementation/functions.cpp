#include"Header.h"
#include<iostream>
using namespace std;
Node* makeNode(int val){
    Node * node = new Node();
    node->data = val;
    node->left = node->right = nullptr;
    return node;
}
void insert(Node *& root, int val){
    if(root == nullptr){
        root = makeNode(val);
    }
    if (val < root->data){
        insert(root->left, val);

    }
    else if (val > root->data){
        insert(root->right, val);
    }
    
}

//Traversal
void inorder(Node *root)
{
    if (root != nullptr)
    {
        inorder(root->left);
        cout << root->data << " ";
        inorder(root->right);
    }
}
void preorder(Node *root){
    if (root == nullptr)
        return;
    cout << root->data << " ";
    preorder(root->left);
    preorder(root->right);
}
void postorder(Node *root){
    if (root == NULL)
        return;
    // left subtree
    postorder(root->left);
    // right subtree
    postorder(root->right);
    cout << root->data << " ";
}

Node* search(Node *root, int val){
    if (root == NULL || root->data == val)
        return root;
    
    if (root->data < val)
        return search(root->right, val);
    
    return search(root->left, val);
}

//Node *deleteNode(Node* &root, int val){
//    if (root == nullptr) return nullptr;
//    
//   
//    if (val < root->data){
//        deleteNode(root->left, val);
//    }
//    else if (val > root->data){
//        deleteNode(root->right, val);
//    }
//    else
//    {
//        // node with only one child or no child
//        if (root->left == nullptr)
//        {
//            Node *temp = root->right;
//            free(root);
//        }
//        else if (root->right == NULL)
//        {
//            Node *temp = root->left;
//            free(root);
//            return temp;
//        }
//        
//    }
//    
//}
void deleteRoot(Node* &root){
    root = nullptr;
    delete root;
}


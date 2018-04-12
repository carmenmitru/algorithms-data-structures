#include "Header.h"
#include <iostream>
using namespace std;
int main() {
    int keyToFound;
    Node *root = new Node();
    insert(root, 10);
    insert(root, 30);
    insert(root, 20);
    insert(root, 40);
    insert(root, 70);
    insert(root, 60);
    insert(root, 80);
    
    cout << "Inorder travelsal " << "\n";
    inorder(root);
    
    cout <<"\n"<<"Postorder travelsal " << "\n";
    postorder(root);
    
    cout <<"\n"<< "Preorder travelsal " << "\n";
    preorder(root);
    
    cout << "Please insert value to search : ";
    cin>>keyToFound;
    Node *nodeFound =  search(root,keyToFound);
    if(nodeFound != nullptr){
        cout<<"Da am gasit";
    }else{
        cout<<"Nu am gasit";
    }
    return 0;
}

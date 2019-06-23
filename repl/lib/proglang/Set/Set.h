#ifndef _SET_H_
#define _SET_H_

#include <iostream>

using namespace std;

struct Node {
    int nodeData;
    Node *left;
    Node *right;
};

class Set {
    Node *root;
    Node *insert(Node *n, int x) {
        if(n == nullptr) {
            n = new Node;
            n->nodeData = x;
            n->left = n->right = nullptr;
        } else if(n->nodeData < x) {
            n->left = insert(n->right, x);
        } else if(n->nodeData > x) {
            n->right = insert(n->left, x);
        }
        return n;
    }

    Node *search(int x, Node *n) {
        if(n == nullptr) {
            return nullptr;
        } else if(n->nodeData > x) {
            return search(x, n->left);
        } else if(n->nodeData < x) {
            return search(x, n->right);
        } else {
            return n;
        }
    }

    int min(Node *n) {
        if(n->left == nullptr) {
            return n->nodeData;
        } else {
            return min(n->left);
        }
    }

    int max(Node *n) {
        if(n->right == nullptr) {
            return n->nodeData;
        } else {
            return max(n->right);
        }
    }
    void inorder(Node *n) {
        if(n == nullptr) {
            return;
        } 
        inorder(n->left);
        cout << n->nodeData << " ";
        inorder(n->right);
    }
    public:
        Set() {
            root = nullptr;
        }
        ~Set() { }
        void put(int x) {
            root = insert(root, x);
        }
        void find(int x) {
            root = search(x, root);
            cout << root << endl;
        }
        void max_elem(Node *n) {
            int res = max(n);
            cout << res << endl;
        }
        void min_elem(Node *n) {
            int res = min(n);
            cout << res << endl;
        }
        void display() {
            inorder(root);
        }
};

#endif
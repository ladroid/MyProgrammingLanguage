#include <iostream>
#include "List.h"

using namespace std;

List::List() {
    head = nullptr;
    tail = nullptr;
}

void List::createnode(int value) {
    node *temp = new node;
    temp->data = value;
    temp->next = nullptr;
    if(head == nullptr) {
        head = temp;
        tail = temp;
        temp = nullptr;
    } else {
        tail->next = temp;
        tail = temp;
    }
}

void List::display() {
    node *temp = new node;
    temp = head;
    cout << "[ ";
    while (temp!=nullptr) {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << "]";
    cout << endl;
}

void List::insert_start(int value) {
    node *temp=new node;
    temp->data=value;
    temp->next=head;
    head=temp;
}

void List::insert_position(int pos, int value) {
    node *pre=new node;
    node *cur=new node;
    node *temp=new node;
    cur=head;
    for(int i=1;i<pos;i++) {
        pre=cur;
        cur=cur->next;
    }
    temp->data=value;
    pre->next=temp;	
    temp->next=cur;
}

void List::delete_first() {
    node *temp=new node;
    temp=head;
    head=head->next;
    delete temp;
}

void List::delete_last() {
    node *current=new node;
    node *previous=new node;
    current=head;
    while(current->next!=NULL) {
        previous=current;
        current=current->next;	
    }
    tail=previous;
    previous->next=NULL;
    delete current;
}

void List::delete_position(int pos) {
    node *current=new node;
    node *previous=new node;
    current=head;
    for(int i=1;i<pos;i++) {
        previous=current;
        current=current->next;
    }
    previous->next=current->next;
}

bool List::find_elem(int data) {
    node *current = new node;
    current = head;
    if(current->data == data) {
        return true;
    }
    return false;
}

void List::size() {
    int count = 0;
    node *current = new node;
    current = head;
    while (current != nullptr) {
        count++;
        current = current->next;
    }
    cout << count << endl;
}

void List::clear() {
    node *current = new node;
    node *next;
    while(current != nullptr) {
        next = current->next;
        free(current);
        current = next;
    }
    head = nullptr;
}

List::~List() { head = nullptr; tail = nullptr;}
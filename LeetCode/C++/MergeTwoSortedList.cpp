#include "ListNode.h"
#include "iostream"
using namespace std;

class Solution {
public:
    static ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if(list1== nullptr) return list2;
        if(list2== nullptr) return list1;
        if(list1->val>list2->val) swap(list1,list2);

        ListNode* head=list1;

        while(list1 && list2){
            ListNode* temp= nullptr;
            while(list1 && list1->val<=list2->val){
                temp= list1;
                list1=list1->next;
            }
            temp->next = list2;
            swap(list1,list2);
        }
        return head;
    }
};

/*
int main(){
    auto *list1=new ListNode(1);
    list1->next=new ListNode(2);
    list1->next->next=new ListNode(4);

    auto *list2=new ListNode(1);
    list2->next=new ListNode(3);
    list2->next->next=new ListNode(4);

    ListNode *list3=Solution::mergeTwoLists(list1,list2);
    while (list3!=nullptr){
        cout << list3->val;
        list3=list3->next;
    }
    return 0;
}*/

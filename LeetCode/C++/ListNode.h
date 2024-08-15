//
// Created by ghait on 26/03/2024.
//

#ifndef C___PROBLEMS_LISTNODE_H
#define C___PROBLEMS_LISTNODE_H

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

#endif //C___PROBLEMS_LISTNODE_H

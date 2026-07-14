package org.example.linkedList;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(1);
//        ll.append(6);
//        ll.append(7);
//        ll.append(9);
//        LinkedList.Node firstNode =  ll.prepend(8);
//        System.out.println("New Node prepend: " + firstNode.value);
//        ll.getHead();
//        ll.getTail();
//        ll.getLength();
//        ll.printList();
//        LinkedList.Node lastNode =  ll.removeLast();
//        System.out.println("Last element removed: " + lastNode.value);
//        ll.getTail();
//        ll.getHead();
//        ll.getLength();
//        ll.printList();
//        LinkedList.Node firstNode =  ll.prepend(8);
//        System.out.println("New Node prepend: " + firstNode.value);
//        ll.printList();
//        ll.getLength();
//        ll.getHead();
//        ll.getTail();

//        ll.append(5);
//        ll.prepend(3);
//        ll.printList();
//        System.out.println(">>>>>>>>>>>>>");
//        LinkedList.Node removedNode = ll.removeFirst();
//        System.out.println("Removed Node: " + removedNode.value);
//        ll.printList();
//        LinkedList.Node removedNode2 = ll.removeFirst();
//        System.out.println("Removed Node: " + removedNode.value);
//        ll.printList();
//        LinkedList.Node elementData = ll.get(0);
//        System.out.println("element at index 0: " + elementData.value);
//        boolean isValueUpdated = ll.set(3, 6);
//        System.out.println("Is value updated? " + isValueUpdated);
//        ll.printList();
//        boolean isInserted = ll.insert(2,8);
//        System.out.println(isInserted ? "It is inserted" : "It is not inserted");
//        ll.printList();
//        Optional<LinkedList.Node> removedNode = Optional.ofNullable(ll.remove(3));
//        System.out.println(removedNode.map(node -> "Removed the node with value: " + node.value).orElse("Please provide proper index"));
//        ll.printList();
//        ll.reverse();
//        System.out.println("reversing the linkedList");
//        ll.printList();
//        System.out.println("New List");
//        ll.append(8);
//        ll.append(7);
//        ll.printList();
//        ll.removeDuplicateUsingSet();
//        System.out.println("After removing duplicates");

//        ll.append(8);
//        ll.append(3);
//        ll.append(5);
//        ll.append(2);
//        ll.printList();
//        ll.partitionList(5);
//        System.out.println("After partition");
//        ll.printList();
//
//        System.out.println(ll.binaryToDecimal());

//        ll.reverseBetween(0,3);
//        System.out.println("After reverse");
//        ll.printList();

        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.append(6);
        ll.append(7);
        ll.swapPairs();
        ll.printList();
    }
}

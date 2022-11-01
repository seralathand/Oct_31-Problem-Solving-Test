package TestZoho;
import java.util.Arrays;
import java.util.Scanner;


public class Oct_31_5<Integer> {
            Node head;
            public class Node{
                int data;
                Node next;

                public Node(int val){
                    data = val;
                    next = null;
                }
            }
            public Oct_31_5(){
                head = null;
            }

            public void nextGreaterNode(){
                Scanner input = new Scanner(System.in);
                System.out.print("enter N : ");
                int n = input.nextInt();
                for(int i =0;i<n;i++) {
                    Node newNode = new Node(input.nextInt());

                    if (head == null) {
                        head = newNode;
                    } else {
                        Node temp = head;
                        while(temp.next!= null){
                            temp = temp.next;
                        }
                        temp.next = newNode;
                    }
                }
                Node temp = head;

                int[] arr = new int[n];
                int index = 0;
                while(temp.next!= null){
                    Node temp2 = temp.next;
                    boolean flag = false;
                    while(temp2!= null){
                        if(temp2.data> temp.data){
                            arr[index++] = temp2.data;
                            flag = true;
                            break;
                        }
                        temp2 = temp2.next;
                    }
                    if(!flag) {
                        arr[index++] = 0;
                    }
                    temp = temp.next;
                }
                System.out.println(Arrays.toString(arr));
            }

        }



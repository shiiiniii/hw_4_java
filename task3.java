//3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. 
//Используйте итератор

import java.util.LinkedList;
public class Program {
    public static void main(String[] args) {
    	LinkedList<Integer> myLinkedList = new LinkedList<>();
        addToFirst(myLinkedList);   
    }
    public static void addToFirst(LinkedList<Integer> arrList){
    	int arrList1[] = {5, 5, 5, 5};
    	int sum = 0;
        for (int j = 0; j < arrList1.length; j++) {
               sum = sum + arrList1[j];
            }
            System.out.println(sum);        	
        }
}

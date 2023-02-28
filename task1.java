//1.Пусть дан LinkedList с несколькими элементами. 
//Реализуйте метод, который вернет “перевернутый” список.


public class Program
{    
	public static void main(String[] arg){
    	int[] arrList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Program arr = new Program();
        arr.sort(arrList);
        System.out.println("Исходный массив: 1 2 3 4 5 6 7 8 9 10");
        System.out.print("Перевернутый массив: ");
        for(int i: arrList){
            System.out.print(i + " ");
        }
    }
    public void sort(int[] array){
        int[]arraySort = new int[10];
        for(int i = 9; i >= 0; i--){
            arraySort[9 - i] = array[i];
        }
        for(int j = 0; j < array.length; j++){
        	array[j] = arraySort[j];
        }
    }
}

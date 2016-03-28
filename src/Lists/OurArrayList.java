package Lists;

import java.util.Arrays;

public class OurArrayList implements OurList{
    Integer[] arr = new Integer[0];
    public void add(Integer i){ ////System.arraycopy() вставить вместо for
        Integer[] temp = new Integer[arr.length + 1]; //создается новый массив, размером больше на 1 чем оригинальный для дальнейшего добавления нового элемента
        //System.arraycopy(arr, 0, temp, 0, arr.length);

        System.arraycopy(arr,0,temp,0, arr.length);
        /*for (int j = 0; j<arr.length;j++){
            temp[j] = arr[j];//переписывает все элементы по одному, из массива арр в новый массив*//*
        }*/
        temp[temp.length-1]=i; //добавление в конец нового массива нового элемента
        arr = temp; // перезасетит ссылку и засеттит новый массив вместо старого
    }
    //                    1       4
    public void add(int index, Integer i){
        Integer[] temp = new Integer[arr.length + 1]; //создается новый массив, размером больше на 1 чем оригинальный для дальнейшего добавления нового элемента
        for (int j = 0; j<arr.length;j++){
            if(j<index){
                temp[j]= arr[j];
            }else{
                temp[j+1] = arr[j];
            }
        }
        temp[index]=i; //добавление нвого значения по индексу в новый массив
        arr = temp; // перезасетит ссылку и засеттит новый массив вместо старого
    }

    // more memory save option of this method:   ПРОВЕРИТЬ НА ВРЕМЯ ВЫПОЛНЕНИЯ
     /*public void addSecond(int index, Integer i){
        Integer[] temp = new Integer[arr.length + 1];
          for (int j=0; j<index;j++){
           temp[j] = arr[j];
           }
           temp[index] = i;
           for(int j =index+1; j<temp.length;j++){
           temp[j] = arr[j-1];
           }
           arr=temp;
     }*/

    public void set(int index, Integer i){
        arr[index] = i;
    }
    public Integer get(int index){
        return arr[index];
    }

    public void remove(int index){
        Integer[] temp = new Integer[arr.length - 1];
        for (int j = 0; j<temp.length;j++){
            if(j<index){
                temp[j]= arr[j];
            }else{
                temp[j] = arr[j+1];
            }
        }arr = temp;
    }

    public void clear(){
        arr = new Integer[0];
    }
    public int size(){
        return arr.length;
    }
    public boolean contains(Integer i) {
        boolean b = false;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i) {
                b = true;
            }
        }
        return b;
    }

    @Override
    public int lastIndexOf(Integer i) {
        return 0;
    }

    public int indexOf(Integer i){
        int counter = 0; // внешний счетчик
        boolean b = false;
        while(counter<arr.length){
            if(arr[counter] == i){
                b = true;
                break;
            }counter ++;
        }if (b){
            return counter;
        } else return -1;
    }

    @Override
    public boolean isEmpty() {
        if (arr.length!=0){
        return false;
        }
        else{return true ;
        }
    }

    @Override
    public Integer[] toArray() {
        return new Integer[0];
    }

}
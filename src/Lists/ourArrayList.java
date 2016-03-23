package Lists;

public class ourArrayList implements OurList{
    Integer[] arr = new Integer[0];
    public void add(Integer i){
        Integer[] temp = new Integer[arr.length + 1]; //создается новый массив, размером больше на 1 чем оригинальный для дальнейшего добавления нового элемента
        for (int j = 0; j<arr.length;j++){
            temp[j] = arr[j];//переписывает все элемнты по одному, из массива арр в новый массив
        }
        temp[temp.length-1]=i; //добавление в конец нового массива нового элемента
        arr = temp; // перезасеттит ссылку и засеттит новый массив вместо старого
    }
    public void add(int index, Integer i){} // сделать дома

    public void set(int index, Integer i){
        arr[index] = i;
    }
    public Integer get(int index){
        return arr[index];
    }

    public void remove(int index){} // сделать дома

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

}

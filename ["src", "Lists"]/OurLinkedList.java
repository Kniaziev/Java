package Lists;

public class OurLinkedList implements OurList{

    private class Element{
        Integer elem = null;
        Element next = null; //link to another element
        /*public Element(Integer elem){
            this.elem = elem;
        }*/
    }

    Element first = null; //link to the first element in the linked list

    @Override
    public void add(Integer i) {
        if(first == null){
            Element elemTemp = new Element();
            elemTemp.elem = i;
            first = elemTemp;
        }else{
            Element elemTemp = new Element();
            elemTemp.elem = i;
            Element iter = first;
            while(iter.next != null){
                iter = iter.next;
            }
            iter.next = elemTemp;
        }
    }
    @Override
    public void add(int index, Integer i) { //hometask
    }
    @Override
    public void set(int index, Integer i) {
        Element elemTemp = new Element();
        if(index == 0){
            elemTemp.next = first;
            first = elemTemp;
        }else{
            Element iter = first;
            int j = 0;
            while(j<index-1){
                iter = iter.next;
            }
            elemTemp.next = iter.next;
            iter.next = elemTemp;
        }
    }

    @Override
    public Integer get(int index) {
        Element iter = first;
        int j = 0;
        while(j<index){
            iter = iter.next;
            j++;
        }
        return iter.elem;
    }
    @Override
    public void remove(int index) {
        if(index == 0){
            first = first.next;
        }else{
            Element iter = first;
            int j = 0;
            while (j < index - 1) {
                iter = iter.next.next; //chain
                j++;
            } iter.next = iter.next.next;
        }

    }

    @Override
    public void clear() {
        first = null;
    }

    @Override
    public int size() {
        Element iter = first;
        if (first == null) {
            return 0;
        } else {
            int j = 1;
            while (iter.next != null) {
                iter = iter.next;
                j++;
            }
            return j;
        }
    }
    @Override
    public boolean contains(Integer i) {
        boolean b = false;
        if (first == null) {
            return b;
        } else {
            Element iter = first;
            while (iter.next != null) {
                if (iter.elem.equals(i)) {
                    b = true;
                }
                iter = iter.next;
            }
                if (iter.elem.equals(i)) {
                    b = true;
                }
                return b;
            }
        }

    @Override
    public int indexOf(Integer i) {
        if(first==null){
            return -1;
        }else{
            Element iter = first;
            int j = 0;
            while(iter.next!=null){
                if(iter.elem.equals(i)){
                    return j;
                }
                iter = iter.next;
                j++;
            }
            if(iter.elem.equals(i)){
                return j;
            }
            return -1;
        }
    }
}

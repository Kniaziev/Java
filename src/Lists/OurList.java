package Lists;


public interface OurList {
    void add(Integer i);
    void add(int index, Integer i);
    void set(int index, Integer i);
    Integer get(int index);
    void remove(int index);
    void clear();
    int size();
    boolean contains(Integer i);
    int lastIndexOf(Integer i);
    int indexOf(Integer i);
    boolean isEmpty();
    Integer[] toArray();
    /*
    Integer[] toArray();*/

    // isEmpty, LastIndexOf, toArray. HOMETASK.

    // system array copy почитать, реализовать.

}
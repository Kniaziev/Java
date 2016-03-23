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
    int indexOf(Integer i);
}

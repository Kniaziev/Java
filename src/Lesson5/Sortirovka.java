package lesson5;

public class Sortirovka {
    public int[] puzirok(int[] m){
       for(int i = 0; i< m.length - 1; i++){
           for(int j = 0; j < m.length - 1 - i; j++){
               if(m[j] > m[j+1]){
                   int k = m[j];
                   m[j] = m[j+1];
                   m[j+1] = k;
               }
           }
       }
       return m;
    }
    
    public int[] vstavka(int[] m){
        for(int i = 0; i < m.length; i++){
            int k = m[i];
            int j = i - 1;
            while(j>=0 && k<m[j]){
                m[j+1] = m[j];
                j--;
            }
            m[j+1] = k;
        }
        return m;
    } 
}

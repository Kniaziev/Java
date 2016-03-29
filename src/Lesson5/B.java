
package lesson5;

public class B extends A{
    
    
    Boolean conditioner;

    public B(Boolean conditioner, String model, Integer number) {
        super(model, number);
        this.conditioner = conditioner;
    }

    @Override
    public int sq(int a, int b) {
        
        return super.sq(a, b);
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

    @Override
    public String toString() {
        return "Model = "+model+"; Number = "+number+"; Conditioner = "+conditioner+";";
    }

    
    public boolean equals(B o) {
        if(model.equals(o.model) && number.equals(o.number) && conditioner.equals(o.conditioner)){
            return true;
        }else{
            return false;
        }
    }
    
    
    
}

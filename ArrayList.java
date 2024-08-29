package clasegenerica;
/*
 * @author diego
 */
public class ArrayList {
    
    private Object [] datos;
    private int i = 0;

    public ArrayList(int x) {
        datos = new Object[x];
    }
    
    public void add(Object dato){
        datos [i] = dato;
        i+=1;
    }
    public Object get(int i){
        return datos[i];
    }
}

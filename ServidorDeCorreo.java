import java.util.Iterator;
import java.util.ArrayList;
public class ServidorDeCorreo
{
    private ArrayList<Mensaje> items;
    
    public ServidorDeCorreo()
    {
        items = new ArrayList<Mensaje>();
    }
    
    public ArrayList<Mensaje> getItems()
    {
        return items;
    }
    
    public void setItems(ArrayList<Mensaje> items)
    {
        this.items = items;
    }
    
    public int contarMensajes(String quien)
    {
        int contador = 0;
        for(Mensaje item : items){
            if (item.getPara().equals(quien)){ //equals se usa para Strings
                //contabilizar
                contador++;
            }
        }
        
        return contador;
    }
    
    public Mensaje entregaUnMensaje(String quien)
    {
        Iterator<Mensaje> it = items.iterator();
        
        while(it.hasNext()){
            Mensaje item = it.next();
            if(item.getPara().equals(quien)){
                it.remove();
                return item;
            }
        }
        return null;
    }
    
    public void enviar(Mensaje item){
        items.add(item);
    }
}

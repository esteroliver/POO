import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

class Laboratorio{
    private int id;
    private String descricao;

    public String toString(){
        return id + '\n' + descricao;
    }
}

class NLaboratorio{
    List<Laboratorio> labs = new ArrayList<Laboratorio>();

    public void toXml(List<Laboratorio> laboratorios){
        FileOutputStream arq = new FileOutputStream("laboratorios.xml");
        XMLEncoder enc = new XMLEncoder(arq);
        enc.writeObject(laboratorios);
        enc.close();
        arq.close();
    } 

    public void fromXml(){
        try{
           FileInputStream arq = new FileInputStream("laboratorios.xml");
           XMLDecoder dec = new XMLDecoder(arq);
           labs = (List<Laboratorio>) dec.readObject();
           dec.close();
           arq.close();
        }
        catch (FileNotFoundException ex){

        }
    }
}
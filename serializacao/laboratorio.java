import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

class Laboratorio{
    public int id;
    public String descricao;

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

    public void Inserir(Laboratorio l){
        fromXml();
        int id = 0;
        for (Laboratorio la : labs) {
            if(la.id > id) id = la.id;
        }
        l.id = id+1;
        labs.add(l);
        toXml(labs);
    }

    public List<Laboratorio> Listar(){
        fromXml();
        return labs;
    }

    public Laboratorio obterId(int id){
        fromXml();
        for (Laboratorio la : labs) {
            if (la.id == id) return la;
        }
    }

    public void Atualizar(Laboratorio l){
        fromXml();
        Laboratorio l_subs = obterId(l.id);
        if (l_subs != null){
            labs.remove(l_subs);
            labs.add(l);
        }
        toXml(labs);
    }

    public void Excluir(Laboratorio l){
         fromXml();
        Laboratorio l_subs = obterId(l.id);
        if (l_subs != null){
            labs.remove(l_subs);
        }
        toXml(labs);
    }
}
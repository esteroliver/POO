import java.beans.*;
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        laboratorio lab1 = new laboratorio();
        lab1.setDescricao("laboratorio de estudos");
        laboratorio lab2 = new laboratorio();
        lab2.setDescricao("laboratorio do superior");
        NLaboratorio labos = new NLaboratorio();
        labos.Inserir(lab2);
        labos.Inserir(lab1);
    }
}

class laboratorio{
    private int id;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString(){
        return id + '\n' + descricao;
    }
}

class NLaboratorio implements Serializable{
    List<laboratorio> labs = new ArrayList<laboratorio>();

    public static void toXml(List<laboratorio> labs){
        try{
            XMLEncoder enc = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("laboratorios.xml")));
            enc.writeObject(labs);
            enc.close();
        }
        catch(FileNotFoundException ex){

        }
    } 

    @SuppressWarnings("unchecked")
    public static void fromXml(List<laboratorio> labs){
        try{
           XMLDecoder dec = new XMLDecoder(new BufferedInputStream(new FileInputStream("laboratorios.xml")));
           Object la = dec.readObject();
           labs = (List<laboratorio>) la;
           dec.close();
        }
        catch (FileNotFoundException ex){

        }
    }

    public void Inserir(laboratorio l){
        NLaboratorio.fromXml(labs);
        if (labs.size() == 0){
            l.setId(1);
            labs.add(l);
            NLaboratorio.toXml(labs);
        }
        else{
            int id = 0;
            for (laboratorio la : labs) {
                if(la.getId() > id) id = la.getId();
            }
            l.setId(id+1);
            labs.add(l);
            NLaboratorio.toXml(labs);
        }
    }

    public List<laboratorio> Listar(){
        NLaboratorio.fromXml(labs);  
        return labs;
    }

    public laboratorio obterId(int id){
        NLaboratorio.fromXml(labs);  
        for (laboratorio la : labs) {
            if (la.getId() == id) return la;
        }
        laboratorio def_l1 = new laboratorio();
        return def_l1;
    }

    public void Atualizar(laboratorio l){
        NLaboratorio.fromXml(labs);  
        laboratorio l_subs = obterId(l.getId());
        if (l_subs != null){
            labs.remove(l_subs);
            labs.add(l);
        }
        NLaboratorio.toXml(labs);
    }

    public void Excluir(laboratorio l){
        NLaboratorio.fromXml(labs);  
        laboratorio l_subs = obterId(l.getId());
        if (l_subs != null){
            labs.remove(l_subs);
        }
        NLaboratorio.toXml(labs);
    }
}
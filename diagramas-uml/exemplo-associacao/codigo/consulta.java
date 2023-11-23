import java.time.LocalDateTime;

class Main{
    public static void main(String args[]){

    }
}

class Consulta{
    private int idConsl;
    private Paciente pac;
    private Medico med;
    private LocalDateTime data_hora;
    private String anamnese;
    public Consulta(int idConsl, LocalDateTime data_hora, String anamnese){
        setId(idConsl);
        setDataHora(data_hora);
        setAnamnese(anamnese);
    }
    public void setId(int idConsl){
        if (idConsl > 0) this.idConsl = idConsl;
    }
    public void setDataHora(LocalDateTime data_hora){
        this.data_hora = data_hora;
    }
    public void setAnamnese(String anamnese){
        if (anamnese != "") this.anamnese = anamnese;
    }
    public int getId(){
        return idConsl;
    }
    public LocalDateTime getDataHora(){
        return data_hora;
    }
    public String getAnamnese(){
        return anamnese;
    }
}

class Paciente{
    private int idPac;
    public void setIdPac(int idPac){
        if (idPac > 0) this.idPac = idPac;
    }
    public int getIdPac(){
        return idPac;
    }
}

class Medico{
    private int idMed; 
    public void setIdMed(int idMed){
        if (idMed > 0) this.idMed = idMed;
    }
    public int getIdMed(){
        return idMed;
    }
}
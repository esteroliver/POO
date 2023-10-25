import java.time.Duration;
import java.time.LocalDateTime;

class Programa{
    public static void main(String args[]){
        Musica m1 = new Musica("Void", "Melanie Martinez", "Portals", "04:08");
        Musica m2 = new Musica("Moon cycle", "Melanie Martinez", "Portals", "02:32");
        Musica m3 = new Musica("Evil", "Melanie Martinez", "Portals", "04:06");
        Musica m4 = new Musica("Pity Party", "Melanie Martinez", "Crybaby", "03:25");

        Playlist p1 = new Playlist("diva", "Músicas da melanie martinez");
        p1.Inserir(m1);
        p1.Inserir(m2);
        p1.Inserir(m3);
        p1.Inserir(m4);
        System.out.println(p1.TempoTotal());
        System.out.println(p1.ToString());
    }
}

class Playlist{
    private String nome, descricao, tempototal;
    private Musica[] musicas = new Musica[10];
    private int k = 0;
    public Playlist(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }
    public void Inserir(Musica m){
        if (k < 10) musicas[k] = m;
        k++;
    }
    public String TempoTotal(){
        int segundos = 0;
        for (int i = 0; i<k; i++){
            String[] tempo = musicas[i].getDuracao().split(":");
            segundos += (Integer.parseInt(tempo[0])) * 60 + (Integer.parseInt(tempo[1]));
        }
        tempototal = segundos/60 + ":" + segundos%60;
        return tempototal;
    }

    public String ToString(){
        return "Nome da playlist: " + nome + "\n" +
        "Descrição: " + descricao + "\n" + 
        "Tempo total da playlist: " + tempototal;
    }
}

class Musica{
    private String titulo, artista, album, duracao;

    public Musica(String titulo, String artista, String album, String duracao){
        setTitulo(titulo);
        setArtista(artista);
        setAlbum(album);
        setDuracao(duracao);
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }

    public void setArtista(String artista){
        this.artista = artista;
    }
    public String getArtista(){
        return artista;
    }

    public void setAlbum(String album){
        this.album = album;
    }
    public String getAlbum(){
        return album;
    }
    
    public void setDuracao(String d){
        LocalDateTime comeco = LocalDateTime.parse("2020-01-01T00:00:00");
        String[] dur = d.split(":");
        int minutos = Integer.parseInt(dur[0]);
        int segundos = Integer.parseInt(dur[1]);
        LocalDateTime tempo;
        if (minutos < 10 && segundos > 10){
            tempo = LocalDateTime.parse("2020-01-01T00:0"+minutos+":"+segundos);
        }
        else if (minutos < 10 && segundos < 10){
            tempo = LocalDateTime.parse("2020-01-01T00:0"+minutos+":0"+segundos);
        }
        else 
            tempo = LocalDateTime.parse("2020-01-01T00:"+minutos+":"+segundos);

        Duration temp;
        temp = Duration.between(comeco, tempo);
        long seg = temp.getSeconds();
        long min = seg/60;
        seg = seg%60;
        if (minutos < 10 && segundos > 10)
            duracao = "0"+min+":"+seg;
        else if (minutos < 10 && segundos < 10)
            duracao = "0"+min+":0"+seg;
        else
            duracao = min+":"+seg;
    }
    public String getDuracao(){
        return duracao;
    }
    public String ToString(){
        return "Título: " + titulo + "\n" +
        "Artista: " + artista + "\n" +
        "Álbum: " + album + "\n" +
        "Duração: " + duracao;
    }
}
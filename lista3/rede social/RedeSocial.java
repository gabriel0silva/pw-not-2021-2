pacote  lista3.redesocial ;
import  java.util.ArrayList ;

// ArrayList com agregação
public  class  RedeSocial {
     codigo int privado ;
    private  String nome;
     url de string privada ;
    // associação com ArrayList
    private  ArrayList < Usuario > usuarios; // vetor
    public  RedeSocial () {
        // aloca espaço na memória
        isso . usuarios =  new  ArrayList < Usuario > ();
    }
    public  RedeSocial ( int  codigo , String  nome , String  url ) {
        isso . codigo = codigo;
        isso . nome = nome;
        isso . url = url;
        isso . usuarios =  new  ArrayList < Usuario > ();
    }
    public  int  getCodigo () {
        return codigo;
    }
    public  ArrayList < Usuario >  getUsuarios () {
        return usuarios;
    }
    public  void  setUsuarios ( ArrayList < Usuario >  usuarios ) {
        isso . usuarios = usuarios;
    }
    public  String  getUrl () {
        return url;
    }
    public  void  setUrl ( String  url ) {
        isso . url = url;
    }
    public  String  getNome () {
        return nome;
    }
    public  void  setNome ( String  nome ) {
        isso . nome = nome;
    }
    public  void  setCodigo ( int  codigo ) {
        isso . codigo = codigo;
    }
    public  String  toString () {
        return  " Código: "  +  this . codigo +  " Nome: "  +  isso . nome +  " url: "  +  isso . url +  "  \ n Usuários "  +  isto . usuarios . para sequenciar();
    }

    // Usuario é o tipo do parâmetro, uma classe
    // usuário é o parâmetro, um objeto
    public  void  addUsuario ( Usuario  usuario ) {
        isso . usuarios . adicionar (usuario); // adciona usuário nenhum vetor
    }

}
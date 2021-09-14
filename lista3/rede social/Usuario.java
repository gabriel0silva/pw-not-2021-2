pacote  lista3.redesocial ;

public  class  Usuario {
     login de string privado ;
    private  String senha;

    public  Usuario () {

    }
    public  Usuario ( String  login , String  senha ) {
        isso . setLogin (login);
        isso . setSenha (senha);
    }
    public  void  setLogin ( String  login ) {
        isso . login = login;
    }
    public  void  setSenha ( String  senha ) {
        isso . senha = senha;
    }
    public  String  getLogin () {
        devolva  isso . Conecte-se;
    }
    public  String  getSenha () {
        devolva  isso . senha;
    }
    public  String  toString () {
        return  " \ n Login: "  +  isto . login +  " Senha: "  +  this . senha;
    }
}
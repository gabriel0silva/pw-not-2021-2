pacote  lista3.redesocial ;

public  class  Testa {
    
    public  static  void  main ( String  args []) {

        Usuario usr1 =  novo  Usuario ( " fulano@email.com " , " 123 " );

        Usuario usr2 =  novo  Usuario ( " beltrano@email.com " , " 321 " );
    
        Usuario usr3 =  novo  Usuario ( " ciclano@email.com " , " 444 " );
    
        RedeSocial rs =  novo  RedeSocial ( 1 , " Instagram " , " www.instagram " );

        rs . addUsuario (usr1); // adiciona usuáro na rede social
        rs . addUsuario (usr2); // adiciona usuáro na rede social
        rs . addUsuario (usr3); // adiciona usuáro na rede social

        Sistema . para fora . println (rs . toString ());
    }
}
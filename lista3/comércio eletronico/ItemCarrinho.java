pacote  lista3.ecommerce ;

public  class  ItemCarrinho {
    
     codigo int privado ;
     valor de flutuação privada ;
    private  int qtde;
    public  ItemCarrinho () {
    }
    public  ItemCarrinho ( int  codigo , float  valor , int  qtde ) {
        isso . setCodigo (codigo);
        isso . setValor (valor);
        isso . setQtde (qtde);
    }
    public  int  getQtde () {
        return qtde;
    }
    public  void  setQtde ( int  qtde ) {
        isso . qtde = qtde;
    }
    public  float  getValor () {
        valor de retorno ;
    }
    public  void  setValor ( float  valor ) {
        isso . valor = valor;
    }
    public  int  getCodigo () {
        return codigo;
    }
    public  void  setCodigo ( int  codigo ) {
        isso . codigo = codigo;
    }
   
  public  String  toString () {
      return  " Código: "  +  this . codigo +  " Valor: "  +  isso . valor +  " Qtde "  +  isso . qtde;
  }

    
}
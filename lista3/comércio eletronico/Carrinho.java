pacote  lista3.ecommerce ;
import  java.util.Date ;

public  class  Carrinho {
     codigo int privado ;
    private  float valorTotal;
    private  String formaPgto;
     dados de data privados ;
    private  String formaEntrega;
    // associação
    privado  ItemCarrinho itemCarrinho;

    public  Carrinho () {
    }
    
    public  Carrinho ( int  codigo , float  valorTotal , String  formaPgto , Data  data , String  formaEntrega ,
    int  codigoIC , float  valorIC , int  qtdeIC ) {
        isso . setCodigo (codigo);
        isso . setValorTotal (valorTotal);
        isso . setFormaPgto (formaPgto);
        isso . setData (dados);
        isso . setFormaEntrega (formaEntrega);
        // está vindo parte dos itens do carrinhos, que serão juntados aqui
        isso . itemCarrinho =  novo  ItemCarrinho (codigoIC, valorIC, qtdeIC); // composição
    }
    public  ItemCarrinho  getItemCarrinho () {
        return itemCarrinho;
    }
    public  void  setItemCarrinho ( int  codigo , float  valor , int  qtde ) {
        isso . itemCarrinho =  novo  ItemCarrinho (codigo, valor, qtde); // composição
    }
    public  String  getFormaEntrega () {
        return formaEntrega;
    }
    public  void  setFormaEntrega ( String  formaEntrega ) {
        isso . formaEntrega = formaEntrega;
    }
    public  Date  getData () {
        dados de retorno ;
    }
    public  void  setData ( dados de data  ) {
        isso . dados = dados;
    }
    public  String  getFormaPgto () {
        return formaPgto;
    }
    public  void  setFormaPgto ( String  formaPgto ) {
        isso . formaPgto = formaPgto;
    }
    public  float  getValorTotal () {
        return valorTotal;
    }
    public  void  setValorTotal ( float  valorTotal ) {
        isso . valorTotal = valorTotal;
    }
    public  int  getCodigo () {
        return codigo;
    }
    public  void  setCodigo ( int  codigo ) {
        isso . codigo = codigo;
    }
   
    public  String  toString () {
        
        return  " Código: "  +  this . codigo +  " Valor total: "  +  isso . valorTotal +  " Pagto: "  +  isso . formaPgto +  " Dados: "  +  isso . dados +  " Entrega: "  +  isso . formaEntrega +  "  \ n Item Carrinho: "  +  this . itemCarrinho . para sequenciar();

    }
}
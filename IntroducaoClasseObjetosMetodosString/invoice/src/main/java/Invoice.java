public class Invoice {

    private String numeroId;
    private String descricao;
    private int quantidade;
    private double precoItem;
    private double fatura;

    public Invoice(String numeroId, String descricao, int quantidade, double precoItem){

        this.numeroId = numeroId;
        this.descricao = descricao;

        if (quantidade < 0)
            this.quantidade = quantidade;

        if (precoItem < 0.0)
            this.precoItem = precoItem;
        this.fatura = fatura;
    }

    public void setInvoiceFatura(int quantidade, double precoItem){

        fatura = quantidade * precoItem;

    }

    public double getInvoiceFatura(){

        return fatura;

    }

        //define a manipulacao das variaveis de instancia
    public  void setNumeroId(){

        this.numeroId = numeroId;

    }

    public  void setDescricao(){
        this.descricao = descricao;
    }
    public  void setQuantidade(){
        this.quantidade = quantidade;

    }

    public  void setPrecoItem(){
        this.precoItem = precoItem;
    }


    //Captura
    public String getNumeroId(){
        return numeroId;
    }

    public String getDescricao(){
        return descricao;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double getPrecoItem(){
        return precoItem;
    }


}

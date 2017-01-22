class Papel{
    private int numeracao;
    private int quantidade;
    private int gramatura;
    private String dimensoes;
    private boolean vendido;

    public void setNumeracao(int num){
        this.numeracao = num;
    }

    public void setQuantidade(int qtd){
        this.quantidade = qtd;
    }

    public void setGramatura(int grt){
        this.gramatura = grt;
    }
     
    public void setDimensoes(String dim){
        this.dimensoes = dim;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public int getGramatura(){
        return this.gramatura;
    }

    public String getDimensoes(){
        return this.dimensoes;
    }

    public int getNumeracao(){
        return this.numeracao;
    }

    public void verificaVenda(int resmas){
        EstoquePapel ver = new EstoquePapel();
        if(ver.getTotalResma() <= resmas){
            System.out.println("Impossivel venda, não possui em estoque.");
        }else{
            ver.setDiminuiEstoque(resmas);
            System.out.println("Venda autorizada.");
        }
    }
}

class EstoquePapel{
    private int totalResma;
    private String marca;
    private boolean estoque;

    public EstoquePapel(){
        this.totalResma = 10000;
        this.marca = "CHAMEX";
        this.estoque = true;
    }

    public void setTotalResma(int valor){
        this.totalResma = valor;
    }

    public void setMarca(String marc){
        this.marca = marc;
    }

    public int getTotalResma(){
        return this.totalResma;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setDiminuiEstoque(int qtd){
        this.totalResma -= qtd;
    }

}

class TestaPapel{
    public static void main(String[] args){
        Papel paper = new Papel();
        paper.setQuantidade(500);
        paper.setGramatura(75);
        paper.setDimensoes("210x297mm");
        paper.setNumeracao(9999);
        
        System.out.println(paper.getQuantidade());
        System.out.println(paper.getGramatura());
        System.out.println(paper.getDimensoes());
        System.out.println(paper.getNumeracao());

        paper.verificaVenda(paper.getNumeracao());

    }
}
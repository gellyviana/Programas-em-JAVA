class Papel{
    private int numeracao;
    private int quantidade;
    private int gramatura;
    private String marca;
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

    public void setMarca(String marc){
        this.marca = marc;
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

    public String getMarca(){
        return this.marca;
    }

    public String getDimensoes(){
        return this.dimensoes;
    }

    public int getNumeracao(){
        return this.numeracao;
    }

    public void verificaVenda(int codigo){
        if(this.numeracao == codigo){
            System.out.println("Resma já foi vendida.");
        }else{
            System.out.println("Resma pode ser vendida.");
            this.vendido = true;
        }
    }
}

class TestaPapel{
    public static void main(String[] args){
        Papel paper = new Papel();
        paper.setQuantidade(500);
        paper.setGramatura(75);
        paper.setMarca("Chamex");
        paper.setDimensoes("210x297mm");
        paper.setNumeracao(1225);
        
        System.out.println(paper.getQuantidade());
        System.out.println(paper.getGramatura());
        System.out.println(paper.getMarca());
        System.out.println(paper.getDimensoes());
        System.out.println(paper.getNumeracao());

        paper.verificaVenda(paper.getNumeracao());

    }
}
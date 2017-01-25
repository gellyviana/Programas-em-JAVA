class Conta{
    Cliente titular;
    private int numeroDaConta;
    private int agencia;
    private double saldo;

    Conta(int numDaConta, int agen){
        this.numeroDaConta  = numDaConta;
        this.agencia = agen;
        this.saldo = 200.0;
    }

    public void setNumeroDaConta(int num){
        this.numeroDaConta = num;
    }

    public void setAgencia(int age){
        this.agencia = age;
    }

    public int getNumeroDaConta(){
        return this.numeroDaConta;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void deposita(double valorDepositado){
        this.saldo += valorDepositado;
    }

    public void saque(double valorSaque){
        if(this.saldo <= valorSaque){
            System.out.println("Saldo insuficiente.");
        }
        else{
            System.out.println("Aguarde, valor sendo liberado.");
             this.saldo -= valorSaque;
        } 
    }

    public void transferi(double valorTransferido, Conta destino){
        if(valorTransferido <= this.saldo){
            this.saldo -= valorTransferido;
            destino.saldo += valorTransferido;
        }else{
            System.out.println("Saldo insuficiente para transferir.");
        }
    }

    public void statusDaConta(){
        System.out.println("Agencia da Conta:" + this.getAgencia());
        System.out.println("Numero da Conta:" + this.getNumeroDaConta());
        System.out.println("Saldo da Conta:" + this.getSaldo());
    }
}

class Cliente{
    private String nomeSobrenome;
    private long cpf;
    private int identidade;

   public Cliente(String name, long pessoaFisica, int id){
        this.nomeSobrenome = name;
        this.cpf = pessoaFisica;
        this.identidade = id;
    }

    public void setNomeSobrenome(String nome){
        this.nomeSobrenome = nome;
    }

    public void setCpf(long numero){
        this.cpf = numero;
    }

    public void setIdentidade(int valor){
        this.identidade = valor;
    }

    public String getNomeSobrenome(){
        return this.nomeSobrenome;
    }

    public long getCpf(){
        return this.cpf;
    }

    public int getIdentidade(){
        return this.identidade;
    }
}

class Programa{
    public static void main(String[] args){
        Cliente novoCliente1 = new Cliente("Antonia Raposo", 7896, 456789);
        Conta contaNova1 = new Conta(4103, 001);
        Cliente novoCliente = new Cliente("Gelly Viana", 4578, 0021345);
        Conta contaNova = new Conta(2458, 001);
        contaNova.statusDaConta();
        contaNova.deposita(400.0);
        contaNova.transferi(100.0, contaNova1);
        contaNova.statusDaConta();
        contaNova1.statusDaConta();
    }
}
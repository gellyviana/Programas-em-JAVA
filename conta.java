class Conta{
    int numero;
    String titular;
    double saldo;
    int agencia;

    void deposita(double valorDepositado){
        this.saldo += valorDepositado;
    }

    void saque(double valorSaque){
        if(this.saldo <= valorSaque){
            System.out.println("Saldo insuficiente.");
        }
        else{
            System.out.println("Aguarde, valor sendo liberado.");
             this.saldo -= valorSaque;
        } 
    }

    void transferi(double valorTransferido, Conta destino){
        this.saldo -= valorTransferido;
        destino.saldo += valorTransferido;
    }
}

class Programa{
    public static void main(String[] args){
        Conta gelly = new Conta();
        gelly.numero = 5992;
        gelly.titular = "Gelly Viana Mota";
        gelly.saldo = 1224.45;
        gelly.agencia = 23;

        Conta marciel = new Conta();

        System.out.println(gelly.saldo);
        gelly.deposita(400.0);
        System.out.println(gelly.saldo);
        gelly.saque(100.0);
        System.out.println(gelly.saldo);
        gelly.transferi(50.0, marciel);
        System.out.println(marciel.saldo);
        System.out.println(gelly.saldo);
    }
}
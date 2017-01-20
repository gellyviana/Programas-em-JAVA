class Turma{
    Aluno[] alunos;

    void imprimeNotas(){
        for(int i = 0; i < this.alunos.length; i++){
            Aluno aluno = this.alunos[i];
            if(aluno != null){
                System.out.println(aluno.nota);
                continue;
            }
        }
    }

    void verificaAprovacao(){
       for(int i = 0; i < this.alunos.length; i++){
            Aluno aluno = this.alunos[i];
            if(aluno != null && aluno.nota < 7){
                System.out.println("Voce esta na recuperacao.");
                System.out.println(aluno.nome);
                continue;
            }
        } 
    }
}

class Aluno{
    String nome;
    int nota;
}

class TesteDaTurma{
    public static void main(String [] args){
        Turma gk14 = new Turma();
        gk14.alunos = new Aluno[5];

        gk14.alunos[0] = new Aluno();
        gk14.alunos[0].nome = "Mariza";
        gk14.alunos[0].nota = 6;

        gk14.alunos[1] = new Aluno();
        gk14.alunos[1].nome = "João";
        gk14.alunos[1].nota = 10;

        gk14.imprimeNotas();
        gk14.verificaAprovacao();
    }
}
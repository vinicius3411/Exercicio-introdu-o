class Aluno{
  String nome;
  String telefone;
  String email;
  String matricula;
}

class principal{
public static void main(String args[]){
Aluno vinicius = new Aluno();
vinicius.nome = "Vinicius Rodrigues do Prado Rosa";
vinicius.email = "vinicius3411@gmail.com";
vinicius.telefone = "+55 16 9996624258";
vinicius.matricula = "14269";


System.out.println("nome: " + vinicius.nome + "\ne-mail: " + vinicius.email + "\nTelefone: " + vinicius.telefone + "\nnúmero de matricula: " + vinicius.matricula);
  }
}


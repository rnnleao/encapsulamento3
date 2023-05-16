public class Principal {

    public static void main (String [] args) {
        
        Perfil perfil = new Perfil("Renan",17,"rnnleao","0509");

        System.out.println("O nome é: " + perfil.getNome());
        System.out.println("A idade é: " + perfil.getIdade());
        System.out.println("O username é: " + perfil.getUsername());
        perfil.setSenha("rnn0509");

        if(perfil.verificarSenha("RNN50509")){
            System.out.println("Senha válida");
        } else {
            System.out.println("Senha inválida!");
        }
    }
}

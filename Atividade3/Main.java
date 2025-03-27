package Atividade3;

    public class Main {
        public static void main(String[] args) {
            Funcionario funcionario = new Funcionario("Malu", 3000.0);
            Gerente gerente = new Gerente("Aninha", 5000.0, 1500.0);
            Desenvolvedor desenvolvedor = new Desenvolvedor("Kenia", 4000.0);

            System.out.println("--- Funcionário Comum ---");
            funcionario.exibirInformacoes();

            System.out.println("\n--- Gerente ---");
            gerente.exibirInformacoes();

            System.out.println("\n--- Desenvolvedor ---");
            desenvolvedor.exibirInformacoes();

            System.out.println("\n--- Polimorfismo ---");
            Funcionario[] funcionarios = {funcionario, gerente, desenvolvedor};

            for (Funcionario func : funcionarios) {
                System.out.println(func.nome + " - Salário: R$" + func.calcularSalario());
            }
        }
    }


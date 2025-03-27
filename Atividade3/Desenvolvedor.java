package Atividade3;

    public class Desenvolvedor extends Funcionario {
        public Desenvolvedor(String nome, double salarioBase) {
            super(nome, salarioBase);
        }

        @Override
        public double calcularSalario() {
            return salarioBase * 1.10;
        }

        @Override
        public void exibirInformacoes() {
            super.exibirInformacoes();
            System.out.println("Cargo: Desenvolvedor");
        }
    }



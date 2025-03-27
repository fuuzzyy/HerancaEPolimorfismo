package Atividade3;

    public class Gerente extends Funcionario {
        private double bonus;

        public Gerente(String nome, double salarioBase, double bonus) {
            super(nome, salarioBase);
            this.bonus = bonus;
        }

        @Override
        public double calcularSalario() {
            return salarioBase + bonus;
        }

        @Override
        public void exibirInformacoes() {
            super.exibirInformacoes();
            System.out.println("Bônus: R$" + bonus);
            System.out.println("Cargo: Gerente");
        }
    }



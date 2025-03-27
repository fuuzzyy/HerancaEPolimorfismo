package Atividade3;

    public class Funcionario {
        protected String nome;
        protected double salarioBase;

        public Funcionario(String nome, double salarioBase) {
            this.nome = nome;
            this.salarioBase = salarioBase;
        }

        public double calcularSalario() {
            return salarioBase;
        }

        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Salário Base: R$" + salarioBase);
            System.out.println("Salário Calculado: R$" + calcularSalario());
        }
    }



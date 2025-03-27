package Atividade4;

    public class Main {
        public static void main(String[] args) {
            Pagamento[] pagamentos = new Pagamento[3];
            pagamentos[0] = new Pagamento();
            pagamentos[1] = new PagamentoCartao();
            pagamentos[2] = new PagamentoDinheiro();

            System.out.println("--- Processando Pagamentos ---");
            for (Pagamento pagamento : pagamentos) {
                pagamento.realizarPagamento();
            }
        }
    }


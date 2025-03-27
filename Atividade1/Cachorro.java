package Atividade1;

    public class Cachorro extends Animal {
        public Cachorro() {
            super();
        }

        @Override
        protected void fazerSom() {
            System.out.println("O cachorro late!");
            super.fazerSom();
        }

        public void fazersom() {

        }
    }



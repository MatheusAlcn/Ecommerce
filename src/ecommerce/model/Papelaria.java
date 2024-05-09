package ecommerce.model;

public abstract class Papelaria
{
        protected int produtoId = 0;
        private double preco = 0.0f;
        private String nome = "";

        public Papelaria(int produtoId, String nome, double preco)
        {
            this.produtoId = produtoId;
            this.nome = nome;
            this.preco = preco;
            
        }
        public Papelaria() {
        	
        }
        
        public int getProdutoId() {
            return produtoId;
        }

        public void setProdutoId(int produtoId) {
            this.produtoId = produtoId;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

		public void visualizar() {
			System.out.println(produtoId);
			System.out.println(nome);
			System.out.println(preco);
		}
		
}


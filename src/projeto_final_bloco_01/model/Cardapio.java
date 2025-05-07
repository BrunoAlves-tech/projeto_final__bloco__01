package projeto_final_bloco_01.model;

public  class Cardapio {
	
	



	



	public Cardapio(int numero, int tipo, String nome, float preco) {
        super();
        this.tipo = tipo;
        this.nome = nome;
        this.preco = preco;
        this.numero = numero;
        
    }
    
    
 
    public int getTipo() {
		return tipo;
	}



	public void setTipo(int tipo) {
		this.tipo = tipo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public float getPreco() {
		return preco;
	}



	public void setPreco(float preco) {
		this.preco = preco;
	}


	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}


	private int numero;
	private int tipo;
    private String nome;
    private float preco;
    
      
    
    public void visualisar() {
       
    	
        System.out.println(this.getNome());
        System.out.println(this.getTipo());
        System.out.println(this.getPreco());
    }



	
}

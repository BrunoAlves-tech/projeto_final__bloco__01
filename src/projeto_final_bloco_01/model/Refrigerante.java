package projeto_final_bloco_01.model;

public class Refrigerante extends Cardapio{

	private String marca;

	public Refrigerante(int numero, int tipo, String nome, float preco, String marca) {
		super(numero, tipo, nome, preco );
		this.marca = marca;
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	 public void visualisar() {
	       
	    	super.visualisar();
	        System.out.println(this.marca);
	        
	    }
}


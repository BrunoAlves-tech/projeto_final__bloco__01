package projeto_final_bloco_01.model;

public class HamburguerArtesanal extends Cardapio{

	
	private String carnes;

	public HamburguerArtesanal(int numero, int tipo, String nome, float preco, String carnes) {
		super(numero, tipo, nome, preco );
		this.carnes = carnes;
		
	}


	public String getCarnes() {
		return carnes;
	}

	public void setCarnes(String carnes) {
		this.carnes = carnes;
	}
	@Override
	 public void visualisar() {
	       
	    	super.visualisar();
	        System.out.println(this.carnes);
	        
	    }

}

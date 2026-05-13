package avançadatarde;

public class Ventilador implements IVentilador {
	protected String cor;
	protected String marca;
	
	@Override
	public void ligar() {
		System.out.println("Ligou o ventilador padrão");
		
	}
	@Override
	public void mudarVelocidade() {
		System.out.println("mudou a velocidade ");
		
	}
	


}

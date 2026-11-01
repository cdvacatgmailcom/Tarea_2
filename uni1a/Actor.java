/**
 * Class Actor
 */
package uni1a;

public class Actor{
	private String nombre;
	

	public Actor (String nombre){
		this.nombre = nombre;
	}

	public void setNombreActor (String nombre){
		this.nombre = nombre;
	}

	public String getNombreActor(){
		return this.nombre;
	}

}
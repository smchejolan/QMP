package Common;
import Enums.Categoria;
import Exceptions.*;

public class Tipo {
	public Categoria categoria;
	
	public Tipo(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Categoria categoria() {
		if(categoria == null) {
			throw new ExcepcionCreacionTipo("El tipo tiene que tener categoria"); 
		}
		
		return this.categoria;
	}
}

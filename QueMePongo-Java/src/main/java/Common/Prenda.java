package Common;

import Enums.*;
import Exceptions.*;

public class Prenda {
	public Tipo tipoDePrenda;
	public Material material;
	public Color colorPrimario;
	public Color colorSecundario;
	
	public Prenda(Tipo tipoDePrenda, Material material, Color colorPrimario, Color colorSecundario){
		if(tipoDePrenda == null) {
			throw new ExcepcionCreacionPrenda("El tipo de prenda no puede ser null");
		}
		if(material == null) {
			throw new ExcepcionCreacionPrenda("El material no puede ser null");
		}
		if(colorPrimario == null) {
			throw new ExcepcionCreacionPrenda("El color primario no puede ser null");
		}
		
		this.tipoDePrenda=tipoDePrenda;
		this.material=material;
		this.colorPrimario=colorPrimario;
		this.colorSecundario=colorSecundario;
	}
}

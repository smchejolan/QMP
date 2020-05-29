package Common;

import Enums.*;

public class Prenda {
	public Tipo tipoDePrenda;
	public Material material;
	public Trama trama;
	public Color colorPrimario;
	public Color colorSecundario;
	
	public Prenda(Tipo tipoDePrenda, Material material, Trama trama, Color colorPrimario, Color colorSecundario){
		this.tipoDePrenda=tipoDePrenda;
		this.material=material;
		this.trama=trama;
		this.colorPrimario=colorPrimario;
		this.colorSecundario=colorSecundario;
	}
}

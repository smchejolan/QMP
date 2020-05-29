package Fabricas;

import Common.*;
import Enums.Material;
import Enums.Tipo;

public class FabricaJohnson implements Fabrica{

	@Override
	public Prenda fabricarParteSuperior() {
		Borrador borrador = new Borrador();
		borrador.seleccionarTipo(Tipo.Camisa);
		borrador.seleccionarMaterial(Material.Algodon);
		borrador.seleccionarColorPrimario(new Color("ffffff"));		
		return borrador.crearPrenda();
	}

	@Override
	public Prenda fabricarParteinferior() {
		Borrador borrador = new Borrador();
		borrador.seleccionarTipo(Tipo.PantalonDeVestir);
		borrador.seleccionarMaterial(Material.Algodon);
		borrador.seleccionarColorPrimario(new Color("000000"));		
		return borrador.crearPrenda();
	}

	@Override
	public Prenda fabricarCalzado() {
		Borrador borrador = new Borrador();
		borrador.seleccionarTipo(Tipo.Zapatos);
		borrador.seleccionarMaterial(Material.Cuero);
		borrador.seleccionarColorPrimario(new Color("000000"));		
		return borrador.crearPrenda();
	}

}

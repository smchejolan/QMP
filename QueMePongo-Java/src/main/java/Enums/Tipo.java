package Enums;
import java.util.*;

import Exceptions.*;

public enum Tipo {
	Zapatos(Categoria.Calzado, Arrays.asList(Material.Cuero,Material.Gamuza)),
	Zapatillas(Categoria.Calzado, Arrays.asList(Material.Cuero, Material.Goma)),
	Remera(Categoria.ParteSuperior, Arrays.asList(Material.Algodon, Material.Tela)),
	Chomba(Categoria.ParteSuperior, Arrays.asList(Material.Algodon, Material.Tela, Material.Pique)),
	Pantalon(Categoria.ParteInferior, Arrays.asList(Material.Cuero, Material.TelaDeJean, Material.Gamuza, Material.Acetato)),
	PantalonDeVestir(Categoria.ParteInferior, Arrays.asList(Material.Algodon, Material.Gamuza, Material.Acetato)),
	Shorts(Categoria.ParteInferior, Arrays.asList(Material.TelaDeJean, Material.Gamuza)),
	Campera(Categoria.ParteSuperior, Arrays.asList(Material.Cuero, Material.TelaDeJean, Material.Gamuza, Material.Lana, Material.Tela)),
	Gorro(Categoria.Accesorios, Arrays.asList(Material.Tela, Material.Lana, Material.Gamuza)),
	Cadena(Categoria.Accesorios, Arrays.asList(Material.Oro, Material.Plata)),
	Camisa(Categoria.ParteSuperior, Arrays.asList(Material.Seda, Material.Algodon)),
	Anteojos(Categoria.Accesorios, Arrays.asList(Material.Vidrio, Material.VidrioSintetico, Material.VidrioSinteticoOscuro))
	;
	public Categoria categoria;
	private List<Material> materialesPermitidos;
	
	private Tipo(Categoria categoria, List<Material> materialesPermitidos) {
		this.categoria = categoria;
		this.materialesPermitidos = materialesPermitidos;		
	}
	
	public Categoria categoria() {
		if(categoria == null) {
			throw new ExcepcionCreacionTipo("El tipo tiene que tener categoria"); 
		}
		
		return this.categoria;
	}
	
	public boolean MaterialValido(Material material) {
		return this.materialesPermitidos.contains(material);	}
}

package clases;

public class ObraVista {
	
	private Obra obra;
	private int vecesVisto;
	private boolean aMedias;
	
	public ObraVista(Obra obra, int vecesVisto, boolean aMedias) {
		super();
		this.obra = obra;
		this.vecesVisto = vecesVisto;
		this.aMedias = aMedias;
	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}

	public int getVecesVisto() {
		return vecesVisto;
	}

	public void setVecesVisto(int vecesVisto) {
		this.vecesVisto = vecesVisto;
	}

	public boolean isaMedias() {
		return aMedias;
	}

	public void setaMedias(boolean aMedias) {
		this.aMedias = aMedias;
	}

	@Override
	public String toString() {
		return obra + "\n\t Numero de veces vista: " + vecesVisto + "\t\naMedias: " + aMedias;
	}
	
	
}


package controller;

import java.util.HashMap;
import java.util.Map;

public class Amenaza {
	
	private String idAmenaza;
	private String nombreAmenaza;
	private String descripcionAmenaza;
	private Map<String, Integer> numeroAtaques;
	

	/**
	 * @param idAmenaza
	 * @param nombreAmenaza
	 * @param descripcionAmenaza
	 * @param numeroAtaques
	 */
	public Amenaza(String idAmenaza, String nombreAmenaza, String descripcionAmenaza) {
		super();
		this.idAmenaza = idAmenaza;
		this.nombreAmenaza = nombreAmenaza;
		this.descripcionAmenaza = descripcionAmenaza;
                   this.numeroAtaques = new HashMap<>();
        }



	/**
	 * @return the idAmenaza
	 */
	public String getIdAmenaza() {
		return idAmenaza;
	}



	/**
	 * @param idAmenaza the idAmenaza to set
	 */
	public void setIdAmenaza(String idAmenaza) {
		this.idAmenaza = idAmenaza;
	}



	/**
	 * @return the nombreAmenaza
	 */
	public String getNombreAmenaza() {
		return nombreAmenaza;
	}



	/**
	 * @param nombreAmenaza the nombreAmenaza to set
	 */
	public void setNombreAmenaza(String nombreAmenaza) {
		this.nombreAmenaza = nombreAmenaza;
	}



	/**
	 * @return the descripcionAmenaza
	 */
	public String getDescripcionAmenaza() {
		return descripcionAmenaza;
	}



	/**
	 * @param descripcionAmenaza the descripcionAmenaza to set
	 */
	public void setDescripcionAmenaza(String descripcionAmenaza) {
		this.descripcionAmenaza = descripcionAmenaza;
	}

	



	public Map<String, Integer> getNumeroAtaques() {
        return numeroAtaques;
		// TODO Auto-generated constructor stub
	}

    /**
     * @return the numeroAtaques
     */
    public void setNumeroAtaques(Map<String, Integer> numeroAtaques) {
        this.numeroAtaques = numeroAtaques;
    }

    public Amenaza() {
             this.numeroAtaques = new HashMap<>();
    }
    
    public Integer evaluarExistAmenaza(String nombre){
       
        return this.numeroAtaques.get(nombre);
        
    }

        
        
}
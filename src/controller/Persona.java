
package controller;

import java.util.HashMap;
import java.util.Map;

public class Persona {

	private String cedula;
	private String nombre;
	private String correoElectronico;
	private String area;
	
        private Map<String, String> listaPersonas;

        
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the correoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * @param correoElectronico the correoElectronico to set
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}

	
	public Persona() {
               this.listaPersonas = new HashMap<>();
                      this.personaDefecto();

        }

	/**
	 * @param cedula
	 * @param nombre
	 * @param correoElectronico
	 * @param area
	 */
	public Persona(String cedula, String nombre, String correoElectronico, String area) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.area = area;
	}
	
     private void personaDefecto(){
        this.listaPersonas.put("cuentaUno@gmail.com", "123456");
        this.listaPersonas.put("cuentaDos@gmail.com", "123456");
          this.listaPersonas.put("cuentaUno@gmail.com", "123456");
        this.listaPersonas.put("cuentaDos@gmail.com", "123456");
    }

    public Map<String, String> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(Map<String, String> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
            
            
	

}
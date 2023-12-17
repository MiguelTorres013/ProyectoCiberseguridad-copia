
package controller;

public class Login {
	
	private String cedula;
	private String password;
	

	/**
	 * @param cedula
	 * @param password
	 */
	public Login(String cedula, String password) {
		super();
		this.cedula = cedula;
		this.password = password;
	}


	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	public Login() {
		// TODO Auto-generated constructor stub
	}

         public Respuesta login(String email, String password){
        Respuesta respuesta =  new Respuesta();
        Persona persona = new Persona();
        String cuentaPersona = persona.getListaPersonas().get(email);
        if(cuentaPersona != null){
            if(password.equals(cuentaPersona)){
                respuesta.setStatus(true);
                respuesta.setMensaje("Se logeo correctamente");
            }else{
                respuesta.setStatus(false);
                respuesta.setMensaje("La contraseña ingresada es incorrecta");
            }

        }else{
            respuesta.setStatus(false);
            respuesta.setMensaje("La cuenta no existe");
        }

        return  respuesta;
    }
        
}
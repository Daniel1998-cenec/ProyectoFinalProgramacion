/*package clases;

import java.time.LocalDate;
import java.util.TreeSet;

public class Usuario {
	
	private String nombre;
	private LocalDate fechaNacimiento;
	private String correo;
	private String contraseña;
	private TreeSet<ObraVista> obraVistas= new TreeSet<ObraVista>();
	
	public Usuario(String nombre, LocalDate fechaNacimiento, String correo, String contraseña,
			TreeSet<ObraVista> obraVistas) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.correo = correo;
		this.contraseña = contraseña;
		this.obraVistas = obraVistas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public TreeSet<ObraVista> getObraVistas() {
		return obraVistas;
	}

	public void setObraVistas(TreeSet<ObraVista> obraVistas) {
		this.obraVistas = obraVistas;
	}

	@Override
	public String toString() {
		return "\tNombre: " + nombre + "\n\tFechaNacimiento: " + fechaNacimiento + "\n\tCorreo: " + correo
				+ "\n\tContraseña: " + contraseña + "\n\tobra Vistas: " + obraVistas;
	}
}*/

package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

import excepciones.ContraseñaInvalidaException;
import excepciones.UsuarioNoExisteException;
import utils.DAO;

public class Usuario {
    private String nick;
    private String email;
   
    public Usuario(String email, String nick, String pass) throws SQLException {
        HashMap<String,Object> cols = new HashMap<String,Object>();
        cols.put("email",email);
        cols.put("nick", nick);
        cols.put("pass", pass);
        DAO.insert("user",cols);
        this.nick = nick;
        this.email = email;
    }
   
    //TODO volver para terminar esto
    public Usuario(String email, String pass) throws UsuarioNoExisteException, SQLException, ContraseñaInvalidaException {
       
        HashMap<String,Object> restricciones = new HashMap<String,Object>();
        LinkedHashSet<String> cols = new LinkedHashSet<String>();
        cols.add("email");
        cols.add("pass");
        cols.add("nick");
        restricciones.put("email", email);
        String contraseniaString = "";
        ArrayList<Object> result = DAO.consultar("user", cols, restricciones);
       
        if (result.isEmpty()) {
            throw new UsuarioNoExisteException("El usuario consultado no existe en la base de datos");
        }else{
            if (result.get(1).getClass() != pass.getClass()) {
                contraseniaString = Integer.toString((int) result.get(1));
            } else {
                contraseniaString = result.get(1) + "";
            }
            if (!contraseniaString.equals(pass)) {
                System.out.println(result);
                throw new ContraseñaInvalidaException("La contraseña introducida no coincide");
            } else {
                this.email = (String) result.get(0);
                this.nick = (String) result.get(2);
            }
           
        }
    }
   
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) throws SQLException {
        HashMap<String,Object> datoActualizar = new HashMap<String,Object>();
        HashMap<String,Object> restricciones = new HashMap<String,Object>();
        datoActualizar.put("nick", nick);
        restricciones.put("email", this.email);
        DAO.actualizar("user", datoActualizar, restricciones);
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws SQLException {
        HashMap<String,Object> datoActualizar = new HashMap<String,Object>();
        HashMap<String,Object> restricciones = new HashMap<String,Object>();
        datoActualizar.put("email", email);
        restricciones.put("email", this.email);
        DAO.actualizar("user", datoActualizar, restricciones);
        this.email = email;
    }
}

package com.daw2.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class Musico implements Serializable {
	//ATRIBUTOS DE LA CLASE
	private static final long serialVersionUID = 1L;
	private String nombre,apellidos,grupo,nick,clave,rclave;
	private List<String> estilos;
	private String[] estilosSeleccionados;
	
	//COSNTRUCTOR DE LA CLASE
	public Musico() {
	
		
	}

	//MÉTODOS DE LA CLASE MÚSICO.
	@PostConstruct
	public void init(){
		estilos=new ArrayList<String>();
		String estilosMusica[]={"Rock & Roll","Electrónica","Pop","Rap","Heavy Metal",
				"HardRock","Rock Alternativo","Country","Otros"};
		for(int i=0;i<estilosMusica.length;i++){
			estilos.add(estilosMusica[i]);
		}
	}//init
	
	public void guardar(){
		FacesMessage message = new FacesMessage("Bienvenido(a) " + nick + "(" + nombre + " " + apellidos + ")",  
		null);
		FacesMessage m2=new FacesMessage( "Grupo Musical: " + grupo + "Estilos Seleccionados: " + estilosSeleccionados.length);
        FacesContext.getCurrentInstance().addMessage(null, message);
        FacesContext.getCurrentInstance().addMessage(null, m2);
		
	}//guardar
	
	//GETTERS & SETTERS DE LOS ATRIBUTOS 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public List<String> getEstilos() {
		return estilos;
	}

	public void setEstilos(List<String> estilos) {
		this.estilos = estilos;
	}

	public String[] getEstilosSeleccionados() {
		return estilosSeleccionados;
	}

	public void setEstilosSeleccionados(String[] estilosSeleccionados) {
		this.estilosSeleccionados = estilosSeleccionados;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getRclave() {
		return rclave;
	}

	public void setRclave(String rclave) {
		this.rclave = rclave;
	}
	
	
}//class

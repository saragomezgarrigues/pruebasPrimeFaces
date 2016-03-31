package com.daw2.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@ManagedBean
@ViewScoped
@Entity
public class Seguidor implements Serializable {
	//ATRIBUTOS DE LA CLASE SEGUIDOR
	private static final long serialVersionUID = 1L;

	private String nombre,apellidos,nickname,correo,password,rpassword;
	private Long id;
	
	//CONSTRUCTOR DE LA CLASE
	public Seguidor() {
	
	}
	
	//PARA HIBERNATE, NUESITAMOS UN CONTRUCTOR CON LOS PARÁMETROS NECESARIOS
	public Seguidor(String nombre, String apellidos, String nickname, String correo, String password) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nickname = nickname;
		this.correo = correo;
		this.password = password;
	}
	
	//MÉTODOS DE LA CLASE 
	public void registro(){
		FacesMessage message = new FacesMessage("Bienvenido(a) " + nickname + "(" + nombre + " " + apellidos + ")",  
				null);
		FacesMessage m2=new FacesMessage("Correo electronico: " + correo);
	    FacesContext.getCurrentInstance().addMessage(null, message);
		FacesContext.getCurrentInstance().addMessage(null,m2);        
	}
	
	
	

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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRpassword() {
		return rpassword;
	}

	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	
}

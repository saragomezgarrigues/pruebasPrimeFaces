package com.daw2.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.UploadedFile;

@ManagedBean
@ViewScoped
public class Seguidor implements Serializable {
	//ATRIBUTOS DE LA CLASE SEGUIDOR
	private static final long serialVersionUID = 1L;

	private String nombre,apellidos,nickname,correo,password,rpassword;
	
	private UploadedFile image;
	//CONSTRUCTOR DE LA CLASE
	public Seguidor() {
	
	}
	
	//MÉTODOS DE LA CLASE 
	public void registro(){
		FacesMessage message = new FacesMessage("Bienvenido(a) " + nickname + "(" + nombre + " " + apellidos + ")",  
				null);
		FacesMessage m2=new FacesMessage("Correo electronico: " + correo);
	    FacesContext.getCurrentInstance().addMessage(null, message);
		FacesContext.getCurrentInstance().addMessage(null,m2); 
		if(image != null) {
            FacesMessage m3 = new FacesMessage("Nombre del fichero subido: " + image.getFileName());
            FacesContext.getCurrentInstance().addMessage(null, m3);
        }
	}//registro
	
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

	public UploadedFile getImage() {
		return image;
	}

	public void setImage(UploadedFile image) {
		this.image = image;
	}
	

	
}

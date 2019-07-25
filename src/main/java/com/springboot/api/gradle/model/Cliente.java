package com.springboot.api.gradle.model;

public class Cliente {
	
	private Integer id;
	private String nombres;
	private String apellido_pat;
	private String apellido_mat;
	private String sexo;
	private String direccion;
	private String estado;
		
	public Cliente() {
		
	}
	
	public Cliente(Integer id, String nombres, String apellido_pat, String apellido_mat, String sexo,
			String direccion, String estado) {
	
		this.id = id;
		this.nombres = nombres;
		this.apellido_pat = apellido_pat;
		this.apellido_mat = apellido_mat;
		this.sexo = sexo;
		this.direccion = direccion;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido_pat() {
		return apellido_pat;
	}

	public void setApellido_pat(String apellido_pat) {
		this.apellido_pat = apellido_pat;
	}

	public String getApellido_mat() {
		return apellido_mat;
	}

	public void setApellido_mat(String apellido_mat) {
		this.apellido_mat = apellido_mat;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombres=" + nombres + ", apellido_pat=" + apellido_pat + ", apellido_mat="
				+ apellido_mat + ", sexo=" + sexo + ", direccion=" + direccion + ", estado=" + estado + "]";
	}

	
	
}

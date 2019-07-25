package com.springboot.api.gradle.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springboot.api.gradle.model.Cliente;

public class ClienteRowMapper implements RowMapper<Cliente>{

	@Override
	public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cliente cliente = new Cliente();
		
		cliente.setId(rs.getInt("id"));
		cliente.setNombres(rs.getString("nombres"));
		cliente.setApellido_pat(rs.getString("apellido_pat"));
		cliente.setApellido_mat(rs.getString("apellido_mat"));
		cliente.setSexo(rs.getString("sexo"));
		cliente.setDireccion(rs.getString("direccion"));
		cliente.setEstado(rs.getString("estado"));
		
		return cliente;
	}

}

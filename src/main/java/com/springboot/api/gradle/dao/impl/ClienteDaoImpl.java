package com.springboot.api.gradle.dao.impl;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.springboot.api.gradle.dao.ClienteDao;
import com.springboot.api.gradle.model.Cliente;
import com.springboot.api.gradle.rowmapper.ClienteRowMapper;

@Repository
public class ClienteDaoImpl extends JdbcDaoSupport implements ClienteDao {

	public ClienteDaoImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}
	
	@Override
	public List<Cliente> getAllClientes() {
		logger.debug("::::: Mensaje de prueba :::::::");
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		
		String sql = " SELECT id, nombres, apellido_pat, apellido_mat, sexo, direccion, estado\n" + 
				" FROM api_test.cliente";
		
		try {
			
			RowMapper<Cliente> clienteRow = new ClienteRowMapper();
			listaClientes = getJdbcTemplate().query(sql, clienteRow);
			logger.debug("Se han listado "+listaClientes.size()+" personas");
					
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return listaClientes;
	}

	@Override
	public Cliente getCliente(Integer id) {
		logger.debug("::::: Mensaje de prueba :::::::");
		Cliente cliente = new Cliente();	
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		
		String sql = " SELECT id, nombres, apellido_pat, apellido_mat, sexo, direccion, estado\n" + 
				" FROM api_test.cliente where id='"+id+"'";
				
		try {
			
			RowMapper<Cliente> clienteRow = new ClienteRowMapper();
			listaClientes = getJdbcTemplate().query(sql, clienteRow);
			
			cliente = listaClientes.get(0);
			
			logger.debug("Se ha traido a la persona "+listaClientes.get(0).toString());
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return cliente;
	}

	@Override
	public void saveCliente(Cliente cliente) {
		
		String sql = "insert into api_test.cliente (nombres, apellido_pat, apellido_mat, sexo, direccion, estado) "  
				+ "values (?, ?, ?, ?, ?, ?);";
		
		Object[] params = { cliente.getNombres(), cliente.getApellido_pat(), cliente.getApellido_mat(), cliente.getSexo(), cliente.getDireccion(), cliente.getEstado()};
		int[] tipos = { Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR};
		
		try {
			
			int filas = getJdbcTemplate().update(sql, params,tipos);
			
			logger.debug("Se han insertado : "+filas+" filas");
			logger.debug("Se ha registrado a la persona "+cliente.toString());
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}

	}

	@Override
	public void deleteCliente(Integer id) {
		int regeliminados = 0;		
		String sql = " delete from cliente where id ='"+id+"'";		
		try {			
			regeliminados = getJdbcTemplate().update(sql);
			logger.debug("Se han eliminado "+regeliminados+" persona con id = "+id);
		} catch (Exception e) {			
			logger.error(e.getMessage());
		}
	}

}

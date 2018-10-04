package com.hazloakki.negocio.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hazloakki.negocio.modelo.NegocioDto;

/**
 * @author Jovani Arzate 
 * 2018-07-01 
 * HazloAkki para Empresas v.1
 *
 */

public interface NegocioRepository {

	String guardar(NegocioDto negocioDto);
	NegocioDto findById(String idNegocio);
	List<NegocioDto> findByIdCuentaAndEstatus(String idCuenta, boolean estatus);
	void actualizarByIdNegocio(String idNegocio, NegocioDto negocioDto);
	void eliminarByIdNegocio(String idNegocio);
}

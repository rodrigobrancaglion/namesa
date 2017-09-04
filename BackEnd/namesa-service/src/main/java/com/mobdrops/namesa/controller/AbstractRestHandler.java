package com.mobdrops.namesa.controller;

import java.sql.SQLException;
import java.util.zip.DataFormatException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.RestClientException;
import org.springframework.web.context.request.WebRequest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mobdrops.namesa.domain.RestErrorInfo;
import com.mobdrops.namesa.exception.CodAcessException;
import com.mobdrops.namesa.exception.MsgErroFluxoException;
import com.mobdrops.namesa.exception.ProcedureException;
import com.mobdrops.namesa.exception.ResourceNotFoundException;

/**
 * Esta classe é para ser estendido por todos os "controladores" de recursos
 * REST. Ele contém mapeamento de exceção e outras funcionalidades de REST API
 *
 */
public abstract class AbstractRestHandler implements ApplicationEventPublisherAware {

	protected final Logger log = LoggerFactory.getLogger(this.getClass());
	protected ApplicationEventPublisher eventPublisher;

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(DataFormatException.class)
	@ResponseBody
	public RestErrorInfo handleDataStoreException(DataFormatException ex, WebRequest request, HttpServletResponse response) {
		log.info("Data Store exception to RestResponse : " + ex.getMessage());

		return new RestErrorInfo(ex, "Verificar formato do dado");
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseBody
	public RestErrorInfo handleIllegalArgumentException(IllegalArgumentException ex, WebRequest request, HttpServletResponse response) {
		log.info("IllegalArgument exception to RestResponse : " + ex.getMessage());

		return new RestErrorInfo(ex, "Verificar formato do dado");
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(SQLException.class)
	@ResponseBody
	public RestErrorInfo handleSQLException(SQLException ex, WebRequest request, HttpServletResponse response) {
		log.info("SQL exception to RestResponse : " + ex.getMessage());

		return new RestErrorInfo(ex, "Verificar formato do dado");
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ProcedureException.class)
	@ResponseBody
	public RestErrorInfo handleProcedureException(ProcedureException ex, WebRequest request, HttpServletResponse response) {
		log.info("Procedure exception to RestResponse : " + ex.getMessage());

		return new RestErrorInfo(ex, "Verificar formato do dado");
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseBody
	public RestErrorInfo handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest request, HttpServletResponse response) {
		log.info("ResourceNotFoundException handler:" + ex.getMessage());

		return new RestErrorInfo(ex, "Desculpe, Não foi possivel encontrar informação");
	}

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(CodAcessException.class)
	@ResponseBody
	public RestErrorInfo handleCodAcessException(CodAcessException ex, WebRequest request, HttpServletResponse response) {
		log.info("CodAcessException handler:" + ex.getMessage());
		return new RestErrorInfo(ex);
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MsgErroFluxoException.class)
	@ResponseBody
	public RestErrorInfo handleMsgErroFluxoException(MsgErroFluxoException ex, WebRequest request, HttpServletResponse response) {
		log.info("MsgErroFluxoException handler:" + ex.getMessage());
		return new RestErrorInfo(ex);
	}

	@ExceptionHandler(RestClientException.class)
	@ResponseBody
	public RestErrorInfo handleRestClientException(RestClientException ex, WebRequest request, HttpServletResponse response) {
		log.info("RestClientException handler:" + ex.getMessage());
		return new RestErrorInfo(ex);
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(JsonProcessingException.class)
	@ResponseBody
	public RestErrorInfo handleJsonProcessingException(JsonProcessingException ex, WebRequest request, HttpServletResponse response) {
		log.info("JsonProcessingException handler:" + ex.getMessage());
		return new RestErrorInfo(ex);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.eventPublisher = applicationEventPublisher;
	}

	// todo: replace with exception mapping
	public static <T> T checkResourceFound(final T resource) {
		if (resource == null) {
			throw new ResourceNotFoundException("Recurso não encontrado.");
		}
		return resource;
	}

}

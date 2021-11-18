package com.example.usuarios.entidades;
import java.math.BigInteger;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatosOpinion {
	
	private String apiToken;
	private int idAccount;
	private DTOOpi opi;
	private String[] answers;
	private List<DTOParams> params;
	
	public String getApiToken() {
		return apiToken;
	}
	public void setApiToken(String apiToken) {
		this.apiToken = apiToken;
	}
	public int getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
	public DTOOpi getOpi() {
		return opi;
	}
	public void setOpi(DTOOpi opi) {
		this.opi = opi;
	}
	public String[] getAnswers() {
		return answers;
	}
	public void setAnswers(String[] answers) {
		this.answers = answers;
	}
	public List<DTOParams> getParams() {
		return params;
	}
	public void setParams(List<DTOParams> params) {
		this.params = params;
	}

}

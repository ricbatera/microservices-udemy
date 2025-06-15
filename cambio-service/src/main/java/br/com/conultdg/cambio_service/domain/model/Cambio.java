package br.com.conultdg.cambio_service.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Cambio  implements Serializable{	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String from;
	private String to;
	private BigDecimal convertionFactor;
	private BigDecimal convertedValue;
	private String environment;
	public Cambio(Long id, String from, String to, BigDecimal convertionFactor, BigDecimal convertedValue,
			String environment) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.convertionFactor = convertionFactor;
		this.convertedValue = convertedValue;
		this.environment = environment;
	}
	public Cambio() {}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConvertionFactor() {
		return convertionFactor;
	}
	public void setConvertionFactor(BigDecimal convertionFactor) {
		this.convertionFactor = convertionFactor;
	}
	public BigDecimal getConvertedValue() {
		return convertedValue;
	}
	public void setConvertedValue(BigDecimal convertedValue) {
		this.convertedValue = convertedValue;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	@Override
	public int hashCode() {
		return Objects.hash(convertedValue, convertionFactor, environment, from, id, to);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cambio other = (Cambio) obj;
		return Objects.equals(convertedValue, other.convertedValue)
				&& Objects.equals(convertionFactor, other.convertionFactor)
				&& Objects.equals(environment, other.environment) && Objects.equals(from, other.from)
				&& Objects.equals(id, other.id) && Objects.equals(to, other.to);
	}
	

}

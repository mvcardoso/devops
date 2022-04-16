package com.marcus.helpdesk.domain.enums;

public enum Status {

	ABERTO(0, "ROLE_BAIXA"),
	ANDAMENTO(1, "ROLE_MEDIA"),
	FECHADO(2, "ROLE_ALTA");
	
	private Integer codigo;
	private String descricao;
	private Status(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	
	
	public static Status toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (Status x : Status.values()) {
			if (cod.equals(x.getCodigo())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Prioridade inválida");
	}
}

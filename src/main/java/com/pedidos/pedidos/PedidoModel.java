package com.pedidos.pedidos;

public class PedidoModel {
	
		private Long id;
	    private Long userId;
	    private String descricao;
		
	    public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		
	

}

package com.spaceberger;

public enum Direcao {
	
	NORTE("norte"), 
	SUL("sul"), 
	LESTE("leste"), 
	OESTE("oeste");
	
	
	private String direcao;
	
	private Direcao(String direcao) {
		this.direcao = direcao;
	}
	
	public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }
	

}

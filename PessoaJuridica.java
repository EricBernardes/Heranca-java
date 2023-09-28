class PessoaJuridica extends Pessoa{
	private String cnpj;
	
	public void setCnpj(String novoCnpj){
		cnpj= novoCnpj;
	}

	public String getCnpj(){
		return cnpj;
	}
}
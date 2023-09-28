public class TestaPessoa{
	public static void main(String[] args){
		PessoaJuridica pj= new PessoaJuridica();
		pj.setNome("Faz Tudo-LTDA");
		pj.setCnpj("11.222.333/0001-44");
		System.out.println(pj.getNome());
		System.out.println(pj.getCnpj());
		PessoaFisica pf= new PessoaFisica();
		pf.setNome("Fulano");
		pf.setCpf("111.222.333-44");
		System.out.println(pf.getNome());
		System.out.println(pf.getCpf());
	}
}
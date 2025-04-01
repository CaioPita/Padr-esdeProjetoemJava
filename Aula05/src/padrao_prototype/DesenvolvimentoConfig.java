package padrao_prototype;

public class DesenvolvimentoConfig extends AmbienteConfig {

	public DesenvolvimentoConfig(String url, String usuario, String senha, int timeoutSegundos, boolean logDetalhado) {
		super(url, usuario, senha, timeoutSegundos, logDetalhado);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void exibirInfo() {
		System.out.println("Ambiente de Desenvolvimento: ");
		System.out.println("URL:" + getUrl());
		System.out.println("Usuário: " + getUsuario());
		System.out.println("Timeout: " + getTimeoutSegundos()+ "s");
		System.out.println("Log Detalhado: " + isLogDetalhado());
		System.out.println("--------------------------------");
	}

}

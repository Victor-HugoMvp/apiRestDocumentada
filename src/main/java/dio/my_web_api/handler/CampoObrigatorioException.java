package dio.my_web_api.handler;

public class CampoObrigatorioException extends BussinesException {
    public CampoObrigatorioException(String campo) {
        super("O campo %s é obrigatório", campo);
    }
}

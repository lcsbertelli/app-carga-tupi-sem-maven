package app.carga.tupi.sem.maven.excecoes;

/**
 *
 * @author lucas
 */
// Excecao Logica da App, deve trata-la descartando o registro que esta sendo lido.
// Excecao que TU lido do arquivo é maior (dia seguinte) 00:00:00
public class TUmaiorQMeiaNoiteException extends Exception {

    /**
     * Creates a new instance of <code>TUmaiorQMeiaNoiteException</code> without
     * detail message.
     */
    public TUmaiorQMeiaNoiteException() {
    }

    /**
     * Constructs an instance of <code>TUmaiorQMeiaNoiteException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public TUmaiorQMeiaNoiteException(String msg) {
        super("Excecao Logica da App, deve trata-la descartando o registro que esta sendo lido:" + msg);
    }
}


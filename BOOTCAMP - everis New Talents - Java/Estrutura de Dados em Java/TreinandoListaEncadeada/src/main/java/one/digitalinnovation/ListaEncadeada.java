package one.digitalinnovation;

public class ListaEncadeada<T> {

    private No<T> referenciaEntradda;

    public ListaEncadeada(){
        this.referenciaEntradda = null;
    }

    public boolean isEmpty(){
        return referenciaEntradda == null ? true : false;
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntradda;

        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    public void add(T conteudo){
        No<T> novoNo = new No(conteudo);
        if (this.isEmpty()){
            referenciaEntradda = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntradda;
        for (int i = 0; i < this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    private void validaIndice(int index){
        if (index >= size()){
            int ultimoIndice = size() -1;
            throw new IndexOutOfBoundsException("Não existe conteudo no indice "+ index + " desta lista. Esta lista só vai até o indice "+ ultimoIndice);
        }
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){

        validaIndice(index);

        No<T> noAuxiliar = referenciaEntradda;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;
    }

    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if (index == 0){
            referenciaEntradda = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }

        No<T> noAnterior = getNo( index -1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    @Override
    public String toString() {

        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntradda;

        for (int i = 0; i < this.size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]---->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        strRetorno += "Null";

        return strRetorno;

    }
}

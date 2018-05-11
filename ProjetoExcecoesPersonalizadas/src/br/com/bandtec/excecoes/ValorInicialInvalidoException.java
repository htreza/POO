
package br.com.bandtec.excecoes;

//extende da classe padrão do Java Exception
public class ValorInicialInvalidoException  extends Exception{
    
    @Override 
    //sobrescrita do metodo getMessage do Exception
    public String getMessage(){
        return "O cofre não pode ser criado com valor negativo";
    }
    
}

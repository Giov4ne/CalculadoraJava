package controle;

public class Formatador {
    
    public int converterStringParaInteiro(String string){
        try{
            return Integer.parseInt(string);
        } catch(NumberFormatException e){
            return 0;
        }
    }
    
    public String converterInteiroParaString(int inteiro){
        return Integer.toString(inteiro);
    }
    
}
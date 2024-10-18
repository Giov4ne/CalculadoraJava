package controle;
import javax.swing.JOptionPane;

public class Calculadora {
    private int total;
    
    public Calculadora(){
        zerar();
    }
    
    public int realizarOperacao(Operacoes operacao, int valor){
        switch(operacao){
            case SOMA:
                total += valor;
                break;
            case SUBTRACAO:
                total -= valor;
                break;
            case MULTIPLICACAO:
                total *= valor;
                break;
            case DIVISAO:
                try{
                    total /= valor;
                } catch(ArithmeticException e){
                    zerar();
                    JOptionPane.showMessageDialog(null, "Impossível dividir por zero!", "Alerta", JOptionPane.WARNING_MESSAGE);
                }
                break;
        }
        System.out.println(getTotal());
        return total;
    }
    
    public int getTotal(){
        return total;
    }
    
    public void zerar(){
        total = 0;
    }
}
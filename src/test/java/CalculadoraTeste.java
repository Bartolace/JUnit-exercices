import br.com.alura.tdd.Calculadora;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class CalculadoraTeste {

    @Test
    public void deveriaSomarDoisNumerosPositivos (){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 3);

        Assert.assertEquals(6, soma);
    }
}

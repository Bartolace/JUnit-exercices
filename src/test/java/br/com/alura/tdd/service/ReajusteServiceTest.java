package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class ReajusteServiceTest {
    @Test
    public void reajusteDeveriaSerDeTresPorCento (){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal(1000));

        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"),funcionario.getSalario());
    }
    @Test
    public void reajusteDeveriaSerQuinzePorCento (){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Laura", LocalDate.now(), new BigDecimal(2000));

        service.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("2300.00"),funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerVintePorCento (){
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Maria Aparecida", LocalDate.now(), new BigDecimal(7000));

        service.concederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("8400.00"),funcionario.getSalario());
    }

}

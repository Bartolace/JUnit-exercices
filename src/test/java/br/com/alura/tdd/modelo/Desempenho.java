package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
    A_DESEJAR{
        @Override
        public BigDecimal getPercentualReajuste(){
            return new BigDecimal("0.03");
        }
    },
    BOM{
        @Override
        public BigDecimal getPercentualReajuste(){
            return new BigDecimal("0.15");
        }
    },
    OTIMO{
        @Override
        public BigDecimal getPercentualReajuste(){
            return new BigDecimal("0.2");
        }
    };

    public abstract BigDecimal getPercentualReajuste();
}

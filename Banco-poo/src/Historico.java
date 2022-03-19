public class Historico {
    private String ultimaMovimentacao;
    private String dataMovimentacao;
    private Double valor;
    private Integer conta;

    public Historico(String ultimaMovimentacao, String dataMovimentacao, Double valor, Integer conta) {
        this.ultimaMovimentacao = ultimaMovimentacao;
        this.dataMovimentacao = dataMovimentacao;
        this.valor = valor;
        this.conta = conta;

    }

    public String getUltimaMovimentacao() {
        return ultimaMovimentacao;
    }

    public void setUltimaMovimentacao(String ultimaMovimentacao) {
        this.ultimaMovimentacao = ultimaMovimentacao;
    }

    public String getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(String dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }
}

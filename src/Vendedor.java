public class Vendedor extends Empregado {
    private float percentualComissao;

    public Vendedor(String nome, float salario, float percentualComissao) {
        this.setNome(nome);
        this.setSalario(salario);
        this.percentualComissao = percentualComissao;
    }

    public float getPercentualComissao() {
        return this.percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public float calcularSalario() {
        return (this.getSalario() + this.percentualComissao);
    }

    @Override
    public String toString() {
        return "{" +
            " Nome='" + getNome() + "'" +
            ", Salario Sem Comissão='" + getSalario() + "'" +
            ", Salario Com Comissão='" + calcularSalario() + "'" +
            "}";
    }

    
}

public class Empregado {
    private String nome;
    protected float salario;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "{" +
            " Nome='" + getNome() + "'" +
            ", Salario='" + getSalario() + "'" +
            "}";
    }
    
}
public class Gerente extends Empregado {
    private String departamento;

    public Gerente(String nome, float salario, String departamento) {
        this.setNome(nome);
        this.setSalario(salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "{" +
            " Nome='" + getNome() + "'" +
            ", Salario='" + getSalario() + "'" +
            ", Departamento='" + getDepartamento() + "'" +
            "}";
    }

}

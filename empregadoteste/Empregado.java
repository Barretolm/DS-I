
package empregadoteste;


public class Empregado {
    private int codigo;
    private String nome;
    private String sobrenome;
    private double salariomensal;
    private double salarioanual;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalariomensal() {
        return salariomensal;
    }

    public void setSalariomensal(double salariomensal) {
        this.salariomensal = salariomensal;
    }

    public double getSalarioanual() {
        return this.salarioanual = salariomensal * 12;
    }

    public void setSalarioanual(double salarioanual) {
        this.salarioanual = salarioanual;
    }
    
    
    
}

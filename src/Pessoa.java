public class Pessoa {
    public String nome;
    public int anoNascimento;
    public double peso;
    public double altura;

    public double calcularIMC() {
        return this.peso/(this.altura * this.altura);
    }

    public int calcularIdade() {
        return 2024 - this.anoNascimento;
    }

    public double calcularQuantidadeAguaDiaria() {
        return (35 * this.peso) / 1000;
    }

    public void mostrarTudo() {
        System.out.println("Nome: " + this.nome + "\nAno de nascimento: " + this.anoNascimento + "\nPeso: " + this.peso + "\nAltura: " + this.altura);
    }
}

public class InvestimentoService {
  
  String investimento(double valorInvestido, int juros, int meses) {
    double taxaJuros = (double) juros / 100;

    // * valorFinal = valorInvestido * (1 + taxaJuros) ^ tempo

    double valorFinal = valorInvestido * Math.pow(1 + taxaJuros, meses);

    // TODO: A função Math.pow() retorna a base elevada ao expoente power, ou seja, baseexpoente.

    return String.format("%,.2f", valorFinal);
  }

}

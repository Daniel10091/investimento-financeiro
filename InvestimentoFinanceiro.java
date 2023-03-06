public class InvestimentoFinanceiro {
  
  private String investimento;
  private int taxaJuros;

  public InvestimentoFinanceiro() {}

  public InvestimentoFinanceiro(String investmentimento, int taxaJuro) {
    this.investimento = investmentimento;
    this.taxaJuros = taxaJuro;
  }
  
  String getInvestmento() {
    double investimentoFormat = Double.parseDouble(investimento);
    return String.format("%,.2f", investimentoFormat);
  }

  void setInvestimento(String investmento) {
    this.investimento = investmento;
  }

  int getTaxaJuros() {
    return taxaJuros;
  }

  void setTaxaJuros(int taxaJuro) {
    this.taxaJuros = taxaJuro;
  }

}

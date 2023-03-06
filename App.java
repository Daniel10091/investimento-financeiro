import javax.swing.JOptionPane;

public class App {

  public static void main(String[] args) {

    InvestimentoFinanceiro investimentoFinanceiro = new InvestimentoFinanceiro();
    InvestimentoService investimentoService = new InvestimentoService();

    // InputDialogInFrame frame = new InputDialogInFrame();
    // String m = JOptionPane.showInputDialog(frame, "");
    // if (m.isEmpty()) {
    //   frame.closeIt();
    // }
    
    int yesOption;
    
    String investimento = JOptionPane.showInputDialog("Quanto deseja investir?");
    String taxaJuros = JOptionPane.showInputDialog("Qual a taxa de juros mensal?");

    do {
      
      String anosInvestindo = JOptionPane.showInputDialog("Quanto meses de investimento?");
        
      investimentoFinanceiro.setInvestimento(investimento);
      investimentoFinanceiro.setTaxaJuros(Integer.parseInt(taxaJuros));

      String anosFormater = (Integer.parseInt(anosInvestindo) > 1) ? "meses" : "mês";

      String resultado = "O valor investido de R$" + 
        investimentoFinanceiro.getInvestmento() + 
        " com juros de " +
        taxaJuros + 
        "% ao mês após " + 
        anosInvestindo + 
        " " + 
        anosFormater + 
        " será de R$" + 
        investimentoService.investimento(
          Double.parseDouble(investimento), 
          Integer.parseInt(taxaJuros), 
          Integer.parseInt(anosInvestindo)
        ) + 
        "\n" + 
        "Deseja simular com um periodo de tempo diferente?";

        yesOption = JOptionPane.showConfirmDialog(null, resultado, "Simulação de investimanto", 0);

    } while (yesOption != 1);

  }

}
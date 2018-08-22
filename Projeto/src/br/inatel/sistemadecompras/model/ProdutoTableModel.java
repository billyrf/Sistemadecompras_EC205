package br.inatel.sistemadecompras.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProdutoTableModel extends AbstractTableModel {

    private List<Produtos> dados = new ArrayList<>();
    private String[] colunas = {"Tipo", "Nome", "Preço", "Descrição"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {

        switch (coluna) {
            case 0:
                return dados.get(linha).getTipo();
            case 1:
                return dados.get(linha).getNome();
            case 2:
                return dados.get(linha).getValor();
            case 3:
                return dados.get(linha).getDescricao();
        }

        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {

        switch (coluna) {
            case 0:
                dados.get(linha).setTipo((String) valor);
                break;
            case 1:
                dados.get(linha).setNome((String) valor);
                break;
            case 2:
                dados.get(linha).setValor((double) valor);
                break;
            case 3:
                dados.get(linha).setDescricao((String) valor);
                break;
        }

        this.fireTableRowsUpdated(linha, linha);
    }

    //Adiciona na lista de dados para posteriormente colocar na tabela
    public void addRow(Produtos p) {
        this.dados.add(p);
        this.fireTableDataChanged();
    }

    //Limpa a lista de dados, pois irá ler através do arquivo para colocar na tabela
    public void clearDados() {
        this.dados.clear();
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
}

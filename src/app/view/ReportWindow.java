package app.view;

import app.domain.CaseSimilarity;
import app.util.ImageUtil;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ReportWindow extends JFrame
{

    public ReportWindow() 
    {
        initComponents();
        uiSetup();
    }
    
    private void uiSetup()
    {
        setIconImage(new ImageUtil().loadIcon("icons/actions_32x32/report.png").getImage());
    }
    
    private void clearCasesTable()
    {
        DefaultTableModel tableModel = (DefaultTableModel) casesTable.getModel();
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
    }
    
    protected void updateCasesTable(List<CaseSimilarity> casesSimilarity)
    {
        clearCasesTable();
        DefaultTableModel tableModel = (DefaultTableModel) casesTable.getModel();
        casesSimilarity.stream().forEach((caseSimilarity) -> 
        {
            tableModel.addRow(new Object[]
            {
                caseSimilarity.getSimilarCase().getFixedAcidity(),
                caseSimilarity.getSimilarCase().getVolatileAcidity(),
                caseSimilarity.getSimilarCase().getCitricAcid(),
                caseSimilarity.getSimilarCase().getResidualSugar(),
                caseSimilarity.getSimilarCase().getChlorides(),
                caseSimilarity.getSimilarCase().getFreeSulfurDioxide(),
                caseSimilarity.getSimilarCase().getTotalSulfurDioxide(),
                caseSimilarity.getSimilarCase().getDensity(),
                caseSimilarity.getSimilarCase().getPh(),
                caseSimilarity.getSimilarCase().getSulphates(),
                caseSimilarity.getSimilarCase().getAlcohol(),
                caseSimilarity.getSimilarCase().getQuality(),
                caseSimilarity.getSimilarity()
            });
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        casesTableScrollpane = new javax.swing.JScrollPane();
        casesTable = new javax.swing.JTable();

        setTitle("Report");

        casesTableScrollpane.setBorder(null);

        casesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fixed Acidity", "Volatile Acidity", "Citric Acidity", "Residual Sugar", "Chlorides", "Free Sulfur Dioxide", "Total Sulfur Dioxide", "Density", "pH", "Sulphates", "Alcohol", "Quality", "Similarity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        casesTableScrollpane.setViewportView(casesTable);

        getContentPane().add(casesTableScrollpane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable casesTable;
    private javax.swing.JScrollPane casesTableScrollpane;
    // End of variables declaration//GEN-END:variables
}

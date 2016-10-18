package app.view;

import app.domain.Case;
import app.domain.CaseAttributeWeight;
import app.domain.WineQualityCbr;
import app.util.ImageUtil;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class MainWindow extends JFrame
{

    private final ReportWindow reportWindow;
    private final WineQualityCbr wineQualityCbr;
    
    public MainWindow()
    {
        initComponents();
        uiSetup();
        listenersSetup();
        
        reportWindow = new ReportWindow();
        wineQualityCbr = new WineQualityCbr();
    }
    
    private void uiSetup()
    {
        setIconImage(new ImageUtil().loadIcon("icons/wine-app.png").getImage());
        
        // Centers the text on the JSpinners
        for (Object object : inputPanel.getComponents()) 
        {
            if (object instanceof JSpinner)
            {
                JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor)((JSpinner) object).getEditor();
                spinnerEditor.getTextField().setHorizontalAlignment(JTextField.CENTER);
            }
        }
        
        // Initializes the default value of the weights combo boxes
        fixedAcidityWeightCbox.setSelectedIndex(3);
        volatileAcidityWeightCbox.setSelectedIndex(3);
        citricAcidityWeightCbox.setSelectedIndex(3);
        residualSugarWeightCbox.setSelectedIndex(5);
        chloridesWeightCbox.setSelectedIndex(1);
        freeSulfurDioxideWeightCbox.setSelectedIndex(1);
        totalSulfurDioxideWeightCbox.setSelectedIndex(1);
        densityWeightCbox.setSelectedIndex(1);
        phWeightCbox.setSelectedIndex(6);
        sulphatesWeightCbox.setSelectedIndex(1);
        alcoholWeightCbox.setSelectedIndex(5);
    }
    
    private void listenersSetup()
    {
        addWindowListener(new WindowAdapter()
        {

            @Override
            public void windowClosing(WindowEvent e) 
            {
                mnuQuit.doClick();
            }
           
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        inputPanel = new javax.swing.JPanel();
        fixedAcidityLabel = new javax.swing.JLabel();
        volatileAcidityLabel = new javax.swing.JLabel();
        citricAcidityLabel = new javax.swing.JLabel();
        residualSugarLabel = new javax.swing.JLabel();
        fixedAciditySpinner = new javax.swing.JSpinner();
        volatileAciditySpinner = new javax.swing.JSpinner();
        citricAciditySpinner = new javax.swing.JSpinner();
        residualSugarSpinner = new javax.swing.JSpinner();
        chloridesLabel = new javax.swing.JLabel();
        chloridesSpinner = new javax.swing.JSpinner();
        freeSulfurDioxideLabel = new javax.swing.JLabel();
        freeSulfurDioxideSpinner = new javax.swing.JSpinner();
        totalSulfurDioxideLabel = new javax.swing.JLabel();
        totalSulfurDioxideSpinner = new javax.swing.JSpinner();
        densityLabel = new javax.swing.JLabel();
        densitySpinner = new javax.swing.JSpinner();
        sulphatesLabel = new javax.swing.JLabel();
        phSpinner = new javax.swing.JSpinner();
        phLabel = new javax.swing.JLabel();
        sulphatesSpinner = new javax.swing.JSpinner();
        alcoholLabel = new javax.swing.JLabel();
        alcoholSpinner = new javax.swing.JSpinner();
        volatileAcidityWeightCbox = new javax.swing.JComboBox<>();
        citricAcidityWeightCbox = new javax.swing.JComboBox<>();
        totalSulfurDioxideWeightCbox = new javax.swing.JComboBox<>();
        fixedAcidityWeightCbox = new javax.swing.JComboBox<>();
        residualSugarWeightCbox = new javax.swing.JComboBox<>();
        chloridesWeightCbox = new javax.swing.JComboBox<>();
        densityWeightCbox = new javax.swing.JComboBox<>();
        phWeightCbox = new javax.swing.JComboBox<>();
        alcoholWeightCbox = new javax.swing.JComboBox<>();
        freeSulfurDioxideWeightCbox = new javax.swing.JComboBox<>();
        sulphatesWeightCbox = new javax.swing.JComboBox<>();
        btnProcess = new javax.swing.JButton();
        mainMnu = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuProcess = new javax.swing.JMenuItem();
        mnuQuit = new javax.swing.JMenuItem();
        mnuTools = new javax.swing.JMenu();
        mnuReport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Red Wine Quality");
        setMaximumSize(new java.awt.Dimension(550, 260));
        setMinimumSize(new java.awt.Dimension(550, 260));
        setPreferredSize(new java.awt.Dimension(550, 260));
        setResizable(false);

        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Input"));
        inputPanel.setLayout(new java.awt.GridBagLayout());

        fixedAcidityLabel.setText("Fixed Acidity");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        inputPanel.add(fixedAcidityLabel, gridBagConstraints);

        volatileAcidityLabel.setText("Volatile Acidity");
        volatileAcidityLabel.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        inputPanel.add(volatileAcidityLabel, gridBagConstraints);

        citricAcidityLabel.setText("Citric Acidity");
        citricAcidityLabel.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        inputPanel.add(citricAcidityLabel, gridBagConstraints);

        residualSugarLabel.setText("Residual Sugar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        inputPanel.add(residualSugarLabel, gridBagConstraints);

        fixedAciditySpinner.setModel(new javax.swing.SpinnerNumberModel(4.6d, 4.6d, 15.9d, 0.1d));
        fixedAciditySpinner.setToolTipText("Min: 4.6 - Max: 15.9");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 5);
        inputPanel.add(fixedAciditySpinner, gridBagConstraints);

        volatileAciditySpinner.setModel(new javax.swing.SpinnerNumberModel(0.12d, 0.12d, 1.5800000429153442d, 0.001d));
        volatileAciditySpinner.setToolTipText("Min: 0.12 - Max: 1.58");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 5);
        inputPanel.add(volatileAciditySpinner, gridBagConstraints);

        citricAciditySpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1.0d, 0.01d));
        citricAciditySpinner.setToolTipText("Min: 0 - Max: 1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 5);
        inputPanel.add(citricAciditySpinner, gridBagConstraints);

        residualSugarSpinner.setModel(new javax.swing.SpinnerNumberModel(0.8999999761581421d, 0.8999999761581421d, 13.9d, 0.01d));
        residualSugarSpinner.setToolTipText("Min: 0.9 - Max: 13.9");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 5);
        inputPanel.add(residualSugarSpinner, gridBagConstraints);

        chloridesLabel.setText("Chlorides");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        inputPanel.add(chloridesLabel, gridBagConstraints);

        chloridesSpinner.setModel(new javax.swing.SpinnerNumberModel(0.012d, 0.012d, 0.611d, 0.001d));
        chloridesSpinner.setToolTipText("Min: 0.012 - Max: 0.611");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 5);
        inputPanel.add(chloridesSpinner, gridBagConstraints);

        freeSulfurDioxideLabel.setText("Free Sulfur Dioxide");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        inputPanel.add(freeSulfurDioxideLabel, gridBagConstraints);

        freeSulfurDioxideSpinner.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 72.0d, 0.5d));
        freeSulfurDioxideSpinner.setToolTipText("Min: 7 - Max: 72");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 5);
        inputPanel.add(freeSulfurDioxideSpinner, gridBagConstraints);

        totalSulfurDioxideLabel.setText("Total Sulfur Dioxide");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        inputPanel.add(totalSulfurDioxideLabel, gridBagConstraints);

        totalSulfurDioxideSpinner.setModel(new javax.swing.SpinnerNumberModel(6.0d, 6.0d, 289.0d, 0.5d));
        totalSulfurDioxideSpinner.setToolTipText("Min: 6 - Max: 289");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 5);
        inputPanel.add(totalSulfurDioxideSpinner, gridBagConstraints);

        densityLabel.setText("Density");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        inputPanel.add(densityLabel, gridBagConstraints);

        densitySpinner.setModel(new javax.swing.SpinnerNumberModel(0.99d, 0.99d, 1.0d, 0.001d));
        densitySpinner.setToolTipText("Min: 0.99 - Max: 1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 5);
        inputPanel.add(densitySpinner, gridBagConstraints);

        sulphatesLabel.setText("Sulphates");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        inputPanel.add(sulphatesLabel, gridBagConstraints);

        phSpinner.setModel(new javax.swing.SpinnerNumberModel(2.74d, 2.74d, 4.01d, 0.01d));
        phSpinner.setToolTipText("Min: 2.74 - Max: 4.01");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 5);
        inputPanel.add(phSpinner, gridBagConstraints);

        phLabel.setText("pH");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        inputPanel.add(phLabel, gridBagConstraints);

        sulphatesSpinner.setModel(new javax.swing.SpinnerNumberModel(0.33d, 0.33d, 2.0d, 0.01d));
        sulphatesSpinner.setToolTipText("Min: 0.33 - Max: 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 5);
        inputPanel.add(sulphatesSpinner, gridBagConstraints);

        alcoholLabel.setText("Alcohol");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        inputPanel.add(alcoholLabel, gridBagConstraints);

        alcoholSpinner.setModel(new javax.swing.SpinnerNumberModel(8.399999618530273d, 8.399999618530273d, 14.9d, 0.01d));
        alcoholSpinner.setToolTipText("Min: 8.4 - Max: 14.9");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 5);
        inputPanel.add(alcoholSpinner, gridBagConstraints);

        volatileAcidityWeightCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        inputPanel.add(volatileAcidityWeightCbox, gridBagConstraints);

        citricAcidityWeightCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 1;
        inputPanel.add(citricAcidityWeightCbox, gridBagConstraints);

        totalSulfurDioxideWeightCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        inputPanel.add(totalSulfurDioxideWeightCbox, gridBagConstraints);

        fixedAcidityWeightCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        inputPanel.add(fixedAcidityWeightCbox, gridBagConstraints);

        residualSugarWeightCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        inputPanel.add(residualSugarWeightCbox, gridBagConstraints);

        chloridesWeightCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 3;
        inputPanel.add(chloridesWeightCbox, gridBagConstraints);

        densityWeightCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 5;
        inputPanel.add(densityWeightCbox, gridBagConstraints);

        phWeightCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        phWeightCbox.setNextFocusableComponent(sulphatesSpinner);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 5;
        inputPanel.add(phWeightCbox, gridBagConstraints);

        alcoholWeightCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        alcoholWeightCbox.setNextFocusableComponent(btnProcess);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        inputPanel.add(alcoholWeightCbox, gridBagConstraints);

        freeSulfurDioxideWeightCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 3;
        inputPanel.add(freeSulfurDioxideWeightCbox, gridBagConstraints);

        sulphatesWeightCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        inputPanel.add(sulphatesWeightCbox, gridBagConstraints);

        btnProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/view/assets/icons/actions_32x32/process.png"))); // NOI18N
        btnProcess.setMnemonic('p');
        btnProcess.setToolTipText("Process");
        btnProcess.setNextFocusableComponent(fixedAciditySpinner);
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        inputPanel.add(btnProcess, gridBagConstraints);

        getContentPane().add(inputPanel, java.awt.BorderLayout.CENTER);

        mnuFile.setMnemonic('f');
        mnuFile.setText("File");

        mnuProcess.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mnuProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/view/assets/icons/actions_32x32/process.png"))); // NOI18N
        mnuProcess.setMnemonic('p');
        mnuProcess.setText("Process");
        mnuProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProcessActionPerformed(evt);
            }
        });
        mnuFile.add(mnuProcess);

        mnuQuit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mnuQuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/view/assets/icons/actions_32x32/quit.png"))); // NOI18N
        mnuQuit.setMnemonic('q');
        mnuQuit.setText("Quit");
        mnuQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQuitActionPerformed(evt);
            }
        });
        mnuFile.add(mnuQuit);

        mainMnu.add(mnuFile);

        mnuTools.setMnemonic('t');
        mnuTools.setText("Tools");

        mnuReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/view/assets/icons/actions_32x32/report.png"))); // NOI18N
        mnuReport.setMnemonic('r');
        mnuReport.setText("Report");
        mnuReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReportActionPerformed(evt);
            }
        });
        mnuTools.add(mnuReport);

        mainMnu.add(mnuTools);

        setJMenuBar(mainMnu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQuitActionPerformed
        if (JOptionPane.YES_OPTION == (JOptionPane.showConfirmDialog(null, "Do you really want to quit?", "Quit", JOptionPane.YES_NO_OPTION)))
        {
            System.exit(0);
        }
    }//GEN-LAST:event_mnuQuitActionPerformed

    private void mnuReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReportActionPerformed
        reportWindow.setVisible(!reportWindow.isVisible());
    }//GEN-LAST:event_mnuReportActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // Instantiates the new case
        Case newCase = new Case();
        newCase.setAlcohol((Double)alcoholSpinner.getValue());
        newCase.setChlorides((Double)chloridesSpinner.getValue());
        newCase.setCitricAcid((Double)citricAciditySpinner.getValue());
        newCase.setDensity((Double)densitySpinner.getValue());
        newCase.setFixedAcidity((Double)fixedAciditySpinner.getValue());
        newCase.setFreeSulfurDioxide((Double)freeSulfurDioxideSpinner.getValue());
        newCase.setPh((Double)phSpinner.getValue());
        newCase.setResidualSugar((Double)residualSugarSpinner.getValue());
        newCase.setSulphates((Double)sulphatesSpinner.getValue());
        newCase.setTotalSulfurDioxide((Double)totalSulfurDioxideSpinner.getValue());
        newCase.setVolatileAcidity((Double)volatileAciditySpinner.getValue());
                
        // Stores the weights of the attributes in an object
        CaseAttributeWeight caseAttributeWeight = new CaseAttributeWeight();
        caseAttributeWeight.setAlcohol(Double.valueOf((String)alcoholWeightCbox.getSelectedItem()));
        caseAttributeWeight.setChlorides(Double.valueOf((String)chloridesWeightCbox.getSelectedItem()));
        caseAttributeWeight.setCitricAcid(Double.valueOf((String)citricAcidityWeightCbox.getSelectedItem()));
        caseAttributeWeight.setDensity(Double.valueOf((String)densityWeightCbox.getSelectedItem()));
        caseAttributeWeight.setFixedAcidity(Double.valueOf((String)fixedAcidityWeightCbox.getSelectedItem()));
        caseAttributeWeight.setFreeSulfurDioxide(Double.valueOf((String)freeSulfurDioxideWeightCbox.getSelectedItem()));
        caseAttributeWeight.setPh(Double.valueOf((String)phWeightCbox.getSelectedItem()));
        caseAttributeWeight.setResidualSugar(Double.valueOf((String)residualSugarWeightCbox.getSelectedItem()));
        caseAttributeWeight.setSulphates(Double.valueOf((String)sulphatesWeightCbox.getSelectedItem()));
        caseAttributeWeight.setTotalSulfurDioxide(Double.valueOf((String)totalSulfurDioxideWeightCbox.getSelectedItem()));
        caseAttributeWeight.setVolatileAcidity(Double.valueOf((String)volatileAcidityWeightCbox.getSelectedItem()));
        
        try
        {
            // Process the new case and udpates the report
            reportWindow.updateCasesTable(wineQualityCbr.process(newCase, caseAttributeWeight));
            reportWindow.setVisible(true);
        }
        catch (IOException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error loading database", "There was an error when trying to load the "
                    + "database from the .csv file.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void mnuProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProcessActionPerformed
        btnProcess.doClick();
    }//GEN-LAST:event_mnuProcessActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alcoholLabel;
    private javax.swing.JSpinner alcoholSpinner;
    private javax.swing.JComboBox<String> alcoholWeightCbox;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel chloridesLabel;
    private javax.swing.JSpinner chloridesSpinner;
    private javax.swing.JComboBox<String> chloridesWeightCbox;
    private javax.swing.JLabel citricAcidityLabel;
    private javax.swing.JSpinner citricAciditySpinner;
    private javax.swing.JComboBox<String> citricAcidityWeightCbox;
    private javax.swing.JLabel densityLabel;
    private javax.swing.JSpinner densitySpinner;
    private javax.swing.JComboBox<String> densityWeightCbox;
    private javax.swing.JLabel fixedAcidityLabel;
    private javax.swing.JSpinner fixedAciditySpinner;
    private javax.swing.JComboBox<String> fixedAcidityWeightCbox;
    private javax.swing.JLabel freeSulfurDioxideLabel;
    private javax.swing.JSpinner freeSulfurDioxideSpinner;
    private javax.swing.JComboBox<String> freeSulfurDioxideWeightCbox;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JMenuBar mainMnu;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuProcess;
    private javax.swing.JMenuItem mnuQuit;
    private javax.swing.JMenuItem mnuReport;
    private javax.swing.JMenu mnuTools;
    private javax.swing.JLabel phLabel;
    private javax.swing.JSpinner phSpinner;
    private javax.swing.JComboBox<String> phWeightCbox;
    private javax.swing.JLabel residualSugarLabel;
    private javax.swing.JSpinner residualSugarSpinner;
    private javax.swing.JComboBox<String> residualSugarWeightCbox;
    private javax.swing.JLabel sulphatesLabel;
    private javax.swing.JSpinner sulphatesSpinner;
    private javax.swing.JComboBox<String> sulphatesWeightCbox;
    private javax.swing.JLabel totalSulfurDioxideLabel;
    private javax.swing.JSpinner totalSulfurDioxideSpinner;
    private javax.swing.JComboBox<String> totalSulfurDioxideWeightCbox;
    private javax.swing.JLabel volatileAcidityLabel;
    private javax.swing.JSpinner volatileAciditySpinner;
    private javax.swing.JComboBox<String> volatileAcidityWeightCbox;
    // End of variables declaration//GEN-END:variables
}

/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * @author ferreiraluizga
 */

package calculadora;

//importando interface gráfica e eventos para botões
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame{
    
    //elementos da tela
    JLabel titulo, rotulo1, rotulo2, resultado;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, dividir, limpar, ocultarComponente, exibirComponente, habilitarComponente, desabilitarComponente;
    ImageIcon iconJanela, iconSomar, iconSubtrair, iconMultiplicar, iconDividir;
    
    //construtor
    public Calculadora(){
        
        //nomeando janela
        super("Calculadora");
        
        //criação da tela com icone
        Container tela = getContentPane();
        setLayout(null);
        iconJanela = new ImageIcon("img/calculadora.png");
        setIconImage(iconJanela.getImage());
        
        //titulo da janela e sua estilização
        titulo = new JLabel("Calculadora");
        titulo.setForeground(Color.BLACK);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        
        //configuração do primeiro input com valor padrão
        rotulo1 = new JLabel("1º Número: ");
        texto1 = new JTextField(5);
        texto1.setText("0");
        
        //configuração do segundo input com valor padrão
        rotulo2 = new JLabel("2º Número: ");
        texto2 = new JTextField(5);
        texto2.setText("0");
        
        //definição dos botões com icone
        iconSomar = new ImageIcon("img/somar.png");
        somar = new JButton(iconSomar);
                
        iconSubtrair = new ImageIcon("img/subtrair.png");
        subtrair = new JButton(iconSubtrair);
                
        iconMultiplicar = new ImageIcon("img/multiplicar.png");
        multiplicar = new JButton(iconMultiplicar);
                
        iconDividir = new ImageIcon("img/dividir.png");
        dividir = new JButton(iconDividir);
        
        //definição do botão de limpar campos
        limpar = new JButton("Limpar");
        
        //definição dos botões de ocultar e exibir
        ocultarComponente = new JButton("Ocultar");
        exibirComponente = new JButton("Exibir");
        
        //definição dos botões de habilitar e desabilitar campos
        habilitarComponente = new JButton("Habilitar");
        desabilitarComponente = new JButton("Desabilitar");
                
        //texto de resultado e sua estilzação
        resultado = new JLabel("");
        resultado.setForeground(Color.BLACK);
        resultado.setFont(new Font("Arial", Font.BOLD, 12));
        
        //posicionamento dos elementos
        titulo.setBounds(65, 20, 150, 20);
        
        rotulo1.setBounds(40, 70, 70, 25);       
        texto1.setBounds(110, 70, 80, 25);
        
        rotulo2.setBounds(40, 100, 70, 25);
        texto2.setBounds(110, 100, 80, 25);
        
        somar.setBounds(40, 150, 30, 30);
        subtrair.setBounds(80, 150, 30, 30);
        multiplicar.setBounds(120, 150, 30, 30);
        dividir.setBounds(160, 150, 30, 30);
        
        resultado.setBounds(40, 200, 200, 20);
        
        limpar.setBounds(40, 230, 150, 20);
        ocultarComponente.setBounds(40, 255, 150, 20);
        exibirComponente.setBounds(40, 275, 150, 20);
        habilitarComponente.setBounds(40, 300, 150, 20);
        desabilitarComponente.setBounds(40, 320, 150, 20);
        
        //ação do botão de soma
        somar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int numero1, numero2, soma;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        soma = numero1 + numero2;
                        resultado.setVisible(true);
                        resultado.setText(texto1.getText() + " + " 
                                + texto2.getText() + " = " + soma);
                    }
                }
        );
        
        //ação do botão de multiplicação
        subtrair.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int numero1, numero2, subtracao;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        subtracao = numero1 - numero2;
                        resultado.setVisible(true);
                        resultado.setText(texto1.getText() + " – " 
                                + texto2.getText() + " = " + subtracao);
                    }
                }
        );
        
        //ação do botão de multiplicação
        multiplicar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int numero1, numero2, multiplicacao;
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        multiplicacao = numero1 * numero2;
                        resultado.setVisible(true);
                        resultado.setText(texto1.getText() + " × " 
                                + texto2.getText() + " = " + multiplicacao);
                    }
                }
        );
        
        //ação do botão de divisão
        dividir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        double numero1, numero2, divisao;
                        numero1 = Double.parseDouble(texto1.getText());
                        numero2 = Double.parseDouble(texto2.getText());
                        resultado.setVisible(true);
                        if (numero2 != 0){
                            divisao = numero1 / numero2;
                            resultado.setText(texto1.getText() + " ÷ " 
                                    + texto2.getText() + " = " + divisao);
                        }else{
                            resultado.setText("Não é possivel dividir por 0");
                        }
                    }
                }
        );
        
        //ação do botão de limpar
        limpar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        texto1.setText(null);
                        texto2.setText(null);
                        texto1.requestFocus();
                    }
                }
        );
        
        //ação do botão de ocultar e exibir
        ocultarComponente.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        texto1.setVisible(false);
                        texto2.setVisible(false);
                    }
                }
        );
        exibirComponente.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        texto1.setVisible(true);
                        texto2.setVisible(true);
                    }
                }
        );
        
        //ação do botão de habilitar e desabilitar
        desabilitarComponente.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        texto1.setEnabled(false);
                        texto2.setEnabled(false);
                    }
                }
        );
        habilitarComponente.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        texto1.setEnabled(true);
                        texto2.setEnabled(true);
                    }
                }
        );
        
        /*
        definição de visibilidade para que o texto de resultado apareça
        somente ao executar o botão
        */
        resultado.setVisible(false);
        
        //adição dos elementos a tela
        tela.add(titulo);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(resultado);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(dividir);
        tela.add(limpar);
        tela.add(ocultarComponente);
        tela.add(exibirComponente);
        tela.add(habilitarComponente);
        tela.add(desabilitarComponente);
        
        //configurações de tamanho e visibilidade da tela
        setResizable(false);
        setSize(250, 400);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    //execução da tela
    public static void main(String[] args) {
        Calculadora app = new Calculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

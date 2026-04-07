import javax.swing.*;
public class Stationary {
public static void main(String[]args) {
int total=0;
String n=JOptionPane.showInputDialog("Enter quantity of Notebook(50 each):");
int nq=Integer.parseInt(n);
total=total+(nq*50);
String p=JOptionPane.showInputDialog("Enter quantity of Pen(30 each):");
int pq=Integer.parseInt(p);
total=total+(pq*30);
String pc=JOptionPane.showInputDialog("Enter quantity of Pencil(10 each):");
int pcq=Integer.parseInt(pc);
total=total+(pcq*10);
JOptionPane.showMessageDialog(null,"Total Amount="+ total);
JOptionPane.showMessageDialog(null,"Successfully Ordered!");
}
}
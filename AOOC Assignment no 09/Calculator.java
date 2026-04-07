import javax.swing.*;
public class Calculator {
public static void main(String[] args) {
int a =Integer.parseInt(JOptionPane.showInputDialog("Enter first Number:"));
int b=Integer.parseInt(JOptionPane.showInputDialog("Enter second Number:"));
String op=JOptionPane.showInputDialog("Enter operation(+,-,*,/):");
int result=0;
if(op.equals("+")) {
result=a+b;
}
else if(op.equals("-")) {
result=a-b;
}
else if(op.equals("*")) {
result=a*b;
}
else if(op.equals("/")) {
result=a/b;
}
JOptionPane.showMessageDialog(null,"Result="+ result);
}
}
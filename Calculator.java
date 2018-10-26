import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Calculator extends Applet implements ActionListener{
	Button add,sub,div,mul,eq;
	Button n1,n2,n3,n4,n5,n6,n7,n8,n9,n0;
	TextField num1,num2,ans;
	Label dnum1,dnum2,dans;

	public void init(){

		add(dnum1);
		add(num1);
		add(dnum2);
		add(num2);
		add(dans);
		add(ans);
	}

	public void actionPerformed(ActionEvent e){

	}

	private void initiallization(){
		
		dnum1 = new Label("num 1");
		dnum2 = new Label("num 2");
		dans = new Label("ans");

		num1 = new TextField("");
		num2 = new TextField("");
		ans = new TextField("Ans");

		n1 = new Button("1");
		n2 = new Button("2");
		n3 = new Button("3");
		n4 = new Button("4");
		n5 = new Button("5");
		n6 = new Button("6");
		n7 = new Button("7");
		n8 = new Button("8");
		n9 = new Button("9");
		n0 = new Button("0");

		add = new Button("+");
		sub = new Button("-");
		div = new Button("*");
		mul = new Button("/");
		eq = new Button("=");
	}
}
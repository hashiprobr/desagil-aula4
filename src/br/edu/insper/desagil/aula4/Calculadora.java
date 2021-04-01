package br.edu.insper.desagil.aula4;

public class Calculadora {

	public double executa(int a, int b, char op) {
		double r;

		switch (op) {
		case '+':
			r = a + b;
			break;
		case '-':
			r = a - b;
			break;
		case '*':
			r = a * b;
			break;
		default:
			if (b == 0) {
				r = 0.0;
			} else {
				r = (double) a / b;
			}
			break;
		}

		return r;
	}

}

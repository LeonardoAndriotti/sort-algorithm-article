package methods;

import java.util.Arrays;

import patterns.Factory;
import patterns.WriteFactory;

public class BubbleSort implements Factory {
	public double[]time = new double[5];
	int cont=0;

	public int[] structure(int[] value) {
		int aux;
		double start_time = System.nanoTime();
		for (int i = value.length - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (value[j] > value[j + 1]) {
					aux = value[j];
					value[j] = value[j + 1];
					value[j + 1] = aux;
				}
			}
		}
		double end_time = System.nanoTime();

		double difference = end_time-start_time /1000000;
		
		time[cont]=difference;
		cont++;
		System.out.println("tempo de execução"+difference);
		System.out.println(cont +"cont");
		System.out.println(Arrays.toString(time) +" atual tempo");
		return value;
	}
	public void write(){
		WriteFactory write = new WriteFactory();
		write.transform(time);
	}
}
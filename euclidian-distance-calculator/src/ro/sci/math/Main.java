package ro.sci.math;
import java.util.Scanner;
import org.apache.commons.math3.ml.distance.EuclideanDistance;

	public class Main {
	
public static void main(String[] args) {
//stabilim dimensiunea arrayurilor
		Scanner in = new Scanner(System.in);
		System.out.println ("Introduceti dimensiunea array-ului");
		int fnum = in.nextInt();
		int snum = fnum;
//egalam ambele arrayuri sa aiba aceeasi lungime		
		double[] firstNumbers = new double[fnum];
		double[] secondNumbers = new double[snum];
//cream dimensiunea arrayurilor
		for (int i = 0; i < fnum; i++)
    {
        System.out.println("Introduceti numerele din primul array");
        firstNumbers[i] = in.nextDouble();
	}	
		for (int j = 0; j < snum; j++)
    {
        System.out.println("Introduceti numerele din al doilea array");
        secondNumbers[j] = in.nextDouble();
	}	
//calculam distanta euclidiana dintre fiecare valoare a arrayurilor		
	EuclideanDistance distanta = new EuclideanDistance() ;
// bagam valoarea intr-o variabila de tip double sa o intelegem :))
	double dracu = distanta.compute((double[]) firstNumbers,
             (double[]) secondNumbers);
		
//afisam valoarea distantei euclidiene intre puncte		
		System.out.println("Distantele dintre numere sunt"+dracu);
		
		}
}
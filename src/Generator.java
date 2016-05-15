import java.util.ArrayList;
import java.util.Random;

public class Generator {

	

	public static void main(String[] args){
		ArrayList<Integer> references = create_references(10000, 1000);
		
//		System.out.printf("%s %d %n", "Iloœæ b³êdów strony dla algorytmu FIFO dla 3 ramek: ", Algorithms.FIFO(3,references));
//		System.out.printf("%s %d %n", "Iloœæ b³êdów strony dla algorytmu Optymalnego dla 3 ramek: ", Algorithms.OPT(3,references));
//		System.out.printf("%s %d %n", "Iloœæ b³êdów strony dla algorytmu LRU dla 3 ramek: ", Algorithms.LRU(3,references));
//		System.out.printf("%s %d %n", "Iloœæ b³êdów strony dla algorytmu aproksymowanego LRU dla 3 ramek: ", Algorithms.ALRU(3,references));
//		System.out.printf("%s %d %n %n", "Iloœæ b³êdów strony dla algorytmu RAND dla 3 ramek: ", Algorithms.RAND(3,references));
//		
//		System.out.printf("%s %d %n", "Iloœæ b³êdów strony dla algorytmu FIFO dla 5 ramek: ", Algorithms.FIFO(5,references));
//		System.out.printf("%s %d %n", "Iloœæ b³êdów strony dla algorytmu Optymalnego dla 5 ramek: ", Algorithms.OPT(5,references));
//		System.out.printf("%s %d %n", "Iloœæ b³êdów strony dla algorytmu LRU dla 5 ramek: ", Algorithms.LRU(5,references));
//		System.out.printf("%s %d %n", "Iloœæ b³êdów strony dla algorytmu aproksymowanego LRU dla 5 ramek: ", Algorithms.ALRU5,references));
//		System.out.printf("%s %d %n %n", "Iloœæ b³êdów strony dla algorytmu RAND dla 5 ramek: ", Algorithms.RAND(5,references));
//		
//		System.out.printf("%s %d %n", "Iloœæ b³êdów strony dla algorytmu FIFO dla 10 ramek: ", Algorithms.FIFO(10,references));
//		System.out.printf("%s %d %n", "Iloœæ b³êdów strony dla algorytmu Optymalnego dla 10 ramek: ", Algorithms.OPT(10,references));
//		System.out.printf("%s %d %n", "Iloœæ b³êdów strony dla algorytmu LRU dla 10 ramek: ", Algorithms.LRU(10,references));
//		System.out.printf("%s %d %n", "Iloœæ b³êdów strony dla algorytmu aproksymowanego LRU dla 10 ramek: ", Algorithms.ALRU(10,references));
//		System.out.printf("%s %d %n %n", "Iloœæ b³êdów strony dla algorytmu RAND dla 10 ramek: ", Algorithms.RAND(10,references));
	}
	
	public static ArrayList<Integer> create_references(int references_number, int pages_number){
		Random rand = new Random();
		ArrayList<Integer> references = new ArrayList<Integer>();
		
		for(int i = 0; i < references_number; i++)
			references.add(rand.nextInt(pages_number));
		return references;
	}
}

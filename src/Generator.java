import java.util.ArrayList;
import java.util.Random;

public class Generator {

	

	public static void main(String[] args){
		ArrayList<Integer> references = create_references(10000, 20);
		
		System.out.printf("%-70s %d %n", "Iloœæ b³êdów strony dla 3 ramek dla algorytmu FIFO: ", Algorithms.FIFO(3,references));
		System.out.printf("%-70s %d %n", "Iloœæ b³êdów strony dla 3 ramek dla algorytmu Optymalnego: ", Algorithms.OPT(3,references));
		System.out.printf("%-70s %d %n", "Iloœæ b³êdów strony dla 3 ramek dla algorytmu LRU: ", Algorithms.LRU(3,references));
		System.out.printf("%-70s %d %n", "Iloœæ b³êdów strony dla 3 ramek dla algorytmu aproksymowanego LRU: ", Algorithms.ALRU(3,references));
		System.out.printf("%-70s %d %n %n", "Iloœæ b³êdów strony dla 3 ramek dla algorytmu RAND: ", Algorithms.RAND(3,references));
		
		System.out.printf("%-70s %d %n", "Iloœæ b³êdów strony dla 5 ramek dla algorytmu FIFO: ", Algorithms.FIFO(5,references));
		System.out.printf("%-70s %d %n", "Iloœæ b³êdów strony dla 5 ramek dla algorytmu Optymalnego: ", Algorithms.OPT(5,references));
		System.out.printf("%-70s %d %n", "Iloœæ b³êdów strony dla 5 ramek dla algorytmu LRU: ", Algorithms.LRU(5,references));
		System.out.printf("%-70s %d %n", "Iloœæ b³êdów strony dla 5 ramek dla algorytmu aproksymowanego LRU: ", Algorithms.ALRU(5,references));
		System.out.printf("%-70s %d %n %n", "Iloœæ b³êdów strony dla 5 ramek dla algorytmu RAND: ", Algorithms.RAND(5,references));
		
		System.out.printf("%-70s %d %n", "Iloœæ b³êdów strony dla 10 ramek dla algorytmu FIFO: ", Algorithms.FIFO(10,references));
		System.out.printf("%-70s %d %n", "Iloœæ b³êdów strony dla 10 ramek dla algorytmu Optymalnego: ", Algorithms.OPT(10,references));
		System.out.printf("%-70s %d %n", "Iloœæ b³êdów strony dla 10 ramek dla algorytmu LRU: ", Algorithms.LRU(10,references));
		System.out.printf("%-70s %d %n", "Iloœæ b³êdów strony dla 10 ramek dla algorytmu aproksymowanego LRU: ", Algorithms.ALRU(10,references));
		System.out.printf("%-70s %d %n %n", "Iloœæ b³êdów strony dla 10 ramek dla algorytmu RAND: ", Algorithms.RAND(10,references));
	}
	
	public static ArrayList<Integer> create_references(int references_number, int pages_number){
		Random rand = new Random();
		ArrayList<Integer> references = new ArrayList<Integer>();
		
		for(int i = 0; i < references_number; i++)
			references.add(rand.nextInt(pages_number));
		return references;
	}
}

import java.util.ArrayList;
import java.util.Random;

public class Algorithms {
	
	public static int FIFO(int frame_number, ArrayList<Integer> input_references) throws NullPointerException{
		int page_errors = 0;
		int remove_index = 0;
		int[] frames;
		
		ArrayList<Integer> references = (ArrayList<Integer>) input_references.clone();
		
		if(frame_number < references.size()){
			frames = new int[frame_number];
			for(int i = 0; i < frame_number; i++)
				frames[i] = i;
			//fill frames at the beginning
				
			while(!references.isEmpty()){
				int index = 0;
				while(index < frame_number && frames[index] != references.get(0))
					index++;
				if(index < frame_number)
					references.remove(0);
				else{
					frames[remove_index] = references.remove(0);
					if(remove_index > (frame_number-2)) 
						remove_index = 0;
					else
						remove_index++;
					page_errors++;
				}
			}
		}	
			return page_errors;
	} // FIFO algorithm
	
	
	public static int OPT(int frame_number, ArrayList<Integer> input_references) {
		int page_errors = 0;
		int remove_index = 0;
		int[] frames;
		
		ArrayList<Integer> references = (ArrayList<Integer>) input_references.clone();

		if(frame_number < references.size()){
			frames = new int[frame_number];
			for(int i = 0; i < frame_number; i++)
				frames[i] = i;
			//fill frames at the beginning
				
			while(!references.isEmpty()){
				int index = 0;
				while(index < frame_number && frames[index] != references.get(0))
					index++;
				if(index < frame_number)
					references.remove(0);
				else{
					ArrayList<Integer> pages_prediction = new ArrayList<Integer>();
					for(int i = 0; i < frame_number; i++)
						pages_prediction.add(frames[i]);
					index = 0;
					while(pages_prediction.size() > 1 && index < references.size()){
						if(pages_prediction.contains(references.get(index)))
								pages_prediction.remove(references.get(index));
					index++;		
					}
					for(int i = 0; i < frame_number; i++)
						if(pages_prediction.get(0).equals(frames[i]))
							remove_index = i;
					frames[remove_index] = references.remove(0);
					page_errors++;
				}
			}
		}	
			return page_errors;
	} // optimal algorithm
	
	
	public static int RAND(int frame_number, ArrayList<Integer> input_references) {
		Random rand = new Random();
		int page_errors = 0;
		int remove_index = rand.nextInt(frame_number);
		int[] frames;
		
		ArrayList<Integer> references = (ArrayList<Integer>) input_references.clone();
		
		if(frame_number < references.size()){
			frames = new int[frame_number];
			for(int i = 0; i < frame_number; i++)
				frames[i] = i;
			//fill frames at the beginning
				
			while(!references.isEmpty()){
				int index = 0;
				while(index < frame_number && frames[index] != references.get(0))
					index++;
				if(index < frame_number)
					references.remove(0);
				else{
					frames[remove_index] = references.remove(0);
					remove_index = rand.nextInt(frame_number);
					page_errors++;
				}
			}
		}	
			return page_errors;
	}// RAND algorithm
}

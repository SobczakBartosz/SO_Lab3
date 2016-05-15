import java.util.ArrayList;

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
}

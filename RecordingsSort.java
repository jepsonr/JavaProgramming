import java.util.*;
public class RecordingSort {

	public static void main(String[] args) {
		
		//declare variables and instances
		Recording[] aRecording = new Recording[5];
		int len = aRecording.length;
		Scanner input = new Scanner(System.in);
		
		//collects Recording's info for each instance of the Recording class
		for(int n = 0; n < len; n++){ 
			aRecording[n] = new Recording();
			
			System.out.println("Enter recording " + (n+1) + 
					"'s title: ");
			String title = input.nextLine();
			aRecording[n].setTitle(title);
			System.out.println();
			
			System.out.println("Enter recording " + (n+1) + 
											"'s artist name: ");
			String name = input.nextLine();
			aRecording[n].setArtist(name);
			System.out.println();
			
		
			System.out.println("Enter recording " + (n+1) + 
					"'s time in seconds: ");
			int sec = input.nextInt();
			aRecording[n].setPlayingTime(sec);
			input.nextLine();
		}//end for
		
		//prompts user to select sorting criteria
		System.out.println("Sort recordings by entry:");
		System.out.println("To Sort by title enter T");
		System.out.println("To Sort by artist enter A");
		System.out.println("To Sort by playing time enter P");
		String selection = input.nextLine();
		
		//calls the sort method based on user's selection
		int x = 1;
		while(x == 1){
			switch(selection){
			case "T":
			case "t":
				sortByTitle(aRecording);
				x = 0;
				break;
			case "A":
			case "a":
				sortByArtist(aRecording);
				x = 0;
				break;
			case "P":
			case "p":
				sortByTime(aRecording);
				x = 0;
				break;
			default:
				System.out.println("Invalid entry. ");
				System.out.println("To Sort by title enter T");
				System.out.println("To Sort by artist enter A");
				System.out.println("To Sort by playing time enter P");
				selection = input.nextLine();
			}
		}
		//prints a table of recordings
		System.out.println("Song information:");
		System.out.println("Title \t Artist \t Playing time");
		for(int n = 0; n < len; n++){
			String title = aRecording[n].getTitle();
			String artist = aRecording[n].getArtist();
			int time = aRecording[n].getPlayingTime();
			
			System.out.print(title + "\t" + artist + "\t" + time + "\t");
			System.out.println();
		}//end for	
		input.close();
	}//end main
	public static void sortByTitle(Recording[] array){
		int x, y;
		Recording temp;
		int high = array.length -1;
		for(x = 0; x < high; ++x){
			for(y = 0; y < high; ++y){
				if(array[y].getTitle().compareTo(array[y+1].getTitle()) > 0){
					temp = array[y];
					array[y] = array[y+1];
					array[y+1] = temp;
				}//end if
			}//end 'y' for
		}//end 'x' for
	}//end sortByTitle
	
	public static void sortByArtist(Recording[] array){
		int x, y;
		Recording temp;
		int high = array.length -1;
		for(x = 0; x < high; ++x){
			for(y = 0; y < high; ++y){
				if(array[y].getArtist().compareTo(array[y+1].getArtist()) > 0){
					temp = array[y];
					array[y] = array[y+1];
					array[y+1] = temp;
				}//end if
			}//end 'y' for
		}//end 'x' for
	}//end sortByTitle
	
	public static void sortByTime(Recording[] array){
		int x, y;
		Recording temp;
		int high = array.length -1;
		for(x = 0; x < high; ++x){
			for(y = 0; y < high; ++y){
				if(array[y].getPlayingTime() > array[y+1].getPlayingTime()){
					temp = array[y];
					array[y] = array[y+1];
					array[y+1] = temp;
				}//end if
			}//end 'y' for
		}//end 'x' for
	}//end sortByTitle*/
}//end class

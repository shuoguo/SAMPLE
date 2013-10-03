package com.homework;
import java.io.File;
import java.io.IOException;


public class Search
{
	
	
	public static void main(String[] args) throws IOException
	{
		File f=new File("TenKsongs.csv"); // read database
		int numsongs=10000;
		SongArray.ReadSongArray(f, numsongs);  
//-------------------------------------------------	----------
		//store 2000 random num in titlesorted array 
		  //arbitrarily select 2000 song titles and print.
		RandomSelction.titleSelect(2000);//2
		System.out.println("");
//-------------------------------------------------	----------
		//sort titlesorted array and synchronise title, artist, duration
		System.out.println("bubblesort time to synchronise title, artist, duration ");
		SongArray.bubbleSort2(SongArray.titlesorted);    //to sort first
		//first 10 data of titlesorted array
		System.out.println("first 10 lines : "); //output 1
		// linear output of first 10 lines from titlesorted array
		for(int i=0;i<10;i++)
		{
			System.out.println(i+":"+SongArray.title[i]+" "+SongArray.artist[i]+
					" "+SongArray.duration[i]);
		}
//------------------------------------------------------------	
	 
	//	WriteToFile.write();
		System.out.println("bubblesort time of titlesorted only ");
		SongArray.bubbleSort(SongArray.titlesorted); 
	
		System.out.println("");
//		System.out.println("bubblesort time to synchronise ttittle, artist, duration ");
		SongArray.bubbleSort2(SongArray.titlesorted);    	
		//print first 10 line after bubble sort
		for(int i=0;i<10;i++)          //2
		{
			System.out.println(i+":"+SongArray.titlesorted[i]+" "+SongArray.artistsorted[i]+
					" "+SongArray.durationsorted[i]);
		}
//----------------------------------------------------------------------------
		int l=5;  //choose 5 titles to test linear search
		String[] test={SongArray.titlesorted[100],SongArray.titlesorted[500],
				SongArray.titlesorted[1000],SongArray.titlesorted[1500],SongArray.titlesorted[1900]};
		for(int i=0;i<l;i++)
		{
		LinearSearch.linearSearch(SongArray.titlesorted,test[i]);
		}
//---------------------------------------------------------------	
		//4
		System.out.println("bubblesort time of all data: ");
		SongArray.bubbleSort(SongArray.title);
//----------------------------------------------------------------
		
		//5     
		//choose 5 titles to test binary search
		System.out.println("search 5 data with binarysearch and output time: ");
		for(int i=0;i<l;i++)
		{
		SongArray.binarySearch(SongArray.titlesorted,test[i]);
		}
//-------------------------------------------------------------------		
     //6
		
//--------------------------------------------------------------------
       //7
		
		
	}
}

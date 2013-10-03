package com.homework;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
// Students: Include code for bubblesort, linear search, and binary search
// method ReadSongArray is used for read raw data from .csv file
public class SongArray
{   
	//store each property
static	String[] title=new String[10000];

static	String[] artist=new String[10000];
static	float[] duration=new float[10000];
static	int[] ID=new int[10000];
static  String[] titlesorted=new String[2000];
static  String[] artistsorted=new String[2000];
static float[] durationsorted=new float[2000];

public static void bubbleSort (String[] a) 
{
	long t1=System.nanoTime();
int in, out;
int nElems = a.length;
for (out = nElems-1; out>0; out--) 
    { for (in=0; in < out; in++)    
       {   if (a[in].compareTo( a[in+1] ) > 0)
            { 
        String temp = a[in];
        a[in] = a[in+1];
        a[in+1] = temp;
            }
       }
    }
long t2=System.nanoTime();
 System.out.println("bublesort time: "+(t2-t1)+"ns");
}
//-------------------------------------------------
// to synchronise title artist duration
public static void bubbleSort2 (String[] titlesorted) 
{
	long t1=System.nanoTime();
int in, out;
int nElems = titlesorted.length;
for (out = nElems-1; out>0; out--) 
    { for (in=0; in < out; in++)    
       {   if (titlesorted[in].compareTo( titlesorted[in+1] ) > 0)
            { 
        String temp = titlesorted[in];
        String temp2=artistsorted[in];
        float temp3=durationsorted[in];
        
        titlesorted[in] = titlesorted[in+1];
        artistsorted[in]=artistsorted[in+1];
        durationsorted[in]=durationsorted[in+1];
        
        titlesorted[in+1] = temp;
        artistsorted[in+1]=temp2;
        durationsorted[in+1]=temp3;
            }
       }
    }
long t2=System.nanoTime();
 System.out.println("bublesort time: "+(t2-t1)+"ns");
}
//-------------------------------------------------------
//binary search on a sorted array given a value
public static int binarySearch(String[] t1,String t2)
{
	long t3=System.nanoTime();
	int left=0;
	int right=t1.length-1;
	int middle;
	while(left<=right)
	{ 
		middle=(left+right)/2;
		if(t1[middle].equals(t2)){ long t4=System.nanoTime();	System.out.println("binarysearch time: "+(t4-t3));return middle;}
		if(t1[middle].compareTo(t2)<0){ left=middle+1;}
		if(t1[middle].compareTo(t2)>0){ right=middle-1;}
	}
	long t5=System.nanoTime();
	System.out.println("binarysearch time not found: "+(t5-t3));
	return -1;
}
//------------------------------------------------------------//
	
	
	public static  Songs[] ReadSongArray(File file, int numsongs)
	{
		Songs[] songDB = new Songs[numsongs];
		int i = 0;
		
		try
		{
			FileReader file_reader = new FileReader(file);
			BufferedReader buf_reader = new BufferedReader(file_reader);
			while (i < numsongs)
			{
				String line = buf_reader.readLine();
				
				String[] data = line.split(",");// line dividing
				//System.out.println(line);
				
				float duration_StrF = Float.parseFloat(data[3]);
				int digitalid_StrInt = Integer.parseInt(data[4]);

				String title_rmSP = data[1].replaceAll("\\s+", "");
				String artist_rmSP = data[2].replaceAll("\\s+", "");
			
				// store each property to arrays
				title[i]=title_rmSP;   
				artist[i]=artist_rmSP; 
				duration[i]=duration_StrF;
				ID[i]=digitalid_StrInt;
				
//  System.out.println("title:"+title_rmSP+". artist:"+artist_rmSP+
//    ". duration:"+duration_StrF+". ID:"+digitalid_StrInt);
			
				i++;// line number 
			}
			buf_reader.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return (songDB);
	}
}
class Songs
{
		String title_s;
		String artist_s;
		float song_duration;
		int song_ID;
}
// generate num_song's random numbers within[0,9999] given num_song
class RandomSelction extends SongArray 
  {     //arbitrarily select 2000 song titles.
	public static void titleSelect(int num_songs)//num_songs=2000
	{   
		int num=num_songs;
		Random random=new Random();
		for(int p=0;p<num;p++)
		{
		int ran=random.nextInt(10000);
		titlesorted[p]=title[ran];
		artistsorted[p]=artist[ran];
		durationsorted[p]=duration[ran];
	//	System.out.println(p+" "+title[ran]);
		}
	}
  }
  //  linear search
class LinearSearch extends SongArray //2
{                                  //ls is a sorted array you choosed
 	public static String linearSearch(String[] ls,String tle)
 	{
 		long t6=System.nanoTime();
 		String t=tle;
 		String re;
 		for(int q=0;q<2000;q++) //search 0-1999 songs
 		{
 			if(t.equals(ls[q])){ 
 				re=ls[q];
 				long t7=System.nanoTime();
 			 System.out.println("title: "+re+". linear searchtime: "+ (t7-t6)+"ns");
 			  return re;
 			 }
 		}
 		System.out.println("linearsearch not found: "+ System.nanoTime()+"ns");
		return "not founded";
 	}
}
class WriteToFile
{
	 public static void write() throws IOException  {

	        //Note the "\\" used in the path of the file 
	        //instead of "\", this is required to read 
	        //the path in the String format.
	        FileWriter fw = new FileWriter("/workspace/WriteTest.csv");
	        PrintWriter pw = new PrintWriter(fw);
	        
	        //Write to file for the first row
	        pw.print("Hello guys");
	        pw.print(",");
	        pw.print("Java Code Online is maing");
	        pw.print(",");
	        pw.println("a csv file and now a new line is going to come");
	        
	        //Write to file for the second row
	        pw.print("Hey");
	        pw.print(",");
	        pw.print("It's a");
	        pw.print(",");
	        pw.print("New Line");
	        
	        //Flush the output to the file
	        pw.flush();
	        
	        //Close the Print Writer
	        pw.close();
	        
	        //Close the File Writer
	        fw.close();        
	    }
}

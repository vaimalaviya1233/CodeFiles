import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

class Main {
  public static void main(String[] args) throws MalformedURLException,FileNotFoundException,IOException{
    String url,kfile;
    Scanner getkw = new Scanner(System.in);
    System.out.println(" Please Paste Url ::");
    url = getkw.nextLine();
    System.out.println("Please enter name of file you want to save as :: ");
    kfile = getkw.nextLine();
    getkw.close();
    Main Dinit = new Main();
    System.out.println(Dinit.dloader(url, kfile));

  }
  private String dloader(String kurl, String fname)throws IOException{
    String status ="";
    try {
      URL url = new URL("https://tinyurl.com/38eruapu");
      FileOutputStream out = new FileOutputStream(new File("Vanilla.zip"));         // Output File
      out.write(url.openStream().readAllBytes());
      out.close();
    } catch (MalformedURLException e) {
      status = "Status: MalformedURLException Occured";
    }catch (IOException e) {
      status = "Status: IOexception Occured";
    }finally{
      status = "Status: Good";}
    String path="\\tkwgter5834\\";
    extractor(fname,"tkwgter5834",path);
    

    return status;
  }
  private String extractor(String fname,String dir,String path){
    File folder = new File(dir);
    if(!folder.exists()){
      folder.mkdir();
    }
    return "";
  }

}
/*  List<String> lines = Arrays.asList("1st line", "2nd line");
    try{
    Files.write(Paths.get("file6.txt"), lines);
    }catch(IOException e){
      String s = "";
    }
*/

    //URL website = new URL("https://www.decompiler.com/zip/c482ed4257454fa0bdaf4299696e1a47/android-30.jar");
    //ReadableByteChannel rbc = Channels.newChannel(website.openStream());
    //FileOutputStream fos = new FileOutputStream("android.zip");
    //fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE); */


    /* Scanner keyboard = new Scanner(System.in);
    File kwgt= new File("kwgt.json");
    Scanner kfile = new Scanner("kwgt.json");

    if(kwgt.createNewFile()){
      System.out.println("created");
    }
    else{
      System.out.println("exist");
    }
    
 */

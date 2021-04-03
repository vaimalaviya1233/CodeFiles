import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

class Download {
  public static void main(String[] args) throws MalformedURLException,FileNotFoundException,IOException{
    String url,kfile;
    Scanner getkw = new Scanner(System.in);
    System.out.println(" Please Paste Url ::");
    url = getkw.nextLine();
    System.out.println("Please enter name of file you want to save as :: ");
    kfile = getkw.nextLine();
    getkw.close();
    Download Dinit = new Download();
    System.out.println(Dinit.dloader(url, kfile));

  }
  private String dloader(String kurl, String fname){
    try {
      URL url = new URL(kurl);
      FileOutputStream out = new FileOutputStream(new File("android.pdf"));         // Output File
      out.write(url.openStream().readAllBytes());
      out.close();
    } catch (MalformedURLException e) {
      return "Status: MalformedURLException Occured";
    }catch (IOException e) {
      // TODO Auto-generated catch block
      return "Status: IOexception Occured";
    }
    return "Status: Good";
  }

}



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
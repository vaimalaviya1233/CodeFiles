import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Unziper {

    public static void main(String[] args) throws IOException {
        Unziper dinit= new Unziper();
        dinit.dloader("", "");
    }
    private String dloader(String kurl, String fname)throws IOException,MalformedURLException{
      String status ="";
      URL url = new URL("https://tinyurl.com/38eruapu");
      File zip = new File("Vanilla.zip");
      FileOutputStream out = new FileOutputStream(zip);         // Output File
      out.write(url.openStream().readAllBytes());
      out.close();
      
      String path=zip.getAbsolutePath();
      String zipFilePath = "Vanilla.zip";

      File destDir = new File("exists");        
      unzip(zip, destDir);
    
    return status;
  }

    private static void unzip(File zipFilePath,File dir) throws IOException{
      //@copyright from https://www.journaldev.com/
        // create output directory if it doesn't exist
        if(!dir.exists()) dir.mkdirs();
        FileInputStream fis;

        //buffer for read and write data to file
        byte[] buffer = new byte[1024];
            fis = new FileInputStream(zipFilePath);
            ZipInputStream zis = new ZipInputStream(fis);
            ZipEntry ze = zis.getNextEntry();
            while(ze != null){
                String fileName = ze.getName();
                File newFile = new File(dir.toString() + File.separator + fileName);
                //System.out.println("Unzipping to "+newFile.getAbsolutePath());  prints unzipping
                //create directories for sub directories in zip
                new File(newFile.getParent()).mkdirs();
                FileOutputStream fos = new FileOutputStream(newFile);
                int len;
                while ((len = zis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
                }
                fos.close();
                //close this ZipEntry
                zis.closeEntry();
                ze = zis.getNextEntry();
            }
            //close last ZipEntry
            zis.closeEntry();
            zis.close();
            fis.close();        
    }

}

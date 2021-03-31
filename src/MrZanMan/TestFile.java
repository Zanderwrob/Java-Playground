package MrZanMan;

import java.io.File;

public class TestFile {
    Boolean doesExist;
    String fileName;
    String lr = "\n"; // Line Return
    public void GetFileInfo()
    {
        File TestFile = new File("/Users/Zande/Documents/Java Test/i love Christian.txt");
        doesExist = TestFile.exists();
        fileName = TestFile.getName();
    }
    public String displayFileInfo(){
        return "File Exists : " + doesExist+ lr+
                "File Name : " + fileName+ lr;
    }
}

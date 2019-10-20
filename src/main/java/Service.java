public class Service {

    private FileReaderUtil fileReaderUtil;

    public String serveList(){
        return fileReaderUtil.readFile();
    }
}

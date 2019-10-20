public class Service {

    private FileReaderUtil fileReaderUtil;

    public Service(FileReaderUtil fileReaderUtil) {
        this.fileReaderUtil = fileReaderUtil;
    }

    public String serveList(){
        return fileReaderUtil.readFile();
    }
}

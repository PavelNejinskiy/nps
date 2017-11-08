package Parser;

/**
 * Created by мори on 08.11.2017.
 */
public class DataSourceDecorator implements InterfaceParser {
    
    private InterfaceParser wrapper;

    public DataSourceDecorator(InterfaceParser wrapper) {
        this.wrapper = wrapper;
    }
    
    @Override
    public String getContent() {
        return wrapper.getContent();
    }

    @Override
    public String getContentWithoutUnicode() {
        return wrapper.getContentWithoutUnicode();
    }

    @Override
    public void saveContent(String content) {
            wrapper.saveContent(content);
    }
}

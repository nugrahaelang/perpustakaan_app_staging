
package componen;

import java.io.File;
import java.net.URL;


public interface MenuEvent {
//     public void selected(int index, int subIndex);
    public void selected(String Name);

    public void selected(URL url);

    public void selected(File file);
}

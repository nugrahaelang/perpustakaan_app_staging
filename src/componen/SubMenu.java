package componen;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class SubMenu extends JButton{  
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    private int index;
    private boolean subMenuAble;
    // Submenu
    private int SubMenuIndex;
    private int length;
    
    
    public SubMenu(String name, int index, boolean subMenuAble){
        super(name);
        this.index = index;
        this.subMenuAble= subMenuAble;
        
        //CSS MENU
        setContentAreaFilled(false);
        setForeground(new Color(194, 199, 208)); //Font Color Menu
        setHorizontalAlignment(SwingConstants.LEFT);
        setBorder(new EmptyBorder(9, 10, 9, 10));
    }
    
    public void initSubMenu(int subMenuIndex, int length){
        this.SubMenuIndex = subMenuIndex;
        this.length = length;
        setBorder(new EmptyBorder(9, 33, 9, 10)); // Margin Left Sub Menu
        setBackground(new Color(52, 58, 64));
        setOpaque(true);
    }  

    
}

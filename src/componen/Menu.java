
package componen;

import javax.swing.JComponent;
import net.miginfocom.swing.MigLayout;
import javax.swing.JPanel;
import assets.DropDownMenu_Animation;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.net.URL;

public class Menu extends JComponent{
    
    private MigLayout layout;
    private MenuEvent event;
    private String [][]menuItems = new String[][]{
        {"Dashboard"},
        {"Master Data","Staff","Siswa","Kategori Buku","Buku"},
        {"Transaksi","Daftar Kunjungan","Peminjaman","Pengembalian"}
    };
    
    public Menu(){
        init();
    }
    public MenuEvent getEvent() {
        return event;
    }
    public void setEvent(MenuEvent event) {
        this.event = event;
    }
   
    
    private void init(){
        layout = new MigLayout("wrap 1, fillx, gapy 0, inset 2","fill");
        setLayout(layout);
        setOpaque(true); //GET CSS MENU
        
        for (int i = 0; i < menuItems.length; i++) {
            addMenu(menuItems[i][0], i);
        }
    }
    
    // SHOW MENU HEADER
    private void addMenu(String menuName, int index){
        int length = menuItems[index].length;
        //System.out.println(length);
        SubMenu item = new SubMenu(menuName, index, length > 1);
        item.addActionListener(new ActionListener(){
            @Override

            public void actionPerformed(ActionEvent ae) {
               if(length > 1){
                   if(!item.isSelected()){
                       item.setSelected(true);
                       addSubMenu(item, index,length, getComponentZOrder(item));
                   }else{
                       hideMenu(item, index);
                       item.setSelected(false);
                   }
                   
               }else{
                   if (event != null) {
                        //URL url = getClass().getResource("/Layout/FileMenu/Dashboard.java");
                        File file = new File("/Layout/FileMenu/Dashboard.java");
                        String url = file.getAbsolutePath();
                        event.selected(url);
                       //event.selected("Dashboard");
                    }
               }
            }
        });
        add(item);
        revalidate();
        repaint();
    }
    
    
    // SHOW MENU DETAIL
    private void addSubMenu(SubMenu item, int index, int length, int indexZorder){
       JPanel panel = new JPanel(new MigLayout("wrap 1, fillx, inset 0, gapy 0", "fill"));
       panel.setName(index + "");
       panel.setBackground(new Color(52, 58, 64)); // Backgroun sub menu
       for(int i = 1; i < length; i++){
           //System.out.println(item);
           SubMenu SubItem = new SubMenu(menuItems[index][i], i, false);
           //Action click sub Menu (menampilkan id subMenu)
           //System.out.println(SubItem);
           SubItem.addActionListener(new ActionListener(){
               
               @Override
               public void actionPerformed(ActionEvent ae) {
                   if(event != null){
                       File file = new File("/Layout/FileMenu/"+SubItem.getText()+".java");
                        String url = file.getAbsolutePath();
                        event.selected(url);
                       //event.selected(SubItem.getText());
                   }
               }
           });
           SubItem.initSubMenu(i, length);
           panel.add(SubItem);
       }
       add(panel, "h 0!", indexZorder + 1);
       revalidate();
       repaint();
       DropDownMenu_Animation.showMenu(panel, item, layout, true);
    }
    
    
    //EVENT TUTUP MENU DROPDOWN
    private void hideMenu(SubMenu item, int index){
           for(Component com:getComponents()){
               if(com instanceof JPanel&&com.getName() !=null&&com.getName().equals(index+"")){
                   com.setName(null);
                   DropDownMenu_Animation.showMenu(com, item, layout, false);
                   break;
               }
           }
    }
    
    // CSS MENU
    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setColor(new Color(52, 58, 64)); //BACKGROUN MENU
        g2.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
        super.paintComponent(grphcs);
   
    }
}

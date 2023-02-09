package projet;
import java.awt.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Tab extends JTable {
       public Tab(){
                  this.getTableHeader().setDefaultRenderer(new header());
                  this.getTableHeader().setPreferredSize(new Dimension(0 ,35));
                
                  this.setDefaultRenderer(Object.class, new darkcell());
                  this.setRowHeight(50);
       }
        private class header extends DefaultTableCellRenderer{
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component com= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
                com.setBackground(new Color(153,102,255));
                com.setForeground(new Color(255,255,255));
                com.setFont(com.getFont().deriveFont(Font.BOLD, 14));
                  return com;
               }
       }
        private class darkcell extends DefaultTableCellRenderer{
                   @Override
                   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                  Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                  com.setFont(com.getFont().deriveFont(Font.BOLD, 14));
              if(isCellSelected(row,column)){
     
                  if(row % 2 == 0){
                     com.setBackground(new Color(33,103,153));
                 }
                 else{
                      com.setBackground(new Color(29,86,17));
                         }
              }else{
                      if(row % 2 == 0){
                      com.setBackground(new Color(50,50,50));
                         }
                          else{
                              com.setBackground(new Color(30,30,30));
                                 }
                    }
              return com;
           }
        
        }
}
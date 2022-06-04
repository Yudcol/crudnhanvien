/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author trand
 */
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.AbstractTableModel;

public class table extends AbstractTableModel{
    private String name[] = {"ID", "Ảnh", "Tên", "Phòng Ban", "Vị Trí"};
    private Class classes[] = {String.class, String.class, String.class, String.class, String.class};
    ArrayList<NhanVien> nvlist = new ArrayList<>();
    
    public table(ArrayList<NhanVien> list) {
        nvlist = list;
    }

    @Override
    public int getRowCount() {
        return nvlist.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            //Cột mã
            case 0: return nvlist.get(rowIndex).getId(); 
            //Cột họ tên
            case 1: {
            
                    JLabel imglabel = new JLabel();
                    ImageIcon img = new ImageIcon(nvlist.get(rowIndex).getImgpath());
                    Image imageresize = img.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
                    imglabel.setIcon(new ImageIcon(imageresize));
                    return imglabel;
            }
            
            case 2: return nvlist.get(rowIndex).getName();
            
            case 3: {
                if(nvlist.get(rowIndex).getDepartment() == 0)
                    return "Đào Tạo";
                else if(nvlist.get(rowIndex).getDepartment() == 1)
                    return "Hành Chính";
                else if(nvlist.get(rowIndex).getDepartment() == 2)
                    return "Kế Toán";
                else if(nvlist.get(rowIndex).getDepartment() == 3)
                    return "Khoa học&Công Nghệ";
                else if(nvlist.get(rowIndex).getDepartment() == 4)
                    return "Công tác sinh viên";
                else if(nvlist.get(rowIndex).getDepartment() == 5)
                    return "Thanh Tra";
                else if(nvlist.get(rowIndex).getDepartment() == 6)
                    return "Quản Trị";
            }
            /*
            Khoa học&Công Nghệ
            Công tác sinh viên
            Thanh tra
            Quản trị
            */
            case 4: {
                if(nvlist.get(rowIndex).getPosition() == 0) 
                    return "Giảng Viên";
                else 
                    return "Công Vụ";
            }
            
            default :return null;
        }
        
    }
     @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return name[column];
    }
    
}

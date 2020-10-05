package priloj;

import javax.swing.table.DefaultTableModel;

public class Model extends DefaultTableModel{

    public Model() {
        super(
            new Object[10][], 
            new String[]{
                "ФИО исполнителя", 
                "Junior (мин.ЗП)", 
                "Middle (мин.ЗП)", 
                "Senior (мин.ЗП)",
                "Коэффициент для Анализ и проектирование", 
                "Коэффициент для Установка оборудования", 
                "Коэффициент для Техническое обслуживание и сопровождение",
                "Коэффициент времени", 
                "Коэффициент сложности", 
                "Коэффициент для перевода в денежный эквивалент"
            }
        );
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        if(column != 0)
            return true;
        return false;
    }

    @Override
    public void setValueAt(Object aValue, int row, int column) {
        if(column > 3 && column < 7){
            float value = Float.valueOf((String)aValue);
            aValue = value > 1 ? 1 : value < 0 ? 0 : aValue;
        }
        super.setValueAt(aValue, row, column);
    }
    
    
     
}

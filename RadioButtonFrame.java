import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.PopupMenu;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;


public class RadioButtonFrame extends JFrame
{
    private JTextField texfield;
    private Font plainFont;
    private Font boldFont;
    private Font italicFont;
    private Font boldItalicFont;
    private JRadioButton plainJRadiButton;
    private JRadioButton boldJRadioButton;
    private JRadioButton italicJRdioButton;
    private JRadioButton boldItalicJRadioButton;
    private ButtonGroup radioGroup;
    
    public RadioButton Frame()
    {
       
    super("RadioButton test");
    setLayout(new FlowLayout ());
       JTextField textField = new JTextField("watch the font change", 25);
    add(textField);
    
        JRadioButton plainJRadioButton = new JRadioButton("Plain",true);
    boldJRadioButton = new JRadioButton("Bold",false);
        JRadioButton italicJRadioButton = new JRadioButton("Italic",false);
    add(plainJRadioButton);
    add(boldJRadioButton);
    add(italicJRadioButton);
    add(boldItalicJRadioButton);
    
    radioGroup = new ButtonGroup();
    radioGroup.add(plainJRadioButton);
    radioGroup.add(boldJRadioButton);
    radioGroup.add(italicJRadioButton);
    radioGroup.add(boldItalicJRadioButton);
    
    plainFont = new Font("serif",Font.PLAIN, 14);
    boldFont =  new Font("serif",Font.BOLD,14);
   italicFont = new Font("serif",Font.ITALIC,14);
  boldItalicFont = new Font("serif",Font.BOLD + Font.ITALIC, 14 );
  textField.setFont(plainFont);
  
    plainJRadioButton.addItemListener(
      new RadioButtonHandler(plainFont));
    boldJRadioButton.addItemListener(
    new RadioButtonHandler(boldFont));
    italicJRadioButton.addItemListener( 
    new RadioButtonHandler(italicFont));
    boldItalicJRadioButton.addItemListener(
    new RadioButtonHandler(boldItalicFont));
    } 
    private class RadioButtonHandler implements ItemListener
    {   
        private Font font;
        
        public RadioButtonHandler(Font f)
        {
       font = f;
        }
    public void itemStateChanged(ItemEvent event )
            
        }
   textField.setFont(font);
   
    
    
    }

     
    
}

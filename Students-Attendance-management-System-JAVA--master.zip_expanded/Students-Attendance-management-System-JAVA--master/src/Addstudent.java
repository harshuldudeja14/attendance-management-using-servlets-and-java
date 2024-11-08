import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;
import java.io.Writer;
import java.awt.event.ActionEvent;
@SuppressWarnings("unused")
public class Addstudent extends javax.swing.JFrame {
	private static final long serialVersionUID = -9045446600138314933L;
	public Addstudent() {
        initComponents();
    }
	private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try{    
        	           String f ="src\\students.txt";
        	           BufferedWriter output = new BufferedWriter(new FileWriter(f, true));
        	           output.append(jTextField1.getText()+","+jTextField3.getText()+"\n");
        	           output.newLine();
        	           output.close();
        	           dispose();
        	       }
        		catch(Exception e1){
        			System.out.println(e1);}}});
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabel1.setText("Name");
        jButton1.setText("OK");
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);} });
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add Student Info");
        jLabel5.setText("Semester");
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap(75, Short.MAX_VALUE)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        							.addPreferredGap(ComponentPlacement.RELATED))
        						.addComponent(jLabel1))
        					.addGap(73))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(jLabel5)
        					.addGap(88)))
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
        			.addGap(25))
        		.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
        			.addGap(92)
        			.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(96, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel4)
        			.addGap(26)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(31)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1)
        				.addComponent(jButton2))
        			.addContainerGap())
        );
        getContentPane().setLayout(groupLayout);
        pack();
    }
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(1);
    }
    public static void main(String args[]) {
    	new Addstudent().setVisible(true);    
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
}

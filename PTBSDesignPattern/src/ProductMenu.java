import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Iterator;

public abstract class ProductMenu extends JDialog {

	 Person person = null;

	 Product product;

	 boolean bLogout = true;

	JRadioButton AssignmentRadio = new JRadioButton();
	JComboBox AssignmentCombox = new JComboBox();
	JButton AssignmentViewButton = new JButton();
	JButton AssignmentAddButton = new JButton();
	JRadioButton OptionRadio = new JRadioButton();
	JLabel AssignmentContentLabel = new JLabel();
	JComboBox OptionCombo = new JComboBox();
	JButton OptionViewButton = new JButton();
	JButton OptionAddButton = new JButton();
	JButton buttonChangeCourse = new JButton();
	JButton buttonLogout = new JButton();

	public ProductMenu()
	{

		try
		{
			jbInit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		setModal(true);
		setSize(503,294);
	}

	private void jbInit() throws Exception
	{
		buttonChangeCourse.setText("ChangeCourse");
		buttonChangeCourse.setBounds(new Rectangle(101, 211, 73, 37));
		buttonChangeCourse.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				buttonChangeCourse_actionPerformed(e);
			}
		});
		this.getContentPane().setLayout(null);
		this.setTitle("");
		buttonLogout.setText("Logout");
		buttonLogout.setBounds(new Rectangle(267, 215, 73, 37));
		buttonLogout.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				buttonLogout_actionPerformed(e);
			}
		});
		this.getContentPane().add(buttonChangeCourse, null);
		this.getContentPane().add(buttonLogout, null);
	}

	public abstract void showMenu();

	public abstract void showAddButton();

	public abstract void showViewButton();

	public abstract void showRadioButton();

	public abstract void showLabels();

	public abstract void showComboxes();


	void AssignmentAddButton_actionPerformed(ActionEvent e)
	{
		Hacs.theFacade.AddAssignment(theCourse);
		refresh();
	}
	void AssignmentViewButton_actionPerformed(ActionEvent e)
	{
		Assignment theAss=(Assignment)AssignmentCombox.getSelectedItem() ;
		Hacs.theFacade.ViewAssignment(theAss);
	}
	void refresh()
	{
		AssignmentCombox.removeAllItems() ;
		Iterator Iter=product.assignmentList.iterator() ;
		while(Iter.hasNext() )
		{
			AssignmentCombox.addItem(Iter.next() );
		}
	}

	void buttonChangeCourse_actionPerformed(ActionEvent e)
	{
		bLogout=false;
		hide();
	}

	void buttonLogout_actionPerformed(ActionEvent e)
	{
		bLogout=true;
		hide();
	}

	boolean ifLogout()
	{
		return bLogout;
	}

}

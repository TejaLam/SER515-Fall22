public class Reminder {
    ReminderVisitor visitor=new ReminderVisitor();
    public void display(ArrayList list) {
        visitor.visitProduct(new ClassProductList());
    }

}

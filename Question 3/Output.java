import static javax.swing.JOptionPane.*;

public class Output {
    public static void main(String[] args) {
        Book b = new Book();
        String opinion=showInputDialog("Want to add a new book","Type yes or no");
        if (opinion.equalsIgnoreCase("yes"))
        {
            String bname=showInputDialog("Enter name of the book");
            String author=showInputDialog("Enter the name of the author");
            String bisbn=showInputDialog("Enter the international standard book number");
            
            b.setTittle(bname);
            b.setAuthor(author);
            b.setIsbn(bisbn);
            
            //Showing the output
            showMessageDialog(null,"The name of the book is "+b.getTittle()+" whose author is "+b.getAuthor()+" with Internation Standard Book Number as "+b.getIsbn());
        }
        else
            showMessageDialog(null, "Have a nice day");
        
    }
}


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cube
 */
public class Chat {

    public class SimpleChatClientA {

        JTextField outgoing;
        PrintWriter writer;
        Socket sock;

        public void go() {
// make gui and register a listener with the send button
// call the setUpNetworking() method
        }

        private void setUpNetworking() {
// make a Socket, then make a PrintWriter
// assign the PrintWriter to writer instance variable
        }

        public class SendButtonListener implements ActionListener {

            public void actionPerformed(ActionEvent ev) {
// get the text from the text field and
// send it to the server using the writer (a PrintWriter)
            }
        } // close SendButtonListener inner class
    } // close outer class
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapp;

import com.email.durgesh.Email;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author sathe
 */
public class EmailSend {
    public static void main(String[] args) {
        
        String to= "omkarsathe567@gmail.com";
        String from = "satheomkar143@gmail.com";
        
        Properties properties = System.getProperties();
            
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "465");
            properties.put("mail.smtp.ssl.enable", "true");
            properties.put("mail.smtp.auth", "true");
            
            Session  session = Session.getInstance(properties, new javax.mail.Authenticator(){
                
                @Override
                protected PasswordAuthentication getPasswordAuthentication(){
                    return  new  PasswordAuthentication("satheomkar143@gmail.com", "vrbnwirpqtcdfudy");
                }
            }  
            );
            
            session.setDebug(true);
            
            try {
                MimeMessage message = new MimeMessage(session);
                
                message.setFrom(new InternetAddress(from));
                
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                
                message.setSubject("lets make authentication easy");
                
                message.setText("this is massage from omkar sathe");
                
                System.out.println("sending............");
                
                Transport.send(message);
                
                System.out.println("sent massage successfully");
        } catch (MessagingException mex) {
            mex.printStackTrace(); 
        }
        
        
//        try {
//            
//            
//            
//            
//            
//            Email email = new Email("satheomkar143@gmail.com","vrbnwirpqtcdfudy");
//            email.setFrom("satheomkar143@gmail.com",   "SPARK Institute");
//            email.setSubject("Spark Verification code");
//            email.setContent("<h1> Your OTP </h1>", "text/html");
//            email.addRecipient("omkarsathe567@gmail.com");
//            email.send();
//            System.out.println("quizapp.EmailSend.main()");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
}

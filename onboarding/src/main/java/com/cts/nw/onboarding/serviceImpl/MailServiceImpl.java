package com.cts.nw.onboarding.serviceImpl;


import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import com.cts.nw.onboarding.service.MailService;
 

 
@Service("mailService")
public class MailServiceImpl implements MailService {
 
    //@Autowired
    JavaMailSender mailSender = new JavaMailSenderImpl();
    public static String TOEMAILADDRESS = "Sankaranarayanan.G@cognizant.com"; 
    public static String FROMEMAILADDRESS = "SMPTNationWide@cognizant.com";
    /*public static String TOEMAILADDRESS = "srisankar333@gmail.com"; 
    public static String FROMEMAILADDRESS = "srisankar333@gmail.com";*/

    @Override
    public void sendEmail(final Object object) {
 
    	//String emailContent="Email Message With attachment Resource has been sent successfully.........................";
 
    	MimeMessagePreparator preparator = getContentWtihAttachementMessagePreparator(object.toString());
 
        try {
        	
        	mailSender.send(preparator);
            System.out.println("Message With Attachement has been sent.............................");
            preparator = getContentAsInlineResourceMessagePreparator(object.toString());
            mailSender.send(preparator);
            System.out.println("Message With Inline Resource has been sent.........................");
        } catch (MailException ex) {
            System.err.println(ex.getMessage());
        }
    }
 
    private MimeMessagePreparator getContentWtihAttachementMessagePreparator(final String emailContent) {
 
        MimeMessagePreparator preparator = new MimeMessagePreparator() {
 
            public void prepare(MimeMessage mimeMessage) throws Exception {
                MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
 
                helper.setSubject("Email Subject with attachment");
                helper.setFrom(FROMEMAILADDRESS);
                helper.setTo(TOEMAILADDRESS);
                //String content = "Dear thank you for placing order. ";
 
                helper.setText(emailContent);
 
                // Add a resource as an attachment
                //helper.addAttachment("cutie.png", new ClassPathResource("linux-icon.png"));
 
            }
        };
        return preparator;
    }
 
    private MimeMessagePreparator getContentAsInlineResourceMessagePreparator(final String emailContent) {
 
        MimeMessagePreparator preparator = new MimeMessagePreparator() {
 
            public void prepare(MimeMessage mimeMessage) throws Exception {
                MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
 
                helper.setSubject("Email Subject with inline attachment");
                helper.setFrom(FROMEMAILADDRESS);
                helper.setTo(TOEMAILADDRESS);
 
                //String content = "Dear , thank you for placing order." ;
 
                // Add an inline resource.
                // use the true flag to indicate you need a multipart message
                //helper.setText("<html><body><p>" + content + "</p><img src='cid:company-logo'></body></html>", true);
                helper.setText(emailContent);
                //helper.addInline("company-logo", new ClassPathResource("linux-icon.png"));
            }
        };
        return preparator;
    }

	

 
}
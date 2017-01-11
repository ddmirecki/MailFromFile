package pl.sda;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.io.Files;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by RENT on 2017-01-10.
 */
public class MailFromFile2 {

    public static void sendMailWithMessageFromFile(String address, String title, String filePath) throws EmailException, IOException {
        File file = new File(filePath);
        List<String> linesFiles = Files.readLines(file, Charsets.UTF_8);

        Joiner joiner = Joiner.on(System.lineSeparator());
        String text = joiner.join(linesFiles);

        sendMail(address, title, text);
    }


    public static void sendMail(String address, String title, String content) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthentication("javandwro1@gmail.com", "javand1wro");
        email.setSSLOnConnect(true);
        email.setFrom("javandwro1@gmail.com");
        email.setSubject(title);
        email.setMsg(content);
        email.addTo(address);
        email.send();
    }
}


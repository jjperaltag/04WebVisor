package com.bdd.VISOR.api;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.model.ListMessagesResponse;
import com.google.api.services.gmail.model.Message;

import java.io.*;
import java.security.GeneralSecurityException;

public class GmailAPI {


    private static final String APPLICATION_NAME = "Gmail API Java Quickstart";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String user = "me";
    static Gmail service = null;
    private static File filePath = new File(System.getProperty("user.dir") + "/credentials.json");

    public static void main(String[] args) throws IOException, GeneralSecurityException{

        InputStream in = new FileInputStream(filePath); // Read credentials.json
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        Credential authorize = new GoogleCredential.Builder().setTransport(GoogleNetHttpTransport.newTrustedTransport())
                .setJsonFactory(JSON_FACTORY)
                .setClientSecrets(clientSecrets.getDetails().getClientId().toString(),
                        clientSecrets.getDetails().getClientSecret().toString())
                .build()
                .setAccessToken("ya29.a0AfH6SMAjF7VxbbugPFSV5GJlL5zNGwksNg82pAyZ88Q6wJpJsaKHEG_RN31D_Gb8WIfVcuTyIeKeCCQNlN43-bQlZNH_8diKvDRABM4iFxi1tTHrHh0sP1tILr1tpwBHN8w_wK97lEEJwKKU_St-GKGU2GM3")//Replace this
                .setRefreshToken("1//045-4R47PmxqACgYIARAAGAQSNwF-L9IrWbZAUJeiQIz9Y-6cYCgOLTgWJRyfaxy2_iYAqbiu4CT_vemcN_amgPgq0skhrY7neWU");//Replace this

        // Create Gmail service
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        service = new Gmail.Builder(HTTP_TRANSPORT, JSON_FACTORY, authorize)
                .setApplicationName(GmailAPI.APPLICATION_NAME).build();

        //access Gmail Inbox

        Gmail.Users.Messages.List request = service.users().messages().list(user).setQ("from: " + "atencionenlinea@movistar.com.pe");
        ListMessagesResponse messagesResponse = request.execute();
        request.setPageToken(messagesResponse.getNextPageToken());

        // Get ID of the email you are looking for
        String messageId = messagesResponse.getMessages().get(0).getId();

        Message message = service.users().messages().get(user, messageId).execute();

        // Print email body

        String emailBody = message.getSnippet();
        System.out.println("code:"+tokenEmail(emailBody));

    }

    public static String getBodyEmail() throws IOException, GeneralSecurityException {

        InputStream in = new FileInputStream(filePath); // Read credentials.json
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

       Credential authorize = new GoogleCredential.Builder().setTransport(GoogleNetHttpTransport.newTrustedTransport())
                .setJsonFactory(JSON_FACTORY)
                .setClientSecrets(clientSecrets.getDetails().getClientId().toString(),
                        clientSecrets.getDetails().getClientSecret().toString())
                .build()
                .setAccessToken("ya29.a0AfH6SMAjF7VxbbugPFSV5GJlL5zNGwksNg82pAyZ88Q6wJpJsaKHEG_RN31D_Gb8WIfVcuTyIeKeCCQNlN43-bQlZNH_8diKvDRABM4iFxi1tTHrHh0sP1tILr1tpwBHN8w_wK97lEEJwKKU_St-GKGU2GM3")//Replace this
                .setRefreshToken("1//045-4R47PmxqACgYIARAAGAQSNwF-L9IrWbZAUJeiQIz9Y-6cYCgOLTgWJRyfaxy2_iYAqbiu4CT_vemcN_amgPgq0skhrY7neWU");//Replace this

        // Create Gmail service
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        service = new Gmail.Builder(HTTP_TRANSPORT, JSON_FACTORY, authorize)
                .setApplicationName(GmailAPI.APPLICATION_NAME).build();

        //access Gmail Inbox

        Gmail.Users.Messages.List request = service.users().messages().list(user).setQ("from: " + "atencionenlinea@movistar.com.pe");
        ListMessagesResponse messagesResponse = request.execute();
        request.setPageToken(messagesResponse.getNextPageToken());

        // Get ID of the email you are looking for
        String messageId = messagesResponse.getMessages().get(0).getId();

        Message message = service.users().messages().get(user, messageId).execute();

        // Print email body

        String emailBody = message.getSnippet();

        return tokenEmail(emailBody);

    }

    public static String tokenEmail(String cad){
        int pos = cad.indexOf("código");
        //System.out.println(pos);
        cad = cad.substring((pos + 7), (pos + 11));
        return cad;
    }
}
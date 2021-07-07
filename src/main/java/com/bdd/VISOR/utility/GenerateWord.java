/*
    @author: Abraham Hernandez - TSOFT
*/
package com.bdd.VISOR.utility;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class GenerateWord {

    private static final String PATH_RELATIVE_WORD  = "/src/main/java/com/bdd/VISOR/template/Evidencia.docx";
    private static final String TEMPLATE            = "/src/main/java/com/bdd/VISOR/template/Plantilla.png";
    private static final String WORD_NAME_STANDAR   = "Evidencia.docx";
    private static final String FILE_PATH_STANDAR   = FileHelper.getProjectFolder() + "/target/resultado/";
    public static XWPFDocument document ;
    public static XWPFParagraph paragraph ;
    public static XWPFRun run;
    public static FileOutputStream fileOutputStream;
    private String TEMP_WORD_FILE;

    public void startUpWord(String name) {

        try {
            File fileUnique = new File(FileHelper.getProjectFolder() + PATH_RELATIVE_WORD);

            copyExistentWord(fileUnique);

            document = new XWPFDocument();

            paragraph = document.createParagraph();

            run = paragraph.createRun();

            String carpeta = FILE_PATH_STANDAR;

            FileUtils.forceMkdir(new File(carpeta));

            TEMP_WORD_FILE = FileUtils.getFile(carpeta) + "/"+name +"-" + generarSecuencia() + ".docx";
            fileOutputStream = new FileOutputStream(FileUtils.getFile(carpeta) + "/"+name +"-" + generarSecuencia() + ".docx");

            InputStream insertTemplate = new FileInputStream(FileHelper.getProjectFolder() + TEMPLATE);

            run.addPicture(insertTemplate, Document.PICTURE_TYPE_PNG, "1", Units.toEMU(440), Units.toEMU(640));

            run.addBreak();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void sendBreak(){run.addBreak();}

    public void copyExistentWord(File file) {

        InputStream inputStream = null;

        OutputStream outputStream = null;

        try {

            File fileUnique = new File(file.getPath());

            File copyFile = new File(WORD_NAME_STANDAR);

            inputStream = new FileInputStream(fileUnique);

            outputStream = new FileOutputStream(copyFile);

            byte[] buffer = new byte[1024];

            int length;

            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }

            inputStream.close();

            outputStream.close();

        } catch (IOException r) {

            r.printStackTrace();

        }
    }

    public void addImageToWord(WebDriver driver) {

        try {

            TakesScreenshot screenshot  = ((TakesScreenshot)driver);

            File source                 = screenshot.getScreenshotAs(OutputType.FILE);

            InputStream inputStream  = new FileInputStream(source);

            run.addPicture(inputStream, Document.PICTURE_TYPE_PNG, "1", Units.toEMU(500), Units.toEMU(230));

            run.addBreak();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public void addImageSmallToWord(WebDriver driver) {

        try {

            TakesScreenshot screenshot  = ((TakesScreenshot)driver);

            File source                 = screenshot.getScreenshotAs(OutputType.FILE);

            InputStream inputStream  = new FileInputStream(source);

            run.addPicture(inputStream, Document.PICTURE_TYPE_PNG, "1", Units.toEMU(215), Units.toEMU(300));

            run.addBreak();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public void sendText(String texto)  {
        run.setText("Fecha : " +generarFecha() + ", Hora : " + generarHora() + " | " + texto);
        run.addTab();
        run.setFontFamily("Century Gothic");
        run.setFontSize(9);
        run.addCarriageReturn();
    }

    public void endToWord(String status) throws IOException   {

        try {

            document.write(fileOutputStream);

            File fileWithNewName = new File(TEMP_WORD_FILE.split("\\.docx")[0]+"-"+status.toUpperCase()+".docx");

            if(new File(TEMP_WORD_FILE).renameTo(fileWithNewName)) {

                System.out.println("[LOG] WORD: Evidencia renombrada - Se añadió el estado final del escenario");
            } else {

                System.out.println("[LOG] WORD: Evidencia no pudo ser renombrada - No Se añadió el estado final del escenario");

            }

            File file = new File(FileHelper.getProjectFolder() + "/Evidencia.docx");

            if (file.exists()){ file.delete(); }

            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("[LOG] Word cerrado");
    }

    private final static String generarSecuencia() {

            DateFormat df = new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss");

            df.setTimeZone(TimeZone.getTimeZone("America/Bogota"));

            return df.format(new Date());

    }

    private final static String generarFecha() {

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        df.setTimeZone(TimeZone.getTimeZone("America/Bogota"));

        return df.format(new Date());

    }

    private final static String generarHora(){
        DateFormat df = new SimpleDateFormat("hh:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("America/Bogota"));

        return df.format(new Date());
    }

    }

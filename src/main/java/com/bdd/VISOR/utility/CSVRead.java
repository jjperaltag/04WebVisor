package com.bdd.VISOR.utility;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CSVRead {
    public static List<String> data(String nombre, int indice) throws IOException, CsvValidationException {
        String[] csvCell;
        CSVReader csvReader;
        String name = obtenerNombreLastFileDefinited(nombre);
        String path = (new File("")).getAbsolutePath() + "\\download\\" + name;
        csvReader = new CSVReader(new FileReader(path));
        List<String> list = new ArrayList<>();
        int count = 0;

        while((csvCell = csvReader.readNext()) != null){
            if(count != 0){
                list.add(csvCell[indice]);
            }
            count++;
        }
        return list;
    }

    public static int getIndice(String nombre, String key) throws IOException, CsvValidationException {
        String[] csvCell;
        CSVReader csvReader;
        String name = obtenerNombreLastFileDefinited(nombre);
        String path = (new File("")).getAbsolutePath() + "\\download\\" + name;
        csvReader = new CSVReader(new FileReader(path));
        int count = 0;
        int numIndex = 0;
        boolean flag = false;

        while(((csvCell = csvReader.readNext()) != null) && !flag){
            long cantDatos = Arrays.stream(csvCell).count();
            for(int x=0; x<= cantDatos; x++){
                String dato = csvCell[count];
                if(dato.contains(key)){
                    numIndex = count;
                    flag = true;
                    break;
                }else{
                    count++;
                }
            }
        }
        return numIndex;
    }

    public static String obtenerNombreLastFile() {
        String valor = "";
        String path = (new File("")).getAbsolutePath() + "\\download\\";
        File file = new File(path);
        File[] lista = file.listFiles();
        Arrays.sort(lista, new Comparator() {
            public int compare(Object o1, Object o2) {
                if (((File) o1).lastModified() > ((File) o2).lastModified()) {
                    return -1;
                } else if (((File) o1).lastModified() < ((File) o2).lastModified()) {
                    return +1;
                } else {
                    return 0;
                }
            }
        });
        if (lista.length != 0) valor = lista[0].getName();
        return valor;
    }

    public static String obtenerNombreLastFileDefinited(String nombre) {
        String valor = "";
        String path = (new File("")).getAbsolutePath() + "\\download\\";
        File file = new File(path);
        File[] lista = file.listFiles();
        List<String> listado = new ArrayList<>();

        for(File f : lista){
            listado.add(f.getName());
        }

        Iterator<String> it = listado.iterator();
        while (it.hasNext()) {
            String current = it.next();
            if (!current.toLowerCase().contains(nombre)) {
                it.remove();
            }
        }

        if(listado.size()>1){
            valor = listado.get(listado.size()-2);
        }else{
            valor = listado.get(listado.size()-1);
        }

        return valor;
    }
}

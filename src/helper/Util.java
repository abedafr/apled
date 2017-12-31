/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import static java.nio.file.Files.list;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.util.Collections.list;
import java.util.List;
import static javax.xml.transform.OutputKeys.ENCODING;
import org.jpl7.Atom;
import org.jpl7.Query;
import org.jpl7.Term;

/**
 *
 * @author zack
 */
public class Util {

    public void checkdb(String db) {
        // String t="consult("+db+")";
        Query q1 = new Query("consult",
                new Term[]{new Atom(db)});
        System.out.println("consulting " + (q1.hasSolution() ? "succeeded" : "failed"));

    }

    public void save(File file, String textToSave) {

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
            out.newLine();
            out.write(textToSave);
            out.close();
        } catch (IOException e) {
        }
    }
    public void rewrite(File file, String textToSave) {

        try {
            PrintWriter writer = new PrintWriter(file);
            writer.print("");
//            BufferedWriter out = new BufferedWriter(writer);
//            out.newLine();
//            out.write(textToSave);
            writer.write(textToSave);
//            out.close();
            writer.close();
        } catch (IOException e) {
        }
    }

    public String readFile(File f) {
//        File f = new File(filename);
        try {
            byte[] bytes = Files.readAllBytes(f.toPath());
            return new String(bytes, "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
//
//    public List<String> readFilelinebyline(String filename) throws IOException {
//        Path path = Paths.get("texte.pl");
//        return Files.readAllLines(path);
//
//    }
}

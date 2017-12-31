/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import helper.Util;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;

/**
 * All rights reserved The source code is protected to its owner
 *
 * @author Abed
 */
public class PlFacade {

    private Util util = new Util();
    private File file;

    public void getFile(String path) {
        Path p = Paths.get(path);
        file = p.toFile();
    }

    public String makeRequest(String query) {
        util.checkdb(file.getAbsolutePath());
        Query q = new Query(query);
        q.open();
        String res = "";
        System.out.println("fc op");
        while (q.hasMoreSolutions()) {
            Map<String, Term> solution = q.nextSolution();
            System.out.println("query "+q.toString());
            System.out.println("query "+q.allSolutions());
            System.out.println("query "+q.getSolution());
            System.out.println("sol " + solution);
            res += solution.toString() + "\n";
            System.out.println("res " + res);
        }
        return res;
    }

    public void save(String text) {
        System.out.println("save facade");
        util.rewrite(file, text);
    }

    public String readFile() {
        String content = util.readFile(file);
        return content;
    }

    public void saveFile(String content) {
        util.save(file, content);
    }

}

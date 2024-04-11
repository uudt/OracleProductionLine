/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.tyuleneva.oraclproduction;

/**
 *
 * @author udtyu
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ProcessFiles {
    private Path p, p2, p3;

    public ProcessFiles(EmployeeInfo employee, ArrayList<Product> product) {
        p = Paths.get("C:\\LineTests");
        p2 = Paths.get("TestResults.txt");
        p3 = p.resolve(p2);
        CreateDirectory();
        try {
            WriteFile(employee);
            WriteFile(product);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    // checks if the directory is created, if not - it will be created
    private void CreateDirectory() {
        if (Files.notExists(p)) {
            try {
                Files.createDirectories(p);
                System.out.println("Directory Created");
            } catch (IOException e) {
                System.out.println("Can't Create Directory");
            }
        }
    }

    public void WriteFile(EmployeeInfo employee) throws IOException {
        FileWriter writer = new FileWriter(p3.toString(), true);
        PrintWriter printWriter = new PrintWriter(writer);
        printWriter.println(employee.toString());
        printWriter.close();
    }

    public void WriteFile(ArrayList<Product> products) throws IOException {
        File file = new File(p3.toString());
        Writer writer = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
        PrintWriter printWriter = new PrintWriter(writer);
        printWriter.println(products.toString());

        printWriter.close();
    }
}


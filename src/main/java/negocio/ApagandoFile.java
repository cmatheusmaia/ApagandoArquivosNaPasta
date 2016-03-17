package negocio;

import java.io.File;
import java.io.FileFilter;

import javax.swing.JOptionPane;

public class ApagandoFile {
	public static void main (String[]args){
	
		File diretorio = new File("C:\\teste"); 
        FileFilter ff = new FileFilter() { 
            public boolean accept(File arquivo){ 
                return arquivo.getName().endsWith(".txt") ||
                		arquivo.getName().endsWith(".sql") ||
                		arquivo.getName().endsWith(".docx") ||
                		arquivo.getName().endsWith(".pdf") ||
                		arquivo.getName().endsWith(".rar") ||
                		arquivo.getName().endsWith(".xls") ||
                		arquivo.getName().endsWith(".xlsx") ||
                		arquivo.getName().endsWith(".ppt") ||
                		arquivo.getName().endsWith(".zip") ||
                		arquivo.getName().endsWith(".zip") ||
                		arquivo.getName().endsWith(".pptx");
            } 
        }; 
        File[] arquivos = diretorio.listFiles(ff); 
        if(arquivos != null){ 
            for(File arquivo : arquivos){ 
               arquivo.delete();  
            } 
            JOptionPane.showMessageDialog(null, "Arquivos deletados!");
            System.exit(0);
        }
	}
}	
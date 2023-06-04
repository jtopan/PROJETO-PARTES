package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class PartRepository 
{
    public String nmRepo;
    public ArrayList<Part> partList;

    public PartRepository()
    {
        System.out.println("Digite o nome do repositório: ");
        Scanner s = new Scanner(System.in);

        try 
        {
            Boolean b = false;
            String nome = s.nextLine();

            do 
            { 
                if (nome.isEmpty())
                {
                    System.out.println("\nInsira um nome: ");
                }
                else 
                {
                    b = true;
                }
            } while (!b);

            this.nmRepo = nome;
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            s.close();
        }
    }
    
    public void InsertPart(Part part)
    {
        try 
        {
            this.partList.add(part);
            System.out.println("\nPeça adicionada com sucesso.");;
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }

    public void ListParts()
    {
        int i = 1;
        for (Part p : this.partList) 
        {
            System.out.println("Peça " + i + ":    " + "ID = " + p.idPart + " | Nome = " + p.nmPart + " | Primitiva? " + p.IsPrimitive());
            i++;
        }
    }

    public void GetRepoInfo()
    {
        System.out.println("Nome do repositório conectado: " + this.nmRepo + " | Número de peças contidas: " + partList.size());
    }
}

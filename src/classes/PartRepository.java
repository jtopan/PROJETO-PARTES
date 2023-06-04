package classes;

import java.util.ArrayList;

public class PartRepository 
{
    public String nmRepo;
    public ArrayList<Part> partList;

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
}

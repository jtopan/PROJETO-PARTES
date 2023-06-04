package classes;

import java.util.ArrayList;
import interfaces.IParts;

public class Part implements IParts
{
    private int idPart;
    private String dsPart;
    private String nmPart;
    private ArrayList<SubPart> ListSubParts;
    private String repoOrigin;

    public void GetPartInfo()
    {
        System.out.println("\nID da peça: " + this.idPart);
        System.out.println("\nNome da peça: " + this.nmPart);
        System.out.println("\nDescrição da peça: " + this.dsPart);
        System.out.println("\nRepositório de origem: " + this.repoOrigin);
        System.out.println("\nPeça é primitiva?: " + (this.IsPrimitive() ? "Sim" : "Não"));
        System.out.println("\nNúmero de subpeças: " + this.GetSubPartNum());
    }

    public void SetRepoOrigin(String repoOrigin)
    {
        this.repoOrigin = repoOrigin;
    }

    public Boolean IsPrimitive()
    {
        return this.ListSubParts.isEmpty() ? true : false;
    }

    public int GetSubPartNum()
    {
        return this.ListSubParts.size();
    }

    public void ListSubParts()
    {
        int i = 1;
        if (!ListSubParts.isEmpty())
        {
            for (SubPart s : this.ListSubParts) 
            {
                System.out.println("\nParte " + i + ": " + s.subPart.nmPart + " | Quantidade: " + s.qtd);
                i++;
            }
        }
        else
        {
            System.out.println("\nEssa é uma peça primitiva.");
        }
        
    }
}

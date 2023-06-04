package interfaces;

import classes.Part;

public interface IPartRepository 
{
    public void InsertPart(Part part);
    public void ListParts();
    public void GetRepoInfo();
}

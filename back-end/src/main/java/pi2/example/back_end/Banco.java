package pi2.example.back_end;

public class Banco  // classe Singleton 
{
    static private Conexao con=new Conexao();
    static public boolean conectar()
    {
        return con.conectar("jdbc:postgresql://localhost:5432/", 
                "SCFV", "postgres", "postgres123");
        
    }
    static public Conexao getCon()
    {
        return con;
    }

    private Banco() {
    }
    
}

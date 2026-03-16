
package pi2.example.back_end.DAO;

import pi2.example.back_end.Conexao;
import pi2.example.back_end.Modelo.Evento;

import java.util.List;

public interface IDAL <T>{
    public boolean gravar(T entidade);
    public boolean alterar(T entidade);
    public boolean apagar(T entidade);
    public T get(int id);

    public List<T> get(String filtro);
}

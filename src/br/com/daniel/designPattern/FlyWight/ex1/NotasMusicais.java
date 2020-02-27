package br.com.daniel.designPattern.FlyWight.ex1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotasMusicais {

    private static Map<String, Nota> notas = new HashMap<String, Nota>();
    private static List<Class<? extends Nota>> clazess;
    static{

        clazess = Arrays.asList(
                Do.class, Re.class, Mi.class, Fa.class,
                Sol.class,La.class, Si.class);
    }


    public Nota pega (String nome){
        try {
            if(!notas.containsKey(nome)) {
                for(Class<? extends Nota> clazz : clazess) {
                    if(clazz.getSimpleName().toLowerCase().equals(nome)) {
                        notas.put(nome, (Nota) clazz.newInstance());
                        break;
                    }
                }
            }

            return notas.get(nome);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


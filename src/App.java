import java.time.LocalDate;

import br.com.dio.java.BootCamp;
import br.com.dio.java.Curso;
import br.com.dio.java.Dev;
import br.com.dio.java.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
      Curso curso = new Curso();
      curso.setTitulo("titulo curso");
      curso.setDescricao("descricao");
      curso.setCargaHoraria(8);

      Curso curso1 = new Curso();
      curso1.setTitulo("titulo curso1");
      curso1.setDescricao("descricao do curso1");
      curso1.setCargaHoraria(4);
      //System.out.println(curso);

      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("titulo da mentoria");
      mentoria.setDescricao("descricao da mentoria");
      mentoria.setData(LocalDate.now());
     // System.out.println(mentoria);

     BootCamp bootcamp = new BootCamp();
     bootcamp.setNome("BootCammp java developer");
     bootcamp.setDescricao("descricao do bootcamp");
     bootcamp.getConteudos().add(curso);
     bootcamp.getConteudos().add(curso1);
     bootcamp.getConteudos().add(mentoria);

     Dev devCamila = new Dev();
      devCamila.setNome("Camila");
      devCamila.inscriverBootCamp(bootcamp);
      System.out.println("conteudos inscritos  da camila: "+devCamila.getConteudoInscritos());
      devCamila.progredir();
      devCamila.progredir();
      System.out.println("-");
      System.out.println("conteudos inscritos  da camila: "+devCamila.getConteudoInscritos());
      System.out.println("conteudos concluidos da camila: "+devCamila.getConteudoConcluidos());
      System.out.println("XP: "+devCamila.calcularTotalXp());

      System.out.println("-------------------");
      Dev devJoao = new Dev();
      devJoao.setNome("joaoa");
      devJoao.inscriverBootCamp(bootcamp);
      System.out.println("conteudos inscritos do joão: "+devJoao.getConteudoInscritos());
      devJoao.progredir();
      System.out.println('-');
      System.out.println("conteudos inscritos do joão: "+devJoao.getConteudoInscritos());
      System.out.println("conteudos concluidos do joão: "+devJoao.getConteudoConcluidos());
      System.out.println("XP: "+devJoao.calcularTotalXp());
    }
}

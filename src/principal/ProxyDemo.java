/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author gkrause
 */

import proxy.AudioIF;
import proxy.ProxyAudio;

public class ProxyDemo
  {
    public static void main(String[] args)
      {
        AudioIF meuAudio = new ProxyAudio("meuArquivo.mp3 ");
        
        meuAudio.play(); // Primeira instância de TipoRealAudio
          System.out.println();
          
          
          meuAudio.play(); // Classe já instanciada. Tratamento do If
          System.out.println();
      }
  }

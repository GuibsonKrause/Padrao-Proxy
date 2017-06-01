/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author gkrause
 */
public class TipoRealAudio implements AudioIF // Classe concreta que também implementa de AudioIF
  {
    private final String nomeArquivo; // Nome do arquivo que vai dar o play
    
    public TipoRealAudio(String nomeArquivo)
      {
        this.nomeArquivo = nomeArquivo;
        carregandoArquivo(nomeArquivo);
      }
    
    @Override
    public void play()
      {
          System.out.println("Tocando o arquivo de nome " + nomeArquivo);
      }
    
    public void carregandoArquivo(String nomeArquivo)
      {
          System.out.println("Carregando arquivo " + nomeArquivo + "do disco");
      }
  }

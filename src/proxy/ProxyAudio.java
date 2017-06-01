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
public class ProxyAudio implements AudioIF // Também implementa a interface AudioIF
  {

    private TipoRealAudio meuAudio;
    private final String nomeArquivo;

    public ProxyAudio(String nomeArquivo)
      {
        this.nomeArquivo = nomeArquivo;
      }
    
    @Override
    public void play()
      {
        if (meuAudio == null)
          {
              System.out.println("Instância não existia....Criando instância"
                      + "de TipoRealAudio");
              meuAudio = new TipoRealAudio(nomeArquivo);
          }
        else
          {
              System.out.println("Recuperando instância anteriormente criada"
                      + "de TipoRealAudio");
          }
        
        meuAudio.play();
        
      }
  }

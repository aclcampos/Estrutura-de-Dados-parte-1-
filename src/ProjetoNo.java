public class ProjetoNo<T> {
   private ProjetoNo<T>proximoNo; 
   private T conteudo; 
  
   public ProjetoNo( T conteudo) {
    this.proximoNo = null;
    this.conteudo = conteudo;

}

public ProjetoNo<T> getProximoNo() {
    return proximoNo;
}

public void setProximoNo(ProjetoNo<T> proximoNo) {
    this.proximoNo = proximoNo;
}

public T getConteudo() {
    return conteudo;
}

public void setConteudo( T conteudo) {
    this.conteudo = conteudo;
}

@Override
public String toString() {
    return "ProjetoNo [conteudo=" + conteudo + "]";
}
 

}


     

       
        


        

    

    
    


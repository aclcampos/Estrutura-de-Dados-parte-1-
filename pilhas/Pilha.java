public class Pilha {
    

    private No refNoEstradaPilha;
    public char[] push;

    public Pilha() {
        this.refNoEstradaPilha = null;
    } 
    
    public void push(No novoNO){
        No refAuxiliar = refNoEstradaPilha; 
        refNoEstradaPilha = novoNO; 
        refNoEstradaPilha.setRefNo(refAuxiliar); 
    }
    
    public No pop(){
        if(isEmpty()){
            No noPoped = refNoEstradaPilha; 
            refNoEstradaPilha = refNoEstradaPilha.getRefNo(); 
            return noPoped; 
        }
        return null; 
    }



    public No top(){
        return refNoEstradaPilha; 
    }
    
public boolean isEmpty(){
//    if(refNoEstradaPilha == null){ 
//        return true; 

    //return false;   
    return refNoEstradaPilha == null ?true : false; 
    }

@Override
public String toString() {
    

    String stringRetorno = "-----------\n"; 
    stringRetorno += "      Pilha\n"; 
    stringRetorno +="-----------\n";


    No noAuxiliar = refNoEstradaPilha; 

    while (true){
        if(noAuxiliar != null){
            stringRetorno += "[No{dado=" + noAuxiliar.getDado()+"}]\n";
            noAuxiliar = noAuxiliar.getRefNo(); 

        }else{
            break; 
        }
    
    }
    stringRetorno += "===========\n";
    return stringRetorno; 
}   

    

} 
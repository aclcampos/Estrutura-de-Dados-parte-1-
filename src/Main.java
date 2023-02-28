public class Main {
    public static void main(String[] args) {
        
            ProjetoNo<String> no1 = new ProjetoNo<>("Conteúdono1");

            ProjetoNo<String> no2 = new ProjetoNo<>("Conteúdo no2"); 
            no1.setProximoNo(no2);

            ProjetoNo<String> no3 = new ProjetoNo<>("Conteúdo no3"); 
            no2.setProximoNo(no3);

            ProjetoNo<String> no4 = new ProjetoNo<>("Conteúdo no4");
            no3.setProximoNo(no4); 

            System.out.println(no1);
            System.out.println(no1.getProximoNo());
            System.out.println(no1.getProximoNo().getProximoNo());
            System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
            System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo() );
    }
} 

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientSW {
    public static void main(String[] args) {
        BanqueService banqueService=new BanqueWS().getBanqueServicePort();
        System.out.println(banqueService.convert(7600));
        Compte compte=banqueService.getCompte(5);
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());
    }
}

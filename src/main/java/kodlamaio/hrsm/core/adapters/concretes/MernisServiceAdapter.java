package kodlamaio.hrsm.core.adapters.concretes;
import kodlamaio.hrsm.mernis.HAMKPSPublicSoap;
import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.core.utilities.results.SuccessDataResult;
import kodlamaio.hrsm.entities.concretes.users.User;

import java.io.IOException;
import java.rmi.RemoteException;

public class MernisServiceAdapter {


    DataResult<String> CheckIfRealPerson(User user) throws IOException,NumberFormatException, RemoteException{
        HAMKPSPublicSoap kpsPublic = new 	HAMKPSPublicSoap();
        try {
            kpsPublic.TCKimlikNoDogrula(Long.parseLong(user.getTcNo()), user.getFirstName(),user.getLastName(),Integer.parseInt(user.getDateOfBirth()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return new SuccessDataResult<>("Doğrulama başarılı");
    }
}

package kodlamaio.hrsm.business.abstracts.users;

import kodlamaio.hrsm.core.utilities.results.DataResult;
import kodlamaio.hrsm.entities.concretes.users.Verification;


import java.util.List;

public interface VerificationService {
    DataResult<List<Verification>> getAll();
}

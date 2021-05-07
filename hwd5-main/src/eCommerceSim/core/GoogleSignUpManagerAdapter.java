package eCommerceSim.core;

import eCommerceSim.authenticator.GoogleSignUpManager;

public class GoogleSignUpManagerAdapter implements AuthService {
    public void authenticate(String message){
        GoogleSignUpManager manager = new GoogleSignUpManager();
        manager.authenticate(message);

    }
}

package defpackage;

import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sy2 implements OutcomeReceiver {
    public final /* synthetic */ hy2 a;

    public sy2(hy2 hy2Var, ty2 ty2Var) {
        this.a = hy2Var;
    }

    public final void onError(Throwable th) {
        GetCredentialException getCredentialException = (GetCredentialException) th;
        getCredentialException.getClass();
        Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
        String type = getCredentialException.getType();
        type.getClass();
        this.a.a(t72.b0(getCredentialException.getMessage(), type));
    }

    public final void onResult(Object obj) {
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) obj;
        getCredentialResponse.getClass();
        Log.i("CredManProvService", "GetCredentialResponse returned from framework");
        Credential credential = getCredentialResponse.getCredential();
        credential.getClass();
        String type = credential.getType();
        type.getClass();
        Bundle data = credential.getData();
        data.getClass();
        this.a.b(new f76(g21.G(type, data)));
    }
}

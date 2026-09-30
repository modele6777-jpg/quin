package defpackage;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vy2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iy2 b;

    public /* synthetic */ vy2(iy2 iy2Var, int i) {
        this.a = i;
        this.b = iy2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        iy2 iy2Var = this.b;
        switch (i) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0$0(iy2Var);
                break;
            case 1:
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0$0(iy2Var);
                break;
            case 2:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$1$0$0(iy2Var);
                break;
            case 3:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0$0$0(iy2Var);
                break;
            case 4:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$0(iy2Var);
                break;
            case 5:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$0$0(iy2Var);
                break;
            case 6:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$4$0$0(iy2Var);
                break;
            case 7:
                ((hy2) iy2Var).a(new g76("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                break;
            default:
                ((hy2) iy2Var).a(new g76("No provider data returned."));
                break;
        }
    }
}

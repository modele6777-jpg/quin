package defpackage;

import android.content.Context;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ty2 implements ly2 {
    public final CredentialManager a;

    public ty2(Context context) {
        context.getClass();
        this.a = (CredentialManager) context.getSystemService("credential");
    }

    @Override // defpackage.ly2
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.a != null;
    }

    @Override // defpackage.ly2
    public final void onGetCredential(Context context, e76 e76Var, CancellationSignal cancellationSignal, Executor executor, iy2 iy2Var) {
        context.getClass();
        e76Var.getClass();
        hy2 hy2Var = (hy2) iy2Var;
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            hy2Var.a(new h76("Your device doesn't support credential manager"));
            return;
        }
        sy2 sy2Var = new sy2(hy2Var, this);
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (i76 i76Var : e76Var.a) {
            i76Var.getClass();
            builder.addCredentialOption(new CredentialOption.Builder("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", i76Var.a, i76Var.b).setIsSystemProviderRequired(true).setAllowedProviders(i76Var.c).build());
        }
        GetCredentialRequest getCredentialRequestBuild = builder.build();
        getCredentialRequestBuild.getClass();
        credentialManager.getCredential(context, getCredentialRequestBuild, cancellationSignal, executor, sy2Var);
    }
}

package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class aa8 implements zk9 {
    public final oid a;
    public boolean b = false;

    public aa8(djg djgVar, oid oidVar) {
        this.a = oidVar;
    }

    @Override // defpackage.zk9
    public final void a(Object obj) {
        this.b = true;
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.a.b;
        signInHubActivity.setResult(signInHubActivity.S0, signInHubActivity.T0);
        signInHubActivity.finish();
    }

    public final String toString() {
        return this.a.toString();
    }
}

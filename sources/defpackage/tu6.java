package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tu6 extends xb6 {
    @Override // defpackage.yt0
    public final IInterface b(IBinder iBinder) {
        iBinder.getClass();
        int i = nt6.e;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return iInterfaceQueryLocalInterface instanceof ot6 ? (ot6) iInterfaceQueryLocalInterface : new mt6(iBinder);
    }

    @Override // defpackage.yt0
    public final za5[] f() {
        return pa7.f;
    }

    @Override // defpackage.yt0
    public final int i() {
        return 17895000;
    }

    @Override // defpackage.yt0
    public final String m() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // defpackage.yt0
    public final String n() {
        return "com.google.android.gms.identitycredentials.service.START";
    }

    @Override // defpackage.yt0
    public final boolean o() {
        return true;
    }

    @Override // defpackage.yt0
    public final boolean s() {
        return true;
    }
}

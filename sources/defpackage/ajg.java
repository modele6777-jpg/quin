package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ajg extends xb6 {
    public final Bundle A;

    public ajg(Context context, Looper looper, hbc hbcVar, rhg rhgVar, rhg rhgVar2) {
        super(context, looper, 212, hbcVar, rhgVar, rhgVar2);
        this.A = new Bundle();
    }

    @Override // defpackage.yt0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof qjg ? (qjg) iInterfaceQueryLocalInterface : new qjg(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 2);
    }

    @Override // defpackage.yt0
    public final za5[] f() {
        return dj6.h;
    }

    @Override // defpackage.yt0
    public final Bundle h() {
        return this.A;
    }

    @Override // defpackage.yt0
    public final int i() {
        return 17895000;
    }

    @Override // defpackage.yt0
    public final String m() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // defpackage.yt0
    public final String n() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
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

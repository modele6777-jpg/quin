package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jgd extends xb6 {
    public final boolean A;
    public final hbc B;
    public final Bundle C;
    public final Integer D;

    public jgd(Context context, Looper looper, hbc hbcVar, Bundle bundle, cc6 cc6Var, dc6 dc6Var) {
        super(context, looper, 44, hbcVar, cc6Var, dc6Var);
        this.A = true;
        this.B = hbcVar;
        this.C = bundle;
        this.D = (Integer) hbcVar.f;
    }

    @Override // defpackage.yt0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof gig ? (gig) iInterfaceQueryLocalInterface : new gig(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
    }

    @Override // defpackage.yt0
    public final Bundle h() {
        hbc hbcVar = this.B;
        boolean zEquals = this.c.getPackageName().equals((String) hbcVar.c);
        Bundle bundle = this.C;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) hbcVar.c);
        }
        return bundle;
    }

    @Override // defpackage.yt0
    public final int i() {
        return 12451000;
    }

    @Override // defpackage.yt0
    public final String m() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.yt0
    public final String n() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.yt0
    public final boolean r() {
        return this.A;
    }
}

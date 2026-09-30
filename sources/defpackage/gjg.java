package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gjg extends xb6 {
    public final fjg A;

    public gjg(Context context, Looper looper, hbc hbcVar, fjg fjgVar, rhg rhgVar, rhg rhgVar2) {
        super(context, looper, 68, hbcVar, rhgVar, rhgVar2);
        fjgVar = fjgVar == null ? fjg.c : fjgVar;
        lqb lqbVar = new lqb(25, false);
        lqbVar.b = Boolean.FALSE;
        fjg fjgVar2 = fjg.c;
        fjgVar.getClass();
        lqbVar.b = Boolean.valueOf(fjgVar.a);
        lqbVar.c = fjgVar.b;
        lqbVar.c = bjg.a();
        this.A = new fjg(lqbVar);
    }

    @Override // defpackage.yt0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof ijg ? (ijg) iInterfaceQueryLocalInterface : new ijg(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 2);
    }

    @Override // defpackage.yt0
    public final Bundle h() {
        fjg fjgVar = this.A;
        fjgVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", fjgVar.a);
        bundle.putString("log_session_id", fjgVar.b);
        return bundle;
    }

    @Override // defpackage.yt0
    public final int i() {
        return 12800000;
    }

    @Override // defpackage.yt0
    public final String m() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // defpackage.yt0
    public final String n() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}

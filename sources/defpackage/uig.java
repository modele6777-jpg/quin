package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uig extends xb6 {
    public final ple A;

    public uig(Context context, Looper looper, hbc hbcVar, ple pleVar, rhg rhgVar, rhg rhgVar2) {
        super(context, looper, 270, hbcVar, rhgVar, rhgVar2);
        this.A = pleVar;
    }

    @Override // defpackage.yt0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof pig ? (pig) iInterfaceQueryLocalInterface : new pig(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
    }

    @Override // defpackage.yt0
    public final za5[] f() {
        return db6.j;
    }

    @Override // defpackage.yt0
    public final Bundle h() {
        ple pleVar = this.A;
        pleVar.getClass();
        Bundle bundle = new Bundle();
        String str = pleVar.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // defpackage.yt0
    public final int i() {
        return 203400000;
    }

    @Override // defpackage.yt0
    public final String m() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.yt0
    public final String n() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.yt0
    public final boolean o() {
        return true;
    }
}

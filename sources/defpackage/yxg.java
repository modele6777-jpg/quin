package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yxg extends wjg {
    public final IBinder g;
    public final /* synthetic */ yt0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxg(yt0 yt0Var, int i, IBinder iBinder, Bundle bundle) {
        super(yt0Var, i, bundle);
        this.h = yt0Var;
        this.g = iBinder;
    }

    @Override // defpackage.wjg
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            oa7.A(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            yt0 yt0Var = this.h;
            if (!yt0Var.m().equals(interfaceDescriptor)) {
                String strM = yt0Var.m();
                b1.l("GmsClient", ks0.m(new StringBuilder(strM.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strM, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceB = yt0Var.b(iBinder);
            if (iInterfaceB == null || !(yt0Var.t(2, 4, iInterfaceB) || yt0Var.t(3, 4, iInterfaceB))) {
                return false;
            }
            yt0Var.u = null;
            vt0 vt0Var = yt0Var.o;
            if (vt0Var == null) {
                return true;
            }
            vt0Var.e();
            return true;
        } catch (RemoteException unused) {
            b1.l("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // defpackage.wjg
    public final void b(ConnectionResult connectionResult) {
        wt0 wt0Var = this.h.p;
        if (wt0Var != null) {
            wt0Var.f(connectionResult);
        }
        System.currentTimeMillis();
    }
}

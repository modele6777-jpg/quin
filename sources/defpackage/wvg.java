package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wvg extends ffg {
    public yt0 e;
    public final int f;

    public wvg(yt0 yt0Var, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 5);
        this.e = yt0Var;
        this.f = i;
    }

    @Override // defpackage.ffg
    public final boolean L(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) itg.a(parcel, Bundle.CREATOR);
            itg.c(parcel);
            oa7.B(this.e, "onPostInitComplete can be called only once per call to getRemoteService");
            yt0 yt0Var = this.e;
            int i3 = this.f;
            yt0Var.getClass();
            yxg yxgVar = new yxg(yt0Var, i2, strongBinder, bundle);
            srg srgVar = yt0Var.f;
            srgVar.sendMessage(srgVar.obtainMessage(1, i3, -1, yxgVar));
            this.e = null;
        } else if (i == 2) {
            parcel.readInt();
            itg.c(parcel);
            b1.o("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            y4h y4hVar = (y4h) itg.a(parcel, y4h.CREATOR);
            itg.c(parcel);
            yt0 yt0Var2 = this.e;
            oa7.B(yt0Var2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            oa7.A(y4hVar);
            yt0Var2.w = y4hVar;
            if (yt0Var2.s()) {
                ik2 ik2Var = y4hVar.d;
                m6c m6cVarA = m6c.A();
                n6c n6cVar = ik2Var == null ? null : ik2Var.a;
                synchronized (m6cVarA) {
                    try {
                        if (n6cVar == null) {
                            n6cVar = m6c.d;
                        } else {
                            n6c n6cVar2 = (n6c) m6cVarA.b;
                            if (n6cVar2 == null || n6cVar2.a < n6cVar.a) {
                            }
                        }
                        m6cVarA.b = n6cVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = y4hVar.a;
            oa7.B(this.e, "onPostInitComplete can be called only once per call to getRemoteService");
            yt0 yt0Var3 = this.e;
            int i5 = this.f;
            yt0Var3.getClass();
            yxg yxgVar2 = new yxg(yt0Var3, i4, strongBinder2, bundle2);
            srg srgVar2 = yt0Var3.f;
            srgVar2.sendMessage(srgVar2.obtainMessage(1, i5, -1, yxgVar2));
            this.e = null;
        }
        parcel2.writeNoException();
        return true;
    }
}

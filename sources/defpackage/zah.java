package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zah {
    public static final vvg a;
    public static final vvg b;
    public static volatile emg c;
    public static final Object d;
    public static Context e;

    static {
        new vvg(x4h.O("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), 0);
        new vvg(x4h.O("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), 1);
        new vvg(x4h.O("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 2);
        new vvg(x4h.O("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 3);
        a = new vvg(x4h.O("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 4);
        b = new vvg(x4h.O("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 5);
        d = new Object();
    }

    public static void a() {
        emg tkgVar;
        if (c != null) {
            return;
        }
        oa7.A(e);
        synchronized (d) {
            try {
                if (c == null) {
                    IBinder iBinderB = cs4.c(e, cs4.d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = nlg.e;
                    if (iBinderB == null) {
                        tkgVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        tkgVar = iInterfaceQueryLocalInterface instanceof emg ? (emg) iInterfaceQueryLocalInterface : new tkg(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 3);
                    }
                    c = tkgVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static egh b(String str, k6h k6hVar, boolean z, boolean z2) {
        try {
            a();
            oa7.A(e);
            try {
                emg emgVar = c;
                tk9 tk9Var = new tk9(e.getPackageManager());
                tkg tkgVar = (tkg) emgVar;
                Parcel parcelJ = tkgVar.J();
                int i = itg.a;
                boolean z3 = true;
                parcelJ.writeInt(1);
                int iB = hcc.B(parcelJ, 20293);
                hcc.v(parcelJ, 1, str);
                hcc.s(parcelJ, 2, k6hVar);
                hcc.z(parcelJ, 3, 4);
                parcelJ.writeInt(z ? 1 : 0);
                hcc.z(parcelJ, 4, 4);
                parcelJ.writeInt(z2 ? 1 : 0);
                hcc.C(parcelJ, iB);
                itg.b(parcelJ, tk9Var);
                Parcel parcelH = tkgVar.H(parcelJ, 5);
                if (parcelH.readInt() == 0) {
                    z3 = false;
                }
                parcelH.recycle();
                return z3 ? egh.e : new rfh(new l7h(z, str, k6hVar));
            } catch (RemoteException e2) {
                b1.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return egh.p(e2, "module call");
            }
        } catch (zr4 e3) {
            b1.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return egh.p(e3, "module init: ".concat(String.valueOf(e3.getMessage())));
        }
    }
}

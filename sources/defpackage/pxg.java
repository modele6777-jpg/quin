package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pxg extends jsg implements nvg {
    public final x5h d;

    public pxg(x5h x5hVar) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.d = x5hVar;
    }

    @Override // defpackage.nvg
    public final int c() {
        return System.identityHashCode(this.d);
    }

    @Override // defpackage.jsg
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.d);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) lsg.a(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        lsg.d(parcel);
        g(string, string2, bundle, j);
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.nvg
    public final void g(String str, String str2, Bundle bundle, long j) {
        this.d.a(str, str2, bundle, j);
    }
}

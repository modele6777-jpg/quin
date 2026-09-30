package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kvg extends meg implements nvg {
    public kvg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 5);
    }

    @Override // defpackage.nvg
    public final int c() {
        Parcel parcelI = I(J(), 2);
        int i = parcelI.readInt();
        parcelI.recycle();
        return i;
    }

    @Override // defpackage.nvg
    public final void g(String str, String str2, Bundle bundle, long j) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        lsg.b(parcelJ, bundle);
        parcelJ.writeLong(j);
        K(parcelJ, 1);
    }
}

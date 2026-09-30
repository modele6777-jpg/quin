package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pug extends meg implements tug {
    public pug(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 5);
    }

    @Override // defpackage.tug
    public final void x(Bundle bundle) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, bundle);
        K(parcelJ, 1);
    }
}

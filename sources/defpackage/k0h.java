package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0h extends yt0 {
    @Override // defpackage.yt0
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof hzg ? (hzg) iInterfaceQueryLocalInterface : new czg(iBinder);
    }

    @Override // defpackage.yt0
    public final int i() {
        return 12451000;
    }

    @Override // defpackage.yt0
    public final String m() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // defpackage.yt0
    public final String n() {
        return "com.google.android.gms.measurement.START";
    }
}

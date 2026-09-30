package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zvg extends xb6 {
    @Override // defpackage.yt0
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        return iInterfaceQueryLocalInterface instanceof hxg ? (hxg) iInterfaceQueryLocalInterface : new hxg(iBinder);
    }

    @Override // defpackage.yt0
    public final za5[] f() {
        return tm7.F;
    }

    @Override // defpackage.yt0
    public final int i() {
        return 261200000;
    }

    @Override // defpackage.yt0
    public final String m() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override // defpackage.yt0
    public final String n() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }

    @Override // defpackage.yt0
    public final boolean s() {
        return true;
    }
}

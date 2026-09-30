package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class chg extends meg {
    public chg(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback", 0);
    }

    public final void O(Bundle bundle) {
        Parcel parcelD = d();
        int i = qfg.a;
        parcelD.writeInt(1);
        bundle.writeToParcel(parcelD, 0);
        e(parcelD, 3);
    }
}

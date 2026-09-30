package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mvg extends ffg {
    public final dch e;

    public mvg(dch dchVar) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 3);
        this.e = dchVar;
    }

    @Override // defpackage.ffg
    public final boolean H(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        int i2 = parcel.readInt();
        int i3 = jrg.a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(tec.e(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        this.e.a(Integer.valueOf(i2));
        return true;
    }
}

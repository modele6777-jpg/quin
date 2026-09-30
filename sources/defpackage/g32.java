package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g32 extends v4 {
    public static final Parcelable.Creator<g32> CREATOR = new vjg(5);
    public final boolean a;

    public g32(boolean z) {
        this.a = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        hcc.C(parcel, iB);
    }
}

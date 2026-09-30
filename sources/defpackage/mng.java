package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mng extends v4 {
    public static final Parcelable.Creator<mng> CREATOR = new njg(6);
    public final long a;
    public final int b;
    public final long c;

    public mng(long j, int i, long j2) {
        this.a = j;
        this.b = i;
        this.c = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 8);
        parcel.writeLong(this.a);
        hcc.z(parcel, 2, 4);
        parcel.writeInt(this.b);
        hcc.z(parcel, 3, 8);
        parcel.writeLong(this.c);
        hcc.C(parcel, iB);
    }
}

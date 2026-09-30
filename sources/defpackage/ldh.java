package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ldh extends v4 {
    public static final Parcelable.Creator<ldh> CREATOR = new s5h(15);
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public ldh(int i, int i2, long j, String str, boolean z) {
        this.a = z;
        this.b = str;
        this.c = iqf.r(i) - 1;
        this.d = w6c.z(i2) - 1;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        hcc.v(parcel, 2, this.b);
        hcc.z(parcel, 3, 4);
        parcel.writeInt(this.c);
        hcc.z(parcel, 4, 4);
        parcel.writeInt(this.d);
        hcc.z(parcel, 5, 8);
        parcel.writeLong(this.e);
        hcc.C(parcel, iB);
    }
}

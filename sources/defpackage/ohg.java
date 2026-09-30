package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ohg extends v4 {
    public static final Parcelable.Creator<ohg> CREATOR = new rz9(17);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;

    public ohg(int i, int i2, long j, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 4);
        parcel.writeInt(this.a);
        hcc.v(parcel, 2, this.b);
        hcc.z(parcel, 3, 8);
        parcel.writeLong(this.c);
        hcc.z(parcel, 4, 4);
        parcel.writeInt(this.d);
        hcc.z(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        hcc.C(parcel, iB);
    }
}

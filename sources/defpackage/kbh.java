package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kbh extends v4 {
    public static final Parcelable.Creator<kbh> CREATOR = new s5h(10);
    public final String a;
    public final long b;
    public final int c;

    public kbh(int i, long j, String str) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.v(parcel, 1, this.a);
        hcc.z(parcel, 2, 8);
        parcel.writeLong(this.b);
        hcc.z(parcel, 3, 4);
        parcel.writeInt(this.c);
        hcc.C(parcel, iB);
    }
}

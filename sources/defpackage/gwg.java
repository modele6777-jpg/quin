package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gwg extends v4 {
    public static final Parcelable.Creator<gwg> CREATOR = new njg(20);
    public final long a;
    public final long b;
    public final boolean c;
    public final Bundle d;
    public final String e;

    public gwg(long j, long j2, boolean z, Bundle bundle, String str) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = bundle;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 8);
        parcel.writeLong(this.a);
        hcc.z(parcel, 2, 8);
        parcel.writeLong(this.b);
        hcc.z(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        hcc.p(parcel, 7, this.d);
        hcc.v(parcel, 8, this.e);
        hcc.C(parcel, iB);
    }
}

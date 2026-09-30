package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qbh extends v4 {
    public static final Parcelable.Creator<qbh> CREATOR = new s5h(11);
    public final long a;
    public byte[] b;
    public final String c;
    public final Bundle d;
    public final int e;
    public final long f;
    public String g;

    public qbh(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.a = j;
        this.b = bArr;
        this.c = str;
        this.d = bundle;
        this.e = i;
        this.f = j2;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 8);
        parcel.writeLong(this.a);
        hcc.q(parcel, 2, this.b);
        hcc.v(parcel, 3, this.c);
        hcc.p(parcel, 4, this.d);
        hcc.z(parcel, 5, 4);
        parcel.writeInt(this.e);
        hcc.z(parcel, 6, 8);
        parcel.writeLong(this.f);
        hcc.v(parcel, 7, this.g);
        hcc.C(parcel, iB);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mv8 extends v4 {
    public static final Parcelable.Creator<mv8> CREATOR = new rz9(21);
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int v;
    public final int w;

    public mv8(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.v = i4;
        this.w = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 4);
        parcel.writeInt(this.a);
        hcc.z(parcel, 2, 4);
        parcel.writeInt(this.b);
        hcc.z(parcel, 3, 4);
        parcel.writeInt(this.c);
        hcc.z(parcel, 4, 8);
        parcel.writeLong(this.d);
        hcc.z(parcel, 5, 8);
        parcel.writeLong(this.e);
        hcc.v(parcel, 6, this.f);
        hcc.v(parcel, 7, this.g);
        hcc.z(parcel, 8, 4);
        parcel.writeInt(this.v);
        hcc.z(parcel, 9, 4);
        parcel.writeInt(this.w);
        hcc.C(parcel, iB);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n6c extends v4 {
    public static final Parcelable.Creator<n6c> CREATOR = new njg(5);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public n6c(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 4);
        parcel.writeInt(this.a);
        hcc.z(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        hcc.z(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        hcc.z(parcel, 4, 4);
        parcel.writeInt(this.d);
        hcc.z(parcel, 5, 4);
        parcel.writeInt(this.e);
        hcc.C(parcel, iB);
    }
}

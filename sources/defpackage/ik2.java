package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ik2 extends v4 {
    public static final Parcelable.Creator<ik2> CREATOR = new s5h(7);
    public final n6c a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public ik2(n6c n6cVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = n6cVar;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.u(parcel, 1, this.a, i);
        hcc.z(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        hcc.z(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        hcc.t(parcel, 4, this.d);
        hcc.z(parcel, 5, 4);
        parcel.writeInt(this.e);
        hcc.t(parcel, 6, this.f);
        hcc.C(parcel, iB);
    }
}

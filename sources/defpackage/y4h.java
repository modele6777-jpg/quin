package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y4h extends v4 {
    public static final Parcelable.Creator<y4h> CREATOR = new s5h(5);
    public Bundle a;
    public za5[] b;
    public int c;
    public ik2 d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.p(parcel, 1, this.a);
        hcc.x(parcel, 2, this.b, i);
        int i2 = this.c;
        hcc.z(parcel, 3, 4);
        parcel.writeInt(i2);
        hcc.u(parcel, 4, this.d, i);
        hcc.C(parcel, iB);
    }
}

package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yy6 extends v4 {
    public static final Parcelable.Creator<yy6> CREATOR = new vjg(24);
    public final Bundle a;

    public yy6(Bundle bundle) {
        bundle.getClass();
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iB = hcc.B(parcel, 20293);
        hcc.p(parcel, 1, this.a);
        hcc.C(parcel, iB);
    }
}

package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ux2 extends v4 {
    public static final Parcelable.Creator<ux2> CREATOR = new vjg(11);
    public final String a;
    public final Bundle b;

    public ux2(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        this.a = str;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iB = hcc.B(parcel, 20293);
        hcc.v(parcel, 1, this.a);
        hcc.p(parcel, 2, this.b);
        hcc.C(parcel, iB);
    }
}

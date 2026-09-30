package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ky2 extends v4 {
    public static final Parcelable.Creator<ky2> CREATOR = new vjg(12);
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final String d;
    public final String e;
    public final String f;

    public ky2(String str, Bundle bundle, Bundle bundle2, String str2, String str3, String str4) {
        str.getClass();
        bundle.getClass();
        bundle2.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        boolean z = (v4e.Q(str3) || v4e.Q(str4)) ? false : true;
        boolean z2 = !v4e.Q(str) && str3.length() == 0 && str4.length() == 0;
        if (z || z2) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + String.valueOf(str).length() + 31 + String.valueOf(str3).length() + 19 + 69);
        ub3.v(sb, "Either type: ", str, ", or requestType: ", str3);
        qc0.j(ib8.m(sb, " and protocolType: ", str4, " must be specified, but at least one contains an invalid blank value."));
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iB = hcc.B(parcel, 20293);
        hcc.v(parcel, 1, this.a);
        hcc.p(parcel, 2, this.b);
        hcc.p(parcel, 3, this.c);
        hcc.v(parcel, 4, this.d);
        hcc.v(parcel, 5, this.e);
        hcc.v(parcel, 6, this.f);
        hcc.C(parcel, iB);
    }
}

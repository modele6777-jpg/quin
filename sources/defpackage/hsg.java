package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hsg extends v4 {
    public static final Parcelable.Creator<hsg> CREATOR = new njg(16);
    public final String a;
    public final esg b;
    public final String c;
    public final long d;
    public final long e;

    public hsg(hsg hsgVar, long j, long j2) {
        oa7.A(hsgVar);
        this.a = hsgVar.a;
        this.b = hsgVar.b;
        this.c = hsgVar.c;
        this.d = j;
        this.e = j2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        String str = this.c;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        ub3.v(sb, "origin=", str, ",name=", str2);
        return ks0.l(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        njg.a(this, parcel, i);
    }

    public hsg(String str, esg esgVar, String str2, long j, long j2) {
        this.a = str;
        this.b = esgVar;
        this.c = str2;
        this.d = j;
        this.e = j2;
    }
}

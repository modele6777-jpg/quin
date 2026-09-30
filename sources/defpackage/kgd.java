package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kgd extends v4 {
    public static final Parcelable.Creator<kgd> CREATOR = new njg(2);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String g;
    public final String v;
    public final j2b w;

    public kgd(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, j2b j2bVar) {
        oa7.A(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = str6;
        this.v = str7;
        this.w = j2bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kgd)) {
            return false;
        }
        kgd kgdVar = (kgd) obj;
        return ym8.w(this.a, kgdVar.a) && ym8.w(this.b, kgdVar.b) && ym8.w(this.c, kgdVar.c) && ym8.w(this.d, kgdVar.d) && ym8.w(this.e, kgdVar.e) && ym8.w(this.f, kgdVar.f) && ym8.w(this.g, kgdVar.g) && ym8.w(this.v, kgdVar.v) && ym8.w(this.w, kgdVar.w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.v(parcel, 1, this.a);
        hcc.v(parcel, 2, this.b);
        hcc.v(parcel, 3, this.c);
        hcc.v(parcel, 4, this.d);
        hcc.u(parcel, 5, this.e, i);
        hcc.v(parcel, 6, this.f);
        hcc.v(parcel, 7, this.g);
        hcc.v(parcel, 8, this.v);
        hcc.u(parcel, 9, this.w, i);
        hcc.C(parcel, iB);
    }
}

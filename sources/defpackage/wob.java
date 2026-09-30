package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wob extends v4 {
    public static final Parcelable.Creator<wob> CREATOR = new s5h(18);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public int f;
    public final String g;

    public wob(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.g = "22.0.1";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.v(parcel, 1, this.a);
        hcc.v(parcel, 2, this.b);
        hcc.v(parcel, 3, this.c);
        hcc.v(parcel, 4, this.d);
        hcc.v(parcel, 5, this.e);
        int i2 = this.f;
        hcc.z(parcel, 6, 4);
        parcel.writeInt(i2);
        hcc.v(parcel, 7, this.g);
        hcc.C(parcel, iB);
    }

    public wob(String str, String str2, String str3, String str4, String str5, int i, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wog extends v4 {
    public static final Parcelable.Creator<wog> CREATOR = new njg(7);
    public String a;
    public String b;
    public mch c;
    public long d;
    public boolean e;
    public String f;
    public final hsg g;
    public long v;
    public hsg w;
    public final long x;
    public final hsg y;

    public wog(wog wogVar) {
        oa7.A(wogVar);
        this.a = wogVar.a;
        this.b = wogVar.b;
        this.c = wogVar.c;
        this.d = wogVar.d;
        this.e = wogVar.e;
        this.f = wogVar.f;
        this.g = wogVar.g;
        this.v = wogVar.v;
        this.w = wogVar.w;
        this.x = wogVar.x;
        this.y = wogVar.y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.v(parcel, 2, this.a);
        hcc.v(parcel, 3, this.b);
        hcc.u(parcel, 4, this.c, i);
        long j = this.d;
        hcc.z(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.e;
        hcc.z(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        hcc.v(parcel, 7, this.f);
        hcc.u(parcel, 8, this.g, i);
        long j2 = this.v;
        hcc.z(parcel, 9, 8);
        parcel.writeLong(j2);
        hcc.u(parcel, 10, this.w, i);
        hcc.z(parcel, 11, 8);
        parcel.writeLong(this.x);
        hcc.u(parcel, 12, this.y, i);
        hcc.C(parcel, iB);
    }

    public wog(String str, String str2, mch mchVar, long j, boolean z, String str3, hsg hsgVar, long j2, hsg hsgVar2, long j3, hsg hsgVar3) {
        this.a = str;
        this.b = str2;
        this.c = mchVar;
        this.d = j;
        this.e = z;
        this.f = str3;
        this.g = hsgVar;
        this.v = j2;
        this.w = hsgVar2;
        this.x = j3;
        this.y = hsgVar3;
    }
}

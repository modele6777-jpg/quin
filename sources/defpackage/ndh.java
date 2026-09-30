package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ndh extends v4 {
    public static final Parcelable.Creator<ndh> CREATOR = new s5h(16);
    public final Boolean E0;
    public final long F0;
    public final List G0;
    public final String H0;
    public final String I0;
    public final String J0;
    public final boolean K0;
    public final long L0;
    public final int M0;
    public final String N0;
    public final int O0;
    public final long P0;
    public final String Q0;
    public final String R0;
    public final long S0;
    public final int T0;
    public final long U0;
    public final int X;
    public final boolean Y;
    public final boolean Z;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean v;
    public final boolean w;
    public final long x;
    public final String y;
    public final long z;

    public ndh(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        oa7.x(str);
        this.a = str;
        this.b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.x = j;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = str5;
        this.v = z;
        this.w = z2;
        this.y = str6;
        this.z = j4;
        this.X = i;
        this.Y = z3;
        this.Z = z4;
        this.E0 = bool;
        this.F0 = j5;
        this.G0 = list;
        this.H0 = str7;
        this.I0 = str8;
        this.J0 = str9;
        this.K0 = z5;
        this.L0 = j6;
        this.M0 = i2;
        this.N0 = str10;
        this.O0 = i3;
        this.P0 = j7;
        this.Q0 = str11;
        this.R0 = str12;
        this.S0 = j8;
        this.T0 = i4;
        this.U0 = j9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.v(parcel, 2, this.a);
        hcc.v(parcel, 3, this.b);
        hcc.v(parcel, 4, this.c);
        hcc.v(parcel, 5, this.d);
        hcc.z(parcel, 6, 8);
        parcel.writeLong(this.e);
        hcc.z(parcel, 7, 8);
        parcel.writeLong(this.f);
        hcc.v(parcel, 8, this.g);
        hcc.z(parcel, 9, 4);
        parcel.writeInt(this.v ? 1 : 0);
        hcc.z(parcel, 10, 4);
        parcel.writeInt(this.w ? 1 : 0);
        hcc.z(parcel, 11, 8);
        parcel.writeLong(this.x);
        hcc.v(parcel, 12, this.y);
        hcc.z(parcel, 14, 8);
        parcel.writeLong(this.z);
        hcc.z(parcel, 15, 4);
        parcel.writeInt(this.X);
        hcc.z(parcel, 16, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        hcc.z(parcel, 18, 4);
        parcel.writeInt(this.Z ? 1 : 0);
        Boolean bool = this.E0;
        if (bool != null) {
            hcc.z(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        hcc.z(parcel, 22, 8);
        parcel.writeLong(this.F0);
        hcc.w(parcel, 23, this.G0);
        hcc.v(parcel, 25, this.H0);
        hcc.v(parcel, 26, this.I0);
        hcc.v(parcel, 27, this.J0);
        hcc.z(parcel, 28, 4);
        parcel.writeInt(this.K0 ? 1 : 0);
        hcc.z(parcel, 29, 8);
        parcel.writeLong(this.L0);
        hcc.z(parcel, 30, 4);
        parcel.writeInt(this.M0);
        hcc.v(parcel, 31, this.N0);
        hcc.z(parcel, 32, 4);
        parcel.writeInt(this.O0);
        hcc.z(parcel, 34, 8);
        parcel.writeLong(this.P0);
        hcc.v(parcel, 35, this.Q0);
        hcc.v(parcel, 36, this.R0);
        hcc.z(parcel, 37, 8);
        parcel.writeLong(this.S0);
        hcc.z(parcel, 38, 4);
        parcel.writeInt(this.T0);
        hcc.z(parcel, 39, 8);
        parcel.writeLong(this.U0);
        hcc.C(parcel, iB);
    }

    public ndh(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.x = j3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = str5;
        this.v = z;
        this.w = z2;
        this.y = str6;
        this.z = j4;
        this.X = i;
        this.Y = z3;
        this.Z = z4;
        this.E0 = bool;
        this.F0 = j5;
        this.G0 = arrayList;
        this.H0 = str7;
        this.I0 = str8;
        this.J0 = str9;
        this.K0 = z5;
        this.L0 = j6;
        this.M0 = i2;
        this.N0 = str10;
        this.O0 = i3;
        this.P0 = j7;
        this.Q0 = str11;
        this.R0 = str12;
        this.S0 = j8;
        this.T0 = i4;
        this.U0 = j9;
    }
}

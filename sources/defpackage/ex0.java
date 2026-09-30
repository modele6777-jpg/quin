package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ex0 extends v4 {
    public static final Parcelable.Creator<ex0> CREATOR = new rz9(25);
    public final dx0 a;
    public final ax0 b;
    public final String c;
    public final boolean d;
    public final int e;
    public final cx0 f;
    public final bx0 g;
    public final boolean v;

    public ex0(dx0 dx0Var, ax0 ax0Var, String str, boolean z, int i, cx0 cx0Var, bx0 bx0Var, boolean z2) {
        oa7.A(dx0Var);
        this.a = dx0Var;
        oa7.A(ax0Var);
        this.b = ax0Var;
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = cx0Var == null ? new cx0(false, null, null) : cx0Var;
        this.g = bx0Var == null ? new bx0(false, null) : bx0Var;
        this.v = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ex0)) {
            return false;
        }
        ex0 ex0Var = (ex0) obj;
        return ym8.w(this.a, ex0Var.a) && ym8.w(this.b, ex0Var.b) && ym8.w(this.f, ex0Var.f) && ym8.w(this.g, ex0Var.g) && ym8.w(this.c, ex0Var.c) && this.d == ex0Var.d && this.e == ex0Var.e && this.v == ex0Var.v;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.g, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.v)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.u(parcel, 1, this.a, i);
        hcc.u(parcel, 2, this.b, i);
        hcc.v(parcel, 3, this.c);
        hcc.z(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        hcc.z(parcel, 5, 4);
        parcel.writeInt(this.e);
        hcc.u(parcel, 6, this.f, i);
        hcc.u(parcel, 7, this.g, i);
        hcc.z(parcel, 8, 4);
        parcel.writeInt(this.v ? 1 : 0);
        hcc.C(parcel, iB);
    }
}

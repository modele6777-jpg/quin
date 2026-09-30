package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y5h extends v4 {
    public static final Parcelable.Creator<y5h> CREATOR = new s5h(2);
    public final String a;
    public final String b;
    public final u5h c;
    public final boolean d;

    public y5h(String str, String str2, u5h u5hVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = u5hVar;
        this.d = z;
    }

    public final void c(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.c(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5h)) {
            return false;
        }
        y5h y5hVar = (y5h) obj;
        return hfc.s(this.a, y5hVar.a) && hfc.s(this.b, y5hVar.b) && hfc.s(this.c, y5hVar.c) && this.d == y5hVar.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        c(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.v(parcel, 2, this.a);
        hcc.v(parcel, 3, this.b);
        hcc.u(parcel, 4, this.c, i);
        hcc.z(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        hcc.C(parcel, iB);
    }
}

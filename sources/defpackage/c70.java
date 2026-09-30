package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c70 extends v4 {
    public static final Parcelable.Creator<c70> CREATOR = vjg.b;
    public static final c70 d;
    public final ib2 a;
    public final boolean b;
    public boolean c;

    static {
        c70 c70Var = new c70(null, false);
        c70Var.c = false;
        d = c70Var;
    }

    public c70(ib2 ib2Var, boolean z) {
        this.a = ib2Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c70)) {
            return false;
        }
        c70 c70Var = (c70) obj;
        return ym8.w(this.a, c70Var.a) && this.c == c70Var.c && this.b == c70Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.c), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        return ib8.m(new StringBuilder(strValueOf.length() + 31), "ApiMetadata(complianceOptions=", strValueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iB = hcc.B(parcel, 20293);
        hcc.u(parcel, 1, this.a, i);
        hcc.z(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        hcc.C(parcel, iB);
    }
}

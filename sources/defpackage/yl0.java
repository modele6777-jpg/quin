package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yl0 extends zl0 {
    public static final Parcelable.Creator<yl0> CREATOR = new s5h(8);
    public final by4 a;
    public final String b;
    public final int c;

    public yl0(int i, int i2, String str) {
        try {
            this.a = by4.b(i);
            this.b = str;
            this.c = i2;
        } catch (zx4 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yl0)) {
            return false;
        }
        yl0 yl0Var = (yl0) obj;
        return ym8.w(this.a, yl0Var.a) && ym8.w(this.b, yl0Var.b) && ym8.w(Integer.valueOf(this.c), Integer.valueOf(yl0Var.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        psd psdVar = new psd(getClass().getSimpleName(), 24);
        String strValueOf = String.valueOf(this.a.a());
        fsg fsgVar = new fsg(22, (char) 0);
        ((psd) psdVar.d).d = fsgVar;
        psdVar.d = fsgVar;
        fsgVar.c = strValueOf;
        fsgVar.b = "errorCode";
        String str = this.b;
        if (str != null) {
            psdVar.G(str, "errorMessage");
        }
        return psdVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        int iA = this.a.a();
        hcc.z(parcel, 2, 4);
        parcel.writeInt(iA);
        hcc.v(parcel, 3, this.b);
        hcc.z(parcel, 4, 4);
        parcel.writeInt(this.c);
        hcc.C(parcel, iB);
    }
}

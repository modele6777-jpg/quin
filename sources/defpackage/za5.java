package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class za5 extends v4 {
    public static final Parcelable.Creator<za5> CREATOR = new njg(12);
    public final String a;
    public final int b;
    public final long c;
    public final boolean d;

    public za5(String str, int i, long j, boolean z) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public final long c() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof za5) {
            za5 za5Var = (za5) obj;
            if (ym8.w(this.a, za5Var.a) && c() == za5Var.c() && this.d == za5Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(c()), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        w84 w84Var = new w84(this);
        w84Var.G0(this.a, "name");
        w84Var.G0(Long.valueOf(c()), "version");
        w84Var.G0(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return w84Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.v(parcel, 1, this.a);
        hcc.z(parcel, 2, 4);
        parcel.writeInt(this.b);
        long jC = c();
        hcc.z(parcel, 3, 8);
        parcel.writeLong(jC);
        hcc.z(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        hcc.C(parcel, iB);
    }

    public za5(String str, long j) {
        this(str, -1, j, false);
    }
}

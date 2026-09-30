package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cx0 extends v4 {
    public static final Parcelable.Creator<cx0> CREATOR = new rz9(29);
    public final boolean a;
    public final byte[] b;
    public final String c;

    public cx0(boolean z, byte[] bArr, String str) {
        if (z) {
            oa7.A(bArr);
            oa7.A(str);
        }
        this.a = z;
        this.b = bArr;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx0)) {
            return false;
        }
        cx0 cx0Var = (cx0) obj;
        return this.a == cx0Var.a && Arrays.equals(this.b, cx0Var.b) && Objects.equals(this.c, cx0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Objects.hash(Boolean.valueOf(this.a), this.c) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        hcc.q(parcel, 2, this.b);
        hcc.v(parcel, 3, this.c);
        hcc.C(parcel, iB);
    }
}

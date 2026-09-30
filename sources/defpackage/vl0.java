package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vl0 extends v4 {
    public static final Parcelable.Creator<vl0> CREATOR = new njg(23);
    public final boolean a;

    public vl0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vl0) && this.a == ((vl0) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        hcc.C(parcel, iB);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zxg extends v4 {
    public static final Parcelable.Creator<zxg> CREATOR = new njg(24);
    public final d1h a;
    public final d1h b;

    public zxg(x0h x0hVar, x0h x0hVar2) {
        this.a = x0hVar;
        this.b = x0hVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zxg)) {
            return false;
        }
        zxg zxgVar = (zxg) obj;
        return ym8.w(this.a, zxgVar.a) && ym8.w(this.b, zxgVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        d1h d1hVar = this.a;
        hcc.q(parcel, 1, d1hVar == null ? null : d1hVar.m());
        d1h d1hVar2 = this.b;
        hcc.q(parcel, 2, d1hVar2 != null ? d1hVar2.m() : null);
        hcc.C(parcel, iB);
    }
}

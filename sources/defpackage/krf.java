package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class krf extends v4 {
    public static final Parcelable.Creator<krf> CREATOR = new njg(14);
    public final int a;
    public final short b;
    public final short c;

    public krf(int i, short s, short s2) {
        this.a = i;
        this.b = s;
        this.c = s2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof krf)) {
            return false;
        }
        krf krfVar = (krf) obj;
        return this.a == krfVar.a && this.b == krfVar.b && this.c == krfVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Short.valueOf(this.b), Short.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 4);
        parcel.writeInt(this.a);
        hcc.z(parcel, 2, 4);
        parcel.writeInt(this.b);
        hcc.z(parcel, 3, 4);
        parcel.writeInt(this.c);
        hcc.C(parcel, iB);
    }
}

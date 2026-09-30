package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xp4 implements Comparator, Parcelable {
    public static final Parcelable.Creator<xp4> CREATOR = new vjg(17);
    public final wp4[] a;
    public int b;
    public final String c;
    public final int d;

    public xp4(Parcel parcel) {
        this.c = parcel.readString();
        wp4[] wp4VarArr = (wp4[]) parcel.createTypedArray(wp4.CREATOR);
        String str = pqf.a;
        this.a = wp4VarArr;
        this.d = wp4VarArr.length;
    }

    public final xp4 a(String str) {
        return Objects.equals(this.c, str) ? this : new xp4(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        wp4 wp4Var = (wp4) obj;
        wp4 wp4Var2 = (wp4) obj2;
        UUID uuid = d71.a;
        if (uuid.equals(wp4Var.b)) {
            return uuid.equals(wp4Var2.b) ? 0 : 1;
        }
        return wp4Var.b.compareTo(wp4Var2.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xp4.class == obj.getClass()) {
            xp4 xp4Var = (xp4) obj;
            if (Objects.equals(this.c, xp4Var.c) && Arrays.equals(this.a, xp4Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        String str = this.c;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        this.b = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public xp4(String str, boolean z, wp4... wp4VarArr) {
        this.c = str;
        wp4VarArr = z ? (wp4[]) wp4VarArr.clone() : wp4VarArr;
        this.a = wp4VarArr;
        this.d = wp4VarArr.length;
        Arrays.sort(wp4VarArr, this);
    }
}

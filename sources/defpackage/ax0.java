package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ax0 extends v4 {
    public static final Parcelable.Creator<ax0> CREATOR = new rz9(27);
    public final boolean a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final ArrayList f;
    public final boolean g;

    public ax0(boolean z, String str, String str2, boolean z2, String str3, ArrayList arrayList, boolean z3) {
        boolean z4 = true;
        if (z2 && z3) {
            z4 = false;
        }
        oa7.u("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z4);
        this.a = z;
        if (z) {
            oa7.B(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.b = str;
        this.c = str2;
        this.d = z2;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f = arrayList2;
        this.e = str3;
        this.g = z3;
    }

    public static zw0 c() {
        zw0 zw0Var = new zw0();
        zw0Var.a = false;
        zw0Var.c = null;
        zw0Var.b = true;
        return zw0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ax0)) {
            return false;
        }
        ax0 ax0Var = (ax0) obj;
        return this.a == ax0Var.a && ym8.w(this.b, ax0Var.b) && ym8.w(this.c, ax0Var.c) && this.d == ax0Var.d && ym8.w(this.e, ax0Var.e) && ym8.w(this.f, ax0Var.f) && this.g == ax0Var.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        hcc.v(parcel, 2, this.b);
        hcc.v(parcel, 3, this.c);
        hcc.z(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        hcc.v(parcel, 5, this.e);
        hcc.w(parcel, 6, this.f);
        hcc.z(parcel, 7, 4);
        parcel.writeInt(this.g ? 1 : 0);
        hcc.C(parcel, iB);
    }
}

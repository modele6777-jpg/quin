package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jig extends v4 implements hzb {
    public static final Parcelable.Creator<jig> CREATOR = new rz9(19);
    public final List a;
    public final String b;

    public jig(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // defpackage.hzb
    public final Status a() {
        return this.b != null ? Status.e : Status.w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.w(parcel, 1, this.a);
        hcc.v(parcel, 2, this.b);
        hcc.C(parcel, iB);
    }
}

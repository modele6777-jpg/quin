package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mhg extends v4 implements hzb {
    public static final Parcelable.Creator<mhg> CREATOR = new rz9(15);
    public final int a;
    public final int b;
    public final Intent c;

    public mhg(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.hzb
    public final Status a() {
        return this.b == 0 ? Status.e : Status.w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 4);
        parcel.writeInt(this.a);
        hcc.z(parcel, 2, 4);
        parcel.writeInt(this.b);
        hcc.u(parcel, 3, this.c, i);
        hcc.C(parcel, iB);
    }
}

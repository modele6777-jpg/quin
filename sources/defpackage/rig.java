package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rig extends v4 {
    public static final Parcelable.Creator<rig> CREATOR = new rz9(20);
    public final int a;
    public final ConnectionResult b;
    public final wig c;

    public rig(int i, ConnectionResult connectionResult, wig wigVar) {
        this.a = i;
        this.b = connectionResult;
        this.c = wigVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 4);
        parcel.writeInt(this.a);
        hcc.u(parcel, 2, this.b, i);
        hcc.u(parcel, 3, this.c, i);
        hcc.C(parcel, iB);
    }
}

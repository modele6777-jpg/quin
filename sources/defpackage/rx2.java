package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rx2 extends v4 {
    public static final Parcelable.Creator<rx2> CREATOR = new vjg(10);
    public final PendingIntent a;
    public final ux2 b;

    public rx2(PendingIntent pendingIntent, ux2 ux2Var) {
        this.a = pendingIntent;
        this.b = ux2Var;
        if (pendingIntent == null && ux2Var == null) {
            qc0.j("pendingIntent or createCredentialResponse must be specified.");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int iB = hcc.B(parcel, 20293);
        hcc.u(parcel, 1, this.a, i);
        hcc.u(parcel, 2, this.b, i);
        hcc.C(parcel, iB);
    }
}

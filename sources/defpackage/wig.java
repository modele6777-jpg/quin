package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wig extends v4 {
    public static final Parcelable.Creator<wig> CREATOR = new rz9(23);
    public final int a;
    public final IBinder b;
    public final ConnectionResult c;
    public final boolean d;
    public final boolean e;

    public wig(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = connectionResult;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        Object pehVar;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wig)) {
            return false;
        }
        wig wigVar = (wig) obj;
        if (!this.c.equals(wigVar.c)) {
            return false;
        }
        Object pehVar2 = null;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            pehVar = null;
        } else {
            int i = k7.e;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            pehVar = iInterfaceQueryLocalInterface instanceof gt6 ? (gt6) iInterfaceQueryLocalInterface : new peh(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
        }
        IBinder iBinder2 = wigVar.b;
        if (iBinder2 != null) {
            int i2 = k7.e;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            pehVar2 = iInterfaceQueryLocalInterface2 instanceof gt6 ? (gt6) iInterfaceQueryLocalInterface2 : new peh(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 3);
        }
        return ym8.w(pehVar, pehVar2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 4);
        parcel.writeInt(this.a);
        hcc.s(parcel, 2, this.b);
        hcc.u(parcel, 3, this.c, i);
        hcc.z(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        hcc.z(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        hcc.C(parcel, iB);
    }
}

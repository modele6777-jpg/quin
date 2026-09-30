package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vig extends v4 {
    public static final Parcelable.Creator<vig> CREATOR = new rz9(22);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public vig(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.z(parcel, 1, 4);
        parcel.writeInt(this.a);
        hcc.u(parcel, 2, this.b, i);
        hcc.z(parcel, 3, 4);
        parcel.writeInt(this.c);
        hcc.u(parcel, 4, this.d, i);
        hcc.C(parcel, iB);
    }
}

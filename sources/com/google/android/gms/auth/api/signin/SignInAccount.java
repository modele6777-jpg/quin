package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.hcc;
import defpackage.oa7;
import defpackage.rz9;
import defpackage.v4;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class SignInAccount extends v4 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new rz9(24);
    public final String a;
    public final GoogleSignInAccount b;
    public final String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        oa7.y(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        oa7.y(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = hcc.B(parcel, 20293);
        hcc.v(parcel, 4, this.a);
        hcc.u(parcel, 7, this.b, i);
        hcc.v(parcel, 8, this.c);
        hcc.C(parcel, iB);
    }
}

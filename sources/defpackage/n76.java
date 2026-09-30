package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n76 extends v4 {
    public boolean X;
    public final String Y;
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle g;
    public Account v;
    public za5[] w;
    public za5[] x;
    public final boolean y;
    public final int z;
    public static final Parcelable.Creator<n76> CREATOR = new s5h(9);
    public static final Scope[] Z = new Scope[0];
    public static final za5[] E0 = new za5[0];

    public n76(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, za5[] za5VarArr, za5[] za5VarArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? Z : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        za5[] za5VarArr3 = E0;
        za5[] za5VarArr4 = za5VarArr == null ? za5VarArr3 : za5VarArr;
        za5VarArr3 = za5VarArr2 != null ? za5VarArr2 : za5VarArr3;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = k7.e;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface pehVar = iInterfaceQueryLocalInterface instanceof gt6 ? (gt6) iInterfaceQueryLocalInterface : new peh(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        peh pehVar2 = (peh) pehVar;
                        Parcel parcelH = pehVar2.H(pehVar2.J(), 2);
                        Account account3 = (Account) itg.a(parcelH, Account.CREATOR);
                        parcelH.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        b1.l("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.e = iBinder;
            account2 = account;
        }
        this.v = account2;
        this.f = scopeArr2;
        this.g = bundle2;
        this.w = za5VarArr4;
        this.x = za5VarArr3;
        this.y = z;
        this.z = i4;
        this.X = z2;
        this.Y = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        s5h.a(this, parcel, i);
    }
}

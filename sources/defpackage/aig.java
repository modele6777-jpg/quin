package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import io.sentry.android.core.b1;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class aig extends ffg implements cc6, dc6 {
    public static final y87 l = dig.a;
    public final Context e;
    public final Handler f;
    public final y87 g;
    public final Set h;
    public final hbc i;
    public jgd j;
    public hzc k;

    public aig(Context context, sig sigVar, hbc hbcVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 1);
        this.e = context;
        this.f = sigVar;
        this.i = hbcVar;
        this.h = (Set) hbcVar.a;
        this.g = l;
    }

    @Override // defpackage.ffg
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        switch (i) {
            case 3:
                xhg.b(parcel);
                break;
            case 4:
                xhg.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                xhg.b(parcel);
                break;
            case 7:
                xhg.b(parcel);
                break;
            case 8:
                rig rigVar = (rig) xhg.a(parcel, rig.CREATOR);
                xhg.b(parcel);
                this.f.post(new w36(this, rigVar, z, 19));
                break;
            case 9:
                xhg.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.cc6
    public final void d(int i) {
        hzc hzcVar = this.k;
        rhg rhgVar = (rhg) ((ec6) hzcVar.f).x.get((b70) hzcVar.c);
        if (rhgVar != null) {
            if (rhgVar.l) {
                rhgVar.n(new ConnectionResult(17, null, null));
            } else {
                rhgVar.d(i);
            }
        }
    }

    @Override // defpackage.cc6
    public final void e() {
        jgd jgdVar = this.j;
        jgdVar.getClass();
        boolean z = false;
        try {
            jgdVar.B.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? l2e.a(jgdVar.c).b() : null;
            Integer num = jgdVar.D;
            oa7.A(num);
            vig vigVar = new vig(2, account, num.intValue(), googleSignInAccountB);
            gig gigVar = (gig) jgdVar.l();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(gigVar.f);
            int i = xhg.a;
            parcelObtain.writeInt(1);
            int iB = hcc.B(parcelObtain, 20293);
            hcc.z(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            hcc.u(parcelObtain, 2, vigVar, 0);
            hcc.C(parcelObtain, iB);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                gigVar.e.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            b1.l("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f.post(new w36(this, new rig(1, new ConnectionResult(8, null, null), null), z, 19));
            } catch (RemoteException unused) {
                b1.o("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.dc6
    public final void f(ConnectionResult connectionResult) {
        this.k.f(connectionResult);
    }
}

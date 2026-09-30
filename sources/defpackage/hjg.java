package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hjg extends xb6 {
    public final GoogleSignInOptions A;

    public hjg(Context context, Looper looper, hbc hbcVar, GoogleSignInOptions googleSignInOptions, rhg rhgVar, rhg rhgVar2) {
        tc6 tc6Var;
        super(context, looper, 91, hbcVar, rhgVar, rhgVar2);
        Set<Scope> set = (Set) hbcVar.b;
        if (googleSignInOptions != null) {
            tc6Var = new tc6();
            tc6Var.a = new HashSet();
            tc6Var.h = new HashMap();
            tc6Var.a = new HashSet(googleSignInOptions.b);
            tc6Var.b = googleSignInOptions.e;
            tc6Var.c = googleSignInOptions.f;
            tc6Var.d = googleSignInOptions.d;
            tc6Var.e = googleSignInOptions.g;
            tc6Var.f = googleSignInOptions.c;
            tc6Var.g = googleSignInOptions.v;
            tc6Var.h = GoogleSignInOptions.d(googleSignInOptions.w);
            tc6Var.i = googleSignInOptions.x;
        } else {
            tc6Var = new tc6();
            tc6Var.a = new HashSet();
            tc6Var.h = new HashMap();
        }
        tc6Var.i = bjg.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = tc6Var.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = tc6Var.a;
        if (hashSet2.contains(GoogleSignInOptions.Y)) {
            Scope scope2 = GoogleSignInOptions.X;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (tc6Var.d && (tc6Var.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.z);
        }
        this.A = new GoogleSignInOptions(3, new ArrayList(hashSet2), tc6Var.f, tc6Var.d, tc6Var.b, tc6Var.c, tc6Var.e, tc6Var.g, tc6Var.h, tc6Var.i);
    }

    @Override // defpackage.yt0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof ojg ? (ojg) iInterfaceQueryLocalInterface : new ojg(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 2);
    }

    @Override // defpackage.yt0
    public final int i() {
        return 12451000;
    }

    @Override // defpackage.yt0
    public final String m() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // defpackage.yt0
    public final String n() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}

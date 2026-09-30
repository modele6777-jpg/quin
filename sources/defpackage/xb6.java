package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class xb6 extends yt0 {
    public final Set z;

    /* JADX WARN: Illegal instructions before constructor call */
    public xb6(Context context, Looper looper, int i, hbc hbcVar, cc6 cc6Var, dc6 dc6Var) {
        tch tchVarA = tch.a(context);
        ac6 ac6Var = ac6.e;
        oa7.A(cc6Var);
        oa7.A(dc6Var);
        super(context, looper, tchVarA, ac6Var, i, new ysd(6, cc6Var), new oid(8, dc6Var), (String) hbcVar.d);
        Set set = (Set) hbcVar.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                qc0.p("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.z = set;
    }

    @Override // defpackage.yt0
    public final Account e() {
        return null;
    }

    @Override // defpackage.yt0
    public final Executor g() {
        return null;
    }

    @Override // defpackage.yt0
    public final Set k() {
        return this.z;
    }
}

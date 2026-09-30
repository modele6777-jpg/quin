package defpackage;

import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ee9 implements fl2 {
    public final ConnectivityManager a;

    public ee9(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.fl2
    public final ka1 a(jl2 jl2Var) {
        jl2Var.getClass();
        return nk8.m(new de9(jl2Var, this, null));
    }

    @Override // defpackage.fl2
    public final boolean b(lbg lbgVar) {
        lbgVar.getClass();
        return (lbgVar.j.a() == null && lbgVar.j.a == qe9.a) ? false : true;
    }
}

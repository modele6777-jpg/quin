package defpackage;

import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hqb extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        hqb hqbVar = new hqb(2, xn2Var);
        hqbVar.L$0 = obj;
        return hqbVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        b1.d("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.L$0));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        hqb hqbVar = (hqb) k((xn2) obj2, (String) obj);
        wef wefVar = wef.a;
        hqbVar.r(wefVar);
        return wefVar;
    }
}

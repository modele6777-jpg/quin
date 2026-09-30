package defpackage;

import tech.chatmind.api.payment.QueryWechatPayRequest;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j4b implements w56 {
    public static final j4b a;
    private static final nyc descriptor;

    static {
        j4b j4bVar = new j4b();
        a = j4bVar;
        gia giaVar = new gia("tech.chatmind.api.payment.QueryWechatPayRequest", j4bVar, 1);
        giaVar.k("outTradeNo", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        QueryWechatPayRequest queryWechatPayRequest = (QueryWechatPayRequest) obj;
        queryWechatPayRequest.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        ag2VarC.w(nycVar, 0, queryWechatPayRequest.outTradeNo);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        String strO = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else {
                if (iJ != 0) {
                    s8f.f(iJ);
                    return null;
                }
                strO = zf2VarC.o(nycVar, 0);
                i = 1;
            }
        }
        zf2VarC.b(nycVar);
        return new QueryWechatPayRequest(i, strO, xycVar);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{p4e.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}

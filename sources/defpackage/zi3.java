package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zi3 implements a26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zi3(long j, e89 e89Var, e89 e89Var2) {
        this.b = j;
        this.c = e89Var;
        this.d = e89Var2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj2;
                String str = (String) obj;
                str.getClass();
                x1f x1fVar = x1f.a;
                x1f.k(new r05("playcard_gesture"), new ks2(14, tarotSkinIdentify, str), 2);
                ((o26) obj3).t(tarotSkinIdentify, str, 1, Integer.valueOf(abg.Z(this.b)));
                break;
            default:
                e89 e89Var = (e89) obj3;
                e89 e89Var2 = (e89) obj2;
                ste steVar = (ste) obj;
                steVar.getClass();
                if (!steVar.e()) {
                    e89Var2.setValue(Boolean.TRUE);
                } else {
                    long j = ((mue) e89Var.getValue()).a.b;
                    w6c.f(j);
                    long jR = w6c.r(1095216660480L & j, (float) (((double) wue.c(j)) * 0.9d));
                    long j2 = this.b;
                    w6c.g(jR, j2);
                    if (Float.compare(wue.c(jR), wue.c(j2)) <= 0) {
                        e89Var.setValue(mue.a((mue) e89Var.getValue(), 0L, j2, null, null, 0L, null, 0, 0L, null, null, 16777213));
                        e89Var2.setValue(Boolean.TRUE);
                    } else {
                        e89Var.setValue(mue.a((mue) e89Var.getValue(), 0L, jR, null, null, 0L, null, 0, 0L, null, null, 16777213));
                    }
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ zi3(o26 o26Var, TarotSkinIdentify tarotSkinIdentify, long j) {
        this.c = o26Var;
        this.d = tarotSkinIdentify;
        this.b = j;
    }
}

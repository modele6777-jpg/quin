package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class po3 implements c98, xl2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ po3(pl plVar, int i, long j, long j2) {
        this.c = plVar;
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.xl2
    public void accept(Object obj) {
        g8e g8eVar = (g8e) this.c;
        w03 w03Var = (w03) obj;
        g8eVar.h.getClass();
        byte[] bArrT = m8c.t(w03Var.a, w03Var.c);
        d0a d0aVar = g8eVar.c;
        d0aVar.K(bArrT, bArrT.length);
        g8eVar.a.e(bArrT.length, d0aVar);
        long j = w03Var.b;
        rr5 rr5Var = g8eVar.h;
        long j2 = this.a;
        if (j == -9223372036854775807L) {
            pa7.J(rr5Var.u == Long.MAX_VALUE);
        } else {
            long j3 = rr5Var.u;
            j2 = j3 == Long.MAX_VALUE ? j2 + j : j + j3;
        }
        g8eVar.a.a(j2, this.b | 1, bArrT.length, 0, null);
    }

    @Override // defpackage.c98
    public void d(Object obj) {
        pl plVar = (pl) this.c;
        sp8 sp8Var = (sp8) ((ql) obj);
        HashMap map = sp8Var.h;
        HashMap map2 = sp8Var.i;
        zp8 zp8Var = plVar.d;
        if (zp8Var != null) {
            String strC = sp8Var.c.c(plVar.b, zp8Var);
            Long l = (Long) map2.get(strC);
            Long l2 = (Long) map.get(strC);
            map2.put(strC, Long.valueOf((l == null ? 0L : l.longValue()) + this.a));
            map.put(strC, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) this.b)));
        }
    }

    public /* synthetic */ po3(g8e g8eVar, long j, int i) {
        this.c = g8eVar;
        this.a = j;
        this.b = i;
    }
}

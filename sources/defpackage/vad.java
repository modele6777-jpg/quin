package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vad {
    public final x6d a;
    public final j35 b;
    public final g5b c;
    public final zy1 d;
    public boolean e;
    public boolean f;
    public Float g;

    public vad(x6d x6dVar, List list, int i, boolean z) {
        wad wadVar = wad.a;
        x6dVar.getClass();
        this.a = x6dVar;
        j35 j35Var = new j35();
        j35Var.a = i;
        this.b = j35Var;
        this.c = new g5b(5);
        zy1 zy1Var = new zy1(3);
        Object objInvoke = wadVar.invoke();
        ((Number) objInvoke).longValue();
        zy1Var.c = (Long) (z ? objInvoke : null);
        this.d = zy1Var;
    }

    public final void a(int i, u6d u6dVar, x16 x16Var) {
        u6dVar.getClass();
        x16Var.getClass();
        b(i, u6dVar);
        if (this.f) {
            return;
        }
        this.f = true;
        x16Var.invoke();
    }

    public final boolean b(int i, u6d u6dVar) {
        u6dVar.getClass();
        if (this.e) {
            return false;
        }
        x6d x6dVar = this.a;
        e8d e8dVar = (e8d) s72.y0(i, x6dVar.c);
        if (e8dVar == null) {
            return false;
        }
        this.e = true;
        zy1 zy1Var = this.d;
        Long l = (Long) zy1Var.c;
        long j = 0;
        if (l != null) {
            long jLongValue = ((Number) wad.a.invoke()).longValue() - l.longValue();
            if (jLongValue >= 0) {
                j = jLongValue;
            }
        }
        w6c.y(new b6d("button_click", bm8.L(q3c.l(x6dVar, e8dVar), bm8.H(new iy9("btn", "close"), new iy9("pathway", "share_sheet"), new iy9("method", u6dVar.a()), new iy9("duration", Long.valueOf(zy1Var.b + j))))));
        return true;
    }
}

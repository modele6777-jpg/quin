package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k89 implements xj5 {
    public final /* synthetic */ q95 a;
    public final /* synthetic */ l89 b;
    public final /* synthetic */ q95 c;
    public final /* synthetic */ q95 d;

    public k89(q95 q95Var, l89 l89Var, q95 q95Var2, q95 q95Var3) {
        this.a = q95Var;
        this.b = l89Var;
        this.c = q95Var2;
        this.d = q95Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(l77 l77Var, xn2 xn2Var) {
        j89 j89Var;
        l89 l89Var;
        Iterator it;
        if (xn2Var instanceof j89) {
            j89Var = (j89) xn2Var;
            int i = j89Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                j89Var.label = i - Integer.MIN_VALUE;
            } else {
                j89Var = new j89(this, xn2Var);
            }
        } else {
            j89Var = new j89(this, xn2Var);
        }
        Object obj = j89Var.result;
        int i2 = j89Var.label;
        wef wefVar = wef.a;
        if (i2 == 0) {
            jzb.q(obj);
            boolean z = l77Var instanceof pta;
            q95 q95Var = this.a;
            l89Var = this.b;
            if (z) {
                q95Var.a(l77Var);
                l89Var.c.b(1, true);
                return wefVar;
            }
            if (l77Var instanceof qta) {
                q95Var.b(((qta) l77Var).a);
                l89Var.c.b(1, q95Var.a != null);
                return wefVar;
            }
            if (l77Var instanceof ota) {
                q95Var.b(((ota) l77Var).a);
                l89Var.c.b(1, q95Var.a != null);
                return wefVar;
            }
            boolean z2 = l77Var instanceof yq6;
            q95 q95Var2 = this.c;
            if (z2) {
                q95Var2.a(l77Var);
                l89Var.c.b(2, true);
                return wefVar;
            }
            if (l77Var instanceof zq6) {
                q95Var2.b(((zq6) l77Var).a);
                l89Var.c.b(2, q95Var2.a != null);
                return wefVar;
            }
            boolean z3 = l77Var instanceof rn5;
            q95 q95Var3 = this.d;
            if (z3) {
                q95Var3.a(l77Var);
                l89Var.c.b(4, true);
                return wefVar;
            }
            if (l77Var instanceof sn5) {
                q95Var3.b(((sn5) l77Var).a);
                l89Var.c.b(4, q95Var3.a != null);
                return wefVar;
            }
            it = l89Var.b.b.iterator();
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) j89Var.L$2;
            l89 l89Var2 = (l89) j89Var.L$1;
            l77 l77Var2 = (l77) j89Var.L$0;
            jzb.q(obj);
            l89Var = l89Var2;
            l77Var = l77Var2;
        }
        while (it.hasNext()) {
            c6e c6eVar = (c6e) ((Map.Entry) it.next()).getKey();
            j89Var.L$0 = l77Var;
            j89Var.L$1 = l89Var;
            j89Var.L$2 = it;
            j89Var.label = 1;
            c6eVar.getClass();
            bw2 bw2Var = bw2.a;
            if (wefVar == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
    }
}

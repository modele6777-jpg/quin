package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i3c extends gbe implements l26 {
    final /* synthetic */ long $promptGeneration;
    final /* synthetic */ r0c $session;
    int label;
    final /* synthetic */ p3c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3c(p3c p3cVar, r0c r0cVar, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = p3cVar;
        this.$session = r0cVar;
        this.$promptGeneration = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new i3c(this.this$0, this.$session, this.$promptGeneration, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object value;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            k2c k2cVar = this.this$0.c;
            String str = this.$session.a;
            ca2.a.getClass();
            String str2 = ca2.d;
            Set set = r1c.a;
            str2.getClass();
            n2c n2cVar = new n2c(r1c.a.contains(str2), this.this$0.i(), z57.a.a());
            this.label = 1;
            k2cVar.getClass();
            obj = v4e.Q(str) ? Boolean.FALSE : k2cVar.f(str, Boolean.FALSE, new d2c(k2cVar, str, n2cVar, null), this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        wef wefVar = wef.a;
        if (zBooleanValue) {
            p3c p3cVar = this.this$0;
            r0c r0cVar = this.$session;
            int i2 = p3c.L0;
            if (p3cVar.m(r0cVar)) {
                long j = this.$promptGeneration;
                p3c p3cVar2 = this.this$0;
                if (j == p3cVar2.v && p3cVar2.i() == u0c.b) {
                    this.this$0.w = new o2c(this.$session, this.$promptGeneration, true);
                    s0e s0eVar = this.this$0.d;
                    do {
                        value = s0eVar.getValue();
                    } while (!s0eVar.l(value, d3c.a((d3c) value, true, false, 2)));
                    x1f x1fVar = x1f.a;
                    x1f.g(new r05("popup_view"), m1f.a, new z8b(29));
                }
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((i3c) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

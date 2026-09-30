package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kl3 extends gbe implements l26 {
    final /* synthetic */ boolean $selectWhenUnlocked;
    int label;
    final /* synthetic */ ol3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl3(ol3 ol3Var, boolean z, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = ol3Var;
        this.$selectWhenUnlocked = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kl3(this.this$0, this.$selectWhenUnlocked, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                rw8 rw8Var = this.this$0.f;
                this.label = 1;
                obj = rw8Var.a(this);
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
            hw8 hw8Var = (hw8) obj;
            this.this$0.y.m(hw8Var);
            if (!hw8Var.a.a()) {
                s0e s0eVar = this.this$0.Y;
                Boolean bool = Boolean.FALSE;
                s0eVar.getClass();
                s0eVar.n(null, bool);
            } else if (this.$selectWhenUnlocked) {
                this.this$0.f();
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            tec.t(hf8.Q, "DeckSelection", "Failed to load mixed deck entitlement", e2);
            if (this.this$0.y.getValue() == null) {
                s0e s0eVar2 = this.this$0.y;
                tw8 tw8Var = new tw8(0, false, false);
                xu4 xu4Var = xu4.a;
                hw8 hw8Var2 = new hw8(tw8Var, new uw8(xu4Var, xu4Var, xu4Var), xu4Var, "", false, false);
                s0eVar2.getClass();
                s0eVar2.n(null, hw8Var2);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kl3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

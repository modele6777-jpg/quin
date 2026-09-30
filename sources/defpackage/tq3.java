package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tq3 extends gbe implements l26 {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ fhc $this_performFling;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ uq3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq3(float f, uq3 uq3Var, fhc fhcVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$initialVelocity = f;
        this.this$0 = uq3Var;
        this.$this_performFling = fhcVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new tq3(this.$initialVelocity, this.this$0, this.$this_performFling, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        float f;
        wz wzVarA;
        jmb jmbVar;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            float fAbs = Math.abs(this.$initialVelocity);
            f = this.$initialVelocity;
            if (fAbs > 1.0f) {
                jmb jmbVar2 = new jmb();
                jmbVar2.element = f;
                jmb jmbVar3 = new jmb();
                wzVarA = g21.a(0.0f, f, 28);
                try {
                    uq3 uq3Var = this.this$0;
                    ph3 ph3Var = uq3Var.a;
                    wg wgVar = new wg(jmbVar3, this.$this_performFling, jmbVar2, uq3Var, 10);
                    this.L$0 = jmbVar2;
                    this.L$1 = wzVarA;
                    this.label = 1;
                    Object objT = hkg.T(wzVarA, ph3Var, false, wgVar, this);
                    bw2 bw2Var = bw2.a;
                    if (objT == bw2Var) {
                        return bw2Var;
                    }
                    jmbVar = jmbVar2;
                    f = jmbVar.element;
                } catch (CancellationException unused) {
                    jmbVar = jmbVar2;
                    jmbVar.element = ((Number) wzVarA.c()).floatValue();
                }
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wzVarA = (wz) this.L$1;
            jmbVar = (jmb) this.L$0;
            try {
                jzb.q(obj);
            } catch (CancellationException unused2) {
                jmbVar.element = ((Number) wzVarA.c()).floatValue();
            }
            f = jmbVar.element;
        }
        return new Float(f);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((tq3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q31 extends gbe implements l26 {
    final /* synthetic */ x16 $boundsProvider;
    final /* synthetic */ bv7 $childCoordinates;
    int label;
    final /* synthetic */ t31 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q31(t31 t31Var, bv7 bv7Var, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = t31Var;
        this.$childCoordinates = bv7Var;
        this.$boundsProvider = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new q31(this.this$0, this.$childCoordinates, this.$boundsProvider, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object objT;
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        pm2 pm2Var = this.this$0.Z;
        p31 p31Var = new p31(this.this$0, this.$childCoordinates, this.$boundsProvider);
        this.label = 1;
        pm2Var.getClass();
        hkb hkbVar = (hkb) p31Var.invoke();
        bw2 bw2Var = bw2.a;
        if (hkbVar == null || pm2.n1(pm2Var, hkbVar, 0L, 0L, 3)) {
            objT = wefVar;
        } else {
            pl1 pl1Var = new pl1(1, k99.D(this));
            pl1Var.v();
            mm2 mm2Var = new mm2(p31Var, pl1Var);
            m6c m6cVar = pm2Var.I0;
            p89 p89Var = (p89) m6cVar.b;
            hkb hkbVar2 = (hkb) p31Var.invoke();
            if (hkbVar2 == null) {
                pl1Var.g(wefVar);
            } else {
                pl1Var.x(new l0(26, m6cVar, mm2Var));
                z67 z67VarC0 = mh3.c0(0, p89Var.c);
                int i2 = z67VarC0.a;
                int i3 = z67VarC0.b;
                if (i2 > i3) {
                    p89Var.a(0, mm2Var);
                    break;
                }
                while (true) {
                    hkb hkbVar3 = (hkb) ((mm2) p89Var.a[i3]).a.invoke();
                    if (hkbVar3 != null) {
                        hkb hkbVarG = hkbVar2.g(hkbVar3);
                        if (!hkbVarG.equals(hkbVar2)) {
                            if (!hkbVarG.equals(hkbVar3)) {
                                CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                int i4 = p89Var.c - 1;
                                if (i4 <= i3) {
                                    while (true) {
                                        ((mm2) p89Var.a[i3]).b.p(cancellationException);
                                        if (i4 == i3) {
                                            break;
                                        }
                                        i4++;
                                    }
                                }
                            }
                        } else {
                            p89Var.a(i3 + 1, mm2Var);
                            break;
                        }
                    }
                    if (i3 == i2) {
                        p89Var.a(0, mm2Var);
                        break;
                    }
                    i3--;
                }
                if (!pm2Var.L0) {
                    pm2Var.o1(0L);
                }
            }
            objT = pl1Var.t();
            if (objT != bw2Var) {
                objT = wefVar;
            }
        }
        return objT == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((q31) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

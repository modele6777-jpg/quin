package defpackage;

import ai.askquin.ui.popup.dailyfortune.b;
import ai.askquin.ui.popup.dailyfortune.p;
import ai.askquin.ui.popup.dailyfortune.v;
import java.time.LocalDateTime;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qo6 extends gbe implements l26 {
    final /* synthetic */ imb $isFirstAccount;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ kq6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo6(imb imbVar, kq6 kq6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$isFirstAccount = imbVar;
        this.this$0 = kq6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        qo6 qo6Var = new qo6(this.$isFirstAccount, this.this$0, xn2Var);
        qo6Var.L$0 = obj;
        return qo6Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        String str = (String) this.L$0;
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            imb imbVar = this.$isFirstAccount;
            if (imbVar.element) {
                imbVar.element = false;
            } else {
                this.this$0.f();
                kq6 kq6Var = this.this$0;
                LocalDateTime localDateTimeA = e3b.a(kq6Var.w);
                h73 h73VarA = e73.a(localDateTimeA);
                kq6Var.Z = new iy9(localDateTimeA.toLocalDate(), h73VarA);
                s0e s0eVar = kq6Var.X;
                s0eVar.getClass();
                s0eVar.n(null, h73VarA);
                s0e s0eVar2 = kq6Var.Y;
                s0eVar2.getClass();
                s0eVar2.n(null, h73VarA);
            }
            v vVar = this.this$0.x;
            this.L$0 = str;
            this.label = 1;
            vVar.getClass();
            if ((v4e.Q(str) ? wefVar : vVar.u(str, new b(1), this)) != bw2Var) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        v vVar2 = this.this$0.x;
        sc3 sc3Var = new sc3(2, str);
        vVar2.getClass();
        hs3 hs3Var = xqa.K;
        isa isaVar = hs3Var.a;
        Object obj2 = hs3Var.b;
        ypa.a.getClass();
        b83 b83Var = new b83(ypa.b(), isaVar, obj2);
        p pVar = new p(vVar2, null);
        ts tsVar = new ts(15, this.this$0);
        this.L$0 = null;
        this.label = 2;
        Object objV = lmg.V(this, tsVar, tq0.z, new xm5(pVar, null), new wj5[]{sc3Var, b83Var});
        if (objV != bw2Var) {
            objV = wefVar;
        }
        return objV == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qo6) k((xn2) obj2, (String) obj)).r(wef.a);
    }
}

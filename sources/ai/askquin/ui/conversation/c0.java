package ai.askquin.ui.conversation;

import defpackage.ca2;
import defpackage.gbe;
import defpackage.jzb;
import defpackage.l26;
import defpackage.qc0;
import defpackage.r05;
import defpackage.tj7;
import defpackage.wef;
import defpackage.x1f;
import defpackage.xn2;
import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends gbe implements l26 {
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(r0 r0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new c0(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.this$0.X1 = Instant.now();
        if (this.this$0.m0()) {
            tj7 tj7Var = tj7.L0;
            ca2.a.getClass();
            if (ca2.c) {
                x1f x1fVar = x1f.a;
                x1f.k(new r05("onboarding_divination_cards_complete"), tj7Var, 2);
            }
        }
        this.this$0.M0(Operation.Explanation.INSTANCE);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        c0 c0Var = (c0) k((xn2) obj2, (wef) obj);
        wef wefVar = wef.a;
        c0Var.r(wefVar);
        return wefVar;
    }
}

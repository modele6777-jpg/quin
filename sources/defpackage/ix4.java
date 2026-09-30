package defpackage;

import ai.askquin.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ix4 extends gbe implements l26 {
    final /* synthetic */ a26 $block;
    int label;
    final /* synthetic */ jx4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix4(jx4 jx4Var, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = jx4Var;
        this.$block = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ix4(this.this$0, this.$block, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object objK;
        eb2 eb2Var;
        Throwable th;
        jx4 jx4Var;
        wef wefVar;
        m8b m8bVarD;
        Object objK2;
        eb2 eb2Var2;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            x1f x1fVar = x1f.a;
            x1f.g(p05.a, m1f.a, new hl4(11));
            if (!this.this$0.d.L0()) {
                this.this$0.c.setValue(Boolean.TRUE);
                pu3 pu3Var = this.this$0.d;
                this.label = 1;
                Object objU0 = pu3Var.U0(this);
                bw2 bw2Var = bw2.a;
                if (objU0 == bw2Var) {
                    return bw2Var;
                }
            }
            objK = this.this$0.d.K();
            if (!(objK instanceof x07)) {
                qc0.p("This job has not completed yet");
                return null;
            }
            if (objK instanceof eb2) {
                eb2Var = (eb2) objK;
            } else {
                eb2Var = null;
            }
            if (eb2Var != null) {
                th = eb2Var.a;
            } else {
                th = null;
            }
            jx4Var = this.this$0;
            wefVar = wef.a;
            if (th != null) {
                this.$block.d((String) jx4Var.d.D());
                return wefVar;
            }
            m8bVarD = jx4Var.d();
            objK2 = this.this$0.d.K();
            if (!(objK2 instanceof x07)) {
                qc0.p("This job has not completed yet");
                return null;
            }
            if (objK2 instanceof eb2) {
                eb2Var2 = (eb2) objK2;
            } else {
                eb2Var2 = null;
            }
            m8bVarD.d("create test failed", eb2Var2 != null ? eb2Var2.a : null);
            jcc.k(0, new Integer(R.string.personality_create_test_error));
            return wefVar;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        jx4 jx4Var2 = this.this$0;
        int i2 = jx4.e;
        jx4Var2.c.setValue(Boolean.FALSE);
        objK = this.this$0.d.K();
        if (!(objK instanceof x07)) {
            qc0.p("This job has not completed yet");
            return null;
        }
        if (objK instanceof eb2) {
            eb2Var = (eb2) objK;
        } else {
            eb2Var = null;
        }
        if (eb2Var != null) {
            th = eb2Var.a;
        } else {
            th = null;
        }
        jx4Var = this.this$0;
        wefVar = wef.a;
        if (th != null) {
            this.$block.d((String) jx4Var.d.D());
            return wefVar;
        }
        m8bVarD = jx4Var.d();
        objK2 = this.this$0.d.K();
        if (!(objK2 instanceof x07)) {
            qc0.p("This job has not completed yet");
            return null;
        }
        if (objK2 instanceof eb2) {
            eb2Var2 = (eb2) objK2;
        } else {
            eb2Var2 = null;
        }
        m8bVarD.d("create test failed", eb2Var2 != null ? eb2Var2.a : null);
        jcc.k(0, new Integer(R.string.personality_create_test_error));
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ix4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

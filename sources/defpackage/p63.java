package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p63 extends gbe implements l26 {
    final /* synthetic */ TarotSkinIdentify $skin;
    final /* synthetic */ d63 $success;
    int label;
    final /* synthetic */ y63 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p63(xn2 xn2Var, d63 d63Var, y63 y63Var, TarotSkinIdentify tarotSkinIdentify) {
        super(2, xn2Var);
        this.this$0 = y63Var;
        this.$skin = tarotSkinIdentify;
        this.$success = d63Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new p63(xn2Var, this.$success, this.this$0, this.$skin);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x007a A[RETURN] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        y63 y63Var;
        n63 n63Var;
        Object objM;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            y63 y63Var2 = this.this$0;
            k63 k63Var = new k63(y63Var2, this.$skin, null);
            this.label = 1;
            if (y63Var2.m(k63Var, this) != bw2Var) {
            }
            return bw2Var;
        }
        if (i == 1) {
            jzb.q(obj);
        } else {
            if (i == 2) {
                jzb.q(obj);
                y63Var = this.this$0;
                if (y63Var.J0) {
                    n63Var = new n63(this.$skin, null);
                    this.label = 3;
                    if (y63Var.m(n63Var, this) != bw2Var) {
                    }
                }
                return bw2Var;
            }
            if (i != 3) {
                if (i == 4) {
                    jzb.q(obj);
                    return obj;
                }
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        y63 y63Var3 = this.this$0;
        o63 o63Var = new o63(null, this.$success, y63Var3, this.$skin);
        this.label = 4;
        objM = y63Var3.m(o63Var, this);
        if (objM == bw2Var) {
            return bw2Var;
        }
        return objM;
        y63 y63Var4 = this.this$0;
        m63 m63Var = new m63(y63Var4, this.$skin, null);
        this.label = 2;
        if (y63Var4.m(m63Var, this) != bw2Var) {
            y63Var = this.this$0;
            if (y63Var.J0) {
                n63Var = new n63(this.$skin, null);
                this.label = 3;
                if (y63Var.m(n63Var, this) != bw2Var) {
                    y63 y63Var5 = this.this$0;
                    o63 o63Var2 = new o63(null, this.$success, y63Var5, this.$skin);
                    this.label = 4;
                    objM = y63Var5.m(o63Var2, this);
                    if (objM == bw2Var) {
                        return objM;
                    }
                }
            } else {
                y63 y63Var6 = this.this$0;
                o63 o63Var3 = new o63(null, this.$success, y63Var6, this.$skin);
                this.label = 4;
                objM = y63Var6.m(o63Var3, this);
                if (objM == bw2Var) {
                    return objM;
                }
            }
        }
        return bw2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((p63) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

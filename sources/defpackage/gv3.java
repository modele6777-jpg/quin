package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gv3 extends gbe implements l26 {
    final /* synthetic */ ph2 $optionPriority$inlined;
    final /* synthetic */ zif $type$inlined;
    final /* synthetic */ Map $values$inlined;
    int label;
    final /* synthetic */ jv3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv3(jv3 jv3Var, xn2 xn2Var, Map map, zif zifVar, ph2 ph2Var) {
        super(2, xn2Var);
        this.this$0 = jv3Var;
        this.$values$inlined = map;
        this.$type$inlined = zifVar;
        this.$optionPriority$inlined = ph2Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new gv3(this.this$0, xn2Var, this.$values$inlined, this.$type$inlined, this.$optionPriority$inlined);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        nu3 nu3VarG = this.this$0.l().g(this.$values$inlined, this.$type$inlined, this.$optionPriority$inlined);
        this.label = 1;
        Object objH0 = nu3VarG.H0(this);
        bw2 bw2Var = bw2.a;
        return objH0 == bw2Var ? bw2Var : objH0;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((gv3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

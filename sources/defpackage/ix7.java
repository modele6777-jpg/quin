package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ix7 extends gbe implements l26 {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    int label;
    final /* synthetic */ jx7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix7(jx7 jx7Var, int i, int i2, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = jx7Var;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ix7(this.this$0, this.$index, this.$scrollOffset, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        jx7 jx7Var = this.this$0;
        int i = this.$index;
        int i2 = this.$scrollOffset;
        cx7 cx7Var = jx7Var.d;
        if (cx7Var.b.j() != i || cx7Var.c.j() != i2) {
            oz7 oz7Var = jx7Var.m;
            oz7Var.e();
            oz7Var.b = null;
            oz7Var.c = -1;
            or3 or3Var = jx7Var.a;
        }
        cx7Var.a(i, i2);
        cx7Var.e = null;
        LayoutNode layoutNode = jx7Var.j;
        if (layoutNode != null) {
            layoutNode.m();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ix7 ix7Var = (ix7) k((xn2) obj2, (fhc) obj);
        wef wefVar = wef.a;
        ix7Var.r(wefVar);
        return wefVar;
    }
}

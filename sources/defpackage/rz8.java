package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rz8 extends gbe implements l26 {
    final /* synthetic */ float $it;
    final /* synthetic */ ted $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz8(ted tedVar, float f, xn2 xn2Var) {
        super(2, xn2Var);
        this.$sheetState = tedVar;
        this.$it = f;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rz8(this.$sheetState, this.$it, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object objB;
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
        ted tedVar = this.$sheetState;
        float f = this.$it;
        this.label = 1;
        lo loVar = tedVar.d;
        Object value = loVar.g.getValue();
        Object objC = loVar.c(loVar.f(), f, value);
        boolean zBooleanValue = ((Boolean) loVar.d.d(objC)).booleanValue();
        s89 s89Var = s89.a;
        bw2 bw2Var = bw2.a;
        if (zBooleanValue) {
            objB = loVar.b(objC, s89Var, new wm(loVar, f, null), this);
            if (objB != bw2Var) {
                objB = wefVar;
            }
            if (objB != bw2Var) {
                objB = wefVar;
            }
        } else {
            objB = loVar.b(value, s89Var, new wm(loVar, f, null), this);
            if (objB != bw2Var) {
                objB = wefVar;
            }
            if (objB != bw2Var) {
                objB = wefVar;
            }
        }
        if (objB != bw2Var) {
            objB = wefVar;
        }
        return objB == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rz8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

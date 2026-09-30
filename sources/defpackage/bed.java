package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bed extends gu7 implements n26 {
    final /* synthetic */ o26 $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bed(o26 o26Var) {
        super(3);
        this.$content = o26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        sg8 sg8Var = (sg8) obj;
        l46 l46Var = (l46) obj2;
        ((Number) obj3).intValue();
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = af1.E(l46Var);
            l46Var.p0(objR);
        }
        aw2 aw2Var = (aw2) objR;
        Object objR2 = l46Var.R();
        if (objR2 == i8cVar) {
            objR2 = new xdd(sg8Var, aw2Var);
            l46Var.p0(objR2);
        }
        xdd xddVar = (xdd) objR2;
        this.$content.t(xddVar, new eed(xddVar), l46Var, 6);
        return wef.a;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fy extends gu7 implements n26 {
    final /* synthetic */ o26 $content;
    final /* synthetic */ jsd $currentlyVisible;
    final /* synthetic */ uy $rootScope;
    final /* synthetic */ Object $stateForContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy(Object obj, jsd jsdVar, uy uyVar, o26 o26Var) {
        super(3);
        this.$stateForContent = obj;
        this.$currentlyVisible = jsdVar;
        this.$rootScope = uyVar;
        this.$content = o26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        oz ozVar = (oz) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? l46Var.g(ozVar) : l46Var.i(ozVar) ? 4 : 2;
        }
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            Object obj4 = this.$stateForContent;
            boolean zG = l46Var.g(this.$currentlyVisible) | l46Var.i(this.$stateForContent) | l46Var.i(this.$rootScope);
            jsd jsdVar = this.$currentlyVisible;
            Object obj5 = this.$stateForContent;
            uy uyVar = this.$rootScope;
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = new ey(jsdVar, obj5, uyVar);
                l46Var.p0(objR);
            }
            af1.h(ozVar, obj4, (a26) objR, l46Var);
            w79 w79Var = this.$rootScope.d;
            Object obj6 = this.$stateForContent;
            ozVar.getClass();
            w79Var.m(obj6, ((pz) ozVar).b);
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new ly(ozVar);
                l46Var.p0(objR2);
            }
            this.$content.t((ly) objR2, this.$stateForContent, l46Var, 0);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}

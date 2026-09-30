package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gy extends gu7 implements l26 {
    final /* synthetic */ o26 $content;
    final /* synthetic */ jsd $currentlyVisible;
    final /* synthetic */ l69 $mutableContentTransformData;
    final /* synthetic */ g6a $pendingScope;
    final /* synthetic */ uy $rootScope;
    final /* synthetic */ Object $stateForContent;
    final /* synthetic */ n3f $this_AnimatedContentImpl;
    final /* synthetic */ a26 $transitionSpec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(Object obj, n3f n3fVar, g6a g6aVar, a26 a26Var, uy uyVar, jsd jsdVar, o26 o26Var) {
        super(2);
        this.$stateForContent = obj;
        this.$this_AnimatedContentImpl = n3fVar;
        this.$pendingScope = g6aVar;
        this.$transitionSpec = a26Var;
        this.$rootScope = uyVar;
        this.$currentlyVisible = jsdVar;
        this.$content = o26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        cn2 cn2Var;
        Object obj3;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean z = false;
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zH = l46Var.h(pa7.t(this.$stateForContent, this.$this_AnimatedContentImpl.e.getValue()));
            Object obj4 = this.$stateForContent;
            n3f n3fVar = this.$this_AnimatedContentImpl;
            g6a g6aVar = this.$pendingScope;
            a26 a26Var = this.$transitionSpec;
            uy uyVar = this.$rootScope;
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zH || objR == i8cVar) {
                if (!pa7.t(obj4, n3fVar.e.getValue()) || g6aVar == null) {
                    cn2Var = (pa7.t(obj4, n3fVar.f().b()) || pa7.t(obj4, n3fVar.f().d())) ? (cn2) a26Var.d(uyVar) : (cn2) a26Var.d(new g6a(uyVar, n3fVar.f().b(), obj4));
                } else {
                    cn2Var = (cn2) a26Var.d(g6aVar);
                }
                objR = cn2Var;
                l46Var.p0(objR);
            }
            cn2 cn2Var2 = (cn2) objR;
            boolean zH2 = l46Var.h(pa7.t(this.$this_AnimatedContentImpl.f().d(), this.$stateForContent)) | l46Var.h(pa7.t(this.$stateForContent, this.$this_AnimatedContentImpl.e.getValue()));
            n3f n3fVar2 = this.$this_AnimatedContentImpl;
            Object obj5 = this.$stateForContent;
            g6a g6aVar2 = this.$pendingScope;
            a26 a26Var2 = this.$transitionSpec;
            uy uyVar2 = this.$rootScope;
            Object objR2 = l46Var.R();
            if (zH2 || objR2 == i8cVar) {
                if (pa7.t(n3fVar2.f().d(), obj5) || (pa7.t(obj5, n3fVar2.e.getValue()) && g6aVar2 != null)) {
                    obj3 = e45.a;
                } else {
                    obj3 = (pa7.t(obj5, n3fVar2.f().b()) || pa7.t(obj5, n3fVar2.f().d())) ? ((cn2) a26Var2.d(uyVar2)).b : ((cn2) a26Var2.d(new g6a(uyVar2, obj5, n3fVar2.f().b()))).b;
                }
                objR2 = obj3;
                l46Var.p0(objR2);
            }
            e45 e45Var = (e45) objR2;
            Object obj6 = this.$stateForContent;
            n3f n3fVar3 = this.$this_AnimatedContentImpl;
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                objR3 = new ny(pa7.t(obj6, n3fVar3.d.getValue()));
                l46Var.p0(objR3);
            }
            ny nyVar = (ny) objR3;
            bx4 bx4Var = cn2Var2.a;
            float fJ = cn2Var2.c.j();
            Object obj7 = this.$stateForContent;
            ndg ndgVar = new ndg(fJ, obj7);
            n3f n3fVar4 = this.$this_AnimatedContentImpl;
            nyVar.a.setValue(Boolean.valueOf(pa7.t(obj7, n3fVar4.d.getValue())));
            if (pa7.t(obj7, n3fVar4.e.getValue()) && !pa7.t(obj7, n3fVar4.d.getValue()) && !pa7.t(obj7, n3fVar4.a.a())) {
                z = true;
            }
            nyVar.b.setValue(Boolean.valueOf(z));
            j09 j09VarD = ndgVar.D(nyVar);
            n3f n3fVar5 = this.$this_AnimatedContentImpl;
            boolean zI = l46Var.i(this.$stateForContent);
            Object obj8 = this.$stateForContent;
            Object objR4 = l46Var.R();
            if (zI || objR4 == i8cVar) {
                objR4 = new cy(obj8);
                l46Var.p0(objR4);
            }
            a26 a26Var3 = (a26) objR4;
            boolean zG = l46Var.g(e45Var);
            Object objR5 = l46Var.R();
            if (zG || objR5 == i8cVar) {
                objR5 = new dy(e45Var);
                l46Var.p0(objR5);
            }
            m93.a(n3fVar5, a26Var3, j09VarD, bx4Var, e45Var, (l26) objR5, af1.b0(1831990167, new fy(this.$stateForContent, this.$currentlyVisible, this.$rootScope, this.$content), l46Var), l46Var, 100663296, 64);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}

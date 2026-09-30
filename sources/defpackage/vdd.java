package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vdd extends gu7 implements n26 {
    final /* synthetic */ p21 $boundsTransform;
    final /* synthetic */ odd $clipInOverlayDuringTransition;
    final /* synthetic */ n3f $parentTransition;
    final /* synthetic */ qdd $placeholderSize;
    final /* synthetic */ boolean $renderInOverlayDuringTransition;
    final /* synthetic */ boolean $renderOnlyWhenVisible;
    final /* synthetic */ rdd $sharedContentState;
    final /* synthetic */ a26 $visible;
    final /* synthetic */ float $zIndexInOverlay;
    final /* synthetic */ xdd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdd(rdd rddVar, n3f n3fVar, xdd xddVar, ydd yddVar, p21 p21Var) {
        super(3);
        wdd wddVar = wdd.b;
        this.$sharedContentState = rddVar;
        this.$parentTransition = n3fVar;
        this.$visible = wddVar;
        this.this$0 = xddVar;
        this.$placeholderSize = pdd.b;
        this.$renderOnlyWhenVisible = true;
        this.$clipInOverlayDuringTransition = yddVar;
        this.$zIndexInOverlay = 0.0f;
        this.$renderInOverlayDuringTransition = true;
        this.$boundsTransform = p21Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        n3f n3fVarE0;
        k21 k21Var;
        rdd rddVar;
        float f;
        Boolean bool;
        j09 j09Var = (j09) obj;
        l46 l46Var = (l46) obj2;
        ((Number) obj3).intValue();
        l46Var.f0(-1539505585);
        String str = this.$sharedContentState.a;
        l46Var.d0(-1996110647, str);
        xdd xddVar = this.this$0;
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            lsd lsdVar = xddVar.w;
            Object hcdVar = lsdVar.get(str);
            if (hcdVar == null) {
                hcdVar = new hcd(str, xddVar);
                lsdVar.put(str, hcdVar);
            }
            objR = (hcd) hcdVar;
            l46Var.p0(objR);
        }
        hcd hcdVar2 = (hcd) objR;
        l46Var.d0(-1996106866, this.$parentTransition);
        if (this.$parentTransition != null) {
            l46Var.f0(-1749734647);
            n3f n3fVar = this.$parentTransition;
            String string = str.toString();
            a26 a26Var = this.$visible;
            boolean zG = l46Var.g(n3fVar);
            Object objR2 = l46Var.R();
            if (zG || objR2 == i8cVar) {
                objR2 = n3fVar.a.a();
                l46Var.p0(objR2);
            }
            if (n3fVar.h()) {
                objR2 = n3fVar.a.a();
            }
            l46Var.f0(1498260051);
            Boolean bool2 = (Boolean) a26Var.d(objR2);
            bool2.getClass();
            l46Var.r(false);
            Object value = n3fVar.d.getValue();
            l46Var.f0(1498260051);
            Boolean bool3 = (Boolean) a26Var.d(value);
            bool3.getClass();
            l46Var.r(false);
            n3fVarE0 = g21.E(n3fVar, bool2, bool3, string, l46Var, 0);
            l46Var = l46Var;
            if (n3fVar.h()) {
                l46Var.f0(782538635);
                l46Var.r(false);
            } else {
                l46Var.f0(782386797);
                Object value2 = n3fVar.e.getValue();
                if (value2 == null) {
                    l46Var.f0(782437481);
                    l46Var.r(false);
                    bool = null;
                } else {
                    l46Var.f0(782437482);
                    l46Var.f0(1498260051);
                    bool = (Boolean) a26Var.d(value2);
                    bool.getClass();
                    l46Var.r(false);
                    l46Var.r(false);
                }
                n3fVarE0.r(bool);
                l46Var.r(false);
            }
            l46Var.r(false);
        } else {
            l46Var.f0(-1749482679);
            a26 a26Var2 = this.$visible;
            a26Var2.getClass();
            z7f.t(1, a26Var2);
            Boolean bool4 = (Boolean) a26Var2.d(wef.a);
            boolean zBooleanValue = bool4.booleanValue();
            Object objR3 = l46Var.R();
            if (objR3 == i8cVar) {
                if (!hcdVar2.c().isEmpty()) {
                    zBooleanValue = !zBooleanValue;
                }
                objR3 = new o89(Boolean.valueOf(zBooleanValue));
                l46Var.p0(objR3);
            }
            o89 o89Var = (o89) objR3;
            o89Var.f(bool4);
            n3fVarE0 = g21.e0(o89Var, null, l46Var, 0, 2);
            l46Var.r(false);
        }
        n3f n3fVar2 = n3fVarE0;
        l46Var.d0(-1996043323, Boolean.valueOf(this.this$0.e()));
        g3f g3fVarF = g21.F(n3fVar2, xo1.o, null, l46Var, 0, 2);
        l46Var.r(false);
        boolean zG2 = l46Var.g(n3fVar2);
        xdd xddVar2 = this.this$0;
        p21 p21Var = this.$boundsTransform;
        Object objR4 = l46Var.R();
        if (zG2 || objR4 == i8cVar) {
            k21 k21Var2 = new k21(xddVar2, n3fVar2, g3fVarF, p21Var, hcdVar2.h);
            l46Var.p0(k21Var2);
            objR4 = k21Var2;
        }
        k21 k21Var3 = (k21) objR4;
        p21 p21Var2 = this.$boundsTransform;
        if (!pa7.t((g3f) k21Var3.d.getValue(), g3fVarF)) {
            k21Var3.d.setValue(g3fVarF);
            k21Var3.h.setValue(null);
            k21Var3.f = l21.a;
        }
        k21Var3.e.setValue(p21Var2);
        l46Var.r(false);
        xdd xddVar3 = this.this$0;
        qdd qddVar = this.$placeholderSize;
        boolean z = this.$renderOnlyWhenVisible;
        rdd rddVar2 = this.$sharedContentState;
        odd oddVar = this.$clipInOverlayDuringTransition;
        float f2 = this.$zIndexInOverlay;
        boolean z2 = this.$renderInOverlayDuringTransition;
        xddVar3.getClass();
        Object objR5 = l46Var.R();
        if (objR5 == i8cVar) {
            k21Var = k21Var3;
            icd icdVar = new icd(hcdVar2, k21Var, qddVar, z, oddVar, z2, rddVar2, f2);
            rddVar = rddVar2;
            f = f2;
            l46Var.p0(icdVar);
            objR5 = icdVar;
        } else {
            k21Var = k21Var3;
            rddVar = rddVar2;
            f = f2;
        }
        icd icdVar2 = (icd) objR5;
        rddVar.c.setValue(icdVar2);
        vz9 vz9Var = icdVar2.d;
        qz9 qz9Var = icdVar2.b;
        vz9Var.setValue(hcdVar2);
        icdVar2.g.setValue(Boolean.valueOf(z));
        icdVar2.e.setValue(k21Var);
        icdVar2.f.setValue(qddVar);
        icdVar2.v.setValue(oddVar);
        if (qz9Var.j() != f) {
            qz9Var.k(f);
            sz9 sz9Var = icdVar2.f().b.g;
            sz9Var.k(sz9Var.j() + 1);
        }
        icdVar2.c.setValue(Boolean.valueOf(z2));
        icdVar2.w.setValue(rddVar);
        l46Var.r(false);
        j09 j09VarD = j09Var.D(new ubd(icdVar2));
        l46Var.r(false);
        return j09VarD;
    }
}

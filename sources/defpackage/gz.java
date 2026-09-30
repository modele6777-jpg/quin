package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gz implements xj5 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public gz(xj5 xj5Var, pv2 pv2Var) {
        this.a = 3;
        this.b = pv2Var;
        this.c = dwe.b(pv2Var);
        this.d = new gbf(xj5Var, null);
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) throws Throwable {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                n3f n3fVar = (n3f) obj3;
                ((yva) ((xva) obj4)).setValue(Boolean.valueOf(((Boolean) obj).booleanValue() ? ((Boolean) ((l26) ((h0e) obj2).getValue()).z(n3fVar.a.a(), n3fVar.d.getValue())).booleanValue() : false));
                return wefVar;
            case 1:
                oyb kybVar = (oyb) obj;
                m97 m97Var = (m97) obj2;
                u97 u97Var = (u97) obj3;
                imb imbVar = (imb) obj4;
                if (imbVar.element) {
                    return wefVar;
                }
                String str = m97Var.a.b;
                int i2 = u97.v;
                if (kybVar instanceof jyb) {
                    u97Var.getClass();
                    kybVar = new kyb(new IllegalStateException("Interpretation stream ended before a terminal response"));
                } else {
                    u97Var.getClass();
                    if (kybVar instanceof nyb) {
                        j97 j97VarP = tm7.p((j97) ((nyb) kybVar).a, str);
                        kybVar = v4e.Q(j97VarP.a) ? new kyb(new IllegalStateException("Interpretation completed without canonical text")) : new nyb(j97VarP);
                    }
                }
                u97Var.getClass();
                imbVar.element = u97.f(kybVar);
                return u97Var.g(m97Var, kybVar, xn2Var);
            case 2:
                Long l = (Long) obj;
                mmb mmbVar = (mmb) obj4;
                if (!pa7.t(l, mmbVar.element)) {
                    ((x16) ((h0e) obj2).getValue()).invoke();
                }
                mmbVar.element = l;
                if (l != null) {
                    long jLongValue = l.longValue();
                    a26 a26Var = (a26) ((h0e) obj3).getValue();
                    th5 th5Var = cye.b;
                    th5Var.getClass();
                    w57 w57Var = w57.a;
                    a26Var.d(gcc.E(mh3.x(jLongValue), th5Var).a());
                }
                return wefVar;
            default:
                Object objN = z5c.N((pv2) obj4, obj, obj3, (gbf) obj2, xn2Var);
                return objN == bw2.a ? objN : wefVar;
        }
    }

    public /* synthetic */ gz(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public gz(mmb mmbVar, h0e h0eVar, h0e h0eVar2) {
        this.a = 2;
        this.b = mmbVar;
        this.d = h0eVar;
        this.c = h0eVar2;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n5f implements xn7 {
    public final xn7 a;
    public final xn7 b;
    public final xn7 c;
    public final pyc d;

    public n5f(xn7 xn7Var, xn7 xn7Var2, xn7 xn7Var3) {
        xn7Var.getClass();
        xn7Var2.getClass();
        xn7Var3.getClass();
        this.a = xn7Var;
        this.b = xn7Var2;
        this.c = xn7Var3;
        this.d = eec.o("kotlin.Triple", new nyc[0], new trd(22, this));
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        m5f m5fVar = (m5f) obj;
        m5fVar.getClass();
        pyc pycVar = this.d;
        ag2 ag2VarC = ev4Var.c(pycVar);
        ag2VarC.p(pycVar, 0, this.a, m5fVar.d());
        ag2VarC.p(pycVar, 1, this.b, m5fVar.e());
        ag2VarC.p(pycVar, 2, this.c, m5fVar.g());
        ag2VarC.b(pycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        pyc pycVar = this.d;
        zf2 zf2VarC = om3Var.c(pycVar);
        Object obj = y41.o;
        Object objS = obj;
        Object objS2 = objS;
        Object objS3 = objS2;
        while (true) {
            int iJ = zf2VarC.j(pycVar);
            if (iJ == -1) {
                zf2VarC.b(pycVar);
                if (objS == obj) {
                    throw new yyc("Element 'first' is missing");
                }
                if (objS2 == obj) {
                    throw new yyc("Element 'second' is missing");
                }
                if (objS3 != obj) {
                    return new m5f(objS, objS2, objS3);
                }
                throw new yyc("Element 'third' is missing");
            }
            if (iJ == 0) {
                objS = zf2VarC.s(pycVar, 0, this.a, null);
            } else if (iJ == 1) {
                objS2 = zf2VarC.s(pycVar, 1, this.b, null);
            } else {
                if (iJ != 2) {
                    throw new yyc(tec.e(iJ, "Unexpected index "));
                }
                objS3 = zf2VarC.s(pycVar, 2, this.c, null);
            }
        }
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return this.d;
    }
}

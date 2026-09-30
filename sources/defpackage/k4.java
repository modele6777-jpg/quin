package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k4 implements xn7 {
    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        obj.getClass();
        xn7 xn7VarW = mh3.w(this, ev4Var, obj);
        nyc nycVarE = e();
        ag2 ag2VarC = ev4Var.c(nycVarE);
        ag2VarC.w(e(), 0, xn7VarW.e().a());
        ag2VarC.p(e(), 1, xn7VarW, obj);
        ag2VarC.b(nycVarE);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVarE = e();
        zf2 zf2VarC = om3Var.c(nycVarE);
        Object objS = null;
        String strO = null;
        while (true) {
            int iJ = zf2VarC.j(e());
            if (iJ == -1) {
                if (objS != null) {
                    zf2VarC.b(nycVarE);
                    return objS;
                }
                qc0.o(ub3.i("Polymorphic value has not been read for class ", strO));
                return null;
            }
            if (iJ == 0) {
                strO = zf2VarC.o(e(), iJ);
            } else {
                if (iJ != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (strO == null) {
                        strO = "unknown class";
                    }
                    sb.append(strO);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iJ);
                    throw new yyc(sb.toString());
                }
                if (strO == null) {
                    qc0.j("Cannot read polymorphic value before its type token");
                    return null;
                }
                objS = zf2VarC.s(e(), iJ, mh3.v(this, zf2VarC, strO), null);
            }
        }
    }

    public xn7 f(zf2 zf2Var, String str) {
        hzc hzcVarA = zf2Var.a();
        em7 em7VarH = h();
        hzcVarA.getClass();
        em7VarH.getClass();
        Map map = (Map) ((Map) hzcVarA.e).get(em7VarH);
        xn7 xn7Var = map != null ? (xn7) map.get(str) : null;
        if (!(xn7Var instanceof xn7)) {
            xn7Var = null;
        }
        if (xn7Var != null) {
            return xn7Var;
        }
        Object obj = ((Map) hzcVarA.f).get(em7VarH);
        a26 a26Var = z7f.L(1, obj) ? (a26) obj : null;
        if (a26Var != null) {
            return (xn7) a26Var.d(str);
        }
        return null;
    }

    public xn7 g(ev4 ev4Var, Object obj) {
        xn7 xn7Var;
        obj.getClass();
        hzc hzcVarA = ev4Var.a();
        em7 em7VarH = h();
        hzcVarA.getClass();
        em7VarH.getClass();
        if (em7VarH.D(obj)) {
            Map map = (Map) ((Map) hzcVarA.c).get(em7VarH);
            if (map != null) {
                xn7Var = (xn7) map.get(job.a.b(obj.getClass()));
            } else {
                xn7Var = null;
            }
            xn7 xn7Var2 = xn7Var instanceof xn7 ? xn7Var : null;
            if (xn7Var2 != null) {
                return xn7Var2;
            }
            Object obj2 = ((Map) hzcVarA.d).get(em7VarH);
            a26 a26Var = z7f.L(1, obj2) ? (a26) obj2 : null;
            if (a26Var != null) {
                return (xn7) a26Var.d(obj);
            }
        }
        return null;
    }

    public abstract em7 h();
}

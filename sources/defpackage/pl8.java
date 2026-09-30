package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pl8 implements xn7 {
    public final xn7 a;
    public final xn7 b;
    public final /* synthetic */ int c;
    public final pyc d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pl8(final xn7 xn7Var, final xn7 xn7Var2, int i) {
        this(xn7Var, xn7Var2, (byte) 0);
        this.c = i;
        final int i2 = 0;
        xn7Var.getClass();
        xn7Var2.getClass();
        switch (i) {
            case 1:
                this(xn7Var, xn7Var2, (byte) 0);
                final int i3 = 1;
                this.d = eec.o("kotlin.Pair", new nyc[0], new a26() { // from class: nl8
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        int i4 = i3;
                        wef wefVar = wef.a;
                        xn7 xn7Var3 = xn7Var2;
                        xn7 xn7Var4 = xn7Var;
                        q22 q22Var = (q22) obj;
                        switch (i4) {
                            case 0:
                                q22Var.getClass();
                                q22Var.a("key", xn7Var4.e(), (12 & 8) == 0);
                                q22Var.a("value", xn7Var3.e(), (12 & 8) == 0);
                                break;
                            default:
                                q22Var.getClass();
                                q22Var.a("first", xn7Var4.e(), (12 & 8) == 0);
                                q22Var.a("second", xn7Var3.e(), (12 & 8) == 0);
                                break;
                        }
                        return wefVar;
                    }
                });
                break;
            default:
                this.d = eec.p("kotlin.collections.Map.Entry", g5e.e, new nyc[0], new a26() { // from class: nl8
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        int i4 = i2;
                        wef wefVar = wef.a;
                        xn7 xn7Var3 = xn7Var2;
                        xn7 xn7Var4 = xn7Var;
                        q22 q22Var = (q22) obj;
                        switch (i4) {
                            case 0:
                                q22Var.getClass();
                                q22Var.a("key", xn7Var4.e(), (12 & 8) == 0);
                                q22Var.a("value", xn7Var3.e(), (12 & 8) == 0);
                                break;
                            default:
                                q22Var.getClass();
                                q22Var.a("first", xn7Var4.e(), (12 & 8) == 0);
                                q22Var.a("second", xn7Var3.e(), (12 & 8) == 0);
                                break;
                        }
                        return wefVar;
                    }
                });
                break;
        }
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        Object key;
        Object value;
        ag2 ag2VarC = ev4Var.c(e());
        nyc nycVarE = e();
        xn7 xn7Var = this.a;
        int i = this.c;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                iy9 iy9Var = (iy9) obj;
                iy9Var.getClass();
                key = iy9Var.d();
                break;
        }
        ag2VarC.p(nycVarE, 0, xn7Var, key);
        nyc nycVarE2 = e();
        xn7 xn7Var2 = this.b;
        switch (i) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                iy9 iy9Var2 = (iy9) obj;
                iy9Var2.getClass();
                value = iy9Var2.e();
                break;
        }
        ag2VarC.p(nycVarE2, 1, xn7Var2, value);
        ag2VarC.b(e());
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        Object ol8Var;
        nyc nycVarE = e();
        zf2 zf2VarC = om3Var.c(nycVarE);
        Object obj = y41.o;
        Object objS = obj;
        Object objS2 = objS;
        while (true) {
            int iJ = zf2VarC.j(e());
            if (iJ == -1) {
                if (objS == obj) {
                    throw new yyc("Element 'key' is missing");
                }
                if (objS2 == obj) {
                    throw new yyc("Element 'value' is missing");
                }
                switch (this.c) {
                    case 0:
                        ol8Var = new ol8(objS, objS2);
                        break;
                    default:
                        ol8Var = new iy9(objS, objS2);
                        break;
                }
                zf2VarC.b(nycVarE);
                return ol8Var;
            }
            if (iJ == 0) {
                objS = zf2VarC.s(e(), 0, this.a, null);
            } else {
                if (iJ != 1) {
                    throw new yyc(tec.e(iJ, "Invalid index: "));
                }
                objS2 = zf2VarC.s(e(), 1, this.b, null);
            }
        }
    }

    @Override // defpackage.xn7
    public final nyc e() {
        int i = this.c;
        return this.d;
    }

    public pl8(xn7 xn7Var, xn7 xn7Var2, byte b) {
        this.a = xn7Var;
        this.b = xn7Var2;
    }
}

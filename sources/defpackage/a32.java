package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a32 {
    public static final a32 b = new a32(0);
    public static final a32 c = new a32(1);
    public static final a32 d = new a32(2);
    public final /* synthetic */ int a;

    public /* synthetic */ a32(int i) {
        this.a = i;
    }

    public static String a(y22 y22Var) {
        String strP;
        t99 name = y22Var.getName();
        name.getClass();
        String strQ = rxg.Q(name);
        if (!(y22Var instanceof c8f)) {
            bm3 bm3VarK = y22Var.k();
            bm3VarK.getClass();
            if (bm3VarK instanceof u09) {
                strP = a((y22) bm3VarK);
            } else {
                strP = bm3VarK instanceof kw9 ? rxg.P(((lw9) ((kw9) bm3VarK)).f.a) : null;
            }
            if (strP != null && !strP.equals("")) {
                return strP + '.' + strQ;
            }
        }
        return strQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [bm3, y22] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bm3] */
    /* JADX WARN: Type inference failed for: r2v3, types: [bm3] */
    public final String b(y22 y22Var, jz3 jz3Var) {
        switch (this.a) {
            case 0:
                if (y22Var instanceof c8f) {
                    t99 name = ((c8f) y22Var).getName();
                    name.getClass();
                    return jz3Var.F(name, false);
                }
                ex5 ex5VarF = oz3.f(y22Var);
                ex5VarF.getClass();
                return jz3Var.l(jrb.l(ex5.f(ex5VarF)));
            case 1:
                if (y22Var instanceof c8f) {
                    t99 name2 = ((c8f) y22Var).getName();
                    name2.getClass();
                    return jz3Var.F(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(y22Var.getName());
                    y22Var = y22Var.k();
                } while (y22Var instanceof u09);
                return jrb.l(new n0c(arrayList));
            default:
                return a(y22Var);
        }
    }
}

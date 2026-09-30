package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class he7 {
    public static final Map a;
    public static final LinkedHashMap b;

    static {
        y00 y00Var = y00.TYPE_PARAMETER_BOUNDS;
        y00 y00Var2 = y00.TYPE_USE;
        y00 y00Var3 = y00.FIELD;
        y00 y00Var4 = y00.METHOD_RETURN_TYPE;
        y00 y00Var5 = y00.VALUE_PARAMETER;
        List listI = t72.I(y00Var3, y00Var4, y00Var5, y00Var, y00Var2);
        List listH = t72.H(y00Var5);
        dx5 dx5Var = qj7.a;
        vj9 vj9Var = vj9.c;
        Map mapH = bm8.H(new iy9(dx5Var, new ge7(new dag(vj9Var, false), listI, false, true, true)), new iy9(qj7.b, new ge7(new dag(vj9Var, false), listI, false, true, true)), new iy9(qj7.c, new ge7(new dag(vj9.a, false), listI, 4)));
        a = mapH;
        b = bm8.L(mapH, bm8.H(new iy9(qj7.h, new ge7(new dag(vj9Var, false), listH, 28)), new iy9(qj7.i, new ge7(new dag(vj9.b, false), listH, 28))));
    }
}

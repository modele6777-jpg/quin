package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class je7 {
    public static final rz3 a;
    public static final rz3 b;
    public static final rz3 c;
    public static final HashMap d;

    static {
        ag7 ag7Var = ag7.d;
        rz3 rz3Var = new rz3(ag7Var, 9);
        a = rz3Var;
        cg7 cg7Var = cg7.d;
        rz3 rz3Var2 = new rz3(cg7Var, 10);
        b = rz3Var2;
        bg7 bg7Var = bg7.d;
        rz3 rz3Var3 = new rz3(bg7Var, 11);
        c = rz3Var3;
        HashMap map = new HashMap();
        d = map;
        map.put(ag7Var, rz3Var);
        map.put(cg7Var, rz3Var2);
        map.put(bg7Var, rz3Var3);
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(gm3 gm3Var, bm3 bm3Var) {
        if (gm3Var == null) {
            a(2);
            throw null;
        }
        if (bm3Var == null) {
            a(3);
            throw null;
        }
        kw9 kw9Var = (kw9) oz3.h(gm3Var, kw9.class, false);
        kw9 kw9Var2 = (kw9) oz3.h(bm3Var, kw9.class, false);
        return (kw9Var2 == null || kw9Var == null || !((lw9) kw9Var).f.equals(((lw9) kw9Var2).f)) ? false : true;
    }

    public static boolean c(ejb ejbVar, gm3 gm3Var, bm3 bm3Var) {
        gm3 gm3VarR;
        if (bm3Var == null) {
            a(1);
            throw null;
        }
        if (gm3Var instanceof ea1) {
            gm3VarR = oz3.r((ea1) gm3Var);
        } else {
            int i = oz3.a;
            gm3VarR = gm3Var;
        }
        if (b(gm3VarR, bm3Var)) {
            return true;
        }
        return sz3.c.a(ejbVar, gm3Var, bm3Var);
    }
}

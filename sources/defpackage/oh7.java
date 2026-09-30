package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class oh7 {
    public static final e37 a = xo1.e(p4e.a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final yi7 a(Boolean bool) {
        return bool == null ? qi7.INSTANCE : new yh7(bool, false, null);
    }

    public static final yi7 b(Number number) {
        return number == null ? qi7.INSTANCE : new yh7(number, false, null);
    }

    public static final yi7 c(String str) {
        return str == null ? qi7.INSTANCE : new yh7(str, true, null);
    }

    public static final void d(nh7 nh7Var, String str) {
        throw new IllegalArgumentException("Element " + job.a.b(nh7Var.getClass()) + " is not a " + str);
    }

    public static final boolean e(yi7 yi7Var) {
        Boolean boolB = n4e.b(yi7Var.c());
        if (boolB != null) {
            return boolB.booleanValue();
        }
        throw new IllegalStateException(yi7Var + " does not represent a Boolean");
    }

    public static final int f(yi7 yi7Var) {
        try {
            long j = j(yi7Var);
            if (-2147483648L <= j && j <= 2147483647L) {
                return (int) j;
            }
            throw new NumberFormatException(yi7Var.c() + " is not an Int");
        } catch (lh7 e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final Integer g(yi7 yi7Var) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(j(yi7Var));
        } catch (lh7 unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final ti7 h(nh7 nh7Var) {
        nh7Var.getClass();
        ti7 ti7Var = nh7Var instanceof ti7 ? (ti7) nh7Var : null;
        if (ti7Var != null) {
            return ti7Var;
        }
        d(nh7Var, "JsonObject");
        throw null;
    }

    public static final yi7 i(nh7 nh7Var) {
        yi7 yi7Var = nh7Var instanceof yi7 ? (yi7) nh7Var : null;
        if (yi7Var != null) {
            return yi7Var;
        }
        d(nh7Var, "JsonPrimitive");
        throw null;
    }

    public static final long j(yi7 yi7Var) {
        a80 a80VarF = eec.f(wg7.d, yi7Var.c());
        String str = (String) a80VarF.g;
        long j = a80VarF.j();
        if (a80VarF.g() == 10) {
            return j;
        }
        int i = a80VarF.b;
        int i2 = i > 0 ? i - 1 : i;
        a80.n(a80VarF, ib8.j("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }
}

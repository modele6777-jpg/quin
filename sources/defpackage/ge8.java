package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class ge8 {
    public static final String d;
    public static final yd8 e;
    public final mjd a;
    public final ndb b;
    public final String c;

    static {
        String canonicalName = ge8.class.getCanonicalName();
        canonicalName.getClass();
        int iT = v4e.T(canonicalName, ".", 0, 6);
        d = iT == -1 ? "" : canonicalName.substring(0, iT);
        e = new yd8("NO_LOCKS", hj6.H0);
    }

    public ge8(String str) {
        this(str, new ssg(12, new ReentrantLock()));
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            if (!stackTrace[i].getClassName().startsWith(d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i++;
        }
        i = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    public final ee8 a(x16 x16Var) {
        return new ee8(this, x16Var);
    }

    public final be8 b(a26 a26Var) {
        return new be8(this, new ConcurrentHashMap(3, 1.0f, 2), a26Var, 1);
    }

    public final mz0 c(a26 a26Var) {
        return new mz0(this, new ConcurrentHashMap(3, 1.0f, 2), a26Var, 3);
    }

    public pk1 d(Object obj, String str) {
        StringBuilder sbQ = kv2.q("Recursion detected ", str);
        sbQ.append(obj == null ? "" : ks0.j(obj, "on input: "));
        sbQ.append(" under ");
        sbQ.append(this);
        AssertionError assertionError = new AssertionError(sbQ.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return ks0.l(sb, this.c, ")");
    }

    public ge8(String str, mjd mjdVar) {
        ndb ndbVar = ndb.a1;
        this.a = mjdVar;
        this.b = ndbVar;
        this.c = str;
    }
}

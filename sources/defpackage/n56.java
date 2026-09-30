package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n56 implements j0a {
    static {
        if (n85.a == null) {
            synchronized (n85.class) {
                try {
                    if (n85.a == null) {
                        Class cls = k85.a;
                        n85 n85Var = null;
                        if (cls != null) {
                            try {
                                n85Var = (n85) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (n85Var == null) {
                            n85Var = n85.b;
                        }
                        n85.a = n85Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

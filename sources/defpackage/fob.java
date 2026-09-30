package defpackage;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fob implements x16 {
    public static final yx4 c = new yx4(22);
    public final x16 a;
    public volatile SoftReference b;

    public fob(Object obj, x16 x16Var) {
        if (x16Var == null) {
            qc0.j("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            throw null;
        }
        this.b = null;
        this.a = x16Var;
        if (obj != null) {
            this.b = new SoftReference(obj);
        }
    }

    @Override // defpackage.x16
    public final Object invoke() {
        Object obj;
        Object obj2 = c;
        SoftReference softReference = this.b;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.a.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.b = new SoftReference(obj2);
        return objInvoke;
    }
}

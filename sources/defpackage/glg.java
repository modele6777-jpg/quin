package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class glg {
    public static final String[] a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    public static final ilg b;

    static {
        ilg ilgVar;
        for (int i = 0; i < 2; i++) {
            ilgVar = null;
            try {
                ilgVar = (ilg) Class.forName(a[i]).asSubclass(ilg.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (ilgVar != null) {
                b = ilgVar;
            }
        }
        ilgVar = new ilg();
        b = ilgVar;
    }
}

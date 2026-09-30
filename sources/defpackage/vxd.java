package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class vxd {
    public static final /* synthetic */ int a = 0;

    static {
        Object dzbVar;
        Object dzbVar2;
        Exception exc = new Exception();
        String simpleName = feg.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            dzbVar = pt0.class.getCanonicalName();
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (ezb.a(dzbVar) != null) {
            dzbVar = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            dzbVar2 = vxd.class.getCanonicalName();
        } catch (Throwable th2) {
            dzbVar2 = new dzb(th2);
        }
        if (ezb.a(dzbVar2) != null) {
            dzbVar2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}

package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Liz5;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljz5;", "callbackName", "Ljz5;", "a", "()Ljz5;", "", "cause", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class iz5 extends RuntimeException {
    private final jz5 callbackName;
    private final Throwable cause;

    public iz5(jz5 jz5Var, Throwable th) {
        super(th);
        this.callbackName = jz5Var;
        this.cause = th;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jz5 getCallbackName() {
        return this.callbackName;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}

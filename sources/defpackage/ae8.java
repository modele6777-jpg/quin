package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ae8 extends de8 implements xg9 {
    public volatile vea d;
    public final /* synthetic */ x e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae8(ge8 ge8Var, j5 j5Var, x xVar) {
        super(ge8Var, j5Var);
        this.e = xVar;
        if (ge8Var == null) {
            g(0);
            throw null;
        }
        this.d = null;
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i != 2 ? 2 : 3];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void g(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // defpackage.de8
    public final void e(Object obj) {
        this.d = new vea(obj);
        try {
            if (obj == null) {
                a(2);
                throw null;
            }
            this.e.d(obj);
            this.d = null;
        } catch (Throwable th) {
            this.d = null;
            throw th;
        }
    }

    @Override // defpackage.de8
    public final pk1 f(boolean z) {
        return new pk1(new l5(t72.H(sy4.d)), false, 4);
    }

    @Override // defpackage.de8, defpackage.x16
    public final Object invoke() throws Throwable {
        Object objInvoke;
        vea veaVar = this.d;
        if (veaVar == null || ((Thread) veaVar.c) != Thread.currentThread()) {
            objInvoke = super.invoke();
        } else if (((Thread) veaVar.c) == Thread.currentThread()) {
            objInvoke = veaVar.b;
        } else {
            qc0.p("No value in this thread (hasValue should be checked before)");
            objInvoke = null;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        g(2);
        throw null;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class de8 implements x16 {
    public final ge8 a;
    public final x16 b;
    public volatile Object c;

    public de8(ge8 ge8Var, x16 x16Var) {
        if (ge8Var == null) {
            a(0);
            throw null;
        }
        this.c = fe8.a;
        this.a = ge8Var;
        this.b = x16Var;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i == 2 || i == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 2) {
            objArr[1] = "recursionDetected";
        } else if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i != 2 && i != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public pk1 f(boolean z) {
        pk1 pk1VarD = this.a.d(null, "in a lazy value");
        if (pk1VarD != null) {
            return pk1VarD;
        }
        a(2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    @Override // defpackage.x16
    public Object invoke() throws Throwable {
        Object objInvoke;
        pk1 pk1VarF;
        fe8 fe8Var = fe8.c;
        fe8 fe8Var2 = fe8.b;
        Object obj = this.c;
        if (!(obj instanceof fe8)) {
            ncg.a(obj);
            return obj;
        }
        this.a.a.lock();
        try {
            Object obj2 = this.c;
            if (!(obj2 instanceof fe8)) {
                ncg.a(obj2);
                this.a.a.unlock();
                return obj2;
            }
            if (obj2 == fe8Var2) {
                this.c = fe8Var;
                pk1 pk1VarF2 = f(true);
                if (!pk1VarF2.b) {
                    objInvoke = pk1VarF2.c;
                } else if (obj2 == fe8Var) {
                    pk1VarF = f(false);
                    if (pk1VarF.b) {
                        this.c = fe8Var2;
                        try {
                            objInvoke = this.b.invoke();
                            e(objInvoke);
                            this.c = objInvoke;
                        } catch (Throwable th) {
                            if (z5c.C(th)) {
                                this.c = fe8.a;
                                throw th;
                            }
                            if (this.c == fe8Var2) {
                                this.c = new mcg(th);
                            }
                            this.a.b.getClass();
                            throw th;
                        }
                    } else {
                        objInvoke = pk1VarF.c;
                    }
                } else {
                    this.c = fe8Var2;
                    objInvoke = this.b.invoke();
                    e(objInvoke);
                    this.c = objInvoke;
                }
            } else if (obj2 == fe8Var) {
                pk1VarF = f(false);
                if (pk1VarF.b) {
                    objInvoke = pk1VarF.c;
                } else {
                    this.c = fe8Var2;
                    objInvoke = this.b.invoke();
                    e(objInvoke);
                    this.c = objInvoke;
                }
            } else {
                this.c = fe8Var2;
                objInvoke = this.b.invoke();
                e(objInvoke);
                this.c = objInvoke;
            }
            this.a.a.unlock();
            return objInvoke;
        } catch (Throwable th2) {
            this.a.a.unlock();
            throw th2;
        }
    }

    public void e(Object obj) {
    }
}

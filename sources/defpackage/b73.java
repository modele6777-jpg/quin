package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b73 {
    public final a26 a;
    public final l26 b;
    public final x16 c;
    public final x16 d;
    public final x16 e;
    public final f99 f = new f99();

    public b73(a26 a26Var, l26 l26Var, x16 x16Var, x16 x16Var2, x16 x16Var3) {
        this.a = a26Var;
        this.b = l26Var;
        this.c = x16Var;
        this.d = x16Var2;
        this.e = x16Var3;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a0 A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:21:0x0048, B:40:0x009a, B:42:0x00a0, B:45:0x00a6), top: B:56:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6 A[Catch: all -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:21:0x0048, B:40:0x009a, B:42:0x00a0, B:45:0x00a6), top: B:56:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) throws Throwable {
        a73 a73Var;
        d99 d99Var;
        d99 d99Var2;
        String str;
        d99 d99Var3;
        l26 l26Var;
        if (zn2Var instanceof a73) {
            a73Var = (a73) zn2Var;
            int i = a73Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                a73Var.label = i - Integer.MIN_VALUE;
            } else {
                a73Var = new a73(this, zn2Var);
            }
        } else {
            a73Var = new a73(this, zn2Var);
        }
        Object obj = a73Var.result;
        int i2 = a73Var.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                d99Var = this.f;
                a73Var.L$0 = d99Var;
                a73Var.label = 1;
                if (d99Var.b(a73Var) != bw2Var) {
                }
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d99Var2 = (d99) a73Var.L$0;
                    try {
                        jzb.q(obj);
                        this.d.invoke();
                        Boolean bool = Boolean.TRUE;
                        d99Var2.h(null);
                        return bool;
                    } catch (Throwable th) {
                        th = th;
                        d99Var2.h(null);
                        throw th;
                    }
                }
                str = (String) a73Var.L$1;
                d99Var3 = (d99) a73Var.L$0;
                try {
                    jzb.q(obj);
                    if (pa7.t(obj, str)) {
                        Boolean bool2 = Boolean.FALSE;
                        d99Var3.h(null);
                        return bool2;
                    }
                    l26Var = this.b;
                    a73Var.L$0 = d99Var3;
                    a73Var.L$1 = null;
                    a73Var.label = 3;
                    if (l26Var.z(str, a73Var) != bw2Var) {
                        d99Var2 = d99Var3;
                        this.d.invoke();
                        Boolean bool3 = Boolean.TRUE;
                        d99Var2.h(null);
                        return bool3;
                    }
                    return bw2Var;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2 = d99Var3;
                    d99Var2.h(null);
                    throw th;
                }
            }
            d99 d99Var4 = (d99) a73Var.L$0;
            jzb.q(obj);
            d99Var = d99Var4;
            if (!((Boolean) this.e.invoke()).booleanValue()) {
                Boolean bool4 = Boolean.FALSE;
                d99Var.h(null);
                return bool4;
            }
            str = (String) this.c.invoke();
            a26 a26Var = this.a;
            a73Var.L$0 = d99Var;
            a73Var.L$1 = str;
            a73Var.label = 2;
            Object objD = a26Var.d(a73Var);
            if (objD != bw2Var) {
                d99Var3 = d99Var;
                obj = objD;
                if (pa7.t(obj, str)) {
                    Boolean bool5 = Boolean.FALSE;
                    d99Var3.h(null);
                    return bool5;
                }
                l26Var = this.b;
                a73Var.L$0 = d99Var3;
                a73Var.L$1 = null;
                a73Var.label = 3;
                if (l26Var.z(str, a73Var) != bw2Var) {
                    d99Var2 = d99Var3;
                    this.d.invoke();
                    Boolean bool6 = Boolean.TRUE;
                    d99Var2.h(null);
                    return bool6;
                }
            }
            return bw2Var;
        } catch (Throwable th3) {
            th = th3;
            d99Var2 = d99Var;
            d99Var2.h(null);
            throw th;
        }
    }
}

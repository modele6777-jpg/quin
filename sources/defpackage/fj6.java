package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.WhereDidYouHear;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fj6 extends gbe implements l26 {
    final /* synthetic */ a26 $block;
    final /* synthetic */ List<String> $quinSource;
    final /* synthetic */ Set<WhereDidYouHear> $submittedItems;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ gj6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj6(gj6 gj6Var, List list, a26 a26Var, Set set, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = gj6Var;
        this.$quinSource = list;
        this.$block = a26Var;
        this.$submittedItems = set;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fj6(this.this$0, this.$quinSource, this.$block, this.$submittedItems, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00cf A[Catch: all -> 0x00dd, Exception -> 0x00df, CancellationException -> 0x00e2, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00e2, blocks: (B:43:0x00c7, B:45:0x00cf, B:58:0x00e6), top: B:90:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x0120  */
    /* JADX WARN: Code duplicated, block: B:76:0x0122  */
    /* JADX WARN: Code duplicated, block: B:82:0x012c  */
    /* JADX WARN: Code duplicated, block: B:83:0x012e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, owa] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        ej6 ej6Var;
        ej6 ej6Var2;
        ?? r18;
        Object objA;
        ?? r0;
        ej6 ej6Var3;
        ej6 ej6Var4;
        int i;
        gpf gpfVar;
        List<String> list;
        v9 v9Var;
        ?? owaVar = this.label;
        ej6 ej6Var5 = ej6.a;
        ej6 ej6Var6 = ej6.c;
        wef wefVar = wef.a;
        int i2 = 0;
        try {
            if (owaVar != 0) {
                try {
                    if (owaVar == 1) {
                        i2 = this.I$0;
                        owa owaVar2 = (owa) this.L$0;
                        jzb.q(obj);
                        r0 = owaVar2;
                        ej6Var = ej6Var5;
                        owaVar = r0;
                        this.$block.d(this.$submittedItems);
                        this.this$0.d = ej6Var6;
                        return wefVar;
                    }
                    if (owaVar != 2) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = this.I$0;
                    owa owaVar3 = (owa) this.L$0;
                    jzb.q(obj);
                    r18 = owaVar3;
                    ej6Var = ej6Var5;
                    objA = obj;
                    try {
                        try {
                            if (((Boolean) objA).booleanValue()) {
                                jcc.l(r18);
                                gj6 gj6Var = this.this$0;
                                if (i2 != 0) {
                                    ej6Var4 = ej6Var6;
                                } else {
                                    ej6Var4 = ej6Var;
                                }
                                gj6Var.d = ej6Var4;
                                return wefVar;
                            }
                            owaVar = r18;
                            try {
                                this.$block.d(this.$submittedItems);
                                this.this$0.d = ej6Var6;
                                return wefVar;
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            owaVar = r18;
                        }
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (CancellationException e2) {
                    e = e2;
                    throw e;
                } catch (Exception unused3) {
                    ej6Var = ej6Var5;
                } catch (Throwable th) {
                    th = th;
                    ej6Var = ej6Var5;
                    gj6 gj6Var2 = this.this$0;
                    if (i2 != 0) {
                        ej6Var2 = ej6Var6;
                    } else {
                        ej6Var2 = ej6Var;
                    }
                    gj6Var2.d = ej6Var2;
                    throw th;
                }
            } else {
                jzb.q(obj);
                owaVar = new owa();
                try {
                    try {
                        ca2.a.getClass();
                        boolean z = ca2.c;
                        bw2 bw2Var = bw2.a;
                        try {
                            try {
                                if (z) {
                                    try {
                                        if (!((mo3) this.this$0.c).b()) {
                                            List<String> list2 = this.$quinSource;
                                            this.L$0 = owaVar;
                                            this.I$0 = 0;
                                            this.label = 1;
                                            if (ypa.a.a(new e8a(new c8a(list2, null), null), this) == bw2Var) {
                                                return bw2Var;
                                            }
                                            i2 = 0;
                                            r0 = owaVar;
                                            ej6Var = ej6Var5;
                                            owaVar = r0;
                                            this.$block.d(this.$submittedItems);
                                            this.this$0.d = ej6Var6;
                                            return wefVar;
                                        }
                                    } catch (CancellationException e3) {
                                        e = e3;
                                        throw e;
                                    } catch (Exception unused4) {
                                        i2 = 0;
                                        ej6Var = ej6Var5;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        i2 = 0;
                                        ej6Var = ej6Var5;
                                        gj6 gj6Var3 = this.this$0;
                                        if (i2 != 0) {
                                            ej6Var2 = ej6Var6;
                                        } else {
                                            ej6Var2 = ej6Var;
                                        }
                                        gj6Var3.d = ej6Var2;
                                        throw th;
                                    }
                                }
                                objA = gpf.a(gpfVar, null, null, null, null, list, null, null, null, null, v9Var, this, 3967);
                                if (objA == bw2Var) {
                                    return bw2Var;
                                }
                                i2 = 0;
                                r18 = r18;
                                if (((Boolean) objA).booleanValue()) {
                                    owaVar = r18;
                                    this.$block.d(this.$submittedItems);
                                    this.this$0.d = ej6Var6;
                                    return wefVar;
                                }
                                jcc.l(r18);
                                gj6 gj6Var4 = this.this$0;
                                if (i2 != 0) {
                                    ej6Var4 = ej6Var6;
                                } else {
                                    ej6Var4 = ej6Var;
                                }
                                gj6Var4.d = ej6Var4;
                                return wefVar;
                            } catch (CancellationException e4) {
                                e = e4;
                                throw e;
                            } catch (Exception unused5) {
                                i2 = i;
                                owaVar = r18;
                                jcc.l(owaVar);
                                gj6 gj6Var5 = this.this$0;
                                if (i2 != 0) {
                                    ej6Var3 = ej6Var6;
                                } else {
                                    ej6Var3 = ej6Var;
                                }
                                gj6Var5.d = ej6Var3;
                                return wefVar;
                            } catch (Throwable th3) {
                                th = th3;
                                i2 = i;
                                gj6 gj6Var6 = this.this$0;
                                if (i2 != 0) {
                                    ej6Var2 = ej6Var6;
                                } else {
                                    ej6Var2 = ej6Var;
                                }
                                gj6Var6.d = ej6Var2;
                                throw th;
                            }
                            gpfVar = this.this$0.b;
                            list = this.$quinSource;
                            v9Var = new v9(owaVar, 4);
                            this.L$0 = owaVar;
                            this.I$0 = 0;
                            this.label = 2;
                            r18 = owaVar;
                            ej6Var = ej6Var5;
                            i = 0;
                        } catch (Exception unused6) {
                            ej6Var = ej6Var5;
                            i2 = 0;
                        }
                    } catch (CancellationException e5) {
                        e = e5;
                        i = 0;
                    } catch (Throwable th4) {
                        th = th4;
                        i = 0;
                        ej6Var = ej6Var5;
                    }
                } catch (Exception unused7) {
                    r18 = owaVar;
                    i = 0;
                    ej6Var = ej6Var5;
                }
            }
            jcc.l(owaVar);
            gj6 gj6Var7 = this.this$0;
            if (i2 != 0) {
                ej6Var3 = ej6Var6;
            } else {
                ej6Var3 = ej6Var;
            }
            gj6Var7.d = ej6Var3;
            return wefVar;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fj6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

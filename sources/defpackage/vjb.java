package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vjb extends gbe implements l26 {
    final /* synthetic */ n26 $block;
    final /* synthetic */ z09 $parentFrameClock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ xjb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vjb(xjb xjbVar, n26 n26Var, z09 z09Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = xjbVar;
        this.$block = n26Var;
        this.$parentFrameClock = z09Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        vjb vjbVar = new vjb(this.this$0, this.$block, this.$parentFrameClock, xn2Var);
        vjbVar.L$0 = obj;
        return vjbVar;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0124 A[EDGE_INSN: B:126:0x0124->B:77:0x0124 BREAK  A[LOOP:0: B:73:0x0110->B:128:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0164 A[EDGE_INSN: B:129:0x0164->B:101:0x0164 BREAK  A[LOOP:1: B:96:0x014f->B:131:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9 A[Catch: all -> 0x00fc, TryCatch #6 {all -> 0x00fc, blocks: (B:63:0x00f5, B:65:0x00f9, B:68:0x00fe, B:70:0x0104), top: B:124:0x00f5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0104 A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #6 {all -> 0x00fc, blocks: (B:63:0x00f5, B:65:0x00f9, B:68:0x00fe, B:70:0x0104), top: B:124:0x00f5 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x011e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0138 A[Catch: all -> 0x013b, TryCatch #4 {all -> 0x013b, blocks: (B:86:0x0134, B:88:0x0138, B:91:0x013d, B:93:0x0143), top: B:121:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0143 A[Catch: all -> 0x013b, TRY_LEAVE, TryCatch #4 {all -> 0x013b, blocks: (B:86:0x0134, B:88:0x0138, B:91:0x013d, B:93:0x0143), top: B:121:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x015d  */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        dg7 dg7VarZ;
        s0e s0eVar;
        y9a y9aVar;
        y9a y9aVarD;
        hrd hrdVar;
        Throwable th;
        List listH;
        pjb pjbVar;
        xjb xjbVar;
        y25 y25Var;
        s0e s0eVar2;
        y9a y9aVar2;
        y9a y9aVarE;
        xjb xjbVar2;
        y25 y25Var2;
        s0e s0eVar3;
        y9a y9aVar3;
        y9a y9aVarE2;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hrdVar = (hrd) this.L$1;
            dg7VarZ = (dg7) this.L$0;
            try {
                jzb.q(obj);
                hrdVar.a();
                xjbVar2 = this.this$0;
                synchronized (xjbVar2.c) {
                    try {
                        if (xjbVar2.d == dg7VarZ) {
                            xjbVar2.d = null;
                        }
                        if (xjbVar2.C() != null) {
                            wf2.a("called outside of runRecomposeAndApplyChanges");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                s0e s0eVar4 = xjb.z;
                y25Var2 = this.this$0.y;
                do {
                    s0eVar3 = xjb.z;
                    y9aVar3 = (y9a) s0eVar3.getValue();
                    y9aVarE2 = y9aVar3.e(y25Var2);
                    if (y9aVar3 != y9aVarE2) {
                        break;
                    }
                } while (!s0eVar3.l(y9aVar3, y9aVarE2));
                return wef.a;
            } catch (Throwable th3) {
                th = th3;
                hrdVar.a();
                xjbVar = this.this$0;
                synchronized (xjbVar.c) {
                    try {
                        if (xjbVar.d == dg7VarZ) {
                            xjbVar.d = null;
                        }
                        if (xjbVar.C() != null) {
                            wf2.a("called outside of runRecomposeAndApplyChanges");
                        }
                        s0e s0eVar5 = xjb.z;
                        y25Var = this.this$0.y;
                        do {
                            s0eVar2 = xjb.z;
                            y9aVar2 = (y9a) s0eVar2.getValue();
                            y9aVarE = y9aVar2.e(y25Var);
                            if (y9aVar2 != y9aVarE) {
                                break;
                            }
                        } while (!s0eVar2.l(y9aVar2, y9aVarE));
                        throw th;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
        jzb.q(obj);
        dg7VarZ = tq.z(((aw2) this.L$0).getCoroutineContext());
        xjb xjbVar3 = this.this$0;
        s0e s0eVar6 = xjb.z;
        synchronized (xjbVar3.c) {
            Throwable th5 = xjbVar3.e;
            if (th5 != null) {
                throw th5;
            }
            if (((sjb) xjbVar3.u.getValue()).compareTo(sjb.b) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (xjbVar3.d != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            xjbVar3.d = dg7VarZ;
            if (xjbVar3.C() != null) {
                wf2.a("called outside of runRecomposeAndApplyChanges");
            }
        }
        wf8 wf8Var = new wf8(13, this.this$0);
        qrd.b(qrd.a);
        synchronized (qrd.c) {
            qrd.h = s72.R0(qrd.h, wf8Var);
        }
        hrd hrdVar2 = new hrd(wf8Var);
        y25 y25Var3 = this.this$0.y;
        do {
            s0eVar = xjb.z;
            y9aVar = (y9a) s0eVar.getValue();
            y9aVarD = y9aVar.d(y25Var3);
            if (y9aVar == y9aVarD) {
                break;
            }
        } while (!s0eVar.l(y9aVar, y9aVarD));
        try {
            xjb xjbVar4 = this.this$0;
            synchronized (xjbVar4.c) {
                listH = xjbVar4.H();
            }
            int size = listH.size();
            for (int i2 = 0; i2 < size; i2++) {
                for (Object obj2 : ((rg2) listH.get(i2)).f.c) {
                    ojb ojbVar = obj2 instanceof ojb ? (ojb) obj2 : null;
                    if (ojbVar != null && (pjbVar = ojbVar.a) != null) {
                        pjbVar.o(ojbVar, null);
                    }
                }
            }
            ujb ujbVar = new ujb(this.$block, this.$parentFrameClock, null);
            this.L$0 = dg7VarZ;
            this.L$1 = hrdVar2;
            this.label = 1;
            if (jgb.O(ujbVar, this) == bw2Var) {
                return bw2Var;
            }
            hrdVar = hrdVar2;
            hrdVar.a();
            xjbVar2 = this.this$0;
            synchronized (xjbVar2.c) {
                if (xjbVar2.d == dg7VarZ) {
                    xjbVar2.d = null;
                }
                if (xjbVar2.C() != null) {
                    wf2.a("called outside of runRecomposeAndApplyChanges");
                }
                s0e s0eVar7 = xjb.z;
                y25Var2 = this.this$0.y;
                do {
                    s0eVar3 = xjb.z;
                    y9aVar3 = (y9a) s0eVar3.getValue();
                    y9aVarE2 = y9aVar3.e(y25Var2);
                    if (y9aVar3 != y9aVarE2) {
                        break;
                        break;
                    }
                } while (!s0eVar3.l(y9aVar3, y9aVarE2));
                return wef.a;
            }
        } catch (Throwable th6) {
            hrdVar = hrdVar2;
            th = th6;
            hrdVar.a();
            xjbVar = this.this$0;
            synchronized (xjbVar.c) {
                if (xjbVar.d == dg7VarZ) {
                    xjbVar.d = null;
                }
                if (xjbVar.C() != null) {
                    wf2.a("called outside of runRecomposeAndApplyChanges");
                }
            }
            s0e s0eVar8 = xjb.z;
            y25Var = this.this$0.y;
            do {
                s0eVar2 = xjb.z;
                y9aVar2 = (y9a) s0eVar2.getValue();
                y9aVarE = y9aVar2.e(y25Var);
                if (y9aVar2 != y9aVarE) {
                    break;
                    break;
                }
            } while (!s0eVar2.l(y9aVar2, y9aVarE));
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((vjb) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

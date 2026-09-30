package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bj9 extends gbe implements l26 {
    final /* synthetic */ boolean $enabled;
    int I$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ gj9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj9(boolean z, gj9 gj9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$enabled = z;
        this.this$0 = gj9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new bj9(this.$enabled, this.this$0, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x011d  */
    /* JADX WARN: Code duplicated, block: B:47:0x013f  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a6 A[LOOP:0: B:51:0x015d->B:58:0x01a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0185 A[EDGE_INSN: B:71:0x0185->B:53:0x0185 BREAK  A[LOOP:0: B:51:0x015d->B:58:0x01a6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        boolean zBooleanValue;
        xn2 xn2Var;
        bw2 bw2Var;
        gpf gpfVar;
        Boolean boolValueOf;
        boolean z;
        Object objA;
        ?? BooleanValue;
        boolean z2;
        Boolean boolValueOf2;
        isa isaVar;
        o9 o9Var;
        Boolean boolValueOf3;
        ?? r0;
        boolean z3;
        s0e s0eVar;
        Object value;
        boolean z4;
        wg6 wg6Var;
        zi9 zi9Var;
        bj9 bj9Var = this;
        int i = bj9Var.label;
        char c = 5;
        char c2 = 4;
        xn2 xn2Var2 = null;
        bw2 bw2Var2 = bw2.a;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        boolean z5 = bj9Var.Z$0;
                        jzb.q(obj);
                        zBooleanValue = z5;
                    } else if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                int i2 = bj9Var.I$0;
                                z2 = bj9Var.Z$0;
                                jzb.q(obj);
                                xn2Var = null;
                                bw2Var = bw2Var2;
                                r0 = i2;
                                r0 = BooleanValue;
                                z3 = z2;
                                s0eVar = bj9Var.this$0.e;
                                while (true) {
                                    value = s0eVar.getValue();
                                    z4 = z3;
                                    if (s0eVar.l(value, qi9.a((qi9) value, false, false, 0, 0, false, false, 0, 0, false, z3, 511))) {
                                        break;
                                    }
                                    z3 = z4;
                                }
                                js3 js3Var = ga4.a;
                                wg6Var = mk8.a.f;
                                zi9Var = new zi9(2, xn2Var);
                                bj9Var.L$0 = xn2Var;
                                bj9Var.L$1 = xn2Var;
                                bj9Var.Z$0 = z4;
                                bj9Var.I$0 = r0;
                                bj9Var.label = 5;
                                if (ynb.p0(wg6Var, zi9Var, bj9Var) == bw2Var) {
                                    return bw2Var;
                                }
                            } else if (i != 5) {
                                qc0.p("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        jzb.q(obj);
                    } else {
                        zBooleanValue = bj9Var.Z$0;
                        try {
                            jzb.q(obj);
                            objA = obj;
                            xn2Var = null;
                            bw2Var = bw2Var2;
                            try {
                                BooleanValue = ((Boolean) objA).booleanValue();
                            } catch (Exception e) {
                                e = e;
                                bj9Var.this$0.d().c("Failed to sync optOutAllServerPush", e);
                                BooleanValue = 0;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            xn2Var = null;
                            bw2Var = bw2Var2;
                            bj9Var.this$0.d().c("Failed to sync optOutAllServerPush", e);
                            BooleanValue = 0;
                            z2 = zBooleanValue;
                            if (BooleanValue != 0) {
                                o9Var = bj9Var.this$0.d;
                                boolValueOf3 = Boolean.valueOf(!bj9Var.$enabled);
                                bj9Var.L$0 = xn2Var;
                                bj9Var.L$1 = xn2Var;
                                bj9Var.Z$0 = z2;
                                bj9Var.I$0 = BooleanValue;
                                bj9Var.label = 3;
                                if (o9.i(o9Var, boolValueOf3, null, null, bj9Var, 6) == bw2Var) {
                                    return bw2Var;
                                }
                            } else {
                                hs3 hs3Var = xqa.W0;
                                boolValueOf2 = Boolean.valueOf(z2);
                                isaVar = hs3Var.a;
                                bj9Var.L$0 = xn2Var;
                                bj9Var.L$1 = xn2Var;
                                bj9Var.Z$0 = z2;
                                bj9Var.I$0 = BooleanValue;
                                bj9Var.label = 4;
                                if (bsa.n(isaVar, boolValueOf2, bj9Var) == bw2Var) {
                                    r0 = BooleanValue;
                                    return bw2Var;
                                }
                                r0 = BooleanValue;
                                z3 = z2;
                                s0eVar = bj9Var.this$0.e;
                                while (true) {
                                    value = s0eVar.getValue();
                                    z4 = z3;
                                    if (s0eVar.l(value, qi9.a((qi9) value, false, false, 0, 0, false, false, 0, 0, false, z3, 511))) {
                                        break;
                                        break;
                                    }
                                    z3 = z4;
                                }
                                js3 js3Var2 = ga4.a;
                                wg6Var = mk8.a.f;
                                zi9Var = new zi9(2, xn2Var);
                                bj9Var.L$0 = xn2Var;
                                bj9Var.L$1 = xn2Var;
                                bj9Var.Z$0 = z4;
                                bj9Var.I$0 = r0;
                                bj9Var.label = 5;
                                if (ynb.p0(wg6Var, zi9Var, bj9Var) == bw2Var) {
                                    return bw2Var;
                                }
                            }
                            return wef.a;
                        }
                        z2 = zBooleanValue;
                        if (BooleanValue != 0) {
                            o9Var = bj9Var.this$0.d;
                            boolValueOf3 = Boolean.valueOf(!bj9Var.$enabled);
                            bj9Var.L$0 = xn2Var;
                            bj9Var.L$1 = xn2Var;
                            bj9Var.Z$0 = z2;
                            bj9Var.I$0 = BooleanValue;
                            bj9Var.label = 3;
                            if (o9.i(o9Var, boolValueOf3, null, null, bj9Var, 6) == bw2Var) {
                                return bw2Var;
                            }
                        } else {
                            hs3 hs3Var2 = xqa.W0;
                            boolValueOf2 = Boolean.valueOf(z2);
                            isaVar = hs3Var2.a;
                            bj9Var.L$0 = xn2Var;
                            bj9Var.L$1 = xn2Var;
                            bj9Var.Z$0 = z2;
                            bj9Var.I$0 = BooleanValue;
                            bj9Var.label = 4;
                            if (bsa.n(isaVar, boolValueOf2, bj9Var) == bw2Var) {
                                r0 = BooleanValue;
                                return bw2Var;
                            }
                            r0 = BooleanValue;
                            z3 = z2;
                            s0eVar = bj9Var.this$0.e;
                            while (true) {
                                value = s0eVar.getValue();
                                z4 = z3;
                                if (s0eVar.l(value, qi9.a((qi9) value, false, false, 0, 0, false, false, 0, 0, false, z3, 511))) {
                                    break;
                                    break;
                                }
                                z3 = z4;
                            }
                            js3 js3Var3 = ga4.a;
                            wg6Var = mk8.a.f;
                            zi9Var = new zi9(2, xn2Var);
                            bj9Var.L$0 = xn2Var;
                            bj9Var.L$1 = xn2Var;
                            bj9Var.Z$0 = z4;
                            bj9Var.I$0 = r0;
                            bj9Var.label = 5;
                            if (ynb.p0(wg6Var, zi9Var, bj9Var) == bw2Var) {
                                return bw2Var;
                            }
                        }
                    }
                    return wef.a;
                }
                jzb.q(obj);
                hs3 hs3Var3 = xqa.W0;
                zBooleanValue = ((Boolean) z5c.I(nu4.a, new aj9(hs3Var3.a, hs3Var3.b, null))).booleanValue();
                Boolean boolValueOf4 = Boolean.valueOf(bj9Var.$enabled);
                isa isaVar2 = hs3Var3.a;
                bj9Var.L$0 = null;
                bj9Var.L$1 = null;
                bj9Var.Z$0 = zBooleanValue;
                bj9Var.label = 1;
                if (bsa.n(isaVar2, boolValueOf4, bj9Var) == bw2Var2) {
                    return bw2Var2;
                }
                objA = gpf.a(gpfVar, null, null, null, null, null, null, boolValueOf, null, null, null, this, 7679);
                bj9Var = this;
                if (objA == bw2Var) {
                    return bw2Var;
                }
                zBooleanValue = z;
                BooleanValue = ((Boolean) objA).booleanValue();
                z2 = zBooleanValue;
                if (BooleanValue != 0) {
                    o9Var = bj9Var.this$0.d;
                    boolValueOf3 = Boolean.valueOf(!bj9Var.$enabled);
                    bj9Var.L$0 = xn2Var;
                    bj9Var.L$1 = xn2Var;
                    bj9Var.Z$0 = z2;
                    bj9Var.I$0 = BooleanValue;
                    bj9Var.label = 3;
                    if (o9.i(o9Var, boolValueOf3, null, null, bj9Var, 6) == bw2Var) {
                        return bw2Var;
                    }
                } else {
                    hs3 hs3Var4 = xqa.W0;
                    boolValueOf2 = Boolean.valueOf(z2);
                    isaVar = hs3Var4.a;
                    bj9Var.L$0 = xn2Var;
                    bj9Var.L$1 = xn2Var;
                    bj9Var.Z$0 = z2;
                    bj9Var.I$0 = BooleanValue;
                    bj9Var.label = 4;
                    if (bsa.n(isaVar, boolValueOf2, bj9Var) == bw2Var) {
                        r0 = BooleanValue;
                        return bw2Var;
                    }
                    r0 = BooleanValue;
                    z3 = z2;
                    s0eVar = bj9Var.this$0.e;
                    while (true) {
                        value = s0eVar.getValue();
                        z4 = z3;
                        if (s0eVar.l(value, qi9.a((qi9) value, false, false, 0, 0, false, false, 0, 0, false, z3, 511))) {
                            break;
                            break;
                        }
                        z3 = z4;
                    }
                    js3 js3Var4 = ga4.a;
                    wg6Var = mk8.a.f;
                    zi9Var = new zi9(2, xn2Var);
                    bj9Var.L$0 = xn2Var;
                    bj9Var.L$1 = xn2Var;
                    bj9Var.Z$0 = z4;
                    bj9Var.I$0 = r0;
                    bj9Var.label = 5;
                    if (ynb.p0(wg6Var, zi9Var, bj9Var) == bw2Var) {
                        return bw2Var;
                    }
                }
                return wef.a;
            } catch (Exception e3) {
                e = e3;
                bj9Var = this;
                zBooleanValue = z;
                bj9Var.this$0.d().c("Failed to sync optOutAllServerPush", e);
                BooleanValue = 0;
                z2 = zBooleanValue;
                if (BooleanValue != 0) {
                    o9Var = bj9Var.this$0.d;
                    boolValueOf3 = Boolean.valueOf(!bj9Var.$enabled);
                    bj9Var.L$0 = xn2Var;
                    bj9Var.L$1 = xn2Var;
                    bj9Var.Z$0 = z2;
                    bj9Var.I$0 = BooleanValue;
                    bj9Var.label = 3;
                    if (o9.i(o9Var, boolValueOf3, null, null, bj9Var, 6) == bw2Var) {
                        return bw2Var;
                    }
                } else {
                    hs3 hs3Var5 = xqa.W0;
                    boolValueOf2 = Boolean.valueOf(z2);
                    isaVar = hs3Var5.a;
                    bj9Var.L$0 = xn2Var;
                    bj9Var.L$1 = xn2Var;
                    bj9Var.Z$0 = z2;
                    bj9Var.I$0 = BooleanValue;
                    bj9Var.label = 4;
                    if (bsa.n(isaVar, boolValueOf2, bj9Var) == bw2Var) {
                        r0 = BooleanValue;
                        return bw2Var;
                    }
                    r0 = BooleanValue;
                    z3 = z2;
                    s0eVar = bj9Var.this$0.e;
                    while (true) {
                        value = s0eVar.getValue();
                        z4 = z3;
                        if (s0eVar.l(value, qi9.a((qi9) value, false, false, 0, 0, false, false, 0, 0, false, z3, 511))) {
                            break;
                            break;
                        }
                        z3 = z4;
                    }
                    js3 js3Var5 = ga4.a;
                    wg6Var = mk8.a.f;
                    zi9Var = new zi9(2, xn2Var);
                    bj9Var.L$0 = xn2Var;
                    bj9Var.L$1 = xn2Var;
                    bj9Var.Z$0 = z4;
                    bj9Var.I$0 = r0;
                    bj9Var.label = 5;
                    if (ynb.p0(wg6Var, zi9Var, bj9Var) == bw2Var) {
                        return bw2Var;
                    }
                }
                return wef.a;
            }
            s0e s0eVar2 = bj9Var.this$0.e;
            boolean z6 = bj9Var.$enabled;
            while (true) {
                Object value2 = s0eVar2.getValue();
                boolean z7 = z6;
                if (s0eVar2.l(value2, qi9.a((qi9) value2, false, false, 0, 0, false, false, 0, 0, false, z7, 511))) {
                    try {
                        break;
                    } catch (Exception e4) {
                        e = e4;
                        xn2Var = xn2Var2;
                        bw2Var = bw2Var2;
                    }
                } else {
                    c = c;
                    xn2Var2 = xn2Var2;
                    c2 = c2;
                    bw2Var2 = bw2Var2;
                    z6 = z7;
                }
            }
            gpfVar = bj9Var.this$0.c;
            boolValueOf = Boolean.valueOf(!bj9Var.$enabled);
            bj9Var.L$0 = xn2Var2;
            bj9Var.L$1 = xn2Var2;
            bj9Var.Z$0 = zBooleanValue;
            bj9Var.label = 2;
            z = zBooleanValue;
            bw2Var = bw2Var2;
            xn2Var = xn2Var2;
        } catch (CancellationException e5) {
            throw e5;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((bj9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

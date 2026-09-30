package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wc9 extends i09 implements i4f, pc9 {
    public sc9 E0;
    public wc9 F0;
    public final String G0;
    public pc9 Z;

    public wc9(pc9 pc9Var, sc9 sc9Var) {
        this.Z = pc9Var;
        this.E0 = sc9Var == null ? new sc9() : sc9Var;
        this.G0 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // defpackage.pc9
    public final long G(long j, int i, long j2) {
        long jG = this.Z.G(j, i, j2);
        wc9 wc9VarM1 = this.Y ? m1() : null;
        return hl9.g(jG, wc9VarM1 != null ? wc9VarM1.G(hl9.g(j, jG), i, hl9.f(j2, jG)) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r9 == r5) goto L27;
     */
    @Override // defpackage.pc9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object G0(long r7, defpackage.xn2 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.vc9
            if (r0 == 0) goto L13
            r0 = r9
            vc9 r0 = (defpackage.vc9) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L1a
        L13:
            vc9 r0 = new vc9
            zn2 r9 = (defpackage.zn2) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            long r6 = r0.J$0
            defpackage.jzb.q(r9)
            goto L6c
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r2
        L35:
            long r7 = r0.J$0
            defpackage.jzb.q(r9)
            goto L53
        L3b:
            defpackage.jzb.q(r9)
            boolean r9 = r6.Y
            if (r9 == 0) goto L46
            wc9 r2 = r6.m1()
        L46:
            if (r2 == 0) goto L58
            r0.J$0 = r7
            r0.label = r4
            java.lang.Object r9 = r2.G0(r7, r0)
            if (r9 != r5) goto L53
            goto L6a
        L53:
            zsf r9 = (defpackage.zsf) r9
            long r1 = r9.a
            goto L5a
        L58:
            r1 = 0
        L5a:
            pc9 r6 = r6.Z
            long r7 = defpackage.zsf.d(r7, r1)
            r0.J$0 = r1
            r0.label = r3
            java.lang.Object r9 = r6.G0(r7, r0)
            if (r9 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r6 = r1
        L6c:
            zsf r9 = (defpackage.zsf) r9
            long r8 = r9.a
            long r6 = defpackage.zsf.e(r6, r8)
            zsf r8 = new zsf
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc9.G0(long, xn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.pc9
    public final Object H(long j, long j2, xn2 xn2Var) {
        uc9 uc9Var;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (xn2Var instanceof uc9) {
            uc9Var = (uc9) xn2Var;
            int i = uc9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uc9Var.label = i - Integer.MIN_VALUE;
            } else {
                uc9Var = new uc9(this, (zn2) xn2Var);
            }
        } else {
            uc9Var = new uc9(this, (zn2) xn2Var);
        }
        uc9 uc9Var2 = uc9Var;
        Object objH = uc9Var2.result;
        int i2 = uc9Var2.label;
        wc9 wc9VarM1 = null;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(objH);
            pc9 pc9Var = this.Z;
            uc9Var2.J$0 = j;
            uc9Var2.J$1 = j2;
            uc9Var2.label = 1;
            objH = pc9Var.H(j, j2, uc9Var2);
            if (objH != bw2Var) {
                j3 = j;
                j4 = j2;
            }
            return bw2Var;
        }
        if (i2 == 1) {
            j4 = uc9Var2.J$1;
            j3 = uc9Var2.J$0;
            jzb.q(objH);
        } else {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = uc9Var2.J$0;
            jzb.q(objH);
        }
        j6 = ((zsf) objH).a;
        j5 = j7;
        return new zsf(zsf.e(j5, j6));
        j5 = ((zsf) objH).a;
        boolean z = this.Y;
        if (!z) {
            wc9VarM1 = this.F0;
        } else if (z) {
            wc9VarM1 = m1();
        }
        if (wc9VarM1 != null) {
            long jE = zsf.e(j3, j5);
            long jD = zsf.d(j4, j5);
            uc9Var2.J$0 = j5;
            uc9Var2.label = 2;
            objH = wc9VarM1.H(jE, jD, uc9Var2);
            if (objH != bw2Var) {
                j7 = j5;
                j6 = ((zsf) objH).a;
                j5 = j7;
            }
            return bw2Var;
        }
        j6 = 0;
        return new zsf(zsf.e(j5, j6));
    }

    @Override // defpackage.pc9
    public final long U(int i, long j) {
        wc9 wc9VarM1 = this.Y ? m1() : null;
        long jU = wc9VarM1 != null ? wc9VarM1.U(i, j) : 0L;
        return hl9.g(jU, this.Z.U(i, hl9.f(j, jU)));
    }

    @Override // defpackage.i09
    public final void d1() {
        sc9 sc9Var = this.E0;
        sc9Var.a = this;
        sc9Var.b = null;
        this.F0 = null;
        sc9Var.c = new zv6(20, this);
        sc9Var.d = Z0();
    }

    @Override // defpackage.i09
    public final void e1() {
        mmb mmbVar = new mmb();
        n3d.t(this, new up(mmbVar, 5));
        wc9 wc9Var = (wc9) ((i4f) mmbVar.element);
        this.F0 = wc9Var;
        sc9 sc9Var = this.E0;
        sc9Var.b = wc9Var;
        if (sc9Var.a == this) {
            sc9Var.a = null;
            sc9Var.d = null;
            sc9Var.c = x57.n;
        }
    }

    public final aw2 l1() {
        wc9 wc9VarM1 = m1();
        aw2 aw2VarL1 = wc9VarM1 != null ? wc9VarM1.l1() : null;
        if (aw2VarL1 != null && jgb.Y(aw2VarL1)) {
            return aw2VarL1;
        }
        aw2 aw2Var = this.E0.d;
        if (aw2Var != null) {
            return aw2Var;
        }
        qc0.p("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final wc9 m1() {
        wo0 wo0Var;
        i4f i4fVar = null;
        if (!this.Y) {
            return null;
        }
        if (!this.a.Y) {
            i37.c("visitAncestors called on an unattached node");
        }
        i09 i09Var = this.a.e;
        LayoutNode layoutNodeS0 = vd0.s0(this);
        loop0: while (layoutNodeS0 != null) {
            if ((((i09) layoutNodeS0.V0.g).d & 262144) != 0) {
                while (i09Var != null) {
                    if ((i09Var.c & 262144) != 0) {
                        i09 i09VarM0 = i09Var;
                        p89 p89Var = null;
                        while (i09VarM0 != null) {
                            if (i09VarM0 instanceof i4f) {
                                i4f i4fVar2 = (i4f) i09VarM0;
                                if (pa7.t(this.G0, i4fVar2.q()) && wc9.class == i4fVar2.getClass()) {
                                    i4fVar = i4fVar2;
                                    break loop0;
                                }
                            }
                            if ((i09VarM0.c & 262144) != 0 && (i09VarM0 instanceof sv3)) {
                                int i = 0;
                                for (i09 i09Var2 = ((sv3) i09VarM0).E0; i09Var2 != null; i09Var2 = i09Var2.f) {
                                    if ((i09Var2.c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            i09VarM0 = i09Var2;
                                        } else {
                                            if (p89Var == null) {
                                                p89Var = new p89(0, new i09[16]);
                                            }
                                            if (i09VarM0 != null) {
                                                p89Var.b(i09VarM0);
                                                i09VarM0 = null;
                                            }
                                            p89Var.b(i09Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            i09VarM0 = vd0.m0(p89Var);
                        }
                    }
                    i09Var = i09Var.e;
                }
            }
            layoutNodeS0 = layoutNodeS0.F();
            i09Var = (layoutNodeS0 == null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
        }
        return (wc9) i4fVar;
    }

    @Override // defpackage.i4f
    public final Object q() {
        return this.G0;
    }
}

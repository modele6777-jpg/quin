package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xx8 {
    public final vx7 a;
    public final ey8 b;
    public final vx7 c;
    public final fy8 d;
    public final cy8 e;
    public final f99 f = new f99();

    public xx8(vx7 vx7Var, ey8 ey8Var, vx7 vx7Var2, fy8 fy8Var, cy8 cy8Var) {
        this.a = vx7Var;
        this.b = ey8Var;
        this.c = vx7Var2;
        this.d = fy8Var;
        this.e = cy8Var;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c6 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #2 {all -> 0x007a, blocks: (B:33:0x0073, B:46:0x00be, B:48:0x00c6), top: B:87:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1 A[Catch: all -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:28:0x0060, B:53:0x00e1), top: B:85:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
    /* JADX WARN: Code duplicated, block: B:64:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    /* JADX WARN: Code duplicated, block: B:72:0x0131  */
    /* JADX WARN: Code duplicated, block: B:78:0x013d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r14v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19, types: [d99] */
    /* JADX WARN: Type inference failed for: r14v2, types: [d99] */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean] */
    public final Object a(boolean z, boolean z2, zn2 zn2Var) throws Throwable {
        wx8 wx8Var;
        ?? r15;
        d99 d99Var;
        boolean z3;
        ?? r13;
        d99 d99Var2;
        int i;
        int i2;
        d99 d99Var3;
        ey8 ey8Var;
        Boolean boolValueOf;
        boolean z4;
        d99 d99Var4;
        ?? r14;
        Object objD;
        ?? r16;
        int i3;
        d99 d99Var5;
        ?? r17;
        fy8 fy8Var;
        if (zn2Var instanceof wx8) {
            wx8Var = (wx8) zn2Var;
            int i4 = wx8Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                wx8Var.label = i4 - Integer.MIN_VALUE;
            } else {
                wx8Var = new wx8(this, zn2Var);
            }
        } else {
            wx8Var = new wx8(this, zn2Var);
        }
        Object obj = wx8Var.result;
        int i5 = wx8Var.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i5 == 0) {
                jzb.q(obj);
                f99 f99Var = this.f;
                wx8Var.L$0 = f99Var;
                wx8Var.Z$0 = z;
                wx8Var.Z$1 = z2;
                wx8Var.label = 1;
                if (f99Var.b(wx8Var) != bw2Var) {
                    r15 = z2;
                    d99Var = f99Var;
                }
                return bw2Var;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        boolean z5 = wx8Var.Z$1;
                        z4 = wx8Var.Z$0;
                        d99Var4 = (d99) wx8Var.L$0;
                        try {
                            jzb.q(obj);
                            r17 = z5;
                            if (z4) {
                                r17 = r13;
                                yx8 yx8Var = new yx8(false, 3);
                                d99Var4.h(null);
                                return yx8Var;
                            }
                            r17 = r13;
                            d99 d99Var6 = d99Var4;
                            z3 = z4;
                            d99Var3 = d99Var6;
                            i2 = 1;
                            r14 = r17;
                            vx7 vx7Var = this.c;
                            wx8Var.L$0 = d99Var3;
                            wx8Var.Z$0 = z3;
                            wx8Var.Z$1 = r14;
                            wx8Var.I$0 = i2;
                            wx8Var.label = 4;
                            objD = vx7Var.d(wx8Var);
                            if (objD != bw2Var) {
                                d99 d99Var7 = d99Var3;
                                r16 = r14;
                                i3 = i2;
                                obj = objD;
                                d99Var5 = d99Var7;
                                if (!((Boolean) obj).booleanValue()) {
                                    fy8Var = this.d;
                                    wx8Var.L$0 = d99Var5;
                                    wx8Var.Z$0 = z3;
                                    wx8Var.Z$1 = r16;
                                    wx8Var.I$0 = i3;
                                    wx8Var.label = 5;
                                    if (fy8Var.d(wx8Var) != bw2Var) {
                                        z2 = d99Var5;
                                    }
                                }
                                yx8 yx8Var2 = new yx8(i3 != 0, 1);
                                d99Var5.h(null);
                                return yx8Var2;
                            }
                            return bw2Var;
                        } catch (Throwable th) {
                            th = th;
                            z2 = d99Var4;
                            z2.h(null);
                            throw th;
                        }
                    }
                    if (i5 == 4) {
                        i3 = wx8Var.I$0;
                        boolean z6 = wx8Var.Z$1;
                        z3 = wx8Var.Z$0;
                        d99Var5 = (d99) wx8Var.L$0;
                        try {
                            jzb.q(obj);
                            r16 = z6;
                            if (!((Boolean) obj).booleanValue() && r16 != 0) {
                                fy8Var = this.d;
                                wx8Var.L$0 = d99Var5;
                                wx8Var.Z$0 = z3;
                                wx8Var.Z$1 = r16;
                                wx8Var.I$0 = i3;
                                wx8Var.label = 5;
                                if (fy8Var.d(wx8Var) != bw2Var) {
                                    z2 = d99Var5;
                                }
                                return bw2Var;
                            }
                            yx8 yx8Var3 = new yx8(i3 != 0, 1);
                            d99Var5.h(null);
                            return yx8Var3;
                        } catch (Throwable th2) {
                            th = th2;
                            z2 = d99Var5;
                            z2.h(null);
                            throw th;
                        }
                    }
                    if (i5 != 5) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = wx8Var.I$0;
                    d99 d99Var8 = (d99) wx8Var.L$0;
                    jzb.q(obj);
                    z2 = d99Var8;
                    this.e.invoke();
                    yx8 yx8Var4 = new yx8(true, i3 != 0);
                    z2.h(null);
                    return yx8Var4;
                }
                int i6 = wx8Var.I$0;
                boolean z7 = wx8Var.Z$1;
                z3 = wx8Var.Z$0;
                d99Var2 = (d99) wx8Var.L$0;
                try {
                    jzb.q(obj);
                    i = i6;
                    r13 = z7;
                    if (((Boolean) obj).booleanValue()) {
                        i2 = i;
                        d99Var3 = d99Var2;
                        r14 = r13;
                        vx7 vx7Var2 = this.c;
                        wx8Var.L$0 = d99Var3;
                        wx8Var.Z$0 = z3;
                        wx8Var.Z$1 = r14;
                        wx8Var.I$0 = i2;
                        wx8Var.label = 4;
                        objD = vx7Var2.d(wx8Var);
                        if (objD != bw2Var) {
                            d99 d99Var9 = d99Var3;
                            r16 = r14;
                            i3 = i2;
                            obj = objD;
                            d99Var5 = d99Var9;
                            if (!((Boolean) obj).booleanValue()) {
                                fy8Var = this.d;
                                wx8Var.L$0 = d99Var5;
                                wx8Var.Z$0 = z3;
                                wx8Var.Z$1 = r16;
                                wx8Var.I$0 = i3;
                                wx8Var.label = 5;
                                if (fy8Var.d(wx8Var) != bw2Var) {
                                    z2 = d99Var5;
                                    this.e.invoke();
                                    yx8 yx8Var5 = new yx8(true, i3 != 0);
                                    z2.h(null);
                                    return yx8Var5;
                                }
                            }
                            yx8 yx8Var6 = new yx8(i3 != 0, 1);
                            d99Var5.h(null);
                            return yx8Var6;
                        }
                    } else {
                        ey8Var = this.b;
                        boolValueOf = Boolean.valueOf(z3);
                        wx8Var.L$0 = d99Var2;
                        wx8Var.Z$0 = z3;
                        wx8Var.Z$1 = r13;
                        wx8Var.I$0 = i;
                        wx8Var.label = 3;
                        if (ey8Var.z(boolValueOf, wx8Var) != bw2Var) {
                            z4 = z3;
                            d99Var4 = d99Var2;
                            if (z4) {
                                r17 = r13;
                                yx8 yx8Var7 = new yx8(false, 3);
                                d99Var4.h(null);
                                return yx8Var7;
                            }
                            r17 = r13;
                            d99 d99Var10 = d99Var4;
                            z3 = z4;
                            d99Var3 = d99Var10;
                            i2 = 1;
                            r14 = r17;
                            vx7 vx7Var3 = this.c;
                            wx8Var.L$0 = d99Var3;
                            wx8Var.Z$0 = z3;
                            wx8Var.Z$1 = r14;
                            wx8Var.I$0 = i2;
                            wx8Var.label = 4;
                            objD = vx7Var3.d(wx8Var);
                            if (objD != bw2Var) {
                                d99 d99Var11 = d99Var3;
                                r16 = r14;
                                i3 = i2;
                                obj = objD;
                                d99Var5 = d99Var11;
                                if (!((Boolean) obj).booleanValue()) {
                                    fy8Var = this.d;
                                    wx8Var.L$0 = d99Var5;
                                    wx8Var.Z$0 = z3;
                                    wx8Var.Z$1 = r16;
                                    wx8Var.I$0 = i3;
                                    wx8Var.label = 5;
                                    if (fy8Var.d(wx8Var) != bw2Var) {
                                        z2 = d99Var5;
                                        this.e.invoke();
                                        yx8 yx8Var8 = new yx8(true, i3 != 0);
                                        z2.h(null);
                                        return yx8Var8;
                                    }
                                }
                                yx8 yx8Var9 = new yx8(i3 != 0, 1);
                                d99Var5.h(null);
                                return yx8Var9;
                            }
                        }
                    }
                    return bw2Var;
                } catch (Throwable th3) {
                    th = th3;
                    z2 = d99Var2;
                    z2.h(null);
                    throw th;
                }
            }
            boolean z8 = wx8Var.Z$1;
            z = wx8Var.Z$0;
            d99 d99Var12 = (d99) wx8Var.L$0;
            jzb.q(obj);
            r15 = z8;
            d99Var = d99Var12;
            vx7 vx7Var4 = this.a;
            wx8Var.L$0 = d99Var;
            wx8Var.Z$0 = z;
            wx8Var.Z$1 = r15;
            wx8Var.I$0 = 0;
            wx8Var.label = 2;
            Object objD2 = vx7Var4.d(wx8Var);
            if (objD2 != bw2Var) {
                z3 = z;
                r13 = r15;
                obj = objD2;
                d99Var2 = d99Var;
                i = 0;
                if (((Boolean) obj).booleanValue()) {
                    ey8Var = this.b;
                    boolValueOf = Boolean.valueOf(z3);
                    wx8Var.L$0 = d99Var2;
                    wx8Var.Z$0 = z3;
                    wx8Var.Z$1 = r13;
                    wx8Var.I$0 = i;
                    wx8Var.label = 3;
                    if (ey8Var.z(boolValueOf, wx8Var) != bw2Var) {
                        z4 = z3;
                        d99Var4 = d99Var2;
                        if (z4) {
                            r17 = r13;
                            yx8 yx8Var10 = new yx8(false, 3);
                            d99Var4.h(null);
                            return yx8Var10;
                        }
                        r17 = r13;
                        d99 d99Var13 = d99Var4;
                        z3 = z4;
                        d99Var3 = d99Var13;
                        i2 = 1;
                        r14 = r17;
                        vx7 vx7Var5 = this.c;
                        wx8Var.L$0 = d99Var3;
                        wx8Var.Z$0 = z3;
                        wx8Var.Z$1 = r14;
                        wx8Var.I$0 = i2;
                        wx8Var.label = 4;
                        objD = vx7Var5.d(wx8Var);
                        if (objD != bw2Var) {
                            d99 d99Var14 = d99Var3;
                            r16 = r14;
                            i3 = i2;
                            obj = objD;
                            d99Var5 = d99Var14;
                            if (!((Boolean) obj).booleanValue()) {
                                fy8Var = this.d;
                                wx8Var.L$0 = d99Var5;
                                wx8Var.Z$0 = z3;
                                wx8Var.Z$1 = r16;
                                wx8Var.I$0 = i3;
                                wx8Var.label = 5;
                                if (fy8Var.d(wx8Var) != bw2Var) {
                                    z2 = d99Var5;
                                    this.e.invoke();
                                    yx8 yx8Var11 = new yx8(true, i3 != 0);
                                    z2.h(null);
                                    return yx8Var11;
                                }
                            }
                            yx8 yx8Var12 = new yx8(i3 != 0, 1);
                            d99Var5.h(null);
                            return yx8Var12;
                        }
                    }
                } else {
                    i2 = i;
                    d99Var3 = d99Var2;
                    r14 = r13;
                    vx7 vx7Var6 = this.c;
                    wx8Var.L$0 = d99Var3;
                    wx8Var.Z$0 = z3;
                    wx8Var.Z$1 = r14;
                    wx8Var.I$0 = i2;
                    wx8Var.label = 4;
                    objD = vx7Var6.d(wx8Var);
                    if (objD != bw2Var) {
                        d99 d99Var15 = d99Var3;
                        r16 = r14;
                        i3 = i2;
                        obj = objD;
                        d99Var5 = d99Var15;
                        if (!((Boolean) obj).booleanValue()) {
                            fy8Var = this.d;
                            wx8Var.L$0 = d99Var5;
                            wx8Var.Z$0 = z3;
                            wx8Var.Z$1 = r16;
                            wx8Var.I$0 = i3;
                            wx8Var.label = 5;
                            if (fy8Var.d(wx8Var) != bw2Var) {
                                z2 = d99Var5;
                                this.e.invoke();
                                yx8 yx8Var13 = new yx8(true, i3 != 0);
                                z2.h(null);
                                return yx8Var13;
                            }
                        }
                        yx8 yx8Var14 = new yx8(i3 != 0, 1);
                        d99Var5.h(null);
                        return yx8Var14;
                    }
                }
            }
            return bw2Var;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}

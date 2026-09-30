package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class od3 implements fc3 {
    public final sd5 a;
    public final nw2 b;
    public final aw2 c;
    public int f;
    public lyd g;
    public final lc3 i;
    public final ace j;
    public final ace k;
    public final vid l;
    public final ybc d = new ybc(new tc3(this, null));
    public final f99 e = new f99();
    public final kd9 h = new kd9(7);

    public od3(sd5 sd5Var, List list, nw2 nw2Var, aw2 aw2Var) {
        this.a = sd5Var;
        this.b = nw2Var;
        this.c = aw2Var;
        this.i = new lc3(this, list);
        final int i = 0;
        this.j = new ace(new x16(this) { // from class: gc3
            public final /* synthetic */ od3 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() throws IOException {
                int i2 = i;
                od3 od3Var = this.b;
                switch (i2) {
                    case 0:
                        sd5 sd5Var2 = od3Var.a;
                        File canonicalFile = ((File) sd5Var2.c.invoke()).getCanonicalFile();
                        synchronized (sd5.e) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = sd5.d;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new wd5(canonicalFile, sd5Var2.a, (k77) sd5Var2.b.d(canonicalFile), new rd5(canonicalFile, 0));
                    default:
                        return ((wd5) od3Var.j.getValue()).c;
                }
            }
        });
        final int i2 = 1;
        this.k = new ace(new x16(this) { // from class: gc3
            public final /* synthetic */ od3 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() throws IOException {
                int i3 = i2;
                od3 od3Var = this.b;
                switch (i3) {
                    case 0:
                        sd5 sd5Var2 = od3Var.a;
                        File canonicalFile = ((File) sd5Var2.c.invoke()).getCanonicalFile();
                        synchronized (sd5.e) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = sd5.d;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new wd5(canonicalFile, sd5Var2.a, (k77) sd5Var2.b.d(canonicalFile), new rd5(canonicalFile, 0));
                    default:
                        return ((wd5) od3Var.j.getValue()).c;
                }
            }
        });
        this.l = new vid(aw2Var, new ot1(11, this), new qv2(4), new ld3(this, null));
    }

    @Override // defpackage.fc3
    public final Object a(l26 l26Var, zn2 zn2Var) {
        qgf qgfVar = (qgf) zn2Var.getContext().F0(gec.z);
        if (qgfVar != null) {
            qgfVar.a(this);
        }
        return ynb.p0(new qgf(qgfVar, this), new kd3(this, l26Var, null), zn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zn2 zn2Var) {
        uc3 uc3Var;
        d99 d99Var;
        if (zn2Var instanceof uc3) {
            uc3Var = (uc3) zn2Var;
            int i = uc3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uc3Var.label = i - Integer.MIN_VALUE;
            } else {
                uc3Var = new uc3(this, zn2Var);
            }
        } else {
            uc3Var = new uc3(this, zn2Var);
        }
        Object obj = uc3Var.result;
        int i2 = uc3Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            f99 f99Var = this.e;
            uc3Var.L$0 = f99Var;
            uc3Var.label = 1;
            Object objB = f99Var.b(uc3Var);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
            d99Var = f99Var;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d99Var = (d99) uc3Var.L$0;
            jzb.q(obj);
        }
        try {
            int i3 = this.f - 1;
            this.f = i3;
            if (i3 == 0) {
                lyd lydVar = this.g;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                this.g = null;
            }
            return wef.a;
        } finally {
            d99Var.h(null);
        }
    }

    public final k77 c() {
        return (k77) this.k.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(mt8 mt8Var, zn2 zn2Var) {
        wc3 wc3Var;
        ya2 ya2Var;
        if (zn2Var instanceof wc3) {
            wc3Var = (wc3) zn2Var;
            int i = wc3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wc3Var.label = i - Integer.MIN_VALUE;
            } else {
                wc3Var = new wc3(this, zn2Var);
            }
        } else {
            wc3Var = new wc3(this, zn2Var);
        }
        Object dzbVar = wc3Var.result;
        int i2 = wc3Var.label;
        if (i2 == 0) {
            jzb.q(dzbVar);
            za2 za2Var = mt8Var.b;
            try {
                pv2 pv2VarP0 = mt8Var.d.p0(wc3Var.getContext());
                xc3 xc3Var = new xc3(this, mt8Var, null);
                wc3Var.L$0 = za2Var;
                wc3Var.label = 1;
                Object objP0 = ynb.p0(pv2VarP0, xc3Var, wc3Var);
                bw2 bw2Var = bw2.a;
                if (objP0 == bw2Var) {
                    return bw2Var;
                }
                dzbVar = objP0;
                ya2Var = za2Var;
            } catch (Throwable th) {
                th = th;
                ya2Var = za2Var;
                dzbVar = new dzb(th);
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ya2Var = (ya2) wc3Var.L$0;
            try {
                jzb.q(dzbVar);
            } catch (Throwable th2) {
                th = th2;
                dzbVar = new dzb(th);
            }
        }
        Throwable thA = ezb.a(dzbVar);
        za2 za2Var2 = (za2) ya2Var;
        if (thA == null) {
            za2Var2.R(dzbVar);
        } else {
            za2Var2.i0(thA);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(zn2 zn2Var) {
        yc3 yc3Var;
        d99 d99Var;
        if (zn2Var instanceof yc3) {
            yc3Var = (yc3) zn2Var;
            int i = yc3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                yc3Var.label = i - Integer.MIN_VALUE;
            } else {
                yc3Var = new yc3(this, zn2Var);
            }
        } else {
            yc3Var = new yc3(this, zn2Var);
        }
        Object obj = yc3Var.result;
        int i2 = yc3Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            f99 f99Var = this.e;
            yc3Var.L$0 = f99Var;
            yc3Var.label = 1;
            Object objB = f99Var.b(yc3Var);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
            d99Var = f99Var;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d99Var = (d99) yc3Var.L$0;
            jzb.q(obj);
        }
        try {
            int i3 = this.f + 1;
            this.f = i3;
            if (i3 == 1) {
                this.g = ynb.V(this.c, null, null, new zc3(this, null), 3);
            }
            return wef.a;
        } finally {
            d99Var.h(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r1.b(r0) == r4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.zn2 r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ad3
            if (r0 == 0) goto L13
            r0 = r7
            ad3 r0 = (defpackage.ad3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ad3 r0 = new ad3
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            int r0 = r0.I$0
            defpackage.jzb.q(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5c
        L2c:
            r7 = move-exception
            goto L63
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            r6 = 0
            return r6
        L35:
            defpackage.jzb.q(r7)
            goto L49
        L39:
            defpackage.jzb.q(r7)
            k77 r7 = r6.c()
            r0.label = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r4) goto L49
            goto L5b
        L49:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            lc3 r1 = r6.i     // Catch: java.lang.Throwable -> L5f
            r0.I$0 = r7     // Catch: java.lang.Throwable -> L5f
            r0.label = r2     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r1.b(r0)     // Catch: java.lang.Throwable -> L5f
            if (r6 != r4) goto L5c
        L5b:
            return r4
        L5c:
            wef r6 = defpackage.wef.a
            return r6
        L5f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L63:
            odb r1 = new odb
            r1.<init>(r7, r0)
            kd9 r6 = r6.h
            r6.M(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od3.f(zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        if (r11 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (r11 == r7) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(boolean r10, defpackage.xn2 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.bd3
            if (r0 == 0) goto L13
            r0 = r11
            bd3 r0 = (defpackage.bd3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            bd3 r0 = new bd3
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            int r1 = r0.label
            kd9 r2 = r9.h
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            bw2 r7 = defpackage.bw2.a
            if (r1 == 0) goto L45
            if (r1 == r5) goto L3b
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            defpackage.jzb.q(r11)
            goto La4
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r9)
            return r6
        L37:
            defpackage.jzb.q(r11)
            goto L8d
        L3b:
            boolean r10 = r0.Z$0
            java.lang.Object r1 = r0.L$0
            i0e r1 = (defpackage.i0e) r1
            defpackage.jzb.q(r11)
            goto L61
        L45:
            defpackage.jzb.q(r11)
            i0e r1 = r2.F()
            boolean r11 = r1 instanceof defpackage.zaf
            if (r11 != 0) goto Lbc
            k77 r11 = r9.c()
            r0.L$0 = r1
            r0.Z$0 = r10
            r0.label = r5
            java.lang.Object r11 = r11.a(r0)
            if (r11 != r7) goto L61
            goto La3
        L61:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            boolean r5 = r1 instanceof defpackage.cb3
            if (r5 == 0) goto L71
            r8 = r1
            cb3 r8 = (defpackage.cb3) r8
            int r8 = r8.a
            goto L72
        L71:
            r8 = -1
        L72:
            if (r5 == 0) goto L77
            if (r11 != r8) goto L77
            return r1
        L77:
            if (r10 == 0) goto L90
            k77 r10 = r9.c()
            cd3 r11 = new cd3
            r11.<init>(r9, r6)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r11 = r10.c(r11, r0)
            if (r11 != r7) goto L8d
            goto La3
        L8d:
            iy9 r11 = (defpackage.iy9) r11
            goto La6
        L90:
            k77 r10 = r9.c()
            dd3 r11 = new dd3
            r11.<init>(r9, r8, r6)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r11 = r10.d(r11, r0)
            if (r11 != r7) goto La4
        La3:
            return r7
        La4:
            iy9 r11 = (defpackage.iy9) r11
        La6:
            java.lang.Object r9 = r11.a()
            i0e r9 = (defpackage.i0e) r9
            java.lang.Object r10 = r11.b()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lbb
            r2.M(r9)
        Lbb:
            return r9
        Lbc:
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            defpackage.qc0.p(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od3.g(boolean, xn2):java.lang.Object");
    }

    @Override // defpackage.fc3
    public final wj5 getData() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009a A[Catch: mw2 -> 0x005a, TryCatch #1 {mw2 -> 0x005a, blocks: (B:19:0x0055, B:54:0x00f1, B:24:0x005f, B:51:0x00d6, B:32:0x0074, B:40:0x009a, B:42:0x00a0, B:36:0x007e, B:48:0x00c7), top: B:79:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:63:0x0127 A[Catch: all -> 0x0150, TryCatch #0 {all -> 0x0150, blocks: (B:61:0x0117, B:63:0x0127, B:64:0x012c), top: B:78:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x012c A[Catch: all -> 0x0150, TRY_LEAVE, TryCatch #0 {all -> 0x0150, blocks: (B:61:0x0117, B:63:0x0127, B:64:0x012c), top: B:78:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x013c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0144  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(boolean z, zn2 zn2Var) {
        ed3 ed3Var;
        mmb mmbVar;
        mw2 mw2Var;
        mmb mmbVar2;
        kmb kmbVar;
        mw2 mw2Var2;
        gd3 gd3Var;
        Object objC;
        kmb kmbVar2;
        mmb mmbVar3;
        int iHashCode;
        Object objA;
        boolean z2;
        int i;
        Object obj;
        if (zn2Var instanceof ed3) {
            ed3Var = (ed3) zn2Var;
            int i2 = ed3Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ed3Var.label = i2 - Integer.MIN_VALUE;
            } else {
                ed3Var = new ed3(this, zn2Var);
            }
        } else {
            ed3Var = new ed3(this, zn2Var);
        }
        Object objA2 = ed3Var.result;
        int i3 = ed3Var.label;
        bw2 bw2Var = bw2.a;
        try {
            switch (i3) {
                case 0:
                    jzb.q(objA2);
                    if (z) {
                        ed3Var.Z$0 = z;
                        ed3Var.label = 1;
                        objA2 = ((wd5) this.j.getValue()).a(new m2e(3, null), ed3Var);
                        if (objA2 != bw2Var) {
                            if (objA2 != null) {
                                iHashCode = objA2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            k77 k77VarC = c();
                            ed3Var.L$0 = objA2;
                            ed3Var.Z$0 = z;
                            ed3Var.I$0 = iHashCode;
                            ed3Var.label = 2;
                            objA = k77VarC.a(ed3Var);
                            if (objA != bw2Var) {
                                int i4 = iHashCode;
                                z2 = z;
                                i = i4;
                                obj = objA2;
                                objA2 = objA;
                                return new cb3(obj, i, ((Number) objA2).intValue());
                            }
                        }
                    } else {
                        k77 k77VarC2 = c();
                        ed3Var.Z$0 = z;
                        ed3Var.label = 3;
                        objA2 = k77VarC2.a(ed3Var);
                        if (objA2 != bw2Var) {
                            int iIntValue = ((Number) objA2).intValue();
                            k77 k77VarC3 = c();
                            fd3 fd3Var = new fd3(this, iIntValue, null);
                            ed3Var.Z$0 = z;
                            ed3Var.label = 4;
                            objA2 = k77VarC3.d(fd3Var, ed3Var);
                            if (objA2 == bw2Var) {
                            }
                            return (cb3) objA2;
                        }
                    }
                    return bw2Var;
                case 1:
                    z = ed3Var.Z$0;
                    jzb.q(objA2);
                    if (objA2 != null) {
                        iHashCode = objA2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    k77 k77VarC4 = c();
                    ed3Var.L$0 = objA2;
                    ed3Var.Z$0 = z;
                    ed3Var.I$0 = iHashCode;
                    ed3Var.label = 2;
                    objA = k77VarC4.a(ed3Var);
                    if (objA != bw2Var) {
                        int i5 = iHashCode;
                        z2 = z;
                        i = i5;
                        obj = objA2;
                        objA2 = objA;
                        return new cb3(obj, i, ((Number) objA2).intValue());
                    }
                    return bw2Var;
                case 2:
                    i = ed3Var.I$0;
                    z2 = ed3Var.Z$0;
                    obj = ed3Var.L$0;
                    try {
                        jzb.q(objA2);
                        return new cb3(obj, i, ((Number) objA2).intValue());
                    } catch (mw2 e) {
                        e = e;
                        z = z2;
                        mmbVar = new mmb();
                        ed3Var.L$0 = e;
                        ed3Var.L$1 = mmbVar;
                        ed3Var.L$2 = mmbVar;
                        ed3Var.Z$0 = z;
                        ed3Var.label = 5;
                        Object objC2 = this.b.c(e);
                        if (objC2 != bw2Var) {
                            mw2Var = e;
                            objA2 = objC2;
                            mmbVar2 = mmbVar;
                            mmbVar2.element = objA2;
                            kmbVar = new kmb();
                            try {
                                gd3Var = new gd3(mmbVar, this, kmbVar, null);
                                ed3Var.L$0 = mw2Var;
                                ed3Var.L$1 = mmbVar;
                                ed3Var.L$2 = kmbVar;
                                ed3Var.label = 6;
                                if (z) {
                                    objC = gd3Var.d(ed3Var);
                                } else {
                                    objC = c().c(new vc3(null, gd3Var), ed3Var);
                                }
                                if (objC != bw2Var) {
                                    kmbVar2 = kmbVar;
                                    mmbVar3 = mmbVar;
                                    Object obj2 = mmbVar3.element;
                                    return new cb3(obj2, obj2 != null ? obj2.hashCode() : 0, kmbVar2.element);
                                }
                            } catch (Throwable th) {
                                th = th;
                                mw2Var2 = mw2Var;
                                bzd.m(mw2Var2, th);
                                throw mw2Var2;
                            }
                        }
                        return bw2Var;
                    }
                case 3:
                    z = ed3Var.Z$0;
                    jzb.q(objA2);
                    int iIntValue2 = ((Number) objA2).intValue();
                    k77 k77VarC5 = c();
                    fd3 fd3Var2 = new fd3(this, iIntValue2, null);
                    ed3Var.Z$0 = z;
                    ed3Var.label = 4;
                    objA2 = k77VarC5.d(fd3Var2, ed3Var);
                    if (objA2 == bw2Var) {
                        return bw2Var;
                    }
                    return (cb3) objA2;
                case 4:
                    boolean z3 = ed3Var.Z$0;
                    jzb.q(objA2);
                    return (cb3) objA2;
                case 5:
                    z = ed3Var.Z$0;
                    mmb mmbVar4 = (mmb) ed3Var.L$2;
                    mmb mmbVar5 = (mmb) ed3Var.L$1;
                    mw2Var = (mw2) ed3Var.L$0;
                    jzb.q(objA2);
                    mmbVar2 = mmbVar4;
                    mmbVar = mmbVar5;
                    mmbVar2.element = objA2;
                    kmbVar = new kmb();
                    gd3Var = new gd3(mmbVar, this, kmbVar, null);
                    ed3Var.L$0 = mw2Var;
                    ed3Var.L$1 = mmbVar;
                    ed3Var.L$2 = kmbVar;
                    ed3Var.label = 6;
                    if (z) {
                        objC = gd3Var.d(ed3Var);
                    } else {
                        objC = c().c(new vc3(null, gd3Var), ed3Var);
                    }
                    if (objC != bw2Var) {
                        kmbVar2 = kmbVar;
                        mmbVar3 = mmbVar;
                        Object obj3 = mmbVar3.element;
                        return new cb3(obj3, obj3 != null ? obj3.hashCode() : 0, kmbVar2.element);
                    }
                    return bw2Var;
                case 6:
                    kmbVar2 = (kmb) ed3Var.L$2;
                    mmbVar3 = (mmb) ed3Var.L$1;
                    mw2Var2 = (mw2) ed3Var.L$0;
                    try {
                        jzb.q(objA2);
                        Object obj4 = mmbVar3.element;
                        return new cb3(obj4, obj4 != null ? obj4.hashCode() : 0, kmbVar2.element);
                    } catch (Throwable th2) {
                        th = th2;
                        bzd.m(mw2Var2, th);
                        throw mw2Var2;
                    }
                default:
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (mw2 e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(Object obj, boolean z, zn2 zn2Var) {
        md3 md3Var;
        kmb kmbVar;
        if (zn2Var instanceof md3) {
            md3Var = (md3) zn2Var;
            int i = md3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                md3Var.label = i - Integer.MIN_VALUE;
            } else {
                md3Var = new md3(this, zn2Var);
            }
        } else {
            md3Var = new md3(this, zn2Var);
        }
        Object obj2 = md3Var.result;
        int i2 = md3Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            kmb kmbVar2 = new kmb();
            wd5 wd5Var = (wd5) this.j.getValue();
            nd3 nd3Var = new nd3(kmbVar2, this, obj, z, null);
            md3Var.L$0 = kmbVar2;
            md3Var.label = 1;
            Object objB = wd5Var.b(nd3Var, md3Var);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
            kmbVar = kmbVar2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kmbVar = (kmb) md3Var.L$0;
            jzb.q(obj2);
        }
        return new Integer(kmbVar.element);
    }
}

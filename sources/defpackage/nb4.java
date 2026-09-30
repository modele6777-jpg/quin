package defpackage;

import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface nb4 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static Object a(nb4 nb4Var, String str, zn2 zn2Var) {
        kb4 kb4Var;
        if (zn2Var instanceof kb4) {
            kb4Var = (kb4) zn2Var;
            int i = kb4Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kb4Var.label = i - Integer.MIN_VALUE;
            } else {
                kb4Var = new kb4(nb4Var, zn2Var);
            }
        } else {
            kb4Var = new kb4(nb4Var, zn2Var);
        }
        Object objK = kb4Var.result;
        int i2 = kb4Var.label;
        if (i2 == 0) {
            jzb.q(objK);
            kb4Var.L$0 = null;
            kb4Var.L$1 = null;
            kb4Var.label = 1;
            objK = urg.K(kb4Var, new ia(str, 21), ((vb4) nb4Var).a, true, false);
            bw2 bw2Var = bw2.a;
            if (objK == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objK);
        }
        li liVar = (li) objK;
        if (liVar != null) {
            return liVar.a;
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:27|67|28|(6:31|32|33|(1:48)(1:47)|49|(4:18|52|(2:54|56)|57))|59) */
    /* JADX WARN: Code duplicated, block: B:18:0x008b A[PHI: r0 r2 r3 r10
  0x008b: PHI (r0v7 java.lang.Object) = (r0v12 java.lang.Object), (r0v1 java.lang.Object) binds: [B:50:0x019d, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x008b: PHI (r2v4 yc4) = (r2v8 yc4), (r2v25 yc4) binds: [B:50:0x019d, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x008b: PHI (r3v4 java.util.Iterator) = (r3v7 java.util.Iterator), (r3v21 java.util.Iterator) binds: [B:50:0x019d, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x008b: PHI (r10v2 nb4) = (r10v29 nb4), (r10v30 nb4) binds: [B:50:0x019d, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:31:0x011d  */
    /* JADX WARN: Code duplicated, block: B:43:0x013d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0173  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0123, code lost:
    
        r10 = r2;
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0129, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01e2, code lost:
    
        if (r0 == r9) goto L59;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01e2 -> B:14:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Object b(defpackage.nb4 r28, java.util.List r29, defpackage.zn2 r30) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb4.b(nb4, java.util.List, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00df  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:43:0x0123  */
    /* JADX WARN: Code duplicated, block: B:46:0x0127 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    static Object c(nb4 nb4Var, yc4 yc4Var, zn2 zn2Var) {
        mb4 mb4Var;
        nb4 nb4Var2;
        yc4 yc4Var2;
        Instant instant;
        yc4 yc4Var3;
        int i;
        int i2;
        nb4 nb4Var3;
        boolean z;
        Instant instant2;
        Object objK;
        if (zn2Var instanceof mb4) {
            mb4Var = (mb4) zn2Var;
            int i3 = mb4Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mb4Var.label = i3 - Integer.MIN_VALUE;
            } else {
                mb4Var = new mb4(nb4Var, zn2Var);
            }
        } else {
            mb4Var = new mb4(nb4Var, zn2Var);
        }
        Object objK2 = mb4Var.result;
        int i4 = mb4Var.label;
        Object obj = wef.a;
        bw2 bw2Var = bw2.a;
        if (i4 == 0) {
            jzb.q(objK2);
            String str = yc4Var.a;
            mb4Var.L$0 = nb4Var;
            mb4Var.L$1 = yc4Var;
            mb4Var.label = 1;
            vb4 vb4Var = (vb4) nb4Var;
            objK2 = urg.K(mb4Var, new ia(str, vb4Var, 17), vb4Var.a, true, false);
            if (objK2 != bw2Var) {
                nb4Var2 = vb4Var;
                yc4Var2 = yc4Var;
            }
            return bw2Var;
        }
        if (i4 == 1) {
            yc4Var2 = (yc4) mb4Var.L$1;
            nb4Var2 = (nb4) mb4Var.L$0;
            jzb.q(objK2);
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objK2);
                return objK2;
            }
            int i5 = mb4Var.I$1;
            i = mb4Var.I$0;
            instant = (Instant) mb4Var.L$5;
            yc4 yc4Var4 = (yc4) mb4Var.L$4;
            nb4 nb4Var4 = (nb4) mb4Var.L$3;
            yc4 yc4Var5 = (yc4) mb4Var.L$1;
            jzb.q(objK2);
            i2 = i5;
            yc4Var2 = yc4Var5;
            yc4Var3 = yc4Var4;
            nb4Var3 = nb4Var4;
        }
        Instant instant3 = instant;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        instant2 = (Instant) objK2;
        if (instant2 == null) {
            instant2 = yc4Var2.q;
        }
        yc4 yc4VarK = od4.K(yc4.a(yc4Var3, null, z, null, null, i2, null, null, instant3, instant2, null, null, null, null, 4095999));
        mb4Var.L$0 = null;
        mb4Var.L$1 = null;
        mb4Var.L$2 = null;
        mb4Var.L$3 = null;
        mb4Var.L$4 = null;
        mb4Var.L$5 = null;
        mb4Var.label = 3;
        vb4 vb4Var2 = (vb4) nb4Var3;
        objK = urg.K(mb4Var, new ks2(19, vb4Var2, yc4VarK), vb4Var2.a, false, true);
        if (objK == bw2Var) {
            obj = objK;
        }
        if (obj != bw2Var) {
            return bw2Var;
        }
        return obj;
        Instant instant4 = (Instant) objK2;
        if (yc4Var2.b && instant4 != null) {
            return obj;
        }
        instant = yc4Var2.p;
        if (instant == null) {
            instant = instant4;
        }
        String str2 = yc4Var2.a;
        mb4Var.L$0 = null;
        mb4Var.L$1 = yc4Var2;
        mb4Var.L$2 = null;
        mb4Var.L$3 = nb4Var2;
        mb4Var.L$4 = yc4Var2;
        mb4Var.L$5 = instant;
        mb4Var.I$0 = 0;
        mb4Var.I$1 = 0;
        mb4Var.I$2 = 0;
        mb4Var.label = 2;
        vb4 vb4Var3 = (vb4) nb4Var2;
        objK2 = urg.K(mb4Var, new ia(str2, vb4Var3, 18), vb4Var3.a, true, false);
        if (objK2 != bw2Var) {
            yc4Var3 = yc4Var2;
            i = 0;
            i2 = 0;
            nb4Var3 = vb4Var3;
            Instant instant5 = instant;
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            instant2 = (Instant) objK2;
            if (instant2 == null) {
                instant2 = yc4Var2.q;
            }
            yc4 yc4VarK2 = od4.K(yc4.a(yc4Var3, null, z, null, null, i2, null, null, instant5, instant2, null, null, null, null, 4095999));
            mb4Var.L$0 = null;
            mb4Var.L$1 = null;
            mb4Var.L$2 = null;
            mb4Var.L$3 = null;
            mb4Var.L$4 = null;
            mb4Var.L$5 = null;
            mb4Var.label = 3;
            vb4 vb4Var4 = (vb4) nb4Var3;
            objK = urg.K(mb4Var, new ks2(19, vb4Var4, yc4VarK2), vb4Var4.a, false, true);
            if (objK == bw2Var) {
                obj = objK;
            }
            if (obj != bw2Var) {
                return obj;
            }
        }
        return bw2Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[LOOP:0: B:30:0x00d3->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
    
        if (r13 == r6) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [vb4] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Object d(defpackage.nb4 r9, java.lang.String r10, java.util.List r11, java.time.Instant r12, defpackage.zn2 r13) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb4.d(nb4, java.lang.String, java.util.List, java.time.Instant, zn2):java.lang.Object");
    }
}

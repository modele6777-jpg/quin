package defpackage;

import ai.askquin.R;
import android.content.Context;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bad {
    public final Context a;
    public final String b;
    public final x6d c;
    public final pad d;
    public final wt6 e;
    public final hla f;
    public final yv9 g;
    public final xfc h;
    public final e89 i;
    public final qn2 j;
    public final zk8 k;
    public final f99 l;
    public cbd m;
    public String n;
    public lyd o;
    public lyd p;
    public final vz9 q;

    public bad(Context context, String str, x6d x6dVar, pad padVar, wt6 wt6Var, hla hlaVar, yv9 yv9Var, xfc xfcVar, e89 e89Var, aw2 aw2Var) {
        context.getClass();
        str.getClass();
        x6dVar.getClass();
        wt6Var.getClass();
        e89Var.getClass();
        aw2Var.getClass();
        this.a = context;
        this.b = str;
        this.c = x6dVar;
        this.d = padVar;
        this.e = wt6Var;
        this.f = hlaVar;
        this.g = yv9Var;
        this.h = xfcVar;
        this.i = e89Var;
        this.j = jgb.k(aw2Var.getCoroutineContext().p0(new t8e((dg7) aw2Var.getCoroutineContext().F0(ndb.Y0))));
        this.k = new zk8();
        this.l = new f99();
        this.m = new cbd(xu4.a);
        this.q = q1c.f(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(e8d e8dVar, gbd gbdVar, zn2 zn2Var) {
        b9d b9dVar;
        bad badVar;
        String str;
        if (zn2Var instanceof b9d) {
            b9dVar = (b9d) zn2Var;
            int i = b9dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                b9dVar.label = i - Integer.MIN_VALUE;
            } else {
                b9dVar = new b9d(this, zn2Var);
            }
        } else {
            b9dVar = new b9d(this, zn2Var);
        }
        Object objP0 = b9dVar.result;
        int i2 = b9dVar.label;
        if (i2 == 0) {
            jzb.q(objP0);
            String string = UUID.randomUUID().toString();
            string.getClass();
            String strV = w6c.v(gbdVar);
            js3 js3Var = ga4.a;
            hr3 hr3Var = hr3.c;
            badVar = this;
            c9d c9dVar = new c9d(badVar, string, e8dVar, strV, null);
            b9dVar.L$0 = null;
            b9dVar.L$1 = null;
            b9dVar.L$2 = string;
            b9dVar.L$3 = null;
            b9dVar.label = 1;
            objP0 = ynb.p0(hr3Var, c9dVar, b9dVar);
            bw2 bw2Var = bw2.a;
            if (objP0 == bw2Var) {
                return bw2Var;
            }
            str = string;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) b9dVar.L$2;
            jzb.q(objP0);
            badVar = this;
        }
        if (((Boolean) objP0).booleanValue()) {
            badVar.n(str);
            return str;
        }
        badVar.o(false);
        jcc.k(0, new Integer(R.string.share_failed));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(e95 e95Var, dbd dbdVar, zn2 zn2Var) throws Throwable {
        d9d d9dVar;
        e95 e95Var2;
        d99 d99Var;
        Throwable th;
        d99 d99Var2;
        bbd bbdVar;
        if (zn2Var instanceof d9d) {
            d9dVar = (d9d) zn2Var;
            int i = d9dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                d9dVar.label = i - Integer.MIN_VALUE;
            } else {
                d9dVar = new d9d(this, zn2Var);
            }
        } else {
            d9dVar = new d9d(this, zn2Var);
        }
        Object objC = d9dVar.result;
        int i2 = d9dVar.label;
        Object obj = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(objC);
                d9dVar.L$0 = e95Var;
                d9dVar.L$1 = dbdVar;
                f99 f99Var = this.l;
                d9dVar.L$2 = f99Var;
                d9dVar.label = 1;
                if (f99Var.b(d9dVar) != obj) {
                    e95Var2 = e95Var;
                    d99Var = f99Var;
                }
                return obj;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) d9dVar.L$2;
                try {
                    jzb.q(objC);
                    bbdVar = (bbd) objC;
                    d99Var2.h(null);
                    if (bbdVar == bbd.b) {
                        jcc.k(0, Integer.valueOf(R.string.share_failed));
                    }
                    return wef.a;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            d99Var = (d99) d9dVar.L$2;
            dbdVar = (dbd) d9dVar.L$1;
            e95Var2 = (e95) d9dVar.L$0;
            jzb.q(objC);
            d9dVar.L$0 = null;
            d9dVar.L$1 = null;
            d9dVar.L$2 = d99Var;
            d9dVar.label = 2;
            objC = c(e95Var2, dbdVar, d9dVar);
            if (objC != obj) {
                d99Var2 = d99Var;
                bbdVar = (bbd) objC;
                d99Var2.h(null);
                if (bbdVar == bbd.b) {
                    jcc.k(0, Integer.valueOf(R.string.share_failed));
                }
                return wef.a;
            }
            return obj;
        } catch (Throwable th3) {
            d99 d99Var3 = d99Var;
            th = th3;
            d99Var2 = d99Var3;
            d99Var2.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum c(e95 e95Var, dbd dbdVar, zn2 zn2Var) {
        e9d e9dVar;
        if (zn2Var instanceof e9d) {
            e9dVar = (e9d) zn2Var;
            int i = e9dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                e9dVar.label = i - Integer.MIN_VALUE;
            } else {
                e9dVar = new e9d(this, zn2Var);
            }
        } else {
            e9dVar = new e9d(this, zn2Var);
        }
        Object objP0 = e9dVar.result;
        int i2 = e9dVar.label;
        if (i2 == 0) {
            jzb.q(objP0);
            js3 js3Var = ga4.a;
            hr3 hr3Var = hr3.c;
            f9d f9dVar = new f9d(this, e95Var, dbdVar, null);
            e9dVar.L$0 = null;
            e9dVar.L$1 = null;
            e9dVar.label = 1;
            objP0 = ynb.p0(hr3Var, f9dVar, e9dVar);
            bw2 bw2Var = bw2.a;
            if (objP0 == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objP0);
        }
        ebd ebdVar = (ebd) objP0;
        this.m = ebdVar.a;
        return ebdVar.b;
    }

    public final void d(o7a o7aVar) {
        if (o7aVar instanceof m7a) {
            o(false);
            jcc.k(0, Integer.valueOf(R.string.image_save_failed));
        } else if (!(o7aVar instanceof n7a)) {
            ap.c();
        } else {
            ynb.V(this.j, null, null, new g9d(this, o7aVar, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003c, B:37:0x00b5, B:21:0x0056, B:31:0x009c, B:34:0x00a2), top: B:47:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (r12 == r7) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2, types: [d99] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7, types: [d99] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [bad] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r10, java.lang.String r11, defpackage.zn2 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bad.e(java.lang.String, java.lang.String, zn2):java.lang.Object");
    }

    public final boolean f() {
        return ((Boolean) this.q.getValue()).booleanValue() || this.i.getValue() != null;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x013e A[Catch: all -> 0x0057, CancellationException -> 0x010b, Exception -> 0x01b5, TRY_ENTER, TryCatch #1 {CancellationException -> 0x010b, blocks: (B:88:0x0197, B:89:0x0199, B:61:0x0135, B:64:0x013e, B:67:0x0152, B:69:0x015f, B:70:0x0161, B:72:0x0165, B:74:0x016f, B:76:0x0173, B:82:0x017c, B:85:0x0182, B:48:0x0104, B:41:0x00e3, B:44:0x00eb, B:53:0x0111, B:55:0x0115, B:57:0x012b, B:96:0x01ad, B:97:0x01b4), top: B:111:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0150  */
    /* JADX WARN: Code duplicated, block: B:67:0x0152 A[Catch: all -> 0x0057, CancellationException -> 0x010b, Exception -> 0x01b5, TryCatch #1 {CancellationException -> 0x010b, blocks: (B:88:0x0197, B:89:0x0199, B:61:0x0135, B:64:0x013e, B:67:0x0152, B:69:0x015f, B:70:0x0161, B:72:0x0165, B:74:0x016f, B:76:0x0173, B:82:0x017c, B:85:0x0182, B:48:0x0104, B:41:0x00e3, B:44:0x00eb, B:53:0x0111, B:55:0x0115, B:57:0x012b, B:96:0x01ad, B:97:0x01b4), top: B:111:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x015f A[Catch: all -> 0x0057, CancellationException -> 0x010b, Exception -> 0x01b5, TryCatch #1 {CancellationException -> 0x010b, blocks: (B:88:0x0197, B:89:0x0199, B:61:0x0135, B:64:0x013e, B:67:0x0152, B:69:0x015f, B:70:0x0161, B:72:0x0165, B:74:0x016f, B:76:0x0173, B:82:0x017c, B:85:0x0182, B:48:0x0104, B:41:0x00e3, B:44:0x00eb, B:53:0x0111, B:55:0x0115, B:57:0x012b, B:96:0x01ad, B:97:0x01b4), top: B:111:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0165 A[Catch: all -> 0x0057, CancellationException -> 0x010b, Exception -> 0x01b5, TryCatch #1 {CancellationException -> 0x010b, blocks: (B:88:0x0197, B:89:0x0199, B:61:0x0135, B:64:0x013e, B:67:0x0152, B:69:0x015f, B:70:0x0161, B:72:0x0165, B:74:0x016f, B:76:0x0173, B:82:0x017c, B:85:0x0182, B:48:0x0104, B:41:0x00e3, B:44:0x00eb, B:53:0x0111, B:55:0x0115, B:57:0x012b, B:96:0x01ad, B:97:0x01b4), top: B:111:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x016f A[Catch: all -> 0x0057, CancellationException -> 0x010b, Exception -> 0x01b5, TryCatch #1 {CancellationException -> 0x010b, blocks: (B:88:0x0197, B:89:0x0199, B:61:0x0135, B:64:0x013e, B:67:0x0152, B:69:0x015f, B:70:0x0161, B:72:0x0165, B:74:0x016f, B:76:0x0173, B:82:0x017c, B:85:0x0182, B:48:0x0104, B:41:0x00e3, B:44:0x00eb, B:53:0x0111, B:55:0x0115, B:57:0x012b, B:96:0x01ad, B:97:0x01b4), top: B:111:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0178  */
    /* JADX WARN: Code duplicated, block: B:81:0x017b  */
    /* JADX WARN: Code duplicated, block: B:82:0x017c A[Catch: all -> 0x0057, CancellationException -> 0x010b, Exception -> 0x01b5, TryCatch #1 {CancellationException -> 0x010b, blocks: (B:88:0x0197, B:89:0x0199, B:61:0x0135, B:64:0x013e, B:67:0x0152, B:69:0x015f, B:70:0x0161, B:72:0x0165, B:74:0x016f, B:76:0x0173, B:82:0x017c, B:85:0x0182, B:48:0x0104, B:41:0x00e3, B:44:0x00eb, B:53:0x0111, B:55:0x0115, B:57:0x012b, B:96:0x01ad, B:97:0x01b4), top: B:111:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x017f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0182 A[Catch: all -> 0x0057, CancellationException -> 0x010b, Exception -> 0x01b5, TryCatch #1 {CancellationException -> 0x010b, blocks: (B:88:0x0197, B:89:0x0199, B:61:0x0135, B:64:0x013e, B:67:0x0152, B:69:0x015f, B:70:0x0161, B:72:0x0165, B:74:0x016f, B:76:0x0173, B:82:0x017c, B:85:0x0182, B:48:0x0104, B:41:0x00e3, B:44:0x00eb, B:53:0x0111, B:55:0x0115, B:57:0x012b, B:96:0x01ad, B:97:0x01b4), top: B:111:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0196  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c6, code lost:
    
        if (e(r3, r2, r6) == r15) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [bad] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, w7d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [w7d] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [w7d] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r4v26, types: [w7d] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.w7d r18, defpackage.gbd r19, java.lang.String r20, defpackage.zn2 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bad.g(w7d, gbd, java.lang.String, zn2):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0081 A[PHI: r8
  0x0081: PHI (r8v22 java.lang.String) = (r8v1 java.lang.String), (r8v23 java.lang.String) binds: [B:18:0x007e, B:51:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad A[PHI: r8 r9
  0x00ad: PHI (r8v21 java.lang.String) = (r8v3 java.lang.String), (r8v22 java.lang.String) binds: [B:17:0x0076, B:24:0x00a9] A[DONT_GENERATE, DONT_INLINE]
  0x00ad: PHI (r9v8 java.lang.Object) = (r9v1 java.lang.Object), (r9v20 java.lang.Object) binds: [B:17:0x0076, B:24:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e3 A[PHI: r8 r9
  0x00e3: PHI (r8v19 java.lang.String) = (r8v11 java.lang.String), (r8v21 java.lang.String) binds: [B:15:0x005d, B:36:0x00e0] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r9v2 java.lang.Object) = (r9v1 java.lang.Object), (r9v12 java.lang.Object) binds: [B:15:0x005d, B:36:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:47:0x0114 A[PHI: r8 r9
  0x0114: PHI (r8v23 java.lang.String) = (r8v19 java.lang.String), (r8v29 java.lang.String) binds: [B:45:0x0111, B:13:0x003b] A[DONT_GENERATE, DONT_INLINE]
  0x0114: PHI (r9v21 java.lang.Object) = (r9v6 java.lang.Object), (r9v1 java.lang.Object) binds: [B:45:0x0111, B:13:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x011c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x012d -> B:19:0x0081). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(java.lang.String r8, defpackage.zn2 r9) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bad.h(java.lang.String, zn2):java.lang.Object");
    }

    public final void i(String str) {
        lyd lydVar;
        if (pa7.t(this.n, str)) {
            str.getClass();
            zk8 zk8Var = this.k;
            if (pa7.t((String) zk8Var.d, str)) {
                zk8Var.d = null;
                zk8Var.a = false;
                zk8Var.b = false;
                zk8Var.c = false;
            }
            this.n = null;
            o(false);
            lyd lydVar2 = this.o;
            if (lydVar2 != null && lydVar2.b() && (lydVar = this.o) != null) {
                lydVar.h(null);
            }
            this.o = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum j(String str, zn2 zn2Var) {
        q9d q9dVar;
        y7d y7dVar;
        String str2;
        y7d y7dVar2;
        if (zn2Var instanceof q9d) {
            q9dVar = (q9d) zn2Var;
            int i = q9dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                q9dVar.label = i - Integer.MIN_VALUE;
            } else {
                q9dVar = new q9d(this, zn2Var);
            }
        } else {
            q9dVar = new q9d(this, zn2Var);
        }
        Object objP0 = q9dVar.result;
        int i2 = q9dVar.label;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(objP0);
            js3 js3Var = ga4.a;
            hr3 hr3Var = hr3.c;
            r9d r9dVar = new r9d(this, str, null);
            q9dVar.L$0 = str;
            q9dVar.label = 1;
            objP0 = ynb.p0(hr3Var, r9dVar, q9dVar);
            if (objP0 != bw2Var) {
            }
            return bw2Var;
        }
        if (i2 == 1) {
            str = (String) q9dVar.L$0;
            jzb.q(objP0);
        } else {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y7dVar2 = (y7d) q9dVar.L$1;
            str2 = (String) q9dVar.L$0;
            jzb.q(objP0);
        }
        y7dVar = y7dVar2;
        str = str2;
        i(str);
        return y7dVar.b;
        y7dVar = (y7d) objP0;
        int iOrdinal = y7dVar.b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    ap.c();
                    return null;
                }
                e95 e95Var = y7dVar.a;
                if (e95Var != null) {
                    if (e95Var.h == null) {
                        e95Var = null;
                    }
                    if (e95Var != null) {
                        q9dVar.L$0 = str;
                        q9dVar.L$1 = y7dVar;
                        q9dVar.L$2 = null;
                        q9dVar.label = 2;
                        if (b(e95Var, dbd.b, q9dVar) != bw2Var) {
                            str2 = str;
                            y7dVar2 = y7dVar;
                            y7dVar = y7dVar2;
                            str = str2;
                        }
                        return bw2Var;
                    }
                }
                i(str);
            } else if (pa7.t(this.n, str)) {
                str.getClass();
                zk8 zk8Var = this.k;
                if (pa7.t((String) zk8Var.d, str)) {
                    zk8Var.d = null;
                    zk8Var.a = false;
                    zk8Var.b = false;
                    zk8Var.c = false;
                }
                o(false);
            }
        }
        return y7dVar.b;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae A[PHI: r7 r12
  0x00ae: PHI (r7v2 long) = (r7v3 long), (r7v5 long) binds: [B:40:0x00ab, B:16:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r12v2 java.lang.String) = (r12v3 java.lang.String), (r12v10 java.lang.String) binds: [B:40:0x00ab, B:16:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r13 == r6) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        if (r13 == r6) goto L44;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c3 -> B:45:0x00c6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.String r12, defpackage.zn2 r13) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bad.k(java.lang.String, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
    
        if (b(r12, defpackage.dbd.b, r0) == r7) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.zn2 r12) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bad.l(zn2):java.lang.Object");
    }

    public final void m() {
        Boolean bool;
        e89 e89Var = this.i;
        l7a l7aVar = (l7a) e89Var.getValue();
        if (l7aVar == null || (bool = l7aVar.b) == null) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        o7a o7aVar = l7aVar.a;
        if (!zBooleanValue) {
            e89Var.setValue(null);
            o(true);
            d(o7aVar);
            return;
        }
        int iIndexOf = this.c.c.indexOf(o7aVar.getFormat());
        if (iIndexOf < 0) {
            e89Var.setValue(null);
            o(true);
            d(o7aVar);
            return;
        }
        pad padVar = this.d;
        if (padVar.d(iIndexOf)) {
            w7d w7dVarA = padVar.a(iIndexOf);
            e89Var.setValue(null);
            o(true);
            if (w7dVarA == null) {
                d(o7aVar);
                return;
            }
            boolean z = o7aVar instanceof m7a;
            qn2 qn2Var = this.j;
            if (z) {
                ynb.V(qn2Var, null, null, new y9d(this, w7dVarA, null), 3);
            } else if (o7aVar instanceof n7a) {
                ynb.V(qn2Var, null, null, new x9d(this, w7dVarA, o7aVar, null), 3);
            } else {
                ap.c();
            }
        }
    }

    public final void n(String str) {
        this.n = str;
        o(true);
        lyd lydVar = this.o;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.o = ynb.V(this.j, null, null, new z9d(this, str, null), 3);
    }

    public final void o(boolean z) {
        this.q.setValue(Boolean.valueOf(z));
    }
}

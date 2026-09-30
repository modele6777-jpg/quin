package defpackage;

import android.webkit.MimeTypeMap;
import com.adjust.sdk.sig.r3;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wd9 implements pc5 {
    public final String a;
    public final as9 b;
    public final ace c;
    public final ace d;
    public final ace e;
    public final b37 f;
    public final ace g;

    public wd9(String str, as9 as9Var, ace aceVar, ace aceVar2, ace aceVar3, b37 b37Var, ace aceVar4) {
        this.a = str;
        this.b = as9Var;
        this.c = aceVar;
        this.d = aceVar2;
        this.e = aceVar3;
        this.f = b37Var;
        this.g = aceVar4;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    public static String d(String str, String str2) {
        String mimeTypeFromExtension;
        if (str2 == null || c5e.C(str2, "text/plain", false)) {
            if (v4e.Q(str)) {
                mimeTypeFromExtension = null;
            } else {
                String strK0 = v4e.k0(v4e.k0(str, '#'), '?');
                String strG0 = v4e.g0('.', v4e.g0('/', strK0, strK0), "");
                if (v4e.Q(strG0)) {
                    mimeTypeFromExtension = null;
                } else {
                    String lowerCase = strG0.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    mimeTypeFromExtension = (String) rv8.a.get(lowerCase);
                    if (mimeTypeFromExtension == null) {
                        mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                    }
                }
            }
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        if (str2 != null) {
            return v4e.i0(str2, ';');
        }
        return null;
    }

    @Override // defpackage.pc5
    public final Object a(pv4 pv4Var) {
        dbf dbfVar = (dbf) this.g.getValue();
        String str = this.b.e;
        vx7 vx7Var = new vx7(1, this, wd9.class, "doFetch", "doFetch(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 6);
        dbfVar.getClass();
        return vx7Var.d(pv4Var);
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bd A[Catch: Exception -> 0x0051, PHI: r0 r1
  0x01bd: PHI (r0v31 java.lang.Object) = (r0v20 java.lang.Object), (r0v1 java.lang.Object) binds: [B:83:0x01ba, B:22:0x006a] A[DONT_GENERATE, DONT_INLINE]
  0x01bd: PHI (r1v10 mmb) = (r1v8 mmb), (r1v22 mmb) binds: [B:83:0x01ba, B:22:0x006a] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {Exception -> 0x0051, blocks: (B:15:0x004c, B:90:0x01e5, B:22:0x006a, B:85:0x01bd, B:87:0x01c1, B:58:0x013c, B:60:0x0142, B:67:0x0151, B:69:0x016b, B:70:0x0170, B:75:0x017c, B:77:0x0184, B:80:0x0193, B:81:0x0198, B:82:0x0199, B:41:0x00c1, B:43:0x00c8, B:45:0x00d6, B:52:0x0108, B:54:0x0114, B:48:0x00ec, B:50:0x00f6, B:72:0x0173, B:73:0x017a), top: B:102:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c1 A[Catch: Exception -> 0x0051, TryCatch #3 {Exception -> 0x0051, blocks: (B:15:0x004c, B:90:0x01e5, B:22:0x006a, B:85:0x01bd, B:87:0x01c1, B:58:0x013c, B:60:0x0142, B:67:0x0151, B:69:0x016b, B:70:0x0170, B:75:0x017c, B:77:0x0184, B:80:0x0193, B:81:0x0198, B:82:0x0199, B:41:0x00c1, B:43:0x00c8, B:45:0x00d6, B:52:0x0108, B:54:0x0114, B:48:0x00ec, B:50:0x00f6, B:72:0x0173, B:73:0x017a), top: B:102:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e2, code lost:
    
        if (r0 == r12) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.xn2 r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd9.b(xn2):java.lang.Object");
    }

    public final zd5 c() {
        zd5 zd5Var;
        gib gibVar = (gib) this.d.getValue();
        return (gibVar == null || (zd5Var = gibVar.a) == null) ? this.b.f : zd5Var;
    }

    public final ae9 e() {
        q95 q95Var = uw6.b;
        as9 as9Var = this.b;
        xd9 xd9Var = (xd9) b21.A(as9Var, q95Var);
        xd9Var.getClass();
        m6c m6cVar = new m6c(xd9Var);
        m81 m81Var = as9Var.h;
        boolean zA = m81Var.a();
        boolean z = as9Var.i.a() && ((ok2) this.f.getValue()).a();
        if (!z && zA) {
            m6cVar.P("only-if-cached, max-stale=2147483647");
        } else if (!z || zA) {
            if (!z && !zA) {
                m6cVar.P("no-cache, only-if-cached");
            }
        } else if (m81Var.b()) {
            m6cVar.P("no-cache");
        } else {
            m6cVar.P("no-cache, no-store");
        }
        String str = (String) b21.A(as9Var, uw6.a);
        xd9 xd9Var2 = new xd9(bm8.X((LinkedHashMap) m6cVar.b));
        if (b21.A(as9Var, uw6.c) == null) {
            return new ae9(this.a, str, xd9Var2, as9Var.j);
        }
        r3.f();
        return null;
    }

    public final kd5 f(fib fibVar) {
        r94 r94Var = fibVar.a;
        if (r94Var.b) {
            qc0.p("snapshot is closed");
            return null;
        }
        e1a e1aVar = (e1a) r94Var.a.c.get(1);
        zd5 zd5VarC = c();
        String str = this.b.e;
        if (str == null) {
            str = this.a;
        }
        return rxg.g(e1aVar, zd5VarC, str, fibVar, 16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(utd utdVar, zn2 zn2Var) {
        td9 td9Var;
        f41 f41Var;
        if (zn2Var instanceof td9) {
            td9Var = (td9) zn2Var;
            int i = td9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                td9Var.label = i - Integer.MIN_VALUE;
            } else {
                td9Var = new td9(this, zn2Var);
            }
        } else {
            td9Var = new td9(this, zn2Var);
        }
        Object obj = td9Var.result;
        int i2 = td9Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            f41 f41Var2 = new f41();
            td9Var.L$0 = null;
            td9Var.L$1 = f41Var2;
            td9Var.label = 1;
            utdVar.a.a0(f41Var2);
            wef wefVar = wef.a;
            bw2 bw2Var = bw2.a;
            if (wefVar == bw2Var) {
                return bw2Var;
            }
            f41Var = f41Var2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f41Var = (f41) td9Var.L$1;
            jzb.q(obj);
        }
        return rxg.i(f41Var, c());
    }

    public final me9 h(fib fibVar) throws Throwable {
        Throwable th;
        me9 me9VarE;
        try {
            zd5 zd5VarC = c();
            r94 r94Var = fibVar.a;
            if (r94Var.b) {
                throw new IllegalStateException("snapshot is closed");
            }
            yhb yhbVarO = bzd.o(zd5VarC.h0((e1a) r94Var.a.c.get(0)));
            try {
                me9VarE = y7h.E(yhbVarO);
                try {
                    yhbVarO.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    yhbVarO.close();
                } catch (Throwable th4) {
                    bzd.m(th3, th4);
                }
                th = th3;
                me9VarE = null;
            }
            if (th == null) {
                return me9VarE;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x025f A[Catch: Exception -> 0x0056, TryCatch #10 {Exception -> 0x0056, blocks: (B:13:0x0051, B:110:0x023b, B:117:0x0246, B:118:0x024e, B:120:0x025c, B:122:0x025f, B:125:0x0266, B:126:0x0267, B:119:0x024f), top: B:158:0x0051, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0282  */
    /* JADX WARN: Code duplicated, block: B:152:0x024f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0272 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x027c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26 */
    public final Object i(fib fibVar, me9 me9Var, me9 me9Var2, zn2 zn2Var) {
        ud9 ud9Var;
        me9 me9Var3;
        eib eibVar;
        eib eibVar2;
        ?? th;
        ?? th2;
        zi0 zi0VarH;
        utd utdVar;
        utd utdVar2;
        zi0 zi0Var;
        x94 x94Var;
        r94 r94VarL;
        fib fibVar2 = fibVar;
        me9 me9Var4 = me9Var2;
        if (zn2Var instanceof ud9) {
            ud9Var = (ud9) zn2Var;
            int i = ud9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ud9Var.label = i - Integer.MIN_VALUE;
            } else {
                ud9Var = new ud9(this, zn2Var);
            }
        } else {
            ud9Var = new ud9(this, zn2Var);
        }
        Object o81Var = ud9Var.result;
        bw2 bw2Var = bw2.a;
        int i2 = ud9Var.label;
        eib eibVar3 = null;
        if (i2 == 0) {
            jzb.q(o81Var);
            if (!this.b.h.b()) {
                if (fibVar2 != null) {
                    try {
                        tec.y(fibVar2);
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
            p81 p81Var = (p81) this.e.getValue();
            ud9Var.L$0 = fibVar2;
            ud9Var.L$1 = null;
            ud9Var.L$2 = null;
            ud9Var.L$3 = me9Var4;
            ud9Var.label = 1;
            ((op3) p81Var).getClass();
            int i3 = me9Var4.a;
            if (i3 != 304 || me9Var == null) {
                o81Var = ((200 > i3 || i3 >= 300) && !op3.b.contains(new Integer(i3))) ? o81.b : new o81(me9Var4);
            } else {
                xd9 xd9Var = me9Var.d;
                xd9 xd9Var2 = me9Var4.d;
                xd9Var.getClass();
                Map map = xd9Var.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), s72.l1((Collection) entry.getValue()));
                }
                for (Map.Entry entry2 : xd9Var2.a.entrySet()) {
                    String str = (String) entry2.getKey();
                    List list = (List) entry2.getValue();
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    linkedHashMap.put(lowerCase, s72.l1(list));
                }
                o81Var = new o81(new me9(me9Var4.a, me9Var4.b, me9Var4.c, new xd9(bm8.X(linkedHashMap)), null, me9Var4.f));
            }
            if (o81Var != bw2Var) {
            }
            return bw2Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eibVar2 = (eib) ud9Var.L$6;
            me9Var3 = (me9) ud9Var.L$5;
            me9Var4 = (me9) ud9Var.L$3;
            try {
                jzb.q(o81Var);
                zi0Var = eibVar2.a;
                x94Var = (x94) zi0Var.d;
                synchronized (x94Var.v) {
                    zi0Var.h(true);
                    r94VarL = x94Var.l(((p94) zi0Var.b).a);
                }
                if (r94VarL != null) {
                    return new fib(r94VarL);
                }
                return eibVar3;
            } catch (Exception e2) {
                e = e2;
                try {
                    eibVar2.a.h(false);
                } catch (Exception unused2) {
                }
                utdVar = me9Var4.e;
                if (utdVar != null) {
                    try {
                        tec.y(utdVar);
                    } catch (RuntimeException e3) {
                        throw e3;
                    } catch (Exception unused3) {
                    }
                }
                utdVar2 = me9Var3.e;
                if (utdVar2 != null) {
                    throw e;
                }
                try {
                    tec.y(utdVar2);
                    throw e;
                } catch (RuntimeException e4) {
                    throw e4;
                } catch (Exception unused4) {
                    throw e;
                }
            }
        }
        me9 me9Var5 = (me9) ud9Var.L$3;
        fib fibVar3 = (fib) ud9Var.L$0;
        jzb.q(o81Var);
        me9Var4 = me9Var5;
        fibVar2 = fibVar3;
        eibVar3 = null;
        me9Var3 = ((o81) o81Var).a;
        if (me9Var3 == null) {
            return eibVar3;
        }
        if (fibVar2 != null) {
            r94 r94Var = fibVar2.a;
            x94 x94Var2 = r94Var.c;
            synchronized (x94Var2.v) {
                r94Var.close();
                zi0VarH = x94Var2.h(r94Var.a.a);
            }
            if (zi0VarH != null) {
                eibVar = new eib(zi0VarH);
            } else {
                eibVar = eibVar3;
            }
        } else {
            gib gibVar = (gib) this.d.getValue();
            if (gibVar == null) {
                eibVar = eibVar3;
            } else {
                String str2 = this.b.e;
                if (str2 == null) {
                    str2 = this.a;
                }
                x94 x94Var3 = gibVar.b;
                a71 a71Var = a71.c;
                zi0 zi0VarH2 = x94Var3.h(m8c.u(str2).c("SHA-256").g());
                if (zi0VarH2 != null) {
                    eibVar = new eib(zi0VarH2);
                } else {
                    eibVar = eibVar3;
                }
            }
        }
        if (eibVar == null) {
            return eibVar3;
        }
        try {
            xhb xhbVarN = bzd.n(c().g0(eibVar.a.m(0), false));
            try {
                y7h.Y(me9Var3, xhbVarN);
                try {
                    xhbVarN.close();
                    th = eibVar3;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    xhbVarN.close();
                } catch (Throwable th5) {
                    bzd.m(th4, th5);
                }
                th = th4;
            }
            if (th != 0) {
                throw th;
            }
            utd utdVar3 = me9Var3.e;
            if (utdVar3 != null) {
                zd5 zd5VarC = c();
                e1a e1aVarM = eibVar.a.m(1);
                eibVar3 = eibVar3;
                ud9Var.L$0 = eibVar3;
                ud9Var.L$1 = eibVar3;
                ud9Var.L$2 = eibVar3;
                ud9Var.L$3 = me9Var4;
                ud9Var.L$4 = eibVar3;
                ud9Var.L$5 = me9Var3;
                ud9Var.L$6 = eibVar;
                ud9Var.label = 2;
                v41 v41Var = utdVar3.a;
                xhb xhbVarN2 = bzd.n(zd5VarC.g0(e1aVarM, false));
                try {
                    new Long(v41Var.a0(xhbVarN2));
                    try {
                        xhbVarN2.close();
                        th2 = eibVar3;
                    } catch (Throwable th6) {
                        th2 = th6;
                    }
                } catch (Throwable th7) {
                    try {
                        xhbVarN2.close();
                    } catch (Throwable th8) {
                        bzd.m(th7, th8);
                    }
                    th2 = th7;
                }
                if (th2 != 0) {
                    throw th2;
                }
                wef wefVar = wef.a;
                if (wefVar != bw2Var) {
                    eibVar2 = eibVar;
                    o81Var = wefVar;
                }
                return bw2Var;
            }
            eibVar3 = eibVar3;
            eibVar2 = eibVar;
            zi0Var = eibVar2.a;
            x94Var = (x94) zi0Var.d;
            synchronized (x94Var.v) {
                zi0Var.h(true);
                r94VarL = x94Var.l(((p94) zi0Var.b).a);
                if (r94VarL != null) {
                    return new fib(r94VarL);
                }
                return eibVar3;
            }
        } catch (Exception e5) {
            e = e5;
            eibVar2 = eibVar;
            eibVar2.a.h(false);
            utdVar = me9Var4.e;
            if (utdVar != null) {
                tec.y(utdVar);
            }
            utdVar2 = me9Var3.e;
            if (utdVar2 != null) {
                throw e;
            }
            tec.y(utdVar2);
            throw e;
        }
    }
}

package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x94 implements AutoCloseable {
    public static final rob G0 = new rob("[a-z0-9_-]{1,120}");
    public boolean E0;
    public final u94 F0;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final e1a a;
    public final long b;
    public final e1a c;
    public final e1a d;
    public final e1a e;
    public final LinkedHashMap f;
    public final qn2 g;
    public final Object v;
    public long w;
    public int x;
    public xhb y;
    public boolean z;

    public x94(long j, zd5 zd5Var, e1a e1aVar) {
        this.a = e1aVar;
        this.b = j;
        if (j <= 0) {
            qc0.j("maxSize <= 0");
            throw null;
        }
        this.c = e1aVar.e("journal");
        this.d = e1aVar.e("journal.tmp");
        this.e = e1aVar.e("journal.bkp");
        this.f = new LinkedHashMap(0, 0.75f, true);
        t8e t8eVarD = iqf.d();
        js3 js3Var = ga4.a;
        hr3 hr3Var = hr3.c;
        rv2 rv2Var = sv2.b;
        this.g = jgb.k(i7h.I(t8eVarD, hr3Var.c1(1)));
        this.v = new Object();
        this.F0 = new u94(zd5Var);
    }

    public static void W(String str) {
        if (G0.g(str)) {
            return;
        }
        qc0.o(ib8.j("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
    }

    public final void E() {
        Iterator it = this.f.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            p94 p94Var = (p94) it.next();
            int i = 0;
            if (p94Var.g == null) {
                while (i < 2) {
                    j += p94Var.b[i];
                    i++;
                }
            } else {
                p94Var.g = null;
                while (i < 2) {
                    e1a e1aVar = (e1a) p94Var.c.get(i);
                    u94 u94Var = this.F0;
                    u94Var.E(e1aVar);
                    u94Var.E((e1a) p94Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.w = j;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    public final void G() throws Throwable {
        u94 u94Var = this.F0;
        zd5 zd5Var = u94Var.c;
        e1a e1aVar = this.c;
        yhb yhbVarO = bzd.o(zd5Var.h0(e1aVar));
        try {
            String strG0 = yhbVarO.g0(Long.MAX_VALUE);
            String strG1 = yhbVarO.g0(Long.MAX_VALUE);
            String strG2 = yhbVarO.g0(Long.MAX_VALUE);
            String strG3 = yhbVarO.g0(Long.MAX_VALUE);
            String strG4 = yhbVarO.g0(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strG0) || !"1".equals(strG1) || !pa7.t(String.valueOf(3), strG2) || !pa7.t(String.valueOf(2), strG3) || strG4.length() > 0) {
                throw new IOException("unexpected journal header: [" + strG0 + ", " + strG1 + ", " + strG2 + ", " + strG3 + ", " + strG4 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    N(yhbVarO.g0(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.x = i - this.f.size();
                    if (yhbVarO.b()) {
                        this.y = new xhb(new wa5(u94Var.b(e1aVar), new ot1(17, this)));
                    } else {
                        g0();
                    }
                    try {
                        yhbVarO.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th == null) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                yhbVarO.close();
            } catch (Throwable th3) {
                bzd.m(th, th3);
            }
            if (th == null) {
                throw th;
            }
        }
    }

    public final void N(String str) throws IOException {
        String strSubstring;
        int iN = v4e.N(str, ' ', 0, 6);
        if (iN == -1) {
            yg5.m("unexpected journal line: ".concat(str));
            return;
        }
        int i = iN + 1;
        int iN2 = v4e.N(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.f;
        if (iN2 == -1) {
            strSubstring = str.substring(i);
            if (iN == 6 && c5e.C(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iN2);
        }
        Object p94Var = linkedHashMap.get(strSubstring);
        if (p94Var == null) {
            p94Var = new p94(this, strSubstring);
            linkedHashMap.put(strSubstring, p94Var);
        }
        p94 p94Var2 = (p94) p94Var;
        if (iN2 == -1 || iN != 5 || !c5e.C(str, "CLEAN", false)) {
            if (iN2 == -1 && iN == 5 && c5e.C(str, "DIRTY", false)) {
                p94Var2.g = new zi0(this, p94Var2);
                return;
            } else {
                if (iN2 == -1 && iN == 4 && c5e.C(str, "READ", false)) {
                    return;
                }
                yg5.m("unexpected journal line: ".concat(str));
                return;
            }
        }
        List listD0 = v4e.d0(str.substring(iN2 + 1), new char[]{' '}, 6);
        p94Var2.e = true;
        p94Var2.g = null;
        if (listD0.size() != 2) {
            s8f.p(listD0, "unexpected journal line: ");
            return;
        }
        try {
            int size = listD0.size();
            for (int i2 = 0; i2 < size; i2++) {
                p94Var2.b[i2] = Long.parseLong((String) listD0.get(i2));
            }
        } catch (NumberFormatException unused) {
            s8f.p(listD0, "unexpected journal line: ");
        }
    }

    public final void R(p94 p94Var) {
        xhb xhbVar;
        int i = p94Var.h;
        String str = p94Var.a;
        if (i > 0 && (xhbVar = this.y) != null) {
            xhbVar.i0("DIRTY");
            xhbVar.writeByte(32);
            xhbVar.i0(str);
            xhbVar.writeByte(10);
            xhbVar.flush();
        }
        if (p94Var.h > 0 || p94Var.g != null) {
            p94Var.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.F0.E((e1a) p94Var.c.get(i2));
            long j = this.w;
            long[] jArr = p94Var.b;
            this.w = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.x++;
        xhb xhbVar2 = this.y;
        if (xhbVar2 != null) {
            xhbVar2.i0("REMOVE");
            xhbVar2.writeByte(32);
            xhbVar2.i0(str);
            xhbVar2.writeByte(10);
            xhbVar2.flush();
        }
        this.f.remove(str);
        if (this.x >= 2000) {
            x();
        }
    }

    public final void U() {
        while (this.w > this.b) {
            for (p94 p94Var : this.f.values()) {
                if (!p94Var.f) {
                    R(p94Var);
                }
            }
            return;
        }
        this.Z = false;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0111 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:16:0x0032, B:24:0x0040, B:27:0x005a, B:29:0x0069, B:31:0x0079, B:33:0x0080, B:28:0x005e, B:37:0x00a0, B:39:0x00a7, B:42:0x00ac, B:44:0x00bd, B:47:0x00c2, B:52:0x00fd, B:54:0x0108, B:58:0x0111, B:48:0x00da, B:50:0x00ef, B:51:0x00fa, B:36:0x0090, B:61:0x0116, B:62:0x011d), top: B:65:0x0003 }] */
    public final void b(zi0 zi0Var, boolean z) {
        synchronized (this.v) {
            p94 p94Var = (p94) zi0Var.b;
            if (!pa7.t(p94Var.g, zi0Var)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z || p94Var.f) {
                for (int i = 0; i < 2; i++) {
                    this.F0.E((e1a) p94Var.d.get(i));
                }
            } else {
                for (int i2 = 0; i2 < 2; i2++) {
                    if (((boolean[]) zi0Var.c)[i2] && !this.F0.G((e1a) p94Var.d.get(i2))) {
                        zi0Var.h(false);
                        return;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    e1a e1aVar = (e1a) p94Var.d.get(i3);
                    e1a e1aVar2 = (e1a) p94Var.c.get(i3);
                    boolean zG = this.F0.G(e1aVar);
                    u94 u94Var = this.F0;
                    if (zG) {
                        u94Var.h(e1aVar, e1aVar2);
                    } else {
                        qk2.x(u94Var, (e1a) p94Var.c.get(i3));
                    }
                    long j = p94Var.b[i3];
                    Long l = (Long) this.F0.R(e1aVar2).e;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    p94Var.b[i3] = jLongValue;
                    this.w = (this.w - j) + jLongValue;
                }
            }
            p94Var.g = null;
            if (p94Var.f) {
                R(p94Var);
                return;
            }
            this.x++;
            xhb xhbVar = this.y;
            xhbVar.getClass();
            if (z || p94Var.e) {
                p94Var.e = true;
                xhbVar.i0("CLEAN");
                xhbVar.writeByte(32);
                xhbVar.i0(p94Var.a);
                for (long j2 : p94Var.b) {
                    xhbVar.writeByte(32);
                    xhbVar.T0(j2);
                }
                xhbVar.writeByte(10);
            } else {
                this.f.remove(p94Var.a);
                xhbVar.i0("REMOVE");
                xhbVar.writeByte(32);
                xhbVar.i0(p94Var.a);
                xhbVar.writeByte(10);
            }
            xhbVar.flush();
            if (this.w > this.b) {
                x();
            } else if (this.x >= 2000) {
                x();
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.v) {
            try {
                if (this.X && !this.Y) {
                    for (p94 p94Var : (p94[]) this.f.values().toArray(new p94[0])) {
                        zi0 zi0Var = p94Var.g;
                        if (zi0Var != null) {
                            p94 p94Var2 = (p94) zi0Var.b;
                            if (pa7.t(p94Var2.g, zi0Var)) {
                                p94Var2.f = true;
                            }
                        }
                    }
                    U();
                    jgb.I(this.g, null);
                    xhb xhbVar = this.y;
                    xhbVar.getClass();
                    xhbVar.close();
                    this.y = null;
                    this.Y = true;
                    return;
                }
                this.Y = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g0() {
        Throwable th;
        synchronized (this.v) {
            try {
                xhb xhbVar = this.y;
                if (xhbVar != null) {
                    xhbVar.close();
                }
                xhb xhbVarN = bzd.n(this.F0.g0(this.d, false));
                try {
                    xhbVarN.i0("libcore.io.DiskLruCache");
                    xhbVarN.writeByte(10);
                    xhbVarN.i0("1");
                    xhbVarN.writeByte(10);
                    xhbVarN.T0(3L);
                    xhbVarN.writeByte(10);
                    xhbVarN.T0(2L);
                    xhbVarN.writeByte(10);
                    xhbVarN.writeByte(10);
                    for (p94 p94Var : this.f.values()) {
                        if (p94Var.g != null) {
                            xhbVarN.i0("DIRTY");
                            xhbVarN.writeByte(32);
                            xhbVarN.i0(p94Var.a);
                            xhbVarN.writeByte(10);
                        } else {
                            xhbVarN.i0("CLEAN");
                            xhbVarN.writeByte(32);
                            xhbVarN.i0(p94Var.a);
                            for (long j : p94Var.b) {
                                xhbVarN.writeByte(32);
                                xhbVarN.T0(j);
                            }
                            xhbVarN.writeByte(10);
                        }
                    }
                    try {
                        xhbVarN.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        xhbVarN.close();
                    } catch (Throwable th4) {
                        bzd.m(th3, th4);
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                boolean zG = this.F0.G(this.c);
                u94 u94Var = this.F0;
                if (zG) {
                    u94Var.h(this.c, this.e);
                    this.F0.h(this.d, this.c);
                    this.F0.x(this.e);
                } else {
                    u94Var.h(this.d, this.c);
                }
                this.y = new xhb(new wa5(this.F0.b(this.c), new ot1(17, this)));
                this.x = 0;
                this.z = false;
                this.E0 = false;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public final zi0 h(String str) {
        synchronized (this.v) {
            if (this.Y) {
                throw new IllegalStateException("cache is closed");
            }
            W(str);
            u();
            p94 p94Var = (p94) this.f.get(str);
            if ((p94Var != null ? p94Var.g : null) != null) {
                return null;
            }
            if (p94Var != null && p94Var.h != 0) {
                return null;
            }
            if (!this.Z && !this.E0) {
                xhb xhbVar = this.y;
                xhbVar.getClass();
                xhbVar.i0("DIRTY");
                xhbVar.writeByte(32);
                xhbVar.i0(str);
                xhbVar.writeByte(10);
                xhbVar.flush();
                if (this.z) {
                    return null;
                }
                if (p94Var == null) {
                    p94Var = new p94(this, str);
                    this.f.put(str, p94Var);
                }
                zi0 zi0Var = new zi0(this, p94Var);
                p94Var.g = zi0Var;
                return zi0Var;
            }
            x();
            return null;
        }
    }

    public final r94 l(String str) {
        r94 r94VarA;
        synchronized (this.v) {
            if (this.Y) {
                throw new IllegalStateException("cache is closed");
            }
            W(str);
            u();
            p94 p94Var = (p94) this.f.get(str);
            if (p94Var != null && (r94VarA = p94Var.a()) != null) {
                boolean z = true;
                this.x++;
                xhb xhbVar = this.y;
                xhbVar.getClass();
                xhbVar.i0("READ");
                xhbVar.writeByte(32);
                xhbVar.i0(str);
                xhbVar.writeByte(10);
                xhbVar.flush();
                if (this.x < 2000) {
                    z = false;
                }
                if (z) {
                    x();
                }
                return r94VarA;
            }
            return null;
        }
    }

    public final void u() {
        synchronized (this.v) {
            try {
                if (this.X) {
                    return;
                }
                this.F0.x(this.d);
                if (this.F0.G(this.e)) {
                    boolean zG = this.F0.G(this.c);
                    u94 u94Var = this.F0;
                    e1a e1aVar = this.e;
                    if (zG) {
                        u94Var.x(e1aVar);
                    } else {
                        u94Var.h(e1aVar, this.c);
                    }
                }
                if (this.F0.G(this.c)) {
                    try {
                        G();
                        E();
                        this.X = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            qk2.y(this.F0, this.a);
                            this.Y = false;
                            g0();
                            this.X = true;
                        } catch (Throwable th) {
                            this.Y = false;
                            throw th;
                        }
                    }
                }
                g0();
                this.X = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void x() {
        ynb.V(this.g, null, null, new v94(this, null), 3);
    }
}

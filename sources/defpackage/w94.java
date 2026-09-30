package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w94 implements Closeable, Flushable {
    public static final rob I0 = new rob("[a-z0-9_-]{1,120}");
    public static final String J0 = "CLEAN";
    public static final String K0 = "DIRTY";
    public static final String L0 = "REMOVE";
    public static final String M0 = "READ";
    public boolean E0;
    public long F0;
    public final jle G0;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final e1a a;
    public final t94 b;
    public final e1a d;
    public final e1a e;
    public final e1a f;
    public long g;
    public xhb v;
    public int x;
    public boolean y;
    public boolean z;
    public final long c = 268435456;
    public final LinkedHashMap w = new LinkedHashMap(0, 0.75f, true);
    public final s94 H0 = new s94(0, this, ks0.l(new StringBuilder(), keg.b, " Cache"));

    public w94(zd5 zd5Var, e1a e1aVar, kle kleVar) {
        this.a = e1aVar;
        this.b = new t94(zd5Var);
        this.G0 = kleVar.d();
        this.d = e1aVar.e("journal");
        this.e = e1aVar.e("journal.tmp");
        this.f = e1aVar.e("journal.bkp");
    }

    public static void h0(String str) {
        if (I0.g(str)) {
            return;
        }
        qc0.o(ks0.g('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    public final boolean E() {
        int i = this.x;
        return i >= 2000 && i >= this.w.size();
    }

    public final void G() {
        e1a e1aVar = this.e;
        t94 t94Var = this.b;
        ieg.d(t94Var, e1aVar);
        Iterator it = this.w.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            o94 o94Var = (o94) next;
            int i = 0;
            if (o94Var.g == null) {
                while (i < 2) {
                    this.g += o94Var.b[i];
                    i++;
                }
            } else {
                o94Var.g = null;
                while (i < 2) {
                    ieg.d(t94Var, (e1a) o94Var.c.get(i));
                    ieg.d(t94Var, (e1a) o94Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    public final void N() throws Throwable {
        t94 t94Var = this.b;
        e1a e1aVar = this.d;
        yhb yhbVarO = bzd.o(t94Var.h0(e1aVar));
        try {
            String strG0 = yhbVarO.g0(Long.MAX_VALUE);
            String strG1 = yhbVarO.g0(Long.MAX_VALUE);
            String strG2 = yhbVarO.g0(Long.MAX_VALUE);
            String strG3 = yhbVarO.g0(Long.MAX_VALUE);
            String strG4 = yhbVarO.g0(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strG0) || !"1".equals(strG1) || !pa7.t(String.valueOf(201105), strG2) || !pa7.t(String.valueOf(2), strG3) || strG4.length() > 0) {
                throw new IOException("unexpected journal header: [" + strG0 + ", " + strG1 + ", " + strG3 + ", " + strG4 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    R(yhbVarO.g0(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.x = i - this.w.size();
                    if (yhbVarO.b()) {
                        xhb xhbVar = this.v;
                        if (xhbVar != null) {
                            ieg.b(xhbVar);
                        }
                        t94Var.getClass();
                        e1aVar.getClass();
                        this.v = new xhb(new va5(t94Var.b(e1aVar), new ot1(16, this)));
                    } else {
                        U();
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

    public final void R(String str) throws IOException {
        String strSubstring;
        int iN = v4e.N(str, ' ', 0, 6);
        if (iN == -1) {
            yg5.m("unexpected journal line: ".concat(str));
            return;
        }
        int i = iN + 1;
        int iN2 = v4e.N(str, ' ', i, 4);
        LinkedHashMap linkedHashMap = this.w;
        if (iN2 == -1) {
            strSubstring = str.substring(i);
            String str2 = L0;
            if (iN == str2.length() && c5e.C(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iN2);
        }
        o94 o94Var = (o94) linkedHashMap.get(strSubstring);
        if (o94Var == null) {
            o94Var = new o94(this, strSubstring);
            linkedHashMap.put(strSubstring, o94Var);
        }
        if (iN2 != -1) {
            String str3 = J0;
            if (iN == str3.length() && c5e.C(str, str3, false)) {
                List listD0 = v4e.d0(str.substring(iN2 + 1), new char[]{' '}, 6);
                o94Var.e = true;
                o94Var.g = null;
                int size = listD0.size();
                o94Var.j.getClass();
                if (size != 2) {
                    s8f.p(listD0, "unexpected journal line: ");
                    return;
                }
                try {
                    int size2 = listD0.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        o94Var.b[i2] = Long.parseLong((String) listD0.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    s8f.p(listD0, "unexpected journal line: ");
                    return;
                }
            }
        }
        if (iN2 == -1) {
            String str4 = K0;
            if (iN == str4.length() && c5e.C(str, str4, false)) {
                o94Var.g = new zi0(this, o94Var);
                return;
            }
        }
        if (iN2 == -1) {
            String str5 = M0;
            if (iN == str5.length() && c5e.C(str, str5, false)) {
                return;
            }
        }
        yg5.m("unexpected journal line: ".concat(str));
    }

    public final synchronized void U() {
        Throwable th;
        try {
            xhb xhbVar = this.v;
            if (xhbVar != null) {
                xhbVar.close();
            }
            xhb xhbVarN = bzd.n(this.b.g0(this.e, false));
            try {
                xhbVarN.i0("libcore.io.DiskLruCache");
                xhbVarN.writeByte(10);
                xhbVarN.i0("1");
                xhbVarN.writeByte(10);
                xhbVarN.T0(201105L);
                xhbVarN.writeByte(10);
                xhbVarN.T0(2L);
                xhbVarN.writeByte(10);
                xhbVarN.writeByte(10);
                for (Object obj : this.w.values()) {
                    obj.getClass();
                    o94 o94Var = (o94) obj;
                    if (o94Var.g != null) {
                        xhbVarN.i0(K0);
                        xhbVarN.writeByte(32);
                        xhbVarN.i0(o94Var.a);
                        xhbVarN.writeByte(10);
                    } else {
                        xhbVarN.i0(J0);
                        xhbVarN.writeByte(32);
                        xhbVarN.i0(o94Var.a);
                        for (long j : o94Var.b) {
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
            boolean zG = this.b.G(this.d);
            t94 t94Var = this.b;
            if (zG) {
                t94Var.h(this.d, this.f);
                this.b.h(this.e, this.d);
                ieg.d(this.b, this.f);
            } else {
                t94Var.h(this.e, this.d);
            }
            xhb xhbVar2 = this.v;
            if (xhbVar2 != null) {
                ieg.b(xhbVar2);
            }
            t94 t94Var2 = this.b;
            e1a e1aVar = this.d;
            t94Var2.getClass();
            e1aVar.getClass();
            this.v = new xhb(new va5(t94Var2.b(e1aVar), new ot1(16, this)));
            this.y = false;
            this.E0 = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final void W(o94 o94Var) {
        xhb xhbVar;
        String str = o94Var.a;
        if (!this.z) {
            if (o94Var.h > 0 && (xhbVar = this.v) != null) {
                xhbVar.i0(K0);
                xhbVar.writeByte(32);
                xhbVar.i0(str);
                xhbVar.writeByte(10);
                xhbVar.flush();
            }
            if (o94Var.h > 0 || o94Var.g != null) {
                o94Var.f = true;
                return;
            }
        }
        zi0 zi0Var = o94Var.g;
        if (zi0Var != null) {
            zi0Var.k();
        }
        for (int i = 0; i < 2; i++) {
            ieg.d(this.b, (e1a) o94Var.c.get(i));
            long j = this.g;
            long[] jArr = o94Var.b;
            this.g = j - jArr[i];
            jArr[i] = 0;
        }
        this.x++;
        xhb xhbVar2 = this.v;
        if (xhbVar2 != null) {
            xhbVar2.i0(L0);
            xhbVar2.writeByte(32);
            xhbVar2.i0(str);
            xhbVar2.writeByte(10);
        }
        this.w.remove(str);
        if (E()) {
            this.G0.c(this.H0, 0L);
        }
    }

    public final synchronized void b() {
        if (this.Y) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.X && !this.Y) {
                Collection collectionValues = this.w.values();
                collectionValues.getClass();
                for (o94 o94Var : (o94[]) collectionValues.toArray(new o94[0])) {
                    o94Var.getClass();
                    zi0 zi0Var = o94Var.g;
                    if (zi0Var != null) {
                        zi0Var.k();
                    }
                }
                g0();
                xhb xhbVar = this.v;
                if (xhbVar != null) {
                    ieg.b(xhbVar);
                }
                this.v = null;
                this.Y = true;
                return;
            }
            this.Y = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.X) {
            b();
            g0();
            xhb xhbVar = this.v;
            xhbVar.getClass();
            xhbVar.flush();
        }
    }

    public final void g0() {
        while (this.g > this.c) {
            for (Object obj : this.w.values()) {
                obj.getClass();
                o94 o94Var = (o94) obj;
                if (!o94Var.f) {
                    W(o94Var);
                }
            }
            return;
        }
        this.Z = false;
    }

    public final synchronized void h(zi0 zi0Var, boolean z) {
        o94 o94Var = (o94) zi0Var.b;
        if (!pa7.t(o94Var.g, zi0Var)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !o94Var.e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = (boolean[]) zi0Var.c;
                zArr.getClass();
                if (!zArr[i]) {
                    zi0Var.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.b.G((e1a) o94Var.d.get(i))) {
                    zi0Var.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            e1a e1aVar = (e1a) o94Var.d.get(i2);
            if (!z || o94Var.f) {
                ieg.d(this.b, e1aVar);
            } else if (this.b.G(e1aVar)) {
                e1a e1aVar2 = (e1a) o94Var.c.get(i2);
                this.b.h(e1aVar, e1aVar2);
                long j = o94Var.b[i2];
                Long l = (Long) this.b.R(e1aVar2).e;
                long jLongValue = l != null ? l.longValue() : 0L;
                o94Var.b[i2] = jLongValue;
                this.g = (this.g - j) + jLongValue;
            }
        }
        o94Var.g = null;
        if (o94Var.f) {
            W(o94Var);
            return;
        }
        this.x++;
        xhb xhbVar = this.v;
        xhbVar.getClass();
        if (o94Var.e || z) {
            o94Var.e = true;
            xhbVar.i0(J0);
            xhbVar.writeByte(32);
            xhbVar.i0(o94Var.a);
            for (long j2 : o94Var.b) {
                xhbVar.writeByte(32);
                xhbVar.T0(j2);
            }
            xhbVar.writeByte(10);
            if (z) {
                long j3 = this.F0;
                this.F0 = 1 + j3;
                o94Var.i = j3;
            }
        } else {
            this.w.remove(o94Var.a);
            xhbVar.i0(L0);
            xhbVar.writeByte(32);
            xhbVar.i0(o94Var.a);
            xhbVar.writeByte(10);
        }
        xhbVar.flush();
        if (this.g > this.c || E()) {
            this.G0.c(this.H0, 0L);
        }
    }

    public final synchronized zi0 l(long j, String str) {
        str.getClass();
        x();
        b();
        h0(str);
        o94 o94Var = (o94) this.w.get(str);
        if (j != -1 && (o94Var == null || o94Var.i != j)) {
            return null;
        }
        if ((o94Var != null ? o94Var.g : null) != null) {
            return null;
        }
        if (o94Var != null && o94Var.h != 0) {
            return null;
        }
        if (!this.Z && !this.E0) {
            xhb xhbVar = this.v;
            xhbVar.getClass();
            xhbVar.i0(K0);
            xhbVar.writeByte(32);
            xhbVar.i0(str);
            xhbVar.writeByte(10);
            xhbVar.flush();
            if (this.y) {
                return null;
            }
            if (o94Var == null) {
                o94Var = new o94(this, str);
                this.w.put(str, o94Var);
            }
            zi0 zi0Var = new zi0(this, o94Var);
            o94Var.g = zi0Var;
            return zi0Var;
        }
        this.G0.c(this.H0, 0L);
        return null;
    }

    public final synchronized q94 u(String str) {
        str.getClass();
        x();
        b();
        h0(str);
        o94 o94Var = (o94) this.w.get(str);
        if (o94Var == null) {
            return null;
        }
        q94 q94VarA = o94Var.a();
        if (q94VarA == null) {
            return null;
        }
        this.x++;
        xhb xhbVar = this.v;
        xhbVar.getClass();
        xhbVar.i0(M0);
        xhbVar.writeByte(32);
        xhbVar.i0(str);
        xhbVar.writeByte(10);
        if (E()) {
            this.G0.c(this.H0, 0L);
        }
        return q94VarA;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0066 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:38:0x006c, B:40:0x0078, B:50:0x00bb, B:44:0x0083, B:46:0x00b4, B:48:0x00b8, B:49:0x00ba, B:37:0x0066, B:53:0x00c2, B:28:0x0055, B:25:0x0050, B:45:0x00aa, B:19:0x0041), top: B:61:0x0003, inners: #1, #2, #4, #8 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:13:0x0023, B:16:0x002a, B:17:0x002f, B:38:0x006c, B:40:0x0078, B:50:0x00bb, B:44:0x0083, B:46:0x00b4, B:48:0x00b8, B:49:0x00ba, B:37:0x0066, B:53:0x00c2, B:28:0x0055, B:25:0x0050, B:45:0x00aa, B:19:0x0041), top: B:61:0x0003, inners: #1, #2, #4, #8 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized void x() {
        boolean z;
        try {
            TimeZone timeZone = keg.a;
            if (this.X) {
                return;
            }
            if (this.b.G(this.f)) {
                boolean zG = this.b.G(this.d);
                t94 t94Var = this.b;
                e1a e1aVar = this.f;
                if (zG) {
                    t94Var.E(e1aVar);
                } else {
                    t94Var.h(e1aVar, this.d);
                }
            }
            t94 t94Var2 = this.b;
            e1a e1aVar2 = this.f;
            byte[] bArr = ieg.a;
            t94Var2.getClass();
            e1aVar2.getClass();
            wkd wkdVarG0 = t94Var2.g0(e1aVar2, false);
            try {
                t94Var2.c.x(e1aVar2);
                if (wkdVarG0 != null) {
                    try {
                        wkdVarG0.close();
                    } catch (Throwable unused) {
                    }
                }
                z = true;
            } catch (IOException unused2) {
                if (wkdVarG0 != null) {
                    try {
                        wkdVarG0.close();
                    } catch (Throwable th) {
                        th = th;
                        th = th;
                        if (th != null) {
                            throw th;
                        }
                        t94Var2.c.x(e1aVar2);
                        z = false;
                        this.z = z;
                        if (this.b.G(this.d)) {
                            try {
                                N();
                                G();
                                this.X = true;
                                return;
                            } catch (IOException e) {
                                sea seaVar = sea.a;
                                sea.a.i(5, "DiskLruCache " + this.a + " is corrupt: " + e.getMessage() + ", removing", e);
                                try {
                                    close();
                                    ieg.c(this.b, this.a);
                                    this.Y = false;
                                    U();
                                    this.X = true;
                                } catch (Throwable th2) {
                                    this.Y = false;
                                    throw th2;
                                }
                            }
                        }
                        U();
                        this.X = true;
                    }
                }
                th = null;
                th = th;
                if (th != null) {
                    throw th;
                }
                t94Var2.c.x(e1aVar2);
                z = false;
            } catch (Throwable th3) {
                th = th3;
                if (wkdVarG0 != null) {
                    try {
                        wkdVarG0.close();
                    } catch (Throwable th4) {
                        bzd.m(th, th4);
                    }
                }
                if (th != null) {
                    throw th;
                }
                t94Var2.c.x(e1aVar2);
                z = false;
                this.z = z;
                if (this.b.G(this.d)) {
                    N();
                    G();
                    this.X = true;
                    return;
                }
                U();
                this.X = true;
            }
            this.z = z;
            if (this.b.G(this.d)) {
                N();
                G();
                this.X = true;
                return;
            }
            U();
            this.X = true;
        } catch (Throwable th5) {
            throw th5;
        }
    }
}

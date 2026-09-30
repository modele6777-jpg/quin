package defpackage;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sdg extends zd5 {
    public static final e1a f;
    public final e1a c;
    public final zd5 d;
    public final LinkedHashMap e;

    static {
        String str = e1a.b;
        f = y25.r("/");
    }

    public sdg(e1a e1aVar, zd5 zd5Var, LinkedHashMap linkedHashMap) {
        zd5Var.getClass();
        this.c = e1aVar;
        this.d = zd5Var;
        this.e = linkedHashMap;
    }

    @Override // defpackage.zd5
    public final List N(e1a e1aVar) throws IOException {
        e1a e1aVar2 = f;
        e1aVar2.getClass();
        rdg rdgVar = (rdg) this.e.get(c.a(e1aVar2, e1aVar, true));
        if (rdgVar != null) {
            return s72.j1(rdgVar.q);
        }
        s8f.p(e1aVar, "not a directory: ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    @Override // defpackage.zd5
    public final ld5 U(e1a e1aVar) throws Throwable {
        Long lValueOf;
        Long lValueOf2;
        Long l;
        Long lValueOf3;
        Throwable th;
        Throwable th2;
        e1aVar.getClass();
        e1a e1aVar2 = f;
        e1aVar2.getClass();
        rdg rdgVarM = (rdg) this.e.get(c.a(e1aVar2, e1aVar, true));
        if (rdgVarM == null) {
            return null;
        }
        long j = rdgVarM.h;
        if (j != -1) {
            jk7 jk7VarW = this.d.W(this.c);
            try {
                yhb yhbVar = new yhb(jk7VarW.b(j));
                try {
                    rdgVarM = gdc.m(yhbVar, rdgVarM);
                    rdgVarM.getClass();
                    try {
                        yhbVar.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        yhbVar.close();
                    } catch (Throwable th5) {
                        bzd.m(th4, th5);
                    }
                    th2 = th4;
                    rdgVarM = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                try {
                    jk7VarW.close();
                    th = null;
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                if (jk7VarW != null) {
                    try {
                        jk7VarW.close();
                    } catch (Throwable th8) {
                        bzd.m(th7, th8);
                    }
                }
                th = th7;
                rdgVarM = null;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z = rdgVarM.b;
        boolean z2 = !z;
        Long lValueOf4 = z ? null : Long.valueOf(rdgVarM.f);
        Long l2 = rdgVarM.m;
        if (l2 != null) {
            lValueOf = Long.valueOf((l2.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num = rdgVarM.p;
            lValueOf = num != null ? Long.valueOf(((long) num.intValue()) * 1000) : null;
        }
        Long l3 = rdgVarM.k;
        if (l3 != null) {
            lValueOf2 = Long.valueOf((l3.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num2 = rdgVarM.n;
            if (num2 != null) {
                lValueOf2 = Long.valueOf(((long) num2.intValue()) * 1000);
            } else {
                int i = rdgVarM.j;
                if (i != -1) {
                    int i2 = rdgVarM.i;
                    if (i == -1) {
                        lValueOf2 = null;
                    } else {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                } else {
                    lValueOf2 = null;
                }
            }
        }
        Long l4 = rdgVarM.l;
        if (l4 == null) {
            Integer num3 = rdgVarM.o;
            if (num3 != null) {
                lValueOf3 = Long.valueOf(((long) num3.intValue()) * 1000);
            } else {
                l = null;
            }
            return new ld5(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
        }
        lValueOf3 = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
        l = lValueOf3;
        return new ld5(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
    }

    @Override // defpackage.zd5
    public final jk7 W(e1a e1aVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.zd5
    public final wkd b(e1a e1aVar) throws IOException {
        e1aVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.zd5
    public final wkd g0(e1a e1aVar, boolean z) throws IOException {
        e1aVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.zd5
    public final void h(e1a e1aVar, e1a e1aVar2) throws IOException {
        e1aVar.getClass();
        e1aVar2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.zd5
    public final mtd h0(e1a e1aVar) throws Throwable {
        Throwable th;
        yhb yhbVar;
        e1aVar.getClass();
        e1a e1aVar2 = f;
        e1aVar2.getClass();
        rdg rdgVar = (rdg) this.e.get(c.a(e1aVar2, e1aVar, true));
        if (rdgVar == null) {
            pd4.l(e1aVar, "no such file: ");
            return null;
        }
        long j = rdgVar.f;
        jk7 jk7VarW = this.d.W(this.c);
        try {
            yhbVar = new yhb(jk7VarW.b(rdgVar.h));
            try {
                jk7VarW.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (jk7VarW != null) {
                try {
                    jk7VarW.close();
                } catch (Throwable th4) {
                    bzd.m(th3, th4);
                }
            }
            th = th3;
            yhbVar = null;
        }
        if (th != null) {
            throw th;
        }
        yhbVar.getClass();
        gdc.m(yhbVar, null);
        if (rdgVar.g == 0) {
            return new sh5(yhbVar, j, true);
        }
        return new sh5(new q27(new yhb(new sh5(yhbVar, rdgVar.e, true)), new Inflater(true)), j, false);
    }

    @Override // defpackage.zd5
    public final void u(e1a e1aVar) throws IOException {
        e1aVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.zd5
    public final void x(e1a e1aVar) throws IOException {
        e1aVar.getClass();
        throw new IOException("zip file systems are read-only");
    }
}

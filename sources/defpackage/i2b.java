package defpackage;

import android.util.SparseArray;
import io.sentry.q6;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i2b implements l95 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public yh5 i;
    public n95 j;
    public boolean k;
    public final rye a = new rye(0);
    public final d0a c = new d0a(4096);
    public final SparseArray b = new SparseArray();
    public final g2b d = new g2b(0);

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        byte[] bArr = new byte[14];
        rq3 rq3Var = (rq3) m95Var;
        rq3Var.d(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            rq3Var.j(bArr[13] & 7, false);
            rq3Var.d(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.b;
        rye ryeVar = this.a;
        synchronized (ryeVar) {
            j3 = ryeVar.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long jD = ryeVar.d();
            z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
        }
        if (z) {
            ryeVar.e(j2);
        }
        yh5 yh5Var = this.i;
        if (yh5Var != null) {
            yh5Var.d(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            h2b h2bVar = (h2b) sparseArray.valueAt(i);
            h2bVar.f = false;
            h2bVar.a.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) {
        char c;
        long j;
        ?? r4;
        int i;
        long jB;
        xs4 hg6Var;
        long j2;
        long j3;
        g2b g2bVar = this.d;
        rye ryeVar = g2bVar.b;
        this.j.getClass();
        long length = m95Var.getLength();
        if (length != -1) {
            c = 3;
            if (!g2bVar.d) {
                d0a d0aVar = g2bVar.c;
                if (!g2bVar.f) {
                    long length2 = m95Var.getLength();
                    int iMin = (int) Math.min(20000L, length2);
                    long j4 = length2 - ((long) iMin);
                    if (m95Var.getPosition() != j4) {
                        d82Var.b = j4;
                        return 1;
                    }
                    d0aVar.J(iMin);
                    m95Var.k();
                    m95Var.o(d0aVar.a, 0, iMin);
                    int i2 = d0aVar.b;
                    for (int i3 = d0aVar.c - 4; i3 >= i2; i3--) {
                        if (g2b.b(d0aVar.a, i3) == 442) {
                            d0aVar.M(i3 + 4);
                            long jC = g2b.c(d0aVar);
                            if (jC != -9223372036854775807L) {
                                j3 = jC;
                                g2bVar.h = j3;
                                g2bVar.f = true;
                                return 0;
                            }
                        }
                    }
                    j3 = -9223372036854775807L;
                    g2bVar.h = j3;
                    g2bVar.f = true;
                    return 0;
                }
                if (g2bVar.h == -9223372036854775807L) {
                    g2bVar.a(m95Var);
                    return 0;
                }
                if (g2bVar.e) {
                    long j5 = g2bVar.g;
                    if (j5 == -9223372036854775807L) {
                        g2bVar.a(m95Var);
                        return 0;
                    }
                    g2bVar.i = ryeVar.c(g2bVar.h) - ryeVar.b(j5);
                    g2bVar.a(m95Var);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, m95Var.getLength());
                if (m95Var.getPosition() != 0) {
                    d82Var.b = 0L;
                    return 1;
                }
                d0aVar.J(iMin2);
                m95Var.k();
                m95Var.o(d0aVar.a, 0, iMin2);
                int i4 = d0aVar.c;
                for (int i5 = d0aVar.b; i5 < i4 - 3; i5++) {
                    if (g2b.b(d0aVar.a, i5) == 442) {
                        d0aVar.M(i5 + 4);
                        long jC2 = g2b.c(d0aVar);
                        if (jC2 != -9223372036854775807L) {
                            j2 = jC2;
                            g2bVar.g = j2;
                            g2bVar.e = true;
                            return 0;
                        }
                    }
                }
                j2 = -9223372036854775807L;
                g2bVar.g = j2;
                g2bVar.e = true;
                return 0;
            }
        } else {
            c = 3;
        }
        int i6 = 14;
        if (this.k) {
            j = 0;
            r4 = 1;
            i = 0;
        } else {
            this.k = true;
            long j6 = g2bVar.i;
            if (j6 != -9223372036854775807L) {
                i = 0;
                r4 = 1;
                j = 0;
                yh5 yh5Var = new yh5(new i8c(i6), new vea(ryeVar), j6, j6 + 1, 0L, length, 188L, 1000);
                this.i = yh5Var;
                this.j.q(yh5Var.a);
            } else {
                r4 = 1;
                i = 0;
                j = 0;
                this.j.q(new ir0(j6));
            }
        }
        yh5 yh5Var2 = this.i;
        if (yh5Var2 != null && yh5Var2.c != null) {
            return yh5Var2.a(m95Var, d82Var);
        }
        m95Var.k();
        long jE = length != -1 ? length - m95Var.e() : -1L;
        if (jE != -1 && jE < 4) {
            g();
            return -1;
        }
        d0a d0aVar2 = this.c;
        if (!m95Var.d(d0aVar2.a, i, 4, r4)) {
            g();
            return -1;
        }
        d0aVar2.M(i);
        int iM = d0aVar2.m();
        if (iM == 441) {
            g();
            return -1;
        }
        if (iM == 442) {
            m95Var.o(d0aVar2.a, i, 10);
            d0aVar2.M(9);
            m95Var.l((d0aVar2.z() & 7) + 14);
            return i;
        }
        if (iM == 443) {
            m95Var.o(d0aVar2.a, i, 2);
            d0aVar2.M(i);
            m95Var.l(d0aVar2.G() + 6);
            return i;
        }
        if (((iM & (-256)) >> 8) != r4) {
            m95Var.l(r4);
            return i;
        }
        int i7 = iM & 255;
        SparseArray sparseArray = this.b;
        h2b h2bVar = (h2b) sparseArray.get(i7);
        if (!this.e) {
            if (h2bVar == null) {
                if (i7 == 189) {
                    hg6Var = new b6("video/mp2p");
                    this.f = r4;
                    this.h = m95Var.getPosition();
                } else if ((iM & 224) == 192) {
                    hg6Var = new t49(null, i, "video/mp2p");
                    this.f = r4;
                    this.h = m95Var.getPosition();
                } else if ((iM & 240) == 224) {
                    hg6Var = new hg6(null, "video/mp2p");
                    this.g = r4;
                    this.h = m95Var.getPosition();
                } else {
                    hg6Var = null;
                }
                if (hg6Var != null) {
                    hg6Var.h(this.j, new xg3(i7, 256));
                    h2bVar = new h2b(hg6Var, this.a);
                    sparseArray.put(i7, h2bVar);
                }
            }
            if (m95Var.getPosition() > ((this.f && this.g) ? this.h + 8192 : q6.MAX_EVENT_SIZE_BYTES)) {
                this.e = r4;
                this.j.j();
            }
        }
        m95Var.o(d0aVar2.a, i, 2);
        d0aVar2.M(i);
        int iG = d0aVar2.G() + 6;
        if (h2bVar == null) {
            m95Var.l(iG);
            return i;
        }
        d0aVar2.J(iG);
        m95Var.readFully(d0aVar2.a, i, iG);
        d0aVar2.M(6);
        xs4 xs4Var = h2bVar.a;
        zu1 zu1Var = h2bVar.c;
        d0aVar2.k(zu1Var.b, i, 3);
        zu1Var.m(i);
        zu1Var.o(8);
        h2bVar.d = zu1Var.f();
        h2bVar.e = zu1Var.f();
        zu1Var.o(6);
        d0aVar2.k(zu1Var.b, i, zu1Var.g(8));
        zu1Var.m(i);
        rye ryeVar2 = h2bVar.b;
        if (h2bVar.d) {
            zu1Var.o(4);
            long jG = ((long) zu1Var.g(3)) << 30;
            zu1Var.o(r4);
            long jG2 = jG | ((long) (zu1Var.g(15) << 15));
            zu1Var.o(r4);
            long jG3 = jG2 | ((long) zu1Var.g(15));
            zu1Var.o(r4);
            if (!h2bVar.f && h2bVar.e) {
                zu1Var.o(4);
                long jG4 = ((long) zu1Var.g(3)) << 30;
                zu1Var.o(r4);
                long jG5 = jG4 | ((long) (zu1Var.g(15) << 15));
                zu1Var.o(r4);
                long jG6 = ((long) zu1Var.g(15)) | jG5;
                zu1Var.o(r4);
                ryeVar2.b(jG6);
                h2bVar.f = r4;
            }
            jB = ryeVar2.b(jG3);
        } else {
            jB = j;
        }
        xs4Var.g(4, jB);
        xs4Var.c(d0aVar2);
        xs4Var.e();
        d0aVar2.L(d0aVar2.a.length);
        return i;
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        this.j = n95Var;
    }

    public final void g() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            ((h2b) sparseArray.valueAt(i)).a.f();
            i++;
        }
    }

    @Override // defpackage.l95
    public final void a() {
    }
}

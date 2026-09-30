package defpackage;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jr0 implements l95 {
    public final d0a a;
    public final e6 b;
    public final boolean c;
    public final qfc d;
    public int e;
    public n95 f;
    public kr0 g;
    public long h;
    public pz1[] i;
    public long j;
    public pz1 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public jr0(int i, qfc qfcVar) {
        this.d = qfcVar;
        this.c = (i & 1) == 0;
        this.a = new d0a(12);
        this.b = new e6();
        this.f = new yx4(15);
        this.i = new pz1[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        d0a d0aVar = this.a;
        m95Var.o(d0aVar.a, 0, 12);
        d0aVar.M(0);
        if (d0aVar.o() == 1179011410) {
            d0aVar.N(4);
            if (d0aVar.o() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (pz1 pz1Var : this.i) {
            if (pz1Var.l == 0) {
                pz1Var.j = 0;
            } else {
                pz1Var.j = pz1Var.o[pqf.d(pz1Var.n, j, true)];
            }
        }
        if (j != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:183:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x0113  */
    /* JADX WARN: Code duplicated, block: B:70:0x011c  */
    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) throws l0a {
        boolean z;
        int i;
        pz1 pz1Var;
        long j;
        int i2;
        pz1 pz1Var2;
        int i3 = 0;
        if (this.j != -1) {
            long position = m95Var.getPosition();
            long j2 = this.j;
            if (j2 < position || j2 > 262144 + position) {
                d82Var.b = j2;
                z = true;
            } else {
                m95Var.l((int) (j2 - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.j = -1L;
        if (z) {
            return 1;
        }
        int i4 = this.e;
        int i5 = 4;
        pz1 pz1Var3 = null;
        e6 e6Var = this.b;
        int i6 = 2;
        d0a d0aVar = this.a;
        switch (i4) {
            case 0:
                if (!b(m95Var)) {
                    throw l0a.a(null, "AVI Header List not found");
                }
                m95Var.l(12);
                this.e = 1;
                return 0;
            case 1:
                m95Var.readFully(d0aVar.a, 0, 12);
                d0aVar.M(0);
                e6Var.a = d0aVar.o();
                e6Var.b = d0aVar.o();
                e6Var.c = 0;
                if (e6Var.a != 1414744396) {
                    throw l0a.a(null, "LIST expected, found: " + e6Var.a);
                }
                int iO = d0aVar.o();
                e6Var.c = iO;
                if (iO == 1819436136) {
                    this.l = e6Var.b;
                    this.e = 2;
                    return 0;
                }
                throw l0a.a(null, "hdrl expected, found: " + e6Var.c);
            case 2:
                int i7 = this.l - 4;
                d0a d0aVar2 = new d0a(i7);
                m95Var.readFully(d0aVar2.a, 0, i7);
                d78 d78VarB = d78.b(1819436136, d0aVar2);
                int i8 = d78VarB.b;
                if (i8 != 1819436136) {
                    throw l0a.a(null, "Unexpected header list type " + i8);
                }
                kr0 kr0Var = (kr0) d78VarB.a(kr0.class);
                if (kr0Var == null) {
                    throw l0a.a(null, "AviHeader not found");
                }
                this.g = kr0Var;
                this.h = ((long) kr0Var.c) * ((long) kr0Var.a);
                ArrayList arrayList = new ArrayList();
                ey6 ey6VarListIterator = d78VarB.a.listIterator(0);
                int i9 = 0;
                while (ey6VarListIterator.hasNext()) {
                    hr0 hr0Var = (hr0) ey6VarListIterator.next();
                    if (hr0Var.getType() == 1819440243) {
                        d78 d78Var = (d78) hr0Var;
                        int i10 = i9 + 1;
                        lr0 lr0Var = (lr0) d78Var.a(lr0.class);
                        z2e z2eVar = (z2e) d78Var.a(z2e.class);
                        if (lr0Var == null) {
                            xo1.V("AviExtractor", "Missing Stream Header");
                        } else {
                            if (z2eVar == null) {
                                xo1.V("AviExtractor", "Missing Stream Format");
                            } else {
                                long j3 = lr0Var.d;
                                long j4 = ((long) lr0Var.b) * 1000000;
                                i = i10;
                                long j5 = lr0Var.c;
                                String str = pqf.a;
                                long jN = pqf.N(j3, j4, j5, RoundingMode.DOWN);
                                rr5 rr5Var = z2eVar.a;
                                qr5 qr5VarA = rr5Var.a();
                                qr5VarA.a = Integer.toString(i9);
                                int i11 = lr0Var.e;
                                if (i11 != 0) {
                                    qr5VarA.p = i11;
                                }
                                f3e f3eVar = (f3e) d78Var.a(f3e.class);
                                if (f3eVar != null) {
                                    qr5VarA.b = f3eVar.a;
                                }
                                int iG = qv8.g(rr5Var.p);
                                if (iG == 1 || iG == i6) {
                                    k1f k1fVarN = this.f.n(i9, iG);
                                    rr5 rr5Var2 = new rr5(qr5VarA);
                                    k1fVarN.g(rr5Var2);
                                    k1fVarN.d(jN);
                                    this.h = Math.max(this.h, jN);
                                    pz1Var = new pz1(i9, lr0Var, k1fVarN, qv8.a(rr5Var2.p, rr5Var2.l));
                                } else {
                                    pz1Var = null;
                                }
                            }
                            if (pz1Var != null) {
                                arrayList.add(pz1Var);
                            }
                            i9 = i;
                        }
                        i = i10;
                        pz1Var = null;
                        if (pz1Var != null) {
                            arrayList.add(pz1Var);
                        }
                        i9 = i;
                    }
                    i3 = 0;
                    i6 = 2;
                }
                int i12 = i3;
                this.i = (pz1[]) arrayList.toArray(new pz1[i12]);
                this.f.j();
                this.e = 3;
                return i12;
            case 3:
                if (this.m != -1) {
                    long position2 = m95Var.getPosition();
                    long j6 = this.m;
                    if (position2 != j6) {
                        this.j = j6;
                        return 0;
                    }
                }
                m95Var.o(d0aVar.a, 0, 12);
                m95Var.k();
                d0aVar.M(0);
                e6Var.a = d0aVar.o();
                e6Var.b = d0aVar.o();
                e6Var.c = 0;
                int iO2 = d0aVar.o();
                int i13 = e6Var.a;
                if (i13 == 1179011410) {
                    m95Var.l(12);
                    return 0;
                }
                if (i13 != 1414744396 || iO2 != 1769369453) {
                    this.j = m95Var.getPosition() + ((long) e6Var.b) + 8;
                    return 0;
                }
                long position3 = m95Var.getPosition();
                this.m = position3;
                this.n = position3 + ((long) e6Var.b) + 8;
                if (!this.p) {
                    kr0 kr0Var2 = this.g;
                    kr0Var2.getClass();
                    if ((kr0Var2.b & 16) == 16) {
                        this.e = 4;
                        this.j = this.n;
                        return 0;
                    }
                    this.f.q(new ir0(this.h));
                    this.p = true;
                }
                this.j = m95Var.getPosition() + 12;
                this.e = 6;
                return 0;
            case 4:
                m95Var.readFully(d0aVar.a, 0, 8);
                d0aVar.M(0);
                int iO3 = d0aVar.o();
                int iO4 = d0aVar.o();
                if (iO3 != 829973609) {
                    this.j = m95Var.getPosition() + ((long) iO4);
                    return 0;
                }
                this.e = 5;
                this.o = iO4;
                return 0;
            case 5:
                d0a d0aVar3 = new d0a(this.o);
                m95Var.readFully(d0aVar3.a, 0, this.o);
                if (d0aVar3.a() < 16) {
                    j = 0;
                } else {
                    int i14 = d0aVar3.b;
                    d0aVar3.N(8);
                    long jO = d0aVar3.o();
                    long j7 = this.m;
                    j = jO > j7 ? 0L : j7 + 8;
                    d0aVar3.M(i14);
                }
                while (d0aVar3.a() >= 16) {
                    int iO5 = d0aVar3.o();
                    int iO6 = d0aVar3.o();
                    long jO2 = ((long) d0aVar3.o()) + j;
                    d0aVar3.N(i5);
                    pz1[] pz1VarArr = this.i;
                    int length = pz1VarArr.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 < length) {
                            pz1Var2 = pz1VarArr[i15];
                            if (pz1Var2.c != iO5 && pz1Var2.d != iO5) {
                                i15++;
                            }
                        } else {
                            pz1Var2 = null;
                        }
                    }
                    if (pz1Var2 != null) {
                        boolean z2 = (iO6 & 16) == 16;
                        if (pz1Var2.m == -1) {
                            pz1Var2.m = jO2;
                        }
                        if (z2 || pz1Var2.f) {
                            int i16 = pz1Var2.l;
                            int[] iArrCopyOf = pz1Var2.o;
                            if (i16 == iArrCopyOf.length) {
                                long[] jArr = pz1Var2.n;
                                pz1Var2.n = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = pz1Var2.o;
                                iArrCopyOf = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                                pz1Var2.o = iArrCopyOf;
                            }
                            long[] jArr2 = pz1Var2.n;
                            int i17 = pz1Var2.l;
                            jArr2[i17] = jO2;
                            iArrCopyOf[i17] = pz1Var2.k;
                            pz1Var2.l = i17 + 1;
                        }
                        pz1Var2.k++;
                    }
                    i5 = 4;
                }
                for (pz1 pz1Var4 : this.i) {
                    pz1Var4.n = Arrays.copyOf(pz1Var4.n, pz1Var4.l);
                    pz1Var4.o = Arrays.copyOf(pz1Var4.o, pz1Var4.l);
                    if (pz1Var4.f && pz1Var4.a.f != 0 && (i2 = pz1Var4.l) > 0) {
                        pz1Var4.g = i2;
                    }
                }
                this.p = true;
                int length2 = this.i.length;
                n95 n95Var = this.f;
                long j8 = this.h;
                if (length2 == 0) {
                    n95Var.q(new ir0(j8));
                } else {
                    n95Var.q(new ir0(this, j8, 0));
                }
                this.e = 6;
                this.j = this.m;
                return 0;
            case 6:
                if (m95Var.getPosition() >= this.n) {
                    return -1;
                }
                pz1 pz1Var5 = this.k;
                if (pz1Var5 != null) {
                    k1f k1fVar = pz1Var5.b;
                    int i18 = pz1Var5.i;
                    int iC = i18 - k1fVar.c(m95Var, i18, false);
                    pz1Var5.i = iC;
                    boolean z3 = iC == 0;
                    if (z3) {
                        if (pz1Var5.h > 0) {
                            int i19 = pz1Var5.j;
                            k1fVar.a((pz1Var5.e * ((long) i19)) / ((long) pz1Var5.g), (pz1Var5.f || Arrays.binarySearch(pz1Var5.o, i19) >= 0) ? 1 : 0, pz1Var5.h, 0, null);
                        }
                        pz1Var5.j++;
                    }
                    if (z3) {
                        this.k = null;
                    }
                    return 0;
                }
                if ((m95Var.getPosition() & 1) == 1) {
                    m95Var.l(1);
                }
                m95Var.o(d0aVar.a, 0, 12);
                d0aVar.M(0);
                int iO7 = d0aVar.o();
                if (iO7 == 1414744396) {
                    d0aVar.M(8);
                    m95Var.l(d0aVar.o() == 1769369453 ? 12 : 8);
                    m95Var.k();
                    return 0;
                }
                int iO8 = d0aVar.o();
                if (iO7 == 1263424842) {
                    this.j = m95Var.getPosition() + ((long) iO8) + 8;
                    return 0;
                }
                m95Var.l(8);
                m95Var.k();
                for (pz1 pz1Var6 : this.i) {
                    if (pz1Var6.c == iO7 || pz1Var6.d == iO7) {
                        pz1Var3 = pz1Var6;
                        if (pz1Var3 == null) {
                            this.j = m95Var.getPosition() + ((long) iO8);
                            return 0;
                        }
                        pz1Var3.h = iO8;
                        pz1Var3.i = iO8;
                        this.k = pz1Var3;
                        return 0;
                    }
                }
                if (pz1Var3 == null) {
                    this.j = m95Var.getPosition() + ((long) iO8);
                    return 0;
                }
                pz1Var3.h = iO8;
                pz1Var3.i = iO8;
                this.k = pz1Var3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        this.e = 0;
        if (this.c) {
            n95Var = new zi0(n95Var, this.d);
        }
        this.f = n95Var;
        this.j = -1L;
    }

    @Override // defpackage.l95
    public final void a() {
    }
}

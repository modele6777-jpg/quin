package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jn5 implements l95 {
    public final d0a a = new d0a(4);
    public final d0a b = new d0a(9);
    public final d0a c = new d0a(11);
    public final d0a d = new d0a();
    public final qgc e;
    public n95 f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public sk0 o;
    public xuf p;

    public jn5() {
        qgc qgcVar = new qgc(6, new l94());
        qgcVar.c = -9223372036854775807L;
        qgcVar.d = new long[0];
        qgcVar.e = new long[0];
        this.e = qgcVar;
        this.g = 1;
    }

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        d0a d0aVar = this.a;
        rq3 rq3Var = (rq3) m95Var;
        rq3Var.d(d0aVar.a, 0, 3, false);
        d0aVar.M(0);
        if (d0aVar.C() == 4607062) {
            rq3Var.d(d0aVar.a, 0, 2, false);
            d0aVar.M(0);
            if ((d0aVar.G() & 250) == 0) {
                rq3Var.d(d0aVar.a, 0, 4, false);
                d0aVar.M(0);
                int iM = d0aVar.m();
                rq3Var.f = 0;
                rq3Var.j(iM, false);
                rq3Var.d(d0aVar.a, 0, 4, false);
                d0aVar.M(0);
                if (d0aVar.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:144:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:145:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:184:0x03d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x017f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0187  */
    /* JADX WARN: Code duplicated, block: B:94:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c6  */
    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) throws l0a {
        long j;
        long j2;
        int i;
        boolean z;
        boolean z2;
        long j3;
        int i2;
        this.f.getClass();
        while (true) {
            int i3 = this.g;
            boolean z3 = true;
            if (i3 == 1) {
                d0a d0aVar = this.b;
                if (!m95Var.a(d0aVar.a, 0, 9, true)) {
                    return -1;
                }
                d0aVar.M(0);
                d0aVar.N(4);
                int iZ = d0aVar.z();
                boolean z4 = (iZ & 4) != 0;
                boolean z5 = (iZ & 1) != 0;
                if (z4 && this.o == null) {
                    this.o = new sk0(6, this.f.n(8, 1));
                }
                if (z5 && this.p == null) {
                    i2 = 2;
                    this.p = new xuf(this.f.n(9, 2));
                } else {
                    i2 = 2;
                }
                this.f.j();
                this.j = d0aVar.m() - 5;
                this.g = i2;
            } else if (i3 == 2) {
                m95Var.l(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i3 == 3) {
                d0a d0aVar2 = this.c;
                if (!m95Var.a(d0aVar2.a, 0, 11, true)) {
                    return -1;
                }
                d0aVar2.M(0);
                this.k = d0aVar2.z();
                this.l = d0aVar2.C();
                this.m = d0aVar2.C();
                this.m = (((long) (d0aVar2.z() << 24)) | this.m) * 1000;
                d0aVar2.N(3);
                this.g = 4;
            } else {
                if (i3 != 4) {
                    r3.l();
                    return 0;
                }
                boolean z6 = this.h;
                qgc qgcVar = this.e;
                if (z6) {
                    j = this.i + this.m;
                } else {
                    if (qgcVar.c == -9223372036854775807L) {
                        j2 = 0;
                    } else {
                        j = this.m;
                    }
                    i = this.k;
                    if (i == 8 || this.o == null) {
                        int i4 = 4;
                        if (i != 9 && this.p != null) {
                            if (!this.n) {
                                this.f.q(new ir0(-9223372036854775807L));
                                this.n = true;
                            }
                            xuf xufVar = this.p;
                            d0a d0aVarG = g(m95Var);
                            xufVar.getClass();
                            int iZ2 = d0aVarG.z();
                            int i5 = (iZ2 >> 4) & 15;
                            int i6 = iZ2 & 15;
                            if (i6 != 7) {
                                throw new xde(tec.e(i6, "Video format not supported: "));
                            }
                            xufVar.v = i5;
                            if (i5 != 5) {
                                d0a d0aVar3 = xufVar.c;
                                k1f k1fVar = (k1f) xufVar.b;
                                d0a d0aVar4 = xufVar.d;
                                int iZ3 = d0aVarG.z();
                                d0aVarG.f(3);
                                byte[] bArr = d0aVarG.a;
                                int i7 = d0aVarG.b;
                                int i8 = i7 + 1;
                                d0aVarG.b = i8;
                                int i9 = ((bArr[i7] & 255) << 24) >> 8;
                                int i10 = i7 + 2;
                                d0aVarG.b = i10;
                                int i11 = ((bArr[i8] & 255) << 8) | i9;
                                d0aVarG.b = i7 + 3;
                                long j4 = (((long) (i11 | (bArr[i10] & 255))) * 1000) + j2;
                                if (iZ3 != 0 || xufVar.f) {
                                    if (iZ3 == 1 && xufVar.f) {
                                        int i12 = xufVar.v == 1 ? 1 : 0;
                                        if (xufVar.g || i12 != 0) {
                                            byte[] bArr2 = d0aVar4.a;
                                            bArr2[0] = 0;
                                            bArr2[1] = 0;
                                            bArr2[2] = 0;
                                            int i13 = 4 - xufVar.e;
                                            int i14 = 0;
                                            while (d0aVarG.a() > 0) {
                                                d0aVarG.k(d0aVar4.a, i13, xufVar.e);
                                                d0aVar4.M(0);
                                                int iD = d0aVar4.D();
                                                d0aVar3.M(0);
                                                k1fVar.e(i4, d0aVar3);
                                                k1fVar.e(iD, d0aVarG);
                                                i14 = i14 + 4 + iD;
                                                i4 = 4;
                                            }
                                            ((k1f) xufVar.b).a(j4, i12, i14, 0, null);
                                            xufVar.g = true;
                                            z2 = true;
                                        }
                                    }
                                    z = z2;
                                    z3 = true;
                                } else {
                                    byte[] bArr3 = new byte[d0aVarG.a()];
                                    d0a d0aVar5 = new d0a(bArr3);
                                    d0aVarG.k(bArr3, 0, d0aVarG.a());
                                    fr0 fr0VarA = fr0.a(d0aVar5);
                                    xufVar.e = fr0VarA.b;
                                    qr5 qr5Var = new qr5();
                                    qr5Var.n = qv8.l("video/x-flv");
                                    qr5Var.o = qv8.l("video/avc");
                                    qr5Var.k = fr0VarA.l;
                                    qr5Var.v = fr0VarA.c;
                                    qr5Var.w = fr0VarA.d;
                                    qr5Var.D = fr0VarA.k;
                                    qr5Var.r = fr0VarA.a;
                                    k1fVar.g(new rr5(qr5Var));
                                    xufVar.f = true;
                                }
                                z2 = false;
                                if (z2) {
                                }
                                z3 = true;
                            }
                        } else if (i == 18 || this.n) {
                            m95Var.l(this.l);
                            z = false;
                            z3 = false;
                        } else {
                            d0a d0aVarG2 = g(m95Var);
                            if (d0aVarG2.z() == 2 && "onMetaData".equals(qgc.D0(d0aVarG2)) && d0aVarG2.a() != 0 && d0aVarG2.z() == 8) {
                                HashMap mapC0 = qgc.C0(d0aVarG2);
                                Object obj = mapC0.get("duration");
                                if (obj instanceof Double) {
                                    double dDoubleValue = ((Double) obj).doubleValue();
                                    if (dDoubleValue > 0.0d) {
                                        qgcVar.c = (long) (dDoubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = mapC0.get("keyframes");
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    Object obj3 = map.get("filepositions");
                                    Object obj4 = map.get("times");
                                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                        List list = (List) obj3;
                                        List list2 = (List) obj4;
                                        int size = list2.size();
                                        qgcVar.d = new long[size];
                                        qgcVar.e = new long[size];
                                        for (int i15 = 0; i15 < size; i15++) {
                                            Object obj5 = list.get(i15);
                                            Object obj6 = list2.get(i15);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                qgcVar.d = new long[0];
                                                qgcVar.e = new long[0];
                                                break;
                                            }
                                            qgcVar.d[i15] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                            qgcVar.e[i15] = ((Double) obj5).longValue();
                                        }
                                    }
                                }
                            }
                            long j5 = qgcVar.c;
                            if (j5 != -9223372036854775807L) {
                                this.f.q(new j17(j5, qgcVar.e, qgcVar.d));
                                this.n = true;
                            }
                        }
                        z3 = true;
                    } else {
                        if (!this.n) {
                            this.f.q(new ir0(-9223372036854775807L));
                            this.n = true;
                        }
                        sk0 sk0Var = this.o;
                        d0a d0aVarG3 = g(m95Var);
                        k1f k1fVar2 = (k1f) sk0Var.b;
                        if (sk0Var.c) {
                            d0aVarG3.N(1);
                        } else {
                            int iZ4 = d0aVarG3.z();
                            int i16 = (iZ4 >> 4) & 15;
                            sk0Var.e = i16;
                            if (i16 == 2) {
                                int i17 = sk0.f[(iZ4 >> 2) & 3];
                                qr5 qr5Var2 = new qr5();
                                qr5Var2.n = qv8.l("video/x-flv");
                                qr5Var2.o = qv8.l("audio/mpeg");
                                qr5Var2.I = 1;
                                qr5Var2.K = i17;
                                k1fVar2.g(new rr5(qr5Var2));
                                sk0Var.d = true;
                            } else if (i16 == 7 || i16 == 8) {
                                String str = i16 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                qr5 qr5Var3 = new qr5();
                                qr5Var3.n = qv8.l("video/x-flv");
                                qr5Var3.o = qv8.l(str);
                                qr5Var3.I = 1;
                                qr5Var3.K = 8000;
                                k1fVar2.g(new rr5(qr5Var3));
                                sk0Var.d = true;
                            } else if (i16 != 10) {
                                throw new xde("Audio format not supported: " + sk0Var.e);
                            }
                            sk0Var.c = true;
                        }
                        k1f k1fVar3 = (k1f) sk0Var.b;
                        if (sk0Var.e == 2) {
                            int iA = d0aVarG3.a();
                            k1fVar3.e(iA, d0aVarG3);
                            ((k1f) sk0Var.b).a(j2, 1, iA, 0, null);
                        } else {
                            int iZ5 = d0aVarG3.z();
                            if (iZ5 == 0 && !sk0Var.d) {
                                int iA2 = d0aVarG3.a();
                                byte[] bArr4 = new byte[iA2];
                                d0aVarG3.k(bArr4, 0, iA2);
                                i iVarC0 = jgb.c0(new zu1(bArr4, iA2), false);
                                qr5 qr5Var4 = new qr5();
                                qr5Var4.n = qv8.l("video/x-flv");
                                qr5Var4.o = qv8.l("audio/mp4a-latm");
                                qr5Var4.k = iVarC0.c;
                                qr5Var4.I = iVarC0.b;
                                qr5Var4.K = iVarC0.a;
                                qr5Var4.r = Collections.singletonList(bArr4);
                                k1fVar3.g(new rr5(qr5Var4));
                                sk0Var.d = true;
                            } else if (sk0Var.e != 10 || iZ5 == 1) {
                                int iA3 = d0aVarG3.a();
                                k1fVar3.e(iA3, d0aVarG3);
                                ((k1f) sk0Var.b).a(j2, 1, iA3, 0, null);
                            }
                            z = false;
                        }
                        z = true;
                    }
                    if (!this.h && z) {
                        this.h = true;
                        if (qgcVar.c == -9223372036854775807L) {
                            j3 = -this.m;
                        } else {
                            j3 = 0;
                        }
                        this.i = j3;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z3) {
                        return 0;
                    }
                }
                j2 = j;
                i = this.k;
                if (i == 8) {
                    int i18 = 4;
                    if (i != 9) {
                        if (i == 18) {
                        }
                        m95Var.l(this.l);
                        z = false;
                        z3 = false;
                    } else {
                        if (i == 18) {
                        }
                        m95Var.l(this.l);
                        z = false;
                        z3 = false;
                    }
                } else {
                    int i19 = 4;
                    if (i != 9) {
                        if (i == 18) {
                        }
                        m95Var.l(this.l);
                        z = false;
                        z3 = false;
                    } else {
                        if (i == 18) {
                        }
                        m95Var.l(this.l);
                        z = false;
                        z3 = false;
                    }
                }
                if (!this.h) {
                    this.h = true;
                    if (qgcVar.c == -9223372036854775807L) {
                        j3 = -this.m;
                    } else {
                        j3 = 0;
                    }
                    this.i = j3;
                }
                this.j = 4;
                this.g = 2;
                if (z3) {
                    return 0;
                }
            }
        }
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        this.f = n95Var;
    }

    public final d0a g(m95 m95Var) {
        int i = this.l;
        d0a d0aVar = this.d;
        byte[] bArr = d0aVar.a;
        if (i > bArr.length) {
            d0aVar.K(new byte[Math.max(bArr.length * 2, i)], 0);
        } else {
            d0aVar.M(0);
        }
        d0aVar.L(this.l);
        m95Var.readFully(d0aVar.a, 0, this.l);
        return d0aVar;
    }

    @Override // defpackage.l95
    public final void a() {
    }
}

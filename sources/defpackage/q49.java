package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q49 implements l95 {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public long E;
    public n95 F;
    public p49[] G;
    public long[][] H;
    public int I;
    public final d8e a;
    public final int b;
    public final boolean c;
    public final d0a d;
    public final d0a e;
    public final d0a f;
    public final d0a g;
    public final ArrayDeque h;
    public final ptc i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public yob m;
    public int n;
    public int o;
    public long p;
    public int q;
    public d0a r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public long z;

    public q49(d8e d8eVar, int i) {
        this.a = d8eVar;
        this.b = i;
        this.c = (i & 256) != 0;
        ey6 ey6Var = jy6.b;
        this.m = yob.e;
        this.n = (i & 4) != 0 ? 3 : 0;
        this.i = new ptc();
        this.j = new ArrayList();
        this.g = new d0a(16);
        this.h = new ArrayDeque();
        this.d = new d0a(n16.D);
        this.e = new d0a(6);
        this.f = new d0a();
        this.s = -1;
        this.F = n95.A;
        this.G = new p49[0];
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        yob yobVarS;
        qsd qsdVarO = vpf.O(m95Var, false);
        if (qsdVarO != null) {
            yobVarS = jy6.s(qsdVarO);
        } else {
            ey6 ey6Var = jy6.b;
            yobVarS = yob.e;
        }
        this.m = yobVarS;
        return qsdVarO == null;
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        this.h.clear();
        this.q = 0;
        this.s = -1;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = false;
        this.B = false;
        this.C = 0;
        this.D = 0;
        this.k.clear();
        this.l.clear();
        if (j == 0) {
            if (this.n != 3) {
                this.n = 0;
                this.q = 0;
                return;
            } else {
                ptc ptcVar = this.i;
                ptcVar.a.clear();
                ptcVar.b = 0;
                this.j.clear();
                return;
            }
        }
        for (p49 p49Var : this.G) {
            n1f n1fVar = p49Var.b;
            int iA = n1fVar.a(j2);
            if (iA == -1) {
                iA = n1fVar.b(j2);
            }
            p49Var.g = iA;
            o5f o5fVar = p49Var.d;
            if (o5fVar != null) {
                o5fVar.b = false;
                o5fVar.c = 0;
            }
        }
    }

    @Override // defpackage.l95
    public final List d() {
        return this.m;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:234:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:235:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:342:0x0715  */
    /* JADX WARN: Code duplicated, block: B:343:0x0721  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01de  */
    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) throws l0a {
        long j;
        boolean zEquals;
        char c;
        int i;
        int iK;
        int i2;
        long j2;
        long j3;
        long position;
        long j4;
        d0a d0aVar;
        char c2;
        p49[] p49VarArr;
        int i3;
        qu8 qu8Var;
        boolean z;
        boolean z2;
        m49 m49Var;
        if (!this.c || !this.B) {
            while (true) {
                int i4 = this.n;
                ArrayDeque arrayDeque = this.h;
                d0a d0aVar2 = this.f;
                int i5 = 0;
                boolean z3 = true;
                if (i4 != 0) {
                    int i6 = 4;
                    if (i4 == 1) {
                        long j5 = this.p - ((long) this.q);
                        long position2 = m95Var.getPosition() + j5;
                        d0a d0aVar3 = this.r;
                        if (d0aVar3 == null) {
                            if (!this.x && this.o == 1835295092) {
                                this.I = 1;
                            }
                            if (j5 < 262144) {
                                m95Var.l((int) j5);
                            } else {
                                d82Var.b = m95Var.getPosition() + j5;
                                z = true;
                            }
                            g(position2);
                            i2 = 1;
                            if (this.y) {
                                this.A = true;
                                d82Var.b = this.z;
                                this.y = false;
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (z2 && this.n != 2) {
                                break;
                            }
                        } else {
                            m95Var.readFully(d0aVar3.a, this.q, (int) j5);
                            if (this.o == 1718909296) {
                                this.x = true;
                                d0aVar3.M(8);
                                int i7 = d0aVar3.m() != 1903435808 ? 0 : 1;
                                if (i7 == 0) {
                                    d0aVar3.N(4);
                                    do {
                                        if (d0aVar3.a() <= 0) {
                                            i7 = 0;
                                            break;
                                        }
                                        i7 = d0aVar3.m() != 1903435808 ? 0 : 1;
                                    } while (i7 == 0);
                                }
                                this.I = i7;
                            } else if (!arrayDeque.isEmpty()) {
                                ((m49) arrayDeque.peek()).d.add(new n49(this.o, d0aVar3));
                            }
                        }
                        z = false;
                        g(position2);
                        i2 = 1;
                        if (this.y) {
                            this.A = true;
                            d82Var.b = this.z;
                            this.y = false;
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (z2) {
                            continue;
                        }
                    } else {
                        if (i4 == 2) {
                            long position3 = m95Var.getPosition();
                            int i8 = this.s;
                            if (i8 == -1) {
                                long jMin = Long.MAX_VALUE;
                                boolean z4 = true;
                                boolean z5 = true;
                                int i9 = 0;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                long j6 = Long.MAX_VALUE;
                                long j7 = Long.MAX_VALUE;
                                long j8 = Long.MAX_VALUE;
                                long j9 = Long.MAX_VALUE;
                                while (true) {
                                    p49[] p49VarArr2 = this.G;
                                    j = position3;
                                    if (i9 >= p49VarArr2.length) {
                                        break;
                                    }
                                    p49 p49Var = p49VarArr2[i9];
                                    int i13 = p49Var.g;
                                    n1f n1fVar = p49Var.b;
                                    boolean z6 = z4;
                                    if (i13 == n1fVar.b) {
                                        z4 = z6;
                                    } else {
                                        int i14 = i11;
                                        int i15 = i12;
                                        long j10 = n1fVar.f[i13];
                                        if (p49Var.e) {
                                            jMin = Math.min(jMin, j10);
                                        } else if (p49Var.f && j10 < j6) {
                                            i10 = i9;
                                            j6 = j10;
                                        }
                                        long j11 = n1fVar.c[i13];
                                        long[][] jArr = this.H;
                                        jArr.getClass();
                                        long j12 = jArr[i9][i13];
                                        long j13 = j11 - j;
                                        boolean z7 = j13 < 0 || j13 >= 262144;
                                        if ((z7 || !z5) && (z7 != z5 || j13 >= j9)) {
                                            i12 = i15;
                                        } else {
                                            z5 = z7;
                                            j9 = j13;
                                            j7 = j12;
                                            i12 = i9;
                                        }
                                        if (j12 < j8) {
                                            z4 = z7;
                                            i11 = i9;
                                            j8 = j12;
                                        } else {
                                            z4 = z6;
                                            i11 = i14;
                                        }
                                    }
                                    i9++;
                                    position3 = j;
                                }
                                i8 = (jMin == Long.MAX_VALUE || i10 == -1 || j6 > jMin) ? (j8 == Long.MAX_VALUE || !z4 || j7 < j8 + 10485760) ? i12 : i11 : i10;
                                this.s = i8;
                                if (i8 == -1) {
                                    return -1;
                                }
                            } else {
                                j = position3;
                            }
                            p49 p49Var2 = this.G[i8];
                            k1f k1fVar = p49Var2.c;
                            n1f n1fVar2 = p49Var2.b;
                            d1f d1fVar = p49Var2.a;
                            int i16 = p49Var2.g;
                            long[] jArr2 = n1fVar2.c;
                            int[] iArr = n1fVar2.d;
                            long j14 = jArr2[i16] + this.E;
                            int i17 = iArr[i16];
                            o5f o5fVar = p49Var2.d;
                            long j15 = (j14 - j) + ((long) this.t);
                            if (j15 < 0 || j15 >= 262144) {
                                d82Var.b = j14;
                                return 1;
                            }
                            int i18 = d1fVar.h;
                            int i19 = d1fVar.k;
                            rr5 rr5Var = d1fVar.g;
                            if (i18 == 1) {
                                j15 += 8;
                                i17 -= 8;
                            }
                            m95Var.l((int) j15);
                            String str = rr5Var.p;
                            String str2 = rr5Var.p;
                            boolean zEquals2 = Objects.equals(str, "video/avc");
                            int i20 = this.b;
                            if (zEquals2) {
                                if ((i20 & 32) != 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (!Objects.equals(str, "video/hevc")) {
                                zEquals = Objects.equals(str, "video/apv");
                            } else if ((i20 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                c = 1;
                            } else {
                                c = 1;
                                this.w = true;
                            }
                            if (i19 == 0) {
                                rr5 rr5Var2 = p49Var2.h;
                                if ("audio/ac4".equals(str2)) {
                                    if (this.u == 0) {
                                        g21.N(i17, d0aVar2);
                                        k1fVar.e(7, d0aVar2);
                                        this.u += 7;
                                    }
                                    i17 += 7;
                                } else if (rr5Var2 != null && Objects.equals(str2, "audio/mpeg")) {
                                    d0aVar2.J(4);
                                    m95Var.o(d0aVar2.a, 0, 4);
                                    m95Var.k();
                                    u49 u49Var = new u49();
                                    if (u49Var.a(d0aVar2.m()) && !Objects.equals(rr5Var2.p, (String) u49Var.g)) {
                                        qr5 qr5VarA = rr5Var2.a();
                                        String str3 = (String) u49Var.g;
                                        str3.getClass();
                                        qr5VarA.o = qv8.l(str3);
                                        rr5Var2 = new rr5(qr5VarA);
                                    }
                                    k1fVar.g(rr5Var2);
                                    p49Var2.h = null;
                                } else if (rr5Var2 != null && y41.z(str2)) {
                                    k1fVar.g(y41.V(m95Var, i17, rr5Var2));
                                    p49Var2.h = null;
                                } else if (o5fVar != null) {
                                    o5fVar.c(m95Var);
                                }
                                while (true) {
                                    int i21 = this.u;
                                    if (i21 >= i17) {
                                        break;
                                    }
                                    int iC = k1fVar.c(m95Var, i17 - i21, false);
                                    this.t += iC;
                                    this.u += iC;
                                    this.v -= iC;
                                }
                            } else {
                                d0a d0aVar4 = this.e;
                                byte[] bArr = d0aVar4.a;
                                bArr[0] = 0;
                                bArr[c] = 0;
                                bArr[2] = 0;
                                int i22 = 4 - i19;
                                i17 += i22;
                                while (this.u < i17) {
                                    int i23 = this.v;
                                    if (i23 == 0) {
                                        if (this.w || n16.K(rr5Var) + i19 > iArr[i16] - this.t) {
                                            i = i19;
                                            iK = 0;
                                        } else {
                                            iK = n16.K(rr5Var);
                                            i = i19 + iK;
                                        }
                                        m95Var.readFully(bArr, i22, i);
                                        this.t += i;
                                        d0aVar4.M(0);
                                        int iM = d0aVar4.m();
                                        if (iM < 0) {
                                            throw l0a.a(null, "Invalid NAL length");
                                        }
                                        this.v = iM - iK;
                                        d0a d0aVar5 = this.d;
                                        d0aVar5.M(0);
                                        k1fVar.e(4, d0aVar5);
                                        this.u += 4;
                                        if (iK > 0) {
                                            k1fVar.e(iK, d0aVar4);
                                            this.u += iK;
                                            if (n16.G(bArr, iK, rr5Var)) {
                                                this.w = true;
                                            }
                                        }
                                    } else {
                                        int iC2 = k1fVar.c(m95Var, i23, false);
                                        this.t += iC2;
                                        this.u += iC2;
                                        this.v -= iC2;
                                    }
                                }
                            }
                            int i24 = i17;
                            long j16 = n1fVar2.f[i16];
                            int i25 = n1fVar2.g[i16];
                            if (!this.w) {
                                i25 |= 67108864;
                            }
                            int i26 = i25;
                            if (o5fVar != null) {
                                o5fVar.b(k1fVar, j16, i26, i24, 0, null);
                                if (i16 + 1 == n1fVar2.b) {
                                    o5fVar.a(k1fVar, null);
                                }
                            } else {
                                k1fVar.a(j16, i26, i24, 0, null);
                            }
                            p49Var2.g++;
                            this.s = -1;
                            this.t = 0;
                            this.u = 0;
                            this.v = 0;
                            this.w = false;
                            return 0;
                        }
                        if (i4 != 3) {
                            if (i4 != 4) {
                                r3.l();
                                return 0;
                            }
                            int i27 = this.C;
                            ArrayList arrayList = this.k;
                            n1f n1fVar3 = (n1f) arrayList.get(i27);
                            int i28 = this.D;
                            int i29 = n1fVar3.b;
                            long[] jArr3 = n1fVar3.f;
                            ArrayList arrayList2 = this.l;
                            if (i28 < i29) {
                                long j17 = n1fVar3.c[i28];
                                if (m95Var.getPosition() != j17) {
                                    d82Var.b = j17;
                                    return 1;
                                }
                                int i30 = n1fVar3.d[this.D];
                                d0aVar2.J(i30);
                                m95Var.readFully(d0aVar2.a, 0, i30);
                                String strX = d0aVar2.x(Math.min(d0aVar2.G(), d0aVar2.a()), StandardCharsets.UTF_8);
                                long jR = pqf.R(jArr3[this.D]);
                                int i31 = this.D + 1;
                                arrayList2.add(new ww1(jR, i31 < n1fVar3.b ? pqf.R(jArr3[i31]) : pqf.R(n1fVar3.i), false, new fu7(null, strX)));
                                this.D++;
                                return 0;
                            }
                            p49[] p49VarArr3 = this.G;
                            int length = p49VarArr3.length;
                            int i32 = 0;
                            while (i32 < length) {
                                p49 p49Var3 = p49VarArr3[i32];
                                if (p49Var3.a.l == n1fVar3.a.a) {
                                    rr5 rr5Var3 = p49Var3.h;
                                    rr5Var3.getClass();
                                    su8 su8Var = rr5Var3.m;
                                    ArrayList arrayList3 = new ArrayList();
                                    if (su8Var != null) {
                                        dy6 dy6VarM = jy6.m();
                                        qu8[] qu8VarArr = su8Var.a;
                                        int length2 = qu8VarArr.length;
                                        while (i5 < length2) {
                                            qu8 qu8Var2 = qu8VarArr[i5];
                                            p49[] p49VarArr4 = p49VarArr3;
                                            int i33 = length;
                                            if (qu8.class.isAssignableFrom(qu8Var2.getClass())) {
                                                qu8Var = (qu8) qu8.class.cast(qu8Var2);
                                                if (qu8Var instanceof uw1) {
                                                    qu8Var = null;
                                                }
                                            } else {
                                                qu8Var = null;
                                            }
                                            if (qu8Var != null) {
                                                dy6VarM.b(qu8Var);
                                            }
                                            i5++;
                                            p49VarArr3 = p49VarArr4;
                                            length = i33;
                                        }
                                        p49VarArr = p49VarArr3;
                                        i3 = length;
                                        arrayList3.addAll(dy6VarM.g());
                                    } else {
                                        p49VarArr = p49VarArr3;
                                        i3 = length;
                                    }
                                    arrayList3.addAll(arrayList2);
                                    qr5 qr5VarA2 = rr5Var3.a();
                                    qr5VarA2.l = new su8(arrayList3);
                                    rr5 rr5Var4 = new rr5(qr5VarA2);
                                    String str4 = rr5Var4.p;
                                    if (Objects.equals(str4, "audio/mpeg") || y41.z(str4)) {
                                        p49Var3.h = rr5Var4;
                                    } else {
                                        p49Var3.c.g(rr5Var4);
                                        p49Var3.h = null;
                                    }
                                } else {
                                    p49VarArr = p49VarArr3;
                                    i3 = length;
                                    z3 = z3;
                                }
                                i32++;
                                p49VarArr3 = p49VarArr;
                                length = i3;
                                z3 = z3;
                                i5 = 0;
                            }
                            this.C++;
                            this.D = 0;
                            arrayList2.clear();
                            if (this.C == arrayList.size()) {
                                this.n = 2;
                            }
                            return 0;
                        }
                        ptc ptcVar = this.i;
                        ArrayList arrayList4 = ptcVar.a;
                        int i34 = ptcVar.b;
                        if (i34 != 0) {
                            if (i34 != 1) {
                                short s = 2817;
                                int i35 = 8;
                                if (i34 == 2) {
                                    long length3 = m95Var.getLength();
                                    int i36 = ptcVar.c - 20;
                                    d0a d0aVar6 = new d0a(i36);
                                    m95Var.readFully(d0aVar6.a, 0, i36);
                                    int i37 = 0;
                                    while (i37 < i36 / 12) {
                                        d0aVar6.N(2);
                                        d0aVar6.f(2);
                                        byte[] bArr2 = d0aVar6.a;
                                        int i38 = d0aVar6.b;
                                        int i39 = i38 + 1;
                                        d0aVar6.b = i39;
                                        int i40 = bArr2[i38] & 255;
                                        d0aVar6.b = i38 + 2;
                                        short s2 = (short) (((bArr2[i39] & 255) << 8) | i40);
                                        if (s2 != 2192 && s2 != 2816 && s2 != s) {
                                            if (s2 != 2819 && s2 != 2820) {
                                                d0aVar6.N(i35);
                                                d0aVar = d0aVar6;
                                            }
                                            i37++;
                                            d0aVar6 = d0aVar;
                                            s = 2817;
                                            i35 = 8;
                                        }
                                        d0aVar = d0aVar6;
                                        arrayList4.add(new otc((length3 - ((long) ptcVar.c)) - ((long) d0aVar.o()), d0aVar.o()));
                                        i37++;
                                        d0aVar6 = d0aVar;
                                        s = 2817;
                                        i35 = 8;
                                    }
                                    if (arrayList4.isEmpty()) {
                                        d82Var.b = 0L;
                                        j4 = 0;
                                    } else {
                                        ptcVar.b = 3;
                                        j4 = ((otc) arrayList4.get(0)).a;
                                        d82Var.b = j4;
                                    }
                                    j2 = j4;
                                } else {
                                    if (i34 != 3) {
                                        r3.l();
                                        return 0;
                                    }
                                    long position4 = m95Var.getPosition();
                                    int length4 = (int) ((m95Var.getLength() - m95Var.getPosition()) - ((long) ptcVar.c));
                                    d0a d0aVar7 = new d0a(length4);
                                    m95Var.readFully(d0aVar7.a, 0, length4);
                                    int i41 = 0;
                                    while (i41 < arrayList4.size()) {
                                        otc otcVar = (otc) arrayList4.get(i41);
                                        d0aVar7.M((int) (otcVar.a - position4));
                                        d0aVar7.N(i6);
                                        int iO = d0aVar7.o();
                                        Charset charset = StandardCharsets.UTF_8;
                                        switch (d0aVar7.x(iO, charset)) {
                                            case "SlowMotion_Data":
                                                c2 = 2192;
                                                break;
                                            case "Super_SlowMotion_Edit_Data":
                                                c2 = 2819;
                                                break;
                                            case "Super_SlowMotion_Data":
                                                c2 = 2816;
                                                break;
                                            case "Super_SlowMotion_Deflickering_On":
                                                c2 = 2820;
                                                break;
                                            case "Super_SlowMotion_BGM":
                                                c2 = 2817;
                                                break;
                                            default:
                                                throw l0a.a(null, "Invalid SEF name");
                                        }
                                        int i42 = otcVar.b - (iO + 8);
                                        if (c2 == 2192) {
                                            ArrayList arrayList5 = new ArrayList();
                                            List listD = ptc.e.d(d0aVar7.x(i42, charset));
                                            for (int i43 = 0; i43 < listD.size(); i43++) {
                                                List listD2 = ptc.d.d((CharSequence) listD.get(i43));
                                                if (listD2.size() != 3) {
                                                    throw l0a.a(null, null);
                                                }
                                                try {
                                                    arrayList5.add(new ppd(Long.parseLong((String) listD2.get(0)), 1 << (Integer.parseInt((String) listD2.get(2)) - 1), Long.parseLong((String) listD2.get(1))));
                                                } catch (NumberFormatException e) {
                                                    throw l0a.a(e, null);
                                                }
                                            }
                                            this.j.add(new qpd(arrayList5));
                                        } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                                            r3.l();
                                            return 0;
                                        }
                                        i41++;
                                        i6 = 4;
                                    }
                                    d82Var.b = 0L;
                                    j3 = 0;
                                    i2 = 1;
                                    j2 = 0;
                                }
                            } else {
                                d0a d0aVar8 = new d0a(8);
                                m95Var.readFully(d0aVar8.a, 0, 8);
                                ptcVar.c = d0aVar8.o() + 8;
                                if (d0aVar8.m() != 1397048916) {
                                    d82Var.b = 0L;
                                    position = 0;
                                } else {
                                    position = m95Var.getPosition() - ((long) (ptcVar.c - 12));
                                    d82Var.b = position;
                                    ptcVar.b = 2;
                                }
                                j2 = position;
                            }
                            j3 = 0;
                            i2 = 1;
                        } else {
                            long length5 = m95Var.getLength();
                            long j18 = (length5 == -1 || length5 < 8) ? 0L : length5 - 8;
                            d82Var.b = j18;
                            i2 = 1;
                            ptcVar.b = 1;
                            j2 = j18;
                            j3 = 0;
                        }
                        if (j2 == j3) {
                            this.n = 0;
                            this.q = 0;
                            return i2;
                        }
                    }
                } else {
                    int i44 = this.q;
                    d0a d0aVar9 = this.g;
                    if (i44 == 0) {
                        if (m95Var.a(d0aVar9.a, 0, 8, true)) {
                            this.q = 8;
                            d0aVar9.M(0);
                            this.p = d0aVar9.B();
                            this.o = d0aVar9.m();
                        }
                    }
                    long j19 = this.p;
                    if (j19 == 1) {
                        m95Var.readFully(d0aVar9.a, 8, 8);
                        this.q += 8;
                        this.p = d0aVar9.F();
                    } else if (j19 == 0) {
                        long length6 = m95Var.getLength();
                        if (length6 == -1 && (m49Var = (m49) arrayDeque.peek()) != null) {
                            length6 = m49Var.c;
                        }
                        if (length6 != -1) {
                            this.p = (length6 - m95Var.getPosition()) + ((long) this.q);
                        }
                    }
                    long j20 = this.p;
                    int i45 = this.q;
                    long j21 = i45;
                    if (j20 < j21) {
                        if (this.o != 1718773093 || i45 != 8) {
                            throw l0a.b("Atom size less than header length (unsupported).");
                        }
                        this.p = j21;
                    }
                    int i46 = this.o;
                    if (i46 == 1836019574 || i46 == 1953653099 || i46 == 1835297121 || i46 == 1835626086 || i46 == 1937007212 || i46 == 1701082227 || i46 == 1835365473 || i46 == 1635284069 || i46 == 1953654118) {
                        long position5 = m95Var.getPosition();
                        long j22 = this.p;
                        long j23 = this.q;
                        long j24 = (position5 + j22) - j23;
                        if (j22 != j23 && this.o == 1835365473) {
                            d0aVar2.J(8);
                            m95Var.o(d0aVar2.a, 0, 8);
                            b31.a(d0aVar2);
                            m95Var.l(d0aVar2.b);
                            m95Var.k();
                        }
                        arrayDeque.push(new m49(this.o, j24));
                        if (this.p == this.q) {
                            g(j24);
                        } else {
                            this.n = 0;
                            this.q = 0;
                        }
                    } else if (i46 == 1835296868 || i46 == 1836476516 || i46 == 1751411826 || i46 == 1937011556 || i46 == 1937011827 || i46 == 1937011571 || i46 == 1668576371 || i46 == 1701606260 || i46 == 1937011555 || i46 == 1937011578 || i46 == 1937013298 || i46 == 1937007471 || i46 == 1668232756 || i46 == 1953196132 || i46 == 1718909296 || i46 == 1969517665 || i46 == 1801812339 || i46 == 1768715124 || i46 == 1667785072) {
                        pa7.J(i45 == 8);
                        pa7.J(this.p <= 2147483647L);
                        d0a d0aVar10 = new d0a((int) this.p);
                        System.arraycopy(d0aVar9.a, 0, d0aVar10.a, 0, 8);
                        this.r = d0aVar10;
                        this.n = 1;
                    } else {
                        this.r = null;
                        this.n = 1;
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        if ((this.b & 16) == 0) {
            n95Var = new zi0(n95Var, this.a);
        }
        this.F = n95Var;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x0370  */
    /* JADX WARN: Code duplicated, block: B:186:0x0380  */
    /* JADX WARN: Code duplicated, block: B:195:0x039b  */
    /* JADX WARN: Code duplicated, block: B:197:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:204:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:214:0x03ed A[EDGE_INSN: B:214:0x03ed->B:215:0x03ef BREAK  A[LOOP:8: B:209:0x03d9->B:315:?]] */
    /* JADX WARN: Code duplicated, block: B:217:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[LOOP:1: B:14:0x004d->B:24:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:285:0x007d A[EDGE_INSN: B:285:0x007d->B:26:0x007d BREAK  A[LOOP:1: B:14:0x004d->B:24:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void g(long j) {
        int i;
        ArrayList arrayList;
        su8 su8VarF;
        ArrayList arrayList2;
        boolean z;
        su8 su8VarK;
        long[][] jArr;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i2;
        p49 p49Var;
        long j2;
        int i3;
        su8 su8Var;
        ArrayList arrayList5;
        su8 su8Var2;
        su8 su8Var3;
        su8 su8Var4;
        su8 su8Var5;
        rr5 rr5Var;
        int i4;
        int i5;
        p49 p49Var2;
        int size;
        ArrayList arrayList6;
        int i6;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList7;
        qu8 qu8Var;
        qu8 qu8Var2;
        qu8 qu8Var3;
        int i10;
        while (true) {
            ArrayDeque arrayDeque = this.h;
            if (arrayDeque.isEmpty() || ((m49) arrayDeque.peek()).c != j) {
                break;
            }
            m49 m49Var = (m49) arrayDeque.pop();
            if (m49Var.b == 1836019574) {
                m49 m49VarE = m49Var.e(1835365473);
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = this.k;
                boolean z2 = this.c;
                long j3 = 0;
                int i11 = this.b;
                if (m49VarE != null) {
                    su8VarF = b31.f(m49VarE);
                    if (this.A) {
                        su8VarF.getClass();
                        qu8[] qu8VarArr = su8VarF.a;
                        int length = qu8VarArr.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                i = 0;
                                qu8Var2 = null;
                                break;
                            }
                            qu8 qu8Var4 = qu8VarArr[i12];
                            if (sn8.class.isAssignableFrom(qu8Var4.getClass())) {
                                qu8Var2 = (qu8) sn8.class.cast(qu8Var4);
                                i = 0;
                                if (!((sn8) qu8Var2).a.equals("auxiliary.tracks.interleaved")) {
                                }
                                if (qu8Var2 != null) {
                                    break;
                                } else {
                                    i12++;
                                }
                            } else {
                                i = 0;
                            }
                            qu8Var2 = null;
                            if (qu8Var2 != null) {
                                break;
                                break;
                            }
                            i12++;
                        }
                        sn8 sn8Var = (sn8) qu8Var2;
                        if (sn8Var != null && sn8Var.b[i] == 0) {
                            this.E = this.z + 16;
                        }
                        int length2 = qu8VarArr.length;
                        int i13 = i;
                        while (true) {
                            if (i13 >= length2) {
                                qu8Var3 = null;
                                break;
                            }
                            qu8 qu8Var5 = qu8VarArr[i13];
                            if (sn8.class.isAssignableFrom(qu8Var5.getClass())) {
                                qu8Var3 = (qu8) sn8.class.cast(qu8Var5);
                                if (!((sn8) qu8Var3).a.equals("auxiliary.tracks.map")) {
                                    qu8Var3 = null;
                                }
                            } else {
                                qu8Var3 = null;
                            }
                            if (qu8Var3 != null) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        sn8 sn8Var2 = (sn8) qu8Var3;
                        sn8Var2.getClass();
                        ArrayList arrayListD = sn8Var2.d();
                        arrayList8 = new ArrayList(arrayListD.size());
                        for (int i14 = i; i14 < arrayListD.size(); i14++) {
                            int iIntValue = ((Integer) arrayListD.get(i14)).intValue();
                            if (iIntValue == 0) {
                                i10 = 1;
                            } else if (iIntValue != 1) {
                                i10 = 3;
                                if (iIntValue != 2) {
                                    i10 = iIntValue != 3 ? i : 4;
                                }
                            } else {
                                i10 = 2;
                            }
                            arrayList8.add(Integer.valueOf(i10));
                        }
                    } else {
                        i = 0;
                        if (su8VarF != null && (i11 & 64) != 0) {
                            qu8[] qu8VarArr2 = su8VarF.a;
                            int length3 = qu8VarArr2.length;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= length3) {
                                    qu8Var = null;
                                    break;
                                }
                                qu8 qu8Var6 = qu8VarArr2[i15];
                                if (sn8.class.isAssignableFrom(qu8Var6.getClass())) {
                                    qu8Var = (qu8) sn8.class.cast(qu8Var6);
                                    if (!((sn8) qu8Var).a.equals("auxiliary.tracks.offset")) {
                                        qu8Var = null;
                                    }
                                } else {
                                    qu8Var = null;
                                }
                                if (qu8Var != null) {
                                    break;
                                } else {
                                    i15++;
                                }
                            }
                            sn8 sn8Var3 = (sn8) qu8Var;
                            if (sn8Var3 != null) {
                                long jF = new d0a(sn8Var3.b).F();
                                if (jF > 0) {
                                    this.z = jF;
                                    this.y = true;
                                    arrayList2 = arrayList9;
                                    z = z2;
                                }
                                arrayDeque.clear();
                                this.B = true;
                                if (this.y && !z) {
                                    this.n = !arrayList2.isEmpty() ? 4 : 2;
                                }
                            }
                        }
                    }
                    arrayList = arrayList8;
                } else {
                    i = 0;
                    arrayList = arrayList8;
                    su8VarF = null;
                }
                ArrayList arrayList10 = new ArrayList();
                boolean z3 = this.I == 1 ? 1 : i;
                s46 s46Var = new s46();
                n49 n49VarG = m49Var.g(1969517665);
                if (n49VarG != null) {
                    su8VarK = b31.k(n49VarG, (i11 & 512) != 0 ? 1 : i);
                    s46Var.b(su8VarK);
                } else {
                    su8VarK = null;
                }
                n49 n49VarG2 = m49Var.g(1836476516);
                n49VarG2.getClass();
                qu8[] qu8VarArr3 = new qu8[1];
                qu8VarArr3[i] = b31.g(n49VarG2.c);
                su8 su8Var6 = new su8(qu8VarArr3);
                ArrayList arrayList11 = arrayList9;
                z = z2;
                ArrayList<n1f> arrayListJ = b31.j(m49Var, s46Var, -9223372036854775807L, null, (i11 & 1) != 0 ? 1 : i, z3, new t51(11), this.c);
                if (this.A) {
                    boolean z4 = arrayList.size() == arrayListJ.size() ? 1 : i;
                    Locale locale = Locale.US;
                    pa7.I(kv2.h(arrayList.size(), arrayListJ.size(), "The number of auxiliary track types from metadata (", ") is not same as the number of auxiliary tracks (", ")"), z4);
                }
                ArrayList arrayList12 = new ArrayList();
                for (n1f n1fVar : arrayListJ) {
                    int i16 = n1fVar.a.l;
                    if (i16 != -1 && !arrayList12.contains(Integer.valueOf(i16))) {
                        arrayList12.add(Integer.valueOf(n1fVar.a.l));
                    }
                }
                arrayList11.clear();
                for (n1f n1fVar2 : arrayListJ) {
                    if (arrayList12.contains(Integer.valueOf(n1fVar2.a.a))) {
                        arrayList7 = arrayList11;
                        arrayList7.add(n1fVar2);
                    } else {
                        arrayList7 = arrayList11;
                    }
                    arrayList11 = arrayList7;
                }
                ArrayList arrayList13 = arrayList11;
                String strK = kn2.K(arrayListJ);
                int i17 = -1;
                int i18 = i;
                int i19 = i18;
                long j4 = -9223372036854775807L;
                while (i18 < arrayListJ.size()) {
                    n1f n1fVar3 = (n1f) arrayListJ.get(i18);
                    ArrayList arrayList14 = arrayListJ;
                    int i20 = n1fVar3.b;
                    long[] jArr2 = n1fVar3.f;
                    String str = strK;
                    d1f d1fVar = n1fVar3.a;
                    if (i20 == 0) {
                        arrayList4 = arrayList10;
                        arrayList3 = arrayList13;
                    } else {
                        arrayList3 = arrayList13;
                        boolean z5 = d1fVar.m;
                        rr5 rr5Var2 = d1fVar.g;
                        arrayList4 = arrayList10;
                        int i21 = d1fVar.l;
                        int i22 = d1fVar.b;
                        if (z5) {
                            su8 su8Var7 = su8VarF;
                            su8 su8Var8 = su8VarK;
                            int i23 = i19 + 1;
                            k1f k1fVarN = this.F.n(i19, i22);
                            p49 p49Var3 = new p49(d1fVar, n1fVar3, k1fVarN);
                            su8 su8Var9 = su8Var6;
                            long j5 = d1fVar.e;
                            if (j5 == -9223372036854775807L) {
                                j5 = n1fVar3.i;
                            }
                            k1fVarN.d(j5);
                            long jMax = Math.max(j4, j5);
                            String str2 = rr5Var2.p;
                            boolean zEquals = "audio/true-hd".equals(str2);
                            int i24 = n1fVar3.e;
                            int i25 = zEquals ? i24 * 16 : i24 + 30;
                            qr5 qr5VarA = rr5Var2.a();
                            qr5VarA.p = i25;
                            if (i22 == 2) {
                                int i26 = rr5Var2.f;
                                if ((i11 & 8) != 0) {
                                    i26 |= i17 == -1 ? 1 : 2;
                                }
                                if (this.A) {
                                    i26 |= 32768;
                                    qr5VarA.h = ((Integer) arrayList.get(i18)).intValue();
                                }
                                qr5VarA.f = i26;
                            }
                            int[] iArr = n1fVar3.h;
                            boolean z6 = n1fVar3.j;
                            if (!qv8.k(rr5Var2.p) || jArr2.length <= 0) {
                                i2 = i17;
                                p49Var = p49Var3;
                            } else {
                                int iMin = Math.min(z6 ? n1fVar3.b : iArr.length, 20);
                                pa7.J(j5 != -9223372036854775807L ? 1 : i);
                                i2 = i17;
                                p49Var = p49Var3;
                                long jMin = Math.min(j5, 10000000L);
                                int i27 = i;
                                int i28 = i27;
                                int i29 = -1;
                                while (i27 < iMin) {
                                    int i30 = z6 ? i27 : iArr[i27];
                                    long j6 = jArr2[i30];
                                    if (j6 > jMin) {
                                        break;
                                    }
                                    if (j6 >= 0 && (i9 = n1fVar3.d[(i8 = i30)]) > i28) {
                                        i28 = i9;
                                        i29 = i8;
                                    }
                                    i27++;
                                }
                                if (i29 != -1) {
                                    j2 = jArr2[i29];
                                }
                                if (j2 != -9223372036854775807L) {
                                    bxe bxeVar = new bxe(j2);
                                    i3 = 1;
                                    qu8[] qu8VarArr4 = new qu8[1];
                                    qu8VarArr4[i] = bxeVar;
                                    su8Var = new su8(qu8VarArr4);
                                } else {
                                    i3 = 1;
                                    su8Var = null;
                                }
                                if (i22 == i3 && (i6 = s46Var.a) != -1 && (i7 = s46Var.b) != -1) {
                                    qr5VarA.M = i6;
                                    qr5VarA.N = i7;
                                }
                                su8 su8Var10 = rr5Var2.m;
                                arrayList5 = this.j;
                                if (arrayList5.isEmpty()) {
                                    su8Var2 = null;
                                } else {
                                    su8Var2 = new su8(arrayList5);
                                }
                                su8Var3 = su8Var8;
                                su8Var4 = su8Var9;
                                su8[] su8VarArr = {su8Var2, su8Var3, su8Var4, su8Var};
                                su8Var5 = su8Var7;
                                cn1.T(i22, su8Var5, qr5VarA, su8Var10, su8VarArr);
                                qr5VarA.n = qv8.l(str);
                                rr5Var = new rr5(qr5VarA);
                                if (!Objects.equals(str2, "audio/mpeg") || y41.z(str2)) {
                                    i4 = 1;
                                } else {
                                    i4 = i;
                                }
                                if (z && i21 != -1) {
                                    Iterator it = arrayList3.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((n1f) it.next()).a.a == i21) {
                                                i5 = 1;
                                                break;
                                            }
                                        } else {
                                            i5 = i;
                                            break;
                                        }
                                    }
                                } else {
                                    i5 = i;
                                    break;
                                }
                                if (i4 == 0 || i5 != 0) {
                                    p49Var2 = p49Var;
                                    p49Var2.h = rr5Var;
                                } else {
                                    p49Var2 = p49Var;
                                    p49Var2.c.g(rr5Var);
                                }
                                size = (i22 == 2 || i2 != -1) ? i2 : arrayList4.size();
                                arrayList6 = arrayList4;
                                arrayList6.add(p49Var2);
                                i19 = i23;
                                j4 = jMax;
                            }
                            j2 = -9223372036854775807L;
                            if (j2 != -9223372036854775807L) {
                                bxe bxeVar2 = new bxe(j2);
                                i3 = 1;
                                qu8[] qu8VarArr5 = new qu8[1];
                                qu8VarArr5[i] = bxeVar2;
                                su8Var = new su8(qu8VarArr5);
                            } else {
                                i3 = 1;
                                su8Var = null;
                            }
                            if (i22 == i3) {
                                qr5VarA.M = i6;
                                qr5VarA.N = i7;
                            }
                            su8 su8Var11 = rr5Var2.m;
                            arrayList5 = this.j;
                            if (arrayList5.isEmpty()) {
                                su8Var2 = null;
                            } else {
                                su8Var2 = new su8(arrayList5);
                            }
                            su8Var3 = su8Var8;
                            su8Var4 = su8Var9;
                            su8[] su8VarArr2 = {su8Var2, su8Var3, su8Var4, su8Var};
                            su8Var5 = su8Var7;
                            cn1.T(i22, su8Var5, qr5VarA, su8Var11, su8VarArr2);
                            qr5VarA.n = qv8.l(str);
                            rr5Var = new rr5(qr5VarA);
                            if (Objects.equals(str2, "audio/mpeg")) {
                                i4 = 1;
                            } else {
                                i4 = 1;
                            }
                            if (z) {
                                i5 = i;
                                break;
                            } else {
                                i5 = i;
                                break;
                            }
                            if (i4 == 0) {
                                p49Var2 = p49Var;
                                p49Var2.h = rr5Var;
                            } else {
                                p49Var2 = p49Var;
                                p49Var2.h = rr5Var;
                            }
                            if (i22 == 2) {
                            }
                            arrayList6 = arrayList4;
                            arrayList6.add(p49Var2);
                            i19 = i23;
                            j4 = jMax;
                        }
                        i18++;
                        i17 = size;
                        arrayList10 = arrayList6;
                        su8Var6 = su8Var4;
                        arrayListJ = arrayList14;
                        arrayList13 = arrayList3;
                        arrayList = arrayList;
                        su8VarK = su8Var3;
                        su8VarF = su8Var5;
                        strK = str;
                    }
                    size = i17;
                    su8Var5 = su8VarF;
                    su8Var3 = su8VarK;
                    su8Var4 = su8Var6;
                    arrayList6 = arrayList4;
                    i18++;
                    i17 = size;
                    arrayList10 = arrayList6;
                    su8Var6 = su8Var4;
                    arrayListJ = arrayList14;
                    arrayList13 = arrayList3;
                    arrayList = arrayList;
                    su8VarK = su8Var3;
                    su8VarF = su8Var5;
                    strK = str;
                }
                int i31 = i17;
                arrayList2 = arrayList13;
                int i32 = -1;
                p49[] p49VarArr = (p49[]) arrayList10.toArray(new p49[i]);
                this.G = p49VarArr;
                if (z) {
                    jArr = null;
                } else {
                    jArr = new long[p49VarArr.length][];
                    int[] iArr2 = new int[p49VarArr.length];
                    long[] jArr3 = new long[p49VarArr.length];
                    boolean[] zArr = new boolean[p49VarArr.length];
                    for (int i33 = 0; i33 < p49VarArr.length; i33++) {
                        jArr[i33] = new long[p49VarArr[i33].b.b];
                        jArr3[i33] = p49VarArr[i33].b.f[0];
                    }
                    int i34 = 0;
                    while (i34 < p49VarArr.length) {
                        long j7 = Long.MAX_VALUE;
                        int i35 = i32;
                        for (int i36 = 0; i36 < p49VarArr.length; i36++) {
                            if (!zArr[i36]) {
                                long j8 = jArr3[i36];
                                if (j8 <= j7) {
                                    i35 = i36;
                                    j7 = j8;
                                }
                            }
                        }
                        int i37 = iArr2[i35];
                        long[] jArr4 = jArr[i35];
                        jArr4[i37] = j3;
                        n1f n1fVar4 = p49VarArr[i35].b;
                        p49[] p49VarArr2 = p49VarArr;
                        j3 += (long) n1fVar4.d[i37];
                        int i38 = i37 + 1;
                        iArr2[i35] = i38;
                        if (i38 < jArr4.length) {
                            jArr3[i35] = n1fVar4.f[i38];
                        } else {
                            zArr[i35] = true;
                            i34++;
                        }
                        p49VarArr = p49VarArr2;
                        i32 = -1;
                    }
                }
                this.H = jArr;
                this.F.j();
                this.F.q(new o49(j4, this.G, i31));
                arrayDeque.clear();
                this.B = true;
                if (this.y) {
                }
            } else if (!arrayDeque.isEmpty()) {
                ((m49) arrayDeque.peek()).e.add(m49Var);
            }
        }
        int i39 = this.n;
        if (i39 == 4 || i39 == 2) {
            return;
        }
        this.n = 0;
        this.q = 0;
    }

    @Override // defpackage.l95
    public final void a() {
    }
}

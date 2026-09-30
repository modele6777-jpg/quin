package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lg8 extends cea implements r39, fw9, zn8 {
    public static final nd8 H0 = new nd8(2);
    public static final nd8 I0 = new nd8(3);
    public final mg8 E0 = new mg8(0, this);
    public a80 F0;
    public w79 G0;
    public w79 X;
    public boolean Y;
    public boolean Z;
    public kg8 f;
    public a26 g;
    public l26 v;
    public a26 w;
    public eea x;
    public w79 y;
    public boolean z;

    public static void J0(yf9 yf9Var) {
        uv7 uv7Var;
        yf9 yf9Var2 = yf9Var.M0;
        LayoutNode layoutNode = yf9Var.J0;
        if (!pa7.t(yf9Var2 != null ? yf9Var2.J0 : null, layoutNode)) {
            layoutNode.getLayoutDelegate().p.N0.f();
            return;
        }
        dj djVarG = layoutNode.getLayoutDelegate().p.g();
        if (djVarG == null || (uv7Var = ((wn8) djVarG).N0) == null) {
            return;
        }
        uv7Var.f();
    }

    public abstract LayoutNode A0();

    public abstract yn8 B0();

    public abstract lg8 C0();

    public abstract long E0();

    public final kg8 G0() {
        kg8 kg8Var = this.f;
        if (kg8Var != null) {
            return kg8Var;
        }
        kg8 kg8Var2 = new kg8(this);
        this.f = kg8Var2;
        return kg8Var2;
    }

    @Override // defpackage.r39
    public final void H(boolean z) {
        lg8 lg8VarC0 = C0();
        LayoutNode layoutNodeA0 = lg8VarC0 != null ? lg8VarC0.A0() : null;
        if (pa7.t(layoutNodeA0, A0())) {
            this.z = z;
            return;
        }
        if ((layoutNodeA0 != null ? layoutNodeA0.u() : null) != qv7.c) {
            if ((layoutNodeA0 != null ? layoutNodeA0.u() : null) != qv7.d) {
                return;
            }
        }
        this.z = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P0(x79 x79Var) {
        LayoutNode layoutNode;
        Object[] objArr = x79Var.b;
        long[] jArr = x79Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (layoutNode = (LayoutNode) ((g0g) objArr[(i << 3) + i3]).get()) != null) {
                        if (k0()) {
                            layoutNode.r0(false);
                        } else {
                            layoutNode.t0(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void R0();

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:1: B:14:0x0033->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:1: B:14:0x0033->B:24:0x006a], SYNTHETIC] */
    public final void S0() {
        a80 a80Var = this.F0;
        if (a80Var != null) {
            int i = a80Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((rq6[]) a80Var.c)[i2] = null;
                ((float[]) a80Var.d)[i2] = Float.NaN;
                ((byte[]) a80Var.e)[i2] = 0;
            }
            a80Var.b = 0;
        }
        w79 w79Var = this.G0;
        if (w79Var == null) {
            return;
        }
        Object[] objArr = w79Var.c;
        long[] jArr = w79Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            P0((x79) objArr[(i3 << 3) + i5]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        w79Var.a();
    }

    @Override // defpackage.cea
    public final int W(zi ziVar) {
        int iO0;
        if (!u0() || (iO0 = o0(ziVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = ziVar instanceof vtf;
        long j = this.e;
        return iO0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    @Override // defpackage.ga7
    public boolean k0() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void l0(LayoutNode layoutNode, rq6 rq6Var) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        w79 w79Var = this.G0;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (w79Var != null) {
            Object[] objArr = w79Var.c;
            long[] jArr3 = w79Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                x79 x79Var = (x79) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = x79Var.b;
                                long[] jArr4 = x79Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    LayoutNode layoutNode2 = (LayoutNode) ((g0g) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (layoutNode2 != null) {
                                                        boolean zW = layoutNode2.W();
                                                        i4 = i8;
                                                        if (zW) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    x79Var.n(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        w79 w79Var2 = this.G0;
        if (w79Var2 != null) {
            long[] jArr5 = w79Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((x79) w79Var2.c[i18]).c()) {
                                    w79Var2.l(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        w79 w79Var3 = this.G0;
        if (w79Var3 == null) {
            w79Var3 = new w79();
            this.G0 = w79Var3;
        }
        Object objG = w79Var3.g(rq6Var);
        if (objG == null) {
            objG = new x79();
            w79Var3.m(rq6Var, objG);
        }
        ((x79) objG).l(new g0g(layoutNode));
    }

    public abstract int o0(zi ziVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0(final eea eeaVar, final long j, final long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        LayoutNode layoutNode;
        boolean z2;
        int i;
        char c2;
        long j6;
        gw9 snapshotObserver;
        w79 w79Var = this.G0;
        a80 a80Var = this.F0;
        if (a80Var == null) {
            a80Var = new a80();
            this.F0 = a80Var;
        }
        a80 a80Var2 = a80Var;
        Owner owner = A0().Z;
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.a.d(eeaVar, H0, new x16() { // from class: jg8
                @Override // defpackage.x16
                public final Object invoke() {
                    lg8 lg8Var = this.a;
                    lg8Var.G0().a = false;
                    lg8Var.G0().b = j;
                    lg8Var.G0().c = j2;
                    a26 a26VarG = eeaVar.a.g();
                    if (a26VarG != null) {
                        a26VarG.d(lg8Var.G0());
                    }
                    return wef.a;
                }
            });
        }
        boolean zK0 = k0();
        x79 x79Var = (x79) a80Var2.f;
        x79 x79Var2 = (x79) a80Var2.g;
        int i2 = a80Var2.b;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) a80Var2.e)[i3];
            if (b == 3) {
                rq6 rq6Var = ((rq6[]) a80Var2.c)[i3];
                rq6Var.getClass();
                x79Var2.l(rq6Var);
            } else if (b != 0 && w79Var != null) {
                rq6 rq6Var2 = ((rq6[]) a80Var2.c)[i3];
                rq6Var2.getClass();
                x79 x79Var3 = (x79) w79Var.k(rq6Var2);
                if (x79Var3 != null) {
                    x79Var.k(x79Var3);
                }
            }
        }
        int i4 = a80Var2.b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) a80Var2.e;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                rq6[] rq6VarArr = (rq6[]) a80Var2.c;
                rq6VarArr[i6 - i5] = rq6VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = a80Var2.b;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((rq6[]) a80Var2.c)[i8] = null;
        }
        a80Var2.b -= i5;
        lg8 lg8VarC0 = C0();
        Object[] objArr = x79Var2.b;
        long[] jArr = x79Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            rq6 rq6Var3 = (rq6) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            lg8 lg8Var = lg8VarC0 == null ? this : lg8VarC0;
                            i = i9;
                            lg8 lg8Var2 = lg8Var;
                            while (true) {
                                a80 a80Var3 = lg8Var2.F0;
                                if (a80Var3 != null) {
                                    z2 = zK0;
                                    if (qd0.V((rq6[]) a80Var3.c, rq6Var3)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z2 = zK0;
                                lg8 lg8VarC1 = lg8Var2.C0();
                                if (lg8VarC1 == null) {
                                    break;
                                }
                                lg8Var2 = lg8VarC1;
                                zK0 = z2;
                            }
                            w79 w79Var2 = lg8Var2.G0;
                            x79 x79Var4 = w79Var2 != null ? (x79) w79Var2.k(rq6Var3) : null;
                            if (x79Var4 != null) {
                                lg8Var.P0(x79Var4);
                            }
                        } else {
                            z2 = zK0;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        zK0 = z2;
                    }
                    z = zK0;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zK0;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                zK0 = z;
                i9 = 8;
            }
        } else {
            z = zK0;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        x79Var2.f();
        Object[] objArr2 = x79Var.b;
        long[] jArr2 = x79Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (layoutNode = (LayoutNode) ((g0g) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                layoutNode.r0(false);
                            } else {
                                layoutNode.t0(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        x79Var.f();
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0132  */
    /* JADX WARN: Code duplicated, block: B:72:0x0135  */
    public final void r0(yn8 yn8Var) {
        long j;
        char c;
        long j2;
        long j3;
        kg8 kg8Var;
        w79 w79Var;
        long[] jArr;
        Object[] objArr;
        int i;
        long[] jArr2;
        Object[] objArr2;
        int i2;
        boolean z;
        a80 a80Var;
        w79 w79Var2;
        x79 x79Var;
        kg8 kg8Var2;
        long j4;
        if (this.Z) {
            return;
        }
        a26 a26VarG = yn8Var.g();
        l26 l26VarF = yn8Var.f();
        a26 a26VarE = yn8Var.e();
        long jL = 0;
        if (l26VarF == null) {
            long jR = 9223372034707292159L;
            if (a26VarG == null) {
                S0();
                this.g = null;
                this.v = null;
                this.w = null;
                kg8 kg8Var3 = this.f;
                if (kg8Var3 != null) {
                    kg8Var3.a = false;
                }
                if (kg8Var3 != null) {
                    kg8Var3.b = 9223372034707292159L;
                    return;
                }
                return;
            }
            this.v = null;
            this.w = null;
            boolean z2 = this.g != a26VarG;
            if (!z2 && G0().a) {
                bv7 bv7VarT0 = t0();
                jR = qn4.R(bv7VarT0.r(0L));
                jL = bv7VarT0.l();
                z2 = (w67.b(jR, G0().b) && e77.b(jL, G0().c)) ? false : true;
            }
            if (z2) {
                eea eeaVar = this.x;
                if (eeaVar != null) {
                    eeaVar.a = yn8Var;
                } else {
                    eeaVar = new eea(yn8Var, this, null);
                    this.x = eeaVar;
                }
                q0(eeaVar, jR, jL);
                this.g = yn8Var.g();
                return;
            }
            return;
        }
        if (l26VarF != this.v || a26VarE != this.w) {
            this.v = l26VarF;
            this.w = a26VarE;
            S0();
            return;
        }
        w79 w79Var3 = this.X;
        long j5 = -9187201950435737472L;
        int i3 = 8;
        if (w79Var3 != null) {
            Object[] objArr3 = w79Var3.c;
            long[] jArr3 = w79Var3.a;
            j2 = 128;
            int length = jArr3.length - 2;
            if (length >= 0) {
                c = 7;
                int i4 = 0;
                kg8Var2 = null;
                while (true) {
                    long j6 = jArr3[i4];
                    j3 = 255;
                    if ((((~j6) << 7) & j6 & j5) != j5) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j6 & 255) < 128) {
                                j4 = j5;
                                kg8 kg8Var4 = (kg8) objArr3[(i4 << 3) + i6];
                                if (kg8Var4.a) {
                                    kg8Var2 = kg8Var4;
                                }
                            } else {
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i6++;
                            j5 = j4;
                        }
                        j = j5;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        j = j5;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    j5 = j;
                }
            } else {
                j = -9187201950435737472L;
                c = 7;
                j3 = 255;
                kg8Var2 = null;
            }
            kg8Var = kg8Var2;
        } else {
            j = -9187201950435737472L;
            c = 7;
            j2 = 128;
            j3 = 255;
            kg8Var = null;
        }
        if (kg8Var == null) {
            return;
        }
        bv7 bv7VarT1 = t0();
        long jR2 = qn4.R(bv7VarT1.r(0L));
        long jL2 = bv7VarT1.l();
        if ((w67.b(jR2, kg8Var.b) && e77.b(jL2, kg8Var.c)) || (w79Var = this.X) == null) {
            return;
        }
        Object[] objArr4 = w79Var.b;
        Object[] objArr5 = w79Var.c;
        long[] jArr4 = w79Var.a;
        int length2 = jArr4.length - 2;
        if (length2 < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr4[i7];
            int i8 = length2;
            if ((((~j7) << c) & j7 & j) != j) {
                int i9 = 8 - ((~(i7 - i8)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j7 & j3) < j2) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = objArr4[i11];
                        kg8 kg8Var5 = (kg8) objArr5[i11];
                        i2 = i3;
                        rq6 rq6Var = (rq6) obj;
                        jArr2 = jArr4;
                        if (kg8Var5.a) {
                            objArr2 = objArr4;
                            z = (e77.b(kg8Var5.c, jL2) && w67.b(kg8Var5.b, jR2)) ? false : true;
                            kg8Var5.c = jL2;
                            kg8Var5.b = jR2;
                            kg8Var5.a = false;
                            if (!z) {
                                a80Var = this.F0;
                                if (a80Var != null) {
                                    a80Var.A(rq6Var);
                                }
                                w79Var2 = this.G0;
                                if (w79Var2 != null) {
                                    x79Var = (x79) w79Var2.g(rq6Var);
                                } else {
                                    x79Var = null;
                                }
                                if (x79Var != null) {
                                    P0(x79Var);
                                    x79Var.f();
                                }
                            }
                        } else {
                            objArr2 = objArr4;
                        }
                        kg8Var5.c = jL2;
                        kg8Var5.b = jR2;
                        kg8Var5.a = false;
                        if (!z) {
                            a80Var = this.F0;
                            if (a80Var != null) {
                                a80Var.A(rq6Var);
                            }
                            w79Var2 = this.G0;
                            if (w79Var2 != null) {
                                x79Var = (x79) w79Var2.g(rq6Var);
                            } else {
                                x79Var = null;
                            }
                            if (x79Var != null) {
                                P0(x79Var);
                                x79Var.f();
                            }
                        }
                    } else {
                        jArr2 = jArr4;
                        objArr2 = objArr4;
                        i2 = i3;
                    }
                    j7 >>= i2;
                    i10++;
                    objArr4 = objArr2;
                    i3 = i2;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
                if (i9 != i) {
                    return;
                }
            } else {
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
            }
            length2 = i8;
            if (i7 == length2) {
                return;
            }
            i7++;
            i3 = i;
            objArr4 = objArr;
            jArr4 = jArr;
        }
    }

    public abstract lg8 s0();

    public abstract bv7 t0();

    public abstract boolean u0();

    @Override // defpackage.fw9
    public boolean w() {
        return A0().W();
    }

    @Override // defpackage.zn8
    public final yn8 y(int i, int i2, Map map, a26 a26Var, a26 a26Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            i37.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new gc0(i, i2, map, a26Var, a26Var2, this, 1);
    }
}

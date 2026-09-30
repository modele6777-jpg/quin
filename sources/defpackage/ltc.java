package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ltc extends s3f {
    public static final xz s = new xz(0.0f);
    public static final xz t = new xz(1.0f);
    public final vz9 b;
    public final vz9 c;
    public Object d;
    public n3f e;
    public long f;
    public nsd h;
    public pl1 j;
    public btc o;
    public final atc p;
    public float q;
    public final atc r;
    public final hla g = new hla(19, this);
    public final qz9 i = new qz9(0.0f);
    public final f99 k = new f99();
    public final c99 l = new c99();
    public long m = Long.MIN_VALUE;
    public final i79 n = new i79();

    /* JADX WARN: Type inference failed for: r3v6, types: [atc] */
    /* JADX WARN: Type inference failed for: r3v7, types: [atc] */
    public ltc(da9 da9Var) {
        this.b = q1c.f(da9Var);
        this.c = q1c.f(da9Var);
        this.d = da9Var;
        final int i = 0;
        this.p = new a26(this) { // from class: atc
            public final /* synthetic */ ltc b;

            {
                this.b = this;
            }

            @Override // defpackage.a26
            public final Object d(Object obj) {
                int i2 = i;
                wef wefVar = wef.a;
                ltc ltcVar = this.b;
                long jLongValue = ((Long) obj).longValue();
                switch (i2) {
                    case 0:
                        ltcVar.m = jLongValue;
                        break;
                    default:
                        long j = jLongValue - ltcVar.m;
                        ltcVar.m = jLongValue;
                        long jM = ym8.M(j / ((double) ltcVar.q));
                        i79 i79Var = ltcVar.n;
                        if (i79Var.e()) {
                            Object[] objArr = i79Var.a;
                            int i3 = i79Var.b;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                btc btcVar = (btc) objArr[i5];
                                ltc.i(btcVar, jM);
                                btcVar.c = true;
                            }
                            n3f n3fVar = ltcVar.e;
                            if (n3fVar != null) {
                                n3fVar.q();
                            }
                            int i6 = i79Var.b;
                            Object[] objArr2 = i79Var.a;
                            z67 z67VarC0 = mh3.c0(0, i6);
                            int i7 = z67VarC0.a;
                            int i8 = z67VarC0.b;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((btc) objArr2[i7]).c) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            qd0.h0(i6 - i4, i6, null, objArr2);
                            i79Var.b -= i4;
                        }
                        btc btcVar2 = ltcVar.o;
                        if (btcVar2 != null) {
                            btcVar2.g = ltcVar.f;
                            ltc.i(btcVar2, jM);
                            ltcVar.m(btcVar2.d);
                            if (btcVar2.d == 1.0f) {
                                ltcVar.o = null;
                            }
                            ltcVar.l();
                        }
                        break;
                }
                return wefVar;
            }
        };
        final int i2 = 1;
        this.r = new a26(this) { // from class: atc
            public final /* synthetic */ ltc b;

            {
                this.b = this;
            }

            @Override // defpackage.a26
            public final Object d(Object obj) {
                int i3 = i2;
                wef wefVar = wef.a;
                ltc ltcVar = this.b;
                long jLongValue = ((Long) obj).longValue();
                switch (i3) {
                    case 0:
                        ltcVar.m = jLongValue;
                        break;
                    default:
                        long j = jLongValue - ltcVar.m;
                        ltcVar.m = jLongValue;
                        long jM = ym8.M(j / ((double) ltcVar.q));
                        i79 i79Var = ltcVar.n;
                        if (i79Var.e()) {
                            Object[] objArr = i79Var.a;
                            int i4 = i79Var.b;
                            int i5 = 0;
                            for (int i6 = 0; i6 < i4; i6++) {
                                btc btcVar = (btc) objArr[i6];
                                ltc.i(btcVar, jM);
                                btcVar.c = true;
                            }
                            n3f n3fVar = ltcVar.e;
                            if (n3fVar != null) {
                                n3fVar.q();
                            }
                            int i7 = i79Var.b;
                            Object[] objArr2 = i79Var.a;
                            z67 z67VarC0 = mh3.c0(0, i7);
                            int i8 = z67VarC0.a;
                            int i9 = z67VarC0.b;
                            if (i8 <= i9) {
                                while (true) {
                                    objArr2[i8 - i5] = objArr2[i8];
                                    if (((btc) objArr2[i8]).c) {
                                        i5++;
                                    }
                                    if (i8 != i9) {
                                        i8++;
                                    }
                                }
                            }
                            qd0.h0(i7 - i5, i7, null, objArr2);
                            i79Var.b -= i5;
                        }
                        btc btcVar2 = ltcVar.o;
                        if (btcVar2 != null) {
                            btcVar2.g = ltcVar.f;
                            ltc.i(btcVar2, jM);
                            ltcVar.m(btcVar2.d);
                            if (btcVar2.d == 1.0f) {
                                ltcVar.o = null;
                            }
                            ltcVar.l();
                        }
                        break;
                }
                return wefVar;
            }
        };
    }

    public static void i(btc btcVar, long j) {
        long j2 = btcVar.a + j;
        btcVar.a = j2;
        long j3 = btcVar.h;
        if (j2 >= j3) {
            btcVar.d = 1.0f;
            return;
        }
        ssf ssfVar = btcVar.b;
        xz xzVar = btcVar.e;
        if (ssfVar == null) {
            float f = j2 / j3;
            btcVar.d = (f * 1.0f) + ((1.0f - f) * xzVar.a(0));
            return;
        }
        xz xzVar2 = btcVar.f;
        if (xzVar2 == null) {
            xzVar2 = s;
        }
        btcVar.d = mh3.n(((xz) ssfVar.t(j2, xzVar, t, xzVar2)).a(0), 0.0f, 1.0f);
    }

    @Override // defpackage.s3f
    public final Object a() {
        return this.c.getValue();
    }

    @Override // defpackage.s3f
    public final Object b() {
        return this.b.getValue();
    }

    @Override // defpackage.s3f
    public final void c(Object obj) {
        this.c.setValue(obj);
    }

    @Override // defpackage.s3f
    public final void d(n3f n3fVar) {
        n3f n3fVar2 = this.e;
        if (n3fVar2 != null && !n3fVar.equals(n3fVar2)) {
            gpa.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.e + ", new instance: " + n3fVar);
        }
        this.e = n3fVar;
    }

    @Override // defpackage.s3f
    public final void e() {
        this.e = null;
        nsd nsdVar = this.h;
        if (nsdVar != null) {
            nsdVar.b(this);
        }
    }

    public final Object f(zn2 zn2Var) {
        float fV0 = hkg.v0(zn2Var.getContext());
        wef wefVar = wef.a;
        if (fV0 <= 0.0f) {
            g();
            return wefVar;
        }
        this.q = fV0;
        Object objG0 = tm7.J(zn2Var.getContext()).g0(zn2Var, this.r);
        return objG0 == bw2.a ? objG0 : wefVar;
    }

    public final void g() {
        n3f n3fVar = this.e;
        if (n3fVar != null) {
            n3fVar.c();
        }
        this.n.k();
        if (this.o != null) {
            this.o = null;
            m(1.0f);
            l();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    public final void h() {
        n3f n3fVar = this.e;
        if (n3fVar == null) {
            return;
        }
        btc btcVar = this.o;
        if (btcVar == null) {
            if (this.f > 0) {
                qz9 qz9Var = this.i;
                if (qz9Var.j() == 1.0f || pa7.t(this.c.getValue(), this.b.getValue())) {
                    btcVar = null;
                } else {
                    btc btcVar2 = new btc();
                    btcVar2.d = qz9Var.j();
                    long j = this.f;
                    btcVar2.g = j;
                    btcVar2.h = ym8.M((1.0d - ((double) qz9Var.j())) * j);
                    btcVar2.e.e(0, qz9Var.j());
                    btcVar = btcVar2;
                }
            } else {
                btcVar = null;
            }
        }
        if (btcVar != null) {
            btcVar.g = this.f;
            this.n.h(btcVar);
            n3fVar.n(btcVar);
        }
        this.o = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(zn2 zn2Var) {
        etc etcVar;
        if (zn2Var instanceof etc) {
            etcVar = (etc) zn2Var;
            int i = etcVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                etcVar.label = i - Integer.MIN_VALUE;
            } else {
                etcVar = new etc(this, zn2Var);
            }
        } else {
            etcVar = new etc(this, zn2Var);
        }
        Object obj = etcVar.result;
        int i2 = etcVar.label;
        i79 i79Var = this.n;
        wef wefVar = wef.a;
        Object obj2 = bw2.a;
        if (i2 == 0) {
            jzb.q(obj);
            if (i79Var.d() && this.o == null) {
                return wefVar;
            }
            if (hkg.v0(etcVar.getContext()) == 0.0f) {
                g();
                this.m = Long.MIN_VALUE;
                return wefVar;
            }
            if (this.m == Long.MIN_VALUE) {
                etcVar.label = 1;
                if (tm7.J(etcVar.getContext()).g0(etcVar, this.p) != obj2) {
                }
            }
            return obj2;
        }
        if (i2 != 1 && i2 != 2) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        do {
            if (!i79Var.e() && this.o == null) {
                this.m = Long.MIN_VALUE;
                return wefVar;
            }
            etcVar.label = 2;
        } while (f(etcVar) != obj2);
        return obj2;
    }

    public final Object k(float f, Object obj, gbe gbeVar) {
        if (0.0f > f || f > 1.0f) {
            gpa.a("Expecting fraction between 0 and 1. Got " + f);
        }
        n3f n3fVar = this.e;
        if (n3fVar != null) {
            Object objA = c99.a(this.l, new htc(obj, this.b.getValue(), this, n3fVar, f, null), gbeVar);
            if (objA == bw2.a) {
                return objA;
            }
        }
        return wef.a;
    }

    public final void l() {
        n3f n3fVar = this.e;
        if (n3fVar == null) {
            return;
        }
        n3fVar.m(ym8.M(((double) this.i.j()) * ((Number) n3fVar.m.getValue()).longValue()));
    }

    public final void m(float f) {
        this.i.k(f);
    }

    public final void n(nsd nsdVar) {
        hrd hrdVar;
        if (pa7.t(this.h, nsdVar)) {
            return;
        }
        nsd nsdVar2 = this.h;
        if (nsdVar2 != null) {
            nsdVar2.b(this);
        }
        nsd nsdVar3 = this.h;
        if (nsdVar3 != null && (hrdVar = nsdVar3.h) != null) {
            hrdVar.a();
        }
        this.h = nsdVar;
        if (nsdVar != null) {
            nsdVar.e();
        }
        nsd nsdVar4 = this.h;
        if (nsdVar4 != null) {
            nsdVar4.d(this, g21.g, this.g);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(zn2 zn2Var) {
        jtc jtcVar;
        Object value;
        Object obj;
        if (zn2Var instanceof jtc) {
            jtcVar = (jtc) zn2Var;
            int i = jtcVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jtcVar.label = i - Integer.MIN_VALUE;
            } else {
                jtcVar = new jtc(this, zn2Var);
            }
        } else {
            jtcVar = new jtc(this, zn2Var);
        }
        Object obj2 = jtcVar.result;
        int i2 = jtcVar.label;
        f99 f99Var = this.k;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(obj2);
            value = this.b.getValue();
            jtcVar.L$0 = value;
            jtcVar.label = 1;
            if (f99Var.b(jtcVar) != bw2Var) {
            }
            return bw2Var;
        }
        if (i2 == 1) {
            Object obj3 = jtcVar.L$0;
            jzb.q(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = jtcVar.L$0;
            jzb.q(obj2);
        }
        if (pa7.t(obj2, obj)) {
            return wef.a;
        }
        this.m = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        jtcVar.L$0 = value;
        jtcVar.label = 2;
        pl1 pl1Var = new pl1(1, k99.D(jtcVar));
        pl1Var.v();
        this.j = pl1Var;
        f99Var.h(null);
        Object objT = pl1Var.t();
        if (objT != bw2Var) {
            obj = value;
            obj2 = objT;
            if (pa7.t(obj2, obj)) {
                return wef.a;
            }
            this.m = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return bw2Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0084, please report this as an issue */
    public final Object p(zn2 zn2Var) {
        ktc ktcVar;
        Object value;
        Object obj;
        if (zn2Var instanceof ktc) {
            ktcVar = (ktc) zn2Var;
            int i = ktcVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ktcVar.label = i - Integer.MIN_VALUE;
            } else {
                ktcVar = new ktc(this, zn2Var);
            }
        } else {
            ktcVar = new ktc(this, zn2Var);
        }
        Object obj2 = ktcVar.result;
        int i2 = ktcVar.label;
        f99 f99Var = this.k;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(obj2);
            value = this.b.getValue();
            ktcVar.L$0 = value;
            ktcVar.label = 1;
            if (f99Var.b(ktcVar) != bw2Var) {
            }
            return bw2Var;
        }
        if (i2 == 1) {
            Object obj3 = ktcVar.L$0;
            jzb.q(obj2);
            value = obj3;
        } else {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = ktcVar.L$0;
            jzb.q(obj2);
        }
        if (!pa7.t(obj2, obj)) {
            this.m = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return wef.a;
        if (!pa7.t(value, this.d)) {
            ktcVar.L$0 = value;
            ktcVar.label = 2;
            pl1 pl1Var = new pl1(1, k99.D(ktcVar));
            pl1Var.v();
            this.j = pl1Var;
            f99Var.h(null);
            Object objT = pl1Var.t();
            if (objT != bw2Var) {
                obj = value;
                obj2 = objT;
                if (!pa7.t(obj2, obj)) {
                    this.m = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return bw2Var;
        }
        f99Var.h(null);
        return wef.a;
    }
}

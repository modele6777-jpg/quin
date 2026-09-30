package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ctc extends gbe implements l26 {
    final /* synthetic */ ze5 $animationSpec;
    final /* synthetic */ Object $targetState;
    final /* synthetic */ n3f $transition;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ltc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctc(ltc ltcVar, Object obj, n3f n3fVar, ze5 ze5Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = ltcVar;
        this.$targetState = obj;
        this.$transition = n3fVar;
        this.$animationSpec = ze5Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ctc(this.this$0, this.$targetState, this.$transition, this.$animationSpec, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00db A[PHI: r16
  0x00db: PHI (r16v5 long) = (r16v3 long), (r16v4 long), (r16v8 long) binds: [B:27:0x00a2, B:39:0x00d7, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:50:0x0109  */
    /* JADX WARN: Code duplicated, block: B:52:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x0120  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:61:0x012f  */
    /* JADX WARN: Code duplicated, block: B:63:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:74:0x015b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0163  */
    /* JADX WARN: Code duplicated, block: B:79:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x0195  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bc  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        long j;
        ltc ltcVar;
        d99 d99Var;
        Object objF;
        ltc ltcVar2;
        ltc ltcVar3;
        btc btcVar;
        ze5 ze5Var;
        ssf ssfVarF;
        ssf ssfVar;
        xz xzVar;
        xz xzVar2;
        xz xzVar3;
        long j2;
        float f;
        xz xzVar4;
        ltc ltcVar4;
        long j3;
        long jM;
        xz xzVar5;
        xz xzVar6;
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                Object value = this.this$0.b.getValue();
                if (pa7.t(this.$targetState, value)) {
                    j = Long.MIN_VALUE;
                } else {
                    this.this$0.h();
                    this.this$0.m(0.0f);
                    j = Long.MIN_VALUE;
                    this.$transition.s(this.$targetState);
                    this.$transition.o(0L);
                    this.this$0.c(value);
                    this.this$0.b.setValue(this.$targetState);
                }
                ltcVar = this.this$0;
                f99 f99Var = ltcVar.k;
                this.L$0 = f99Var;
                this.L$1 = ltcVar;
                this.label = 1;
                if (f99Var.b(this) != bw2Var) {
                    d99Var = f99Var;
                }
            }
            if (i == 1) {
                ltcVar = (ltc) this.L$1;
                d99Var = (d99) this.L$0;
                jzb.q(obj);
                j = Long.MIN_VALUE;
            } else {
                if (i == 2) {
                    jzb.q(obj);
                    j = Long.MIN_VALUE;
                    ltcVar2 = this.this$0;
                    this.label = 3;
                    if (ltcVar2.p(this) != bw2Var) {
                        if (!pa7.t(this.this$0.c.getValue(), this.$targetState)) {
                            if (this.this$0.i.j() < 1.0f) {
                                btcVar = this.this$0.o;
                                ze5Var = this.$animationSpec;
                                if (ze5Var != null) {
                                    ssfVarF = ze5Var.f();
                                } else {
                                    ssfVarF = null;
                                }
                                if (btcVar != null) {
                                    if (btcVar != null) {
                                        ssfVar = btcVar.b;
                                    } else {
                                        ssfVar = null;
                                    }
                                    xzVar = ltc.t;
                                    xzVar2 = ltc.s;
                                    if (ssfVar != null) {
                                        long j4 = btcVar.a;
                                        xz xzVar7 = btcVar.e;
                                        xzVar5 = btcVar.f;
                                        if (xzVar5 == null) {
                                            xzVar6 = xzVar2;
                                        } else {
                                            xzVar6 = xzVar5;
                                        }
                                        b00 b00VarI = ssfVar.i(j4, xzVar7, xzVar, xzVar6);
                                        xzVar3 = xzVar;
                                        xzVar2 = (xz) b00VarI;
                                    } else {
                                        xzVar3 = xzVar;
                                        if (btcVar != null) {
                                            j2 = btcVar.g;
                                            if (j2 == j) {
                                                j2 = this.this$0.f;
                                            }
                                            f = j2 / 1.0E9f;
                                            if (f > 0.0f) {
                                                xzVar2 = new xz(1.0f / f);
                                            }
                                        }
                                    }
                                    if (btcVar == null) {
                                        btcVar = new btc();
                                    }
                                    xzVar4 = btcVar.e;
                                    btcVar.b = ssfVarF;
                                    btcVar.c = false;
                                    btcVar.d = this.this$0.i.j();
                                    xzVar4.e(0, this.this$0.i.j());
                                    ltcVar4 = this.this$0;
                                    j3 = ltcVar4.f;
                                    btcVar.g = j3;
                                    btcVar.a = 0L;
                                    btcVar.f = xzVar2;
                                    if (ssfVarF != null) {
                                        jM = ssfVarF.c(xzVar4, xzVar3, xzVar2);
                                    } else {
                                        jM = ym8.M((1.0d - ((double) ltcVar4.i.j())) * j3);
                                    }
                                    btcVar.h = jM;
                                    this.this$0.o = btcVar;
                                } else {
                                    if (btcVar != null) {
                                        ssfVar = btcVar.b;
                                    } else {
                                        ssfVar = null;
                                    }
                                    xzVar = ltc.t;
                                    xzVar2 = ltc.s;
                                    if (ssfVar != null) {
                                        long j5 = btcVar.a;
                                        xz xzVar8 = btcVar.e;
                                        xzVar5 = btcVar.f;
                                        if (xzVar5 == null) {
                                            xzVar6 = xzVar2;
                                        } else {
                                            xzVar6 = xzVar5;
                                        }
                                        b00 b00VarI2 = ssfVar.i(j5, xzVar8, xzVar, xzVar6);
                                        xzVar3 = xzVar;
                                        xzVar2 = (xz) b00VarI2;
                                    } else {
                                        xzVar3 = xzVar;
                                        if (btcVar != null) {
                                            j2 = btcVar.g;
                                            if (j2 == j) {
                                                j2 = this.this$0.f;
                                            }
                                            f = j2 / 1.0E9f;
                                            if (f > 0.0f) {
                                                xzVar2 = new xz(1.0f / f);
                                            }
                                        }
                                    }
                                    if (btcVar == null) {
                                        btcVar = new btc();
                                    }
                                    xzVar4 = btcVar.e;
                                    btcVar.b = ssfVarF;
                                    btcVar.c = false;
                                    btcVar.d = this.this$0.i.j();
                                    xzVar4.e(0, this.this$0.i.j());
                                    ltcVar4 = this.this$0;
                                    j3 = ltcVar4.f;
                                    btcVar.g = j3;
                                    btcVar.a = 0L;
                                    btcVar.f = xzVar2;
                                    if (ssfVarF != null) {
                                        jM = ssfVarF.c(xzVar4, xzVar3, xzVar2);
                                    } else {
                                        jM = ym8.M((1.0d - ((double) ltcVar4.i.j())) * j3);
                                    }
                                    btcVar.h = jM;
                                    this.this$0.o = btcVar;
                                }
                            }
                            ltcVar3 = this.this$0;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 4;
                            if (ltcVar3.j(this) != bw2Var) {
                            }
                        }
                    }
                }
                if (i == 3) {
                    jzb.q(obj);
                    j = Long.MIN_VALUE;
                    if (!pa7.t(this.this$0.c.getValue(), this.$targetState)) {
                        if (this.this$0.i.j() < 1.0f) {
                            btcVar = this.this$0.o;
                            ze5Var = this.$animationSpec;
                            if (ze5Var != null) {
                                ssfVarF = ze5Var.f();
                            } else {
                                ssfVarF = null;
                            }
                            if (btcVar != null || !pa7.t(ssfVarF, btcVar.b)) {
                                if (btcVar != null) {
                                    ssfVar = btcVar.b;
                                } else {
                                    ssfVar = null;
                                }
                                xzVar = ltc.t;
                                xzVar2 = ltc.s;
                                if (ssfVar != null) {
                                    long j6 = btcVar.a;
                                    xz xzVar9 = btcVar.e;
                                    xzVar5 = btcVar.f;
                                    if (xzVar5 == null) {
                                        xzVar6 = xzVar2;
                                    } else {
                                        xzVar6 = xzVar5;
                                    }
                                    b00 b00VarI3 = ssfVar.i(j6, xzVar9, xzVar, xzVar6);
                                    xzVar3 = xzVar;
                                    xzVar2 = (xz) b00VarI3;
                                } else {
                                    xzVar3 = xzVar;
                                    if (btcVar != null && btcVar.a != 0) {
                                        j2 = btcVar.g;
                                        if (j2 == j) {
                                            j2 = this.this$0.f;
                                        }
                                        f = j2 / 1.0E9f;
                                        if (f > 0.0f) {
                                            xzVar2 = new xz(1.0f / f);
                                        }
                                    }
                                }
                                if (btcVar == null) {
                                    btcVar = new btc();
                                }
                                xzVar4 = btcVar.e;
                                btcVar.b = ssfVarF;
                                btcVar.c = false;
                                btcVar.d = this.this$0.i.j();
                                xzVar4.e(0, this.this$0.i.j());
                                ltcVar4 = this.this$0;
                                j3 = ltcVar4.f;
                                btcVar.g = j3;
                                btcVar.a = 0L;
                                btcVar.f = xzVar2;
                                if (ssfVarF != null) {
                                    jM = ssfVarF.c(xzVar4, xzVar3, xzVar2);
                                } else {
                                    jM = ym8.M((1.0d - ((double) ltcVar4.i.j())) * j3);
                                }
                                btcVar.h = jM;
                                this.this$0.o = btcVar;
                            }
                        }
                        ltcVar3 = this.this$0;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 4;
                        if (ltcVar3.j(this) != bw2Var) {
                        }
                    }
                }
                if (i != 4) {
                    if (i == 5) {
                        jzb.q(obj);
                        return wefVar;
                    }
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            this.this$0.c(this.$targetState);
            this.this$0.m(0.0f);
            this.$transition.j();
            ltc ltcVar5 = this.this$0;
            this.label = 5;
            return ltcVar5.o(this) == bw2Var ? bw2Var : wefVar;
            Object obj2 = ltcVar.d;
            d99Var.h(null);
            if (pa7.t(this.$targetState, obj2)) {
                if (!pa7.t(this.this$0.c.getValue(), this.$targetState)) {
                    if (this.this$0.i.j() < 1.0f) {
                        btcVar = this.this$0.o;
                        ze5Var = this.$animationSpec;
                        if (ze5Var != null) {
                            ssfVarF = ze5Var.f();
                        } else {
                            ssfVarF = null;
                        }
                        if (btcVar != null) {
                            if (btcVar != null) {
                                ssfVar = btcVar.b;
                            } else {
                                ssfVar = null;
                            }
                            xzVar = ltc.t;
                            xzVar2 = ltc.s;
                            if (ssfVar != null) {
                                long j7 = btcVar.a;
                                xz xzVar10 = btcVar.e;
                                xzVar5 = btcVar.f;
                                if (xzVar5 == null) {
                                    xzVar6 = xzVar2;
                                } else {
                                    xzVar6 = xzVar5;
                                }
                                b00 b00VarI4 = ssfVar.i(j7, xzVar10, xzVar, xzVar6);
                                xzVar3 = xzVar;
                                xzVar2 = (xz) b00VarI4;
                            } else {
                                xzVar3 = xzVar;
                                if (btcVar != null) {
                                    j2 = btcVar.g;
                                    if (j2 == j) {
                                        j2 = this.this$0.f;
                                    }
                                    f = j2 / 1.0E9f;
                                    if (f > 0.0f) {
                                        xzVar2 = new xz(1.0f / f);
                                    }
                                }
                            }
                            if (btcVar == null) {
                                btcVar = new btc();
                            }
                            xzVar4 = btcVar.e;
                            btcVar.b = ssfVarF;
                            btcVar.c = false;
                            btcVar.d = this.this$0.i.j();
                            xzVar4.e(0, this.this$0.i.j());
                            ltcVar4 = this.this$0;
                            j3 = ltcVar4.f;
                            btcVar.g = j3;
                            btcVar.a = 0L;
                            btcVar.f = xzVar2;
                            if (ssfVarF != null) {
                                jM = ssfVarF.c(xzVar4, xzVar3, xzVar2);
                            } else {
                                jM = ym8.M((1.0d - ((double) ltcVar4.i.j())) * j3);
                            }
                            btcVar.h = jM;
                            this.this$0.o = btcVar;
                        } else {
                            if (btcVar != null) {
                                ssfVar = btcVar.b;
                            } else {
                                ssfVar = null;
                            }
                            xzVar = ltc.t;
                            xzVar2 = ltc.s;
                            if (ssfVar != null) {
                                long j8 = btcVar.a;
                                xz xzVar11 = btcVar.e;
                                xzVar5 = btcVar.f;
                                if (xzVar5 == null) {
                                    xzVar6 = xzVar2;
                                } else {
                                    xzVar6 = xzVar5;
                                }
                                b00 b00VarI5 = ssfVar.i(j8, xzVar11, xzVar, xzVar6);
                                xzVar3 = xzVar;
                                xzVar2 = (xz) b00VarI5;
                            } else {
                                xzVar3 = xzVar;
                                if (btcVar != null) {
                                    j2 = btcVar.g;
                                    if (j2 == j) {
                                        j2 = this.this$0.f;
                                    }
                                    f = j2 / 1.0E9f;
                                    if (f > 0.0f) {
                                        xzVar2 = new xz(1.0f / f);
                                    }
                                }
                            }
                            if (btcVar == null) {
                                btcVar = new btc();
                            }
                            xzVar4 = btcVar.e;
                            btcVar.b = ssfVarF;
                            btcVar.c = false;
                            btcVar.d = this.this$0.i.j();
                            xzVar4.e(0, this.this$0.i.j());
                            ltcVar4 = this.this$0;
                            j3 = ltcVar4.f;
                            btcVar.g = j3;
                            btcVar.a = 0L;
                            btcVar.f = xzVar2;
                            if (ssfVarF != null) {
                                jM = ssfVarF.c(xzVar4, xzVar3, xzVar2);
                            } else {
                                jM = ym8.M((1.0d - ((double) ltcVar4.i.j())) * j3);
                            }
                            btcVar.h = jM;
                            this.this$0.o = btcVar;
                        }
                    }
                    ltcVar3 = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    if (ltcVar3.j(this) != bw2Var) {
                        this.this$0.c(this.$targetState);
                        this.this$0.m(0.0f);
                        this.$transition.j();
                        ltc ltcVar6 = this.this$0;
                        this.label = 5;
                        if (ltcVar6.o(this) == bw2Var) {
                        }
                    }
                }
            }
            ltc ltcVar7 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (ltcVar7.m == j) {
                objF = tm7.J(getContext()).g0(this, ltcVar7.p);
                if (objF != bw2Var) {
                    objF = wefVar;
                }
            } else {
                objF = ltcVar7.f(this);
                if (objF != bw2Var) {
                    objF = wefVar;
                }
            }
            if (objF != bw2Var) {
                ltcVar2 = this.this$0;
                this.label = 3;
                if (ltcVar2.p(this) != bw2Var) {
                    if (!pa7.t(this.this$0.c.getValue(), this.$targetState)) {
                        if (this.this$0.i.j() < 1.0f) {
                            btcVar = this.this$0.o;
                            ze5Var = this.$animationSpec;
                            if (ze5Var != null) {
                                ssfVarF = ze5Var.f();
                            } else {
                                ssfVarF = null;
                            }
                            if (btcVar != null) {
                                if (btcVar != null) {
                                    ssfVar = btcVar.b;
                                } else {
                                    ssfVar = null;
                                }
                                xzVar = ltc.t;
                                xzVar2 = ltc.s;
                                if (ssfVar != null) {
                                    long j9 = btcVar.a;
                                    xz xzVar12 = btcVar.e;
                                    xzVar5 = btcVar.f;
                                    if (xzVar5 == null) {
                                        xzVar6 = xzVar2;
                                    } else {
                                        xzVar6 = xzVar5;
                                    }
                                    b00 b00VarI6 = ssfVar.i(j9, xzVar12, xzVar, xzVar6);
                                    xzVar3 = xzVar;
                                    xzVar2 = (xz) b00VarI6;
                                } else {
                                    xzVar3 = xzVar;
                                    if (btcVar != null) {
                                        j2 = btcVar.g;
                                        if (j2 == j) {
                                            j2 = this.this$0.f;
                                        }
                                        f = j2 / 1.0E9f;
                                        if (f > 0.0f) {
                                            xzVar2 = new xz(1.0f / f);
                                        }
                                    }
                                }
                                if (btcVar == null) {
                                    btcVar = new btc();
                                }
                                xzVar4 = btcVar.e;
                                btcVar.b = ssfVarF;
                                btcVar.c = false;
                                btcVar.d = this.this$0.i.j();
                                xzVar4.e(0, this.this$0.i.j());
                                ltcVar4 = this.this$0;
                                j3 = ltcVar4.f;
                                btcVar.g = j3;
                                btcVar.a = 0L;
                                btcVar.f = xzVar2;
                                if (ssfVarF != null) {
                                    jM = ssfVarF.c(xzVar4, xzVar3, xzVar2);
                                } else {
                                    jM = ym8.M((1.0d - ((double) ltcVar4.i.j())) * j3);
                                }
                                btcVar.h = jM;
                                this.this$0.o = btcVar;
                            } else {
                                if (btcVar != null) {
                                    ssfVar = btcVar.b;
                                } else {
                                    ssfVar = null;
                                }
                                xzVar = ltc.t;
                                xzVar2 = ltc.s;
                                if (ssfVar != null) {
                                    long j10 = btcVar.a;
                                    xz xzVar13 = btcVar.e;
                                    xzVar5 = btcVar.f;
                                    if (xzVar5 == null) {
                                        xzVar6 = xzVar2;
                                    } else {
                                        xzVar6 = xzVar5;
                                    }
                                    b00 b00VarI7 = ssfVar.i(j10, xzVar13, xzVar, xzVar6);
                                    xzVar3 = xzVar;
                                    xzVar2 = (xz) b00VarI7;
                                } else {
                                    xzVar3 = xzVar;
                                    if (btcVar != null) {
                                        j2 = btcVar.g;
                                        if (j2 == j) {
                                            j2 = this.this$0.f;
                                        }
                                        f = j2 / 1.0E9f;
                                        if (f > 0.0f) {
                                            xzVar2 = new xz(1.0f / f);
                                        }
                                    }
                                }
                                if (btcVar == null) {
                                    btcVar = new btc();
                                }
                                xzVar4 = btcVar.e;
                                btcVar.b = ssfVarF;
                                btcVar.c = false;
                                btcVar.d = this.this$0.i.j();
                                xzVar4.e(0, this.this$0.i.j());
                                ltcVar4 = this.this$0;
                                j3 = ltcVar4.f;
                                btcVar.g = j3;
                                btcVar.a = 0L;
                                btcVar.f = xzVar2;
                                if (ssfVarF != null) {
                                    jM = ssfVarF.c(xzVar4, xzVar3, xzVar2);
                                } else {
                                    jM = ym8.M((1.0d - ((double) ltcVar4.i.j())) * j3);
                                }
                                btcVar.h = jM;
                                this.this$0.o = btcVar;
                            }
                        }
                        ltcVar3 = this.this$0;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 4;
                        if (ltcVar3.j(this) != bw2Var) {
                            this.this$0.c(this.$targetState);
                            this.this$0.m(0.0f);
                            this.$transition.j();
                            ltc ltcVar8 = this.this$0;
                            this.label = 5;
                            if (ltcVar8.o(this) == bw2Var) {
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            d99Var.h(null);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ctc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}

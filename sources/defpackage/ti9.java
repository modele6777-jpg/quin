package defpackage;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ti9 implements xj5 {
    public final /* synthetic */ gj9 a;

    public ti9(gj9 gj9Var) {
        this.a = gj9Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d7 A[PHI: r1
  0x00d7: PHI (r1v1 yof) = (r1v0 yof), (r1v0 yof), (r1v5 yof) binds: [B:22:0x0081, B:24:0x0098, B:32:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101 A[PHI: r1 r2
  0x0101: PHI (r1v6 yof) = (r1v1 yof), (r1v12 yof) binds: [B:34:0x00de, B:39:0x00fd] A[DONT_GENERATE, DONT_INLINE]
  0x0101: PHI (r2v10 imb) = (r2v8 imb), (r2v11 imb) binds: [B:34:0x00de, B:39:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:45:0x0120  */
    /* JADX WARN: Code duplicated, block: B:49:0x0128  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // defpackage.xj5
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(yof yofVar, xn2 xn2Var) {
        si9 si9Var;
        Boolean boolValueOf;
        yof yofVar2;
        imb imbVar;
        Boolean bool;
        boolean zBooleanValue;
        ta3 ta3Var;
        Application application;
        yof yofVar3;
        imb imbVar2;
        Object value;
        Boolean bool2;
        boolean zBooleanValue2;
        ta3 ta3Var2;
        Application application2;
        imb imbVar3;
        yof yofVar4 = yofVar;
        if (xn2Var instanceof si9) {
            si9Var = (si9) xn2Var;
            int i = si9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                si9Var.label = i - Integer.MIN_VALUE;
            } else {
                si9Var = new si9(this, xn2Var);
            }
        } else {
            si9Var = new si9(this, xn2Var);
        }
        Object obj = si9Var.result;
        int i2 = si9Var.label;
        gj9 gj9Var = this.a;
        bw2 bw2Var = bw2.a;
        if (i2 != 0) {
            if (i2 == 1) {
                Boolean bool3 = (Boolean) si9Var.L$1;
                yofVar2 = (yof) si9Var.L$0;
                jzb.q(obj);
                boolValueOf = bool3;
            } else {
                if (i2 == 2) {
                    imbVar2 = (imb) si9Var.L$2;
                    yofVar3 = (yof) si9Var.L$0;
                    jzb.q(obj);
                    imbVar2.element = true;
                    imbVar = imbVar2;
                    yofVar4 = yofVar3;
                    bool2 = yofVar4.l;
                    if (bool2 != null) {
                        zBooleanValue2 = bool2.booleanValue();
                        ta3Var2 = ta3.a;
                        application2 = gj9Var.b;
                        si9Var.L$0 = null;
                        si9Var.L$1 = null;
                        si9Var.L$2 = imbVar;
                        si9Var.L$3 = null;
                        si9Var.Z$0 = zBooleanValue2;
                        si9Var.label = 3;
                        if (ta3Var2.c(application2, zBooleanValue2, si9Var) != bw2Var) {
                            imbVar3 = imbVar;
                        }
                        return bw2Var;
                    }
                    if (imbVar.element) {
                        int i3 = gj9.g;
                        gj9Var.f();
                    }
                    return wef.a;
                }
                if (i2 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                imbVar3 = (imb) si9Var.L$2;
                jzb.q(obj);
            }
            imbVar3.element = true;
            imbVar = imbVar3;
            if (imbVar.element) {
                int i4 = gj9.g;
                gj9Var.f();
            }
            return wef.a;
        }
        jzb.q(obj);
        Boolean bool4 = yofVar4.j;
        boolValueOf = bool4 != null ? Boolean.valueOf(!bool4.booleanValue()) : null;
        if (boolValueOf != null) {
            hs3 hs3Var = xqa.W0;
            if (boolValueOf.equals(z5c.I(nu4.a, new ri9(hs3Var.a, hs3Var.b, null)))) {
                imbVar = new imb();
                bool = yofVar4.k;
                if (bool == null) {
                    bool2 = yofVar4.l;
                    if (bool2 != null) {
                        zBooleanValue2 = bool2.booleanValue();
                        ta3Var2 = ta3.a;
                        application2 = gj9Var.b;
                        si9Var.L$0 = null;
                        si9Var.L$1 = null;
                        si9Var.L$2 = imbVar;
                        si9Var.L$3 = null;
                        si9Var.Z$0 = zBooleanValue2;
                        si9Var.label = 3;
                        if (ta3Var2.c(application2, zBooleanValue2, si9Var) != bw2Var) {
                            imbVar3 = imbVar;
                            imbVar3.element = true;
                            imbVar = imbVar3;
                        }
                    }
                    if (imbVar.element) {
                        int i5 = gj9.g;
                        gj9Var.f();
                    }
                    return wef.a;
                }
                zBooleanValue = bool.booleanValue();
                ta3Var = ta3.a;
                application = gj9Var.b;
                si9Var.L$0 = yofVar4;
                si9Var.L$1 = null;
                si9Var.L$2 = imbVar;
                si9Var.L$3 = null;
                si9Var.Z$0 = zBooleanValue;
                si9Var.label = 2;
                if (ta3Var.a(application, zBooleanValue, si9Var) != bw2Var) {
                    yofVar3 = yofVar4;
                    imbVar2 = imbVar;
                    imbVar2.element = true;
                    imbVar = imbVar2;
                    yofVar4 = yofVar3;
                    bool2 = yofVar4.l;
                    if (bool2 != null) {
                        zBooleanValue2 = bool2.booleanValue();
                        ta3Var2 = ta3.a;
                        application2 = gj9Var.b;
                        si9Var.L$0 = null;
                        si9Var.L$1 = null;
                        si9Var.L$2 = imbVar;
                        si9Var.L$3 = null;
                        si9Var.Z$0 = zBooleanValue2;
                        si9Var.label = 3;
                        if (ta3Var2.c(application2, zBooleanValue2, si9Var) != bw2Var) {
                            imbVar3 = imbVar;
                            imbVar3.element = true;
                            imbVar = imbVar3;
                        }
                    }
                    if (imbVar.element) {
                        int i6 = gj9.g;
                        gj9Var.f();
                    }
                    return wef.a;
                }
            } else {
                isa isaVar = hs3Var.a;
                si9Var.L$0 = yofVar4;
                si9Var.L$1 = boolValueOf;
                si9Var.L$2 = null;
                si9Var.L$3 = null;
                si9Var.label = 1;
                if (bsa.n(isaVar, boolValueOf, si9Var) != bw2Var) {
                    yofVar2 = yofVar4;
                }
            }
        } else {
            imbVar = new imb();
            bool = yofVar4.k;
            if (bool == null) {
                bool2 = yofVar4.l;
                if (bool2 != null) {
                    zBooleanValue2 = bool2.booleanValue();
                    ta3Var2 = ta3.a;
                    application2 = gj9Var.b;
                    si9Var.L$0 = null;
                    si9Var.L$1 = null;
                    si9Var.L$2 = imbVar;
                    si9Var.L$3 = null;
                    si9Var.Z$0 = zBooleanValue2;
                    si9Var.label = 3;
                    if (ta3Var2.c(application2, zBooleanValue2, si9Var) != bw2Var) {
                        imbVar3 = imbVar;
                        imbVar3.element = true;
                        imbVar = imbVar3;
                    }
                }
                if (imbVar.element) {
                    int i7 = gj9.g;
                    gj9Var.f();
                }
                return wef.a;
            }
            zBooleanValue = bool.booleanValue();
            ta3Var = ta3.a;
            application = gj9Var.b;
            si9Var.L$0 = yofVar4;
            si9Var.L$1 = null;
            si9Var.L$2 = imbVar;
            si9Var.L$3 = null;
            si9Var.Z$0 = zBooleanValue;
            si9Var.label = 2;
            if (ta3Var.a(application, zBooleanValue, si9Var) != bw2Var) {
                yofVar3 = yofVar4;
                imbVar2 = imbVar;
                imbVar2.element = true;
                imbVar = imbVar2;
                yofVar4 = yofVar3;
                bool2 = yofVar4.l;
                if (bool2 != null) {
                    zBooleanValue2 = bool2.booleanValue();
                    ta3Var2 = ta3.a;
                    application2 = gj9Var.b;
                    si9Var.L$0 = null;
                    si9Var.L$1 = null;
                    si9Var.L$2 = imbVar;
                    si9Var.L$3 = null;
                    si9Var.Z$0 = zBooleanValue2;
                    si9Var.label = 3;
                    if (ta3Var2.c(application2, zBooleanValue2, si9Var) != bw2Var) {
                        imbVar3 = imbVar;
                        imbVar3.element = true;
                        imbVar = imbVar3;
                    }
                }
                if (imbVar.element) {
                    int i8 = gj9.g;
                    gj9Var.f();
                }
                return wef.a;
            }
        }
        return bw2Var;
        s0e s0eVar = gj9Var.e;
        do {
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, qi9.a((qi9) value, false, false, 0, 0, false, false, 0, 0, false, boolValueOf.booleanValue(), 511)));
        yofVar4 = yofVar2;
        imbVar = new imb();
        bool = yofVar4.k;
        if (bool == null) {
            bool2 = yofVar4.l;
            if (bool2 != null) {
                zBooleanValue2 = bool2.booleanValue();
                ta3Var2 = ta3.a;
                application2 = gj9Var.b;
                si9Var.L$0 = null;
                si9Var.L$1 = null;
                si9Var.L$2 = imbVar;
                si9Var.L$3 = null;
                si9Var.Z$0 = zBooleanValue2;
                si9Var.label = 3;
                if (ta3Var2.c(application2, zBooleanValue2, si9Var) != bw2Var) {
                    imbVar3 = imbVar;
                    imbVar3.element = true;
                    imbVar = imbVar3;
                }
            }
            if (imbVar.element) {
                int i9 = gj9.g;
                gj9Var.f();
            }
            return wef.a;
        }
        zBooleanValue = bool.booleanValue();
        ta3Var = ta3.a;
        application = gj9Var.b;
        si9Var.L$0 = yofVar4;
        si9Var.L$1 = null;
        si9Var.L$2 = imbVar;
        si9Var.L$3 = null;
        si9Var.Z$0 = zBooleanValue;
        si9Var.label = 2;
        if (ta3Var.a(application, zBooleanValue, si9Var) != bw2Var) {
            yofVar3 = yofVar4;
            imbVar2 = imbVar;
            imbVar2.element = true;
            imbVar = imbVar2;
            yofVar4 = yofVar3;
            bool2 = yofVar4.l;
            if (bool2 != null) {
                zBooleanValue2 = bool2.booleanValue();
                ta3Var2 = ta3.a;
                application2 = gj9Var.b;
                si9Var.L$0 = null;
                si9Var.L$1 = null;
                si9Var.L$2 = imbVar;
                si9Var.L$3 = null;
                si9Var.Z$0 = zBooleanValue2;
                si9Var.label = 3;
                if (ta3Var2.c(application2, zBooleanValue2, si9Var) != bw2Var) {
                    imbVar3 = imbVar;
                    imbVar3.element = true;
                    imbVar = imbVar3;
                }
            }
            if (imbVar.element) {
                int i10 = gj9.g;
                gj9Var.f();
            }
            return wef.a;
        }
        return bw2Var;
    }
}

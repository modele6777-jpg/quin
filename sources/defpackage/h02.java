package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h02 implements PointerInputEventHandler {
    public final /* synthetic */ aw2 a;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ n69 c;
    public final /* synthetic */ e89 d;
    public final /* synthetic */ e89 e;
    public final /* synthetic */ n69 f;
    public final /* synthetic */ n69 g;
    public final /* synthetic */ e89 h;
    public final /* synthetic */ jx i;

    public h02(aw2 aw2Var, e89 e89Var, n69 n69Var, e89 e89Var2, e89 e89Var3, n69 n69Var2, n69 n69Var3, e89 e89Var4, jx jxVar) {
        this.a = aw2Var;
        this.b = e89Var;
        this.c = n69Var;
        this.d = e89Var2;
        this.e = e89Var3;
        this.f = n69Var2;
        this.g = n69Var3;
        this.h = e89Var4;
        this.i = jxVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        final aw2 aw2Var = this.a;
        final e89 e89Var = this.b;
        final n69 n69Var = this.c;
        final e89 e89Var2 = this.d;
        final e89 e89Var3 = this.e;
        final n69 n69Var2 = this.f;
        final n69 n69Var3 = this.g;
        final e89 e89Var4 = this.h;
        final jx jxVar = this.i;
        Object objS = k99.s(tiaVar, new o2f(false, new o26() { // from class: f02
            /* JADX WARN: Code duplicated, block: B:19:0x00aa A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:20:0x00ac A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:21:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:22:0x00b0  */
            /* JADX WARN: Code duplicated, block: B:24:0x00ba  */
            /* JADX WARN: Code duplicated, block: B:26:0x00d2  */
            /* JADX WARN: Code duplicated, block: B:29:0x00db  */
            /* JADX WARN: Code duplicated, block: B:31:0x00e2  */
            /* JADX WARN: Code duplicated, block: B:32:0x00e7 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:33:0x00e9  */
            /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
            /* JADX WARN: Code duplicated, block: B:36:0x00f5  */
            /* JADX WARN: Code duplicated, block: B:40:0x0108  */
            /* JADX WARN: Code duplicated, block: B:42:0x011e  */
            @Override // defpackage.o26
            public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
                jmb jmbVar;
                boolean zC;
                long jLongValue;
                boolean zC2;
                float fJ;
                hl9 hl9Var = (hl9) obj;
                hl9 hl9Var2 = (hl9) obj2;
                float fFloatValue = ((Float) obj3).floatValue();
                float fFloatValue2 = ((Float) obj4).floatValue();
                wn7[] wn7VarArr = q02.a;
                long j = ((hl9) e89Var.getValue()).a;
                qz9 qz9Var = (qz9) n69Var;
                qz9Var.k(mh3.n(qz9Var.j() * fFloatValue, 1.1f, 1.3f));
                e89 e89Var5 = e89Var2;
                if (fFloatValue != 1.0f) {
                    e89Var5.setValue(Boolean.TRUE);
                }
                n69 n69Var4 = n69Var2;
                n69 n69Var5 = n69Var3;
                e89 e89Var6 = e89Var4;
                if (fFloatValue2 == 0.0f) {
                    if (!(hl9Var2 == null ? false : hl9.c(hl9Var2.a, 0L))) {
                    }
                    jmbVar = new jmb();
                    if (!((Boolean) e89Var5.getValue()).booleanValue()) {
                        if (hl9Var2 == null) {
                            zC = false;
                        } else {
                            zC = hl9.c(hl9Var2.a, 0L);
                        }
                        if (!zC) {
                            ((qz9) n69Var4).k(q02.c(j, hl9Var.a));
                        }
                    } else if (fFloatValue2 == 0.0f) {
                        if (hl9Var2 == null) {
                            zC2 = false;
                        } else {
                            zC2 = hl9.c(hl9Var2.a, 0L);
                        }
                        if (!zC2) {
                            float fC = q02.c(j, hl9Var.a);
                            qz9 qz9Var2 = (qz9) n69Var4;
                            fJ = fC - qz9Var2.j();
                            jmbVar.element = fJ;
                            if (fJ > 180.0f) {
                                fJ -= 360.0f;
                                jmbVar.element = fJ;
                            }
                            if (fJ < -180.0f) {
                                jmbVar.element = fJ + 360.0f;
                            }
                            qz9Var2.k(fC);
                        }
                    } else {
                        jmbVar.element = fFloatValue2;
                    }
                    if (jmbVar.element != 0.0f) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        jLongValue = jCurrentTimeMillis - ((Number) e89Var6.getValue()).longValue();
                        if (jLongValue < 1) {
                            jLongValue = 1;
                        }
                        ((qz9) n69Var5).k((jmbVar.element / jLongValue) * 1000.0f);
                        e89Var6.setValue(Long.valueOf(jCurrentTimeMillis));
                        ynb.V(aw2Var, null, null, new g02(jxVar, jmbVar, null), 3);
                    }
                    return wef.a;
                }
                fFloatValue2 = fFloatValue2;
                e89 e89Var7 = e89Var3;
                if (!((Boolean) e89Var7.getValue()).booleanValue()) {
                    ((qz9) n69Var4).k(q02.c(j, hl9Var.a));
                    e89Var7.setValue(Boolean.TRUE);
                    ((qz9) n69Var5).k(0.0f);
                    e89Var6.setValue(Long.valueOf(System.currentTimeMillis()));
                }
                jmbVar = new jmb();
                if (!((Boolean) e89Var5.getValue()).booleanValue()) {
                    if (hl9Var2 == null) {
                        zC = false;
                    } else {
                        zC = hl9.c(hl9Var2.a, 0L);
                    }
                    if (!zC) {
                        ((qz9) n69Var4).k(q02.c(j, hl9Var.a));
                    }
                } else if (fFloatValue2 == 0.0f) {
                    if (hl9Var2 == null) {
                        zC2 = false;
                    } else {
                        zC2 = hl9.c(hl9Var2.a, 0L);
                    }
                    if (!zC2) {
                        float fC2 = q02.c(j, hl9Var.a);
                        qz9 qz9Var3 = (qz9) n69Var4;
                        fJ = fC2 - qz9Var3.j();
                        jmbVar.element = fJ;
                        if (fJ > 180.0f) {
                            fJ -= 360.0f;
                            jmbVar.element = fJ;
                        }
                        if (fJ < -180.0f) {
                            jmbVar.element = fJ + 360.0f;
                        }
                        qz9Var3.k(fC2);
                    }
                } else {
                    jmbVar.element = fFloatValue2;
                }
                if (jmbVar.element != 0.0f) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    jLongValue = jCurrentTimeMillis2 - ((Number) e89Var6.getValue()).longValue();
                    if (jLongValue < 1) {
                        jLongValue = 1;
                    }
                    ((qz9) n69Var5).k((jmbVar.element / jLongValue) * 1000.0f);
                    e89Var6.setValue(Long.valueOf(jCurrentTimeMillis2));
                    ynb.V(aw2Var, null, null, new g02(jxVar, jmbVar, null), 3);
                }
                return wef.a;
            }
        }, null), xn2Var);
        return objS == bw2.a ? objS : wef.a;
    }
}

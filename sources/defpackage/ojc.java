package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import java.util.List;
import tech.chatmind.api.ArcanaGroup;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ojc implements o26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ ojc(aw2 aw2Var, e89 e89Var, e89 e89Var2, n69 n69Var, n69 n69Var2, e89 e89Var3, jx jxVar) {
        this.b = aw2Var;
        this.c = e89Var;
        this.d = e89Var2;
        this.f = n69Var;
        this.g = n69Var2;
        this.e = e89Var3;
        this.v = jxVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0315  */
    /* JADX WARN: Code duplicated, block: B:105:0x032b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0294 A[PHI: r18
  0x0294: PHI (r18v2 long) = (r18v1 long), (r13v0 long) binds: [B:84:0x02a3, B:79:0x0291] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x02d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:90:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:92:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:94:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:97:0x0303  */
    /* JADX WARN: Code duplicated, block: B:99:0x030a  */
    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
        long j;
        jmb jmbVar;
        long jLongValue;
        boolean zC;
        float fJ;
        int i;
        int i2;
        int i3;
        int i4 = this.a;
        wef wefVar = wef.a;
        Object obj5 = this.v;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.c;
        Object obj11 = this.b;
        int i5 = 3;
        switch (i4) {
            case 0:
                aw2 aw2Var = (aw2) obj11;
                e89 e89Var = (e89) obj9;
                n69 n69Var = (n69) obj7;
                n69 n69Var2 = (n69) obj6;
                e89 e89Var2 = (e89) obj8;
                jx jxVar = (jx) obj5;
                hl9 hl9Var = (hl9) obj;
                hl9 hl9Var2 = (hl9) obj2;
                ((Float) obj3).getClass();
                float fFloatValue = ((Float) obj4).floatValue();
                long j2 = ((hl9) ((e89) obj10).getValue()).a;
                if (fFloatValue == 0.0f) {
                    if (hl9Var2 == null ? false : hl9.c(hl9Var2.a, 0L)) {
                        j = j2;
                    }
                    jmbVar = new jmb();
                    if (fFloatValue == 0.0f) {
                        if (hl9Var2 == null) {
                            zC = false;
                        } else {
                            zC = hl9.c(hl9Var2.a, 0L);
                        }
                        if (!zC) {
                            float fG = iqf.g(j, hl9Var.a);
                            qz9 qz9Var = (qz9) n69Var;
                            fJ = fG - qz9Var.j();
                            jmbVar.element = fJ;
                            if (fJ > 180.0f) {
                                fJ -= 360.0f;
                                jmbVar.element = fJ;
                            }
                            if (fJ < -180.0f) {
                                jmbVar.element = fJ + 360.0f;
                            }
                            qz9Var.k(fG);
                        }
                    } else {
                        jmbVar.element = fFloatValue;
                    }
                    if (jmbVar.element != 0.0f) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        jLongValue = jCurrentTimeMillis - ((Number) e89Var2.getValue()).longValue();
                        if (jLongValue < 1) {
                            jLongValue = 1;
                        }
                        ((qz9) n69Var2).k((jmbVar.element / jLongValue) * 1000.0f);
                        e89Var2.setValue(Long.valueOf(jCurrentTimeMillis));
                        ynb.V(aw2Var, null, null, new pjc(jxVar, jmbVar, null), 3);
                    }
                    return wefVar;
                }
                j2 = j2;
                if (((Boolean) e89Var.getValue()).booleanValue()) {
                    j = j2;
                } else {
                    j = j2;
                    ((qz9) n69Var).k(iqf.g(j, hl9Var.a));
                    e89Var.setValue(Boolean.TRUE);
                    ((qz9) n69Var2).k(0.0f);
                    e89Var2.setValue(Long.valueOf(System.currentTimeMillis()));
                }
                jmbVar = new jmb();
                if (fFloatValue == 0.0f) {
                    if (hl9Var2 == null) {
                        zC = false;
                    } else {
                        zC = hl9.c(hl9Var2.a, 0L);
                    }
                    if (!zC) {
                        float fG2 = iqf.g(j, hl9Var.a);
                        qz9 qz9Var2 = (qz9) n69Var;
                        fJ = fG2 - qz9Var2.j();
                        jmbVar.element = fJ;
                        if (fJ > 180.0f) {
                            fJ -= 360.0f;
                            jmbVar.element = fJ;
                        }
                        if (fJ < -180.0f) {
                            jmbVar.element = fJ + 360.0f;
                        }
                        qz9Var2.k(fG2);
                    }
                } else {
                    jmbVar.element = fFloatValue;
                }
                if (jmbVar.element != 0.0f) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    jLongValue = jCurrentTimeMillis2 - ((Number) e89Var2.getValue()).longValue();
                    if (jLongValue < 1) {
                        jLongValue = 1;
                    }
                    ((qz9) n69Var2).k((jmbVar.element / jLongValue) * 1000.0f);
                    e89Var2.setValue(Long.valueOf(jCurrentTimeMillis2));
                    ynb.V(aw2Var, null, null, new pjc(jxVar, jmbVar, null), 3);
                }
                return wefVar;
            default:
                xw9 xw9Var = (xw9) obj11;
                bx9 bx9Var = (bx9) obj10;
                jkc jkcVar = (jkc) obj9;
                egd egdVar = (egd) obj8;
                sdd sddVar = (sdd) obj7;
                ft1 ft1Var = (ft1) obj6;
                mic micVar = (mic) obj5;
                ly lyVar = (ly) obj;
                tn4 tn4Var = (tn4) obj2;
                l46 l46Var = (l46) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                lyVar.getClass();
                tn4Var.getClass();
                if ((iIntValue & 6) == 0) {
                    i = ((iIntValue & 8) == 0 ? l46Var.g(lyVar) : l46Var.i(lyVar) ? 4 : 2) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= l46Var.e(tn4Var.ordinal()) ? 32 : 16;
                }
                if (!l46Var.W(i & 1, (i & 147) != 146)) {
                    l46Var.Z();
                    return wefVar;
                }
                int iOrdinal = tn4Var.ordinal();
                i8c i8cVar = sf2.a;
                if (iOrdinal == 0) {
                    l46Var.f0(293916480);
                    ArcanaGroup arcanaGroupQ = jkcVar.q();
                    List list = rmc.a;
                    arcanaGroupQ.getClass();
                    int i6 = qmc.a[arcanaGroupQ.ordinal()];
                    if (i6 == 1) {
                        i2 = R.string.seasonal_shuffle_suit_cups;
                    } else if (i6 == 2) {
                        i2 = R.string.seasonal_shuffle_suit_swords;
                    } else if (i6 == 3) {
                        i2 = R.string.seasonal_shuffle_suit_wands;
                    } else if (i6 == 4) {
                        i2 = R.string.seasonal_shuffle_suit_pentacles;
                    } else if (i6 == 5) {
                        i2 = R.string.seasonal_shuffle_suit_major;
                    } else {
                        ap.c();
                    }
                    String strQ = afc.q(i2, l46Var);
                    String strQ2 = afc.q(rmc.b(jkcVar.q()), l46Var);
                    FillElement fillElement = b.c;
                    bx9 bx9VarW = g21.W(xw9Var, bx9Var, l46Var);
                    int size = jkcVar.q().getTypes().size();
                    dd2 dd2VarB0 = af1.b0(-345282134, new uz5(strQ, strQ2, i5), l46Var);
                    boolean zI = l46Var.i(jkcVar);
                    Object objR = l46Var.R();
                    if (zI || objR == i8cVar) {
                        yv9 yv9Var = new yv9(0, jkcVar, jkc.class, "onShuffleToWheel", "onShuffleToWheel()V", 0, 10);
                        l46Var.p0(yv9Var);
                        objR = yv9Var;
                    }
                    p8c.i(fillElement, bx9VarW, egdVar, 0, size, false, false, null, true, dd2VarB0, null, null, null, false, (x16) ((ym7) objR), l46Var, 906166278, 0, 15560);
                    l46Var.r(false);
                    return wefVar;
                }
                if (iOrdinal == 1) {
                    l46Var.f0(292756212);
                    nk8.d(ynb.Y(b.c, g21.W(g21.W(xw9Var, bx9Var, l46Var), ynb.r(0.0f, 0.0f, 0.0f, 12.0f, 7), l46Var)), null, af1.b0(712447427, new n50(mh3.T(l46Var), jkcVar, sddVar, lyVar, micVar, 11), l46Var), l46Var, 3072, 6);
                    l46Var.r(false);
                    return wefVar;
                }
                if (iOrdinal != 2) {
                    throw tec.d(1394917327, l46Var, false);
                }
                l46Var.f0(294840714);
                ArcanaGroup arcanaGroupQ2 = jkcVar.q();
                List list2 = rmc.a;
                arcanaGroupQ2.getClass();
                int i7 = qmc.a[arcanaGroupQ2.ordinal()];
                if (i7 == 1) {
                    i3 = R.string.seasonal_draw_wheel_title_cups;
                } else if (i7 == 2) {
                    i3 = R.string.seasonal_draw_wheel_title_swords;
                } else if (i7 == 3) {
                    i3 = R.string.seasonal_draw_wheel_title_wands;
                } else if (i7 == 4) {
                    i3 = R.string.seasonal_draw_wheel_title_pentacles;
                } else if (i7 == 5) {
                    i3 = R.string.seasonal_draw_wheel_title_major;
                } else {
                    ap.c();
                }
                String strQ3 = afc.q(i3, l46Var);
                String strQ4 = afc.q(rmc.b(jkcVar.q()), l46Var);
                List<TarotCardType> types = jkcVar.q().getTypes();
                Integer numH = jkcVar.h();
                boolean zI2 = l46Var.i(jkcVar);
                Object objR2 = l46Var.R();
                if (zI2 || objR2 == i8cVar) {
                    vx7 vx7Var = new vx7(1, jkcVar, jkc.class, "onCardSelected", "onCardSelected(I)V", 0, 16);
                    l46Var.p0(vx7Var);
                    objR2 = vx7Var;
                }
                iqf.c(sddVar, types, numH, (a26) ((ym7) objR2), ft1Var, null, null, 0.0f, 0.0f, 0.0f, 0.0f, af1.b0(-2144923305, new uz5(strQ3, strQ4, 4), l46Var), l46Var, 0);
                l46Var.r(false);
                return wefVar;
                return null;
        }
    }

    public /* synthetic */ ojc(xw9 xw9Var, bx9 bx9Var, jkc jkcVar, egd egdVar, sdd sddVar, ft1 ft1Var, mic micVar) {
        this.b = xw9Var;
        this.c = bx9Var;
        this.d = jkcVar;
        this.e = egdVar;
        this.f = sddVar;
        this.g = ft1Var;
        this.v = micVar;
    }
}

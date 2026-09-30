package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.qa.capabilities.seasonal.SeasonalQaFixtureState;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1c {
    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "subtype";
                break;
            case 6:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final ly4 b(sw6 sw6Var, Throwable th) {
        bv6 bv6Var;
        if (th instanceof qj9) {
            a26 a26Var = sw6Var.n;
            qw6 qw6Var = sw6Var.t;
            bv6Var = (bv6) a26Var.d(sw6Var);
            if (bv6Var == null) {
                bv6Var = (bv6) qw6Var.j.d(sw6Var);
            }
            if (bv6Var == null && (bv6Var = (bv6) sw6Var.m.d(sw6Var)) == null) {
                bv6Var = (bv6) qw6Var.i.d(sw6Var);
            }
        } else {
            bv6Var = (bv6) sw6Var.m.d(sw6Var);
            if (bv6Var == null) {
                bv6Var = (bv6) sw6Var.t.i.d(sw6Var);
            }
        }
        return new ly4(bv6Var, sw6Var, th);
    }

    public static final void c(x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-1717369765);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i | (l46Var.i(x16Var2) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 << 24;
            kj0.F(afc.q(R.string.review_reward_prompt_title, l46Var), rxg.f, afc.q(R.string.review_reward_prompt_rate, l46Var), afc.q(R.string.button_cancel, l46Var), false, false, null, null, x16Var, x16Var2, l46Var, (234881024 & i3) | 48 | (i3 & 1879048192), 240);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i, 26, x16Var, x16Var2);
        }
    }

    public static final void d(r4g r4gVar, x16 x16Var, l46 l46Var, int i) {
        u4g t4gVar;
        x16Var.getClass();
        l46Var.h0(1489209224);
        int i2 = (l46Var.i(x16Var) ? 32 : 16) | i;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            TarotSkinIdentify tarotSkinIdentify = ((die) l46Var.k(snd.a)).a;
            int iOrdinal = r4gVar.ordinal();
            if (iOrdinal == 0) {
                l46Var.f0(905962133);
                t4gVar = new t4g(new qhe("the_fool", 1), tarotSkinIdentify, afc.q(R.string.card_the_fool, l46Var), "");
                l46Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw tec.d(905960061, l46Var, false);
                }
                l46Var.f0(905970442);
                l46Var.r(false);
                t4gVar = new s4g(tarotSkinIdentify, "yes_no");
            }
            j09 j09VarO = tm7.o(b.c, ((e8b) l46Var.k(l8b.a)).c, g21.f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarO);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            v2c.g(t4gVar, x16Var, x16Var, x16Var, l46Var, (i2 & 112) | ((i2 << 3) & 896) | ((i2 << 6) & 7168));
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p4c(r4gVar, x16Var, i, 26);
        }
    }

    public static final void e(int i, int i2, float[] fArr, int[] iArr, int[] iArr2, boolean z) {
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < 196; i4++) {
                int i5 = -i2;
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                float f4 = 0.0f;
                if (i5 <= i2) {
                    while (true) {
                        int i6 = iArr[((z ? i3 : mh3.o(i3 + i5, 0, i - 1)) * 196) + (z ? mh3.o(i4 + i5, 0, 195) : i4)];
                        float f5 = fArr[i5 + i2];
                        f += (i6 >>> 24) * f5;
                        f2 += ((i6 >> 16) & 255) * f5;
                        f3 += ((i6 >> 8) & 255) * f5;
                        f4 += (i6 & 255) * f5;
                        if (i5 != i2) {
                            i5++;
                        }
                    }
                }
                iArr2[(i3 * 196) + i4] = (ym8.L(f) << 24) | (ym8.L(f2) << 16) | (ym8.L(f3) << 8) | ym8.L(f4);
            }
        }
    }

    public static vz9 f(Object obj) {
        return new vz9(obj, i8c.f);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[SYNTHETIC] */
    public static void g(vl1 vl1Var, ste steVar) throws Throwable {
        vl1 vl1Var2;
        Throwable th;
        b59 b59Var = steVar.b;
        boolean zF = steVar.f();
        rte rteVar = steVar.a;
        boolean z = zF && rteVar.f != 3;
        if (z) {
            long j = steVar.c;
            hkb hkbVarG = z5c.g(0L, (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
            vl1Var.g();
            vl1.r(vl1Var, hkbVarG);
        }
        xtd xtdVar = rteVar.b.a;
        mne mneVar = xtdVar.m;
        bte bteVar = xtdVar.a;
        if (mneVar == null) {
            mneVar = mne.b;
        }
        mne mneVar2 = mneVar;
        o4d o4dVar = xtdVar.n;
        if (o4dVar == null) {
            o4dVar = o4d.d;
        }
        o4d o4dVar2 = o4dVar;
        un4 un4Var = xtdVar.p;
        if (un4Var == null) {
            un4Var = oe5.a;
        }
        un4 un4Var2 = un4Var;
        try {
            b41 b41VarC = bteVar.c();
            ate ateVar = ate.a;
            try {
                if (b41VarC == null) {
                    long jB = bteVar != ateVar ? bteVar.b() : y72.b;
                    vl1Var2 = vl1Var;
                    try {
                        b59Var.i(vl1Var2, jB, o4dVar2, mneVar2, un4Var2);
                        if (z) {
                            vl1Var2.o();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (!z) {
                            throw th;
                        }
                        vl1Var2.o();
                        throw th;
                    }
                }
                float fA = bteVar != ateVar ? bteVar.a() : 1.0f;
                vl1Var2 = vl1Var;
                try {
                    lmg.b0(b59Var, vl1Var2, b41VarC, fA, o4dVar2, mneVar2, un4Var2);
                    vl1Var2 = vl1Var2;
                    if (z) {
                        vl1Var2.o();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z) {
                        throw th;
                    }
                    vl1Var2.o();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                vl1Var2 = vl1Var;
            }
        } catch (Throwable th5) {
            th = th5;
            vl1Var2 = vl1Var;
        }
        if (!z) {
            throw th;
        }
        vl1Var2.o();
        throw th;
    }

    public static nde h(q8c q8cVar, String str) {
        Map mapJ;
        o1d o1dVar;
        q8cVar.getClass();
        x8c x8cVarW0 = q8cVar.W0("PRAGMA table_info(`" + str + "`)");
        try {
            long j = 0;
            if (x8cVarW0.R0()) {
                int iG = z8c.g(x8cVarW0, "name");
                int iG2 = z8c.g(x8cVarW0, "type");
                int iG3 = z8c.g(x8cVarW0, "notnull");
                int iG4 = z8c.g(x8cVarW0, "pk");
                int iG5 = z8c.g(x8cVarW0, "dflt_value");
                fl8 fl8Var = new fl8();
                do {
                    String strT0 = x8cVarW0.t0(iG);
                    fl8Var.put(strT0, new kde((int) x8cVarW0.getLong(iG4), 2, strT0, x8cVarW0.t0(iG2), x8cVarW0.isNull(iG5) ? null : x8cVarW0.t0(iG5), x8cVarW0.getLong(iG3) != 0));
                } while (x8cVarW0.R0());
                mapJ = fl8Var.j();
                cgg.t(x8cVarW0, null);
            } else {
                mapJ = qu4.a;
                cgg.t(x8cVarW0, null);
            }
            x8c x8cVarW1 = q8cVar.W0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iG6 = z8c.g(x8cVarW1, "id");
                int iG7 = z8c.g(x8cVarW1, "seq");
                int iG8 = z8c.g(x8cVarW1, "table");
                int iG9 = z8c.g(x8cVarW1, "on_delete");
                int iG10 = z8c.g(x8cVarW1, "on_update");
                List listI = hfc.i(x8cVarW1);
                x8cVarW1.reset();
                o1d o1dVar2 = new o1d();
                while (x8cVarW1.R0()) {
                    if (x8cVarW1.getLong(iG7) == j) {
                        int i = (int) x8cVarW1.getLong(iG6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = iG6;
                        ArrayList<mr5> arrayList3 = new ArrayList();
                        for (Object obj : listI) {
                            int i3 = iG7;
                            List list = listI;
                            if (((mr5) obj).a == i) {
                                arrayList3.add(obj);
                            }
                            iG7 = i3;
                            listI = list;
                        }
                        int i4 = iG7;
                        List list2 = listI;
                        for (mr5 mr5Var : arrayList3) {
                            arrayList.add(mr5Var.c);
                            arrayList2.add(mr5Var.d);
                        }
                        o1dVar2.add(new lde(x8cVarW1.t0(iG8), x8cVarW1.t0(iG9), arrayList, arrayList2, x8cVarW1.t0(iG10)));
                        iG6 = i2;
                        iG7 = i4;
                        listI = list2;
                        j = 0;
                    }
                }
                o1d o1dVarD = o1dVar2.d();
                cgg.t(x8cVarW1, null);
                x8c x8cVarW2 = q8cVar.W0("PRAGMA index_list(`" + str + "`)");
                try {
                    int iG11 = z8c.g(x8cVarW2, "name");
                    int iG12 = z8c.g(x8cVarW2, "origin");
                    int iG13 = z8c.g(x8cVarW2, "unique");
                    if (iG11 == -1 || iG12 == -1 || iG13 == -1) {
                        cgg.t(x8cVarW2, null);
                        o1dVar = null;
                    } else {
                        o1d o1dVar3 = new o1d();
                        while (x8cVarW2.R0()) {
                            if ("c".equals(x8cVarW2.t0(iG12))) {
                                mde mdeVarJ = hfc.j(q8cVar, x8cVarW2.t0(iG11), x8cVarW2.getLong(iG13) == 1);
                                if (mdeVarJ == null) {
                                    cgg.t(x8cVarW2, null);
                                    o1dVar = null;
                                } else {
                                    o1dVar3.add(mdeVarJ);
                                }
                            }
                        }
                        o1d o1dVarD2 = o1dVar3.d();
                        cgg.t(x8cVarW2, null);
                        o1dVar = o1dVarD2;
                    }
                    return new nde(str, mapJ, o1dVarD, o1dVar);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        cgg.t(x8cVarW2, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    cgg.t(x8cVarW1, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                cgg.t(x8cVarW0, th5);
                throw th6;
            }
        }
    }

    public static final e89 i(Object obj, l46 l46Var) {
        Object objR = l46Var.R();
        if (objR == sf2.a) {
            objR = f(obj);
            l46Var.p0(objR);
        }
        e89 e89Var = (e89) objR;
        e89Var.setValue(obj);
        return e89Var;
    }

    public static final ti7 j(SeasonalQaFixtureState seasonalQaFixtureState) {
        return new ti7(bm8.H(new iy9(UsageBillingBalance.STATUS_ACTIVE, oh7.a(Boolean.TRUE)), new iy9("fixture", oh7.c(seasonalQaFixtureState.getFixture())), new iy9("status", oh7.c(seasonalQaFixtureState.getStatus())), new iy9("resultScenario", oh7.c(seasonalQaFixtureState.getResultScenario())), new iy9("display", oh7.c(seasonalQaFixtureState.getFixture() + " · " + seasonalQaFixtureState.getStatus() + " · " + seasonalQaFixtureState.getResultScenario()))));
    }

    public static void k(int i, int i2) {
        String strK;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strK = u3c.k("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    qc0.j(tec.e(i2, "negative size: "));
                    return;
                }
                strK = u3c.k("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strK);
        }
    }

    public static void l(int i, int i2) {
        if (i < 0 || i > i2) {
            r3.i(n(i, i2, "index"));
        }
    }

    public static void m(int i, int i2, int i3) {
        String strN;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strN = n(i, i3, "start index");
            } else {
                strN = (i2 < 0 || i2 > i3) ? n(i2, i3, "end index") : u3c.k("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strN);
        }
    }

    public static String n(int i, int i2, String str) {
        if (i < 0) {
            return u3c.k("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return u3c.k("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        qc0.j(tec.e(i2, "negative size: "));
        return null;
    }
}

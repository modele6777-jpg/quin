package defpackage;

import ai.askquin.R;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b87 {
    public static final /* synthetic */ int a = 0;

    static {
        new n07(thb.a, "¥10", null, 10.0d, "¥", new Object(), null, 196);
        new z6e(u7e.b, "¥18.8", "18.8", "", "¥", new Object(), null, "次月 ¥28.8/月", 0.0d, null, 832);
        new z6e(u7e.c, "¥98", "98", "", "¥", new Object(), null, "低至 ¥0.14/次", 0.0d, null, 832);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21841. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void a(defpackage.j09 r38, defpackage.c87 r39, int r40, boolean r41, defpackage.a26 r42, defpackage.a26 r43, defpackage.x16 r44, defpackage.x16 r45, defpackage.l46 r46, int r47) {
        /*
            Method dump skipped, instruction units count: 2184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b87.a(j09, c87, int, boolean, a26, a26, x16, x16, l46, int):void");
    }

    public static final void b(final String str, final String str2, a26 a26Var, final x16 x16Var, final x16 x16Var2, l46 l46Var, int i) {
        xn2 xn2Var;
        a26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-582351151);
        int i2 = i | (l46Var.g(str) ? 4 : 2) | (l46Var.g(str2) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            final Context context = (Context) l46Var.k(uq.b);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z || objR == obj) {
                objR = new t8(str, 7);
                l46Var.p0(objR);
            }
            x16 x16Var3 = (x16) objR;
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            gy2 gy2VarR = b21.r(pwfVarA);
            nfc nfcVarB = kr7.b(l46Var);
            kob kobVar = job.a;
            final g87 g87Var = (g87) z5c.G(kobVar.b(g87.class), pwfVarA.g(), null, gy2VarR, nfcVarB, x16Var3);
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = nfcVarB2.b(kobVar.b(p5a.class), null, null);
                l46Var.p0(objR2);
            }
            final p5a p5aVar = (p5a) objR2;
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = q1c.f(null);
                l46Var.p0(objR3);
            }
            final e89 e89Var = (e89) objR3;
            boolean zI = l46Var.i(context) | l46Var.i(g87Var);
            Object objR4 = l46Var.R();
            if (zI || objR4 == obj) {
                objR4 = new y77(context, g87Var, null);
                l46Var.p0(objR4);
            }
            af1.o((l26) objR4, l46Var, wef.a);
            final c87 c87VarQ = g87Var.Q();
            iif.a.getClass();
            boolean z2 = uzd.d(str2) == iif.NoSubscription;
            boolean zI2 = (i3 == 4) | ((i2 & 112) == 32) | l46Var.i(p5aVar) | ((i2 & 7168) == 2048);
            Object objR5 = l46Var.R();
            if (zI2 || objR5 == obj) {
                xn2Var = null;
                Object r77Var = new r77(x16Var, str, str2, p5aVar, e89Var, 0);
                l46Var.p0(r77Var);
                objR5 = r77Var;
            } else {
                xn2Var = null;
            }
            final boolean z3 = z2;
            xn2 xn2Var2 = xn2Var;
            t72.b((x16) objR5, new s84(false, false, 3), af1.b0(-322858726, new l26() { // from class: v77
                /* JADX WARN: Code duplicated, block: B:35:0x0063  */
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    boolean z4;
                    Object m8Var;
                    g87 g87Var2;
                    p5a p5aVar2;
                    p5a p5aVar3;
                    Object k11Var;
                    String str3;
                    String str4;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    int i4 = 0;
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                        c87 c87Var = c87VarQ;
                        boolean z5 = c87Var.f;
                        boolean z6 = z3;
                        if (z5) {
                            z4 = false;
                        } else {
                            z6e z6eVar = c87Var.b;
                            String strY = z6eVar != null ? z6eVar.y() : null;
                            if (strY == null || v4e.Q(strY)) {
                                z4 = false;
                            } else {
                                z6e z6eVar2 = c87Var.c;
                                String strY2 = z6eVar2 != null ? z6eVar2.y() : null;
                                if (strY2 == null || v4e.Q(strY2)) {
                                    z4 = false;
                                } else {
                                    if (!z6) {
                                        n07 n07Var = c87Var.a;
                                        String strY3 = n07Var != null ? n07Var.y() : null;
                                        if (strY3 == null || v4e.Q(strY3)) {
                                            z4 = false;
                                        }
                                    }
                                    z4 = true;
                                }
                            }
                        }
                        g87 g87Var3 = g87Var;
                        boolean zI3 = l46Var2.i(g87Var3);
                        x16 x16Var4 = x16Var2;
                        boolean zG2 = zI3 | l46Var2.g(x16Var4);
                        String str5 = str;
                        boolean zG3 = zG2 | l46Var2.g(str5);
                        String str6 = str2;
                        boolean zG4 = zG3 | l46Var2.g(str6);
                        p5a p5aVar4 = p5aVar;
                        boolean zI4 = zG4 | l46Var2.i(p5aVar4);
                        Object objR6 = l46Var2.R();
                        i8c i8cVar = sf2.a;
                        if (zI4 || objR6 == i8cVar) {
                            g87Var2 = g87Var3;
                            p5aVar2 = p5aVar4;
                            m8Var = new m8(g87Var2, x16Var4, str5, str6, p5aVar2, 15);
                            l46Var2.p0(m8Var);
                        } else {
                            p5aVar2 = p5aVar4;
                            g87Var2 = g87Var3;
                            m8Var = objR6;
                        }
                        bzd.j(z4, (x16) m8Var, l46Var2, 0);
                        FillElement fillElement = b.c;
                        xn8 xn8VarC = s21.c(ndb.w, false);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, fillElement);
                        lf2.q.getClass();
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(LayoutNode.h1);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(hj6.z, l46Var2, xn8VarC);
                        dec.l(hj6.y, l46Var2, u8aVarM);
                        dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                        dec.k(l46Var2);
                        dec.l(hj6.x, l46Var2, j09VarJ);
                        lmd.a.getClass();
                        int size = lmd.b.size();
                        j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 8.0f, 7, ynb.b0(12.0f, 0.0f, g09.a, 2));
                        boolean zI5 = l46Var2.i(g87Var2);
                        Object objR7 = l46Var2.R();
                        if (zI5 || objR7 == i8cVar) {
                            g87 g87Var4 = g87Var2;
                            p5aVar3 = p5aVar2;
                            sk3 sk3Var = new sk3(0, g87Var4, g87.class, "restorePurchase", "restorePurchase()V", 0, 21);
                            g87Var2 = g87Var4;
                            l46Var2.p0(sk3Var);
                            objR7 = sk3Var;
                        } else {
                            p5aVar3 = p5aVar2;
                        }
                        ym7 ym7Var = (ym7) objR7;
                        Object objR8 = l46Var2.R();
                        e89 e89Var2 = e89Var;
                        if (objR8 == i8cVar) {
                            objR8 = new w77(e89Var2, i4);
                            l46Var2.p0(objR8);
                        }
                        a26 a26Var2 = (a26) objR8;
                        boolean zG5 = l46Var2.g(str5) | l46Var2.g(str6) | l46Var2.i(p5aVar3);
                        Context context2 = context;
                        boolean zI6 = zG5 | l46Var2.i(context2) | l46Var2.i(g87Var2);
                        Object objR9 = l46Var2.R();
                        if (zI6 || objR9 == i8cVar) {
                            str3 = str6;
                            str4 = str5;
                            k11Var = new k11(context2, e89Var2, str4, str3, p5aVar3, g87Var2, 5);
                            l46Var2.p0(k11Var);
                        } else {
                            str4 = str5;
                            k11Var = objR9;
                            str3 = str6;
                        }
                        a26 a26Var3 = (a26) k11Var;
                        boolean zG6 = l46Var2.g(str4) | l46Var2.g(str3) | l46Var2.i(p5aVar3);
                        x16 x16Var5 = x16Var;
                        boolean zG7 = zG6 | l46Var2.g(x16Var5);
                        Object objR10 = l46Var2.R();
                        if (zG7 || objR10 == i8cVar) {
                            objR10 = new r77(x16Var5, str4, str3, p5aVar3, e89Var2, 1);
                            l46Var2.p0(objR10);
                        }
                        b87.a(j09VarD0, c87Var, size, z6, a26Var2, a26Var3, (x16) objR10, (x16) ym7Var, l46Var2, 24646);
                        l46Var2.r(true);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 432, 0);
            izb izbVar = (izb) g87Var.U0.getValue();
            boolean zI3 = l46Var.i(g87Var) | ((i2 & 896) == 256);
            Object objR6 = l46Var.R();
            if (zI3 || objR6 == obj) {
                objR6 = new a87(g87Var, a26Var, xn2Var2);
                l46Var.p0(objR6);
            }
            af1.o((l26) objR6, l46Var, izbVar);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cm(str, str2, a26Var, x16Var, x16Var2, i);
        }
    }

    public static final void c(x16 x16Var, l46 l46Var, int i) {
        int i2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-725125909);
        if ((i & 6) == 0) {
            i2 = i | (l46Var2.i(x16Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            String strQ = afc.q(R.string.paywall_restore_purchase, l46Var2);
            xtd xtdVarR = z5c.r(l46Var2);
            pr4 pr4Var = l8b.a;
            xtd xtdVarA = xtd.a(xtdVarR, ((e8b) l46Var2.k(pr4Var)).r, 65534);
            mue mueVarA = mue.a(jgb.W(l46Var2), ((e8b) l46Var2.k(pr4Var)).r, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
            k00 k00VarN = z5c.n(false, u7e.b, xtdVarA, l46Var2);
            ca2.a.getClass();
            if (ca2.c) {
                l46Var2.f0(1460030067);
                t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.z, l46Var2, 54);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                g09 g09Var = g09.a;
                j09 j09VarJ = m93.J(l46Var2, g09Var);
                lf2.q.getClass();
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(LayoutNode.h1);
                } else {
                    l46Var2.s0();
                }
                dec.l(hj6.z, l46Var2, t7cVarA);
                dec.l(hj6.y, l46Var2, u8aVarM);
                dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                dec.k(l46Var2);
                dec.l(hj6.x, l46Var2, j09VarJ);
                nte.c(k00VarN, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, mueVarA, l46Var2, 0, 0, 262142);
                i00 i00Var = new i00();
                int iK = i00Var.k(xtdVarA);
                try {
                    i00Var.f(strQ);
                    i00Var.h(iK);
                    nte.c(i00Var.l(), androidx.compose.foundation.b.c(g09Var, false, null, null, x16Var, 15), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, mueVarA, l46Var, 0, 0, 262140);
                    l46Var2 = l46Var;
                    l46Var2.r(true);
                    l46Var2.r(false);
                } catch (Throwable th) {
                    i00Var.h(iK);
                    throw th;
                }
            } else {
                l46Var2.f0(1460441623);
                nte.c(k00VarN, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, mueVarA, l46Var, 0, 0, 262142);
                l46Var2 = l46Var;
                l46Var2.r(false);
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new lk3(i, 6, x16Var);
        }
    }

    public static final void d(j09 j09Var, final String str, final String str2, final String str3, final String str4, boolean z, String str5, final boolean z2, x16 x16Var, l46 l46Var, int i, int i2) {
        boolean z3;
        int i3;
        boolean z4;
        l46Var.h0(-1494960859);
        int i4 = (l46Var.g(j09Var) ? 4 : 2) | i | (l46Var.g(str) ? 32 : 16) | (l46Var.g(str2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if ((i & 3072) == 0) {
            i4 |= l46Var.g(str3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i5 = i4 | (l46Var.g(str4) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 = i5 | 196608;
            z3 = z;
        } else {
            z3 = z;
            i3 = i5 | (l46Var.h(z3) ? 131072 : 65536);
        }
        if ((1572864 & i) == 0) {
            i3 |= l46Var.g(str5) ? 1048576 : 524288;
        }
        int i7 = i3 | (l46Var.h(z2) ? 8388608 : 4194304) | (l46Var.i(x16Var) ? 67108864 : 33554432);
        if (l46Var.W(i7 & 1, (38347923 & i7) != 38347922)) {
            final boolean z5 = i6 != 0 ? false : z3;
            final long j = ((e8b) l46Var.k(l8b.a)).u;
            dd2 dd2VarB0 = af1.b0(75058989, new n26() { // from class: t77
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    long jD;
                    long jD2;
                    long j2;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((d92) obj).getClass();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        mue mueVar = pue.a;
                        mue mueVarF = pue.f(l46Var2);
                        boolean z6 = z2;
                        if (z6) {
                            l46Var2.f0(-882752133);
                            jD = l8b.b(l46Var2);
                        } else {
                            l46Var2.f0(-882751267);
                            jD = l8b.d(l46Var2);
                        }
                        l46Var2.r(false);
                        nte.b(str, null, jD, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarF, l46Var2, 0, 0, 130042);
                        g09 g09Var = g09.a;
                        String str6 = str2;
                        if (str6 == null) {
                            l46Var2.f0(-1595394638);
                            s21.a(o8c.q(b.d(b.c(g09Var, 0.7f), 20.0f), 4.0f, l46Var2, 54), l46Var2, 0);
                            s21.a(o8c.q(b.d(b.c(g09Var, 0.5f), 14.0f), 4.0f, l46Var2, 54), l46Var2, 0);
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(-1595084204);
                            t7c t7cVarA = s7c.a(xc0.a, ndb.X, l46Var2, 48);
                            int iHashCode = Long.hashCode(l46Var2.T);
                            u8a u8aVarM = l46Var2.m();
                            j09 j09VarJ = m93.J(l46Var2, g09Var);
                            lf2.q.getClass();
                            l46Var2.j0();
                            if (l46Var2.S) {
                                l46Var2.l(LayoutNode.h1);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(hj6.z, l46Var2, t7cVarA);
                            dec.l(hj6.y, l46Var2, u8aVarM);
                            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                            dec.k(l46Var2);
                            dec.l(hj6.x, l46Var2, j09VarJ);
                            mue mueVarA = mue.a(pue.o(l46Var2), 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183);
                            boolean z7 = z5;
                            long j3 = j;
                            if (z6 || z7) {
                                l46Var2.f0(-2024759520);
                                l46Var2.r(false);
                                jD2 = j3;
                            } else {
                                l46Var2.f0(-2024758747);
                                jD2 = l8b.d(l46Var2);
                                l46Var2.r(false);
                            }
                            nte.b(str6, null, jD2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarA, l46Var2, 0, 0, 131066);
                            l46 l46Var3 = l46Var2;
                            String str7 = str3;
                            if (str7 != null) {
                                l46Var3.f0(1657066684);
                                nte.b(str7, ynb.d0(1.0f, 0.0f, 0.0f, 2.0f, 6, g09Var), l8b.e(l46Var3), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var3), l46Var3, 48, 0, 131064);
                                l46Var3 = l46Var3;
                                l46Var3.r(false);
                            } else {
                                l46Var3.f0(1657277453);
                                l46Var3.r(false);
                            }
                            l46Var3.r(true);
                            String str8 = str4;
                            if (str8 == null) {
                                str8 = "";
                            }
                            mue mueVarG = pue.g(l46Var3);
                            if (z7) {
                                l46Var3.f0(-882716424);
                                l46Var3.r(false);
                                j2 = j3;
                            } else {
                                l46Var3.f0(-882715652);
                                long jE = l8b.e(l46Var3);
                                l46Var3.r(false);
                                j2 = jE;
                            }
                            l46 l46Var4 = l46Var3;
                            nte.b(str8, null, j2, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarG, l46Var4, 0, 0, 130042);
                            l46Var4.r(false);
                        }
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var);
            int i8 = (i7 & 14) | 24576;
            int i9 = i7 >> 15;
            vpf.g(j09Var, str5, z2, x16Var, dd2VarB0, l46Var, i8 | (i9 & 112) | (i9 & 896) | (i9 & 7168));
            z4 = z5;
        } else {
            l46Var.Z();
            z4 = z3;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new u77(j09Var, str, str2, str3, str4, z4, str5, z2, x16Var, i, i2);
        }
    }
}

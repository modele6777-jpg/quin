package defpackage;

import ai.askquin.R;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class al6 {
    public static final /* synthetic */ int a = 0;

    static {
        Instant.now().getClass();
        Instant.now();
        Instant.now().getClass();
    }

    public static final void a(fl6 fl6Var, x16 x16Var, a26 a26Var, a26 a26Var2, a26 a26Var3, a26 a26Var4, x16 x16Var2, l46 l46Var, int i) {
        l46Var.h0(478526429);
        int i2 = i | (l46Var.g(fl6Var) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(a26Var3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if ((i & 196608) == 0) {
            i2 |= l46Var.i(a26Var4) ? 131072 : 65536;
        }
        int i3 = i2 | (l46Var.i(x16Var2) ? 1048576 : 524288);
        if (l46Var.W(i3 & 1, (599187 & i3) != 599186)) {
            xdc.a(null, af1.b0(-1202059615, new fi4(5, x16Var), l46Var), null, null, null, 0, 0L, 0L, null, af1.b0(-1240165908, new aq1(fl6Var, x16Var2, (Context) l46Var.k(uq.b), a26Var, a26Var3, a26Var2, a26Var4), l46Var), l46Var, 805306416, 509);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o53(fl6Var, x16Var, a26Var, a26Var2, a26Var3, a26Var4, x16Var2, i);
        }
    }

    public static final void b(jr2 jr2Var, x16 x16Var, a26 a26Var, l46 l46Var, int i) {
        Object obj;
        Iterable iterableP;
        jr2Var.getClass();
        x16Var.getClass();
        a26Var.getClass();
        l46Var.h0(500782443);
        int i2 = i | (l46Var.g(jr2Var) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        final int i3 = 1;
        final int i4 = 0;
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final ol6 ol6Var = (ol6) z5c.G(job.a.b(ol6.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            e89 e89VarT = tm7.t(ol6Var.Y, l46Var);
            fl6 fl6Var = (fl6) e89VarT.getValue();
            el6 el6Var = fl6Var instanceof el6 ? (el6) fl6Var : null;
            boolean z = el6Var != null && (el6Var.a.isEmpty() ^ true);
            fl6 fl6Var2 = (fl6) e89VarT.getValue();
            el6 el6Var2 = fl6Var2 instanceof el6 ? (el6) fl6Var2 : null;
            Iterable iterable = el6Var2 != null ? (zx6) el6Var2.a.values() : null;
            if (iterable == null) {
                iterable = pu4.a;
            }
            ArrayList arrayListY = t72.y(iterable);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayListY) {
                if (obj2 instanceof zb4) {
                    arrayList.add(obj2);
                }
            }
            boolean zIsEmpty = arrayList.isEmpty();
            Object obj3 = sf2.a;
            if (zIsEmpty) {
                l46Var.f0(-1905425205);
                rfc.n(z, l46Var, 48, 0);
                l46Var.r(false);
                break;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    l46Var.f0(-1905425205);
                    rfc.n(z, l46Var, 48, 0);
                    l46Var.r(false);
                    break;
                }
                if (!((zb4) it.next()).l.isEmpty()) {
                    l46Var.f0(-1905787223);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        x72.g0(arrayList2, s72.t0(((zb4) it2.next()).l.values()));
                    }
                    Set setO1 = s72.o1(arrayList2);
                    if (arrayListY.isEmpty()) {
                        l46Var.f0(215625813);
                        l46Var.r(false);
                        iterableP = xu4.a;
                    } else {
                        Iterator it3 = arrayListY.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                bc4 bc4Var = (bc4) it3.next();
                                if (!(bc4Var instanceof zb4) || ((zb4) bc4Var).l.isEmpty()) {
                                    l46Var.f0(-1905609841);
                                    iterableP = n3d.p(((die) l46Var.k(snd.a)).a);
                                    l46Var.r(false);
                                }
                            } else {
                                l46Var.f0(215625813);
                                l46Var.r(false);
                                iterableP = xu4.a;
                            }
                        }
                    }
                    LinkedHashSet linkedHashSetM = n3d.m(setO1, iterableP);
                    Object objR = l46Var.R();
                    if (objR == obj3) {
                        objR = new w66(24);
                        l46Var.p0(objR);
                    }
                    mh3.S(linkedHashSetM, (x16) objR, l46Var, 48, 0);
                    l46Var.r(false);
                    break;
                }
            }
            fl6 fl6Var3 = (fl6) e89VarT.getValue();
            boolean zI = l46Var.i(ol6Var);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj3) {
                objR2 = new a26() { // from class: sk6
                    @Override // defpackage.a26
                    public final Object d(Object obj4) {
                        int i5 = i4;
                        wef wefVar = wef.a;
                        ol6 ol6Var2 = ol6Var;
                        switch (i5) {
                            case 0:
                                fc4 fc4Var = (fc4) obj4;
                                fc4Var.getClass();
                                a62 a62VarA = hwf.a(ol6Var2);
                                js3 js3Var = ga4.a;
                                ynb.V(a62VarA, hr3.c, null, new il6(ol6Var2, fc4Var, null), 2);
                                break;
                            default:
                                long jLongValue = ((Long) obj4).longValue();
                                a62 a62VarA2 = hwf.a(ol6Var2);
                                js3 js3Var2 = ga4.a;
                                ynb.V(a62VarA2, hr3.c, null, new jl6(ol6Var2, jLongValue, null), 2);
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var.p0(objR2);
            }
            a26 a26Var2 = (a26) objR2;
            boolean zI2 = l46Var.i(ol6Var);
            Object objR3 = l46Var.R();
            if (zI2 || objR3 == obj3) {
                objR3 = new a26() { // from class: sk6
                    @Override // defpackage.a26
                    public final Object d(Object obj4) {
                        int i5 = i3;
                        wef wefVar = wef.a;
                        ol6 ol6Var2 = ol6Var;
                        switch (i5) {
                            case 0:
                                fc4 fc4Var = (fc4) obj4;
                                fc4Var.getClass();
                                a62 a62VarA = hwf.a(ol6Var2);
                                js3 js3Var = ga4.a;
                                ynb.V(a62VarA, hr3.c, null, new il6(ol6Var2, fc4Var, null), 2);
                                break;
                            default:
                                long jLongValue = ((Long) obj4).longValue();
                                a62 a62VarA2 = hwf.a(ol6Var2);
                                js3 js3Var2 = ga4.a;
                                ynb.V(a62VarA2, hr3.c, null, new jl6(ol6Var2, jLongValue, null), 2);
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var.p0(objR3);
            }
            a26 a26Var3 = (a26) objR3;
            i3 = (i2 & 14) != 4 ? 0 : 1;
            Object objR4 = l46Var.R();
            if (i3 != 0 || objR4 == obj3) {
                obj = obj3;
                Object uj3Var = new uj3(1, jr2Var, jr2.class, "launchExistingConversation", "launchExistingConversation(Lai/askquin/navigation/ConversationLaunchArguments$ExistingDivination;)V", 0, 22);
                l46Var.p0(uj3Var);
                objR4 = uj3Var;
            } else {
                obj = obj3;
            }
            a26 a26Var4 = (a26) ((ym7) objR4);
            boolean zI3 = l46Var.i(ol6Var);
            Object objR5 = l46Var.R();
            if (zI3 || objR5 == obj) {
                objR5 = new uo2(28, ol6Var);
                l46Var.p0(objR5);
            }
            a(fl6Var3, x16Var, a26Var2, a26Var3, a26Var4, a26Var, (x16) objR5, l46Var, (i2 & 112) | ((i2 << 9) & 458752));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m65(i, jr2Var, x16Var, a26Var, 10);
        }
    }

    public static final void c(int i, l46 l46Var) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(768151948);
        if (l46Var2.W(i & 1, i != 0)) {
            FillElement fillElement = b.c;
            xn8 xn8VarC = s21.c(ndb.f, false);
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
            nte.b(afc.q(R.string.history_empty, l46Var2), ynb.Z(g09.a, 32.0f), 0L, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, null, l46Var, 48, 0, 261116);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new sz5(i, 9);
        }
    }

    public static final void d(j09 j09Var, zb4 zb4Var, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        j09 j09Var2;
        l46Var.h0(-1376917311);
        int i2 = i | 6 | (l46Var.i(zb4Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            dd2 dd2VarB0 = af1.b0(1705681578, new fi4(4, x16Var), l46Var);
            dd2 dd2VarB1 = af1.b0(1433245291, new rk6(0, zb4Var, x16Var2), l46Var);
            g09 g09Var = g09.a;
            mxb.b(g09Var, dd2VarB0, dd2VarB1, l46Var, 438, 0);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q8(j09Var2, zb4Var, x16Var, x16Var2, i, 23);
        }
    }

    public static final void e(int i, l46 l46Var) {
        l46Var.h0(-1982621373);
        if (l46Var.W(i & 1, i != 0)) {
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(0.0f, 16.0f, b.c(g09Var, 1.0f), 1);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarB0);
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
            axa.a(2.0f, 0.0f, 0, 390, 56, y72.b(((m82) l46Var.k(o82.a)).q, 0.4f), 0L, l46Var, b.d(g09Var, 24.0f));
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new sz5(i, 8);
        }
    }
}

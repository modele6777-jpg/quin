package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fu9 {
    public static final float a = (1.0f + 8.0f) + 8.0f;

    public static final void a(final ArrayList arrayList, final List list, TarotSkinIdentify tarotSkinIdentify, final Map map, l46 l46Var, int i) {
        final TarotSkinIdentify tarotSkinIdentify2;
        l46Var.h0(915849713);
        int i2 = 4;
        int i3 = i | (l46Var.g(arrayList) ? 4 : 2) | (l46Var.g(list) ? 32 : 16) | (l46Var.e(tarotSkinIdentify == null ? -1 : tarotSkinIdentify.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(map) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(0);
                l46Var.p0(objR);
            }
            final e89 e89Var = (e89) objR;
            final sw3 sw3Var = (sw3) l46Var.k(zg2.h);
            final int size = list.size() + arrayList.size();
            final boolean z = (arrayList.isEmpty() || list.isEmpty()) ? false : true;
            if (tarotSkinIdentify == null) {
                l46Var.f0(-336706859);
                TarotSkinIdentify tarotSkinIdentify3 = ((die) l46Var.k(snd.a)).a;
                l46Var.r(false);
                tarotSkinIdentify2 = tarotSkinIdentify3;
            } else {
                l46Var.f0(-336707820);
                l46Var.r(false);
                tarotSkinIdentify2 = tarotSkinIdentify;
            }
            final boolean z2 = !map.isEmpty();
            final mfc mfcVar = ((e8b) l46Var.k(l8b.a)).C;
            j09 j09VarC = b.c(g09.a, 1.0f);
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new w77(e89Var, i2);
                l46Var.p0(objR2);
            }
            nk8.d(nk8.w(j09VarC, (a26) objR2), null, af1.b0(644880071, new n26() { // from class: eu9
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    TarotSkinIdentify tarotSkinIdentifyE;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e31) obj).getClass();
                    boolean z3 = false;
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        sw3 sw3Var2 = sw3Var;
                        int iD0 = sw3Var2.D0(40.0f);
                        boolean z4 = z;
                        int iD1 = z4 ? sw3Var2.D0(fu9.a) : 0;
                        int iIntValue2 = ((Number) e89Var.getValue()).intValue() - iD1;
                        if (iIntValue2 < iD0) {
                            iIntValue2 = iD0;
                        }
                        int i4 = size;
                        int i5 = iD0 - ((i4 > 1 && iD0 * i4 > iIntValue2) ? iD0 - ((iIntValue2 - iD0) / (i4 - 1)) : 0);
                        g09 g09Var = g09.a;
                        j09 j09VarC2 = b.c(g09Var, 1.0f);
                        xn8 xn8VarC = s21.c(ndb.b, false);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarC2);
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
                        l46Var2.f0(-688005085);
                        ArrayList arrayList2 = arrayList;
                        Iterator it = arrayList2.iterator();
                        int i6 = 0;
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            TarotSkinIdentify tarotSkinIdentifyE2 = null;
                            boolean z5 = z2;
                            Map map2 = map;
                            mfc mfcVar2 = mfcVar;
                            TarotSkinIdentify tarotSkinIdentify4 = tarotSkinIdentify2;
                            i8c i8cVar2 = sf2.a;
                            if (!zHasNext) {
                                l46Var2.r(z3);
                                if (z4) {
                                    l46Var2.f0(147062534);
                                    int size2 = arrayList2.size() * i5;
                                    boolean zE = l46Var2.e(size2) | l46Var2.g(sw3Var2);
                                    Object objR3 = l46Var2.R();
                                    if (zE || objR3 == i8cVar2) {
                                        objR3 = new vj(size2, sw3Var2, 6);
                                        l46Var2.p0(objR3);
                                    }
                                    s21.a(tm7.o(b.d(b.p(tm7.L(g09Var, (a26) objR3), 1.0f), 70.0f), ((e8b) l46Var2.k(l8b.a)).A, g21.f), l46Var2, 0);
                                    Iterator it2 = list.iterator();
                                    int i7 = 0;
                                    while (it2.hasNext()) {
                                        Object next = it2.next();
                                        int i8 = i7 + 1;
                                        if (i7 < 0) {
                                            t72.Z();
                                            throw null;
                                        }
                                        qhe qheVar = (qhe) next;
                                        int i9 = (i7 * i5) + size2 + iD1;
                                        String str = qheVar.a;
                                        if (map2.containsKey(str)) {
                                            tarotSkinIdentifyE = (TarotSkinIdentify) map2.get(str);
                                            if (tarotSkinIdentifyE != null) {
                                                mfcVar2.getClass();
                                                if (r8c.k(tarotSkinIdentifyE)) {
                                                    tarotSkinIdentifyE = r8c.e(mfcVar2);
                                                }
                                            } else {
                                                tarotSkinIdentifyE = null;
                                            }
                                        } else {
                                            tarotSkinIdentifyE = tarotSkinIdentify4;
                                        }
                                        boolean zE2 = l46Var2.e(i9);
                                        Iterator it3 = it2;
                                        Object objR4 = l46Var2.R();
                                        if (zE2 || objR4 == i8cVar2) {
                                            objR4 = new xp(i9, 18);
                                            l46Var2.p0(objR4);
                                        }
                                        fu9.c(qheVar, tarotSkinIdentifyE, z5, fdc.w(tm7.L(g09Var, (a26) objR4), arrayList2.size() + i7), l46Var2, 0);
                                        map2 = map2;
                                        i7 = i8;
                                        i8cVar2 = i8cVar2;
                                        it2 = it3;
                                        i5 = i5;
                                    }
                                    l46Var2.r(false);
                                } else {
                                    l46Var2.f0(147907253);
                                    l46Var2.r(false);
                                }
                                l46Var2.r(true);
                                break;
                            }
                            Object next2 = it.next();
                            int i10 = i6 + 1;
                            if (i6 < 0) {
                                t72.Z();
                                throw null;
                            }
                            qhe qheVar2 = (qhe) next2;
                            int i11 = i6 * i5;
                            String str2 = qheVar2.a;
                            if (map2.containsKey(str2)) {
                                TarotSkinIdentify tarotSkinIdentify5 = (TarotSkinIdentify) map2.get(str2);
                                if (tarotSkinIdentify5 != null) {
                                    mfcVar2.getClass();
                                    tarotSkinIdentifyE2 = r8c.k(tarotSkinIdentify5) ? r8c.e(mfcVar2) : tarotSkinIdentify5;
                                }
                            } else {
                                tarotSkinIdentifyE2 = tarotSkinIdentify4;
                            }
                            boolean zE3 = l46Var2.e(i11);
                            Object objR5 = l46Var2.R();
                            if (zE3 || objR5 == i8cVar2) {
                                objR5 = new xp(i11, 17);
                                l46Var2.p0(objR5);
                            }
                            fu9.c(qheVar2, tarotSkinIdentifyE2, z5, fdc.w(tm7.L(g09Var, (a26) objR5), i6), l46Var2, 0);
                            i6 = i10;
                            z3 = false;
                        }
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 3078, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r19(i, 2, arrayList, list, tarotSkinIdentify, map);
        }
    }

    public static final void b(j09 j09Var, dd2 dd2Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(2090551883);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(dd2Var) ? 32 : 16;
        }
        int i3 = 3;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            j09 j09VarE = oa7.E(j09Var, a7c.b(4.0f));
            pr4 pr4Var = o82.a;
            long j = ((m82) l46Var.k(pr4Var)).n;
            y02 y02Var = g21.f;
            j09 j09VarO = tm7.o(db6.w(j09VarE, 2.0f, j, y02Var), ((m82) l46Var.k(pr4Var)).n, y02Var);
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
            tec.q((i2 >> 3) & 14, dd2Var, l46Var, true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new sv(j09Var, dd2Var, i, i3);
        }
    }

    public static final void c(qhe qheVar, TarotSkinIdentify tarotSkinIdentify, boolean z, j09 j09Var, l46 l46Var, int i) {
        l46Var.h0(637279276);
        int i2 = (l46Var.i(qheVar) ? 4 : 2) | i | (l46Var.e(tarotSkinIdentify == null ? -1 : tarotSkinIdentify.ordinal()) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            b(j09Var, af1.b0(1829865420, new kg(qheVar, tarotSkinIdentify, z, 11), l46Var), l46Var, ((i2 >> 9) & 14) | 48);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o50(qheVar, tarotSkinIdentify, z, j09Var, i, 17);
        }
    }
}

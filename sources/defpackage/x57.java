package defpackage;

import ai.askquin.MainActivity;
import ai.askquin.R;
import ai.askquin.data.QuotaBlockReason;
import ai.askquin.model.TarotSkinIdentify;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Trace;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.widget.TextView;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.WeakHashMap;
import tech.chatmind.api.AdditionalInfoAudio;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x57 {
    public static Context a;
    public static Boolean b;
    public static final ah0 c = new ah0();
    public static final dd2 d = new dd2(new gd2(24), false, 1465959879);
    public static final dd2 e = new dd2(new ed2(2), false, -925319313);
    public static final dd2 f = new dd2(new kd2(11), false, -1437607144);
    public static final dd2 g = new dd2(new kd2(12), false, 720369857);
    public static final dd2 h = new dd2(new gd2(25), false, -368994057);
    public static final dd2 i = new dd2(new gd2(26), false, 3480662);
    public static final dd2 j = new dd2(new ce2(0), false, -1148807730);
    public static final dd2 k = new dd2(new ce2(1), false, -243681485);
    public static final dd2 l = new dd2(new ie2(3), false, 2026278632);
    public static final dd2 m = new dd2(new ie2(4), false, 1843240812);
    public static final fk8 n = new fk8(18);
    public static final hkb o = new hkb(0.0f, 0.0f, 10.0f, 10.0f);
    public static final Object p = new Object();
    public static boolean q;
    public static int r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public static final void A(final MainActivity mainActivity, wk8 wk8Var, l46 l46Var, int i2) {
        Object obj;
        final e89 e89Var;
        ?? r15;
        l46Var.h0(-1467931291);
        int i3 = i2 | (l46Var.i(mainActivity) ? 4 : 2) | (l46Var.i(wk8Var) ? 32 : 16);
        final int i4 = 1;
        final int i5 = 0;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            final e89 e89VarJ = jzb.j(wk8Var.b, l46Var);
            e89 e89VarJ2 = jzb.j(wk8Var.c, l46Var);
            FillElement fillElement = b.c;
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, fillElement);
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
            boolean z = ((ru7) e89VarJ.getValue()).e;
            Object obj2 = sf2.a;
            if (z) {
                l46Var.f0(-782159098);
                boolean zBooleanValue = ((Boolean) mainActivity.Y0.getValue()).booleanValue();
                boolean zI = l46Var.i(mainActivity);
                Object objR = l46Var.R();
                if (zI || objR == obj2) {
                    objR = new qj8(mainActivity, i4);
                    l46Var.p0(objR);
                }
                x16 x16Var = (x16) objR;
                boolean zI2 = l46Var.i(mainActivity) | l46Var.g(e89VarJ);
                Object objR2 = l46Var.R();
                if (zI2 || objR2 == obj2) {
                    objR2 = new x16() { // from class: gk8
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i6 = i5;
                            wef wefVar = wef.a;
                            e89 e89Var2 = e89VarJ;
                            MainActivity mainActivity2 = mainActivity;
                            switch (i6) {
                                case 0:
                                    x57.g0(mainActivity2, (ru7) e89Var2.getValue(), true);
                                    break;
                                case 1:
                                    if (!((Boolean) mainActivity2.Y0.getValue()).booleanValue()) {
                                        x57.g0(mainActivity2, (ru7) e89Var2.getValue(), false);
                                    } else {
                                        mainActivity2.finishAndRemoveTask();
                                    }
                                    break;
                                default:
                                    ru7 ru7Var = (ru7) e89Var2.getValue();
                                    ru7Var.getClass();
                                    mainActivity2.w().c.m(null);
                                    vx8 vx8VarB0 = mainActivity2.S0;
                                    if (vx8VarB0 == null) {
                                        vx8VarB0 = x57.b0(ru7Var);
                                    }
                                    mainActivity2.S0 = null;
                                    ynb.V(hwf.a(mainActivity2.w()), null, null, new sj8(mainActivity2, ru7Var, vx8VarB0, null), 3);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var.p0(objR2);
                }
                x16 x16Var2 = (x16) objR2;
                boolean zI3 = l46Var.i(mainActivity) | l46Var.g(e89VarJ);
                Object objR3 = l46Var.R();
                if (zI3 || objR3 == obj2) {
                    objR3 = new x16() { // from class: gk8
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i6 = i4;
                            wef wefVar = wef.a;
                            e89 e89Var2 = e89VarJ;
                            MainActivity mainActivity2 = mainActivity;
                            switch (i6) {
                                case 0:
                                    x57.g0(mainActivity2, (ru7) e89Var2.getValue(), true);
                                    break;
                                case 1:
                                    if (!((Boolean) mainActivity2.Y0.getValue()).booleanValue()) {
                                        x57.g0(mainActivity2, (ru7) e89Var2.getValue(), false);
                                    } else {
                                        mainActivity2.finishAndRemoveTask();
                                    }
                                    break;
                                default:
                                    ru7 ru7Var = (ru7) e89Var2.getValue();
                                    ru7Var.getClass();
                                    mainActivity2.w().c.m(null);
                                    vx8 vx8VarB0 = mainActivity2.S0;
                                    if (vx8VarB0 == null) {
                                        vx8VarB0 = x57.b0(ru7Var);
                                    }
                                    mainActivity2.S0 = null;
                                    ynb.V(hwf.a(mainActivity2.w()), null, null, new sj8(mainActivity2, ru7Var, vx8VarB0, null), 3);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var.p0(objR3);
                }
                y(zBooleanValue, x16Var, x16Var2, (x16) objR3, l46Var, 0);
                l46Var.r(false);
                r15 = 0;
                e89Var = e89VarJ;
                obj = obj2;
            } else {
                l46Var.f0(-781785517);
                obj = obj2;
                e89Var = e89VarJ;
                r15 = 0;
                nae.a(fillElement, null, 0L, 0L, 0.0f, 0.0f, null, an1.w, l46Var, 12582918, 126);
                l46Var.r(false);
            }
            d0e d0eVar = (d0e) e89VarJ2.getValue();
            if (d0eVar == null) {
                l46Var.f0(-781708421);
                l46Var.r(r15);
            } else {
                l46Var.f0(-781708420);
                boolean zI4 = l46Var.i(mainActivity) | l46Var.g(e89Var);
                Object objR4 = l46Var.R();
                if (zI4 || objR4 == obj) {
                    final int i6 = 2;
                    objR4 = new x16() { // from class: gk8
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i7 = i6;
                            wef wefVar = wef.a;
                            e89 e89Var2 = e89Var;
                            MainActivity mainActivity2 = mainActivity;
                            switch (i7) {
                                case 0:
                                    x57.g0(mainActivity2, (ru7) e89Var2.getValue(), true);
                                    break;
                                case 1:
                                    if (!((Boolean) mainActivity2.Y0.getValue()).booleanValue()) {
                                        x57.g0(mainActivity2, (ru7) e89Var2.getValue(), false);
                                    } else {
                                        mainActivity2.finishAndRemoveTask();
                                    }
                                    break;
                                default:
                                    ru7 ru7Var = (ru7) e89Var2.getValue();
                                    ru7Var.getClass();
                                    mainActivity2.w().c.m(null);
                                    vx8 vx8VarB0 = mainActivity2.S0;
                                    if (vx8VarB0 == null) {
                                        vx8VarB0 = x57.b0(ru7Var);
                                    }
                                    mainActivity2.S0 = null;
                                    ynb.V(hwf.a(mainActivity2.w()), null, null, new sj8(mainActivity2, ru7Var, vx8VarB0, null), 3);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var.p0(objR4);
                }
                gcc.b(d0eVar, (x16) objR4, r15, l46Var, r15);
                l46Var.r(r15);
            }
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rk6(mainActivity, wk8Var, i2, 10);
        }
    }

    public static final void B(int i2, boolean z, boolean z2, float f2, x16 x16Var, x16 x16Var2, j09 j09Var, l46 l46Var, int i3) {
        l46 l46Var2 = l46Var;
        y02 y02Var = g21.f;
        l46Var2.h0(-325736490);
        int i4 = i3 | (l46Var2.e(i2) ? 4 : 2) | (l46Var2.h(z) ? 32 : 16) | (l46Var2.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.d(f2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var2.i(x16Var2) ? 131072 : 65536) | (l46Var2.g(j09Var) ? 1048576 : 524288);
        if (l46Var2.W(i4 & 1, (599187 & i4) != 599186)) {
            boolean zB = if9.B(l46Var2);
            x4d x4dVarB = a7c.b(20.0f);
            if (we6.e(l46Var2)) {
                x4dVarB = y02Var;
            }
            j09 j09VarD = b.d(b.c(j09Var, 1.0f), 76.0f);
            float f3 = we6.e(l46Var2) ? 1.0f : 0.5f;
            pr4 pr4Var = l8b.a;
            float f4 = f3;
            long j2 = ((e8b) l46Var2.k(pr4Var)).z;
            long jC = zB ? abg.c(872415231) : y72.e;
            if (!we6.e(l46Var2)) {
                j2 = jC;
            }
            j09 j09VarE = oa7.E(db6.w(j09VarD, f4, j2, x4dVarB), x4dVarB);
            long jC2 = abg.c(zB ? 352321535 : 2063597567);
            if (we6.e(l46Var2)) {
                jC2 = y72.j;
            }
            j09 j09VarA0 = ynb.a0(tm7.o(j09VarE, jC2, y02Var), 16.0f, 12.0f);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarA0);
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
            boolean z3 = (57344 & i4) == 16384;
            Object objR = l46Var2.R();
            if (z3 || objR == sf2.a) {
                objR = new yca(5, x16Var);
                l46Var2.p0(objR);
            }
            g09 g09Var = g09.a;
            bm8.h((x16) objR, b.l(g09Var, 28.0f), false, null, null, af1.b0(499724760, new ci1(z2, 7), l46Var2), l46Var2, 1572912, 60);
            o5c.f(l46Var2, b.p(g09Var, 8.0f));
            a(f2, i2, (i4 & 14) | ((i4 >> 6) & 112), l46Var2, b.d(new jw7(1.0f, true), 24.0f));
            o5c.f(l46Var2, b.p(g09Var, 8.0f));
            String str = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60)}, 2));
            mue mueVar = pue.a;
            nte.b(str, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, yp5.d, 0L, null, null, 0L, 0, false, 0, 0, null, pue.d(l46Var2), l46Var, 0, 0, 130938);
            l46Var2 = l46Var;
            o5c.f(l46Var2, b.p(g09Var, 8.0f));
            bm8.h(x16Var2, b.l(g09Var, 28.0f), false, null, null, z7f.e, l46Var2, ((i4 >> 15) & 14) | 1572912, 60);
            if (z) {
                l46Var2.f0(1337258889);
                o5c.f(l46Var2, b.p(g09Var, 8.0f));
                axa.a(2.0f, 0.0f, 0, 390, 58, 0L, 0L, l46Var, b.l(g09Var, 16.0f));
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                l46Var2.f0(1337380936);
                l46Var2.r(false);
            }
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new yna(i2, z, z2, f2, x16Var, x16Var2, j09Var, i3);
        }
    }

    public static final n0a E(List list) {
        mmb mmbVar = new mmb();
        pu4 pu4Var = pu4.a;
        mmbVar.element = new n0a(pu4Var, pu4Var);
        ArrayList arrayList = new ArrayList();
        Iterator it = new sm8(list).iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) ((m0c) it).b;
            if (!listIterator.hasPrevious()) {
                F(arrayList, mmbVar);
                return (n0a) mmbVar.element;
            }
            n0a n0aVar = (n0a) listIterator.previous();
            if (n0aVar.b.isEmpty()) {
                arrayList.add(n0aVar.a);
            } else {
                F(arrayList, mmbVar);
                mmbVar.element = H(n0aVar, (n0a) mmbVar.element);
            }
        }
    }

    public static final void F(ArrayList arrayList, mmb mmbVar) {
        if (arrayList.isEmpty()) {
            return;
        }
        c78 c78VarW = t72.w();
        Iterator it = new n0c(arrayList).iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) ((m0c) it).b;
            if (!listIterator.hasPrevious()) {
                mmbVar.element = H(new n0a(c78VarW.n(), pu4.a), (n0a) mmbVar.element);
                arrayList.clear();
                return;
            }
            c78VarW.addAll((List) listIterator.previous());
        }
    }

    public static final n0a G(List list, ArrayList arrayList, ArrayList arrayList2, n0a n0aVar) {
        List list2 = n0aVar.a;
        m0a m0aVar = (m0a) s72.x0(list2);
        c78 c78VarW = t72.w();
        c78VarW.addAll(list);
        if (arrayList == null) {
            c78VarW.addAll(list2);
        } else if (m0aVar instanceof fk9) {
            c78VarW.add(new fk9(s72.Q0(arrayList, ((fk9) m0aVar).a)));
            int i2 = 1;
            int size = list2.size() - 1;
            if (1 <= size) {
                while (true) {
                    c78VarW.add(list2.get(i2));
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            c78VarW.add(new fk9(arrayList));
            c78VarW.addAll(list2);
        }
        c78VarW.addAll(arrayList2);
        return new n0a(c78VarW.n(), n0aVar.b);
    }

    public static final n0a H(n0a n0aVar, n0a n0aVar2) {
        List list;
        List listH;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = null;
        for (m0a m0aVar : n0aVar.a) {
            if (m0aVar instanceof fk9) {
                if (arrayList3 != null) {
                    arrayList3.addAll(((fk9) m0aVar).a);
                } else {
                    arrayList3 = new ArrayList(((fk9) m0aVar).a);
                }
            } else if (m0aVar instanceof bbf) {
                arrayList2.add(m0aVar);
            } else {
                if (arrayList3 != null) {
                    arrayList.add(new fk9(arrayList3));
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                    arrayList3 = null;
                }
                arrayList.add(m0aVar);
            }
        }
        List list2 = n0aVar.b;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            n0a n0aVarH = H((n0a) it.next(), n0aVar2);
            if (n0aVarH.a.isEmpty()) {
                listH = n0aVarH.b;
                if (listH.isEmpty()) {
                    listH = t72.H(n0aVarH);
                }
            } else {
                listH = t72.H(n0aVarH);
            }
            x72.g0(arrayList4, listH);
        }
        boolean zIsEmpty = arrayList4.isEmpty();
        List list3 = arrayList4;
        if (zIsEmpty) {
            if (!n0aVar2.a.isEmpty()) {
                return G(arrayList, arrayList3, arrayList2, n0aVar2);
            }
            list = n0aVar2.b;
        }
        if ((arrayList3 != null || arrayList.isEmpty()) && (list3 == null || !list3.isEmpty())) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                if (s72.x0(((n0a) it2.next()).a) instanceof fk9) {
                    ArrayList arrayList5 = new ArrayList(t72.u(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(G(pu4.a, arrayList3, arrayList2, (n0a) it3.next()));
                    }
                    return new n0a(arrayList, arrayList5);
                }
            }
        }
        if (arrayList3 != null) {
            arrayList.add(new fk9(arrayList3));
        }
        arrayList.addAll(arrayList2);
        return new n0a(arrayList, list3);
    }

    public static f36 K(y26 y26Var, boolean z) {
        String lowerCase;
        y26Var.getClass();
        List list = y26Var.y;
        f36 f36Var = new f36(y26Var, null, 1, z);
        nw7 nw7VarI0 = y26Var.i0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((c8f) obj).x() != dsf.IN_VARIANCE) {
                break;
            }
            arrayList.add(obj);
        }
        sd0 sd0VarQ1 = s72.q1(arrayList);
        ArrayList arrayList2 = new ArrayList(t72.u(sd0VarQ1, 10));
        Iterator it = sd0VarQ1.iterator();
        while (true) {
            iq4 iq4Var = (iq4) it;
            if (!iq4Var.b.hasNext()) {
                tjd tjdVarS = ((c8f) s72.F0(list)).S();
                e09 e09Var = e09.e;
                rz3 rz3Var = sz3.e;
                pu4 pu4Var = pu4.a;
                f36Var.I0(null, nw7VarI0, pu4Var, pu4Var, arrayList2, tjdVarS, e09Var, rz3Var);
                f36 f36Var2 = f36Var;
                f36Var2.M0 = true;
                return f36Var2;
            }
            n17 n17Var = (n17) iq4Var.next();
            int i2 = n17Var.a;
            c8f c8fVar = (c8f) n17Var.b;
            String strB = c8fVar.getName().b();
            strB.getClass();
            if (strB.equals("T")) {
                lowerCase = "instance";
            } else if (strB.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            f36 f36Var3 = f36Var;
            g10 g10Var = hj6.c;
            t99 t99VarE = t99.e(lowerCase);
            tjd tjdVarS2 = c8fVar.S();
            tjdVarS2.getClass();
            arrayList2.add(new xrf(f36Var3, null, i2, g10Var, t99VarE, tjdVarS2, false, false, false, null, ntd.T));
            f36Var = f36Var3;
        }
    }

    public static final yn7 M(yn7 yn7Var, yn7 yn7Var2) {
        yn7 yn7Var3 = (yn7) fyc.w(fyc.u(tj7.z, yn7Var));
        List listA = yn7Var3.A();
        if (listA.isEmpty()) {
            return yn7Var3;
        }
        qk6 qk6Var = qk6.R0;
        k7f k7fVarG = qk6Var.G((j2) yn7Var3);
        int iT = qk6Var.T(k7fVarG);
        ArrayList<ao7> arrayList = new ArrayList(iT);
        for (int i2 = 0; i2 < iT; i2++) {
            arrayList.add((ao7) qk6Var.b0(k7fVarG, i2));
        }
        if (arrayList.size() != listA.size()) {
            StringBuilder sb = new StringBuilder("Error inside type '");
            sb.append(yn7Var2);
            sb.append("'. '");
            sb.append(yn7Var3);
            int size = arrayList.size();
            int size2 = listA.size();
            sb.append("' params (");
            sb.append(size);
            sb.append(") vs args (");
            sb.append(size2);
            sb.append(") mismatch.");
            throw new IllegalStateException(sb.toString().toString());
        }
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        for (ao7 ao7Var : arrayList) {
            yn7 yn7Var4 = (yn7) s72.x0(ao7Var.getUpperBounds());
            if (yn7Var4 == null) {
                yg5.s("Error inside type '", yn7Var2, "'. Parameter '", ao7Var, "' has no upper bounds. There must always be at least the default 'Any?' upper bound");
                return null;
            }
            yn7 yn7VarM = M(yn7Var4, yn7Var2);
            do7 do7Var = do7.c;
            arrayList2.add(db6.b0(yn7VarM));
        }
        um7 um7VarB = yn7Var3.B();
        if (um7VarB == null) {
            yg5.s("Error inside type '", yn7Var2, "'. The current type '", yn7Var3, "' is not denotable");
            return null;
        }
        j2 j2VarX = qn4.x(um7VarB, arrayList2, yn7Var3.o(), 4);
        int size3 = arrayList.size();
        ArrayList arrayList3 = new ArrayList(size3);
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList3.add(do7.c);
        }
        return t4c.q(j2VarX, qn4.x(um7VarB, arrayList3, yn7Var3.o(), 4), true);
    }

    public static th N(int i2) {
        Object next;
        Iterator it = th.b.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((th) next).a == i2) {
                return (th) next;
            }
        }
        next = null;
        return (th) next;
    }

    public static final q69 P(bxc bxcVar, a26 a26Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            ywc ywcVarA = bxcVar.a();
            LayoutNode layoutNode = ywcVarA.c;
            if (layoutNode.X() && layoutNode.W()) {
                hkb hkbVarG = ywcVarA.g();
                q69 q69Var = new q69(48);
                fnb fnbVar = new fnb(1);
                fnbVar.b(n16.U(hkbVarG));
                S(a26Var, q69Var, new fnb(1), fnbVar, ywcVarA, ywcVarA);
                return q69Var;
            }
            q69 q69Var2 = v67.a;
            q69Var2.getClass();
            return q69Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void Q(a26 a26Var, q69 q69Var, fnb fnbVar, fnb fnbVar2, ywc ywcVar, ywc ywcVar2) {
        fnb fnbVar3 = fnbVar;
        Region region = (Region) fnbVar3.a;
        fnb fnbVar4 = fnbVar2;
        Region region2 = (Region) fnbVar4.a;
        LayoutNode layoutNode = ywcVar2.c;
        LayoutNode layoutNode2 = ywcVar2.c;
        if (!layoutNode.X() || !layoutNode2.W() || region2.isEmpty()) {
            if (ywcVar2.n()) {
                R(q69Var, ywcVar, ywcVar2);
                return;
            }
            return;
        }
        hkb hkbVarM = ywcVar2.m();
        if (hkbVarM.h()) {
            Object objF = ywcVar2.f();
            if (objF == null) {
                c47 c47Var = (c47) layoutNode2.V0.d;
                hkbVarM = vd0.S(c47Var).M(c47Var, false);
            } else {
                i09 i09Var = ((i09) objF).a;
                Object objG = ywcVar2.d.a.g(swc.b);
                if (objG == null) {
                    objG = null;
                }
                hkbVarM = scc.i(i09Var, objG != null, false);
            }
        }
        a77 a77VarU = n16.U(hkbVarM);
        fnbVar3.b(a77VarU);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i2 = ywcVar2.f;
            if (i2 == ywcVar.f) {
                i2 = -1;
            }
            Rect bounds = region.getBounds();
            q69Var.i(i2, new axc(ywcVar2, new a77(bounds.left, bounds.top, bounds.right, bounds.bottom)));
            List listI = ywcVar2.i((4 & 1) != 0 ? !ywcVar2.b : false, (4 & 2) == 0);
            int size = listI.size() - 1;
            while (-1 < size) {
                if (!((Boolean) a26Var.d(listI.get(size))).booleanValue()) {
                    Q(a26Var, q69Var, fnbVar3, fnbVar4, ywcVar, (ywc) listI.get(size));
                }
                size--;
                fnbVar3 = fnbVar;
                fnbVar4 = fnbVar2;
            }
            if (Y(ywcVar2)) {
                region2.op(a77VarU.a, a77VarU.b, a77VarU.c, a77VarU.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void R(q69 q69Var, ywc ywcVar, ywc ywcVar2) {
        LayoutNode layoutNode;
        ywc ywcVarL = ywcVar2.l();
        hkb hkbVarG = (ywcVarL == null || (layoutNode = ywcVarL.c) == null || !layoutNode.X()) ? o : ywcVarL.g();
        int i2 = ywcVar2.f;
        if (i2 == ywcVar.f) {
            i2 = -1;
        }
        q69Var.i(i2, new axc(ywcVar2, n16.U(hkbVarG)));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x015e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0169  */
    /* JADX WARN: Code duplicated, block: B:82:0x0179  */
    /* JADX WARN: Code duplicated, block: B:83:0x017e  */
    public static final void S(a26 a26Var, q69 q69Var, fnb fnbVar, fnb fnbVar2, ywc ywcVar, ywc ywcVar2) {
        int size;
        boolean z;
        hkb hkbVarI;
        a26 a26Var2 = a26Var;
        q69 q69Var2 = q69Var;
        int i2 = ywcVar.f;
        Region region = (Region) fnbVar.a;
        fnb fnbVar3 = fnbVar2;
        Region region2 = (Region) fnbVar3.a;
        LayoutNode layoutNode = ywcVar2.c;
        twc twcVar = ywcVar2.d;
        LayoutNode layoutNode2 = ywcVar2.c;
        int i3 = ywcVar2.f;
        boolean z2 = (layoutNode.X() && layoutNode2.W()) ? false : true;
        if (!region2.isEmpty() || i3 == i2) {
            if (!z2 || ywcVar2.n()) {
                a77 a77VarU = n16.U(ywcVar2.m());
                fnbVar.b(a77VarU);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (ywcVar2.n()) {
                        R(q69Var2, ywcVar, ywcVar2);
                        return;
                    } else {
                        if (i3 == -1) {
                            Rect bounds = region.getBounds();
                            q69Var2.i(i3, new axc(ywcVar2, new a77(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                q69Var2.i(i3, new axc(ywcVar2, new a77(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listI = ywcVar2.i((4 & 1) != 0 ? !ywcVar2.b : false, (4 & 2) == 0);
                if (twcVar.c) {
                    ywc ywcVarL = ywcVar2.l();
                    while (true) {
                        if (ywcVarL == null) {
                            ywcVarL = null;
                            break;
                        }
                        w79 w79Var = ywcVarL.d.a;
                        if (w79Var.c(cxc.w) || w79Var.c(cxc.v)) {
                            break;
                        } else {
                            ywcVarL = ywcVarL.l();
                        }
                    }
                    if (ywcVarL == null) {
                        z = false;
                    } else {
                        yf9 yf9VarD = ywcVar2.d();
                        if (yf9VarD == null) {
                            yf9VarD = null;
                        } else {
                            if (!yf9VarD.h1().Y) {
                                yf9VarD = null;
                            }
                            if (yf9VarD == null) {
                                yf9VarD = null;
                            }
                        }
                        yf9 yf9VarD2 = ywcVarL.d();
                        if (yf9VarD2 == null) {
                            yf9VarD2 = null;
                        } else {
                            if (!yf9VarD2.h1().Y) {
                                yf9VarD2 = null;
                            }
                            if (yf9VarD2 == null) {
                                yf9VarD2 = null;
                            }
                        }
                        if (yf9VarD == null || yf9VarD2 == null) {
                            z = false;
                        } else {
                            hkb hkbVarM = yf9VarD2.M(yf9VarD, false);
                            z = !hkbVarM.equals(hkbVarM.g(z5c.g(0L, db6.Y0(yf9VarD2.c))));
                        }
                    }
                    if (z) {
                        fnb fnbVar4 = new fnb(1);
                        Object objF = ywcVar2.f();
                        if (objF == null) {
                            c47 c47Var = (c47) layoutNode2.V0.d;
                            hkbVarI = vd0.S(c47Var).M(c47Var, false);
                        } else {
                            i09 i09Var = ((i09) objF).a;
                            Object objG = twcVar.a.g(swc.b);
                            hkbVarI = scc.i(i09Var, (objG == null ? null : objG) != null, false);
                        }
                        fnbVar4.b(n16.U(hkbVarI));
                        int size2 = listI.size() - 1;
                        while (-1 < size2) {
                            if (!((Boolean) a26Var2.d(listI.get(size2))).booleanValue()) {
                                Q(a26Var2, q69Var2, new fnb(1), fnbVar4, ywcVar, (ywc) listI.get(size2));
                            }
                            size2--;
                            q69Var2 = q69Var;
                        }
                    } else {
                        size = listI.size() - 1;
                        while (-1 < size) {
                            if (((Boolean) a26Var2.d(listI.get(size))).booleanValue()) {
                                S(a26Var2, q69Var, fnbVar, fnbVar3, ywcVar, (ywc) listI.get(size));
                            }
                            size--;
                            a26Var2 = a26Var;
                            fnbVar3 = fnbVar2;
                        }
                    }
                } else {
                    size = listI.size() - 1;
                    while (-1 < size) {
                        if (((Boolean) a26Var2.d(listI.get(size))).booleanValue()) {
                            S(a26Var2, q69Var, fnbVar, fnbVar3, ywcVar, (ywc) listI.get(size));
                        }
                        size--;
                        a26Var2 = a26Var;
                        fnbVar3 = fnbVar2;
                    }
                }
                if (Y(ywcVar2)) {
                    region2.op(a77VarU.a, a77VarU.b, a77VarU.c, a77VarU.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static Drawable T(Context context, int i2) {
        return cyb.c().d(context, i2);
    }

    public static final void V(Context context, Class cls, iy9[] iy9VarArr) throws Exception {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) cls);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (iy9VarArr.length != 0) {
            for (iy9 iy9Var : iy9VarArr) {
                Object objE = iy9Var.e();
                if (objE == null) {
                    intent.putExtra((String) iy9Var.d(), (Serializable) null);
                } else if (objE instanceof Integer) {
                    intent.putExtra((String) iy9Var.d(), ((Number) objE).intValue());
                } else if (objE instanceof Long) {
                    intent.putExtra((String) iy9Var.d(), ((Number) objE).longValue());
                } else if (objE instanceof CharSequence) {
                    intent.putExtra((String) iy9Var.d(), (CharSequence) objE);
                } else if (objE instanceof String) {
                    intent.putExtra((String) iy9Var.d(), (String) objE);
                } else if (objE instanceof Float) {
                    intent.putExtra((String) iy9Var.d(), ((Number) objE).floatValue());
                } else if (objE instanceof Double) {
                    intent.putExtra((String) iy9Var.d(), ((Number) objE).doubleValue());
                } else if (objE instanceof Character) {
                    intent.putExtra((String) iy9Var.d(), ((Character) objE).charValue());
                } else if (objE instanceof Short) {
                    intent.putExtra((String) iy9Var.d(), ((Number) objE).shortValue());
                } else if (objE instanceof Boolean) {
                    intent.putExtra((String) iy9Var.d(), ((Boolean) objE).booleanValue());
                } else if (objE instanceof Serializable) {
                    intent.putExtra((String) iy9Var.d(), (Serializable) objE);
                } else if (objE instanceof Bundle) {
                    intent.putExtra((String) iy9Var.d(), (Bundle) objE);
                } else if (objE instanceof Parcelable) {
                    intent.putExtra((String) iy9Var.d(), (Parcelable) objE);
                } else if (objE instanceof Object[]) {
                    Object[] objArr = (Object[]) objE;
                    if (objArr instanceof CharSequence[]) {
                        intent.putExtra((String) iy9Var.d(), (Serializable) objE);
                    } else if (objArr instanceof String[]) {
                        intent.putExtra((String) iy9Var.d(), (Serializable) objE);
                    } else {
                        if (!(objArr instanceof Parcelable[])) {
                            throw new Exception("Intent extra " + iy9Var.d() + " has wrong type " + objE.getClass().getName());
                        }
                        intent.putExtra((String) iy9Var.d(), (Serializable) objE);
                    }
                } else if (objE instanceof int[]) {
                    intent.putExtra((String) iy9Var.d(), (int[]) objE);
                } else if (objE instanceof long[]) {
                    intent.putExtra((String) iy9Var.d(), (long[]) objE);
                } else if (objE instanceof float[]) {
                    intent.putExtra((String) iy9Var.d(), (float[]) objE);
                } else if (objE instanceof double[]) {
                    intent.putExtra((String) iy9Var.d(), (double[]) objE);
                } else if (objE instanceof char[]) {
                    intent.putExtra((String) iy9Var.d(), (char[]) objE);
                } else if (objE instanceof short[]) {
                    intent.putExtra((String) iy9Var.d(), (short[]) objE);
                } else {
                    if (!(objE instanceof boolean[])) {
                        throw new Exception("Intent extra " + iy9Var.d() + " has wrong type " + objE.getClass().getName());
                    }
                    intent.putExtra((String) iy9Var.d(), (boolean[]) objE);
                }
            }
        }
        context.startActivity(intent);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object W(twe tweVar, n26 n26Var, Throwable th, zn2 zn2Var) {
        qk5 qk5Var;
        if (zn2Var instanceof qk5) {
            qk5Var = (qk5) zn2Var;
            int i2 = qk5Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qk5Var.label = i2 - Integer.MIN_VALUE;
            } else {
                qk5Var = new qk5(zn2Var);
            }
        } else {
            qk5Var = new qk5(zn2Var);
        }
        Object obj = qk5Var.result;
        int i3 = qk5Var.label;
        try {
            if (i3 == 0) {
                jzb.q(obj);
                qk5Var.L$0 = null;
                qk5Var.L$1 = null;
                qk5Var.L$2 = th;
                qk5Var.label = 1;
                Object objM = n26Var.m(tweVar, th, qk5Var);
                Object obj2 = bw2.a;
                if (objM == obj2) {
                    return obj2;
                }
            } else {
                if (i3 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) qk5Var.L$2;
                jzb.q(obj);
            }
            return wef.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                bzd.m(th2, th);
            }
            throw th2;
        }
    }

    public static final boolean X(ywc ywcVar) {
        yf9 yf9VarD = ywcVar.d();
        w79 w79Var = ywcVar.d.a;
        return (yf9VarD != null ? yf9VarD.q1() : false) || w79Var.c(cxc.q) || w79Var.c(cxc.p);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[LOOP:0: B:11:0x001d->B:24:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x005c A[SYNTHETIC] */
    public static final boolean Y(ywc ywcVar) {
        if (!X(ywcVar)) {
            twc twcVar = ywcVar.d;
            if (twcVar.c) {
                return true;
            }
            w79 w79Var = twcVar.a;
            Object[] objArr = w79Var.b;
            Object[] objArr2 = w79Var.c;
            long[] jArr = w79Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((gxc) obj).c) {
                                    return true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 == 8) {
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    } else if (i2 != length) {
                        i2++;
                    }
                }
            }
        }
        return false;
    }

    public static synchronized boolean Z(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = a;
        if (context2 != null && (bool = b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        b = boolValueOf;
        a = applicationContext;
        return boolValueOf.booleanValue();
    }

    public static final void a(final float f2, final int i2, final int i3, l46 l46Var, final j09 j09Var) {
        int i4;
        long j2;
        l46Var.h0(-1149419574);
        if ((i3 & 6) == 0) {
            i4 = (l46Var.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var.d(f2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i5 = 0;
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            boolean z = f2 > 0.0f;
            long jL = l8b.l(l46Var);
            long jE = l8b.e(l46Var);
            if (!we6.e(l46Var)) {
                jL = jE;
            }
            long jC = l8b.c(l46Var);
            long jA = l8b.a(l46Var);
            if (!we6.e(l46Var)) {
                jC = jA;
            }
            long jM = l8b.m(l46Var);
            long jC2 = l8b.c(l46Var);
            if (!we6.e(l46Var)) {
                jM = jC2;
            }
            y6c y6cVarB = a7c.b(1.0f);
            boolean z2 = (i4 & 14) == 4;
            Object objR = l46Var.R();
            if (z2 || objR == sf2.a) {
                objR = sfc.k(i2);
                l46Var.p0(objR);
            }
            List list = (List) objR;
            int i6 = (int) (30.0f * f2);
            boolean z3 = z;
            long j3 = jL;
            t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(i5)), ndb.z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, t7cVarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            Iterator itS = kv2.s(l46Var, j09VarJ, hj6.x, -705759052, list);
            int i7 = 0;
            while (itS.hasNext()) {
                Object next = itS.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    t72.Z();
                    throw null;
                }
                float fFloatValue = (((Number) next).floatValue() * 18.0f) + 6.0f;
                if (z3) {
                    j2 = i7 < i6 ? jC : jM;
                } else {
                    j2 = j3;
                }
                s21.a(tm7.o(b.d(b.p(g09.a, 2.0f), fFloatValue), j2, y6cVarB), l46Var, 0);
                i7 = i8;
                i6 = i6;
            }
            l46Var.r(false);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: zna
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(i3 | 1);
                    x57.a(f2, i2, iP, (l46) obj, j09Var);
                    return wef.a;
                }
            };
        }
    }

    public static final void a0(hn7 hn7Var) {
        oi5.q.getClass();
        mx4 mx4Var = zq8.b;
        ArrayList arrayList = new ArrayList(t72.u(mx4Var, 10));
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            arrayList.add(((zq8) l2Var.next()).a());
        }
    }

    public static final q11 b(long j2, float f2) {
        return new q11(f2, new dtd(j2));
    }

    public static vx8 b0(ru7 ru7Var) {
        boolean z = ru7Var.c && ru7Var.b;
        ru7Var.getClass();
        return new vx8(ru7Var.a > 0, z);
    }

    public static final void c(x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        x16 x16Var3 = x16Var2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(2117785951);
        int i3 = i2 | (l46Var2.i(x16Var) ? 4 : 2) | (l46Var2.i(x16Var3) ? 32 : 16);
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            c8b.i(b.c(g09Var, 1.0f), afc.q(R.string.main_privacy_agree, l46Var2), null, null, 0L, 0.0f, false, null, null, false, null, null, x16Var, l46Var2, 6, (i3 << 6) & 896, 4092);
            x16Var3 = x16Var2;
            cgg.m(x16Var3, null, false, null, null, null, an1.y, l46Var, ((i3 >> 3) & 14) | 805306368, 510);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i2, 13, x16Var, x16Var3);
        }
    }

    public static final szc c0(hn7 hn7Var) {
        mi5 mi5Var = oi5.e;
        mi5Var.getClass();
        mx4 mx4Var = d09.f;
        ArrayList arrayList = new ArrayList(t72.u(mx4Var, 10));
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            arrayList.add(((d09) l2Var.next()).a());
        }
        return new szc(hn7Var, mi5Var, mx4Var, arrayList);
    }

    public static final void d(x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        int i3;
        e89 e89Var;
        x16 x16Var3 = x16Var;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1148374838);
        int i4 = i2 | (l46Var2.i(x16Var3) ? 4 : 2) | (l46Var2.i(x16Var2) ? 32 : 16);
        int i5 = 0;
        if (l46Var2.W(i4 & 1, (i4 & 19) != 18)) {
            Object[] objArr = new Object[0];
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new fk8(i5);
                l46Var2.p0(objR);
            }
            e89 e89Var2 = (e89) vfh.I(objArr, (x16) objR, l46Var2, 48);
            Object objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var2.p0(objR2);
            }
            e89 e89Var3 = (e89) objR2;
            int iZ = abg.Z(((m82) l46Var2.k(o82.a)).q);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            j09 j09VarC = b.c(g09Var, 1.0f);
            kx0 kx0Var = ndb.z;
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(i5)), kx0Var, l46Var2, 54);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarC);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, t7cVarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            boolean zBooleanValue = ((Boolean) e89Var2.getValue()).booleanValue();
            boolean zG = l46Var2.g(e89Var2);
            Object objR3 = l46Var2.R();
            if (zG || objR3 == i8cVar) {
                objR3 = new w77(e89Var2, 1);
                l46Var2.p0(objR3);
            }
            qk2.i(zBooleanValue, null, false, 0.0f, null, (a26) objR3, l46Var2, 0, 30);
            Object objR4 = l46Var2.R();
            if (objR4 == i8cVar) {
                objR4 = new nd8(7);
                l46Var2.p0(objR4);
            }
            a26 a26Var = (a26) objR4;
            boolean zE = l46Var2.e(iZ);
            Object objR5 = l46Var2.R();
            if (zE || objR5 == i8cVar) {
                objR5 = new xp(iZ, 14);
                l46Var2.p0(objR5);
            }
            xo1.c(a26Var, null, (a26) objR5, l46Var2, 6, 2);
            ib8.t(l46Var2, true, g09Var, 24.0f, l46Var2);
            j09 j09VarC2 = b.c(g09Var, 1.0f);
            t7c t7cVarA2 = s7c.a(xc0.a, kx0Var, l46Var2, 48);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ3 = m93.J(l46Var2, j09VarC2);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, t7cVarA2);
            dec.l(he2Var2, l46Var2, u8aVarM3);
            ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ3);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            cgg.m(x16Var2, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, null, null, null, an1.z, l46Var2, ((i4 >> 3) & 14) | 805306368, 508);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            jw7 jw7Var = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            String strQ = afc.q(R.string.main_privacy_agree, l46Var2);
            int i6 = i4 & 14;
            boolean zG2 = l46Var2.g(e89Var2) | (i6 == 4);
            Object objR6 = l46Var2.R();
            if (zG2 || objR6 == i8cVar) {
                i3 = 2;
                objR6 = new ki3(x16Var3, e89Var2, e89Var3, i3);
                l46Var2.p0(objR6);
            } else {
                i3 = 2;
            }
            boolean z2 = true;
            c8b.i(jw7Var, strQ, null, null, 0L, 0.0f, false, null, null, false, null, null, (x16) objR6, l46Var, 0, 0, 4092);
            l46Var2 = l46Var;
            l46Var2.r(true);
            l46Var2.r(true);
            if (((Boolean) e89Var3.getValue()).booleanValue()) {
                l46Var2.f0(-1818824225);
                String strQ2 = afc.q(R.string.main_privacy_dialog_title, l46Var2);
                dd2 dd2VarB0 = af1.b0(1769917312, new os1(iZ, 6), l46Var2);
                String strQ3 = afc.q(R.string.main_privacy_agree, l46Var2);
                String strQ4 = afc.q(R.string.main_privacy_not_send, l46Var2);
                Object objR7 = l46Var2.R();
                if (objR7 == i8cVar) {
                    e89Var = e89Var3;
                    objR7 = new x08(e89Var, 2);
                    l46Var2.p0(objR7);
                } else {
                    e89Var = e89Var3;
                }
                x16 x16Var4 = (x16) objR7;
                boolean zG3 = l46Var2.g(e89Var2);
                if (i6 != 4) {
                    z2 = false;
                }
                boolean z3 = z2 | zG3;
                Object objR8 = l46Var2.R();
                if (z3 || objR8 == i8cVar) {
                    objR8 = new ki3(x16Var, e89Var, e89Var2, 3);
                    l46Var2.p0(objR8);
                }
                x16Var3 = x16Var;
                kj0.F(strQ2, dd2VarB0, strQ3, strQ4, false, false, null, null, x16Var4, (x16) objR8, l46Var, 100663344, 240);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                x16Var3 = x16Var;
                l46Var2.f0(-1818154408);
                l46Var2.r(false);
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i2, 14, x16Var3, x16Var2);
        }
    }

    public static final void d0(hn7 hn7Var, ni5 ni5Var) {
        mx4 mx4Var = zzb.b;
        ArrayList arrayList = new ArrayList(t72.u(mx4Var, 10));
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            arrayList.add(new ji5(ni5Var, ((zzb) l2Var.next()).ordinal()));
        }
    }

    public static final void e(wae waeVar, j09 j09Var, wy6 wy6Var, yi yiVar, bn2 bn2Var, l46 l46Var, int i2) {
        int i3;
        int i4;
        wy6 wy6Var2;
        bn2 bn2Var2;
        yi yiVar2;
        yi yiVar3;
        bn2 bn2Var3;
        wy6 wy6Var3;
        l46Var.h0(-1071821681);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(waeVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i5 = i3 | 224256;
        if ((74899 & i5) == 74898 && l46Var.F()) {
            l46Var.Z();
            wy6Var3 = wy6Var;
            yiVar3 = yiVar;
            bn2Var3 = bn2Var;
        } else {
            l46Var.b0();
            if ((i2 & 1) == 0 || l46Var.C()) {
                wy6 wy6VarB = pa7.t(waeVar.d.b().n(), "androidx.camera.camera2.legacy") ? wy6.EMBEDDED : ndc.b();
                i4 = i5 & (-897);
                lx0 lx0Var = ndb.f;
                wy6Var2 = wy6VarB;
                bn2Var2 = an2.a;
                yiVar2 = lx0Var;
            } else {
                l46Var.Z();
                i4 = i5 & (-897);
                wy6Var2 = wy6Var;
                yiVar2 = yiVar;
                bn2Var2 = bn2Var;
            }
            l46Var.s();
            e89 e89VarI = q1c.i(wy6Var2, l46Var);
            boolean zI = l46Var.i(waeVar) | l46Var.g(e89VarI);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zI || objR == obj) {
                objR = new el1(waeVar, e89VarI, null);
                l46Var.p0(objR);
            }
            l26 l26Var = (l26) objR;
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = q1c.f(null);
                l46Var.p0(objR2);
            }
            e89 e89Var = (e89) objR2;
            boolean zI2 = l46Var.i(l26Var);
            Object objR3 = l46Var.R();
            if (zI2 || objR3 == obj) {
                objR3 = new bsd(l26Var, e89Var, null);
                l46Var.p0(objR3);
            }
            af1.o((l26) objR3, l46Var, waeVar);
            axf axfVar = (axf) e89Var.getValue();
            final int i6 = 0;
            if (axfVar == null) {
                l46Var.f0(-1848994217);
                l46Var.r(false);
            } else {
                l46Var.f0(-1848994216);
                e89 e89VarI2 = q1c.i(axfVar, l46Var);
                boolean zG = l46Var.g(e89VarI2);
                Object objR4 = l46Var.R();
                if (zG || objR4 == obj) {
                    objR4 = new bl1(e89VarI2, null);
                    l46Var.p0(objR4);
                }
                final xae xaeVar = (xae) uyb.x((l26) objR4, l46Var, null).getValue();
                if (xaeVar == null) {
                    l46Var.f0(1261255935);
                    l46Var.r(false);
                } else {
                    l46Var.f0(1261255936);
                    boolean zG2 = l46Var.g(xaeVar);
                    Object objR5 = l46Var.R();
                    if (zG2 || objR5 == obj) {
                        objR5 = new a26() { // from class: vk1
                            @Override // defpackage.a26
                            public final Object d(Object obj2) {
                                int i7 = i6;
                                xae xaeVar2 = xaeVar;
                                switch (i7) {
                                    case 0:
                                        return new lf(9, xaeVar2);
                                    default:
                                        ((jxf) obj2).b = new yk1(xaeVar2, null);
                                        return wef.a;
                                }
                            }
                        };
                        l46Var.p0(objR5);
                    }
                    af1.g(xaeVar, (a26) objR5, l46Var);
                    int i7 = i4;
                    pxf pxfVar = xaeVar.a;
                    t2f t2fVar = axfVar.c;
                    j09 j09VarD = j09Var.D(b.c);
                    boolean zG3 = l46Var.g(xaeVar);
                    Object objR6 = l46Var.R();
                    if (zG3 || objR6 == obj) {
                        final int i8 = 1;
                        objR6 = new a26() { // from class: vk1
                            @Override // defpackage.a26
                            public final Object d(Object obj2) {
                                int i9 = i8;
                                xae xaeVar2 = xaeVar;
                                switch (i9) {
                                    case 0:
                                        return new lf(9, xaeVar2);
                                    default:
                                        ((jxf) obj2).b = new yk1(xaeVar2, null);
                                        return wef.a;
                                }
                            }
                        };
                        l46Var.p0(objR6);
                    }
                    eec.m(pxfVar, j09VarD, t2fVar, yiVar2, bn2Var2, (a26) objR6, l46Var, i7 & 523264);
                    l46Var.r(false);
                }
                l46Var.r(false);
            }
            yiVar3 = yiVar2;
            bn2Var3 = bn2Var2;
            wy6Var3 = wy6Var2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new yb(waeVar, j09Var, wy6Var3, yiVar3, bn2Var3, i2, 1);
        }
    }

    public static final void f(k00 k00Var, j09 j09Var, mue mueVar, boolean z, int i2, int i3, a26 a26Var, a26 a26Var2, l46 l46Var, int i4) {
        j09 j09Var2;
        boolean z2;
        int i5;
        int i6;
        a26 a26Var3;
        l46Var.h0(-246609449);
        int i7 = 4;
        int i8 = i4 | (l46Var.g(k00Var) ? 4 : 2) | 48 | (l46Var.g(mueVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | 1797120 | (l46Var.i(a26Var2) ? 8388608 : 4194304);
        int i9 = 0;
        if (l46Var.W(i8 & 1, (4793491 & i8) != 4793490)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new cz1(i7);
                l46Var.p0(objR);
            }
            a26 a26Var4 = (a26) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = q1c.f(null);
                l46Var.p0(objR2);
            }
            e89 e89Var = (e89) objR2;
            boolean z3 = (29360128 & i8) == 8388608;
            Object objR3 = l46Var.R();
            if (z3 || objR3 == i8cVar) {
                objR3 = new u42(i9, e89Var, a26Var2);
                l46Var.p0(objR3);
            }
            g09 g09Var = g09.a;
            j09 j09VarA = ibe.a(g09Var, a26Var2, (PointerInputEventHandler) objR3);
            Object objR4 = l46Var.R();
            if (objR4 == i8cVar) {
                objR4 = new yx1(e89Var, a26Var4, 3);
                l46Var.p0(objR4);
            }
            vd0.d(k00Var, j09VarA, mueVar, (a26) objR4, 1, true, Integer.MAX_VALUE, 0, null, null, l46Var, (i8 & 58254) | 1769472, 0, 1920);
            a26Var3 = a26Var4;
            j09Var2 = g09Var;
            i5 = 1;
            z2 = true;
            i6 = Integer.MAX_VALUE;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            z2 = z;
            i5 = i2;
            i6 = i3;
            a26Var3 = a26Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new t42(k00Var, j09Var2, mueVar, z2, i5, i6, a26Var3, a26Var2, i4);
        }
    }

    public static final void f0(TextView textView) {
        SpannableString spannableString = new SpannableString(textView.getText());
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                String url = uRLSpan.getURL();
                url.getClass();
                spannableString.setSpan(new ik8(url), spanStart, spanEnd, 0);
            }
        }
        textView.setText(spannableString);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13971. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void g(defpackage.tr2 r42, defpackage.gd4 r43, java.lang.String r44, defpackage.a26 r45, defpackage.x16 r46, defpackage.l46 r47, int r48, int r49) {
        /*
            Method dump skipped, instruction units count: 1397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x57.g(tr2, gd4, java.lang.String, a26, x16, l46, int, int):void");
    }

    public static final void g0(MainActivity mainActivity, ru7 ru7Var, boolean z) {
        Object value;
        wk8 wk8VarW = mainActivity.w();
        wk8VarW.getClass();
        hs3 hs3Var = xqa.o;
        Boolean boolValueOf = Boolean.valueOf(z);
        ynb.V(lw2.a, null, null, new uk8(hs3Var.a, boolValueOf, null), 3);
        s0e s0eVar = wk8VarW.b;
        do {
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, ru7.a((ru7) value, 0, z, 11)));
        ynb.V(hwf.a(mainActivity.w()), null, null, new jk8(mainActivity, ru7Var, z, null), 3);
    }

    public static final void h(int i2, x16 x16Var, l46 l46Var, j09 j09Var, boolean z) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1924126966);
        int i3 = i2 | (l46Var2.h(z) ? 4 : 2) | (l46Var.g(j09Var) ? 32 : 16) | (l46Var2.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            int i4 = ((Configuration) l46Var2.k(uq.a)).screenHeightDp;
            g09 g09Var = g09.a;
            if (i4 > 480) {
                ib8.r(50.0f, -580223157, l46Var2, l46Var2, g09Var);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-580170302);
                l46Var2.r(false);
            }
            feg.j(od4.A(R.drawable.main_privacy, 0, l46Var2), null, b.l(g09Var, 44.0f), null, null, 0.0f, null, l46Var, 440, 120);
            nte.b(afc.q(R.string.main_privacy_title, l46Var), ynb.b0(0.0f, 24.0f, g09Var, 1), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(r9f.a)).g, l46Var, 48, 0, 131068);
            l46Var2 = l46Var;
            int i5 = 6;
            if (z) {
                l46Var2.f0(-579816654);
                int iZ = abg.Z(((m82) l46Var2.k(o82.a)).q);
                Object objR = l46Var2.R();
                i8c i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = new nd8(i5);
                    l46Var2.p0(objR);
                }
                a26 a26Var = (a26) objR;
                boolean zE = l46Var2.e(iZ);
                Object objR2 = l46Var2.R();
                if (zE || objR2 == i8cVar) {
                    objR2 = new xp(iZ, 13);
                    l46Var2.p0(objR2);
                }
                xo1.c(a26Var, null, (a26) objR2, l46Var2, 6, 2);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-579420071);
                nte.b(afc.q(R.string.main_privacy_content, l46Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262142);
                cgg.m(x16Var, null, false, null, null, null, an1.x, l46Var, ((i3 >> 6) & 14) | 805306368, 510);
                l46Var2 = l46Var;
                l46Var2.r(false);
            }
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ii3(z, j09Var, x16Var, i2);
        }
    }

    public static final szc h0(hn7 hn7Var) {
        mi5 mi5Var = oi5.d;
        mi5Var.getClass();
        mx4 mx4Var = pyf.e;
        ArrayList arrayList = new ArrayList(t72.u(mx4Var, 10));
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            arrayList.add(((pyf) l2Var.next()).a());
        }
        return new szc(hn7Var, mi5Var, mx4Var, arrayList);
    }

    public static final void i(int i2, x16 x16Var, x16 x16Var2, l46 l46Var, j09 j09Var) {
        j09 j09Var2;
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        l46Var2.h0(1074538993);
        int i3 = i2 | (l46Var.g(j09Var) ? 4 : 2) | (l46Var2.i(x16Var) ? 32 : 16) | (l46Var2.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            j09Var2 = j09Var;
            j09 j09VarC = b.c(j09Var2, 1.0f);
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(i4)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            s(null, R.drawable.ic_talk_more, afc.q(R.string.button_talk_more, l46Var2), false, x16Var, l46Var, (i3 << 9) & 57344, 9);
            l46Var2 = l46Var;
            if (x16Var2 == null) {
                l46Var2.f0(-761283539);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-761283538);
                s(null, R.drawable.ic_share, afc.q(R.string.chat_button_share, l46Var2), false, x16Var2, l46Var2, ((i3 << 6) & 57344) | 3072, 1);
                l46Var2.r(false);
            }
            l46Var2.r(true);
        } else {
            j09Var2 = j09Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o(j09Var2, x16Var, x16Var2, i2, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    public static final void j(cod codVar, TarotCardChoice tarotCardChoice, j09 j09Var, l46 l46Var, int i2) {
        l46 l46Var2;
        boolean z;
        ?? r1;
        l46 l46Var3;
        cod codVar2 = codVar;
        l46 l46Var4 = l46Var;
        l46Var4.h0(-1968618570);
        int i3 = i2 | (l46Var4.g(codVar2) ? 4 : 2) | (l46Var4.g(tarotCardChoice) ? 32 : 16) | (l46Var4.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var4.W(i3 & 1, (i3 & 147) != 146)) {
            TarotSkinIdentify tarotSkinIdentify = codVar2.a;
            mld mldVarQ = hfc.q(tarotSkinIdentify);
            y6c y6cVarB = a7c.b(12.0f);
            boolean zContains = qd0.I0(new omd[]{omd.c, omd.d, omd.e}).contains(codVar2.b);
            boolean zBooleanValue = ((Boolean) l46Var4.k(h57.a)).booleanValue();
            j09 j09VarP = b.p(j09Var, 168.0f);
            float aspectRatio = tarotSkinIdentify.getAspectRatio();
            Float fValueOf = Float.valueOf(aspectRatio);
            if (aspectRatio <= 0.0f) {
                fValueOf = null;
            }
            j09 j09VarQ = rrb.q(dj6.w(j09VarP, fValueOf != null ? fValueOf.floatValue() : 0.5714286f), 12.0f, y6cVarB, y72.b(((m82) l46Var4.k(o82.a)).a, 0.3f), 0L, 20);
            lx0 lx0Var = ndb.f;
            xn8 xn8VarC = s21.c(lx0Var, false);
            int iHashCode = Long.hashCode(l46Var4.T);
            u8a u8aVarM = l46Var4.m();
            j09 j09VarJ = m93.J(l46Var4, j09VarQ);
            lf2.q.getClass();
            l46Var4.j0();
            boolean z2 = l46Var4.S;
            x16 x16Var = LayoutNode.h1;
            if (z2) {
                l46Var4.l(x16Var);
            } else {
                l46Var4.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var4, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var4, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var4, numValueOf);
            dec.k(l46Var4);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var4, j09VarJ);
            FillElement fillElement = b.c;
            j09 j09VarW = db6.w(oa7.E(fillElement, y6cVarB), 0.5f, ((e8b) l46Var4.k(l8b.a)).A, y6cVarB);
            xn8 xn8VarC2 = s21.c(lx0Var, false);
            int iHashCode2 = Long.hashCode(l46Var4.T);
            u8a u8aVarM2 = l46Var4.m();
            j09 j09VarJ2 = m93.J(l46Var4, j09VarW);
            l46Var4.j0();
            if (l46Var4.S) {
                l46Var4.l(x16Var);
            } else {
                l46Var4.s0();
            }
            dec.l(he2Var, l46Var4, xn8VarC2);
            dec.l(he2Var2, l46Var4, u8aVarM2);
            ib8.s(iHashCode2, l46Var4, he2Var3, l46Var4);
            dec.l(he2Var4, l46Var4, j09VarJ2);
            if (zContains || zBooleanValue) {
                z = true;
                r1 = 0;
                codVar2 = codVar;
                l46Var4.f0(-347938992);
                feg.j(od4.A(zContains ? mldVarQ.c() : mldVarQ.k(), 0, l46Var4), afc.q(mldVarQ.m(), l46Var4), fillElement, null, an2.a, 0.0f, null, l46Var4, 24968, 104);
                l46Var4.r(false);
                l46Var3 = l46Var4;
            } else {
                l46Var4.f0(-347665169);
                codVar2 = codVar;
                z = true;
                r1 = 0;
                o7c.d(fillElement, q7c.r(tarotCardChoice), codVar2.a, false, null, 12.0f, null, false, l46Var, 196614, 216);
                l46 l46Var5 = l46Var;
                l46Var5.r(false);
                l46Var3 = l46Var5;
            }
            if (tarotSkinIdentify.getIsModianCollab()) {
                l46Var3.f0(-347424020);
                hy9.a(d31.a.a(g09.a, ndb.d), l46Var3, r1);
                l46Var3.r(r1);
            } else {
                l46Var3.f0(-347343296);
                l46Var3.r(r1);
            }
            l46Var3.r(z);
            l46Var3.r(z);
            l46Var2 = l46Var3;
        } else {
            l46Var4.Z();
            l46Var2 = l46Var4;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x6(i2, codVar2, tarotCardChoice, j09Var, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    public static final void k(List list, TarotCardChoice tarotCardChoice, cs3 cs3Var, j09 j09Var, l46 l46Var, int i2) {
        j09 j09Var2;
        float fFloatValue;
        TarotSkinIdentify tarotSkinIdentify;
        l46Var.h0(1036576610);
        int i3 = i2 | (l46Var.g(list) ? 4 : 2) | (l46Var.g(tarotCardChoice) ? 32 : 16) | (l46Var.g(cs3Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | 3072;
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = af1.E(l46Var);
                l46Var.p0(objR);
            }
            aw2 aw2Var = (aw2) objR;
            cod codVar = (cod) s72.y0(((sz9) cs3Var.d.c).j(), list);
            if (codVar == null || (tarotSkinIdentify = codVar.a) == null) {
                fFloatValue = 0.5714286f;
            } else {
                float aspectRatio = tarotSkinIdentify.getAspectRatio();
                Float fValueOf = Float.valueOf(aspectRatio);
                if (aspectRatio <= 0.0f) {
                    fValueOf = null;
                }
                if (fValueOf != null) {
                    fFloatValue = fValueOf.floatValue();
                } else {
                    fFloatValue = 0.5714286f;
                }
            }
            h0e h0eVarA = vx.a(168.0f / fFloatValue, b21.T(Constants.MINIMAL_ERROR_STATUS_CODE, 0, gs4.a, 2), "dailyCardPickerCarouselHeight", l46Var, 384, 8);
            g09 g09Var = g09.a;
            nk8.d(androidx.compose.ui.platform.b.a(b.d(b.c(g09Var, 1.0f), ((yi4) h0eVarA.getValue()).a), "daily_card_skin_picker_carousel"), ndb.f, af1.b0(-2038837192, new sz7(cs3Var, list, tarotCardChoice, aw2Var, 6), l46Var), l46Var, 3120, 4);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q8(i2, 7, list, tarotCardChoice, cs3Var, j09Var2);
        }
    }

    public static final void l(cod codVar, y72 y72Var, x16 x16Var, j09 j09Var, l46 l46Var, int i2) {
        x16 x16Var2;
        boolean z;
        y72 y72Var2;
        long j2;
        long j3;
        y72 y72Var3 = y72Var;
        l46 l46Var2 = l46Var;
        l46Var2.h0(105296465);
        int i3 = i2 | (l46Var2.g(codVar) ? 4 : 2) | (l46Var2.g(y72Var3) ? 32 : 16) | (l46Var2.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 1171) != 1170)) {
            mld mldVarQ = hfc.q(codVar.a);
            Integer numJ = mldVarQ.j();
            int iIntValue = numJ != null ? numJ.intValue() : mldVarQ.l();
            c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(i4)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z2 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            String strQ = afc.q(mldVarQ.m(), l46Var2);
            mue mueVar = pue.a;
            mue mueVarA = mue.a(pue.n(l46Var2), 0L, 0L, null, cr5.b(), 0L, null, 0, 0L, null, null, 16777183);
            pr4 pr4Var = l8b.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, new jme(3), 0L, 2, false, 1, 0, null, mueVarA, l46Var, 0, 24960, 109562);
            nte.b(afc.q(iIntValue, l46Var), null, ((e8b) l46Var.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, pue.e(l46Var), l46Var, 0, 24960, 109562);
            l46Var2 = l46Var;
            if (!codVar.a.getIsModianCollab() || mldVarQ.i() == null) {
                z = false;
                l46Var2.f0(1299778331);
                l46Var2.r(false);
            } else {
                l46Var2.f0(1299726437);
                z = false;
                hy9.d(mldVarQ.i().intValue(), 0, l46Var2, null);
                l46Var2.r(false);
            }
            int iOrdinal = codVar.b.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                y72Var3 = y72Var;
                boolean z3 = z;
                x16Var2 = x16Var;
                l46Var2.f0(1981617195);
                l46Var2.r(z3);
            } else if (iOrdinal == 2) {
                y72Var3 = y72Var;
                boolean z4 = z;
                l46Var2.f0(1981593199);
                x16Var2 = x16Var;
                xj3.o(R.string.skin_download_button, y72Var3, x16Var2, l46Var2, i3 & 1008);
                l46Var2.r(z4);
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw tec.d(1981591967, l46Var2, z);
                }
                y72Var3 = y72Var;
                boolean z5 = z;
                x16Var2 = x16Var;
                l46Var2.f0(1981617195);
                l46Var2.r(z5);
            } else {
                l46Var2.f0(1981599097);
                g09 g09Var = g09.a;
                j09 j09VarD = b.d(g09Var, 24.0f);
                xn8 xn8VarC = s21.c(ndb.f, z);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, j09VarD);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var, l46Var2, xn8VarC);
                dec.l(he2Var2, l46Var2, u8aVarM2);
                ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                dec.l(he2Var4, l46Var2, j09VarJ2);
                boolean z6 = (i3 & 14) == 4 ? true : z;
                Object objR = l46Var2.R();
                i8c i8cVar = sf2.a;
                if (z6 || objR == i8cVar) {
                    objR = new uo2(8, codVar);
                    l46Var2.p0(objR);
                }
                x16 x16Var3 = (x16) objR;
                j09 j09VarP = b.p(g09Var, 120.0f);
                if (y72Var == null) {
                    l46Var2.f0(-1788930981);
                    long j4 = ((e8b) l46Var2.k(pr4Var)).u;
                    l46Var2.r(z);
                    j2 = j4;
                    y72Var2 = y72Var;
                } else {
                    l46Var2.f0(-1788931663);
                    l46Var2.r(z);
                    y72Var2 = y72Var;
                    j2 = y72Var2.a;
                }
                if (y72Var2 == null) {
                    l46Var2.f0(-1788929029);
                    j3 = ((e8b) l46Var2.k(pr4Var)).u;
                    l46Var2.r(z);
                } else {
                    l46Var2.f0(-1788929711);
                    l46Var2.r(z);
                    j3 = y72Var2.a;
                }
                long jB = y72.b(j3, 0.2f);
                Object objR2 = l46Var2.R();
                if (objR2 == i8cVar) {
                    objR2 = new cz1(27);
                    l46Var2.p0(objR2);
                }
                a26 a26Var = (a26) objR2;
                y72Var3 = y72Var;
                axa.c(x16Var3, j09VarP, j2, jB, 1, 0.0f, a26Var, l46Var2, 1769520, 0);
                l46Var2.r(true);
                l46Var2.r(z);
                x16Var2 = x16Var;
            }
            l46Var2.r(true);
        } else {
            x16Var2 = x16Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q8(codVar, y72Var3, x16Var2, j09Var, i2);
        }
    }

    public static final void m(final float f2, final boolean z, final j09 j09Var, final dd2 dd2Var, dd2 dd2Var2, dd2 dd2Var3, dd2 dd2Var4, dd2 dd2Var5, l46 l46Var, final int i2) {
        dd2 dd2Var6;
        dd2 dd2Var7;
        dd2 dd2Var8;
        dd2 dd2Var9;
        l46Var.h0(-603373354);
        int i3 = i2 | (l46Var.d(f2) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i4 = 0;
        if (l46Var.W(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objR = l46Var.R();
            if (z2 || objR == sf2.a) {
                objR = new r53(f2, i4, z);
                l46Var.p0(objR);
            }
            xn8 xn8Var = (xn8) objR;
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8Var);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            dd2Var.z(l46Var, 6);
            dd2Var6 = dd2Var2;
            dd2Var6.z(l46Var, 6);
            dd2Var7 = dd2Var3;
            dd2Var7.z(l46Var, 6);
            dd2Var8 = dd2Var4;
            dd2Var8.z(l46Var, 6);
            dd2Var9 = dd2Var5;
            dd2Var9.z(l46Var, 6);
            l46Var.r(true);
        } else {
            dd2Var6 = dd2Var2;
            dd2Var7 = dd2Var3;
            dd2Var8 = dd2Var4;
            dd2Var9 = dd2Var5;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final dd2 dd2Var10 = dd2Var6;
            final dd2 dd2Var11 = dd2Var7;
            final dd2 dd2Var12 = dd2Var8;
            final dd2 dd2Var13 = dd2Var9;
            ojbVarV.d = new l26(f2, z, j09Var, dd2Var, dd2Var10, dd2Var11, dd2Var12, dd2Var13, i2) { // from class: k53
                public final /* synthetic */ float a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ j09 c;
                public final /* synthetic */ dd2 d;
                public final /* synthetic */ dd2 e;
                public final /* synthetic */ dd2 f;
                public final /* synthetic */ dd2 g;
                public final /* synthetic */ dd2 v;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(14380033);
                    x57.m(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void n(e63 e63Var, x16 x16Var, a26 a26Var, x16 x16Var2, l26 l26Var, a26 a26Var2, a26 a26Var3, l46 l46Var, int i2) {
        int i3;
        int iO;
        fs4 fs4Var;
        long j2;
        l46 l46Var2;
        boolean z;
        lld lldVar;
        lld lldVar2;
        l46 l46Var3 = l46Var;
        e63Var.getClass();
        x16Var.getClass();
        a26Var.getClass();
        x16Var2.getClass();
        l26Var.getClass();
        a26Var2.getClass();
        a26Var3.getClass();
        l46Var3.h0(1194574433);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var3.g(e63Var) : l46Var3.i(e63Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var3.i(x16Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var3.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var3.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var3.i(l26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            i3 |= l46Var3.i(a26Var2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= l46Var3.i(a26Var3) ? 1048576 : 524288;
        }
        if (l46Var3.W(i3 & 1, (599187 & i3) != 599186)) {
            d63 d63Var = e63Var instanceof d63 ? (d63) e63Var : null;
            List list = (d63Var == null || (lldVar2 = d63Var.g) == null) ? null : lldVar2.a;
            if (list == null) {
                list = pu4.a;
            }
            if (d63Var == null || (lldVar = d63Var.g) == null) {
                iO = 0;
            } else {
                int i4 = lldVar.b;
                int size = list.size() - 1;
                if (size < 0) {
                    size = 0;
                }
                iO = mh3.o(i4, 0, size);
            }
            cod codVar = (cod) s72.y0(iO, list);
            TarotSkinIdentify tarotSkinIdentify = codVar != null ? codVar.a : null;
            ArrayList arrayList = new ArrayList(t72.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((cod) it.next()).a);
            }
            boolean zG = l46Var3.g(arrayList);
            Object objR = l46Var3.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = q1c.f(tarotSkinIdentify);
                l46Var3.p0(objR);
            }
            e89 e89Var = (e89) objR;
            boolean zE = l46Var3.e(tarotSkinIdentify == null ? -1 : tarotSkinIdentify.ordinal()) | l46Var3.g(e89Var);
            Object objR2 = l46Var3.R();
            if (zE || objR2 == obj) {
                objR2 = new s53(tarotSkinIdentify, e89Var, null);
                l46Var3.p0(objR2);
            }
            af1.o((l26) objR2, l46Var3, tarotSkinIdentify);
            TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) e89Var.getValue();
            Context context = (Context) l46Var3.k(uq.b);
            int iIndexOf = arrayList.indexOf(tarotSkinIdentify2);
            boolean zG2 = l46Var3.g(arrayList) | l46Var3.e(tarotSkinIdentify2 == null ? -1 : tarotSkinIdentify2.ordinal());
            Object objR3 = l46Var3.R();
            if (zG2 || objR3 == obj) {
                c78 c78VarW = t72.w();
                if (tarotSkinIdentify2 != null) {
                    c78VarW.add(tarotSkinIdentify2);
                }
                TarotSkinIdentify tarotSkinIdentify3 = (TarotSkinIdentify) s72.y0(iIndexOf - 1, arrayList);
                if (tarotSkinIdentify3 != null) {
                    c78VarW.add(tarotSkinIdentify3);
                }
                TarotSkinIdentify tarotSkinIdentify4 = (TarotSkinIdentify) s72.y0(iIndexOf + 1, arrayList);
                if (tarotSkinIdentify4 != null) {
                    c78VarW.add(tarotSkinIdentify4);
                }
                objR3 = s72.q0(c78VarW.n());
                l46Var3.p0(objR3);
            }
            List list2 = (List) objR3;
            boolean zG3 = l46Var3.g(context) | l46Var3.e(tarotSkinIdentify2 == null ? -1 : tarotSkinIdentify2.ordinal());
            Object objR4 = l46Var3.R();
            if (zG3 || objR4 == obj) {
                y72 y72Var = new y72(tarotSkinIdentify2 != null ? abg.c(xge.e(context, tarotSkinIdentify2)) : xj3.b);
                l46Var3.p0(y72Var);
                objR4 = y72Var;
            }
            long j3 = ((y72) objR4).a;
            boolean zI = l46Var3.i(list2) | l46Var3.i(context);
            Object objR5 = l46Var3.R();
            if (zI || objR5 == obj) {
                fs4Var = null;
                objR5 = new y53(list2, context, null);
                l46Var3.p0(objR5);
            } else {
                fs4Var = null;
            }
            af1.p(context, list2, (l26) objR5, l46Var3);
            h0e h0eVarA = qkd.a(j3, b21.T(450, 0, fs4Var, 6), "dailyCardPickerThemeColor", l46Var3, 432, 8);
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var3.k(pr4Var));
            boolean zB = if9.B(l46Var3);
            boolean zT = xj3.t(j3);
            if (!zT || zB) {
                l46Var3.f0(-530808415);
                j2 = ((e8b) l46Var3.k(pr4Var)).a;
                l46Var3.r(false);
            } else {
                l46Var3.f0(-530842267);
                l46Var3.r(false);
                j2 = xj3.d;
            }
            y72 y72Var2 = zF ? null : new y72(xj3.r(j3));
            FillElement fillElement = b.c;
            j09 j09VarO = g09.a;
            if (zF) {
                j09VarO = tm7.o(j09VarO, j2, g21.f);
            }
            j09 j09VarD = fillElement.D(j09VarO);
            xn8 xn8VarC = s21.c(ndb.b, false);
            long j4 = j2;
            int iHashCode = Long.hashCode(l46Var3.T);
            u8a u8aVarM = l46Var3.m();
            j09 j09VarJ = m93.J(l46Var3, j09VarD);
            lf2.q.getClass();
            l46Var3.j0();
            if (l46Var3.S) {
                l46Var3.l(LayoutNode.h1);
            } else {
                l46Var3.s0();
            }
            dec.l(hj6.z, l46Var3, xn8VarC);
            dec.l(hj6.y, l46Var3, u8aVarM);
            dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode));
            dec.k(l46Var3);
            dec.l(hj6.x, l46Var3, j09VarJ);
            if (zF) {
                l46Var2 = l46Var3;
                l46Var2.f0(1242770951);
                l46Var2.r(false);
            } else {
                l46Var3.f0(1242032903);
                y72 y72Var3 = new y72(j4);
                y72 y72Var4 = (y72) h0eVarA.getValue();
                long j5 = y72Var4.a;
                zyf.a(zB, zT, y72Var3, y72Var4, l46Var3, 0, 0);
                l46Var2 = l46Var3;
                if (zT) {
                    z = false;
                    l46Var2.f0(1242764999);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(1242233566);
                    z = false;
                    s21.a(tm7.n(fillElement, gec.O(new iy9[]{new iy9(Float.valueOf(0.0f), new y72(y72.b(((y72) h0eVarA.getValue()).a, zB ? 0.14f : 0.24f))), new iy9(Float.valueOf(0.2f), new y72(y72.b(((y72) h0eVarA.getValue()).a, zB ? 0.09f : 0.16f))), new iy9(Float.valueOf(0.42f), new y72(y72.b(((y72) h0eVarA.getValue()).a, zB ? 0.03f : 0.05f))), new iy9(Float.valueOf(0.55f), new y72(y72.j))}, 0.0f, 0.0f, 14), null, 6), l46Var2, 0);
                    l46Var2.r(false);
                }
                l46Var2.r(z);
            }
            xdc.a(fillElement, af1.b0(-1307843113, new m(19, x16Var2), l46Var2), null, null, null, 0, y72.j, 0L, null, af1.b0(992606252, new n53(e63Var, a26Var, l26Var, a26Var2, a26Var3, y72Var2, e89Var, x16Var), l46Var2), l46Var, 806879286, 444);
            l46Var3 = l46Var;
            l46Var3.r(true);
        } else {
            l46Var3.Z();
        }
        ojb ojbVarV = l46Var3.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o53(e63Var, x16Var, a26Var, x16Var2, l26Var, a26Var2, a26Var3, i2);
        }
    }

    public static final void o(x16 x16Var, l46 l46Var, int i2) {
        x16Var.getClass();
        l46Var.h0(-215278263);
        int i3 = (l46Var.i(x16Var) ? 4 : 2) | i2;
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            boolean zH = l46Var.h(zF);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zH || objR == obj) {
                TarotCardChoice tarotCardChoice = new TarotCardChoice(TarotCardType.THE_FOOL, false, (String) null, 4, (rp3) null);
                omd omdVar = omd.e;
                omd omdVar2 = omd.c;
                omd omdVar3 = omd.a;
                lld lldVar = new lld(zF ? t72.I(new cod(TarotSkinIdentify.NeoRiderWaite, omdVar3), new cod(TarotSkinIdentify.Midnight, omdVar2), new cod(TarotSkinIdentify.DarkGold, omdVar)) : t72.I(new cod(TarotSkinIdentify.Classic, omdVar3), new cod(TarotSkinIdentify.Cat, omdVar2), new cod(TarotSkinIdentify.Fable, omdVar)), i4, null, 30);
                pu4 pu4Var = pu4.a;
                objR = q1c.f(new d63("2026-08-31", "I welcome tomorrow with clarity", tarotCardChoice, "The Fool", "", pu4Var, lldVar, pu4Var, pu4Var));
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            d63 d63Var = (d63) e89Var.getValue();
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = new os2(13);
                l46Var.p0(objR2);
            }
            x16 x16Var2 = (x16) objR2;
            i4 = (i3 & 14) == 4 ? 1 : 0;
            Object objR3 = l46Var.R();
            if (i4 != 0 || objR3 == obj) {
                objR3 = new p9(10, x16Var);
                l46Var.p0(objR3);
            }
            a26 a26Var = (a26) objR3;
            boolean zG = l46Var.g(e89Var);
            Object objR4 = l46Var.R();
            if (zG || objR4 == obj) {
                objR4 = new hr(e89Var, 3);
                l46Var.p0(objR4);
            }
            l26 l26Var = (l26) objR4;
            Object objR5 = l46Var.R();
            if (objR5 == obj) {
                objR5 = new cz1(28);
                l46Var.p0(objR5);
            }
            a26 a26Var2 = (a26) objR5;
            Object objR6 = l46Var.R();
            if (objR6 == obj) {
                objR6 = new cz1(29);
                l46Var.p0(objR6);
            }
            n(d63Var, x16Var2, a26Var, x16Var, l26Var, a26Var2, (a26) objR6, l46Var, ((i3 << 9) & 7168) | 1769520);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m(i2, 18, x16Var);
        }
    }

    public static final void p(String str, l26 l26Var, a26 a26Var, l46 l46Var, int i2) {
        boolean z;
        Object obj;
        str.getClass();
        l26Var.getClass();
        a26Var.getClass();
        l46Var.h0(-440816651);
        int i3 = i2 | (l46Var.g(str) ? 4 : 2) | (l46Var.i(l26Var) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            Class<y63> cls = y63.class;
            final y63 y63Var = (y63) z5c.G(job.a.b(y63.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            e89 e89VarT = tm7.t(y63Var.y, l46Var);
            e89 e89VarT2 = tm7.t(y63Var.Z, l46Var);
            Context context = (Context) l46Var.k(uq.b);
            final TarotSkinIdentify tarotSkinIdentify = ((die) l46Var.k(snd.a)).a;
            x48 x48Var = (x48) l46Var.k(cb8.a);
            int i4 = i3 & 14;
            boolean zI = l46Var.i(y63Var) | l46Var.i(context) | (i4 == 4) | l46Var.i(x48Var);
            Object objR = l46Var.R();
            Object obj2 = sf2.a;
            Object obj3 = objR;
            if (zI || objR == obj2) {
                Object wgVar = new wg(y63Var, context, str, x48Var);
                l46Var.p0(wgVar);
                obj3 = wgVar;
            }
            af1.h(x48Var, str, (a26) obj3, l46Var);
            u33 u33Var = (u33) e89VarT2.getValue();
            Long lValueOf = u33Var != null ? Long.valueOf(u33Var.a) : null;
            boolean zG = ((i3 & 112) == 32) | l46Var.g(e89VarT2) | l46Var.i(y63Var);
            Object objR2 = l46Var.R();
            Object obj4 = objR2;
            if (zG || objR2 == obj2) {
                Object t53Var = new t53(y63Var, e89VarT2, l26Var, null);
                l46Var.p0(t53Var);
                obj4 = t53Var;
            }
            af1.o((l26) obj4, l46Var, lValueOf);
            boolean zI2 = l46Var.i(y63Var) | l46Var.e(tarotSkinIdentify.ordinal());
            Object objR3 = l46Var.R();
            if (zI2 || objR3 == obj2) {
                z = false;
                final boolean z2 = false ? 1 : 0;
                Object obj5 = new x16() { // from class: f53
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i5 = z2;
                        wef wefVar = wef.a;
                        TarotSkinIdentify tarotSkinIdentify2 = tarotSkinIdentify;
                        y63 y63Var2 = y63Var;
                        switch (i5) {
                            case 0:
                                y63Var2.l(w33.c, tarotSkinIdentify2);
                                break;
                            default:
                                y63Var2.l(w33.b, tarotSkinIdentify2);
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var.p0(obj5);
                obj = obj5;
            } else {
                z = false;
                obj = objR3;
            }
            rxg.a(z, (x16) obj, l46Var, z ? 1 : 0, 1);
            e63 e63Var = (e63) e89VarT.getValue();
            boolean z3 = (l46Var.i(y63Var) ? 1 : 0) | (l46Var.i(context) ? 1 : 0);
            if (i4 == 4) {
                z = true;
            }
            boolean z4 = z | (z3 ? 1 : 0);
            Object objR4 = l46Var.R();
            Object obj6 = objR4;
            if (z4 != 0 || objR4 == obj2) {
                Object j8Var = new j8(y63Var, context, str, 18);
                l46Var.p0(j8Var);
                obj6 = j8Var;
            }
            x16 x16Var = (x16) obj6;
            boolean zG2 = l46Var.g(e89VarT) | l46Var.i(y63Var);
            Object objR5 = l46Var.R();
            Object obj7 = objR5;
            if (zG2 || objR5 == obj2) {
                Object ks2Var = new ks2(8, y63Var, e89VarT);
                l46Var.p0(ks2Var);
                obj7 = ks2Var;
            }
            a26 a26Var2 = (a26) obj7;
            boolean zI3 = l46Var.i(y63Var) | l46Var.e(tarotSkinIdentify.ordinal());
            Object objR6 = l46Var.R();
            Object obj8 = objR6;
            if (zI3 || objR6 == obj2) {
                final int i5 = 1;
                Object obj9 = new x16() { // from class: f53
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i6 = i5;
                        wef wefVar = wef.a;
                        TarotSkinIdentify tarotSkinIdentify2 = tarotSkinIdentify;
                        y63 y63Var2 = y63Var;
                        switch (i6) {
                            case 0:
                                y63Var2.l(w33.c, tarotSkinIdentify2);
                                break;
                            default:
                                y63Var2.l(w33.b, tarotSkinIdentify2);
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var.p0(obj9);
                obj8 = obj9;
            }
            x16 x16Var2 = (x16) obj8;
            boolean zI4 = l46Var.i(y63Var);
            Object objR7 = l46Var.R();
            int i6 = 12;
            Object obj10 = objR7;
            if (zI4 || objR7 == obj2) {
                Object i1Var = new i1(i6, y63Var);
                l46Var.p0(i1Var);
                obj10 = i1Var;
            }
            l26 l26Var2 = (l26) obj10;
            boolean zI5 = l46Var.i(y63Var);
            Object objR8 = l46Var.R();
            if (zI5 || objR8 == obj2) {
                objR8 = new w(1, y63Var, cls, "startDownload", "startDownload(Lai/askquin/model/TarotSkinIdentify;)V", 0, 24);
                l46Var.p0(objR8);
            }
            n(e63Var, x16Var, a26Var2, x16Var2, l26Var2, (a26) ((ym7) objR8), a26Var, l46Var, (i3 << 12) & 3670016);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x6(str, l26Var, false, a26Var, i2, 16);
        }
    }

    public static final void q(d63 d63Var, xw9 xw9Var, a26 a26Var, l26 l26Var, a26 a26Var2, a26 a26Var3, y72 y72Var, a26 a26Var4, l46 l46Var, int i2) {
        int i3;
        xw9 xw9Var2;
        a26 a26Var5;
        l26 l26Var2;
        l46Var.h0(240410143);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var.g(d63Var) : l46Var.i(d63Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            xw9Var2 = xw9Var;
            i3 |= l46Var.g(xw9Var2) ? 32 : 16;
        } else {
            xw9Var2 = xw9Var;
        }
        if ((i2 & 384) == 0) {
            a26Var5 = a26Var;
            i3 |= l46Var.i(a26Var5) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            a26Var5 = a26Var;
        }
        if ((i2 & 3072) == 0) {
            l26Var2 = l26Var;
            i3 |= l46Var.i(l26Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            l26Var2 = l26Var;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var.i(a26Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            i3 |= l46Var.i(a26Var3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= l46Var.g(y72Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= l46Var.i(a26Var4) ? 8388608 : 4194304;
        }
        if (l46Var.W(i3 & 1, (4793491 & i3) != 4793490)) {
            lld lldVar = d63Var.g;
            int i4 = i3;
            List list = lldVar.a;
            int i5 = lldVar.b;
            int iE = t72.E(list);
            if (iE < 0) {
                iE = 0;
            }
            int iO = mh3.o(i5, 0, iE);
            l46Var.d0(-894069775, l46Var.I(Integer.valueOf(iO), Integer.valueOf(list.size())));
            int i6 = i4 & 14;
            int i7 = i4 << 6;
            r(d63Var, list, iO, xw9Var2, a26Var5, l26Var2, a26Var2, a26Var3, y72Var, a26Var4, l46Var, (i7 & 1879048192) | i6 | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7));
            l46Var.r(false);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new g53(d63Var, xw9Var, a26Var, l26Var, a26Var2, a26Var3, y72Var, a26Var4, i2);
        }
    }

    public static final void r(final d63 d63Var, final List list, final int i2, final xw9 xw9Var, final a26 a26Var, final l26 l26Var, final a26 a26Var2, final a26 a26Var3, final y72 y72Var, final a26 a26Var4, l46 l46Var, final int i3) {
        int i4;
        Boolean bool;
        boolean z;
        cs3 cs3Var;
        t33 t33Var;
        boolean z2;
        List list2 = list;
        l46Var.h0(522359524);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? l46Var.g(d63Var) : l46Var.i(d63Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= (i3 & 64) == 0 ? l46Var.g(list2) : l46Var.i(list2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= l46Var.e(i2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i4 |= l46Var.g(xw9Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            i4 |= l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i3) == 0) {
            i4 |= l46Var.i(l26Var) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= l46Var.i(a26Var2) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i4 |= l46Var.i(a26Var3) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i4 |= l46Var.g(y72Var) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i4 |= l46Var.i(a26Var4) ? 536870912 : 268435456;
        }
        if (l46Var.W(i4 & 1, (i4 & 306783379) != 306783378)) {
            int i5 = i4 & 112;
            boolean z3 = i5 == 32 || ((i4 & 64) != 0 && l46Var.i(list2));
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z3 || objR == obj) {
                objR = new h53(list2, 0);
                l46Var.p0(objR);
            }
            cs3 cs3VarB = ay9.b(i2, (i4 >> 6) & 14, 2, (x16) objR, l46Var);
            hzc hzcVar = cs3VarB.d;
            Integer numValueOf = Integer.valueOf(((sz9) hzcVar.c).j());
            boolean zG = (i5 == 32 || ((i4 & 64) != 0 && l46Var.i(list2))) | l46Var.g(cs3VarB) | ((i4 & 1879048192) == 536870912);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = new u53(null, a26Var4, cs3VarB, list2);
                l46Var.p0(objR2);
            }
            af1.p(numValueOf, list2, (l26) objR2, l46Var);
            Integer numValueOf2 = Integer.valueOf(cs3VarB.o());
            Boolean boolValueOf = Boolean.valueOf(cs3VarB.k.a());
            int i6 = i4;
            boolean zG2 = ((i4 & 896) == 256) | l46Var.g(cs3VarB) | (i5 == 32 || ((i6 & 64) != 0 && l46Var.i(list2))) | ((i6 & 458752) == 131072);
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == obj) {
                bool = boolValueOf;
                z = true;
                Object v53Var = new v53(cs3VarB, i2, list2, l26Var, null);
                list2 = list2;
                cs3Var = cs3VarB;
                l46Var.p0(v53Var);
                objR3 = v53Var;
            } else {
                bool = boolValueOf;
                cs3Var = cs3VarB;
                z = true;
            }
            af1.p(numValueOf2, bool, (l26) objR3, l46Var);
            int iJ = ((sz9) hzcVar.c).j();
            cod codVar = (cod) s72.y0(iJ, list2);
            boolean z4 = d63Var.g.d;
            omd omdVar = codVar != null ? codVar.b : null;
            int i7 = omdVar == null ? -1 : w53.a[omdVar.ordinal()];
            s33 s33Var = s33.a;
            if (i7 == -1) {
                z2 = false;
                t33Var = new t33(s33Var, false);
            } else {
                if (i7 == z || i7 == 2) {
                    t33Var = new t33(s33Var, z4 ^ z);
                } else if (i7 != 3) {
                    if (i7 != 4 && i7 != 5) {
                        ap.c();
                        return;
                    }
                    z2 = false;
                    t33Var = new t33(s33Var, false);
                } else {
                    t33Var = new t33(s33.b, z4 ^ z);
                }
                z2 = false;
            }
            if (codVar != null) {
                TarotSkinIdentify tarotSkinIdentify = codVar.a;
                omd omdVar2 = codVar.b;
                boolean z5 = (omdVar2 == omd.c || omdVar2 == omd.d) ? z : z2;
                if (tarotSkinIdentify.getIsModianCollab() && hfc.q(tarotSkinIdentify).i() != null && z5) {
                    z2 = z;
                }
            }
            cv7 cv7Var = (cv7) l46Var.k(zg2.n);
            nk8.d(ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, mh3.N(ynb.Y(b.c, new bx9(ynb.B(xw9Var, cv7Var), ((yi4) mh3.l(new yi4(xw9Var.d() - 20.0f), new yi4(0.0f))).a, ynb.A(xw9Var, cv7Var), xw9Var.a())))), null, af1.b0(-1574009906, new i53(t33Var, z2, d63Var, list2, cs3Var, codVar, y72Var, a26Var2, iJ, a26Var3, a26Var), l46Var), l46Var, 3072, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: j53
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    x57.r(d63Var, list, i2, xw9Var, a26Var, l26Var, a26Var2, a26Var3, y72Var, a26Var4, (l46) obj2, k99.P(i3 | 1));
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void s(j09 j09Var, int i2, String str, boolean z, x16 x16Var, l46 l46Var, int i3, int i4) {
        boolean z2;
        boolean z3;
        j09 j09Var2;
        boolean z4;
        ojb ojbVarV;
        boolean z5;
        u51 u51VarN;
        int i5;
        l46Var.h0(1008688700);
        int i6 = i3 | 6;
        if ((i3 & 48) == 0) {
            i6 |= l46Var.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= l46Var.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i7 = i4 & 8;
        if (i7 == 0) {
            if ((i3 & 3072) == 0) {
                z2 = z;
                i6 |= l46Var.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if ((i3 & 24576) != 0) {
                if (l46Var.i(x16Var)) {
                    i5 = 16384;
                } else {
                    i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i6 |= i5;
            }
            if ((i6 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i6 & 1, z3)) {
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                x4d x4dVar = eze.a(l46Var).a.a;
                if (z5) {
                    l46Var.f0(-1312759185);
                    u51VarN = c8b.m(l46Var);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-1312758257);
                    u51VarN = c8b.n(l46Var);
                    l46Var.r(false);
                }
                u51 u51Var = u51VarN;
                g09 g09Var = g09.a;
                cgg.a(x16Var, g09Var, false, x4dVar, u51Var, null, null, null, af1.b0(-407473620, new ab4(i2, str), l46Var), l46Var, ((i6 >> 12) & 14) | 805306368 | ((i6 << 3) & 112), 484);
                j09Var2 = g09Var;
                z4 = z5;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                z4 = z2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new bb4(j09Var2, i2, str, z4, x16Var, i3, i4);
            }
        }
        i6 |= 3072;
        z2 = z;
        if ((i3 & 24576) != 0) {
            if (l46Var.i(x16Var)) {
                i5 = 16384;
            } else {
                i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i6 |= i5;
        }
        if ((i6 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i6 & 1, z3)) {
            if (i7 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            x4d x4dVar2 = eze.a(l46Var).a.a;
            if (z5) {
                l46Var.f0(-1312759185);
                u51VarN = c8b.m(l46Var);
                l46Var.r(false);
            } else {
                l46Var.f0(-1312758257);
                u51VarN = c8b.n(l46Var);
                l46Var.r(false);
            }
            u51 u51Var2 = u51VarN;
            g09 g09Var2 = g09.a;
            cgg.a(x16Var, g09Var2, false, x4dVar2, u51Var2, null, null, null, af1.b0(-407473620, new ab4(i2, str), l46Var), l46Var, ((i6 >> 12) & 14) | 805306368 | ((i6 << 3) & 112), 484);
            j09Var2 = g09Var2;
            z4 = z5;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            z4 = z2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new bb4(j09Var2, i2, str, z4, x16Var, i3, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    public static final void t(TarotSkinIdentify tarotSkinIdentify, j09 j09Var, l46 l46Var, int i2) {
        TarotSkinIdentify tarotSkinIdentify2;
        int i3;
        ?? r3;
        l46 l46Var2;
        j09 j09Var2;
        boolean z;
        l46 l46Var3;
        boolean z2;
        l46 l46Var4;
        boolean z3;
        l46 l46Var5 = l46Var;
        l46Var5.h0(-1787384782);
        int i4 = i2 | (l46Var5.e(tarotSkinIdentify == null ? -1 : tarotSkinIdentify.ordinal()) ? 4 : 2) | (l46Var5.g(j09Var) ? 32 : 16);
        if (l46Var5.W(i4 & 1, (i4 & 19) != 18)) {
            boolean zF = k8b.f((e8b) l46Var5.k(l8b.a));
            lx0 lx0Var = ndb.b;
            xn8 xn8VarC = s21.c(lx0Var, false);
            int iHashCode = Long.hashCode(l46Var5.T);
            u8a u8aVarM = l46Var5.m();
            j09 j09VarJ = m93.J(l46Var5, j09Var);
            lf2.q.getClass();
            l46Var5.j0();
            if (l46Var5.S) {
                l46Var5.l(LayoutNode.h1);
            } else {
                l46Var5.s0();
            }
            dec.l(hj6.z, l46Var5, xn8VarC);
            dec.l(hj6.y, l46Var5, u8aVarM);
            dec.l(hj6.X, l46Var5, Integer.valueOf(iHashCode));
            dec.k(l46Var5);
            dec.l(hj6.x, l46Var5, j09VarJ);
            j09 j09VarI = b.i(tm7.N(23.0f, 0.0f, d31.a.a(g09.a, lx0Var), 2), 39.0f, 56.0f);
            m8c m8cVar = an2.b;
            if (zF) {
                l46Var5.f0(1632391809);
                fy9 fy9VarA = od4.A(R.drawable.img_home_my_tarot_deck_backdrop_shadow_neo, 0, l46Var5);
                FillElement fillElement = b.c;
                feg.j(fy9VarA, null, fillElement, null, m8cVar, 0.0f, null, l46Var5, 25016, 104);
                if (tarotSkinIdentify != null) {
                    l46Var5.f0(1632630726);
                    feg.j(od4.A(R.drawable.img_home_my_tarot_deck_box_shadow_neo, 0, l46Var5), null, j09VarI, null, m8cVar, 0.0f, null, l46Var5, 24632, 104);
                    j09Var2 = j09VarI;
                    l46Var5.r(false);
                } else {
                    j09Var2 = j09VarI;
                    l46Var5.f0(1632861366);
                    l46Var5.r(false);
                }
                feg.j(od4.A(R.drawable.img_home_my_tarot_deck_backdrop_neo, 0, l46Var5), null, fillElement, null, m8cVar, 0.0f, null, l46Var5, 25016, 104);
                l46Var5.r(false);
            } else {
                j09Var2 = j09VarI;
                l46Var5.f0(1633101492);
                feg.j(od4.A(R.drawable.img_home_my_tarot_deck_backdrop, 0, l46Var5), null, b.c, null, m8cVar, 0.0f, null, l46Var5, 25016, 104);
                l46Var5.r(false);
            }
            if (tarotSkinIdentify != null) {
                l46Var5.f0(1633362419);
                tarotSkinIdentify2 = tarotSkinIdentify;
                bhe bheVarO = m7c.o(t72.H(tarotSkinIdentify), tarotSkinIdentify2, cge.j, null, l46Var5, (i4 << 3) & 112, 8);
                yge ygeVarF = bheVarO.f(tarotSkinIdentify2);
                if (ygeVarF != null) {
                    l46Var5.f0(1633576505);
                    z2 = false;
                    z3 = true;
                    i3 = i2;
                    feg.k(ygeVarF.a, null, j09Var2, m8cVar, 0, l46Var, 24624, 232);
                    l46 l46Var6 = l46Var;
                    l46Var6.r(false);
                    l46Var4 = l46Var6;
                } else {
                    i3 = i2;
                    boolean z4 = true;
                    z2 = false;
                    j09 j09Var3 = j09Var2;
                    if (bheVarO.a(tarotSkinIdentify2)) {
                        l46Var5.f0(1633801410);
                        feg.j(od4.A(hfc.q(tarotSkinIdentify2).e(), 0, l46Var5), null, j09Var3, null, m8cVar, 0.0f, null, l46Var5, 24632, 104);
                        l46Var5.r(false);
                        z3 = z4;
                        l46Var4 = l46Var5;
                    } else {
                        l46Var5.f0(1634005142);
                        l46Var5.r(false);
                        z3 = z4;
                        l46Var4 = l46Var5;
                    }
                }
                l46Var4.r(z2);
                z = z3;
                l46Var3 = l46Var4;
            } else {
                tarotSkinIdentify2 = tarotSkinIdentify;
                i3 = i2;
                z = true;
                l46Var5.f0(1634011094);
                l46Var5.r(false);
                l46Var3 = l46Var5;
            }
            l46Var3.r(z);
            r3 = z;
            l46Var2 = l46Var3;
        } else {
            tarotSkinIdentify2 = tarotSkinIdentify;
            i3 = i2;
            r3 = 1;
            l46Var5.Z();
            l46Var2 = l46Var5;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ej3(tarotSkinIdentify2, j09Var, i3, r3);
        }
    }

    public static final void u(x16 x16Var, l46 l46Var, int i2) {
        int i3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1582679597);
        if ((i2 & 6) == 0) {
            i3 = (l46Var2.i(x16Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (l46Var2.W(i3 & 1, (i3 & 3) != 2)) {
            g09 g09Var = g09.a;
            j09 j09VarG = k8b.g(b.l(g09Var, 80.0f), new ie2(27), l46Var2, 6);
            float f2 = we6.e(l46Var2) ? 1.0f : 0.5f;
            pr4 pr4Var = l8b.a;
            long j2 = ((e8b) l46Var2.k(pr4Var)).z;
            long j3 = ((e8b) l46Var2.k(pr4Var)).A;
            if (!we6.e(l46Var2)) {
                j2 = j3;
            }
            y6c y6cVar = a7c.a;
            j09 j09VarE = oa7.E(db6.w(j09VarG, f2, j2, y6cVar), y6cVar);
            long j4 = ((e8b) l46Var2.k(pr4Var)).c;
            if (we6.e(l46Var2)) {
                j4 = y72.j;
            }
            j09 j09VarO = tm7.o(j09VarE, j4, g21.f);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarO);
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
            boolean z = (i3 & 14) == 4;
            Object objR = l46Var2.R();
            if (z || objR == sf2.a) {
                objR = new p9(24, x16Var);
                l46Var2.p0(objR);
            }
            xo1.c((a26) objR, b.l(g09Var, 80.0f), null, l46Var2, 48, 4);
            gu6.b(od4.A(R.drawable.ic_microphone, 0, l46Var2), null, b.l(g09Var, 28.0f), ((e8b) l46Var2.k(pr4Var)).q, l46Var2, 440, 0);
            l46Var2 = l46Var2;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new lk3(i2, 8, x16Var);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r14v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r16v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r20v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r20v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r20v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r20v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r46v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r46v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r47v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r47v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r50v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r50v0 ??, new type: l46
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r46v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r46v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r47v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r47v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r50v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r50v0 ??, new type: l46
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v1 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void v(float r44, int r45, int r46, int r47, defpackage.kx0 r48, defpackage.dd2 r49, defpackage.l46 r50, defpackage.j09 r51, defpackage.pc9 r52, defpackage.lu9 r53, defpackage.xw9 r54, defpackage.fx9 r55, defpackage.yx9 r56, defpackage.ard r13, defpackage.frd r58, boolean r59) {
        /*
            Method dump skipped, instruction units count: 1305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x57.v(float, int, int, int, kx0, dd2, l46, j09, pc9, lu9, xw9, fx9, yx9, ard, frd, boolean):void");
    }

    public static final void w(final soa soaVar, final boolean z, final String str, boolean z2, final az1 az1Var, final l26 l26Var, x16 x16Var, l46 l46Var, int i2) {
        soa soaVar2;
        l46 l46Var2;
        boolean z3;
        long j2;
        ov7 ov7Var;
        y02 y02Var = g21.f;
        soaVar.getClass();
        sz9 sz9Var = soaVar.v;
        vz9 vz9Var = soaVar.x;
        l26Var.getClass();
        x16Var.getClass();
        l46Var.h0(-1033839541);
        int i3 = i2 | (l46Var.i(soaVar) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(az1Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(l26Var) ? 131072 : 65536) | (l46Var.i(x16Var) ? 1048576 : 524288);
        if (l46Var.W(i3 & 1, (599187 & i3) != 599186)) {
            final Context context = (Context) l46Var.k(uq.b);
            final boolean zBooleanValue = ((Boolean) soaVar.g.getValue()).booleanValue();
            final boolean zBooleanValue2 = ((Boolean) vz9Var.getValue()).booleanValue();
            boolean z4 = !v4e.Q(soaVar.f.d().c) || ((Boolean) vz9Var.getValue()).booleanValue();
            WeakHashMap weakHashMap = m8g.w;
            fx fxVar = q7c.k(l46Var).c;
            boolean z5 = fxVar.e().d > 0;
            af afVar = new af(3);
            int i4 = i3 & 14;
            final boolean z6 = z4;
            boolean z7 = ((i3 & 57344) == 16384) | (i4 == 4 || l46Var.i(soaVar));
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z7 || objR == i8cVar) {
                objR = new kz8(25, soaVar, az1Var);
                l46Var.p0(objR);
            }
            final yk8 yk8VarP = qn4.P(afVar, (a26) objR, l46Var);
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = q1c.f(ynb.q(0.0f, 0.0f, 3));
                l46Var.p0(objR2);
            }
            final e89 e89Var = (e89) objR2;
            x4d x4dVarB = a7c.b(20.0f);
            if (we6.e(l46Var)) {
                x4dVarB = y02Var;
            }
            pr4 pr4Var = l8b.a;
            long j3 = ((e8b) l46Var.k(pr4Var)).z;
            FillElement fillElement = b.c;
            x4d x4dVar = x4dVarB;
            boolean z8 = i4 == 4 || l46Var.i(soaVar);
            Object objR3 = l46Var.R();
            if (z8 || objR3 == i8cVar) {
                objR3 = new sr(2, soaVar);
                l46Var.p0(objR3);
            }
            j09 j09VarA = ibe.a(fillElement, wef.a, (PointerInputEventHandler) objR3);
            lx0 lx0Var = ndb.b;
            xn8 xn8VarC = s21.c(lx0Var, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarA);
            lf2.q.getClass();
            l46Var.j0();
            boolean z9 = l46Var.S;
            ov7 ov7Var2 = LayoutNode.h1;
            if (z9) {
                l46Var.l(ov7Var2);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            j09 j09VarL = mh3.L(fillElement);
            g09 g09Var = g09.a;
            final boolean z10 = z5;
            soaVar2 = soaVar;
            xdc.a(j09VarL.D(zBooleanValue ? od4.i(g09Var, 36.0f) : g09Var), af1.b0(-208590143, new mb0(x16Var, z2, 8), l46Var), af1.b0(-1865698400, new l26() { // from class: aoa
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    boolean z11;
                    l46 l46Var3 = (l46) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    x4d x4dVar2 = g21.f;
                    if (l46Var3.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                        g09 g09Var2 = g09.a;
                        j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, ynb.a0(mh3.N(b.c(g09Var2, 1.0f)), 24.0f, 0.0f));
                        c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var3, 48);
                        int iHashCode2 = Long.hashCode(l46Var3.T);
                        u8a u8aVarM2 = l46Var3.m();
                        j09 j09VarJ2 = m93.J(l46Var3, j09VarD0);
                        lf2.q.getClass();
                        l46Var3.j0();
                        if (l46Var3.S) {
                            l46Var3.l(LayoutNode.h1);
                        } else {
                            l46Var3.s0();
                        }
                        dec.l(hj6.z, l46Var3, c92VarA);
                        dec.l(hj6.y, l46Var3, u8aVarM2);
                        dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode2));
                        dec.k(l46Var3);
                        dec.l(hj6.x, l46Var3, j09VarJ2);
                        if (z) {
                            l46Var3.f0(496835325);
                            hfc.a(48, l46Var3, b.c(g09Var2, 1.0f), str);
                            l46Var3.r(false);
                            z11 = true;
                        } else {
                            boolean z12 = z6;
                            az1 az1Var2 = az1Var;
                            l26 l26Var2 = l26Var;
                            i8c i8cVar2 = sf2.a;
                            if (z12) {
                                l46Var3.f0(497052666);
                                j09 j09VarD = b.d(b.c(g09Var2, 1.0f), 56.0f);
                                String strQ = afc.q(R.string.post_draw_start_reading, l46Var3);
                                x4d x4dVar3 = eze.a(l46Var3).a.a;
                                x4dVar3.getClass();
                                if (!we6.e(l46Var3)) {
                                    x4dVar2 = x4dVar3;
                                }
                                soa soaVar3 = soaVar;
                                boolean zBooleanValue3 = ((Boolean) soaVar3.z.getValue()).booleanValue();
                                boolean z13 = zBooleanValue2;
                                boolean z14 = !zBooleanValue3 && !(z13 && ((AdditionalInfoAudio) soaVar3.X.getValue()) == null) && soaVar3.f.d().c.length() <= 400;
                                boolean zI = l46Var3.i(az1Var2) | l46Var3.h(z13) | l46Var3.i(soaVar3) | l46Var3.g(l26Var2);
                                Object objR4 = l46Var3.R();
                                if (zI || objR4 == i8cVar2) {
                                    nt5 nt5Var = new nt5(z13, soaVar3, l26Var2, az1Var2, 4);
                                    l46Var3.p0(nt5Var);
                                    objR4 = nt5Var;
                                }
                                c8b.i(j09VarD, strQ, null, null, 0L, 0.0f, z14, x4dVar2, null, false, null, null, (x16) objR4, l46Var3, 6, 0, 3900);
                                l46Var3.r(false);
                            } else {
                                l46Var3.f0(498181097);
                                j09 j09VarD2 = b.d(b.c(g09Var2, 1.0f), 56.0f);
                                String strQ2 = afc.q(R.string.post_draw_skip_start_reading, l46Var3);
                                x4d x4dVar4 = eze.a(l46Var3).a.a;
                                x4dVar4.getClass();
                                x4d x4dVar5 = we6.e(l46Var3) ? x4dVar2 : x4dVar4;
                                boolean zI2 = l46Var3.i(az1Var2) | l46Var3.g(l26Var2);
                                Object objR5 = l46Var3.R();
                                if (zI2 || objR5 == i8cVar2) {
                                    objR5 = new ek9(19, l26Var2, az1Var2);
                                    l46Var3.p0(objR5);
                                }
                                c8b.i(j09VarD2, strQ2, null, null, 0L, 0.0f, false, x4dVar5, null, false, null, null, (x16) objR5, l46Var3, 6, 0, 3964);
                                l46Var3.r(false);
                            }
                            z11 = true;
                        }
                        l46Var3.r(z11);
                    } else {
                        l46Var3.Z();
                    }
                    return wef.a;
                }
            }, l46Var), null, null, 0, ((e8b) l46Var.k(pr4Var)).a, 0L, null, af1.b0(-1076383850, new n26() { // from class: boa
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    xw9 xw9Var = (xw9) obj;
                    l46 l46Var3 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    xw9Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var3.g(xw9Var) ? 4 : 2;
                    }
                    if (l46Var3.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        e89 e89Var2 = e89Var;
                        if (!pa7.t((xw9) e89Var2.getValue(), xw9Var)) {
                            e89Var2.setValue(xw9Var);
                        }
                        FillElement fillElement2 = b.c;
                        lx0 lx0Var2 = ndb.b;
                        xn8 xn8VarC2 = s21.c(lx0Var2, false);
                        int iHashCode2 = Long.hashCode(l46Var3.T);
                        u8a u8aVarM2 = l46Var3.m();
                        j09 j09VarJ2 = m93.J(l46Var3, fillElement2);
                        lf2.q.getClass();
                        l46Var3.j0();
                        boolean z11 = l46Var3.S;
                        ov7 ov7Var3 = LayoutNode.h1;
                        if (z11) {
                            l46Var3.l(ov7Var3);
                        } else {
                            l46Var3.s0();
                        }
                        he2 he2Var5 = hj6.z;
                        dec.l(he2Var5, l46Var3, xn8VarC2);
                        he2 he2Var6 = hj6.y;
                        dec.l(he2Var6, l46Var3, u8aVarM2);
                        Integer numValueOf2 = Integer.valueOf(iHashCode2);
                        he2 he2Var7 = hj6.X;
                        dec.l(he2Var7, l46Var3, numValueOf2);
                        dec.k(l46Var3);
                        he2 he2Var8 = hj6.x;
                        dec.l(he2Var8, l46Var3, j09VarJ2);
                        jgb.l(0, l46Var3);
                        j09 j09VarB0 = ynb.b0(24.0f, 0.0f, ynb.Y(fillElement2, xw9Var), 2);
                        jx0 jx0Var = ndb.Z;
                        sc0 sc0Var = xc0.c;
                        c92 c92VarA = a92.a(sc0Var, jx0Var, l46Var3, 48);
                        int iHashCode3 = Long.hashCode(l46Var3.T);
                        u8a u8aVarM3 = l46Var3.m();
                        j09 j09VarJ3 = m93.J(l46Var3, j09VarB0);
                        l46Var3.j0();
                        if (l46Var3.S) {
                            l46Var3.l(ov7Var3);
                        } else {
                            l46Var3.s0();
                        }
                        dec.l(he2Var5, l46Var3, c92VarA);
                        dec.l(he2Var6, l46Var3, u8aVarM3);
                        ib8.s(iHashCode3, l46Var3, he2Var7, l46Var3);
                        dec.l(he2Var8, l46Var3, j09VarJ3);
                        g09 g09Var2 = g09.a;
                        o5c.f(l46Var3, b.d(g09Var2, 12.0f));
                        c92 c92VarA2 = a92.a(sc0Var, jx0Var, l46Var3, 48);
                        int iHashCode4 = Long.hashCode(l46Var3.T);
                        u8a u8aVarM4 = l46Var3.m();
                        j09 j09VarJ4 = m93.J(l46Var3, g09Var2);
                        l46Var3.j0();
                        if (l46Var3.S) {
                            l46Var3.l(ov7Var3);
                        } else {
                            l46Var3.s0();
                        }
                        dec.l(he2Var5, l46Var3, c92VarA2);
                        dec.l(he2Var6, l46Var3, u8aVarM4);
                        ib8.s(iHashCode4, l46Var3, he2Var7, l46Var3);
                        dec.l(he2Var8, l46Var3, j09VarJ4);
                        String strQ = afc.q(R.string.post_draw_info_title, l46Var3);
                        mue mueVar = pue.a;
                        mue mueVarN = pue.n(l46Var3);
                        pr4 pr4Var2 = l8b.a;
                        nte.b(strQ, null, ((e8b) l46Var3.k(pr4Var2)).q, 0L, null, ((y8b) l46Var3.k(x8b.a)).a, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarN, l46Var3, 0, 0, 130938);
                        nte.b(ks0.h(8.0f, R.string.post_draw_info_subtitle, l46Var3, l46Var3, g09Var2), null, ((e8b) l46Var3.k(pr4Var2)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var3), l46Var3, 0, 0, 131066);
                        l46 l46Var4 = l46Var3;
                        tec.u(g09Var2, 24.0f, l46Var4, true);
                        j09 j09VarD = b.c(g09Var2, 1.0f).D(new jw7(1.0f, true));
                        xn8 xn8VarC3 = s21.c(lx0Var2, false);
                        int iHashCode5 = Long.hashCode(l46Var4.T);
                        u8a u8aVarM5 = l46Var4.m();
                        j09 j09VarJ5 = m93.J(l46Var4, j09VarD);
                        l46Var4.j0();
                        if (l46Var4.S) {
                            l46Var4.l(ov7Var3);
                        } else {
                            l46Var4.s0();
                        }
                        dec.l(he2Var5, l46Var4, xn8VarC3);
                        dec.l(he2Var6, l46Var4, u8aVarM5);
                        ib8.s(iHashCode5, l46Var4, he2Var7, l46Var4);
                        dec.l(he2Var8, l46Var4, j09VarJ5);
                        boolean z12 = zBooleanValue2;
                        soa soaVar3 = soaVar;
                        i8c i8cVar2 = sf2.a;
                        if (!z12 || zBooleanValue) {
                            l46Var4.f0(2088594912);
                            use useVar = soaVar3.f;
                            boolean z13 = !z;
                            Context context2 = context;
                            boolean zI = l46Var4.i(context2) | l46Var4.i(soaVar3);
                            az1 az1Var2 = az1Var;
                            boolean zI2 = zI | l46Var4.i(az1Var2);
                            yk8 yk8Var = yk8VarP;
                            boolean zI3 = zI2 | l46Var4.i(yk8Var);
                            Object objR4 = l46Var4.R();
                            if (zI3 || objR4 == i8cVar2) {
                                objR4 = new foa(context2, soaVar3, az1Var2, yk8Var);
                                l46Var4.p0(objR4);
                            }
                            x57.x(useVar, z10, z13, (x16) ((ym7) objR4), fillElement2, l46Var4, 24576);
                            l46Var4.r(false);
                        } else {
                            l46Var4.f0(2087974261);
                            int iJ = soaVar3.y.j();
                            boolean zBooleanValue3 = ((Boolean) soaVar3.z.getValue()).booleanValue();
                            boolean zBooleanValue4 = ((Boolean) soaVar3.Z.getValue()).booleanValue();
                            float fFloatValue = ((Number) soaVar3.E0.getValue()).floatValue();
                            boolean zI4 = l46Var4.i(soaVar3);
                            Object objR5 = l46Var4.R();
                            if (zI4 || objR5 == i8cVar2) {
                                yv9 yv9Var = new yv9(0, soaVar3, soa.class, "togglePlayback", "togglePlayback()V", 0, 4);
                                l46Var4.p0(yv9Var);
                                objR5 = yv9Var;
                            }
                            x16 x16Var2 = (x16) ((ym7) objR5);
                            boolean zI5 = l46Var4.i(soaVar3);
                            Object objR6 = l46Var4.R();
                            if (zI5 || objR6 == i8cVar2) {
                                objR6 = new coa(soaVar3, 0);
                                l46Var4.p0(objR6);
                            }
                            x57.B(iJ, zBooleanValue3, zBooleanValue4, fFloatValue, x16Var2, (x16) objR6, d31.a.a(g09Var2, ndb.c), l46Var4, 0);
                            l46Var4 = l46Var4;
                            l46Var4.r(false);
                        }
                        ib8.t(l46Var4, true, g09Var2, 24.0f, l46Var4);
                        l46Var4.r(true);
                        l46Var4.r(true);
                    } else {
                        l46Var3.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 805306800, 440);
            if (zBooleanValue) {
                l46Var.f0(-831009297);
                boolean zB = if9.B(l46Var);
                long jD = abg.d(3088257812L);
                long jD2 = abg.d(zB ? 3088849961L : 3102403068L);
                if (we6.e(l46Var)) {
                    j2 = j3;
                } else {
                    j2 = j3;
                    jD = jD2;
                }
                s21.a(tm7.o(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02b5: INVOKE 
                      (wrap j09:0x02b0: INVOKE (r37v0 ?? I:??[OBJECT, ARRAY]), (r14v6 'jD' long), (r13v0 'y02Var' y02) STATIC call: tm7.o(j09, long, x4d):j09 A[MD:(j09, long, x4d):j09 (m), WRAPPED] (LINE:689))
                      (r54v0 'l46Var' l46)
                      (0 int)
                     STATIC call: s21.a(j09, l46, int):void A[MD:(j09, l46, int):void (m)] (LINE:694) in method: x57.w(soa, boolean, java.lang.String, boolean, az1, l26, x16, l46, int):void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r37v0 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1466
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.x57.w(soa, boolean, java.lang.String, boolean, az1, l26, x16, l46, int):void");
            }

            public static final void x(use useVar, boolean z, boolean z2, x16 x16Var, j09 j09Var, l46 l46Var, int i2) {
                x16 x16Var2;
                boolean z3;
                ov7 ov7Var;
                l46 l46Var2 = l46Var;
                y02 y02Var = g21.f;
                x16Var.getClass();
                l46Var2.h0(391931322);
                int i3 = i2 | (l46Var2.g(useVar) ? 4 : 2) | (l46Var2.h(z) ? 32 : 16) | (l46Var2.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
                if (l46Var2.W(i3 & 1, (i3 & 9363) != 9362)) {
                    Object objR = l46Var2.R();
                    if (objR == sf2.a) {
                        objR = new mx1(Constants.MINIMAL_ERROR_STATUS_CODE);
                        l46Var2.p0(objR);
                    }
                    mx1 mx1Var = (mx1) objR;
                    x4d x4dVarB = a7c.b(20.0f);
                    if (we6.e(l46Var2)) {
                        x4dVarB = y02Var;
                    }
                    boolean zB = if9.B(l46Var2);
                    CharSequence charSequence = useVar.d().c;
                    int length = charSequence.length();
                    boolean z4 = z && i7h.K(length, Constants.MINIMAL_ERROR_STATUS_CODE) <= 20;
                    boolean z5 = z2 && !z && v4e.Q(charSequence);
                    float f2 = we6.e(l46Var2) ? 1.0f : 0.5f;
                    pr4 pr4Var = l8b.a;
                    float f3 = f2;
                    long j2 = ((e8b) l46Var2.k(pr4Var)).z;
                    long jC = zB ? abg.c(352321535) : y72.e;
                    if (!we6.e(l46Var2)) {
                        j2 = jC;
                    }
                    j09 j09VarE = oa7.E(db6.w(j09Var, f3, j2, x4dVarB), x4dVarB);
                    long jC2 = abg.c(zB ? 268435455 : 2063597567);
                    if (we6.e(l46Var2)) {
                        jC2 = y72.j;
                    }
                    j09 j09VarZ = ynb.Z(tm7.o(j09VarE, jC2, y02Var), 24.0f);
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarZ);
                    lf2.q.getClass();
                    l46Var2.j0();
                    boolean z6 = l46Var2.S;
                    ov7 ov7Var2 = LayoutNode.h1;
                    if (z6) {
                        l46Var2.l(ov7Var2);
                    } else {
                        l46Var2.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var2, c92VarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var2, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var2, numValueOf);
                    dec.k(l46Var2);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var2, j09VarJ);
                    g09 g09Var = g09.a;
                    j09 j09VarD = b.c(y7h.n(g09Var, mx1Var), 1.0f).D(new jw7(1.0f, true));
                    mue mueVar = pue.a;
                    int i4 = 0;
                    tv0.b(useVar, j09VarD, z2, mx1Var, mue.a(pue.c(l46Var2), ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), null, null, null, null, null, new dtd(((e8b) l46Var2.k(pr4Var)).q), new m6c(26, charSequence), null, l46Var, (i3 & 14) | 24576 | (i3 & 896), 0, 22472);
                    l46Var2 = l46Var;
                    if (z4) {
                        l46Var2.f0(789275523);
                        i7h.b(length, Constants.MINIMAL_ERROR_STATUS_CODE, ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, g09Var), null, null, l46Var2, 432);
                        l46Var2.r(false);
                        x16Var2 = x16Var;
                        z3 = true;
                    } else if (z5) {
                        l46Var2.f0(789497297);
                        j09 j09VarD2 = b.d(b.c(g09Var, 1.0f), 140.0f);
                        xn8 xn8VarC = s21.c(ndb.f, false);
                        int iHashCode2 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM2 = l46Var2.m();
                        j09 j09VarJ2 = m93.J(l46Var2, j09VarD2);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            ov7Var = ov7Var2;
                            l46Var2.l(ov7Var);
                        } else {
                            ov7Var = ov7Var2;
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, xn8VarC);
                        dec.l(he2Var2, l46Var2, u8aVarM2);
                        ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ2);
                        c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(i4)), ndb.Z, l46Var2, 54);
                        int iHashCode3 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM3 = l46Var2.m();
                        j09 j09VarJ3 = m93.J(l46Var2, g09Var);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, c92VarA2);
                        dec.l(he2Var2, l46Var2, u8aVarM3);
                        ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ3);
                        x16Var2 = x16Var;
                        u(x16Var2, l46Var2, (i3 >> 9) & 14);
                        z3 = true;
                        nte.b(afc.q(R.string.voice_hold_to_talk, l46Var2), null, ((e8b) l46Var2.k(pr4Var)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a, l46Var, 0, 0, 131066);
                        l46Var2 = l46Var;
                        tec.s(l46Var2, true, true, false);
                    } else {
                        x16Var2 = x16Var;
                        z3 = true;
                        l46Var2.f0(790032574);
                        l46Var2.r(false);
                    }
                    l46Var2.r(z3);
                } else {
                    x16Var2 = x16Var;
                    l46Var2.Z();
                }
                ojb ojbVarV = l46Var2.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new z50(useVar, z, z2, x16Var2, j09Var, i2, 6);
                }
            }

            public static final void y(boolean z, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i2) {
                int i3;
                l46Var.h0(1598713028);
                if ((i2 & 6) == 0) {
                    i3 = (l46Var.h(z) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= l46Var.i(x16Var) ? 32 : 16;
                }
                if ((i2 & 384) == 0) {
                    i3 |= l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                if ((i2 & 3072) == 0) {
                    i3 |= l46Var.i(x16Var3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
                    nae.a(null, null, 0L, 0L, 0.0f, 0.0f, null, af1.b0(223231817, new hk8(z, x16Var, x16Var2, x16Var3), l46Var), l46Var, 12582912, 127);
                } else {
                    l46Var.Z();
                }
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new vg4(z, x16Var, x16Var2, x16Var3, i2, 1);
                }
            }

            public static final void z(j09 j09Var, QuotaBlockReason quotaBlockReason, x16 x16Var, l46 l46Var, int i2) {
                l46 l46Var2;
                j09 j09Var2;
                x16Var.getClass();
                l46Var.h0(1826910565);
                int i3 = i2 | 6 | (l46Var.e(quotaBlockReason == null ? -1 : quotaBlockReason.ordinal()) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                int i4 = 1;
                if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
                    bx9 bx9VarQ = ynb.q(24.0f, 0.0f, 2);
                    dd2 dd2VarB0 = af1.b0(22087078, new av9(quotaBlockReason, x16Var, i4), l46Var);
                    g09 g09Var = g09.a;
                    l46Var2 = l46Var;
                    jgb.C(g09Var, false, bx9VarQ, dd2VarB0, l46Var2, 3462, 2);
                    j09Var2 = g09Var;
                } else {
                    l46Var2 = l46Var;
                    l46Var2.Z();
                    j09Var2 = j09Var;
                }
                ojb ojbVarV = l46Var2.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new o7b(i2, j09Var2, quotaBlockReason, x16Var, 1);
                }
            }

            public abstract void C(ea1 ea1Var);

            public abstract void D(x8c x8cVar, Object obj);

            public abstract void I(ea1 ea1Var, ea1 ea1Var2);

            public abstract boolean J(c1b c1bVar);

            public abstract String L();

            public abstract Object O(c1b c1bVar);

            public void U(q8c q8cVar, Object obj) {
                x8c x8cVarW0 = q8cVar.W0(L());
                try {
                    D(x8cVarW0, obj);
                    x8cVarW0.R0();
                    cgg.t(x8cVarW0, null);
                    r8c.h(q8cVar);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        cgg.t(x8cVarW0, th);
                        throw th2;
                    }
                }
            }

            public void e0(ea1 ea1Var, Collection collection) {
                ea1Var.getClass();
                ea1Var.Y(collection);
            }
        }

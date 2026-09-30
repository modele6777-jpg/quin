package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Size;
import android.view.KeyEvent;
import android.view.View;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import io.sentry.android.sqlite.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import tech.chatmind.api.EmotionTheme;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class eu4 implements h1b, yb3, f1b, g9e, nw2, lwa, fy2 {
    public final /* synthetic */ int a;

    public eu4() {
        this.a = 13;
        ey6 ey6Var = jy6.b;
        yob yobVar = yob.e;
    }

    public static yt9 b(int i, int i2, af8 af8Var, zt9 zt9Var, au9 au9Var, bu9 bu9Var, cu9 cu9Var, Size size, String str) {
        af8 af8Var2 = af8.M0;
        af8 af8Var3 = (i2 & 8) != 0 ? af8Var2 : af8Var;
        zt9 zt9Var2 = (i2 & 64) != 0 ? null : zt9Var;
        bu9 bu9Var2 = (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : bu9Var;
        cu9 cu9Var2 = (i2 & 256) != 0 ? null : cu9Var;
        size.getClass();
        af8 af8Var4 = af8.O0;
        pu4 pu4Var = pu4.a;
        if (af8Var3 == af8Var4 || af8Var3 == af8.N0 || ((af8Var3 == af8.Q0 || af8Var3 == af8.R0) && Build.VERSION.SDK_INT >= 35)) {
            return new wt9(size, i, str, af8Var3, au9Var, zt9Var2, bu9Var2, cu9Var2, pu4Var);
        }
        if (af8Var3 == af8Var2) {
            return new xt9(size, i, str, au9Var, zt9Var2, bu9Var2, cu9Var2, pu4Var);
        }
        qc0.p("Check failed.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static v71 d(tjd tjdVar, d5 d5Var, int i, i7f i7fVar, boolean z, boolean z2) {
        u09 u09VarN;
        Boolean bool;
        j7f j7fVarC0;
        Boolean bool2;
        sug sugVar;
        dzd dzdVarK;
        ?? r3 = 0;
        i7f i7fVar2 = i7f.c;
        byte b = i7fVar != i7fVar2;
        byte b2 = (z2 && z) ? false : true;
        Object obj = null;
        if (b != true && tjdVar.Z().isEmpty()) {
            return new v71(null, 1, false);
        }
        y22 y22VarM = tjdVar.c0().m();
        if (y22VarM == null) {
            return new v71(null, 1, false);
        }
        wf7 wf7Var = (wf7) d5Var.d(Integer.valueOf(i));
        j10 j10Var = s7f.a;
        if (i7fVar == i7fVar2 || !(y22VarM instanceof u09)) {
            u09VarN = null;
        } else if (wf7Var.b == h69.a && i7fVar == i7f.a) {
            u09 u09Var = (u09) y22VarM;
            String str = qf7.a;
            ex5 ex5VarF = oz3.f(u09Var);
            HashMap map = qf7.j;
            if (map.containsKey(ex5VarF)) {
                dx5 dx5Var = (dx5) map.get(oz3.f(u09Var));
                if (dx5Var == null) {
                    r3.m(u09Var, " is not a mutable collection", "Given class ");
                    return null;
                }
                u09VarN = qz3.e(u09Var).j(dx5Var);
            } else if (wf7Var.b == h69.b) {
                u09VarN = null;
            } else {
                u09VarN = null;
            }
        } else if (wf7Var.b == h69.b || i7fVar != i7f.b) {
            u09VarN = null;
        } else {
            u09 u09Var2 = (u09) y22VarM;
            String str2 = qf7.a;
            if (qf7.k.containsKey(oz3.f(u09Var2))) {
                u09VarN = af8.n(u09Var2);
            } else {
                u09VarN = null;
            }
        }
        if (i7fVar == i7fVar2) {
            bool = null;
        } else {
            vj9 vj9Var = wf7Var.a;
            int i2 = vj9Var == null ? -1 : r7f.a[vj9Var.ordinal()];
            if (i2 == 1) {
                bool = Boolean.TRUE;
            } else if (i2 != 2) {
                bool = null;
            } else {
                bool = Boolean.FALSE;
            }
        }
        if (u09VarN == null || (j7fVarC0 = u09VarN.h()) == null) {
            j7fVarC0 = tjdVar.c0();
        }
        int i3 = i + 1;
        List listZ = tjdVar.Z();
        List parameters = j7fVarC0.getParameters();
        parameters.getClass();
        Iterator it = listZ.iterator();
        Iterator it2 = parameters.iterator();
        ArrayList arrayList = new ArrayList(Math.min(t72.u(listZ, 10), t72.u(parameters, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            c8f c8fVar = (c8f) it2.next();
            i8f i8fVar = (i8f) next;
            int i4 = 8;
            if (b2 == true) {
                bool2 = bool;
                if (!i8fVar.c()) {
                    sugVar = e(i8fVar.b().k0(), d5Var, i3, z2);
                } else if (((wf7) d5Var.d(Integer.valueOf(i3))).a == vj9.a) {
                    jgf jgfVarK0 = i8fVar.b().k0();
                    sugVar = new sug(rxg.E(pa7.Z(jgfVarK0).l0(r3), pa7.j0(jgfVarK0).l0(true)), 1, 8);
                } else {
                    sugVar = new sug((Object) null, 1, i4);
                }
            } else {
                bool2 = bool;
                sugVar = new sug(obj, (int) r3, i4);
            }
            i3 += sugVar.b;
            tt7 tt7Var = (tt7) sugVar.c;
            if (tt7Var != null) {
                dsf dsfVarA = i8fVar.a();
                dsfVarA.getClass();
                dzdVarK = o7c.m(tt7Var, dsfVarA, c8fVar);
            } else if (u09VarN == null || i8fVar.c()) {
                dzdVarK = u09VarN != null ? w8f.k(c8fVar) : null;
            } else {
                tt7 tt7VarB = i8fVar.b();
                tt7VarB.getClass();
                dsf dsfVarA2 = i8fVar.a();
                dsfVarA2.getClass();
                dzdVarK = o7c.m(tt7VarB, dsfVarA2, c8fVar);
            }
            arrayList.add(dzdVarK);
            bool = bool2;
            r3 = 0;
            obj = null;
        }
        Boolean bool3 = bool;
        int i5 = i3 - i;
        if (u09VarN == null && bool3 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (((i8f) it3.next()) == null);
            }
            return new v71(null, i5, false);
        }
        h10 annotations = tjdVar.getAnnotations();
        j10 j10Var2 = s7f.b;
        if (u09VarN == null) {
            j10Var2 = null;
        }
        j10 j10Var3 = s7f.a;
        if (bool3 == null) {
            j10Var3 = null;
        }
        boolean z3 = true;
        List listK0 = qd0.k0(new h10[]{annotations, j10Var2, j10Var3});
        int size = ((ArrayList) listK0).size();
        if (size == 0) {
            qc0.p("At least one Annotations object expected");
            return null;
        }
        e7f e7fVarR = jzb.r(size != 1 ? new j10(z3 ? 1 : 0, s72.j1(listK0)) : (h10) s72.X0(listK0));
        List listZ2 = tjdVar.Z();
        Iterator it4 = arrayList.iterator();
        Iterator it5 = listZ2.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(t72.u(arrayList, 10), t72.u(listZ2, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            i8f i8fVar2 = (i8f) it5.next();
            i8f i8fVar3 = (i8f) next2;
            if (i8fVar3 != null) {
                i8fVar2 = i8fVar3;
            }
            arrayList2.add(i8fVar2);
        }
        tjd tjdVarT = rxg.T(e7fVarR, j7fVarC0, arrayList2, bool3 != null ? bool3.booleanValue() : tjdVar.i0());
        if (wf7Var.c) {
            tjdVarT = new zg9(tjdVarT);
        }
        return new v71(tjdVarT, i5, bool3 != null && wf7Var.d);
    }

    public static sug e(jgf jgfVar, d5 d5Var, int i, boolean z) {
        jgf jgfVarE;
        tjd tjdVar;
        int i2 = 8;
        Object objT = null;
        if (i7h.x(jgfVar)) {
            return new sug(objT, 1, i2);
        }
        if (!(jgfVar instanceof bj5)) {
            if (!(jgfVar instanceof tjd)) {
                ap.c();
                return null;
            }
            v71 v71VarD = d((tjd) jgfVar, d5Var, i, i7f.c, false, z);
            boolean z2 = v71VarD.a;
            tt7 tt7VarT = (tjd) v71VarD.c;
            if (z2) {
                tt7VarT = q7c.t(jgfVar, tt7VarT);
            }
            return new sug(tt7VarT, v71VarD.b, i2);
        }
        boolean z3 = jgfVar instanceof mdb;
        bj5 bj5Var = (bj5) jgfVar;
        tjd tjdVar2 = bj5Var.c;
        tjd tjdVar3 = bj5Var.b;
        v71 v71VarD2 = d(tjdVar3, d5Var, i, i7f.a, z3, z);
        v71 v71VarD3 = d(bj5Var.c, d5Var, i, i7f.b, z3, z);
        tjd tjdVar4 = (tjd) v71VarD3.c;
        tjd tjdVar5 = (tjd) v71VarD2.c;
        if (tjdVar5 != null || tjdVar4 != null) {
            if (v71VarD2.a || v71VarD3.a) {
                if (tjdVar4 != null) {
                    if (tjdVar5 == null) {
                        tjdVar5 = tjdVar4;
                    }
                    jgfVarE = rxg.E(tjdVar5, tjdVar4);
                } else {
                    tjdVar5.getClass();
                    jgfVarE = tjdVar5;
                }
                objT = q7c.t(jgfVar, jgfVarE);
            } else if (z3) {
                tjd tjdVar6 = tjdVar5;
                if (tjdVar5 == null) {
                }
                if (tjdVar4 != null) {
                    tjdVar6 = tjdVar3;
                    tjdVar2 = tjdVar4;
                }
                tjdVar6 = tjdVar3;
                objT = new mdb(tjdVar6, tjdVar2);
            } else {
                if (tjdVar5 == null) {
                }
                if (tjdVar4 != null) {
                    tjdVar = tjdVar3;
                    tjdVar2 = tjdVar4;
                }
                tjdVar = tjdVar3;
                objT = rxg.E(tjdVar, tjdVar2);
            }
        }
        return new sug(objT, v71VarD2.b, i2);
    }

    public static wnc f(String str) {
        Object next;
        str.getClass();
        mx4 mx4Var = wnc.c;
        mx4Var.getClass();
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            next = l2Var.next();
            if (pa7.t(((wnc) next).a(), str)) {
                return (wnc) next;
            }
        }
        next = null;
        return (wnc) next;
    }

    public static vd9 i(ng1 ng1Var, hc2 hc2Var) {
        lb5 lb5VarY;
        m6c m6cVar = new m6c(12, ng1Var);
        List list = (List) hc2Var.e;
        b21.q("ResolvedFeatureGroup", "resolveFeatureGroup: sessionConfig = " + hc2Var + ", lensFacing = " + ng1Var.m());
        Set set = (Set) hc2Var.d;
        if (set.isEmpty() && list.isEmpty()) {
            return null;
        }
        List list2 = (List) hc2Var.f;
        if (set.isEmpty() && list.isEmpty()) {
            qc0.j("Must have at least one required or preferred feature");
            return null;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                oif oifVar = (oif) it.next();
                mkf.a.getClass();
                if (g3e.j(oifVar) == mkf.UNDEFINED) {
                    lb5VarY = new jb5(oifVar);
                    break;
                }
            } else {
                Iterator it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            kb5 kb5VarC = m6c.C((gf6) obj, list2);
                            if (kb5VarC != null) {
                                b21.q("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + kb5VarC);
                            } else {
                                kb5VarC = null;
                            }
                            if (kb5VarC == null) {
                                arrayList.add(obj);
                            }
                        }
                        b21.q("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
                        lb5VarY = m6cVar.y(hc2Var, arrayList, 0, pu4.a);
                        break;
                    }
                    kb5 kb5VarC2 = m6c.C((gf6) it2.next(), list2);
                    if (kb5VarC2 != null) {
                        lb5VarY = kb5VarC2;
                        break;
                    }
                }
            }
        }
        if (lb5VarY instanceof hb5) {
            vd9 vd9Var = ((hb5) lb5VarY).a;
            b21.q("ResolvedFeatureGroup", "resolvedFeatureGroup = " + vd9Var);
            return vd9Var;
        }
        if (lb5VarY instanceof ib5) {
            qc0.j("Feature group is not supported");
            return null;
        }
        if (lb5VarY instanceof jb5) {
            throw new IllegalArgumentException(((jb5) lb5VarY).a + " is not supported");
        }
        if (!(lb5VarY instanceof kb5)) {
            ap.c();
            return null;
        }
        kb5 kb5Var = (kb5) lb5VarY;
        yg5.q(" must be added for ", kb5Var.b, kb5Var.a);
        return null;
    }

    public static String j() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (pa7.t(language, "zh") && pa7.t(country, "TW")) {
            return "zh-TW";
        }
        if (pa7.t(language, "zh") && pa7.t(country, "HK")) {
            return "zh-TW";
        }
        if (pa7.t(language, "zh")) {
            return "zh-CN";
        }
        if (pa7.t(language, "ja")) {
            return "ja";
        }
        if (pa7.t(language, "ko")) {
            return "ko";
        }
        return pa7.t(language, "es") ? "es" : "en";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    public static EmotionTheme l(String str) {
        EmotionTheme emotionTheme;
        str.getClass();
        switch (str) {
            case "tension":
                emotionTheme = EmotionTheme.TENSION;
                break;
            case "joy":
                emotionTheme = EmotionTheme.JOY;
                break;
            case "calm":
                emotionTheme = EmotionTheme.CALM;
                break;
            case "worry":
                emotionTheme = EmotionTheme.WORRY;
                break;
            case "__unknown__":
                emotionTheme = EmotionTheme.UNKNOWN;
                break;
            default:
                emotionTheme = null;
                break;
        }
        return emotionTheme == null ? EmotionTheme.TENSION : emotionTheme;
    }

    @Override // defpackage.g9e
    public h9e a(xs6 xs6Var) {
        return l.b(new lz5((Context) xs6Var.c, (String) xs6Var.e, (sug) xs6Var.d, xs6Var.a, xs6Var.b));
    }

    public void g(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Override // defpackage.h1b
    public Object get() {
        switch (this.a) {
            case 1:
                return new dd7(2, Executors.newSingleThreadExecutor());
            default:
                return yxe.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0221  */
    /* JADX WARN: Code duplicated, block: B:156:0x0255  */
    /* JADX WARN: Code duplicated, block: B:159:0x0260  */
    /* JADX WARN: Code duplicated, block: B:169:0x0284  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:84:0x0132  */
    public lo7 h(KeyEvent keyEvent) {
        lo7 lo7Var;
        lo7 lo7Var2;
        lo7 lo7Var3;
        int iA = ym8.A(keyEvent);
        int i = ok8.E;
        lo7 lo7Var4 = null;
        if (iA == 9) {
            long jG = k99.g(keyEvent.getKeyCode());
            if (ko7.a(jG, ko7.f)) {
                lo7Var = lo7.e1;
            } else if (ko7.a(jG, ko7.g)) {
                lo7Var = lo7.f1;
            } else if (ko7.a(jG, ko7.d)) {
                lo7Var = lo7.W0;
            } else if (ko7.a(jG, ko7.e)) {
                lo7Var = lo7.X0;
            } else {
                lo7Var = null;
            }
        } else if (iA == 1) {
            long jG2 = k99.g(keyEvent.getKeyCode());
            if (ko7.a(jG2, ko7.f)) {
                lo7Var = lo7.w;
            } else if (ko7.a(jG2, ko7.g)) {
                lo7Var = lo7.x;
            } else if (ko7.a(jG2, ko7.d)) {
                lo7Var = lo7.E0;
            } else if (ko7.a(jG2, ko7.e)) {
                lo7Var = lo7.F0;
            } else if (ko7.a(jG2, ko7.s)) {
                lo7Var = lo7.N0;
            } else {
                lo7Var = null;
            }
        } else {
            lo7Var = null;
        }
        if (lo7Var != null) {
            return lo7Var;
        }
        int i2 = ok8.F;
        int iA2 = ym8.A(keyEvent);
        long jG3 = k99.g(keyEvent.getKeyCode());
        boolean zA = ko7.a(jG3, ko7.s);
        lo7 lo7Var5 = lo7.h1;
        lo7 lo7Var6 = lo7.J0;
        if (zA) {
            if (iA2 == 0 || iA2 == 8) {
                lo7Var2 = lo7Var6;
            } else {
                int i3 = ok8.G;
                if (iA2 == 12) {
                    lo7Var2 = lo7Var6;
                } else if (iA2 == 2 || iA2 == 10) {
                    lo7Var2 = lo7.L0;
                } else {
                    lo7Var2 = null;
                }
            }
        } else if ((ko7.a(jG3, ko7.r) || ko7.a(jG3, ko7.E)) && (iA2 == 0 || iA2 == 8 || iA2 == 2 || iA2 == 10)) {
            lo7Var2 = lo7Var5;
        } else {
            lo7Var2 = null;
        }
        if (lo7Var2 != null) {
            return lo7Var2;
        }
        int iA3 = ym8.A(keyEvent);
        lo7 lo7Var7 = lo7.c1;
        lo7 lo7Var8 = lo7.d1;
        if (iA3 == 10) {
            long jG4 = k99.g(keyEvent.getKeyCode());
            if (ko7.a(jG4, ko7.f) || ko7.a(jG4, ko7.H)) {
                lo7Var3 = lo7.Y0;
            } else if (ko7.a(jG4, ko7.g) || ko7.a(jG4, ko7.I)) {
                lo7Var3 = lo7.Z0;
            } else if (ko7.a(jG4, ko7.d) || ko7.a(jG4, ko7.F)) {
                lo7Var3 = lo7.b1;
            } else if (ko7.a(jG4, ko7.e) || ko7.a(jG4, ko7.G)) {
                lo7Var3 = lo7.a1;
            } else {
                lo7Var3 = null;
            }
        } else if (iA3 == 2) {
            long jG5 = k99.g(keyEvent.getKeyCode());
            if (ko7.a(jG5, ko7.f) || ko7.a(jG5, ko7.H)) {
                lo7Var3 = lo7.d;
            } else if (ko7.a(jG5, ko7.g) || ko7.a(jG5, ko7.I)) {
                lo7Var3 = lo7.c;
            } else if (ko7.a(jG5, ko7.d) || ko7.a(jG5, ko7.F)) {
                lo7Var3 = lo7.f;
            } else if (ko7.a(jG5, ko7.e) || ko7.a(jG5, ko7.G)) {
                lo7Var3 = lo7.e;
            } else if (ko7.a(jG5, ko7.k)) {
                lo7Var3 = lo7Var6;
            } else if (ko7.a(jG5, ko7.t)) {
                lo7Var3 = lo7.M0;
            } else if (ko7.a(jG5, ko7.B)) {
                lo7Var3 = lo7.g1;
            } else {
                lo7Var3 = null;
            }
        } else if (iA3 == 8) {
            long jG6 = k99.g(keyEvent.getKeyCode());
            if (ko7.a(jG6, ko7.v) || ko7.a(jG6, ko7.J)) {
                lo7Var3 = lo7Var7;
            } else if (ko7.a(jG6, ko7.w) || ko7.a(jG6, ko7.K)) {
                lo7Var3 = lo7Var8;
            } else {
                lo7Var3 = null;
            }
        } else if (iA3 == 1 && ko7.a(k99.g(keyEvent.getKeyCode()), ko7.t)) {
            lo7Var3 = lo7.O0;
        } else {
            lo7Var3 = null;
        }
        if (lo7Var3 != null) {
            return lo7Var3;
        }
        Object obj = so7.a.b;
        int iA4 = ym8.A(keyEvent);
        lo7 lo7Var9 = lo7.k1;
        if (iA4 != 10) {
            lo7 lo7Var10 = lo7.G0;
            lo7 lo7Var11 = lo7.I0;
            lo7 lo7Var12 = lo7.H0;
            if (iA4 == 2) {
                long jG7 = k99.g(keyEvent.getKeyCode());
                if (ko7.a(jG7, ko7.j) || ko7.a(jG7, ko7.x) || ko7.a(jG7, ko7.N)) {
                    lo7Var4 = lo7Var10;
                } else if (ko7.a(jG7, ko7.l)) {
                    lo7Var4 = lo7Var12;
                } else if (ko7.a(jG7, ko7.m)) {
                    lo7Var4 = lo7Var11;
                } else if (ko7.a(jG7, ko7.i)) {
                    lo7Var4 = lo7.P0;
                } else if (ko7.a(jG7, ko7.n)) {
                    lo7Var4 = lo7Var9;
                } else if (ko7.a(jG7, ko7.o)) {
                    lo7Var4 = lo7.j1;
                }
            } else if (iA4 == 8) {
                long jG8 = k99.g(keyEvent.getKeyCode());
                if (ko7.a(jG8, ko7.f) || ko7.a(jG8, ko7.H)) {
                    lo7Var4 = lo7.Q0;
                } else if (ko7.a(jG8, ko7.g) || ko7.a(jG8, ko7.I)) {
                    lo7Var4 = lo7.R0;
                } else if (ko7.a(jG8, ko7.d) || ko7.a(jG8, ko7.F)) {
                    lo7Var4 = lo7.S0;
                } else if (ko7.a(jG8, ko7.e) || ko7.a(jG8, ko7.G)) {
                    lo7Var4 = lo7.T0;
                } else if (ko7.a(jG8, ko7.C) || ko7.a(jG8, ko7.L)) {
                    lo7Var4 = lo7.U0;
                } else if (ko7.a(jG8, ko7.D) || ko7.a(jG8, ko7.M)) {
                    lo7Var4 = lo7.V0;
                } else if (ko7.a(jG8, ko7.v) || ko7.a(jG8, ko7.J)) {
                    lo7Var4 = lo7Var7;
                } else if (ko7.a(jG8, ko7.w) || ko7.a(jG8, ko7.K)) {
                    lo7Var4 = lo7Var8;
                } else if (ko7.a(jG8, ko7.x) || ko7.a(jG8, ko7.N)) {
                    lo7Var4 = lo7Var12;
                }
            } else if (iA4 == 0) {
                long jG9 = k99.g(keyEvent.getKeyCode());
                if (ko7.a(jG9, ko7.f) || ko7.a(jG9, ko7.H)) {
                    lo7Var4 = lo7.a;
                } else if (ko7.a(jG9, ko7.g) || ko7.a(jG9, ko7.I)) {
                    lo7Var4 = lo7.b;
                } else if (ko7.a(jG9, ko7.d) || ko7.a(jG9, ko7.F)) {
                    lo7Var4 = lo7.y;
                } else if (ko7.a(jG9, ko7.e) || ko7.a(jG9, ko7.G)) {
                    lo7Var4 = lo7.z;
                } else if (ko7.a(jG9, ko7.h)) {
                    lo7Var4 = lo7.X;
                } else if (ko7.a(jG9, ko7.C) || ko7.a(jG9, ko7.L)) {
                    lo7Var4 = lo7.Y;
                } else if (ko7.a(jG9, ko7.D) || ko7.a(jG9, ko7.M)) {
                    lo7Var4 = lo7.Z;
                } else if (ko7.a(jG9, ko7.v) || ko7.a(jG9, ko7.J)) {
                    lo7Var4 = lo7.g;
                } else if (ko7.a(jG9, ko7.w) || ko7.a(jG9, ko7.K)) {
                    lo7Var4 = lo7.v;
                } else if (ko7.a(jG9, ko7.r) || ko7.a(jG9, ko7.E)) {
                    lo7Var4 = lo7Var5;
                } else if (ko7.a(jG9, ko7.s)) {
                    lo7Var4 = lo7Var6;
                } else if (ko7.a(jG9, ko7.t)) {
                    lo7Var4 = lo7.K0;
                } else if (ko7.a(jG9, ko7.A)) {
                    lo7Var4 = lo7Var12;
                } else if (ko7.a(jG9, ko7.y)) {
                    lo7Var4 = lo7Var11;
                } else if (ko7.a(jG9, ko7.z)) {
                    lo7Var4 = lo7Var10;
                } else if (ko7.a(jG9, ko7.p)) {
                    lo7Var4 = lo7.i1;
                }
            }
        } else if (ko7.a(k99.g(keyEvent.getKeyCode()), ko7.o)) {
            lo7Var4 = lo7Var9;
        }
        return lo7Var4;
    }

    @Override // defpackage.yb3
    public ac3 l0() {
        return new gd5(false);
    }

    @Override // defpackage.lwa
    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.lwa
    public void n(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            b1.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    public String toString() {
        switch (this.a) {
            case 25:
                int iHashCode = hashCode();
                tq.o(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return tec.m("CreationExtras.Key@", string, "<", job.a.b(kdc.class).r(), ">");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ eu4(int i) {
        this.a = i;
    }

    @Override // defpackage.nw2
    public Object c(mw2 mw2Var) throws mw2 {
        throw mw2Var;
    }

    public void k(ila ilaVar, int i, int i2) {
    }
}

package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import com.google.firebase.crashlytics.BuildConfig;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.xmind.donut.common.utils.ShareTargetChosenReceiver;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m7c {
    public static final ub9 a(nyc nycVar, Map map) {
        Object next;
        ub9 ub9Var;
        boolean zEquals;
        Iterator it = map.keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            yn7 yn7Var = (yn7) next;
            nycVar.getClass();
            yn7Var.getClass();
            if (nycVar.c() != yn7Var.o()) {
                zEquals = false;
            } else {
                hzc hzcVar = izc.a;
                hzcVar.getClass();
                xn7 xn7VarN = hfc.n(hzcVar, yn7Var, false);
                if (xn7VarN == null) {
                    r82.e(nycVar.a(), "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.", "Cannot find KSerializer for [");
                    return null;
                }
                zEquals = nycVar.equals(xn7VarN.e());
            }
        } while (!zEquals);
        yn7 yn7Var2 = (yn7) next;
        ub9 s87Var = yn7Var2 != null ? (ub9) map.get(yn7Var2) : null;
        if (s87Var == null) {
            s87Var = null;
        }
        kaf kafVar = kaf.r;
        if (s87Var == null) {
            nycVar.getClass();
            switch (xo1.P(nycVar).ordinal()) {
                case 0:
                    ub9Var = ub9.b;
                    s87Var = ub9Var;
                    break;
                case 1:
                    ub9Var = lmg.k;
                    s87Var = ub9Var;
                    break;
                case 2:
                    ub9Var = ub9.k;
                    s87Var = ub9Var;
                    break;
                case 3:
                    ub9Var = lmg.l;
                    s87Var = ub9Var;
                    break;
                case 4:
                    ub9Var = lmg.m;
                    s87Var = ub9Var;
                    break;
                case 5:
                    ub9Var = lmg.n;
                    s87Var = ub9Var;
                    break;
                case 6:
                    ub9Var = ub9.h;
                    s87Var = ub9Var;
                    break;
                case 7:
                    ub9Var = lmg.o;
                    s87Var = ub9Var;
                    break;
                case 8:
                    ub9Var = ub9.e;
                    s87Var = ub9Var;
                    break;
                case 9:
                    ub9Var = lmg.p;
                    s87Var = ub9Var;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    ub9Var = lmg.q;
                    s87Var = ub9Var;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    ub9Var = ub9.n;
                    s87Var = ub9Var;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    ub9Var = ub9.c;
                    s87Var = ub9Var;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    ub9Var = ub9.l;
                    s87Var = ub9Var;
                    break;
                case 14:
                    ub9Var = lmg.t;
                    s87Var = ub9Var;
                    break;
                case 15:
                    ub9Var = ub9.i;
                    s87Var = ub9Var;
                    break;
                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                    ub9Var = ub9.f;
                    s87Var = ub9Var;
                    break;
                case 17:
                    int iOrdinal = xo1.P(nycVar.i(0)).ordinal();
                    if (iOrdinal == 10) {
                        ub9Var = ub9.o;
                    } else if (iOrdinal != 11) {
                        s87Var = kafVar;
                    } else {
                        ub9Var = lmg.r;
                    }
                    s87Var = ub9Var;
                    break;
                case 18:
                    int iOrdinal2 = xo1.P(nycVar.i(0)).ordinal();
                    if (iOrdinal2 == 0) {
                        ub9Var = ub9.d;
                    } else if (iOrdinal2 == 2) {
                        ub9Var = ub9.m;
                    } else if (iOrdinal2 == 4) {
                        ub9Var = lmg.u;
                    } else if (iOrdinal2 == 6) {
                        ub9Var = ub9.j;
                    } else if (iOrdinal2 == 8) {
                        ub9Var = ub9.g;
                    } else if (iOrdinal2 == 19) {
                        s87Var = new s87(qk2.C(nycVar.i(0)));
                    } else if (iOrdinal2 == 10) {
                        ub9Var = ub9.p;
                    } else if (iOrdinal2 != 11) {
                        s87Var = kafVar;
                    } else {
                        ub9Var = lmg.s;
                    }
                    s87Var = ub9Var;
                    break;
                case 19:
                    Class clsC = qk2.C(nycVar);
                    if (Parcelable.class.isAssignableFrom(clsC)) {
                        s87Var = new sb9(clsC);
                    } else if (Enum.class.isAssignableFrom(clsC)) {
                        s87Var = new rb9(clsC);
                    } else {
                        s87Var = Serializable.class.isAssignableFrom(clsC) ? new tb9(clsC) : null;
                    }
                    if (s87Var == null) {
                        s87Var = kafVar;
                    }
                    break;
                case 20:
                    Class clsC2 = qk2.C(nycVar);
                    s87Var = !Enum.class.isAssignableFrom(clsC2) ? kafVar : new t87(clsC2);
                    break;
                default:
                    s87Var = kafVar;
                    break;
            }
        }
        if (s87Var.equals(kafVar)) {
            return null;
        }
        return s87Var;
    }

    public static final x8f b(dsf dsfVar) {
        int iOrdinal = dsfVar.ordinal();
        if (iOrdinal == 0) {
            return x8f.INV;
        }
        if (iOrdinal == 1) {
            return x8f.IN;
        }
        if (iOrdinal == 2) {
            return x8f.OUT;
        }
        ap.c();
        return null;
    }

    public static final List c(List list, TarotSkinIdentify tarotSkinIdentify) {
        list.getClass();
        tarotSkinIdentify.getClass();
        if (list.isEmpty()) {
            return list;
        }
        int size = list.size();
        int iIndexOf = list.indexOf(tarotSkinIdentify);
        if (iIndexOf < 0) {
            iIndexOf = 0;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Integer.valueOf(iIndexOf));
        int i = 1;
        while (linkedHashSet.size() < size) {
            linkedHashSet.add(Integer.valueOf((iIndexOf + i) % size));
            linkedHashSet.add(Integer.valueOf(((iIndexOf - i) + size) % size));
            i++;
        }
        ArrayList arrayList = new ArrayList(t72.u(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add((TarotSkinIdentify) list.get(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static final int e(xn7 xn7Var) {
        int iHashCode = xn7Var.e().a().hashCode();
        int iE = xn7Var.e().e();
        for (int i = 0; i < iE; i++) {
            iHashCode = (iHashCode * 31) + xn7Var.e().f(i).hashCode();
        }
        return iHashCode;
    }

    public static final String f(Object obj, LinkedHashMap linkedHashMap) {
        obj.getClass();
        xn7 xn7VarL = hfc.l(job.a.b(obj.getClass()));
        h7c h7cVar = new h7c(xn7VarL, linkedHashMap);
        xn7VarL.a(h7cVar, obj);
        Map mapX = bm8.X(h7cVar.A);
        kxa kxaVar = new kxa(xn7VarL);
        s19 s19Var = new s19(8, mapX, kxaVar);
        int iE = xn7VarL.e().e();
        for (int i = 0; i < iE; i++) {
            String strF = xn7VarL.e().f(i);
            ub9 ub9Var = (ub9) linkedHashMap.get(strF);
            if (ub9Var == null) {
                ho7.j(ks0.g(']', "Cannot locate NavType for argument [", strF));
                return null;
            }
            s19Var.m(Integer.valueOf(i), strF, ub9Var);
        }
        return ((String) kxaVar.b) + ((String) kxaVar.c) + ((String) kxaVar.d);
    }

    public static final String g(c36 c36Var) {
        t99 t99Var;
        ea1 ea1VarH = xr7.A(c36Var) ? h(c36Var) : null;
        if (ea1VarH != null) {
            ea1 ea1VarI = qz3.i(ea1VarH);
            if (ea1VarI instanceof wxa) {
                xr7.A(ea1VarI);
                ea1 ea1VarB = qz3.b(qz3.i(ea1VarI), zo1.g);
                if (ea1VarB != null && (t99Var = (t99) p51.a.get(qz3.g(ea1VarB))) != null) {
                    return t99Var.b();
                }
            } else if (ea1VarI instanceof hjd) {
                int i = n51.l;
                LinkedHashMap linkedHashMap = qud.i;
                String strR = xo1.r((hjd) ea1VarI);
                t99 t99Var2 = strR == null ? null : (t99) linkedHashMap.get(strR);
                if (t99Var2 != null) {
                    return t99Var2.b();
                }
            }
        }
        return null;
    }

    public static final ea1 h(ea1 ea1Var) {
        ea1Var.getClass();
        if (!qud.j.contains(ea1Var.getName()) && !p51.d.contains(qz3.i(ea1Var).getName())) {
            return null;
        }
        if ((ea1Var instanceof wxa) || (ea1Var instanceof uxa)) {
            return qz3.b(ea1Var, vic.F0);
        }
        if (ea1Var instanceof hjd) {
            return qz3.b(ea1Var, vic.G0);
        }
        return null;
    }

    public static final ea1 i(ea1 ea1Var) {
        ea1Var.getClass();
        ea1 ea1VarH = h(ea1Var);
        if (ea1VarH != null) {
            return ea1VarH;
        }
        int i = o51.l;
        t99 name = ea1Var.getName();
        name.getClass();
        if (qud.e.contains(name)) {
            return qz3.b(ea1Var, vic.H0);
        }
        return null;
    }

    public static cpa j(y90 y90Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new cpa(s.K(y90Var));
        }
        TextPaint textPaint = new TextPaint(y90Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = y90Var.getBreakStrategy();
        int hyphenationFrequency = y90Var.getHyphenationFrequency();
        if (y90Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (y90Var.getInputType() & 15) != 3) {
            boolean z = y90Var.getLayoutDirection() == 1;
            switch (y90Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(s.u(DecimalFormatSymbols.getInstance(y90Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new cpa(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static final boolean k(u09 u09Var, ea1 ea1Var) {
        u09Var.getClass();
        ea1Var.getClass();
        bm3 bm3VarK = ea1Var.k();
        bm3VarK.getClass();
        tjd tjdVarS = ((u09) bm3VarK).S();
        tjdVarS.getClass();
        for (u09 u09VarI = oz3.i(u09Var); u09VarI != null; u09VarI = oz3.i(u09VarI)) {
            if (!(u09VarI instanceof rx7)) {
                tjd tjdVarS2 = u09VarI.S();
                if (tjdVarS2 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"));
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                jgf jgfVarH = null;
                arrayDeque.add(new i8e(tjdVarS2, null));
                j7f j7fVarC0 = tjdVarS.c0();
                while (!arrayDeque.isEmpty()) {
                    i8e i8eVar = (i8e) arrayDeque.poll();
                    tt7 tt7VarF = i8eVar.a;
                    j7f j7fVarC1 = tt7VarF.c0();
                    if (j7fVarC1 == null) {
                        q1c.a(3);
                        throw null;
                    }
                    if (j7fVarC0 == null) {
                        q1c.a(4);
                        throw null;
                    }
                    if (j7fVarC1.equals(j7fVarC0)) {
                        boolean zI0 = tt7VarF.i0();
                        for (i8e i8eVar2 = i8eVar.b; i8eVar2 != null; i8eVar2 = i8eVar2.b) {
                            tt7 tt7Var = i8eVar2.a;
                            List listZ = tt7Var.Z();
                            dsf dsfVar = dsf.INVARIANT;
                            g3e g3eVar = l7f.b;
                            if (listZ != null && listZ.isEmpty()) {
                                tt7VarF = new q8f(g3eVar.g(tt7Var.c0(), tt7Var.Z())).f(tt7VarF, dsfVar);
                                break;
                            }
                            Iterator it = listZ.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    tt7VarF = new q8f(g3eVar.g(tt7Var.c0(), tt7Var.Z())).f(tt7VarF, dsfVar);
                                    break;
                                }
                                if (((i8f) it.next()).a() != dsfVar) {
                                    tt7VarF = (tt7) if9.l(new q8f(bm8.e0(g3eVar.g(tt7Var.c0(), tt7Var.Z()))).f(tt7VarF, dsfVar)).b;
                                    break;
                                }
                            }
                            zI0 = zI0 || tt7Var.i0();
                        }
                        j7f j7fVarC2 = tt7VarF.c0();
                        if (j7fVarC2 == null) {
                            q1c.a(3);
                            throw null;
                        }
                        if (j7fVarC2.equals(j7fVarC0)) {
                            jgfVarH = w8f.h(tt7VarF, zI0);
                            break;
                        }
                        throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + o5c.k(j7fVarC2) + ", \n\nsupertype: " + o5c.k(j7fVarC0) + " \n" + j7fVarC2.equals(j7fVarC0));
                    }
                    for (tt7 tt7Var2 : j7fVarC1.e()) {
                        tt7Var2.getClass();
                        arrayDeque.add(new i8e(tt7Var2, i8eVar));
                    }
                }
                if (jgfVarH != null) {
                    return !xr7.A(u09VarI);
                }
            }
        }
        return false;
    }

    public static final boolean l(Context context) {
        context.getClass();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(ActivityManager.class)).getMemoryInfo(memoryInfo);
        Runtime runtime = Runtime.getRuntime();
        return memoryInfo.lowMemory || runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory()) < 50331648;
    }

    public static int m(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        qc0.j(tec.e(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final boolean n(nyc nycVar) {
        nycVar.getClass();
        return pa7.t(nycVar.g(), g5e.c) && nycVar.isInline() && nycVar.e() == 1;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x018d  */
    public static final bhe o(List list, TarotSkinIdentify tarotSkinIdentify, cge cgeVar, HashSet hashSet, l46 l46Var, int i, int i2) {
        bhe bheVar;
        Object obj;
        boolean zG;
        Object objR;
        bhe bheVar2;
        list.getClass();
        tarotSkinIdentify.getClass();
        cge cgeVar2 = (i2 & 4) != 0 ? cge.g : cgeVar;
        Set set = (i2 & 8) != 0 ? xu4.a : hashSet;
        Context context = (Context) l46Var.k(uq.b);
        Object obj2 = (x48) l46Var.k(cb8.a);
        boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
        int i3 = 3;
        int i4 = 1;
        i8c i8cVar = sf2.a;
        if (zBooleanValue) {
            l46Var.f0(1261126681);
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new bhe(null, new ond(24));
                l46Var.p0(objR2);
            }
            bheVar = (bhe) objR2;
            l46Var.r(false);
            i8cVar = i8cVar;
        } else {
            l46Var.f0(1261188960);
            boolean zG2 = l46Var.g(context) | ((((i & 896) ^ 384) > 256 && l46Var.g(cgeVar2)) || (i & 384) == 256);
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == i8cVar) {
                fhe fheVar = fhe.a;
                context.getClass();
                if (l(context)) {
                    fhe.b.e(true);
                }
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                if (!fhe.c) {
                    fhe.c = true;
                    applicationContext.registerComponentCallbacks(new oge(i4));
                }
                ws4 ws4Var = fhe.b;
                ws4Var.getClass();
                bhe bheVarA = ws4Var.a(context, cgeVar2);
                long j = ws4Var.a + 1;
                ws4Var.a = j;
                dhe dheVar = new dhe(j, cgeVar2, bheVarA);
                HashMap map = (HashMap) ws4Var.d;
                Object linkedHashSet = map.get(cgeVar2);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    map.put(cgeVar2, linkedHashSet);
                }
                ((Set) linkedHashSet).add(Long.valueOf(j));
                ws4.b(ws4Var, 3);
                objR3 = new ehe(dheVar, new vx7(1, fheVar, fhe.class, BuildConfig.BUILD_TYPE, "release(Lai/askquin/ui/explore/skin/box3d/TarotBoxThumbnailCacheLease;)V", 0, 27));
                l46Var.p0(objR3);
            }
            bheVar = ((ehe) objR3).c;
            l46Var.r(false);
        }
        boolean zG3 = l46Var.g(bheVar) | l46Var.i(obj2);
        Object objR4 = l46Var.R();
        if (!zG3) {
            obj = i8cVar;
            if (objR4 == obj) {
            }
            af1.h(bheVar, obj2, (a26) objR4, l46Var);
            Object[] objArr = {bheVar, list, tarotSkinIdentify, set};
            zG = ((((i & 7168) ^ 3072) <= 2048 && l46Var.i(set)) || (i & 3072) == 2048) | l46Var.g(bheVar) | ((((i & 14) ^ 6) <= 4 && l46Var.i(list)) || (i & 6) == 4) | ((((i & 112) ^ 48) <= 32 && l46Var.e(tarotSkinIdentify.ordinal())) || (i & 48) == 32);
            objR = l46Var.R();
            if (!zG || objR == obj) {
                Set set2 = set;
                bheVar2 = bheVar;
                Object cheVar = new che(set2, bheVar2, list, tarotSkinIdentify, null);
                l46Var.p0(cheVar);
                objR = cheVar;
            } else {
                bheVar2 = bheVar;
            }
            af1.r(objArr, (l26) objR, l46Var);
            return bheVar2;
        }
        obj = i8cVar;
        objR4 = new i2e(i3, obj2, bheVar);
        l46Var.p0(objR4);
        af1.h(bheVar, obj2, (a26) objR4, l46Var);
        Object[] objArr2 = {bheVar, list, tarotSkinIdentify, set};
        zG = ((((i & 7168) ^ 3072) <= 2048 && l46Var.i(set)) || (i & 3072) == 2048) | l46Var.g(bheVar) | ((((i & 14) ^ 6) <= 4 && l46Var.i(list)) || (i & 6) == 4) | ((((i & 112) ^ 48) <= 32 && l46Var.e(tarotSkinIdentify.ordinal())) || (i & 48) == 32);
        objR = l46Var.R();
        if (zG) {
            Set set3 = set;
            bheVar2 = bheVar;
            Object cheVar2 = new che(set3, bheVar2, list, tarotSkinIdentify, null);
            l46Var.p0(cheVar2);
            objR = cheVar2;
        } else {
            Set set4 = set;
            bheVar2 = bheVar;
            Object cheVar3 = new che(set4, bheVar2, list, tarotSkinIdentify, null);
            l46Var.p0(cheVar3);
            objR = cheVar3;
        }
        af1.r(objArr2, (l26) objR, l46Var);
        return bheVar2;
    }

    public static void p(TextView textView, int i) {
        if (i < 0) {
            cva.s();
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            s.a0(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void q(TextView textView, int i) {
        if (i < 0) {
            cva.s();
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void r(TextView textView, int i) {
        if (i < 0) {
            cva.s();
            return;
        }
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static boolean s(Context context, Uri uri, String str) {
        Intent intentCreateChooser;
        Object dzbVar;
        context.getClass();
        uri.getClass();
        String type = context.getContentResolver().getType(uri);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setDataAndType(uri, type);
        if (str != null) {
            int iIncrementAndGet = ShareTargetChosenReceiver.a.incrementAndGet();
            Intent intentPutExtra = new Intent(context, (Class<?>) ShareTargetChosenReceiver.class).setAction("net.xmind.donut.common.SHARE_TARGET_CHOSEN").putExtra("operation_id", str);
            intentPutExtra.getClass();
            intentCreateChooser = Intent.createChooser(intent, context.getString(R.string.share_activity_title), PendingIntent.getBroadcast(context, iIncrementAndGet, intentPutExtra, (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 268435456).getIntentSender());
            intentCreateChooser.getClass();
        } else {
            intentCreateChooser = Intent.createChooser(intent, context.getString(R.string.share_activity_title));
        }
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intentCreateChooser, 65536);
            listQueryIntentActivities.getClass();
            Iterator<T> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                context.grantUriPermission(((ResolveInfo) it.next()).activityInfo.packageName, uri, 1);
            }
            intentCreateChooser.addFlags(268435456);
            context.startActivity(intentCreateChooser);
            dzbVar = wef.a;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        return !(dzbVar instanceof dzb);
    }

    public static final SolarTerm t(String str) {
        Object next;
        str.getClass();
        Iterator<E> it = SolarTerm.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!pa7.t(((SolarTerm) next).getWireValue(), str));
        SolarTerm solarTerm = (SolarTerm) next;
        if (solarTerm == null || solarTerm == SolarTerm.UNKNOWN) {
            return null;
        }
        return solarTerm;
    }

    public static final String u(String str, String str2, String str3, String str4) {
        return ib8.m(ib8.o("Route ", str3, " could not find any NavType for argument ", str, " of type "), str2, " - typeMap received was ", str4);
    }

    public static ActionMode.Callback v(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof yue) || callback == null) ? callback : new yue(callback, textView);
    }

    public abstract boolean A(zwg zwgVar, bvg bvgVar, bvg bvgVar2);

    public abstract boolean B(ivg ivgVar, Object obj, Object obj2);

    public abstract boolean C(ivg ivgVar, gvg gvgVar, gvg gvgVar2);

    public abstract bvg w(zwg zwgVar);

    public abstract gvg x(zwg zwgVar);

    public abstract void y(gvg gvgVar, gvg gvgVar2);

    public abstract void z(gvg gvgVar, Thread thread);
}

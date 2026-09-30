package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import android.content.Intent;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.work.impl.WorkDatabase;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.replay.capture.v;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dj6 {
    public static final dd2 a = new dd2(new kd2(10), false, 1284456597);
    public static final dd2 b = new dd2(new yd2(20), false, 1610287159);
    public static final dd2 c = new dd2(new he2(2), false, -116067040);
    public static final fnc d = new fnc(22);
    public static final qv2 e = new qv2(27);
    public static final hkb f = new hkb(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final za5 g;
    public static final za5[] h;
    public static gx6 i;

    static {
        za5 za5Var = new za5("auth_api_credentials_begin_sign_in", 9L);
        za5 za5Var2 = new za5("auth_api_credentials_sign_out", 2L);
        g = za5Var2;
        h = new za5[]{za5Var, za5Var2, new za5("auth_api_credentials_authorize", 1L), new za5("auth_api_credentials_revoke_access", 1L), new za5("auth_api_credentials_save_password", 4L), new za5("auth_api_credentials_get_sign_in_intent", 6L), new za5("auth_api_credentials_save_account_linking_token", 3L), new za5("auth_api_credentials_get_phone_number_hint_intent", 3L)};
    }

    public static final void A(WorkDatabase workDatabase, si2 si2Var, lag lagVar) {
        int i2;
        workDatabase.getClass();
        si2Var.getClass();
        ArrayList arrayListK = t72.K(lagVar);
        int i3 = 0;
        while (!arrayListK.isEmpty()) {
            List list = ((lag) x72.k0(arrayListK)).d;
            list.getClass();
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (!((cq9) it.next()).b.j.i.isEmpty() && (i2 = i2 + 1) < 0) {
                        t72.Y();
                        throw null;
                    }
                }
            }
            i3 += i2;
        }
        if (i3 == 0) {
            return;
        }
        int iIntValue = ((Number) urg.I(workDatabase.x().a, true, false, new n8g(8))).intValue();
        if (iIntValue + i3 <= 8) {
            return;
        }
        qc0.j(kv2.h(iIntValue, i3, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: 8;\nalready enqueued count: ", ";\ncurrent enqueue operation count: ", ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
    }

    public static final int B(long j, long j2) {
        boolean zO = O(j);
        if (zO != O(j2)) {
            return zO ? -1 : 1;
        }
        int iSignum = (int) Math.signum(K(j) - K(j2));
        if (Math.min(K(j), K(j2)) >= 0.0f && N(j) != N(j2)) {
            return N(j) ? -1 : 1;
        }
        return iSignum;
    }

    public static final void C(u09 u09Var, LinkedHashSet linkedHashSet, dr8 dr8Var, boolean z) {
        for (bm3 bm3Var : mxb.f(dr8Var, ez3.o, 2)) {
            if (bm3Var instanceof u09) {
                u09 u09VarD0 = (u09) bm3Var;
                if (u09VarD0.w()) {
                    t99 name = u09VarD0.getName();
                    name.getClass();
                    y22 y22VarE = dr8Var.e(name, lf9.d);
                    u09VarD0 = y22VarE instanceof u09 ? (u09) y22VarE : y22VarE instanceof s04 ? ((s04) y22VarE).D0() : null;
                }
                if (u09VarD0 != null) {
                    int i2 = oz3.a;
                    Iterator it = u09VarD0.h().e().iterator();
                    while (it.hasNext()) {
                        if (oz3.n((tt7) it.next(), u09Var.a())) {
                            linkedHashSet.add(u09VarD0);
                            break;
                        }
                    }
                    if (z) {
                        dr8 dr8VarJ0 = u09VarD0.j0();
                        dr8VarJ0.getClass();
                        C(u09Var, linkedHashSet, dr8VarJ0, z);
                    }
                }
            }
        }
    }

    public static final boolean D(long j, hkb hkbVar) {
        float f2 = hkbVar.a;
        float f3 = hkbVar.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f2 > fIntBitsToFloat || fIntBitsToFloat > f3) {
            return false;
        }
        float f4 = hkbVar.b;
        float f5 = hkbVar.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f4 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f5;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    public static fo7 E(yn7 yn7Var) {
        boolean z;
        j2 j2Var = yn7Var instanceof j2 ? (j2) yn7Var : null;
        if (j2Var != null) {
            z = j2Var.u();
        }
        if (z) {
            yn7Var = x57.M(yn7Var, yn7Var);
        }
        qk6 qk6Var = qk6.R0;
        k7f k7fVarG = qk6Var.G((j2) yn7Var);
        int iT = qk6Var.T(k7fVarG);
        ArrayList arrayList = new ArrayList(iT);
        for (int i2 = 0; i2 < iT; i2++) {
            arrayList.add((ao7) qk6Var.b0(k7fVarG, i2));
        }
        if (arrayList.size() == yn7Var.A().size()) {
            return arrayList.isEmpty() ? fo7.c.a(z) : new fo7(bm8.W(s72.r1(arrayList, yn7Var.A())), z);
        }
        throw new IllegalStateException(("Params vs args count mismatch (" + arrayList.size() + " != " + yn7Var.A().size() + ") for type '" + yn7Var + '\'').toString());
    }

    public static final ExecutorService F(boolean z) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new oj2(z));
        executorServiceNewFixedThreadPool.getClass();
        return executorServiceNewFixedThreadPool;
    }

    public static j09 G(j09 j09Var, final long j, float f2, final float f3, final y6c y6cVar, int i2) {
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        final float f4 = f2;
        j09Var.getClass();
        return m93.u(j09Var, new n26() { // from class: l09
            @Override // defpackage.n26
            public final Object m(Object obj, Object obj2, Object obj3) {
                j09 j09Var2 = (j09) obj;
                l46 l46Var = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var2.getClass();
                l46Var.f0(376752139);
                sw3 sw3Var = (sw3) l46Var.k(zg2.h);
                final float fP0 = sw3Var.p0(f3);
                final float fP1 = sw3Var.p0(f4);
                final float fP2 = sw3Var.p0(0.0f);
                boolean zD = l46Var.d(fP0);
                final long j2 = j;
                boolean zF = zD | l46Var.f(j2);
                final y6c y6cVar2 = y6cVar;
                boolean zG = l46Var.g(y6cVar2) | zF | l46Var.d(fP1) | l46Var.d(fP2);
                Object objR = l46Var.R();
                if (zG || objR == sf2.a) {
                    a26 a26Var = new a26() { // from class: m09
                        @Override // defpackage.a26
                        public final Object d(Object obj4) {
                            sn4 sn4Var = (sn4) obj4;
                            sn4Var.getClass();
                            vl1 vl1VarP = sn4Var.v0().p();
                            Paint paint = urg.h().a;
                            float f5 = fP0;
                            if (f5 > 0.0f) {
                                paint.setMaskFilter(new BlurMaskFilter(f5, BlurMaskFilter.Blur.NORMAL));
                            }
                            paint.setColor(abg.Z(j2));
                            vs9 vs9VarA = y6cVar2.a(sn4Var.f(), sn4Var.getLayoutDirection(), sn4Var);
                            vl1VarP.g();
                            vl1VarP.n(fP1, fP2);
                            rt rtVarH = urg.h();
                            rtVarH.a.set(paint);
                            if (vs9VarA instanceof ts9) {
                                hkb hkbVar = ((ts9) vs9VarA).a;
                                vl1VarP.s(hkbVar.a, hkbVar.b, hkbVar.c, hkbVar.d, rtVarH);
                            } else if (vs9VarA instanceof us9) {
                                us9 us9Var = (us9) vs9VarA;
                                v6c v6cVar = us9Var.a;
                                zt ztVar = us9Var.b;
                                if (ztVar != null) {
                                    vl1VarP.d(ztVar, rtVarH);
                                } else {
                                    float f6 = v6cVar.a;
                                    long j3 = v6cVar.h;
                                    vl1VarP.b(f6, v6cVar.b, v6cVar.c, v6cVar.d, Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), rtVarH);
                                }
                            } else {
                                if (!(vs9VarA instanceof ss9)) {
                                    ap.c();
                                    return null;
                                }
                                vl1VarP.d(((ss9) vs9VarA).a, rtVarH);
                            }
                            vl1VarP.o();
                            return wef.a;
                        }
                    };
                    l46Var.p0(a26Var);
                    objR = a26Var;
                }
                j09 j09VarS = b21.s(j09Var2, (a26) objR);
                l46Var.r(false);
                return j09VarS;
            }
        });
    }

    public static final j09 H(j09 j09Var, l46 l46Var, int i2) {
        long jC;
        long j;
        j09Var.getClass();
        boolean z = (i2 & 1) != 0;
        boolean zS = g21.S(l46Var);
        if (zS) {
            l46Var.f0(1990859332);
            jC = ((e8b) l46Var.k(l8b.a)).f;
            l46Var.r(false);
        } else {
            l46Var.f0(1990858370);
            l46Var.r(false);
            jC = abg.c(268435455);
        }
        if (zS) {
            l46Var.f0(1990862053);
            j = ((e8b) l46Var.k(l8b.a)).B;
        } else {
            l46Var.f0(1990861214);
            j = ((e8b) l46Var.k(l8b.a)).m;
        }
        l46Var.r(false);
        y6c y6cVarB = a7c.b(we6.e(l46Var) ? 8.0f : 20.0f);
        if (z) {
            j09Var = b.c(j09Var, 1.0f);
        }
        return db6.w(tm7.o(j09Var, jC, y6cVarB), 0.5f, j, y6cVarB);
    }

    public static final wj5 I(wj5 wj5Var) {
        return wj5Var instanceof q0e ? wj5Var : J(wj5Var, d, e);
    }

    public static final za4 J(wj5 wj5Var, a26 a26Var, l26 l26Var) {
        if (wj5Var instanceof za4) {
            za4 za4Var = (za4) wj5Var;
            if (za4Var.b == a26Var && za4Var.c == l26Var) {
                return za4Var;
            }
        }
        return new za4(wj5Var, a26Var, l26Var);
    }

    public static final float K(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final long L(fwc fwcVar, long j, uuc uucVar) {
        bv7 bv7VarC;
        long jB;
        long j2;
        b59 b59Var;
        int iD;
        float fN;
        b59 b59Var2;
        int iD2;
        b59 b59Var3;
        int iD3;
        float fB;
        b59 b59Var4;
        int iD4;
        x59 x59VarG = fwcVar.g(uucVar);
        if (x59VarG == null) {
            return 9205357640488583168L;
        }
        gvc gvcVar = x59VarG.c;
        bv7 bv7Var = fwcVar.z;
        if (bv7Var == null || (bv7VarC = x59VarG.c()) == null) {
            return 9205357640488583168L;
        }
        int i2 = uucVar.b;
        ste steVar = (ste) gvcVar.invoke();
        if (i2 > (steVar == null ? 0 : x59VarG.b(steVar))) {
            return 9205357640488583168L;
        }
        hl9 hl9Var = (hl9) fwcVar.F0.getValue();
        hl9Var.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bv7VarC.K(bv7Var, hl9Var.a) >> 32));
        ste steVar2 = (ste) gvcVar.invoke();
        if (steVar2 == null) {
            jB = eue.b;
        } else {
            b59 b59Var5 = steVar2.b;
            int iB = x59VarG.b(steVar2);
            if (iB < 1) {
                jB = eue.b;
            } else {
                int iD5 = b59Var5.d(mh3.o(i2, 0, iB - 1));
                jB = u3c.b(steVar2.j(iD5), b59Var5.c(iD5, true));
            }
        }
        if (eue.d(jB)) {
            ste steVar3 = (ste) gvcVar.invoke();
            fN = (steVar3 != null && (iD4 = (b59Var4 = steVar3.b).d(i2)) < b59Var4.f) ? steVar3.h(iD4) : -1.0f;
            j2 = 4294967295L;
        } else {
            j2 = 4294967295L;
            int i3 = (int) (jB >> 32);
            ste steVar4 = (ste) gvcVar.invoke();
            float fH = (steVar4 != null && (iD2 = (b59Var2 = steVar4.b).d(i3)) < b59Var2.f) ? steVar4.h(iD2) : -1.0f;
            int i4 = ((int) (jB & 4294967295L)) - 1;
            ste steVar5 = (ste) gvcVar.invoke();
            float fI = (steVar5 != null && (iD = (b59Var = steVar5.b).d(i4)) < b59Var.f) ? steVar5.i(iD) : -1.0f;
            fN = mh3.n(fIntBitsToFloat, Math.min(fH, fI), Math.max(fH, fI));
        }
        if (fN == -1.0f) {
            return 9205357640488583168L;
        }
        if (!e77.b(j, 0L) && Math.abs(fIntBitsToFloat - fN) > ((int) (j >> 32)) / 2) {
            return 9205357640488583168L;
        }
        ste steVar6 = (ste) gvcVar.invoke();
        if (steVar6 != null && (iD3 = (b59Var3 = steVar6.b).d(i2)) < b59Var3.f) {
            float f2 = b59Var3.f(iD3);
            fB = ((b59Var3.b(iD3) - f2) / 2.0f) + f2;
        } else {
            fB = -1.0f;
        }
        if (fB == -1.0f) {
            return 9205357640488583168L;
        }
        return bv7Var.K(bv7VarC, (((long) Float.floatToRawIntBits(fN)) << 32) | (((long) Float.floatToRawIntBits(fB)) & j2));
    }

    public static Serializable M(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return q6.u(intent, str, cls);
        }
        Serializable serializableExtra = intent.getSerializableExtra(str);
        if (cls.isInstance(serializableExtra)) {
            return serializableExtra;
        }
        return null;
    }

    public static final boolean N(long j) {
        return (j & 2) != 0;
    }

    public static final boolean O(long j) {
        return (j & 1) != 0;
    }

    public static boolean P(int i2) {
        return i2 == 6 || i2 == 1 || i2 == 2 || i2 == 4;
    }

    public static final boolean Q(int i2, int i3, long j) {
        int iJ = kl2.j(j);
        if (i2 > kl2.h(j) || iJ > i2) {
            return false;
        }
        return i3 <= kl2.g(j) && kl2.i(j) <= i3;
    }

    public static gu2 R(n0a n0aVar, CharSequence charSequence, gu2 gu2Var) throws f0a, IOException {
        String string;
        charSequence.getClass();
        gu2Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListK = t72.K(new i0a(gu2Var, n0aVar, 0));
        while (true) {
            i0a i0aVar = (i0a) x72.l0(arrayListK);
            if (i0aVar != null) {
                gu2 gu2Var2 = (gu2) ((gu2) i0aVar.a).copy();
                int iIntValue = i0aVar.c;
                n0a n0aVar2 = i0aVar.b;
                List list = n0aVar2.a;
                List list2 = n0aVar2.b;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        if (!list2.isEmpty()) {
                            int size2 = list2.size() - 1;
                            if (size2 < 0) {
                                break;
                            }
                            while (true) {
                                int i3 = size2 - 1;
                                arrayListK.add(new i0a(gu2Var2, (n0a) list2.get(size2), iIntValue));
                                if (i3 < 0) {
                                    break;
                                }
                                size2 = i3;
                            }
                        } else {
                            if (iIntValue != charSequence.length()) {
                                arrayList.add(new e0a(iIntValue, tq0.Z));
                                break;
                            }
                            return gu2Var2;
                        }
                    } else {
                        Object objA = ((m0a) n0aVar2.a.get(i2)).a(gu2Var2, charSequence, iIntValue);
                        if (!(objA instanceof Integer)) {
                            if (objA instanceof e0a) {
                                arrayList.add((e0a) objA);
                                break;
                            }
                            pd4.i(objA, "Unexpected parse result: ");
                            return null;
                        }
                        iIntValue = ((Number) objA).intValue();
                        i2++;
                    }
                }
            } else {
                if (arrayList.size() > 1) {
                    w72.f0(arrayList, new kv8(3));
                }
                if (arrayList.size() == 1) {
                    string = "Position " + ((e0a) arrayList.get(0)).a + ": " + ((String) ((e0a) arrayList.get(0)).b.invoke());
                } else {
                    StringBuilder sb = new StringBuilder(arrayList.size() * 33);
                    s72.C0(arrayList, sb, ", ", "Errors: ", null, new xn9(26), 56);
                    string = sb.toString();
                }
                throw new f0a(string);
            }
        }
    }

    public static final j09 S(j09 j09Var, pc9 pc9Var, sc9 sc9Var) {
        return j09Var.D(new tc9(pc9Var, sc9Var));
    }

    public static final i09 T(rv3 rv3Var, int i2) {
        i09 i09Var = ((i09) rv3Var).a.f;
        if (i09Var == null || (i09Var.d & i2) == 0) {
            return null;
        }
        while (i09Var != null) {
            int i3 = i09Var.c;
            if ((i3 & 2) != 0) {
                return null;
            }
            if ((i3 & i2) != 0) {
                return i09Var;
            }
            i09Var = i09Var.f;
        }
        return null;
    }

    public static void U(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static su8 V(m95 m95Var, boolean z, boolean z2) {
        yg5 yg5Var;
        if (z) {
            yg5Var = z2 ? qu6.c : null;
        } else {
            yg5Var = qu6.b;
        }
        su8 su8VarG = new mjg(20).G(m95Var, yg5Var, 0);
        if (su8VarG == null || su8VarG.a.length == 0) {
            return null;
        }
        return su8VarG;
    }

    public static w84 W(d0a d0aVar) {
        d0aVar.N(1);
        int iC = d0aVar.C();
        long j = ((long) d0aVar.b) + ((long) iC);
        int i2 = iC / 18;
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            long jT = d0aVar.t();
            if (jT == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                break;
            }
            jArrCopyOf[i3] = jT;
            jArrCopyOf2[i3] = d0aVar.t();
            d0aVar.N(2);
        }
        d0aVar.N((int) (j - ((long) d0aVar.b)));
        return new w84(7, jArrCopyOf, jArrCopyOf2);
    }

    public static final long X(long j, float f2) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f2);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f2);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0008  */
    /* JADX WARN: Code duplicated, block: B:9:0x000c A[PHI: r1
  0x000c: PHI (r1v6 int) = (r1v0 int), (r1v1 int), (r1v2 int) binds: [B:8:0x000a, B:11:0x0010, B:30:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    public static io0 Y(int i2) {
        int i3 = 6;
        if (i2 != 0) {
            int i4 = 1;
            if (i2 == 1) {
                i3 = 2;
            } else if (i2 == 2) {
                i3 = i4;
            } else {
                i4 = 5;
                if (i2 == 3) {
                    i3 = i4;
                } else if (i2 == 4) {
                    i3 = 3;
                } else if (i2 != 5) {
                    if (i2 == 6) {
                        i3 = 2;
                    } else {
                        i4 = 7;
                        if (i2 != 7 && i2 != 8) {
                            if (i2 == 9) {
                                i3 = 4;
                            } else if (i2 == 10) {
                                i3 = i4;
                            } else if (i2 != 11 && i2 != 12 && i2 != 13) {
                                v.a(nf1.a(i2), "Unexpected CameraError: ");
                                return null;
                            }
                        }
                    }
                }
            }
        }
        return new io0(i3);
    }

    public static final hkb Z(bv7 bv7Var) {
        hkb hkbVarN = vd0.N(bv7Var, true);
        long jC = bv7Var.C(hkbVarN.f());
        float f2 = hkbVarN.c;
        float f3 = hkbVarN.d;
        long jC2 = bv7Var.C((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        return new hkb(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jC2 >> 32)), Float.intBitsToFloat((int) (jC2 & 4294967295L)));
    }

    public static final void a(final boolean z, final a26 a26Var, l46 l46Var, final int i2) {
        final int i3;
        l46 l46Var2 = l46Var;
        a26Var.getClass();
        l46Var2.h0(-374373995);
        int i4 = (l46Var2.h(z) ? 32 : 16) | i2;
        final int i5 = 0;
        if (l46Var2.W(i4 & 1, (i4 & 147) != 146)) {
            ca2.a.getClass();
            if (ca2.c) {
                ojb ojbVarV = l46Var2.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26(z, a26Var, i2, i5) { // from class: qg
                        public final /* synthetic */ int a;
                        public final /* synthetic */ boolean b;
                        public final /* synthetic */ a26 c;

                        {
                            this.a = i5;
                        }

                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i6 = this.a;
                            wef wefVar = wef.a;
                            a26 a26Var2 = this.c;
                            boolean z2 = this.b;
                            l46 l46Var3 = (l46) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    dj6.a(z2, a26Var2, l46Var3, k99.P(391));
                                    break;
                                default:
                                    dj6.a(z2, a26Var2, l46Var3, k99.P(391));
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    return;
                }
                return;
            }
            xtd xtdVarR = z5c.r(l46Var2);
            pr4 pr4Var = l8b.a;
            k00 k00VarM = z5c.m(0, l46Var2, xtd.a(xtdVarR, ((e8b) l46Var2.k(pr4Var)).r, 65534));
            jx0 jx0Var = ndb.Z;
            j09 j09VarB0 = ynb.b0(24.0f, 0.0f, new mq6(jx0Var), 2);
            t7c t7cVarA = s7c.a(new uc0(12.0f, true, new jv2(3, jx0Var)), ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
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
            qk2.i(z, null, false, 0.0f, qk2.u(l46Var2), a26Var, l46Var2, ((i4 >> 3) & 14) | 196608, 14);
            nte.c(k00VarM, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, mue.a(jgb.W(l46Var2), ((e8b) l46Var2.k(pr4Var)).r, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), l46Var, 0, 0, 262142);
            l46Var2 = l46Var;
            i3 = 1;
            l46Var2.r(true);
        } else {
            i3 = 1;
            l46Var2.Z();
        }
        ojb ojbVarV2 = l46Var2.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new l26(z, a26Var, i2, i3) { // from class: qg
                public final /* synthetic */ int a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ a26 c;

                {
                    this.a = i3;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i6 = this.a;
                    wef wefVar = wef.a;
                    a26 a26Var2 = this.c;
                    boolean z2 = this.b;
                    l46 l46Var3 = (l46) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            dj6.a(z2, a26Var2, l46Var3, k99.P(391));
                            break;
                        default:
                            dj6.a(z2, a26Var2, l46Var3, k99.P(391));
                            break;
                    }
                    return wefVar;
                }
            };
        }
    }

    public static final void b(String str, String str2, x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        p5a p5aVar;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-808424736);
        int i3 = i2 | (l46Var.g(str) ? 4 : 2) | (l46Var.g(str2) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) l46Var.k(uq.b);
            int i5 = i3 & 14;
            boolean z = i5 == 4;
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z || objR == obj) {
                objR = new t8(str, i4);
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
            fh fhVar = (fh) z5c.G(kobVar.b(fh.class), pwfVarA.g(), null, gy2VarR, nfcVarB, x16Var3);
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = nfcVarB2.b(kobVar.b(p5a.class), null, null);
                l46Var.p0(objR2);
            }
            p5a p5aVar2 = (p5a) objR2;
            boolean zI = l46Var.i(context) | l46Var.i(fhVar);
            Object objR3 = l46Var.R();
            if (zI || objR3 == obj) {
                objR3 = new yg(context, fhVar, null);
                l46Var.p0(objR3);
            }
            wef wefVar = wef.a;
            af1.o((l26) objR3, l46Var, wefVar);
            int i6 = i3 & 112;
            boolean zI2 = (i5 == 4) | (i6 == 32) | l46Var.i(p5aVar2);
            Object objR4 = l46Var.R();
            if (zI2 || objR4 == obj) {
                objR4 = new zg(str, str2, p5aVar2, null);
                l46Var.p0(objR4);
            }
            af1.o((l26) objR4, l46Var, wefVar);
            gh ghVar = (gh) fhVar.V0.getValue();
            boolean zI3 = (i5 == 4) | (i6 == 32) | l46Var.i(p5aVar2) | ((i3 & 7168) == 2048);
            Object objR5 = l46Var.R();
            if (zI3 || objR5 == obj) {
                p5aVar = p5aVar2;
                Object rgVar = new rg(x16Var2, str, str2, p5aVar, 0);
                l46Var.p0(rgVar);
                objR5 = rgVar;
            } else {
                p5aVar = p5aVar2;
            }
            t72.b((x16) objR5, null, af1.b0(-1495901527, new ug(ghVar, str, str2, p5aVar, context, fhVar, x16Var2, 0), l46Var), l46Var, 384, 2);
            izb izbVar = (izb) fhVar.U0.getValue();
            boolean zI4 = l46Var.i(fhVar) | ((i3 & 896) == 256);
            Object objR6 = l46Var.R();
            if (zI4 || objR6 == obj) {
                objR6 = new bh(fhVar, x16Var, null);
                l46Var.p0(objR6);
            }
            af1.o((l26) objR6, l46Var, izbVar);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q8(str, str2, x16Var, x16Var2, i2, 1);
        }
    }

    public static final void c(int i2, l46 l46Var) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-625527592);
        int i3 = 0;
        if (l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            jx0 jx0Var = ndb.Z;
            j09 j09VarB0 = ynb.b0(24.0f, 0.0f, new mq6(jx0Var), 2);
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(i3)), jx0Var, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
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
            nte.b(afc.q(R.string.paywall_addon_non_refundable, l46Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jgb.W(l46Var2), l46Var, 0, 0, 131070);
            nte.b(afc.q(R.string.paywall_addon_subscription_end_desc, l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jgb.W(l46Var), l46Var, 0, 0, 131070);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ng(i2);
        }
    }

    public static final void d(j09 j09Var, n07 n07Var, p07 p07Var, String str, boolean z, x16 x16Var, l46 l46Var, int i2) {
        l46Var.h0(429824526);
        int i3 = (l46Var.g(j09Var) ? 4 : 2) | i2 | (l46Var.i(n07Var) ? 32 : 16);
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.g(str) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i4 = i3 | (l46Var.h(z) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var) ? 131072 : 65536);
        int i5 = 0;
        if (l46Var.W(i4 & 1, (74899 & i4) != 74898)) {
            int i6 = (i4 & 14) | 24576;
            int i7 = i4 >> 6;
            vpf.g(j09Var, str, z, x16Var, af1.b0(-278824938, new sg(p07Var, z, n07Var, i5), l46Var), l46Var, i6 | (i7 & 112) | (i7 & 896) | (i7 & 7168));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tg(j09Var, n07Var, p07Var, str, z, x16Var, i2);
        }
    }

    public static final void e(String str, String str2, TarotCardChoice tarotCardChoice, String str3, TarotSkinIdentify tarotSkinIdentify, x16 x16Var, l46 l46Var, int i2) {
        boolean z;
        TarotSkinIdentify tarotSkinIdentify2;
        j09 j09Var;
        l46 l46Var2;
        float f2;
        he2 he2Var;
        boolean z2;
        j09 j09VarB;
        l46 l46Var3 = l46Var;
        str.getClass();
        tarotCardChoice.getClass();
        str3.getClass();
        l46Var3.h0(-1871850486);
        int i3 = i2 | (l46Var3.g(str) ? 4 : 2) | (l46Var3.g(str2) ? 32 : 16) | (l46Var3.g(tarotCardChoice) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var3.e(tarotSkinIdentify == null ? -1 : tarotSkinIdentify.ordinal()) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var3.i(x16Var) ? 1048576 : 524288);
        int i4 = 0;
        if (l46Var3.W(i3 & 1, (598163 & i3) != 598162)) {
            qhe qheVarR = q7c.r(tarotCardChoice);
            x4d x4dVarB = a7c.b(12.0f);
            if (we6.e(l46Var3)) {
                x4dVarB = g21.f;
            }
            float f3 = we6.e(l46Var3) ? 8.0f : 12.0f;
            y6c y6cVarB = a7c.b(f3);
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(i4)), ndb.Z, l46Var3, 54);
            int iHashCode = Long.hashCode(l46Var3.T);
            u8a u8aVarM = l46Var3.m();
            j09 j09VarJ = m93.J(l46Var3, j09VarC);
            lf2.q.getClass();
            l46Var3.j0();
            boolean z3 = l46Var3.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
                l46Var3.l(ov7Var);
            } else {
                l46Var3.s0();
            }
            he2 he2Var2 = hj6.z;
            dec.l(he2Var2, l46Var3, c92VarA);
            he2 he2Var3 = hj6.y;
            dec.l(he2Var3, l46Var3, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var4 = hj6.X;
            dec.l(he2Var4, l46Var3, numValueOf);
            dec.k(l46Var3);
            he2 he2Var5 = hj6.x;
            dec.l(he2Var5, l46Var3, j09VarJ);
            mue mueVar = ((p9f) l46Var3.k(r9f.a)).n;
            pr4 pr4Var = l8b.a;
            j09 j09VarA = g09Var;
            nte.b(str, ynb.a0(db6.w(g09Var, 0.5f, ((e8b) l46Var3.k(pr4Var)).A, x4dVarB), 12.0f, 4.0f), ((e8b) l46Var3.k(pr4Var)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar, l46Var, i3 & 14, 0, 131064);
            mue mueVar2 = pue.a;
            int i5 = i3 >> 3;
            nte.b(str2, ynb.b0(16.0f, 0.0f, j09VarA, 2), ((e8b) l46Var.k(pr4Var)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var), 0L, 0L, null, cr5.b(), 0L, null, 0, 0L, null, null, 16777183), l46Var, (i5 & 14) | 48, 0, 130040);
            if (tarotSkinIdentify == null) {
                l46Var.f0(213757880);
                tarotSkinIdentify2 = ((die) l46Var.k(snd.a)).a;
                z = false;
                l46Var.r(false);
            } else {
                z = false;
                l46Var.f0(213756919);
                l46Var.r(false);
                tarotSkinIdentify2 = tarotSkinIdentify;
            }
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                l46Var.f0(213762204);
                l46Var.r(z);
                j09Var = j09VarA;
                l46Var2 = l46Var;
            } else {
                l46Var.f0(213763195);
                j09Var = j09VarA;
                j09VarA = vt1.a(j09Var, tarotCardChoice.getCard().getCardKey(), new yi4(f3), l46Var, 6, 6);
                l46Var2 = l46Var;
                l46Var2.r(z);
            }
            j09 j09Var2 = j09Var;
            l46 l46Var4 = l46Var2;
            j09 j09VarD = rrb.q(w(b.p(j09Var, 168.0f), tarotSkinIdentify2.getAspectRatio()), 12.0f, y6cVarB, y72.b(((m82) l46Var2.k(o82.a)).a, 0.3f), 0L, 20).D(j09VarA);
            if (x16Var == null) {
                l46Var4.f0(213776668);
                l46Var4.r(false);
                z2 = false;
                he2Var = he2Var2;
                l46Var3 = l46Var4;
                f2 = f3;
                j09VarB = j09Var2;
            } else {
                l46Var4.f0(213777557);
                Object objR = l46Var4.R();
                if (objR == sf2.a) {
                    objR = ib8.e(l46Var4);
                }
                f2 = f3;
                he2Var = he2Var2;
                l46Var3 = l46Var;
                z2 = false;
                j09VarB = androidx.compose.foundation.b.b(j09Var2, (t69) objR, null, false, null, x16Var, 28);
                l46Var3.r(false);
            }
            j09 j09VarD2 = j09VarD.D(j09VarB);
            xn8 xn8VarC = s21.c(ndb.b, z2);
            int iHashCode2 = Long.hashCode(l46Var3.T);
            u8a u8aVarM2 = l46Var3.m();
            j09 j09VarJ2 = m93.J(l46Var3, j09VarD2);
            l46Var3.j0();
            if (l46Var3.S) {
                l46Var3.l(ov7Var);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var, l46Var3, xn8VarC);
            dec.l(he2Var3, l46Var3, u8aVarM2);
            ib8.s(iHashCode2, l46Var3, he2Var4, l46Var3);
            dec.l(he2Var5, l46Var3, j09VarJ2);
            l46Var3.f0(-557676621);
            o7c.d(b.c, qheVarR, tarotSkinIdentify2, false, null, f2, null, false, l46Var3, 6, 216);
            l46Var3.r(z2);
            l46Var3.r(true);
            cgg.c(null, tarotCardChoice, l46Var3, i5 & 112, 1);
            l46Var3.r(true);
        } else {
            l46Var3.Z();
        }
        ojb ojbVarV = l46Var3.v();
        if (ojbVarV != null) {
            ojbVarV.d = new iq1(str, str2, tarotCardChoice, str3, tarotSkinIdentify, x16Var, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0350  */
    /* JADX WARN: Code duplicated, block: B:109:0x0359  */
    /* JADX WARN: Code duplicated, block: B:111:0x035d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0382  */
    /* JADX WARN: Code duplicated, block: B:124:0x038f  */
    /* JADX WARN: Code duplicated, block: B:130:0x039b  */
    /* JADX WARN: Code duplicated, block: B:133:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:134:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:140:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:143:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:144:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:151:0x043a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0454  */
    /* JADX WARN: Code duplicated, block: B:156:0x046c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0476  */
    /* JADX WARN: Code duplicated, block: B:159:0x0482  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v27 */
    public static final void f(final gh ghVar, final a26 a26Var, x16 x16Var, l46 l46Var, int i2) {
        e89 e89Var;
        final ?? r1;
        i8c i8cVar;
        e89 e89Var2;
        i8c i8cVar2;
        final e89 e89Var3;
        float f2;
        boolean z;
        boolean z2;
        Object objR;
        boolean z3;
        az2 az2Var;
        boolean z4;
        Object objR2;
        final e89 e89Var4;
        e89 e89Var5;
        boolean z5;
        e89 e89Var6;
        i8c i8cVar3;
        n07 n07Var;
        p07 p07Var;
        Object objR3;
        boolean z6;
        p07 p07VarG;
        Object obj;
        i8c i8cVar4;
        boolean z7;
        l46 l46Var2 = l46Var;
        ghVar.getClass();
        n07 n07Var2 = ghVar.b;
        a26Var.getClass();
        x16Var.getClass();
        l46Var2.h0(-1984255491);
        int i3 = i2 | (l46Var2.i(ghVar) ? 4 : 2) | (l46Var2.i(a26Var) ? 32 : 16) | (l46Var2.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            Object objR4 = l46Var2.R();
            i8c i8cVar5 = sf2.a;
            if (objR4 == i8cVar5) {
                objR4 = q1c.f(null);
                l46Var2.p0(objR4);
            }
            final e89 e89Var7 = (e89) objR4;
            Object objR5 = l46Var2.R();
            if (objR5 == i8cVar5) {
                ca2.a.getClass();
                objR5 = q1c.f(Boolean.valueOf(ca2.c));
                l46Var2.p0(objR5);
            }
            final e89 e89Var8 = (e89) objR5;
            Object objR6 = l46Var2.R();
            if (objR6 == i8cVar5) {
                objR6 = q1c.f(Boolean.FALSE);
                l46Var2.p0(objR6);
            }
            final e89 e89Var9 = (e89) objR6;
            int i5 = i3 & 14;
            ?? r16 = i5 == 4 || l46Var2.i(ghVar);
            Object objR7 = l46Var2.R();
            if (r16 != false || objR7 == i8cVar5) {
                objR7 = new ch(ghVar, e89Var7, null);
                l46Var2.p0(objR7);
            }
            af1.o((l26) objR7, l46Var2, ghVar);
            int i6 = 6;
            if (((Boolean) e89Var9.getValue()).booleanValue()) {
                l46Var2.f0(-1319925721);
                k00 k00VarM = z5c.m(1, l46Var2, null);
                String strQ = afc.q(R.string.confirm_to_purchase, l46Var2);
                String strQ2 = afc.q(R.string.disagree, l46Var2);
                String strQ3 = afc.q(R.string.continute_to_purchase, l46Var2);
                dd2 dd2VarB0 = af1.b0(-254210425, new xg(k00VarM, i4), l46Var2);
                Object objR8 = l46Var2.R();
                if (objR8 == i8cVar5) {
                    objR8 = new i8(e89Var9, i6);
                    l46Var2.p0(objR8);
                }
                x16 x16Var2 = (x16) objR8;
                boolean z8 = (i3 & 112) == 32;
                Object objR9 = l46Var2.R();
                if (z8 || objR9 == i8cVar5) {
                    final int i7 = 0;
                    i8cVar4 = i8cVar5;
                    z7 = true;
                    obj = new x16() { // from class: mg
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i8 = i7;
                            wef wefVar = wef.a;
                            e89 e89Var10 = e89Var7;
                            e89 e89Var11 = e89Var8;
                            e89 e89Var12 = e89Var9;
                            a26 a26Var2 = a26Var;
                            switch (i8) {
                                case 0:
                                    e89Var12.setValue(Boolean.FALSE);
                                    e89Var11.setValue(Boolean.TRUE);
                                    n07 n07Var3 = (n07) e89Var10.getValue();
                                    if (n07Var3 != null) {
                                        a26Var2.d(n07Var3);
                                    }
                                    break;
                                default:
                                    if (!((Boolean) e89Var12.getValue()).booleanValue()) {
                                        e89Var10.setValue(Boolean.TRUE);
                                    } else {
                                        n07 n07Var4 = (n07) e89Var11.getValue();
                                        if (n07Var4 != null) {
                                            a26Var2.d(n07Var4);
                                        }
                                    }
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    e89Var = e89Var9;
                    l46Var2.p0(obj);
                } else {
                    obj = objR9;
                    e89Var = e89Var9;
                    i8cVar4 = i8cVar5;
                    z7 = true;
                }
                i8cVar = i8cVar4;
                r1 = 0;
                e89Var2 = e89Var7;
                kj0.F(strQ, dd2VarB0, strQ3, strQ2, false, false, null, null, x16Var2, (x16) obj, l46Var, 100663344, 240);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                e89Var = e89Var9;
                r1 = 0;
                i8cVar = i8cVar5;
                e89Var8 = e89Var8;
                e89Var2 = e89Var7;
                l46Var2.f0(-1319435611);
                l46Var2.r(false);
            }
            y6c y6cVarB = a7c.b(32.0f);
            lx0 lx0Var = ndb.b;
            xn8 xn8VarC = s21.c(lx0Var, r1);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z9 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z9) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            j09 j09VarO = tm7.o(oa7.E(b.c(g09Var, 1.0f), y6cVarB), ((e8b) l46Var2.k(l8b.a)).c, y6cVarB);
            xn8 xn8VarC2 = s21.c(lx0Var, r1);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarO);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, xn8VarC2);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            k8b.a(af1.b0(2085670928, new ng(r1, r1), l46Var2), l46Var2, i6);
            j09 j09VarD0 = mh3.d0(ynb.Z(b.c(g09Var, 1.0f), 20.0f), mh3.T(l46Var2), r1, 14);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ3 = m93.J(l46Var2, j09VarD0);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA);
            dec.l(he2Var2, l46Var2, u8aVarM3);
            ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ3);
            jgb.q(r1, 1, l46Var2, null, ks0.h(32.0f, R.string.paywall_addon_title, l46Var2, l46Var2, g09Var));
            l46 l46Var3 = l46Var2;
            jgb.s(0, 0, 5, l46Var3, null, ks0.h(8.0f, R.string.paywall_addon_desc, l46Var2, l46Var2, g09Var));
            j09 j09VarF = urg.F(kv2.e(g09Var, 40.0f, l46Var3, g09Var, 1.0f), ia7.a);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(r1)), ndb.y, l46Var3, 6);
            int iHashCode4 = Long.hashCode(l46Var3.T);
            u8a u8aVarM4 = l46Var3.m();
            j09 j09VarJ4 = m93.J(l46Var3, j09VarF);
            l46Var3.j0();
            if (l46Var3.S) {
                l46Var3.l(ov7Var);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var, l46Var3, t7cVarA);
            dec.l(he2Var2, l46Var3, u8aVarM4);
            ib8.s(iHashCode4, l46Var3, he2Var3, l46Var3);
            dec.l(he2Var4, l46Var3, j09VarJ4);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            jw7 jw7Var = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            FillElement fillElement = b.b;
            j09 j09VarD = jw7Var.D(fillElement);
            n07 n07Var3 = ghVar.a;
            ?? r7 = (n07Var3 == null || !pa7.t((n07) e89Var2.getValue(), ghVar.a)) ? r1 : 1;
            ?? r13 = (i5 == 4 || l46Var3.i(ghVar)) ? 1 : r1;
            Object objR10 = l46Var3.R();
            if (r13 == 0) {
                i8cVar2 = i8cVar;
                if (objR10 != i8cVar2) {
                    e89Var3 = e89Var2;
                }
                d(j09VarD, n07Var3, az2.CreditPackA, null, r7, (x16) objR10, l46Var, 3520);
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                if (1.0f > r15) {
                    f2 = Float.MAX_VALUE;
                } else {
                    f2 = 1.0f;
                }
                j09 j09VarD2 = new jw7(f2, true).D(fillElement);
                n07 n07Var4 = ghVar.b;
                String strQ4 = afc.q(R.string.paywall_most_selected, l46Var);
                if (n07Var2 == 0 && pa7.t((n07) e89Var3.getValue(), n07Var2)) {
                    z = true;
                } else {
                    z = false;
                }
                if (i5 != 4 || l46Var.i(ghVar)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objR = l46Var.R();
                if (!z2 || objR == i8cVar2) {
                    z3 = true;
                    final ?? r12 = 1 == true ? 1 : 0;
                    objR = new x16() { // from class: og
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i8 = r12;
                            wef wefVar = wef.a;
                            e89 e89Var10 = e89Var3;
                            gh ghVar2 = ghVar;
                            switch (i8) {
                                case 0:
                                    x1f x1fVar = x1f.a;
                                    x1f.k(new r05("paywall_click_discount_20"), null, 6);
                                    n07 n07Var5 = ghVar2.a;
                                    if (n07Var5 != null) {
                                        e89Var10.setValue(n07Var5);
                                    }
                                    break;
                                default:
                                    x1f x1fVar2 = x1f.a;
                                    x1f.k(new r05("paywall_click_discount_20"), null, 6);
                                    n07 n07Var6 = ghVar2.b;
                                    if (n07Var6 != null) {
                                        e89Var10.setValue(n07Var6);
                                    }
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    l46Var.p0(objR);
                } else {
                    z3 = true;
                }
                az2Var = az2.CreditPackB;
                d(j09VarD2, n07Var4, az2Var, strQ4, z, (x16) objR, l46Var, 448);
                ib8.t(l46Var, z3, g09Var, 24.0f, l46Var);
                String strQ5 = afc.q(R.string.paywall_cta_continue, l46Var);
                if ((i3 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objR2 = l46Var.R();
                if (!z4 || objR2 == i8cVar2) {
                    final int i8 = 1;
                    final e89 e89Var10 = e89Var3;
                    e89Var4 = e89Var8;
                    final e89 e89Var11 = e89Var;
                    objR2 = new x16() { // from class: mg
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i9 = i8;
                            wef wefVar = wef.a;
                            e89 e89Var12 = e89Var11;
                            e89 e89Var13 = e89Var10;
                            e89 e89Var14 = e89Var4;
                            a26 a26Var2 = a26Var;
                            switch (i9) {
                                case 0:
                                    e89Var14.setValue(Boolean.FALSE);
                                    e89Var13.setValue(Boolean.TRUE);
                                    n07 n07Var5 = (n07) e89Var12.getValue();
                                    if (n07Var5 != null) {
                                        a26Var2.d(n07Var5);
                                    }
                                    break;
                                default:
                                    if (!((Boolean) e89Var14.getValue()).booleanValue()) {
                                        e89Var12.setValue(Boolean.TRUE);
                                    } else {
                                        n07 n07Var6 = (n07) e89Var13.getValue();
                                        if (n07Var6 != null) {
                                            a26Var2.d(n07Var6);
                                        }
                                    }
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    e89Var5 = e89Var10;
                    l46Var.p0(objR2);
                } else {
                    e89Var5 = e89Var3;
                    e89Var4 = e89Var8;
                }
                x16 x16Var3 = (x16) objR2;
                j09 j09VarC = b.c(g09Var, 1.0f);
                if (((n07) e89Var5.getValue()) != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                e89Var6 = e89Var4;
                i8cVar3 = i8cVar2;
                nk8.i(strQ5, x16Var3, j09VarC, 0.0f, 0.0f, 0.0f, z5, null, null, null, false, l46Var, 384, 0, 3960);
                o5c.f(l46Var, b.d(g09Var, 16.0f));
                c(6, l46Var);
                o5c.f(l46Var, b.d(g09Var, 8.0f));
                n07Var = (n07) e89Var5.getValue();
                if (n07Var != null || (p07VarG = n07Var.g()) == null) {
                    p07Var = az2Var;
                } else {
                    p07Var = p07VarG;
                }
                ynb.g(p07Var, false, null, false, null, l46Var, 199686, 42);
                ca2.a.getClass();
                if (ca2.c) {
                    l46Var.f0(765601923);
                    l46Var.r(false);
                } else {
                    ib8.r(12.0f, 765410684, l46Var, l46Var, g09Var);
                    boolean zBooleanValue = ((Boolean) e89Var6.getValue()).booleanValue();
                    objR3 = l46Var.R();
                    if (objR3 == i8cVar3) {
                        z6 = false;
                        objR3 = new pg(e89Var6, 0 == true ? 1 : 0);
                        l46Var.p0(objR3);
                    } else {
                        z6 = false;
                    }
                    a(zBooleanValue, (a26) objR3, l46Var, 390);
                    l46Var.r(z6);
                }
                o5c.f(l46Var, b.d(g09Var, 16.0f));
                l46Var.r(true);
                l46Var.r(true);
                c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), false, 0L, 0L, null, x16Var, l46Var, (i3 << 9) & 458752, 30);
                l46Var2 = l46Var;
                l46Var2.r(true);
            } else {
                i8cVar2 = i8cVar;
            }
            e89Var3 = e89Var2;
            objR10 = new x16() { // from class: og
                @Override // defpackage.x16
                public final Object invoke() {
                    int i9 = r1;
                    wef wefVar = wef.a;
                    e89 e89Var12 = e89Var3;
                    gh ghVar2 = ghVar;
                    switch (i9) {
                        case 0:
                            x1f x1fVar = x1f.a;
                            x1f.k(new r05("paywall_click_discount_20"), null, 6);
                            n07 n07Var5 = ghVar2.a;
                            if (n07Var5 != null) {
                                e89Var12.setValue(n07Var5);
                            }
                            break;
                        default:
                            x1f x1fVar2 = x1f.a;
                            x1f.k(new r05("paywall_click_discount_20"), null, 6);
                            n07 n07Var6 = ghVar2.b;
                            if (n07Var6 != null) {
                                e89Var12.setValue(n07Var6);
                            }
                            break;
                    }
                    return wefVar;
                }
            };
            l46Var3.p0(objR10);
            d(j09VarD, n07Var3, az2.CreditPackA, null, r7, (x16) objR10, l46Var, 3520);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            if (1.0f > r15) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            j09 j09VarD3 = new jw7(f2, true).D(fillElement);
            n07 n07Var5 = ghVar.b;
            String strQ6 = afc.q(R.string.paywall_most_selected, l46Var);
            if (n07Var2 == 0) {
                z = false;
            } else {
                z = false;
            }
            if (i5 != 4) {
                z2 = true;
            } else {
                z2 = true;
            }
            objR = l46Var.R();
            if (z2) {
                z3 = true;
                final int r14 = 1 == true ? 1 : 0;
                objR = new x16() { // from class: og
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i9 = r14;
                        wef wefVar = wef.a;
                        e89 e89Var12 = e89Var3;
                        gh ghVar2 = ghVar;
                        switch (i9) {
                            case 0:
                                x1f x1fVar = x1f.a;
                                x1f.k(new r05("paywall_click_discount_20"), null, 6);
                                n07 n07Var6 = ghVar2.a;
                                if (n07Var6 != null) {
                                    e89Var12.setValue(n07Var6);
                                }
                                break;
                            default:
                                x1f x1fVar2 = x1f.a;
                                x1f.k(new r05("paywall_click_discount_20"), null, 6);
                                n07 n07Var7 = ghVar2.b;
                                if (n07Var7 != null) {
                                    e89Var12.setValue(n07Var7);
                                }
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var.p0(objR);
            } else {
                z3 = true;
                final int r15 = 1 == true ? 1 : 0;
                objR = new x16() { // from class: og
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i9 = r15;
                        wef wefVar = wef.a;
                        e89 e89Var12 = e89Var3;
                        gh ghVar2 = ghVar;
                        switch (i9) {
                            case 0:
                                x1f x1fVar = x1f.a;
                                x1f.k(new r05("paywall_click_discount_20"), null, 6);
                                n07 n07Var6 = ghVar2.a;
                                if (n07Var6 != null) {
                                    e89Var12.setValue(n07Var6);
                                }
                                break;
                            default:
                                x1f x1fVar2 = x1f.a;
                                x1f.k(new r05("paywall_click_discount_20"), null, 6);
                                n07 n07Var7 = ghVar2.b;
                                if (n07Var7 != null) {
                                    e89Var12.setValue(n07Var7);
                                }
                                break;
                        }
                        return wefVar;
                    }
                };
                l46Var.p0(objR);
            }
            az2Var = az2.CreditPackB;
            d(j09VarD3, n07Var5, az2Var, strQ6, z, (x16) objR, l46Var, 448);
            ib8.t(l46Var, z3, g09Var, 24.0f, l46Var);
            String strQ7 = afc.q(R.string.paywall_cta_continue, l46Var);
            if ((i3 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            objR2 = l46Var.R();
            if (z4) {
                final int i9 = 1;
                final e89 e89Var12 = e89Var3;
                e89Var4 = e89Var8;
                final e89 e89Var13 = e89Var;
                objR2 = new x16() { // from class: mg
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i10 = i9;
                        wef wefVar = wef.a;
                        e89 e89Var14 = e89Var13;
                        e89 e89Var15 = e89Var12;
                        e89 e89Var16 = e89Var4;
                        a26 a26Var2 = a26Var;
                        switch (i10) {
                            case 0:
                                e89Var16.setValue(Boolean.FALSE);
                                e89Var15.setValue(Boolean.TRUE);
                                n07 n07Var6 = (n07) e89Var14.getValue();
                                if (n07Var6 != null) {
                                    a26Var2.d(n07Var6);
                                }
                                break;
                            default:
                                if (!((Boolean) e89Var16.getValue()).booleanValue()) {
                                    e89Var14.setValue(Boolean.TRUE);
                                } else {
                                    n07 n07Var7 = (n07) e89Var15.getValue();
                                    if (n07Var7 != null) {
                                        a26Var2.d(n07Var7);
                                    }
                                }
                                break;
                        }
                        return wefVar;
                    }
                };
                e89Var5 = e89Var12;
                l46Var.p0(objR2);
            } else {
                final int i10 = 1;
                final e89 e89Var14 = e89Var3;
                e89Var4 = e89Var8;
                final e89 e89Var15 = e89Var;
                objR2 = new x16() { // from class: mg
                    @Override // defpackage.x16
                    public final Object invoke() {
                        int i11 = i10;
                        wef wefVar = wef.a;
                        e89 e89Var16 = e89Var15;
                        e89 e89Var17 = e89Var14;
                        e89 e89Var18 = e89Var4;
                        a26 a26Var2 = a26Var;
                        switch (i11) {
                            case 0:
                                e89Var18.setValue(Boolean.FALSE);
                                e89Var17.setValue(Boolean.TRUE);
                                n07 n07Var6 = (n07) e89Var16.getValue();
                                if (n07Var6 != null) {
                                    a26Var2.d(n07Var6);
                                }
                                break;
                            default:
                                if (!((Boolean) e89Var18.getValue()).booleanValue()) {
                                    e89Var16.setValue(Boolean.TRUE);
                                } else {
                                    n07 n07Var7 = (n07) e89Var17.getValue();
                                    if (n07Var7 != null) {
                                        a26Var2.d(n07Var7);
                                    }
                                }
                                break;
                        }
                        return wefVar;
                    }
                };
                e89Var5 = e89Var14;
                l46Var.p0(objR2);
            }
            x16 x16Var4 = (x16) objR2;
            j09 j09VarC2 = b.c(g09Var, 1.0f);
            if (((n07) e89Var5.getValue()) != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            e89Var6 = e89Var4;
            i8cVar3 = i8cVar2;
            nk8.i(strQ7, x16Var4, j09VarC2, 0.0f, 0.0f, 0.0f, z5, null, null, null, false, l46Var, 384, 0, 3960);
            o5c.f(l46Var, b.d(g09Var, 16.0f));
            c(6, l46Var);
            o5c.f(l46Var, b.d(g09Var, 8.0f));
            n07Var = (n07) e89Var5.getValue();
            if (n07Var != null) {
                p07Var = az2Var;
            } else {
                p07Var = az2Var;
            }
            ynb.g(p07Var, false, null, false, null, l46Var, 199686, 42);
            ca2.a.getClass();
            if (ca2.c) {
                ib8.r(12.0f, 765410684, l46Var, l46Var, g09Var);
                boolean zBooleanValue2 = ((Boolean) e89Var6.getValue()).booleanValue();
                objR3 = l46Var.R();
                if (objR3 == i8cVar3) {
                    z6 = false;
                    objR3 = new pg(e89Var6, 0 == true ? 1 : 0);
                    l46Var.p0(objR3);
                } else {
                    z6 = false;
                }
                a(zBooleanValue2, (a26) objR3, l46Var, 390);
                l46Var.r(z6);
            } else {
                l46Var.f0(765601923);
                l46Var.r(false);
            }
            o5c.f(l46Var, b.d(g09Var, 16.0f));
            l46Var.r(true);
            l46Var.r(true);
            c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d)), false, 0L, 0L, null, x16Var, l46Var, (i3 << 9) & 458752, 30);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x6(i2, ghVar, a26Var, x16Var, 3);
        }
    }

    public static final void g(e63 e63Var, boolean z, a26 a26Var, l46 l46Var, int i2) {
        e63Var.getClass();
        a26Var.getClass();
        l46Var.h0(791841380);
        int i3 = 4;
        int i4 = i2 | (l46Var.g(e63Var) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            xdc.a(b.c, af1.b0(-1195423704, new g43(z, a26Var, e63Var), l46Var), null, null, null, 0, 0L, 0L, null, af1.b0(-474754125, new sg(e63Var, z, a26Var, i3), l46Var), l46Var, 805306422, 508);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new g43(e63Var, z, a26Var, i2);
        }
    }

    public static final void h(String str, TarotSkinIdentify tarotSkinIdentify, l26 l26Var, x16 x16Var, l26 l26Var2, boolean z, boolean z2, x16 x16Var2, a26 a26Var, a26 a26Var2, l46 l46Var, int i2, int i3) {
        int i4;
        x16 x16Var3;
        int i5;
        l46 l46Var2;
        TarotSkinIdentify tarotSkinIdentify2;
        x16 x16Var4;
        Object p43Var;
        Boolean bool;
        y63 y63Var;
        String str2;
        Context context;
        x16 x16Var5;
        e89 e89Var;
        l46 l46Var3;
        str.getClass();
        l26Var.getClass();
        x16Var.getClass();
        l26Var2.getClass();
        l46Var.h0(1673689635);
        int i6 = i2 | (l46Var.g(str) ? 4 : 2);
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 = i6 | 48;
        } else {
            i4 = i6 | (l46Var.e(tarotSkinIdentify == null ? -1 : tarotSkinIdentify.ordinal()) ? 32 : 16);
        }
        int i8 = i4 | (l46Var.i(l26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(l26Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if ((i2 & 1572864) == 0) {
            i8 |= l46Var.h(z2) ? 1048576 : 524288;
        }
        int i9 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i9 != 0) {
            i5 = i8 | 12582912;
            x16Var3 = x16Var2;
        } else {
            x16Var3 = x16Var2;
            i5 = i8 | (l46Var.i(x16Var3) ? 8388608 : 4194304);
        }
        int i10 = i5 | (l46Var.i(a26Var) ? 67108864 : 33554432) | (l46Var.i(a26Var2) ? 536870912 : 268435456);
        if (l46Var.W(i10 & 1, (i10 & 306783379) != 306783378)) {
            TarotSkinIdentify tarotSkinIdentify3 = i7 != 0 ? null : tarotSkinIdentify;
            if (i9 != 0) {
                x16Var3 = null;
            }
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            gy2 gy2VarR = b21.r(pwfVarA);
            nfc nfcVarB = kr7.b(l46Var);
            kob kobVar = job.a;
            y63 y63Var2 = (y63) z5c.G(kobVar.b(y63.class), pwfVarA.g(), null, gy2VarR, nfcVarB, null);
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB2);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = nfcVarB2.b(kobVar.b(e3b.class), null, null);
                l46Var.p0(objR);
            }
            e3b e3bVar = (e3b) objR;
            e89 e89VarT = tm7.t(y63Var2.y, l46Var);
            Context context2 = (Context) l46Var.k(uq.b);
            tt1 tt1Var = (tt1) l46Var.k(vt1.a);
            TarotSkinIdentify tarotSkinIdentify4 = ((die) l46Var.k(snd.a)).a;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = l46Var.i(y63Var2) | l46Var.i(context2) | ((i10 & 14) == 4) | ((i10 & 112) == 32);
            Object objR2 = l46Var.R();
            if (zI || objR2 == i8cVar) {
                bool = boolValueOf;
                p43Var = new p43(y63Var2, context2, str, z, tarotSkinIdentify3, null);
                y63Var = y63Var2;
                str2 = str;
                context2 = context2;
                l46Var.p0(p43Var);
            } else {
                p43Var = objR2;
                str2 = str;
                bool = boolValueOf;
                y63Var = y63Var2;
            }
            af1.q(str2, bool, tarotSkinIdentify3, (l26) p43Var, l46Var);
            e63 e63Var = (e63) e89VarT.getValue();
            d63 d63Var = e63Var instanceof d63 ? (d63) e63Var : null;
            boolean zI2 = l46Var.i(d63Var) | ((29360128 & 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01cb: ARITH (r5v24 'zI2' boolean) = (wrap boolean:0x01bc: INVOKE (r41v0 'l46Var' l46), (r0v35 'd63Var' d63) VIRTUAL call: l46.i(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:445)) | (wrap boolean:?: TERNARY null = ((wrap int:0x01c2: ARITH (29360128 int) & (r28v1 int) A[WRAPPED] (LINE:451)) == (8388608 int)) ? true : false) A[DECLARE_VAR] (LINE:460) in method: dj6.h(java.lang.String, ai.askquin.model.TarotSkinIdentify, l26, x16, l26, boolean, boolean, x16, a26, a26, l46, int, int):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r28v1 int
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1112
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dj6.h(java.lang.String, ai.askquin.model.TarotSkinIdentify, l26, x16, l26, boolean, boolean, x16, a26, a26, l46, int, int):void");
        }

        public static final void i(boolean z, Context context, TarotSkinIdentify tarotSkinIdentify, x16 x16Var, e89 e89Var, e89 e89Var2) {
            e63 e63Var = (e63) e89Var.getValue();
            v4g v4gVarH = null;
            d63 d63Var = e63Var instanceof d63 ? (d63) e63Var : null;
            if (z && d63Var != null) {
                v4gVarH = u3c.h(context, r4g.TodayFortune);
            }
            if (d63Var != null && v4gVarH != null) {
                th5 th5Var = cye.b;
                String string = gcc.E(z57.a.a(), fbc.d()).a().toString();
                if (!v4gVarH.a && !v4gVarH.b && !pa7.t(v4gVarH.c, string)) {
                    qhe qheVarR = q7c.r(d63Var.c);
                    TarotSkinIdentify tarotSkinIdentifyB = d63Var.g.b();
                    if (tarotSkinIdentifyB != null) {
                        tarotSkinIdentify = tarotSkinIdentifyB;
                    }
                    String string2 = context.getString(r8c.f(qheVarR));
                    string2.getClass();
                    e89Var2.setValue(new t4g(qheVarR, tarotSkinIdentify, string2, d63Var.b));
                    return;
                }
            }
            x16Var.invoke();
        }

        public static final void j(final d63 d63Var, final boolean z, xw9 xw9Var, final a26 a26Var, l46 l46Var, int i2) {
            l46Var.h0(-1614676538);
            int i3 = i2 | (l46Var.g(d63Var) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.g(xw9Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
            int i4 = 0;
            if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
                j18 j18VarA = k18.a(0, 3, l46Var);
                final TarotSkinIdentify tarotSkinIdentifyB = d63Var.g.b();
                float f2 = we6.e(l46Var) ? 24.0f : 16.0f;
                j09 j09VarY = ynb.Y(b.c, xw9Var);
                uc0 uc0Var = new uc0(we6.e(l46Var) ? 0.0f : 12.0f, true, new qc0(i4));
                bx9 bx9VarR = ynb.r(we6.e(l46Var) ? 0.0f : f2, 0.0f, we6.e(l46Var) ? 0.0f : f2, 24.0f, 2);
                boolean zD = l46Var.d(f2) | ((i3 & 14) == 4) | l46Var.e(tarotSkinIdentifyB == null ? -1 : tarotSkinIdentifyB.ordinal()) | ((i3 & 7168) == 2048) | ((i3 & 112) == 32);
                Object objR = l46Var.R();
                if (zD || objR == sf2.a) {
                    final float f3 = f2;
                    a26 a26Var2 = new a26() { // from class: h43
                        @Override // defpackage.a26
                        public final Object d(Object obj) {
                            v08 v08Var = (v08) obj;
                            v08Var.getClass();
                            final float f4 = f3;
                            final d63 d63Var2 = d63Var;
                            TarotSkinIdentify tarotSkinIdentify = tarotSkinIdentifyB;
                            final a26 a26Var3 = a26Var;
                            v08.W(v08Var, null, new dd2(new j43(f4, d63Var2, tarotSkinIdentify, a26Var3, 0), true, 816113233), 3);
                            v08.W(v08Var, null, new dd2(new k43(d63Var2, f4, 0), true, -796513990), 3);
                            if (!d63Var2.f.isEmpty()) {
                                final boolean z2 = z;
                                v08.W(v08Var, null, new dd2(new n26() { // from class: l43
                                    @Override // defpackage.n26
                                    public final Object m(Object obj2, Object obj3, Object obj4) {
                                        l46 l46Var2 = (l46) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((mx7) obj2).getClass();
                                        if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            k8b.b(qn4.d, l46Var2, 6);
                                            List list = d63Var2.f;
                                            boolean zE = we6.e(l46Var2);
                                            float f5 = f4;
                                            dj6.r(list, z2, a26Var3, ynb.d0(zE ? f5 : 0.0f, 12.0f, we6.e(l46Var2) ? f5 : 0.0f, 0.0f, 8, g09.a), l46Var2, 0);
                                        } else {
                                            l46Var2.Z();
                                        }
                                        return wef.a;
                                    }
                                }, true, -1036540266), 3);
                            }
                            return wef.a;
                        }
                    };
                    l46Var.p0(a26Var2);
                    objR = a26Var2;
                }
                af1.s(j09VarY, j18VarA, bx9VarR, uc0Var, null, null, false, null, (a26) objR, l46Var, 0, 488);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new o50(d63Var, z, xw9Var, a26Var, i2, 9);
            }
        }

        public static final void k(x16 x16Var, dd2 dd2Var, l46 l46Var, int i2, int i3) {
            int i4;
            l46Var.h0(-1298372498);
            int i5 = i3 & 1;
            if (i5 != 0) {
                i4 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i4 = (l46Var.i(x16Var) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
            if (l46Var.W(i4 & 1, (i4 & 19) != 18)) {
                int i6 = 11;
                i8c i8cVar = sf2.a;
                if (i5 != 0) {
                    Object objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = new fk8(i6);
                        l46Var.p0(objR);
                    }
                    x16Var = (x16) objR;
                }
                Context context = (Context) l46Var.k(uq.b);
                Context contextH = kn2.H(context);
                if (contextH == null) {
                    contextH = context;
                }
                if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                    l46Var.f0(2099519863);
                    dd2Var.z(l46Var, 6);
                    l46Var.r(false);
                } else {
                    l46Var.f0(2099520671);
                    pr4 pr4Var = n72.a;
                    Object applicationContext = contextH.getApplicationContext();
                    applicationContext.getClass();
                    di2 di2Var = new di2(((rkd) applicationContext).a(context).a);
                    ((p95) di2Var.v).a.put(yw6.f, Boolean.FALSE);
                    e1b e1bVarA = pr4Var.a(di2Var.c());
                    pr4 pr4Var2 = o10.a;
                    boolean z = (i4 & 14) == 4;
                    Object objR2 = l46Var.R();
                    if (z || objR2 == i8cVar) {
                        objR2 = new fn6(10, x16Var);
                        l46Var.p0(objR2);
                    }
                    mh3.b(new e1b[]{e1bVarA, pr4Var2.a((x16) objR2)}, af1.b0(-1058472310, new qx1(dd2Var, i6), l46Var), l46Var, 48);
                    l46Var.r(false);
                }
            } else {
                l46Var.Z();
            }
            x16 x16Var2 = x16Var;
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new or1(x16Var2, dd2Var, i2, i3, 6);
            }
        }

        public static final void l(final boolean z, final sfb sfbVar, final boolean z2, final boolean z3, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, l46 l46Var, final int i2) {
            int i3;
            l46Var.h0(1469263253);
            int i4 = 2;
            if ((i2 & 6) == 0) {
                i3 = (l46Var.h(z) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= l46Var.e(sfbVar == null ? -1 : sfbVar.ordinal()) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i2 & 3072) == 0) {
                i3 |= l46Var.h(z3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if ((i2 & 24576) == 0) {
                i3 |= l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            if ((196608 & i2) == 0) {
                i3 |= l46Var.i(x16Var2) ? 131072 : 65536;
            }
            if ((1572864 & i2) == 0) {
                i3 |= l46Var.i(x16Var3) ? 1048576 : 524288;
            }
            int i5 = i3;
            if (l46Var.W(i5 & 1, (i5 & 599187) != 599186)) {
                x4d x4dVarB = a7c.b(24.0f);
                if (we6.e(l46Var)) {
                    x4dVarB = g21.f;
                }
                Object objR = l46Var.R();
                i8c i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = new z8b(5);
                    l46Var.p0(objR);
                }
                g09 g09Var = g09.a;
                j09 j09VarG = k8b.g(bzd.x(g09Var, (a26) objR), new mk3(x4dVarB, i4), l46Var, 6);
                xn8 xn8VarC = s21.c(ndb.b, false);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarG);
                lf2.q.getClass();
                l46Var.j0();
                boolean z4 = l46Var.S;
                ov7 ov7Var = LayoutNode.h1;
                if (z4) {
                    l46Var.l(ov7Var);
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
                Object objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = new z8b(6);
                    l46Var.p0(objR2);
                }
                j09 j09VarX = bzd.x(g09Var, (a26) objR2);
                t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(0)), ndb.z, l46Var, 54);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarX);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, t7cVarA);
                dec.l(he2Var2, l46Var, u8aVarM2);
                ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ2);
                int i6 = (i5 << 15) & 458752;
                int i7 = i5 << 12;
                int i8 = i7 & 3670016;
                int i9 = i7 & 29360128;
                int i10 = i6 | i8 | i9;
                m(R.drawable.ic_feedback_dislike, R.drawable.ic_feedback_dislike_selected, z ? R.raw.anim_feedback_dislike_neo : R.raw.anim_feedback_dislike, afc.q(R.string.reading_feedback_dislike, l46Var), sfbVar == sfb.DISLIKE, z, z2, z3, 0.0f, 0.0f, x16Var, l46Var, i10, (i5 >> 12) & 14, 768);
                m(R.drawable.ic_feedback_like, R.drawable.ic_feedback_like_selected, z ? R.raw.anim_feedback_like_neo : R.raw.anim_feedback_like, afc.q(R.string.reading_feedback_like, l46Var), sfbVar == sfb.LIKE, z, z2, z3, 0.0f, 0.0f, x16Var2, l46Var, i10, (i5 >> 15) & 14, 768);
                m(R.drawable.ic_feedback_love, R.drawable.ic_feedback_love_selected, z ? R.raw.anim_feedback_love_neo : R.raw.anim_feedback_love, afc.q(R.string.reading_feedback_love, l46Var), sfbVar == sfb.LOVE, z, z2, z3, 32.0f, 108.0f, x16Var3, l46Var, i6 | 905969664 | i8 | i9, (i5 >> 18) & 14, 0);
                l46Var.r(true);
                l46Var.r(true);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: yeb
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        dj6.l(z, sfbVar, z2, z3, x16Var, x16Var2, x16Var3, (l46) obj, k99.P(i2 | 1));
                        return wef.a;
                    }
                };
            }
        }

        public static final void m(final int i2, final int i3, final int i4, final String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, float f2, float f3, final x16 x16Var, l46 l46Var, final int i5, final int i6, final int i7) {
            int i8;
            int i9;
            l46 l46Var2;
            final float f4;
            final float f5;
            boolean z5;
            long j;
            boolean z6;
            boolean z7;
            l46Var.h0(1734786677);
            if ((i5 & 6) == 0) {
                i8 = (l46Var.e(i2) ? 4 : 2) | i5;
            } else {
                i8 = i5;
            }
            if ((i5 & 48) == 0) {
                i8 |= l46Var.e(i3) ? 32 : 16;
            }
            if ((i5 & 384) == 0) {
                i8 |= l46Var.e(i4) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i5 & 3072) == 0) {
                i8 |= l46Var.g(str) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if ((i5 & 24576) == 0) {
                i8 |= l46Var.h(z) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            if ((196608 & i5) == 0) {
                i8 |= l46Var.h(z2) ? 131072 : 65536;
            }
            if ((1572864 & i5) == 0) {
                i8 |= l46Var.h(z3) ? 1048576 : 524288;
            }
            if ((12582912 & i5) == 0) {
                i8 |= l46Var.h(z4) ? 8388608 : 4194304;
            }
            int i10 = i7 & 256;
            if (i10 != 0) {
                i8 |= 100663296;
            } else if ((i5 & 100663296) == 0) {
                i8 |= l46Var.d(f2) ? 67108864 : 33554432;
            }
            int i11 = i7 & 512;
            if (i11 != 0) {
                i8 |= 805306368;
            } else if ((i5 & 805306368) == 0) {
                i8 |= l46Var.d(f3) ? 536870912 : 268435456;
            }
            if ((i6 & 6) == 0) {
                i9 = i6 | (l46Var.i(x16Var) ? 4 : 2);
            } else {
                i9 = i6;
            }
            if (l46Var.W(i8 & 1, ((i8 & 306783379) == 306783378 && (i9 & 3) == 2) ? false : true)) {
                float f6 = i10 != 0 ? 24.0f : f2;
                float f7 = i11 == 0 ? f3 : 24.0f;
                pr4 pr4Var = l8b.a;
                long j2 = ((e8b) l46Var.k(pr4Var)).t;
                if (z2) {
                    l46Var.f0(682698435);
                    j = ((e8b) l46Var.k(pr4Var)).q;
                    z5 = false;
                } else {
                    z5 = false;
                    l46Var.f0(682699305);
                    j = ((e8b) l46Var.k(pr4Var)).i;
                }
                l46Var.r(z5);
                gh6 gh6VarW0 = kj0.w0(l46Var);
                g09 g09Var = g09.a;
                j09 j09VarL = b.l(g09Var, 32.0f);
                Object objR = l46Var.R();
                long j3 = j;
                int i12 = 7;
                i8c i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = new z8b(i12);
                    l46Var.p0(objR);
                }
                j09 j09VarX = bzd.x(j09VarL, (a26) objR);
                boolean zI = ((i9 & 14) == 4) | l46Var.i(gh6VarW0);
                Object objR2 = l46Var.R();
                if (zI || objR2 == i8cVar) {
                    objR2 = new sj2(gh6VarW0, x16Var, 7);
                    l46Var.p0(objR2);
                }
                j09 j09VarB = g21.B(j09VarX, z4, (x16) objR2);
                xn8 xn8VarC = s21.c(ndb.f, false);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarB);
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
                if (z) {
                    l46Var.f0(-1740798215);
                    if (z3) {
                        l46Var.f0(-1740779553);
                        fi8 fi8VarK = y41.K(new hi8(i4), null, l46Var, 0, 62);
                        z6 = true;
                        ug8 ug8VarL = rs0.l((uh8) fi8VarK.getValue(), true, false, false, 0.0f, 1, l46Var, 956);
                        boolean z8 = ((Number) ((eh8) ug8VarL).getValue()).floatValue() >= 1.0f;
                        if (((uh8) fi8VarK.getValue()) == null || z8) {
                            l46Var.f0(-1739919706);
                            gu6.b(od4.A(i3, (i8 >> 3) & 14, l46Var), str, b.l(g09Var, 20.0f), j3, l46Var, 392 | ((i8 >> 6) & 112), 0);
                            l46Var2 = l46Var;
                            z7 = false;
                            l46Var2.r(false);
                        } else {
                            l46Var.f0(-1740443296);
                            j09 j09VarN = tm7.N(0.0f, yi4.a(f7, 32.0f) > 0 ? ((20.0f - f7) / 2.0f) + 2.0f : 0.0f, g09Var, 1);
                            Object objR3 = l46Var.R();
                            if (objR3 == i8cVar) {
                                objR3 = new z8b(8);
                                l46Var.p0(objR3);
                            }
                            j09 j09VarI = b.i(bzd.x(j09VarN, (a26) objR3), f6, f7);
                            uh8 uh8Var = (uh8) fi8VarK.getValue();
                            boolean zG = l46Var.g(ug8VarL);
                            Object objR4 = l46Var.R();
                            if (zG || objR4 == i8cVar) {
                                objR4 = new fh8(ug8VarL, z6 ? 1 : 0);
                                l46Var.p0(objR4);
                            }
                            mh3.e(uh8Var, (x16) objR4, j09VarI, false, false, false, false, null, false, null, null, false, false, null, null, false, l46Var, 0, 0, 131064);
                            l46Var2 = l46Var;
                            z7 = false;
                            l46Var2.r(false);
                        }
                        l46Var2.r(z7);
                    } else {
                        z6 = true;
                        l46Var.f0(-1739671148);
                        gu6.b(od4.A(i3, (i8 >> 3) & 14, l46Var), str, b.l(g09Var, 20.0f), j3, l46Var, 392 | ((i8 >> 6) & 112), 0);
                        l46Var2 = l46Var;
                        z7 = false;
                        l46Var2.r(false);
                    }
                    l46Var2.r(z7);
                } else {
                    z6 = true;
                    l46Var.f0(-1739438648);
                    gu6.b(od4.A(i2, i8 & 14, l46Var), str, b.l(g09Var, 20.0f), j2, l46Var, 392 | ((i8 >> 6) & 112), 0);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                }
                l46Var2.r(z6);
                f5 = f7;
                f4 = f6;
            } else {
                l46Var2 = l46Var;
                l46Var2.Z();
                f4 = f2;
                f5 = f3;
            }
            ojb ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: zeb
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i5 | 1);
                        int iP2 = k99.P(i6);
                        dj6.m(i2, i3, i4, str, z, z2, z3, z4, f4, f5, x16Var, (l46) obj, iP, iP2, i7);
                        return wef.a;
                    }
                };
            }
        }

        public static final void n(j09 j09Var, l46 l46Var, int i2) {
            l46Var.h0(-109006593);
            if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
                long jB = y72.b(y72.e, 0.5f);
                j09 j09VarD = b.d(j09Var, 1.0f);
                Object objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = new ac(jB, 9);
                    l46Var.p0(objR);
                }
                nk8.e(48, (a26) objR, l46Var, j09VarD);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l50(i2, 27, j09Var);
            }
        }

        public static final void o(int i2, int i3, j09 j09Var, l46 l46Var, int i4) {
            int i5;
            ov7 ov7Var;
            l46 l46Var2 = l46Var;
            l46Var2.h0(594457563);
            if ((i4 & 6) == 0) {
                i5 = (l46Var2.e(i2) ? 4 : 2) | i4;
            } else {
                i5 = i4;
            }
            if ((i4 & 48) == 0) {
                i5 |= l46Var2.e(i3) ? 32 : 16;
            }
            if ((i4 & 384) == 0) {
                i5 |= l46Var2.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if (l46Var2.W(i5 & 1, (i5 & 147) != 146)) {
                sw3 sw3Var = (sw3) l46Var2.k(zg2.h);
                Object objR = l46Var2.R();
                i8c i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = q1c.f(new yi4(72.0f));
                    l46Var2.p0(objR);
                }
                e89 e89Var = (e89) objR;
                boolean zD = l46Var2.d(((yi4) e89Var.getValue()).a);
                Object objR2 = l46Var2.R();
                if (zD || objR2 == i8cVar) {
                    objR2 = new l16(((yi4) e89Var.getValue()).a + 48.0f);
                    l46Var2.p0(objR2);
                }
                l16 l16Var = (l16) objR2;
                j09 j09VarE = oa7.E(b.f(184.0f, 0.0f, j09Var, 2), l16Var);
                long j = y72.e;
                j09 j09VarW = db6.w(j09VarE, 1.0f, y72.b(j, 0.16f), l16Var);
                xn8 xn8VarC = s21.c(ndb.b, false);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ = m93.J(l46Var2, j09VarW);
                lf2.q.getClass();
                l46Var2.j0();
                boolean z = l46Var2.S;
                ov7 ov7Var2 = LayoutNode.h1;
                if (z) {
                    l46Var2.l(ov7Var2);
                } else {
                    l46Var2.s0();
                }
                he2 he2Var = hj6.z;
                dec.l(he2Var, l46Var2, xn8VarC);
                he2 he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var2, u8aVarM);
                Integer numValueOf = Integer.valueOf(iHashCode);
                he2 he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var2, numValueOf);
                dec.k(l46Var2);
                he2 he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var2, j09VarJ);
                fy9 fy9VarA = od4.A(R.drawable.friend_coupon_card_bg, 0, l46Var2);
                d31 d31Var = d31.a;
                g09 g09Var = g09.a;
                feg.j(fy9VarA, null, d31Var.b(g09Var), null, an2.a, 0.0f, null, l46Var2, 24632, 104);
                j09 j09VarZ = ynb.Z(b.c(g09Var, 1.0f), 24.0f);
                int i6 = 1;
                uc0 uc0Var = new uc0(24.0f, true, new qc0(0));
                jx0 jx0Var = ndb.Y;
                c92 c92VarA = a92.a(uc0Var, jx0Var, l46Var2, 6);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, j09VarZ);
                l46Var2.j0();
                if (l46Var2.S) {
                    ov7Var = ov7Var2;
                    l46Var2.l(ov7Var);
                } else {
                    ov7Var = ov7Var2;
                    l46Var2.s0();
                }
                dec.l(he2Var, l46Var2, c92VarA);
                dec.l(he2Var2, l46Var2, u8aVarM2);
                ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                dec.l(he2Var4, l46Var2, j09VarJ2);
                j09 j09VarF = b.f(72.0f, 0.0f, g09Var, 2);
                boolean zG = l46Var2.g(sw3Var);
                Object objR3 = l46Var2.R();
                if (zG || objR3 == i8cVar) {
                    objR3 = new si3(sw3Var, e89Var, i6);
                    l46Var2.p0(objR3);
                }
                j09 j09VarD = ym8.D(j09VarF, (a26) objR3);
                c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(0)), jx0Var, l46Var2, 6);
                int iHashCode3 = Long.hashCode(l46Var2.T);
                u8a u8aVarM3 = l46Var2.m();
                j09 j09VarJ3 = m93.J(l46Var2, j09VarD);
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
                String strQ = afc.q(R.string.friend_coupon_title, l46Var2);
                mue mueVar = pue.a;
                mue mueVarN = we6.e(l46Var2) ? pue.n(l46Var2) : mue.a(pue.n(l46Var2), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183);
                pr4 pr4Var = l8b.a;
                long j2 = ((e8b) l46Var2.k(pr4Var)).q;
                long j3 = ((e8b) l46Var2.k(pr4Var)).v;
                if (we6.e(l46Var2)) {
                    j3 = j2;
                }
                ov7 ov7Var3 = ov7Var;
                nte.b(strQ, null, j3, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarN, l46Var, 0, 0, 131066);
                String strR = afc.r(R.string.friend_coupon_card_benefit, new Object[]{Integer.valueOf(i2)}, l46Var);
                mue mueVar2 = oue.a;
                nte.b(strR, null, ((e8b) l46Var.k(pr4Var)).w, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, pue.c(l46Var), l46Var, 0, 24960, 110586);
                l46Var.r(true);
                n(b.c(g09Var, 1.0f), l46Var, 6);
                j09 j09VarC = b.c(g09Var, 1.0f);
                t7c t7cVarA = s7c.a(xc0.a, ndb.y, l46Var, 48);
                int iHashCode4 = Long.hashCode(l46Var.T);
                u8a u8aVarM4 = l46Var.m();
                j09 j09VarJ4 = m93.J(l46Var, j09VarC);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var3);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, t7cVarA);
                dec.l(he2Var2, l46Var, u8aVarM4);
                ib8.s(iHashCode4, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ4);
                nte.b(afc.r(R.string.friend_coupon_card_validity, new Object[]{Integer.valueOf(i3)}, l46Var), new jw7(1.0f, true), ((e8b) l46Var.k(pr4Var)).x, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 0, 0, 131064);
                l46Var2 = l46Var;
                o5c.f(l46Var2, b.p(g09Var, 8.0f));
                feg.j(od4.A(R.drawable.gift_card_quin_mark, 0, l46Var2), null, b.l(g09Var, 16.0f), null, null, 0.0f, new xz0(y72.b(j, 0.3f), 5), l46Var2, 1573304, 56);
                tec.s(l46Var2, true, true, true);
            } else {
                l46Var2.Z();
            }
            ojb ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new zp1(i2, i3, i4, 1, j09Var);
            }
        }

        public static final void p(l06 l06Var, j09 j09Var, l46 l46Var, int i2) {
            l46Var.h0(-46046641);
            int i3 = (l46Var.g(l06Var) ? 4 : 2) | i2;
            if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
                o(l06Var.e, l06Var.f, j09Var, l46Var, 384);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new o14(l06Var, j09Var, i2, 22);
            }
        }

        public static final void q(String str, l46 l46Var, int i2) {
            l46 l46Var2;
            l46Var.h0(-593046134);
            int i3 = (l46Var.g(str) ? 4 : 2) | i2;
            if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
                c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                g09 g09Var = g09.a;
                j09 j09VarJ = m93.J(l46Var, g09Var);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, c92VarA);
                dec.l(hj6.y, l46Var, u8aVarM);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ);
                no6.p((i3 & 14) | 48, l46Var, ynb.b0(32.0f, 0.0f, g09Var, 2), str);
                l46Var2 = l46Var;
                oa7.d(null, 0.5f, ((e8b) l46Var.k(l8b.a)).A, l46Var2, 48, 1);
                l46Var2.r(true);
            } else {
                l46Var2 = l46Var;
                l46Var2.Z();
            }
            ojb ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new o8(str, i2, 19);
            }
        }

        public static final void r(List list, boolean z, a26 a26Var, j09 j09Var, l46 l46Var, int i2) {
            l46 l46Var2;
            long jC;
            long j;
            l46Var.h0(1057438256);
            int i3 = i2 | (l46Var.g(list) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
            int i4 = 0;
            if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
                c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(i4)), ndb.Y, l46Var, 6);
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
                dec.l(hj6.z, l46Var, c92VarA);
                dec.l(hj6.y, l46Var, u8aVarM);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ);
                String strQ = afc.q(z ? R.string.tomorrow_fortune_guidance_title : R.string.daily_fortune_guidance_title, l46Var);
                mue mueVar = ((p9f) l46Var.k(r9f.a)).i;
                long j2 = ((m82) l46Var.k(o82.a)).a;
                ar5 ar5Var = ar5.y;
                float f2 = we6.e(l46Var) ? 0.0f : 20.0f;
                g09 g09Var = g09.a;
                g09 g09Var2 = g09Var;
                nte.b(strQ, ynb.d0(f2, 0.0f, 0.0f, 0.0f, 14, g09Var), j2, 0L, ar5Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar, l46Var, 1572864, 0, 131000);
                l46Var2 = l46Var;
                boolean zS = g21.S(l46Var2);
                y6c y6cVarB = a7c.b(12.0f);
                if (zS) {
                    l46Var2.f0(-87701927);
                    jC = ((e8b) l46Var2.k(l8b.a)).f;
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-87702889);
                    l46Var2.r(false);
                    jC = abg.c(268435455);
                }
                if (zS) {
                    l46Var2.f0(-87699110);
                    j = ((e8b) l46Var2.k(l8b.a)).B;
                } else {
                    l46Var2.f0(-87699949);
                    j = ((e8b) l46Var2.k(l8b.a)).m;
                }
                l46Var2.r(false);
                l46Var2.f0(-87697412);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    mue mueVar2 = ((p9f) l46Var2.k(r9f.a)).k;
                    g09 g09Var3 = g09Var2;
                    j09 j09VarE = oa7.E(db6.w(tm7.o(g09Var3, jC, y6cVarB), 0.5f, j, y6cVarB), y6cVarB);
                    y6c y6cVar = y6cVarB;
                    boolean zG = ((i3 & 896) == 256) | l46Var2.g(str);
                    Object objR = l46Var2.R();
                    if (zG || objR == sf2.a) {
                        objR = new n43(i4, a26Var, str);
                        l46Var2.p0(objR);
                    }
                    g09Var2 = g09Var3;
                    nte.b(str, ynb.a0(androidx.compose.foundation.b.c(j09VarE, false, null, null, (x16) objR, 15), 16.0f, 12.0f), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar2, l46Var, 0, 0, 131068);
                    l46Var2 = l46Var;
                    j = j;
                    y6cVarB = y6cVar;
                    jC = jC;
                }
                l46Var2.r(false);
                l46Var2.r(true);
            } else {
                l46Var2 = l46Var;
                l46Var2.Z();
            }
            ojb ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new o50(list, z, a26Var, j09Var, i2, 10);
            }
        }

        public static final void s(j09 j09Var, ii6 ii6Var, j18 j18Var, float f2, z63 z63Var, LocalDate localDate, LocalDate localDate2, z63 z63Var2, h73 h73Var, h73 h73Var2, h73 h73Var3, int i2, TarotSkinIdentify tarotSkinIdentify, List list, a26 a26Var, x16 x16Var, boolean z, x16 x16Var2, List list2, x16 x16Var3, x16 x16Var4, x16 x16Var5, a26 a26Var2, a26 a26Var3, x16 x16Var6, x16 x16Var7, a26 a26Var4, l46 l46Var, int i3) {
            int i4;
            j18Var.getClass();
            localDate.getClass();
            h73Var.getClass();
            h73Var2.getClass();
            list.getClass();
            a26Var.getClass();
            x16Var.getClass();
            x16Var2.getClass();
            list2.getClass();
            x16Var3.getClass();
            x16Var4.getClass();
            x16Var5.getClass();
            a26Var2.getClass();
            a26Var3.getClass();
            x16Var6.getClass();
            x16Var7.getClass();
            a26Var4.getClass();
            l46Var.h0(1063147930);
            if ((i3 & 6) == 0) {
                i4 = (l46Var.g(j09Var) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & 48) == 0) {
                i4 |= l46Var.g(ii6Var) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                i4 |= l46Var.g(j18Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i3 & 3072) == 0) {
                i4 |= l46Var.d(f2) ? 2048 : 1024;
            }
            if ((i3 & 24576) == 0) {
                i4 |= (i3 & 32768) == 0 ? l46Var.g(z63Var) : l46Var.i(z63Var) ? 16384 : 8192;
            }
            if ((196608 & i3) == 0) {
                i4 |= l46Var.i(localDate) ? 131072 : 65536;
            }
            if ((1572864 & i3) == 0) {
                i4 |= l46Var.i(localDate2) ? 1048576 : 524288;
            }
            if ((12582912 & i3) == 0) {
                i4 |= (i3 & 16777216) == 0 ? l46Var.g(z63Var2) : l46Var.i(z63Var2) ? 8388608 : 4194304;
            }
            if ((100663296 & i3) == 0) {
                i4 |= l46Var.e(h73Var.ordinal()) ? 67108864 : 33554432;
            }
            if ((805306368 & i3) == 0) {
                i4 |= l46Var.e(h73Var2.ordinal()) ? 536870912 : 268435456;
            }
            int i5 = (l46Var.e(tarotSkinIdentify == null ? -1 : tarotSkinIdentify.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.e(h73Var3 == null ? -1 : h73Var3.ordinal()) ? (char) 4 : (char) 2) | (l46Var.e(i2) ? ' ' : (char) 16) | (l46Var.g(list) ? 2048 : 1024) | (l46Var.i(a26Var) ? 16384 : 8192) | (l46Var.i(x16Var) ? 131072 : 65536) | (l46Var.h(z) ? 1048576 : 524288) | (l46Var.i(x16Var2) ? (char) 0 : (char) 0) | (l46Var.g(list2) ? (char) 0 : (char) 0) | (l46Var.i(x16Var3) ? (char) 0 : (char) 0);
            int i6 = (l46Var.i(x16Var4) ? (char) 4 : (char) 2) | (l46Var.i(x16Var5) ? ' ' : (char) 16) | (l46Var.i(a26Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var3) ? (char) 2048 : (char) 1024) | (l46Var.i(x16Var6) ? (char) 16384 : (char) 8192) | (l46Var.i(x16Var7) ? (char) 0 : (char) 0) | (l46Var.i(a26Var4) ? (char) 0 : (char) 0);
            int i7 = i4;
            if (l46Var.W(i7 & 1, ((i7 & 306783379) == 306783378 && (i5 & 306783379) == 306783378 && (599187 & i6) == 599186) ? false : true)) {
                j09 j09VarO = tm7.o(j09Var.D(b.c), ((e8b) l46Var.k(l8b.a)).a, g21.f);
                bx9 bx9VarR = ynb.r(0.0f, 0.0f, 0.0f, f2 + 104.0f, 7);
                boolean zI = ((i5 & 7168) == 2048) | ((i5 & 458752) == 131072) | ((i5 & 57344) == 16384) | l46Var.i(localDate2) | ((i7 & 112) == 32) | ((i7 & 57344) == 16384 || ((i7 & 32768) != 0 && l46Var.i(z63Var))) | l46Var.i(localDate) | ((i7 & 29360128) == 8388608 || ((i7 & 16777216) != 0 && l46Var.i(z63Var2))) | ((i7 & 234881024) == 67108864) | ((i7 & 1879048192) == 536870912) | ((i6 & 7168) == 2048) | ((i5 & 14) == 4) | ((i5 & 112) == 32) | ((i6 & 57344) == 16384) | ((i6 & 112) == 32) | ((i6 & 896) == 256) | ((i5 & 896) == 256) | ((i5 & 3670016) == 1048576) | ((i5 & 1879048192) == 536870912) | ((i5 & 29360128) == 8388608) | ((i6 & 14) == 4) | ((i6 & 458752) == 131072) | ((i5 & 234881024) == 67108864) | ((i6 & 3670016) == 1048576);
                Object objR = l46Var.R();
                if (zI || objR == sf2.a) {
                    mn6 mn6Var = new mn6(list, localDate2, list2, x16Var, a26Var, ii6Var, z63Var, localDate, z63Var2, h73Var, h73Var2, a26Var3, h73Var3, i2, x16Var6, x16Var5, a26Var2, tarotSkinIdentify, x16Var3, x16Var2, x16Var4, x16Var7, z, a26Var4, 0);
                    l46Var.p0(mn6Var);
                    objR = mn6Var;
                }
                af1.s(j09VarO, j18Var, bx9VarR, null, null, null, false, null, (a26) objR, l46Var, (i7 >> 3) & 112, 504);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new nn6(j09Var, ii6Var, j18Var, f2, z63Var, localDate, localDate2, z63Var2, h73Var, h73Var2, h73Var3, i2, tarotSkinIdentify, list, a26Var, x16Var, z, x16Var2, list2, x16Var3, x16Var4, x16Var5, a26Var2, a26Var3, x16Var6, x16Var7, a26Var4, i3, 0);
            }
        }

        public static final void t(x16 x16Var, j09 j09Var, e08 e08Var, tz7 tz7Var, l46 l46Var, int i2) {
            l46Var.h0(1055276397);
            int i3 = (l46Var.i(x16Var) ? 4 : 2) | i2 | (l46Var.g(j09Var) ? 32 : 16) | (l46Var.g(e08Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(tz7Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
            if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
                ok8.g(af1.b0(-933153643, new sz7(e08Var, j09Var, tz7Var, q1c.i(x16Var, l46Var), 0), l46Var), l46Var, 6);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new q8(x16Var, j09Var, e08Var, tz7Var, i2, 27);
            }
        }

        public static final void u(int i2, int i3, l46 l46Var, j09 j09Var, String str) {
            int i4;
            j09 j09Var2;
            l46 l46Var2 = l46Var;
            String str2 = str;
            l46Var2.h0(-1795077810);
            int i5 = i2 | (l46Var2.g(str2) ? 4 : 2);
            int i6 = i3 & 2;
            if (i6 != 0) {
                i4 = i5 | 48;
            } else {
                i4 = i5 | (l46Var.g(j09Var) ? 32 : 16);
            }
            int i7 = i4;
            int i8 = 0;
            if (l46Var2.W(i7 & 1, (i7 & 19) != 18)) {
                j09 j09Var3 = i6 != 0 ? g09.a : j09Var;
                c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(i8)), ndb.Y, l46Var2, 6);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ = m93.J(l46Var2, j09Var3);
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
                String strQ = afc.q(R.string.daily_fortune_reading_title, l46Var2);
                pr4 pr4Var = r9f.a;
                nte.b(strQ, null, ((m82) l46Var2.k(o82.a)).a, 0L, ar5.y, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var2.k(pr4Var)).i, l46Var, 1572864, 0, 131002);
                nte.b(str, null, 0L, 0L, null, null, 0L, null, null, w6c.l(24), 0, false, 0, 0, null, ((p9f) l46Var.k(pr4Var)).k, l46Var, i7 & 14, 48, 129022);
                str2 = str;
                l46Var2 = l46Var;
                l46Var2.r(true);
                j09Var2 = j09Var3;
            } else {
                l46Var2.Z();
                j09Var2 = j09Var;
            }
            ojb ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new o43(str2, j09Var2, i2, i3);
            }
        }

        public static final void v(j09 j09Var, l26 l26Var, sfb sfbVar, boolean z, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, l46 l46Var, int i2) {
            int i3;
            boolean z2;
            float f2;
            boolean z3;
            l46 l46Var2 = l46Var;
            l46Var2.h0(2126539882);
            if ((i2 & 6) == 0) {
                i3 = i2 | (l46Var2.g(j09Var) ? 4 : 2);
            } else {
                i3 = i2;
            }
            int i4 = i3 | (l46Var2.e(sfbVar == null ? -1 : sfbVar.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var2.i(x16Var2) ? 131072 : 65536) | (l46Var2.i(x16Var3) ? 1048576 : 524288) | (l46Var2.i(x16Var4) ? 8388608 : 4194304);
            if (l46Var2.W(i4 & 1, (4793491 & i4) != 4793490)) {
                pr4 pr4Var = l8b.a;
                boolean zF = k8b.f((e8b) l46Var2.k(pr4Var));
                j09 j09VarC = b.c(j09Var, 1.0f);
                t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
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
                dec.l(hj6.z, l46Var2, t7cVarA);
                dec.l(hj6.y, l46Var2, u8aVarM);
                dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                dec.k(l46Var2);
                dec.l(hj6.x, l46Var2, j09VarJ);
                if (l26Var != null) {
                    l46Var2.f0(-793316066);
                    l26Var.z(l46Var2, 6);
                    l46Var2.r(false);
                    z2 = false;
                    f2 = 1.0f;
                    z3 = true;
                } else {
                    l46Var2.f0(-793188656);
                    String strQ = afc.q(R.string.reading_feedback_prompt, l46Var2);
                    mue mueVar = pue.a;
                    long j = ((e8b) l46Var2.k(pr4Var)).t;
                    l46Var2.f0(-792814114);
                    l46Var2.r(false);
                    z2 = false;
                    f2 = 1.0f;
                    z3 = true;
                    nte.b(strQ, g09.a, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar, l46Var, 0, 0, 131064);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                }
                o5c.f(l46Var2, new jw7(f2, z3));
                l(zF, sfbVar, z, !(sfbVar != null ? z3 : z2), x16Var, x16Var2, x16Var3, l46Var2, ((i4 >> 3) & 1008) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016));
                l46Var2.r(z3);
            } else {
                l46Var2.Z();
            }
            ojb ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new cc(j09Var, l26Var, sfbVar, z, x16Var, x16Var2, x16Var3, x16Var4, i2);
            }
        }

        public static j09 w(j09 j09Var, float f2) {
            return j09Var.D(new wd0(f2));
        }

        public static long x(int i2, long j) {
            int i3;
            int i4 = (int) (j >> 32);
            if (i4 <= 0 || (i3 = (int) (j & 4294967295L)) <= 0) {
                return 0L;
            }
            if (i2 < 4) {
                qc0.j("Failed requirement.");
                return 0L;
            }
            double d2 = i4;
            double d3 = i3;
            double dSqrt = Math.sqrt(((double) i2) / ((d2 * d3) * 4.0d));
            if (dSqrt > 1.0d) {
                dSqrt = 1.0d;
            }
            double dMax = 16384.0d / ((double) Math.max(i4, i3));
            double dMin = Math.min(dSqrt, dMax <= 1.0d ? dMax : 1.0d);
            int iFloor = (int) Math.floor(d2 * dMin);
            if (iFloor < 1) {
                iFloor = 1;
            }
            int iFloor2 = (int) Math.floor(d3 * dMin);
            return (((long) iFloor) << 32) | (((long) (iFloor2 >= 1 ? iFloor2 : 1)) & 4294967295L);
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [k09] */
        public static final j09 y(final int i2, final l26 l26Var, j09 j09Var, final Object obj, String str, final boolean z, final boolean z2, final boolean z3) {
            j09Var.getClass();
            l26Var.getClass();
            return j09Var.D(new yo7(str, obj, Boolean.valueOf(z3), new iy9(Boolean.valueOf(z2), Integer.valueOf(i2)), new n26() { // from class: k09
                @Override // defpackage.n26
                public final Object m(Object obj2, Object obj3, Object obj4) {
                    j09 j09Var2 = (j09) obj2;
                    l46 l46Var = (l46) obj3;
                    ((Integer) obj4).getClass();
                    j09Var2.getClass();
                    l46Var.f0(-1122221970);
                    e89 e89VarI = q1c.i(Boolean.valueOf(z2), l46Var);
                    e89 e89VarI2 = q1c.i(l26Var, l46Var);
                    int i3 = z ? -1 : -16777216;
                    Object obj5 = obj;
                    boolean zG = l46Var.g(obj5);
                    boolean z4 = z3;
                    boolean zH = zG | l46Var.h(z4);
                    int i4 = i2;
                    boolean zE = l46Var.e(i4) | zH;
                    Object objR = l46Var.R();
                    i8c i8cVar = sf2.a;
                    if (zE || objR == i8cVar) {
                        objR = z4 ? new LinkedHashSet() : null;
                        l46Var.p0(objR);
                    }
                    Set set = (Set) objR;
                    boolean zG2 = l46Var.g(e89VarI) | l46Var.i(set) | l46Var.e(i3) | l46Var.e(i4) | l46Var.g(e89VarI2) | l46Var.i(obj5);
                    Object objR2 = l46Var.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new t21(set, i3, i4, obj5, e89VarI, e89VarI2);
                        l46Var.p0(objR2);
                    }
                    j09 j09VarU = b21.u(j09Var2, (a26) objR2);
                    l46Var.r(false);
                    return j09VarU;
                }
            }));
        }

        public static /* synthetic */ j09 z(int i2, l26 l26Var, j09 j09Var, Object obj, String str, boolean z, boolean z2, boolean z3) {
            if ((i2 & 8) != 0) {
                z2 = true;
            }
            boolean z4 = z2;
            if ((i2 & 32) != 0) {
                z3 = false;
            }
            return y(67108864, l26Var, j09Var, obj, str, z, z4, z3);
        }
    }

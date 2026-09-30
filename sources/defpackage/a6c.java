package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.persistence.database.DivinationDatabase;
import ai.askquin.widget.WidgetUpdateWorker;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.view.Choreographer;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.filament.Camera;
import com.google.android.filament.ColorGrading;
import com.google.android.filament.Engine;
import com.google.android.filament.Material;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.View;
import com.google.firebase.crashlytics.BuildConfig;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a6c {
    public static DivinationDatabase a;

    public static final void a(TarotSkinIdentify tarotSkinIdentify, j09 j09Var, long j, l46 l46Var, int i) {
        int i2;
        l46 l46Var2;
        String strName;
        l46Var.h0(-378799492);
        if ((i & 6) == 0) {
            i2 = (l46Var.e(tarotSkinIdentify == null ? -1 : tarotSkinIdentify.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.f(j) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            j09 j09VarO = tm7.o(j09Var.D(b.c), j, g21.f);
            xn8 xn8VarC = s21.c(ndb.f, false);
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
            if (tarotSkinIdentify == null || (strName = tarotSkinIdentify.name()) == null) {
                strName = "TarotBox";
            }
            nte.b(strName, null, y72.e, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 384, 0, 262138);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new xb(tarotSkinIdentify, j09Var, j, i);
        }
    }

    public static final void b(boolean z, kpb kpbVar, a26 a26Var, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i) {
        a26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var.h0(-1578611905);
        int i2 = i | (l46Var.h(z) ? 4 : 2) | (l46Var.e(kpbVar == null ? -1 : kpbVar.ordinal()) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var3) ? 131072 : 65536);
        int i3 = 1;
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            i8c i8cVar = sf2.a;
            if (z) {
                l46Var.f0(1464889871);
                Object objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = new fnc(9);
                    l46Var.p0(objR);
                }
                dec.b("page_view", (a26) objR, l46Var, 390);
                l46Var.r(false);
            } else {
                l46Var.f0(1465032099);
                l46Var.r(false);
            }
            String strQ = afc.q(R.string.seasonal_relationship_title, l46Var);
            boolean z2 = kpbVar != null;
            boolean z3 = ((i2 & 14) == 4) | ((i2 & 458752) == 131072);
            Object objR2 = l46Var.R();
            if (z3 || objR2 == i8cVar) {
                objR2 = new on2(z, x16Var3, 10);
                l46Var.p0(objR2);
            }
            xxb.d(3, strQ, z2, x16Var, (x16) objR2, x16Var2, af1.b0(-647576802, new ipb(i3, a26Var, kpbVar), l46Var), l46Var, (i2 & 7168) | 1572870 | ((i2 << 3) & 458752));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jt(z, kpbVar, a26Var, x16Var, x16Var2, x16Var3, i, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    public static final void c(int i, l46 l46Var, j09 j09Var, String str) throws Throwable {
        int i2;
        l46 l46Var2;
        String str2;
        str.getClass();
        l46Var.h0(-518790985);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            hs3 hs3Var = xqa.A;
            r8d r8dVar = new r8d(hs3Var.a, hs3Var.b, null);
            nu4 nu4Var = nu4.a;
            Object objI = z5c.I(nu4Var, r8dVar);
            String str3 = (String) objI;
            if (v4e.Q(str3)) {
                objI = null;
            } else {
                hs3 hs3Var2 = xqa.f0;
                if (!str3.equals(z5c.I(nu4Var, new s8d(hs3Var2.a, hs3Var2.b, null)))) {
                    objI = null;
                }
            }
            if (((String) objI) != null) {
                hs3 hs3Var3 = xqa.g0;
                Object objI2 = z5c.I(nu4Var, new t8d(hs3Var3.a, hs3Var3.b, null));
                if (v4e.Q((String) objI2)) {
                    objI2 = null;
                }
                str2 = (String) objI2;
            } else {
                str2 = null;
            }
            Uri.Builder builderAppendQueryParameter = Uri.parse("https://quin.love").buildUpon().appendQueryParameter("from", "android-share").appendQueryParameter("utm_source", "share").appendQueryParameter("utm_medium", "qr").appendQueryParameter("utm_content", str);
            if (str2 != null) {
                String str4 = v4e.Q(str2) ? null : str2;
                if (str4 != null) {
                    builderAppendQueryParameter.appendQueryParameter("c", str4);
                }
            }
            String string = builderAppendQueryParameter.build().toString();
            string.getClass();
            boolean zG = l46Var.g(string);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = x76.f(320, string);
                l46Var.p0(objR);
            }
            cv6 cv6Var = (cv6) objR;
            if (cv6Var == null) {
                l46Var.f0(-2009728596);
                l46Var.r(false);
                l46Var2 = l46Var;
            } else {
                l46Var.f0(-2009728595);
                l46Var2 = l46Var;
                feg.k(cv6Var, "QR code", ynb.Z(tm7.o(j09Var, y72.e, g21.f), 4.0f), null, 0, l46Var2, 48, 120);
                l46Var2.r(false);
            }
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o43(str, j09Var, i, 7, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v8 */
    public static final void d(final List list, final j09 j09Var, long j, l46 l46Var, final int i) {
        j09 j09Var2;
        final long j2;
        ojb ojbVarV;
        l26 l26Var;
        int i2;
        lge lgeVar;
        Engine engine;
        Engine engine2;
        Object obj;
        Object obj2;
        Object next;
        final List list2 = list;
        l46Var.h0(-162657634);
        int i3 = i | (l46Var.g(list2) ? 4 : 2) | 384;
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            final long j3 = y72.b;
            Object lgeVar2 = null;
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                l46Var.f0(-1010306132);
                Iterator it = list2.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        ((age) next).getClass();
                        float fAbs = Math.abs(0.0f);
                        while (true) {
                            Object next2 = it.next();
                            ((age) next2).getClass();
                            float fAbs2 = Math.abs(0.0f);
                            if (Float.compare(fAbs, fAbs2) > 0) {
                                next = next2;
                                fAbs = fAbs2;
                            }
                            if (!it.hasNext()) {
                                break;
                            } else {
                                list2 = list;
                            }
                        }
                    }
                } else {
                    next = null;
                }
                age ageVar = (age) next;
                a(ageVar != null ? ageVar.a : null, j09Var, j3, l46Var, 432);
                l46Var.r(false);
                ojb ojbVarV2 = l46Var.v();
                if (ojbVarV2 != null) {
                    final int i5 = 0;
                    ojbVarV2.d = new l26(list2, j09Var, j3, i, i5) { // from class: tfe
                        public final /* synthetic */ int a;
                        public final /* synthetic */ List b;
                        public final /* synthetic */ j09 c;
                        public final /* synthetic */ long d;

                        {
                            this.a = i5;
                        }

                        @Override // defpackage.l26
                        public final Object z(Object obj3, Object obj4) {
                            int i6 = this.a;
                            wef wefVar = wef.a;
                            switch (i6) {
                                case 0:
                                    ((Integer) obj4).getClass();
                                    int iP = k99.P(49);
                                    a6c.d(this.b, this.c, this.d, (l46) obj3, iP);
                                    break;
                                case 1:
                                    ((Integer) obj4).getClass();
                                    int iP2 = k99.P(49);
                                    a6c.d(this.b, this.c, this.d, (l46) obj3, iP2);
                                    break;
                                default:
                                    ((Integer) obj4).getClass();
                                    int iP3 = k99.P(49);
                                    a6c.d(this.b, this.c, this.d, (l46) obj3, iP3);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    return;
                }
                return;
            }
            l46Var.f0(-1010221564);
            l46Var.r(false);
            Context context = (Context) l46Var.k(uq.b);
            boolean zG = l46Var.g(context);
            Object objR = l46Var.R();
            Object obj3 = sf2.a;
            if (zG || objR == obj3) {
                pge pgeVar = pge.a;
                context.getClass();
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                if (!pge.d) {
                    pge.d = true;
                    applicationContext.registerComponentCallbacks(new oge(i4));
                }
                if (m7c.l(applicationContext)) {
                    fhe fheVar = fhe.a;
                    fhe.b.e(true);
                    pge.a(true);
                }
                lge lgeVar3 = pge.b;
                if (lgeVar3 != null) {
                    pge.b = null;
                    i2 = 1;
                } else {
                    try {
                        int i6 = dd5.a;
                        System.loadLibrary("filament-utils-jni");
                        Engine engineC = Engine.c();
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        applicationContext2.getClass();
                        Material materialQ = w6c.q(applicationContext2, engineC);
                        if (materialQ == null) {
                            engineC.j();
                            i2 = 1;
                        } else {
                            try {
                                lqb lqbVarB = q6c.b(engineC);
                                Renderer rendererE = engineC.e();
                                pk1 pk1Var = new pk1(5);
                                pk1Var.b = true;
                                try {
                                    pk1Var.c = new double[]{0.0d, 0.0d, 0.0d, 0.0d};
                                    rendererE.f(pk1Var);
                                    Scene sceneF = engineC.f();
                                    int iA = ex4.a.a();
                                    double radians = Math.toRadians(7.6d);
                                    Camera cameraD = engineC.d(iA);
                                    try {
                                        cameraD.b(Math.sin(radians) * (-3.0d), Math.cos(radians) * 3.0d);
                                        cameraD.d(1.0d);
                                        cameraD.c();
                                        long jNCreateBuilder = ColorGrading.nCreateBuilder();
                                        new d82(jNCreateBuilder, i4);
                                        long j4 = new mze().a;
                                        engine = 0;
                                        try {
                                            if (j4 == 0) {
                                                throw new IllegalStateException("Calling method on destroyed ToneMapper");
                                            }
                                            ColorGrading.nBuilderToneMapper(jNCreateBuilder, j4);
                                            ColorGrading.nBuilderContrast(jNCreateBuilder, 1.0f);
                                            ColorGrading.nBuilderSaturation(jNCreateBuilder, 1.0f);
                                            long jNBuilderBuild = ColorGrading.nBuilderBuild(jNCreateBuilder, engineC.getNativeObject());
                                            if (jNBuilderBuild == 0) {
                                                throw new IllegalStateException("Couldn't create ColorGrading");
                                            }
                                            ColorGrading colorGrading = new ColorGrading();
                                            colorGrading.a = jNBuilderBuild;
                                            View viewI = engineC.i();
                                            viewI.g(sceneF);
                                            viewI.c(cameraD);
                                            viewI.d(colorGrading);
                                            viewI.b();
                                            f17 f17Var = new f17(5);
                                            try {
                                                f17Var.b = true;
                                                viewI.e(f17Var);
                                                i2 = 1;
                                                lgeVar2 = new lge(applicationContext2, engineC, rendererE, sceneF, viewI, cameraD, iA, materialQ, lqbVarB, colorGrading);
                                            } catch (Throwable th) {
                                                th = th;
                                                engine = engineC;
                                                i2 = 1;
                                                hf8.Q.getClass();
                                                ef8.a("TarotBox3D").c("Filament renderer setup failed", th);
                                                engine.j();
                                                lgeVar2 = null;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        engine2 = engineC;
                                        i2 = 1;
                                        engine = engine2;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    engine2 = engineC;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                i2 = 1;
                                engine = engineC;
                            }
                            hf8.Q.getClass();
                            ef8.a("TarotBox3D").c("Filament renderer setup failed", th);
                            engine.j();
                            lgeVar2 = null;
                        }
                    } catch (Throwable th6) {
                        i2 = 1;
                        hf8.Q.getClass();
                        ef8.a("TarotBox3D").c("Filament engine creation failed", th6);
                    }
                    lgeVar = lgeVar2;
                }
                if (lgeVar != 0) {
                    lgeVar = lgeVar3;
                    pge.c.add(lgeVar);
                }
                lgeVar = lgeVar3;
                Object ngeVar = new nge(lgeVar, new vx7(1, pge.a, pge.class, BuildConfig.BUILD_TYPE, "release(Lai/askquin/ui/explore/skin/box3d/TarotBoxRenderer;)V", 0, 25));
                l46Var.p0(ngeVar);
                obj = ngeVar;
            } else {
                i2 = 1;
                obj = objR;
            }
            Object obj4 = (lge) ((nge) obj).c;
            if (obj4 == null) {
                l46Var.f0(-1009964543);
                hf8.Q.getClass();
                ef8.a("TarotBox3D").b("Filament renderer unavailable, rendering empty box");
                s21.a(tm7.o(j09Var.D(b.c), j3, g21.f), l46Var, 0);
                l46Var.r(false);
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                }
                final int i7 = 1;
                l26Var = new l26(list, j09Var, j3, i, i7) { // from class: tfe
                    public final /* synthetic */ int a;
                    public final /* synthetic */ List b;
                    public final /* synthetic */ j09 c;
                    public final /* synthetic */ long d;

                    {
                        this.a = i7;
                    }

                    @Override // defpackage.l26
                    public final Object z(Object obj5, Object obj6) {
                        int i8 = this.a;
                        wef wefVar = wef.a;
                        switch (i8) {
                            case 0:
                                ((Integer) obj6).getClass();
                                int iP = k99.P(49);
                                a6c.d(this.b, this.c, this.d, (l46) obj5, iP);
                                break;
                            case 1:
                                ((Integer) obj6).getClass();
                                int iP2 = k99.P(49);
                                a6c.d(this.b, this.c, this.d, (l46) obj5, iP2);
                                break;
                            default:
                                ((Integer) obj6).getClass();
                                int iP3 = k99.P(49);
                                a6c.d(this.b, this.c, this.d, (l46) obj5, iP3);
                                break;
                        }
                        return wefVar;
                    }
                };
            } else {
                j09Var2 = j09Var;
                l46Var.f0(-1009807900);
                l46Var.r(false);
                Object obj5 = (x48) l46Var.k(cb8.a);
                Object objR2 = l46Var.R();
                if (objR2 == obj3) {
                    obj2 = objR2;
                    Object choreographer = Choreographer.getInstance();
                    l46Var.p0(choreographer);
                    obj2 = choreographer;
                }
                obj2 = objR2;
                Object obj6 = (Choreographer) obj2;
                Object objR3 = l46Var.R();
                Object obj7 = objR3;
                if (objR3 == obj3) {
                    waf wafVar = new waf();
                    wafVar.d = false;
                    wafVar.b = new g5b(10, obj4);
                    l46Var.p0(wafVar);
                    obj7 = wafVar;
                }
                Object obj8 = (waf) obj7;
                int i8 = (l46Var.i(obj4) ? 1 : 0) | ((i3 & 14) == 4 ? i2 : 0);
                Object objR4 = l46Var.R();
                Object obj9 = objR4;
                if (i8 != 0 || objR4 == obj3) {
                    Object ykcVar = new ykc(17, obj4, list);
                    l46Var.p0(ykcVar);
                    obj9 = ykcVar;
                }
                af1.u((x16) obj9, l46Var);
                boolean zI = l46Var.i(obj4) | l46Var.i(obj6) | l46Var.i(obj5) | l46Var.i(obj8);
                Object objR5 = l46Var.R();
                if (zI || objR5 == obj3) {
                    Object wcaVar = new wca(obj5, obj4, obj6, obj8, 4);
                    l46Var.p0(wcaVar);
                    objR5 = wcaVar;
                }
                af1.g(obj5, (a26) objR5, l46Var);
                j09 j09VarD = j09Var2.D(b.c);
                boolean zI2 = l46Var.i(obj8);
                Object objR6 = l46Var.R();
                Object obj10 = objR6;
                if (zI2 || objR6 == obj3) {
                    Object trdVar = new trd(7, obj8);
                    l46Var.p0(trdVar);
                    obj10 = trdVar;
                }
                xo1.c((a26) obj10, j09VarD, null, l46Var, 0, 4);
                j2 = j3;
            }
            ojbVarV.d = l26Var;
        }
        j09Var2 = j09Var;
        l46Var.Z();
        j2 = j;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final int i9 = 2;
            final j09 j09Var3 = j09Var2;
            l26Var = new l26(list, j09Var3, j2, i, i9) { // from class: tfe
                public final /* synthetic */ int a;
                public final /* synthetic */ List b;
                public final /* synthetic */ j09 c;
                public final /* synthetic */ long d;

                {
                    this.a = i9;
                }

                @Override // defpackage.l26
                public final Object z(Object obj11, Object obj12) {
                    int i10 = this.a;
                    wef wefVar = wef.a;
                    switch (i10) {
                        case 0:
                            ((Integer) obj12).getClass();
                            int iP = k99.P(49);
                            a6c.d(this.b, this.c, this.d, (l46) obj11, iP);
                            break;
                        case 1:
                            ((Integer) obj12).getClass();
                            int iP2 = k99.P(49);
                            a6c.d(this.b, this.c, this.d, (l46) obj11, iP2);
                            break;
                        default:
                            ((Integer) obj12).getClass();
                            int iP3 = k99.P(49);
                            a6c.d(this.b, this.c, this.d, (l46) obj11, iP3);
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var;
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static final gg7 f(tjd tjdVar, z22 z22Var, int i) {
        if (z22Var == null || sy4.f(z22Var)) {
            return null;
        }
        int size = z22Var.h0().size() + i;
        if (z22Var.j()) {
            List listSubList = tjdVar.Z().subList(i, size);
            bm3 bm3VarK = z22Var.k();
            return new gg7(z22Var, listSubList, f(tjdVar, bm3VarK instanceof z22 ? (z22) bm3VarK : null, size));
        }
        if (size != tjdVar.Z().size()) {
            oz3.m(z22Var);
        }
        return new gg7(z22Var, tjdVar.Z().subList(i, tjdVar.Z().size()), (gg7) null);
    }

    public static final List g(z22 z22Var) {
        List parameters;
        Object next;
        j7f j7fVarH;
        List listH0 = z22Var.h0();
        listH0.getClass();
        if (!z22Var.j() && !(z22Var.k() instanceof ca1)) {
            return listH0;
        }
        int i = qz3.a;
        z03 z03Var = z03.w;
        List listA = fyc.A(new zi5(new ve5(new ie5(fyc.q(fyc.u(z03Var, z22Var), 1), vic.O0), true, vic.P0), vic.Q0, jyc.a));
        Iterator it = fyc.q(fyc.u(z03Var, z22Var), 1).iterator();
        do {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof u09));
        u09 u09Var = (u09) next;
        if (u09Var != null && (j7fVarH = u09Var.h()) != null) {
            parameters = j7fVarH.getParameters();
        }
        if (parameters == null) {
            parameters = pu4.a;
        }
        if (listA.isEmpty() && parameters.isEmpty()) {
            List listH1 = z22Var.h0();
            listH1.getClass();
            return listH1;
        }
        ArrayList<c8f> arrayListQ0 = s72.Q0(listA, parameters);
        ArrayList arrayList = new ArrayList(t72.u(arrayListQ0, 10));
        for (c8f c8fVar : arrayListQ0) {
            c8fVar.getClass();
            arrayList.add(new gp1(c8fVar, z22Var, listH0.size()));
        }
        return s72.Q0(listH0, arrayList);
    }

    public static void h(Context context, v6g v6gVar) {
        String str;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        yag yagVarB = yag.b(applicationContext);
        boolean z = v6gVar instanceof m6g;
        r6g r6gVar = r6g.a;
        t6g t6gVar = t6g.a;
        if (z || (v6gVar instanceof n6g)) {
            str = "widget_work_daily_fortune";
        } else {
            if (!(v6gVar instanceof u6g) && !v6gVar.equals(t6gVar) && !(v6gVar instanceof q6g) && !(v6gVar instanceof o6g) && !(v6gVar instanceof s6g) && !v6gVar.equals(r6gVar) && !(v6gVar instanceof p6g)) {
                ap.c();
                return;
            }
            str = "widget_work_quick_decision";
        }
        zi0 zi0Var = new zi0(WidgetUpdateWorker.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("type", v6gVar.getType());
        if (z) {
            linkedHashMap.put("schedule_midnight", Boolean.valueOf(((m6g) v6gVar).a));
        } else {
            int i = 0;
            if (v6gVar instanceof n6g) {
                n6g n6gVar = (n6g) v6gVar;
                int[] iArrI1 = s72.i1(n6gVar.a);
                String str2 = rd3.a;
                int length = iArrI1.length;
                Integer[] numArr = new Integer[length];
                while (i < length) {
                    numArr[i] = Integer.valueOf(iArrI1[i]);
                    i++;
                }
                linkedHashMap.put("widget_ids", numArr);
                linkedHashMap.put("track_install", Boolean.valueOf(n6gVar.b));
                linkedHashMap.put("schedule_midnight", Boolean.valueOf(n6gVar.c));
            } else if (v6gVar instanceof u6g) {
                u6g u6gVar = (u6g) v6gVar;
                int[] iArrI2 = s72.i1(u6gVar.a);
                String str3 = rd3.a;
                int length2 = iArrI2.length;
                Integer[] numArr2 = new Integer[length2];
                while (i < length2) {
                    numArr2[i] = Integer.valueOf(iArrI2[i]);
                    i++;
                }
                linkedHashMap.put("widget_ids", numArr2);
                linkedHashMap.put("track_install", Boolean.valueOf(u6gVar.b));
                linkedHashMap.put("schedule_qd", Boolean.valueOf(u6gVar.c));
            } else if (!(v6gVar instanceof t6g)) {
                if (v6gVar instanceof q6g) {
                    linkedHashMap.put("widget_id", Integer.valueOf(((q6g) v6gVar).a));
                } else if (v6gVar instanceof o6g) {
                    o6g o6gVar = (o6g) v6gVar;
                    linkedHashMap.put("widget_id", Integer.valueOf(o6gVar.a));
                    linkedHashMap.put("position", Integer.valueOf(o6gVar.b));
                } else if (v6gVar instanceof s6g) {
                    linkedHashMap.put("widget_id", Integer.valueOf(((s6g) v6gVar).a));
                } else if (!(v6gVar instanceof r6g)) {
                    if (!(v6gVar instanceof p6g)) {
                        ap.c();
                        return;
                    }
                    int[] iArrI3 = s72.i1(((p6g) v6gVar).a);
                    String str4 = rd3.a;
                    int length3 = iArrI3.length;
                    Integer[] numArr3 = new Integer[length3];
                    while (i < length3) {
                        numArr3[i] = Integer.valueOf(iArrI3[i]);
                        i++;
                    }
                    linkedHashMap.put("widget_ids", numArr3);
                }
            }
        }
        bb3 bb3Var = new bb3(linkedHashMap);
        bm8.S(bb3Var);
        lbg lbgVar = (lbg) zi0Var.c;
        lbgVar.e = bb3Var;
        if ((v6gVar instanceof q6g) || (v6gVar instanceof o6g) || (v6gVar instanceof s6g)) {
            lbgVar.q = true;
            lbgVar.r = rs9.a;
        } else if (!z && !(v6gVar instanceof n6g) && !(v6gVar instanceof u6g) && !v6gVar.equals(t6gVar) && !v6gVar.equals(r6gVar) && !(v6gVar instanceof p6g)) {
            ap.c();
            return;
        }
        List listH = t72.H(zi0Var.e());
        if (listH.isEmpty()) {
            qc0.j("beginUniqueWork needs at least one OneTimeWorkRequest.");
        } else {
            new lag(yagVarB, str, d45.d, listH, 0).a();
        }
    }

    public static final DivinationDatabase i(Context context) {
        context.getClass();
        synchronized (DivinationDatabase.class) {
            try {
                if (a == null) {
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    r5c r5cVarJ = o5c.j(applicationContext, DivinationDatabase.class, "divination");
                    r5cVarJ.a(mh3.n);
                    r5cVarJ.a(mh3.o);
                    r5cVarJ.a(mh3.p);
                    r5cVarJ.a(mh3.q);
                    r5cVarJ.a(mh3.r);
                    r5cVarJ.a(mh3.s);
                    r5cVarJ.a(mh3.t);
                    r5cVarJ.a(mh3.u);
                    r5cVarJ.a(mh3.v);
                    r5cVarJ.a(mh3.w);
                    r5cVarJ.a(mh3.x);
                    r5cVarJ.a(mh3.y);
                    r5cVarJ.a(mh3.z);
                    r5cVarJ.a(mh3.A);
                    r5cVarJ.a(mh3.B);
                    r5cVarJ.a(mh3.C);
                    r5cVarJ.a(mh3.D);
                    r5cVarJ.a(mh3.E);
                    r5cVarJ.a(mh3.F);
                    r5cVarJ.a(mh3.G);
                    js3 js3Var = ga4.a;
                    hr3 hr3Var = hr3.c;
                    hr3Var.getClass();
                    if (r5cVarJ.f != null || r5cVarJ.g != null) {
                        throw new IllegalArgumentException("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.");
                    }
                    if (hr3Var.F0(hj6.Z) == null) {
                        throw new IllegalArgumentException("It is required that the coroutine context contain a dispatcher.");
                    }
                    r5cVarJ.q = hr3Var;
                    a = (DivinationDatabase) r5cVarJ.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        DivinationDatabase divinationDatabase = a;
        if (divinationDatabase != null) {
            return divinationDatabase;
        }
        pa7.g0("INSTANCE");
        throw null;
    }

    public static final int j(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x0119  */
    public static final mue k(mue mueVar, cv7 cv7Var) {
        long j;
        ete eteVar;
        int i;
        int i2;
        cue cueVar;
        xtd xtdVar = mueVar.a;
        bte bteVar = ytd.d;
        bte bteVar2 = xtdVar.a;
        if (bteVar2.equals(ate.a)) {
            bteVar2 = ytd.d;
        }
        bte bteVar3 = bteVar2;
        long j2 = xtdVar.b;
        xue[] xueVarArr = wue.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = ytd.a;
        }
        long j3 = j2;
        ar5 ar5Var = xtdVar.c;
        if (ar5Var == null) {
            ar5Var = ar5.w;
        }
        ar5 ar5Var2 = ar5Var;
        wq5 wq5Var = xtdVar.d;
        wq5 wq5Var2 = new wq5(wq5Var != null ? wq5Var.a : 0);
        xq5 xq5Var = xtdVar.e;
        xq5 xq5Var2 = new xq5(xq5Var != null ? xq5Var.a : 65535);
        yp5 yp5Var = xtdVar.f;
        if (yp5Var == null) {
            yp5Var = yp5.a;
        }
        yp5 yp5Var2 = yp5Var;
        String str = xtdVar.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = xtdVar.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = ytd.b;
        }
        long j5 = j4;
        ou0 ou0Var = xtdVar.i;
        float f = ou0Var != null ? ou0Var.a : 0.0f;
        ou0 ou0Var2 = new ou0(Float.isNaN(f) ? 0.0f : f);
        cte cteVar = xtdVar.j;
        if (cteVar == null) {
            cteVar = cte.c;
        }
        cte cteVar2 = cteVar;
        sd8 sd8VarS = xtdVar.k;
        if (sd8VarS == null) {
            sd8 sd8Var = sd8.c;
            sd8VarS = cfa.a.s();
        }
        sd8 sd8Var2 = sd8VarS;
        long j6 = xtdVar.l;
        if (j6 == 16) {
            j6 = ytd.c;
        }
        long j7 = j6;
        mne mneVar = xtdVar.m;
        if (mneVar == null) {
            mneVar = mne.b;
        }
        mne mneVar2 = mneVar;
        o4d o4dVar = xtdVar.n;
        if (o4dVar == null) {
            o4dVar = o4d.d;
        }
        o4d o4dVar2 = o4dVar;
        aga agaVar = xtdVar.o;
        un4 un4Var = xtdVar.p;
        if (un4Var == null) {
            un4Var = oe5.a;
        }
        xtd xtdVar2 = new xtd(bteVar3, j3, ar5Var2, wq5Var2, xq5Var2, yp5Var2, str2, j5, ou0Var2, cteVar2, sd8Var2, j7, mneVar2, o4dVar2, agaVar, un4Var);
        ty9 ty9Var = mueVar.b;
        int i3 = uy9.b;
        int i4 = ty9Var.a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = ty9Var.b;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = cv7Var.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        ap.c();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = ty9Var.c;
            if ((j & 1095216660480L) == 0) {
                j = uy9.a;
            }
            eteVar = ty9Var.d;
            if (eteVar == null) {
                eteVar = ete.c;
            }
            ofa ofaVar = ty9Var.e;
            y58 y58Var = ty9Var.f;
            i = ty9Var.g;
            if (i == 0) {
                i = q58.b;
            }
            i2 = ty9Var.h;
            if (i2 == 0) {
                i2 = 1;
            }
            cueVar = ty9Var.i;
            if (cueVar == null) {
                cueVar = cue.c;
            }
            return new mue(xtdVar2, new ty9(i4, i6, j, eteVar, ofaVar, y58Var, i, i2, cueVar), mueVar.c);
        }
        int iOrdinal2 = cv7Var.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            ap.c();
            return null;
        }
        i6 = i5;
        j = ty9Var.c;
        if ((j & 1095216660480L) == 0) {
            j = uy9.a;
        }
        eteVar = ty9Var.d;
        if (eteVar == null) {
            eteVar = ete.c;
        }
        ofa ofaVar2 = ty9Var.e;
        y58 y58Var2 = ty9Var.f;
        i = ty9Var.g;
        if (i == 0) {
            i = q58.b;
        }
        i2 = ty9Var.h;
        if (i2 == 0) {
            i2 = 1;
        }
        cueVar = ty9Var.i;
        if (cueVar == null) {
            cueVar = cue.c;
        }
        return new mue(xtdVar2, new ty9(i4, i6, j, eteVar, ofaVar2, y58Var2, i, i2, cueVar), mueVar.c);
    }

    public static void l(Object obj, Object obj2) {
        if (obj == null) {
            r82.g("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            r82.g(ib8.j("null value in entry: ", obj.toString(), "=null"));
        }
    }
}

package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute$GraphEntry;
import ai.askquin.ui.router.AppRoute;
import ai.askquin.ui.seasonal.SeasonalReadingRoute;
import ai.askquin.ui.seasonal.SeasonalSummaryRoute;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinDetailRoute;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Texture;
import com.google.android.filament.TextureSampler;
import com.google.android.filament.TransformManager;
import com.google.android.filament.VertexBuffer;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ykc implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ykc(yte yteVar, j00 j00Var, pw pwVar) {
        this.a = 23;
        this.b = j00Var;
        this.c = pwVar;
    }

    /* JADX WARN: Code duplicated, block: B:275:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:96:0x023b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x16
    public final Object invoke() throws PendingIntent.CanceledException {
        long jL;
        Object obj;
        pjb pjbVar;
        long jFloatToRawIntBits;
        long j;
        tte tteVarD;
        r38 r38Var;
        k00 k00Var;
        int i = 28;
        int i2 = 9;
        int i3 = 5;
        int i4 = 10;
        z = true;
        z = true;
        boolean z = true;
        int i5 = 0;
        switch (this.a) {
            case 0:
                ((a26) this.b).d(((brc) ((erc) this.c)).a);
                return wef.a;
            case 1:
                ka9 ka9Var = (ka9) this.b;
                SeasonalReadingRoute seasonalReadingRoute = (SeasonalReadingRoute) this.c;
                ka9.e(ka9Var, new SeasonalSummaryRoute(seasonalReadingRoute.getYear(), seasonalReadingRoute.getSolarTerm(), seasonalReadingRoute.isRevisit(), seasonalReadingRoute.getAnalyticsEnabled()), null, 6);
                return wef.a;
            case 2:
                ((mmb) this.b).element = eb3.H((juc) this.c, tda.a);
                return wef.a;
            case 3:
                fwc fwcVar = (fwc) this.b;
                long j2 = ((e77) ((e89) this.c).getValue()).a;
                vuc vucVarJ = fwcVar.j();
                if (vucVarJ != null) {
                    sg6 sg6VarI = fwcVar.i();
                    int i6 = sg6VarI == null ? -1 : gwc.a[sg6VarI.ordinal()];
                    if (i6 == -1) {
                        jL = 9205357640488583168L;
                    } else if (i6 == 1) {
                        jL = dj6.L(fwcVar, j2, vucVarJ.a);
                    } else {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                ap.c();
                            } else {
                                qc0.p("SelectionContainer does not support cursor");
                            }
                            return null;
                        }
                        jL = dj6.L(fwcVar, j2, vucVarJ.b);
                    }
                } else {
                    jL = 9205357640488583168L;
                }
                return new hl9(jL);
            case 4:
                x16 x16Var = (x16) this.b;
                yic yicVar = (yic) this.c;
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new yl6(yicVar, 1), 2);
                x16Var.invoke();
                return wef.a;
            case 5:
                k4d k4dVar = (k4d) this.b;
                dc9 dc9Var = (dc9) this.c;
                if (((f4d) k4dVar.f.a.getValue()).a) {
                    ynb.V(hwf.a(k4dVar), null, null, new j4d(k4dVar, null), 3);
                }
                dc9Var.g(AppRoute.InAppMessageRoute.INSTANCE);
                return wef.a;
            case 6:
                dc9 dc9Var2 = (dc9) this.b;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) this.c;
                x1f x1fVar2 = x1f.a;
                x1f.k(p05.a, new ia("account", i), 2);
                dc9Var2.g(new ExploreTarotRoute$GraphEntry(tarotSkinIdentify));
                return wef.a;
            case 7:
                g6d g6dVar = (g6d) this.b;
                e6d e6dVar = (e6d) this.c;
                int i7 = e6dVar.c - 1;
                e6dVar.c = i7;
                int i8 = e6dVar.b;
                Bitmap bitmap = e6dVar.a;
                if (i8 == 0 && i7 == 0) {
                    g6dVar.b.remove(bitmap);
                    jzb.m(bitmap);
                }
                return wef.a;
            case 8:
                kz8 kz8Var = (kz8) this.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.c;
                synchronized (tcd.b) {
                    LinkedHashMap linkedHashMap = tcd.c;
                    linkedHashMap.remove(kz8Var);
                    if (linkedHashMap.isEmpty()) {
                        ff8.h().e(kag.a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(tcd.a);
                        tcd.f = null;
                        tcd.d = null;
                        tcd.e = false;
                    }
                    break;
                }
                return wef.a;
            case 9:
                ((a26) this.b).d(((wnd) ((ynd) this.c)).a());
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                and andVar = (and) this.b;
                n07 n07Var = ((mmd) this.c).b;
                if (n07Var != null) {
                    Iterator<E> it = TarotSkinIdentify.getEntries().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (hfc.h((TarotSkinIdentify) next) == n07Var.g()) {
                                obj = next;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    andVar.W(n07Var, (TarotSkinIdentify) obj, false);
                }
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                and andVar2 = (and) this.b;
                SkinNavigationRoute$SkinDetailRoute skinNavigationRoute$SkinDetailRoute = (SkinNavigationRoute$SkinDetailRoute) this.c;
                TarotSkinIdentify tarotSkinIdentify2 = skinNavigationRoute$SkinDetailRoute.getTarotSkinIdentify();
                boolean fromMall = skinNavigationRoute$SkinDetailRoute.getFromMall();
                tarotSkinIdentify2.getClass();
                ij ijVarP = andVar2.P();
                if (ijVarP != null) {
                    ij ijVar = ijVarP.a() ? ijVarP : null;
                    if (ijVar != null) {
                        andVar2.W(ijVar.a, tarotSkinIdentify2, fromMall);
                    }
                }
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                fqd fqdVar = (fqd) this.b;
                z95 z95Var = (z95) this.c;
                if (!pa7.t(fqdVar, z95Var.a)) {
                    x72.i0(new ckb(i, fqdVar), z95Var.b);
                    ojb ojbVar = z95Var.c;
                    if (ojbVar != null && (pjbVar = ojbVar.a) != null) {
                        pjbVar.o(ojbVar, null);
                    }
                }
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((a26) this.b).d((ale) this.c);
                return wef.a;
            case 14:
                iwd iwdVar = (iwd) this.b;
                sz9 sz9Var = iwdVar.d;
                x16 x16Var2 = (x16) this.c;
                if (iwdVar.c || sz9Var.j() == 0) {
                    x16Var2.invoke();
                } else if (sz9Var.j() > 0) {
                    sz9Var.k(sz9Var.j() - 1);
                }
                return wef.a;
            case 15:
                String str = (String) this.b;
                x16 x16Var3 = (x16) this.c;
                x1f x1fVar3 = x1f.a;
                x1f.k(p05.a, new z53("app_update_later", str, i3), 2);
                x16Var3.invoke();
                return wef.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                t9e t9eVar = (t9e) this.b;
                List list = (List) this.c;
                no0 no0Var = o3e.a;
                return Boolean.valueOf(o3e.a(t9eVar.a, list));
            case 17:
                mx4 mx4Var = yfe.d;
                lge lgeVar = (lge) this.b;
                List list2 = (List) this.c;
                LinkedHashMap linkedHashMap2 = lgeVar.r;
                String str2 = "overlayAmount";
                Texture texture = lgeVar.s;
                String str3 = "baseColorMap";
                String str4 = "dimFactor";
                Engine engine = lgeVar.b;
                TransformManager transformManager = engine.b;
                TextureSampler textureSampler = lgeVar.l;
                ArrayList arrayList = lgeVar.m;
                char c = 1;
                if (arrayList.size() != list2.size()) {
                    lgeVar.c();
                    int size = list2.size();
                    int i9 = 0;
                    while (i9 < size) {
                        List list3 = list2;
                        ArrayList arrayList2 = new ArrayList(t72.u(mx4Var, i4));
                        Iterator it2 = mx4Var.iterator();
                        while (it2.hasNext()) {
                            int i10 = i4;
                            yfe yfeVar = (yfe) it2.next();
                            Iterator it3 = it2;
                            MaterialInstance materialInstanceB = lgeVar.h.b();
                            mx4 mx4Var2 = mx4Var;
                            materialInstanceB.b(str4, 1.0f);
                            materialInstanceB.c("baseColorMap", texture, textureSampler);
                            materialInstanceB.c("overlayMap", yfeVar == yfe.FRONT ? lgeVar.t : lgeVar.u, textureSampler);
                            materialInstanceB.b(str2, 0.0f);
                            arrayList2.add(materialInstanceB);
                            it2 = it3;
                            i4 = i10;
                            mx4Var = mx4Var2;
                        }
                        mx4 mx4Var3 = mx4Var;
                        int i11 = i4;
                        int iA = ex4.a.a();
                        int i12 = size;
                        long jNCreateBuilder = RenderableManager.nCreateBuilder(mx4Var3.c());
                        Engine engine2 = engine;
                        new d82(jNCreateBuilder, 8);
                        ace aceVar = zfe.a;
                        k47 k47Var = new k47(14);
                        float[] fArr = (float[]) k47Var.b;
                        float f = fArr[0];
                        float f2 = fArr[c];
                        float f3 = fArr[2];
                        float[] fArr2 = (float[]) k47Var.c;
                        RenderableManager.nBuilderBoundingBox(jNCreateBuilder, f, f2, f3, fArr2[0], fArr2[c], fArr2[2]);
                        RenderableManager.nBuilderCulling(jNCreateBuilder, c);
                        Iterator it4 = mx4Var3.iterator();
                        while (it4.hasNext()) {
                            yfe yfeVar2 = (yfe) it4.next();
                            int iOrdinal = yfeVar2.ordinal();
                            erb erbVar = erb.TRIANGLES;
                            Iterator it5 = it4;
                            lqb lqbVar = lgeVar.i;
                            VertexBuffer vertexBuffer = (VertexBuffer) lqbVar.b;
                            IndexBuffer indexBuffer = (IndexBuffer) lqbVar.c;
                            ace aceVar2 = zfe.a;
                            RenderableManager.nBuilderGeometry(jNCreateBuilder, iOrdinal, erbVar.a(), vertexBuffer.g(), indexBuffer.f(), ((v21) aceVar2.getValue()).c[yfeVar2.ordinal()], ((v21) aceVar2.getValue()).d[yfeVar2.ordinal()]);
                            RenderableManager.nBuilderMaterial(jNCreateBuilder, yfeVar2.ordinal(), ((MaterialInstance) arrayList2.get(yfeVar2.ordinal())).a());
                            str2 = str2;
                            str4 = str4;
                            it4 = it5;
                        }
                        String str5 = str4;
                        String str6 = str2;
                        if (!RenderableManager.nBuilderBuild(jNCreateBuilder, engine2.getNativeObject(), iA)) {
                            qc0.p(tec.f(iA, "Couldn't create Renderable component for entity ", ", see log."));
                            return null;
                        }
                        transformManager.a(iA);
                        lgeVar.d.a(iA);
                        arrayList.add(new dge(arrayList2, iA, transformManager.c(iA)));
                        i9++;
                        list2 = list3;
                        size = i12;
                        i4 = i11;
                        mx4Var = mx4Var3;
                        str2 = str6;
                        str4 = str5;
                        engine = engine2;
                        c = 1;
                    }
                }
                String str7 = str4;
                String str8 = str2;
                int i13 = i4;
                int i14 = 0;
                for (Iterator it6 = list2.iterator(); it6.hasNext(); it6 = it6) {
                    Object next2 = it6.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        t72.Z();
                        throw null;
                    }
                    age ageVar = (age) next2;
                    dge dgeVar = (dge) arrayList.get(i14);
                    age ageVar2 = dgeVar.d;
                    ArrayList<MaterialInstance> arrayList3 = dgeVar.c;
                    if (pa7.t(ageVar2, ageVar)) {
                        TarotSkinIdentify tarotSkinIdentify3 = ageVar.a;
                        boolean zContainsKey = linkedHashMap2.containsKey(tarotSkinIdentify3);
                        boolean zContains = lgeVar.k.b.contains(tarotSkinIdentify3);
                        boolean zL = m7c.l(lgeVar.a);
                        List list4 = mge.a;
                        if (!zContainsKey && !zContains && !zL) {
                            lgeVar.f(ageVar.a);
                        }
                    } else {
                        age ageVar3 = dgeVar.d;
                        TarotSkinIdentify tarotSkinIdentify4 = ageVar3 != null ? ageVar3.a : null;
                        TarotSkinIdentify tarotSkinIdentify5 = ageVar.a;
                        boolean z2 = tarotSkinIdentify4 != tarotSkinIdentify5;
                        dgeVar.d = ageVar;
                        if (z2) {
                            List list5 = (List) linkedHashMap2.get(tarotSkinIdentify5);
                            if (list5 != null) {
                                lgeVar.a(dgeVar, list5);
                            } else {
                                Iterator it7 = arrayList3.iterator();
                                while (it7.hasNext()) {
                                    ((MaterialInstance) it7.next()).c(str3, texture, textureSampler);
                                }
                                lgeVar.f(tarotSkinIdentify5);
                            }
                        }
                        int i16 = dgeVar.b;
                        float f4 = ageVar.b;
                        float f5 = ageVar.c;
                        List list6 = mge.a;
                        double radians = Math.toRadians(f4);
                        double radians2 = Math.toRadians(f5);
                        float fCos = (float) Math.cos(radians);
                        float fSin = (float) Math.sin(radians);
                        float fCos2 = (float) Math.cos(radians2);
                        float fSin2 = (float) Math.sin(radians2);
                        float f6 = fCos2 * 1.0f;
                        float f7 = (-fSin2) * 1.0f;
                        float f8 = fSin2 * fSin * 1.0f;
                        float f9 = fCos * 1.0f;
                        float f10 = fCos2 * fSin * 1.0f;
                        float f11 = fSin2 * fCos * 1.0f;
                        float f12 = fCos2 * fCos * 1.0f;
                        float[] fArr3 = new float[16];
                        fArr3[0] = f6;
                        fArr3[1] = 0.0f;
                        fArr3[2] = f7;
                        fArr3[3] = 0.0f;
                        fArr3[4] = f8;
                        fArr3[5] = f9;
                        fArr3[6] = f10;
                        fArr3[7] = 0.0f;
                        fArr3[8] = f11;
                        fArr3[9] = (-fSin) * 1.0f;
                        fArr3[i13] = f12;
                        fArr3[11] = 0.0f;
                        fArr3[12] = 0.0f;
                        fArr3[13] = 0.0f;
                        fArr3[14] = 0.0f;
                        fArr3[15] = 1.0f;
                        transformManager.d(i16, fArr3);
                        float f13 = ageVar.d ? 1.0f : 0.0f;
                        for (MaterialInstance materialInstance : arrayList3) {
                            materialInstance.b(str7, 1.0f);
                            materialInstance.b(str8, f13);
                        }
                    }
                    str7 = str7;
                    i14 = i15;
                    str3 = str3;
                    str8 = str8;
                    arrayList = arrayList;
                }
                return wef.a;
            case 18:
                fme fmeVar = (fme) this.b;
                List list7 = (List) this.c;
                x1f x1fVar4 = x1f.a;
                x1f.k(p05.a, new trd(i2, fmeVar), 2);
                fmeVar.w.setValue(Integer.valueOf(Math.min(((Number) fmeVar.w.getValue()).intValue() + 5, Math.min(list7.size(), 50))));
                return wef.a;
            case 19:
                Context context = (Context) this.b;
                TextClassification textClassification = (TextClassification) this.c;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    hgc.Q(activity);
                } else {
                    activity.send();
                }
                return wef.a;
            case 20:
                eoe eoeVar = (eoe) this.b;
                kmb kmbVar = (kmb) this.c;
                eoeVar.I0.d();
                int i17 = (eoeVar.Y && ((b28) ((e7g) eb3.H(eoeVar, zg2.u))).a()) ? 1 : 2;
                int i18 = kmbVar.element;
                int i19 = i17 * i18;
                kmbVar.element = i18 * (-1);
                return Integer.valueOf(i19);
            case 21:
                jse jseVar = (jse) this.b;
                ape apeVar = (ape) this.c;
                if (!jseVar.h) {
                    vo5 vo5Var = apeVar.O0;
                    if (vo5Var.Y) {
                        oo5.t1(vo5Var.K0);
                    }
                }
                return wef.a;
            case 22:
                cre creVar = (cre) this.b;
                long j3 = ((e77) ((e89) this.c).getValue()).a;
                hl9 hl9VarG = creVar.g();
                if (hl9VarG != null) {
                    long j4 = hl9VarG.a;
                    k00 k00VarK = creVar.k();
                    if (k00VarK == null || k00VarK.b.length() == 0) {
                        jFloatToRawIntBits = 9205357640488583168L;
                    } else {
                        sg6 sg6Var = (sg6) creVar.q.getValue();
                        int i20 = sg6Var == null ? -1 : ere.a[sg6Var.ordinal()];
                        if (i20 == -1) {
                            jFloatToRawIntBits = 9205357640488583168L;
                        } else {
                            if (i20 == 1 || i20 == 2) {
                                long j5 = creVar.l().b;
                                int i21 = eue.c;
                                j = j5 >> 32;
                            } else {
                                if (i20 != 3) {
                                    ap.c();
                                    return null;
                                }
                                long j6 = creVar.l().b;
                                int i22 = eue.c;
                                j = j6 & 4294967295L;
                            }
                            int i23 = (int) j;
                            r38 r38Var2 = creVar.d;
                            if (r38Var2 == null || (tteVarD = r38Var2.d()) == null || (r38Var = creVar.d) == null || (k00Var = (k00) r38Var.a.b) == null) {
                                jFloatToRawIntBits = 9205357640488583168L;
                            } else {
                                int iO = mh3.o(creVar.b.v(i23), 0, k00Var.b.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (tteVarD.d(j4) >> 32));
                                ste steVar = tteVarD.a;
                                b59 b59Var = steVar.b;
                                int iD = b59Var.d(iO);
                                float fH = steVar.h(iD);
                                float fI = steVar.i(iD);
                                float fN = mh3.n(fIntBitsToFloat, Math.min(fH, fI), Math.max(fH, fI));
                                if (e77.b(j3, 0L) || Math.abs(fIntBitsToFloat - fN) <= ((int) (j3 >> 32)) / 2) {
                                    float f14 = b59Var.f(iD);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fN)) << 32) | (((long) Float.floatToRawIntBits(((b59Var.b(iD) - f14) / 2.0f) + f14)) & 4294967295L);
                                } else {
                                    jFloatToRawIntBits = 9205357640488583168L;
                                }
                            }
                        }
                    }
                } else {
                    jFloatToRawIntBits = 9205357640488583168L;
                }
                return new hl9(jFloatToRawIntBits);
            case 23:
                j00 j00Var = (j00) this.b;
                pw pwVar = (pw) this.c;
                l68 l68Var = (l68) j00Var.a;
                if (l68Var instanceof k68) {
                    try {
                        String str9 = ((k68) l68Var).a;
                        pwVar.getClass();
                        try {
                            pwVar.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str9)));
                        } catch (ActivityNotFoundException e) {
                            throw new IllegalArgumentException(ib8.j("Can't open ", str9, "."), e);
                        }
                        break;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return wef.a;
            case 24:
                ((a26) this.b).d((mfc) this.c);
                return wef.a;
            case 25:
                sug sugVar = (sug) this.b;
                nh1 nh1Var = (nh1) this.c;
                Executor executor = ((fh1) sugVar.c).a;
                if (executor != null) {
                    return executor;
                }
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1, new fw(-3, iw.b(iw.b, "CXCP-Camera-E")));
                executorServiceNewFixedThreadPool.getClass();
                nh1Var.a(kh1.c, new bwe(i5, executorServiceNewFixedThreadPool));
                return executorServiceNewFixedThreadPool;
            case 26:
                z2f z2fVar = (z2f) this.b;
                i8c i8cVar = (i8c) this.c;
                vne vneVarD = z2fVar.a.d();
                rwc rwcVar = (rwc) z2fVar.e.getValue();
                f77 f77Var = new f77(2, false);
                StringBuilder sb = new StringBuilder();
                boolean z3 = false;
                while (i5 < vneVarD.c.length()) {
                    int iCodePointAt = Character.codePointAt(vneVarD, i5);
                    i8cVar.getClass();
                    int i24 = iCodePointAt == 10 ? 32 : iCodePointAt == 13 ? 65279 : iCodePointAt;
                    int iCharCount = Character.charCount(iCodePointAt);
                    if (i24 != iCodePointAt) {
                        f77Var.i(sb.length(), sb.length() + iCharCount, Character.charCount(i24));
                        z3 = true;
                    }
                    sb.appendCodePoint(i24);
                    i5 += iCharCount;
                    z3 = z3;
                }
                CharSequence string = z3 ? sb.toString() : vneVarD;
                if (string == vneVarD) {
                    return null;
                }
                long jO = aic.o(vneVarD.d, f77Var, rwcVar);
                eue eueVar = vneVarD.e;
                return new x2f(new vne(string, jO, eueVar != null ? new eue(aic.o(eueVar.a, f77Var, rwcVar)) : null, null, null, null, null, 120), f77Var);
            case 27:
                return Boolean.valueOf(gcf.x((n3f) this.b, (sdd) this.c));
            case 28:
                j18 j18Var = (j18) this.b;
                lsd lsdVar = (lsd) this.c;
                List list8 = j18Var.h().l;
                if (!list8.isEmpty() && !list8.isEmpty()) {
                    Iterator it8 = list8.iterator();
                    while (it8.hasNext()) {
                        if (lsdVar.containsKey(((c18) it8.next()).k)) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                ((a26) this.b).d((z6e) this.c);
                return wef.a;
        }
    }

    public /* synthetic */ ykc(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}

package defpackage;

import ai.askquin.ui.draw.photo.homepage.SpreadInfoEntryRoute;
import ai.askquin.ui.draw.photo.homepage.SpreadInfoInputRoute;
import ai.askquin.ui.draw.photo.homepage.SpreadPreviewRoute;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinMallRoute;
import android.app.DownloadManager;
import android.content.ClipboardManager;
import android.content.Context;
import com.google.android.filament.Engine;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.SpreadInterpretResponse;
import tech.chatmind.api.SpreadRecommendationResult;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardInfo;
import tech.chatmind.api.credits.SubscriptionKind;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ond implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ ond(yea yeaVar) {
        this.a = 17;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0695 A[LOOP:13: B:105:0x0693->B:106:0x0695, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:111:0x06a8 A[LOOP:14: B:110:0x06a6->B:111:0x06a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:216:0x06b0 A[SYNTHETIC] */
    @Override // defpackage.x16
    public final Object invoke() {
        ja8 ja8Var;
        char c;
        char c2;
        float[] fArr;
        int i;
        r1f r1fVar;
        char c3;
        char c4;
        char c5;
        float fSqrt;
        int i2;
        int i3;
        List<ms4> listI;
        int i4 = 0;
        switch (this.a) {
            case 0:
                return SkinNavigationRoute$SkinMallRoute._childSerializers$_anonymous_();
            case 1:
                throw new IllegalStateException("LocalTarotSkin not provided");
            case 2:
                return null;
            case 3:
                return SolarTerm._init_$_anonymous_();
            case 4:
                return SpreadInfoEntryRoute._childSerializers$_anonymous_();
            case 5:
                return SpreadInfoInputRoute._childSerializers$_anonymous_();
            case 6:
                return SpreadInfoInputRoute._childSerializers$_anonymous_$0();
            case 7:
                return SpreadInterpretResponse._childSerializers$_anonymous_();
            case 8:
                return SpreadPreviewRoute._childSerializers$_anonymous_();
            case 9:
                return SpreadPreviewRoute._childSerializers$_anonymous_$0();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return SpreadRecommendationResult._childSerializers$_anonymous_();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return wef.a;
            case 14:
                return SubscriptionKind._init_$_anonymous_();
            case 15:
                return new sz9(0);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return new yi4(0.0f);
            case 17:
                String str = "";
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    Object objInvoke = cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.backported_fixes.alias_bitset.long_list", "");
                    objInvoke.getClass();
                    str = (String) objInvoke;
                } catch (Exception unused) {
                }
                c78 c78VarW = t72.w();
                Iterator it = v4e.d0(str, new char[]{','}, 6).iterator();
                while (it.hasNext()) {
                    try {
                        c78VarW.add(Long.valueOf(Long.parseLong((String) it.next())));
                    } catch (NumberFormatException unused2) {
                    }
                }
                BitSet bitSetValueOf = BitSet.valueOf(s72.k1(c78VarW.n()));
                int size = bitSetValueOf.size();
                if (size == 0) {
                    return xu4.a;
                }
                o1d o1dVar = new o1d(size);
                for (int iNextSetBit = 0; iNextSetBit >= 0; iNextSetBit = bitSetValueOf.nextSetBit(iNextSetBit + 1)) {
                    if (bitSetValueOf.get(iNextSetBit)) {
                        o1dVar.add(Integer.valueOf(iNextSetBit));
                    }
                    if (iNextSetBit == Integer.MAX_VALUE) {
                        return o1dVar.d();
                    }
                }
                return o1dVar.d();
            case 18:
                return cn1.z().getContentResolver();
            case 19:
                return yag.b(cn1.z());
            case 20:
                Object systemService = cn1.z().getSystemService("clipboard");
                systemService.getClass();
                return (ClipboardManager) systemService;
            case 21:
                Object systemService2 = cn1.z().getSystemService("download");
                systemService2.getClass();
                return (DownloadManager) systemService2;
            case 22:
                Context contextZ = cn1.z();
                synchronized (ja8.c) {
                    try {
                        ja8Var = ja8.d;
                        if (ja8Var == null) {
                            ja8Var = new ja8(contextZ.getApplicationContext());
                            ja8.d = ja8Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return ja8Var;
            case 23:
                pu4 pu4Var = pu4.a;
                r1f r1fVar2 = new r1f(1);
                ArrayList arrayList = (ArrayList) r1fVar2.e;
                mx4 mx4Var = yfe.d;
                int iC = mx4Var.c();
                int[] iArr = new int[iC];
                int[] iArr2 = new int[iC];
                mx4Var.getClass();
                l2 l2Var = new l2(i4, mx4Var);
                while (l2Var.hasNext()) {
                    yfe yfeVar = (yfe) l2Var.next();
                    int size2 = arrayList.size();
                    yfeVar.getClass();
                    u95 u95VarE = zfe.e(yfeVar);
                    float[] fArr2 = u95VarE.a;
                    float[] fArrG = zfe.g(fArr2, u95VarE.f);
                    float[] fArr3 = u95VarE.b;
                    float f = u95VarE.d;
                    float f2 = -f;
                    float[] fArrA = zfe.a(fArrG, zfe.g(fArr3, f2));
                    float[] fArr4 = u95VarE.c;
                    pu4 pu4Var2 = pu4Var;
                    float f3 = u95VarE.e;
                    float f4 = -f3;
                    l2 l2Var2 = l2Var;
                    List<float[]> listI2 = t72.I(zfe.a(fArrA, zfe.g(fArr4, f4)), zfe.a(zfe.a(fArrG, zfe.g(fArr3, f)), zfe.g(fArr4, f4)), zfe.a(zfe.a(fArrG, zfe.g(fArr3, f)), zfe.g(fArr4, f3)), zfe.a(zfe.a(fArrG, zfe.g(fArr3, f2)), zfe.g(fArr4, f3)));
                    ArrayList arrayList2 = new ArrayList(t72.u(listI2, 10));
                    for (float[] fArr5 : listI2) {
                        arrayList2.add(Integer.valueOf(r1fVar2.h(fArr5, fArr2, zfe.f(u95VarE, fArr5))));
                    }
                    int iIntValue = ((Number) arrayList2.get(0)).intValue();
                    int iIntValue2 = ((Number) arrayList2.get(1)).intValue();
                    int iIntValue3 = ((Number) arrayList2.get(2)).intValue();
                    int iIntValue4 = ((Number) arrayList2.get(3)).intValue();
                    r1fVar2.g(iIntValue, iIntValue2, iIntValue3);
                    r1fVar2.g(iIntValue, iIntValue3, iIntValue4);
                    int iOrdinal = yfeVar.ordinal();
                    int i5 = 5;
                    if (iOrdinal == 0) {
                        listI = t72.I(new ms4(new float[]{0.282f, 0.0f, 0.092f}, new float[]{0.0f, 1.0f, 0.0f}, 0.50699997f, new float[]{0.0f, 0.0f, 1.0f}, new float[]{1.0f, 0.0f, 0.0f}), new ms4(new float[]{-0.282f, 0.0f, 0.092f}, new float[]{0.0f, 1.0f, 0.0f}, 0.50699997f, new float[]{0.0f, 0.0f, 1.0f}, new float[]{-1.0f, 0.0f, 0.0f}), new ms4(new float[]{0.0f, 0.50699997f, 0.092f}, new float[]{1.0f, 0.0f, 0.0f}, 0.282f, new float[]{0.0f, 0.0f, 1.0f}, new float[]{0.0f, 1.0f, 0.0f}), new ms4(new float[]{0.0f, -0.50699997f, 0.092f}, new float[]{1.0f, 0.0f, 0.0f}, 0.282f, new float[]{0.0f, 0.0f, 1.0f}, new float[]{0.0f, -1.0f, 0.0f}));
                    } else if (iOrdinal == 1) {
                        listI = t72.I(new ms4(new float[]{0.282f, 0.0f, -0.092f}, new float[]{0.0f, 1.0f, 0.0f}, 0.50699997f, new float[]{0.0f, 0.0f, -1.0f}, new float[]{1.0f, 0.0f, 0.0f}), new ms4(new float[]{-0.282f, 0.0f, -0.092f}, new float[]{0.0f, 1.0f, 0.0f}, 0.50699997f, new float[]{0.0f, 0.0f, -1.0f}, new float[]{-1.0f, 0.0f, 0.0f}), new ms4(new float[]{0.0f, 0.50699997f, -0.092f}, new float[]{1.0f, 0.0f, 0.0f}, 0.282f, new float[]{0.0f, 0.0f, -1.0f}, new float[]{0.0f, 1.0f, 0.0f}), new ms4(new float[]{0.0f, -0.50699997f, -0.092f}, new float[]{1.0f, 0.0f, 0.0f}, 0.282f, new float[]{0.0f, 0.0f, -1.0f}, new float[]{0.0f, -1.0f, 0.0f}));
                    } else if (iOrdinal == 2 || iOrdinal == 3) {
                        listI = pu4Var2;
                    } else if (iOrdinal == 4) {
                        listI = t72.I(new ms4(new float[]{0.282f, 0.50699997f, 0.0f}, new float[]{0.0f, 0.0f, 1.0f}, 0.092f, new float[]{0.0f, 1.0f, 0.0f}, new float[]{1.0f, 0.0f, 0.0f}), new ms4(new float[]{-0.282f, 0.50699997f, 0.0f}, new float[]{0.0f, 0.0f, 1.0f}, 0.092f, new float[]{0.0f, 1.0f, 0.0f}, new float[]{-1.0f, 0.0f, 0.0f}));
                    } else {
                        if (iOrdinal != 5) {
                            ap.c();
                            return null;
                        }
                        listI = t72.I(new ms4(new float[]{0.282f, -0.50699997f, 0.0f}, new float[]{0.0f, 0.0f, 1.0f}, 0.092f, new float[]{0.0f, -1.0f, 0.0f}, new float[]{1.0f, 0.0f, 0.0f}), new ms4(new float[]{-0.282f, -0.50699997f, 0.0f}, new float[]{0.0f, 0.0f, 1.0f}, 0.092f, new float[]{0.0f, -1.0f, 0.0f}, new float[]{-1.0f, 0.0f, 0.0f}));
                    }
                    for (ms4 ms4Var : listI) {
                        ms4Var.getClass();
                        u95 u95VarE2 = zfe.e(yfeVar);
                        int[][] iArr3 = new int[2][];
                        int i6 = 0;
                        for (int i7 = 2; i6 < i7; i7 = 2) {
                            float f5 = ms4Var.c;
                            if (i6 == 0) {
                                f5 = -f5;
                            }
                            int[] iArr4 = new int[i5];
                            int i8 = 0;
                            while (i8 < i5) {
                                int i9 = i8;
                                double d = (i8 / 4.0f) * 1.5707964f;
                                float[] fArrA2 = zfe.a(zfe.g(ms4Var.d, (float) Math.cos(d)), zfe.g(ms4Var.e, (float) Math.sin(d)));
                                float[] fArrA3 = zfe.a(zfe.a(ms4Var.a, zfe.g(ms4Var.b, f5)), zfe.g(fArrA2, 0.018f));
                                iArr4[i9] = r1fVar2.h(fArrA3, fArrA2, zfe.f(u95VarE2, fArrA3));
                                iArr3 = iArr3;
                                i6 = i6;
                                i8 = i9 + 1;
                                i5 = 5;
                            }
                            int i10 = i6;
                            iArr3[i10] = iArr4;
                            i6 = i10 + 1;
                            i5 = 5;
                        }
                        int[][] iArr5 = iArr3;
                        int i11 = 0;
                        while (i11 < 4) {
                            int[] iArr6 = iArr5[0];
                            int i12 = iArr6[i11];
                            int i13 = i11 + 1;
                            int i14 = iArr6[i13];
                            int[] iArr7 = iArr5[1];
                            int i15 = iArr7[i13];
                            int i16 = iArr7[i11];
                            r1fVar2.g(i12, i14, i15);
                            r1fVar2.g(i12, i15, i16);
                            i11 = i13;
                        }
                        i5 = 5;
                    }
                    int iOrdinal2 = yfeVar.ordinal();
                    Iterator it2 = (iOrdinal2 != 0 ? iOrdinal2 != 1 ? pu4Var2 : t72.I(zfe.b(1.0f, 1.0f, -1.0f), zfe.b(-1.0f, 1.0f, -1.0f), zfe.b(1.0f, -1.0f, -1.0f), zfe.b(-1.0f, -1.0f, -1.0f)) : t72.I(zfe.b(1.0f, 1.0f, 1.0f), zfe.b(-1.0f, 1.0f, 1.0f), zfe.b(1.0f, -1.0f, 1.0f), zfe.b(-1.0f, -1.0f, 1.0f))).iterator();
                    while (it2.hasNext()) {
                        hv2 hv2Var = (hv2) it2.next();
                        hv2Var.getClass();
                        float[] fArr6 = hv2Var.a;
                        float[] fArr7 = hv2Var.c;
                        u95 u95VarE3 = zfe.e(yfeVar);
                        int[][] iArr8 = new int[4][];
                        int i17 = 0;
                        for (int i18 = 4; i17 < i18; i18 = 4) {
                            float f6 = (i17 / 4.0f) * 1.5707964f;
                            int[] iArr9 = new int[5];
                            int i19 = 0;
                            for (int i20 = 5; i19 < i20; i20 = 5) {
                                Iterator it3 = it2;
                                int[][] iArr10 = iArr8;
                                double d2 = (i19 / 4.0f) * 1.5707964f;
                                float[] fArrA4 = zfe.a(zfe.g(hv2Var.d, (float) Math.cos(d2)), zfe.g(hv2Var.b, (float) Math.sin(d2)));
                                double d3 = f6;
                                float[] fArrA5 = zfe.a(zfe.g(fArrA4, (float) Math.cos(d3)), zfe.g(fArr7, (float) Math.sin(d3)));
                                float[] fArrA6 = zfe.a(fArr6, zfe.g(fArrA5, 0.018f));
                                iArr9[i19] = r1fVar2.h(fArrA6, fArrA5, zfe.f(u95VarE3, fArrA6));
                                i19++;
                                it2 = it3;
                                iArr8 = iArr10;
                                i17 = i17;
                            }
                            int i21 = i17;
                            iArr8[i21] = iArr9;
                            i17 = i21 + 1;
                        }
                        Iterator it4 = it2;
                        int[][] iArr11 = iArr8;
                        float[] fArrA7 = zfe.a(fArr6, zfe.g(fArr7, 0.018f));
                        int iH = r1fVar2.h(fArrA7, fArr7, zfe.f(u95VarE3, fArrA7));
                        for (int i22 = 0; i22 < 3; i22++) {
                            int i23 = 0;
                            while (i23 < 4) {
                                int[] iArr12 = iArr11[i22];
                                int i24 = iArr12[i23];
                                int i25 = i23 + 1;
                                int i26 = iArr12[i25];
                                int[] iArr13 = iArr11[i22 + 1];
                                int i27 = iArr13[i25];
                                int i28 = iArr13[i23];
                                r1fVar2.g(i24, i26, i27);
                                r1fVar2.g(i24, i27, i28);
                                i23 = i25;
                            }
                        }
                        int[] iArr14 = iArr11[3];
                        int i29 = 0;
                        while (i29 < 4) {
                            int i30 = iArr14[i29];
                            i29++;
                            r1fVar2.g(i30, iArr14[i29], iH);
                        }
                        it2 = it4;
                    }
                    iArr[yfeVar.ordinal()] = size2;
                    iArr2[yfeVar.ordinal()] = arrayList.size() - size2;
                    pu4Var = pu4Var2;
                    l2Var = l2Var2;
                }
                ArrayList arrayList3 = (ArrayList) r1fVar2.d;
                ArrayList arrayList4 = (ArrayList) r1fVar2.b;
                int i31 = r1fVar2.a;
                float[] fArr8 = new float[i31 * 9];
                int i32 = 0;
                while (i32 < i31) {
                    float[] fArrS = r1fVar2.s(i32);
                    if (Math.abs(fArrS[1]) < 0.99f) {
                        float[] fArrC = zfe.c(new float[]{0.0f, 1.0f, 0.0f}, fArrS);
                        c2 = 0;
                        float f7 = fArrC[0];
                        float f8 = fArrC[1];
                        float f9 = (f8 * f8) + (f7 * f7);
                        c = 2;
                        float f10 = fArrC[2];
                        float fSqrt2 = (float) Math.sqrt((f10 * f10) + f9);
                        fArr = new float[]{fArrC[0] / fSqrt2, fArrC[1] / fSqrt2, fArrC[2] / fSqrt2};
                    } else {
                        c = 2;
                        c2 = 0;
                        fArr = new float[]{1.0f, 0.0f, 0.0f};
                    }
                    float[] fArrC2 = zfe.c(fArrS, fArr);
                    float[] fArr9 = new float[4];
                    float f11 = fArr[c2];
                    float f12 = fArrC2[1];
                    float f13 = fArrS[c];
                    float f14 = f11 + f12 + f13;
                    if (f14 > 0.0f) {
                        i = i32;
                        r1fVar = r1fVar2;
                        float fSqrt3 = ((float) Math.sqrt(f14 + 1.0f)) * 2.0f;
                        fArr9[3] = 0.25f * fSqrt3;
                        fArr9[0] = (fArrC2[2] - fArrS[1]) / fSqrt3;
                        fArr9[1] = (fArrS[0] - fArr[2]) / fSqrt3;
                        fArr9[2] = (fArr[1] - fArrC2[0]) / fSqrt3;
                    } else {
                        i = i32;
                        r1fVar = r1fVar2;
                        if (f11 <= f12 || f11 <= f13) {
                            if (f12 > f13) {
                                float fSqrt4 = ((float) Math.sqrt(((f12 + 1.0f) - f11) - f13)) * 2.0f;
                                fArr9[3] = (fArrS[0] - fArr[2]) / fSqrt4;
                                fArr9[0] = (fArrC2[0] + fArr[1]) / fSqrt4;
                                fArr9[1] = 0.25f * fSqrt4;
                                fArr9[2] = (fArrS[1] + fArrC2[2]) / fSqrt4;
                            } else {
                                float fSqrt5 = ((float) Math.sqrt(((f13 + 1.0f) - f11) - f12)) * 2.0f;
                                c3 = 1;
                                c4 = 0;
                                fArr9[3] = (fArr[1] - fArrC2[0]) / fSqrt5;
                                c5 = 2;
                                fArr9[0] = (fArrS[0] + fArr[2]) / fSqrt5;
                                fArr9[1] = (fArrS[1] + fArrC2[2]) / fSqrt5;
                                fArr9[2] = fSqrt5 * 0.25f;
                            }
                            float f15 = fArr9[c4];
                            float f16 = fArr9[c3];
                            float f17 = (f16 * f16) + (f15 * f15);
                            float f18 = fArr9[c5];
                            float f19 = (f18 * f18) + f17;
                            float f20 = fArr9[3];
                            fSqrt = (float) Math.sqrt((f20 * f20) + f19);
                            for (i2 = 0; i2 < 4; i2++) {
                                fArr9[i2] = fArr9[i2] / fSqrt;
                            }
                            if (fArr9[3] < 0.0f) {
                                for (i3 = 0; i3 < 4; i3++) {
                                    fArr9[i3] = -fArr9[i3];
                                }
                            }
                            int i33 = i * 9;
                            int i34 = i * 3;
                            Object obj = arrayList4.get(i34);
                            obj.getClass();
                            fArr8[i33] = ((Number) obj).floatValue();
                            Object obj2 = arrayList4.get(i34 + 1);
                            obj2.getClass();
                            fArr8[i33 + 1] = ((Number) obj2).floatValue();
                            Object obj3 = arrayList4.get(i34 + 2);
                            obj3.getClass();
                            fArr8[i33 + 2] = ((Number) obj3).floatValue();
                            int i35 = i * 2;
                            Object obj4 = arrayList3.get(i35);
                            obj4.getClass();
                            fArr8[i33 + 3] = ((Number) obj4).floatValue();
                            Object obj5 = arrayList3.get(i35 + 1);
                            obj5.getClass();
                            fArr8[i33 + 4] = ((Number) obj5).floatValue();
                            fArr8[i33 + 5] = fArr9[0];
                            fArr8[i33 + 6] = fArr9[1];
                            fArr8[i33 + 7] = fArr9[2];
                            fArr8[i33 + 8] = fArr9[3];
                            i32 = i + 1;
                            r1fVar2 = r1fVar;
                        } else {
                            float fSqrt6 = ((float) Math.sqrt(((f11 + 1.0f) - f12) - f13)) * 2.0f;
                            fArr9[3] = (fArrC2[2] - fArrS[1]) / fSqrt6;
                            fArr9[0] = 0.25f * fSqrt6;
                            fArr9[1] = (fArrC2[0] + fArr[1]) / fSqrt6;
                            fArr9[2] = (fArrS[0] + fArr[2]) / fSqrt6;
                        }
                    }
                    c5 = 2;
                    c3 = 1;
                    c4 = 0;
                    float f110 = fArr9[c4];
                    float f111 = fArr9[c3];
                    float f112 = (f111 * f111) + (f110 * f110);
                    float f113 = fArr9[c5];
                    float f114 = (f113 * f113) + f112;
                    float f21 = fArr9[3];
                    fSqrt = (float) Math.sqrt((f21 * f21) + f114);
                    while (i2 < 4) {
                        fArr9[i2] = fArr9[i2] / fSqrt;
                    }
                    if (fArr9[3] < 0.0f) {
                        while (i3 < 4) {
                            fArr9[i3] = -fArr9[i3];
                        }
                    }
                    int i36 = i * 9;
                    int i37 = i * 3;
                    Object obj6 = arrayList4.get(i37);
                    obj6.getClass();
                    fArr8[i36] = ((Number) obj6).floatValue();
                    Object obj7 = arrayList4.get(i37 + 1);
                    obj7.getClass();
                    fArr8[i36 + 1] = ((Number) obj7).floatValue();
                    Object obj8 = arrayList4.get(i37 + 2);
                    obj8.getClass();
                    fArr8[i36 + 2] = ((Number) obj8).floatValue();
                    int i38 = i * 2;
                    Object obj9 = arrayList3.get(i38);
                    obj9.getClass();
                    fArr8[i36 + 3] = ((Number) obj9).floatValue();
                    Object obj10 = arrayList3.get(i38 + 1);
                    obj10.getClass();
                    fArr8[i36 + 4] = ((Number) obj10).floatValue();
                    fArr8[i36 + 5] = fArr9[0];
                    fArr8[i36 + 6] = fArr9[1];
                    fArr8[i36 + 7] = fArr9[2];
                    fArr8[i36 + 8] = fArr9[3];
                    i32 = i + 1;
                    r1fVar2 = r1fVar;
                }
                int size3 = arrayList.size();
                short[] sArr = new short[size3];
                for (int i39 = 0; i39 < size3; i39++) {
                    sArr[i39] = (short) ((Number) arrayList.get(i39)).intValue();
                }
                return new v21(fArr8, sArr, iArr, iArr2);
            case 24:
                return Boolean.TRUE;
            case 25:
                int i40 = dd5.a;
                System.loadLibrary("filament-utils-jni");
                return Engine.c();
            case 26:
                return TarotCardChoice._childSerializers$_anonymous_();
            case 27:
                return TarotCardInfo._childSerializers$_anonymous_();
            case 28:
                return TarotCardInfo._childSerializers$_anonymous_$0();
            default:
                return TarotCardInfo._childSerializers$_anonymous_$1();
        }
    }

    public /* synthetic */ ond(int i) {
        this.a = i;
    }
}

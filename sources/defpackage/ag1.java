package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.SurfaceHolder;
import androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk;
import androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;
import com.adjust.sdk.sig.r3;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ag1 {
    public final ge1 a;
    public final w92 b;
    public final ue1 c;
    public final ui1 d;
    public final ceg e;
    public final xle f;
    public final yg1 g;
    public final uk1 h;
    public final k47 i;
    public final mjg j;
    public final DynamicRangeProfiles k;

    public ag1(ge1 ge1Var, w92 w92Var, ue1 ue1Var, ui1 ui1Var, ceg cegVar, xle xleVar, yg1 yg1Var, uk1 uk1Var, k47 k47Var) {
        vd9 vd9VarG;
        ge1Var.getClass();
        w92Var.getClass();
        ue1Var.getClass();
        ui1Var.getClass();
        cegVar.getClass();
        this.a = ge1Var;
        this.b = w92Var;
        this.c = ue1Var;
        this.d = ui1Var;
        this.e = cegVar;
        this.f = xleVar;
        this.g = yg1Var;
        this.h = uk1Var;
        this.i = k47Var;
        this.j = new mjg(8);
        int i = Build.VERSION.SDK_INT;
        DynamicRangeProfiles dynamicRangeProfilesB = null;
        if (i >= 33 && yg1Var != null && (vd9VarG = q6.g(yg1Var)) != null) {
            if (i < 33) {
                ho7.j(tec.f(i, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher. is not supported on API ", " (requires API 33)"));
                throw null;
            }
            dynamicRangeProfilesB = ((tr4) vd9VarG.b).b();
        }
        this.k = dynamicRangeProfilesB;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0371  */
    /* JADX WARN: Code duplicated, block: B:210:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x013c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0148  */
    /* JADX WARN: Code duplicated, block: B:53:0x014d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0155  */
    /* JADX WARN: Code duplicated, block: B:56:0x0158  */
    /* JADX WARN: Code duplicated, block: B:58:0x0160  */
    /* JADX WARN: Code duplicated, block: B:59:0x0163  */
    /* JADX WARN: Code duplicated, block: B:61:0x0167  */
    /* JADX WARN: Code duplicated, block: B:63:0x0177  */
    /* JADX WARN: Code duplicated, block: B:65:0x0183  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01df  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x020c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0221  */
    /* JADX WARN: Code duplicated, block: B:94:0x022f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0241  */
    /* JADX WARN: Code duplicated, block: B:96:0x0247  */
    /* JADX WARN: Code duplicated, block: B:99:0x0251  */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x01ad, please report this as an issue */
    public final zf1 a(int i, zzc zzcVar, boolean z, fe6 fe6Var, Integer num, Map map, Map map2) {
        ArrayList arrayList;
        boolean z2;
        LinkedHashMap linkedHashMap;
        int i2;
        wj1 wj1Var;
        ArrayList arrayList2;
        wj1 wj1Var2;
        String str;
        au9 au9Var;
        au9 au9Var2;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList3;
        zt9 zt9Var;
        String str2;
        au9 au9Var3;
        au9 au9Var4;
        af8 af8Var;
        bu9 bu9Var;
        cu9 cu9Var;
        yt9 yt9VarB;
        wj1 wj1Var3;
        LinkedHashMap linkedHashMap3;
        ceg cegVar;
        List list;
        Long l;
        cu9 cu9Var2;
        Long l2;
        bu9 bu9Var2;
        Class cls;
        af8 af8Var2;
        af8 af8Var3 = af8.M0;
        Integer num2 = 0;
        map.getClass();
        map2.getClass();
        boolean z3 = i == 2;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        ArrayList arrayList4 = new ArrayList();
        boolean z4 = z3;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        if (zzcVar != null) {
            im1 im1Var = zzcVar.g;
            k47 k47Var = this.i;
            if (k47Var != null) {
                zh0 zh0Var = ((vg1) k47Var.b).a;
                List list2 = zzcVar.c;
                list2.getClass();
                zh0Var.a = s72.j1(list2);
                zh0 zh0Var2 = (zh0) ((a90) k47Var.c).c;
                List list3 = zzcVar.d;
                list3.getClass();
                zh0Var2.a = s72.j1(list3);
            }
            int i3 = im1Var.c;
            if (i3 == -1) {
                i3 = 1;
            }
            linkedHashMap5.putAll(this.f.a(new ttb(i3)));
            linkedHashMap5.putAll(af1.d0(im1Var.b));
            if (i == 2) {
                ru8 ru8Var = ih1.a;
                num.getClass();
                linkedHashMap5.put(ru8Var, num);
            }
            String str3 = (String) zzcVar.g.b.a(od1.x, null);
            Iterator it = zzcVar.a.iterator();
            wj1 wj1Var4 = null;
            while (it.hasNext()) {
                eq0 eq0Var = (eq0) it.next();
                af8 af8Var4 = af8Var3;
                lu3 lu3Var = eq0Var.a;
                int i4 = i3;
                int i5 = eq0Var.d;
                lu3Var.getClass();
                String str4 = str3;
                String str5 = str3 == null ? null : str4;
                qr4 qr4Var = eq0Var.e;
                qr4Var.getClass();
                int i6 = eq0Var.c;
                boolean z5 = z4;
                int i7 = Build.VERSION.SDK_INT;
                Iterator it2 = it;
                if (i7 >= 33) {
                    linkedHashMap2 = linkedHashMap4;
                    arrayList3 = arrayList4;
                    zt9 zt9Var2 = new zt9(1L);
                    DynamicRangeProfiles dynamicRangeProfiles = this.k;
                    if (dynamicRangeProfiles == null) {
                        zt9Var = zt9Var2;
                    } else {
                        Long lA = rr4.a(qr4Var, dynamicRangeProfiles);
                        if (lA != null) {
                            zt9Var = new zt9(lA.longValue());
                        } else {
                            if (b21.F(6, "CXCP")) {
                                b1.d("CXCP", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n " + qr4Var);
                            }
                            zt9Var = zt9Var2;
                        }
                    }
                } else {
                    linkedHashMap2 = linkedHashMap4;
                    arrayList3 = arrayList4;
                    zt9Var = null;
                }
                Size size = lu3Var.h;
                size.getClass();
                int i8 = lu3Var.i;
                if (str5 == null) {
                    str2 = null;
                } else {
                    ig1.a(str5);
                    str2 = str5;
                }
                if (i6 != 0) {
                    if (i6 != 1) {
                        au9Var4 = null;
                    } else {
                        au9Var3 = new au9(2);
                    }
                    if (z) {
                        cls = eq0Var.a.j;
                        if (pa7.t(cls, MediaCodec.class)) {
                            af8Var2 = af8.Q0;
                        } else if (pa7.t(cls, SurfaceHolder.class)) {
                            af8Var2 = af8.N0;
                        } else if (pa7.t(cls, SurfaceTexture.class)) {
                            af8Var2 = af8.O0;
                        } else {
                            af8Var = af8Var4;
                        }
                        af8Var = af8Var2;
                    } else {
                        af8Var = af8Var4;
                    }
                    if (z5) {
                        bu9Var = null;
                    } else {
                        yg1 yg1Var = this.g;
                        l2 = (Long) map.get(lu3Var);
                        if (l2 != null) {
                            bu9Var2 = new bu9(l2.longValue());
                        } else {
                            bu9Var2 = null;
                        }
                        if (i7 >= 33 || bu9Var2 == null || yg1Var == null) {
                            if (b21.F(5, "CXCP")) {
                                b1.l("CXCP", "Expected stream use case for " + lu3Var + ", " + bu9Var2 + " cannot be set!");
                            }
                            bu9Var2 = null;
                        } else {
                            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                            key.getClass();
                            long[] jArr = (long[]) ((nc1) yg1Var).c(key);
                            if (jArr == null || !qd0.U(jArr, bu9Var2.a)) {
                                if (b21.F(5, "CXCP")) {
                                    b1.l("CXCP", "Expected stream use case for " + lu3Var + ", " + bu9Var2 + " cannot be set!");
                                }
                                bu9Var2 = null;
                            }
                        }
                        bu9Var = bu9Var2;
                    }
                    if (z5) {
                        cu9Var = null;
                    } else {
                        l = (Long) map2.get(lu3Var);
                        if (l != null) {
                            cu9Var2 = new cu9(l.longValue());
                        } else {
                            cu9Var2 = null;
                        }
                        cu9Var = cu9Var2;
                    }
                    yt9VarB = eu4.b(i8, 544, af8Var, zt9Var, au9Var4, bu9Var, cu9Var, size, str2);
                    List list4 = eq0Var.b;
                    list4.getClass();
                    for (lu3 lu3Var2 : s72.R0(list4, lu3Var)) {
                        wj1Var3 = new wj1(t72.H(yt9VarB));
                        linkedHashMap6.put(wj1Var3, lu3Var2);
                        if (i5 != -1) {
                            linkedHashMap3 = linkedHashMap2;
                            list = (List) linkedHashMap3.get(Integer.valueOf(i5));
                            if (list == null) {
                                linkedHashMap3.put(Integer.valueOf(i5), t72.K(wj1Var3));
                            } else {
                                list.add(wj1Var3);
                            }
                        } else {
                            linkedHashMap3 = linkedHashMap2;
                        }
                        if (pa7.t(lu3Var2, lu3Var)) {
                            cegVar = this.e;
                            lu3Var2.getClass();
                            if (cegVar.h(lu3Var2, zzcVar)) {
                                wj1Var4 = wj1Var3;
                            }
                        }
                        linkedHashMap2 = linkedHashMap3;
                        i5 = i5;
                    }
                    str3 = str4;
                    af8Var3 = af8Var4;
                    i3 = i4;
                    z4 = z5;
                    it = it2;
                    linkedHashMap4 = linkedHashMap2;
                    arrayList4 = arrayList3;
                } else {
                    au9Var3 = new au9(1);
                }
                au9Var4 = au9Var3;
                if (z) {
                    cls = eq0Var.a.j;
                    if (pa7.t(cls, MediaCodec.class)) {
                        af8Var2 = af8.Q0;
                    } else if (pa7.t(cls, SurfaceHolder.class)) {
                        af8Var2 = af8.N0;
                    } else if (pa7.t(cls, SurfaceTexture.class)) {
                        af8Var2 = af8.O0;
                    } else {
                        af8Var = af8Var4;
                    }
                    af8Var = af8Var2;
                } else {
                    af8Var = af8Var4;
                }
                if (z5) {
                    yg1 yg1Var2 = this.g;
                    l2 = (Long) map.get(lu3Var);
                    if (l2 != null) {
                        bu9Var2 = new bu9(l2.longValue());
                    } else {
                        bu9Var2 = null;
                    }
                    if (i7 >= 33) {
                        if (b21.F(5, "CXCP")) {
                            b1.l("CXCP", "Expected stream use case for " + lu3Var + ", " + bu9Var2 + " cannot be set!");
                        }
                        bu9Var2 = null;
                    } else {
                        if (b21.F(5, "CXCP")) {
                            b1.l("CXCP", "Expected stream use case for " + lu3Var + ", " + bu9Var2 + " cannot be set!");
                        }
                        bu9Var2 = null;
                    }
                    bu9Var = bu9Var2;
                } else {
                    bu9Var = null;
                }
                if (z5) {
                    l = (Long) map2.get(lu3Var);
                    if (l != null) {
                        cu9Var2 = new cu9(l.longValue());
                    } else {
                        cu9Var2 = null;
                    }
                    cu9Var = cu9Var2;
                } else {
                    cu9Var = null;
                }
                yt9VarB = eu4.b(i8, 544, af8Var, zt9Var, au9Var4, bu9Var, cu9Var, size, str2);
                List list5 = eq0Var.b;
                list5.getClass();
                while (r6.hasNext()) {
                    wj1Var3 = new wj1(t72.H(yt9VarB));
                    linkedHashMap6.put(wj1Var3, lu3Var2);
                    if (i5 != -1) {
                        linkedHashMap3 = linkedHashMap2;
                        list = (List) linkedHashMap3.get(Integer.valueOf(i5));
                        if (list == null) {
                            linkedHashMap3.put(Integer.valueOf(i5), t72.K(wj1Var3));
                        } else {
                            list.add(wj1Var3);
                        }
                    } else {
                        linkedHashMap3 = linkedHashMap2;
                    }
                    if (pa7.t(lu3Var2, lu3Var)) {
                        cegVar = this.e;
                        lu3Var2.getClass();
                        if (cegVar.h(lu3Var2, zzcVar)) {
                            wj1Var4 = wj1Var3;
                        }
                    }
                    linkedHashMap2 = linkedHashMap3;
                    i5 = i5;
                }
                str3 = str4;
                af8Var3 = af8Var4;
                i3 = i4;
                z4 = z5;
                it = it2;
                linkedHashMap4 = linkedHashMap2;
                arrayList4 = arrayList3;
            }
            int i9 = i3;
            ArrayList arrayList5 = arrayList4;
            z2 = z4;
            linkedHashMap = linkedHashMap4;
            if (zzcVar.i == null || wj1Var4 == null) {
                arrayList = arrayList5;
            } else {
                arrayList = arrayList5;
                arrayList.add(new r47(wj1Var4, ((yt9) s72.X0(wj1Var4.a)).b));
            }
            i2 = i9;
        } else {
            arrayList = arrayList4;
            z2 = z4;
            linkedHashMap = linkedHashMap4;
            i2 = 1;
        }
        ui1 ui1Var = this.d;
        if (ui1Var.a().a(CaptureSessionStuckQuirk.class) && b21.F(3, "CXCP")) {
            Log.d("CXCP", "CameraPipe should be enabling CaptureSessionStuckQuirk by default");
        }
        String str6 = Build.MODEL;
        str6.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = str6.toLowerCase(locale);
        lowerCase.getClass();
        boolean zC = c5e.C(lowerCase, "cph", false);
        wf1 wf1Var = new wf1((!z2 || s74.a().b(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class) == null) && s74.a().b(DisableAbortCapturesOnStopQuirk.class) == null && Build.VERSION.SDK_INT >= 30, new ff8(ui1Var.a().a(QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class) ? 1 : 0, xf1.a), zC ? 1 : 0, ((CloseCameraDeviceOnCameraGraphCloseQuirk) this.j.a) != null ? (CloseCameraDeviceOnCameraGraphCloseQuirk.c || !(!CloseCameraDeviceOnCameraGraphCloseQuirk.e || CloseCameraDeviceOnCameraGraphCloseQuirk.a || CloseCameraDeviceOnCameraGraphCloseQuirk.b)) ? z2 : true : false, 9);
        if (zzcVar != null) {
            im1 im1Var2 = zzcVar.g;
            Integer num3 = (Integer) im1Var2.b.a(xjf.q0, num2);
            Objects.requireNonNull(num3);
            int iIntValue = num3.intValue();
            Integer num4 = (Integer) im1Var2.b.a(xjf.r0, num2);
            Objects.requireNonNull(num4);
            int iIntValue2 = num4.intValue();
            if (iIntValue != 1 && iIntValue2 != 1) {
                if (iIntValue == 2) {
                    num2 = 2;
                } else if (iIntValue2 == 2) {
                    num2 = 1;
                } else {
                    num2 = null;
                }
            }
        } else {
            num2 = null;
        }
        Range rangeA = zzcVar != null ? zzcVar.g.a() : null;
        if (pa7.t(rangeA, hq0.h)) {
            rangeA = null;
        }
        fl8 fl8Var = new fl8();
        if (z2) {
            fl8Var.put(ih1.c, Boolean.TRUE);
        }
        if (num2 != null) {
            fl8Var.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(num2.intValue()));
        }
        fl8Var.put(ih1.b, "android.hardware.camera2.CaptureRequest.setTag.CX");
        if (rangeA != null) {
            fl8Var.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeA);
        }
        fl8 fl8VarJ = fl8Var.j();
        if (rangeA != null) {
            linkedHashMap5.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, rangeA);
        }
        if (num2 != null) {
            linkedHashMap5.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, num2);
        }
        if (zzcVar != null) {
            String str7 = (String) zzcVar.g.b.a(od1.x, null);
            eq0 eq0Var2 = zzcVar.b;
            if (eq0Var2 != null) {
                lu3 lu3Var3 = eq0Var2.a;
                lu3Var3.getClass();
                if (str7 == null) {
                    str7 = null;
                }
                int i10 = eq0Var2.c;
                Size size2 = lu3Var3.h;
                size2.getClass();
                int i11 = lu3Var3.i;
                if (str7 == null) {
                    str = null;
                } else {
                    ig1.a(str7);
                    str = str7;
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        au9Var2 = null;
                    } else {
                        au9Var = new au9(2);
                    }
                    wj1Var2 = new wj1(t72.H(eu4.b(i11, 1000, null, null, au9Var2, null, null, size2, str)));
                    linkedHashMap6.put(wj1Var2, lu3Var3);
                } else {
                    au9Var = new au9(1);
                }
                au9Var2 = au9Var;
                wj1Var2 = new wj1(t72.H(eu4.b(i11, 1000, null, null, au9Var2, null, null, size2, str)));
                linkedHashMap6.put(wj1Var2, lu3Var3);
            } else {
                wj1Var2 = null;
            }
            wj1Var = wj1Var2;
        } else {
            wj1Var = null;
        }
        uk1 uk1Var = this.h;
        if (uk1Var != null) {
            no0 no0Var = tc1.a;
            arrayList2 = null;
            if (uk1Var.a.a(tc1.a, null) != null) {
                r3.f();
                return null;
            }
        } else {
            arrayList2 = null;
        }
        return new zf1(new uf1(this.c.a, s72.j1(linkedHashMap6.keySet()), s72.j1(linkedHashMap.values()), arrayList.isEmpty() ? arrayList2 : arrayList, wj1Var, i2, linkedHashMap5, i, fl8VarJ, t72.I(this.a, this.b), t72.J(fe6Var), wf1Var), bm8.X(linkedHashMap6));
    }

    public final String toString() {
        return "CameraGraphConfigProvider<" + ((Object) ig1.b(this.c.a)) + '>';
    }
}

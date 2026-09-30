package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t9e {
    public final g3e A;
    public final egh B;
    public final uj6 C;
    public final yg1 a;
    public final hv4 b;
    public final bb5 c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final LinkedHashMap l;
    public final ArrayList m;
    public final ArrayList n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public mq0 v;
    public final ArrayList w;
    public final w2e x;
    public final ja4 y;
    public final kd9 z;

    public t9e(Context context, yg1 yg1Var, hv4 hv4Var, bb5 bb5Var) {
        y9e y9eVar = y9e.e;
        context.getClass();
        yg1Var.getClass();
        hv4Var.getClass();
        this.a = yg1Var;
        this.b = hv4Var;
        this.c = bb5Var;
        nc1 nc1Var = (nc1) yg1Var;
        String str = nc1Var.a;
        this.d = str;
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        Integer num = (Integer) nc1Var.c(key);
        int iIntValue = num != null ? num.intValue() : 2;
        this.e = iIntValue;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.g = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.h = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.i = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        this.j = arrayList5;
        this.k = new ArrayList();
        this.l = new LinkedHashMap();
        ArrayList arrayList6 = new ArrayList();
        this.m = arrayList6;
        this.n = new ArrayList();
        yg1.o.getClass();
        boolean zB = xg1.b(yg1Var);
        this.t = zB;
        this.w = new ArrayList();
        this.x = j();
        k9b k9bVar = s74.a;
        ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = (ExtraSupportedSurfaceCombinationsQuirk) s74.a().b(ExtraSupportedSurfaceCombinationsQuirk.class);
        this.y = ja4.g.x(context);
        this.z = new kd9(27);
        this.A = new g3e(3);
        egh eghVar = new egh(yg1Var);
        this.B = eghVar;
        this.C = new uj6(yg1Var);
        CameraCharacteristics.Key key2 = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key2.getClass();
        int[] iArr = (int[]) nc1Var.c(key2);
        if (iArr != null) {
            this.o = qd0.T(iArr, 3);
            this.p = qd0.T(iArr, 6);
            this.s = qd0.T(iArr, 16);
            this.u = qd0.T(iArr, 1);
        }
        boolean z = this.o;
        boolean z2 = this.p;
        ace aceVar = hf6.a;
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        v9e v9eVar = new v9e();
        n3e n3eVar = z9e.e;
        y9e y9eVar2 = y9e.a;
        w9e w9eVar = w9e.MAXIMUM;
        n3e n3eVar2 = z9e.e;
        v9eVar.a(g3e.c(y9eVar2, w9eVar, n3eVar2));
        arrayList8.add(v9eVar);
        v9e v9eVar2 = new v9e();
        y9e y9eVar3 = y9e.c;
        v9eVar2.a(g3e.c(y9eVar3, w9eVar, n3eVar2));
        arrayList8.add(v9eVar2);
        v9e v9eVar3 = new v9e();
        y9e y9eVar4 = y9e.b;
        v9eVar3.a(g3e.c(y9eVar4, w9eVar, n3eVar2));
        arrayList8.add(v9eVar3);
        v9e v9eVar4 = new v9e();
        w9e w9eVar2 = w9e.PREVIEW;
        ub3.s(v9eVar4, g3e.c(y9eVar2, w9eVar2, n3eVar2), y9eVar3, w9eVar, n3eVar2);
        v9e v9eVarF = ub3.f(arrayList8, v9eVar4);
        ub3.s(v9eVarF, g3e.c(y9eVar4, w9eVar2, n3eVar2), y9eVar3, w9eVar, n3eVar2);
        v9e v9eVarF2 = ub3.f(arrayList8, v9eVarF);
        ub3.s(v9eVarF2, g3e.c(y9eVar2, w9eVar2, n3eVar2), y9eVar2, w9eVar2, n3eVar2);
        v9e v9eVarF3 = ub3.f(arrayList8, v9eVarF2);
        ub3.s(v9eVarF3, g3e.c(y9eVar2, w9eVar2, n3eVar2), y9eVar4, w9eVar2, n3eVar2);
        v9e v9eVarF4 = ub3.f(arrayList8, v9eVarF3);
        ub3.s(v9eVarF4, g3e.c(y9eVar2, w9eVar2, n3eVar2), y9eVar4, w9eVar2, n3eVar2);
        v9eVarF4.a(g3e.c(y9eVar3, w9eVar, n3eVar2));
        arrayList8.add(v9eVarF4);
        arrayList7.addAll(arrayList8);
        if (iIntValue == 0 || iIntValue == 1 || iIntValue == 3 || iIntValue == 4) {
            ArrayList arrayList9 = new ArrayList();
            v9e v9eVar5 = new v9e();
            v9eVar5.a(g3e.c(y9eVar2, w9eVar2, n3eVar2));
            w9e w9eVar3 = w9e.RECORD;
            v9eVar5.a(g3e.c(y9eVar2, w9eVar3, n3eVar2));
            arrayList9.add(v9eVar5);
            v9e v9eVar6 = new v9e();
            ub3.s(v9eVar6, g3e.c(y9eVar2, w9eVar2, n3eVar2), y9eVar4, w9eVar3, n3eVar2);
            v9e v9eVarF5 = ub3.f(arrayList9, v9eVar6);
            ub3.s(v9eVarF5, g3e.c(y9eVar4, w9eVar2, n3eVar2), y9eVar4, w9eVar3, n3eVar2);
            v9e v9eVarF6 = ub3.f(arrayList9, v9eVarF5);
            ub3.s(v9eVarF6, g3e.c(y9eVar2, w9eVar2, n3eVar2), y9eVar2, w9eVar3, n3eVar2);
            v9eVarF6.a(g3e.c(y9eVar3, w9eVar3, n3eVar2));
            arrayList9.add(v9eVarF6);
            v9e v9eVar7 = new v9e();
            ub3.s(v9eVar7, g3e.c(y9eVar2, w9eVar2, n3eVar2), y9eVar4, w9eVar3, n3eVar2);
            v9eVar7.a(g3e.c(y9eVar3, w9eVar3, n3eVar2));
            arrayList9.add(v9eVar7);
            v9e v9eVar8 = new v9e();
            ub3.s(v9eVar8, g3e.c(y9eVar4, w9eVar2, n3eVar2), y9eVar4, w9eVar2, n3eVar2);
            v9eVar8.a(g3e.c(y9eVar3, w9eVar, n3eVar2));
            arrayList9.add(v9eVar8);
            arrayList7.addAll(arrayList9);
        }
        if (iIntValue == 1 || iIntValue == 3) {
            ArrayList arrayList10 = new ArrayList();
            v9e v9eVar9 = new v9e();
            ub3.s(v9eVar9, g3e.c(y9eVar2, w9eVar2, n3eVar2), y9eVar2, w9eVar, n3eVar2);
            v9e v9eVarF7 = ub3.f(arrayList10, v9eVar9);
            ub3.s(v9eVarF7, g3e.c(y9eVar2, w9eVar2, n3eVar2), y9eVar4, w9eVar, n3eVar2);
            v9e v9eVarF8 = ub3.f(arrayList10, v9eVarF7);
            ub3.s(v9eVarF8, g3e.c(y9eVar4, w9eVar2, n3eVar2), y9eVar4, w9eVar, n3eVar2);
            v9e v9eVarF9 = ub3.f(arrayList10, v9eVarF8);
            ub3.s(v9eVarF9, g3e.c(y9eVar2, w9eVar2, n3eVar2), y9eVar2, w9eVar2, n3eVar2);
            v9eVarF9.a(g3e.c(y9eVar3, w9eVar, n3eVar2));
            arrayList10.add(v9eVarF9);
            v9e v9eVar10 = new v9e();
            w9e w9eVar4 = w9e.VGA;
            ub3.s(v9eVar10, g3e.c(y9eVar4, w9eVar4, n3eVar2), y9eVar2, w9eVar2, n3eVar2);
            v9eVar10.a(g3e.c(y9eVar4, w9eVar, n3eVar2));
            arrayList10.add(v9eVar10);
            v9e v9eVar11 = new v9e();
            ub3.s(v9eVar11, g3e.c(y9eVar4, w9eVar4, n3eVar2), y9eVar4, w9eVar2, n3eVar2);
            v9eVar11.a(g3e.c(y9eVar4, w9eVar, n3eVar2));
            arrayList10.add(v9eVar11);
            arrayList7.addAll(arrayList10);
        }
        if (z) {
            ArrayList arrayList11 = new ArrayList();
            v9e v9eVar12 = new v9e();
            v9eVar12.a(g3e.c(y9eVar, w9eVar, n3eVar2));
            arrayList11.add(v9eVar12);
            v9e v9eVar13 = new v9e();
            ub3.s(v9eVar13, g3e.c(y9eVar2, w9eVar2, n3eVar2), y9eVar, w9eVar, n3eVar2);
            v9e v9eVarF10 = ub3.f(arrayList11, v9eVar13);
            ub3.s(v9eVarF10, g3e.c(y9eVar4, w9eVar2, n3eVar2), y9eVar, w9eVar, n3eVar2);
            v9e v9eVarF11 = ub3.f(arrayList11, v9eVarF10);
            ub3.s(v9eVarF11, g3e.c(y9eVar2, w9eVar2, n3eVar2), y9eVar2, w9eVar2, n3eVar2);
            v9eVarF11.a(g3e.c(y9eVar, w9eVar, n3eVar2));
            arrayList11.add(v9eVarF11);
            v9e v9eVar14 = new v9e();
            ub3.s(v9eVar14, g3e.c(y9eVar2, w9eVar2, n3eVar2), y9eVar4, w9eVar2, n3eVar2);
            v9eVar14.a(g3e.c(y9eVar, w9eVar, n3eVar2));
            arrayList11.add(v9eVar14);
            v9e v9eVar15 = new v9e();
            ub3.s(v9eVar15, g3e.c(y9eVar4, w9eVar2, n3eVar2), y9eVar4, w9eVar2, n3eVar2);
            v9eVar15.a(g3e.c(y9eVar, w9eVar, n3eVar2));
            arrayList11.add(v9eVar15);
            v9e v9eVar16 = new v9e();
            ub3.s(v9eVar16, g3e.c(y9eVar2, w9eVar2, n3eVar2), y9eVar3, w9eVar, n3eVar2);
            v9eVar16.a(g3e.c(y9eVar, w9eVar, n3eVar2));
            arrayList11.add(v9eVar16);
            v9e v9eVar17 = new v9e();
            ub3.s(v9eVar17, g3e.c(y9eVar4, w9eVar2, n3eVar2), y9eVar3, w9eVar, n3eVar2);
            v9eVar17.a(g3e.c(y9eVar, w9eVar, n3eVar2));
            arrayList11.add(v9eVar17);
            arrayList7.addAll(arrayList11);
        }
        if (z2 && iIntValue == 0) {
            ArrayList arrayList12 = new ArrayList();
            v9e v9eVar18 = new v9e();
            ub3.s(v9eVar18, g3e.c(y9eVar2, w9eVar2, n3eVar2), y9eVar2, w9eVar, n3eVar2);
            v9e v9eVarF12 = ub3.f(arrayList12, v9eVar18);
            ub3.s(v9eVarF12, g3e.c(y9eVar2, w9eVar2, n3eVar2), y9eVar4, w9eVar, n3eVar2);
            v9e v9eVarF13 = ub3.f(arrayList12, v9eVarF12);
            ub3.s(v9eVarF13, g3e.c(y9eVar4, w9eVar2, n3eVar2), y9eVar4, w9eVar, n3eVar2);
            arrayList12.add(v9eVarF13);
            arrayList7.addAll(arrayList12);
        }
        if (iIntValue == 3) {
            ArrayList arrayList13 = new ArrayList();
            v9e v9eVar19 = new v9e();
            v9eVar19.a(g3e.c(y9eVar2, w9eVar2, n3eVar2));
            w9e w9eVar5 = w9e.VGA;
            tec.v(y9eVar2, w9eVar5, v9eVar19, y9eVar4, w9eVar);
            v9eVar19.a(g3e.c(y9eVar, w9eVar, z9e.e));
            arrayList13.add(v9eVar19);
            v9e v9eVar20 = new v9e();
            tec.v(y9eVar2, w9eVar2, v9eVar20, y9eVar2, w9eVar5);
            tec.v(y9eVar3, w9eVar, v9eVar20, y9eVar, w9eVar);
            arrayList13.add(v9eVar20);
            arrayList7.addAll(arrayList13);
        }
        arrayList2.addAll(arrayList7);
        pu4 pu4Var = pu4.a;
        str.getClass();
        List listH = pu4Var;
        if (extraSupportedSurfaceCombinationsQuirk != null) {
            v9e v9eVar21 = ExtraSupportedSurfaceCombinationsQuirk.a;
            String str2 = Build.DEVICE;
            if ("heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2)) {
                ArrayList arrayList14 = new ArrayList();
                listH = arrayList14;
                if (pa7.t(str, "1")) {
                    arrayList14.add(ExtraSupportedSurfaceCombinationsQuirk.a);
                    listH = arrayList14;
                }
            } else if (kj0.z0() || kj0.A0()) {
                listH = pu4Var;
                listH = t72.H(ExtraSupportedSurfaceCombinationsQuirk.b);
            }
        }
        listH = pu4Var;
        arrayList2.addAll(listH);
        if (this.s) {
            ArrayList arrayList15 = new ArrayList();
            v9e v9eVar22 = new v9e();
            w9e w9eVar6 = w9e.ULTRA_MAXIMUM;
            tec.v(y9eVar4, w9eVar6, v9eVar22, y9eVar2, w9eVar2);
            w9e w9eVar7 = w9e.RECORD;
            v9eVar22.a(g3e.c(y9eVar2, w9eVar7, z9e.e));
            arrayList15.add(v9eVar22);
            v9e v9eVar23 = new v9e();
            tec.v(y9eVar3, w9eVar6, v9eVar23, y9eVar2, w9eVar2);
            v9eVar23.a(g3e.c(y9eVar2, w9eVar7, z9e.e));
            arrayList15.add(v9eVar23);
            v9e v9eVar24 = new v9e();
            tec.v(y9eVar, w9eVar6, v9eVar24, y9eVar2, w9eVar2);
            v9eVar24.a(g3e.c(y9eVar2, w9eVar7, z9e.e));
            arrayList15.add(v9eVar24);
            v9e v9eVar25 = new v9e();
            tec.v(y9eVar4, w9eVar6, v9eVar25, y9eVar2, w9eVar2);
            v9eVar25.a(g3e.c(y9eVar3, w9eVar, z9e.e));
            arrayList15.add(v9eVar25);
            v9e v9eVar26 = new v9e();
            tec.v(y9eVar3, w9eVar6, v9eVar26, y9eVar2, w9eVar2);
            v9eVar26.a(g3e.c(y9eVar3, w9eVar, z9e.e));
            arrayList15.add(v9eVar26);
            v9e v9eVar27 = new v9e();
            tec.v(y9eVar, w9eVar6, v9eVar27, y9eVar2, w9eVar2);
            v9eVar27.a(g3e.c(y9eVar3, w9eVar, z9e.e));
            arrayList15.add(v9eVar27);
            v9e v9eVar28 = new v9e();
            tec.v(y9eVar4, w9eVar6, v9eVar28, y9eVar2, w9eVar2);
            v9eVar28.a(g3e.c(y9eVar4, w9eVar, z9e.e));
            arrayList15.add(v9eVar28);
            v9e v9eVar29 = new v9e();
            tec.v(y9eVar3, w9eVar6, v9eVar29, y9eVar2, w9eVar2);
            v9eVar29.a(g3e.c(y9eVar4, w9eVar, z9e.e));
            arrayList15.add(v9eVar29);
            v9e v9eVar30 = new v9e();
            tec.v(y9eVar, w9eVar6, v9eVar30, y9eVar2, w9eVar2);
            v9eVar30.a(g3e.c(y9eVar4, w9eVar, z9e.e));
            arrayList15.add(v9eVar30);
            v9e v9eVar31 = new v9e();
            tec.v(y9eVar4, w9eVar6, v9eVar31, y9eVar2, w9eVar2);
            v9eVar31.a(g3e.c(y9eVar, w9eVar, z9e.e));
            arrayList15.add(v9eVar31);
            v9e v9eVar32 = new v9e();
            tec.v(y9eVar3, w9eVar6, v9eVar32, y9eVar2, w9eVar2);
            v9eVar32.a(g3e.c(y9eVar, w9eVar, z9e.e));
            arrayList15.add(v9eVar32);
            v9e v9eVar33 = new v9e();
            tec.v(y9eVar, w9eVar6, v9eVar33, y9eVar2, w9eVar2);
            v9eVar33.a(g3e.c(y9eVar, w9eVar, z9e.e));
            arrayList15.add(v9eVar33);
            arrayList4.addAll(arrayList15);
        }
        boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        this.q = zHasSystemFeature;
        if (zHasSystemFeature) {
            ArrayList arrayList16 = new ArrayList();
            v9e v9eVar34 = new v9e();
            w9e w9eVar8 = w9e.S1440P_4_3;
            v9eVar34.a(g3e.c(y9eVar4, w9eVar8, z9e.e));
            arrayList16.add(v9eVar34);
            v9e v9eVar35 = new v9e();
            v9eVar35.a(g3e.c(y9eVar2, w9eVar8, z9e.e));
            arrayList16.add(v9eVar35);
            v9e v9eVar36 = new v9e();
            v9eVar36.a(g3e.c(y9eVar3, w9eVar8, z9e.e));
            arrayList16.add(v9eVar36);
            v9e v9eVar37 = new v9e();
            w9e w9eVar9 = w9e.S720P_16_9;
            tec.v(y9eVar4, w9eVar9, v9eVar37, y9eVar3, w9eVar8);
            v9e v9eVarF14 = ub3.f(arrayList16, v9eVar37);
            tec.v(y9eVar2, w9eVar9, v9eVarF14, y9eVar3, w9eVar8);
            v9e v9eVarF15 = ub3.f(arrayList16, v9eVarF14);
            tec.v(y9eVar4, w9eVar9, v9eVarF15, y9eVar4, w9eVar8);
            v9e v9eVarF16 = ub3.f(arrayList16, v9eVarF15);
            tec.v(y9eVar4, w9eVar9, v9eVarF16, y9eVar2, w9eVar8);
            v9e v9eVarF17 = ub3.f(arrayList16, v9eVarF16);
            tec.v(y9eVar2, w9eVar9, v9eVarF17, y9eVar4, w9eVar8);
            v9e v9eVarF18 = ub3.f(arrayList16, v9eVarF17);
            tec.v(y9eVar2, w9eVar9, v9eVarF18, y9eVar2, w9eVar8);
            arrayList16.add(v9eVarF18);
            arrayList.addAll(arrayList16);
        }
        if (eghVar.b) {
            v9e v9eVar38 = new v9e();
            v9eVar38.a(g3e.c(y9eVar2, w9eVar, z9e.e));
            v9e v9eVar39 = new v9e();
            v9eVar39.a(g3e.c(y9eVar4, w9eVar, z9e.e));
            v9e v9eVar40 = new v9e();
            v9eVar40.a(g3e.c(y9eVar2, w9eVar2, z9e.e));
            v9eVar40.a(g3e.c(y9eVar3, w9eVar, z9e.e));
            v9e v9eVar41 = new v9e();
            v9eVar41.a(g3e.c(y9eVar2, w9eVar2, z9e.e));
            v9eVar41.a(g3e.c(y9eVar4, w9eVar, z9e.e));
            v9e v9eVar42 = new v9e();
            v9eVar42.a(g3e.c(y9eVar4, w9eVar2, z9e.e));
            v9eVar42.a(g3e.c(y9eVar4, w9eVar, z9e.e));
            v9e v9eVar43 = new v9e();
            v9eVar43.a(g3e.c(y9eVar2, w9eVar2, z9e.e));
            w9e w9eVar10 = w9e.RECORD;
            v9eVar43.a(g3e.c(y9eVar2, w9eVar10, z9e.e));
            v9e v9eVar44 = new v9e();
            tec.v(y9eVar2, w9eVar2, v9eVar44, y9eVar2, w9eVar10);
            v9eVar44.a(g3e.c(y9eVar4, w9eVar10, z9e.e));
            v9e v9eVar45 = new v9e();
            tec.v(y9eVar2, w9eVar2, v9eVar45, y9eVar2, w9eVar10);
            v9eVar45.a(g3e.c(y9eVar3, w9eVar10, z9e.e));
            arrayList6.addAll(t72.I(v9eVar38, v9eVar39, v9eVar40, v9eVar41, v9eVar42, v9eVar43, v9eVar44, v9eVar45));
        }
        if (zB) {
            ArrayList arrayList17 = new ArrayList();
            v9e v9eVar46 = new v9e();
            w9e w9eVar11 = w9e.S1440P_4_3;
            v9eVar46.a(g3e.c(y9eVar2, w9eVar11, z9e.e));
            arrayList17.add(v9eVar46);
            v9e v9eVar47 = new v9e();
            v9eVar47.a(g3e.c(y9eVar4, w9eVar11, z9e.e));
            arrayList17.add(v9eVar47);
            v9e v9eVar48 = new v9e();
            tec.v(y9eVar2, w9eVar11, v9eVar48, y9eVar3, w9eVar);
            v9e v9eVarF19 = ub3.f(arrayList17, v9eVar48);
            tec.v(y9eVar4, w9eVar11, v9eVarF19, y9eVar3, w9eVar);
            v9e v9eVarF20 = ub3.f(arrayList17, v9eVarF19);
            tec.v(y9eVar2, w9eVar11, v9eVarF20, y9eVar4, w9eVar);
            v9e v9eVarF21 = ub3.f(arrayList17, v9eVarF20);
            tec.v(y9eVar4, w9eVar11, v9eVarF21, y9eVar4, w9eVar);
            v9e v9eVarF22 = ub3.f(arrayList17, v9eVarF21);
            tec.v(y9eVar2, w9eVar2, v9eVarF22, y9eVar2, w9eVar11);
            v9e v9eVarF23 = ub3.f(arrayList17, v9eVarF22);
            tec.v(y9eVar4, w9eVar2, v9eVarF23, y9eVar2, w9eVar11);
            v9e v9eVarF24 = ub3.f(arrayList17, v9eVarF23);
            tec.v(y9eVar2, w9eVar2, v9eVarF24, y9eVar4, w9eVar11);
            v9e v9eVarF25 = ub3.f(arrayList17, v9eVarF24);
            tec.v(y9eVar4, w9eVar2, v9eVarF25, y9eVar4, w9eVar11);
            arrayList17.add(v9eVarF25);
            arrayList5.addAll(arrayList17);
        }
        boolean zD = o3e.d(yg1Var);
        this.r = zD;
        if (zD && Build.VERSION.SDK_INT >= 33) {
            v9e v9eVar49 = new v9e();
            w9e w9eVar12 = w9e.S1440P_4_3;
            n3e n3eVar3 = n3e.PREVIEW_VIDEO_STILL;
            v9eVar49.a(g3e.c(y9eVar2, w9eVar12, n3eVar3));
            v9e v9eVar50 = new v9e();
            v9eVar50.a(g3e.c(y9eVar4, w9eVar12, n3eVar3));
            v9e v9eVar51 = new v9e();
            w9e w9eVar13 = w9e.RECORD;
            n3e n3eVar4 = n3e.VIDEO_RECORD;
            v9eVar51.a(g3e.c(y9eVar2, w9eVar13, n3eVar4));
            v9e v9eVar52 = new v9e();
            v9eVar52.a(g3e.c(y9eVar4, w9eVar13, n3eVar4));
            v9e v9eVar53 = new v9e();
            n3e n3eVar5 = n3e.STILL_CAPTURE;
            v9eVar53.a(g3e.c(y9eVar3, w9eVar, n3eVar5));
            v9e v9eVar54 = new v9e();
            v9eVar54.a(g3e.c(y9eVar4, w9eVar, n3eVar5));
            v9e v9eVar55 = new v9e();
            n3e n3eVar6 = n3e.PREVIEW;
            v9eVar55.a(g3e.c(y9eVar2, w9eVar2, n3eVar6));
            v9eVar55.a(g3e.c(y9eVar3, w9eVar, n3eVar5));
            v9e v9eVar56 = new v9e();
            v9eVar56.a(g3e.c(y9eVar2, w9eVar2, n3eVar6));
            v9eVar56.a(g3e.c(y9eVar4, w9eVar, n3eVar5));
            v9e v9eVar57 = new v9e();
            v9eVar57.a(g3e.c(y9eVar2, w9eVar2, n3eVar6));
            v9eVar57.a(g3e.c(y9eVar2, w9eVar13, n3eVar4));
            v9e v9eVar58 = new v9e();
            v9eVar58.a(g3e.c(y9eVar2, w9eVar2, n3eVar6));
            v9eVar58.a(g3e.c(y9eVar4, w9eVar13, n3eVar4));
            v9e v9eVar59 = new v9e();
            v9eVar59.a(g3e.c(y9eVar2, w9eVar2, n3eVar6));
            v9eVar59.a(g3e.c(y9eVar4, w9eVar2, n3eVar6));
            v9e v9eVar60 = new v9e();
            ub3.s(v9eVar60, g3e.c(y9eVar2, w9eVar2, n3eVar6), y9eVar2, w9eVar13, n3eVar4);
            v9eVar60.a(g3e.c(y9eVar3, w9eVar13, n3eVar5));
            v9e v9eVar61 = new v9e();
            ub3.s(v9eVar61, g3e.c(y9eVar2, w9eVar2, n3eVar6), y9eVar4, w9eVar13, n3eVar4);
            v9eVar61.a(g3e.c(y9eVar3, w9eVar13, n3eVar5));
            v9e v9eVar62 = new v9e();
            ub3.s(v9eVar62, g3e.c(y9eVar2, w9eVar2, n3eVar6), y9eVar4, w9eVar2, n3eVar6);
            v9eVar62.a(g3e.c(y9eVar3, w9eVar, n3eVar5));
            arrayList3.addAll(t72.I(v9eVar49, v9eVar50, v9eVar51, v9eVar52, v9eVar53, v9eVar54, v9eVar55, v9eVar56, v9eVar57, v9eVar58, v9eVar59, v9eVar60, v9eVar61, v9eVar62));
        }
        b();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    public static Range c(Range range, int i, Range[] rangeArr) {
        Range range2 = hq0.h;
        if (pa7.t(range, range2)) {
            range2.getClass();
            return range2;
        }
        if (rangeArr == null) {
            range2.getClass();
            return range2;
        }
        Object lower = range.getLower();
        lower.getClass();
        Integer numValueOf = Integer.valueOf(Math.min(((Number) lower).intValue(), i));
        Object upper = range.getUpper();
        upper.getClass();
        Range range3 = new Range(numValueOf, Integer.valueOf(Math.min(((Number) upper).intValue(), i)));
        int iH = 0;
        for (Range range4 : rangeArr) {
            if (i >= ((Number) range4.getLower()).intValue()) {
                if (pa7.t(range2, hq0.h)) {
                    range2 = range4;
                }
                if (range4.equals(range3)) {
                    range2 = range4;
                    break;
                }
                try {
                    Range rangeIntersect = range4.intersect(range3);
                    rangeIntersect.getClass();
                    int iH2 = h(rangeIntersect);
                    if (iH == 0) {
                        range2 = range4;
                        iH = iH2;
                    } else if (iH2 >= iH) {
                        range2.getClass();
                        Range rangeIntersect2 = range2.intersect(range3);
                        rangeIntersect2.getClass();
                        double dH = h(rangeIntersect2);
                        Range rangeIntersect3 = range4.intersect(range3);
                        rangeIntersect3.getClass();
                        double dH2 = h(rangeIntersect3);
                        double dH3 = dH2 / ((double) h(range4));
                        double dH4 = dH / ((double) h(range2));
                        if (dH2 > dH) {
                            if (dH3 >= 0.5d || dH3 >= dH4) {
                                range2 = range4;
                            }
                        } else if (dH2 == dH) {
                            if (dH3 > dH4 || (dH3 == dH4 && ((Number) range4.getLower()).intValue() > ((Number) range2.getLower()).intValue())) {
                                range2 = range4;
                            }
                        } else if (dH4 < 0.5d && dH3 > dH4) {
                            range2 = range4;
                        }
                        Range rangeIntersect4 = range3.intersect(range2);
                        rangeIntersect4.getClass();
                        iH = h(rangeIntersect4);
                    }
                } catch (IllegalArgumentException unused) {
                    if (iH == 0) {
                        int iG = g(range4, range3);
                        range2.getClass();
                        if (iG < g(range2, range3) || (g(range4, range3) == g(range2, range3) && (((Number) range4.getLower()).intValue() > ((Number) range2.getUpper()).intValue() || h(range4) < h(range2)))) {
                            range2 = range4;
                        }
                    }
                }
            }
        }
        range2.getClass();
        return range2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    public static Size e(StreamConfigurationMap streamConfigurationMap, int i, boolean z, Rational rational) {
        Object dzbVar;
        Object outputSizes;
        try {
            if (i == 34) {
                if (streamConfigurationMap != null) {
                    outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                } else {
                    outputSizes = null;
                }
            } else if (streamConfigurationMap != null) {
                outputSizes = streamConfigurationMap.getOutputSizes(i);
            } else {
                outputSizes = null;
            }
            dzbVar = outputSizes;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        Size[] sizeArr = (Size[]) dzbVar;
        if (sizeArr == null) {
            sizeArr = null;
        } else if (rational != null) {
            ArrayList arrayList = new ArrayList();
            for (Size size : sizeArr) {
                if (ae0.a(rational, size)) {
                    arrayList.add(size);
                }
            }
            sizeArr = (Size[]) arrayList.toArray(new Size[0]);
        }
        if (sizeArr == null || sizeArr.length == 0) {
            return null;
        }
        qa2 qa2Var = new qa2(false);
        List listAsList = Arrays.asList(sizeArr);
        listAsList.getClass();
        Size size2 = (Size) Collections.max(listAsList, qa2Var);
        Size size3 = jld.a;
        if (z) {
            Size[] highResolutionOutputSizes = streamConfigurationMap != null ? streamConfigurationMap.getHighResolutionOutputSizes(i) : null;
            if (highResolutionOutputSizes != null && highResolutionOutputSizes.length != 0) {
                List listAsList2 = Arrays.asList(highResolutionOutputSizes);
                listAsList2.getClass();
                size3 = (Size) Collections.max(listAsList2, qa2Var);
            }
        }
        return (Size) Collections.max(t72.I(size2, size3), qa2Var);
    }

    public static int g(Range range, Range range2) {
        if (range.contains(range2.getUpper()) || range.contains(range2.getLower())) {
            qc0.j("Ranges must not intersect");
            return 0;
        }
        if (((Number) range.getLower()).intValue() > ((Number) range2.getUpper()).intValue()) {
            int iIntValue = ((Number) range.getLower()).intValue();
            Object upper = range2.getUpper();
            upper.getClass();
            return iIntValue - ((Number) upper).intValue();
        }
        int iIntValue2 = ((Number) range2.getLower()).intValue();
        Object upper2 = range.getUpper();
        upper2.getClass();
        return iIntValue2 - ((Number) upper2).intValue();
    }

    public static int h(Range range) {
        int iIntValue = ((Number) range.getUpper()).intValue();
        Object lower = range.getLower();
        lower.getClass();
        return (iIntValue - ((Number) lower).intValue()) + 1;
    }

    public static Range n(Range range, Range range2, boolean z) {
        Range range3 = hq0.h;
        if (pa7.t(range2, range3) && pa7.t(range, range3)) {
            range3.getClass();
            return range3;
        }
        if (pa7.t(range2, range3)) {
            return range;
        }
        if (!pa7.t(range, range3)) {
            if (z) {
                ok8.o("All targetFrameRate should be the same if strict fps is required", pa7.t(range, range2));
                return range;
            }
            try {
                Range rangeIntersect = range2.intersect(range);
                rangeIntersect.getClass();
                return rangeIntersect;
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    public final boolean a(s9e s9eVar, ArrayList arrayList, Map map, List list, List list2) {
        ArrayList arrayList2;
        List list3;
        boolean z;
        Size sizeB;
        mkf mkfVar;
        Integer num;
        Integer num2 = 2;
        vuf vufVar = s9eVar.d;
        boolean z2 = s9eVar.h;
        LinkedHashMap linkedHashMap = this.l;
        boolean zContainsKey = linkedHashMap.containsKey(s9eVar);
        vuf vufVar2 = vuf.e;
        if (zContainsKey) {
            Object obj = linkedHashMap.get(s9eVar);
            obj.getClass();
            list3 = (List) obj;
            num2 = num2;
            z2 = z2;
        } else {
            ArrayList arrayList3 = new ArrayList();
            int i = s9eVar.a;
            if (z2) {
                ace aceVar = hf6.a;
                arrayList3.addAll(hf6.b(this.a, vufVar));
                num2 = num2;
                z2 = z2;
            } else if (s9eVar.e) {
                ArrayList arrayList4 = this.n;
                if (arrayList4.isEmpty()) {
                    ace aceVar2 = hf6.a;
                    ArrayList arrayList5 = new ArrayList();
                    v9e v9eVar = new v9e();
                    n3e n3eVar = z9e.e;
                    w9e w9eVar = w9e.MAXIMUM;
                    n3e n3eVar2 = z9e.e;
                    y9e y9eVar = y9e.d;
                    v9eVar.a(g3e.c(y9eVar, w9eVar, n3eVar2));
                    arrayList5.add(v9eVar);
                    v9e v9eVar2 = new v9e();
                    ub3.s(v9eVar2, g3e.c(y9e.a, w9e.PREVIEW, n3eVar2), y9eVar, w9eVar, n3eVar2);
                    arrayList5.add(v9eVar2);
                    arrayList4.addAll(arrayList5);
                }
                if (i == 0) {
                    arrayList3.addAll(arrayList4);
                }
            } else {
                num2 = num2;
                z2 = z2;
                if (s9eVar.f) {
                    ArrayList arrayList6 = this.k;
                    if (arrayList6.isEmpty()) {
                        uj6 uj6Var = this.C;
                        if (((Boolean) uj6Var.b.getValue()).booleanValue()) {
                            arrayList6.clear();
                            Size size = (Size) uj6Var.c.getValue();
                            if (size != null) {
                                mq0 mq0VarM = m(34);
                                ace aceVar3 = hf6.a;
                                ArrayList arrayList7 = new ArrayList();
                                n3e n3eVar3 = z9e.e;
                                z9e z9eVarK = g3e.k(34, size, mq0VarM, 0, x9e.b, z9e.e);
                                v9e v9eVar3 = new v9e();
                                v9eVar3.a(z9eVarK);
                                arrayList7.add(v9eVar3);
                                v9e v9eVar4 = new v9e();
                                v9eVar4.a(z9eVarK);
                                v9eVar4.a(z9eVarK);
                                arrayList7.add(v9eVar4);
                                arrayList6.addAll(arrayList7);
                            }
                        }
                    }
                    arrayList3.addAll(arrayList6);
                } else {
                    int i2 = s9eVar.b;
                    if (i2 == 8) {
                        if (i != 1) {
                            ArrayList arrayList8 = this.g;
                            if (i != 2) {
                                if (vufVar == vufVar2) {
                                    arrayList8 = this.j;
                                }
                                arrayList3.addAll(arrayList8);
                            } else {
                                arrayList3.addAll(this.i);
                                arrayList3.addAll(arrayList8);
                            }
                        } else {
                            arrayList2 = this.f;
                        }
                        linkedHashMap.put(s9eVar, arrayList2);
                        list3 = arrayList2;
                    } else if (i2 == 10 && i == 0) {
                        arrayList3.addAll(this.m);
                    }
                }
            }
            arrayList2 = arrayList3;
            linkedHashMap.put(s9eVar, arrayList2);
            list3 = arrayList2;
        }
        if (list3 != null && list3.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = list3.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((v9e) it.next()).c(arrayList) != null) {
                z = true;
                break;
            }
        }
        if (!z || !z2) {
            return z;
        }
        yzc yzcVar = new yzc();
        Iterator it2 = arrayList.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                t72.Z();
                throw null;
            }
            z9e z9eVar = (z9e) next;
            mq0 mq0VarM2 = m(z9eVar.d);
            LinkedHashMap linkedHashMap2 = mq0VarM2.f;
            int i5 = z9eVar.d;
            w9e w9eVar2 = z9eVar.b;
            int iOrdinal = w9eVar2.ordinal();
            if (iOrdinal != 3) {
                switch (iOrdinal) {
                    case 9:
                        sizeB = mq0VarM2.e;
                        break;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        sizeB = (Size) linkedHashMap2.get(Integer.valueOf(i5));
                        break;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        sizeB = (Size) linkedHashMap2.get(Integer.valueOf(i5));
                        break;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        sizeB = (Size) linkedHashMap2.get(Integer.valueOf(i5));
                        break;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        sizeB = (Size) mq0VarM2.i.get(Integer.valueOf(i5));
                        break;
                    case 14:
                        qc0.p("Not supported config size");
                        return false;
                    default:
                        sizeB = w9eVar2.b();
                        break;
                }
            } else {
                sizeB = mq0VarM2.c;
            }
            sizeB.getClass();
            xjf xjfVar = (xjf) list.get(((Number) list2.get(i3)).intValue());
            Object obj2 = map.get(z9eVar);
            if (obj2 == null) {
                qc0.j("Required value was null.");
                return false;
            }
            qr4 qr4Var = (qr4) obj2;
            xjfVar.getClass();
            Iterator it3 = it2;
            ab5 ab5Var = new ab5(xjfVar.l(), sizeB);
            mkf.a.getClass();
            int iOrdinal2 = xjfVar.s().ordinal();
            if (iOrdinal2 == 0) {
                mkfVar = mkf.IMAGE_CAPTURE;
            } else if (iOrdinal2 == 1) {
                mkfVar = mkf.PREVIEW;
            } else if (iOrdinal2 == 2) {
                mkfVar = mkf.IMAGE_ANALYSIS;
            } else if (iOrdinal2 != 3) {
                mkfVar = iOrdinal2 != 4 ? mkf.UNDEFINED : mkf.STREAM_SHARING;
            } else {
                mkfVar = mkf.VIDEO_CAPTURE;
            }
            Class clsA = mkfVar.a();
            if (clsA != null) {
                ab5Var.j = clsA;
            }
            vzc vzcVarD = vzc.d(xjfVar, sizeB);
            r1f r1fVar = vzcVarD.b;
            vzcVarD.b(ab5Var, qr4Var, -1);
            Range range = s9eVar.i;
            Range range2 = !pa7.t(range, hq0.h) ? range : null;
            if (range2 == null) {
                range2 = cx5.d;
            }
            ((k79) r1fVar.c).p(im1.h, range2);
            if (vufVar == vufVar2) {
                num = num2;
                ((k79) r1fVar.c).p(xjf.q0, num);
            } else {
                num = num2;
                if (vufVar == vuf.d) {
                    ((k79) r1fVar.c).p(xjf.r0, num);
                }
            }
            yzcVar.a(vzcVarD.c());
            boolean zC = yzcVar.c();
            StringBuilder sb = new StringBuilder("Cannot create a combined SessionConfig for feature combo after adding ");
            sb.append(xjfVar);
            sb.append(" with ");
            sb.append(z9eVar);
            sb.append(" due to [");
            sb.append(!yzcVar.m ? "Template is not set" : yzcVar.l.toString());
            sb.append("]; surfaceConfigList = ");
            sb.append(arrayList);
            sb.append(", featureSettings = ");
            sb.append(s9eVar);
            sb.append(", newUseCaseConfigs = ");
            sb.append(list);
            ok8.o(sb.toString(), zC);
            num2 = num;
            it2 = it3;
            i3 = i4;
        }
        zzc zzcVarB = yzcVar.b();
        boolean zC2 = this.c.c(zzcVarB);
        List listB = zzcVarB.b();
        listB.getClass();
        Iterator it4 = listB.iterator();
        while (it4.hasNext()) {
            ((lu3) it4.next()).a();
        }
        return zC2;
    }

    public final void b() {
        Object dzbVar;
        Object outputSizes;
        Size sizeI;
        Size sizeC = this.y.c();
        try {
            Integer.parseInt(this.d);
            sizeI = i();
            if (sizeI == null) {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.x.d.b;
                if (streamConfigurationMap != null) {
                    try {
                        outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
                    } catch (Throwable th) {
                        dzbVar = new dzb(th);
                    }
                } else {
                    outputSizes = null;
                }
                dzbVar = outputSizes;
                if (dzbVar instanceof dzb) {
                    dzbVar = null;
                }
                Size[] sizeArr = (Size[]) dzbVar;
                if (sizeArr != null) {
                    Arrays.sort(sizeArr, new qa2(true));
                    int length = sizeArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            sizeI = null;
                            break;
                        }
                        Size size = sizeArr[i];
                        int width = size.getWidth();
                        Size size2 = jld.e;
                        if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                            sizeI = size;
                            break;
                        }
                        i++;
                    }
                } else {
                    sizeI = null;
                    break;
                }
                if (sizeI == null) {
                    sizeI = jld.c;
                    sizeI.getClass();
                }
            }
        } catch (NumberFormatException unused) {
        }
        this.v = new mq0(jld.b, new LinkedHashMap(), sizeC, new LinkedHashMap(), sizeI, new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
    }

    public final int d(int i, Size size, boolean z, int i2) {
        long jH;
        int iIntValue = 0;
        if (!z) {
            w2e w2eVarJ = j();
            size.getClass();
            try {
                jH = w2eVarJ.d.h(i, size);
            } catch (RuntimeException e) {
                if (b21.F(5, "CXCP")) {
                    b1.n("CXCP", "Unable to get min frame duration for format = " + i + " and size = " + size, e);
                }
                jH = 0;
            }
            if (jH > 0) {
                iIntValue = (int) (1.0E9d / jH);
            } else if (!this.u) {
                iIntValue = Integer.MAX_VALUE;
            } else if (b21.F(5, "CXCP")) {
                b1.l("CXCP", "minFrameDuration: " + jH + " is invalid for imageFormat = " + i + ", size = " + size);
            }
        } else {
            if (i != 34) {
                qc0.p("Check failed.");
                return 0;
            }
            uj6 uj6Var = this.C;
            uj6Var.getClass();
            size.getClass();
            List listC = uj6Var.c(size);
            if (listC.isEmpty()) {
                listC = null;
            }
            if (listC == null) {
                b21.W("HighSpeedResolver", "No supported high speed  fps for " + size);
            } else {
                Iterator it = listC.iterator();
                if (!it.hasNext()) {
                    s8f.c();
                    return 0;
                }
                Integer num = (Integer) ((Range) it.next()).getUpper();
                while (it.hasNext()) {
                    Integer num2 = (Integer) ((Range) it.next()).getUpper();
                    if (num.compareTo(num2) < 0) {
                        num = num2;
                    }
                }
                num.getClass();
                iIntValue = num.intValue();
            }
        }
        return Math.min(i2, iIntValue);
    }

    public final List f(s9e s9eVar, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        List list;
        no0 no0Var = o3e.a;
        if (s9eVar.a == 0 && s9eVar.b == 8 && !s9eVar.f) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                List listC = ((v9e) it.next()).c(arrayList);
                if (listC != null) {
                    no0 no0Var2 = o3e.a;
                    int size = listC.size();
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            z = true;
                            break;
                        }
                        long jA = ((z9e) listC.get(i)).c.a();
                        boolean zContainsKey = linkedHashMap.containsKey(Integer.valueOf(i));
                        zjf zjfVar = zjf.e;
                        if (zContainsKey) {
                            eo0 eo0Var = (eo0) linkedHashMap.get(Integer.valueOf(i));
                            eo0Var.getClass();
                            List list2 = eo0Var.e;
                            if (list2.size() == 1) {
                                zjfVar = (zjf) list2.get(0);
                            }
                            zjfVar.getClass();
                            if (!o3e.c(zjfVar, jA, list2)) {
                                break;
                            }
                            i++;
                        } else {
                            if (!linkedHashMap2.containsKey(Integer.valueOf(i))) {
                                qc0.i("SurfaceConfig does not map to any use case");
                                return null;
                            }
                            Object obj = linkedHashMap2.get(Integer.valueOf(i));
                            obj.getClass();
                            xjf xjfVar = (xjf) obj;
                            zjf zjfVarS = xjfVar.s();
                            zjfVarS.getClass();
                            if (xjfVar.s() == zjfVar) {
                                list = (List) ((l3e) xjfVar).c(l3e.b);
                                list.getClass();
                            } else {
                                list = pu4.a;
                            }
                            if (!o3e.c(zjfVarS, jA, list)) {
                                break;
                            }
                            i++;
                        }
                    }
                    ace aceVar = new ace(new ykc(16, this, listC));
                    if (z && ((Boolean) aceVar.getValue()).booleanValue()) {
                        return listC;
                    }
                }
            }
        }
        return null;
    }

    public final Size i() {
        to0 to0VarB;
        Iterator it = t72.I(1, 13, 10, 8, 12, 6, 5, 4).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            hv4 hv4Var = this.b;
            if (hv4Var.a(iIntValue) && (to0VarB = hv4Var.b(iIntValue)) != null) {
                List list = to0VarB.d;
                list.getClass();
                if (!list.isEmpty()) {
                    Object obj = list.get(0);
                    obj.getClass();
                    uo0 uo0Var = (uo0) obj;
                    return new Size(uo0Var.e, uo0Var.f);
                }
            }
        }
        return null;
    }

    public final w2e j() {
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        key.getClass();
        yg1 yg1Var = this.a;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((nc1) yg1Var).c(key);
        if (streamConfigurationMap != null) {
            return new w2e(streamConfigurationMap, new ut9(yg1Var));
        }
        qc0.j("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
        return null;
    }

    public final ArrayList k(int i, ArrayList arrayList, List list, List list2, ArrayList arrayList2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, boolean z) {
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            eo0 eo0Var = (eo0) it.next();
            arrayList3.add(eo0Var.a);
            linkedHashMap.put(Integer.valueOf(arrayList3.size() - 1), eo0Var);
        }
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            int i3 = i2 + 1;
            Size size = (Size) it2.next();
            xjf xjfVar = (xjf) list2.get(((Number) arrayList2.get(i2)).intValue());
            int iL = xjfVar.l();
            n3e n3eVarR = xjfVar.r();
            n3e n3eVar = z9e.e;
            arrayList3.add(g3e.k(iL, size, m(iL), i, z ? x9e.a : x9e.b, n3eVarR));
            linkedHashMap2.put(Integer.valueOf(arrayList3.size() - 1), xjfVar);
            i2 = i3;
        }
        return arrayList3;
    }

    public final mq0 l() {
        mq0 mq0Var = this.v;
        if (mq0Var != null) {
            return mq0Var;
        }
        pa7.g0("surfaceSizeDefinition");
        throw null;
    }

    public final mq0 m(int i) {
        Size sizeE;
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = this.w;
        if (!arrayList.contains(numValueOf)) {
            LinkedHashMap linkedHashMap = l().b;
            Size size = jld.d;
            size.getClass();
            r(linkedHashMap, size, i);
            LinkedHashMap linkedHashMap2 = l().d;
            Size size2 = jld.f;
            size2.getClass();
            r(linkedHashMap2, size2, i);
            q(l().f, i, null);
            q(l().g, i, ae0.a);
            q(l().h, i, ae0.c);
            LinkedHashMap linkedHashMap3 = l().i;
            if (Build.VERSION.SDK_INT >= 31 && this.s) {
                CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
                key.getClass();
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((nc1) this.a).c(key);
                if (streamConfigurationMap != null && (sizeE = e(streamConfigurationMap, i, true, null)) != null) {
                    linkedHashMap3.put(Integer.valueOf(i), sizeE);
                }
            }
            arrayList.add(Integer.valueOf(i));
        }
        return l();
    }

    /* JADX WARN: Code duplicated, block: B:206:0x0619 A[PHI: r15 r20 r26
  0x0619: PHI (r15v23 int) = (r15v22 int), (r15v22 int), (r15v30 int), (r15v32 int) binds: [B:194:0x05ee, B:196:0x05fa, B:202:0x0607, B:205:0x0614] A[DONT_GENERATE, DONT_INLINE]
  0x0619: PHI (r20v4 boolean) = (r20v3 boolean), (r20v3 boolean), (r20v3 boolean), (r20v5 boolean) binds: [B:194:0x05ee, B:196:0x05fa, B:202:0x0607, B:205:0x0614] A[DONT_GENERATE, DONT_INLINE]
  0x0619: PHI (r26v3 java.util.List) = (r26v2 java.util.List), (r26v2 java.util.List), (r26v5 java.util.List), (r26v6 java.util.List) binds: [B:194:0x05ee, B:196:0x05fa, B:202:0x0607, B:205:0x0614] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:207:0x061b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x0664  */
    /* JADX WARN: Code duplicated, block: B:300:0x0853  */
    /* JADX WARN: Code duplicated, block: B:302:0x085a  */
    /* JADX WARN: Code duplicated, block: B:304:0x0872  */
    /* JADX WARN: Code duplicated, block: B:306:0x088e  */
    /* JADX WARN: Code duplicated, block: B:308:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:310:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:316:0x08be  */
    /* JADX WARN: Code duplicated, block: B:318:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:320:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:378:0x08ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x08b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x0904 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x08fc A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [int] */
    /* JADX WARN: Type inference failed for: r37v8 */
    /* JADX WARN: Type inference failed for: r37v9 */
    /* JADX WARN: Type inference failed for: r4v60, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r50v0, types: [java.util.LinkedHashMap] */
    public final yae o(s9e s9eVar, ArrayList arrayList, Map map, List list, ArrayList arrayList2, LinkedHashMap linkedHashMap) {
        String str;
        String str2;
        String str3;
        String str4;
        yg1 yg1Var;
        LinkedHashMap linkedHashMap2;
        boolean z;
        ?? r28;
        boolean z2;
        s9e s9eVar2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        List listF;
        int i;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ?? r37;
        List list2;
        int i2;
        List list3;
        List list4;
        int size;
        int i3;
        long jA;
        LinkedHashMap linkedHashMap5;
        LinkedHashMap linkedHashMap6;
        xjf xjfVar;
        hq0 hq0Var;
        od1 od1VarB;
        eo0 eo0Var;
        od1 od1VarB2;
        hc2 hc2VarA;
        Range range;
        qr4 qr4Var;
        Range[] rangeArrB;
        qr4 qr4Var2;
        ?? arrayList5;
        Size size2;
        ArrayList<Size> arrayList6;
        Size sizeB;
        t9e t9eVar = this;
        s9e s9eVar3 = s9eVar;
        Map map2 = map;
        boolean z3 = s9eVar3.f;
        String str5 = "CXCP";
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "resolveSpecsBySettings: featureSettings = " + s9eVar3);
        }
        boolean z4 = s9eVar3.g;
        Range range2 = s9eVar3.i;
        pu4 pu4Var = pu4.a;
        x9e x9eVar = x9e.b;
        String str6 = t9eVar.d;
        if (z4) {
            str = ". New configs: ";
            str2 = str6;
            str3 = "No supported surface combination is found for camera device - Id : ";
        } else {
            ArrayList arrayList7 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList7.add(((eo0) it.next()).a);
            }
            qa2 qa2Var = new qa2(false);
            for (xjf xjfVar2 : map2.keySet()) {
                String str7 = str6;
                List list5 = (List) map2.get(xjfVar2);
                if (list5 == null || list5.isEmpty()) {
                    yg5.i(46, xjfVar2, "No available output size is found for ");
                    return null;
                }
                Size size3 = (Size) Collections.min(list5, qa2Var);
                qa2 qa2Var2 = qa2Var;
                int iL = xjfVar2.l();
                n3e n3eVarR = xjfVar2.r();
                n3e n3eVar = z9e.e;
                size3.getClass();
                arrayList7.add(g3e.k(iL, size3, t9eVar.m(iL), s9eVar3.a, x9eVar, n3eVarR));
                qa2Var = qa2Var2;
                str6 = str7;
            }
            str2 = str6;
            str3 = "No supported surface combination is found for camera device - Id : ";
            str = ". New configs: ";
            if (!t9eVar.a(s9eVar3, arrayList7, qu4.a, pu4Var, pu4Var)) {
                throw new IllegalArgumentException((str3 + str2 + ". May be attempting to bind too many use cases. Existing surfaces: " + arrayList + str + list + ". GroupableFeature settings: " + s9eVar3 + '.').toString());
            }
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        Iterator it2 = map2.keySet().iterator();
        Map map3 = map2;
        while (true) {
            str4 = str;
            if (!it2.hasNext()) {
                break;
            }
            xjf xjfVar3 = (xjf) it2.next();
            ArrayList arrayList8 = new ArrayList();
            Iterator it3 = it2;
            LinkedHashMap linkedHashMap8 = new LinkedHashMap();
            Object obj = map3.get(xjfVar3);
            obj.getClass();
            for (Size size4 : (List) obj) {
                pu4 pu4Var2 = pu4Var;
                int iL2 = xjfVar3.l();
                int iV = xjfVar3.v(size4);
                n3e n3eVarR2 = xjfVar3.r();
                n3e n3eVar2 = z9e.e;
                String str8 = str3;
                w9e w9eVar = g3e.k(iL2, size4, t9eVar.m(iL2), s9eVar3.a, s9eVar3.h ? x9e.a : x9eVar, n3eVarR2).b;
                String str9 = str2;
                Range range3 = hq0.h;
                int iD = pa7.t(range2, range3) ? Integer.MAX_VALUE : t9eVar.d(iL2, size4, z3, iV);
                if (!z4 || (w9eVar != w9e.NOT_SUPPORT && (pa7.t(range2, range3) || iD >= ((Number) range2.getUpper()).intValue()))) {
                    Set linkedHashSet = (Set) linkedHashMap8.get(w9eVar);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        linkedHashMap8.put(w9eVar, linkedHashSet);
                    }
                    if (!linkedHashSet.contains(Integer.valueOf(iD))) {
                        arrayList8.add(size4);
                        linkedHashSet.add(Integer.valueOf(iD));
                    }
                }
                str3 = str8;
                str2 = str9;
                pu4Var = pu4Var2;
            }
            linkedHashMap7.put(xjfVar3, arrayList8);
            map3 = map;
            it2 = it3;
            str = str4;
        }
        pu4 pu4Var3 = pu4Var;
        String str10 = str3;
        String str11 = str2;
        ArrayList arrayList9 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it4.hasNext();
            yg1Var = t9eVar.a;
            if (!zHasNext) {
                break;
            }
            int iIntValue = ((Number) it4.next()).intValue();
            Object obj2 = linkedHashMap7.get(list.get(iIntValue));
            obj2.getClass();
            List<Size> list6 = (List) obj2;
            int iL3 = ((xjf) list.get(iIntValue)).l();
            t9eVar.A.getClass();
            yg1Var.getClass();
            w2e w2eVar = t9eVar.x;
            w2eVar.getClass();
            Rational rational = ((((Nexus4AndroidLTargetAspectRatioQuirk) s74.a().b(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && ((AspectRatioLegacyApi21Quirk) new ui1(yg1Var, w2eVar).a().b(AspectRatioLegacyApi21Quirk.class)) == null) || (size2 = (Size) t9eVar.m(256).f.get(256)) == null) ? null : new Rational(size2.getWidth(), size2.getHeight());
            if (rational == null) {
                arrayList6 = new ArrayList(list6);
            } else {
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                for (Size size5 : list6) {
                    if (ae0.a(rational, size5)) {
                        arrayList10.add(size5);
                    } else {
                        arrayList11.add(size5);
                    }
                }
                arrayList11.addAll(0, arrayList10);
                arrayList6 = arrayList11;
            }
            n3e n3eVar3 = z9e.e;
            y9e y9eVar = (y9e) z9e.h.get(Integer.valueOf(iL3));
            if (y9eVar == null) {
                y9eVar = y9e.a;
            }
            kd9 kd9Var = t9eVar.z;
            kd9Var.getClass();
            if (((ExtraCroppingQuirk) kd9Var.b) != null && (sizeB = ExtraCroppingQuirk.b(y9eVar)) != null) {
                ArrayList arrayList12 = new ArrayList();
                arrayList12.add(sizeB);
                for (Size size6 : arrayList6) {
                    if (!pa7.t(size6, sizeB)) {
                        arrayList12.add(size6);
                    }
                }
                arrayList6 = arrayList12;
            }
            arrayList9.add(arrayList6);
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        uj6 uj6Var = t9eVar.C;
        if (z3) {
            uj6Var.getClass();
            if (arrayList9.isEmpty()) {
                arrayList5 = pu4Var3;
            } else {
                List listA = uj6.a(arrayList9);
                arrayList5 = new ArrayList(t72.u(listA, 10));
                Iterator it5 = listA.iterator();
                while (it5.hasNext()) {
                    Size size7 = (Size) it5.next();
                    int size8 = arrayList9.size();
                    Iterator it6 = it5;
                    ArrayList arrayList13 = new ArrayList(size8);
                    LinkedHashMap linkedHashMap11 = linkedHashMap9;
                    for (int i4 = 0; i4 < size8; i4++) {
                        arrayList13.add(size7);
                    }
                    arrayList5.add(arrayList13);
                    it5 = it6;
                    linkedHashMap9 = linkedHashMap11;
                }
            }
            linkedHashMap2 = linkedHashMap9;
            z = true;
            r28 = arrayList5;
        } else {
            linkedHashMap2 = linkedHashMap9;
            z = true;
            Iterator it7 = arrayList9.iterator();
            int size9 = 1;
            while (it7.hasNext()) {
                size9 *= ((List) it7.next()).size();
            }
            if (size9 == 0) {
                qc0.j("Failed to find supported resolutions.");
                return null;
            }
            ArrayList arrayList14 = new ArrayList();
            for (int i5 = 0; i5 < size9; i5++) {
                arrayList14.add(new ArrayList());
            }
            int size10 = size9 / ((List) arrayList9.get(0)).size();
            int size11 = arrayList9.size();
            int i6 = size9;
            int i7 = 0;
            while (i7 < size11) {
                int i8 = size10;
                List list7 = (List) arrayList9.get(i7);
                int i9 = size11;
                int i10 = 0;
                while (i10 < size9) {
                    ((List) arrayList14.get(i10)).add(list7.get((i10 % i6) / i8));
                    i10++;
                    arrayList14 = arrayList14;
                    size9 = size9;
                }
                ArrayList arrayList15 = arrayList14;
                int i11 = size9;
                if (i7 < arrayList9.size() - 1) {
                    size10 = i8 / ((List) arrayList9.get(i7 + 1)).size();
                    i6 = i8;
                } else {
                    size10 = i8;
                }
                i7++;
                size11 = i9;
                arrayList14 = arrayList15;
                size9 = i11;
            }
            r28 = arrayList14;
        }
        no0 no0Var = o3e.a;
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                Iterator it9 = list.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        z2 = false;
                        break;
                    }
                    xjf xjfVar4 = (xjf) it9.next();
                    zjf zjfVarS = xjfVar4.s();
                    zjfVarS.getClass();
                    if (o3e.e(xjfVar4, zjfVarS)) {
                    }
                }
            } else {
                eo0 eo0Var2 = (eo0) it8.next();
                zjf zjfVar = (zjf) eo0Var2.e.get(0);
                qh2 qh2Var = eo0Var2.f;
                qh2Var.getClass();
                zjfVar.getClass();
                if (o3e.e(qh2Var, zjfVar)) {
                }
            }
            z2 = z;
            break;
        }
        if (!t9eVar.r || z2) {
            s9eVar2 = s9eVar3;
            linkedHashMap3 = linkedHashMap10;
            linkedHashMap4 = linkedHashMap2;
            listF = null;
        } else {
            Iterator it10 = r28.iterator();
            listF = null;
            while (true) {
                if (!it10.hasNext()) {
                    s9eVar2 = s9eVar3;
                    linkedHashMap3 = linkedHashMap10;
                    linkedHashMap4 = linkedHashMap2;
                    break;
                }
                s9e s9eVar4 = s9eVar3;
                s9eVar2 = s9eVar4;
                LinkedHashMap linkedHashMap12 = linkedHashMap2;
                linkedHashMap4 = linkedHashMap12;
                linkedHashMap3 = linkedHashMap10;
                listF = t9eVar.f(s9eVar2, t9eVar.k(s9eVar4.a, arrayList, (List) it10.next(), list, arrayList2, linkedHashMap12, linkedHashMap10, false), linkedHashMap4, linkedHashMap3);
                if (listF != null) {
                    break;
                }
                linkedHashMap4.clear();
                linkedHashMap3.clear();
                linkedHashMap2 = linkedHashMap4;
                linkedHashMap10 = linkedHashMap3;
                s9eVar3 = s9eVar2;
            }
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "orderedSurfaceConfigListForStreamUseCase = " + listF);
            }
        }
        Iterator it11 = arrayList.iterator();
        int iMin = Integer.MAX_VALUE;
        while (it11.hasNext()) {
            eo0 eo0Var3 = (eo0) it11.next();
            iMin = Math.min(iMin, t9eVar.d(eo0Var3.b, eo0Var3.c, z3, eo0Var3.j));
        }
        Iterator it12 = r28.iterator();
        List list8 = null;
        List list9 = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MAX_VALUE;
        boolean z5 = false;
        boolean z6 = false;
        while (true) {
            if (!it12.hasNext()) {
                s9e s9eVar5 = s9eVar2;
                i = i12;
                s9eVar2 = s9eVar5;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                linkedHashMap4 = linkedHashMap4;
                linkedHashMap3 = linkedHashMap3;
                r37 = z3;
                yg1Var = yg1Var;
                str5 = str5;
                uj6Var = uj6Var;
                list2 = list;
                listF = listF;
                i2 = i13;
                list3 = list8;
                list4 = list9;
                break;
            }
            List list10 = (List) it12.next();
            int i14 = i13;
            LinkedHashMap linkedHashMap13 = new LinkedHashMap();
            LinkedHashMap linkedHashMap14 = new LinkedHashMap();
            int i15 = i12;
            int i16 = s9eVar2.a;
            boolean z7 = s9eVar2.h;
            linkedHashMap3 = linkedHashMap3;
            linkedHashMap4 = linkedHashMap4;
            i = i15;
            List list11 = list;
            yg1Var = yg1Var;
            uj6Var = uj6Var;
            int i17 = iMin;
            str5 = str5;
            listF = listF;
            ArrayList arrayListK = t9eVar.k(i16, arrayList, list10, list11, arrayList2, linkedHashMap13, linkedHashMap14, z7);
            arrayList3 = arrayList;
            Iterator it13 = list10.iterator();
            int iMin2 = i17;
            int i18 = 0;
            while (it13.hasNext()) {
                int i19 = i18 + 1;
                Iterator it14 = it13;
                Size size12 = (Size) it13.next();
                xjf xjfVar5 = (xjf) list11.get(((Number) arrayList2.get(i18)).intValue());
                iMin2 = Math.min(iMin2, t9eVar.d(xjfVar5.l(), size12, z3, xjfVar5.v(size12)));
                list11 = list;
                i18 = i19;
                it13 = it14;
            }
            boolean z8 = (pa7.t(range2, hq0.h) || iMin2 >= i17 || iMin2 >= ((Number) range2.getUpper()).intValue()) ? z : false;
            LinkedHashMap linkedHashMap15 = new LinkedHashMap();
            Iterator it15 = arrayListK.iterator();
            int i20 = 0;
            while (it15.hasNext()) {
                Object next = it15.next();
                int i21 = i20 + 1;
                if (i20 < 0) {
                    t72.Z();
                    throw null;
                }
                z9e z9eVar = (z9e) next;
                Iterator it16 = it15;
                eo0 eo0Var4 = (eo0) linkedHashMap13.get(Integer.valueOf(i20));
                if (eo0Var4 == null || (qr4Var2 = eo0Var4.d) == null) {
                    Object obj3 = linkedHashMap.get(linkedHashMap14.get(Integer.valueOf(i20)));
                    if (obj3 == null) {
                        qc0.j("Required value was null.");
                        return null;
                    }
                    qr4Var2 = (qr4) obj3;
                }
                linkedHashMap15.put(z9eVar, qr4Var2);
                it15 = it16;
                i20 = i21;
            }
            boolean z9 = z3;
            xi3 xi3Var = new xi3(this, s9eVar, arrayListK, linkedHashMap15, list, arrayList2);
            t9eVar = this;
            s9eVar2 = s9eVar;
            list2 = list;
            arrayList4 = arrayList2;
            lw7 lw7VarN = eb3.N(z18.c, xi3Var);
            if (z5 || !((Boolean) lw7VarN.getValue()).booleanValue()) {
                if (listF != null || z6 || t9eVar.f(s9eVar2, arrayListK, linkedHashMap13, linkedHashMap14) == null) {
                    i12 = i;
                    i13 = i14;
                } else {
                    if (i14 != Integer.MAX_VALUE && i14 >= iMin2) {
                        i13 = i14;
                    } else {
                        i13 = iMin2;
                        list9 = list10;
                    }
                    if (!z8) {
                        i12 = i;
                    } else {
                        if (z5) {
                            i2 = iMin2;
                            list3 = list8;
                            list4 = list10;
                            r37 = z9;
                            break;
                        }
                        int i22 = i;
                        s9eVar2 = s9eVar2;
                        i12 = i22;
                        z6 = z;
                        i13 = iMin2;
                        listF = listF;
                        list9 = list10;
                    }
                    iMin = i17;
                    z3 = z9 ? 1 : 0;
                }
                iMin = i17;
                z3 = z9 ? 1 : 0;
            } else {
                if (i == Integer.MAX_VALUE || i < iMin2) {
                    i = iMin2;
                    list8 = list10;
                }
                if (!z8) {
                    if (listF != null) {
                        i12 = i;
                        i13 = i14;
                    } else {
                        i12 = i;
                        i13 = i14;
                    }
                    iMin = i17;
                    z3 = z9 ? 1 : 0;
                } else {
                    if (z6) {
                        i = iMin2;
                        i2 = i14;
                        list4 = list9;
                        list3 = list10;
                        r37 = z9;
                        break;
                    }
                    z5 = z;
                    i = iMin2;
                    list8 = list10;
                    if (listF != null) {
                        i12 = i;
                        i13 = i14;
                    } else {
                        i12 = i;
                        i13 = i14;
                    }
                    iMin = i17;
                    z3 = z9 ? 1 : 0;
                }
            }
        }
        q9e q9eVar = (list3 != null && (z4 == 0 || pa7.t(range2, hq0.h) || (i != Integer.MAX_VALUE && i >= ((Number) range2.getUpper()).intValue()))) ? new q9e(list3, list4, i, i2, Integer.MAX_VALUE) : null;
        if (q9eVar == null) {
            StringBuilder sbP = tec.p(str10, str11, " and Hardware level: ");
            sbP.append(t9eVar.e);
            sbP.append(". May be the specified resolution is too large and not supported. Existing surfaces: ");
            sbP.append(arrayList3);
            sbP.append(str4);
            sbP.append(list2);
            sbP.append('.');
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        int i23 = q9eVar.c;
        List list12 = q9eVar.a;
        String str12 = str5;
        if (b21.F(3, str12)) {
            Log.d(str12, "resolveSpecsBySettings: bestSizesAndFps = " + q9eVar);
        }
        LinkedHashMap linkedHashMap16 = new LinkedHashMap();
        Range rangeC = hq0.h;
        if (pa7.t(range2, rangeC)) {
            uj6 uj6Var2 = uj6Var;
            if (r37 != 0) {
                rangeC = c(uj6.f, i23, uj6Var2.b(list12));
            }
        } else {
            if (r37 != 0) {
                rangeArrB = uj6Var.b(list12);
            } else {
                CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
                key.getClass();
                rangeArrB = (Range[]) ((nc1) yg1Var).c(key);
            }
            Range rangeC2 = c(range2, i23, rangeArrB);
            if ((z4 != 0 || s9eVar2.j) && !rangeC2.equals(range2)) {
                StringBuilder sb = new StringBuilder("Target FPS range ");
                sb.append(range2);
                sb.append(" is not supported. Max FPS supported by the calculated best combination: ");
                sb.append(i23);
                sb.append(". Calculated best FPS range for device: ");
                sb.append(rangeC2);
                String string = Arrays.toString(rangeArrB);
                string.getClass();
                sb.append(". Device supported FPS ranges: ");
                sb.append(string);
                sb.append('.');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            rangeC = rangeC2;
        }
        Iterator it17 = list2.iterator();
        int i24 = 0;
        while (it17.hasNext()) {
            int i25 = i24 + 1;
            xjf xjfVar6 = (xjf) it17.next();
            hc2 hc2VarA2 = hq0.a((Size) list12.get(arrayList4.indexOf(Integer.valueOf(i24))));
            hc2VarA2.e = Integer.valueOf((int) r37);
            Object obj4 = linkedHashMap.get(xjfVar6);
            if (obj4 == null) {
                qc0.p("Required value was null.");
                return null;
            }
            hc2VarA2.d = (qr4) obj4;
            no0 no0Var2 = o3e.a;
            xjfVar6.getClass();
            k79 k79VarJ = k79.j();
            Iterator it18 = it17;
            no0 no0Var3 = od1.v;
            if (xjfVar6.h(no0Var3)) {
                k79VarJ.p(no0Var3, xjfVar6.c(no0Var3));
            }
            no0 no0Var4 = xjf.n0;
            if (xjfVar6.h(no0Var4)) {
                k79VarJ.p(no0Var4, xjfVar6.c(no0Var4));
            }
            no0 no0Var5 = iv6.b;
            if (xjfVar6.h(no0Var5)) {
                k79VarJ.p(no0Var5, xjfVar6.c(no0Var5));
            }
            no0 no0Var6 = wv6.C;
            if (xjfVar6.h(no0Var6)) {
                k79VarJ.p(no0Var6, xjfVar6.c(no0Var6));
            }
            hc2VarA2.g = new od1(7, k79VarJ);
            hc2VarA2.v = Boolean.valueOf(s9eVar2.c);
            if (!pa7.t(rangeC, hq0.h)) {
                if (rangeC == null) {
                    r82.g("Null expectedFrameRateRange");
                    return null;
                }
                hc2VarA2.f = rangeC;
            }
            linkedHashMap16.put(xjfVar6, hc2VarA2.c());
            it17 = it18;
            arrayList4 = arrayList2;
            i24 = i25;
        }
        LinkedHashMap linkedHashMap17 = new LinkedHashMap();
        if (listF != null) {
            List list13 = q9eVar.b;
            if (i23 == q9eVar.d) {
                int size13 = list12.size();
                list13.getClass();
                if (size13 == list13.size()) {
                    ArrayList<iy9> arrayListR1 = s72.r1(list12, list13);
                    if (!arrayListR1.isEmpty()) {
                        for (iy9 iy9Var : arrayListR1) {
                            if (!pa7.t(iy9Var.d(), iy9Var.e())) {
                            }
                        }
                        if (!o3e.f(yg1Var, arrayList3, linkedHashMap16, linkedHashMap17)) {
                            size = listF.size();
                            i3 = 0;
                            while (i3 < size) {
                                jA = ((z9e) listF.get(i3)).c.a();
                                linkedHashMap5 = linkedHashMap4;
                                if (linkedHashMap5.containsKey(Integer.valueOf(i3))) {
                                    eo0Var = (eo0) linkedHashMap5.get(Integer.valueOf(i3));
                                    eo0Var.getClass();
                                    qh2 qh2Var2 = eo0Var.f;
                                    qh2Var2.getClass();
                                    od1VarB2 = o3e.b(qh2Var2, Long.valueOf(jA));
                                    if (od1VarB2 != null) {
                                        hc2VarA = hq0.a(eo0Var.c);
                                        hc2VarA.e = Integer.valueOf(eo0Var.g);
                                        range = eo0Var.h;
                                        if (range != null) {
                                            r82.g("Null expectedFrameRateRange");
                                            return null;
                                        }
                                        hc2VarA.f = range;
                                        qr4Var = eo0Var.d;
                                        if (qr4Var != null) {
                                            r82.g("Null dynamicRange");
                                            return null;
                                        }
                                        hc2VarA.d = qr4Var;
                                        hc2VarA.g = od1VarB2;
                                        linkedHashMap17.put(eo0Var, hc2VarA.c());
                                    }
                                    linkedHashMap6 = linkedHashMap3;
                                } else {
                                    linkedHashMap6 = linkedHashMap3;
                                    if (linkedHashMap6.containsKey(Integer.valueOf(i3))) {
                                        qc0.i("SurfaceConfig does not map to any use case");
                                        return null;
                                    }
                                    Object obj5 = linkedHashMap6.get(Integer.valueOf(i3));
                                    obj5.getClass();
                                    xjfVar = (xjf) obj5;
                                    hq0Var = (hq0) linkedHashMap16.get(xjfVar);
                                    hq0Var.getClass();
                                    qh2 qh2Var3 = hq0Var.f;
                                    qh2Var3.getClass();
                                    od1VarB = o3e.b(qh2Var3, Long.valueOf(jA));
                                    if (od1VarB != null) {
                                        hc2 hc2VarB = hq0Var.b();
                                        hc2VarB.g = od1VarB;
                                        linkedHashMap16.put(xjfVar, hc2VarB.c());
                                    }
                                }
                                i3++;
                                linkedHashMap4 = linkedHashMap5;
                                linkedHashMap3 = linkedHashMap6;
                            }
                        }
                    } else if (!o3e.f(yg1Var, arrayList3, linkedHashMap16, linkedHashMap17)) {
                        size = listF.size();
                        i3 = 0;
                        while (i3 < size) {
                            jA = ((z9e) listF.get(i3)).c.a();
                            linkedHashMap5 = linkedHashMap4;
                            if (linkedHashMap5.containsKey(Integer.valueOf(i3))) {
                                eo0Var = (eo0) linkedHashMap5.get(Integer.valueOf(i3));
                                eo0Var.getClass();
                                qh2 qh2Var4 = eo0Var.f;
                                qh2Var4.getClass();
                                od1VarB2 = o3e.b(qh2Var4, Long.valueOf(jA));
                                if (od1VarB2 != null) {
                                    hc2VarA = hq0.a(eo0Var.c);
                                    hc2VarA.e = Integer.valueOf(eo0Var.g);
                                    range = eo0Var.h;
                                    if (range != null) {
                                        r82.g("Null expectedFrameRateRange");
                                        return null;
                                    }
                                    hc2VarA.f = range;
                                    qr4Var = eo0Var.d;
                                    if (qr4Var != null) {
                                        r82.g("Null dynamicRange");
                                        return null;
                                    }
                                    hc2VarA.d = qr4Var;
                                    hc2VarA.g = od1VarB2;
                                    linkedHashMap17.put(eo0Var, hc2VarA.c());
                                }
                                linkedHashMap6 = linkedHashMap3;
                            } else {
                                linkedHashMap6 = linkedHashMap3;
                                if (linkedHashMap6.containsKey(Integer.valueOf(i3))) {
                                    qc0.i("SurfaceConfig does not map to any use case");
                                    return null;
                                }
                                Object obj6 = linkedHashMap6.get(Integer.valueOf(i3));
                                obj6.getClass();
                                xjfVar = (xjf) obj6;
                                hq0Var = (hq0) linkedHashMap16.get(xjfVar);
                                hq0Var.getClass();
                                qh2 qh2Var5 = hq0Var.f;
                                qh2Var5.getClass();
                                od1VarB = o3e.b(qh2Var5, Long.valueOf(jA));
                                if (od1VarB != null) {
                                    hc2 hc2VarB2 = hq0Var.b();
                                    hc2VarB2.g = od1VarB;
                                    linkedHashMap16.put(xjfVar, hc2VarB2.c());
                                }
                            }
                            i3++;
                            linkedHashMap4 = linkedHashMap5;
                            linkedHashMap3 = linkedHashMap6;
                        }
                    }
                }
            }
        }
        return new yae(linkedHashMap16, linkedHashMap17, q9eVar.e);
    }

    public final z9e p(int i, int i2, Size size, n3e n3eVar) {
        size.getClass();
        n3e n3eVar2 = z9e.e;
        return g3e.k(i2, size, m(i2), i, x9e.b, n3eVar);
    }

    public final void q(LinkedHashMap linkedHashMap, int i, Rational rational) {
        Size sizeE = e((StreamConfigurationMap) this.x.d.b, i, true, rational);
        if (sizeE != null) {
            linkedHashMap.put(Integer.valueOf(i), sizeE);
        }
    }

    public final void r(LinkedHashMap linkedHashMap, Size size, int i) {
        if (this.q) {
            Size sizeE = e((StreamConfigurationMap) this.x.d.b, i, false, null);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeE != null) {
                size = (Size) Collections.min(t72.I(size, sizeE), new qa2(false));
            }
            linkedHashMap.put(numValueOf, size);
        }
    }

    public final void s(s9e s9eVar) {
        int i = s9eVar.a;
        boolean z = s9eVar.g;
        String str = "CONCURRENT_CAMERA";
        String str2 = this.d;
        if (i != 0 && s9eVar.e) {
            StringBuilder sbP = tec.p("Camera device Id is ", str2, ". Ultra HDR is not currently supported in ");
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            qc0.o(ks0.l(sbP, str, " camera mode."));
            return;
        }
        if (i != 0 && s9eVar.b == 10) {
            StringBuilder sbP2 = tec.p("Camera device Id is ", str2, ". 10 bit dynamic range is not currently supported in ");
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            qc0.o(ks0.l(sbP2, str, " camera mode."));
            return;
        }
        if (i != 0 && z) {
            StringBuilder sbP3 = tec.p("Camera device Id is ", str2, ". feature combination is not currently supported in ");
            if (i != 1) {
                str = i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA";
            }
            qc0.o(ks0.l(sbP3, str, " camera mode."));
            return;
        }
        boolean z2 = s9eVar.f;
        if (z2 && z) {
            qc0.j("High-speed session is not supported with feature combination");
        } else {
            if (!z2 || ((Boolean) this.C.b.getValue()).booleanValue()) {
                return;
            }
            qc0.j("High-speed session is not supported on this device.");
        }
    }
}

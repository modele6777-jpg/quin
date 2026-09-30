package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import android.database.SQLException;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.SpreadRecommendationResult;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p8c {
    public static long a = 30000;
    public static int b = 3;
    public static volatile boolean c = true;

    public static final void a(final egd egdVar, final int i, final s13 s13Var, final int i2, final boolean z, final boolean z2, final List list, final jie jieVar, final boolean z3, final float f, final fy9 fy9Var, final x16 x16Var, l46 l46Var, final int i3) {
        j09 j09VarA;
        l46Var.h0(-1260841113);
        int i4 = i3 | (l46Var.g(egdVar) ? 32 : 16) | (l46Var.e(i) ? 256 : 128) | (l46Var.e(s13Var.ordinal()) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.e(i2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.h(z) ? 131072 : 65536) | (l46Var.h(z2) ? 1048576 : 524288) | (l46Var.g(list) ? 8388608 : 4194304) | (l46Var.g(jieVar) ? 67108864 : 33554432) | (l46Var.h(z3) ? 536870912 : 268435456);
        if (l46Var.W(i4 & 1, ((306783379 & i4) == 306783378 && (((('@' | (l46Var.d(f) ? (char) 4 : (char) 2)) | (l46Var.i(fy9Var) ? 32 : 16)) | (l46Var.i(x16Var) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            gh6 gh6VarW0 = kj0.w0(l46Var);
            g09 g09Var = g09.a;
            if (i == 0) {
                l46Var.f0(2067062472);
                boolean zI = l46Var.i(gh6VarW0);
                Object objR = l46Var.R();
                i8c i8cVar = sf2.a;
                if (zI || objR == i8cVar) {
                    objR = new yv9(0, gh6VarW0, gh6.class, "rigid", "rigid()V", 0, 13);
                    l46Var.p0(objR);
                }
                j09 j09VarA2 = ibe.a(g09Var, wef.a, new u42(5, egdVar, (x16) ((ym7) objR)));
                boolean zI2 = ((i4 & 3670016) == 1048576) | l46Var.i(gh6VarW0);
                Object objR2 = l46Var.R();
                if (zI2 || objR2 == i8cVar) {
                    objR2 = new mv0(z2, gh6VarW0, 10);
                    l46Var.p0(objR2);
                }
                j09VarA = ibe.a(j09VarA2, egdVar.a(), new xfd(egdVar, (x16) objR2, x16Var));
                l46Var.r(false);
            } else {
                l46Var.f0(2067241001);
                l46Var.r(false);
                j09VarA = g09Var;
            }
            j09 j09VarC = b.c(g09Var, 1.0f);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            nk8.d(j09VarC.D(new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)).D(j09VarA), null, af1.b0(777875281, new n26() { // from class: gfd
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) throws Throwable {
                    boolean z4;
                    float f2;
                    e31 e31Var = (e31) obj;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    e31Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var2.g(e31Var) ? 4 : 2;
                    }
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        iy9 iy9Var = new iy9(new yi4(e31Var.d()), new yi4(e31Var.c()));
                        float f3 = ((yi4) iy9Var.a()).a;
                        float f4 = ((yi4) iy9Var.b()).a;
                        sw3 sw3Var = (sw3) l46Var2.k(zg2.h);
                        hie hieVar = null;
                        float fB = snd.b(null, l46Var2, 1);
                        boolean zD = l46Var2.d(f3) | l46Var2.d(f4) | l46Var2.g(sw3Var);
                        boolean z5 = z2;
                        boolean zH = zD | l46Var2.h(z5);
                        int i5 = i2;
                        boolean zE = zH | l46Var2.e(i5) | l46Var2.d(fB);
                        Object objR3 = l46Var2.R();
                        i8c i8cVar2 = sf2.a;
                        if (zE || objR3 == i8cVar2) {
                            float fP0 = sw3Var.p0(72.0f);
                            float fP1 = z5 ? fP0 / fB : sw3Var.p0(126.0f);
                            float fP2 = sw3Var.p0(z5 ? 0.45f : 0.5f);
                            if (z5) {
                                float fP3 = sw3Var.p0(f3);
                                float fP4 = sw3Var.p0(f4);
                                float fP5 = sw3Var.p0(8.0f);
                                f2 = 2.0f;
                                float fP6 = sw3Var.p0(20.0f);
                                float fP7 = sw3Var.p0(1.0f);
                                int i6 = i5 - 1;
                                float f5 = (i6 < 0 ? 0 : i6) * fP2;
                                z4 = true;
                                float fSin = (float) Math.sin(Math.toRadians(7.15d));
                                float f6 = ((fP1 * fSin) + fP0) / 2.0f;
                                float f7 = ((fP3 / 2.0f) - fP5) - fP7;
                                float[] fArr = {((fP4 - ((fP5 + fP7) * 2.0f)) - f5) / ((fP0 * fSin) + (1.3f * fP1)), (f7 - fP6) / f6, (f7 - (fSin * f5)) / ((0.55f * fP0) + f6)};
                                int i7 = 0;
                                float fMin = 1.8f;
                                for (int i8 = 3; i7 < i8; i8 = 3) {
                                    fMin = Math.min(fMin, fArr[i7]);
                                    i7++;
                                }
                                if (fMin < 0.01f) {
                                    fMin = 0.01f;
                                }
                                hieVar = new hie((fP3 - fP0) / 2.0f, ((((fP1 * fMin) * 0.3f) + (fP4 + f5)) / 2.0f) - (fP1 / 2.0f), fMin);
                            } else {
                                z4 = true;
                                f2 = 2.0f;
                            }
                            objR3 = new jp1((((long) Float.floatToRawIntBits(hieVar != null ? hieVar.a : (sw3Var.p0(f3) - fP0) / f2)) << 32) | (((long) Float.floatToRawIntBits(hieVar != null ? hieVar.b : (sw3Var.p0(f4) - fP1) / f2)) & 4294967295L), fP2, new v6c(sw3Var.p0(f3) - fP0, sw3Var.p0(f4) - fP1), new v6c(sw3Var.p0(f3) - fP0, sw3Var.p0(f4) - fP1), fP0, fP1, hieVar != null ? hieVar.c : 1.8f);
                            l46Var2.p0(objR3);
                        } else {
                            z4 = true;
                            z5 = z5;
                        }
                        jp1 jp1Var = (jp1) objR3;
                        Object objR4 = l46Var2.R();
                        if (objR4 == i8cVar2) {
                            objR4 = q1c.f(pu4.a);
                            l46Var2.p0(objR4);
                        }
                        e89 e89Var = (e89) objR4;
                        Object objR5 = l46Var2.R();
                        if (objR5 == i8cVar2) {
                            objR5 = new w77(e89Var, 11);
                            l46Var2.p0(objR5);
                        }
                        a26 a26Var = (a26) objR5;
                        egd egdVar2 = egdVar;
                        int i9 = i;
                        p8c.c(egdVar2, i9, jp1Var, i5, z, z3, a26Var, l46Var2, 1572864);
                        hgd hgdVar = hgd.d;
                        boolean z6 = (i9 <= 0 || egdVar2.a() != hgdVar) ? false : z4;
                        p8c.b((List) e89Var.getValue(), egdVar2, s13Var, jp1Var.b, z6 ? ks0.a(jp1Var.g, 1.0f, f, 1.0f) : ((Number) vx.b(((egdVar2.a() == hgd.a || egdVar2.a() == hgdVar || egdVar2.a() == hgd.e) && !z6) ? jp1Var.g : 1.0f, b21.T(500, 0, gs4.a, 2), "card_stack_scale", null, l46Var2, 3072, 20).getValue()).floatValue(), (z6 || (z5 && egdVar2.a() == hgdVar)) ? z4 : false, z5, list, jieVar, fy9Var, l46Var2, 1073741824);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 3072, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(i, s13Var, i2, z, z2, list, jieVar, z3, f, fy9Var, x16Var, i3) { // from class: hfd
                public final /* synthetic */ int b;
                public final /* synthetic */ s13 c;
                public final /* synthetic */ int d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ List g;
                public final /* synthetic */ jie v;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ float x;
                public final /* synthetic */ fy9 y;
                public final /* synthetic */ x16 z;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(7);
                    p8c.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void b(final List list, final egd egdVar, final s13 s13Var, final float f, final float f2, final boolean z, final boolean z2, final List list2, final jie jieVar, final fy9 fy9Var, l46 l46Var, final int i) throws Throwable {
        ojb ojbVarV;
        l26 l26Var;
        l46Var.h0(1072295201);
        int i2 = i | (l46Var.g(list) ? 4 : 2) | (l46Var.g(egdVar) ? 32 : 16) | (l46Var.e(s13Var.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.d(f) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.d(f2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.h(z) ? 131072 : 65536) | (l46Var.h(z2) ? 1048576 : 524288) | (l46Var.g(list2) ? 8388608 : 4194304) | (l46Var.g(jieVar) ? 67108864 : 33554432) | (l46Var.i(fy9Var) ? 536870912 : 268435456);
        if (l46Var.W(i2 & 1, (306783379 & i2) != 306783378)) {
            if (!z2 || list.size() == list2.size()) {
                hgd hgdVarA = egdVar.a();
                hgd hgdVar = hgd.e;
                if (hgdVarA == hgdVar && z2) {
                    l46Var.f0(-1219980531);
                    tq.e(list, jieVar, list2, f, f2, fy9Var, l46Var, (i2 & 14) | ((i2 >> 21) & 112) | ((i2 >> 15) & 896) | (i2 & 7168) | (57344 & i2) | 262144 | ((i2 >> 12) & 458752));
                    l46Var.r(false);
                } else if (egdVar.a() == hgdVar) {
                    l46Var.f0(-1219722084);
                    f(list, s13Var, egdVar.d.j(), f, f2, fy9Var, l46Var, 262144 | (57344 & i2) | (i2 & 14) | ((i2 >> 3) & 112) | (i2 & 7168) | ((i2 >> 12) & 458752));
                    l46Var.r(false);
                } else {
                    l46Var.f0(-1219486546);
                    int i3 = i2 >> 9;
                    k(list, f2, z, (!z2 || egdVar.a() == hgd.b || egdVar.a() == hgd.c) ? false : true, list2, fy9Var, l46Var, (i2 & 14) | (i3 & 112) | (i3 & 896) | (57344 & i3) | 262144 | ((i2 >> 12) & 458752));
                    l46Var.r(false);
                }
            } else {
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                }
                final int i4 = 0;
                l26Var = new l26(list, egdVar, s13Var, f, f2, z, z2, list2, jieVar, fy9Var, i, i4) { // from class: ifd
                    public final /* synthetic */ int a;
                    public final /* synthetic */ List b;
                    public final /* synthetic */ egd c;
                    public final /* synthetic */ s13 d;
                    public final /* synthetic */ float e;
                    public final /* synthetic */ float f;
                    public final /* synthetic */ boolean g;
                    public final /* synthetic */ boolean v;
                    public final /* synthetic */ List w;
                    public final /* synthetic */ jie x;
                    public final /* synthetic */ fy9 y;

                    {
                        this.a = i4;
                    }

                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) throws Throwable {
                        int i5 = this.a;
                        wef wefVar = wef.a;
                        switch (i5) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(1073741825);
                                p8c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, (l46) obj, iP);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP2 = k99.P(1073741825);
                                p8c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, (l46) obj, iP2);
                                break;
                        }
                        return wefVar;
                    }
                };
            }
            ojbVarV.d = l26Var;
        }
        l46Var.Z();
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final int i5 = 1;
            l26Var = new l26(list, egdVar, s13Var, f, f2, z, z2, list2, jieVar, fy9Var, i, i5) { // from class: ifd
                public final /* synthetic */ int a;
                public final /* synthetic */ List b;
                public final /* synthetic */ egd c;
                public final /* synthetic */ s13 d;
                public final /* synthetic */ float e;
                public final /* synthetic */ float f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ List w;
                public final /* synthetic */ jie x;
                public final /* synthetic */ fy9 y;

                {
                    this.a = i5;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) throws Throwable {
                    int i6 = this.a;
                    wef wefVar = wef.a;
                    switch (i6) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP = k99.P(1073741825);
                            p8c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, (l46) obj, iP);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP2 = k99.P(1073741825);
                            p8c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, (l46) obj, iP2);
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var;
        }
    }

    public static final void c(egd egdVar, int i, jp1 jp1Var, int i2, boolean z, boolean z2, a26 a26Var, l46 l46Var, int i3) {
        Object pfdVar;
        x16 x16Var;
        Object sfdVar;
        egd egdVar2 = egdVar;
        jp1 jp1Var2 = jp1Var;
        l46Var.h0(248475774);
        int i4 = i3 | (l46Var.g(egdVar2) ? 4 : 2) | (l46Var.e(i) ? 32 : 16) | (l46Var.g(jp1Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.e(i2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.h(z) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.h(z2) ? 131072 : 65536);
        if (l46Var.W(i4 & 1, (599187 & i4) != 599186)) {
            int i5 = i4 & 896;
            int i6 = i4 & 7168;
            boolean z3 = ((57344 & i4) == 16384) | (i5 == 256) | (i6 == 2048);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z3 || objR == obj) {
                objR = new x50(z, jp1Var2, i2);
                l46Var.p0(objR);
            }
            x16 x16Var2 = (x16) objR;
            int i7 = i4 & 14;
            boolean zG = (i5 == 256) | (i6 == 2048) | l46Var.g(x16Var2) | (i7 == 4);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                x16Var = x16Var2;
                pfdVar = new pfd(i2, jp1Var2, null, x16Var, a26Var, egdVar2);
                egdVar2 = egdVar2;
                l46Var.p0(pfdVar);
            } else {
                pfdVar = objR2;
                x16Var = x16Var2;
            }
            af1.o((l26) pfdVar, l46Var, wef.a);
            gh6 gh6VarW0 = kj0.w0(l46Var);
            Boolean bool = (Boolean) egdVar2.f.getValue();
            bool.getClass();
            boolean zG2 = (i7 == 4) | l46Var.g(x16Var) | l46Var.i(gh6VarW0);
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == obj) {
                x16 x16Var3 = x16Var;
                Object qfdVar = new qfd(egdVar2, a26Var, x16Var3, gh6VarW0, null);
                x16Var = x16Var3;
                l46Var.p0(qfdVar);
                objR3 = qfdVar;
            }
            af1.o((l26) objR3, l46Var, bool);
            hgd hgdVarA = egdVar2.a();
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean z4 = (i7 == 4) | ((i4 & 112) == 32) | ((458752 & i4) == 131072);
            Object objR4 = l46Var.R();
            if (z4 || objR4 == obj) {
                objR4 = new rfd(egdVar2, i, z2, null);
                l46Var.p0(objR4);
            }
            af1.p(hgdVarA, boolValueOf, (l26) objR4, l46Var);
            hgd hgdVarA2 = egdVar2.a();
            boolean zG3 = (i7 == 4) | (i5 == 256) | (i6 == 2048) | l46Var.g(x16Var);
            Object objR5 = l46Var.R();
            if (zG3 || objR5 == obj) {
                jp1Var2 = jp1Var;
                sfdVar = new sfd(i2, jp1Var2, null, x16Var, a26Var, egdVar2);
                l46Var.p0(sfdVar);
            } else {
                sfdVar = objR5;
                jp1Var2 = jp1Var;
            }
            af1.p(hgdVarA2, jp1Var2, (l26) sfdVar, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k28(egdVar, i, jp1Var2, i2, z, z2, a26Var, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static final void d(final TarotCardChoice tarotCardChoice, final int i, final String str, final float f, final float f2, final boolean z, final boolean z2, final x16 x16Var, j09 j09Var, l46 l46Var, final int i2) {
        final j09 j09Var2;
        l46 l46Var2;
        j09 j09Var3;
        boolean z3;
        j09 j09VarC;
        l46 l46Var3;
        g09 g09Var;
        ?? r6;
        l46Var.h0(-184877316);
        int i3 = i2 | (l46Var.g(tarotCardChoice) ? 4 : 2) | (l46Var.e(i) ? 32 : 16) | (l46Var.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.d(f) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.d(f2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.h(z) ? 131072 : 65536) | (l46Var.h(z2) ? 1048576 : 524288) | (l46Var.i(x16Var) ? 8388608 : 4194304) | 100663296;
        if (l46Var.W(i3 & 1, (38347923 & i3) != 38347922)) {
            g09 g09Var2 = g09.a;
            j09 j09VarP = b.p(g09Var2, f);
            if (z2) {
                j09Var3 = j09VarP;
                z3 = false;
                j09VarC = androidx.compose.foundation.b.c(g09Var2, false, null, null, x16Var, 15);
            } else {
                j09Var3 = j09VarP;
                z3 = false;
                j09VarC = g09Var2;
            }
            j09 j09VarD = j09Var3.D(j09VarC);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD);
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
            if (z) {
                l46Var.f0(2107191553);
                g09Var = g09Var2;
                r6 = 1;
                o7c.d(oa7.E(dj6.w(b.p(g09Var2, f), f2), a7c.b(eze.a(l46Var).a.f)), q7c.r(tarotCardChoice), null, false, null, eze.a(l46Var).a.f, null, false, l46Var, 0, 220);
                l46Var3 = l46Var;
                l46Var3.r(z3);
            } else {
                l46Var3 = l46Var;
                g09Var = g09Var2;
                r6 = 1;
                l46Var3.f0(2107468972);
                n16.j(i, (i3 >> 3) & 14, l46Var3, dj6.w(b.p(g09Var, f), f2));
                l46Var3.r(z3);
            }
            o5c.f(l46Var3, b.d(g09Var, 8.0f));
            l46 l46Var4 = l46Var3;
            nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, mue.a((mue) l46Var3.k(nte.a), ((e8b) l46Var3.k(l8b.a)).q, w6c.l(12), ar5.x, null, w6c.i(0.006d), null, 3, w6c.l(12), null, null, 16613240), l46Var4, (i3 >> 6) & 14, 24960, 110590);
            l46 l46Var5 = l46Var4;
            if (z) {
                ib8.r(4.0f, 2108040023, l46Var5, l46Var5, g09Var);
                cgg.c(null, tarotCardChoice, l46Var5, (i3 << 3) & 112, r6);
                l46Var5.r(z3);
            } else {
                l46Var5.f0(2108125552);
                l46Var5.r(z3);
            }
            l46Var5.r(r6);
            j09Var2 = g09Var;
            l46Var2 = l46Var5;
        } else {
            l46 l46Var6 = l46Var;
            l46Var6.Z();
            j09Var2 = j09Var;
            l46Var2 = l46Var6;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(i, str, f, f2, z, z2, x16Var, j09Var2, i2) { // from class: rwd
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ x16 v;
                public final /* synthetic */ j09 w;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(1);
                    p8c.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0111  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
    public static final void e(int i, final fgd fgdVar, final s13 s13Var, final float f, final float f2, final boolean z, final int i2, final float f3, final fy9 fy9Var, l46 l46Var, final int i3) {
        final int i4;
        int i5;
        boolean z2;
        float f4;
        float f5;
        boolean z3;
        x6f x6fVarT;
        boolean z4;
        Object obj;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1280092389);
        if ((i3 & 6) == 0) {
            i4 = i;
            i5 = (l46Var2.e(i4) ? 4 : 2) | i3;
        } else {
            i4 = i;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= l46Var2.g(fgdVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= l46Var2.e(s13Var.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i5 |= l46Var2.d(f) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            i5 |= l46Var2.d(f2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i3) == 0) {
            i5 |= l46Var2.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i5 |= l46Var2.e(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i5 |= l46Var2.d(f3) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i5 |= (134217728 & i3) == 0 ? l46Var2.g(fy9Var) : l46Var2.i(fy9Var) ? 67108864 : 33554432;
        }
        int i6 = i5;
        if (l46Var2.W(i6 & 1, (i6 & 38347923) != 38347922)) {
            boolean z5 = l46Var2.k(dt1.a) != null;
            boolean z6 = i2 % 2 == 1;
            if (z6) {
                z2 = !z;
            } else {
                z2 = z;
            }
            int iOrdinal = s13Var.ordinal();
            if (iOrdinal == 0) {
                f4 = 0.0f;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        ap.c();
                        return;
                    }
                    f4 = 0.0f;
                } else if (z2) {
                    f4 = -f;
                } else {
                    f4 = f;
                }
            } else if (z2) {
                f4 = -f;
            } else {
                f4 = f;
            }
            float f6 = z2 ? f2 : -f2;
            float f7 = z ? f2 : -f2;
            float f8 = z6 ? f7 : 0.0f;
            float f9 = !z6 ? f7 : 0.0f;
            int iOrdinal2 = s13Var.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                f5 = f8;
            } else if (iOrdinal2 == 2) {
                f5 = f8 + f6;
            } else {
                if (iOrdinal2 != 3) {
                    ap.c();
                    return;
                }
                f5 = f9;
            }
            int iOrdinal3 = s13Var.ordinal();
            if (iOrdinal3 == 1) {
                z3 = false;
                x6fVarT = b21.T(200, 0, gs4.b, 2);
            } else if (iOrdinal3 == 2 || iOrdinal3 == 3) {
                z3 = false;
                x6fVarT = b21.T(200, 0, gs4.a, 2);
            } else {
                z3 = false;
                x6fVarT = b21.T(50, 0, null, 6);
            }
            x6f x6fVar = x6fVarT;
            h0e h0eVarB = vx.b(fgdVar.a + f4, x6fVar, "cut-x-offset", null, l46Var2, 3072, 20);
            h0e h0eVarB2 = vx.b(fgdVar.b + f5, x6fVar, "cut-y-offset", null, l46Var, 3072, 20);
            int iOrdinal4 = s13Var.ordinal();
            boolean z7 = iOrdinal4 == 2 || (iOrdinal4 == 3 ? f9 != 0.0f : f8 != 0.0f);
            float f10 = 1.0f;
            if ((!z7 || z) && ((z7 && z) || z7 || !z)) {
                f10 = 0.0f;
            }
            j09 j09VarQ = g09.a;
            j09 j09VarW = fdc.w(j09VarQ, f10);
            boolean zG = ((i6 & 29360128) == 8388608) | l46Var.g(h0eVarB) | l46Var.g(h0eVarB2);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                z4 = true;
                yi3 yi3Var = new yi3(f3, h0eVarB, h0eVarB2, true ? 1 : 0);
                l46Var.p0(yi3Var);
                obj = yi3Var;
            } else {
                z4 = true;
                obj = objR;
            }
            j09 j09VarX = bzd.x(j09VarW, (a26) obj);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarX);
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
            j09 j09VarP = b.p(j09VarQ, 72.0f);
            if (!z5) {
                j09VarQ = rrb.q(db6.w(j09VarQ, 1.0f, y72.b(y72.e, 0.3f), a7c.b(4.0f)), 1.0f, a7c.b(4.0f), 0L, 0L, 28);
            }
            dt1.a(j09VarP.D(j09VarQ), null, false, null, 4.0f, null, fy9Var, Integer.valueOf(i4), l46Var, ((i6 >> 6) & 3670016) | 2121728 | (29360128 & (i6 << 21)), 46);
            l46Var2 = l46Var;
            l46Var2.r(z4);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: kfd
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    p8c.e(i4, fgdVar, s13Var, f, f2, z, i2, f3, fy9Var, (l46) obj2, k99.P(i3 | 1));
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(final List list, final s13 s13Var, final int i, final float f, final float f2, final fy9 fy9Var, l46 l46Var, final int i2) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1967462566);
        int i3 = i2 | (l46Var2.g(list) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.e(s13Var.ordinal()) ? 32 : 16;
        }
        int i4 = i;
        float f3 = f2;
        int i5 = i3 | (l46Var2.e(i4) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.d(f) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.d(f3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int i6 = 196608;
        fy9 fy9Var2 = fy9Var;
        if ((i2 & 196608) == 0) {
            i5 |= l46Var2.i(fy9Var2) ? 131072 : 65536;
        }
        int i7 = 0;
        if (l46Var2.W(i5 & 1, (74899 & i5) != 74898)) {
            float fP0 = ((sw3) l46Var2.k(zg2.h)).p0(72.0f);
            int size = list.size() / 2;
            List listC1 = s72.c1(list, size);
            List listR0 = s72.r0(list, size);
            float f4 = f * size;
            l46Var2.f0(-945900202);
            int i8 = 0;
            for (Object obj : listC1) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    t72.Z();
                    throw null;
                }
                int i10 = i5 << 9;
                e(i8, (fgd) obj, s13Var, fP0, f4, false, i4, f3, fy9Var2, l46Var2, (i10 & 234881024) | ((i5 << 3) & 896) | i6 | ((i5 << 12) & 3670016) | (i10 & 29360128) | 134217728);
                i4 = i;
                f3 = f2;
                fy9Var2 = fy9Var;
                i7 = i7;
                i8 = i9;
                i6 = i6;
            }
            int i11 = i6;
            l46Var2.r(i7);
            l46 l46Var3 = l46Var2;
            for (Object obj2 : listR0) {
                int i12 = i7 + 1;
                if (i7 < 0) {
                    t72.Z();
                    throw null;
                }
                int i13 = i7 + size;
                int i14 = i5 << 9;
                e(i13, (fgd) obj2, s13Var, fP0, f4, true, i, f2, fy9Var, l46Var3, ((i5 << 3) & 896) | i11 | ((i5 << 12) & 3670016) | (i14 & 29360128) | 134217728 | (i14 & 234881024));
                l46Var3 = l46Var;
                i7 = i12;
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: jfd
                @Override // defpackage.l26
                public final Object z(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    p8c.f(list, s13Var, i, f, f2, fy9Var, (l46) obj3, k99.P(i2 | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void g(final fgd fgdVar, final boolean z, final int i, final int i2, final cle cleVar, final float f, final boolean z2, final fy9 fy9Var, l46 l46Var, final int i3) {
        int i4;
        boolean z3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-203196742);
        if ((i3 & 6) == 0) {
            i4 = (l46Var2.g(fgdVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var2.h(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= l46Var2.e(i) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i4 |= l46Var2.e(i2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            i4 |= (i3 & 32768) == 0 ? l46Var2.g(cleVar) : l46Var2.i(cleVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i3) == 0) {
            i4 |= l46Var2.d(f) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= l46Var2.h(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= (16777216 & i3) == 0 ? l46Var2.g(fy9Var) : l46Var2.i(fy9Var) ? 8388608 : 4194304;
        }
        if (l46Var2.W(i4 & 1, (4793491 & i4) != 4793490)) {
            vz vzVarT = z2 ? b21.T(500, 0, gs4.c, 2) : b21.P(0.0f, 200.0f, 5, null);
            h0e h0eVarB = vx.b(fgdVar.a, vzVarT, "x-offset", null, l46Var2, 3072, 20);
            h0e h0eVarB2 = vx.b(fgdVar.b, vzVarT, "y-offset", null, l46Var, 3072, 20);
            h0e h0eVarB3 = vx.b(fgdVar.c, vzVarT, "rotation", null, l46Var, 3072, 20);
            int i5 = i4 & 458752;
            boolean zG = l46Var.g(h0eVarB) | l46Var.g(h0eVarB2) | (i5 == 131072);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = new yi3(f, h0eVarB, h0eVarB2, 2);
                l46Var.p0(objR);
            }
            g09 g09Var = g09.a;
            j09 j09VarI = q6c.i(bzd.x(g09Var, (a26) objR), ((Number) h0eVarB3.getValue()).floatValue());
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarI);
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
                l46Var.f0(-167101703);
                Float fValueOf = cleVar != null ? Float.valueOf(cleVar.d) : null;
                j09 j09VarP = b.p(g09Var, 72.0f);
                boolean z4 = ((i4 & 57344) == 16384 || ((i4 & 32768) != 0 && l46Var.i(cleVar))) | (i5 == 131072) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048);
                Object objR2 = l46Var.R();
                if (z4 || objR2 == i8cVar) {
                    objR2 = new a26() { // from class: lfd
                        @Override // defpackage.a26
                        public final Object d(Object obj) {
                            g0c g0cVar = (g0c) obj;
                            g0cVar.getClass();
                            cle cleVar2 = cleVar;
                            float f2 = 0.0f;
                            float density = g0cVar.I0.getDensity() * (cleVar2 != null ? cleVar2.a : 0.0f);
                            float f3 = f;
                            g0cVar.E(density / f3);
                            g0cVar.G((g0cVar.I0.getDensity() * (cleVar2 != null ? cleVar2.b : 0.0f)) / f3);
                            if (i != i2 - 1 && cleVar2 != null) {
                                f2 = cleVar2.c;
                            }
                            g0cVar.p(f2);
                            return wef.a;
                        }
                    };
                    l46Var.p0(objR2);
                }
                l46Var2 = l46Var;
                z8c.b(i, i2, fy9Var, bzd.x(j09VarP, (a26) objR2), Integer.valueOf(i), 0.0f, false, fValueOf, l46Var2, ((i4 >> 6) & 126) | 512 | ((i4 >> 15) & 896) | (57344 & (i4 << 6)), 96);
                l46Var2.r(false);
                z3 = true;
            } else {
                l46Var2 = l46Var;
                l46Var2.f0(-166528792);
                z3 = true;
                dt1.a(db6.w(b.p(g09Var, 72.0f), 1.0f, y72.b(y72.e, 0.3f), a7c.b(4.0f)), null, false, null, 4.0f, null, fy9Var, Integer.valueOf(i), l46Var2, ((i4 >> 3) & 3670016) | 2121728 | (29360128 & (i4 << 15)), 46);
                l46Var2.r(false);
            }
            l46Var2.r(z3);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: mfd
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    p8c.g(fgdVar, z, i, i2, cleVar, f, z2, fy9Var, (l46) obj, k99.P(i3 | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void h(int i, l46 l46Var, j09 j09Var, String str) {
        l46 l46Var2 = l46Var;
        String str2 = str;
        str2.getClass();
        l46Var2.h0(1171960051);
        int i2 = i | (l46Var2.g(str2) ? 4 : 2);
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            j09 j09VarF = urg.F(j09Var, ia7.b);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarF);
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
            j09 j09VarD = b.p(ynb.d0(0.0f, 0.0f, 16.0f, 0.0f, 11, g09.a), 4.0f).D(b.b);
            pr4 pr4Var = l8b.a;
            s21.a(tm7.o(j09VarD, ((e8b) l46Var2.k(pr4Var)).A, g21.f), l46Var2, 0);
            mue mueVar = pue.a;
            nte.b(str, null, ((e8b) l46Var2.k(pr4Var)).t, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.n(l46Var2), l46Var2, i2 & 14, 0, 131066);
            str2 = str;
            l46Var2 = l46Var2;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p8(str2, j09Var, i, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0146  */
    /* JADX WARN: Code duplicated, block: B:102:0x0149  */
    /* JADX WARN: Code duplicated, block: B:106:0x0155  */
    /* JADX WARN: Code duplicated, block: B:107:0x0158  */
    /* JADX WARN: Code duplicated, block: B:109:0x0162  */
    /* JADX WARN: Code duplicated, block: B:110:0x0165  */
    /* JADX WARN: Code duplicated, block: B:114:0x0171  */
    /* JADX WARN: Code duplicated, block: B:115:0x0174  */
    /* JADX WARN: Code duplicated, block: B:117:0x017a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0182  */
    /* JADX WARN: Code duplicated, block: B:121:0x0189  */
    /* JADX WARN: Code duplicated, block: B:124:0x0199  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:148:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:149:0x0203  */
    /* JADX WARN: Code duplicated, block: B:151:0x0206  */
    /* JADX WARN: Code duplicated, block: B:154:0x020b  */
    /* JADX WARN: Code duplicated, block: B:156:0x021a  */
    /* JADX WARN: Code duplicated, block: B:158:0x021d  */
    /* JADX WARN: Code duplicated, block: B:159:0x021f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0224  */
    /* JADX WARN: Code duplicated, block: B:163:0x0226  */
    /* JADX WARN: Code duplicated, block: B:165:0x022a  */
    /* JADX WARN: Code duplicated, block: B:167:0x022d  */
    /* JADX WARN: Code duplicated, block: B:168:0x023b  */
    /* JADX WARN: Code duplicated, block: B:170:0x023f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0245  */
    /* JADX WARN: Code duplicated, block: B:174:0x0252  */
    /* JADX WARN: Code duplicated, block: B:176:0x0256  */
    /* JADX WARN: Code duplicated, block: B:178:0x025c  */
    /* JADX WARN: Code duplicated, block: B:180:0x026a  */
    /* JADX WARN: Code duplicated, block: B:182:0x026e  */
    /* JADX WARN: Code duplicated, block: B:184:0x0274  */
    /* JADX WARN: Code duplicated, block: B:185:0x0281  */
    /* JADX WARN: Code duplicated, block: B:187:0x0287  */
    /* JADX WARN: Code duplicated, block: B:189:0x028d  */
    /* JADX WARN: Code duplicated, block: B:190:0x028f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0295  */
    /* JADX WARN: Code duplicated, block: B:195:0x029b  */
    /* JADX WARN: Code duplicated, block: B:196:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:199:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:202:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:204:0x02eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:207:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:210:0x030b  */
    /* JADX WARN: Code duplicated, block: B:212:0x031b  */
    /* JADX WARN: Code duplicated, block: B:217:0x0336  */
    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX WARN: Code duplicated, block: B:221:0x0346 A[LOOP:2: B:219:0x0340->B:221:0x0346, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:225:0x038e  */
    /* JADX WARN: Code duplicated, block: B:227:0x0398  */
    /* JADX WARN: Code duplicated, block: B:229:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:230:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:232:0x03da  */
    /* JADX WARN: Code duplicated, block: B:234:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:235:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:237:0x0403  */
    /* JADX WARN: Code duplicated, block: B:239:0x040c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:241:0x042d  */
    /* JADX WARN: Code duplicated, block: B:242:0x043c  */
    /* JADX WARN: Code duplicated, block: B:245:0x0456  */
    /* JADX WARN: Code duplicated, block: B:248:0x0465  */
    /* JADX WARN: Code duplicated, block: B:251:0x0480  */
    /* JADX WARN: Code duplicated, block: B:255:0x048a  */
    /* JADX WARN: Code duplicated, block: B:257:0x0490 A[PHI: r17
  0x0490: PHI (r17v13 gw8) = (r17v11 gw8), (r17v15 gw8) binds: [B:256:0x048e, B:254:0x0487] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:258:0x0492  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:261:0x049f  */
    /* JADX WARN: Code duplicated, block: B:265:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:267:0x04af A[PHI: r54
  0x04af: PHI (r54v5 boolean) = (r54v1 boolean), (r54v6 boolean) binds: [B:266:0x04ad, B:264:0x04a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:268:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:271:0x04ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:274:0x04c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:275:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:277:0x04da A[LOOP:0: B:276:0x04d8->B:277:0x04da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:281:0x0540  */
    /* JADX WARN: Code duplicated, block: B:283:0x0546  */
    /* JADX WARN: Code duplicated, block: B:289:0x0552  */
    /* JADX WARN: Code duplicated, block: B:291:0x0558  */
    /* JADX WARN: Code duplicated, block: B:297:0x0566 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:298:0x0568  */
    /* JADX WARN: Code duplicated, block: B:301:0x057e  */
    /* JADX WARN: Code duplicated, block: B:303:0x0581  */
    /* JADX WARN: Code duplicated, block: B:306:0x058f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:307:0x0591  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:310:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:313:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:316:0x05d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:319:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:322:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:324:0x0608 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:327:0x060d  */
    /* JADX WARN: Code duplicated, block: B:329:0x0623  */
    /* JADX WARN: Code duplicated, block: B:332:0x063a  */
    /* JADX WARN: Code duplicated, block: B:335:0x0649  */
    /* JADX WARN: Code duplicated, block: B:338:0x0651  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:341:0x0686  */
    /* JADX WARN: Code duplicated, block: B:345:0x0690  */
    /* JADX WARN: Code duplicated, block: B:347:0x0696 A[PHI: r51
  0x0696: PHI (r51v6 egd) = (r51v3 egd), (r51v7 egd) binds: [B:346:0x0694, B:344:0x068d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:349:0x069a  */
    /* JADX WARN: Code duplicated, block: B:352:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:353:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:356:0x06e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:359:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:362:0x0720  */
    /* JADX WARN: Code duplicated, block: B:363:0x0722  */
    /* JADX WARN: Code duplicated, block: B:366:0x072c  */
    /* JADX WARN: Code duplicated, block: B:368:0x0732  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:374:0x074d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:377:0x0753  */
    /* JADX WARN: Code duplicated, block: B:379:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:381:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:384:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:389:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da  */
    /* JADX WARN: Code duplicated, block: B:71:0x00de  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:81:0x0100  */
    /* JADX WARN: Code duplicated, block: B:83:0x010a  */
    /* JADX WARN: Code duplicated, block: B:84:0x010d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0112  */
    /* JADX WARN: Code duplicated, block: B:89:0x011c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0123  */
    /* JADX WARN: Code duplicated, block: B:93:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0130  */
    /* JADX WARN: Code duplicated, block: B:98:0x0139  */
    /* JADX WARN: Code duplicated, block: B:99:0x013c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    public static final void i(final j09 j09Var, xw9 xw9Var, egd egdVar, int i, int i2, boolean z, boolean z2, fy9 fy9Var, boolean z3, l26 l26Var, x16 x16Var, x16 x16Var2, x16 x16Var3, boolean z4, x16 x16Var4, l46 l46Var, final int i3, final int i4, final int i5) {
        xw9 xw9Var2;
        int i6;
        egd egdVar2;
        int i7;
        int i8;
        int i9;
        final int i10;
        int i11;
        int i12;
        int i13;
        int iC;
        int i14;
        int i15;
        int i16;
        final boolean z5;
        int i17;
        int i18;
        int i19;
        boolean zI;
        int i20;
        int i21;
        int i22;
        boolean z6;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        boolean z7;
        final x16 x16Var5;
        final x16 x16Var6;
        final x16 x16Var7;
        final int i42;
        final boolean z8;
        final xw9 xw9Var3;
        final egd egdVar3;
        final int i43;
        final boolean z9;
        final fy9 fy9Var2;
        final l26 l26Var2;
        final boolean z10;
        final x16 x16Var8;
        ojb ojbVarV;
        int i44;
        Object obj;
        xw9 xw9VarQ;
        egd egdVarU;
        boolean z11;
        int i45;
        fy9 fy9Var3;
        l26 l26VarB0;
        x16 x16Var9;
        x16 x16Var10;
        x16 x16Var11;
        boolean z12;
        final x16 x16Var12;
        final boolean z13;
        final boolean z14;
        final fy9 fy9Var4;
        final l26 l26Var3;
        final x16 x16Var13;
        final x16 x16Var14;
        egd egdVar4;
        int i46;
        final boolean z15;
        final x16 x16Var15;
        Object objR;
        Object objR2;
        Object objR3;
        Object objR4;
        final xw9 xw9Var4;
        MixedDeckSnapshot mixedDeckSnapshot;
        egd egdVar5;
        final int i47;
        ?? r3;
        gw8 gw8Var;
        final fy9 fy9Var5;
        Object objR5;
        aw2 aw2Var;
        Object objR6;
        final e89 e89Var;
        int i48;
        int i49;
        gw8 gw8Var2;
        boolean z16;
        int i50;
        boolean z17;
        boolean z18;
        boolean z19;
        ycg ycgVar;
        ArrayList arrayList;
        int i51;
        aw2 aw2Var2;
        x16 x16Var16;
        x16 x16Var17;
        x16 x16Var18;
        Object obj2;
        boolean z20;
        Object objR7;
        jie jieVar;
        gh6 gh6VarW0;
        boolean z21;
        int i52;
        boolean zH;
        Object objR8;
        e89 e89Var2;
        Object objR9;
        e89 e89Var3;
        Object objR10;
        aw2 aw2Var3;
        boolean zH2;
        Object objR11;
        int i53;
        boolean z22;
        final boolean z23;
        Object objR12;
        jx jxVar;
        e89 e89VarI;
        e89 e89VarI2;
        e89 e89VarI3;
        e89 e89VarI4;
        boolean z24;
        aw2 aw2Var4;
        boolean z25;
        boolean z26;
        boolean zH3;
        Object objR13;
        final boolean z27;
        final jie jieVar2;
        e89 e89Var4;
        boolean z28;
        boolean zI2;
        Object objR14;
        final jx jxVar2;
        boolean zI3;
        Object objR15;
        fy9 fy9VarE;
        ojb ojbVarV2;
        final egd egdVar6;
        boolean zG;
        Object objR16;
        ArrayList arrayList2;
        Iterator<T> it;
        LinkedHashMap linkedHashMap;
        Iterator it2;
        boolean z29;
        TarotSkinIdentify tarotSkinIdentifySkinFor;
        LinkedHashMap linkedHashMapF;
        ojb ojbVarV3;
        l46Var.h0(1364973937);
        int i54 = i5 & 2;
        if (i54 != 0) {
            i6 = i3 | 48;
            xw9Var2 = xw9Var;
        } else {
            xw9Var2 = xw9Var;
            i6 = (l46Var.g(xw9Var2) ? 32 : 16) | i3;
        }
        if ((i5 & 4) == 0) {
            egdVar2 = egdVar;
            if (l46Var.g(egdVar2)) {
                i7 = 256;
            }
            i8 = i6 | i7;
            i9 = i5 & 8;
            if (i9 != 0) {
                if ((i3 & 3072) == 0) {
                    i10 = i;
                    if (l46Var.e(i10)) {
                        i11 = 2048;
                    } else {
                        i11 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i8 |= i11;
                }
                i12 = i5 & 16;
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                iC = i2;
                if (i12 == 0 || !l46Var.e(iC)) {
                    i14 = 8192;
                } else {
                    i14 = 16384;
                }
                i15 = i8 | i14;
                i16 = i5 & 32;
                if (i16 != 0) {
                    i15 |= 196608;
                    z5 = z;
                } else {
                    z5 = z;
                    if ((i3 & 196608) == 0) {
                        if (l46Var.h(z5)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i15 |= i17;
                    }
                }
                i18 = i15 | 524288;
                i19 = i5 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i19 != 0) {
                    i21 = i15 | 13107200;
                } else {
                    if ((16777216 & i3) == 0) {
                        zI = l46Var.g(fy9Var);
                    } else {
                        zI = l46Var.i(fy9Var);
                    }
                    if (zI) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i21 = i18 | i20;
                }
                i22 = i5 & 256;
                if (i22 != 0) {
                    i21 |= 100663296;
                    z6 = z3;
                } else {
                    z6 = z3;
                    if ((i3 & 100663296) == 0) {
                        if (l46Var.h(z6)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i21 |= i23;
                    }
                }
                i24 = i5 & 512;
                if (i24 != 0) {
                    if ((i3 & 805306368) == 0) {
                        if (l46Var.i(l26Var)) {
                            i25 = 536870912;
                        } else {
                            i25 = 268435456;
                        }
                        i21 |= i25;
                    }
                    i26 = i5 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                    if (i26 != 0) {
                        i27 = i4 | 6;
                    } else if ((i4 & 6) == 0) {
                        if (l46Var.i(x16Var)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i4 | i28;
                    } else {
                        i27 = i4;
                    }
                    i29 = i5 & 2048;
                    if (i29 != 0) {
                        i31 = i27 | 48;
                    } else {
                        if (l46Var.i(x16Var2)) {
                            i30 = 32;
                        } else {
                            i30 = 16;
                        }
                        i31 = i27 | i30;
                    }
                    i32 = i31;
                    i33 = i5 & 4096;
                    if (i33 != 0) {
                        i35 = i32 | 384;
                    } else {
                        if (l46Var.i(x16Var3)) {
                            i34 = 256;
                        } else {
                            i34 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        i35 = i32 | i34;
                    }
                    i36 = i5 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    if (i36 != 0) {
                        i38 = i35 | 3072;
                    } else {
                        int i55 = i35;
                        if (l46Var.h(z4)) {
                            i37 = 2048;
                        } else {
                            i37 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                        }
                        i38 = i55 | i37;
                    }
                    i39 = i5 & 16384;
                    if (i39 != 0) {
                        i41 = i38 | 24576;
                    } else {
                        i40 = i38;
                        if ((i4 & 24576) == 0) {
                            if (l46Var.i(x16Var4)) {
                                i13 = 16384;
                            }
                            i41 = i40 | i13;
                        } else {
                            i41 = i40;
                        }
                    }
                    if ((i21 & 306783379) == 306783378 || (i41 & 9363) != 9362) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (l46Var.W(i21 & 1, z7)) {
                        l46Var.b0();
                        i44 = i3 & 1;
                        obj = sf2.a;
                        if (i44 != 0 || l46Var.C()) {
                            if (i54 != 0) {
                                xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                            } else {
                                xw9VarQ = xw9Var2;
                            }
                            if ((i5 & 4) != 0) {
                                egdVarU = u(l46Var);
                                i21 &= -897;
                            } else {
                                egdVarU = egdVar2;
                            }
                            if (i9 != 0) {
                                i10 = 0;
                            }
                            if ((i5 & 16) != 0) {
                                i21 &= -57345;
                                iC = ((d1) TarotCardType.getEntries()).c();
                            }
                            if (i16 != 0) {
                                z5 = true;
                            }
                            if (i10 == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            i45 = i21 & (-3670017);
                            if (i19 != 0) {
                                fy9Var3 = null;
                            } else {
                                fy9Var3 = fy9Var;
                            }
                            if (i22 != 0) {
                                z6 = false;
                            }
                            if (i24 != 0) {
                                l26VarB0 = af1.b0(876435724, new z8d(1, egdVarU), l46Var);
                            } else {
                                l26VarB0 = l26Var;
                            }
                            if (i26 != 0) {
                                objR4 = l46Var.R();
                                if (objR4 == obj) {
                                    objR4 = new ead(14);
                                    l46Var.p0(objR4);
                                }
                                x16Var9 = (x16) objR4;
                            } else {
                                x16Var9 = x16Var;
                            }
                            if (i29 != 0) {
                                objR3 = l46Var.R();
                                if (objR3 == obj) {
                                    objR3 = new ead(15);
                                    l46Var.p0(objR3);
                                }
                                x16Var10 = (x16) objR3;
                            } else {
                                x16Var10 = x16Var2;
                            }
                            if (i33 != 0) {
                                objR2 = l46Var.R();
                                if (objR2 == obj) {
                                    objR2 = new ead(16);
                                    l46Var.p0(objR2);
                                }
                                x16Var11 = (x16) objR2;
                            } else {
                                i41 = i41;
                                x16Var11 = x16Var3;
                            }
                            if (i36 != 0) {
                                z12 = true;
                            } else {
                                z12 = z4;
                            }
                            x16 x16Var19 = x16Var11;
                            if (i39 != 0) {
                                objR = l46Var.R();
                                if (objR == obj) {
                                    objR = new ead(17);
                                    l46Var.p0(objR);
                                }
                                xw9VarQ = xw9VarQ;
                                x16Var12 = (x16) objR;
                            } else {
                                x16Var12 = x16Var4;
                            }
                            z13 = z6;
                            z14 = z11;
                            fy9Var4 = fy9Var3;
                            l26Var3 = l26VarB0;
                            x16Var13 = x16Var9;
                            x16Var14 = x16Var10;
                            egdVar4 = egdVarU;
                            i46 = iC;
                            z15 = z12;
                            x16Var15 = x16Var19;
                        } else {
                            l46Var.Z();
                            if ((i5 & 4) != 0) {
                                i21 &= -897;
                            }
                            if ((i5 & 16) != 0) {
                                i21 &= -57345;
                            }
                            x16Var13 = x16Var;
                            x16Var14 = x16Var2;
                            x16Var15 = x16Var3;
                            i41 = i41;
                            i45 = i21 & (-3670017);
                            i10 = i10;
                            z13 = z6;
                            xw9VarQ = xw9Var2;
                            egdVar4 = egdVar2;
                            i46 = iC;
                            z5 = z5;
                            z14 = z2;
                            fy9Var4 = fy9Var;
                            l26Var3 = l26Var;
                            z15 = z4;
                            x16Var12 = x16Var4;
                        }
                        l46Var.s();
                        xw9Var4 = xw9VarQ;
                        mixedDeckSnapshot = (MixedDeckSnapshot) l46Var.k(snd.b);
                        if (mixedDeckSnapshot != null) {
                            egdVar6 = egdVar4;
                            l46Var.f0(-810781893);
                            zG = l46Var.g(mixedDeckSnapshot);
                            objR16 = l46Var.R();
                            if (!zG || objR16 == obj) {
                                List<String> cardOrder = mixedDeckSnapshot.getCardOrder();
                                arrayList2 = new ArrayList();
                                it = cardOrder.iterator();
                                while (it.hasNext()) {
                                    int i56 = i46;
                                    tarotSkinIdentifySkinFor = mixedDeckSnapshot.skinFor((String) it.next());
                                    if (tarotSkinIdentifySkinFor != null) {
                                        arrayList2.add(tarotSkinIdentifySkinFor);
                                    }
                                    i46 = i56;
                                }
                                i47 = i46;
                                pr4 pr4Var = dt1.a;
                                int iF = bm8.F(t72.u(arrayList2, 10));
                                linkedHashMap = new LinkedHashMap(iF >= 16 ? iF : 16);
                                it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) it2.next();
                                    boolean z30 = z5;
                                    iy9 iy9Var = new iy9(Integer.valueOf(hfc.q(tarotSkinIdentify).c()), Float.valueOf(Math.min(tarotSkinIdentify.getAspectRatio(), 0.5714286f)));
                                    linkedHashMap.put(iy9Var.d(), iy9Var.e());
                                    it2 = it2;
                                    z5 = z30;
                                }
                                z29 = z5;
                                l46Var.p0(linkedHashMap);
                                objR16 = linkedHashMap;
                            } else {
                                i47 = i46;
                                z29 = z5;
                            }
                            linkedHashMapF = dt1.f((Map) objR16, l46Var);
                            if (linkedHashMapF == null) {
                                l46Var.r(false);
                                ojbVarV3 = l46Var.v();
                                if (ojbVarV3 != null) {
                                    final int i57 = 0;
                                    final boolean z31 = z29;
                                    final int i58 = i10;
                                    final int i59 = i47;
                                    ojbVarV3.d = new l26() { // from class: nfd
                                        @Override // defpackage.l26
                                        public final Object z(Object obj3, Object obj4) {
                                            int i60 = i57;
                                            wef wefVar = wef.a;
                                            int i61 = i4;
                                            int i62 = i3;
                                            switch (i60) {
                                                case 0:
                                                    ((Integer) obj4).getClass();
                                                    int iP = k99.P(i62 | 1);
                                                    int iP2 = k99.P(i61);
                                                    p8c.i(j09Var, xw9Var4, egdVar6, i58, i59, z31, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP, iP2, i5);
                                                    break;
                                                case 1:
                                                    ((Integer) obj4).getClass();
                                                    int iP3 = k99.P(i62 | 1);
                                                    int iP4 = k99.P(i61);
                                                    p8c.i(j09Var, xw9Var4, egdVar6, i58, i59, z31, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP3, iP4, i5);
                                                    break;
                                                default:
                                                    ((Integer) obj4).getClass();
                                                    int iP5 = k99.P(i62 | 1);
                                                    int iP6 = k99.P(i61);
                                                    p8c.i(j09Var, xw9Var4, egdVar6, i58, i59, z31, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP5, iP6, i5);
                                                    break;
                                            }
                                            return wefVar;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                            egdVar5 = egdVar6;
                            z5 = z29;
                            r3 = 0;
                            gw8Var = new gw8(linkedHashMapF);
                            l46Var.r(false);
                        } else {
                            mixedDeckSnapshot = mixedDeckSnapshot;
                            egdVar5 = egdVar4;
                            i47 = i46;
                            r3 = 0;
                            l46Var.f0(-810539412);
                            l46Var.r(false);
                            gw8Var = null;
                        }
                        if (mixedDeckSnapshot == null) {
                            l46Var.f0(-810470808);
                            if (fy9Var4 == null) {
                                l46Var.f0(1774971708);
                                fy9VarE = dt1.e(null, l46Var, r3, 6);
                                l46Var.r(r3);
                            } else {
                                l46Var.f0(1774971088);
                                l46Var.r(r3);
                                fy9VarE = fy9Var4;
                            }
                            if (fy9VarE == null) {
                                l46Var.r(r3);
                                ojbVarV2 = l46Var.v();
                                if (ojbVarV2 != null) {
                                    final int i60 = 1;
                                    final boolean z32 = z5;
                                    final int i61 = i10;
                                    final egd egdVar7 = egdVar5;
                                    final int i62 = i47;
                                    ojbVarV2.d = new l26() { // from class: nfd
                                        @Override // defpackage.l26
                                        public final Object z(Object obj3, Object obj4) {
                                            int i63 = i60;
                                            wef wefVar = wef.a;
                                            int i64 = i4;
                                            int i65 = i3;
                                            switch (i63) {
                                                case 0:
                                                    ((Integer) obj4).getClass();
                                                    int iP = k99.P(i65 | 1);
                                                    int iP2 = k99.P(i64);
                                                    p8c.i(j09Var, xw9Var4, egdVar7, i61, i62, z32, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP, iP2, i5);
                                                    break;
                                                case 1:
                                                    ((Integer) obj4).getClass();
                                                    int iP3 = k99.P(i65 | 1);
                                                    int iP4 = k99.P(i64);
                                                    p8c.i(j09Var, xw9Var4, egdVar7, i61, i62, z32, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP3, iP4, i5);
                                                    break;
                                                default:
                                                    ((Integer) obj4).getClass();
                                                    int iP5 = k99.P(i65 | 1);
                                                    int iP6 = k99.P(i64);
                                                    p8c.i(j09Var, xw9Var4, egdVar7, i61, i62, z32, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP5, iP6, i5);
                                                    break;
                                            }
                                            return wefVar;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                            l46Var.r(r3);
                            fy9Var5 = fy9VarE;
                        } else {
                            z5 = z5;
                            l46Var.f0(-810390612);
                            l46Var.r(r3);
                            fy9Var5 = null;
                        }
                        objR5 = l46Var.R();
                        if (objR5 == obj) {
                            objR5 = af1.E(l46Var);
                            l46Var.p0(objR5);
                        }
                        aw2Var = (aw2) objR5;
                        objR6 = l46Var.R();
                        if (objR6 == obj) {
                            objR6 = q1c.f(s13.a);
                            l46Var.p0(objR6);
                        }
                        e89Var = (e89) objR6;
                        i48 = egdVar5.a;
                        fy9 fy9Var6 = fy9Var4;
                        i49 = (i45 & 896) ^ 384;
                        final boolean z33 = z13;
                        if (i49 > 256 || !l46Var.g(egdVar5)) {
                            gw8Var2 = gw8Var;
                            if ((i45 & 384) != 256) {
                                z16 = false;
                            }
                            i50 = (57344 & i45) ^ 24576;
                            boolean z34 = z16;
                            if (i50 > 16384 || !l46Var.e(i47)) {
                                z17 = z14;
                                if ((i45 & 24576) != 16384) {
                                    z18 = false;
                                }
                                z19 = z34 | z18;
                                Object objR17 = l46Var.R();
                                if (z19 && objR17 != obj) {
                                    aw2Var2 = aw2Var;
                                    x16Var16 = x16Var14;
                                    x16Var17 = x16Var15;
                                    x16Var18 = x16Var12;
                                    obj2 = objR17;
                                } else {
                                    if (i47 < 0) {
                                        qc0.j("Failed requirement.");
                                        return;
                                    }
                                    ycgVar = new ycg(i48, i48 >> 31);
                                    arrayList = new ArrayList(i47);
                                    i51 = 0;
                                    while (i51 < i47) {
                                        arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                                        i51++;
                                        aw2Var = aw2Var;
                                        x16Var14 = x16Var14;
                                        x16Var12 = x16Var12;
                                        x16Var15 = x16Var15;
                                    }
                                    aw2Var2 = aw2Var;
                                    x16Var16 = x16Var14;
                                    x16Var17 = x16Var15;
                                    x16Var18 = x16Var12;
                                    l46Var.p0(arrayList);
                                    obj2 = arrayList;
                                }
                                final List list = (List) obj2;
                                z20 = ((i50 <= 16384 && l46Var.e(i47)) || (i45 & 24576) == 16384) | ((i49 <= 256 && l46Var.g(egdVar5)) || (i45 & 384) == 256);
                                objR7 = l46Var.R();
                                if (z20 || objR7 == obj) {
                                    objR7 = new jie(i47, i48);
                                    l46Var.p0(objR7);
                                }
                                jieVar = (jie) objR7;
                                gh6VarW0 = kj0.w0(l46Var);
                                if (egdVar5.a() == hgd.e) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                i52 = i41 >> 6;
                                zH = l46Var.h(z21);
                                objR8 = l46Var.R();
                                if (zH || objR8 == obj) {
                                    objR8 = q1c.f(Boolean.valueOf(!z21));
                                    l46Var.p0(objR8);
                                }
                                e89Var2 = (e89) objR8;
                                objR9 = l46Var.R();
                                if (objR9 == obj) {
                                    objR9 = q1c.f(Boolean.FALSE);
                                    l46Var.p0(objR9);
                                }
                                e89Var3 = (e89) objR9;
                                objR10 = l46Var.R();
                                if (objR10 == obj) {
                                    objR10 = af1.E(l46Var);
                                    l46Var.p0(objR10);
                                }
                                aw2Var3 = (aw2) objR10;
                                Boolean boolValueOf = Boolean.valueOf(z21);
                                zH2 = l46Var.h(z21) | l46Var.g(e89Var2);
                                objR11 = l46Var.R();
                                if (zH2 || objR11 == obj) {
                                    objR11 = new vm4(z21, e89Var3, e89Var2, null);
                                    l46Var.p0(objR11);
                                }
                                af1.o((l26) objR11, l46Var, boolValueOf);
                                if (((Boolean) e89Var3.getValue()).booleanValue()) {
                                    l46Var.f0(1968840980);
                                    zI3 = l46Var.i(aw2Var3);
                                    objR15 = l46Var.R();
                                    if (!zI3 || objR15 == obj) {
                                        i53 = 1;
                                        objR15 = new om4(aw2Var3, e89Var3, i53);
                                        l46Var.p0(objR15);
                                    } else {
                                        i53 = 1;
                                    }
                                    vd0.i(i52 & 112, (a26) objR15, l46Var, null, z15);
                                    z22 = false;
                                    l46Var.r(false);
                                } else {
                                    i53 = 1;
                                    z22 = false;
                                    l46Var.f0(1969148500);
                                    l46Var.r(false);
                                }
                                if (((Boolean) e89Var2.getValue()).booleanValue() || ((Boolean) e89Var3.getValue()).booleanValue()) {
                                    z23 = z22;
                                } else {
                                    z23 = i53;
                                }
                                objR12 = l46Var.R();
                                if (objR12 == obj) {
                                    objR12 = qk2.d(0.0f);
                                    l46Var.p0(objR12);
                                }
                                jxVar = (jx) objR12;
                                e89VarI = q1c.i(x16Var13, l46Var);
                                x16Var8 = x16Var18;
                                e89VarI2 = q1c.i(x16Var8, l46Var);
                                x16 x16Var20 = x16Var16;
                                e89VarI3 = q1c.i(x16Var20, l46Var);
                                boolean z35 = z15;
                                e89VarI4 = q1c.i(x16Var17, l46Var);
                                x16 x16Var21 = x16Var13;
                                Object[] objArr = {egdVar5, Boolean.valueOf(z5), Boolean.valueOf(z17), jieVar, gh6VarW0};
                                if (i49 > 256 || !l46Var.g(egdVar5)) {
                                    egdVar3 = egdVar5;
                                    if ((i45 & 384) != 256) {
                                        z24 = false;
                                    }
                                    aw2Var4 = aw2Var2;
                                    boolean zI4 = z24 | l46Var.i(aw2Var4);
                                    if ((i45 & 458752) == 131072) {
                                        z25 = true;
                                    } else {
                                        z25 = false;
                                    }
                                    boolean z36 = zI4 | z25;
                                    z26 = z17;
                                    zH3 = z36 | l46Var.h(z26) | l46Var.g(jieVar) | l46Var.i(gh6VarW0) | l46Var.g(e89VarI3) | l46Var.g(e89VarI4) | l46Var.g(e89VarI2);
                                    objR13 = l46Var.R();
                                    if (!zH3 || objR13 == obj) {
                                        objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                                        z27 = z26;
                                        jieVar2 = jieVar;
                                        e89Var4 = e89VarI2;
                                        l46Var.p0(objR13);
                                    } else {
                                        jieVar2 = jieVar;
                                        z27 = z26;
                                        e89Var4 = e89VarI2;
                                    }
                                    af1.r(objArr, (l26) objR13, l46Var);
                                    Integer numValueOf = Integer.valueOf(i10);
                                    if ((i45 & 7168) == 2048) {
                                        z28 = true;
                                    } else {
                                        z28 = false;
                                    }
                                    zI2 = l46Var.i(jxVar) | z28 | ((i49 <= 256 && l46Var.g(egdVar3)) || (i45 & 384) == 256) | l46Var.g(e89VarI) | l46Var.g(e89Var4);
                                    objR14 = l46Var.R();
                                    if (!zI2 || objR14 == obj) {
                                        objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                                        jxVar2 = jxVar;
                                        l46Var.p0(objR14);
                                    } else {
                                        jxVar2 = jxVar;
                                    }
                                    af1.p(egdVar3, numValueOf, (l26) objR14, l46Var);
                                    e1b e1bVarA = dt1.a.a(gw8Var2);
                                    final egd egdVar8 = egdVar3;
                                    l26 l26Var4 = new l26() { // from class: ofd
                                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                         */
                                        @Override // defpackage.l26
                                        public final Object z(Object obj3, Object obj4) {
                                            l46 l46Var2 = (l46) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                FillElement fillElement = b.c;
                                                j09 j09VarD = j09Var.D(fillElement);
                                                xn8 xn8VarC = s21.c(ndb.b, false);
                                                int iHashCode = Long.hashCode(l46Var2.T);
                                                u8a u8aVarM = l46Var2.m();
                                                j09 j09VarJ = m93.J(l46Var2, j09VarD);
                                                lf2.q.getClass();
                                                l46Var2.j0();
                                                boolean z37 = l46Var2.S;
                                                ov7 ov7Var = LayoutNode.h1;
                                                if (z37) {
                                                    l46Var2.l(ov7Var);
                                                } else {
                                                    l46Var2.s0();
                                                }
                                                he2 he2Var = hj6.z;
                                                dec.l(he2Var, l46Var2, xn8VarC);
                                                he2 he2Var2 = hj6.y;
                                                dec.l(he2Var2, l46Var2, u8aVarM);
                                                Integer numValueOf2 = Integer.valueOf(iHashCode);
                                                he2 he2Var3 = hj6.X;
                                                dec.l(he2Var3, l46Var2, numValueOf2);
                                                dec.k(l46Var2);
                                                he2 he2Var4 = hj6.x;
                                                dec.l(he2Var4, l46Var2, j09VarJ);
                                                j09 j09VarY = ynb.Y(fillElement, xw9Var4);
                                                c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                                                int iHashCode2 = Long.hashCode(l46Var2.T);
                                                u8a u8aVarM2 = l46Var2.m();
                                                j09 j09VarJ2 = m93.J(l46Var2, j09VarY);
                                                l46Var2.j0();
                                                if (l46Var2.S) {
                                                    l46Var2.l(ov7Var);
                                                } else {
                                                    l46Var2.s0();
                                                }
                                                dec.l(he2Var, l46Var2, c92VarA);
                                                dec.l(he2Var2, l46Var2, u8aVarM2);
                                                ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                                                dec.l(he2Var4, l46Var2, j09VarJ2);
                                                int i63 = i10;
                                                if (i63 == 0) {
                                                    ib8.r(24.0f, 91962542, l46Var2, l46Var2, g09.a);
                                                    l26Var3.z(l46Var2, 0);
                                                    l46Var2.r(false);
                                                } else {
                                                    l46Var2.f0(92030773);
                                                    l46Var2.r(false);
                                                }
                                                s13 s13Var = (s13) e89Var.getValue();
                                                boolean z38 = z27;
                                                boolean z39 = !z38 || z23;
                                                float fFloatValue = ((Number) jxVar2.e()).floatValue();
                                                egd egdVar9 = egdVar8;
                                                boolean zG2 = l46Var2.g(egdVar9);
                                                Object objR18 = l46Var2.R();
                                                if (zG2 || objR18 == sf2.a) {
                                                    objR18 = new ffd(egdVar9, 0);
                                                    l46Var2.p0(objR18);
                                                }
                                                p8c.a(egdVar9, i63, s13Var, i47, z33, z38, list, jieVar2, z39, fFloatValue, fy9Var5, (x16) objR18, l46Var2, 6);
                                                l46Var2.r(true);
                                                l46Var2.r(true);
                                            } else {
                                                l46Var2.Z();
                                            }
                                            return wef.a;
                                        }
                                    };
                                    l26Var2 = l26Var3;
                                    z8 = z33;
                                    z9 = z27;
                                    mh3.a(e1bVarA, af1.b0(1669815857, l26Var4, l46Var), l46Var, 56);
                                    fy9Var2 = fy9Var6;
                                    x16Var6 = x16Var20;
                                    z10 = z35;
                                    x16Var5 = x16Var21;
                                    x16Var7 = x16Var17;
                                    xw9Var3 = xw9Var4;
                                    i42 = i10;
                                    i43 = i47;
                                } else {
                                    egdVar3 = egdVar5;
                                }
                                z24 = true;
                                aw2Var4 = aw2Var2;
                                boolean zI5 = z24 | l46Var.i(aw2Var4);
                                if ((i45 & 458752) == 131072) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                boolean z37 = zI5 | z25;
                                z26 = z17;
                                zH3 = z37 | l46Var.h(z26) | l46Var.g(jieVar) | l46Var.i(gh6VarW0) | l46Var.g(e89VarI3) | l46Var.g(e89VarI4) | l46Var.g(e89VarI2);
                                objR13 = l46Var.R();
                                if (zH3) {
                                    objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                                    z27 = z26;
                                    jieVar2 = jieVar;
                                    e89Var4 = e89VarI2;
                                    l46Var.p0(objR13);
                                } else {
                                    objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                                    z27 = z26;
                                    jieVar2 = jieVar;
                                    e89Var4 = e89VarI2;
                                    l46Var.p0(objR13);
                                }
                                af1.r(objArr, (l26) objR13, l46Var);
                                Integer numValueOf2 = Integer.valueOf(i10);
                                if ((i45 & 7168) == 2048) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                zI2 = l46Var.i(jxVar) | z28 | ((i49 <= 256 && l46Var.g(egdVar3)) || (i45 & 384) == 256) | l46Var.g(e89VarI) | l46Var.g(e89Var4);
                                objR14 = l46Var.R();
                                if (zI2) {
                                    objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                                    jxVar2 = jxVar;
                                    l46Var.p0(objR14);
                                } else {
                                    objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                                    jxVar2 = jxVar;
                                    l46Var.p0(objR14);
                                }
                                af1.p(egdVar3, numValueOf2, (l26) objR14, l46Var);
                                e1b e1bVarA2 = dt1.a.a(gw8Var2);
                                final egd egdVar9 = egdVar3;
                                l26 l26Var5 = new l26() { // from class: ofd
                                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                     */
                                    @Override // defpackage.l26
                                    public final Object z(Object obj3, Object obj4) {
                                        l46 l46Var2 = (l46) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            FillElement fillElement = b.c;
                                            j09 j09VarD = j09Var.D(fillElement);
                                            xn8 xn8VarC = s21.c(ndb.b, false);
                                            int iHashCode = Long.hashCode(l46Var2.T);
                                            u8a u8aVarM = l46Var2.m();
                                            j09 j09VarJ = m93.J(l46Var2, j09VarD);
                                            lf2.q.getClass();
                                            l46Var2.j0();
                                            boolean z38 = l46Var2.S;
                                            ov7 ov7Var = LayoutNode.h1;
                                            if (z38) {
                                                l46Var2.l(ov7Var);
                                            } else {
                                                l46Var2.s0();
                                            }
                                            he2 he2Var = hj6.z;
                                            dec.l(he2Var, l46Var2, xn8VarC);
                                            he2 he2Var2 = hj6.y;
                                            dec.l(he2Var2, l46Var2, u8aVarM);
                                            Integer numValueOf3 = Integer.valueOf(iHashCode);
                                            he2 he2Var3 = hj6.X;
                                            dec.l(he2Var3, l46Var2, numValueOf3);
                                            dec.k(l46Var2);
                                            he2 he2Var4 = hj6.x;
                                            dec.l(he2Var4, l46Var2, j09VarJ);
                                            j09 j09VarY = ynb.Y(fillElement, xw9Var4);
                                            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                                            int iHashCode2 = Long.hashCode(l46Var2.T);
                                            u8a u8aVarM2 = l46Var2.m();
                                            j09 j09VarJ2 = m93.J(l46Var2, j09VarY);
                                            l46Var2.j0();
                                            if (l46Var2.S) {
                                                l46Var2.l(ov7Var);
                                            } else {
                                                l46Var2.s0();
                                            }
                                            dec.l(he2Var, l46Var2, c92VarA);
                                            dec.l(he2Var2, l46Var2, u8aVarM2);
                                            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                                            dec.l(he2Var4, l46Var2, j09VarJ2);
                                            int i63 = i10;
                                            if (i63 == 0) {
                                                ib8.r(24.0f, 91962542, l46Var2, l46Var2, g09.a);
                                                l26Var3.z(l46Var2, 0);
                                                l46Var2.r(false);
                                            } else {
                                                l46Var2.f0(92030773);
                                                l46Var2.r(false);
                                            }
                                            s13 s13Var = (s13) e89Var.getValue();
                                            boolean z39 = z27;
                                            boolean z310 = !z39 || z23;
                                            float fFloatValue = ((Number) jxVar2.e()).floatValue();
                                            egd egdVar10 = egdVar9;
                                            boolean zG2 = l46Var2.g(egdVar10);
                                            Object objR18 = l46Var2.R();
                                            if (zG2 || objR18 == sf2.a) {
                                                objR18 = new ffd(egdVar10, 0);
                                                l46Var2.p0(objR18);
                                            }
                                            p8c.a(egdVar10, i63, s13Var, i47, z33, z39, list, jieVar2, z310, fFloatValue, fy9Var5, (x16) objR18, l46Var2, 6);
                                            l46Var2.r(true);
                                            l46Var2.r(true);
                                        } else {
                                            l46Var2.Z();
                                        }
                                        return wef.a;
                                    }
                                };
                                l26Var2 = l26Var3;
                                z8 = z33;
                                z9 = z27;
                                mh3.a(e1bVarA2, af1.b0(1669815857, l26Var5, l46Var), l46Var, 56);
                                fy9Var2 = fy9Var6;
                                x16Var6 = x16Var20;
                                z10 = z35;
                                x16Var5 = x16Var21;
                                x16Var7 = x16Var17;
                                xw9Var3 = xw9Var4;
                                i42 = i10;
                                i43 = i47;
                            } else {
                                z17 = z14;
                            }
                            z18 = true;
                            z19 = z34 | z18;
                            Object objR18 = l46Var.R();
                            if (z19) {
                                if (i47 < 0) {
                                    qc0.j("Failed requirement.");
                                    return;
                                }
                                ycgVar = new ycg(i48, i48 >> 31);
                                arrayList = new ArrayList(i47);
                                i51 = 0;
                                while (i51 < i47) {
                                    arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                                    i51++;
                                    aw2Var = aw2Var;
                                    x16Var14 = x16Var14;
                                    x16Var12 = x16Var12;
                                    x16Var15 = x16Var15;
                                }
                                aw2Var2 = aw2Var;
                                x16Var16 = x16Var14;
                                x16Var17 = x16Var15;
                                x16Var18 = x16Var12;
                                l46Var.p0(arrayList);
                                obj2 = arrayList;
                            } else {
                                if (i47 < 0) {
                                    qc0.j("Failed requirement.");
                                    return;
                                }
                                ycgVar = new ycg(i48, i48 >> 31);
                                arrayList = new ArrayList(i47);
                                i51 = 0;
                                while (i51 < i47) {
                                    arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                                    i51++;
                                    aw2Var = aw2Var;
                                    x16Var14 = x16Var14;
                                    x16Var12 = x16Var12;
                                    x16Var15 = x16Var15;
                                }
                                aw2Var2 = aw2Var;
                                x16Var16 = x16Var14;
                                x16Var17 = x16Var15;
                                x16Var18 = x16Var12;
                                l46Var.p0(arrayList);
                                obj2 = arrayList;
                            }
                            final List list2 = (List) obj2;
                            if (i49 <= 256) {
                            }
                            z20 = ((i50 <= 16384 && l46Var.e(i47)) || (i45 & 24576) == 16384) | ((i49 <= 256 && l46Var.g(egdVar5)) || (i45 & 384) == 256);
                            objR7 = l46Var.R();
                            if (z20) {
                                objR7 = new jie(i47, i48);
                                l46Var.p0(objR7);
                            } else {
                                objR7 = new jie(i47, i48);
                                l46Var.p0(objR7);
                            }
                            jieVar = (jie) objR7;
                            gh6VarW0 = kj0.w0(l46Var);
                            if (egdVar5.a() == hgd.e) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            i52 = i41 >> 6;
                            zH = l46Var.h(z21);
                            objR8 = l46Var.R();
                            if (zH) {
                                objR8 = q1c.f(Boolean.valueOf(!z21));
                                l46Var.p0(objR8);
                            } else {
                                objR8 = q1c.f(Boolean.valueOf(!z21));
                                l46Var.p0(objR8);
                            }
                            e89Var2 = (e89) objR8;
                            objR9 = l46Var.R();
                            if (objR9 == obj) {
                                objR9 = q1c.f(Boolean.FALSE);
                                l46Var.p0(objR9);
                            }
                            e89Var3 = (e89) objR9;
                            objR10 = l46Var.R();
                            if (objR10 == obj) {
                                objR10 = af1.E(l46Var);
                                l46Var.p0(objR10);
                            }
                            aw2Var3 = (aw2) objR10;
                            Boolean boolValueOf2 = Boolean.valueOf(z21);
                            zH2 = l46Var.h(z21) | l46Var.g(e89Var2);
                            objR11 = l46Var.R();
                            if (zH2) {
                                objR11 = new vm4(z21, e89Var3, e89Var2, null);
                                l46Var.p0(objR11);
                            } else {
                                objR11 = new vm4(z21, e89Var3, e89Var2, null);
                                l46Var.p0(objR11);
                            }
                            af1.o((l26) objR11, l46Var, boolValueOf2);
                            if (((Boolean) e89Var3.getValue()).booleanValue()) {
                                l46Var.f0(1968840980);
                                zI3 = l46Var.i(aw2Var3);
                                objR15 = l46Var.R();
                                if (zI3) {
                                    i53 = 1;
                                    objR15 = new om4(aw2Var3, e89Var3, i53);
                                    l46Var.p0(objR15);
                                } else {
                                    i53 = 1;
                                    objR15 = new om4(aw2Var3, e89Var3, i53);
                                    l46Var.p0(objR15);
                                }
                                vd0.i(i52 & 112, (a26) objR15, l46Var, null, z15);
                                z22 = false;
                                l46Var.r(false);
                            } else {
                                i53 = 1;
                                z22 = false;
                                l46Var.f0(1969148500);
                                l46Var.r(false);
                            }
                            if (((Boolean) e89Var2.getValue()).booleanValue()) {
                                z23 = z22;
                            } else {
                                z23 = z22;
                            }
                            objR12 = l46Var.R();
                            if (objR12 == obj) {
                                objR12 = qk2.d(0.0f);
                                l46Var.p0(objR12);
                            }
                            jxVar = (jx) objR12;
                            e89VarI = q1c.i(x16Var13, l46Var);
                            x16Var8 = x16Var18;
                            e89VarI2 = q1c.i(x16Var8, l46Var);
                            x16 x16Var22 = x16Var16;
                            e89VarI3 = q1c.i(x16Var22, l46Var);
                            boolean z38 = z15;
                            e89VarI4 = q1c.i(x16Var17, l46Var);
                            x16 x16Var23 = x16Var13;
                            Object[] objArr2 = {egdVar5, Boolean.valueOf(z5), Boolean.valueOf(z17), jieVar, gh6VarW0};
                            if (i49 > 256) {
                                egdVar3 = egdVar5;
                                if ((i45 & 384) != 256) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                            } else {
                                egdVar3 = egdVar5;
                                if ((i45 & 384) != 256) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                            }
                            aw2Var4 = aw2Var2;
                            boolean zI6 = z24 | l46Var.i(aw2Var4);
                            if ((i45 & 458752) == 131072) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            boolean z39 = zI6 | z25;
                            z26 = z17;
                            zH3 = z39 | l46Var.h(z26) | l46Var.g(jieVar) | l46Var.i(gh6VarW0) | l46Var.g(e89VarI3) | l46Var.g(e89VarI4) | l46Var.g(e89VarI2);
                            objR13 = l46Var.R();
                            if (zH3) {
                                objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                                z27 = z26;
                                jieVar2 = jieVar;
                                e89Var4 = e89VarI2;
                                l46Var.p0(objR13);
                            } else {
                                objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                                z27 = z26;
                                jieVar2 = jieVar;
                                e89Var4 = e89VarI2;
                                l46Var.p0(objR13);
                            }
                            af1.r(objArr2, (l26) objR13, l46Var);
                            Integer numValueOf3 = Integer.valueOf(i10);
                            if ((i45 & 7168) == 2048) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            zI2 = l46Var.i(jxVar) | z28 | ((i49 <= 256 && l46Var.g(egdVar3)) || (i45 & 384) == 256) | l46Var.g(e89VarI) | l46Var.g(e89Var4);
                            objR14 = l46Var.R();
                            if (zI2) {
                                objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                                jxVar2 = jxVar;
                                l46Var.p0(objR14);
                            } else {
                                objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                                jxVar2 = jxVar;
                                l46Var.p0(objR14);
                            }
                            af1.p(egdVar3, numValueOf3, (l26) objR14, l46Var);
                            e1b e1bVarA3 = dt1.a.a(gw8Var2);
                            final egd egdVar10 = egdVar3;
                            l26 l26Var6 = new l26() { // from class: ofd
                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @Override // defpackage.l26
                                public final Object z(Object obj3, Object obj4) {
                                    l46 l46Var2 = (l46) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        FillElement fillElement = b.c;
                                        j09 j09VarD = j09Var.D(fillElement);
                                        xn8 xn8VarC = s21.c(ndb.b, false);
                                        int iHashCode = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM = l46Var2.m();
                                        j09 j09VarJ = m93.J(l46Var2, j09VarD);
                                        lf2.q.getClass();
                                        l46Var2.j0();
                                        boolean z310 = l46Var2.S;
                                        ov7 ov7Var = LayoutNode.h1;
                                        if (z310) {
                                            l46Var2.l(ov7Var);
                                        } else {
                                            l46Var2.s0();
                                        }
                                        he2 he2Var = hj6.z;
                                        dec.l(he2Var, l46Var2, xn8VarC);
                                        he2 he2Var2 = hj6.y;
                                        dec.l(he2Var2, l46Var2, u8aVarM);
                                        Integer numValueOf4 = Integer.valueOf(iHashCode);
                                        he2 he2Var3 = hj6.X;
                                        dec.l(he2Var3, l46Var2, numValueOf4);
                                        dec.k(l46Var2);
                                        he2 he2Var4 = hj6.x;
                                        dec.l(he2Var4, l46Var2, j09VarJ);
                                        j09 j09VarY = ynb.Y(fillElement, xw9Var4);
                                        c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                                        int iHashCode2 = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM2 = l46Var2.m();
                                        j09 j09VarJ2 = m93.J(l46Var2, j09VarY);
                                        l46Var2.j0();
                                        if (l46Var2.S) {
                                            l46Var2.l(ov7Var);
                                        } else {
                                            l46Var2.s0();
                                        }
                                        dec.l(he2Var, l46Var2, c92VarA);
                                        dec.l(he2Var2, l46Var2, u8aVarM2);
                                        ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                                        dec.l(he2Var4, l46Var2, j09VarJ2);
                                        int i63 = i10;
                                        if (i63 == 0) {
                                            ib8.r(24.0f, 91962542, l46Var2, l46Var2, g09.a);
                                            l26Var3.z(l46Var2, 0);
                                            l46Var2.r(false);
                                        } else {
                                            l46Var2.f0(92030773);
                                            l46Var2.r(false);
                                        }
                                        s13 s13Var = (s13) e89Var.getValue();
                                        boolean z311 = z27;
                                        boolean z312 = !z311 || z23;
                                        float fFloatValue = ((Number) jxVar2.e()).floatValue();
                                        egd egdVar11 = egdVar10;
                                        boolean zG2 = l46Var2.g(egdVar11);
                                        Object objR19 = l46Var2.R();
                                        if (zG2 || objR19 == sf2.a) {
                                            objR19 = new ffd(egdVar11, 0);
                                            l46Var2.p0(objR19);
                                        }
                                        p8c.a(egdVar11, i63, s13Var, i47, z33, z311, list2, jieVar2, z312, fFloatValue, fy9Var5, (x16) objR19, l46Var2, 6);
                                        l46Var2.r(true);
                                        l46Var2.r(true);
                                    } else {
                                        l46Var2.Z();
                                    }
                                    return wef.a;
                                }
                            };
                            l26Var2 = l26Var3;
                            z8 = z33;
                            z9 = z27;
                            mh3.a(e1bVarA3, af1.b0(1669815857, l26Var6, l46Var), l46Var, 56);
                            fy9Var2 = fy9Var6;
                            x16Var6 = x16Var22;
                            z10 = z38;
                            x16Var5 = x16Var23;
                            x16Var7 = x16Var17;
                            xw9Var3 = xw9Var4;
                            i42 = i10;
                            i43 = i47;
                        } else {
                            gw8Var2 = gw8Var;
                        }
                        z16 = true;
                        i50 = (57344 & i45) ^ 24576;
                        boolean z310 = z16;
                        if (i50 > 16384) {
                            z17 = z14;
                            if ((i45 & 24576) != 16384) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                        } else {
                            z17 = z14;
                            if ((i45 & 24576) != 16384) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                        }
                        z19 = z310 | z18;
                        Object objR19 = l46Var.R();
                        if (z19) {
                            if (i47 < 0) {
                                qc0.j("Failed requirement.");
                                return;
                            }
                            ycgVar = new ycg(i48, i48 >> 31);
                            arrayList = new ArrayList(i47);
                            i51 = 0;
                            while (i51 < i47) {
                                arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                                i51++;
                                aw2Var = aw2Var;
                                x16Var14 = x16Var14;
                                x16Var12 = x16Var12;
                                x16Var15 = x16Var15;
                            }
                            aw2Var2 = aw2Var;
                            x16Var16 = x16Var14;
                            x16Var17 = x16Var15;
                            x16Var18 = x16Var12;
                            l46Var.p0(arrayList);
                            obj2 = arrayList;
                        } else {
                            if (i47 < 0) {
                                qc0.j("Failed requirement.");
                                return;
                            }
                            ycgVar = new ycg(i48, i48 >> 31);
                            arrayList = new ArrayList(i47);
                            i51 = 0;
                            while (i51 < i47) {
                                arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                                i51++;
                                aw2Var = aw2Var;
                                x16Var14 = x16Var14;
                                x16Var12 = x16Var12;
                                x16Var15 = x16Var15;
                            }
                            aw2Var2 = aw2Var;
                            x16Var16 = x16Var14;
                            x16Var17 = x16Var15;
                            x16Var18 = x16Var12;
                            l46Var.p0(arrayList);
                            obj2 = arrayList;
                        }
                        final List list3 = (List) obj2;
                        if (i49 <= 256) {
                        }
                        z20 = ((i50 <= 16384 && l46Var.e(i47)) || (i45 & 24576) == 16384) | ((i49 <= 256 && l46Var.g(egdVar5)) || (i45 & 384) == 256);
                        objR7 = l46Var.R();
                        if (z20) {
                            objR7 = new jie(i47, i48);
                            l46Var.p0(objR7);
                        } else {
                            objR7 = new jie(i47, i48);
                            l46Var.p0(objR7);
                        }
                        jieVar = (jie) objR7;
                        gh6VarW0 = kj0.w0(l46Var);
                        if (egdVar5.a() == hgd.e) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        i52 = i41 >> 6;
                        zH = l46Var.h(z21);
                        objR8 = l46Var.R();
                        if (zH) {
                            objR8 = q1c.f(Boolean.valueOf(!z21));
                            l46Var.p0(objR8);
                        } else {
                            objR8 = q1c.f(Boolean.valueOf(!z21));
                            l46Var.p0(objR8);
                        }
                        e89Var2 = (e89) objR8;
                        objR9 = l46Var.R();
                        if (objR9 == obj) {
                            objR9 = q1c.f(Boolean.FALSE);
                            l46Var.p0(objR9);
                        }
                        e89Var3 = (e89) objR9;
                        objR10 = l46Var.R();
                        if (objR10 == obj) {
                            objR10 = af1.E(l46Var);
                            l46Var.p0(objR10);
                        }
                        aw2Var3 = (aw2) objR10;
                        Boolean boolValueOf3 = Boolean.valueOf(z21);
                        zH2 = l46Var.h(z21) | l46Var.g(e89Var2);
                        objR11 = l46Var.R();
                        if (zH2) {
                            objR11 = new vm4(z21, e89Var3, e89Var2, null);
                            l46Var.p0(objR11);
                        } else {
                            objR11 = new vm4(z21, e89Var3, e89Var2, null);
                            l46Var.p0(objR11);
                        }
                        af1.o((l26) objR11, l46Var, boolValueOf3);
                        if (((Boolean) e89Var3.getValue()).booleanValue()) {
                            l46Var.f0(1968840980);
                            zI3 = l46Var.i(aw2Var3);
                            objR15 = l46Var.R();
                            if (zI3) {
                                i53 = 1;
                                objR15 = new om4(aw2Var3, e89Var3, i53);
                                l46Var.p0(objR15);
                            } else {
                                i53 = 1;
                                objR15 = new om4(aw2Var3, e89Var3, i53);
                                l46Var.p0(objR15);
                            }
                            vd0.i(i52 & 112, (a26) objR15, l46Var, null, z15);
                            z22 = false;
                            l46Var.r(false);
                        } else {
                            i53 = 1;
                            z22 = false;
                            l46Var.f0(1969148500);
                            l46Var.r(false);
                        }
                        if (((Boolean) e89Var2.getValue()).booleanValue()) {
                            z23 = z22;
                        } else {
                            z23 = z22;
                        }
                        objR12 = l46Var.R();
                        if (objR12 == obj) {
                            objR12 = qk2.d(0.0f);
                            l46Var.p0(objR12);
                        }
                        jxVar = (jx) objR12;
                        e89VarI = q1c.i(x16Var13, l46Var);
                        x16Var8 = x16Var18;
                        e89VarI2 = q1c.i(x16Var8, l46Var);
                        x16 x16Var24 = x16Var16;
                        e89VarI3 = q1c.i(x16Var24, l46Var);
                        boolean z311 = z15;
                        e89VarI4 = q1c.i(x16Var17, l46Var);
                        x16 x16Var25 = x16Var13;
                        Object[] objArr3 = {egdVar5, Boolean.valueOf(z5), Boolean.valueOf(z17), jieVar, gh6VarW0};
                        if (i49 > 256) {
                            egdVar3 = egdVar5;
                            if ((i45 & 384) != 256) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                        } else {
                            egdVar3 = egdVar5;
                            if ((i45 & 384) != 256) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                        }
                        aw2Var4 = aw2Var2;
                        boolean zI7 = z24 | l46Var.i(aw2Var4);
                        if ((i45 & 458752) == 131072) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z312 = zI7 | z25;
                        z26 = z17;
                        zH3 = z312 | l46Var.h(z26) | l46Var.g(jieVar) | l46Var.i(gh6VarW0) | l46Var.g(e89VarI3) | l46Var.g(e89VarI4) | l46Var.g(e89VarI2);
                        objR13 = l46Var.R();
                        if (zH3) {
                            objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                            z27 = z26;
                            jieVar2 = jieVar;
                            e89Var4 = e89VarI2;
                            l46Var.p0(objR13);
                        } else {
                            objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                            z27 = z26;
                            jieVar2 = jieVar;
                            e89Var4 = e89VarI2;
                            l46Var.p0(objR13);
                        }
                        af1.r(objArr3, (l26) objR13, l46Var);
                        Integer numValueOf4 = Integer.valueOf(i10);
                        if ((i45 & 7168) == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        zI2 = l46Var.i(jxVar) | z28 | ((i49 <= 256 && l46Var.g(egdVar3)) || (i45 & 384) == 256) | l46Var.g(e89VarI) | l46Var.g(e89Var4);
                        objR14 = l46Var.R();
                        if (zI2) {
                            objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                            jxVar2 = jxVar;
                            l46Var.p0(objR14);
                        } else {
                            objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                            jxVar2 = jxVar;
                            l46Var.p0(objR14);
                        }
                        af1.p(egdVar3, numValueOf4, (l26) objR14, l46Var);
                        e1b e1bVarA4 = dt1.a.a(gw8Var2);
                        final egd egdVar11 = egdVar3;
                        l26 l26Var7 = new l26() { // from class: ofd
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // defpackage.l26
                            public final Object z(Object obj3, Object obj4) {
                                l46 l46Var2 = (l46) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    FillElement fillElement = b.c;
                                    j09 j09VarD = j09Var.D(fillElement);
                                    xn8 xn8VarC = s21.c(ndb.b, false);
                                    int iHashCode = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM = l46Var2.m();
                                    j09 j09VarJ = m93.J(l46Var2, j09VarD);
                                    lf2.q.getClass();
                                    l46Var2.j0();
                                    boolean z313 = l46Var2.S;
                                    ov7 ov7Var = LayoutNode.h1;
                                    if (z313) {
                                        l46Var2.l(ov7Var);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    he2 he2Var = hj6.z;
                                    dec.l(he2Var, l46Var2, xn8VarC);
                                    he2 he2Var2 = hj6.y;
                                    dec.l(he2Var2, l46Var2, u8aVarM);
                                    Integer numValueOf5 = Integer.valueOf(iHashCode);
                                    he2 he2Var3 = hj6.X;
                                    dec.l(he2Var3, l46Var2, numValueOf5);
                                    dec.k(l46Var2);
                                    he2 he2Var4 = hj6.x;
                                    dec.l(he2Var4, l46Var2, j09VarJ);
                                    j09 j09VarY = ynb.Y(fillElement, xw9Var4);
                                    c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                                    int iHashCode2 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM2 = l46Var2.m();
                                    j09 j09VarJ2 = m93.J(l46Var2, j09VarY);
                                    l46Var2.j0();
                                    if (l46Var2.S) {
                                        l46Var2.l(ov7Var);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    dec.l(he2Var, l46Var2, c92VarA);
                                    dec.l(he2Var2, l46Var2, u8aVarM2);
                                    ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                                    dec.l(he2Var4, l46Var2, j09VarJ2);
                                    int i63 = i10;
                                    if (i63 == 0) {
                                        ib8.r(24.0f, 91962542, l46Var2, l46Var2, g09.a);
                                        l26Var3.z(l46Var2, 0);
                                        l46Var2.r(false);
                                    } else {
                                        l46Var2.f0(92030773);
                                        l46Var2.r(false);
                                    }
                                    s13 s13Var = (s13) e89Var.getValue();
                                    boolean z314 = z27;
                                    boolean z315 = !z314 || z23;
                                    float fFloatValue = ((Number) jxVar2.e()).floatValue();
                                    egd egdVar12 = egdVar11;
                                    boolean zG2 = l46Var2.g(egdVar12);
                                    Object objR110 = l46Var2.R();
                                    if (zG2 || objR110 == sf2.a) {
                                        objR110 = new ffd(egdVar12, 0);
                                        l46Var2.p0(objR110);
                                    }
                                    p8c.a(egdVar12, i63, s13Var, i47, z33, z314, list3, jieVar2, z315, fFloatValue, fy9Var5, (x16) objR110, l46Var2, 6);
                                    l46Var2.r(true);
                                    l46Var2.r(true);
                                } else {
                                    l46Var2.Z();
                                }
                                return wef.a;
                            }
                        };
                        l26Var2 = l26Var3;
                        z8 = z33;
                        z9 = z27;
                        mh3.a(e1bVarA4, af1.b0(1669815857, l26Var7, l46Var), l46Var, 56);
                        fy9Var2 = fy9Var6;
                        x16Var6 = x16Var24;
                        z10 = z311;
                        x16Var5 = x16Var25;
                        x16Var7 = x16Var17;
                        xw9Var3 = xw9Var4;
                        i42 = i10;
                        i43 = i47;
                    } else {
                        l46Var.Z();
                        x16Var5 = x16Var;
                        x16Var6 = x16Var2;
                        x16Var7 = x16Var3;
                        i42 = i10;
                        z8 = z6;
                        xw9Var3 = xw9Var2;
                        egdVar3 = egdVar2;
                        i43 = iC;
                        z5 = z5;
                        z9 = z2;
                        fy9Var2 = fy9Var;
                        l26Var2 = l26Var;
                        z10 = z4;
                        x16Var8 = x16Var4;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        final int i63 = 2;
                        ojbVarV.d = new l26() { // from class: nfd
                            @Override // defpackage.l26
                            public final Object z(Object obj3, Object obj4) {
                                int i64 = i63;
                                wef wefVar = wef.a;
                                int i65 = i4;
                                int i66 = i3;
                                switch (i64) {
                                    case 0:
                                        ((Integer) obj4).getClass();
                                        int iP = k99.P(i66 | 1);
                                        int iP2 = k99.P(i65);
                                        p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP, iP2, i5);
                                        break;
                                    case 1:
                                        ((Integer) obj4).getClass();
                                        int iP3 = k99.P(i66 | 1);
                                        int iP4 = k99.P(i65);
                                        p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP3, iP4, i5);
                                        break;
                                    default:
                                        ((Integer) obj4).getClass();
                                        int iP5 = k99.P(i66 | 1);
                                        int iP6 = k99.P(i65);
                                        p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP5, iP6, i5);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                    }
                }
                i21 |= 805306368;
                i26 = i5 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i26 != 0) {
                    i27 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    if (l46Var.i(x16Var)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i4 | i28;
                } else {
                    i27 = i4;
                }
                i29 = i5 & 2048;
                if (i29 != 0) {
                    i31 = i27 | 48;
                } else {
                    if (l46Var.i(x16Var2)) {
                        i30 = 32;
                    } else {
                        i30 = 16;
                    }
                    i31 = i27 | i30;
                }
                i32 = i31;
                i33 = i5 & 4096;
                if (i33 != 0) {
                    i35 = i32 | 384;
                } else {
                    if (l46Var.i(x16Var3)) {
                        i34 = 256;
                    } else {
                        i34 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i35 = i32 | i34;
                }
                i36 = i5 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                if (i36 != 0) {
                    i38 = i35 | 3072;
                } else {
                    int i510 = i35;
                    if (l46Var.h(z4)) {
                        i37 = 2048;
                    } else {
                        i37 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i38 = i510 | i37;
                }
                i39 = i5 & 16384;
                if (i39 != 0) {
                    i41 = i38 | 24576;
                } else {
                    i40 = i38;
                    if ((i4 & 24576) == 0) {
                        if (l46Var.i(x16Var4)) {
                            i13 = 16384;
                        }
                        i41 = i40 | i13;
                    } else {
                        i41 = i40;
                    }
                }
                if ((i21 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (l46Var.W(i21 & 1, z7)) {
                    l46Var.b0();
                    i44 = i3 & 1;
                    obj = sf2.a;
                    if (i44 != 0) {
                        if (i54 != 0) {
                            xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                        } else {
                            xw9VarQ = xw9Var2;
                        }
                        if ((i5 & 4) != 0) {
                            egdVarU = u(l46Var);
                            i21 &= -897;
                        } else {
                            egdVarU = egdVar2;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if ((i5 & 16) != 0) {
                            i21 &= -57345;
                            iC = ((d1) TarotCardType.getEntries()).c();
                        }
                        if (i16 != 0) {
                            z5 = true;
                        }
                        if (i10 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        i45 = i21 & (-3670017);
                        if (i19 != 0) {
                            fy9Var3 = null;
                        } else {
                            fy9Var3 = fy9Var;
                        }
                        if (i22 != 0) {
                            z6 = false;
                        }
                        if (i24 != 0) {
                            l26VarB0 = af1.b0(876435724, new z8d(1, egdVarU), l46Var);
                        } else {
                            l26VarB0 = l26Var;
                        }
                        if (i26 != 0) {
                            objR4 = l46Var.R();
                            if (objR4 == obj) {
                                objR4 = new ead(14);
                                l46Var.p0(objR4);
                            }
                            x16Var9 = (x16) objR4;
                        } else {
                            x16Var9 = x16Var;
                        }
                        if (i29 != 0) {
                            objR3 = l46Var.R();
                            if (objR3 == obj) {
                                objR3 = new ead(15);
                                l46Var.p0(objR3);
                            }
                            x16Var10 = (x16) objR3;
                        } else {
                            x16Var10 = x16Var2;
                        }
                        if (i33 != 0) {
                            objR2 = l46Var.R();
                            if (objR2 == obj) {
                                objR2 = new ead(16);
                                l46Var.p0(objR2);
                            }
                            x16Var11 = (x16) objR2;
                        } else {
                            i41 = i41;
                            x16Var11 = x16Var3;
                        }
                        if (i36 != 0) {
                            z12 = true;
                        } else {
                            z12 = z4;
                        }
                        x16 x16Var110 = x16Var11;
                        if (i39 != 0) {
                            objR = l46Var.R();
                            if (objR == obj) {
                                objR = new ead(17);
                                l46Var.p0(objR);
                            }
                            xw9VarQ = xw9VarQ;
                            x16Var12 = (x16) objR;
                        } else {
                            x16Var12 = x16Var4;
                        }
                        z13 = z6;
                        z14 = z11;
                        fy9Var4 = fy9Var3;
                        l26Var3 = l26VarB0;
                        x16Var13 = x16Var9;
                        x16Var14 = x16Var10;
                        egdVar4 = egdVarU;
                        i46 = iC;
                        z15 = z12;
                        x16Var15 = x16Var110;
                    } else {
                        if (i54 != 0) {
                            xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                        } else {
                            xw9VarQ = xw9Var2;
                        }
                        if ((i5 & 4) != 0) {
                            egdVarU = u(l46Var);
                            i21 &= -897;
                        } else {
                            egdVarU = egdVar2;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if ((i5 & 16) != 0) {
                            i21 &= -57345;
                            iC = ((d1) TarotCardType.getEntries()).c();
                        }
                        if (i16 != 0) {
                            z5 = true;
                        }
                        if (i10 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        i45 = i21 & (-3670017);
                        if (i19 != 0) {
                            fy9Var3 = null;
                        } else {
                            fy9Var3 = fy9Var;
                        }
                        if (i22 != 0) {
                            z6 = false;
                        }
                        if (i24 != 0) {
                            l26VarB0 = af1.b0(876435724, new z8d(1, egdVarU), l46Var);
                        } else {
                            l26VarB0 = l26Var;
                        }
                        if (i26 != 0) {
                            objR4 = l46Var.R();
                            if (objR4 == obj) {
                                objR4 = new ead(14);
                                l46Var.p0(objR4);
                            }
                            x16Var9 = (x16) objR4;
                        } else {
                            x16Var9 = x16Var;
                        }
                        if (i29 != 0) {
                            objR3 = l46Var.R();
                            if (objR3 == obj) {
                                objR3 = new ead(15);
                                l46Var.p0(objR3);
                            }
                            x16Var10 = (x16) objR3;
                        } else {
                            x16Var10 = x16Var2;
                        }
                        if (i33 != 0) {
                            objR2 = l46Var.R();
                            if (objR2 == obj) {
                                objR2 = new ead(16);
                                l46Var.p0(objR2);
                            }
                            x16Var11 = (x16) objR2;
                        } else {
                            i41 = i41;
                            x16Var11 = x16Var3;
                        }
                        if (i36 != 0) {
                            z12 = true;
                        } else {
                            z12 = z4;
                        }
                        x16 x16Var111 = x16Var11;
                        if (i39 != 0) {
                            objR = l46Var.R();
                            if (objR == obj) {
                                objR = new ead(17);
                                l46Var.p0(objR);
                            }
                            xw9VarQ = xw9VarQ;
                            x16Var12 = (x16) objR;
                        } else {
                            x16Var12 = x16Var4;
                        }
                        z13 = z6;
                        z14 = z11;
                        fy9Var4 = fy9Var3;
                        l26Var3 = l26VarB0;
                        x16Var13 = x16Var9;
                        x16Var14 = x16Var10;
                        egdVar4 = egdVarU;
                        i46 = iC;
                        z15 = z12;
                        x16Var15 = x16Var111;
                    }
                    l46Var.s();
                    xw9Var4 = xw9VarQ;
                    mixedDeckSnapshot = (MixedDeckSnapshot) l46Var.k(snd.b);
                    if (mixedDeckSnapshot != null) {
                        egdVar6 = egdVar4;
                        l46Var.f0(-810781893);
                        zG = l46Var.g(mixedDeckSnapshot);
                        objR16 = l46Var.R();
                        if (zG) {
                            List<String> cardOrder2 = mixedDeckSnapshot.getCardOrder();
                            arrayList2 = new ArrayList();
                            it = cardOrder2.iterator();
                            while (it.hasNext()) {
                                int i511 = i46;
                                tarotSkinIdentifySkinFor = mixedDeckSnapshot.skinFor((String) it.next());
                                if (tarotSkinIdentifySkinFor != null) {
                                    arrayList2.add(tarotSkinIdentifySkinFor);
                                }
                                i46 = i511;
                            }
                            i47 = i46;
                            pr4 pr4Var2 = dt1.a;
                            int iF2 = bm8.F(t72.u(arrayList2, 10));
                            linkedHashMap = new LinkedHashMap(iF2 >= 16 ? iF2 : 16);
                            it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) it2.next();
                                boolean z313 = z5;
                                iy9 iy9Var2 = new iy9(Integer.valueOf(hfc.q(tarotSkinIdentify2).c()), Float.valueOf(Math.min(tarotSkinIdentify2.getAspectRatio(), 0.5714286f)));
                                linkedHashMap.put(iy9Var2.d(), iy9Var2.e());
                                it2 = it2;
                                z5 = z313;
                            }
                            z29 = z5;
                            l46Var.p0(linkedHashMap);
                            objR16 = linkedHashMap;
                        } else {
                            List<String> cardOrder3 = mixedDeckSnapshot.getCardOrder();
                            arrayList2 = new ArrayList();
                            it = cardOrder3.iterator();
                            while (it.hasNext()) {
                                int i512 = i46;
                                tarotSkinIdentifySkinFor = mixedDeckSnapshot.skinFor((String) it.next());
                                if (tarotSkinIdentifySkinFor != null) {
                                    arrayList2.add(tarotSkinIdentifySkinFor);
                                }
                                i46 = i512;
                            }
                            i47 = i46;
                            pr4 pr4Var3 = dt1.a;
                            int iF3 = bm8.F(t72.u(arrayList2, 10));
                            linkedHashMap = new LinkedHashMap(iF3 >= 16 ? iF3 : 16);
                            it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                TarotSkinIdentify tarotSkinIdentify3 = (TarotSkinIdentify) it2.next();
                                boolean z314 = z5;
                                iy9 iy9Var3 = new iy9(Integer.valueOf(hfc.q(tarotSkinIdentify3).c()), Float.valueOf(Math.min(tarotSkinIdentify3.getAspectRatio(), 0.5714286f)));
                                linkedHashMap.put(iy9Var3.d(), iy9Var3.e());
                                it2 = it2;
                                z5 = z314;
                            }
                            z29 = z5;
                            l46Var.p0(linkedHashMap);
                            objR16 = linkedHashMap;
                        }
                        linkedHashMapF = dt1.f((Map) objR16, l46Var);
                        if (linkedHashMapF == null) {
                            l46Var.r(false);
                            ojbVarV3 = l46Var.v();
                            if (ojbVarV3 != null) {
                                final int i513 = 0;
                                final boolean z315 = z29;
                                final int i514 = i10;
                                final int i515 = i47;
                                ojbVarV3.d = new l26() { // from class: nfd
                                    @Override // defpackage.l26
                                    public final Object z(Object obj3, Object obj4) {
                                        int i64 = i513;
                                        wef wefVar = wef.a;
                                        int i65 = i4;
                                        int i66 = i3;
                                        switch (i64) {
                                            case 0:
                                                ((Integer) obj4).getClass();
                                                int iP = k99.P(i66 | 1);
                                                int iP2 = k99.P(i65);
                                                p8c.i(j09Var, xw9Var4, egdVar6, i514, i515, z315, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP, iP2, i5);
                                                break;
                                            case 1:
                                                ((Integer) obj4).getClass();
                                                int iP3 = k99.P(i66 | 1);
                                                int iP4 = k99.P(i65);
                                                p8c.i(j09Var, xw9Var4, egdVar6, i514, i515, z315, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP3, iP4, i5);
                                                break;
                                            default:
                                                ((Integer) obj4).getClass();
                                                int iP5 = k99.P(i66 | 1);
                                                int iP6 = k99.P(i65);
                                                p8c.i(j09Var, xw9Var4, egdVar6, i514, i515, z315, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP5, iP6, i5);
                                                break;
                                        }
                                        return wefVar;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        egdVar5 = egdVar6;
                        z5 = z29;
                        r3 = 0;
                        gw8Var = new gw8(linkedHashMapF);
                        l46Var.r(false);
                    } else {
                        mixedDeckSnapshot = mixedDeckSnapshot;
                        egdVar5 = egdVar4;
                        i47 = i46;
                        r3 = 0;
                        l46Var.f0(-810539412);
                        l46Var.r(false);
                        gw8Var = null;
                    }
                    if (mixedDeckSnapshot == null) {
                        l46Var.f0(-810470808);
                        if (fy9Var4 == null) {
                            l46Var.f0(1774971708);
                            fy9VarE = dt1.e(null, l46Var, r3, 6);
                            l46Var.r(r3);
                        } else {
                            l46Var.f0(1774971088);
                            l46Var.r(r3);
                            fy9VarE = fy9Var4;
                        }
                        if (fy9VarE == null) {
                            l46Var.r(r3);
                            ojbVarV2 = l46Var.v();
                            if (ojbVarV2 != null) {
                                final int i64 = 1;
                                final boolean z316 = z5;
                                final int i65 = i10;
                                final egd egdVar12 = egdVar5;
                                final int i66 = i47;
                                ojbVarV2.d = new l26() { // from class: nfd
                                    @Override // defpackage.l26
                                    public final Object z(Object obj3, Object obj4) {
                                        int i67 = i64;
                                        wef wefVar = wef.a;
                                        int i68 = i4;
                                        int i69 = i3;
                                        switch (i67) {
                                            case 0:
                                                ((Integer) obj4).getClass();
                                                int iP = k99.P(i69 | 1);
                                                int iP2 = k99.P(i68);
                                                p8c.i(j09Var, xw9Var4, egdVar12, i65, i66, z316, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP, iP2, i5);
                                                break;
                                            case 1:
                                                ((Integer) obj4).getClass();
                                                int iP3 = k99.P(i69 | 1);
                                                int iP4 = k99.P(i68);
                                                p8c.i(j09Var, xw9Var4, egdVar12, i65, i66, z316, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP3, iP4, i5);
                                                break;
                                            default:
                                                ((Integer) obj4).getClass();
                                                int iP5 = k99.P(i69 | 1);
                                                int iP6 = k99.P(i68);
                                                p8c.i(j09Var, xw9Var4, egdVar12, i65, i66, z316, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP5, iP6, i5);
                                                break;
                                        }
                                        return wefVar;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        l46Var.r(r3);
                        fy9Var5 = fy9VarE;
                    } else {
                        z5 = z5;
                        l46Var.f0(-810390612);
                        l46Var.r(r3);
                        fy9Var5 = null;
                    }
                    objR5 = l46Var.R();
                    if (objR5 == obj) {
                        objR5 = af1.E(l46Var);
                        l46Var.p0(objR5);
                    }
                    aw2Var = (aw2) objR5;
                    objR6 = l46Var.R();
                    if (objR6 == obj) {
                        objR6 = q1c.f(s13.a);
                        l46Var.p0(objR6);
                    }
                    e89Var = (e89) objR6;
                    i48 = egdVar5.a;
                    fy9 fy9Var7 = fy9Var4;
                    i49 = (i45 & 896) ^ 384;
                    final boolean z317 = z13;
                    if (i49 > 256) {
                        gw8Var2 = gw8Var;
                        if ((i45 & 384) != 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    } else {
                        gw8Var2 = gw8Var;
                        if ((i45 & 384) != 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    }
                    i50 = (57344 & i45) ^ 24576;
                    boolean z318 = z16;
                    if (i50 > 16384) {
                        z17 = z14;
                        if ((i45 & 24576) != 16384) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                    } else {
                        z17 = z14;
                        if ((i45 & 24576) != 16384) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                    }
                    z19 = z318 | z18;
                    Object objR110 = l46Var.R();
                    if (z19) {
                        if (i47 < 0) {
                            qc0.j("Failed requirement.");
                            return;
                        }
                        ycgVar = new ycg(i48, i48 >> 31);
                        arrayList = new ArrayList(i47);
                        i51 = 0;
                        while (i51 < i47) {
                            arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                            i51++;
                            aw2Var = aw2Var;
                            x16Var14 = x16Var14;
                            x16Var12 = x16Var12;
                            x16Var15 = x16Var15;
                        }
                        aw2Var2 = aw2Var;
                        x16Var16 = x16Var14;
                        x16Var17 = x16Var15;
                        x16Var18 = x16Var12;
                        l46Var.p0(arrayList);
                        obj2 = arrayList;
                    } else {
                        if (i47 < 0) {
                            qc0.j("Failed requirement.");
                            return;
                        }
                        ycgVar = new ycg(i48, i48 >> 31);
                        arrayList = new ArrayList(i47);
                        i51 = 0;
                        while (i51 < i47) {
                            arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                            i51++;
                            aw2Var = aw2Var;
                            x16Var14 = x16Var14;
                            x16Var12 = x16Var12;
                            x16Var15 = x16Var15;
                        }
                        aw2Var2 = aw2Var;
                        x16Var16 = x16Var14;
                        x16Var17 = x16Var15;
                        x16Var18 = x16Var12;
                        l46Var.p0(arrayList);
                        obj2 = arrayList;
                    }
                    final List list4 = (List) obj2;
                    if (i49 <= 256) {
                    }
                    z20 = ((i50 <= 16384 && l46Var.e(i47)) || (i45 & 24576) == 16384) | ((i49 <= 256 && l46Var.g(egdVar5)) || (i45 & 384) == 256);
                    objR7 = l46Var.R();
                    if (z20) {
                        objR7 = new jie(i47, i48);
                        l46Var.p0(objR7);
                    } else {
                        objR7 = new jie(i47, i48);
                        l46Var.p0(objR7);
                    }
                    jieVar = (jie) objR7;
                    gh6VarW0 = kj0.w0(l46Var);
                    if (egdVar5.a() == hgd.e) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    i52 = i41 >> 6;
                    zH = l46Var.h(z21);
                    objR8 = l46Var.R();
                    if (zH) {
                        objR8 = q1c.f(Boolean.valueOf(!z21));
                        l46Var.p0(objR8);
                    } else {
                        objR8 = q1c.f(Boolean.valueOf(!z21));
                        l46Var.p0(objR8);
                    }
                    e89Var2 = (e89) objR8;
                    objR9 = l46Var.R();
                    if (objR9 == obj) {
                        objR9 = q1c.f(Boolean.FALSE);
                        l46Var.p0(objR9);
                    }
                    e89Var3 = (e89) objR9;
                    objR10 = l46Var.R();
                    if (objR10 == obj) {
                        objR10 = af1.E(l46Var);
                        l46Var.p0(objR10);
                    }
                    aw2Var3 = (aw2) objR10;
                    Boolean boolValueOf4 = Boolean.valueOf(z21);
                    zH2 = l46Var.h(z21) | l46Var.g(e89Var2);
                    objR11 = l46Var.R();
                    if (zH2) {
                        objR11 = new vm4(z21, e89Var3, e89Var2, null);
                        l46Var.p0(objR11);
                    } else {
                        objR11 = new vm4(z21, e89Var3, e89Var2, null);
                        l46Var.p0(objR11);
                    }
                    af1.o((l26) objR11, l46Var, boolValueOf4);
                    if (((Boolean) e89Var3.getValue()).booleanValue()) {
                        l46Var.f0(1968840980);
                        zI3 = l46Var.i(aw2Var3);
                        objR15 = l46Var.R();
                        if (zI3) {
                            i53 = 1;
                            objR15 = new om4(aw2Var3, e89Var3, i53);
                            l46Var.p0(objR15);
                        } else {
                            i53 = 1;
                            objR15 = new om4(aw2Var3, e89Var3, i53);
                            l46Var.p0(objR15);
                        }
                        vd0.i(i52 & 112, (a26) objR15, l46Var, null, z15);
                        z22 = false;
                        l46Var.r(false);
                    } else {
                        i53 = 1;
                        z22 = false;
                        l46Var.f0(1969148500);
                        l46Var.r(false);
                    }
                    if (((Boolean) e89Var2.getValue()).booleanValue()) {
                        z23 = z22;
                    } else {
                        z23 = z22;
                    }
                    objR12 = l46Var.R();
                    if (objR12 == obj) {
                        objR12 = qk2.d(0.0f);
                        l46Var.p0(objR12);
                    }
                    jxVar = (jx) objR12;
                    e89VarI = q1c.i(x16Var13, l46Var);
                    x16Var8 = x16Var18;
                    e89VarI2 = q1c.i(x16Var8, l46Var);
                    x16 x16Var26 = x16Var16;
                    e89VarI3 = q1c.i(x16Var26, l46Var);
                    boolean z319 = z15;
                    e89VarI4 = q1c.i(x16Var17, l46Var);
                    x16 x16Var27 = x16Var13;
                    Object[] objArr4 = {egdVar5, Boolean.valueOf(z5), Boolean.valueOf(z17), jieVar, gh6VarW0};
                    if (i49 > 256) {
                        egdVar3 = egdVar5;
                        if ((i45 & 384) != 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                    } else {
                        egdVar3 = egdVar5;
                        if ((i45 & 384) != 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                    }
                    aw2Var4 = aw2Var2;
                    boolean zI8 = z24 | l46Var.i(aw2Var4);
                    if ((i45 & 458752) == 131072) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z3110 = zI8 | z25;
                    z26 = z17;
                    zH3 = z3110 | l46Var.h(z26) | l46Var.g(jieVar) | l46Var.i(gh6VarW0) | l46Var.g(e89VarI3) | l46Var.g(e89VarI4) | l46Var.g(e89VarI2);
                    objR13 = l46Var.R();
                    if (zH3) {
                        objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                        z27 = z26;
                        jieVar2 = jieVar;
                        e89Var4 = e89VarI2;
                        l46Var.p0(objR13);
                    } else {
                        objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                        z27 = z26;
                        jieVar2 = jieVar;
                        e89Var4 = e89VarI2;
                        l46Var.p0(objR13);
                    }
                    af1.r(objArr4, (l26) objR13, l46Var);
                    Integer numValueOf5 = Integer.valueOf(i10);
                    if ((i45 & 7168) == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    zI2 = l46Var.i(jxVar) | z28 | ((i49 <= 256 && l46Var.g(egdVar3)) || (i45 & 384) == 256) | l46Var.g(e89VarI) | l46Var.g(e89Var4);
                    objR14 = l46Var.R();
                    if (zI2) {
                        objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                        jxVar2 = jxVar;
                        l46Var.p0(objR14);
                    } else {
                        objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                        jxVar2 = jxVar;
                        l46Var.p0(objR14);
                    }
                    af1.p(egdVar3, numValueOf5, (l26) objR14, l46Var);
                    e1b e1bVarA5 = dt1.a.a(gw8Var2);
                    final egd egdVar13 = egdVar3;
                    l26 l26Var8 = new l26() { // from class: ofd
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // defpackage.l26
                        public final Object z(Object obj3, Object obj4) {
                            l46 l46Var2 = (l46) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                FillElement fillElement = b.c;
                                j09 j09VarD = j09Var.D(fillElement);
                                xn8 xn8VarC = s21.c(ndb.b, false);
                                int iHashCode = Long.hashCode(l46Var2.T);
                                u8a u8aVarM = l46Var2.m();
                                j09 j09VarJ = m93.J(l46Var2, j09VarD);
                                lf2.q.getClass();
                                l46Var2.j0();
                                boolean z3111 = l46Var2.S;
                                ov7 ov7Var = LayoutNode.h1;
                                if (z3111) {
                                    l46Var2.l(ov7Var);
                                } else {
                                    l46Var2.s0();
                                }
                                he2 he2Var = hj6.z;
                                dec.l(he2Var, l46Var2, xn8VarC);
                                he2 he2Var2 = hj6.y;
                                dec.l(he2Var2, l46Var2, u8aVarM);
                                Integer numValueOf6 = Integer.valueOf(iHashCode);
                                he2 he2Var3 = hj6.X;
                                dec.l(he2Var3, l46Var2, numValueOf6);
                                dec.k(l46Var2);
                                he2 he2Var4 = hj6.x;
                                dec.l(he2Var4, l46Var2, j09VarJ);
                                j09 j09VarY = ynb.Y(fillElement, xw9Var4);
                                c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                                int iHashCode2 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM2 = l46Var2.m();
                                j09 j09VarJ2 = m93.J(l46Var2, j09VarY);
                                l46Var2.j0();
                                if (l46Var2.S) {
                                    l46Var2.l(ov7Var);
                                } else {
                                    l46Var2.s0();
                                }
                                dec.l(he2Var, l46Var2, c92VarA);
                                dec.l(he2Var2, l46Var2, u8aVarM2);
                                ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                                dec.l(he2Var4, l46Var2, j09VarJ2);
                                int i67 = i10;
                                if (i67 == 0) {
                                    ib8.r(24.0f, 91962542, l46Var2, l46Var2, g09.a);
                                    l26Var3.z(l46Var2, 0);
                                    l46Var2.r(false);
                                } else {
                                    l46Var2.f0(92030773);
                                    l46Var2.r(false);
                                }
                                s13 s13Var = (s13) e89Var.getValue();
                                boolean z3112 = z27;
                                boolean z3113 = !z3112 || z23;
                                float fFloatValue = ((Number) jxVar2.e()).floatValue();
                                egd egdVar14 = egdVar13;
                                boolean zG2 = l46Var2.g(egdVar14);
                                Object objR111 = l46Var2.R();
                                if (zG2 || objR111 == sf2.a) {
                                    objR111 = new ffd(egdVar14, 0);
                                    l46Var2.p0(objR111);
                                }
                                p8c.a(egdVar14, i67, s13Var, i47, z317, z3112, list4, jieVar2, z3113, fFloatValue, fy9Var5, (x16) objR111, l46Var2, 6);
                                l46Var2.r(true);
                                l46Var2.r(true);
                            } else {
                                l46Var2.Z();
                            }
                            return wef.a;
                        }
                    };
                    l26Var2 = l26Var3;
                    z8 = z317;
                    z9 = z27;
                    mh3.a(e1bVarA5, af1.b0(1669815857, l26Var8, l46Var), l46Var, 56);
                    fy9Var2 = fy9Var7;
                    x16Var6 = x16Var26;
                    z10 = z319;
                    x16Var5 = x16Var27;
                    x16Var7 = x16Var17;
                    xw9Var3 = xw9Var4;
                    i42 = i10;
                    i43 = i47;
                } else {
                    l46Var.Z();
                    x16Var5 = x16Var;
                    x16Var6 = x16Var2;
                    x16Var7 = x16Var3;
                    i42 = i10;
                    z8 = z6;
                    xw9Var3 = xw9Var2;
                    egdVar3 = egdVar2;
                    i43 = iC;
                    z5 = z5;
                    z9 = z2;
                    fy9Var2 = fy9Var;
                    l26Var2 = l26Var;
                    z10 = z4;
                    x16Var8 = x16Var4;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    final int i67 = 2;
                    ojbVarV.d = new l26() { // from class: nfd
                        @Override // defpackage.l26
                        public final Object z(Object obj3, Object obj4) {
                            int i68 = i67;
                            wef wefVar = wef.a;
                            int i69 = i4;
                            int i610 = i3;
                            switch (i68) {
                                case 0:
                                    ((Integer) obj4).getClass();
                                    int iP = k99.P(i610 | 1);
                                    int iP2 = k99.P(i69);
                                    p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP, iP2, i5);
                                    break;
                                case 1:
                                    ((Integer) obj4).getClass();
                                    int iP3 = k99.P(i610 | 1);
                                    int iP4 = k99.P(i69);
                                    p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP3, iP4, i5);
                                    break;
                                default:
                                    ((Integer) obj4).getClass();
                                    int iP5 = k99.P(i610 | 1);
                                    int iP6 = k99.P(i69);
                                    p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP5, iP6, i5);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                }
            }
            i8 |= 3072;
            i10 = i;
            i12 = i5 & 16;
            i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            iC = i2;
            if (i12 == 0) {
                i14 = 8192;
            } else {
                i14 = 8192;
            }
            i15 = i8 | i14;
            i16 = i5 & 32;
            if (i16 != 0) {
                i15 |= 196608;
                z5 = z;
            } else {
                z5 = z;
                if ((i3 & 196608) == 0) {
                    if (l46Var.h(z5)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i15 |= i17;
                }
            }
            i18 = i15 | 524288;
            i19 = i5 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i19 != 0) {
                i21 = i15 | 13107200;
            } else {
                if ((16777216 & i3) == 0) {
                    zI = l46Var.g(fy9Var);
                } else {
                    zI = l46Var.i(fy9Var);
                }
                if (zI) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i21 = i18 | i20;
            }
            i22 = i5 & 256;
            if (i22 != 0) {
                i21 |= 100663296;
                z6 = z3;
            } else {
                z6 = z3;
                if ((i3 & 100663296) == 0) {
                    if (l46Var.h(z6)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i21 |= i23;
                }
            }
            i24 = i5 & 512;
            if (i24 != 0) {
                if ((i3 & 805306368) == 0) {
                    if (l46Var.i(l26Var)) {
                        i25 = 536870912;
                    } else {
                        i25 = 268435456;
                    }
                    i21 |= i25;
                }
                i26 = i5 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i26 != 0) {
                    i27 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    if (l46Var.i(x16Var)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i4 | i28;
                } else {
                    i27 = i4;
                }
                i29 = i5 & 2048;
                if (i29 != 0) {
                    i31 = i27 | 48;
                } else {
                    if (l46Var.i(x16Var2)) {
                        i30 = 32;
                    } else {
                        i30 = 16;
                    }
                    i31 = i27 | i30;
                }
                i32 = i31;
                i33 = i5 & 4096;
                if (i33 != 0) {
                    i35 = i32 | 384;
                } else {
                    if (l46Var.i(x16Var3)) {
                        i34 = 256;
                    } else {
                        i34 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i35 = i32 | i34;
                }
                i36 = i5 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                if (i36 != 0) {
                    i38 = i35 | 3072;
                } else {
                    int i516 = i35;
                    if (l46Var.h(z4)) {
                        i37 = 2048;
                    } else {
                        i37 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i38 = i516 | i37;
                }
                i39 = i5 & 16384;
                if (i39 != 0) {
                    i41 = i38 | 24576;
                } else {
                    i40 = i38;
                    if ((i4 & 24576) == 0) {
                        if (l46Var.i(x16Var4)) {
                            i13 = 16384;
                        }
                        i41 = i40 | i13;
                    } else {
                        i41 = i40;
                    }
                }
                if ((i21 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (l46Var.W(i21 & 1, z7)) {
                    l46Var.b0();
                    i44 = i3 & 1;
                    obj = sf2.a;
                    if (i44 != 0) {
                        if (i54 != 0) {
                            xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                        } else {
                            xw9VarQ = xw9Var2;
                        }
                        if ((i5 & 4) != 0) {
                            egdVarU = u(l46Var);
                            i21 &= -897;
                        } else {
                            egdVarU = egdVar2;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if ((i5 & 16) != 0) {
                            i21 &= -57345;
                            iC = ((d1) TarotCardType.getEntries()).c();
                        }
                        if (i16 != 0) {
                            z5 = true;
                        }
                        if (i10 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        i45 = i21 & (-3670017);
                        if (i19 != 0) {
                            fy9Var3 = null;
                        } else {
                            fy9Var3 = fy9Var;
                        }
                        if (i22 != 0) {
                            z6 = false;
                        }
                        if (i24 != 0) {
                            l26VarB0 = af1.b0(876435724, new z8d(1, egdVarU), l46Var);
                        } else {
                            l26VarB0 = l26Var;
                        }
                        if (i26 != 0) {
                            objR4 = l46Var.R();
                            if (objR4 == obj) {
                                objR4 = new ead(14);
                                l46Var.p0(objR4);
                            }
                            x16Var9 = (x16) objR4;
                        } else {
                            x16Var9 = x16Var;
                        }
                        if (i29 != 0) {
                            objR3 = l46Var.R();
                            if (objR3 == obj) {
                                objR3 = new ead(15);
                                l46Var.p0(objR3);
                            }
                            x16Var10 = (x16) objR3;
                        } else {
                            x16Var10 = x16Var2;
                        }
                        if (i33 != 0) {
                            objR2 = l46Var.R();
                            if (objR2 == obj) {
                                objR2 = new ead(16);
                                l46Var.p0(objR2);
                            }
                            x16Var11 = (x16) objR2;
                        } else {
                            i41 = i41;
                            x16Var11 = x16Var3;
                        }
                        if (i36 != 0) {
                            z12 = true;
                        } else {
                            z12 = z4;
                        }
                        x16 x16Var112 = x16Var11;
                        if (i39 != 0) {
                            objR = l46Var.R();
                            if (objR == obj) {
                                objR = new ead(17);
                                l46Var.p0(objR);
                            }
                            xw9VarQ = xw9VarQ;
                            x16Var12 = (x16) objR;
                        } else {
                            x16Var12 = x16Var4;
                        }
                        z13 = z6;
                        z14 = z11;
                        fy9Var4 = fy9Var3;
                        l26Var3 = l26VarB0;
                        x16Var13 = x16Var9;
                        x16Var14 = x16Var10;
                        egdVar4 = egdVarU;
                        i46 = iC;
                        z15 = z12;
                        x16Var15 = x16Var112;
                    } else {
                        if (i54 != 0) {
                            xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                        } else {
                            xw9VarQ = xw9Var2;
                        }
                        if ((i5 & 4) != 0) {
                            egdVarU = u(l46Var);
                            i21 &= -897;
                        } else {
                            egdVarU = egdVar2;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if ((i5 & 16) != 0) {
                            i21 &= -57345;
                            iC = ((d1) TarotCardType.getEntries()).c();
                        }
                        if (i16 != 0) {
                            z5 = true;
                        }
                        if (i10 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        i45 = i21 & (-3670017);
                        if (i19 != 0) {
                            fy9Var3 = null;
                        } else {
                            fy9Var3 = fy9Var;
                        }
                        if (i22 != 0) {
                            z6 = false;
                        }
                        if (i24 != 0) {
                            l26VarB0 = af1.b0(876435724, new z8d(1, egdVarU), l46Var);
                        } else {
                            l26VarB0 = l26Var;
                        }
                        if (i26 != 0) {
                            objR4 = l46Var.R();
                            if (objR4 == obj) {
                                objR4 = new ead(14);
                                l46Var.p0(objR4);
                            }
                            x16Var9 = (x16) objR4;
                        } else {
                            x16Var9 = x16Var;
                        }
                        if (i29 != 0) {
                            objR3 = l46Var.R();
                            if (objR3 == obj) {
                                objR3 = new ead(15);
                                l46Var.p0(objR3);
                            }
                            x16Var10 = (x16) objR3;
                        } else {
                            x16Var10 = x16Var2;
                        }
                        if (i33 != 0) {
                            objR2 = l46Var.R();
                            if (objR2 == obj) {
                                objR2 = new ead(16);
                                l46Var.p0(objR2);
                            }
                            x16Var11 = (x16) objR2;
                        } else {
                            i41 = i41;
                            x16Var11 = x16Var3;
                        }
                        if (i36 != 0) {
                            z12 = true;
                        } else {
                            z12 = z4;
                        }
                        x16 x16Var113 = x16Var11;
                        if (i39 != 0) {
                            objR = l46Var.R();
                            if (objR == obj) {
                                objR = new ead(17);
                                l46Var.p0(objR);
                            }
                            xw9VarQ = xw9VarQ;
                            x16Var12 = (x16) objR;
                        } else {
                            x16Var12 = x16Var4;
                        }
                        z13 = z6;
                        z14 = z11;
                        fy9Var4 = fy9Var3;
                        l26Var3 = l26VarB0;
                        x16Var13 = x16Var9;
                        x16Var14 = x16Var10;
                        egdVar4 = egdVarU;
                        i46 = iC;
                        z15 = z12;
                        x16Var15 = x16Var113;
                    }
                    l46Var.s();
                    xw9Var4 = xw9VarQ;
                    mixedDeckSnapshot = (MixedDeckSnapshot) l46Var.k(snd.b);
                    if (mixedDeckSnapshot != null) {
                        egdVar6 = egdVar4;
                        l46Var.f0(-810781893);
                        zG = l46Var.g(mixedDeckSnapshot);
                        objR16 = l46Var.R();
                        if (zG) {
                            List<String> cardOrder4 = mixedDeckSnapshot.getCardOrder();
                            arrayList2 = new ArrayList();
                            it = cardOrder4.iterator();
                            while (it.hasNext()) {
                                int i517 = i46;
                                tarotSkinIdentifySkinFor = mixedDeckSnapshot.skinFor((String) it.next());
                                if (tarotSkinIdentifySkinFor != null) {
                                    arrayList2.add(tarotSkinIdentifySkinFor);
                                }
                                i46 = i517;
                            }
                            i47 = i46;
                            pr4 pr4Var4 = dt1.a;
                            int iF4 = bm8.F(t72.u(arrayList2, 10));
                            linkedHashMap = new LinkedHashMap(iF4 >= 16 ? iF4 : 16);
                            it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                TarotSkinIdentify tarotSkinIdentify4 = (TarotSkinIdentify) it2.next();
                                boolean z3111 = z5;
                                iy9 iy9Var4 = new iy9(Integer.valueOf(hfc.q(tarotSkinIdentify4).c()), Float.valueOf(Math.min(tarotSkinIdentify4.getAspectRatio(), 0.5714286f)));
                                linkedHashMap.put(iy9Var4.d(), iy9Var4.e());
                                it2 = it2;
                                z5 = z3111;
                            }
                            z29 = z5;
                            l46Var.p0(linkedHashMap);
                            objR16 = linkedHashMap;
                        } else {
                            List<String> cardOrder5 = mixedDeckSnapshot.getCardOrder();
                            arrayList2 = new ArrayList();
                            it = cardOrder5.iterator();
                            while (it.hasNext()) {
                                int i518 = i46;
                                tarotSkinIdentifySkinFor = mixedDeckSnapshot.skinFor((String) it.next());
                                if (tarotSkinIdentifySkinFor != null) {
                                    arrayList2.add(tarotSkinIdentifySkinFor);
                                }
                                i46 = i518;
                            }
                            i47 = i46;
                            pr4 pr4Var5 = dt1.a;
                            int iF5 = bm8.F(t72.u(arrayList2, 10));
                            linkedHashMap = new LinkedHashMap(iF5 >= 16 ? iF5 : 16);
                            it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                TarotSkinIdentify tarotSkinIdentify5 = (TarotSkinIdentify) it2.next();
                                boolean z3112 = z5;
                                iy9 iy9Var5 = new iy9(Integer.valueOf(hfc.q(tarotSkinIdentify5).c()), Float.valueOf(Math.min(tarotSkinIdentify5.getAspectRatio(), 0.5714286f)));
                                linkedHashMap.put(iy9Var5.d(), iy9Var5.e());
                                it2 = it2;
                                z5 = z3112;
                            }
                            z29 = z5;
                            l46Var.p0(linkedHashMap);
                            objR16 = linkedHashMap;
                        }
                        linkedHashMapF = dt1.f((Map) objR16, l46Var);
                        if (linkedHashMapF == null) {
                            l46Var.r(false);
                            ojbVarV3 = l46Var.v();
                            if (ojbVarV3 != null) {
                                final int i519 = 0;
                                final boolean z3113 = z29;
                                final int i5110 = i10;
                                final int i5111 = i47;
                                ojbVarV3.d = new l26() { // from class: nfd
                                    @Override // defpackage.l26
                                    public final Object z(Object obj3, Object obj4) {
                                        int i68 = i519;
                                        wef wefVar = wef.a;
                                        int i69 = i4;
                                        int i610 = i3;
                                        switch (i68) {
                                            case 0:
                                                ((Integer) obj4).getClass();
                                                int iP = k99.P(i610 | 1);
                                                int iP2 = k99.P(i69);
                                                p8c.i(j09Var, xw9Var4, egdVar6, i5110, i5111, z3113, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP, iP2, i5);
                                                break;
                                            case 1:
                                                ((Integer) obj4).getClass();
                                                int iP3 = k99.P(i610 | 1);
                                                int iP4 = k99.P(i69);
                                                p8c.i(j09Var, xw9Var4, egdVar6, i5110, i5111, z3113, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP3, iP4, i5);
                                                break;
                                            default:
                                                ((Integer) obj4).getClass();
                                                int iP5 = k99.P(i610 | 1);
                                                int iP6 = k99.P(i69);
                                                p8c.i(j09Var, xw9Var4, egdVar6, i5110, i5111, z3113, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP5, iP6, i5);
                                                break;
                                        }
                                        return wefVar;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        egdVar5 = egdVar6;
                        z5 = z29;
                        r3 = 0;
                        gw8Var = new gw8(linkedHashMapF);
                        l46Var.r(false);
                    } else {
                        mixedDeckSnapshot = mixedDeckSnapshot;
                        egdVar5 = egdVar4;
                        i47 = i46;
                        r3 = 0;
                        l46Var.f0(-810539412);
                        l46Var.r(false);
                        gw8Var = null;
                    }
                    if (mixedDeckSnapshot == null) {
                        l46Var.f0(-810470808);
                        if (fy9Var4 == null) {
                            l46Var.f0(1774971708);
                            fy9VarE = dt1.e(null, l46Var, r3, 6);
                            l46Var.r(r3);
                        } else {
                            l46Var.f0(1774971088);
                            l46Var.r(r3);
                            fy9VarE = fy9Var4;
                        }
                        if (fy9VarE == null) {
                            l46Var.r(r3);
                            ojbVarV2 = l46Var.v();
                            if (ojbVarV2 != null) {
                                final int i68 = 1;
                                final boolean z3114 = z5;
                                final int i69 = i10;
                                final egd egdVar14 = egdVar5;
                                final int i610 = i47;
                                ojbVarV2.d = new l26() { // from class: nfd
                                    @Override // defpackage.l26
                                    public final Object z(Object obj3, Object obj4) {
                                        int i611 = i68;
                                        wef wefVar = wef.a;
                                        int i612 = i4;
                                        int i613 = i3;
                                        switch (i611) {
                                            case 0:
                                                ((Integer) obj4).getClass();
                                                int iP = k99.P(i613 | 1);
                                                int iP2 = k99.P(i612);
                                                p8c.i(j09Var, xw9Var4, egdVar14, i69, i610, z3114, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP, iP2, i5);
                                                break;
                                            case 1:
                                                ((Integer) obj4).getClass();
                                                int iP3 = k99.P(i613 | 1);
                                                int iP4 = k99.P(i612);
                                                p8c.i(j09Var, xw9Var4, egdVar14, i69, i610, z3114, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP3, iP4, i5);
                                                break;
                                            default:
                                                ((Integer) obj4).getClass();
                                                int iP5 = k99.P(i613 | 1);
                                                int iP6 = k99.P(i612);
                                                p8c.i(j09Var, xw9Var4, egdVar14, i69, i610, z3114, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP5, iP6, i5);
                                                break;
                                        }
                                        return wefVar;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        l46Var.r(r3);
                        fy9Var5 = fy9VarE;
                    } else {
                        z5 = z5;
                        l46Var.f0(-810390612);
                        l46Var.r(r3);
                        fy9Var5 = null;
                    }
                    objR5 = l46Var.R();
                    if (objR5 == obj) {
                        objR5 = af1.E(l46Var);
                        l46Var.p0(objR5);
                    }
                    aw2Var = (aw2) objR5;
                    objR6 = l46Var.R();
                    if (objR6 == obj) {
                        objR6 = q1c.f(s13.a);
                        l46Var.p0(objR6);
                    }
                    e89Var = (e89) objR6;
                    i48 = egdVar5.a;
                    fy9 fy9Var8 = fy9Var4;
                    i49 = (i45 & 896) ^ 384;
                    final boolean z3115 = z13;
                    if (i49 > 256) {
                        gw8Var2 = gw8Var;
                        if ((i45 & 384) != 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    } else {
                        gw8Var2 = gw8Var;
                        if ((i45 & 384) != 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    }
                    i50 = (57344 & i45) ^ 24576;
                    boolean z3116 = z16;
                    if (i50 > 16384) {
                        z17 = z14;
                        if ((i45 & 24576) != 16384) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                    } else {
                        z17 = z14;
                        if ((i45 & 24576) != 16384) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                    }
                    z19 = z3116 | z18;
                    Object objR111 = l46Var.R();
                    if (z19) {
                        if (i47 < 0) {
                            qc0.j("Failed requirement.");
                            return;
                        }
                        ycgVar = new ycg(i48, i48 >> 31);
                        arrayList = new ArrayList(i47);
                        i51 = 0;
                        while (i51 < i47) {
                            arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                            i51++;
                            aw2Var = aw2Var;
                            x16Var14 = x16Var14;
                            x16Var12 = x16Var12;
                            x16Var15 = x16Var15;
                        }
                        aw2Var2 = aw2Var;
                        x16Var16 = x16Var14;
                        x16Var17 = x16Var15;
                        x16Var18 = x16Var12;
                        l46Var.p0(arrayList);
                        obj2 = arrayList;
                    } else {
                        if (i47 < 0) {
                            qc0.j("Failed requirement.");
                            return;
                        }
                        ycgVar = new ycg(i48, i48 >> 31);
                        arrayList = new ArrayList(i47);
                        i51 = 0;
                        while (i51 < i47) {
                            arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                            i51++;
                            aw2Var = aw2Var;
                            x16Var14 = x16Var14;
                            x16Var12 = x16Var12;
                            x16Var15 = x16Var15;
                        }
                        aw2Var2 = aw2Var;
                        x16Var16 = x16Var14;
                        x16Var17 = x16Var15;
                        x16Var18 = x16Var12;
                        l46Var.p0(arrayList);
                        obj2 = arrayList;
                    }
                    final List list5 = (List) obj2;
                    if (i49 <= 256) {
                    }
                    z20 = ((i50 <= 16384 && l46Var.e(i47)) || (i45 & 24576) == 16384) | ((i49 <= 256 && l46Var.g(egdVar5)) || (i45 & 384) == 256);
                    objR7 = l46Var.R();
                    if (z20) {
                        objR7 = new jie(i47, i48);
                        l46Var.p0(objR7);
                    } else {
                        objR7 = new jie(i47, i48);
                        l46Var.p0(objR7);
                    }
                    jieVar = (jie) objR7;
                    gh6VarW0 = kj0.w0(l46Var);
                    if (egdVar5.a() == hgd.e) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    i52 = i41 >> 6;
                    zH = l46Var.h(z21);
                    objR8 = l46Var.R();
                    if (zH) {
                        objR8 = q1c.f(Boolean.valueOf(!z21));
                        l46Var.p0(objR8);
                    } else {
                        objR8 = q1c.f(Boolean.valueOf(!z21));
                        l46Var.p0(objR8);
                    }
                    e89Var2 = (e89) objR8;
                    objR9 = l46Var.R();
                    if (objR9 == obj) {
                        objR9 = q1c.f(Boolean.FALSE);
                        l46Var.p0(objR9);
                    }
                    e89Var3 = (e89) objR9;
                    objR10 = l46Var.R();
                    if (objR10 == obj) {
                        objR10 = af1.E(l46Var);
                        l46Var.p0(objR10);
                    }
                    aw2Var3 = (aw2) objR10;
                    Boolean boolValueOf5 = Boolean.valueOf(z21);
                    zH2 = l46Var.h(z21) | l46Var.g(e89Var2);
                    objR11 = l46Var.R();
                    if (zH2) {
                        objR11 = new vm4(z21, e89Var3, e89Var2, null);
                        l46Var.p0(objR11);
                    } else {
                        objR11 = new vm4(z21, e89Var3, e89Var2, null);
                        l46Var.p0(objR11);
                    }
                    af1.o((l26) objR11, l46Var, boolValueOf5);
                    if (((Boolean) e89Var3.getValue()).booleanValue()) {
                        l46Var.f0(1968840980);
                        zI3 = l46Var.i(aw2Var3);
                        objR15 = l46Var.R();
                        if (zI3) {
                            i53 = 1;
                            objR15 = new om4(aw2Var3, e89Var3, i53);
                            l46Var.p0(objR15);
                        } else {
                            i53 = 1;
                            objR15 = new om4(aw2Var3, e89Var3, i53);
                            l46Var.p0(objR15);
                        }
                        vd0.i(i52 & 112, (a26) objR15, l46Var, null, z15);
                        z22 = false;
                        l46Var.r(false);
                    } else {
                        i53 = 1;
                        z22 = false;
                        l46Var.f0(1969148500);
                        l46Var.r(false);
                    }
                    if (((Boolean) e89Var2.getValue()).booleanValue()) {
                        z23 = z22;
                    } else {
                        z23 = z22;
                    }
                    objR12 = l46Var.R();
                    if (objR12 == obj) {
                        objR12 = qk2.d(0.0f);
                        l46Var.p0(objR12);
                    }
                    jxVar = (jx) objR12;
                    e89VarI = q1c.i(x16Var13, l46Var);
                    x16Var8 = x16Var18;
                    e89VarI2 = q1c.i(x16Var8, l46Var);
                    x16 x16Var28 = x16Var16;
                    e89VarI3 = q1c.i(x16Var28, l46Var);
                    boolean z3117 = z15;
                    e89VarI4 = q1c.i(x16Var17, l46Var);
                    x16 x16Var29 = x16Var13;
                    Object[] objArr5 = {egdVar5, Boolean.valueOf(z5), Boolean.valueOf(z17), jieVar, gh6VarW0};
                    if (i49 > 256) {
                        egdVar3 = egdVar5;
                        if ((i45 & 384) != 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                    } else {
                        egdVar3 = egdVar5;
                        if ((i45 & 384) != 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                    }
                    aw2Var4 = aw2Var2;
                    boolean zI9 = z24 | l46Var.i(aw2Var4);
                    if ((i45 & 458752) == 131072) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z3118 = zI9 | z25;
                    z26 = z17;
                    zH3 = z3118 | l46Var.h(z26) | l46Var.g(jieVar) | l46Var.i(gh6VarW0) | l46Var.g(e89VarI3) | l46Var.g(e89VarI4) | l46Var.g(e89VarI2);
                    objR13 = l46Var.R();
                    if (zH3) {
                        objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                        z27 = z26;
                        jieVar2 = jieVar;
                        e89Var4 = e89VarI2;
                        l46Var.p0(objR13);
                    } else {
                        objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                        z27 = z26;
                        jieVar2 = jieVar;
                        e89Var4 = e89VarI2;
                        l46Var.p0(objR13);
                    }
                    af1.r(objArr5, (l26) objR13, l46Var);
                    Integer numValueOf6 = Integer.valueOf(i10);
                    if ((i45 & 7168) == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    zI2 = l46Var.i(jxVar) | z28 | ((i49 <= 256 && l46Var.g(egdVar3)) || (i45 & 384) == 256) | l46Var.g(e89VarI) | l46Var.g(e89Var4);
                    objR14 = l46Var.R();
                    if (zI2) {
                        objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                        jxVar2 = jxVar;
                        l46Var.p0(objR14);
                    } else {
                        objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                        jxVar2 = jxVar;
                        l46Var.p0(objR14);
                    }
                    af1.p(egdVar3, numValueOf6, (l26) objR14, l46Var);
                    e1b e1bVarA6 = dt1.a.a(gw8Var2);
                    final egd egdVar15 = egdVar3;
                    l26 l26Var9 = new l26() { // from class: ofd
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // defpackage.l26
                        public final Object z(Object obj3, Object obj4) {
                            l46 l46Var2 = (l46) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                FillElement fillElement = b.c;
                                j09 j09VarD = j09Var.D(fillElement);
                                xn8 xn8VarC = s21.c(ndb.b, false);
                                int iHashCode = Long.hashCode(l46Var2.T);
                                u8a u8aVarM = l46Var2.m();
                                j09 j09VarJ = m93.J(l46Var2, j09VarD);
                                lf2.q.getClass();
                                l46Var2.j0();
                                boolean z3119 = l46Var2.S;
                                ov7 ov7Var = LayoutNode.h1;
                                if (z3119) {
                                    l46Var2.l(ov7Var);
                                } else {
                                    l46Var2.s0();
                                }
                                he2 he2Var = hj6.z;
                                dec.l(he2Var, l46Var2, xn8VarC);
                                he2 he2Var2 = hj6.y;
                                dec.l(he2Var2, l46Var2, u8aVarM);
                                Integer numValueOf7 = Integer.valueOf(iHashCode);
                                he2 he2Var3 = hj6.X;
                                dec.l(he2Var3, l46Var2, numValueOf7);
                                dec.k(l46Var2);
                                he2 he2Var4 = hj6.x;
                                dec.l(he2Var4, l46Var2, j09VarJ);
                                j09 j09VarY = ynb.Y(fillElement, xw9Var4);
                                c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                                int iHashCode2 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM2 = l46Var2.m();
                                j09 j09VarJ2 = m93.J(l46Var2, j09VarY);
                                l46Var2.j0();
                                if (l46Var2.S) {
                                    l46Var2.l(ov7Var);
                                } else {
                                    l46Var2.s0();
                                }
                                dec.l(he2Var, l46Var2, c92VarA);
                                dec.l(he2Var2, l46Var2, u8aVarM2);
                                ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                                dec.l(he2Var4, l46Var2, j09VarJ2);
                                int i611 = i10;
                                if (i611 == 0) {
                                    ib8.r(24.0f, 91962542, l46Var2, l46Var2, g09.a);
                                    l26Var3.z(l46Var2, 0);
                                    l46Var2.r(false);
                                } else {
                                    l46Var2.f0(92030773);
                                    l46Var2.r(false);
                                }
                                s13 s13Var = (s13) e89Var.getValue();
                                boolean z31110 = z27;
                                boolean z31111 = !z31110 || z23;
                                float fFloatValue = ((Number) jxVar2.e()).floatValue();
                                egd egdVar16 = egdVar15;
                                boolean zG2 = l46Var2.g(egdVar16);
                                Object objR112 = l46Var2.R();
                                if (zG2 || objR112 == sf2.a) {
                                    objR112 = new ffd(egdVar16, 0);
                                    l46Var2.p0(objR112);
                                }
                                p8c.a(egdVar16, i611, s13Var, i47, z3115, z31110, list5, jieVar2, z31111, fFloatValue, fy9Var5, (x16) objR112, l46Var2, 6);
                                l46Var2.r(true);
                                l46Var2.r(true);
                            } else {
                                l46Var2.Z();
                            }
                            return wef.a;
                        }
                    };
                    l26Var2 = l26Var3;
                    z8 = z3115;
                    z9 = z27;
                    mh3.a(e1bVarA6, af1.b0(1669815857, l26Var9, l46Var), l46Var, 56);
                    fy9Var2 = fy9Var8;
                    x16Var6 = x16Var28;
                    z10 = z3117;
                    x16Var5 = x16Var29;
                    x16Var7 = x16Var17;
                    xw9Var3 = xw9Var4;
                    i42 = i10;
                    i43 = i47;
                } else {
                    l46Var.Z();
                    x16Var5 = x16Var;
                    x16Var6 = x16Var2;
                    x16Var7 = x16Var3;
                    i42 = i10;
                    z8 = z6;
                    xw9Var3 = xw9Var2;
                    egdVar3 = egdVar2;
                    i43 = iC;
                    z5 = z5;
                    z9 = z2;
                    fy9Var2 = fy9Var;
                    l26Var2 = l26Var;
                    z10 = z4;
                    x16Var8 = x16Var4;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    final int i611 = 2;
                    ojbVarV.d = new l26() { // from class: nfd
                        @Override // defpackage.l26
                        public final Object z(Object obj3, Object obj4) {
                            int i612 = i611;
                            wef wefVar = wef.a;
                            int i613 = i4;
                            int i614 = i3;
                            switch (i612) {
                                case 0:
                                    ((Integer) obj4).getClass();
                                    int iP = k99.P(i614 | 1);
                                    int iP2 = k99.P(i613);
                                    p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP, iP2, i5);
                                    break;
                                case 1:
                                    ((Integer) obj4).getClass();
                                    int iP3 = k99.P(i614 | 1);
                                    int iP4 = k99.P(i613);
                                    p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP3, iP4, i5);
                                    break;
                                default:
                                    ((Integer) obj4).getClass();
                                    int iP5 = k99.P(i614 | 1);
                                    int iP6 = k99.P(i613);
                                    p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP5, iP6, i5);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                }
            }
            i21 |= 805306368;
            i26 = i5 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i26 != 0) {
                i27 = i4 | 6;
            } else if ((i4 & 6) == 0) {
                if (l46Var.i(x16Var)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i4 | i28;
            } else {
                i27 = i4;
            }
            i29 = i5 & 2048;
            if (i29 != 0) {
                i31 = i27 | 48;
            } else {
                if (l46Var.i(x16Var2)) {
                    i30 = 32;
                } else {
                    i30 = 16;
                }
                i31 = i27 | i30;
            }
            i32 = i31;
            i33 = i5 & 4096;
            if (i33 != 0) {
                i35 = i32 | 384;
            } else {
                if (l46Var.i(x16Var3)) {
                    i34 = 256;
                } else {
                    i34 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i35 = i32 | i34;
            }
            i36 = i5 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
            if (i36 != 0) {
                i38 = i35 | 3072;
            } else {
                int i5112 = i35;
                if (l46Var.h(z4)) {
                    i37 = 2048;
                } else {
                    i37 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i38 = i5112 | i37;
            }
            i39 = i5 & 16384;
            if (i39 != 0) {
                i41 = i38 | 24576;
            } else {
                i40 = i38;
                if ((i4 & 24576) == 0) {
                    if (l46Var.i(x16Var4)) {
                        i13 = 16384;
                    }
                    i41 = i40 | i13;
                } else {
                    i41 = i40;
                }
            }
            if ((i21 & 306783379) == 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (l46Var.W(i21 & 1, z7)) {
                l46Var.b0();
                i44 = i3 & 1;
                obj = sf2.a;
                if (i44 != 0) {
                    if (i54 != 0) {
                        xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                    } else {
                        xw9VarQ = xw9Var2;
                    }
                    if ((i5 & 4) != 0) {
                        egdVarU = u(l46Var);
                        i21 &= -897;
                    } else {
                        egdVarU = egdVar2;
                    }
                    if (i9 != 0) {
                        i10 = 0;
                    }
                    if ((i5 & 16) != 0) {
                        i21 &= -57345;
                        iC = ((d1) TarotCardType.getEntries()).c();
                    }
                    if (i16 != 0) {
                        z5 = true;
                    }
                    if (i10 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i45 = i21 & (-3670017);
                    if (i19 != 0) {
                        fy9Var3 = null;
                    } else {
                        fy9Var3 = fy9Var;
                    }
                    if (i22 != 0) {
                        z6 = false;
                    }
                    if (i24 != 0) {
                        l26VarB0 = af1.b0(876435724, new z8d(1, egdVarU), l46Var);
                    } else {
                        l26VarB0 = l26Var;
                    }
                    if (i26 != 0) {
                        objR4 = l46Var.R();
                        if (objR4 == obj) {
                            objR4 = new ead(14);
                            l46Var.p0(objR4);
                        }
                        x16Var9 = (x16) objR4;
                    } else {
                        x16Var9 = x16Var;
                    }
                    if (i29 != 0) {
                        objR3 = l46Var.R();
                        if (objR3 == obj) {
                            objR3 = new ead(15);
                            l46Var.p0(objR3);
                        }
                        x16Var10 = (x16) objR3;
                    } else {
                        x16Var10 = x16Var2;
                    }
                    if (i33 != 0) {
                        objR2 = l46Var.R();
                        if (objR2 == obj) {
                            objR2 = new ead(16);
                            l46Var.p0(objR2);
                        }
                        x16Var11 = (x16) objR2;
                    } else {
                        i41 = i41;
                        x16Var11 = x16Var3;
                    }
                    if (i36 != 0) {
                        z12 = true;
                    } else {
                        z12 = z4;
                    }
                    x16 x16Var114 = x16Var11;
                    if (i39 != 0) {
                        objR = l46Var.R();
                        if (objR == obj) {
                            objR = new ead(17);
                            l46Var.p0(objR);
                        }
                        xw9VarQ = xw9VarQ;
                        x16Var12 = (x16) objR;
                    } else {
                        x16Var12 = x16Var4;
                    }
                    z13 = z6;
                    z14 = z11;
                    fy9Var4 = fy9Var3;
                    l26Var3 = l26VarB0;
                    x16Var13 = x16Var9;
                    x16Var14 = x16Var10;
                    egdVar4 = egdVarU;
                    i46 = iC;
                    z15 = z12;
                    x16Var15 = x16Var114;
                } else {
                    if (i54 != 0) {
                        xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                    } else {
                        xw9VarQ = xw9Var2;
                    }
                    if ((i5 & 4) != 0) {
                        egdVarU = u(l46Var);
                        i21 &= -897;
                    } else {
                        egdVarU = egdVar2;
                    }
                    if (i9 != 0) {
                        i10 = 0;
                    }
                    if ((i5 & 16) != 0) {
                        i21 &= -57345;
                        iC = ((d1) TarotCardType.getEntries()).c();
                    }
                    if (i16 != 0) {
                        z5 = true;
                    }
                    if (i10 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i45 = i21 & (-3670017);
                    if (i19 != 0) {
                        fy9Var3 = null;
                    } else {
                        fy9Var3 = fy9Var;
                    }
                    if (i22 != 0) {
                        z6 = false;
                    }
                    if (i24 != 0) {
                        l26VarB0 = af1.b0(876435724, new z8d(1, egdVarU), l46Var);
                    } else {
                        l26VarB0 = l26Var;
                    }
                    if (i26 != 0) {
                        objR4 = l46Var.R();
                        if (objR4 == obj) {
                            objR4 = new ead(14);
                            l46Var.p0(objR4);
                        }
                        x16Var9 = (x16) objR4;
                    } else {
                        x16Var9 = x16Var;
                    }
                    if (i29 != 0) {
                        objR3 = l46Var.R();
                        if (objR3 == obj) {
                            objR3 = new ead(15);
                            l46Var.p0(objR3);
                        }
                        x16Var10 = (x16) objR3;
                    } else {
                        x16Var10 = x16Var2;
                    }
                    if (i33 != 0) {
                        objR2 = l46Var.R();
                        if (objR2 == obj) {
                            objR2 = new ead(16);
                            l46Var.p0(objR2);
                        }
                        x16Var11 = (x16) objR2;
                    } else {
                        i41 = i41;
                        x16Var11 = x16Var3;
                    }
                    if (i36 != 0) {
                        z12 = true;
                    } else {
                        z12 = z4;
                    }
                    x16 x16Var115 = x16Var11;
                    if (i39 != 0) {
                        objR = l46Var.R();
                        if (objR == obj) {
                            objR = new ead(17);
                            l46Var.p0(objR);
                        }
                        xw9VarQ = xw9VarQ;
                        x16Var12 = (x16) objR;
                    } else {
                        x16Var12 = x16Var4;
                    }
                    z13 = z6;
                    z14 = z11;
                    fy9Var4 = fy9Var3;
                    l26Var3 = l26VarB0;
                    x16Var13 = x16Var9;
                    x16Var14 = x16Var10;
                    egdVar4 = egdVarU;
                    i46 = iC;
                    z15 = z12;
                    x16Var15 = x16Var115;
                }
                l46Var.s();
                xw9Var4 = xw9VarQ;
                mixedDeckSnapshot = (MixedDeckSnapshot) l46Var.k(snd.b);
                if (mixedDeckSnapshot != null) {
                    egdVar6 = egdVar4;
                    l46Var.f0(-810781893);
                    zG = l46Var.g(mixedDeckSnapshot);
                    objR16 = l46Var.R();
                    if (zG) {
                        List<String> cardOrder6 = mixedDeckSnapshot.getCardOrder();
                        arrayList2 = new ArrayList();
                        it = cardOrder6.iterator();
                        while (it.hasNext()) {
                            int i5113 = i46;
                            tarotSkinIdentifySkinFor = mixedDeckSnapshot.skinFor((String) it.next());
                            if (tarotSkinIdentifySkinFor != null) {
                                arrayList2.add(tarotSkinIdentifySkinFor);
                            }
                            i46 = i5113;
                        }
                        i47 = i46;
                        pr4 pr4Var6 = dt1.a;
                        int iF6 = bm8.F(t72.u(arrayList2, 10));
                        linkedHashMap = new LinkedHashMap(iF6 >= 16 ? iF6 : 16);
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            TarotSkinIdentify tarotSkinIdentify6 = (TarotSkinIdentify) it2.next();
                            boolean z3119 = z5;
                            iy9 iy9Var6 = new iy9(Integer.valueOf(hfc.q(tarotSkinIdentify6).c()), Float.valueOf(Math.min(tarotSkinIdentify6.getAspectRatio(), 0.5714286f)));
                            linkedHashMap.put(iy9Var6.d(), iy9Var6.e());
                            it2 = it2;
                            z5 = z3119;
                        }
                        z29 = z5;
                        l46Var.p0(linkedHashMap);
                        objR16 = linkedHashMap;
                    } else {
                        List<String> cardOrder7 = mixedDeckSnapshot.getCardOrder();
                        arrayList2 = new ArrayList();
                        it = cardOrder7.iterator();
                        while (it.hasNext()) {
                            int i5114 = i46;
                            tarotSkinIdentifySkinFor = mixedDeckSnapshot.skinFor((String) it.next());
                            if (tarotSkinIdentifySkinFor != null) {
                                arrayList2.add(tarotSkinIdentifySkinFor);
                            }
                            i46 = i5114;
                        }
                        i47 = i46;
                        pr4 pr4Var7 = dt1.a;
                        int iF7 = bm8.F(t72.u(arrayList2, 10));
                        linkedHashMap = new LinkedHashMap(iF7 >= 16 ? iF7 : 16);
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            TarotSkinIdentify tarotSkinIdentify7 = (TarotSkinIdentify) it2.next();
                            boolean z31110 = z5;
                            iy9 iy9Var7 = new iy9(Integer.valueOf(hfc.q(tarotSkinIdentify7).c()), Float.valueOf(Math.min(tarotSkinIdentify7.getAspectRatio(), 0.5714286f)));
                            linkedHashMap.put(iy9Var7.d(), iy9Var7.e());
                            it2 = it2;
                            z5 = z31110;
                        }
                        z29 = z5;
                        l46Var.p0(linkedHashMap);
                        objR16 = linkedHashMap;
                    }
                    linkedHashMapF = dt1.f((Map) objR16, l46Var);
                    if (linkedHashMapF == null) {
                        l46Var.r(false);
                        ojbVarV3 = l46Var.v();
                        if (ojbVarV3 != null) {
                            final int i5115 = 0;
                            final boolean z31111 = z29;
                            final int i5116 = i10;
                            final int i5117 = i47;
                            ojbVarV3.d = new l26() { // from class: nfd
                                @Override // defpackage.l26
                                public final Object z(Object obj3, Object obj4) {
                                    int i612 = i5115;
                                    wef wefVar = wef.a;
                                    int i613 = i4;
                                    int i614 = i3;
                                    switch (i612) {
                                        case 0:
                                            ((Integer) obj4).getClass();
                                            int iP = k99.P(i614 | 1);
                                            int iP2 = k99.P(i613);
                                            p8c.i(j09Var, xw9Var4, egdVar6, i5116, i5117, z31111, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP, iP2, i5);
                                            break;
                                        case 1:
                                            ((Integer) obj4).getClass();
                                            int iP3 = k99.P(i614 | 1);
                                            int iP4 = k99.P(i613);
                                            p8c.i(j09Var, xw9Var4, egdVar6, i5116, i5117, z31111, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP3, iP4, i5);
                                            break;
                                        default:
                                            ((Integer) obj4).getClass();
                                            int iP5 = k99.P(i614 | 1);
                                            int iP6 = k99.P(i613);
                                            p8c.i(j09Var, xw9Var4, egdVar6, i5116, i5117, z31111, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP5, iP6, i5);
                                            break;
                                    }
                                    return wefVar;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    egdVar5 = egdVar6;
                    z5 = z29;
                    r3 = 0;
                    gw8Var = new gw8(linkedHashMapF);
                    l46Var.r(false);
                } else {
                    mixedDeckSnapshot = mixedDeckSnapshot;
                    egdVar5 = egdVar4;
                    i47 = i46;
                    r3 = 0;
                    l46Var.f0(-810539412);
                    l46Var.r(false);
                    gw8Var = null;
                }
                if (mixedDeckSnapshot == null) {
                    l46Var.f0(-810470808);
                    if (fy9Var4 == null) {
                        l46Var.f0(1774971708);
                        fy9VarE = dt1.e(null, l46Var, r3, 6);
                        l46Var.r(r3);
                    } else {
                        l46Var.f0(1774971088);
                        l46Var.r(r3);
                        fy9VarE = fy9Var4;
                    }
                    if (fy9VarE == null) {
                        l46Var.r(r3);
                        ojbVarV2 = l46Var.v();
                        if (ojbVarV2 != null) {
                            final int i612 = 1;
                            final boolean z31112 = z5;
                            final int i613 = i10;
                            final egd egdVar16 = egdVar5;
                            final int i614 = i47;
                            ojbVarV2.d = new l26() { // from class: nfd
                                @Override // defpackage.l26
                                public final Object z(Object obj3, Object obj4) {
                                    int i615 = i612;
                                    wef wefVar = wef.a;
                                    int i616 = i4;
                                    int i617 = i3;
                                    switch (i615) {
                                        case 0:
                                            ((Integer) obj4).getClass();
                                            int iP = k99.P(i617 | 1);
                                            int iP2 = k99.P(i616);
                                            p8c.i(j09Var, xw9Var4, egdVar16, i613, i614, z31112, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP, iP2, i5);
                                            break;
                                        case 1:
                                            ((Integer) obj4).getClass();
                                            int iP3 = k99.P(i617 | 1);
                                            int iP4 = k99.P(i616);
                                            p8c.i(j09Var, xw9Var4, egdVar16, i613, i614, z31112, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP3, iP4, i5);
                                            break;
                                        default:
                                            ((Integer) obj4).getClass();
                                            int iP5 = k99.P(i617 | 1);
                                            int iP6 = k99.P(i616);
                                            p8c.i(j09Var, xw9Var4, egdVar16, i613, i614, z31112, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP5, iP6, i5);
                                            break;
                                    }
                                    return wefVar;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    l46Var.r(r3);
                    fy9Var5 = fy9VarE;
                } else {
                    z5 = z5;
                    l46Var.f0(-810390612);
                    l46Var.r(r3);
                    fy9Var5 = null;
                }
                objR5 = l46Var.R();
                if (objR5 == obj) {
                    objR5 = af1.E(l46Var);
                    l46Var.p0(objR5);
                }
                aw2Var = (aw2) objR5;
                objR6 = l46Var.R();
                if (objR6 == obj) {
                    objR6 = q1c.f(s13.a);
                    l46Var.p0(objR6);
                }
                e89Var = (e89) objR6;
                i48 = egdVar5.a;
                fy9 fy9Var9 = fy9Var4;
                i49 = (i45 & 896) ^ 384;
                final boolean z31113 = z13;
                if (i49 > 256) {
                    gw8Var2 = gw8Var;
                    if ((i45 & 384) != 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                } else {
                    gw8Var2 = gw8Var;
                    if ((i45 & 384) != 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                }
                i50 = (57344 & i45) ^ 24576;
                boolean z31114 = z16;
                if (i50 > 16384) {
                    z17 = z14;
                    if ((i45 & 24576) != 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                } else {
                    z17 = z14;
                    if ((i45 & 24576) != 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                }
                z19 = z31114 | z18;
                Object objR112 = l46Var.R();
                if (z19) {
                    if (i47 < 0) {
                        qc0.j("Failed requirement.");
                        return;
                    }
                    ycgVar = new ycg(i48, i48 >> 31);
                    arrayList = new ArrayList(i47);
                    i51 = 0;
                    while (i51 < i47) {
                        arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                        i51++;
                        aw2Var = aw2Var;
                        x16Var14 = x16Var14;
                        x16Var12 = x16Var12;
                        x16Var15 = x16Var15;
                    }
                    aw2Var2 = aw2Var;
                    x16Var16 = x16Var14;
                    x16Var17 = x16Var15;
                    x16Var18 = x16Var12;
                    l46Var.p0(arrayList);
                    obj2 = arrayList;
                } else {
                    if (i47 < 0) {
                        qc0.j("Failed requirement.");
                        return;
                    }
                    ycgVar = new ycg(i48, i48 >> 31);
                    arrayList = new ArrayList(i47);
                    i51 = 0;
                    while (i51 < i47) {
                        arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                        i51++;
                        aw2Var = aw2Var;
                        x16Var14 = x16Var14;
                        x16Var12 = x16Var12;
                        x16Var15 = x16Var15;
                    }
                    aw2Var2 = aw2Var;
                    x16Var16 = x16Var14;
                    x16Var17 = x16Var15;
                    x16Var18 = x16Var12;
                    l46Var.p0(arrayList);
                    obj2 = arrayList;
                }
                final List list6 = (List) obj2;
                if (i49 <= 256) {
                }
                z20 = ((i50 <= 16384 && l46Var.e(i47)) || (i45 & 24576) == 16384) | ((i49 <= 256 && l46Var.g(egdVar5)) || (i45 & 384) == 256);
                objR7 = l46Var.R();
                if (z20) {
                    objR7 = new jie(i47, i48);
                    l46Var.p0(objR7);
                } else {
                    objR7 = new jie(i47, i48);
                    l46Var.p0(objR7);
                }
                jieVar = (jie) objR7;
                gh6VarW0 = kj0.w0(l46Var);
                if (egdVar5.a() == hgd.e) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                i52 = i41 >> 6;
                zH = l46Var.h(z21);
                objR8 = l46Var.R();
                if (zH) {
                    objR8 = q1c.f(Boolean.valueOf(!z21));
                    l46Var.p0(objR8);
                } else {
                    objR8 = q1c.f(Boolean.valueOf(!z21));
                    l46Var.p0(objR8);
                }
                e89Var2 = (e89) objR8;
                objR9 = l46Var.R();
                if (objR9 == obj) {
                    objR9 = q1c.f(Boolean.FALSE);
                    l46Var.p0(objR9);
                }
                e89Var3 = (e89) objR9;
                objR10 = l46Var.R();
                if (objR10 == obj) {
                    objR10 = af1.E(l46Var);
                    l46Var.p0(objR10);
                }
                aw2Var3 = (aw2) objR10;
                Boolean boolValueOf6 = Boolean.valueOf(z21);
                zH2 = l46Var.h(z21) | l46Var.g(e89Var2);
                objR11 = l46Var.R();
                if (zH2) {
                    objR11 = new vm4(z21, e89Var3, e89Var2, null);
                    l46Var.p0(objR11);
                } else {
                    objR11 = new vm4(z21, e89Var3, e89Var2, null);
                    l46Var.p0(objR11);
                }
                af1.o((l26) objR11, l46Var, boolValueOf6);
                if (((Boolean) e89Var3.getValue()).booleanValue()) {
                    l46Var.f0(1968840980);
                    zI3 = l46Var.i(aw2Var3);
                    objR15 = l46Var.R();
                    if (zI3) {
                        i53 = 1;
                        objR15 = new om4(aw2Var3, e89Var3, i53);
                        l46Var.p0(objR15);
                    } else {
                        i53 = 1;
                        objR15 = new om4(aw2Var3, e89Var3, i53);
                        l46Var.p0(objR15);
                    }
                    vd0.i(i52 & 112, (a26) objR15, l46Var, null, z15);
                    z22 = false;
                    l46Var.r(false);
                } else {
                    i53 = 1;
                    z22 = false;
                    l46Var.f0(1969148500);
                    l46Var.r(false);
                }
                if (((Boolean) e89Var2.getValue()).booleanValue()) {
                    z23 = z22;
                } else {
                    z23 = z22;
                }
                objR12 = l46Var.R();
                if (objR12 == obj) {
                    objR12 = qk2.d(0.0f);
                    l46Var.p0(objR12);
                }
                jxVar = (jx) objR12;
                e89VarI = q1c.i(x16Var13, l46Var);
                x16Var8 = x16Var18;
                e89VarI2 = q1c.i(x16Var8, l46Var);
                x16 x16Var210 = x16Var16;
                e89VarI3 = q1c.i(x16Var210, l46Var);
                boolean z31115 = z15;
                e89VarI4 = q1c.i(x16Var17, l46Var);
                x16 x16Var211 = x16Var13;
                Object[] objArr6 = {egdVar5, Boolean.valueOf(z5), Boolean.valueOf(z17), jieVar, gh6VarW0};
                if (i49 > 256) {
                    egdVar3 = egdVar5;
                    if ((i45 & 384) != 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                } else {
                    egdVar3 = egdVar5;
                    if ((i45 & 384) != 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                }
                aw2Var4 = aw2Var2;
                boolean zI10 = z24 | l46Var.i(aw2Var4);
                if ((i45 & 458752) == 131072) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z31116 = zI10 | z25;
                z26 = z17;
                zH3 = z31116 | l46Var.h(z26) | l46Var.g(jieVar) | l46Var.i(gh6VarW0) | l46Var.g(e89VarI3) | l46Var.g(e89VarI4) | l46Var.g(e89VarI2);
                objR13 = l46Var.R();
                if (zH3) {
                    objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                    z27 = z26;
                    jieVar2 = jieVar;
                    e89Var4 = e89VarI2;
                    l46Var.p0(objR13);
                } else {
                    objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                    z27 = z26;
                    jieVar2 = jieVar;
                    e89Var4 = e89VarI2;
                    l46Var.p0(objR13);
                }
                af1.r(objArr6, (l26) objR13, l46Var);
                Integer numValueOf7 = Integer.valueOf(i10);
                if ((i45 & 7168) == 2048) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                zI2 = l46Var.i(jxVar) | z28 | ((i49 <= 256 && l46Var.g(egdVar3)) || (i45 & 384) == 256) | l46Var.g(e89VarI) | l46Var.g(e89Var4);
                objR14 = l46Var.R();
                if (zI2) {
                    objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                    jxVar2 = jxVar;
                    l46Var.p0(objR14);
                } else {
                    objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                    jxVar2 = jxVar;
                    l46Var.p0(objR14);
                }
                af1.p(egdVar3, numValueOf7, (l26) objR14, l46Var);
                e1b e1bVarA7 = dt1.a.a(gw8Var2);
                final egd egdVar17 = egdVar3;
                l26 l26Var10 = new l26() { // from class: ofd
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // defpackage.l26
                    public final Object z(Object obj3, Object obj4) {
                        l46 l46Var2 = (l46) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                            FillElement fillElement = b.c;
                            j09 j09VarD = j09Var.D(fillElement);
                            xn8 xn8VarC = s21.c(ndb.b, false);
                            int iHashCode = Long.hashCode(l46Var2.T);
                            u8a u8aVarM = l46Var2.m();
                            j09 j09VarJ = m93.J(l46Var2, j09VarD);
                            lf2.q.getClass();
                            l46Var2.j0();
                            boolean z31117 = l46Var2.S;
                            ov7 ov7Var = LayoutNode.h1;
                            if (z31117) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            he2 he2Var = hj6.z;
                            dec.l(he2Var, l46Var2, xn8VarC);
                            he2 he2Var2 = hj6.y;
                            dec.l(he2Var2, l46Var2, u8aVarM);
                            Integer numValueOf8 = Integer.valueOf(iHashCode);
                            he2 he2Var3 = hj6.X;
                            dec.l(he2Var3, l46Var2, numValueOf8);
                            dec.k(l46Var2);
                            he2 he2Var4 = hj6.x;
                            dec.l(he2Var4, l46Var2, j09VarJ);
                            j09 j09VarY = ynb.Y(fillElement, xw9Var4);
                            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                            int iHashCode2 = Long.hashCode(l46Var2.T);
                            u8a u8aVarM2 = l46Var2.m();
                            j09 j09VarJ2 = m93.J(l46Var2, j09VarY);
                            l46Var2.j0();
                            if (l46Var2.S) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(he2Var, l46Var2, c92VarA);
                            dec.l(he2Var2, l46Var2, u8aVarM2);
                            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                            dec.l(he2Var4, l46Var2, j09VarJ2);
                            int i615 = i10;
                            if (i615 == 0) {
                                ib8.r(24.0f, 91962542, l46Var2, l46Var2, g09.a);
                                l26Var3.z(l46Var2, 0);
                                l46Var2.r(false);
                            } else {
                                l46Var2.f0(92030773);
                                l46Var2.r(false);
                            }
                            s13 s13Var = (s13) e89Var.getValue();
                            boolean z31118 = z27;
                            boolean z31119 = !z31118 || z23;
                            float fFloatValue = ((Number) jxVar2.e()).floatValue();
                            egd egdVar18 = egdVar17;
                            boolean zG2 = l46Var2.g(egdVar18);
                            Object objR113 = l46Var2.R();
                            if (zG2 || objR113 == sf2.a) {
                                objR113 = new ffd(egdVar18, 0);
                                l46Var2.p0(objR113);
                            }
                            p8c.a(egdVar18, i615, s13Var, i47, z31113, z31118, list6, jieVar2, z31119, fFloatValue, fy9Var5, (x16) objR113, l46Var2, 6);
                            l46Var2.r(true);
                            l46Var2.r(true);
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                };
                l26Var2 = l26Var3;
                z8 = z31113;
                z9 = z27;
                mh3.a(e1bVarA7, af1.b0(1669815857, l26Var10, l46Var), l46Var, 56);
                fy9Var2 = fy9Var9;
                x16Var6 = x16Var210;
                z10 = z31115;
                x16Var5 = x16Var211;
                x16Var7 = x16Var17;
                xw9Var3 = xw9Var4;
                i42 = i10;
                i43 = i47;
            } else {
                l46Var.Z();
                x16Var5 = x16Var;
                x16Var6 = x16Var2;
                x16Var7 = x16Var3;
                i42 = i10;
                z8 = z6;
                xw9Var3 = xw9Var2;
                egdVar3 = egdVar2;
                i43 = iC;
                z5 = z5;
                z9 = z2;
                fy9Var2 = fy9Var;
                l26Var2 = l26Var;
                z10 = z4;
                x16Var8 = x16Var4;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                final int i615 = 2;
                ojbVarV.d = new l26() { // from class: nfd
                    @Override // defpackage.l26
                    public final Object z(Object obj3, Object obj4) {
                        int i616 = i615;
                        wef wefVar = wef.a;
                        int i617 = i4;
                        int i618 = i3;
                        switch (i616) {
                            case 0:
                                ((Integer) obj4).getClass();
                                int iP = k99.P(i618 | 1);
                                int iP2 = k99.P(i617);
                                p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP, iP2, i5);
                                break;
                            case 1:
                                ((Integer) obj4).getClass();
                                int iP3 = k99.P(i618 | 1);
                                int iP4 = k99.P(i617);
                                p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP3, iP4, i5);
                                break;
                            default:
                                ((Integer) obj4).getClass();
                                int iP5 = k99.P(i618 | 1);
                                int iP6 = k99.P(i617);
                                p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP5, iP6, i5);
                                break;
                        }
                        return wefVar;
                    }
                };
            }
        }
        egdVar2 = egdVar;
        i7 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        i8 = i6 | i7;
        i9 = i5 & 8;
        if (i9 != 0) {
            if ((i3 & 3072) == 0) {
                i10 = i;
                if (l46Var.e(i10)) {
                    i11 = 2048;
                } else {
                    i11 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i8 |= i11;
            }
            i12 = i5 & 16;
            i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            iC = i2;
            if (i12 == 0) {
                i14 = 8192;
            } else {
                i14 = 8192;
            }
            i15 = i8 | i14;
            i16 = i5 & 32;
            if (i16 != 0) {
                i15 |= 196608;
                z5 = z;
            } else {
                z5 = z;
                if ((i3 & 196608) == 0) {
                    if (l46Var.h(z5)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i15 |= i17;
                }
            }
            i18 = i15 | 524288;
            i19 = i5 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i19 != 0) {
                i21 = i15 | 13107200;
            } else {
                if ((16777216 & i3) == 0) {
                    zI = l46Var.g(fy9Var);
                } else {
                    zI = l46Var.i(fy9Var);
                }
                if (zI) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i21 = i18 | i20;
            }
            i22 = i5 & 256;
            if (i22 != 0) {
                i21 |= 100663296;
                z6 = z3;
            } else {
                z6 = z3;
                if ((i3 & 100663296) == 0) {
                    if (l46Var.h(z6)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i21 |= i23;
                }
            }
            i24 = i5 & 512;
            if (i24 != 0) {
                if ((i3 & 805306368) == 0) {
                    if (l46Var.i(l26Var)) {
                        i25 = 536870912;
                    } else {
                        i25 = 268435456;
                    }
                    i21 |= i25;
                }
                i26 = i5 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i26 != 0) {
                    i27 = i4 | 6;
                } else if ((i4 & 6) == 0) {
                    if (l46Var.i(x16Var)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i4 | i28;
                } else {
                    i27 = i4;
                }
                i29 = i5 & 2048;
                if (i29 != 0) {
                    i31 = i27 | 48;
                } else {
                    if (l46Var.i(x16Var2)) {
                        i30 = 32;
                    } else {
                        i30 = 16;
                    }
                    i31 = i27 | i30;
                }
                i32 = i31;
                i33 = i5 & 4096;
                if (i33 != 0) {
                    i35 = i32 | 384;
                } else {
                    if (l46Var.i(x16Var3)) {
                        i34 = 256;
                    } else {
                        i34 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i35 = i32 | i34;
                }
                i36 = i5 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
                if (i36 != 0) {
                    i38 = i35 | 3072;
                } else {
                    int i5118 = i35;
                    if (l46Var.h(z4)) {
                        i37 = 2048;
                    } else {
                        i37 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i38 = i5118 | i37;
                }
                i39 = i5 & 16384;
                if (i39 != 0) {
                    i41 = i38 | 24576;
                } else {
                    i40 = i38;
                    if ((i4 & 24576) == 0) {
                        if (l46Var.i(x16Var4)) {
                            i13 = 16384;
                        }
                        i41 = i40 | i13;
                    } else {
                        i41 = i40;
                    }
                }
                if ((i21 & 306783379) == 306783378) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (l46Var.W(i21 & 1, z7)) {
                    l46Var.b0();
                    i44 = i3 & 1;
                    obj = sf2.a;
                    if (i44 != 0) {
                        if (i54 != 0) {
                            xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                        } else {
                            xw9VarQ = xw9Var2;
                        }
                        if ((i5 & 4) != 0) {
                            egdVarU = u(l46Var);
                            i21 &= -897;
                        } else {
                            egdVarU = egdVar2;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if ((i5 & 16) != 0) {
                            i21 &= -57345;
                            iC = ((d1) TarotCardType.getEntries()).c();
                        }
                        if (i16 != 0) {
                            z5 = true;
                        }
                        if (i10 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        i45 = i21 & (-3670017);
                        if (i19 != 0) {
                            fy9Var3 = null;
                        } else {
                            fy9Var3 = fy9Var;
                        }
                        if (i22 != 0) {
                            z6 = false;
                        }
                        if (i24 != 0) {
                            l26VarB0 = af1.b0(876435724, new z8d(1, egdVarU), l46Var);
                        } else {
                            l26VarB0 = l26Var;
                        }
                        if (i26 != 0) {
                            objR4 = l46Var.R();
                            if (objR4 == obj) {
                                objR4 = new ead(14);
                                l46Var.p0(objR4);
                            }
                            x16Var9 = (x16) objR4;
                        } else {
                            x16Var9 = x16Var;
                        }
                        if (i29 != 0) {
                            objR3 = l46Var.R();
                            if (objR3 == obj) {
                                objR3 = new ead(15);
                                l46Var.p0(objR3);
                            }
                            x16Var10 = (x16) objR3;
                        } else {
                            x16Var10 = x16Var2;
                        }
                        if (i33 != 0) {
                            objR2 = l46Var.R();
                            if (objR2 == obj) {
                                objR2 = new ead(16);
                                l46Var.p0(objR2);
                            }
                            x16Var11 = (x16) objR2;
                        } else {
                            i41 = i41;
                            x16Var11 = x16Var3;
                        }
                        if (i36 != 0) {
                            z12 = true;
                        } else {
                            z12 = z4;
                        }
                        x16 x16Var116 = x16Var11;
                        if (i39 != 0) {
                            objR = l46Var.R();
                            if (objR == obj) {
                                objR = new ead(17);
                                l46Var.p0(objR);
                            }
                            xw9VarQ = xw9VarQ;
                            x16Var12 = (x16) objR;
                        } else {
                            x16Var12 = x16Var4;
                        }
                        z13 = z6;
                        z14 = z11;
                        fy9Var4 = fy9Var3;
                        l26Var3 = l26VarB0;
                        x16Var13 = x16Var9;
                        x16Var14 = x16Var10;
                        egdVar4 = egdVarU;
                        i46 = iC;
                        z15 = z12;
                        x16Var15 = x16Var116;
                    } else {
                        if (i54 != 0) {
                            xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                        } else {
                            xw9VarQ = xw9Var2;
                        }
                        if ((i5 & 4) != 0) {
                            egdVarU = u(l46Var);
                            i21 &= -897;
                        } else {
                            egdVarU = egdVar2;
                        }
                        if (i9 != 0) {
                            i10 = 0;
                        }
                        if ((i5 & 16) != 0) {
                            i21 &= -57345;
                            iC = ((d1) TarotCardType.getEntries()).c();
                        }
                        if (i16 != 0) {
                            z5 = true;
                        }
                        if (i10 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        i45 = i21 & (-3670017);
                        if (i19 != 0) {
                            fy9Var3 = null;
                        } else {
                            fy9Var3 = fy9Var;
                        }
                        if (i22 != 0) {
                            z6 = false;
                        }
                        if (i24 != 0) {
                            l26VarB0 = af1.b0(876435724, new z8d(1, egdVarU), l46Var);
                        } else {
                            l26VarB0 = l26Var;
                        }
                        if (i26 != 0) {
                            objR4 = l46Var.R();
                            if (objR4 == obj) {
                                objR4 = new ead(14);
                                l46Var.p0(objR4);
                            }
                            x16Var9 = (x16) objR4;
                        } else {
                            x16Var9 = x16Var;
                        }
                        if (i29 != 0) {
                            objR3 = l46Var.R();
                            if (objR3 == obj) {
                                objR3 = new ead(15);
                                l46Var.p0(objR3);
                            }
                            x16Var10 = (x16) objR3;
                        } else {
                            x16Var10 = x16Var2;
                        }
                        if (i33 != 0) {
                            objR2 = l46Var.R();
                            if (objR2 == obj) {
                                objR2 = new ead(16);
                                l46Var.p0(objR2);
                            }
                            x16Var11 = (x16) objR2;
                        } else {
                            i41 = i41;
                            x16Var11 = x16Var3;
                        }
                        if (i36 != 0) {
                            z12 = true;
                        } else {
                            z12 = z4;
                        }
                        x16 x16Var117 = x16Var11;
                        if (i39 != 0) {
                            objR = l46Var.R();
                            if (objR == obj) {
                                objR = new ead(17);
                                l46Var.p0(objR);
                            }
                            xw9VarQ = xw9VarQ;
                            x16Var12 = (x16) objR;
                        } else {
                            x16Var12 = x16Var4;
                        }
                        z13 = z6;
                        z14 = z11;
                        fy9Var4 = fy9Var3;
                        l26Var3 = l26VarB0;
                        x16Var13 = x16Var9;
                        x16Var14 = x16Var10;
                        egdVar4 = egdVarU;
                        i46 = iC;
                        z15 = z12;
                        x16Var15 = x16Var117;
                    }
                    l46Var.s();
                    xw9Var4 = xw9VarQ;
                    mixedDeckSnapshot = (MixedDeckSnapshot) l46Var.k(snd.b);
                    if (mixedDeckSnapshot != null) {
                        egdVar6 = egdVar4;
                        l46Var.f0(-810781893);
                        zG = l46Var.g(mixedDeckSnapshot);
                        objR16 = l46Var.R();
                        if (zG) {
                            List<String> cardOrder8 = mixedDeckSnapshot.getCardOrder();
                            arrayList2 = new ArrayList();
                            it = cardOrder8.iterator();
                            while (it.hasNext()) {
                                int i5119 = i46;
                                tarotSkinIdentifySkinFor = mixedDeckSnapshot.skinFor((String) it.next());
                                if (tarotSkinIdentifySkinFor != null) {
                                    arrayList2.add(tarotSkinIdentifySkinFor);
                                }
                                i46 = i5119;
                            }
                            i47 = i46;
                            pr4 pr4Var8 = dt1.a;
                            int iF8 = bm8.F(t72.u(arrayList2, 10));
                            linkedHashMap = new LinkedHashMap(iF8 >= 16 ? iF8 : 16);
                            it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                TarotSkinIdentify tarotSkinIdentify8 = (TarotSkinIdentify) it2.next();
                                boolean z31117 = z5;
                                iy9 iy9Var8 = new iy9(Integer.valueOf(hfc.q(tarotSkinIdentify8).c()), Float.valueOf(Math.min(tarotSkinIdentify8.getAspectRatio(), 0.5714286f)));
                                linkedHashMap.put(iy9Var8.d(), iy9Var8.e());
                                it2 = it2;
                                z5 = z31117;
                            }
                            z29 = z5;
                            l46Var.p0(linkedHashMap);
                            objR16 = linkedHashMap;
                        } else {
                            List<String> cardOrder9 = mixedDeckSnapshot.getCardOrder();
                            arrayList2 = new ArrayList();
                            it = cardOrder9.iterator();
                            while (it.hasNext()) {
                                int i51110 = i46;
                                tarotSkinIdentifySkinFor = mixedDeckSnapshot.skinFor((String) it.next());
                                if (tarotSkinIdentifySkinFor != null) {
                                    arrayList2.add(tarotSkinIdentifySkinFor);
                                }
                                i46 = i51110;
                            }
                            i47 = i46;
                            pr4 pr4Var9 = dt1.a;
                            int iF9 = bm8.F(t72.u(arrayList2, 10));
                            linkedHashMap = new LinkedHashMap(iF9 >= 16 ? iF9 : 16);
                            it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                TarotSkinIdentify tarotSkinIdentify9 = (TarotSkinIdentify) it2.next();
                                boolean z31118 = z5;
                                iy9 iy9Var9 = new iy9(Integer.valueOf(hfc.q(tarotSkinIdentify9).c()), Float.valueOf(Math.min(tarotSkinIdentify9.getAspectRatio(), 0.5714286f)));
                                linkedHashMap.put(iy9Var9.d(), iy9Var9.e());
                                it2 = it2;
                                z5 = z31118;
                            }
                            z29 = z5;
                            l46Var.p0(linkedHashMap);
                            objR16 = linkedHashMap;
                        }
                        linkedHashMapF = dt1.f((Map) objR16, l46Var);
                        if (linkedHashMapF == null) {
                            l46Var.r(false);
                            ojbVarV3 = l46Var.v();
                            if (ojbVarV3 != null) {
                                final int i51111 = 0;
                                final boolean z31119 = z29;
                                final int i51112 = i10;
                                final int i51113 = i47;
                                ojbVarV3.d = new l26() { // from class: nfd
                                    @Override // defpackage.l26
                                    public final Object z(Object obj3, Object obj4) {
                                        int i616 = i51111;
                                        wef wefVar = wef.a;
                                        int i617 = i4;
                                        int i618 = i3;
                                        switch (i616) {
                                            case 0:
                                                ((Integer) obj4).getClass();
                                                int iP = k99.P(i618 | 1);
                                                int iP2 = k99.P(i617);
                                                p8c.i(j09Var, xw9Var4, egdVar6, i51112, i51113, z31119, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP, iP2, i5);
                                                break;
                                            case 1:
                                                ((Integer) obj4).getClass();
                                                int iP3 = k99.P(i618 | 1);
                                                int iP4 = k99.P(i617);
                                                p8c.i(j09Var, xw9Var4, egdVar6, i51112, i51113, z31119, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP3, iP4, i5);
                                                break;
                                            default:
                                                ((Integer) obj4).getClass();
                                                int iP5 = k99.P(i618 | 1);
                                                int iP6 = k99.P(i617);
                                                p8c.i(j09Var, xw9Var4, egdVar6, i51112, i51113, z31119, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP5, iP6, i5);
                                                break;
                                        }
                                        return wefVar;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        egdVar5 = egdVar6;
                        z5 = z29;
                        r3 = 0;
                        gw8Var = new gw8(linkedHashMapF);
                        l46Var.r(false);
                    } else {
                        mixedDeckSnapshot = mixedDeckSnapshot;
                        egdVar5 = egdVar4;
                        i47 = i46;
                        r3 = 0;
                        l46Var.f0(-810539412);
                        l46Var.r(false);
                        gw8Var = null;
                    }
                    if (mixedDeckSnapshot == null) {
                        l46Var.f0(-810470808);
                        if (fy9Var4 == null) {
                            l46Var.f0(1774971708);
                            fy9VarE = dt1.e(null, l46Var, r3, 6);
                            l46Var.r(r3);
                        } else {
                            l46Var.f0(1774971088);
                            l46Var.r(r3);
                            fy9VarE = fy9Var4;
                        }
                        if (fy9VarE == null) {
                            l46Var.r(r3);
                            ojbVarV2 = l46Var.v();
                            if (ojbVarV2 != null) {
                                final int i616 = 1;
                                final boolean z311110 = z5;
                                final int i617 = i10;
                                final egd egdVar18 = egdVar5;
                                final int i618 = i47;
                                ojbVarV2.d = new l26() { // from class: nfd
                                    @Override // defpackage.l26
                                    public final Object z(Object obj3, Object obj4) {
                                        int i619 = i616;
                                        wef wefVar = wef.a;
                                        int i6110 = i4;
                                        int i6111 = i3;
                                        switch (i619) {
                                            case 0:
                                                ((Integer) obj4).getClass();
                                                int iP = k99.P(i6111 | 1);
                                                int iP2 = k99.P(i6110);
                                                p8c.i(j09Var, xw9Var4, egdVar18, i617, i618, z311110, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP, iP2, i5);
                                                break;
                                            case 1:
                                                ((Integer) obj4).getClass();
                                                int iP3 = k99.P(i6111 | 1);
                                                int iP4 = k99.P(i6110);
                                                p8c.i(j09Var, xw9Var4, egdVar18, i617, i618, z311110, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP3, iP4, i5);
                                                break;
                                            default:
                                                ((Integer) obj4).getClass();
                                                int iP5 = k99.P(i6111 | 1);
                                                int iP6 = k99.P(i6110);
                                                p8c.i(j09Var, xw9Var4, egdVar18, i617, i618, z311110, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP5, iP6, i5);
                                                break;
                                        }
                                        return wefVar;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        l46Var.r(r3);
                        fy9Var5 = fy9VarE;
                    } else {
                        z5 = z5;
                        l46Var.f0(-810390612);
                        l46Var.r(r3);
                        fy9Var5 = null;
                    }
                    objR5 = l46Var.R();
                    if (objR5 == obj) {
                        objR5 = af1.E(l46Var);
                        l46Var.p0(objR5);
                    }
                    aw2Var = (aw2) objR5;
                    objR6 = l46Var.R();
                    if (objR6 == obj) {
                        objR6 = q1c.f(s13.a);
                        l46Var.p0(objR6);
                    }
                    e89Var = (e89) objR6;
                    i48 = egdVar5.a;
                    fy9 fy9Var10 = fy9Var4;
                    i49 = (i45 & 896) ^ 384;
                    final boolean z311111 = z13;
                    if (i49 > 256) {
                        gw8Var2 = gw8Var;
                        if ((i45 & 384) != 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    } else {
                        gw8Var2 = gw8Var;
                        if ((i45 & 384) != 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    }
                    i50 = (57344 & i45) ^ 24576;
                    boolean z311112 = z16;
                    if (i50 > 16384) {
                        z17 = z14;
                        if ((i45 & 24576) != 16384) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                    } else {
                        z17 = z14;
                        if ((i45 & 24576) != 16384) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                    }
                    z19 = z311112 | z18;
                    Object objR113 = l46Var.R();
                    if (z19) {
                        if (i47 < 0) {
                            qc0.j("Failed requirement.");
                            return;
                        }
                        ycgVar = new ycg(i48, i48 >> 31);
                        arrayList = new ArrayList(i47);
                        i51 = 0;
                        while (i51 < i47) {
                            arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                            i51++;
                            aw2Var = aw2Var;
                            x16Var14 = x16Var14;
                            x16Var12 = x16Var12;
                            x16Var15 = x16Var15;
                        }
                        aw2Var2 = aw2Var;
                        x16Var16 = x16Var14;
                        x16Var17 = x16Var15;
                        x16Var18 = x16Var12;
                        l46Var.p0(arrayList);
                        obj2 = arrayList;
                    } else {
                        if (i47 < 0) {
                            qc0.j("Failed requirement.");
                            return;
                        }
                        ycgVar = new ycg(i48, i48 >> 31);
                        arrayList = new ArrayList(i47);
                        i51 = 0;
                        while (i51 < i47) {
                            arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                            i51++;
                            aw2Var = aw2Var;
                            x16Var14 = x16Var14;
                            x16Var12 = x16Var12;
                            x16Var15 = x16Var15;
                        }
                        aw2Var2 = aw2Var;
                        x16Var16 = x16Var14;
                        x16Var17 = x16Var15;
                        x16Var18 = x16Var12;
                        l46Var.p0(arrayList);
                        obj2 = arrayList;
                    }
                    final List list7 = (List) obj2;
                    if (i49 <= 256) {
                    }
                    z20 = ((i50 <= 16384 && l46Var.e(i47)) || (i45 & 24576) == 16384) | ((i49 <= 256 && l46Var.g(egdVar5)) || (i45 & 384) == 256);
                    objR7 = l46Var.R();
                    if (z20) {
                        objR7 = new jie(i47, i48);
                        l46Var.p0(objR7);
                    } else {
                        objR7 = new jie(i47, i48);
                        l46Var.p0(objR7);
                    }
                    jieVar = (jie) objR7;
                    gh6VarW0 = kj0.w0(l46Var);
                    if (egdVar5.a() == hgd.e) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    i52 = i41 >> 6;
                    zH = l46Var.h(z21);
                    objR8 = l46Var.R();
                    if (zH) {
                        objR8 = q1c.f(Boolean.valueOf(!z21));
                        l46Var.p0(objR8);
                    } else {
                        objR8 = q1c.f(Boolean.valueOf(!z21));
                        l46Var.p0(objR8);
                    }
                    e89Var2 = (e89) objR8;
                    objR9 = l46Var.R();
                    if (objR9 == obj) {
                        objR9 = q1c.f(Boolean.FALSE);
                        l46Var.p0(objR9);
                    }
                    e89Var3 = (e89) objR9;
                    objR10 = l46Var.R();
                    if (objR10 == obj) {
                        objR10 = af1.E(l46Var);
                        l46Var.p0(objR10);
                    }
                    aw2Var3 = (aw2) objR10;
                    Boolean boolValueOf7 = Boolean.valueOf(z21);
                    zH2 = l46Var.h(z21) | l46Var.g(e89Var2);
                    objR11 = l46Var.R();
                    if (zH2) {
                        objR11 = new vm4(z21, e89Var3, e89Var2, null);
                        l46Var.p0(objR11);
                    } else {
                        objR11 = new vm4(z21, e89Var3, e89Var2, null);
                        l46Var.p0(objR11);
                    }
                    af1.o((l26) objR11, l46Var, boolValueOf7);
                    if (((Boolean) e89Var3.getValue()).booleanValue()) {
                        l46Var.f0(1968840980);
                        zI3 = l46Var.i(aw2Var3);
                        objR15 = l46Var.R();
                        if (zI3) {
                            i53 = 1;
                            objR15 = new om4(aw2Var3, e89Var3, i53);
                            l46Var.p0(objR15);
                        } else {
                            i53 = 1;
                            objR15 = new om4(aw2Var3, e89Var3, i53);
                            l46Var.p0(objR15);
                        }
                        vd0.i(i52 & 112, (a26) objR15, l46Var, null, z15);
                        z22 = false;
                        l46Var.r(false);
                    } else {
                        i53 = 1;
                        z22 = false;
                        l46Var.f0(1969148500);
                        l46Var.r(false);
                    }
                    if (((Boolean) e89Var2.getValue()).booleanValue()) {
                        z23 = z22;
                    } else {
                        z23 = z22;
                    }
                    objR12 = l46Var.R();
                    if (objR12 == obj) {
                        objR12 = qk2.d(0.0f);
                        l46Var.p0(objR12);
                    }
                    jxVar = (jx) objR12;
                    e89VarI = q1c.i(x16Var13, l46Var);
                    x16Var8 = x16Var18;
                    e89VarI2 = q1c.i(x16Var8, l46Var);
                    x16 x16Var212 = x16Var16;
                    e89VarI3 = q1c.i(x16Var212, l46Var);
                    boolean z311113 = z15;
                    e89VarI4 = q1c.i(x16Var17, l46Var);
                    x16 x16Var213 = x16Var13;
                    Object[] objArr7 = {egdVar5, Boolean.valueOf(z5), Boolean.valueOf(z17), jieVar, gh6VarW0};
                    if (i49 > 256) {
                        egdVar3 = egdVar5;
                        if ((i45 & 384) != 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                    } else {
                        egdVar3 = egdVar5;
                        if ((i45 & 384) != 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                    }
                    aw2Var4 = aw2Var2;
                    boolean zI11 = z24 | l46Var.i(aw2Var4);
                    if ((i45 & 458752) == 131072) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z311114 = zI11 | z25;
                    z26 = z17;
                    zH3 = z311114 | l46Var.h(z26) | l46Var.g(jieVar) | l46Var.i(gh6VarW0) | l46Var.g(e89VarI3) | l46Var.g(e89VarI4) | l46Var.g(e89VarI2);
                    objR13 = l46Var.R();
                    if (zH3) {
                        objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                        z27 = z26;
                        jieVar2 = jieVar;
                        e89Var4 = e89VarI2;
                        l46Var.p0(objR13);
                    } else {
                        objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                        z27 = z26;
                        jieVar2 = jieVar;
                        e89Var4 = e89VarI2;
                        l46Var.p0(objR13);
                    }
                    af1.r(objArr7, (l26) objR13, l46Var);
                    Integer numValueOf8 = Integer.valueOf(i10);
                    if ((i45 & 7168) == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    zI2 = l46Var.i(jxVar) | z28 | ((i49 <= 256 && l46Var.g(egdVar3)) || (i45 & 384) == 256) | l46Var.g(e89VarI) | l46Var.g(e89Var4);
                    objR14 = l46Var.R();
                    if (zI2) {
                        objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                        jxVar2 = jxVar;
                        l46Var.p0(objR14);
                    } else {
                        objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                        jxVar2 = jxVar;
                        l46Var.p0(objR14);
                    }
                    af1.p(egdVar3, numValueOf8, (l26) objR14, l46Var);
                    e1b e1bVarA8 = dt1.a.a(gw8Var2);
                    final egd egdVar19 = egdVar3;
                    l26 l26Var11 = new l26() { // from class: ofd
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // defpackage.l26
                        public final Object z(Object obj3, Object obj4) {
                            l46 l46Var2 = (l46) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                                FillElement fillElement = b.c;
                                j09 j09VarD = j09Var.D(fillElement);
                                xn8 xn8VarC = s21.c(ndb.b, false);
                                int iHashCode = Long.hashCode(l46Var2.T);
                                u8a u8aVarM = l46Var2.m();
                                j09 j09VarJ = m93.J(l46Var2, j09VarD);
                                lf2.q.getClass();
                                l46Var2.j0();
                                boolean z311115 = l46Var2.S;
                                ov7 ov7Var = LayoutNode.h1;
                                if (z311115) {
                                    l46Var2.l(ov7Var);
                                } else {
                                    l46Var2.s0();
                                }
                                he2 he2Var = hj6.z;
                                dec.l(he2Var, l46Var2, xn8VarC);
                                he2 he2Var2 = hj6.y;
                                dec.l(he2Var2, l46Var2, u8aVarM);
                                Integer numValueOf9 = Integer.valueOf(iHashCode);
                                he2 he2Var3 = hj6.X;
                                dec.l(he2Var3, l46Var2, numValueOf9);
                                dec.k(l46Var2);
                                he2 he2Var4 = hj6.x;
                                dec.l(he2Var4, l46Var2, j09VarJ);
                                j09 j09VarY = ynb.Y(fillElement, xw9Var4);
                                c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                                int iHashCode2 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM2 = l46Var2.m();
                                j09 j09VarJ2 = m93.J(l46Var2, j09VarY);
                                l46Var2.j0();
                                if (l46Var2.S) {
                                    l46Var2.l(ov7Var);
                                } else {
                                    l46Var2.s0();
                                }
                                dec.l(he2Var, l46Var2, c92VarA);
                                dec.l(he2Var2, l46Var2, u8aVarM2);
                                ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                                dec.l(he2Var4, l46Var2, j09VarJ2);
                                int i619 = i10;
                                if (i619 == 0) {
                                    ib8.r(24.0f, 91962542, l46Var2, l46Var2, g09.a);
                                    l26Var3.z(l46Var2, 0);
                                    l46Var2.r(false);
                                } else {
                                    l46Var2.f0(92030773);
                                    l46Var2.r(false);
                                }
                                s13 s13Var = (s13) e89Var.getValue();
                                boolean z311116 = z27;
                                boolean z311117 = !z311116 || z23;
                                float fFloatValue = ((Number) jxVar2.e()).floatValue();
                                egd egdVar110 = egdVar19;
                                boolean zG2 = l46Var2.g(egdVar110);
                                Object objR114 = l46Var2.R();
                                if (zG2 || objR114 == sf2.a) {
                                    objR114 = new ffd(egdVar110, 0);
                                    l46Var2.p0(objR114);
                                }
                                p8c.a(egdVar110, i619, s13Var, i47, z311111, z311116, list7, jieVar2, z311117, fFloatValue, fy9Var5, (x16) objR114, l46Var2, 6);
                                l46Var2.r(true);
                                l46Var2.r(true);
                            } else {
                                l46Var2.Z();
                            }
                            return wef.a;
                        }
                    };
                    l26Var2 = l26Var3;
                    z8 = z311111;
                    z9 = z27;
                    mh3.a(e1bVarA8, af1.b0(1669815857, l26Var11, l46Var), l46Var, 56);
                    fy9Var2 = fy9Var10;
                    x16Var6 = x16Var212;
                    z10 = z311113;
                    x16Var5 = x16Var213;
                    x16Var7 = x16Var17;
                    xw9Var3 = xw9Var4;
                    i42 = i10;
                    i43 = i47;
                } else {
                    l46Var.Z();
                    x16Var5 = x16Var;
                    x16Var6 = x16Var2;
                    x16Var7 = x16Var3;
                    i42 = i10;
                    z8 = z6;
                    xw9Var3 = xw9Var2;
                    egdVar3 = egdVar2;
                    i43 = iC;
                    z5 = z5;
                    z9 = z2;
                    fy9Var2 = fy9Var;
                    l26Var2 = l26Var;
                    z10 = z4;
                    x16Var8 = x16Var4;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    final int i619 = 2;
                    ojbVarV.d = new l26() { // from class: nfd
                        @Override // defpackage.l26
                        public final Object z(Object obj3, Object obj4) {
                            int i6110 = i619;
                            wef wefVar = wef.a;
                            int i6111 = i4;
                            int i6112 = i3;
                            switch (i6110) {
                                case 0:
                                    ((Integer) obj4).getClass();
                                    int iP = k99.P(i6112 | 1);
                                    int iP2 = k99.P(i6111);
                                    p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP, iP2, i5);
                                    break;
                                case 1:
                                    ((Integer) obj4).getClass();
                                    int iP3 = k99.P(i6112 | 1);
                                    int iP4 = k99.P(i6111);
                                    p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP3, iP4, i5);
                                    break;
                                default:
                                    ((Integer) obj4).getClass();
                                    int iP5 = k99.P(i6112 | 1);
                                    int iP6 = k99.P(i6111);
                                    p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP5, iP6, i5);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                }
            }
            i21 |= 805306368;
            i26 = i5 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i26 != 0) {
                i27 = i4 | 6;
            } else if ((i4 & 6) == 0) {
                if (l46Var.i(x16Var)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i4 | i28;
            } else {
                i27 = i4;
            }
            i29 = i5 & 2048;
            if (i29 != 0) {
                i31 = i27 | 48;
            } else {
                if (l46Var.i(x16Var2)) {
                    i30 = 32;
                } else {
                    i30 = 16;
                }
                i31 = i27 | i30;
            }
            i32 = i31;
            i33 = i5 & 4096;
            if (i33 != 0) {
                i35 = i32 | 384;
            } else {
                if (l46Var.i(x16Var3)) {
                    i34 = 256;
                } else {
                    i34 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i35 = i32 | i34;
            }
            i36 = i5 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
            if (i36 != 0) {
                i38 = i35 | 3072;
            } else {
                int i51114 = i35;
                if (l46Var.h(z4)) {
                    i37 = 2048;
                } else {
                    i37 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i38 = i51114 | i37;
            }
            i39 = i5 & 16384;
            if (i39 != 0) {
                i41 = i38 | 24576;
            } else {
                i40 = i38;
                if ((i4 & 24576) == 0) {
                    if (l46Var.i(x16Var4)) {
                        i13 = 16384;
                    }
                    i41 = i40 | i13;
                } else {
                    i41 = i40;
                }
            }
            if ((i21 & 306783379) == 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (l46Var.W(i21 & 1, z7)) {
                l46Var.b0();
                i44 = i3 & 1;
                obj = sf2.a;
                if (i44 != 0) {
                    if (i54 != 0) {
                        xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                    } else {
                        xw9VarQ = xw9Var2;
                    }
                    if ((i5 & 4) != 0) {
                        egdVarU = u(l46Var);
                        i21 &= -897;
                    } else {
                        egdVarU = egdVar2;
                    }
                    if (i9 != 0) {
                        i10 = 0;
                    }
                    if ((i5 & 16) != 0) {
                        i21 &= -57345;
                        iC = ((d1) TarotCardType.getEntries()).c();
                    }
                    if (i16 != 0) {
                        z5 = true;
                    }
                    if (i10 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i45 = i21 & (-3670017);
                    if (i19 != 0) {
                        fy9Var3 = null;
                    } else {
                        fy9Var3 = fy9Var;
                    }
                    if (i22 != 0) {
                        z6 = false;
                    }
                    if (i24 != 0) {
                        l26VarB0 = af1.b0(876435724, new z8d(1, egdVarU), l46Var);
                    } else {
                        l26VarB0 = l26Var;
                    }
                    if (i26 != 0) {
                        objR4 = l46Var.R();
                        if (objR4 == obj) {
                            objR4 = new ead(14);
                            l46Var.p0(objR4);
                        }
                        x16Var9 = (x16) objR4;
                    } else {
                        x16Var9 = x16Var;
                    }
                    if (i29 != 0) {
                        objR3 = l46Var.R();
                        if (objR3 == obj) {
                            objR3 = new ead(15);
                            l46Var.p0(objR3);
                        }
                        x16Var10 = (x16) objR3;
                    } else {
                        x16Var10 = x16Var2;
                    }
                    if (i33 != 0) {
                        objR2 = l46Var.R();
                        if (objR2 == obj) {
                            objR2 = new ead(16);
                            l46Var.p0(objR2);
                        }
                        x16Var11 = (x16) objR2;
                    } else {
                        i41 = i41;
                        x16Var11 = x16Var3;
                    }
                    if (i36 != 0) {
                        z12 = true;
                    } else {
                        z12 = z4;
                    }
                    x16 x16Var118 = x16Var11;
                    if (i39 != 0) {
                        objR = l46Var.R();
                        if (objR == obj) {
                            objR = new ead(17);
                            l46Var.p0(objR);
                        }
                        xw9VarQ = xw9VarQ;
                        x16Var12 = (x16) objR;
                    } else {
                        x16Var12 = x16Var4;
                    }
                    z13 = z6;
                    z14 = z11;
                    fy9Var4 = fy9Var3;
                    l26Var3 = l26VarB0;
                    x16Var13 = x16Var9;
                    x16Var14 = x16Var10;
                    egdVar4 = egdVarU;
                    i46 = iC;
                    z15 = z12;
                    x16Var15 = x16Var118;
                } else {
                    if (i54 != 0) {
                        xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                    } else {
                        xw9VarQ = xw9Var2;
                    }
                    if ((i5 & 4) != 0) {
                        egdVarU = u(l46Var);
                        i21 &= -897;
                    } else {
                        egdVarU = egdVar2;
                    }
                    if (i9 != 0) {
                        i10 = 0;
                    }
                    if ((i5 & 16) != 0) {
                        i21 &= -57345;
                        iC = ((d1) TarotCardType.getEntries()).c();
                    }
                    if (i16 != 0) {
                        z5 = true;
                    }
                    if (i10 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i45 = i21 & (-3670017);
                    if (i19 != 0) {
                        fy9Var3 = null;
                    } else {
                        fy9Var3 = fy9Var;
                    }
                    if (i22 != 0) {
                        z6 = false;
                    }
                    if (i24 != 0) {
                        l26VarB0 = af1.b0(876435724, new z8d(1, egdVarU), l46Var);
                    } else {
                        l26VarB0 = l26Var;
                    }
                    if (i26 != 0) {
                        objR4 = l46Var.R();
                        if (objR4 == obj) {
                            objR4 = new ead(14);
                            l46Var.p0(objR4);
                        }
                        x16Var9 = (x16) objR4;
                    } else {
                        x16Var9 = x16Var;
                    }
                    if (i29 != 0) {
                        objR3 = l46Var.R();
                        if (objR3 == obj) {
                            objR3 = new ead(15);
                            l46Var.p0(objR3);
                        }
                        x16Var10 = (x16) objR3;
                    } else {
                        x16Var10 = x16Var2;
                    }
                    if (i33 != 0) {
                        objR2 = l46Var.R();
                        if (objR2 == obj) {
                            objR2 = new ead(16);
                            l46Var.p0(objR2);
                        }
                        x16Var11 = (x16) objR2;
                    } else {
                        i41 = i41;
                        x16Var11 = x16Var3;
                    }
                    if (i36 != 0) {
                        z12 = true;
                    } else {
                        z12 = z4;
                    }
                    x16 x16Var119 = x16Var11;
                    if (i39 != 0) {
                        objR = l46Var.R();
                        if (objR == obj) {
                            objR = new ead(17);
                            l46Var.p0(objR);
                        }
                        xw9VarQ = xw9VarQ;
                        x16Var12 = (x16) objR;
                    } else {
                        x16Var12 = x16Var4;
                    }
                    z13 = z6;
                    z14 = z11;
                    fy9Var4 = fy9Var3;
                    l26Var3 = l26VarB0;
                    x16Var13 = x16Var9;
                    x16Var14 = x16Var10;
                    egdVar4 = egdVarU;
                    i46 = iC;
                    z15 = z12;
                    x16Var15 = x16Var119;
                }
                l46Var.s();
                xw9Var4 = xw9VarQ;
                mixedDeckSnapshot = (MixedDeckSnapshot) l46Var.k(snd.b);
                if (mixedDeckSnapshot != null) {
                    egdVar6 = egdVar4;
                    l46Var.f0(-810781893);
                    zG = l46Var.g(mixedDeckSnapshot);
                    objR16 = l46Var.R();
                    if (zG) {
                        List<String> cardOrder10 = mixedDeckSnapshot.getCardOrder();
                        arrayList2 = new ArrayList();
                        it = cardOrder10.iterator();
                        while (it.hasNext()) {
                            int i51115 = i46;
                            tarotSkinIdentifySkinFor = mixedDeckSnapshot.skinFor((String) it.next());
                            if (tarotSkinIdentifySkinFor != null) {
                                arrayList2.add(tarotSkinIdentifySkinFor);
                            }
                            i46 = i51115;
                        }
                        i47 = i46;
                        pr4 pr4Var10 = dt1.a;
                        int iF10 = bm8.F(t72.u(arrayList2, 10));
                        linkedHashMap = new LinkedHashMap(iF10 >= 16 ? iF10 : 16);
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            TarotSkinIdentify tarotSkinIdentify10 = (TarotSkinIdentify) it2.next();
                            boolean z311115 = z5;
                            iy9 iy9Var10 = new iy9(Integer.valueOf(hfc.q(tarotSkinIdentify10).c()), Float.valueOf(Math.min(tarotSkinIdentify10.getAspectRatio(), 0.5714286f)));
                            linkedHashMap.put(iy9Var10.d(), iy9Var10.e());
                            it2 = it2;
                            z5 = z311115;
                        }
                        z29 = z5;
                        l46Var.p0(linkedHashMap);
                        objR16 = linkedHashMap;
                    } else {
                        List<String> cardOrder11 = mixedDeckSnapshot.getCardOrder();
                        arrayList2 = new ArrayList();
                        it = cardOrder11.iterator();
                        while (it.hasNext()) {
                            int i51116 = i46;
                            tarotSkinIdentifySkinFor = mixedDeckSnapshot.skinFor((String) it.next());
                            if (tarotSkinIdentifySkinFor != null) {
                                arrayList2.add(tarotSkinIdentifySkinFor);
                            }
                            i46 = i51116;
                        }
                        i47 = i46;
                        pr4 pr4Var11 = dt1.a;
                        int iF11 = bm8.F(t72.u(arrayList2, 10));
                        linkedHashMap = new LinkedHashMap(iF11 >= 16 ? iF11 : 16);
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            TarotSkinIdentify tarotSkinIdentify11 = (TarotSkinIdentify) it2.next();
                            boolean z311116 = z5;
                            iy9 iy9Var11 = new iy9(Integer.valueOf(hfc.q(tarotSkinIdentify11).c()), Float.valueOf(Math.min(tarotSkinIdentify11.getAspectRatio(), 0.5714286f)));
                            linkedHashMap.put(iy9Var11.d(), iy9Var11.e());
                            it2 = it2;
                            z5 = z311116;
                        }
                        z29 = z5;
                        l46Var.p0(linkedHashMap);
                        objR16 = linkedHashMap;
                    }
                    linkedHashMapF = dt1.f((Map) objR16, l46Var);
                    if (linkedHashMapF == null) {
                        l46Var.r(false);
                        ojbVarV3 = l46Var.v();
                        if (ojbVarV3 != null) {
                            final int i51117 = 0;
                            final boolean z311117 = z29;
                            final int i51118 = i10;
                            final int i51119 = i47;
                            ojbVarV3.d = new l26() { // from class: nfd
                                @Override // defpackage.l26
                                public final Object z(Object obj3, Object obj4) {
                                    int i6110 = i51117;
                                    wef wefVar = wef.a;
                                    int i6111 = i4;
                                    int i6112 = i3;
                                    switch (i6110) {
                                        case 0:
                                            ((Integer) obj4).getClass();
                                            int iP = k99.P(i6112 | 1);
                                            int iP2 = k99.P(i6111);
                                            p8c.i(j09Var, xw9Var4, egdVar6, i51118, i51119, z311117, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP, iP2, i5);
                                            break;
                                        case 1:
                                            ((Integer) obj4).getClass();
                                            int iP3 = k99.P(i6112 | 1);
                                            int iP4 = k99.P(i6111);
                                            p8c.i(j09Var, xw9Var4, egdVar6, i51118, i51119, z311117, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP3, iP4, i5);
                                            break;
                                        default:
                                            ((Integer) obj4).getClass();
                                            int iP5 = k99.P(i6112 | 1);
                                            int iP6 = k99.P(i6111);
                                            p8c.i(j09Var, xw9Var4, egdVar6, i51118, i51119, z311117, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP5, iP6, i5);
                                            break;
                                    }
                                    return wefVar;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    egdVar5 = egdVar6;
                    z5 = z29;
                    r3 = 0;
                    gw8Var = new gw8(linkedHashMapF);
                    l46Var.r(false);
                } else {
                    mixedDeckSnapshot = mixedDeckSnapshot;
                    egdVar5 = egdVar4;
                    i47 = i46;
                    r3 = 0;
                    l46Var.f0(-810539412);
                    l46Var.r(false);
                    gw8Var = null;
                }
                if (mixedDeckSnapshot == null) {
                    l46Var.f0(-810470808);
                    if (fy9Var4 == null) {
                        l46Var.f0(1774971708);
                        fy9VarE = dt1.e(null, l46Var, r3, 6);
                        l46Var.r(r3);
                    } else {
                        l46Var.f0(1774971088);
                        l46Var.r(r3);
                        fy9VarE = fy9Var4;
                    }
                    if (fy9VarE == null) {
                        l46Var.r(r3);
                        ojbVarV2 = l46Var.v();
                        if (ojbVarV2 != null) {
                            final int i6110 = 1;
                            final boolean z311118 = z5;
                            final int i6111 = i10;
                            final egd egdVar110 = egdVar5;
                            final int i6112 = i47;
                            ojbVarV2.d = new l26() { // from class: nfd
                                @Override // defpackage.l26
                                public final Object z(Object obj3, Object obj4) {
                                    int i6113 = i6110;
                                    wef wefVar = wef.a;
                                    int i6114 = i4;
                                    int i6115 = i3;
                                    switch (i6113) {
                                        case 0:
                                            ((Integer) obj4).getClass();
                                            int iP = k99.P(i6115 | 1);
                                            int iP2 = k99.P(i6114);
                                            p8c.i(j09Var, xw9Var4, egdVar110, i6111, i6112, z311118, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP, iP2, i5);
                                            break;
                                        case 1:
                                            ((Integer) obj4).getClass();
                                            int iP3 = k99.P(i6115 | 1);
                                            int iP4 = k99.P(i6114);
                                            p8c.i(j09Var, xw9Var4, egdVar110, i6111, i6112, z311118, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP3, iP4, i5);
                                            break;
                                        default:
                                            ((Integer) obj4).getClass();
                                            int iP5 = k99.P(i6115 | 1);
                                            int iP6 = k99.P(i6114);
                                            p8c.i(j09Var, xw9Var4, egdVar110, i6111, i6112, z311118, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP5, iP6, i5);
                                            break;
                                    }
                                    return wefVar;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    l46Var.r(r3);
                    fy9Var5 = fy9VarE;
                } else {
                    z5 = z5;
                    l46Var.f0(-810390612);
                    l46Var.r(r3);
                    fy9Var5 = null;
                }
                objR5 = l46Var.R();
                if (objR5 == obj) {
                    objR5 = af1.E(l46Var);
                    l46Var.p0(objR5);
                }
                aw2Var = (aw2) objR5;
                objR6 = l46Var.R();
                if (objR6 == obj) {
                    objR6 = q1c.f(s13.a);
                    l46Var.p0(objR6);
                }
                e89Var = (e89) objR6;
                i48 = egdVar5.a;
                fy9 fy9Var11 = fy9Var4;
                i49 = (i45 & 896) ^ 384;
                final boolean z311119 = z13;
                if (i49 > 256) {
                    gw8Var2 = gw8Var;
                    if ((i45 & 384) != 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                } else {
                    gw8Var2 = gw8Var;
                    if ((i45 & 384) != 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                }
                i50 = (57344 & i45) ^ 24576;
                boolean z3111110 = z16;
                if (i50 > 16384) {
                    z17 = z14;
                    if ((i45 & 24576) != 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                } else {
                    z17 = z14;
                    if ((i45 & 24576) != 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                }
                z19 = z3111110 | z18;
                Object objR114 = l46Var.R();
                if (z19) {
                    if (i47 < 0) {
                        qc0.j("Failed requirement.");
                        return;
                    }
                    ycgVar = new ycg(i48, i48 >> 31);
                    arrayList = new ArrayList(i47);
                    i51 = 0;
                    while (i51 < i47) {
                        arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                        i51++;
                        aw2Var = aw2Var;
                        x16Var14 = x16Var14;
                        x16Var12 = x16Var12;
                        x16Var15 = x16Var15;
                    }
                    aw2Var2 = aw2Var;
                    x16Var16 = x16Var14;
                    x16Var17 = x16Var15;
                    x16Var18 = x16Var12;
                    l46Var.p0(arrayList);
                    obj2 = arrayList;
                } else {
                    if (i47 < 0) {
                        qc0.j("Failed requirement.");
                        return;
                    }
                    ycgVar = new ycg(i48, i48 >> 31);
                    arrayList = new ArrayList(i47);
                    i51 = 0;
                    while (i51 < i47) {
                        arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                        i51++;
                        aw2Var = aw2Var;
                        x16Var14 = x16Var14;
                        x16Var12 = x16Var12;
                        x16Var15 = x16Var15;
                    }
                    aw2Var2 = aw2Var;
                    x16Var16 = x16Var14;
                    x16Var17 = x16Var15;
                    x16Var18 = x16Var12;
                    l46Var.p0(arrayList);
                    obj2 = arrayList;
                }
                final List list8 = (List) obj2;
                if (i49 <= 256) {
                }
                z20 = ((i50 <= 16384 && l46Var.e(i47)) || (i45 & 24576) == 16384) | ((i49 <= 256 && l46Var.g(egdVar5)) || (i45 & 384) == 256);
                objR7 = l46Var.R();
                if (z20) {
                    objR7 = new jie(i47, i48);
                    l46Var.p0(objR7);
                } else {
                    objR7 = new jie(i47, i48);
                    l46Var.p0(objR7);
                }
                jieVar = (jie) objR7;
                gh6VarW0 = kj0.w0(l46Var);
                if (egdVar5.a() == hgd.e) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                i52 = i41 >> 6;
                zH = l46Var.h(z21);
                objR8 = l46Var.R();
                if (zH) {
                    objR8 = q1c.f(Boolean.valueOf(!z21));
                    l46Var.p0(objR8);
                } else {
                    objR8 = q1c.f(Boolean.valueOf(!z21));
                    l46Var.p0(objR8);
                }
                e89Var2 = (e89) objR8;
                objR9 = l46Var.R();
                if (objR9 == obj) {
                    objR9 = q1c.f(Boolean.FALSE);
                    l46Var.p0(objR9);
                }
                e89Var3 = (e89) objR9;
                objR10 = l46Var.R();
                if (objR10 == obj) {
                    objR10 = af1.E(l46Var);
                    l46Var.p0(objR10);
                }
                aw2Var3 = (aw2) objR10;
                Boolean boolValueOf8 = Boolean.valueOf(z21);
                zH2 = l46Var.h(z21) | l46Var.g(e89Var2);
                objR11 = l46Var.R();
                if (zH2) {
                    objR11 = new vm4(z21, e89Var3, e89Var2, null);
                    l46Var.p0(objR11);
                } else {
                    objR11 = new vm4(z21, e89Var3, e89Var2, null);
                    l46Var.p0(objR11);
                }
                af1.o((l26) objR11, l46Var, boolValueOf8);
                if (((Boolean) e89Var3.getValue()).booleanValue()) {
                    l46Var.f0(1968840980);
                    zI3 = l46Var.i(aw2Var3);
                    objR15 = l46Var.R();
                    if (zI3) {
                        i53 = 1;
                        objR15 = new om4(aw2Var3, e89Var3, i53);
                        l46Var.p0(objR15);
                    } else {
                        i53 = 1;
                        objR15 = new om4(aw2Var3, e89Var3, i53);
                        l46Var.p0(objR15);
                    }
                    vd0.i(i52 & 112, (a26) objR15, l46Var, null, z15);
                    z22 = false;
                    l46Var.r(false);
                } else {
                    i53 = 1;
                    z22 = false;
                    l46Var.f0(1969148500);
                    l46Var.r(false);
                }
                if (((Boolean) e89Var2.getValue()).booleanValue()) {
                    z23 = z22;
                } else {
                    z23 = z22;
                }
                objR12 = l46Var.R();
                if (objR12 == obj) {
                    objR12 = qk2.d(0.0f);
                    l46Var.p0(objR12);
                }
                jxVar = (jx) objR12;
                e89VarI = q1c.i(x16Var13, l46Var);
                x16Var8 = x16Var18;
                e89VarI2 = q1c.i(x16Var8, l46Var);
                x16 x16Var214 = x16Var16;
                e89VarI3 = q1c.i(x16Var214, l46Var);
                boolean z3111111 = z15;
                e89VarI4 = q1c.i(x16Var17, l46Var);
                x16 x16Var215 = x16Var13;
                Object[] objArr8 = {egdVar5, Boolean.valueOf(z5), Boolean.valueOf(z17), jieVar, gh6VarW0};
                if (i49 > 256) {
                    egdVar3 = egdVar5;
                    if ((i45 & 384) != 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                } else {
                    egdVar3 = egdVar5;
                    if ((i45 & 384) != 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                }
                aw2Var4 = aw2Var2;
                boolean zI12 = z24 | l46Var.i(aw2Var4);
                if ((i45 & 458752) == 131072) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z3111112 = zI12 | z25;
                z26 = z17;
                zH3 = z3111112 | l46Var.h(z26) | l46Var.g(jieVar) | l46Var.i(gh6VarW0) | l46Var.g(e89VarI3) | l46Var.g(e89VarI4) | l46Var.g(e89VarI2);
                objR13 = l46Var.R();
                if (zH3) {
                    objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                    z27 = z26;
                    jieVar2 = jieVar;
                    e89Var4 = e89VarI2;
                    l46Var.p0(objR13);
                } else {
                    objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                    z27 = z26;
                    jieVar2 = jieVar;
                    e89Var4 = e89VarI2;
                    l46Var.p0(objR13);
                }
                af1.r(objArr8, (l26) objR13, l46Var);
                Integer numValueOf9 = Integer.valueOf(i10);
                if ((i45 & 7168) == 2048) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                zI2 = l46Var.i(jxVar) | z28 | ((i49 <= 256 && l46Var.g(egdVar3)) || (i45 & 384) == 256) | l46Var.g(e89VarI) | l46Var.g(e89Var4);
                objR14 = l46Var.R();
                if (zI2) {
                    objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                    jxVar2 = jxVar;
                    l46Var.p0(objR14);
                } else {
                    objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                    jxVar2 = jxVar;
                    l46Var.p0(objR14);
                }
                af1.p(egdVar3, numValueOf9, (l26) objR14, l46Var);
                e1b e1bVarA9 = dt1.a.a(gw8Var2);
                final egd egdVar111 = egdVar3;
                l26 l26Var12 = new l26() { // from class: ofd
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // defpackage.l26
                    public final Object z(Object obj3, Object obj4) {
                        l46 l46Var2 = (l46) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                            FillElement fillElement = b.c;
                            j09 j09VarD = j09Var.D(fillElement);
                            xn8 xn8VarC = s21.c(ndb.b, false);
                            int iHashCode = Long.hashCode(l46Var2.T);
                            u8a u8aVarM = l46Var2.m();
                            j09 j09VarJ = m93.J(l46Var2, j09VarD);
                            lf2.q.getClass();
                            l46Var2.j0();
                            boolean z3111113 = l46Var2.S;
                            ov7 ov7Var = LayoutNode.h1;
                            if (z3111113) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            he2 he2Var = hj6.z;
                            dec.l(he2Var, l46Var2, xn8VarC);
                            he2 he2Var2 = hj6.y;
                            dec.l(he2Var2, l46Var2, u8aVarM);
                            Integer numValueOf10 = Integer.valueOf(iHashCode);
                            he2 he2Var3 = hj6.X;
                            dec.l(he2Var3, l46Var2, numValueOf10);
                            dec.k(l46Var2);
                            he2 he2Var4 = hj6.x;
                            dec.l(he2Var4, l46Var2, j09VarJ);
                            j09 j09VarY = ynb.Y(fillElement, xw9Var4);
                            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                            int iHashCode2 = Long.hashCode(l46Var2.T);
                            u8a u8aVarM2 = l46Var2.m();
                            j09 j09VarJ2 = m93.J(l46Var2, j09VarY);
                            l46Var2.j0();
                            if (l46Var2.S) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(he2Var, l46Var2, c92VarA);
                            dec.l(he2Var2, l46Var2, u8aVarM2);
                            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                            dec.l(he2Var4, l46Var2, j09VarJ2);
                            int i6113 = i10;
                            if (i6113 == 0) {
                                ib8.r(24.0f, 91962542, l46Var2, l46Var2, g09.a);
                                l26Var3.z(l46Var2, 0);
                                l46Var2.r(false);
                            } else {
                                l46Var2.f0(92030773);
                                l46Var2.r(false);
                            }
                            s13 s13Var = (s13) e89Var.getValue();
                            boolean z3111114 = z27;
                            boolean z3111115 = !z3111114 || z23;
                            float fFloatValue = ((Number) jxVar2.e()).floatValue();
                            egd egdVar112 = egdVar111;
                            boolean zG2 = l46Var2.g(egdVar112);
                            Object objR115 = l46Var2.R();
                            if (zG2 || objR115 == sf2.a) {
                                objR115 = new ffd(egdVar112, 0);
                                l46Var2.p0(objR115);
                            }
                            p8c.a(egdVar112, i6113, s13Var, i47, z311119, z3111114, list8, jieVar2, z3111115, fFloatValue, fy9Var5, (x16) objR115, l46Var2, 6);
                            l46Var2.r(true);
                            l46Var2.r(true);
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                };
                l26Var2 = l26Var3;
                z8 = z311119;
                z9 = z27;
                mh3.a(e1bVarA9, af1.b0(1669815857, l26Var12, l46Var), l46Var, 56);
                fy9Var2 = fy9Var11;
                x16Var6 = x16Var214;
                z10 = z3111111;
                x16Var5 = x16Var215;
                x16Var7 = x16Var17;
                xw9Var3 = xw9Var4;
                i42 = i10;
                i43 = i47;
            } else {
                l46Var.Z();
                x16Var5 = x16Var;
                x16Var6 = x16Var2;
                x16Var7 = x16Var3;
                i42 = i10;
                z8 = z6;
                xw9Var3 = xw9Var2;
                egdVar3 = egdVar2;
                i43 = iC;
                z5 = z5;
                z9 = z2;
                fy9Var2 = fy9Var;
                l26Var2 = l26Var;
                z10 = z4;
                x16Var8 = x16Var4;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                final int i6113 = 2;
                ojbVarV.d = new l26() { // from class: nfd
                    @Override // defpackage.l26
                    public final Object z(Object obj3, Object obj4) {
                        int i6114 = i6113;
                        wef wefVar = wef.a;
                        int i6115 = i4;
                        int i6116 = i3;
                        switch (i6114) {
                            case 0:
                                ((Integer) obj4).getClass();
                                int iP = k99.P(i6116 | 1);
                                int iP2 = k99.P(i6115);
                                p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP, iP2, i5);
                                break;
                            case 1:
                                ((Integer) obj4).getClass();
                                int iP3 = k99.P(i6116 | 1);
                                int iP4 = k99.P(i6115);
                                p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP3, iP4, i5);
                                break;
                            default:
                                ((Integer) obj4).getClass();
                                int iP5 = k99.P(i6116 | 1);
                                int iP6 = k99.P(i6115);
                                p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP5, iP6, i5);
                                break;
                        }
                        return wefVar;
                    }
                };
            }
        }
        i8 |= 3072;
        i10 = i;
        i12 = i5 & 16;
        i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        iC = i2;
        if (i12 == 0) {
            i14 = 8192;
        } else {
            i14 = 8192;
        }
        i15 = i8 | i14;
        i16 = i5 & 32;
        if (i16 != 0) {
            i15 |= 196608;
            z5 = z;
        } else {
            z5 = z;
            if ((i3 & 196608) == 0) {
                if (l46Var.h(z5)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i15 |= i17;
            }
        }
        i18 = i15 | 524288;
        i19 = i5 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i19 != 0) {
            i21 = i15 | 13107200;
        } else {
            if ((16777216 & i3) == 0) {
                zI = l46Var.g(fy9Var);
            } else {
                zI = l46Var.i(fy9Var);
            }
            if (zI) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i21 = i18 | i20;
        }
        i22 = i5 & 256;
        if (i22 != 0) {
            i21 |= 100663296;
            z6 = z3;
        } else {
            z6 = z3;
            if ((i3 & 100663296) == 0) {
                if (l46Var.h(z6)) {
                    i23 = 67108864;
                } else {
                    i23 = 33554432;
                }
                i21 |= i23;
            }
        }
        i24 = i5 & 512;
        if (i24 != 0) {
            if ((i3 & 805306368) == 0) {
                if (l46Var.i(l26Var)) {
                    i25 = 536870912;
                } else {
                    i25 = 268435456;
                }
                i21 |= i25;
            }
            i26 = i5 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i26 != 0) {
                i27 = i4 | 6;
            } else if ((i4 & 6) == 0) {
                if (l46Var.i(x16Var)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i4 | i28;
            } else {
                i27 = i4;
            }
            i29 = i5 & 2048;
            if (i29 != 0) {
                i31 = i27 | 48;
            } else {
                if (l46Var.i(x16Var2)) {
                    i30 = 32;
                } else {
                    i30 = 16;
                }
                i31 = i27 | i30;
            }
            i32 = i31;
            i33 = i5 & 4096;
            if (i33 != 0) {
                i35 = i32 | 384;
            } else {
                if (l46Var.i(x16Var3)) {
                    i34 = 256;
                } else {
                    i34 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i35 = i32 | i34;
            }
            i36 = i5 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
            if (i36 != 0) {
                i38 = i35 | 3072;
            } else {
                int i511110 = i35;
                if (l46Var.h(z4)) {
                    i37 = 2048;
                } else {
                    i37 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i38 = i511110 | i37;
            }
            i39 = i5 & 16384;
            if (i39 != 0) {
                i41 = i38 | 24576;
            } else {
                i40 = i38;
                if ((i4 & 24576) == 0) {
                    if (l46Var.i(x16Var4)) {
                        i13 = 16384;
                    }
                    i41 = i40 | i13;
                } else {
                    i41 = i40;
                }
            }
            if ((i21 & 306783379) == 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (l46Var.W(i21 & 1, z7)) {
                l46Var.b0();
                i44 = i3 & 1;
                obj = sf2.a;
                if (i44 != 0) {
                    if (i54 != 0) {
                        xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                    } else {
                        xw9VarQ = xw9Var2;
                    }
                    if ((i5 & 4) != 0) {
                        egdVarU = u(l46Var);
                        i21 &= -897;
                    } else {
                        egdVarU = egdVar2;
                    }
                    if (i9 != 0) {
                        i10 = 0;
                    }
                    if ((i5 & 16) != 0) {
                        i21 &= -57345;
                        iC = ((d1) TarotCardType.getEntries()).c();
                    }
                    if (i16 != 0) {
                        z5 = true;
                    }
                    if (i10 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i45 = i21 & (-3670017);
                    if (i19 != 0) {
                        fy9Var3 = null;
                    } else {
                        fy9Var3 = fy9Var;
                    }
                    if (i22 != 0) {
                        z6 = false;
                    }
                    if (i24 != 0) {
                        l26VarB0 = af1.b0(876435724, new z8d(1, egdVarU), l46Var);
                    } else {
                        l26VarB0 = l26Var;
                    }
                    if (i26 != 0) {
                        objR4 = l46Var.R();
                        if (objR4 == obj) {
                            objR4 = new ead(14);
                            l46Var.p0(objR4);
                        }
                        x16Var9 = (x16) objR4;
                    } else {
                        x16Var9 = x16Var;
                    }
                    if (i29 != 0) {
                        objR3 = l46Var.R();
                        if (objR3 == obj) {
                            objR3 = new ead(15);
                            l46Var.p0(objR3);
                        }
                        x16Var10 = (x16) objR3;
                    } else {
                        x16Var10 = x16Var2;
                    }
                    if (i33 != 0) {
                        objR2 = l46Var.R();
                        if (objR2 == obj) {
                            objR2 = new ead(16);
                            l46Var.p0(objR2);
                        }
                        x16Var11 = (x16) objR2;
                    } else {
                        i41 = i41;
                        x16Var11 = x16Var3;
                    }
                    if (i36 != 0) {
                        z12 = true;
                    } else {
                        z12 = z4;
                    }
                    x16 x16Var1110 = x16Var11;
                    if (i39 != 0) {
                        objR = l46Var.R();
                        if (objR == obj) {
                            objR = new ead(17);
                            l46Var.p0(objR);
                        }
                        xw9VarQ = xw9VarQ;
                        x16Var12 = (x16) objR;
                    } else {
                        x16Var12 = x16Var4;
                    }
                    z13 = z6;
                    z14 = z11;
                    fy9Var4 = fy9Var3;
                    l26Var3 = l26VarB0;
                    x16Var13 = x16Var9;
                    x16Var14 = x16Var10;
                    egdVar4 = egdVarU;
                    i46 = iC;
                    z15 = z12;
                    x16Var15 = x16Var1110;
                } else {
                    if (i54 != 0) {
                        xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                    } else {
                        xw9VarQ = xw9Var2;
                    }
                    if ((i5 & 4) != 0) {
                        egdVarU = u(l46Var);
                        i21 &= -897;
                    } else {
                        egdVarU = egdVar2;
                    }
                    if (i9 != 0) {
                        i10 = 0;
                    }
                    if ((i5 & 16) != 0) {
                        i21 &= -57345;
                        iC = ((d1) TarotCardType.getEntries()).c();
                    }
                    if (i16 != 0) {
                        z5 = true;
                    }
                    if (i10 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i45 = i21 & (-3670017);
                    if (i19 != 0) {
                        fy9Var3 = null;
                    } else {
                        fy9Var3 = fy9Var;
                    }
                    if (i22 != 0) {
                        z6 = false;
                    }
                    if (i24 != 0) {
                        l26VarB0 = af1.b0(876435724, new z8d(1, egdVarU), l46Var);
                    } else {
                        l26VarB0 = l26Var;
                    }
                    if (i26 != 0) {
                        objR4 = l46Var.R();
                        if (objR4 == obj) {
                            objR4 = new ead(14);
                            l46Var.p0(objR4);
                        }
                        x16Var9 = (x16) objR4;
                    } else {
                        x16Var9 = x16Var;
                    }
                    if (i29 != 0) {
                        objR3 = l46Var.R();
                        if (objR3 == obj) {
                            objR3 = new ead(15);
                            l46Var.p0(objR3);
                        }
                        x16Var10 = (x16) objR3;
                    } else {
                        x16Var10 = x16Var2;
                    }
                    if (i33 != 0) {
                        objR2 = l46Var.R();
                        if (objR2 == obj) {
                            objR2 = new ead(16);
                            l46Var.p0(objR2);
                        }
                        x16Var11 = (x16) objR2;
                    } else {
                        i41 = i41;
                        x16Var11 = x16Var3;
                    }
                    if (i36 != 0) {
                        z12 = true;
                    } else {
                        z12 = z4;
                    }
                    x16 x16Var1111 = x16Var11;
                    if (i39 != 0) {
                        objR = l46Var.R();
                        if (objR == obj) {
                            objR = new ead(17);
                            l46Var.p0(objR);
                        }
                        xw9VarQ = xw9VarQ;
                        x16Var12 = (x16) objR;
                    } else {
                        x16Var12 = x16Var4;
                    }
                    z13 = z6;
                    z14 = z11;
                    fy9Var4 = fy9Var3;
                    l26Var3 = l26VarB0;
                    x16Var13 = x16Var9;
                    x16Var14 = x16Var10;
                    egdVar4 = egdVarU;
                    i46 = iC;
                    z15 = z12;
                    x16Var15 = x16Var1111;
                }
                l46Var.s();
                xw9Var4 = xw9VarQ;
                mixedDeckSnapshot = (MixedDeckSnapshot) l46Var.k(snd.b);
                if (mixedDeckSnapshot != null) {
                    egdVar6 = egdVar4;
                    l46Var.f0(-810781893);
                    zG = l46Var.g(mixedDeckSnapshot);
                    objR16 = l46Var.R();
                    if (zG) {
                        List<String> cardOrder12 = mixedDeckSnapshot.getCardOrder();
                        arrayList2 = new ArrayList();
                        it = cardOrder12.iterator();
                        while (it.hasNext()) {
                            int i511111 = i46;
                            tarotSkinIdentifySkinFor = mixedDeckSnapshot.skinFor((String) it.next());
                            if (tarotSkinIdentifySkinFor != null) {
                                arrayList2.add(tarotSkinIdentifySkinFor);
                            }
                            i46 = i511111;
                        }
                        i47 = i46;
                        pr4 pr4Var12 = dt1.a;
                        int iF12 = bm8.F(t72.u(arrayList2, 10));
                        linkedHashMap = new LinkedHashMap(iF12 >= 16 ? iF12 : 16);
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            TarotSkinIdentify tarotSkinIdentify12 = (TarotSkinIdentify) it2.next();
                            boolean z3111113 = z5;
                            iy9 iy9Var12 = new iy9(Integer.valueOf(hfc.q(tarotSkinIdentify12).c()), Float.valueOf(Math.min(tarotSkinIdentify12.getAspectRatio(), 0.5714286f)));
                            linkedHashMap.put(iy9Var12.d(), iy9Var12.e());
                            it2 = it2;
                            z5 = z3111113;
                        }
                        z29 = z5;
                        l46Var.p0(linkedHashMap);
                        objR16 = linkedHashMap;
                    } else {
                        List<String> cardOrder13 = mixedDeckSnapshot.getCardOrder();
                        arrayList2 = new ArrayList();
                        it = cardOrder13.iterator();
                        while (it.hasNext()) {
                            int i511112 = i46;
                            tarotSkinIdentifySkinFor = mixedDeckSnapshot.skinFor((String) it.next());
                            if (tarotSkinIdentifySkinFor != null) {
                                arrayList2.add(tarotSkinIdentifySkinFor);
                            }
                            i46 = i511112;
                        }
                        i47 = i46;
                        pr4 pr4Var13 = dt1.a;
                        int iF13 = bm8.F(t72.u(arrayList2, 10));
                        linkedHashMap = new LinkedHashMap(iF13 >= 16 ? iF13 : 16);
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            TarotSkinIdentify tarotSkinIdentify13 = (TarotSkinIdentify) it2.next();
                            boolean z3111114 = z5;
                            iy9 iy9Var13 = new iy9(Integer.valueOf(hfc.q(tarotSkinIdentify13).c()), Float.valueOf(Math.min(tarotSkinIdentify13.getAspectRatio(), 0.5714286f)));
                            linkedHashMap.put(iy9Var13.d(), iy9Var13.e());
                            it2 = it2;
                            z5 = z3111114;
                        }
                        z29 = z5;
                        l46Var.p0(linkedHashMap);
                        objR16 = linkedHashMap;
                    }
                    linkedHashMapF = dt1.f((Map) objR16, l46Var);
                    if (linkedHashMapF == null) {
                        l46Var.r(false);
                        ojbVarV3 = l46Var.v();
                        if (ojbVarV3 != null) {
                            final int i511113 = 0;
                            final boolean z3111115 = z29;
                            final int i511114 = i10;
                            final int i511115 = i47;
                            ojbVarV3.d = new l26() { // from class: nfd
                                @Override // defpackage.l26
                                public final Object z(Object obj3, Object obj4) {
                                    int i6114 = i511113;
                                    wef wefVar = wef.a;
                                    int i6115 = i4;
                                    int i6116 = i3;
                                    switch (i6114) {
                                        case 0:
                                            ((Integer) obj4).getClass();
                                            int iP = k99.P(i6116 | 1);
                                            int iP2 = k99.P(i6115);
                                            p8c.i(j09Var, xw9Var4, egdVar6, i511114, i511115, z3111115, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP, iP2, i5);
                                            break;
                                        case 1:
                                            ((Integer) obj4).getClass();
                                            int iP3 = k99.P(i6116 | 1);
                                            int iP4 = k99.P(i6115);
                                            p8c.i(j09Var, xw9Var4, egdVar6, i511114, i511115, z3111115, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP3, iP4, i5);
                                            break;
                                        default:
                                            ((Integer) obj4).getClass();
                                            int iP5 = k99.P(i6116 | 1);
                                            int iP6 = k99.P(i6115);
                                            p8c.i(j09Var, xw9Var4, egdVar6, i511114, i511115, z3111115, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP5, iP6, i5);
                                            break;
                                    }
                                    return wefVar;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    egdVar5 = egdVar6;
                    z5 = z29;
                    r3 = 0;
                    gw8Var = new gw8(linkedHashMapF);
                    l46Var.r(false);
                } else {
                    mixedDeckSnapshot = mixedDeckSnapshot;
                    egdVar5 = egdVar4;
                    i47 = i46;
                    r3 = 0;
                    l46Var.f0(-810539412);
                    l46Var.r(false);
                    gw8Var = null;
                }
                if (mixedDeckSnapshot == null) {
                    l46Var.f0(-810470808);
                    if (fy9Var4 == null) {
                        l46Var.f0(1774971708);
                        fy9VarE = dt1.e(null, l46Var, r3, 6);
                        l46Var.r(r3);
                    } else {
                        l46Var.f0(1774971088);
                        l46Var.r(r3);
                        fy9VarE = fy9Var4;
                    }
                    if (fy9VarE == null) {
                        l46Var.r(r3);
                        ojbVarV2 = l46Var.v();
                        if (ojbVarV2 != null) {
                            final int i6114 = 1;
                            final boolean z3111116 = z5;
                            final int i6115 = i10;
                            final egd egdVar112 = egdVar5;
                            final int i6116 = i47;
                            ojbVarV2.d = new l26() { // from class: nfd
                                @Override // defpackage.l26
                                public final Object z(Object obj3, Object obj4) {
                                    int i6117 = i6114;
                                    wef wefVar = wef.a;
                                    int i6118 = i4;
                                    int i6119 = i3;
                                    switch (i6117) {
                                        case 0:
                                            ((Integer) obj4).getClass();
                                            int iP = k99.P(i6119 | 1);
                                            int iP2 = k99.P(i6118);
                                            p8c.i(j09Var, xw9Var4, egdVar112, i6115, i6116, z3111116, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP, iP2, i5);
                                            break;
                                        case 1:
                                            ((Integer) obj4).getClass();
                                            int iP3 = k99.P(i6119 | 1);
                                            int iP4 = k99.P(i6118);
                                            p8c.i(j09Var, xw9Var4, egdVar112, i6115, i6116, z3111116, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP3, iP4, i5);
                                            break;
                                        default:
                                            ((Integer) obj4).getClass();
                                            int iP5 = k99.P(i6119 | 1);
                                            int iP6 = k99.P(i6118);
                                            p8c.i(j09Var, xw9Var4, egdVar112, i6115, i6116, z3111116, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP5, iP6, i5);
                                            break;
                                    }
                                    return wefVar;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    l46Var.r(r3);
                    fy9Var5 = fy9VarE;
                } else {
                    z5 = z5;
                    l46Var.f0(-810390612);
                    l46Var.r(r3);
                    fy9Var5 = null;
                }
                objR5 = l46Var.R();
                if (objR5 == obj) {
                    objR5 = af1.E(l46Var);
                    l46Var.p0(objR5);
                }
                aw2Var = (aw2) objR5;
                objR6 = l46Var.R();
                if (objR6 == obj) {
                    objR6 = q1c.f(s13.a);
                    l46Var.p0(objR6);
                }
                e89Var = (e89) objR6;
                i48 = egdVar5.a;
                fy9 fy9Var12 = fy9Var4;
                i49 = (i45 & 896) ^ 384;
                final boolean z3111117 = z13;
                if (i49 > 256) {
                    gw8Var2 = gw8Var;
                    if ((i45 & 384) != 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                } else {
                    gw8Var2 = gw8Var;
                    if ((i45 & 384) != 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                }
                i50 = (57344 & i45) ^ 24576;
                boolean z3111118 = z16;
                if (i50 > 16384) {
                    z17 = z14;
                    if ((i45 & 24576) != 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                } else {
                    z17 = z14;
                    if ((i45 & 24576) != 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                }
                z19 = z3111118 | z18;
                Object objR115 = l46Var.R();
                if (z19) {
                    if (i47 < 0) {
                        qc0.j("Failed requirement.");
                        return;
                    }
                    ycgVar = new ycg(i48, i48 >> 31);
                    arrayList = new ArrayList(i47);
                    i51 = 0;
                    while (i51 < i47) {
                        arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                        i51++;
                        aw2Var = aw2Var;
                        x16Var14 = x16Var14;
                        x16Var12 = x16Var12;
                        x16Var15 = x16Var15;
                    }
                    aw2Var2 = aw2Var;
                    x16Var16 = x16Var14;
                    x16Var17 = x16Var15;
                    x16Var18 = x16Var12;
                    l46Var.p0(arrayList);
                    obj2 = arrayList;
                } else {
                    if (i47 < 0) {
                        qc0.j("Failed requirement.");
                        return;
                    }
                    ycgVar = new ycg(i48, i48 >> 31);
                    arrayList = new ArrayList(i47);
                    i51 = 0;
                    while (i51 < i47) {
                        arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                        i51++;
                        aw2Var = aw2Var;
                        x16Var14 = x16Var14;
                        x16Var12 = x16Var12;
                        x16Var15 = x16Var15;
                    }
                    aw2Var2 = aw2Var;
                    x16Var16 = x16Var14;
                    x16Var17 = x16Var15;
                    x16Var18 = x16Var12;
                    l46Var.p0(arrayList);
                    obj2 = arrayList;
                }
                final List list9 = (List) obj2;
                if (i49 <= 256) {
                }
                z20 = ((i50 <= 16384 && l46Var.e(i47)) || (i45 & 24576) == 16384) | ((i49 <= 256 && l46Var.g(egdVar5)) || (i45 & 384) == 256);
                objR7 = l46Var.R();
                if (z20) {
                    objR7 = new jie(i47, i48);
                    l46Var.p0(objR7);
                } else {
                    objR7 = new jie(i47, i48);
                    l46Var.p0(objR7);
                }
                jieVar = (jie) objR7;
                gh6VarW0 = kj0.w0(l46Var);
                if (egdVar5.a() == hgd.e) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                i52 = i41 >> 6;
                zH = l46Var.h(z21);
                objR8 = l46Var.R();
                if (zH) {
                    objR8 = q1c.f(Boolean.valueOf(!z21));
                    l46Var.p0(objR8);
                } else {
                    objR8 = q1c.f(Boolean.valueOf(!z21));
                    l46Var.p0(objR8);
                }
                e89Var2 = (e89) objR8;
                objR9 = l46Var.R();
                if (objR9 == obj) {
                    objR9 = q1c.f(Boolean.FALSE);
                    l46Var.p0(objR9);
                }
                e89Var3 = (e89) objR9;
                objR10 = l46Var.R();
                if (objR10 == obj) {
                    objR10 = af1.E(l46Var);
                    l46Var.p0(objR10);
                }
                aw2Var3 = (aw2) objR10;
                Boolean boolValueOf9 = Boolean.valueOf(z21);
                zH2 = l46Var.h(z21) | l46Var.g(e89Var2);
                objR11 = l46Var.R();
                if (zH2) {
                    objR11 = new vm4(z21, e89Var3, e89Var2, null);
                    l46Var.p0(objR11);
                } else {
                    objR11 = new vm4(z21, e89Var3, e89Var2, null);
                    l46Var.p0(objR11);
                }
                af1.o((l26) objR11, l46Var, boolValueOf9);
                if (((Boolean) e89Var3.getValue()).booleanValue()) {
                    l46Var.f0(1968840980);
                    zI3 = l46Var.i(aw2Var3);
                    objR15 = l46Var.R();
                    if (zI3) {
                        i53 = 1;
                        objR15 = new om4(aw2Var3, e89Var3, i53);
                        l46Var.p0(objR15);
                    } else {
                        i53 = 1;
                        objR15 = new om4(aw2Var3, e89Var3, i53);
                        l46Var.p0(objR15);
                    }
                    vd0.i(i52 & 112, (a26) objR15, l46Var, null, z15);
                    z22 = false;
                    l46Var.r(false);
                } else {
                    i53 = 1;
                    z22 = false;
                    l46Var.f0(1969148500);
                    l46Var.r(false);
                }
                if (((Boolean) e89Var2.getValue()).booleanValue()) {
                    z23 = z22;
                } else {
                    z23 = z22;
                }
                objR12 = l46Var.R();
                if (objR12 == obj) {
                    objR12 = qk2.d(0.0f);
                    l46Var.p0(objR12);
                }
                jxVar = (jx) objR12;
                e89VarI = q1c.i(x16Var13, l46Var);
                x16Var8 = x16Var18;
                e89VarI2 = q1c.i(x16Var8, l46Var);
                x16 x16Var216 = x16Var16;
                e89VarI3 = q1c.i(x16Var216, l46Var);
                boolean z3111119 = z15;
                e89VarI4 = q1c.i(x16Var17, l46Var);
                x16 x16Var217 = x16Var13;
                Object[] objArr9 = {egdVar5, Boolean.valueOf(z5), Boolean.valueOf(z17), jieVar, gh6VarW0};
                if (i49 > 256) {
                    egdVar3 = egdVar5;
                    if ((i45 & 384) != 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                } else {
                    egdVar3 = egdVar5;
                    if ((i45 & 384) != 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                }
                aw2Var4 = aw2Var2;
                boolean zI13 = z24 | l46Var.i(aw2Var4);
                if ((i45 & 458752) == 131072) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z31111110 = zI13 | z25;
                z26 = z17;
                zH3 = z31111110 | l46Var.h(z26) | l46Var.g(jieVar) | l46Var.i(gh6VarW0) | l46Var.g(e89VarI3) | l46Var.g(e89VarI4) | l46Var.g(e89VarI2);
                objR13 = l46Var.R();
                if (zH3) {
                    objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                    z27 = z26;
                    jieVar2 = jieVar;
                    e89Var4 = e89VarI2;
                    l46Var.p0(objR13);
                } else {
                    objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                    z27 = z26;
                    jieVar2 = jieVar;
                    e89Var4 = e89VarI2;
                    l46Var.p0(objR13);
                }
                af1.r(objArr9, (l26) objR13, l46Var);
                Integer numValueOf10 = Integer.valueOf(i10);
                if ((i45 & 7168) == 2048) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                zI2 = l46Var.i(jxVar) | z28 | ((i49 <= 256 && l46Var.g(egdVar3)) || (i45 & 384) == 256) | l46Var.g(e89VarI) | l46Var.g(e89Var4);
                objR14 = l46Var.R();
                if (zI2) {
                    objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                    jxVar2 = jxVar;
                    l46Var.p0(objR14);
                } else {
                    objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                    jxVar2 = jxVar;
                    l46Var.p0(objR14);
                }
                af1.p(egdVar3, numValueOf10, (l26) objR14, l46Var);
                e1b e1bVarA10 = dt1.a.a(gw8Var2);
                final egd egdVar113 = egdVar3;
                l26 l26Var13 = new l26() { // from class: ofd
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // defpackage.l26
                    public final Object z(Object obj3, Object obj4) {
                        l46 l46Var2 = (l46) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                            FillElement fillElement = b.c;
                            j09 j09VarD = j09Var.D(fillElement);
                            xn8 xn8VarC = s21.c(ndb.b, false);
                            int iHashCode = Long.hashCode(l46Var2.T);
                            u8a u8aVarM = l46Var2.m();
                            j09 j09VarJ = m93.J(l46Var2, j09VarD);
                            lf2.q.getClass();
                            l46Var2.j0();
                            boolean z31111111 = l46Var2.S;
                            ov7 ov7Var = LayoutNode.h1;
                            if (z31111111) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            he2 he2Var = hj6.z;
                            dec.l(he2Var, l46Var2, xn8VarC);
                            he2 he2Var2 = hj6.y;
                            dec.l(he2Var2, l46Var2, u8aVarM);
                            Integer numValueOf11 = Integer.valueOf(iHashCode);
                            he2 he2Var3 = hj6.X;
                            dec.l(he2Var3, l46Var2, numValueOf11);
                            dec.k(l46Var2);
                            he2 he2Var4 = hj6.x;
                            dec.l(he2Var4, l46Var2, j09VarJ);
                            j09 j09VarY = ynb.Y(fillElement, xw9Var4);
                            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                            int iHashCode2 = Long.hashCode(l46Var2.T);
                            u8a u8aVarM2 = l46Var2.m();
                            j09 j09VarJ2 = m93.J(l46Var2, j09VarY);
                            l46Var2.j0();
                            if (l46Var2.S) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(he2Var, l46Var2, c92VarA);
                            dec.l(he2Var2, l46Var2, u8aVarM2);
                            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                            dec.l(he2Var4, l46Var2, j09VarJ2);
                            int i6117 = i10;
                            if (i6117 == 0) {
                                ib8.r(24.0f, 91962542, l46Var2, l46Var2, g09.a);
                                l26Var3.z(l46Var2, 0);
                                l46Var2.r(false);
                            } else {
                                l46Var2.f0(92030773);
                                l46Var2.r(false);
                            }
                            s13 s13Var = (s13) e89Var.getValue();
                            boolean z31111112 = z27;
                            boolean z31111113 = !z31111112 || z23;
                            float fFloatValue = ((Number) jxVar2.e()).floatValue();
                            egd egdVar114 = egdVar113;
                            boolean zG2 = l46Var2.g(egdVar114);
                            Object objR116 = l46Var2.R();
                            if (zG2 || objR116 == sf2.a) {
                                objR116 = new ffd(egdVar114, 0);
                                l46Var2.p0(objR116);
                            }
                            p8c.a(egdVar114, i6117, s13Var, i47, z3111117, z31111112, list9, jieVar2, z31111113, fFloatValue, fy9Var5, (x16) objR116, l46Var2, 6);
                            l46Var2.r(true);
                            l46Var2.r(true);
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                };
                l26Var2 = l26Var3;
                z8 = z3111117;
                z9 = z27;
                mh3.a(e1bVarA10, af1.b0(1669815857, l26Var13, l46Var), l46Var, 56);
                fy9Var2 = fy9Var12;
                x16Var6 = x16Var216;
                z10 = z3111119;
                x16Var5 = x16Var217;
                x16Var7 = x16Var17;
                xw9Var3 = xw9Var4;
                i42 = i10;
                i43 = i47;
            } else {
                l46Var.Z();
                x16Var5 = x16Var;
                x16Var6 = x16Var2;
                x16Var7 = x16Var3;
                i42 = i10;
                z8 = z6;
                xw9Var3 = xw9Var2;
                egdVar3 = egdVar2;
                i43 = iC;
                z5 = z5;
                z9 = z2;
                fy9Var2 = fy9Var;
                l26Var2 = l26Var;
                z10 = z4;
                x16Var8 = x16Var4;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                final int i6117 = 2;
                ojbVarV.d = new l26() { // from class: nfd
                    @Override // defpackage.l26
                    public final Object z(Object obj3, Object obj4) {
                        int i6118 = i6117;
                        wef wefVar = wef.a;
                        int i6119 = i4;
                        int i61110 = i3;
                        switch (i6118) {
                            case 0:
                                ((Integer) obj4).getClass();
                                int iP = k99.P(i61110 | 1);
                                int iP2 = k99.P(i6119);
                                p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP, iP2, i5);
                                break;
                            case 1:
                                ((Integer) obj4).getClass();
                                int iP3 = k99.P(i61110 | 1);
                                int iP4 = k99.P(i6119);
                                p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP3, iP4, i5);
                                break;
                            default:
                                ((Integer) obj4).getClass();
                                int iP5 = k99.P(i61110 | 1);
                                int iP6 = k99.P(i6119);
                                p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP5, iP6, i5);
                                break;
                        }
                        return wefVar;
                    }
                };
            }
        }
        i21 |= 805306368;
        i26 = i5 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i26 != 0) {
            i27 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (l46Var.i(x16Var)) {
                i28 = 4;
            } else {
                i28 = 2;
            }
            i27 = i4 | i28;
        } else {
            i27 = i4;
        }
        i29 = i5 & 2048;
        if (i29 != 0) {
            i31 = i27 | 48;
        } else {
            if (l46Var.i(x16Var2)) {
                i30 = 32;
            } else {
                i30 = 16;
            }
            i31 = i27 | i30;
        }
        i32 = i31;
        i33 = i5 & 4096;
        if (i33 != 0) {
            i35 = i32 | 384;
        } else {
            if (l46Var.i(x16Var3)) {
                i34 = 256;
            } else {
                i34 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i35 = i32 | i34;
        }
        i36 = i5 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i36 != 0) {
            i38 = i35 | 3072;
        } else {
            int i511116 = i35;
            if (l46Var.h(z4)) {
                i37 = 2048;
            } else {
                i37 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i38 = i511116 | i37;
        }
        i39 = i5 & 16384;
        if (i39 != 0) {
            i41 = i38 | 24576;
        } else {
            i40 = i38;
            if ((i4 & 24576) == 0) {
                if (l46Var.i(x16Var4)) {
                    i13 = 16384;
                }
                i41 = i40 | i13;
            } else {
                i41 = i40;
            }
        }
        if ((i21 & 306783379) == 306783378) {
            z7 = true;
        } else {
            z7 = true;
        }
        if (l46Var.W(i21 & 1, z7)) {
            l46Var.b0();
            i44 = i3 & 1;
            obj = sf2.a;
            if (i44 != 0) {
                if (i54 != 0) {
                    xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                } else {
                    xw9VarQ = xw9Var2;
                }
                if ((i5 & 4) != 0) {
                    egdVarU = u(l46Var);
                    i21 &= -897;
                } else {
                    egdVarU = egdVar2;
                }
                if (i9 != 0) {
                    i10 = 0;
                }
                if ((i5 & 16) != 0) {
                    i21 &= -57345;
                    iC = ((d1) TarotCardType.getEntries()).c();
                }
                if (i16 != 0) {
                    z5 = true;
                }
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i45 = i21 & (-3670017);
                if (i19 != 0) {
                    fy9Var3 = null;
                } else {
                    fy9Var3 = fy9Var;
                }
                if (i22 != 0) {
                    z6 = false;
                }
                if (i24 != 0) {
                    l26VarB0 = af1.b0(876435724, new z8d(1, egdVarU), l46Var);
                } else {
                    l26VarB0 = l26Var;
                }
                if (i26 != 0) {
                    objR4 = l46Var.R();
                    if (objR4 == obj) {
                        objR4 = new ead(14);
                        l46Var.p0(objR4);
                    }
                    x16Var9 = (x16) objR4;
                } else {
                    x16Var9 = x16Var;
                }
                if (i29 != 0) {
                    objR3 = l46Var.R();
                    if (objR3 == obj) {
                        objR3 = new ead(15);
                        l46Var.p0(objR3);
                    }
                    x16Var10 = (x16) objR3;
                } else {
                    x16Var10 = x16Var2;
                }
                if (i33 != 0) {
                    objR2 = l46Var.R();
                    if (objR2 == obj) {
                        objR2 = new ead(16);
                        l46Var.p0(objR2);
                    }
                    x16Var11 = (x16) objR2;
                } else {
                    i41 = i41;
                    x16Var11 = x16Var3;
                }
                if (i36 != 0) {
                    z12 = true;
                } else {
                    z12 = z4;
                }
                x16 x16Var1112 = x16Var11;
                if (i39 != 0) {
                    objR = l46Var.R();
                    if (objR == obj) {
                        objR = new ead(17);
                        l46Var.p0(objR);
                    }
                    xw9VarQ = xw9VarQ;
                    x16Var12 = (x16) objR;
                } else {
                    x16Var12 = x16Var4;
                }
                z13 = z6;
                z14 = z11;
                fy9Var4 = fy9Var3;
                l26Var3 = l26VarB0;
                x16Var13 = x16Var9;
                x16Var14 = x16Var10;
                egdVar4 = egdVarU;
                i46 = iC;
                z15 = z12;
                x16Var15 = x16Var1112;
            } else {
                if (i54 != 0) {
                    xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                } else {
                    xw9VarQ = xw9Var2;
                }
                if ((i5 & 4) != 0) {
                    egdVarU = u(l46Var);
                    i21 &= -897;
                } else {
                    egdVarU = egdVar2;
                }
                if (i9 != 0) {
                    i10 = 0;
                }
                if ((i5 & 16) != 0) {
                    i21 &= -57345;
                    iC = ((d1) TarotCardType.getEntries()).c();
                }
                if (i16 != 0) {
                    z5 = true;
                }
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i45 = i21 & (-3670017);
                if (i19 != 0) {
                    fy9Var3 = null;
                } else {
                    fy9Var3 = fy9Var;
                }
                if (i22 != 0) {
                    z6 = false;
                }
                if (i24 != 0) {
                    l26VarB0 = af1.b0(876435724, new z8d(1, egdVarU), l46Var);
                } else {
                    l26VarB0 = l26Var;
                }
                if (i26 != 0) {
                    objR4 = l46Var.R();
                    if (objR4 == obj) {
                        objR4 = new ead(14);
                        l46Var.p0(objR4);
                    }
                    x16Var9 = (x16) objR4;
                } else {
                    x16Var9 = x16Var;
                }
                if (i29 != 0) {
                    objR3 = l46Var.R();
                    if (objR3 == obj) {
                        objR3 = new ead(15);
                        l46Var.p0(objR3);
                    }
                    x16Var10 = (x16) objR3;
                } else {
                    x16Var10 = x16Var2;
                }
                if (i33 != 0) {
                    objR2 = l46Var.R();
                    if (objR2 == obj) {
                        objR2 = new ead(16);
                        l46Var.p0(objR2);
                    }
                    x16Var11 = (x16) objR2;
                } else {
                    i41 = i41;
                    x16Var11 = x16Var3;
                }
                if (i36 != 0) {
                    z12 = true;
                } else {
                    z12 = z4;
                }
                x16 x16Var1113 = x16Var11;
                if (i39 != 0) {
                    objR = l46Var.R();
                    if (objR == obj) {
                        objR = new ead(17);
                        l46Var.p0(objR);
                    }
                    xw9VarQ = xw9VarQ;
                    x16Var12 = (x16) objR;
                } else {
                    x16Var12 = x16Var4;
                }
                z13 = z6;
                z14 = z11;
                fy9Var4 = fy9Var3;
                l26Var3 = l26VarB0;
                x16Var13 = x16Var9;
                x16Var14 = x16Var10;
                egdVar4 = egdVarU;
                i46 = iC;
                z15 = z12;
                x16Var15 = x16Var1113;
            }
            l46Var.s();
            xw9Var4 = xw9VarQ;
            mixedDeckSnapshot = (MixedDeckSnapshot) l46Var.k(snd.b);
            if (mixedDeckSnapshot != null) {
                egdVar6 = egdVar4;
                l46Var.f0(-810781893);
                zG = l46Var.g(mixedDeckSnapshot);
                objR16 = l46Var.R();
                if (zG) {
                    List<String> cardOrder14 = mixedDeckSnapshot.getCardOrder();
                    arrayList2 = new ArrayList();
                    it = cardOrder14.iterator();
                    while (it.hasNext()) {
                        int i511117 = i46;
                        tarotSkinIdentifySkinFor = mixedDeckSnapshot.skinFor((String) it.next());
                        if (tarotSkinIdentifySkinFor != null) {
                            arrayList2.add(tarotSkinIdentifySkinFor);
                        }
                        i46 = i511117;
                    }
                    i47 = i46;
                    pr4 pr4Var14 = dt1.a;
                    int iF14 = bm8.F(t72.u(arrayList2, 10));
                    linkedHashMap = new LinkedHashMap(iF14 >= 16 ? iF14 : 16);
                    it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        TarotSkinIdentify tarotSkinIdentify14 = (TarotSkinIdentify) it2.next();
                        boolean z31111111 = z5;
                        iy9 iy9Var14 = new iy9(Integer.valueOf(hfc.q(tarotSkinIdentify14).c()), Float.valueOf(Math.min(tarotSkinIdentify14.getAspectRatio(), 0.5714286f)));
                        linkedHashMap.put(iy9Var14.d(), iy9Var14.e());
                        it2 = it2;
                        z5 = z31111111;
                    }
                    z29 = z5;
                    l46Var.p0(linkedHashMap);
                    objR16 = linkedHashMap;
                } else {
                    List<String> cardOrder15 = mixedDeckSnapshot.getCardOrder();
                    arrayList2 = new ArrayList();
                    it = cardOrder15.iterator();
                    while (it.hasNext()) {
                        int i511118 = i46;
                        tarotSkinIdentifySkinFor = mixedDeckSnapshot.skinFor((String) it.next());
                        if (tarotSkinIdentifySkinFor != null) {
                            arrayList2.add(tarotSkinIdentifySkinFor);
                        }
                        i46 = i511118;
                    }
                    i47 = i46;
                    pr4 pr4Var15 = dt1.a;
                    int iF15 = bm8.F(t72.u(arrayList2, 10));
                    linkedHashMap = new LinkedHashMap(iF15 >= 16 ? iF15 : 16);
                    it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        TarotSkinIdentify tarotSkinIdentify15 = (TarotSkinIdentify) it2.next();
                        boolean z31111112 = z5;
                        iy9 iy9Var15 = new iy9(Integer.valueOf(hfc.q(tarotSkinIdentify15).c()), Float.valueOf(Math.min(tarotSkinIdentify15.getAspectRatio(), 0.5714286f)));
                        linkedHashMap.put(iy9Var15.d(), iy9Var15.e());
                        it2 = it2;
                        z5 = z31111112;
                    }
                    z29 = z5;
                    l46Var.p0(linkedHashMap);
                    objR16 = linkedHashMap;
                }
                linkedHashMapF = dt1.f((Map) objR16, l46Var);
                if (linkedHashMapF == null) {
                    l46Var.r(false);
                    ojbVarV3 = l46Var.v();
                    if (ojbVarV3 != null) {
                        final int i511119 = 0;
                        final boolean z31111113 = z29;
                        final int i5111110 = i10;
                        final int i5111111 = i47;
                        ojbVarV3.d = new l26() { // from class: nfd
                            @Override // defpackage.l26
                            public final Object z(Object obj3, Object obj4) {
                                int i6118 = i511119;
                                wef wefVar = wef.a;
                                int i6119 = i4;
                                int i61110 = i3;
                                switch (i6118) {
                                    case 0:
                                        ((Integer) obj4).getClass();
                                        int iP = k99.P(i61110 | 1);
                                        int iP2 = k99.P(i6119);
                                        p8c.i(j09Var, xw9Var4, egdVar6, i5111110, i5111111, z31111113, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP, iP2, i5);
                                        break;
                                    case 1:
                                        ((Integer) obj4).getClass();
                                        int iP3 = k99.P(i61110 | 1);
                                        int iP4 = k99.P(i6119);
                                        p8c.i(j09Var, xw9Var4, egdVar6, i5111110, i5111111, z31111113, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP3, iP4, i5);
                                        break;
                                    default:
                                        ((Integer) obj4).getClass();
                                        int iP5 = k99.P(i61110 | 1);
                                        int iP6 = k99.P(i6119);
                                        p8c.i(j09Var, xw9Var4, egdVar6, i5111110, i5111111, z31111113, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP5, iP6, i5);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                        return;
                    }
                    return;
                }
                egdVar5 = egdVar6;
                z5 = z29;
                r3 = 0;
                gw8Var = new gw8(linkedHashMapF);
                l46Var.r(false);
            } else {
                mixedDeckSnapshot = mixedDeckSnapshot;
                egdVar5 = egdVar4;
                i47 = i46;
                r3 = 0;
                l46Var.f0(-810539412);
                l46Var.r(false);
                gw8Var = null;
            }
            if (mixedDeckSnapshot == null) {
                l46Var.f0(-810470808);
                if (fy9Var4 == null) {
                    l46Var.f0(1774971708);
                    fy9VarE = dt1.e(null, l46Var, r3, 6);
                    l46Var.r(r3);
                } else {
                    l46Var.f0(1774971088);
                    l46Var.r(r3);
                    fy9VarE = fy9Var4;
                }
                if (fy9VarE == null) {
                    l46Var.r(r3);
                    ojbVarV2 = l46Var.v();
                    if (ojbVarV2 != null) {
                        final int i6118 = 1;
                        final boolean z31111114 = z5;
                        final int i6119 = i10;
                        final egd egdVar114 = egdVar5;
                        final int i61110 = i47;
                        ojbVarV2.d = new l26() { // from class: nfd
                            @Override // defpackage.l26
                            public final Object z(Object obj3, Object obj4) {
                                int i61111 = i6118;
                                wef wefVar = wef.a;
                                int i61112 = i4;
                                int i61113 = i3;
                                switch (i61111) {
                                    case 0:
                                        ((Integer) obj4).getClass();
                                        int iP = k99.P(i61113 | 1);
                                        int iP2 = k99.P(i61112);
                                        p8c.i(j09Var, xw9Var4, egdVar114, i6119, i61110, z31111114, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP, iP2, i5);
                                        break;
                                    case 1:
                                        ((Integer) obj4).getClass();
                                        int iP3 = k99.P(i61113 | 1);
                                        int iP4 = k99.P(i61112);
                                        p8c.i(j09Var, xw9Var4, egdVar114, i6119, i61110, z31111114, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP3, iP4, i5);
                                        break;
                                    default:
                                        ((Integer) obj4).getClass();
                                        int iP5 = k99.P(i61113 | 1);
                                        int iP6 = k99.P(i61112);
                                        p8c.i(j09Var, xw9Var4, egdVar114, i6119, i61110, z31111114, z14, fy9Var4, z13, l26Var3, x16Var13, x16Var14, x16Var15, z15, x16Var12, (l46) obj3, iP5, iP6, i5);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                        return;
                    }
                    return;
                }
                l46Var.r(r3);
                fy9Var5 = fy9VarE;
            } else {
                z5 = z5;
                l46Var.f0(-810390612);
                l46Var.r(r3);
                fy9Var5 = null;
            }
            objR5 = l46Var.R();
            if (objR5 == obj) {
                objR5 = af1.E(l46Var);
                l46Var.p0(objR5);
            }
            aw2Var = (aw2) objR5;
            objR6 = l46Var.R();
            if (objR6 == obj) {
                objR6 = q1c.f(s13.a);
                l46Var.p0(objR6);
            }
            e89Var = (e89) objR6;
            i48 = egdVar5.a;
            fy9 fy9Var13 = fy9Var4;
            i49 = (i45 & 896) ^ 384;
            final boolean z31111115 = z13;
            if (i49 > 256) {
                gw8Var2 = gw8Var;
                if ((i45 & 384) != 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            } else {
                gw8Var2 = gw8Var;
                if ((i45 & 384) != 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            }
            i50 = (57344 & i45) ^ 24576;
            boolean z31111116 = z16;
            if (i50 > 16384) {
                z17 = z14;
                if ((i45 & 24576) != 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
            } else {
                z17 = z14;
                if ((i45 & 24576) != 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
            }
            z19 = z31111116 | z18;
            Object objR116 = l46Var.R();
            if (z19) {
                if (i47 < 0) {
                    qc0.j("Failed requirement.");
                    return;
                }
                ycgVar = new ycg(i48, i48 >> 31);
                arrayList = new ArrayList(i47);
                i51 = 0;
                while (i51 < i47) {
                    arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                    i51++;
                    aw2Var = aw2Var;
                    x16Var14 = x16Var14;
                    x16Var12 = x16Var12;
                    x16Var15 = x16Var15;
                }
                aw2Var2 = aw2Var;
                x16Var16 = x16Var14;
                x16Var17 = x16Var15;
                x16Var18 = x16Var12;
                l46Var.p0(arrayList);
                obj2 = arrayList;
            } else {
                if (i47 < 0) {
                    qc0.j("Failed requirement.");
                    return;
                }
                ycgVar = new ycg(i48, i48 >> 31);
                arrayList = new ArrayList(i47);
                i51 = 0;
                while (i51 < i47) {
                    arrayList.add(new cle(((ycgVar.b() * 2.0f) - 1.0f) * 0.3f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, ((ycgVar.b() * 2.0f) - 1.0f) * 0.15f, (ycgVar.b() * 0.1f) + 0.06f));
                    i51++;
                    aw2Var = aw2Var;
                    x16Var14 = x16Var14;
                    x16Var12 = x16Var12;
                    x16Var15 = x16Var15;
                }
                aw2Var2 = aw2Var;
                x16Var16 = x16Var14;
                x16Var17 = x16Var15;
                x16Var18 = x16Var12;
                l46Var.p0(arrayList);
                obj2 = arrayList;
            }
            final List list10 = (List) obj2;
            if (i49 <= 256) {
            }
            z20 = ((i50 <= 16384 && l46Var.e(i47)) || (i45 & 24576) == 16384) | ((i49 <= 256 && l46Var.g(egdVar5)) || (i45 & 384) == 256);
            objR7 = l46Var.R();
            if (z20) {
                objR7 = new jie(i47, i48);
                l46Var.p0(objR7);
            } else {
                objR7 = new jie(i47, i48);
                l46Var.p0(objR7);
            }
            jieVar = (jie) objR7;
            gh6VarW0 = kj0.w0(l46Var);
            if (egdVar5.a() == hgd.e) {
                z21 = true;
            } else {
                z21 = false;
            }
            i52 = i41 >> 6;
            zH = l46Var.h(z21);
            objR8 = l46Var.R();
            if (zH) {
                objR8 = q1c.f(Boolean.valueOf(!z21));
                l46Var.p0(objR8);
            } else {
                objR8 = q1c.f(Boolean.valueOf(!z21));
                l46Var.p0(objR8);
            }
            e89Var2 = (e89) objR8;
            objR9 = l46Var.R();
            if (objR9 == obj) {
                objR9 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR9);
            }
            e89Var3 = (e89) objR9;
            objR10 = l46Var.R();
            if (objR10 == obj) {
                objR10 = af1.E(l46Var);
                l46Var.p0(objR10);
            }
            aw2Var3 = (aw2) objR10;
            Boolean boolValueOf10 = Boolean.valueOf(z21);
            zH2 = l46Var.h(z21) | l46Var.g(e89Var2);
            objR11 = l46Var.R();
            if (zH2) {
                objR11 = new vm4(z21, e89Var3, e89Var2, null);
                l46Var.p0(objR11);
            } else {
                objR11 = new vm4(z21, e89Var3, e89Var2, null);
                l46Var.p0(objR11);
            }
            af1.o((l26) objR11, l46Var, boolValueOf10);
            if (((Boolean) e89Var3.getValue()).booleanValue()) {
                l46Var.f0(1968840980);
                zI3 = l46Var.i(aw2Var3);
                objR15 = l46Var.R();
                if (zI3) {
                    i53 = 1;
                    objR15 = new om4(aw2Var3, e89Var3, i53);
                    l46Var.p0(objR15);
                } else {
                    i53 = 1;
                    objR15 = new om4(aw2Var3, e89Var3, i53);
                    l46Var.p0(objR15);
                }
                vd0.i(i52 & 112, (a26) objR15, l46Var, null, z15);
                z22 = false;
                l46Var.r(false);
            } else {
                i53 = 1;
                z22 = false;
                l46Var.f0(1969148500);
                l46Var.r(false);
            }
            if (((Boolean) e89Var2.getValue()).booleanValue()) {
                z23 = z22;
            } else {
                z23 = z22;
            }
            objR12 = l46Var.R();
            if (objR12 == obj) {
                objR12 = qk2.d(0.0f);
                l46Var.p0(objR12);
            }
            jxVar = (jx) objR12;
            e89VarI = q1c.i(x16Var13, l46Var);
            x16Var8 = x16Var18;
            e89VarI2 = q1c.i(x16Var8, l46Var);
            x16 x16Var218 = x16Var16;
            e89VarI3 = q1c.i(x16Var218, l46Var);
            boolean z31111117 = z15;
            e89VarI4 = q1c.i(x16Var17, l46Var);
            x16 x16Var219 = x16Var13;
            Object[] objArr10 = {egdVar5, Boolean.valueOf(z5), Boolean.valueOf(z17), jieVar, gh6VarW0};
            if (i49 > 256) {
                egdVar3 = egdVar5;
                if ((i45 & 384) != 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
            } else {
                egdVar3 = egdVar5;
                if ((i45 & 384) != 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
            }
            aw2Var4 = aw2Var2;
            boolean zI14 = z24 | l46Var.i(aw2Var4);
            if ((i45 & 458752) == 131072) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z31111118 = zI14 | z25;
            z26 = z17;
            zH3 = z31111118 | l46Var.h(z26) | l46Var.g(jieVar) | l46Var.i(gh6VarW0) | l46Var.g(e89VarI3) | l46Var.g(e89VarI4) | l46Var.g(e89VarI2);
            objR13 = l46Var.R();
            if (zH3) {
                objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                z27 = z26;
                jieVar2 = jieVar;
                e89Var4 = e89VarI2;
                l46Var.p0(objR13);
            } else {
                objR13 = new ufd(egdVar3, aw2Var4, z5, z26, e89Var, jieVar, gh6VarW0, e89VarI3, e89VarI4, e89VarI2, null);
                z27 = z26;
                jieVar2 = jieVar;
                e89Var4 = e89VarI2;
                l46Var.p0(objR13);
            }
            af1.r(objArr10, (l26) objR13, l46Var);
            Integer numValueOf11 = Integer.valueOf(i10);
            if ((i45 & 7168) == 2048) {
                z28 = true;
            } else {
                z28 = false;
            }
            zI2 = l46Var.i(jxVar) | z28 | ((i49 <= 256 && l46Var.g(egdVar3)) || (i45 & 384) == 256) | l46Var.g(e89VarI) | l46Var.g(e89Var4);
            objR14 = l46Var.R();
            if (zI2) {
                objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                jxVar2 = jxVar;
                l46Var.p0(objR14);
            } else {
                objR14 = new wfd(i10, jxVar, egdVar3, e89VarI, e89Var4, null);
                jxVar2 = jxVar;
                l46Var.p0(objR14);
            }
            af1.p(egdVar3, numValueOf11, (l26) objR14, l46Var);
            e1b e1bVarA11 = dt1.a.a(gw8Var2);
            final egd egdVar115 = egdVar3;
            l26 l26Var14 = new l26() { // from class: ofd
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // defpackage.l26
                public final Object z(Object obj3, Object obj4) {
                    l46 l46Var2 = (l46) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                        FillElement fillElement = b.c;
                        j09 j09VarD = j09Var.D(fillElement);
                        xn8 xn8VarC = s21.c(ndb.b, false);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarD);
                        lf2.q.getClass();
                        l46Var2.j0();
                        boolean z31111119 = l46Var2.S;
                        ov7 ov7Var = LayoutNode.h1;
                        if (z31111119) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        he2 he2Var = hj6.z;
                        dec.l(he2Var, l46Var2, xn8VarC);
                        he2 he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var2, u8aVarM);
                        Integer numValueOf12 = Integer.valueOf(iHashCode);
                        he2 he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var2, numValueOf12);
                        dec.k(l46Var2);
                        he2 he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var2, j09VarJ);
                        j09 j09VarY = ynb.Y(fillElement, xw9Var4);
                        c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                        int iHashCode2 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM2 = l46Var2.m();
                        j09 j09VarJ2 = m93.J(l46Var2, j09VarY);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, c92VarA);
                        dec.l(he2Var2, l46Var2, u8aVarM2);
                        ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ2);
                        int i61111 = i10;
                        if (i61111 == 0) {
                            ib8.r(24.0f, 91962542, l46Var2, l46Var2, g09.a);
                            l26Var3.z(l46Var2, 0);
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(92030773);
                            l46Var2.r(false);
                        }
                        s13 s13Var = (s13) e89Var.getValue();
                        boolean z311111110 = z27;
                        boolean z311111111 = !z311111110 || z23;
                        float fFloatValue = ((Number) jxVar2.e()).floatValue();
                        egd egdVar116 = egdVar115;
                        boolean zG2 = l46Var2.g(egdVar116);
                        Object objR117 = l46Var2.R();
                        if (zG2 || objR117 == sf2.a) {
                            objR117 = new ffd(egdVar116, 0);
                            l46Var2.p0(objR117);
                        }
                        p8c.a(egdVar116, i61111, s13Var, i47, z31111115, z311111110, list10, jieVar2, z311111111, fFloatValue, fy9Var5, (x16) objR117, l46Var2, 6);
                        l46Var2.r(true);
                        l46Var2.r(true);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            };
            l26Var2 = l26Var3;
            z8 = z31111115;
            z9 = z27;
            mh3.a(e1bVarA11, af1.b0(1669815857, l26Var14, l46Var), l46Var, 56);
            fy9Var2 = fy9Var13;
            x16Var6 = x16Var218;
            z10 = z31111117;
            x16Var5 = x16Var219;
            x16Var7 = x16Var17;
            xw9Var3 = xw9Var4;
            i42 = i10;
            i43 = i47;
        } else {
            l46Var.Z();
            x16Var5 = x16Var;
            x16Var6 = x16Var2;
            x16Var7 = x16Var3;
            i42 = i10;
            z8 = z6;
            xw9Var3 = xw9Var2;
            egdVar3 = egdVar2;
            i43 = iC;
            z5 = z5;
            z9 = z2;
            fy9Var2 = fy9Var;
            l26Var2 = l26Var;
            z10 = z4;
            x16Var8 = x16Var4;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final int i61111 = 2;
            ojbVarV.d = new l26() { // from class: nfd
                @Override // defpackage.l26
                public final Object z(Object obj3, Object obj4) {
                    int i61112 = i61111;
                    wef wefVar = wef.a;
                    int i61113 = i4;
                    int i61114 = i3;
                    switch (i61112) {
                        case 0:
                            ((Integer) obj4).getClass();
                            int iP = k99.P(i61114 | 1);
                            int iP2 = k99.P(i61113);
                            p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP, iP2, i5);
                            break;
                        case 1:
                            ((Integer) obj4).getClass();
                            int iP3 = k99.P(i61114 | 1);
                            int iP4 = k99.P(i61113);
                            p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP3, iP4, i5);
                            break;
                        default:
                            ((Integer) obj4).getClass();
                            int iP5 = k99.P(i61114 | 1);
                            int iP6 = k99.P(i61113);
                            p8c.i(j09Var, xw9Var3, egdVar3, i42, i43, z5, z9, fy9Var2, z8, l26Var2, x16Var5, x16Var6, x16Var7, z10, x16Var8, (l46) obj3, iP5, iP6, i5);
                            break;
                    }
                    return wefVar;
                }
            };
        }
    }

    public static final void j(int i, l46 l46Var, boolean z) {
        l46 l46Var2;
        l46Var.h0(-377479896);
        int i2 = (l46Var.h(z) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            Boolean boolValueOf = Boolean.valueOf(z);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new e2d(19);
                l46Var.p0(objR);
            }
            l46Var2 = l46Var;
            kn2.c(boolValueOf, null, (a26) objR, null, "shuffle-header", null, b21.j, l46Var2, (i2 & 14) | 1597824, 42);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ci1(z, i, 10);
        }
    }

    public static final void k(List list, float f, boolean z, boolean z2, List list2, fy9 fy9Var, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-969768197);
        int i2 = (l46Var2.g(list) ? 4 : 2) | i;
        float f2 = f;
        if ((i & 48) == 0) {
            i2 |= l46Var2.d(f2) ? 32 : 16;
        }
        boolean z3 = z;
        if ((i & 384) == 0) {
            i2 |= l46Var2.h(z3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        boolean z4 = z2;
        int i3 = i2 | (l46Var2.h(z4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? l46Var2.g(list2) : l46Var2.i(list2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        fy9 fy9Var2 = fy9Var;
        if ((196608 & i) == 0) {
            i3 |= l46Var2.i(fy9Var2) ? 131072 : 65536;
        }
        if (l46Var2.W(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    t72.Z();
                    throw null;
                }
                int i6 = i3 << 12;
                g((fgd) obj, z4, i4, list.size(), (cle) s72.y0(i4, list2), f2, z3, fy9Var2, l46Var2, ((i3 << 6) & 29360128) | ((i3 >> 6) & 112) | (i6 & 458752) | (i6 & 3670016) | 16777216);
                f2 = f;
                z3 = z;
                z4 = z2;
                fy9Var2 = fy9Var;
                l46Var2 = l46Var;
                i4 = i5;
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new yna(list, f, z, z2, list2, fy9Var, i);
        }
    }

    public static final void l(List list, List list2, final boolean z, final boolean z2, final String str, a26 a26Var, final x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        list.getClass();
        list2.getClass();
        a26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(272666926);
        int i2 = i | (l46Var.g(list) ? 4 : 2) | (l46Var.g(list2) ? 32 : 16) | (l46Var.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(str) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if ((i & 196608) == 0) {
            i2 |= l46Var.i(a26Var) ? 131072 : 65536;
        }
        int i3 = i2 | (l46Var.i(x16Var) ? 1048576 : 524288) | (l46Var.i(x16Var2) ? 8388608 : 4194304);
        if (l46Var.W(i3 & 1, (4793491 & i3) != 4793490)) {
            xdc.a(b.c, af1.b0(-460335118, new mb0(x16Var2, z, 9), l46Var), af1.b0(-196638093, new l26() { // from class: swd
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    l46 l46Var2 = (l46) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                        g09 g09Var = g09.a;
                        j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, ynb.b0(32.0f, 0.0f, mh3.N(b.c(g09Var, 1.0f)), 2));
                        c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarD0);
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
                        if (z2) {
                            l46Var2.f0(1202057000);
                            hfc.a(48, l46Var2, b.c(g09Var, 1.0f), str);
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(1202224896);
                            j09 j09VarC = b.c(g09Var, 1.0f);
                            boolean z3 = z;
                            String strQ = afc.q(z3 ? R.string.start_question : R.string.confirm_spread, l46Var2);
                            boolean zH = l46Var2.h(z3);
                            x16 x16Var3 = x16Var;
                            boolean zG = zH | l46Var2.g(x16Var3);
                            Object objR = l46Var2.R();
                            if (zG || objR == sf2.a) {
                                objR = new on2(x16Var3, z3);
                                l46Var2.p0(objR);
                            }
                            ym8.h(j09VarC, false, strQ, false, (x16) objR, l46Var2, 6, 10);
                            l46Var2.r(false);
                        }
                        l46Var2.r(true);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), null, null, 0, ((e8b) l46Var.k(l8b.a)).a, 0L, null, af1.b0(547088445, new ffb(z, list, list2, a26Var), l46Var), l46Var, 805306806, 440);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jc2(list, list2, z, z2, str, a26Var, x16Var, x16Var2, i);
        }
    }

    public static void m() {
        ok8.o("Not in application's main thread", t());
    }

    public static otf n(i0b i0bVar) {
        if (i0bVar.m() == 0) {
            return otf.b;
        }
        List listN = i0bVar.n();
        listN.getClass();
        return new otf(listN);
    }

    public static final void o(q8c q8cVar, String str) {
        q8cVar.getClass();
        x8c x8cVarW0 = q8cVar.W0(str);
        try {
            x8cVarW0.R0();
            cgg.t(x8cVarW0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(x8cVarW0, th);
                throw th2;
            }
        }
    }

    public static final boolean p(SpreadRecommendationResult spreadRecommendationResult) {
        spreadRecommendationResult.getClass();
        if (!spreadRecommendationResult.getPatternData().isEmpty()) {
            List<PatternData> patternData = spreadRecommendationResult.getPatternData();
            if (patternData == null || !patternData.isEmpty()) {
                Iterator<T> it = patternData.iterator();
                while (it.hasNext()) {
                    String desc = ((PatternData) it.next()).getDesc();
                    if (desc == null || desc.length() == 0) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static mue q(l46 l46Var) {
        long jD;
        pr4 pr4Var = l8b.a;
        if (k8b.e((e8b) l46Var.k(pr4Var))) {
            l46Var.f0(-388867529);
            l46Var.r(false);
            jD = abg.d(4284112824L);
        } else {
            l46Var.f0(-388866380);
            jD = ((e8b) l46Var.k(pr4Var)).q;
            l46Var.r(false);
        }
        return new mue(jD, 0L, null, null, ((y8b) l46Var.k(x8b.a)).c, 0L, 0L, 0, 0, 0L, null, null, 16777182);
    }

    public static mue r(l46 l46Var) {
        yp5 yp5Var = ((y8b) l46Var.k(x8b.a)).b;
        return new mue(0L, w6c.l(15), new ar5(510), null, yp5Var, 0L, 0L, 0, 0, w6c.k(17.9d), null, null, 16646105);
    }

    public static mue s(l46 l46Var) {
        yp5 yp5Var = ((y8b) l46Var.k(x8b.a)).b;
        return new mue(0L, w6c.l(15), new ar5(Constants.MINIMAL_ERROR_STATUS_CODE), null, yp5Var, 0L, 0L, 0, 0, w6c.k(17.9d), null, null, 16646105);
    }

    public static boolean t() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static final egd u(l46 l46Var) {
        Object objR = l46Var.R();
        if (objR == sf2.a) {
            objR = new egd();
            l46Var.p0(objR);
        }
        return (egd) objR;
    }

    public static void v(Runnable runnable) {
        if (t()) {
            runnable.run();
        } else {
            ok8.o("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static final Object w(h48 h48Var, boolean z, wg6 wg6Var, x16 x16Var, gbe gbeVar) {
        pl1 pl1Var = new pl1(1, k99.D(gbeVar));
        pl1Var.v();
        cag cagVar = new cag(h48Var, pl1Var, x16Var);
        if (z) {
            wg6Var.Z0(nu4.a, new lwg(18, h48Var, cagVar));
        } else {
            h48Var.a(cagVar);
        }
        pl1Var.x(new mz0(wg6Var, h48Var, cagVar, 5));
        return pl1Var.t();
    }

    public static final void x(int i, String str) {
        throw new SQLException(tec.e(i, "Error code: ") + ", message: ".concat(str));
    }
}

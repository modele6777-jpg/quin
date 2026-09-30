package defpackage;

import ai.askquin.R;
import ai.askquin.model.Scene;
import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.b;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.time.LocalDate;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class no6 {
    public static final float a = 56.0f;
    public static final float b = 44.0f;
    public static final long c = abg.d(4284961270L);
    public static final long d = abg.c(259288311);
    public static final long e = abg.c(2063597567);
    public static final long f = abg.c(268435455);
    public static final long g = abg.c(1308618195);
    public static final long h = abg.c(1296908075);
    public static final x6f i = b21.T(Constants.MINIMAL_ERROR_STATUS_CODE, 0, gs4.a, 2);

    public static final void a(z63 z63Var, boolean z, boolean z2, j09 j09Var, l46 l46Var, int i2) {
        int i3;
        int i4;
        boolean z3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1960206915);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var2.g(z63Var) : l46Var2.i(z63Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var2.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var2.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var2.W(i3 & 1, (i3 & 1171) != 1170)) {
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var);
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
            boolean z4 = (z63Var == null || z2) ? false : true;
            g09 g09Var = g09.a;
            j09 j09VarA = b.a(z4 ? androidx.compose.foundation.layout.b.l(g09Var, 72.0f) : androidx.compose.foundation.layout.b.c, "daily_fortune_artwork_icon");
            if (z4) {
                i4 = R.drawable.img_home_daily_fortune_drawn_classic;
            } else if (z && z2) {
                i4 = R.drawable.img_home_daily_fortune_tomorrow_neo;
            } else if (z) {
                i4 = R.drawable.img_home_daily_fortune_tomorrow_classic;
            } else {
                i4 = z2 ? R.drawable.img_home_daily_fortune_neo : R.drawable.img_home_daily_fortune_classic;
            }
            feg.j(od4.A(i4, 0, l46Var2), null, j09VarA, null, an2.b, 0.0f, null, l46Var2, 24632, 104);
            if (z63Var != null) {
                l46Var2.f0(-1993791901);
                j09 j09VarA2 = b.a(androidx.compose.foundation.layout.b.p(g09Var, 40.0f), "daily_fortune_artwork_tarot_card");
                qhe qheVar = z63Var.b;
                TarotSkinIdentify tarotSkinIdentify = z63Var.f;
                if (tarotSkinIdentify == null) {
                    l46Var2.f0(-1311234361);
                    tarotSkinIdentify = ((die) l46Var2.k(snd.a)).a;
                } else {
                    l46Var2.f0(-1311236252);
                }
                l46Var2.r(false);
                z3 = true;
                o7c.d(j09VarA2, qheVar, tarotSkinIdentify, true, null, 4.0f, null, false, l46Var, 199686, 208);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                z3 = true;
                l46Var2.f0(-1993482273);
                l46Var2.r(false);
            }
            l46Var2.r(z3);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new t43(z63Var, z, z2, j09Var, i2, 1);
        }
    }

    public static final void b(final ii6 ii6Var, final z63 z63Var, final LocalDate localDate, boolean z, final boolean z2, float f2, final float f3, final boolean z3, final x16 x16Var, final j09 j09Var, l46 l46Var, final int i2) {
        boolean z4;
        boolean z5;
        Context context;
        float f4;
        j09 j09VarU;
        y6c y6cVar;
        l46 l46Var2;
        float f5;
        l46 l46Var3;
        int i3;
        j09 j09VarA;
        j09 j09VarA2;
        j09 j09VarA3;
        final float f6 = f2;
        l46 l46Var4 = l46Var;
        lx0 lx0Var = ndb.e;
        lx0 lx0Var2 = ndb.g;
        l46Var4.h0(-2079927129);
        int i4 = i2 | (l46Var4.g(ii6Var) ? 4 : 2) | (l46Var4.i(z63Var) ? 32 : 16) | (l46Var4.i(localDate) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var4.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var4.d(f6) ? 131072 : 65536) | (l46Var4.d(f3) ? 1048576 : 524288) | (l46Var4.i(x16Var) ? 67108864 : 33554432);
        if (l46Var4.W(i4 & 1, (i4 & 306783379) != 306783378)) {
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var4.k(pr4Var));
            sw3 sw3Var = (sw3) l46Var4.k(zg2.h);
            float fH0 = sw3Var.h0();
            float f7 = fH0 >= 1.5f ? 240.0f * fH0 : 96.0f;
            boolean z6 = fH0 >= 1.5f;
            boolean zS = g21.S(l46Var4);
            Context context2 = (Context) l46Var4.k(uq.b);
            y6c y6cVarB = zF ? a7c.b(0.0f) : a7c.b(24.0f);
            g09 g09Var = g09.a;
            if (zF && z3) {
                l46Var4.f0(384817961);
                l46Var4.r(false);
                y6cVar = y6cVarB;
                l46Var2 = l46Var4;
                context = context2;
                f4 = f7;
                z5 = true;
                j09VarU = g09Var;
            } else if (zF) {
                l46Var4.f0(384861268);
                j09 j09VarT = b21.t(b21.t(tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var4.k(pr4Var)).a, g21.f), new uc2(5, 1.0f)), new ac(((e8b) l46Var4.k(pr4Var)).A, 11));
                l46Var4.r(false);
                l46Var2 = l46Var4;
                j09VarU = j09VarT;
                y6cVar = y6cVarB;
                f4 = f7;
                context = context2;
                z5 = true;
            } else {
                l46Var4.f0(385032977);
                long j = y72.j;
                z5 = true;
                context = context2;
                f4 = f7;
                j09VarU = u(y6cVarB, ii6Var, j, j, 0L, null, l46Var4, 112);
                y6cVar = y6cVarB;
                l46Var2 = l46Var4;
                l46Var2.r(false);
            }
            float f8 = zF ? 32.0f : 12.0f;
            String strQ = afc.q(z ? R.string.home_daily_fortune_tomorrow_title : R.string.daily_universe_tarot, l46Var2);
            String strA = vpf.A(feg.W(localDate), context);
            byte b2 = z ? (byte) -1082130432 : (byte) 1065353216;
            float fP0 = sw3Var.p0(12.0f);
            j09 j09VarF = androidx.compose.foundation.layout.b.f(f4, 0.0f, androidx.compose.foundation.layout.b.c(j09Var, 1.0f), 2);
            lx0 lx0Var3 = ndb.b;
            xn8 xn8VarC = s21.c(lx0Var3, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarF);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z7 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z7) {
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
            byte b3 = b2;
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            y6c y6cVar2 = y6cVar;
            j09 j09VarC = androidx.compose.foundation.b.c(fillElement.D(j09VarU), false, null, null, x16Var, 15);
            xn8 xn8VarC2 = s21.c(lx0Var3, false);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarC);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8VarC2);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            j09 j09VarE = oa7.E(fillElement, y6cVar2);
            xn8 xn8VarC3 = s21.c(lx0Var3, false);
            int iHashCode3 = Long.hashCode(l46Var.T);
            u8a u8aVarM3 = l46Var.m();
            j09 j09VarJ3 = m93.J(l46Var, j09VarE);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8VarC3);
            dec.l(he2Var2, l46Var, u8aVarM3);
            ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ3);
            if (zF) {
                f5 = f2;
                l46Var3 = l46Var;
                i3 = 131072;
                l46Var3.f0(1293896877);
                l46Var3.r(false);
            } else {
                l46Var.f0(1293676498);
                l46Var3 = l46Var;
                i3 = 131072;
                e(z, f2, zS, fillElement, l46Var3, 3078 | ((i4 >> 12) & 112));
                f5 = f2;
                l46Var3.r(false);
            }
            lx0 lx0Var4 = z ? lx0Var2 : lx0Var;
            d31 d31Var = d31.a;
            j09 j09VarP = androidx.compose.foundation.layout.b.p(d31Var.a(g09Var, lx0Var4), 96.0f);
            FillElement fillElement2 = androidx.compose.foundation.layout.b.b;
            j09 j09VarD = j09VarP.D(fillElement2);
            int i5 = i4 & 458752;
            boolean zD = (i5 == i3 ? z5 : false) | l46Var3.d(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02cd: ARITH (r3v11 'zD' boolean) = (wrap boolean:0x02c8: ARITH (wrap boolean:?: TERNARY null = ((r2v20 'i5' int) == (r11v17 'i3' int)) ? (r29v2 'z5' boolean) : false) | (wrap boolean:0x02c4: INVOKE (r4v9 'l46Var3' l46), (r17v7 float) VIRTUAL call: l46.d(float):boolean A[MD:(float):boolean (m), WRAPPED] (LINE:709)) A[DONT_WRAP, WRAPPED] (LINE:713)) | (wrap boolean:0x02c9: INVOKE (r4v9 'l46Var3' l46), (r28v2 float) VIRTUAL call: l46.d(float):boolean A[MD:(float):boolean (m), WRAPPED] (LINE:714)) A[DECLARE_VAR] (LINE:718) in method: no6.b(ii6, z63, java.time.LocalDate, boolean, boolean, float, float, boolean, x16, j09, l46, int):void, file: classes.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v7 float
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1102
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.no6.b(ii6, z63, java.time.LocalDate, boolean, boolean, float, float, boolean, x16, j09, l46, int):void");
        }

        public static final void c(String str, String str2, boolean z, j09 j09Var, l46 l46Var, int i2) {
            int i3;
            l46 l46Var2 = l46Var;
            l46Var2.h0(-1482811277);
            if ((i2 & 6) == 0) {
                i3 = (l46Var2.g(str) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= l46Var2.g(str2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= l46Var2.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i2 & 3072) == 0) {
                i3 |= l46Var2.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if (l46Var2.W(i3 & 1, (i3 & 1171) != 1170)) {
                xn8 xn8VarC = s21.c(ndb.b, false);
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
                dec.l(he2Var, l46Var2, xn8VarC);
                he2 he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var2, u8aVarM);
                Integer numValueOf = Integer.valueOf(iHashCode);
                he2 he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var2, numValueOf);
                dec.k(l46Var2);
                he2 he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var2, j09VarJ);
                lx0 lx0Var = ndb.f;
                d31 d31Var = d31.a;
                g09 g09Var = g09.a;
                j09 j09VarB0 = ynb.b0(8.0f, 0.0f, androidx.compose.foundation.layout.b.c(d31Var.a(g09Var, lx0Var), 1.0f), 2);
                c92 c92VarA = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                int iHashCode2 = Long.hashCode(l46Var2.T);
                u8a u8aVarM2 = l46Var2.m();
                j09 j09VarJ2 = m93.J(l46Var2, j09VarB0);
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
                j09 j09VarA = b.a(g09Var, z ? "daily_fortune_tomorrow_compact_date" : "daily_fortune_today_compact_date");
                mue mueVar = pue.a;
                mue mueVarQ = pue.q(l46Var2);
                yp5 yp5Var = ((y8b) l46Var2.k(x8b.a)).a;
                pr4 pr4Var = l8b.a;
                int i4 = i3;
                nte.b(str, j09VarA, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, yp5Var, 0L, null, new jme(3), 0L, 2, false, 1, 0, null, mueVarQ, l46Var2, i3 & 14, 24960, 109432);
                nte.b(str2, b.a(g09Var, z ? "daily_fortune_tomorrow_compact_title" : "daily_fortune_today_compact_title"), ((e8b) l46Var2.k(pr4Var)).s, 0L, null, null, 0L, null, new jme(3), 0L, 2, false, 1, 0, null, pue.g(l46Var2), l46Var2, (i4 >> 3) & 14, 24960, 109560);
                l46Var2 = l46Var2;
                l46Var2.r(true);
                l46Var2.r(true);
            } else {
                l46Var2.Z();
            }
            ojb ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new a60((Object) str, str2, z, (Object) j09Var, i2, 7);
            }
        }

        public static final void d(final boolean z, final boolean z2, final j09 j09Var, l46 l46Var, final int i2) {
            int i3;
            int i4;
            l46Var.h0(1914113971);
            if ((i2 & 6) == 0) {
                i3 = (l46Var.h(z) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= l46Var.h(z2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
                lx0 lx0Var = ndb.b;
                xn8 xn8VarC = s21.c(lx0Var, false);
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
                dec.l(hj6.z, l46Var, xn8VarC);
                dec.l(hj6.y, l46Var, u8aVarM);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ);
                if (z) {
                    lx0Var = ndb.d;
                }
                j09 j09VarA = b.a(androidx.compose.foundation.layout.b.l(tm7.M(d31.a.a(g09.a, lx0Var), z ? 2.0f : -2.0f, -2.0f), 36.0f), z ? "daily_fortune_tomorrow_compact_icon" : "daily_fortune_today_compact_icon");
                if (z2 && z) {
                    i4 = R.drawable.img_home_daily_fortune_tomorrow_compact_neo;
                } else if (z2) {
                    i4 = R.drawable.img_home_daily_fortune_today_compact_neo;
                } else {
                    i4 = z ? R.drawable.img_home_daily_fortune_tomorrow_compact : R.drawable.img_home_daily_fortune_today_compact;
                }
                feg.j(od4.A(i4, 0, l46Var), null, j09VarA, null, an2.b, 0.0f, null, l46Var, 24632, 104);
                l46Var.r(true);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: eo6
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i2 | 1);
                        no6.d(z, z2, j09Var, (l46) obj, iP);
                        return wef.a;
                    }
                };
            }
        }

        public static final void e(final boolean z, final float f2, final boolean z2, final j09 j09Var, l46 l46Var, final int i2) {
            int i3;
            long jC;
            fy9 fy9VarA;
            int i4;
            boolean z3;
            l46Var.h0(-1497584603);
            if ((i2 & 6) == 0) {
                i3 = (l46Var.h(z) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= l46Var.d(f2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i2 & 3072) == 0) {
                i3 |= l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
                long j = g21.S(l46Var) ? e : f;
                if (z2 && z) {
                    jC = g;
                } else if (z) {
                    jC = h;
                } else {
                    jC = z2 ? abg.c(1308611551) : abg.c(1297495358);
                }
                long j2 = jC;
                if (z2) {
                    l46Var.f0(1577793126);
                    fy9VarA = od4.A(z ? R.drawable.img_home_daily_fortune_tomorrow_glow : R.drawable.img_home_daily_fortune_glow, 0, l46Var);
                    l46Var.r(false);
                } else {
                    l46Var.f0(1577975375);
                    l46Var.r(false);
                    fy9VarA = null;
                }
                xn8 xn8VarC = s21.c(ndb.b, false);
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
                dec.l(hj6.z, l46Var, xn8VarC);
                dec.l(hj6.y, l46Var, u8aVarM);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ);
                FillElement fillElement = androidx.compose.foundation.layout.b.c;
                int i5 = i3 & 112;
                boolean z4 = i5 == 32;
                Object objR = l46Var.R();
                Object obj = sf2.a;
                if (z4 || objR == obj) {
                    objR = new uc2(6, f2);
                    l46Var.p0(objR);
                }
                j09 j09VarX = bzd.x(fillElement, (a26) objR);
                j09 j09VarT = g09.a;
                if (!z) {
                    j09VarT = b21.t(j09VarT, new pi2(z2, 3));
                }
                j09 j09VarD = j09VarX.D(j09VarT);
                y02 y02Var = g21.f;
                s21.a(tm7.o(j09VarD, j2, y02Var), l46Var, 0);
                s21.a(tm7.o(fillElement, j, y02Var), l46Var, 0);
                if (fy9VarA != null) {
                    l46Var.f0(561302858);
                    boolean z5 = i5 == 32;
                    Object objR2 = l46Var.R();
                    if (z5 || objR2 == obj) {
                        objR2 = new uc2(7, f2);
                        l46Var.p0(objR2);
                    }
                    j09 j09VarX2 = bzd.x(fillElement, (a26) objR2);
                    boolean zI = l46Var.i(fy9VarA) | ((i3 & 14) == 4);
                    Object objR3 = l46Var.R();
                    if (zI || objR3 == obj) {
                        i4 = 0;
                        objR3 = new fo6(fy9VarA, z, 0);
                        l46Var.p0(objR3);
                    } else {
                        i4 = 0;
                    }
                    s21.a(b21.t(j09VarX2, (a26) objR3), l46Var, i4);
                    if (z) {
                        l46Var.f0(561734161);
                        boolean z6 = i5 == 32;
                        Object objR4 = l46Var.R();
                        if (z6 || objR4 == obj) {
                            objR4 = new uc2(8, f2);
                            l46Var.p0(objR4);
                        }
                        j09 j09VarX3 = bzd.x(fillElement, (a26) objR4);
                        boolean zI2 = l46Var.i(fy9VarA);
                        Object objR5 = l46Var.R();
                        if (zI2 || objR5 == obj) {
                            objR5 = new yn6(fy9VarA, 2);
                            l46Var.p0(objR5);
                        }
                        j09 j09VarT2 = b21.t(j09VarX3, (a26) objR5);
                        z3 = false;
                        s21.a(j09VarT2, l46Var, 0);
                        l46Var.r(false);
                    } else {
                        z3 = false;
                        l46Var.f0(562212739);
                        l46Var.r(false);
                    }
                    l46Var.r(z3);
                } else {
                    l46Var.f0(562218691);
                    l46Var.r(false);
                }
                l46Var.r(true);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: go6
                    @Override // defpackage.l26
                    public final Object z(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        no6.e(z, f2, z2, j09Var, (l46) obj2, k99.P(i2 | 1));
                        return wef.a;
                    }
                };
            }
        }

        public static final void f(z63 z63Var, String str, boolean z, boolean z2, boolean z3, float f2, j09 j09Var, l46 l46Var, int i2) {
            int i3;
            boolean z4;
            g09 g09Var;
            String str2;
            int i4;
            l46Var.h0(1410461497);
            if ((i2 & 6) == 0) {
                i3 = ((i2 & 8) == 0 ? l46Var.g(z63Var) : l46Var.i(z63Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= l46Var.g(str) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i2 & 3072) == 0) {
                z4 = z2;
                i3 |= l46Var.h(z4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            } else {
                z4 = z2;
            }
            if ((i2 & 24576) == 0) {
                i3 |= l46Var.h(z3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            if ((196608 & i2) == 0) {
                i3 |= l46Var.d(f2) ? 131072 : 65536;
            }
            if ((i2 & 1572864) == 0) {
                i3 |= l46Var.g(j09Var) ? 1048576 : 524288;
            }
            if (l46Var.W(i3 & 1, (599187 & i3) != 599186)) {
                j09 j09VarD0 = ynb.d0(f2, 0.0f, 12.0f, 0.0f, 10, j09Var);
                t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var, 48);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarD0);
                lf2.q.getClass();
                l46Var.j0();
                boolean z5 = l46Var.S;
                ov7 ov7Var = LayoutNode.h1;
                if (z5) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                he2 he2Var = hj6.z;
                dec.l(he2Var, l46Var, t7cVarA);
                he2 he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var, u8aVarM);
                Integer numValueOf = Integer.valueOf(iHashCode);
                he2 he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var, numValueOf);
                dec.k(l46Var);
                he2 he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var, j09VarJ);
                g09 g09Var2 = g09.a;
                int i5 = 8 | (i3 & 14);
                int i6 = i3 >> 3;
                a(z63Var, z, z4, b.a(androidx.compose.foundation.layout.b.l(g09Var2, 80.0f), z ? "daily_fortune_tomorrow_expanded_artwork" : "daily_fortune_today_expanded_artwork"), l46Var, (i6 & 896) | i5 | (i6 & 112));
                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, (z63Var == null || z) ? 16.0f : 12.0f));
                jw7 jw7Var = new jw7(1.0f, true);
                c92 c92VarA = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, jw7Var);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, c92VarA);
                dec.l(he2Var2, l46Var, u8aVarM2);
                ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ2);
                if (z63Var == null) {
                    l46Var.f0(2032861437);
                    j09 j09VarA = b.a(g09Var2, z ? "daily_fortune_tomorrow_expanded_empty_title" : "daily_fortune_today_expanded_empty_title");
                    mue mueVar = pue.a;
                    mue mueVarQ = pue.q(l46Var);
                    yp5 yp5Var = ((y8b) l46Var.k(x8b.a)).a;
                    ar5 ar5Var = ar5.d;
                    pr4 pr4Var = l8b.a;
                    g09Var = g09Var2;
                    nte.b(str, j09VarA, ((e8b) l46Var.k(pr4Var)).q, 0L, ar5Var, yp5Var, 0L, null, null, 0L, 2, false, 2, 0, null, mueVarQ, l46Var, (i6 & 14) | 1572864, 24960, 110392);
                    nte.b(afc.q(z ? R.string.home_daily_fortune_tomorrow_subtitle : R.string.home_daily_fortune_today_subtitle, l46Var), b.a(g09Var, z ? "daily_fortune_tomorrow_expanded_empty_subtitle" : "daily_fortune_today_expanded_empty_subtitle"), ((e8b) l46Var.k(pr4Var)).s, 0L, null, null, 0L, null, null, 0L, 2, false, 4, 0, null, pue.g(l46Var), l46Var, 0, 24960, 110584);
                    i4 = 0;
                    l46Var.r(false);
                } else {
                    g09Var = g09Var2;
                    qhe qheVar = z63Var.b;
                    l46Var.f0(2034001338);
                    if (qheVar.b == 0) {
                        l46Var.f0(2034035562);
                        str2 = afc.q(R.string.text_reverse_tag, l46Var) + " ";
                        l46Var.r(false);
                    } else {
                        l46Var.f0(2034108567);
                        l46Var.r(false);
                        str2 = "";
                    }
                    j09 j09VarA2 = b.a(g09Var, "daily_fortune_expanded_title");
                    mue mueVar2 = pue.a;
                    mue mueVarG = pue.g(l46Var);
                    pr4 pr4Var2 = l8b.a;
                    nte.b(str, j09VarA2, ((e8b) l46Var.k(pr4Var2)).s, 0L, null, null, 0L, null, null, 0L, 2, false, z3 ? Integer.MAX_VALUE : 1, 0, null, mueVarG, l46Var, (i6 & 14) | 48, 384, 110584);
                    String strI = ub3.i(str2, afc.q(r8c.f(qheVar), l46Var));
                    j09 j09VarA3 = b.a(g09Var, "daily_fortune_expanded_name");
                    mue mueVarQ2 = pue.q(l46Var);
                    nte.b(strI, j09VarA3, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, null, 0L, 2, false, z3 ? Integer.MAX_VALUE : 2, 0, null, mueVarQ2, l46Var, 1572912, 384, 110392);
                    String str3 = z63Var.d;
                    if (v4e.Q(str3)) {
                        str3 = z63Var.c;
                    }
                    nte.b(str3, b.a(g09Var, "daily_fortune_expanded_affirmation"), ((e8b) l46Var.k(pr4Var2)).s, 0L, null, null, 0L, null, null, 0L, 2, false, z3 ? Integer.MAX_VALUE : 2, 0, null, pue.g(l46Var), l46Var, 48, 384, 110584);
                    i4 = 0;
                    l46Var.r(false);
                }
                l46Var.r(true);
                i(6, i4, l46Var, ynb.d0(8.0f, 0.0f, 0.0f, 0.0f, 14, g09Var));
                l46Var.r(true);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new me0(z63Var, str, z, z2, z3, f2, j09Var, i2);
            }
        }

        public static final void g(final ii6 ii6Var, final z63 z63Var, final LocalDate localDate, final z63 z63Var2, final LocalDate localDate2, final h73 h73Var, final h73 h73Var2, final a26 a26Var, final h73 h73Var3, final int i2, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, final j09 j09Var, l46 l46Var, final int i3) {
            localDate.getClass();
            localDate2.getClass();
            h73Var.getClass();
            h73Var2.getClass();
            a26Var.getClass();
            x16Var.getClass();
            x16Var2.getClass();
            x16Var3.getClass();
            l46Var.h0(805636735);
            int i4 = i3 | (l46Var.g(ii6Var) ? 4 : 2) | (l46Var.i(z63Var) ? 32 : 16) | (l46Var.i(localDate) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(z63Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(localDate2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.e(h73Var.ordinal()) ? 131072 : 65536) | (l46Var.i(a26Var) ? 8388608 : 4194304) | (l46Var.e(h73Var3 == null ? -1 : h73Var3.ordinal()) ? 67108864 : 33554432) | (l46Var.e(i2) ? 536870912 : 268435456);
            if (l46Var.W(i4 & 1, ((306259091 & i4) == 306259090 && ((((3072 | (l46Var.i(x16Var) ? (char) 4 : (char) 2)) | (l46Var.i(x16Var2) ? 32 : 16)) | (l46Var.i(x16Var3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS)) & 1171) == 1170) ? false : true)) {
                final boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
                float fH0 = ((sw3) l46Var.k(zg2.h)).h0();
                final float f2 = fH0 >= 1.5f ? 240.0f * fH0 : 96.0f;
                final h73 h73Var4 = (h73Var3 == null || h73Var3 == h73Var) ? null : h73Var3;
                final h0e h0eVarB = vx.b(h73Var == h73.b ? 1.0f : 0.0f, i, "daily_fortune_switch_progress", null, l46Var, 3120, 20);
                Object objR = l46Var.R();
                Object obj = sf2.a;
                if (objR == obj) {
                    objR = qk2.d(0.0f);
                    l46Var.p0(objR);
                }
                jx jxVar = (jx) objR;
                Object objR2 = l46Var.R();
                if (objR2 == obj) {
                    objR2 = qk2.d(0.0f);
                    l46Var.p0(objR2);
                }
                final jx jxVar2 = (jx) objR2;
                Integer numValueOf = Integer.valueOf(i2);
                boolean zE = l46Var.e(h73Var4 == null ? -1 : h73Var4.ordinal()) | l46Var.i(jxVar) | l46Var.i(jxVar2);
                Object objR3 = l46Var.R();
                if (zE || objR3 == obj) {
                    objR3 = new lo6(jxVar, h73Var4, jxVar2, null);
                    l46Var.p0(objR3);
                }
                af1.p(h73Var4, numValueOf, (l26) objR3, l46Var);
                float fFloatValue = ((Number) jxVar.e()).floatValue() * 12.0f;
                int i5 = h73Var4 == null ? -1 : mo6.a[h73Var4.ordinal()];
                if (i5 == -1) {
                    fFloatValue = 0.0f;
                } else if (i5 != 1) {
                    if (i5 != 2) {
                        ap.c();
                        return;
                    }
                    fFloatValue = -fFloatValue;
                }
                final float f3 = -fFloatValue;
                final float f4 = fFloatValue;
                nk8.d(androidx.compose.foundation.layout.b.c(j09Var, 1.0f), null, af1.b0(1755719273, new n26() { // from class: io6
                    /* JADX WARN: Failed to calculate best type for var: r21v2 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v2 ??, new type: float
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
                    /* JADX WARN: Failed to calculate best type for var: r29v1 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v1 ??, new type: java.lang.Number
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r29v1 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v1 ??, new type: java.lang.Number
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
                    /* JADX WARN: Failed to calculate best type for var: r29v2 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v2 ??, new type: float
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException
                     */
                    /* JADX WARN: Failed to calculate best type for var: r29v2 ??
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v2 ??, new type: float
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
                    /*  JADX ERROR: Types fix failed
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v2 ??, new type: float
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                        Caused by: java.lang.NullPointerException
                        */
                    @Override // defpackage.n26
                    public final java.lang.Object m(java.lang.Object r50, java.lang.Object r51, java.lang.Object r52) {
                        /*
                            Method dump skipped, instruction units count: 971
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.io6.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, l46Var), l46Var, 3072, 6);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26(z63Var, localDate, z63Var2, localDate2, h73Var, h73Var2, a26Var, h73Var3, i2, x16Var, x16Var2, x16Var3, j09Var, i3) { // from class: jo6
                    public final /* synthetic */ x16 X;
                    public final /* synthetic */ j09 Y;
                    public final /* synthetic */ z63 b;
                    public final /* synthetic */ LocalDate c;
                    public final /* synthetic */ z63 d;
                    public final /* synthetic */ LocalDate e;
                    public final /* synthetic */ h73 f;
                    public final /* synthetic */ h73 g;
                    public final /* synthetic */ a26 v;
                    public final /* synthetic */ h73 w;
                    public final /* synthetic */ int x;
                    public final /* synthetic */ x16 y;
                    public final /* synthetic */ x16 z;

                    @Override // defpackage.l26
                    public final Object z(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = k99.P(4161);
                        no6.g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, (l46) obj2, iP);
                        return wef.a;
                    }
                };
            }
        }

        public static final void h(final e31 e31Var, final boolean z, final h73 h73Var, final float f2, final float f3, final float f4, final float f5, l46 l46Var, final int i2) {
            int i3;
            l46Var.h0(1983936704);
            if ((i2 & 6) == 0) {
                i3 = (l46Var.g(e31Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= l46Var.h(z) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= l46Var.e(h73Var.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i2 & 3072) == 0) {
                i3 |= l46Var.d(f2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if ((i2 & 24576) == 0) {
                i3 |= l46Var.d(f3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            if ((i2 & 196608) == 0) {
                i3 |= l46Var.d(f4) ? 131072 : 65536;
            }
            if ((1572864 & i2) == 0) {
                i3 |= l46Var.d(f5) ? 1048576 : 524288;
            }
            if (l46Var.W(i3 & 1, (599187 & i3) != 599186)) {
                boolean z2 = h73Var == h73.a;
                j09 j09VarQ = androidx.compose.foundation.layout.b.q(0.0f, f5, tm7.N(z2 ? f3 + f4 : -(f3 + f4), 0.0f, e31Var.a(g09.a, z2 ? ndb.e : ndb.g), 2), 1);
                boolean z3 = (i3 & 7168) == 2048;
                Object objR = l46Var.R();
                if (z3 || objR == sf2.a) {
                    objR = new uc2(4, f2);
                    l46Var.p0(objR);
                }
                m93.d(z, b.a(bzd.x(j09VarQ, (a26) objR), "daily_fortune_tooltip"), bx4.a, rw4.g(b21.T(300, 0, gs4.a, 2), 2), null, af1.b0(1657298152, new zk(z2, h73Var, 4), l46Var), l46Var, ((i3 >> 3) & 14) | 196608, 16);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: bo6
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        no6.h(e31Var, z, h73Var, f2, f3, f4, f5, (l46) obj, k99.P(i2 | 1));
                        return wef.a;
                    }
                };
            }
        }

        public static final void i(int i2, int i3, l46 l46Var, j09 j09Var) {
            int i4;
            j09 j09Var2;
            l46Var.h0(-587371250);
            int i5 = i3 & 1;
            if (i5 != 0) {
                i4 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i4 = (l46Var.g(j09Var) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
            if (l46Var.W(i4 & 1, (i4 & 3) != 2)) {
                j09Var2 = i5 != 0 ? g09.a : j09Var;
                gu6.b(od4.A(R.drawable.ic_home_chevron_forward, 0, l46Var), null, androidx.compose.foundation.layout.b.l(j09Var2, 16.0f), ((e8b) l46Var.k(l8b.a)).z, l46Var, 56, 0);
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new kc2(j09Var2, i2, i3, 3);
            }
        }

        public static final void j(int i2, int i3, j09 j09Var, l46 l46Var, int i4) {
            int i5;
            l46Var.h0(378481393);
            if ((i4 & 6) == 0) {
                i5 = (l46Var.e(i2) ? 4 : 2) | i4;
            } else {
                i5 = i4;
            }
            if ((i4 & 48) == 0) {
                i5 |= l46Var.e(i3) ? 32 : 16;
            }
            if ((i4 & 384) == 0) {
                i5 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if (l46Var.W(i5 & 1, (i5 & 147) != 146)) {
                feg.j(od4.A(k8b.f((e8b) l46Var.k(l8b.a)) ? i3 : i2, 0, l46Var), null, j09Var, null, an2.b, 0.0f, null, l46Var, 24632 | (i5 & 896), 104);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new zp1(i2, i3, i4, 2, j09Var);
            }
        }

        /* JADX WARN: Code duplicated, block: B:102:0x012c  */
        /* JADX WARN: Code duplicated, block: B:104:0x0133  */
        /* JADX WARN: Code duplicated, block: B:114:0x0156 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:115:0x0158  */
        /* JADX WARN: Code duplicated, block: B:116:0x015b  */
        /* JADX WARN: Code duplicated, block: B:119:0x0160  */
        /* JADX WARN: Code duplicated, block: B:120:0x016d  */
        /* JADX WARN: Code duplicated, block: B:123:0x0172  */
        /* JADX WARN: Code duplicated, block: B:124:0x017a  */
        /* JADX WARN: Code duplicated, block: B:126:0x017e  */
        /* JADX WARN: Code duplicated, block: B:127:0x0180  */
        /* JADX WARN: Code duplicated, block: B:129:0x0184  */
        /* JADX WARN: Code duplicated, block: B:130:0x0186  */
        /* JADX WARN: Code duplicated, block: B:132:0x018a  */
        /* JADX WARN: Code duplicated, block: B:134:0x0192  */
        /* JADX WARN: Code duplicated, block: B:137:0x01ba  */
        /* JADX WARN: Code duplicated, block: B:138:0x01bd  */
        /* JADX WARN: Code duplicated, block: B:140:0x01c1  */
        /* JADX WARN: Code duplicated, block: B:142:0x01c7  */
        /* JADX WARN: Code duplicated, block: B:145:0x01ce  */
        /* JADX WARN: Code duplicated, block: B:147:0x01ea  */
        /* JADX WARN: Code duplicated, block: B:148:0x01f7  */
        /* JADX WARN: Code duplicated, block: B:150:0x020e  */
        /* JADX WARN: Code duplicated, block: B:153:0x0276  */
        /* JADX WARN: Code duplicated, block: B:154:0x027a  */
        /* JADX WARN: Code duplicated, block: B:157:0x02a4 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:171:0x03ac  */
        /* JADX WARN: Code duplicated, block: B:173:0x03e4  */
        /* JADX WARN: Code duplicated, block: B:174:0x03e8  */
        /* JADX WARN: Code duplicated, block: B:177:0x03f9  */
        /* JADX WARN: Code duplicated, block: B:179:0x0423  */
        /* JADX WARN: Code duplicated, block: B:180:0x0427  */
        /* JADX WARN: Code duplicated, block: B:182:0x044d  */
        /* JADX WARN: Code duplicated, block: B:184:0x0464  */
        /* JADX WARN: Code duplicated, block: B:186:0x04c8  */
        /* JADX WARN: Code duplicated, block: B:190:0x057d  */
        /* JADX WARN: Code duplicated, block: B:191:0x0581  */
        /* JADX WARN: Code duplicated, block: B:193:0x05a9  */
        /* JADX WARN: Code duplicated, block: B:196:0x05bc  */
        /* JADX WARN: Code duplicated, block: B:198:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:23:0x0049  */
        /* JADX WARN: Code duplicated, block: B:25:0x004d  */
        /* JADX WARN: Code duplicated, block: B:27:0x0055  */
        /* JADX WARN: Code duplicated, block: B:28:0x0058  */
        /* JADX WARN: Code duplicated, block: B:31:0x005e  */
        /* JADX WARN: Code duplicated, block: B:34:0x0064  */
        /* JADX WARN: Code duplicated, block: B:39:0x0075  */
        /* JADX WARN: Code duplicated, block: B:41:0x007a  */
        /* JADX WARN: Code duplicated, block: B:44:0x0082  */
        /* JADX WARN: Code duplicated, block: B:46:0x0087  */
        /* JADX WARN: Code duplicated, block: B:48:0x008b  */
        /* JADX WARN: Code duplicated, block: B:50:0x0093  */
        /* JADX WARN: Code duplicated, block: B:51:0x0096  */
        /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:89:0x0102  */
        /* JADX WARN: Code duplicated, block: B:91:0x0106  */
        /* JADX WARN: Code duplicated, block: B:93:0x0110  */
        /* JADX WARN: Code duplicated, block: B:94:0x0113  */
        /* JADX WARN: Code duplicated, block: B:98:0x0121  */
        /* JADX WARN: Code duplicated, block: B:99:0x0123  */
        public static final void k(final ii6 ii6Var, long j, long j2, long j3, Integer num, final String str, final x16 x16Var, final j09 j09Var, boolean z, boolean z2, final dd2 dd2Var, l46 l46Var, final int i2, final int i3) {
            int i4;
            long j4;
            long j5;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            boolean z3;
            final boolean z4;
            final boolean z5;
            final long j6;
            final long j7;
            final long j8;
            final Integer num2;
            ojb ojbVarV;
            long j9;
            long j10;
            long jW;
            Integer num3;
            boolean z6;
            boolean z7;
            Integer num4;
            pr4 pr4Var;
            boolean zF;
            boolean z8;
            float f2;
            y6c y6cVarB;
            g09 g09Var;
            g09 g09Var2;
            long j11;
            long j12;
            long j13;
            pr4 pr4Var2;
            j09 j09VarU;
            kx0 kx0Var;
            rc0 rc0Var;
            boolean z9;
            ov7 ov7Var;
            he2 he2Var;
            he2 he2Var2;
            he2 he2Var3;
            he2 he2Var4;
            d31 d31Var;
            v7c v7cVar;
            FillElement fillElement;
            boolean z10;
            FillElement fillElement2;
            j09 j09VarT;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            lx0 lx0Var = ndb.b;
            l46Var.h0(1698442311);
            if ((i2 & 6) == 0) {
                i4 = (l46Var.g(ii6Var) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
            int i16 = i3 & 2;
            if (i16 == 0) {
                if ((i2 & 48) == 0) {
                    j4 = j;
                    i4 |= l46Var.f(j4) ? 32 : 16;
                }
                if ((i2 & 384) == 0) {
                    if ((i3 & 4) == 0) {
                        j5 = j2;
                        if (l46Var.f(j5)) {
                            i15 = 256;
                        }
                        i4 |= i15;
                    } else {
                        j5 = j2;
                    }
                    i15 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    i4 |= i15;
                } else {
                    j5 = j2;
                }
                if ((i2 & 3072) != 0) {
                    if ((i3 & 8) == 0 || !l46Var.f(j3)) {
                        i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    } else {
                        i14 = 2048;
                    }
                    i4 |= i14;
                }
                i5 = i3 & 16;
                if (i5 != 0) {
                    if ((i2 & 24576) == 0) {
                        if (l46Var.g(num)) {
                            i6 = 16384;
                        } else {
                            i6 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i4 |= i6;
                    }
                    if ((i2 & 196608) == 0) {
                        if (l46Var.g(str)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i4 |= i13;
                    }
                    if ((i2 & 1572864) == 0) {
                        if (l46Var.i(x16Var)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i4 |= i12;
                    }
                    if ((i2 & 12582912) == 0) {
                        if (l46Var.g(j09Var)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i4 |= i11;
                    }
                    i7 = i3 & 256;
                    if (i7 != 0) {
                        if ((100663296 & i2) == 0) {
                            if (l46Var.h(z)) {
                                i8 = 67108864;
                            } else {
                                i8 = 33554432;
                            }
                            i4 |= i8;
                        }
                        i9 = i3 & 512;
                        if (i9 != 0) {
                            if ((i2 & 805306368) == 0) {
                                if (l46Var.h(z2)) {
                                    i10 = 536870912;
                                } else {
                                    i10 = 268435456;
                                }
                                i4 |= i10;
                            }
                            if ((i4 & 306783379) == 306783378) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (l46Var.W(i4 & 1, z3)) {
                                l46Var.b0();
                                if ((i2 & 1) != 0 || l46Var.C()) {
                                    if (i16 != 0) {
                                        j9 = y72.j;
                                    } else {
                                        j9 = j4;
                                    }
                                    if ((i3 & 4) != 0) {
                                        j10 = ((e8b) l46Var.k(l8b.a)).f;
                                        i4 &= -897;
                                    } else {
                                        j10 = j5;
                                    }
                                    if ((i3 & 8) != 0) {
                                        jW = w(l46Var);
                                        i4 &= -7169;
                                    } else {
                                        jW = j3;
                                    }
                                    if (i5 != 0) {
                                        num3 = null;
                                    } else {
                                        num3 = num;
                                    }
                                    if (i7 != 0) {
                                        z6 = false;
                                    } else {
                                        z6 = z;
                                    }
                                    if (i9 != 0) {
                                        z7 = false;
                                    } else {
                                        z7 = z2;
                                    }
                                    num4 = num3;
                                } else {
                                    l46Var.Z();
                                    if ((i3 & 4) != 0) {
                                        i4 &= -897;
                                    }
                                    if ((i3 & 8) != 0) {
                                        i4 &= -7169;
                                    }
                                    jW = j3;
                                    z6 = z;
                                    z7 = z2;
                                    i4 = i4;
                                    j9 = j4;
                                    j10 = j5;
                                    num4 = num;
                                }
                                l46Var.s();
                                pr4Var = l8b.a;
                                zF = k8b.f((e8b) l46Var.k(pr4Var));
                                if (((sw3) l46Var.k(zg2.h)).h0() < 1.5f) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (zF) {
                                    f2 = 0.0f;
                                } else {
                                    f2 = 20.0f;
                                }
                                y6cVarB = a7c.b(f2);
                                g09Var = g09.a;
                                if (zF) {
                                    l46Var.f0(-714160456);
                                    j09 j09VarO = tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var.k(pr4Var)).a, g21.f);
                                    if (z7) {
                                        j09VarT = b21.t(g09Var, new uc2(5, 1.0f));
                                    } else {
                                        j09VarT = g09Var;
                                    }
                                    j09VarU = j09VarO.D(j09VarT);
                                    l46Var.r(false);
                                    j11 = j9;
                                    j12 = j10;
                                    g09Var2 = g09Var;
                                    j13 = jW;
                                    pr4Var2 = pr4Var;
                                } else {
                                    l46Var.f0(-713989956);
                                    g09Var2 = g09Var;
                                    j11 = j9;
                                    j12 = j10;
                                    j13 = jW;
                                    pr4Var2 = pr4Var;
                                    j09VarU = u(y6cVarB, ii6Var, j11, j12, j13, num4, l46Var, 64);
                                    l46Var.r(false);
                                }
                                j09 j09VarC = androidx.compose.foundation.b.c(j09Var.D(j09VarU), false, null, null, x16Var, 15);
                                kx0Var = ndb.z;
                                rc0Var = xc0.a;
                                t7c t7cVarA = s7c.a(rc0Var, kx0Var, l46Var, 48);
                                int iHashCode = Long.hashCode(l46Var.T);
                                u8a u8aVarM = l46Var.m();
                                j09 j09VarJ = m93.J(l46Var, j09VarC);
                                lf2.q.getClass();
                                l46Var.j0();
                                long j14 = j11;
                                z9 = l46Var.S;
                                ov7Var = LayoutNode.h1;
                                if (z9) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                he2Var = hj6.z;
                                long j15 = j12;
                                dec.l(he2Var, l46Var, t7cVarA);
                                he2Var2 = hj6.y;
                                dec.l(he2Var2, l46Var, u8aVarM);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                he2Var3 = hj6.X;
                                dec.l(he2Var3, l46Var, numValueOf);
                                dec.k(l46Var);
                                he2Var4 = hj6.x;
                                dec.l(he2Var4, l46Var, j09VarJ);
                                d31Var = d31.a;
                                v7cVar = v7c.a;
                                if (z6 || !z8) {
                                    l46Var.f0(1697589941);
                                    j09 j09VarA = v7cVar.a(g09Var2, 1.0f, true);
                                    fillElement = androidx.compose.foundation.layout.b.b;
                                    j09 j09VarD = j09VarA.D(fillElement);
                                    t7c t7cVarA2 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                                    int iHashCode2 = Long.hashCode(l46Var.T);
                                    u8a u8aVarM2 = l46Var.m();
                                    j09 j09VarJ2 = m93.J(l46Var, j09VarD);
                                    l46Var.j0();
                                    if (l46Var.S) {
                                        l46Var.l(ov7Var);
                                    } else {
                                        l46Var.s0();
                                    }
                                    dec.l(he2Var, l46Var, t7cVarA2);
                                    dec.l(he2Var2, l46Var, u8aVarM2);
                                    ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                                    dec.l(he2Var4, l46Var, j09VarJ2);
                                    if (z8) {
                                        l46Var.f0(1422951589);
                                        j09 j09VarD2 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                        xn8 xn8VarC = s21.c(lx0Var, false);
                                        int iHashCode3 = Long.hashCode(l46Var.T);
                                        u8a u8aVarM3 = l46Var.m();
                                        j09 j09VarJ3 = m93.J(l46Var, j09VarD2);
                                        l46Var.j0();
                                        if (l46Var.S) {
                                            l46Var.l(ov7Var);
                                        } else {
                                            l46Var.s0();
                                        }
                                        dec.l(he2Var, l46Var, xn8VarC);
                                        dec.l(he2Var2, l46Var, u8aVarM3);
                                        ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
                                        dec.l(he2Var4, l46Var, j09VarJ3);
                                        dd2Var.m(d31Var, l46Var, 54);
                                        l46Var.r(true);
                                        o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                        l46Var.r(false);
                                    } else {
                                        l46Var.f0(1423207401);
                                        o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                        l46Var.r(false);
                                    }
                                    if (z6) {
                                        l46Var.f0(1423311716);
                                        j09 j09VarA2 = v7cVar.a(g09Var2, 1.0f, true);
                                        mue mueVar = pue.a;
                                        mue mueVarQ = pue.q(l46Var);
                                        nte.b(str, j09VarA2, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                        z10 = false;
                                        l46Var.r(false);
                                    } else {
                                        pr4 pr4Var3 = pr4Var2;
                                        l46Var.f0(1423728945);
                                        j09 j09VarA3 = v7cVar.a(g09Var2, 1.0f, true);
                                        mue mueVar2 = pue.a;
                                        vd0.e(str, j09VarA3, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var3)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                        z10 = false;
                                        l46Var.r(false);
                                    }
                                    l46Var.r(true);
                                    l46Var.r(z10);
                                    fillElement2 = fillElement;
                                } else {
                                    l46Var.f0(1696794946);
                                    j09 j09VarA4 = v7cVar.a(g09Var2, 1.0f, true);
                                    FillElement fillElement3 = androidx.compose.foundation.layout.b.b;
                                    j09 j09VarD0 = ynb.d0(24.0f, 16.0f, 0.0f, zF ? 14.0f : 16.0f, 4, j09VarA4.D(fillElement3));
                                    c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var, 54);
                                    int iHashCode4 = Long.hashCode(l46Var.T);
                                    u8a u8aVarM4 = l46Var.m();
                                    j09 j09VarJ4 = m93.J(l46Var, j09VarD0);
                                    l46Var.j0();
                                    if (l46Var.S) {
                                        l46Var.l(ov7Var);
                                    } else {
                                        l46Var.s0();
                                    }
                                    dec.l(he2Var, l46Var, c92VarA);
                                    dec.l(he2Var2, l46Var, u8aVarM4);
                                    ib8.s(iHashCode4, l46Var, he2Var3, l46Var);
                                    dec.l(he2Var4, l46Var, j09VarJ4);
                                    j09 j09VarM = androidx.compose.foundation.layout.b.m(g09Var2, 84.0f, 56.0f);
                                    xn8 xn8VarC2 = s21.c(lx0Var, false);
                                    int iHashCode5 = Long.hashCode(l46Var.T);
                                    u8a u8aVarM5 = l46Var.m();
                                    j09 j09VarJ5 = m93.J(l46Var, j09VarM);
                                    l46Var.j0();
                                    if (l46Var.S) {
                                        l46Var.l(ov7Var);
                                    } else {
                                        l46Var.s0();
                                    }
                                    dec.l(he2Var, l46Var, xn8VarC2);
                                    dec.l(he2Var2, l46Var, u8aVarM5);
                                    ib8.s(iHashCode5, l46Var, he2Var3, l46Var);
                                    dec.l(he2Var4, l46Var, j09VarJ5);
                                    dd2Var.m(d31Var, l46Var, 54);
                                    l46Var.r(true);
                                    mue mueVar3 = pue.a;
                                    mue mueVarQ2 = pue.q(l46Var);
                                    nte.b(str, null, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ2, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109370);
                                    l46Var.r(true);
                                    l46Var.r(false);
                                    fillElement2 = fillElement3;
                                }
                                j09 j09VarD1 = ynb.d0(0.0f, 0.0f, 12.0f, 0.0f, 11, androidx.compose.foundation.layout.b.p(g09Var2, 28.0f).D(fillElement2));
                                xn8 xn8VarC3 = s21.c(ndb.g, false);
                                int iHashCode6 = Long.hashCode(l46Var.T);
                                u8a u8aVarM6 = l46Var.m();
                                j09 j09VarJ6 = m93.J(l46Var, j09VarD1);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, xn8VarC3);
                                dec.l(he2Var2, l46Var, u8aVarM6);
                                ib8.s(iHashCode6, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ6);
                                i(0, 1, l46Var, null);
                                l46Var.r(true);
                                l46Var.r(true);
                                j6 = j14;
                                j7 = j15;
                                z4 = z6;
                                z5 = z7;
                                j8 = j13;
                                num2 = num4;
                            } else {
                                l46Var.Z();
                                z4 = z;
                                z5 = z2;
                                j6 = j4;
                                j7 = j5;
                                j8 = j3;
                                num2 = num;
                            }
                            ojbVarV = l46Var.v();
                            if (ojbVarV != null) {
                                ojbVarV.d = new l26() { // from class: ao6
                                    @Override // defpackage.l26
                                    public final Object z(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int iP = k99.P(i2 | 1);
                                        no6.k(ii6Var, j6, j7, j8, num2, str, x16Var, j09Var, z4, z5, dd2Var, (l46) obj, iP, i3);
                                        return wef.a;
                                    }
                                };
                            }
                        }
                        i4 |= 805306368;
                        if ((i4 & 306783379) == 306783378) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (l46Var.W(i4 & 1, z3)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i16 != 0) {
                                    j9 = y72.j;
                                } else {
                                    j9 = j4;
                                }
                                if ((i3 & 4) != 0) {
                                    j10 = ((e8b) l46Var.k(l8b.a)).f;
                                    i4 &= -897;
                                } else {
                                    j10 = j5;
                                }
                                if ((i3 & 8) != 0) {
                                    jW = w(l46Var);
                                    i4 &= -7169;
                                } else {
                                    jW = j3;
                                }
                                if (i5 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i7 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z;
                                }
                                if (i9 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z2;
                                }
                                num4 = num3;
                            } else {
                                if (i16 != 0) {
                                    j9 = y72.j;
                                } else {
                                    j9 = j4;
                                }
                                if ((i3 & 4) != 0) {
                                    j10 = ((e8b) l46Var.k(l8b.a)).f;
                                    i4 &= -897;
                                } else {
                                    j10 = j5;
                                }
                                if ((i3 & 8) != 0) {
                                    jW = w(l46Var);
                                    i4 &= -7169;
                                } else {
                                    jW = j3;
                                }
                                if (i5 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i7 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z;
                                }
                                if (i9 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z2;
                                }
                                num4 = num3;
                            }
                            l46Var.s();
                            pr4Var = l8b.a;
                            zF = k8b.f((e8b) l46Var.k(pr4Var));
                            if (((sw3) l46Var.k(zg2.h)).h0() < 1.5f) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (zF) {
                                f2 = 0.0f;
                            } else {
                                f2 = 20.0f;
                            }
                            y6cVarB = a7c.b(f2);
                            g09Var = g09.a;
                            if (zF) {
                                l46Var.f0(-714160456);
                                j09 j09VarO2 = tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var.k(pr4Var)).a, g21.f);
                                if (z7) {
                                    j09VarT = b21.t(g09Var, new uc2(5, 1.0f));
                                } else {
                                    j09VarT = g09Var;
                                }
                                j09VarU = j09VarO2.D(j09VarT);
                                l46Var.r(false);
                                j11 = j9;
                                j12 = j10;
                                g09Var2 = g09Var;
                                j13 = jW;
                                pr4Var2 = pr4Var;
                            } else {
                                l46Var.f0(-713989956);
                                g09Var2 = g09Var;
                                j11 = j9;
                                j12 = j10;
                                j13 = jW;
                                pr4Var2 = pr4Var;
                                j09VarU = u(y6cVarB, ii6Var, j11, j12, j13, num4, l46Var, 64);
                                l46Var.r(false);
                            }
                            j09 j09VarC2 = androidx.compose.foundation.b.c(j09Var.D(j09VarU), false, null, null, x16Var, 15);
                            kx0Var = ndb.z;
                            rc0Var = xc0.a;
                            t7c t7cVarA3 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                            int iHashCode7 = Long.hashCode(l46Var.T);
                            u8a u8aVarM7 = l46Var.m();
                            j09 j09VarJ7 = m93.J(l46Var, j09VarC2);
                            lf2.q.getClass();
                            l46Var.j0();
                            long j16 = j11;
                            z9 = l46Var.S;
                            ov7Var = LayoutNode.h1;
                            if (z9) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            he2Var = hj6.z;
                            long j17 = j12;
                            dec.l(he2Var, l46Var, t7cVarA3);
                            he2Var2 = hj6.y;
                            dec.l(he2Var2, l46Var, u8aVarM7);
                            Integer numValueOf2 = Integer.valueOf(iHashCode7);
                            he2Var3 = hj6.X;
                            dec.l(he2Var3, l46Var, numValueOf2);
                            dec.k(l46Var);
                            he2Var4 = hj6.x;
                            dec.l(he2Var4, l46Var, j09VarJ7);
                            d31Var = d31.a;
                            v7cVar = v7c.a;
                            if (z6) {
                                l46Var.f0(1697589941);
                                j09 j09VarA5 = v7cVar.a(g09Var2, 1.0f, true);
                                fillElement = androidx.compose.foundation.layout.b.b;
                                j09 j09VarD3 = j09VarA5.D(fillElement);
                                t7c t7cVarA4 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                                int iHashCode8 = Long.hashCode(l46Var.T);
                                u8a u8aVarM8 = l46Var.m();
                                j09 j09VarJ8 = m93.J(l46Var, j09VarD3);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, t7cVarA4);
                                dec.l(he2Var2, l46Var, u8aVarM8);
                                ib8.s(iHashCode8, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ8);
                                if (z8) {
                                    l46Var.f0(1422951589);
                                    j09 j09VarD4 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                    xn8 xn8VarC4 = s21.c(lx0Var, false);
                                    int iHashCode9 = Long.hashCode(l46Var.T);
                                    u8a u8aVarM9 = l46Var.m();
                                    j09 j09VarJ9 = m93.J(l46Var, j09VarD4);
                                    l46Var.j0();
                                    if (l46Var.S) {
                                        l46Var.l(ov7Var);
                                    } else {
                                        l46Var.s0();
                                    }
                                    dec.l(he2Var, l46Var, xn8VarC4);
                                    dec.l(he2Var2, l46Var, u8aVarM9);
                                    ib8.s(iHashCode9, l46Var, he2Var3, l46Var);
                                    dec.l(he2Var4, l46Var, j09VarJ9);
                                    dd2Var.m(d31Var, l46Var, 54);
                                    l46Var.r(true);
                                    o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(1423207401);
                                    o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                    l46Var.r(false);
                                }
                                if (z6) {
                                    l46Var.f0(1423311716);
                                    j09 j09VarA6 = v7cVar.a(g09Var2, 1.0f, true);
                                    mue mueVar4 = pue.a;
                                    mue mueVarQ3 = pue.q(l46Var);
                                    nte.b(str, j09VarA6, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ3, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                    z10 = false;
                                    l46Var.r(false);
                                } else {
                                    pr4 pr4Var4 = pr4Var2;
                                    l46Var.f0(1423728945);
                                    j09 j09VarA7 = v7cVar.a(g09Var2, 1.0f, true);
                                    mue mueVar5 = pue.a;
                                    vd0.e(str, j09VarA7, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var4)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                    z10 = false;
                                    l46Var.r(false);
                                }
                                l46Var.r(true);
                                l46Var.r(z10);
                                fillElement2 = fillElement;
                            } else {
                                l46Var.f0(1697589941);
                                j09 j09VarA8 = v7cVar.a(g09Var2, 1.0f, true);
                                fillElement = androidx.compose.foundation.layout.b.b;
                                j09 j09VarD5 = j09VarA8.D(fillElement);
                                t7c t7cVarA5 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                                int iHashCode10 = Long.hashCode(l46Var.T);
                                u8a u8aVarM10 = l46Var.m();
                                j09 j09VarJ10 = m93.J(l46Var, j09VarD5);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, t7cVarA5);
                                dec.l(he2Var2, l46Var, u8aVarM10);
                                ib8.s(iHashCode10, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ10);
                                if (z8) {
                                    l46Var.f0(1422951589);
                                    j09 j09VarD6 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                    xn8 xn8VarC5 = s21.c(lx0Var, false);
                                    int iHashCode11 = Long.hashCode(l46Var.T);
                                    u8a u8aVarM11 = l46Var.m();
                                    j09 j09VarJ11 = m93.J(l46Var, j09VarD6);
                                    l46Var.j0();
                                    if (l46Var.S) {
                                        l46Var.l(ov7Var);
                                    } else {
                                        l46Var.s0();
                                    }
                                    dec.l(he2Var, l46Var, xn8VarC5);
                                    dec.l(he2Var2, l46Var, u8aVarM11);
                                    ib8.s(iHashCode11, l46Var, he2Var3, l46Var);
                                    dec.l(he2Var4, l46Var, j09VarJ11);
                                    dd2Var.m(d31Var, l46Var, 54);
                                    l46Var.r(true);
                                    o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(1423207401);
                                    o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                    l46Var.r(false);
                                }
                                if (z6) {
                                    l46Var.f0(1423311716);
                                    j09 j09VarA9 = v7cVar.a(g09Var2, 1.0f, true);
                                    mue mueVar6 = pue.a;
                                    mue mueVarQ4 = pue.q(l46Var);
                                    nte.b(str, j09VarA9, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ4, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                    z10 = false;
                                    l46Var.r(false);
                                } else {
                                    pr4 pr4Var5 = pr4Var2;
                                    l46Var.f0(1423728945);
                                    j09 j09VarA10 = v7cVar.a(g09Var2, 1.0f, true);
                                    mue mueVar7 = pue.a;
                                    vd0.e(str, j09VarA10, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var5)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                    z10 = false;
                                    l46Var.r(false);
                                }
                                l46Var.r(true);
                                l46Var.r(z10);
                                fillElement2 = fillElement;
                            }
                            j09 j09VarD7 = ynb.d0(0.0f, 0.0f, 12.0f, 0.0f, 11, androidx.compose.foundation.layout.b.p(g09Var2, 28.0f).D(fillElement2));
                            xn8 xn8VarC6 = s21.c(ndb.g, false);
                            int iHashCode12 = Long.hashCode(l46Var.T);
                            u8a u8aVarM12 = l46Var.m();
                            j09 j09VarJ12 = m93.J(l46Var, j09VarD7);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, xn8VarC6);
                            dec.l(he2Var2, l46Var, u8aVarM12);
                            ib8.s(iHashCode12, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ12);
                            i(0, 1, l46Var, null);
                            l46Var.r(true);
                            l46Var.r(true);
                            j6 = j16;
                            j7 = j17;
                            z4 = z6;
                            z5 = z7;
                            j8 = j13;
                            num2 = num4;
                        } else {
                            l46Var.Z();
                            z4 = z;
                            z5 = z2;
                            j6 = j4;
                            j7 = j5;
                            j8 = j3;
                            num2 = num;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new l26() { // from class: ao6
                                @Override // defpackage.l26
                                public final Object z(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i2 | 1);
                                    no6.k(ii6Var, j6, j7, j8, num2, str, x16Var, j09Var, z4, z5, dd2Var, (l46) obj, iP, i3);
                                    return wef.a;
                                }
                            };
                        }
                    }
                    i4 |= 100663296;
                    i9 = i3 & 512;
                    if (i9 != 0) {
                        if ((i2 & 805306368) == 0) {
                            if (l46Var.h(z2)) {
                                i10 = 536870912;
                            } else {
                                i10 = 268435456;
                            }
                            i4 |= i10;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (l46Var.W(i4 & 1, z3)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i16 != 0) {
                                    j9 = y72.j;
                                } else {
                                    j9 = j4;
                                }
                                if ((i3 & 4) != 0) {
                                    j10 = ((e8b) l46Var.k(l8b.a)).f;
                                    i4 &= -897;
                                } else {
                                    j10 = j5;
                                }
                                if ((i3 & 8) != 0) {
                                    jW = w(l46Var);
                                    i4 &= -7169;
                                } else {
                                    jW = j3;
                                }
                                if (i5 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i7 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z;
                                }
                                if (i9 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z2;
                                }
                                num4 = num3;
                            } else {
                                if (i16 != 0) {
                                    j9 = y72.j;
                                } else {
                                    j9 = j4;
                                }
                                if ((i3 & 4) != 0) {
                                    j10 = ((e8b) l46Var.k(l8b.a)).f;
                                    i4 &= -897;
                                } else {
                                    j10 = j5;
                                }
                                if ((i3 & 8) != 0) {
                                    jW = w(l46Var);
                                    i4 &= -7169;
                                } else {
                                    jW = j3;
                                }
                                if (i5 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i7 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z;
                                }
                                if (i9 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z2;
                                }
                                num4 = num3;
                            }
                            l46Var.s();
                            pr4Var = l8b.a;
                            zF = k8b.f((e8b) l46Var.k(pr4Var));
                            if (((sw3) l46Var.k(zg2.h)).h0() < 1.5f) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (zF) {
                                f2 = 0.0f;
                            } else {
                                f2 = 20.0f;
                            }
                            y6cVarB = a7c.b(f2);
                            g09Var = g09.a;
                            if (zF) {
                                l46Var.f0(-714160456);
                                j09 j09VarO3 = tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var.k(pr4Var)).a, g21.f);
                                if (z7) {
                                    j09VarT = b21.t(g09Var, new uc2(5, 1.0f));
                                } else {
                                    j09VarT = g09Var;
                                }
                                j09VarU = j09VarO3.D(j09VarT);
                                l46Var.r(false);
                                j11 = j9;
                                j12 = j10;
                                g09Var2 = g09Var;
                                j13 = jW;
                                pr4Var2 = pr4Var;
                            } else {
                                l46Var.f0(-713989956);
                                g09Var2 = g09Var;
                                j11 = j9;
                                j12 = j10;
                                j13 = jW;
                                pr4Var2 = pr4Var;
                                j09VarU = u(y6cVarB, ii6Var, j11, j12, j13, num4, l46Var, 64);
                                l46Var.r(false);
                            }
                            j09 j09VarC3 = androidx.compose.foundation.b.c(j09Var.D(j09VarU), false, null, null, x16Var, 15);
                            kx0Var = ndb.z;
                            rc0Var = xc0.a;
                            t7c t7cVarA6 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                            int iHashCode13 = Long.hashCode(l46Var.T);
                            u8a u8aVarM13 = l46Var.m();
                            j09 j09VarJ13 = m93.J(l46Var, j09VarC3);
                            lf2.q.getClass();
                            l46Var.j0();
                            long j18 = j11;
                            z9 = l46Var.S;
                            ov7Var = LayoutNode.h1;
                            if (z9) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            he2Var = hj6.z;
                            long j19 = j12;
                            dec.l(he2Var, l46Var, t7cVarA6);
                            he2Var2 = hj6.y;
                            dec.l(he2Var2, l46Var, u8aVarM13);
                            Integer numValueOf3 = Integer.valueOf(iHashCode13);
                            he2Var3 = hj6.X;
                            dec.l(he2Var3, l46Var, numValueOf3);
                            dec.k(l46Var);
                            he2Var4 = hj6.x;
                            dec.l(he2Var4, l46Var, j09VarJ13);
                            d31Var = d31.a;
                            v7cVar = v7c.a;
                            if (z6) {
                                l46Var.f0(1697589941);
                                j09 j09VarA11 = v7cVar.a(g09Var2, 1.0f, true);
                                fillElement = androidx.compose.foundation.layout.b.b;
                                j09 j09VarD8 = j09VarA11.D(fillElement);
                                t7c t7cVarA7 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                                int iHashCode14 = Long.hashCode(l46Var.T);
                                u8a u8aVarM14 = l46Var.m();
                                j09 j09VarJ14 = m93.J(l46Var, j09VarD8);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, t7cVarA7);
                                dec.l(he2Var2, l46Var, u8aVarM14);
                                ib8.s(iHashCode14, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ14);
                                if (z8) {
                                    l46Var.f0(1422951589);
                                    j09 j09VarD9 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                    xn8 xn8VarC7 = s21.c(lx0Var, false);
                                    int iHashCode15 = Long.hashCode(l46Var.T);
                                    u8a u8aVarM15 = l46Var.m();
                                    j09 j09VarJ15 = m93.J(l46Var, j09VarD9);
                                    l46Var.j0();
                                    if (l46Var.S) {
                                        l46Var.l(ov7Var);
                                    } else {
                                        l46Var.s0();
                                    }
                                    dec.l(he2Var, l46Var, xn8VarC7);
                                    dec.l(he2Var2, l46Var, u8aVarM15);
                                    ib8.s(iHashCode15, l46Var, he2Var3, l46Var);
                                    dec.l(he2Var4, l46Var, j09VarJ15);
                                    dd2Var.m(d31Var, l46Var, 54);
                                    l46Var.r(true);
                                    o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(1423207401);
                                    o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                    l46Var.r(false);
                                }
                                if (z6) {
                                    l46Var.f0(1423311716);
                                    j09 j09VarA12 = v7cVar.a(g09Var2, 1.0f, true);
                                    mue mueVar8 = pue.a;
                                    mue mueVarQ5 = pue.q(l46Var);
                                    nte.b(str, j09VarA12, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ5, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                    z10 = false;
                                    l46Var.r(false);
                                } else {
                                    pr4 pr4Var6 = pr4Var2;
                                    l46Var.f0(1423728945);
                                    j09 j09VarA13 = v7cVar.a(g09Var2, 1.0f, true);
                                    mue mueVar9 = pue.a;
                                    vd0.e(str, j09VarA13, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var6)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                    z10 = false;
                                    l46Var.r(false);
                                }
                                l46Var.r(true);
                                l46Var.r(z10);
                                fillElement2 = fillElement;
                            } else {
                                l46Var.f0(1697589941);
                                j09 j09VarA14 = v7cVar.a(g09Var2, 1.0f, true);
                                fillElement = androidx.compose.foundation.layout.b.b;
                                j09 j09VarD10 = j09VarA14.D(fillElement);
                                t7c t7cVarA8 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                                int iHashCode16 = Long.hashCode(l46Var.T);
                                u8a u8aVarM16 = l46Var.m();
                                j09 j09VarJ16 = m93.J(l46Var, j09VarD10);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, t7cVarA8);
                                dec.l(he2Var2, l46Var, u8aVarM16);
                                ib8.s(iHashCode16, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ16);
                                if (z8) {
                                    l46Var.f0(1422951589);
                                    j09 j09VarD11 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                    xn8 xn8VarC8 = s21.c(lx0Var, false);
                                    int iHashCode17 = Long.hashCode(l46Var.T);
                                    u8a u8aVarM17 = l46Var.m();
                                    j09 j09VarJ17 = m93.J(l46Var, j09VarD11);
                                    l46Var.j0();
                                    if (l46Var.S) {
                                        l46Var.l(ov7Var);
                                    } else {
                                        l46Var.s0();
                                    }
                                    dec.l(he2Var, l46Var, xn8VarC8);
                                    dec.l(he2Var2, l46Var, u8aVarM17);
                                    ib8.s(iHashCode17, l46Var, he2Var3, l46Var);
                                    dec.l(he2Var4, l46Var, j09VarJ17);
                                    dd2Var.m(d31Var, l46Var, 54);
                                    l46Var.r(true);
                                    o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(1423207401);
                                    o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                    l46Var.r(false);
                                }
                                if (z6) {
                                    l46Var.f0(1423311716);
                                    j09 j09VarA15 = v7cVar.a(g09Var2, 1.0f, true);
                                    mue mueVar10 = pue.a;
                                    mue mueVarQ6 = pue.q(l46Var);
                                    nte.b(str, j09VarA15, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ6, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                    z10 = false;
                                    l46Var.r(false);
                                } else {
                                    pr4 pr4Var7 = pr4Var2;
                                    l46Var.f0(1423728945);
                                    j09 j09VarA16 = v7cVar.a(g09Var2, 1.0f, true);
                                    mue mueVar11 = pue.a;
                                    vd0.e(str, j09VarA16, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var7)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                    z10 = false;
                                    l46Var.r(false);
                                }
                                l46Var.r(true);
                                l46Var.r(z10);
                                fillElement2 = fillElement;
                            }
                            j09 j09VarD12 = ynb.d0(0.0f, 0.0f, 12.0f, 0.0f, 11, androidx.compose.foundation.layout.b.p(g09Var2, 28.0f).D(fillElement2));
                            xn8 xn8VarC9 = s21.c(ndb.g, false);
                            int iHashCode18 = Long.hashCode(l46Var.T);
                            u8a u8aVarM18 = l46Var.m();
                            j09 j09VarJ18 = m93.J(l46Var, j09VarD12);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, xn8VarC9);
                            dec.l(he2Var2, l46Var, u8aVarM18);
                            ib8.s(iHashCode18, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ18);
                            i(0, 1, l46Var, null);
                            l46Var.r(true);
                            l46Var.r(true);
                            j6 = j18;
                            j7 = j19;
                            z4 = z6;
                            z5 = z7;
                            j8 = j13;
                            num2 = num4;
                        } else {
                            l46Var.Z();
                            z4 = z;
                            z5 = z2;
                            j6 = j4;
                            j7 = j5;
                            j8 = j3;
                            num2 = num;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new l26() { // from class: ao6
                                @Override // defpackage.l26
                                public final Object z(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i2 | 1);
                                    no6.k(ii6Var, j6, j7, j8, num2, str, x16Var, j09Var, z4, z5, dd2Var, (l46) obj, iP, i3);
                                    return wef.a;
                                }
                            };
                        }
                    }
                    i4 |= 805306368;
                    if ((i4 & 306783379) == 306783378) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i4 & 1, z3)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i16 != 0) {
                                j9 = y72.j;
                            } else {
                                j9 = j4;
                            }
                            if ((i3 & 4) != 0) {
                                j10 = ((e8b) l46Var.k(l8b.a)).f;
                                i4 &= -897;
                            } else {
                                j10 = j5;
                            }
                            if ((i3 & 8) != 0) {
                                jW = w(l46Var);
                                i4 &= -7169;
                            } else {
                                jW = j3;
                            }
                            if (i5 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i7 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i9 != 0) {
                                z7 = false;
                            } else {
                                z7 = z2;
                            }
                            num4 = num3;
                        } else {
                            if (i16 != 0) {
                                j9 = y72.j;
                            } else {
                                j9 = j4;
                            }
                            if ((i3 & 4) != 0) {
                                j10 = ((e8b) l46Var.k(l8b.a)).f;
                                i4 &= -897;
                            } else {
                                j10 = j5;
                            }
                            if ((i3 & 8) != 0) {
                                jW = w(l46Var);
                                i4 &= -7169;
                            } else {
                                jW = j3;
                            }
                            if (i5 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i7 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i9 != 0) {
                                z7 = false;
                            } else {
                                z7 = z2;
                            }
                            num4 = num3;
                        }
                        l46Var.s();
                        pr4Var = l8b.a;
                        zF = k8b.f((e8b) l46Var.k(pr4Var));
                        if (((sw3) l46Var.k(zg2.h)).h0() < 1.5f) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (zF) {
                            f2 = 0.0f;
                        } else {
                            f2 = 20.0f;
                        }
                        y6cVarB = a7c.b(f2);
                        g09Var = g09.a;
                        if (zF) {
                            l46Var.f0(-714160456);
                            j09 j09VarO4 = tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var.k(pr4Var)).a, g21.f);
                            if (z7) {
                                j09VarT = b21.t(g09Var, new uc2(5, 1.0f));
                            } else {
                                j09VarT = g09Var;
                            }
                            j09VarU = j09VarO4.D(j09VarT);
                            l46Var.r(false);
                            j11 = j9;
                            j12 = j10;
                            g09Var2 = g09Var;
                            j13 = jW;
                            pr4Var2 = pr4Var;
                        } else {
                            l46Var.f0(-713989956);
                            g09Var2 = g09Var;
                            j11 = j9;
                            j12 = j10;
                            j13 = jW;
                            pr4Var2 = pr4Var;
                            j09VarU = u(y6cVarB, ii6Var, j11, j12, j13, num4, l46Var, 64);
                            l46Var.r(false);
                        }
                        j09 j09VarC4 = androidx.compose.foundation.b.c(j09Var.D(j09VarU), false, null, null, x16Var, 15);
                        kx0Var = ndb.z;
                        rc0Var = xc0.a;
                        t7c t7cVarA9 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                        int iHashCode19 = Long.hashCode(l46Var.T);
                        u8a u8aVarM19 = l46Var.m();
                        j09 j09VarJ19 = m93.J(l46Var, j09VarC4);
                        lf2.q.getClass();
                        l46Var.j0();
                        long j110 = j11;
                        z9 = l46Var.S;
                        ov7Var = LayoutNode.h1;
                        if (z9) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        he2Var = hj6.z;
                        long j111 = j12;
                        dec.l(he2Var, l46Var, t7cVarA9);
                        he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var, u8aVarM19);
                        Integer numValueOf4 = Integer.valueOf(iHashCode19);
                        he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var, numValueOf4);
                        dec.k(l46Var);
                        he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var, j09VarJ19);
                        d31Var = d31.a;
                        v7cVar = v7c.a;
                        if (z6) {
                            l46Var.f0(1697589941);
                            j09 j09VarA17 = v7cVar.a(g09Var2, 1.0f, true);
                            fillElement = androidx.compose.foundation.layout.b.b;
                            j09 j09VarD13 = j09VarA17.D(fillElement);
                            t7c t7cVarA10 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                            int iHashCode110 = Long.hashCode(l46Var.T);
                            u8a u8aVarM110 = l46Var.m();
                            j09 j09VarJ110 = m93.J(l46Var, j09VarD13);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, t7cVarA10);
                            dec.l(he2Var2, l46Var, u8aVarM110);
                            ib8.s(iHashCode110, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ110);
                            if (z8) {
                                l46Var.f0(1422951589);
                                j09 j09VarD14 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                xn8 xn8VarC10 = s21.c(lx0Var, false);
                                int iHashCode111 = Long.hashCode(l46Var.T);
                                u8a u8aVarM111 = l46Var.m();
                                j09 j09VarJ111 = m93.J(l46Var, j09VarD14);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, xn8VarC10);
                                dec.l(he2Var2, l46Var, u8aVarM111);
                                ib8.s(iHashCode111, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ111);
                                dd2Var.m(d31Var, l46Var, 54);
                                l46Var.r(true);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                l46Var.r(false);
                            } else {
                                l46Var.f0(1423207401);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                l46Var.r(false);
                            }
                            if (z6) {
                                l46Var.f0(1423311716);
                                j09 j09VarA18 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar12 = pue.a;
                                mue mueVarQ7 = pue.q(l46Var);
                                nte.b(str, j09VarA18, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ7, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                z10 = false;
                                l46Var.r(false);
                            } else {
                                pr4 pr4Var8 = pr4Var2;
                                l46Var.f0(1423728945);
                                j09 j09VarA19 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar13 = pue.a;
                                vd0.e(str, j09VarA19, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var8)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                z10 = false;
                                l46Var.r(false);
                            }
                            l46Var.r(true);
                            l46Var.r(z10);
                            fillElement2 = fillElement;
                        } else {
                            l46Var.f0(1697589941);
                            j09 j09VarA110 = v7cVar.a(g09Var2, 1.0f, true);
                            fillElement = androidx.compose.foundation.layout.b.b;
                            j09 j09VarD15 = j09VarA110.D(fillElement);
                            t7c t7cVarA11 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                            int iHashCode112 = Long.hashCode(l46Var.T);
                            u8a u8aVarM112 = l46Var.m();
                            j09 j09VarJ112 = m93.J(l46Var, j09VarD15);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, t7cVarA11);
                            dec.l(he2Var2, l46Var, u8aVarM112);
                            ib8.s(iHashCode112, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ112);
                            if (z8) {
                                l46Var.f0(1422951589);
                                j09 j09VarD16 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                xn8 xn8VarC11 = s21.c(lx0Var, false);
                                int iHashCode113 = Long.hashCode(l46Var.T);
                                u8a u8aVarM113 = l46Var.m();
                                j09 j09VarJ113 = m93.J(l46Var, j09VarD16);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, xn8VarC11);
                                dec.l(he2Var2, l46Var, u8aVarM113);
                                ib8.s(iHashCode113, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ113);
                                dd2Var.m(d31Var, l46Var, 54);
                                l46Var.r(true);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                l46Var.r(false);
                            } else {
                                l46Var.f0(1423207401);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                l46Var.r(false);
                            }
                            if (z6) {
                                l46Var.f0(1423311716);
                                j09 j09VarA111 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar14 = pue.a;
                                mue mueVarQ8 = pue.q(l46Var);
                                nte.b(str, j09VarA111, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ8, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                z10 = false;
                                l46Var.r(false);
                            } else {
                                pr4 pr4Var9 = pr4Var2;
                                l46Var.f0(1423728945);
                                j09 j09VarA112 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar15 = pue.a;
                                vd0.e(str, j09VarA112, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var9)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                z10 = false;
                                l46Var.r(false);
                            }
                            l46Var.r(true);
                            l46Var.r(z10);
                            fillElement2 = fillElement;
                        }
                        j09 j09VarD17 = ynb.d0(0.0f, 0.0f, 12.0f, 0.0f, 11, androidx.compose.foundation.layout.b.p(g09Var2, 28.0f).D(fillElement2));
                        xn8 xn8VarC12 = s21.c(ndb.g, false);
                        int iHashCode114 = Long.hashCode(l46Var.T);
                        u8a u8aVarM114 = l46Var.m();
                        j09 j09VarJ114 = m93.J(l46Var, j09VarD17);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, xn8VarC12);
                        dec.l(he2Var2, l46Var, u8aVarM114);
                        ib8.s(iHashCode114, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ114);
                        i(0, 1, l46Var, null);
                        l46Var.r(true);
                        l46Var.r(true);
                        j6 = j110;
                        j7 = j111;
                        z4 = z6;
                        z5 = z7;
                        j8 = j13;
                        num2 = num4;
                    } else {
                        l46Var.Z();
                        z4 = z;
                        z5 = z2;
                        j6 = j4;
                        j7 = j5;
                        j8 = j3;
                        num2 = num;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: ao6
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i2 | 1);
                                no6.k(ii6Var, j6, j7, j8, num2, str, x16Var, j09Var, z4, z5, dd2Var, (l46) obj, iP, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i4 |= 24576;
                if ((i2 & 196608) == 0) {
                    if (l46Var.g(str)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i4 |= i13;
                }
                if ((i2 & 1572864) == 0) {
                    if (l46Var.i(x16Var)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i4 |= i12;
                }
                if ((i2 & 12582912) == 0) {
                    if (l46Var.g(j09Var)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i4 |= i11;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    if ((100663296 & i2) == 0) {
                        if (l46Var.h(z)) {
                            i8 = 67108864;
                        } else {
                            i8 = 33554432;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 512;
                    if (i9 != 0) {
                        if ((i2 & 805306368) == 0) {
                            if (l46Var.h(z2)) {
                                i10 = 536870912;
                            } else {
                                i10 = 268435456;
                            }
                            i4 |= i10;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (l46Var.W(i4 & 1, z3)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i16 != 0) {
                                    j9 = y72.j;
                                } else {
                                    j9 = j4;
                                }
                                if ((i3 & 4) != 0) {
                                    j10 = ((e8b) l46Var.k(l8b.a)).f;
                                    i4 &= -897;
                                } else {
                                    j10 = j5;
                                }
                                if ((i3 & 8) != 0) {
                                    jW = w(l46Var);
                                    i4 &= -7169;
                                } else {
                                    jW = j3;
                                }
                                if (i5 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i7 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z;
                                }
                                if (i9 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z2;
                                }
                                num4 = num3;
                            } else {
                                if (i16 != 0) {
                                    j9 = y72.j;
                                } else {
                                    j9 = j4;
                                }
                                if ((i3 & 4) != 0) {
                                    j10 = ((e8b) l46Var.k(l8b.a)).f;
                                    i4 &= -897;
                                } else {
                                    j10 = j5;
                                }
                                if ((i3 & 8) != 0) {
                                    jW = w(l46Var);
                                    i4 &= -7169;
                                } else {
                                    jW = j3;
                                }
                                if (i5 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i7 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z;
                                }
                                if (i9 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z2;
                                }
                                num4 = num3;
                            }
                            l46Var.s();
                            pr4Var = l8b.a;
                            zF = k8b.f((e8b) l46Var.k(pr4Var));
                            if (((sw3) l46Var.k(zg2.h)).h0() < 1.5f) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (zF) {
                                f2 = 0.0f;
                            } else {
                                f2 = 20.0f;
                            }
                            y6cVarB = a7c.b(f2);
                            g09Var = g09.a;
                            if (zF) {
                                l46Var.f0(-714160456);
                                j09 j09VarO5 = tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var.k(pr4Var)).a, g21.f);
                                if (z7) {
                                    j09VarT = b21.t(g09Var, new uc2(5, 1.0f));
                                } else {
                                    j09VarT = g09Var;
                                }
                                j09VarU = j09VarO5.D(j09VarT);
                                l46Var.r(false);
                                j11 = j9;
                                j12 = j10;
                                g09Var2 = g09Var;
                                j13 = jW;
                                pr4Var2 = pr4Var;
                            } else {
                                l46Var.f0(-713989956);
                                g09Var2 = g09Var;
                                j11 = j9;
                                j12 = j10;
                                j13 = jW;
                                pr4Var2 = pr4Var;
                                j09VarU = u(y6cVarB, ii6Var, j11, j12, j13, num4, l46Var, 64);
                                l46Var.r(false);
                            }
                            j09 j09VarC5 = androidx.compose.foundation.b.c(j09Var.D(j09VarU), false, null, null, x16Var, 15);
                            kx0Var = ndb.z;
                            rc0Var = xc0.a;
                            t7c t7cVarA12 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                            int iHashCode115 = Long.hashCode(l46Var.T);
                            u8a u8aVarM115 = l46Var.m();
                            j09 j09VarJ115 = m93.J(l46Var, j09VarC5);
                            lf2.q.getClass();
                            l46Var.j0();
                            long j112 = j11;
                            z9 = l46Var.S;
                            ov7Var = LayoutNode.h1;
                            if (z9) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            he2Var = hj6.z;
                            long j113 = j12;
                            dec.l(he2Var, l46Var, t7cVarA12);
                            he2Var2 = hj6.y;
                            dec.l(he2Var2, l46Var, u8aVarM115);
                            Integer numValueOf5 = Integer.valueOf(iHashCode115);
                            he2Var3 = hj6.X;
                            dec.l(he2Var3, l46Var, numValueOf5);
                            dec.k(l46Var);
                            he2Var4 = hj6.x;
                            dec.l(he2Var4, l46Var, j09VarJ115);
                            d31Var = d31.a;
                            v7cVar = v7c.a;
                            if (z6) {
                                l46Var.f0(1697589941);
                                j09 j09VarA113 = v7cVar.a(g09Var2, 1.0f, true);
                                fillElement = androidx.compose.foundation.layout.b.b;
                                j09 j09VarD18 = j09VarA113.D(fillElement);
                                t7c t7cVarA13 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                                int iHashCode116 = Long.hashCode(l46Var.T);
                                u8a u8aVarM116 = l46Var.m();
                                j09 j09VarJ116 = m93.J(l46Var, j09VarD18);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, t7cVarA13);
                                dec.l(he2Var2, l46Var, u8aVarM116);
                                ib8.s(iHashCode116, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ116);
                                if (z8) {
                                    l46Var.f0(1422951589);
                                    j09 j09VarD19 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                    xn8 xn8VarC13 = s21.c(lx0Var, false);
                                    int iHashCode117 = Long.hashCode(l46Var.T);
                                    u8a u8aVarM117 = l46Var.m();
                                    j09 j09VarJ117 = m93.J(l46Var, j09VarD19);
                                    l46Var.j0();
                                    if (l46Var.S) {
                                        l46Var.l(ov7Var);
                                    } else {
                                        l46Var.s0();
                                    }
                                    dec.l(he2Var, l46Var, xn8VarC13);
                                    dec.l(he2Var2, l46Var, u8aVarM117);
                                    ib8.s(iHashCode117, l46Var, he2Var3, l46Var);
                                    dec.l(he2Var4, l46Var, j09VarJ117);
                                    dd2Var.m(d31Var, l46Var, 54);
                                    l46Var.r(true);
                                    o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(1423207401);
                                    o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                    l46Var.r(false);
                                }
                                if (z6) {
                                    l46Var.f0(1423311716);
                                    j09 j09VarA114 = v7cVar.a(g09Var2, 1.0f, true);
                                    mue mueVar16 = pue.a;
                                    mue mueVarQ9 = pue.q(l46Var);
                                    nte.b(str, j09VarA114, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ9, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                    z10 = false;
                                    l46Var.r(false);
                                } else {
                                    pr4 pr4Var10 = pr4Var2;
                                    l46Var.f0(1423728945);
                                    j09 j09VarA115 = v7cVar.a(g09Var2, 1.0f, true);
                                    mue mueVar17 = pue.a;
                                    vd0.e(str, j09VarA115, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var10)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                    z10 = false;
                                    l46Var.r(false);
                                }
                                l46Var.r(true);
                                l46Var.r(z10);
                                fillElement2 = fillElement;
                            } else {
                                l46Var.f0(1697589941);
                                j09 j09VarA116 = v7cVar.a(g09Var2, 1.0f, true);
                                fillElement = androidx.compose.foundation.layout.b.b;
                                j09 j09VarD110 = j09VarA116.D(fillElement);
                                t7c t7cVarA14 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                                int iHashCode118 = Long.hashCode(l46Var.T);
                                u8a u8aVarM118 = l46Var.m();
                                j09 j09VarJ118 = m93.J(l46Var, j09VarD110);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, t7cVarA14);
                                dec.l(he2Var2, l46Var, u8aVarM118);
                                ib8.s(iHashCode118, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ118);
                                if (z8) {
                                    l46Var.f0(1422951589);
                                    j09 j09VarD111 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                    xn8 xn8VarC14 = s21.c(lx0Var, false);
                                    int iHashCode119 = Long.hashCode(l46Var.T);
                                    u8a u8aVarM119 = l46Var.m();
                                    j09 j09VarJ119 = m93.J(l46Var, j09VarD111);
                                    l46Var.j0();
                                    if (l46Var.S) {
                                        l46Var.l(ov7Var);
                                    } else {
                                        l46Var.s0();
                                    }
                                    dec.l(he2Var, l46Var, xn8VarC14);
                                    dec.l(he2Var2, l46Var, u8aVarM119);
                                    ib8.s(iHashCode119, l46Var, he2Var3, l46Var);
                                    dec.l(he2Var4, l46Var, j09VarJ119);
                                    dd2Var.m(d31Var, l46Var, 54);
                                    l46Var.r(true);
                                    o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(1423207401);
                                    o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                    l46Var.r(false);
                                }
                                if (z6) {
                                    l46Var.f0(1423311716);
                                    j09 j09VarA117 = v7cVar.a(g09Var2, 1.0f, true);
                                    mue mueVar18 = pue.a;
                                    mue mueVarQ10 = pue.q(l46Var);
                                    nte.b(str, j09VarA117, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ10, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                    z10 = false;
                                    l46Var.r(false);
                                } else {
                                    pr4 pr4Var11 = pr4Var2;
                                    l46Var.f0(1423728945);
                                    j09 j09VarA118 = v7cVar.a(g09Var2, 1.0f, true);
                                    mue mueVar19 = pue.a;
                                    vd0.e(str, j09VarA118, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var11)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                    z10 = false;
                                    l46Var.r(false);
                                }
                                l46Var.r(true);
                                l46Var.r(z10);
                                fillElement2 = fillElement;
                            }
                            j09 j09VarD112 = ynb.d0(0.0f, 0.0f, 12.0f, 0.0f, 11, androidx.compose.foundation.layout.b.p(g09Var2, 28.0f).D(fillElement2));
                            xn8 xn8VarC15 = s21.c(ndb.g, false);
                            int iHashCode1110 = Long.hashCode(l46Var.T);
                            u8a u8aVarM1110 = l46Var.m();
                            j09 j09VarJ1110 = m93.J(l46Var, j09VarD112);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, xn8VarC15);
                            dec.l(he2Var2, l46Var, u8aVarM1110);
                            ib8.s(iHashCode1110, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ1110);
                            i(0, 1, l46Var, null);
                            l46Var.r(true);
                            l46Var.r(true);
                            j6 = j112;
                            j7 = j113;
                            z4 = z6;
                            z5 = z7;
                            j8 = j13;
                            num2 = num4;
                        } else {
                            l46Var.Z();
                            z4 = z;
                            z5 = z2;
                            j6 = j4;
                            j7 = j5;
                            j8 = j3;
                            num2 = num;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new l26() { // from class: ao6
                                @Override // defpackage.l26
                                public final Object z(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i2 | 1);
                                    no6.k(ii6Var, j6, j7, j8, num2, str, x16Var, j09Var, z4, z5, dd2Var, (l46) obj, iP, i3);
                                    return wef.a;
                                }
                            };
                        }
                    }
                    i4 |= 805306368;
                    if ((i4 & 306783379) == 306783378) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i4 & 1, z3)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i16 != 0) {
                                j9 = y72.j;
                            } else {
                                j9 = j4;
                            }
                            if ((i3 & 4) != 0) {
                                j10 = ((e8b) l46Var.k(l8b.a)).f;
                                i4 &= -897;
                            } else {
                                j10 = j5;
                            }
                            if ((i3 & 8) != 0) {
                                jW = w(l46Var);
                                i4 &= -7169;
                            } else {
                                jW = j3;
                            }
                            if (i5 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i7 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i9 != 0) {
                                z7 = false;
                            } else {
                                z7 = z2;
                            }
                            num4 = num3;
                        } else {
                            if (i16 != 0) {
                                j9 = y72.j;
                            } else {
                                j9 = j4;
                            }
                            if ((i3 & 4) != 0) {
                                j10 = ((e8b) l46Var.k(l8b.a)).f;
                                i4 &= -897;
                            } else {
                                j10 = j5;
                            }
                            if ((i3 & 8) != 0) {
                                jW = w(l46Var);
                                i4 &= -7169;
                            } else {
                                jW = j3;
                            }
                            if (i5 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i7 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i9 != 0) {
                                z7 = false;
                            } else {
                                z7 = z2;
                            }
                            num4 = num3;
                        }
                        l46Var.s();
                        pr4Var = l8b.a;
                        zF = k8b.f((e8b) l46Var.k(pr4Var));
                        if (((sw3) l46Var.k(zg2.h)).h0() < 1.5f) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (zF) {
                            f2 = 0.0f;
                        } else {
                            f2 = 20.0f;
                        }
                        y6cVarB = a7c.b(f2);
                        g09Var = g09.a;
                        if (zF) {
                            l46Var.f0(-714160456);
                            j09 j09VarO6 = tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var.k(pr4Var)).a, g21.f);
                            if (z7) {
                                j09VarT = b21.t(g09Var, new uc2(5, 1.0f));
                            } else {
                                j09VarT = g09Var;
                            }
                            j09VarU = j09VarO6.D(j09VarT);
                            l46Var.r(false);
                            j11 = j9;
                            j12 = j10;
                            g09Var2 = g09Var;
                            j13 = jW;
                            pr4Var2 = pr4Var;
                        } else {
                            l46Var.f0(-713989956);
                            g09Var2 = g09Var;
                            j11 = j9;
                            j12 = j10;
                            j13 = jW;
                            pr4Var2 = pr4Var;
                            j09VarU = u(y6cVarB, ii6Var, j11, j12, j13, num4, l46Var, 64);
                            l46Var.r(false);
                        }
                        j09 j09VarC6 = androidx.compose.foundation.b.c(j09Var.D(j09VarU), false, null, null, x16Var, 15);
                        kx0Var = ndb.z;
                        rc0Var = xc0.a;
                        t7c t7cVarA15 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                        int iHashCode1111 = Long.hashCode(l46Var.T);
                        u8a u8aVarM1111 = l46Var.m();
                        j09 j09VarJ1111 = m93.J(l46Var, j09VarC6);
                        lf2.q.getClass();
                        l46Var.j0();
                        long j114 = j11;
                        z9 = l46Var.S;
                        ov7Var = LayoutNode.h1;
                        if (z9) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        he2Var = hj6.z;
                        long j115 = j12;
                        dec.l(he2Var, l46Var, t7cVarA15);
                        he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var, u8aVarM1111);
                        Integer numValueOf6 = Integer.valueOf(iHashCode1111);
                        he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var, numValueOf6);
                        dec.k(l46Var);
                        he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var, j09VarJ1111);
                        d31Var = d31.a;
                        v7cVar = v7c.a;
                        if (z6) {
                            l46Var.f0(1697589941);
                            j09 j09VarA119 = v7cVar.a(g09Var2, 1.0f, true);
                            fillElement = androidx.compose.foundation.layout.b.b;
                            j09 j09VarD113 = j09VarA119.D(fillElement);
                            t7c t7cVarA16 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                            int iHashCode1112 = Long.hashCode(l46Var.T);
                            u8a u8aVarM1112 = l46Var.m();
                            j09 j09VarJ1112 = m93.J(l46Var, j09VarD113);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, t7cVarA16);
                            dec.l(he2Var2, l46Var, u8aVarM1112);
                            ib8.s(iHashCode1112, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ1112);
                            if (z8) {
                                l46Var.f0(1422951589);
                                j09 j09VarD114 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                xn8 xn8VarC16 = s21.c(lx0Var, false);
                                int iHashCode1113 = Long.hashCode(l46Var.T);
                                u8a u8aVarM1113 = l46Var.m();
                                j09 j09VarJ1113 = m93.J(l46Var, j09VarD114);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, xn8VarC16);
                                dec.l(he2Var2, l46Var, u8aVarM1113);
                                ib8.s(iHashCode1113, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ1113);
                                dd2Var.m(d31Var, l46Var, 54);
                                l46Var.r(true);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                l46Var.r(false);
                            } else {
                                l46Var.f0(1423207401);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                l46Var.r(false);
                            }
                            if (z6) {
                                l46Var.f0(1423311716);
                                j09 j09VarA1110 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar110 = pue.a;
                                mue mueVarQ11 = pue.q(l46Var);
                                nte.b(str, j09VarA1110, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ11, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                z10 = false;
                                l46Var.r(false);
                            } else {
                                pr4 pr4Var12 = pr4Var2;
                                l46Var.f0(1423728945);
                                j09 j09VarA1111 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar111 = pue.a;
                                vd0.e(str, j09VarA1111, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var12)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                z10 = false;
                                l46Var.r(false);
                            }
                            l46Var.r(true);
                            l46Var.r(z10);
                            fillElement2 = fillElement;
                        } else {
                            l46Var.f0(1697589941);
                            j09 j09VarA1112 = v7cVar.a(g09Var2, 1.0f, true);
                            fillElement = androidx.compose.foundation.layout.b.b;
                            j09 j09VarD115 = j09VarA1112.D(fillElement);
                            t7c t7cVarA17 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                            int iHashCode1114 = Long.hashCode(l46Var.T);
                            u8a u8aVarM1114 = l46Var.m();
                            j09 j09VarJ1114 = m93.J(l46Var, j09VarD115);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, t7cVarA17);
                            dec.l(he2Var2, l46Var, u8aVarM1114);
                            ib8.s(iHashCode1114, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ1114);
                            if (z8) {
                                l46Var.f0(1422951589);
                                j09 j09VarD116 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                xn8 xn8VarC17 = s21.c(lx0Var, false);
                                int iHashCode1115 = Long.hashCode(l46Var.T);
                                u8a u8aVarM1115 = l46Var.m();
                                j09 j09VarJ1115 = m93.J(l46Var, j09VarD116);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, xn8VarC17);
                                dec.l(he2Var2, l46Var, u8aVarM1115);
                                ib8.s(iHashCode1115, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ1115);
                                dd2Var.m(d31Var, l46Var, 54);
                                l46Var.r(true);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                l46Var.r(false);
                            } else {
                                l46Var.f0(1423207401);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                l46Var.r(false);
                            }
                            if (z6) {
                                l46Var.f0(1423311716);
                                j09 j09VarA1113 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar112 = pue.a;
                                mue mueVarQ12 = pue.q(l46Var);
                                nte.b(str, j09VarA1113, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ12, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                z10 = false;
                                l46Var.r(false);
                            } else {
                                pr4 pr4Var13 = pr4Var2;
                                l46Var.f0(1423728945);
                                j09 j09VarA1114 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar113 = pue.a;
                                vd0.e(str, j09VarA1114, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var13)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                z10 = false;
                                l46Var.r(false);
                            }
                            l46Var.r(true);
                            l46Var.r(z10);
                            fillElement2 = fillElement;
                        }
                        j09 j09VarD117 = ynb.d0(0.0f, 0.0f, 12.0f, 0.0f, 11, androidx.compose.foundation.layout.b.p(g09Var2, 28.0f).D(fillElement2));
                        xn8 xn8VarC18 = s21.c(ndb.g, false);
                        int iHashCode1116 = Long.hashCode(l46Var.T);
                        u8a u8aVarM1116 = l46Var.m();
                        j09 j09VarJ1116 = m93.J(l46Var, j09VarD117);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, xn8VarC18);
                        dec.l(he2Var2, l46Var, u8aVarM1116);
                        ib8.s(iHashCode1116, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ1116);
                        i(0, 1, l46Var, null);
                        l46Var.r(true);
                        l46Var.r(true);
                        j6 = j114;
                        j7 = j115;
                        z4 = z6;
                        z5 = z7;
                        j8 = j13;
                        num2 = num4;
                    } else {
                        l46Var.Z();
                        z4 = z;
                        z5 = z2;
                        j6 = j4;
                        j7 = j5;
                        j8 = j3;
                        num2 = num;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: ao6
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i2 | 1);
                                no6.k(ii6Var, j6, j7, j8, num2, str, x16Var, j09Var, z4, z5, dd2Var, (l46) obj, iP, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i4 |= 100663296;
                i9 = i3 & 512;
                if (i9 != 0) {
                    if ((i2 & 805306368) == 0) {
                        if (l46Var.h(z2)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i4 |= i10;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i4 & 1, z3)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i16 != 0) {
                                j9 = y72.j;
                            } else {
                                j9 = j4;
                            }
                            if ((i3 & 4) != 0) {
                                j10 = ((e8b) l46Var.k(l8b.a)).f;
                                i4 &= -897;
                            } else {
                                j10 = j5;
                            }
                            if ((i3 & 8) != 0) {
                                jW = w(l46Var);
                                i4 &= -7169;
                            } else {
                                jW = j3;
                            }
                            if (i5 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i7 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i9 != 0) {
                                z7 = false;
                            } else {
                                z7 = z2;
                            }
                            num4 = num3;
                        } else {
                            if (i16 != 0) {
                                j9 = y72.j;
                            } else {
                                j9 = j4;
                            }
                            if ((i3 & 4) != 0) {
                                j10 = ((e8b) l46Var.k(l8b.a)).f;
                                i4 &= -897;
                            } else {
                                j10 = j5;
                            }
                            if ((i3 & 8) != 0) {
                                jW = w(l46Var);
                                i4 &= -7169;
                            } else {
                                jW = j3;
                            }
                            if (i5 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i7 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i9 != 0) {
                                z7 = false;
                            } else {
                                z7 = z2;
                            }
                            num4 = num3;
                        }
                        l46Var.s();
                        pr4Var = l8b.a;
                        zF = k8b.f((e8b) l46Var.k(pr4Var));
                        if (((sw3) l46Var.k(zg2.h)).h0() < 1.5f) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (zF) {
                            f2 = 0.0f;
                        } else {
                            f2 = 20.0f;
                        }
                        y6cVarB = a7c.b(f2);
                        g09Var = g09.a;
                        if (zF) {
                            l46Var.f0(-714160456);
                            j09 j09VarO7 = tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var.k(pr4Var)).a, g21.f);
                            if (z7) {
                                j09VarT = b21.t(g09Var, new uc2(5, 1.0f));
                            } else {
                                j09VarT = g09Var;
                            }
                            j09VarU = j09VarO7.D(j09VarT);
                            l46Var.r(false);
                            j11 = j9;
                            j12 = j10;
                            g09Var2 = g09Var;
                            j13 = jW;
                            pr4Var2 = pr4Var;
                        } else {
                            l46Var.f0(-713989956);
                            g09Var2 = g09Var;
                            j11 = j9;
                            j12 = j10;
                            j13 = jW;
                            pr4Var2 = pr4Var;
                            j09VarU = u(y6cVarB, ii6Var, j11, j12, j13, num4, l46Var, 64);
                            l46Var.r(false);
                        }
                        j09 j09VarC7 = androidx.compose.foundation.b.c(j09Var.D(j09VarU), false, null, null, x16Var, 15);
                        kx0Var = ndb.z;
                        rc0Var = xc0.a;
                        t7c t7cVarA18 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                        int iHashCode1117 = Long.hashCode(l46Var.T);
                        u8a u8aVarM1117 = l46Var.m();
                        j09 j09VarJ1117 = m93.J(l46Var, j09VarC7);
                        lf2.q.getClass();
                        l46Var.j0();
                        long j116 = j11;
                        z9 = l46Var.S;
                        ov7Var = LayoutNode.h1;
                        if (z9) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        he2Var = hj6.z;
                        long j117 = j12;
                        dec.l(he2Var, l46Var, t7cVarA18);
                        he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var, u8aVarM1117);
                        Integer numValueOf7 = Integer.valueOf(iHashCode1117);
                        he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var, numValueOf7);
                        dec.k(l46Var);
                        he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var, j09VarJ1117);
                        d31Var = d31.a;
                        v7cVar = v7c.a;
                        if (z6) {
                            l46Var.f0(1697589941);
                            j09 j09VarA1115 = v7cVar.a(g09Var2, 1.0f, true);
                            fillElement = androidx.compose.foundation.layout.b.b;
                            j09 j09VarD118 = j09VarA1115.D(fillElement);
                            t7c t7cVarA19 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                            int iHashCode1118 = Long.hashCode(l46Var.T);
                            u8a u8aVarM1118 = l46Var.m();
                            j09 j09VarJ1118 = m93.J(l46Var, j09VarD118);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, t7cVarA19);
                            dec.l(he2Var2, l46Var, u8aVarM1118);
                            ib8.s(iHashCode1118, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ1118);
                            if (z8) {
                                l46Var.f0(1422951589);
                                j09 j09VarD119 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                xn8 xn8VarC19 = s21.c(lx0Var, false);
                                int iHashCode1119 = Long.hashCode(l46Var.T);
                                u8a u8aVarM1119 = l46Var.m();
                                j09 j09VarJ1119 = m93.J(l46Var, j09VarD119);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, xn8VarC19);
                                dec.l(he2Var2, l46Var, u8aVarM1119);
                                ib8.s(iHashCode1119, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ1119);
                                dd2Var.m(d31Var, l46Var, 54);
                                l46Var.r(true);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                l46Var.r(false);
                            } else {
                                l46Var.f0(1423207401);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                l46Var.r(false);
                            }
                            if (z6) {
                                l46Var.f0(1423311716);
                                j09 j09VarA1116 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar114 = pue.a;
                                mue mueVarQ13 = pue.q(l46Var);
                                nte.b(str, j09VarA1116, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ13, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                z10 = false;
                                l46Var.r(false);
                            } else {
                                pr4 pr4Var14 = pr4Var2;
                                l46Var.f0(1423728945);
                                j09 j09VarA1117 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar115 = pue.a;
                                vd0.e(str, j09VarA1117, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var14)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                z10 = false;
                                l46Var.r(false);
                            }
                            l46Var.r(true);
                            l46Var.r(z10);
                            fillElement2 = fillElement;
                        } else {
                            l46Var.f0(1697589941);
                            j09 j09VarA1118 = v7cVar.a(g09Var2, 1.0f, true);
                            fillElement = androidx.compose.foundation.layout.b.b;
                            j09 j09VarD1110 = j09VarA1118.D(fillElement);
                            t7c t7cVarA110 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                            int iHashCode11110 = Long.hashCode(l46Var.T);
                            u8a u8aVarM11110 = l46Var.m();
                            j09 j09VarJ11110 = m93.J(l46Var, j09VarD1110);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, t7cVarA110);
                            dec.l(he2Var2, l46Var, u8aVarM11110);
                            ib8.s(iHashCode11110, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ11110);
                            if (z8) {
                                l46Var.f0(1422951589);
                                j09 j09VarD1111 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                xn8 xn8VarC110 = s21.c(lx0Var, false);
                                int iHashCode11111 = Long.hashCode(l46Var.T);
                                u8a u8aVarM11111 = l46Var.m();
                                j09 j09VarJ11111 = m93.J(l46Var, j09VarD1111);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, xn8VarC110);
                                dec.l(he2Var2, l46Var, u8aVarM11111);
                                ib8.s(iHashCode11111, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ11111);
                                dd2Var.m(d31Var, l46Var, 54);
                                l46Var.r(true);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                l46Var.r(false);
                            } else {
                                l46Var.f0(1423207401);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                l46Var.r(false);
                            }
                            if (z6) {
                                l46Var.f0(1423311716);
                                j09 j09VarA1119 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar116 = pue.a;
                                mue mueVarQ14 = pue.q(l46Var);
                                nte.b(str, j09VarA1119, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ14, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                z10 = false;
                                l46Var.r(false);
                            } else {
                                pr4 pr4Var15 = pr4Var2;
                                l46Var.f0(1423728945);
                                j09 j09VarA11110 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar117 = pue.a;
                                vd0.e(str, j09VarA11110, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var15)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                z10 = false;
                                l46Var.r(false);
                            }
                            l46Var.r(true);
                            l46Var.r(z10);
                            fillElement2 = fillElement;
                        }
                        j09 j09VarD1112 = ynb.d0(0.0f, 0.0f, 12.0f, 0.0f, 11, androidx.compose.foundation.layout.b.p(g09Var2, 28.0f).D(fillElement2));
                        xn8 xn8VarC111 = s21.c(ndb.g, false);
                        int iHashCode11112 = Long.hashCode(l46Var.T);
                        u8a u8aVarM11112 = l46Var.m();
                        j09 j09VarJ11112 = m93.J(l46Var, j09VarD1112);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, xn8VarC111);
                        dec.l(he2Var2, l46Var, u8aVarM11112);
                        ib8.s(iHashCode11112, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ11112);
                        i(0, 1, l46Var, null);
                        l46Var.r(true);
                        l46Var.r(true);
                        j6 = j116;
                        j7 = j117;
                        z4 = z6;
                        z5 = z7;
                        j8 = j13;
                        num2 = num4;
                    } else {
                        l46Var.Z();
                        z4 = z;
                        z5 = z2;
                        j6 = j4;
                        j7 = j5;
                        j8 = j3;
                        num2 = num;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: ao6
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i2 | 1);
                                no6.k(ii6Var, j6, j7, j8, num2, str, x16Var, j09Var, z4, z5, dd2Var, (l46) obj, iP, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i4 |= 805306368;
                if ((i4 & 306783379) == 306783378) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i4 & 1, z3)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            j9 = y72.j;
                        } else {
                            j9 = j4;
                        }
                        if ((i3 & 4) != 0) {
                            j10 = ((e8b) l46Var.k(l8b.a)).f;
                            i4 &= -897;
                        } else {
                            j10 = j5;
                        }
                        if ((i3 & 8) != 0) {
                            jW = w(l46Var);
                            i4 &= -7169;
                        } else {
                            jW = j3;
                        }
                        if (i5 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i9 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        num4 = num3;
                    } else {
                        if (i16 != 0) {
                            j9 = y72.j;
                        } else {
                            j9 = j4;
                        }
                        if ((i3 & 4) != 0) {
                            j10 = ((e8b) l46Var.k(l8b.a)).f;
                            i4 &= -897;
                        } else {
                            j10 = j5;
                        }
                        if ((i3 & 8) != 0) {
                            jW = w(l46Var);
                            i4 &= -7169;
                        } else {
                            jW = j3;
                        }
                        if (i5 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i9 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        num4 = num3;
                    }
                    l46Var.s();
                    pr4Var = l8b.a;
                    zF = k8b.f((e8b) l46Var.k(pr4Var));
                    if (((sw3) l46Var.k(zg2.h)).h0() < 1.5f) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (zF) {
                        f2 = 0.0f;
                    } else {
                        f2 = 20.0f;
                    }
                    y6cVarB = a7c.b(f2);
                    g09Var = g09.a;
                    if (zF) {
                        l46Var.f0(-714160456);
                        j09 j09VarO8 = tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var.k(pr4Var)).a, g21.f);
                        if (z7) {
                            j09VarT = b21.t(g09Var, new uc2(5, 1.0f));
                        } else {
                            j09VarT = g09Var;
                        }
                        j09VarU = j09VarO8.D(j09VarT);
                        l46Var.r(false);
                        j11 = j9;
                        j12 = j10;
                        g09Var2 = g09Var;
                        j13 = jW;
                        pr4Var2 = pr4Var;
                    } else {
                        l46Var.f0(-713989956);
                        g09Var2 = g09Var;
                        j11 = j9;
                        j12 = j10;
                        j13 = jW;
                        pr4Var2 = pr4Var;
                        j09VarU = u(y6cVarB, ii6Var, j11, j12, j13, num4, l46Var, 64);
                        l46Var.r(false);
                    }
                    j09 j09VarC8 = androidx.compose.foundation.b.c(j09Var.D(j09VarU), false, null, null, x16Var, 15);
                    kx0Var = ndb.z;
                    rc0Var = xc0.a;
                    t7c t7cVarA111 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                    int iHashCode11113 = Long.hashCode(l46Var.T);
                    u8a u8aVarM11113 = l46Var.m();
                    j09 j09VarJ11113 = m93.J(l46Var, j09VarC8);
                    lf2.q.getClass();
                    l46Var.j0();
                    long j118 = j11;
                    z9 = l46Var.S;
                    ov7Var = LayoutNode.h1;
                    if (z9) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2Var = hj6.z;
                    long j119 = j12;
                    dec.l(he2Var, l46Var, t7cVarA111);
                    he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM11113);
                    Integer numValueOf8 = Integer.valueOf(iHashCode11113);
                    he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf8);
                    dec.k(l46Var);
                    he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ11113);
                    d31Var = d31.a;
                    v7cVar = v7c.a;
                    if (z6) {
                        l46Var.f0(1697589941);
                        j09 j09VarA11111 = v7cVar.a(g09Var2, 1.0f, true);
                        fillElement = androidx.compose.foundation.layout.b.b;
                        j09 j09VarD1113 = j09VarA11111.D(fillElement);
                        t7c t7cVarA112 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                        int iHashCode11114 = Long.hashCode(l46Var.T);
                        u8a u8aVarM11114 = l46Var.m();
                        j09 j09VarJ11114 = m93.J(l46Var, j09VarD1113);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, t7cVarA112);
                        dec.l(he2Var2, l46Var, u8aVarM11114);
                        ib8.s(iHashCode11114, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ11114);
                        if (z8) {
                            l46Var.f0(1422951589);
                            j09 j09VarD1114 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                            xn8 xn8VarC112 = s21.c(lx0Var, false);
                            int iHashCode11115 = Long.hashCode(l46Var.T);
                            u8a u8aVarM11115 = l46Var.m();
                            j09 j09VarJ11115 = m93.J(l46Var, j09VarD1114);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, xn8VarC112);
                            dec.l(he2Var2, l46Var, u8aVarM11115);
                            ib8.s(iHashCode11115, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ11115);
                            dd2Var.m(d31Var, l46Var, 54);
                            l46Var.r(true);
                            o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1423207401);
                            o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                            l46Var.r(false);
                        }
                        if (z6) {
                            l46Var.f0(1423311716);
                            j09 j09VarA11112 = v7cVar.a(g09Var2, 1.0f, true);
                            mue mueVar118 = pue.a;
                            mue mueVarQ15 = pue.q(l46Var);
                            nte.b(str, j09VarA11112, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ15, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                            z10 = false;
                            l46Var.r(false);
                        } else {
                            pr4 pr4Var16 = pr4Var2;
                            l46Var.f0(1423728945);
                            j09 j09VarA11113 = v7cVar.a(g09Var2, 1.0f, true);
                            mue mueVar119 = pue.a;
                            vd0.e(str, j09VarA11113, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var16)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                            z10 = false;
                            l46Var.r(false);
                        }
                        l46Var.r(true);
                        l46Var.r(z10);
                        fillElement2 = fillElement;
                    } else {
                        l46Var.f0(1697589941);
                        j09 j09VarA11114 = v7cVar.a(g09Var2, 1.0f, true);
                        fillElement = androidx.compose.foundation.layout.b.b;
                        j09 j09VarD1115 = j09VarA11114.D(fillElement);
                        t7c t7cVarA113 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                        int iHashCode11116 = Long.hashCode(l46Var.T);
                        u8a u8aVarM11116 = l46Var.m();
                        j09 j09VarJ11116 = m93.J(l46Var, j09VarD1115);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, t7cVarA113);
                        dec.l(he2Var2, l46Var, u8aVarM11116);
                        ib8.s(iHashCode11116, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ11116);
                        if (z8) {
                            l46Var.f0(1422951589);
                            j09 j09VarD1116 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                            xn8 xn8VarC113 = s21.c(lx0Var, false);
                            int iHashCode11117 = Long.hashCode(l46Var.T);
                            u8a u8aVarM11117 = l46Var.m();
                            j09 j09VarJ11117 = m93.J(l46Var, j09VarD1116);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, xn8VarC113);
                            dec.l(he2Var2, l46Var, u8aVarM11117);
                            ib8.s(iHashCode11117, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ11117);
                            dd2Var.m(d31Var, l46Var, 54);
                            l46Var.r(true);
                            o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1423207401);
                            o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                            l46Var.r(false);
                        }
                        if (z6) {
                            l46Var.f0(1423311716);
                            j09 j09VarA11115 = v7cVar.a(g09Var2, 1.0f, true);
                            mue mueVar1110 = pue.a;
                            mue mueVarQ16 = pue.q(l46Var);
                            nte.b(str, j09VarA11115, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ16, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                            z10 = false;
                            l46Var.r(false);
                        } else {
                            pr4 pr4Var17 = pr4Var2;
                            l46Var.f0(1423728945);
                            j09 j09VarA11116 = v7cVar.a(g09Var2, 1.0f, true);
                            mue mueVar1111 = pue.a;
                            vd0.e(str, j09VarA11116, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var17)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                            z10 = false;
                            l46Var.r(false);
                        }
                        l46Var.r(true);
                        l46Var.r(z10);
                        fillElement2 = fillElement;
                    }
                    j09 j09VarD1117 = ynb.d0(0.0f, 0.0f, 12.0f, 0.0f, 11, androidx.compose.foundation.layout.b.p(g09Var2, 28.0f).D(fillElement2));
                    xn8 xn8VarC114 = s21.c(ndb.g, false);
                    int iHashCode11118 = Long.hashCode(l46Var.T);
                    u8a u8aVarM11118 = l46Var.m();
                    j09 j09VarJ11118 = m93.J(l46Var, j09VarD1117);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, xn8VarC114);
                    dec.l(he2Var2, l46Var, u8aVarM11118);
                    ib8.s(iHashCode11118, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ11118);
                    i(0, 1, l46Var, null);
                    l46Var.r(true);
                    l46Var.r(true);
                    j6 = j118;
                    j7 = j119;
                    z4 = z6;
                    z5 = z7;
                    j8 = j13;
                    num2 = num4;
                } else {
                    l46Var.Z();
                    z4 = z;
                    z5 = z2;
                    j6 = j4;
                    j7 = j5;
                    j8 = j3;
                    num2 = num;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: ao6
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i2 | 1);
                            no6.k(ii6Var, j6, j7, j8, num2, str, x16Var, j09Var, z4, z5, dd2Var, (l46) obj, iP, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 48;
            j4 = j;
            if ((i2 & 384) == 0) {
                if ((i3 & 4) == 0) {
                    j5 = j2;
                    if (l46Var.f(j5)) {
                        i15 = 256;
                    }
                    i4 |= i15;
                } else {
                    j5 = j2;
                }
                i15 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                i4 |= i15;
            } else {
                j5 = j2;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                } else {
                    i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i4 |= i14;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    if (l46Var.g(num)) {
                        i6 = 16384;
                    } else {
                        i6 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i6;
                }
                if ((i2 & 196608) == 0) {
                    if (l46Var.g(str)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i4 |= i13;
                }
                if ((i2 & 1572864) == 0) {
                    if (l46Var.i(x16Var)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i4 |= i12;
                }
                if ((i2 & 12582912) == 0) {
                    if (l46Var.g(j09Var)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i4 |= i11;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    if ((100663296 & i2) == 0) {
                        if (l46Var.h(z)) {
                            i8 = 67108864;
                        } else {
                            i8 = 33554432;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 512;
                    if (i9 != 0) {
                        if ((i2 & 805306368) == 0) {
                            if (l46Var.h(z2)) {
                                i10 = 536870912;
                            } else {
                                i10 = 268435456;
                            }
                            i4 |= i10;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (l46Var.W(i4 & 1, z3)) {
                            l46Var.b0();
                            if ((i2 & 1) != 0) {
                                if (i16 != 0) {
                                    j9 = y72.j;
                                } else {
                                    j9 = j4;
                                }
                                if ((i3 & 4) != 0) {
                                    j10 = ((e8b) l46Var.k(l8b.a)).f;
                                    i4 &= -897;
                                } else {
                                    j10 = j5;
                                }
                                if ((i3 & 8) != 0) {
                                    jW = w(l46Var);
                                    i4 &= -7169;
                                } else {
                                    jW = j3;
                                }
                                if (i5 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i7 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z;
                                }
                                if (i9 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z2;
                                }
                                num4 = num3;
                            } else {
                                if (i16 != 0) {
                                    j9 = y72.j;
                                } else {
                                    j9 = j4;
                                }
                                if ((i3 & 4) != 0) {
                                    j10 = ((e8b) l46Var.k(l8b.a)).f;
                                    i4 &= -897;
                                } else {
                                    j10 = j5;
                                }
                                if ((i3 & 8) != 0) {
                                    jW = w(l46Var);
                                    i4 &= -7169;
                                } else {
                                    jW = j3;
                                }
                                if (i5 != 0) {
                                    num3 = null;
                                } else {
                                    num3 = num;
                                }
                                if (i7 != 0) {
                                    z6 = false;
                                } else {
                                    z6 = z;
                                }
                                if (i9 != 0) {
                                    z7 = false;
                                } else {
                                    z7 = z2;
                                }
                                num4 = num3;
                            }
                            l46Var.s();
                            pr4Var = l8b.a;
                            zF = k8b.f((e8b) l46Var.k(pr4Var));
                            if (((sw3) l46Var.k(zg2.h)).h0() < 1.5f) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (zF) {
                                f2 = 0.0f;
                            } else {
                                f2 = 20.0f;
                            }
                            y6cVarB = a7c.b(f2);
                            g09Var = g09.a;
                            if (zF) {
                                l46Var.f0(-714160456);
                                j09 j09VarO9 = tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var.k(pr4Var)).a, g21.f);
                                if (z7) {
                                    j09VarT = b21.t(g09Var, new uc2(5, 1.0f));
                                } else {
                                    j09VarT = g09Var;
                                }
                                j09VarU = j09VarO9.D(j09VarT);
                                l46Var.r(false);
                                j11 = j9;
                                j12 = j10;
                                g09Var2 = g09Var;
                                j13 = jW;
                                pr4Var2 = pr4Var;
                            } else {
                                l46Var.f0(-713989956);
                                g09Var2 = g09Var;
                                j11 = j9;
                                j12 = j10;
                                j13 = jW;
                                pr4Var2 = pr4Var;
                                j09VarU = u(y6cVarB, ii6Var, j11, j12, j13, num4, l46Var, 64);
                                l46Var.r(false);
                            }
                            j09 j09VarC9 = androidx.compose.foundation.b.c(j09Var.D(j09VarU), false, null, null, x16Var, 15);
                            kx0Var = ndb.z;
                            rc0Var = xc0.a;
                            t7c t7cVarA114 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                            int iHashCode11119 = Long.hashCode(l46Var.T);
                            u8a u8aVarM11119 = l46Var.m();
                            j09 j09VarJ11119 = m93.J(l46Var, j09VarC9);
                            lf2.q.getClass();
                            l46Var.j0();
                            long j1110 = j11;
                            z9 = l46Var.S;
                            ov7Var = LayoutNode.h1;
                            if (z9) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            he2Var = hj6.z;
                            long j1111 = j12;
                            dec.l(he2Var, l46Var, t7cVarA114);
                            he2Var2 = hj6.y;
                            dec.l(he2Var2, l46Var, u8aVarM11119);
                            Integer numValueOf9 = Integer.valueOf(iHashCode11119);
                            he2Var3 = hj6.X;
                            dec.l(he2Var3, l46Var, numValueOf9);
                            dec.k(l46Var);
                            he2Var4 = hj6.x;
                            dec.l(he2Var4, l46Var, j09VarJ11119);
                            d31Var = d31.a;
                            v7cVar = v7c.a;
                            if (z6) {
                                l46Var.f0(1697589941);
                                j09 j09VarA11117 = v7cVar.a(g09Var2, 1.0f, true);
                                fillElement = androidx.compose.foundation.layout.b.b;
                                j09 j09VarD1118 = j09VarA11117.D(fillElement);
                                t7c t7cVarA115 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                                int iHashCode111110 = Long.hashCode(l46Var.T);
                                u8a u8aVarM111110 = l46Var.m();
                                j09 j09VarJ111110 = m93.J(l46Var, j09VarD1118);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, t7cVarA115);
                                dec.l(he2Var2, l46Var, u8aVarM111110);
                                ib8.s(iHashCode111110, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ111110);
                                if (z8) {
                                    l46Var.f0(1422951589);
                                    j09 j09VarD1119 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                    xn8 xn8VarC115 = s21.c(lx0Var, false);
                                    int iHashCode111111 = Long.hashCode(l46Var.T);
                                    u8a u8aVarM111111 = l46Var.m();
                                    j09 j09VarJ111111 = m93.J(l46Var, j09VarD1119);
                                    l46Var.j0();
                                    if (l46Var.S) {
                                        l46Var.l(ov7Var);
                                    } else {
                                        l46Var.s0();
                                    }
                                    dec.l(he2Var, l46Var, xn8VarC115);
                                    dec.l(he2Var2, l46Var, u8aVarM111111);
                                    ib8.s(iHashCode111111, l46Var, he2Var3, l46Var);
                                    dec.l(he2Var4, l46Var, j09VarJ111111);
                                    dd2Var.m(d31Var, l46Var, 54);
                                    l46Var.r(true);
                                    o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(1423207401);
                                    o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                    l46Var.r(false);
                                }
                                if (z6) {
                                    l46Var.f0(1423311716);
                                    j09 j09VarA11118 = v7cVar.a(g09Var2, 1.0f, true);
                                    mue mueVar1112 = pue.a;
                                    mue mueVarQ17 = pue.q(l46Var);
                                    nte.b(str, j09VarA11118, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ17, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                    z10 = false;
                                    l46Var.r(false);
                                } else {
                                    pr4 pr4Var18 = pr4Var2;
                                    l46Var.f0(1423728945);
                                    j09 j09VarA11119 = v7cVar.a(g09Var2, 1.0f, true);
                                    mue mueVar1113 = pue.a;
                                    vd0.e(str, j09VarA11119, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var18)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                    z10 = false;
                                    l46Var.r(false);
                                }
                                l46Var.r(true);
                                l46Var.r(z10);
                                fillElement2 = fillElement;
                            } else {
                                l46Var.f0(1697589941);
                                j09 j09VarA111110 = v7cVar.a(g09Var2, 1.0f, true);
                                fillElement = androidx.compose.foundation.layout.b.b;
                                j09 j09VarD11110 = j09VarA111110.D(fillElement);
                                t7c t7cVarA116 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                                int iHashCode111112 = Long.hashCode(l46Var.T);
                                u8a u8aVarM111112 = l46Var.m();
                                j09 j09VarJ111112 = m93.J(l46Var, j09VarD11110);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, t7cVarA116);
                                dec.l(he2Var2, l46Var, u8aVarM111112);
                                ib8.s(iHashCode111112, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ111112);
                                if (z8) {
                                    l46Var.f0(1422951589);
                                    j09 j09VarD11111 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                    xn8 xn8VarC116 = s21.c(lx0Var, false);
                                    int iHashCode111113 = Long.hashCode(l46Var.T);
                                    u8a u8aVarM111113 = l46Var.m();
                                    j09 j09VarJ111113 = m93.J(l46Var, j09VarD11111);
                                    l46Var.j0();
                                    if (l46Var.S) {
                                        l46Var.l(ov7Var);
                                    } else {
                                        l46Var.s0();
                                    }
                                    dec.l(he2Var, l46Var, xn8VarC116);
                                    dec.l(he2Var2, l46Var, u8aVarM111113);
                                    ib8.s(iHashCode111113, l46Var, he2Var3, l46Var);
                                    dec.l(he2Var4, l46Var, j09VarJ111113);
                                    dd2Var.m(d31Var, l46Var, 54);
                                    l46Var.r(true);
                                    o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(1423207401);
                                    o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                    l46Var.r(false);
                                }
                                if (z6) {
                                    l46Var.f0(1423311716);
                                    j09 j09VarA111111 = v7cVar.a(g09Var2, 1.0f, true);
                                    mue mueVar1114 = pue.a;
                                    mue mueVarQ18 = pue.q(l46Var);
                                    nte.b(str, j09VarA111111, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ18, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                    z10 = false;
                                    l46Var.r(false);
                                } else {
                                    pr4 pr4Var19 = pr4Var2;
                                    l46Var.f0(1423728945);
                                    j09 j09VarA111112 = v7cVar.a(g09Var2, 1.0f, true);
                                    mue mueVar1115 = pue.a;
                                    vd0.e(str, j09VarA111112, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var19)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                    z10 = false;
                                    l46Var.r(false);
                                }
                                l46Var.r(true);
                                l46Var.r(z10);
                                fillElement2 = fillElement;
                            }
                            j09 j09VarD11112 = ynb.d0(0.0f, 0.0f, 12.0f, 0.0f, 11, androidx.compose.foundation.layout.b.p(g09Var2, 28.0f).D(fillElement2));
                            xn8 xn8VarC117 = s21.c(ndb.g, false);
                            int iHashCode111114 = Long.hashCode(l46Var.T);
                            u8a u8aVarM111114 = l46Var.m();
                            j09 j09VarJ111114 = m93.J(l46Var, j09VarD11112);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, xn8VarC117);
                            dec.l(he2Var2, l46Var, u8aVarM111114);
                            ib8.s(iHashCode111114, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ111114);
                            i(0, 1, l46Var, null);
                            l46Var.r(true);
                            l46Var.r(true);
                            j6 = j1110;
                            j7 = j1111;
                            z4 = z6;
                            z5 = z7;
                            j8 = j13;
                            num2 = num4;
                        } else {
                            l46Var.Z();
                            z4 = z;
                            z5 = z2;
                            j6 = j4;
                            j7 = j5;
                            j8 = j3;
                            num2 = num;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new l26() { // from class: ao6
                                @Override // defpackage.l26
                                public final Object z(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i2 | 1);
                                    no6.k(ii6Var, j6, j7, j8, num2, str, x16Var, j09Var, z4, z5, dd2Var, (l46) obj, iP, i3);
                                    return wef.a;
                                }
                            };
                        }
                    }
                    i4 |= 805306368;
                    if ((i4 & 306783379) == 306783378) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i4 & 1, z3)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i16 != 0) {
                                j9 = y72.j;
                            } else {
                                j9 = j4;
                            }
                            if ((i3 & 4) != 0) {
                                j10 = ((e8b) l46Var.k(l8b.a)).f;
                                i4 &= -897;
                            } else {
                                j10 = j5;
                            }
                            if ((i3 & 8) != 0) {
                                jW = w(l46Var);
                                i4 &= -7169;
                            } else {
                                jW = j3;
                            }
                            if (i5 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i7 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i9 != 0) {
                                z7 = false;
                            } else {
                                z7 = z2;
                            }
                            num4 = num3;
                        } else {
                            if (i16 != 0) {
                                j9 = y72.j;
                            } else {
                                j9 = j4;
                            }
                            if ((i3 & 4) != 0) {
                                j10 = ((e8b) l46Var.k(l8b.a)).f;
                                i4 &= -897;
                            } else {
                                j10 = j5;
                            }
                            if ((i3 & 8) != 0) {
                                jW = w(l46Var);
                                i4 &= -7169;
                            } else {
                                jW = j3;
                            }
                            if (i5 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i7 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i9 != 0) {
                                z7 = false;
                            } else {
                                z7 = z2;
                            }
                            num4 = num3;
                        }
                        l46Var.s();
                        pr4Var = l8b.a;
                        zF = k8b.f((e8b) l46Var.k(pr4Var));
                        if (((sw3) l46Var.k(zg2.h)).h0() < 1.5f) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (zF) {
                            f2 = 0.0f;
                        } else {
                            f2 = 20.0f;
                        }
                        y6cVarB = a7c.b(f2);
                        g09Var = g09.a;
                        if (zF) {
                            l46Var.f0(-714160456);
                            j09 j09VarO10 = tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var.k(pr4Var)).a, g21.f);
                            if (z7) {
                                j09VarT = b21.t(g09Var, new uc2(5, 1.0f));
                            } else {
                                j09VarT = g09Var;
                            }
                            j09VarU = j09VarO10.D(j09VarT);
                            l46Var.r(false);
                            j11 = j9;
                            j12 = j10;
                            g09Var2 = g09Var;
                            j13 = jW;
                            pr4Var2 = pr4Var;
                        } else {
                            l46Var.f0(-713989956);
                            g09Var2 = g09Var;
                            j11 = j9;
                            j12 = j10;
                            j13 = jW;
                            pr4Var2 = pr4Var;
                            j09VarU = u(y6cVarB, ii6Var, j11, j12, j13, num4, l46Var, 64);
                            l46Var.r(false);
                        }
                        j09 j09VarC10 = androidx.compose.foundation.b.c(j09Var.D(j09VarU), false, null, null, x16Var, 15);
                        kx0Var = ndb.z;
                        rc0Var = xc0.a;
                        t7c t7cVarA117 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                        int iHashCode111115 = Long.hashCode(l46Var.T);
                        u8a u8aVarM111115 = l46Var.m();
                        j09 j09VarJ111115 = m93.J(l46Var, j09VarC10);
                        lf2.q.getClass();
                        l46Var.j0();
                        long j1112 = j11;
                        z9 = l46Var.S;
                        ov7Var = LayoutNode.h1;
                        if (z9) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        he2Var = hj6.z;
                        long j1113 = j12;
                        dec.l(he2Var, l46Var, t7cVarA117);
                        he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var, u8aVarM111115);
                        Integer numValueOf10 = Integer.valueOf(iHashCode111115);
                        he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var, numValueOf10);
                        dec.k(l46Var);
                        he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var, j09VarJ111115);
                        d31Var = d31.a;
                        v7cVar = v7c.a;
                        if (z6) {
                            l46Var.f0(1697589941);
                            j09 j09VarA111113 = v7cVar.a(g09Var2, 1.0f, true);
                            fillElement = androidx.compose.foundation.layout.b.b;
                            j09 j09VarD11113 = j09VarA111113.D(fillElement);
                            t7c t7cVarA118 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                            int iHashCode111116 = Long.hashCode(l46Var.T);
                            u8a u8aVarM111116 = l46Var.m();
                            j09 j09VarJ111116 = m93.J(l46Var, j09VarD11113);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, t7cVarA118);
                            dec.l(he2Var2, l46Var, u8aVarM111116);
                            ib8.s(iHashCode111116, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ111116);
                            if (z8) {
                                l46Var.f0(1422951589);
                                j09 j09VarD11114 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                xn8 xn8VarC118 = s21.c(lx0Var, false);
                                int iHashCode111117 = Long.hashCode(l46Var.T);
                                u8a u8aVarM111117 = l46Var.m();
                                j09 j09VarJ111117 = m93.J(l46Var, j09VarD11114);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, xn8VarC118);
                                dec.l(he2Var2, l46Var, u8aVarM111117);
                                ib8.s(iHashCode111117, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ111117);
                                dd2Var.m(d31Var, l46Var, 54);
                                l46Var.r(true);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                l46Var.r(false);
                            } else {
                                l46Var.f0(1423207401);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                l46Var.r(false);
                            }
                            if (z6) {
                                l46Var.f0(1423311716);
                                j09 j09VarA111114 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar1116 = pue.a;
                                mue mueVarQ19 = pue.q(l46Var);
                                nte.b(str, j09VarA111114, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ19, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                z10 = false;
                                l46Var.r(false);
                            } else {
                                pr4 pr4Var110 = pr4Var2;
                                l46Var.f0(1423728945);
                                j09 j09VarA111115 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar1117 = pue.a;
                                vd0.e(str, j09VarA111115, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var110)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                z10 = false;
                                l46Var.r(false);
                            }
                            l46Var.r(true);
                            l46Var.r(z10);
                            fillElement2 = fillElement;
                        } else {
                            l46Var.f0(1697589941);
                            j09 j09VarA111116 = v7cVar.a(g09Var2, 1.0f, true);
                            fillElement = androidx.compose.foundation.layout.b.b;
                            j09 j09VarD11115 = j09VarA111116.D(fillElement);
                            t7c t7cVarA119 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                            int iHashCode111118 = Long.hashCode(l46Var.T);
                            u8a u8aVarM111118 = l46Var.m();
                            j09 j09VarJ111118 = m93.J(l46Var, j09VarD11115);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, t7cVarA119);
                            dec.l(he2Var2, l46Var, u8aVarM111118);
                            ib8.s(iHashCode111118, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ111118);
                            if (z8) {
                                l46Var.f0(1422951589);
                                j09 j09VarD11116 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                xn8 xn8VarC119 = s21.c(lx0Var, false);
                                int iHashCode111119 = Long.hashCode(l46Var.T);
                                u8a u8aVarM111119 = l46Var.m();
                                j09 j09VarJ111119 = m93.J(l46Var, j09VarD11116);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, xn8VarC119);
                                dec.l(he2Var2, l46Var, u8aVarM111119);
                                ib8.s(iHashCode111119, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ111119);
                                dd2Var.m(d31Var, l46Var, 54);
                                l46Var.r(true);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                l46Var.r(false);
                            } else {
                                l46Var.f0(1423207401);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                l46Var.r(false);
                            }
                            if (z6) {
                                l46Var.f0(1423311716);
                                j09 j09VarA111117 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar1118 = pue.a;
                                mue mueVarQ110 = pue.q(l46Var);
                                nte.b(str, j09VarA111117, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ110, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                z10 = false;
                                l46Var.r(false);
                            } else {
                                pr4 pr4Var111 = pr4Var2;
                                l46Var.f0(1423728945);
                                j09 j09VarA111118 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar1119 = pue.a;
                                vd0.e(str, j09VarA111118, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var111)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                z10 = false;
                                l46Var.r(false);
                            }
                            l46Var.r(true);
                            l46Var.r(z10);
                            fillElement2 = fillElement;
                        }
                        j09 j09VarD11117 = ynb.d0(0.0f, 0.0f, 12.0f, 0.0f, 11, androidx.compose.foundation.layout.b.p(g09Var2, 28.0f).D(fillElement2));
                        xn8 xn8VarC1110 = s21.c(ndb.g, false);
                        int iHashCode1111110 = Long.hashCode(l46Var.T);
                        u8a u8aVarM1111110 = l46Var.m();
                        j09 j09VarJ1111110 = m93.J(l46Var, j09VarD11117);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, xn8VarC1110);
                        dec.l(he2Var2, l46Var, u8aVarM1111110);
                        ib8.s(iHashCode1111110, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ1111110);
                        i(0, 1, l46Var, null);
                        l46Var.r(true);
                        l46Var.r(true);
                        j6 = j1112;
                        j7 = j1113;
                        z4 = z6;
                        z5 = z7;
                        j8 = j13;
                        num2 = num4;
                    } else {
                        l46Var.Z();
                        z4 = z;
                        z5 = z2;
                        j6 = j4;
                        j7 = j5;
                        j8 = j3;
                        num2 = num;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: ao6
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i2 | 1);
                                no6.k(ii6Var, j6, j7, j8, num2, str, x16Var, j09Var, z4, z5, dd2Var, (l46) obj, iP, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i4 |= 100663296;
                i9 = i3 & 512;
                if (i9 != 0) {
                    if ((i2 & 805306368) == 0) {
                        if (l46Var.h(z2)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i4 |= i10;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i4 & 1, z3)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i16 != 0) {
                                j9 = y72.j;
                            } else {
                                j9 = j4;
                            }
                            if ((i3 & 4) != 0) {
                                j10 = ((e8b) l46Var.k(l8b.a)).f;
                                i4 &= -897;
                            } else {
                                j10 = j5;
                            }
                            if ((i3 & 8) != 0) {
                                jW = w(l46Var);
                                i4 &= -7169;
                            } else {
                                jW = j3;
                            }
                            if (i5 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i7 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i9 != 0) {
                                z7 = false;
                            } else {
                                z7 = z2;
                            }
                            num4 = num3;
                        } else {
                            if (i16 != 0) {
                                j9 = y72.j;
                            } else {
                                j9 = j4;
                            }
                            if ((i3 & 4) != 0) {
                                j10 = ((e8b) l46Var.k(l8b.a)).f;
                                i4 &= -897;
                            } else {
                                j10 = j5;
                            }
                            if ((i3 & 8) != 0) {
                                jW = w(l46Var);
                                i4 &= -7169;
                            } else {
                                jW = j3;
                            }
                            if (i5 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i7 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i9 != 0) {
                                z7 = false;
                            } else {
                                z7 = z2;
                            }
                            num4 = num3;
                        }
                        l46Var.s();
                        pr4Var = l8b.a;
                        zF = k8b.f((e8b) l46Var.k(pr4Var));
                        if (((sw3) l46Var.k(zg2.h)).h0() < 1.5f) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (zF) {
                            f2 = 0.0f;
                        } else {
                            f2 = 20.0f;
                        }
                        y6cVarB = a7c.b(f2);
                        g09Var = g09.a;
                        if (zF) {
                            l46Var.f0(-714160456);
                            j09 j09VarO11 = tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var.k(pr4Var)).a, g21.f);
                            if (z7) {
                                j09VarT = b21.t(g09Var, new uc2(5, 1.0f));
                            } else {
                                j09VarT = g09Var;
                            }
                            j09VarU = j09VarO11.D(j09VarT);
                            l46Var.r(false);
                            j11 = j9;
                            j12 = j10;
                            g09Var2 = g09Var;
                            j13 = jW;
                            pr4Var2 = pr4Var;
                        } else {
                            l46Var.f0(-713989956);
                            g09Var2 = g09Var;
                            j11 = j9;
                            j12 = j10;
                            j13 = jW;
                            pr4Var2 = pr4Var;
                            j09VarU = u(y6cVarB, ii6Var, j11, j12, j13, num4, l46Var, 64);
                            l46Var.r(false);
                        }
                        j09 j09VarC11 = androidx.compose.foundation.b.c(j09Var.D(j09VarU), false, null, null, x16Var, 15);
                        kx0Var = ndb.z;
                        rc0Var = xc0.a;
                        t7c t7cVarA1110 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                        int iHashCode1111111 = Long.hashCode(l46Var.T);
                        u8a u8aVarM1111111 = l46Var.m();
                        j09 j09VarJ1111111 = m93.J(l46Var, j09VarC11);
                        lf2.q.getClass();
                        l46Var.j0();
                        long j1114 = j11;
                        z9 = l46Var.S;
                        ov7Var = LayoutNode.h1;
                        if (z9) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        he2Var = hj6.z;
                        long j1115 = j12;
                        dec.l(he2Var, l46Var, t7cVarA1110);
                        he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var, u8aVarM1111111);
                        Integer numValueOf11 = Integer.valueOf(iHashCode1111111);
                        he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var, numValueOf11);
                        dec.k(l46Var);
                        he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var, j09VarJ1111111);
                        d31Var = d31.a;
                        v7cVar = v7c.a;
                        if (z6) {
                            l46Var.f0(1697589941);
                            j09 j09VarA111119 = v7cVar.a(g09Var2, 1.0f, true);
                            fillElement = androidx.compose.foundation.layout.b.b;
                            j09 j09VarD11118 = j09VarA111119.D(fillElement);
                            t7c t7cVarA1111 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                            int iHashCode1111112 = Long.hashCode(l46Var.T);
                            u8a u8aVarM1111112 = l46Var.m();
                            j09 j09VarJ1111112 = m93.J(l46Var, j09VarD11118);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, t7cVarA1111);
                            dec.l(he2Var2, l46Var, u8aVarM1111112);
                            ib8.s(iHashCode1111112, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ1111112);
                            if (z8) {
                                l46Var.f0(1422951589);
                                j09 j09VarD11119 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                xn8 xn8VarC1111 = s21.c(lx0Var, false);
                                int iHashCode1111113 = Long.hashCode(l46Var.T);
                                u8a u8aVarM1111113 = l46Var.m();
                                j09 j09VarJ1111113 = m93.J(l46Var, j09VarD11119);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, xn8VarC1111);
                                dec.l(he2Var2, l46Var, u8aVarM1111113);
                                ib8.s(iHashCode1111113, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ1111113);
                                dd2Var.m(d31Var, l46Var, 54);
                                l46Var.r(true);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                l46Var.r(false);
                            } else {
                                l46Var.f0(1423207401);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                l46Var.r(false);
                            }
                            if (z6) {
                                l46Var.f0(1423311716);
                                j09 j09VarA1111110 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar11110 = pue.a;
                                mue mueVarQ111 = pue.q(l46Var);
                                nte.b(str, j09VarA1111110, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ111, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                z10 = false;
                                l46Var.r(false);
                            } else {
                                pr4 pr4Var112 = pr4Var2;
                                l46Var.f0(1423728945);
                                j09 j09VarA1111111 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar11111 = pue.a;
                                vd0.e(str, j09VarA1111111, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var112)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                z10 = false;
                                l46Var.r(false);
                            }
                            l46Var.r(true);
                            l46Var.r(z10);
                            fillElement2 = fillElement;
                        } else {
                            l46Var.f0(1697589941);
                            j09 j09VarA1111112 = v7cVar.a(g09Var2, 1.0f, true);
                            fillElement = androidx.compose.foundation.layout.b.b;
                            j09 j09VarD111110 = j09VarA1111112.D(fillElement);
                            t7c t7cVarA1112 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                            int iHashCode1111114 = Long.hashCode(l46Var.T);
                            u8a u8aVarM1111114 = l46Var.m();
                            j09 j09VarJ1111114 = m93.J(l46Var, j09VarD111110);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, t7cVarA1112);
                            dec.l(he2Var2, l46Var, u8aVarM1111114);
                            ib8.s(iHashCode1111114, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ1111114);
                            if (z8) {
                                l46Var.f0(1422951589);
                                j09 j09VarD111111 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                xn8 xn8VarC1112 = s21.c(lx0Var, false);
                                int iHashCode1111115 = Long.hashCode(l46Var.T);
                                u8a u8aVarM1111115 = l46Var.m();
                                j09 j09VarJ1111115 = m93.J(l46Var, j09VarD111111);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, xn8VarC1112);
                                dec.l(he2Var2, l46Var, u8aVarM1111115);
                                ib8.s(iHashCode1111115, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ1111115);
                                dd2Var.m(d31Var, l46Var, 54);
                                l46Var.r(true);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                l46Var.r(false);
                            } else {
                                l46Var.f0(1423207401);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                l46Var.r(false);
                            }
                            if (z6) {
                                l46Var.f0(1423311716);
                                j09 j09VarA1111113 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar11112 = pue.a;
                                mue mueVarQ112 = pue.q(l46Var);
                                nte.b(str, j09VarA1111113, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ112, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                z10 = false;
                                l46Var.r(false);
                            } else {
                                pr4 pr4Var113 = pr4Var2;
                                l46Var.f0(1423728945);
                                j09 j09VarA1111114 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar11113 = pue.a;
                                vd0.e(str, j09VarA1111114, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var113)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                z10 = false;
                                l46Var.r(false);
                            }
                            l46Var.r(true);
                            l46Var.r(z10);
                            fillElement2 = fillElement;
                        }
                        j09 j09VarD111112 = ynb.d0(0.0f, 0.0f, 12.0f, 0.0f, 11, androidx.compose.foundation.layout.b.p(g09Var2, 28.0f).D(fillElement2));
                        xn8 xn8VarC1113 = s21.c(ndb.g, false);
                        int iHashCode1111116 = Long.hashCode(l46Var.T);
                        u8a u8aVarM1111116 = l46Var.m();
                        j09 j09VarJ1111116 = m93.J(l46Var, j09VarD111112);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, xn8VarC1113);
                        dec.l(he2Var2, l46Var, u8aVarM1111116);
                        ib8.s(iHashCode1111116, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ1111116);
                        i(0, 1, l46Var, null);
                        l46Var.r(true);
                        l46Var.r(true);
                        j6 = j1114;
                        j7 = j1115;
                        z4 = z6;
                        z5 = z7;
                        j8 = j13;
                        num2 = num4;
                    } else {
                        l46Var.Z();
                        z4 = z;
                        z5 = z2;
                        j6 = j4;
                        j7 = j5;
                        j8 = j3;
                        num2 = num;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: ao6
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i2 | 1);
                                no6.k(ii6Var, j6, j7, j8, num2, str, x16Var, j09Var, z4, z5, dd2Var, (l46) obj, iP, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i4 |= 805306368;
                if ((i4 & 306783379) == 306783378) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i4 & 1, z3)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            j9 = y72.j;
                        } else {
                            j9 = j4;
                        }
                        if ((i3 & 4) != 0) {
                            j10 = ((e8b) l46Var.k(l8b.a)).f;
                            i4 &= -897;
                        } else {
                            j10 = j5;
                        }
                        if ((i3 & 8) != 0) {
                            jW = w(l46Var);
                            i4 &= -7169;
                        } else {
                            jW = j3;
                        }
                        if (i5 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i9 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        num4 = num3;
                    } else {
                        if (i16 != 0) {
                            j9 = y72.j;
                        } else {
                            j9 = j4;
                        }
                        if ((i3 & 4) != 0) {
                            j10 = ((e8b) l46Var.k(l8b.a)).f;
                            i4 &= -897;
                        } else {
                            j10 = j5;
                        }
                        if ((i3 & 8) != 0) {
                            jW = w(l46Var);
                            i4 &= -7169;
                        } else {
                            jW = j3;
                        }
                        if (i5 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i9 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        num4 = num3;
                    }
                    l46Var.s();
                    pr4Var = l8b.a;
                    zF = k8b.f((e8b) l46Var.k(pr4Var));
                    if (((sw3) l46Var.k(zg2.h)).h0() < 1.5f) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (zF) {
                        f2 = 0.0f;
                    } else {
                        f2 = 20.0f;
                    }
                    y6cVarB = a7c.b(f2);
                    g09Var = g09.a;
                    if (zF) {
                        l46Var.f0(-714160456);
                        j09 j09VarO12 = tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var.k(pr4Var)).a, g21.f);
                        if (z7) {
                            j09VarT = b21.t(g09Var, new uc2(5, 1.0f));
                        } else {
                            j09VarT = g09Var;
                        }
                        j09VarU = j09VarO12.D(j09VarT);
                        l46Var.r(false);
                        j11 = j9;
                        j12 = j10;
                        g09Var2 = g09Var;
                        j13 = jW;
                        pr4Var2 = pr4Var;
                    } else {
                        l46Var.f0(-713989956);
                        g09Var2 = g09Var;
                        j11 = j9;
                        j12 = j10;
                        j13 = jW;
                        pr4Var2 = pr4Var;
                        j09VarU = u(y6cVarB, ii6Var, j11, j12, j13, num4, l46Var, 64);
                        l46Var.r(false);
                    }
                    j09 j09VarC12 = androidx.compose.foundation.b.c(j09Var.D(j09VarU), false, null, null, x16Var, 15);
                    kx0Var = ndb.z;
                    rc0Var = xc0.a;
                    t7c t7cVarA1113 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                    int iHashCode1111117 = Long.hashCode(l46Var.T);
                    u8a u8aVarM1111117 = l46Var.m();
                    j09 j09VarJ1111117 = m93.J(l46Var, j09VarC12);
                    lf2.q.getClass();
                    l46Var.j0();
                    long j1116 = j11;
                    z9 = l46Var.S;
                    ov7Var = LayoutNode.h1;
                    if (z9) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2Var = hj6.z;
                    long j1117 = j12;
                    dec.l(he2Var, l46Var, t7cVarA1113);
                    he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM1111117);
                    Integer numValueOf12 = Integer.valueOf(iHashCode1111117);
                    he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf12);
                    dec.k(l46Var);
                    he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ1111117);
                    d31Var = d31.a;
                    v7cVar = v7c.a;
                    if (z6) {
                        l46Var.f0(1697589941);
                        j09 j09VarA1111115 = v7cVar.a(g09Var2, 1.0f, true);
                        fillElement = androidx.compose.foundation.layout.b.b;
                        j09 j09VarD111113 = j09VarA1111115.D(fillElement);
                        t7c t7cVarA1114 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                        int iHashCode1111118 = Long.hashCode(l46Var.T);
                        u8a u8aVarM1111118 = l46Var.m();
                        j09 j09VarJ1111118 = m93.J(l46Var, j09VarD111113);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, t7cVarA1114);
                        dec.l(he2Var2, l46Var, u8aVarM1111118);
                        ib8.s(iHashCode1111118, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ1111118);
                        if (z8) {
                            l46Var.f0(1422951589);
                            j09 j09VarD111114 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                            xn8 xn8VarC1114 = s21.c(lx0Var, false);
                            int iHashCode1111119 = Long.hashCode(l46Var.T);
                            u8a u8aVarM1111119 = l46Var.m();
                            j09 j09VarJ1111119 = m93.J(l46Var, j09VarD111114);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, xn8VarC1114);
                            dec.l(he2Var2, l46Var, u8aVarM1111119);
                            ib8.s(iHashCode1111119, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ1111119);
                            dd2Var.m(d31Var, l46Var, 54);
                            l46Var.r(true);
                            o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1423207401);
                            o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                            l46Var.r(false);
                        }
                        if (z6) {
                            l46Var.f0(1423311716);
                            j09 j09VarA1111116 = v7cVar.a(g09Var2, 1.0f, true);
                            mue mueVar11114 = pue.a;
                            mue mueVarQ113 = pue.q(l46Var);
                            nte.b(str, j09VarA1111116, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ113, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                            z10 = false;
                            l46Var.r(false);
                        } else {
                            pr4 pr4Var114 = pr4Var2;
                            l46Var.f0(1423728945);
                            j09 j09VarA1111117 = v7cVar.a(g09Var2, 1.0f, true);
                            mue mueVar11115 = pue.a;
                            vd0.e(str, j09VarA1111117, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var114)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                            z10 = false;
                            l46Var.r(false);
                        }
                        l46Var.r(true);
                        l46Var.r(z10);
                        fillElement2 = fillElement;
                    } else {
                        l46Var.f0(1697589941);
                        j09 j09VarA1111118 = v7cVar.a(g09Var2, 1.0f, true);
                        fillElement = androidx.compose.foundation.layout.b.b;
                        j09 j09VarD111115 = j09VarA1111118.D(fillElement);
                        t7c t7cVarA1115 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                        int iHashCode11111110 = Long.hashCode(l46Var.T);
                        u8a u8aVarM11111110 = l46Var.m();
                        j09 j09VarJ11111110 = m93.J(l46Var, j09VarD111115);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, t7cVarA1115);
                        dec.l(he2Var2, l46Var, u8aVarM11111110);
                        ib8.s(iHashCode11111110, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ11111110);
                        if (z8) {
                            l46Var.f0(1422951589);
                            j09 j09VarD111116 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                            xn8 xn8VarC1115 = s21.c(lx0Var, false);
                            int iHashCode11111111 = Long.hashCode(l46Var.T);
                            u8a u8aVarM11111111 = l46Var.m();
                            j09 j09VarJ11111111 = m93.J(l46Var, j09VarD111116);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, xn8VarC1115);
                            dec.l(he2Var2, l46Var, u8aVarM11111111);
                            ib8.s(iHashCode11111111, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ11111111);
                            dd2Var.m(d31Var, l46Var, 54);
                            l46Var.r(true);
                            o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1423207401);
                            o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                            l46Var.r(false);
                        }
                        if (z6) {
                            l46Var.f0(1423311716);
                            j09 j09VarA1111119 = v7cVar.a(g09Var2, 1.0f, true);
                            mue mueVar11116 = pue.a;
                            mue mueVarQ114 = pue.q(l46Var);
                            nte.b(str, j09VarA1111119, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ114, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                            z10 = false;
                            l46Var.r(false);
                        } else {
                            pr4 pr4Var115 = pr4Var2;
                            l46Var.f0(1423728945);
                            j09 j09VarA11111110 = v7cVar.a(g09Var2, 1.0f, true);
                            mue mueVar11117 = pue.a;
                            vd0.e(str, j09VarA11111110, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var115)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                            z10 = false;
                            l46Var.r(false);
                        }
                        l46Var.r(true);
                        l46Var.r(z10);
                        fillElement2 = fillElement;
                    }
                    j09 j09VarD111117 = ynb.d0(0.0f, 0.0f, 12.0f, 0.0f, 11, androidx.compose.foundation.layout.b.p(g09Var2, 28.0f).D(fillElement2));
                    xn8 xn8VarC1116 = s21.c(ndb.g, false);
                    int iHashCode11111112 = Long.hashCode(l46Var.T);
                    u8a u8aVarM11111112 = l46Var.m();
                    j09 j09VarJ11111112 = m93.J(l46Var, j09VarD111117);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, xn8VarC1116);
                    dec.l(he2Var2, l46Var, u8aVarM11111112);
                    ib8.s(iHashCode11111112, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ11111112);
                    i(0, 1, l46Var, null);
                    l46Var.r(true);
                    l46Var.r(true);
                    j6 = j1116;
                    j7 = j1117;
                    z4 = z6;
                    z5 = z7;
                    j8 = j13;
                    num2 = num4;
                } else {
                    l46Var.Z();
                    z4 = z;
                    z5 = z2;
                    j6 = j4;
                    j7 = j5;
                    j8 = j3;
                    num2 = num;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: ao6
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i2 | 1);
                            no6.k(ii6Var, j6, j7, j8, num2, str, x16Var, j09Var, z4, z5, dd2Var, (l46) obj, iP, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 24576;
            if ((i2 & 196608) == 0) {
                if (l46Var.g(str)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i4 |= i13;
            }
            if ((i2 & 1572864) == 0) {
                if (l46Var.i(x16Var)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i4 |= i12;
            }
            if ((i2 & 12582912) == 0) {
                if (l46Var.g(j09Var)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i4 |= i11;
            }
            i7 = i3 & 256;
            if (i7 != 0) {
                if ((100663296 & i2) == 0) {
                    if (l46Var.h(z)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    if ((i2 & 805306368) == 0) {
                        if (l46Var.h(z2)) {
                            i10 = 536870912;
                        } else {
                            i10 = 268435456;
                        }
                        i4 |= i10;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i4 & 1, z3)) {
                        l46Var.b0();
                        if ((i2 & 1) != 0) {
                            if (i16 != 0) {
                                j9 = y72.j;
                            } else {
                                j9 = j4;
                            }
                            if ((i3 & 4) != 0) {
                                j10 = ((e8b) l46Var.k(l8b.a)).f;
                                i4 &= -897;
                            } else {
                                j10 = j5;
                            }
                            if ((i3 & 8) != 0) {
                                jW = w(l46Var);
                                i4 &= -7169;
                            } else {
                                jW = j3;
                            }
                            if (i5 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i7 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i9 != 0) {
                                z7 = false;
                            } else {
                                z7 = z2;
                            }
                            num4 = num3;
                        } else {
                            if (i16 != 0) {
                                j9 = y72.j;
                            } else {
                                j9 = j4;
                            }
                            if ((i3 & 4) != 0) {
                                j10 = ((e8b) l46Var.k(l8b.a)).f;
                                i4 &= -897;
                            } else {
                                j10 = j5;
                            }
                            if ((i3 & 8) != 0) {
                                jW = w(l46Var);
                                i4 &= -7169;
                            } else {
                                jW = j3;
                            }
                            if (i5 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i7 != 0) {
                                z6 = false;
                            } else {
                                z6 = z;
                            }
                            if (i9 != 0) {
                                z7 = false;
                            } else {
                                z7 = z2;
                            }
                            num4 = num3;
                        }
                        l46Var.s();
                        pr4Var = l8b.a;
                        zF = k8b.f((e8b) l46Var.k(pr4Var));
                        if (((sw3) l46Var.k(zg2.h)).h0() < 1.5f) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (zF) {
                            f2 = 0.0f;
                        } else {
                            f2 = 20.0f;
                        }
                        y6cVarB = a7c.b(f2);
                        g09Var = g09.a;
                        if (zF) {
                            l46Var.f0(-714160456);
                            j09 j09VarO13 = tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var.k(pr4Var)).a, g21.f);
                            if (z7) {
                                j09VarT = b21.t(g09Var, new uc2(5, 1.0f));
                            } else {
                                j09VarT = g09Var;
                            }
                            j09VarU = j09VarO13.D(j09VarT);
                            l46Var.r(false);
                            j11 = j9;
                            j12 = j10;
                            g09Var2 = g09Var;
                            j13 = jW;
                            pr4Var2 = pr4Var;
                        } else {
                            l46Var.f0(-713989956);
                            g09Var2 = g09Var;
                            j11 = j9;
                            j12 = j10;
                            j13 = jW;
                            pr4Var2 = pr4Var;
                            j09VarU = u(y6cVarB, ii6Var, j11, j12, j13, num4, l46Var, 64);
                            l46Var.r(false);
                        }
                        j09 j09VarC13 = androidx.compose.foundation.b.c(j09Var.D(j09VarU), false, null, null, x16Var, 15);
                        kx0Var = ndb.z;
                        rc0Var = xc0.a;
                        t7c t7cVarA1116 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                        int iHashCode11111113 = Long.hashCode(l46Var.T);
                        u8a u8aVarM11111113 = l46Var.m();
                        j09 j09VarJ11111113 = m93.J(l46Var, j09VarC13);
                        lf2.q.getClass();
                        l46Var.j0();
                        long j1118 = j11;
                        z9 = l46Var.S;
                        ov7Var = LayoutNode.h1;
                        if (z9) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        he2Var = hj6.z;
                        long j1119 = j12;
                        dec.l(he2Var, l46Var, t7cVarA1116);
                        he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var, u8aVarM11111113);
                        Integer numValueOf13 = Integer.valueOf(iHashCode11111113);
                        he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var, numValueOf13);
                        dec.k(l46Var);
                        he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var, j09VarJ11111113);
                        d31Var = d31.a;
                        v7cVar = v7c.a;
                        if (z6) {
                            l46Var.f0(1697589941);
                            j09 j09VarA11111111 = v7cVar.a(g09Var2, 1.0f, true);
                            fillElement = androidx.compose.foundation.layout.b.b;
                            j09 j09VarD111118 = j09VarA11111111.D(fillElement);
                            t7c t7cVarA1117 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                            int iHashCode11111114 = Long.hashCode(l46Var.T);
                            u8a u8aVarM11111114 = l46Var.m();
                            j09 j09VarJ11111114 = m93.J(l46Var, j09VarD111118);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, t7cVarA1117);
                            dec.l(he2Var2, l46Var, u8aVarM11111114);
                            ib8.s(iHashCode11111114, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ11111114);
                            if (z8) {
                                l46Var.f0(1422951589);
                                j09 j09VarD111119 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                xn8 xn8VarC1117 = s21.c(lx0Var, false);
                                int iHashCode11111115 = Long.hashCode(l46Var.T);
                                u8a u8aVarM11111115 = l46Var.m();
                                j09 j09VarJ11111115 = m93.J(l46Var, j09VarD111119);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, xn8VarC1117);
                                dec.l(he2Var2, l46Var, u8aVarM11111115);
                                ib8.s(iHashCode11111115, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ11111115);
                                dd2Var.m(d31Var, l46Var, 54);
                                l46Var.r(true);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                l46Var.r(false);
                            } else {
                                l46Var.f0(1423207401);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                l46Var.r(false);
                            }
                            if (z6) {
                                l46Var.f0(1423311716);
                                j09 j09VarA11111112 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar11118 = pue.a;
                                mue mueVarQ115 = pue.q(l46Var);
                                nte.b(str, j09VarA11111112, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ115, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                z10 = false;
                                l46Var.r(false);
                            } else {
                                pr4 pr4Var116 = pr4Var2;
                                l46Var.f0(1423728945);
                                j09 j09VarA11111113 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar11119 = pue.a;
                                vd0.e(str, j09VarA11111113, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var116)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                z10 = false;
                                l46Var.r(false);
                            }
                            l46Var.r(true);
                            l46Var.r(z10);
                            fillElement2 = fillElement;
                        } else {
                            l46Var.f0(1697589941);
                            j09 j09VarA11111114 = v7cVar.a(g09Var2, 1.0f, true);
                            fillElement = androidx.compose.foundation.layout.b.b;
                            j09 j09VarD1111110 = j09VarA11111114.D(fillElement);
                            t7c t7cVarA1118 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                            int iHashCode11111116 = Long.hashCode(l46Var.T);
                            u8a u8aVarM11111116 = l46Var.m();
                            j09 j09VarJ11111116 = m93.J(l46Var, j09VarD1111110);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, t7cVarA1118);
                            dec.l(he2Var2, l46Var, u8aVarM11111116);
                            ib8.s(iHashCode11111116, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ11111116);
                            if (z8) {
                                l46Var.f0(1422951589);
                                j09 j09VarD1111111 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                                xn8 xn8VarC1118 = s21.c(lx0Var, false);
                                int iHashCode11111117 = Long.hashCode(l46Var.T);
                                u8a u8aVarM11111117 = l46Var.m();
                                j09 j09VarJ11111117 = m93.J(l46Var, j09VarD1111111);
                                l46Var.j0();
                                if (l46Var.S) {
                                    l46Var.l(ov7Var);
                                } else {
                                    l46Var.s0();
                                }
                                dec.l(he2Var, l46Var, xn8VarC1118);
                                dec.l(he2Var2, l46Var, u8aVarM11111117);
                                ib8.s(iHashCode11111117, l46Var, he2Var3, l46Var);
                                dec.l(he2Var4, l46Var, j09VarJ11111117);
                                dd2Var.m(d31Var, l46Var, 54);
                                l46Var.r(true);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                                l46Var.r(false);
                            } else {
                                l46Var.f0(1423207401);
                                o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                                l46Var.r(false);
                            }
                            if (z6) {
                                l46Var.f0(1423311716);
                                j09 j09VarA11111115 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar111110 = pue.a;
                                mue mueVarQ116 = pue.q(l46Var);
                                nte.b(str, j09VarA11111115, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ116, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                                z10 = false;
                                l46Var.r(false);
                            } else {
                                pr4 pr4Var117 = pr4Var2;
                                l46Var.f0(1423728945);
                                j09 j09VarA11111116 = v7cVar.a(g09Var2, 1.0f, true);
                                mue mueVar111111 = pue.a;
                                vd0.e(str, j09VarA11111116, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var117)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                                z10 = false;
                                l46Var.r(false);
                            }
                            l46Var.r(true);
                            l46Var.r(z10);
                            fillElement2 = fillElement;
                        }
                        j09 j09VarD1111112 = ynb.d0(0.0f, 0.0f, 12.0f, 0.0f, 11, androidx.compose.foundation.layout.b.p(g09Var2, 28.0f).D(fillElement2));
                        xn8 xn8VarC1119 = s21.c(ndb.g, false);
                        int iHashCode11111118 = Long.hashCode(l46Var.T);
                        u8a u8aVarM11111118 = l46Var.m();
                        j09 j09VarJ11111118 = m93.J(l46Var, j09VarD1111112);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, xn8VarC1119);
                        dec.l(he2Var2, l46Var, u8aVarM11111118);
                        ib8.s(iHashCode11111118, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ11111118);
                        i(0, 1, l46Var, null);
                        l46Var.r(true);
                        l46Var.r(true);
                        j6 = j1118;
                        j7 = j1119;
                        z4 = z6;
                        z5 = z7;
                        j8 = j13;
                        num2 = num4;
                    } else {
                        l46Var.Z();
                        z4 = z;
                        z5 = z2;
                        j6 = j4;
                        j7 = j5;
                        j8 = j3;
                        num2 = num;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new l26() { // from class: ao6
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i2 | 1);
                                no6.k(ii6Var, j6, j7, j8, num2, str, x16Var, j09Var, z4, z5, dd2Var, (l46) obj, iP, i3);
                                return wef.a;
                            }
                        };
                    }
                }
                i4 |= 805306368;
                if ((i4 & 306783379) == 306783378) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i4 & 1, z3)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            j9 = y72.j;
                        } else {
                            j9 = j4;
                        }
                        if ((i3 & 4) != 0) {
                            j10 = ((e8b) l46Var.k(l8b.a)).f;
                            i4 &= -897;
                        } else {
                            j10 = j5;
                        }
                        if ((i3 & 8) != 0) {
                            jW = w(l46Var);
                            i4 &= -7169;
                        } else {
                            jW = j3;
                        }
                        if (i5 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i9 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        num4 = num3;
                    } else {
                        if (i16 != 0) {
                            j9 = y72.j;
                        } else {
                            j9 = j4;
                        }
                        if ((i3 & 4) != 0) {
                            j10 = ((e8b) l46Var.k(l8b.a)).f;
                            i4 &= -897;
                        } else {
                            j10 = j5;
                        }
                        if ((i3 & 8) != 0) {
                            jW = w(l46Var);
                            i4 &= -7169;
                        } else {
                            jW = j3;
                        }
                        if (i5 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i9 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        num4 = num3;
                    }
                    l46Var.s();
                    pr4Var = l8b.a;
                    zF = k8b.f((e8b) l46Var.k(pr4Var));
                    if (((sw3) l46Var.k(zg2.h)).h0() < 1.5f) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (zF) {
                        f2 = 0.0f;
                    } else {
                        f2 = 20.0f;
                    }
                    y6cVarB = a7c.b(f2);
                    g09Var = g09.a;
                    if (zF) {
                        l46Var.f0(-714160456);
                        j09 j09VarO14 = tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var.k(pr4Var)).a, g21.f);
                        if (z7) {
                            j09VarT = b21.t(g09Var, new uc2(5, 1.0f));
                        } else {
                            j09VarT = g09Var;
                        }
                        j09VarU = j09VarO14.D(j09VarT);
                        l46Var.r(false);
                        j11 = j9;
                        j12 = j10;
                        g09Var2 = g09Var;
                        j13 = jW;
                        pr4Var2 = pr4Var;
                    } else {
                        l46Var.f0(-713989956);
                        g09Var2 = g09Var;
                        j11 = j9;
                        j12 = j10;
                        j13 = jW;
                        pr4Var2 = pr4Var;
                        j09VarU = u(y6cVarB, ii6Var, j11, j12, j13, num4, l46Var, 64);
                        l46Var.r(false);
                    }
                    j09 j09VarC14 = androidx.compose.foundation.b.c(j09Var.D(j09VarU), false, null, null, x16Var, 15);
                    kx0Var = ndb.z;
                    rc0Var = xc0.a;
                    t7c t7cVarA1119 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                    int iHashCode11111119 = Long.hashCode(l46Var.T);
                    u8a u8aVarM11111119 = l46Var.m();
                    j09 j09VarJ11111119 = m93.J(l46Var, j09VarC14);
                    lf2.q.getClass();
                    l46Var.j0();
                    long j11110 = j11;
                    z9 = l46Var.S;
                    ov7Var = LayoutNode.h1;
                    if (z9) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2Var = hj6.z;
                    long j11111 = j12;
                    dec.l(he2Var, l46Var, t7cVarA1119);
                    he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM11111119);
                    Integer numValueOf14 = Integer.valueOf(iHashCode11111119);
                    he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf14);
                    dec.k(l46Var);
                    he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ11111119);
                    d31Var = d31.a;
                    v7cVar = v7c.a;
                    if (z6) {
                        l46Var.f0(1697589941);
                        j09 j09VarA11111117 = v7cVar.a(g09Var2, 1.0f, true);
                        fillElement = androidx.compose.foundation.layout.b.b;
                        j09 j09VarD1111113 = j09VarA11111117.D(fillElement);
                        t7c t7cVarA11110 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                        int iHashCode111111110 = Long.hashCode(l46Var.T);
                        u8a u8aVarM111111110 = l46Var.m();
                        j09 j09VarJ111111110 = m93.J(l46Var, j09VarD1111113);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, t7cVarA11110);
                        dec.l(he2Var2, l46Var, u8aVarM111111110);
                        ib8.s(iHashCode111111110, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ111111110);
                        if (z8) {
                            l46Var.f0(1422951589);
                            j09 j09VarD1111114 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                            xn8 xn8VarC11110 = s21.c(lx0Var, false);
                            int iHashCode111111111 = Long.hashCode(l46Var.T);
                            u8a u8aVarM111111111 = l46Var.m();
                            j09 j09VarJ111111111 = m93.J(l46Var, j09VarD1111114);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, xn8VarC11110);
                            dec.l(he2Var2, l46Var, u8aVarM111111111);
                            ib8.s(iHashCode111111111, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ111111111);
                            dd2Var.m(d31Var, l46Var, 54);
                            l46Var.r(true);
                            o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1423207401);
                            o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                            l46Var.r(false);
                        }
                        if (z6) {
                            l46Var.f0(1423311716);
                            j09 j09VarA11111118 = v7cVar.a(g09Var2, 1.0f, true);
                            mue mueVar111112 = pue.a;
                            mue mueVarQ117 = pue.q(l46Var);
                            nte.b(str, j09VarA11111118, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ117, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                            z10 = false;
                            l46Var.r(false);
                        } else {
                            pr4 pr4Var118 = pr4Var2;
                            l46Var.f0(1423728945);
                            j09 j09VarA11111119 = v7cVar.a(g09Var2, 1.0f, true);
                            mue mueVar111113 = pue.a;
                            vd0.e(str, j09VarA11111119, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var118)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                            z10 = false;
                            l46Var.r(false);
                        }
                        l46Var.r(true);
                        l46Var.r(z10);
                        fillElement2 = fillElement;
                    } else {
                        l46Var.f0(1697589941);
                        j09 j09VarA111111110 = v7cVar.a(g09Var2, 1.0f, true);
                        fillElement = androidx.compose.foundation.layout.b.b;
                        j09 j09VarD1111115 = j09VarA111111110.D(fillElement);
                        t7c t7cVarA11111 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                        int iHashCode111111112 = Long.hashCode(l46Var.T);
                        u8a u8aVarM111111112 = l46Var.m();
                        j09 j09VarJ111111112 = m93.J(l46Var, j09VarD1111115);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, t7cVarA11111);
                        dec.l(he2Var2, l46Var, u8aVarM111111112);
                        ib8.s(iHashCode111111112, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ111111112);
                        if (z8) {
                            l46Var.f0(1422951589);
                            j09 j09VarD1111116 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                            xn8 xn8VarC11111 = s21.c(lx0Var, false);
                            int iHashCode111111113 = Long.hashCode(l46Var.T);
                            u8a u8aVarM111111113 = l46Var.m();
                            j09 j09VarJ111111113 = m93.J(l46Var, j09VarD1111116);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, xn8VarC11111);
                            dec.l(he2Var2, l46Var, u8aVarM111111113);
                            ib8.s(iHashCode111111113, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ111111113);
                            dd2Var.m(d31Var, l46Var, 54);
                            l46Var.r(true);
                            o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1423207401);
                            o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                            l46Var.r(false);
                        }
                        if (z6) {
                            l46Var.f0(1423311716);
                            j09 j09VarA111111111 = v7cVar.a(g09Var2, 1.0f, true);
                            mue mueVar111114 = pue.a;
                            mue mueVarQ118 = pue.q(l46Var);
                            nte.b(str, j09VarA111111111, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ118, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                            z10 = false;
                            l46Var.r(false);
                        } else {
                            pr4 pr4Var119 = pr4Var2;
                            l46Var.f0(1423728945);
                            j09 j09VarA111111112 = v7cVar.a(g09Var2, 1.0f, true);
                            mue mueVar111115 = pue.a;
                            vd0.e(str, j09VarA111111112, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var119)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                            z10 = false;
                            l46Var.r(false);
                        }
                        l46Var.r(true);
                        l46Var.r(z10);
                        fillElement2 = fillElement;
                    }
                    j09 j09VarD1111117 = ynb.d0(0.0f, 0.0f, 12.0f, 0.0f, 11, androidx.compose.foundation.layout.b.p(g09Var2, 28.0f).D(fillElement2));
                    xn8 xn8VarC11112 = s21.c(ndb.g, false);
                    int iHashCode111111114 = Long.hashCode(l46Var.T);
                    u8a u8aVarM111111114 = l46Var.m();
                    j09 j09VarJ111111114 = m93.J(l46Var, j09VarD1111117);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, xn8VarC11112);
                    dec.l(he2Var2, l46Var, u8aVarM111111114);
                    ib8.s(iHashCode111111114, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ111111114);
                    i(0, 1, l46Var, null);
                    l46Var.r(true);
                    l46Var.r(true);
                    j6 = j11110;
                    j7 = j11111;
                    z4 = z6;
                    z5 = z7;
                    j8 = j13;
                    num2 = num4;
                } else {
                    l46Var.Z();
                    z4 = z;
                    z5 = z2;
                    j6 = j4;
                    j7 = j5;
                    j8 = j3;
                    num2 = num;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: ao6
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i2 | 1);
                            no6.k(ii6Var, j6, j7, j8, num2, str, x16Var, j09Var, z4, z5, dd2Var, (l46) obj, iP, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 100663296;
            i9 = i3 & 512;
            if (i9 != 0) {
                if ((i2 & 805306368) == 0) {
                    if (l46Var.h(z2)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i4 |= i10;
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i4 & 1, z3)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0) {
                        if (i16 != 0) {
                            j9 = y72.j;
                        } else {
                            j9 = j4;
                        }
                        if ((i3 & 4) != 0) {
                            j10 = ((e8b) l46Var.k(l8b.a)).f;
                            i4 &= -897;
                        } else {
                            j10 = j5;
                        }
                        if ((i3 & 8) != 0) {
                            jW = w(l46Var);
                            i4 &= -7169;
                        } else {
                            jW = j3;
                        }
                        if (i5 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i9 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        num4 = num3;
                    } else {
                        if (i16 != 0) {
                            j9 = y72.j;
                        } else {
                            j9 = j4;
                        }
                        if ((i3 & 4) != 0) {
                            j10 = ((e8b) l46Var.k(l8b.a)).f;
                            i4 &= -897;
                        } else {
                            j10 = j5;
                        }
                        if ((i3 & 8) != 0) {
                            jW = w(l46Var);
                            i4 &= -7169;
                        } else {
                            jW = j3;
                        }
                        if (i5 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i9 != 0) {
                            z7 = false;
                        } else {
                            z7 = z2;
                        }
                        num4 = num3;
                    }
                    l46Var.s();
                    pr4Var = l8b.a;
                    zF = k8b.f((e8b) l46Var.k(pr4Var));
                    if (((sw3) l46Var.k(zg2.h)).h0() < 1.5f) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (zF) {
                        f2 = 0.0f;
                    } else {
                        f2 = 20.0f;
                    }
                    y6cVarB = a7c.b(f2);
                    g09Var = g09.a;
                    if (zF) {
                        l46Var.f0(-714160456);
                        j09 j09VarO15 = tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var.k(pr4Var)).a, g21.f);
                        if (z7) {
                            j09VarT = b21.t(g09Var, new uc2(5, 1.0f));
                        } else {
                            j09VarT = g09Var;
                        }
                        j09VarU = j09VarO15.D(j09VarT);
                        l46Var.r(false);
                        j11 = j9;
                        j12 = j10;
                        g09Var2 = g09Var;
                        j13 = jW;
                        pr4Var2 = pr4Var;
                    } else {
                        l46Var.f0(-713989956);
                        g09Var2 = g09Var;
                        j11 = j9;
                        j12 = j10;
                        j13 = jW;
                        pr4Var2 = pr4Var;
                        j09VarU = u(y6cVarB, ii6Var, j11, j12, j13, num4, l46Var, 64);
                        l46Var.r(false);
                    }
                    j09 j09VarC15 = androidx.compose.foundation.b.c(j09Var.D(j09VarU), false, null, null, x16Var, 15);
                    kx0Var = ndb.z;
                    rc0Var = xc0.a;
                    t7c t7cVarA11112 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                    int iHashCode111111115 = Long.hashCode(l46Var.T);
                    u8a u8aVarM111111115 = l46Var.m();
                    j09 j09VarJ111111115 = m93.J(l46Var, j09VarC15);
                    lf2.q.getClass();
                    l46Var.j0();
                    long j11112 = j11;
                    z9 = l46Var.S;
                    ov7Var = LayoutNode.h1;
                    if (z9) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2Var = hj6.z;
                    long j11113 = j12;
                    dec.l(he2Var, l46Var, t7cVarA11112);
                    he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM111111115);
                    Integer numValueOf15 = Integer.valueOf(iHashCode111111115);
                    he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf15);
                    dec.k(l46Var);
                    he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ111111115);
                    d31Var = d31.a;
                    v7cVar = v7c.a;
                    if (z6) {
                        l46Var.f0(1697589941);
                        j09 j09VarA111111113 = v7cVar.a(g09Var2, 1.0f, true);
                        fillElement = androidx.compose.foundation.layout.b.b;
                        j09 j09VarD1111118 = j09VarA111111113.D(fillElement);
                        t7c t7cVarA11113 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                        int iHashCode111111116 = Long.hashCode(l46Var.T);
                        u8a u8aVarM111111116 = l46Var.m();
                        j09 j09VarJ111111116 = m93.J(l46Var, j09VarD1111118);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, t7cVarA11113);
                        dec.l(he2Var2, l46Var, u8aVarM111111116);
                        ib8.s(iHashCode111111116, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ111111116);
                        if (z8) {
                            l46Var.f0(1422951589);
                            j09 j09VarD1111119 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                            xn8 xn8VarC11113 = s21.c(lx0Var, false);
                            int iHashCode111111117 = Long.hashCode(l46Var.T);
                            u8a u8aVarM111111117 = l46Var.m();
                            j09 j09VarJ111111117 = m93.J(l46Var, j09VarD1111119);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, xn8VarC11113);
                            dec.l(he2Var2, l46Var, u8aVarM111111117);
                            ib8.s(iHashCode111111117, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ111111117);
                            dd2Var.m(d31Var, l46Var, 54);
                            l46Var.r(true);
                            o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1423207401);
                            o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                            l46Var.r(false);
                        }
                        if (z6) {
                            l46Var.f0(1423311716);
                            j09 j09VarA111111114 = v7cVar.a(g09Var2, 1.0f, true);
                            mue mueVar111116 = pue.a;
                            mue mueVarQ119 = pue.q(l46Var);
                            nte.b(str, j09VarA111111114, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ119, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                            z10 = false;
                            l46Var.r(false);
                        } else {
                            pr4 pr4Var1110 = pr4Var2;
                            l46Var.f0(1423728945);
                            j09 j09VarA111111115 = v7cVar.a(g09Var2, 1.0f, true);
                            mue mueVar111117 = pue.a;
                            vd0.e(str, j09VarA111111115, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var1110)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                            z10 = false;
                            l46Var.r(false);
                        }
                        l46Var.r(true);
                        l46Var.r(z10);
                        fillElement2 = fillElement;
                    } else {
                        l46Var.f0(1697589941);
                        j09 j09VarA111111116 = v7cVar.a(g09Var2, 1.0f, true);
                        fillElement = androidx.compose.foundation.layout.b.b;
                        j09 j09VarD11111110 = j09VarA111111116.D(fillElement);
                        t7c t7cVarA11114 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                        int iHashCode111111118 = Long.hashCode(l46Var.T);
                        u8a u8aVarM111111118 = l46Var.m();
                        j09 j09VarJ111111118 = m93.J(l46Var, j09VarD11111110);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, t7cVarA11114);
                        dec.l(he2Var2, l46Var, u8aVarM111111118);
                        ib8.s(iHashCode111111118, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ111111118);
                        if (z8) {
                            l46Var.f0(1422951589);
                            j09 j09VarD11111111 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                            xn8 xn8VarC11114 = s21.c(lx0Var, false);
                            int iHashCode111111119 = Long.hashCode(l46Var.T);
                            u8a u8aVarM111111119 = l46Var.m();
                            j09 j09VarJ111111119 = m93.J(l46Var, j09VarD11111111);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(ov7Var);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(he2Var, l46Var, xn8VarC11114);
                            dec.l(he2Var2, l46Var, u8aVarM111111119);
                            ib8.s(iHashCode111111119, l46Var, he2Var3, l46Var);
                            dec.l(he2Var4, l46Var, j09VarJ111111119);
                            dd2Var.m(d31Var, l46Var, 54);
                            l46Var.r(true);
                            o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                            l46Var.r(false);
                        } else {
                            l46Var.f0(1423207401);
                            o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                            l46Var.r(false);
                        }
                        if (z6) {
                            l46Var.f0(1423311716);
                            j09 j09VarA111111117 = v7cVar.a(g09Var2, 1.0f, true);
                            mue mueVar111118 = pue.a;
                            mue mueVarQ1110 = pue.q(l46Var);
                            nte.b(str, j09VarA111111117, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ1110, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                            z10 = false;
                            l46Var.r(false);
                        } else {
                            pr4 pr4Var1111 = pr4Var2;
                            l46Var.f0(1423728945);
                            j09 j09VarA111111118 = v7cVar.a(g09Var2, 1.0f, true);
                            mue mueVar111119 = pue.a;
                            vd0.e(str, j09VarA111111118, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var1111)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                            z10 = false;
                            l46Var.r(false);
                        }
                        l46Var.r(true);
                        l46Var.r(z10);
                        fillElement2 = fillElement;
                    }
                    j09 j09VarD11111112 = ynb.d0(0.0f, 0.0f, 12.0f, 0.0f, 11, androidx.compose.foundation.layout.b.p(g09Var2, 28.0f).D(fillElement2));
                    xn8 xn8VarC11115 = s21.c(ndb.g, false);
                    int iHashCode1111111110 = Long.hashCode(l46Var.T);
                    u8a u8aVarM1111111110 = l46Var.m();
                    j09 j09VarJ1111111110 = m93.J(l46Var, j09VarD11111112);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, xn8VarC11115);
                    dec.l(he2Var2, l46Var, u8aVarM1111111110);
                    ib8.s(iHashCode1111111110, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ1111111110);
                    i(0, 1, l46Var, null);
                    l46Var.r(true);
                    l46Var.r(true);
                    j6 = j11112;
                    j7 = j11113;
                    z4 = z6;
                    z5 = z7;
                    j8 = j13;
                    num2 = num4;
                } else {
                    l46Var.Z();
                    z4 = z;
                    z5 = z2;
                    j6 = j4;
                    j7 = j5;
                    j8 = j3;
                    num2 = num;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: ao6
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i2 | 1);
                            no6.k(ii6Var, j6, j7, j8, num2, str, x16Var, j09Var, z4, z5, dd2Var, (l46) obj, iP, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i4 |= 805306368;
            if ((i4 & 306783379) == 306783378) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (l46Var.W(i4 & 1, z3)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i16 != 0) {
                        j9 = y72.j;
                    } else {
                        j9 = j4;
                    }
                    if ((i3 & 4) != 0) {
                        j10 = ((e8b) l46Var.k(l8b.a)).f;
                        i4 &= -897;
                    } else {
                        j10 = j5;
                    }
                    if ((i3 & 8) != 0) {
                        jW = w(l46Var);
                        i4 &= -7169;
                    } else {
                        jW = j3;
                    }
                    if (i5 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z;
                    }
                    if (i9 != 0) {
                        z7 = false;
                    } else {
                        z7 = z2;
                    }
                    num4 = num3;
                } else {
                    if (i16 != 0) {
                        j9 = y72.j;
                    } else {
                        j9 = j4;
                    }
                    if ((i3 & 4) != 0) {
                        j10 = ((e8b) l46Var.k(l8b.a)).f;
                        i4 &= -897;
                    } else {
                        j10 = j5;
                    }
                    if ((i3 & 8) != 0) {
                        jW = w(l46Var);
                        i4 &= -7169;
                    } else {
                        jW = j3;
                    }
                    if (i5 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z;
                    }
                    if (i9 != 0) {
                        z7 = false;
                    } else {
                        z7 = z2;
                    }
                    num4 = num3;
                }
                l46Var.s();
                pr4Var = l8b.a;
                zF = k8b.f((e8b) l46Var.k(pr4Var));
                if (((sw3) l46Var.k(zg2.h)).h0() < 1.5f) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (zF) {
                    f2 = 0.0f;
                } else {
                    f2 = 20.0f;
                }
                y6cVarB = a7c.b(f2);
                g09Var = g09.a;
                if (zF) {
                    l46Var.f0(-714160456);
                    j09 j09VarO16 = tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var.k(pr4Var)).a, g21.f);
                    if (z7) {
                        j09VarT = b21.t(g09Var, new uc2(5, 1.0f));
                    } else {
                        j09VarT = g09Var;
                    }
                    j09VarU = j09VarO16.D(j09VarT);
                    l46Var.r(false);
                    j11 = j9;
                    j12 = j10;
                    g09Var2 = g09Var;
                    j13 = jW;
                    pr4Var2 = pr4Var;
                } else {
                    l46Var.f0(-713989956);
                    g09Var2 = g09Var;
                    j11 = j9;
                    j12 = j10;
                    j13 = jW;
                    pr4Var2 = pr4Var;
                    j09VarU = u(y6cVarB, ii6Var, j11, j12, j13, num4, l46Var, 64);
                    l46Var.r(false);
                }
                j09 j09VarC16 = androidx.compose.foundation.b.c(j09Var.D(j09VarU), false, null, null, x16Var, 15);
                kx0Var = ndb.z;
                rc0Var = xc0.a;
                t7c t7cVarA11115 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                int iHashCode1111111111 = Long.hashCode(l46Var.T);
                u8a u8aVarM1111111111 = l46Var.m();
                j09 j09VarJ1111111111 = m93.J(l46Var, j09VarC16);
                lf2.q.getClass();
                l46Var.j0();
                long j11114 = j11;
                z9 = l46Var.S;
                ov7Var = LayoutNode.h1;
                if (z9) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                he2Var = hj6.z;
                long j11115 = j12;
                dec.l(he2Var, l46Var, t7cVarA11115);
                he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var, u8aVarM1111111111);
                Integer numValueOf16 = Integer.valueOf(iHashCode1111111111);
                he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var, numValueOf16);
                dec.k(l46Var);
                he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var, j09VarJ1111111111);
                d31Var = d31.a;
                v7cVar = v7c.a;
                if (z6) {
                    l46Var.f0(1697589941);
                    j09 j09VarA111111119 = v7cVar.a(g09Var2, 1.0f, true);
                    fillElement = androidx.compose.foundation.layout.b.b;
                    j09 j09VarD11111113 = j09VarA111111119.D(fillElement);
                    t7c t7cVarA11116 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                    int iHashCode1111111112 = Long.hashCode(l46Var.T);
                    u8a u8aVarM1111111112 = l46Var.m();
                    j09 j09VarJ1111111112 = m93.J(l46Var, j09VarD11111113);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, t7cVarA11116);
                    dec.l(he2Var2, l46Var, u8aVarM1111111112);
                    ib8.s(iHashCode1111111112, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ1111111112);
                    if (z8) {
                        l46Var.f0(1422951589);
                        j09 j09VarD11111114 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                        xn8 xn8VarC11116 = s21.c(lx0Var, false);
                        int iHashCode1111111113 = Long.hashCode(l46Var.T);
                        u8a u8aVarM1111111113 = l46Var.m();
                        j09 j09VarJ1111111113 = m93.J(l46Var, j09VarD11111114);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, xn8VarC11116);
                        dec.l(he2Var2, l46Var, u8aVarM1111111113);
                        ib8.s(iHashCode1111111113, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ1111111113);
                        dd2Var.m(d31Var, l46Var, 54);
                        l46Var.r(true);
                        o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1423207401);
                        o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                        l46Var.r(false);
                    }
                    if (z6) {
                        l46Var.f0(1423311716);
                        j09 j09VarA1111111110 = v7cVar.a(g09Var2, 1.0f, true);
                        mue mueVar1111110 = pue.a;
                        mue mueVarQ1111 = pue.q(l46Var);
                        nte.b(str, j09VarA1111111110, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ1111, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                        z10 = false;
                        l46Var.r(false);
                    } else {
                        pr4 pr4Var1112 = pr4Var2;
                        l46Var.f0(1423728945);
                        j09 j09VarA1111111111 = v7cVar.a(g09Var2, 1.0f, true);
                        mue mueVar1111111 = pue.a;
                        vd0.e(str, j09VarA1111111111, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var1112)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                        z10 = false;
                        l46Var.r(false);
                    }
                    l46Var.r(true);
                    l46Var.r(z10);
                    fillElement2 = fillElement;
                } else {
                    l46Var.f0(1697589941);
                    j09 j09VarA1111111112 = v7cVar.a(g09Var2, 1.0f, true);
                    fillElement = androidx.compose.foundation.layout.b.b;
                    j09 j09VarD11111115 = j09VarA1111111112.D(fillElement);
                    t7c t7cVarA11117 = s7c.a(rc0Var, kx0Var, l46Var, 48);
                    int iHashCode1111111114 = Long.hashCode(l46Var.T);
                    u8a u8aVarM1111111114 = l46Var.m();
                    j09 j09VarJ1111111114 = m93.J(l46Var, j09VarD11111115);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, t7cVarA11117);
                    dec.l(he2Var2, l46Var, u8aVarM1111111114);
                    ib8.s(iHashCode1111111114, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ1111111114);
                    if (z8) {
                        l46Var.f0(1422951589);
                        j09 j09VarD11111116 = androidx.compose.foundation.layout.b.p(g09Var2, 56.0f).D(fillElement);
                        xn8 xn8VarC11117 = s21.c(lx0Var, false);
                        int iHashCode1111111115 = Long.hashCode(l46Var.T);
                        u8a u8aVarM1111111115 = l46Var.m();
                        j09 j09VarJ1111111115 = m93.J(l46Var, j09VarD11111116);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, xn8VarC11117);
                        dec.l(he2Var2, l46Var, u8aVarM1111111115);
                        ib8.s(iHashCode1111111115, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ1111111115);
                        dd2Var.m(d31Var, l46Var, 54);
                        l46Var.r(true);
                        o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 8.0f));
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1423207401);
                        o5c.f(l46Var, androidx.compose.foundation.layout.b.p(g09Var2, 16.0f));
                        l46Var.r(false);
                    }
                    if (z6) {
                        l46Var.f0(1423311716);
                        j09 j09VarA1111111113 = v7cVar.a(g09Var2, 1.0f, true);
                        mue mueVar1111112 = pue.a;
                        mue mueVarQ1112 = pue.q(l46Var);
                        nte.b(str, j09VarA1111111113, ((e8b) l46Var.k(pr4Var2)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, new jme(3), 0L, 2, false, 2, 0, null, mueVarQ1112, l46Var, ((i4 >> 15) & 14) | 1572864, 24960, 109368);
                        z10 = false;
                        l46Var.r(false);
                    } else {
                        pr4 pr4Var1113 = pr4Var2;
                        l46Var.f0(1423728945);
                        j09 j09VarA1111111114 = v7cVar.a(g09Var2, 1.0f, true);
                        mue mueVar1111113 = pue.a;
                        vd0.e(str, j09VarA1111111114, mue.a(pue.q(l46Var), ((e8b) l46Var.k(pr4Var1113)).q, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 5, 0L, null, null, 16744410), null, 0, false, 1, 0, new co0(w6c.l(10), w6c.l(15), w6c.l(1)), l46Var, ((i4 >> 15) & 14) | 1769472, 408);
                        z10 = false;
                        l46Var.r(false);
                    }
                    l46Var.r(true);
                    l46Var.r(z10);
                    fillElement2 = fillElement;
                }
                j09 j09VarD11111117 = ynb.d0(0.0f, 0.0f, 12.0f, 0.0f, 11, androidx.compose.foundation.layout.b.p(g09Var2, 28.0f).D(fillElement2));
                xn8 xn8VarC11118 = s21.c(ndb.g, false);
                int iHashCode1111111116 = Long.hashCode(l46Var.T);
                u8a u8aVarM1111111116 = l46Var.m();
                j09 j09VarJ1111111116 = m93.J(l46Var, j09VarD11111117);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, xn8VarC11118);
                dec.l(he2Var2, l46Var, u8aVarM1111111116);
                ib8.s(iHashCode1111111116, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ1111111116);
                i(0, 1, l46Var, null);
                l46Var.r(true);
                l46Var.r(true);
                j6 = j11114;
                j7 = j11115;
                z4 = z6;
                z5 = z7;
                j8 = j13;
                num2 = num4;
            } else {
                l46Var.Z();
                z4 = z;
                z5 = z2;
                j6 = j4;
                j7 = j5;
                j8 = j3;
                num2 = num;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: ao6
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i2 | 1);
                        no6.k(ii6Var, j6, j7, j8, num2, str, x16Var, j09Var, z4, z5, dd2Var, (l46) obj, iP, i3);
                        return wef.a;
                    }
                };
            }
        }

        public static final void l(ii6 ii6Var, TarotSkinIdentify tarotSkinIdentify, mic micVar, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, j09 j09Var, l46 l46Var, int i2) {
            j09 j09Var2;
            x16Var.getClass();
            x16Var2.getClass();
            x16Var3.getClass();
            x16Var4.getClass();
            l46Var.h0(-1728263783);
            int i3 = i2 | (l46Var.g(ii6Var) ? 4 : 2) | (l46Var.e(tarotSkinIdentify == null ? -1 : tarotSkinIdentify.ordinal()) ? 32 : 16) | (l46Var.e(micVar != null ? micVar.ordinal() : -1) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var3) ? 131072 : 65536) | (l46Var.i(x16Var4) ? 1048576 : 524288) | 12582912;
            if (l46Var.W(i3 & 1, (4793491 & i3) != 4793490)) {
                if (k8b.f((e8b) l46Var.k(l8b.a))) {
                    l46Var.f0(1361906195);
                    n(ii6Var, tarotSkinIdentify, micVar, x16Var, x16Var2, x16Var3, x16Var4, l46Var, i3 & 33554430);
                    l46Var.r(false);
                } else {
                    l46Var.f0(1362219636);
                    m(ii6Var, tarotSkinIdentify, micVar, x16Var, x16Var2, x16Var3, x16Var4, l46Var, i3 & 33554430);
                    l46Var.r(false);
                }
                j09Var2 = g09.a;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new bq1(ii6Var, tarotSkinIdentify, micVar, x16Var, x16Var2, x16Var3, x16Var4, j09Var2, i2);
            }
        }

        public static final void m(ii6 ii6Var, TarotSkinIdentify tarotSkinIdentify, mic micVar, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, l46 l46Var, int i2) {
            ii6 ii6Var2;
            int i3;
            l46 l46Var2;
            he2 he2Var;
            he2 he2Var2;
            FillElement fillElement;
            int i4;
            float f2;
            long j;
            long jC;
            long j2;
            long jW;
            l46 l46Var3;
            l46Var.h0(-425256833);
            if ((i2 & 6) == 0) {
                ii6Var2 = ii6Var;
                i3 = (l46Var.g(ii6Var2) ? 4 : 2) | i2;
            } else {
                ii6Var2 = ii6Var;
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= l46Var.e(tarotSkinIdentify == null ? -1 : tarotSkinIdentify.ordinal()) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= l46Var.e(micVar != null ? micVar.ordinal() : -1) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i2 & 3072) == 0) {
                i3 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if ((i2 & 24576) == 0) {
                i3 |= l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            if ((196608 & i2) == 0) {
                i3 |= l46Var.i(x16Var3) ? 131072 : 65536;
            }
            if ((1572864 & i2) == 0) {
                i3 |= l46Var.i(x16Var4) ? 1048576 : 524288;
            }
            int i5 = 12582912 & i2;
            g09 g09Var = g09.a;
            if (i5 == 0) {
                i3 |= l46Var.g(g09Var) ? 8388608 : 4194304;
            }
            int i6 = i3;
            if (l46Var.W(i6 & 1, (i6 & 4793491) != 4793490)) {
                boolean zS = g21.S(l46Var);
                long j3 = g21.S(l46Var) ? e : f;
                boolean z = micVar == mic.AutumnEquinox2026;
                j09 j09VarF = urg.F(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), ia7.a);
                t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.y, l46Var, 6);
                boolean z2 = z;
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarF);
                lf2.q.getClass();
                l46Var.j0();
                boolean z3 = l46Var.S;
                ov7 ov7Var = LayoutNode.h1;
                if (z3) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                he2 he2Var3 = hj6.z;
                dec.l(he2Var3, l46Var, t7cVarA);
                he2 he2Var4 = hj6.y;
                dec.l(he2Var4, l46Var, u8aVarM);
                Integer numValueOf = Integer.valueOf(iHashCode);
                he2 he2Var5 = hj6.X;
                dec.l(he2Var5, l46Var, numValueOf);
                dec.k(l46Var);
                he2 he2Var6 = hj6.x;
                dec.l(he2Var6, l46Var, j09VarJ);
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                jw7 jw7Var = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                FillElement fillElement2 = androidx.compose.foundation.layout.b.b;
                j09 j09VarF2 = androidx.compose.foundation.layout.b.f(120.0f, 0.0f, jw7Var.D(fillElement2), 2);
                if (micVar == null) {
                    l46Var.f0(-1143019443);
                    long j4 = j3;
                    he2Var = he2Var4;
                    he2Var2 = he2Var6;
                    fillElement = fillElement2;
                    i4 = 0;
                    f2 = 8.0f;
                    k(ii6Var2, abg.c(zS ? 1304349183 : 1294413915), j4, 0L, Integer.valueOf(zS ? R.drawable.img_home_my_tarot_glow_light : R.drawable.img_home_my_tarot_glow_dark), afc.q(R.string.my_tarot_entry_title, l46Var), x16Var, j09VarF2, true, false, af1.b0(-342369286, new g20(16, tarotSkinIdentify), l46Var), l46Var, (i6 & 14) | 100663296 | ((i6 << 9) & 3670016), 520);
                    j = j4;
                    l46Var3 = l46Var;
                    l46Var3.r(false);
                } else {
                    he2Var = he2Var4;
                    he2Var2 = he2Var6;
                    fillElement = fillElement2;
                    i4 = 0;
                    f2 = 8.0f;
                    j = j3;
                    l46Var.f0(-1142338497);
                    if (z2) {
                        jC = y72.b(abg.d(4294962401L), 0.3f);
                    } else {
                        jC = zS ? abg.c(1307101061) : abg.c(1296774426);
                    }
                    if (z2) {
                        l46Var.f0(-36841610);
                        j2 = ((e8b) l46Var.k(l8b.a)).f;
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-36840809);
                        l46Var.r(false);
                        j2 = j;
                    }
                    if (z2) {
                        l46Var.f0(-36838684);
                        jW = bx5.f(l46Var);
                    } else {
                        l46Var.f0(-36837447);
                        jW = w(l46Var);
                    }
                    l46Var.r(false);
                    k(ii6Var, jC, j2, jW, z2 ? Integer.valueOf(R.drawable.img_home_autumn_glow) : null, afc.q(z7c.p(micVar.c()), l46Var), x16Var2, j09VarF2, true, false, af1.b0(1548816707, new g20(17, micVar), l46Var), l46Var, (i6 & 14) | 100663296 | ((i6 << 6) & 3670016), 512);
                    l46Var3 = l46Var;
                    l46Var3.r(false);
                }
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                j09 j09VarD = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).D(fillElement);
                c92 c92VarA = a92.a(new uc0(f2, true, new qc0(i4)), ndb.Y, l46Var3, 6);
                int iHashCode2 = Long.hashCode(l46Var3.T);
                u8a u8aVarM2 = l46Var3.m();
                j09 j09VarJ2 = m93.J(l46Var3, j09VarD);
                l46Var3.j0();
                if (l46Var3.S) {
                    l46Var3.l(ov7Var);
                } else {
                    l46Var3.s0();
                }
                dec.l(he2Var3, l46Var3, c92VarA);
                dec.l(he2Var, l46Var3, u8aVarM2);
                ib8.s(iHashCode2, l46Var3, he2Var5, l46Var3);
                dec.l(he2Var2, l46Var3, j09VarJ2);
                String strQ = afc.q(R.string.home_widget_entry_title, l46Var3);
                j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                l46 l46Var4 = l46Var3;
                long j5 = j;
                k(ii6Var, 0L, j5, 0L, null, strQ, x16Var3, androidx.compose.foundation.layout.b.f(56.0f, 0.0f, j09VarC.D(new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 2), false, false, jgb.f, l46Var4, (i6 & 14) | ((i6 << 3) & 3670016), 794);
                String strQ2 = afc.q(R.string.home_read_cards_entry_title, l46Var4);
                j09 j09VarC2 = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                k(ii6Var, 0L, j5, 0L, null, strQ2, x16Var4, androidx.compose.foundation.layout.b.f(56.0f, 0.0f, j09VarC2.D(new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 2), false, false, jgb.g, l46Var4, i6 & 3670030, 794);
                l46Var2 = l46Var4;
                l46Var2.r(true);
                l46Var2.r(true);
            } else {
                l46Var2 = l46Var;
                l46Var2.Z();
            }
            ojb ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new xn6(ii6Var, tarotSkinIdentify, micVar, x16Var, x16Var2, x16Var3, x16Var4, i2, 1);
            }
        }

        public static final void n(ii6 ii6Var, TarotSkinIdentify tarotSkinIdentify, mic micVar, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, l46 l46Var, int i2) {
            int i3;
            x16 x16Var5;
            l46 l46Var2;
            SolarTerm solarTermC;
            l46Var.h0(45698816);
            if ((i2 & 6) == 0) {
                i3 = (l46Var.g(ii6Var) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= l46Var.e(tarotSkinIdentify == null ? -1 : tarotSkinIdentify.ordinal()) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= l46Var.e(micVar != null ? micVar.ordinal() : -1) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i2 & 3072) == 0) {
                i3 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if ((i2 & 24576) == 0) {
                x16Var5 = x16Var2;
                i3 |= l46Var.i(x16Var5) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            } else {
                x16Var5 = x16Var2;
            }
            if ((196608 & i2) == 0) {
                i3 |= l46Var.i(x16Var3) ? 131072 : 65536;
            }
            if ((1572864 & i2) == 0) {
                i3 |= l46Var.i(x16Var4) ? 1048576 : 524288;
            }
            int i4 = 12582912 & i2;
            g09 g09Var = g09.a;
            if (i4 == 0) {
                i3 |= l46Var.g(g09Var) ? 8388608 : 4194304;
            }
            int i5 = i3;
            if (l46Var.W(i5 & 1, (i5 & 4793491) != 4793490)) {
                j09 j09VarF = urg.F(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), ia7.a);
                t7c t7cVarA = s7c.a(xc0.a, ndb.y, l46Var, 0);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarF);
                lf2.q.getClass();
                l46Var.j0();
                boolean z = l46Var.S;
                ov7 ov7Var = LayoutNode.h1;
                if (z) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                he2 he2Var = hj6.z;
                dec.l(he2Var, l46Var, t7cVarA);
                he2 he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var, u8aVarM);
                Integer numValueOf = Integer.valueOf(iHashCode);
                he2 he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var, numValueOf);
                dec.k(l46Var);
                he2 he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var, j09VarJ);
                String strQ = afc.q((micVar == null || (solarTermC = micVar.c()) == null) ? R.string.my_tarot_entry_title : z7c.p(solarTermC), l46Var);
                x16 x16Var6 = micVar == null ? x16Var : x16Var5;
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                jw7 jw7Var = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                FillElement fillElement = androidx.compose.foundation.layout.b.b;
                int i6 = i5 & 14;
                k(ii6Var, 0L, 0L, 0L, null, strQ, x16Var6, androidx.compose.foundation.layout.b.f(120.0f, 0.0f, jw7Var.D(fillElement), 2), true, true, af1.b0(378362592, new w7(26, micVar, tarotSkinIdentify), l46Var), l46Var, i6 | 905969664, 30);
                s(androidx.compose.foundation.layout.b.p(fillElement, 0.5f), l46Var, 6);
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                j09 j09VarD = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).D(fillElement);
                c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarD);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, c92VarA);
                dec.l(he2Var2, l46Var, u8aVarM2);
                ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ2);
                String strQ2 = afc.q(R.string.home_widget_entry_title, l46Var);
                j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                k(ii6Var, 0L, 0L, 0L, null, strQ2, x16Var3, androidx.compose.foundation.layout.b.f(56.0f, 0.0f, j09VarC.D(new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 2), false, false, jgb.h, l46Var, i6 | ((i5 << 3) & 3670016), 798);
                s(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 0.5f), l46Var, 6);
                String strQ3 = afc.q(R.string.home_read_cards_entry_title, l46Var);
                j09 j09VarC2 = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                k(ii6Var, 0L, 0L, 0L, null, strQ3, x16Var4, androidx.compose.foundation.layout.b.f(56.0f, 0.0f, j09VarC2.D(new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 2), false, false, jgb.i, l46Var, i5 & 3670030, 798);
                l46Var2 = l46Var;
                l46Var2.r(true);
                l46Var2.r(true);
                s(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 0.5f), l46Var2, 6);
            } else {
                l46Var2 = l46Var;
                l46Var2.Z();
            }
            ojb ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new xn6(ii6Var, tarotSkinIdentify, micVar, x16Var, x16Var2, x16Var3, x16Var4, i2, 0);
            }
        }

        public static final void o(Scene scene, boolean z, j09 j09Var, l46 l46Var, int i2) {
            int i3;
            Integer numValueOf;
            Object objI;
            l46Var.h0(1113861745);
            if ((i2 & 6) == 0) {
                i3 = (l46Var.i(scene) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= l46Var.h(z) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
                fy9 fy9VarA = null;
                if (z) {
                    l46Var.f0(138036556);
                    l46Var.r(false);
                    numValueOf = null;
                } else {
                    l46Var.f0(974284475);
                    String id = scene.getId();
                    boolean zS = g21.S(l46Var);
                    switch (id) {
                        case "shopping-decision":
                            numValueOf = Integer.valueOf(zS ? R.drawable.img_home_scene_shopping_decision_light : R.drawable.img_home_scene_shopping_decision_dark);
                            break;
                        case "career-path":
                            numValueOf = Integer.valueOf(zS ? R.drawable.img_home_scene_career_path_light : R.drawable.img_home_scene_career_path_dark);
                            break;
                        case "health-status":
                            numValueOf = Integer.valueOf(zS ? R.drawable.img_home_scene_health_status_light : R.drawable.img_home_scene_health_status_dark);
                            break;
                        case "choose-between-two":
                            numValueOf = Integer.valueOf(zS ? R.drawable.img_home_scene_choose_between_two_light : R.drawable.img_home_scene_choose_between_two_dark);
                            break;
                        case "event-prediction":
                            numValueOf = Integer.valueOf(zS ? R.drawable.img_home_scene_event_prediction_light : R.drawable.img_home_scene_event_prediction_dark);
                            break;
                        case "exam-luck":
                            numValueOf = Integer.valueOf(zS ? R.drawable.img_home_scene_exam_luck_light : R.drawable.img_home_scene_exam_luck_dark);
                            break;
                        case "relationship-insight":
                            numValueOf = Integer.valueOf(zS ? R.drawable.img_home_scene_relationship_insight_light : R.drawable.img_home_scene_relationship_insight_dark);
                            break;
                        case "social-relations":
                            numValueOf = Integer.valueOf(zS ? R.drawable.img_home_scene_social_relations_light : R.drawable.img_home_scene_social_relations_dark);
                            break;
                        case "yes-or-no":
                            numValueOf = Integer.valueOf(zS ? R.drawable.img_home_scene_yes_or_no_light : R.drawable.img_home_scene_yes_or_no_dark);
                            break;
                        case "job-opportunities":
                            numValueOf = Integer.valueOf(zS ? R.drawable.img_home_scene_job_opportunities_light : R.drawable.img_home_scene_job_opportunities_dark);
                            break;
                        case "their-real-thoughts":
                            numValueOf = Integer.valueOf(zS ? R.drawable.img_home_scene_their_real_thoughts_light : R.drawable.img_home_scene_their_real_thoughts_dark);
                            break;
                        case "relationship-reconciliation":
                            numValueOf = Integer.valueOf(zS ? R.drawable.img_home_scene_relationship_reconciliation_light : R.drawable.img_home_scene_relationship_reconciliation_dark);
                            break;
                        case "new-love":
                            numValueOf = Integer.valueOf(zS ? R.drawable.img_home_scene_new_love_light : R.drawable.img_home_scene_new_love_dark);
                            break;
                        case "choose-from-three":
                            numValueOf = Integer.valueOf(zS ? R.drawable.img_home_scene_choose_from_three_light : R.drawable.img_home_scene_choose_from_three_dark);
                            break;
                        case "daily-outfit-tips":
                            numValueOf = Integer.valueOf(zS ? R.drawable.img_home_scene_daily_outfit_tips_light : R.drawable.img_home_scene_daily_outfit_tips_dark);
                            break;
                        default:
                            numValueOf = null;
                            break;
                    }
                    l46Var.r(false);
                }
                if (numValueOf == null) {
                    l46Var.f0(138125557);
                } else {
                    l46Var.f0(138125558);
                    fy9VarA = od4.A(numValueOf.intValue(), 0, l46Var);
                }
                l46Var.r(false);
                if (fy9VarA == null) {
                    l46Var.f0(974287985);
                    scene.getClass();
                    pw6 pw6Var = new pw6((Context) l46Var.k(uq.b));
                    l46Var.f0(-1774838955);
                    if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                        l46Var.f0(-1774837420);
                        l46Var.r(false);
                        objI = Integer.valueOf(R.drawable.preview_yes_or_no);
                    } else if (k8b.f((e8b) l46Var.k(l8b.a))) {
                        l46Var.f0(-1774835072);
                        l46Var.r(false);
                        objI = ub3.i("file:///android_asset/scene/greyscale/", scene.getDarkImageURL());
                    } else {
                        l46Var.f0(-1774832546);
                        objI = "file:///android_asset/scene/" + (g21.S(l46Var) ? scene.getImageURL() : scene.getDarkImageURL());
                        l46Var.r(false);
                    }
                    l46Var.r(false);
                    pw6Var.c = objI;
                    pw6Var.i = m81.a;
                    pw6Var.k = zdc.b;
                    fy9VarA = ndc.j(pw6Var.a(), l46Var);
                } else {
                    l46Var.f0(974286621);
                }
                l46Var.r(false);
                feg.j(fy9VarA, null, j09Var, null, an2.b, 0.0f, null, l46Var, 24632 | (i3 & 896), 104);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new i30(scene, z, j09Var, i2, 6);
            }
        }

        public static final void p(int i2, l46 l46Var, j09 j09Var, String str) {
            mue mueVarF;
            long j;
            l46 l46Var2 = l46Var;
            String str2 = str;
            str2.getClass();
            l46Var2.h0(469083989);
            int i3 = i2 | (l46Var2.g(str2) ? 4 : 2);
            if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
                pr4 pr4Var = l8b.a;
                boolean zF = k8b.f((e8b) l46Var2.k(pr4Var));
                if (zF) {
                    l46Var2.f0(-1342292182);
                    mue mueVar = pue.a;
                    mueVarF = mue.a(pue.q(l46Var2), 0L, 0L, ar5.b, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777179);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-1342159316);
                    mue mueVar2 = pue.a;
                    mueVarF = pue.f(l46Var2);
                    l46Var2.r(false);
                }
                mue mueVar3 = mueVarF;
                j09 j09VarH = k8b.h(androidx.compose.foundation.layout.b.c(j09Var, 1.0f), new ie2(18), l46Var2, 0);
                t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
                int iHashCode = Long.hashCode(l46Var2.T);
                u8a u8aVarM = l46Var2.m();
                j09 j09VarJ = m93.J(l46Var2, j09VarH);
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
                if (zF) {
                    l46Var2.f0(-2132425688);
                    j = ((e8b) l46Var2.k(pr4Var)).s;
                } else {
                    l46Var2.f0(-2132424789);
                    j = ((e8b) l46Var2.k(pr4Var)).t;
                }
                l46Var2.r(false);
                nte.b(str, null, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar3, l46Var2, i3 & 14, 0, 131066);
                str2 = str;
                l46Var2 = l46Var2;
                l46Var2.r(true);
            } else {
                l46Var2.Z();
            }
            ojb ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new p8(str2, j09Var, i2, 8);
            }
        }

        public static final void q(j09 j09Var, l46 l46Var, int i2) {
            l46Var.h0(-742568618);
            int i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
            int i4 = 1;
            if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
                j(R.drawable.img_home_physical_cards_classic, R.drawable.img_home_physical_cards_neo, j09Var, l46Var, (i3 << 6) & 896);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new do6(i2, i4, j09Var);
            }
        }

        public static final void r(ii6 ii6Var, Scene scene, x16 x16Var, j09 j09Var, l46 l46Var, int i2) {
            l46 l46Var2;
            int i3;
            g09 g09Var;
            boolean z;
            boolean z2;
            j09 j09VarU;
            l46 l46Var3;
            scene.getClass();
            x16Var.getClass();
            l46Var.h0(-1465003334);
            int i4 = i2 | (l46Var.g(ii6Var) ? 4 : 2) | (l46Var.i(scene) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
            if (l46Var.W(i4 & 1, (i4 & 1171) != 1170)) {
                pr4 pr4Var = l8b.a;
                boolean zF = k8b.f((e8b) l46Var.k(pr4Var));
                y6c y6cVarB = zF ? a7c.b(0.0f) : a7c.b(24.0f);
                g09 g09Var2 = g09.a;
                if (zF) {
                    l46Var.f0(1543637817);
                    j09VarU = tm7.o(oa7.E(g09Var2, y6cVarB), ((e8b) l46Var.k(pr4Var)).a, g21.f);
                    l46Var.r(false);
                    z = zF;
                    i3 = 0;
                    g09Var = g09Var2;
                    l46Var3 = l46Var;
                    z2 = true;
                } else {
                    l46Var.f0(1543725237);
                    i3 = 0;
                    g09Var = g09Var2;
                    z = zF;
                    z2 = true;
                    j09VarU = u(y6cVarB, ii6Var, y72.j, g21.S(l46Var) ? e : f, 0L, null, l46Var, 112);
                    l46Var3 = l46Var;
                    l46Var3.r(false);
                }
                float f2 = z ? 32.0f : 12.0f;
                float f3 = z ? 8.0f : 0.0f;
                j09 j09VarC0 = ynb.c0(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.b.f(96.0f, 0.0f, androidx.compose.foundation.layout.b.c(j09Var, 1.0f), 2).D(j09VarU), false, null, null, x16Var, 15), f2, f3, 12.0f, f3);
                t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var3, 48);
                int iHashCode = Long.hashCode(l46Var3.T);
                u8a u8aVarM = l46Var3.m();
                j09 j09VarJ = m93.J(l46Var3, j09VarC0);
                lf2.q.getClass();
                l46Var3.j0();
                boolean z3 = l46Var3.S;
                ov7 ov7Var = LayoutNode.h1;
                if (z3) {
                    l46Var3.l(ov7Var);
                } else {
                    l46Var3.s0();
                }
                he2 he2Var = hj6.z;
                dec.l(he2Var, l46Var3, t7cVarA);
                he2 he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var3, u8aVarM);
                Integer numValueOf = Integer.valueOf(iHashCode);
                he2 he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var3, numValueOf);
                dec.k(l46Var3);
                he2 he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var3, j09VarJ);
                g09 g09Var3 = g09Var;
                o(scene, z, androidx.compose.foundation.layout.b.l(g09Var3, 80.0f), l46Var3, ((i4 >> 3) & 14) | 384);
                j09 j09VarD = ynb.d0(16.0f, 0.0f, 0.0f, 0.0f, 14, g09Var3).D(new jw7(1.0f, z2));
                c92 c92VarA = a92.a(new uc0(4.0f, z2, new qc0(i3)), ndb.Y, l46Var3, 6);
                int iHashCode2 = Long.hashCode(l46Var3.T);
                u8a u8aVarM2 = l46Var3.m();
                j09 j09VarJ2 = m93.J(l46Var3, j09VarD);
                l46Var3.j0();
                if (l46Var3.S) {
                    l46Var3.l(ov7Var);
                } else {
                    l46Var3.s0();
                }
                dec.l(he2Var, l46Var3, c92VarA);
                dec.l(he2Var2, l46Var3, u8aVarM2);
                ib8.s(iHashCode2, l46Var3, he2Var3, l46Var3);
                dec.l(he2Var4, l46Var3, j09VarJ2);
                String title = scene.getTitle();
                mue mueVar = pue.a;
                l46 l46Var4 = l46Var3;
                nte.b(title, null, ((e8b) l46Var3.k(pr4Var)).q, 0L, ar5.e, ((y8b) l46Var3.k(x8b.a)).a, 0L, null, null, 0L, 2, false, 2, 0, null, pue.p(l46Var3), l46Var4, 1572864, 24960, 110394);
                nte.b(scene.getSubTitle(), null, ((e8b) l46Var4.k(pr4Var)).s, 0L, null, null, 0L, null, null, 0L, 2, false, 4, 0, null, pue.g(l46Var4), l46Var, 0, 24960, 110586);
                l46Var2 = l46Var;
                l46Var2.r(z2);
                i(6, 0, l46Var2, ynb.d0(8.0f, 0.0f, 0.0f, 0.0f, 14, g09Var3));
                l46Var2.r(z2);
                if (z) {
                    l46Var2.f0(1545196404);
                    s(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var3, 1.0f), 0.5f), l46Var2, 6);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(1545277128);
                    l46Var2.r(false);
                }
            } else {
                l46Var2 = l46Var;
                l46Var2.Z();
            }
            ojb ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new q8(ii6Var, scene, x16Var, j09Var, i2, 25);
            }
        }

        public static final void s(j09 j09Var, l46 l46Var, int i2) {
            l46Var.h0(1015194391);
            if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
                s21.a(tm7.o(j09Var, ((e8b) l46Var.k(l8b.a)).A, g21.f), l46Var, 0);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l50(i2, 29, j09Var);
            }
        }

        public static final void t(j09 j09Var, l46 l46Var, int i2) {
            l46Var.h0(1421538626);
            int i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
            int i4 = 0;
            if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
                j(R.drawable.img_home_widget_classic, R.drawable.img_home_widget_neo, j09Var, l46Var, (i3 << 6) & 896);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new do6(i2, i4, j09Var);
            }
        }

        public static final j09 u(y6c y6cVar, ii6 ii6Var, long j, long j2, long j3, Integer num, l46 l46Var, int i2) {
            fy9 fy9VarA;
            long jW = (i2 & 16) != 0 ? w(l46Var) : j3;
            Integer num2 = (i2 & 32) != 0 ? null : num;
            g21.S(l46Var);
            int i3 = 0;
            if (num2 == null) {
                l46Var.f0(318491068);
                l46Var.r(false);
                fy9VarA = null;
            } else {
                l46Var.f0(318491069);
                fy9VarA = od4.A(num2.intValue(), 0, l46Var);
                l46Var.r(false);
            }
            n4d n4dVar = new n4d(20.0f, d, 0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L), 52);
            j09 j09VarT = g09.a;
            j09 j09VarD = z7f.J(oa7.E(db6.w(rrb.h(j09VarT, y6cVar, n4dVar), 0.5f, jW, y6cVar), y6cVar), ii6Var, new ji6(24.0f, 24, y72.j), null, 4).D(j09VarT);
            y02 y02Var = g21.f;
            j09 j09VarO = tm7.o(tm7.o(j09VarD, j, y02Var), j2, y02Var);
            if (fy9VarA != null) {
                l46Var.f0(319262411);
                boolean zI = l46Var.i(fy9VarA);
                Object objR = l46Var.R();
                if (zI || objR == sf2.a) {
                    objR = new yn6(fy9VarA, i3);
                    l46Var.p0(objR);
                }
                j09VarT = b21.t(j09VarT, (a26) objR);
                l46Var.r(false);
            } else {
                l46Var.f0(319435422);
                l46Var.r(false);
            }
            return j09VarO.D(j09VarT);
        }

        public static final j09 v(c31 c31Var) {
            return androidx.compose.foundation.layout.b.l(c31Var.a(g09.a, ndb.g), 44.0f);
        }

        public static final long w(l46 l46Var) {
            if (!g21.S(l46Var)) {
                l46Var.f0(648128447);
                l46Var.r(false);
                return abg.c(352321535);
            }
            l46Var.f0(648088147);
            long jK = l8b.k(l46Var);
            l46Var.r(false);
            return jK;
        }
    }

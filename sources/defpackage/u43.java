package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.explore.model.DailyCardBasicInfo;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u43 implements l26 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ s69 b;
    public final /* synthetic */ DailyCardBasicInfo c;
    public final /* synthetic */ TarotSkinIdentify d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ a26 v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ ji6 x;
    public final /* synthetic */ long y;
    public final /* synthetic */ qhe z;

    public /* synthetic */ u43(s69 s69Var, DailyCardBasicInfo dailyCardBasicInfo, TarotSkinIdentify tarotSkinIdentify, boolean z, boolean z2, boolean z3, a26 a26Var, boolean z4, ji6 ji6Var, long j, qhe qheVar, boolean z5, long j2) {
        this.b = s69Var;
        this.c = dailyCardBasicInfo;
        this.d = tarotSkinIdentify;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.v = a26Var;
        this.w = z4;
        this.x = ji6Var;
        this.y = j;
        this.z = qheVar;
        this.X = z5;
        this.Y = j2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    j09 j09VarC = b.c(g09.a, 1.0f);
                    final DailyCardBasicInfo dailyCardBasicInfo = this.c;
                    final TarotSkinIdentify tarotSkinIdentify = this.d;
                    final boolean z = this.e;
                    final boolean z2 = this.f;
                    final boolean z3 = this.g;
                    final a26 a26Var = this.v;
                    final s69 s69Var = this.b;
                    final boolean z4 = this.w;
                    final ji6 ji6Var = this.x;
                    final long j = this.y;
                    final qhe qheVar = this.z;
                    final boolean z5 = this.X;
                    final long j2 = this.Y;
                    nk8.d(j09VarC, null, af1.b0(-215608432, new n26() { // from class: x43
                        @Override // defpackage.n26
                        public final Object m(Object obj3, Object obj4, Object obj5) {
                            he2 he2Var;
                            he2 he2Var2;
                            he2 he2Var3;
                            float f;
                            g09 g09Var;
                            qhe qheVar2;
                            TarotSkinIdentify tarotSkinIdentify2;
                            boolean z6;
                            ov7 ov7Var;
                            g09 g09Var2;
                            e31 e31Var = (e31) obj3;
                            l46 l46Var2 = (l46) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            e31Var.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= l46Var2.g(e31Var) ? 4 : 2;
                            }
                            if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                float fD = e31Var.d() / 0.56384504f;
                                mue mueVar = pue.a;
                                mue mueVarA = mue.a(pue.n(l46Var2), 0L, w6c.l(32), null, cr5.b(), 0L, null, 0, w6c.l(44), null, null, 16646109);
                                sw3 sw3Var = (sw3) l46Var2.k(zg2.h);
                                aue aueVarA = uyb.A(0, 1, l46Var2);
                                int iD0 = sw3Var.D0(e31Var.d() - 64.0f);
                                DailyCardBasicInfo dailyCardBasicInfo2 = dailyCardBasicInfo;
                                boolean zG = l46Var2.g(dailyCardBasicInfo2.getAffirmation()) | l46Var2.g(mueVarA) | l46Var2.e(iD0) | l46Var2.g(aueVarA);
                                Object objR = l46Var2.R();
                                i8c i8cVar = sf2.a;
                                if (zG || objR == i8cVar) {
                                    objR = Integer.valueOf(aue.a(aueVarA, dailyCardBasicInfo2.getAffirmation(), mueVarA, ll2.b(0, iD0, 0, 0, 13), 988).b.f);
                                    l46Var2.p0(objR);
                                }
                                int iIntValue3 = ((Number) objR).intValue();
                                TarotSkinIdentify tarotSkinIdentify3 = tarotSkinIdentify;
                                float aspectRatio = tarotSkinIdentify3.getAspectRatio();
                                float f2 = aspectRatio / 0.5714286f;
                                int i2 = iIntValue3 - 2;
                                if (i2 < 0) {
                                    i2 = 0;
                                }
                                float f3 = ((yi4) mh3.l(new yi4((144.0f * f2) - ((44.0f * i2) * aspectRatio)), new yi4(120.0f * f2))).a;
                                g09 g09Var3 = g09.a;
                                j09 j09VarF = b.f(fD, 0.0f, b.c(g09Var3, 1.0f), 2);
                                y02 y02Var = g21.f;
                                j09 j09VarE = oa7.E(j09VarF, y02Var);
                                int iJ = ((sz9) s69Var).j();
                                boolean zS = g21.S(l46Var2);
                                boolean z7 = z && z2;
                                Integer numValueOf = Integer.valueOf(iJ);
                                a26 a26Var2 = a26Var;
                                boolean zG2 = l46Var2.g(a26Var2);
                                Object objR2 = l46Var2.R();
                                int i3 = 3;
                                if (zG2 || objR2 == i8cVar) {
                                    objR2 = new k50(a26Var2, i3);
                                    l46Var2.p0(objR2);
                                }
                                j09 j09VarZ = dj6.z(16, (l26) objR2, j09VarE, numValueOf, "daily_card", zS, z7, z3);
                                lx0 lx0Var = ndb.b;
                                xn8 xn8VarC = s21.c(lx0Var, false);
                                int iHashCode = Long.hashCode(l46Var2.T);
                                u8a u8aVarM = l46Var2.m();
                                j09 j09VarJ = m93.J(l46Var2, j09VarZ);
                                lf2.q.getClass();
                                l46Var2.j0();
                                boolean z8 = l46Var2.S;
                                ov7 ov7Var2 = LayoutNode.h1;
                                if (z8) {
                                    l46Var2.l(ov7Var2);
                                } else {
                                    l46Var2.s0();
                                }
                                he2 he2Var4 = hj6.z;
                                dec.l(he2Var4, l46Var2, xn8VarC);
                                he2 he2Var5 = hj6.y;
                                dec.l(he2Var5, l46Var2, u8aVarM);
                                Integer numValueOf2 = Integer.valueOf(iHashCode);
                                he2 he2Var6 = hj6.X;
                                dec.l(he2Var6, l46Var2, numValueOf2);
                                dec.k(l46Var2);
                                he2 he2Var7 = hj6.x;
                                dec.l(he2Var7, l46Var2, j09VarJ);
                                boolean z9 = z4;
                                qhe qheVar3 = qheVar;
                                d31 d31Var = d31.a;
                                if (z9) {
                                    l46Var2.f0(-1185859610);
                                    s21.a(tm7.o(d31Var.b(g09Var3), ((e8b) l46Var2.k(l8b.a)).a, y02Var), l46Var2, 0);
                                    l46Var2.r(false);
                                    qheVar2 = qheVar3;
                                    he2Var = he2Var4;
                                    he2Var3 = he2Var5;
                                    he2Var2 = he2Var7;
                                    tarotSkinIdentify2 = tarotSkinIdentify3;
                                    f = fD;
                                    g09Var = g09Var3;
                                } else {
                                    l46Var2.f0(-1185672432);
                                    j09 j09VarK = z7f.K(d31Var.b(g09Var3), ji6Var, 2);
                                    xn8 xn8VarC2 = s21.c(lx0Var, false);
                                    int iHashCode2 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM2 = l46Var2.m();
                                    j09 j09VarJ2 = m93.J(l46Var2, j09VarK);
                                    l46Var2.j0();
                                    if (l46Var2.S) {
                                        l46Var2.l(ov7Var2);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    dec.l(he2Var4, l46Var2, xn8VarC2);
                                    dec.l(he2Var5, l46Var2, u8aVarM2);
                                    ib8.s(iHashCode2, l46Var2, he2Var6, l46Var2);
                                    dec.l(he2Var7, l46Var2, j09VarJ2);
                                    he2Var = he2Var4;
                                    he2Var2 = he2Var7;
                                    he2Var3 = he2Var5;
                                    f = fD;
                                    g09Var = g09Var3;
                                    o7c.d(eec.s(d31Var.b(g09Var3), 1.65f, 1.65f), qheVar3, tarotSkinIdentify3, false, an2.a, 0.0f, null, false, l46Var2, 221184, 200);
                                    qheVar2 = qheVar3;
                                    tarotSkinIdentify2 = tarotSkinIdentify3;
                                    l46Var2 = l46Var2;
                                    l46Var2.r(true);
                                    if (((Boolean) l46Var2.k(h57.a)).booleanValue()) {
                                        l46Var2.f0(-1185169240);
                                        z6 = false;
                                        s21.a(tm7.o(d31Var.b(g09Var), j, y02Var), l46Var2, 0);
                                        l46Var2.r(false);
                                    } else {
                                        z6 = false;
                                        l46Var2.f0(-1185011636);
                                        l46Var2.r(false);
                                    }
                                    l46Var2.r(z6);
                                }
                                j09 j09VarC0 = ynb.c0(b.f(f, 0.0f, b.c(g09Var, 1.0f), 2), 32.0f, 16.0f, 32.0f, 24.0f);
                                jx0 jx0Var = ndb.Z;
                                c92 c92VarA = a92.a(xc0.g, jx0Var, l46Var2, 54);
                                int iHashCode3 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM3 = l46Var2.m();
                                j09 j09VarJ3 = m93.J(l46Var2, j09VarC0);
                                l46Var2.j0();
                                if (l46Var2.S) {
                                    ov7Var = ov7Var2;
                                    l46Var2.l(ov7Var);
                                } else {
                                    ov7Var = ov7Var2;
                                    l46Var2.s0();
                                }
                                he2 he2Var8 = he2Var;
                                dec.l(he2Var8, l46Var2, c92VarA);
                                he2 he2Var9 = he2Var3;
                                dec.l(he2Var9, l46Var2, u8aVarM3);
                                ib8.s(iHashCode3, l46Var2, he2Var6, l46Var2);
                                he2 he2Var10 = he2Var2;
                                dec.l(he2Var10, l46Var2, j09VarJ3);
                                sc0 sc0Var = xc0.c;
                                c92 c92VarA2 = a92.a(sc0Var, jx0Var, l46Var2, 48);
                                int iHashCode4 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM4 = l46Var2.m();
                                j09 j09VarJ4 = m93.J(l46Var2, g09Var);
                                l46Var2.j0();
                                if (l46Var2.S) {
                                    l46Var2.l(ov7Var);
                                } else {
                                    l46Var2.s0();
                                }
                                dec.l(he2Var8, l46Var2, c92VarA2);
                                dec.l(he2Var9, l46Var2, u8aVarM4);
                                ib8.s(iHashCode4, l46Var2, he2Var6, l46Var2);
                                dec.l(he2Var10, l46Var2, j09VarJ4);
                                b53.h(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0321: INVOKE 
                                      (wrap java.lang.String:0x031c: INVOKE (r18v1 ?? I:??[OBJECT, ARRAY]) VIRTUAL call: ai.askquin.ui.explore.model.DailyCardBasicInfo.getDate():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:797))
                                      (r6v4 'l46Var2' l46)
                                      (0 int)
                                     STATIC call: b53.h(java.lang.String, l46, int):void A[MD:(java.lang.String, l46, int):void (m)] (LINE:802) in method: x43.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: classes.dex
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
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
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
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v1 ??
                                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                    */
                                /*
                                    Method dump skipped, instruction units count: 1257
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.x43.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, l46Var), l46Var, 3078, 6);
                    }
                    break;
                default:
                    l46 l46Var2 = (l46) obj;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        l46Var2.Z();
                    } else {
                        pr4 pr4Var = o10.a;
                        s69 s69Var2 = this.b;
                        boolean zG = l46Var2.g(s69Var2);
                        Object objR = l46Var2.R();
                        if (zG || objR == sf2.a) {
                            objR = new q50(s69Var2, 1);
                            l46Var2.p0(objR);
                        }
                        mh3.a(pr4Var.a((x16) objR), af1.b0(3125946, new u43(this.c, this.d, this.e, this.f, this.g, this.v, s69Var2, this.w, this.x, this.y, this.z, this.X, this.Y), l46Var2), l46Var2, 56);
                    }
                    break;
            }
            return wefVar;
        }

        public /* synthetic */ u43(DailyCardBasicInfo dailyCardBasicInfo, TarotSkinIdentify tarotSkinIdentify, boolean z, boolean z2, boolean z3, a26 a26Var, s69 s69Var, boolean z4, ji6 ji6Var, long j, qhe qheVar, boolean z5, long j2) {
            this.c = dailyCardBasicInfo;
            this.d = tarotSkinIdentify;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.v = a26Var;
            this.b = s69Var;
            this.w = z4;
            this.x = ji6Var;
            this.y = j;
            this.z = qheVar;
            this.X = z5;
            this.Y = j2;
        }
    }

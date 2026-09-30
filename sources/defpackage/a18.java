package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a18 implements tz7 {
    public final /* synthetic */ j18 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xw9 c;
    public final /* synthetic */ x16 d;
    public final /* synthetic */ wc0 e;
    public final /* synthetic */ tc0 f;
    public final /* synthetic */ aw2 g;
    public final /* synthetic */ ie6 h;
    public final /* synthetic */ w1e i;
    public final /* synthetic */ xi j;
    public final /* synthetic */ kx0 k;

    public a18(j18 j18Var, boolean z, xw9 xw9Var, sn7 sn7Var, wc0 wc0Var, tc0 tc0Var, aw2 aw2Var, ie6 ie6Var, w1e w1eVar, xi xiVar, kx0 kx0Var) {
        this.a = j18Var;
        this.b = z;
        this.c = xw9Var;
        this.d = sn7Var;
        this.e = wc0Var;
        this.f = tc0Var;
        this.g = aw2Var;
        this.h = ie6Var;
        this.i = w1eVar;
        this.j = xiVar;
        this.k = kx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:306:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:307:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:310:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:312:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:315:0x0711  */
    /* JADX WARN: Code duplicated, block: B:317:0x0719  */
    /* JADX WARN: Code duplicated, block: B:318:0x0720  */
    /* JADX WARN: Code duplicated, block: B:319:0x0722  */
    /* JADX WARN: Code duplicated, block: B:321:0x072a  */
    /* JADX WARN: Code duplicated, block: B:323:0x0732  */
    /* JADX WARN: Code duplicated, block: B:325:0x073a  */
    /* JADX WARN: Code duplicated, block: B:327:0x0745  */
    /* JADX WARN: Code duplicated, block: B:328:0x074b  */
    /* JADX WARN: Code duplicated, block: B:330:0x0753  */
    /* JADX WARN: Code duplicated, block: B:335:0x0761  */
    /* JADX WARN: Code duplicated, block: B:338:0x078c  */
    /* JADX WARN: Code duplicated, block: B:339:0x0791  */
    /* JADX WARN: Code duplicated, block: B:341:0x0794  */
    /* JADX WARN: Code duplicated, block: B:342:0x0799  */
    /* JADX WARN: Code duplicated, block: B:345:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:346:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:349:0x07ad A[LOOP:13: B:348:0x07ab->B:349:0x07ad, LOOP_END] */
    @Override // defpackage.tz7
    public final yn8 a(uz7 uz7Var, long j) {
        float f;
        z08 z08Var;
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        c18 c18Var;
        int i7;
        List arrayList;
        int i8;
        float f3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i9;
        int i10;
        oz7 oz7Var;
        float f4;
        boolean z;
        int iF;
        c18 c18Var2;
        int i11;
        c18 c18Var3;
        int i12;
        ArrayList arrayList5;
        List listR;
        c18 c18Var4;
        Integer numValueOf;
        c18 c18Var5;
        Integer numValueOf2;
        boolean z2;
        int iIntValue;
        int iIntValue2;
        ks9 ks9Var;
        int size;
        int i13;
        int i14;
        b18 b18Var;
        r6e r6eVar;
        c18 c18Var6;
        c18 c18Var7;
        ArrayList arrayList6;
        int[] iArr;
        int i15;
        r6e r6eVar2 = uz7Var.b;
        j18 j18Var = this.a;
        j18Var.t.getValue();
        boolean z3 = j18Var.b || r6eVar2.k0();
        ks9 ks9Var2 = ks9.b;
        ks9 ks9Var3 = ks9.a;
        boolean z4 = this.b;
        y41.e(j, z4 ? ks9Var3 : ks9Var2);
        xw9 xw9Var = this.c;
        int iD0 = z4 ? r6eVar2.D0(xw9Var.b(r6eVar2.getLayoutDirection())) : r6eVar2.D0(ynb.B(xw9Var, r6eVar2.getLayoutDirection()));
        int iD1 = z4 ? r6eVar2.D0(xw9Var.c(r6eVar2.getLayoutDirection())) : r6eVar2.D0(ynb.A(xw9Var, r6eVar2.getLayoutDirection()));
        int iD2 = r6eVar2.D0(xw9Var.d());
        int iD3 = r6eVar2.D0(xw9Var.a()) + iD2;
        int i16 = iD0 + iD1;
        int i17 = z4 ? iD3 : i16;
        int i18 = z4 ? iD2 : !z4 ? iD0 : iD1;
        int i19 = i17 - i18;
        long jI = ll2.i(-i16, -iD3, j);
        w08 w08Var = (w08) this.d.invoke();
        mx7 mx7Var = w08Var.c;
        int iH = kl2.h(jI);
        int iG = kl2.g(jI);
        mx7Var.a.k(iH);
        mx7Var.b.k(iG);
        tc0 tc0Var = this.f;
        wc0 wc0Var = this.e;
        if (z4) {
            if (wc0Var == null) {
                throw ub3.e("null verticalArrangement when isVertical == true");
            }
            f = wc0Var.f();
        } else {
            if (tc0Var == null) {
                throw ub3.e("null horizontalAlignment when isVertical == false");
            }
            f = tc0Var.f();
        }
        int iD4 = r6eVar2.D0(f);
        int iA = w08Var.a();
        long j3 = (((long) iD0) << 32) | (((long) iD2) & 4294967295L);
        int iG2 = z4 ? kl2.g(j) - iD3 : kl2.h(j) - i16;
        int i20 = i18;
        z08 z08Var2 = new z08(jI, this.b, w08Var, uz7Var, iA, iD4, this.j, this.k, i20, i19, j3, this.a);
        w08 w08Var2 = z08Var2.c;
        os osVar = w08Var2.d;
        ird irdVarJ = iqf.j();
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            cx7 cx7Var = j18Var.e;
            int iJ = cx7Var.b.j();
            int I = db6.I(w08Var, cx7Var.e, iJ);
            if (iJ != I) {
                cx7Var.b.k(I);
                cx7Var.f.c(iJ);
            }
            int iJ2 = cx7Var.c.j();
            iqf.p(irdVarJ, irdVarL, a26VarE);
            p69 p69VarJ = mh3.j(w08Var, j18Var.s, j18Var.p);
            float fFloatValue = (r6eVar2.k0() || !z3) ? j18Var.h : ((Number) j18Var.x.b.b.getValue()).floatValue();
            oz7 oz7Var2 = j18Var.o;
            boolean zK0 = r6eVar2.k0();
            e89 e89Var = j18Var.w;
            boolean z5 = j18Var.i;
            if (i20 < 0) {
                l37.a("invalid beforeContentPadding");
            }
            if (i19 < 0) {
                l37.a("invalid afterContentPadding");
            }
            qu4 qu4Var = qu4.a;
            int i21 = iJ2;
            boolean z6 = this.b;
            aw2 aw2Var = this.g;
            ie6 ie6Var = this.h;
            pu4 pu4Var = pu4.a;
            if (iA <= 0) {
                int iJ3 = kl2.j(jI);
                int i22 = kl2.i(jI);
                oz7Var2.d(0, iJ3, i22, new ArrayList(), osVar, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01e0: INVOKE 
                      (r6v8 'oz7Var2' oz7)
                      (0 int)
                      (r19v11 'iJ3' int)
                      (r20v3 'i22' int)
                      (wrap java.util.ArrayList:0x01cf: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:464) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR)
                      (r3v1 'osVar' os)
                      (r2v4 z08)
                      (r2v7 'z6' boolean)
                      (r25v0 'zK0' boolean)
                      (1 int)
                      (r27v1 'z3' boolean)
                      (0 int)
                      (0 int)
                      (r2v8 'aw2Var' aw2)
                      (r2v9 'ie6Var' ie6)
                     VIRTUAL call: oz7.d(int, int, int, java.util.ArrayList, os, m4, boolean, boolean, int, boolean, int, int, aw2, ie6):void A[MD:(int, int, int, java.util.ArrayList, os, m4, boolean, boolean, int, boolean, int, int, aw2, ie6):void (m)] (LINE:481) in method: a18.a(uz7, long):yn8, file: classes.dex
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v4 z08
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 2034
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.a18.a(uz7, long):yn8");
            }
        }

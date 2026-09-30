package defpackage;

import ai.askquin.ui.account.component.AuthOption;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hv9 implements n26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ a26 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ m26 w;

    public /* synthetic */ hv9(bd4 bd4Var, boolean z, a26 a26Var, boolean z2, boolean z3, d6f d6fVar, x16 x16Var, x16 x16Var2) {
        this.f = bd4Var;
        this.b = z;
        this.c = a26Var;
        this.d = z2;
        this.e = z3;
        this.g = d6fVar;
        this.v = x16Var;
        this.w = x16Var2;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x02be  */
    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        i8c i8cVar;
        l46 l46Var;
        he2 he2Var;
        i8c i8cVar2;
        boolean zG;
        Object objR;
        int i = this.a;
        wef wefVar = wef.a;
        m26 m26Var = this.w;
        boolean z = this.e;
        Object obj4 = this.v;
        boolean z2 = this.d;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                boolean z3 = false;
                bd4 bd4Var = (bd4) obj6;
                d6f d6fVar = (d6f) obj5;
                x16 x16Var = (x16) obj4;
                x16 x16Var2 = (x16) m26Var;
                d92 d92Var = (d92) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                d92Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var2.g(d92Var) ? 4 : 2;
                }
                if (!l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    l46Var2.Z();
                } else {
                    String str = bd4Var.a;
                    boolean z4 = z2 && !z;
                    if (d6fVar != d6f.b && d6fVar != d6f.c) {
                        z3 = true;
                    }
                    vd0.k(d92Var, null, str, true, this.b, this.c, new khb(x16Var, x16Var2, z4, z3), l46Var2, (iIntValue & 14) | 3072, 1);
                }
                break;
            default:
                AuthOption authOption = (AuthOption) obj6;
                a26 a26Var = (a26) obj5;
                use useVar = (use) obj4;
                a26 a26Var2 = (a26) m26Var;
                l46 l46Var3 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var3.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var3.Z();
                } else {
                    j09 j09VarN = mh3.N(b.c);
                    c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var3, 48);
                    int iHashCode = Long.hashCode(l46Var3.T);
                    u8a u8aVarM = l46Var3.m();
                    j09 j09VarJ = m93.J(l46Var3, j09VarN);
                    lf2.q.getClass();
                    l46Var3.j0();
                    boolean z5 = l46Var3.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z5) {
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
                    g09 g09Var = g09.a;
                    o5c.f(l46Var3, b.d(g09Var, 10.0f));
                    Object objR2 = l46Var3.R();
                    i8c i8cVar3 = sf2.a;
                    if (objR2 == i8cVar3) {
                        objR2 = s72.j1(s72.A0(qd0.I0(new AuthOption[]{AuthOption.Email, AuthOption.Phone}), feg.I()));
                        l46Var3.p0(objR2);
                    }
                    List list = (List) objR2;
                    if (list.size() > 1) {
                        l46Var3.f0(-345731991);
                        int size = list.size();
                        int iIndexOf = list.indexOf(authOption);
                        agb agbVar = new agb(13);
                        boolean zG2 = l46Var3.g(a26Var) | l46Var3.i(list);
                        Object objR3 = l46Var3.R();
                        if (zG2 || objR3 == i8cVar3) {
                            objR3 = new bnd(a26Var, list);
                            l46Var3.p0(objR3);
                        }
                        i8cVar = i8cVar3;
                        he2Var = he2Var5;
                        scc.b(null, size, false, agbVar, null, iIndexOf, (a26) objR3, l46Var3, 0, 45);
                        l46Var = l46Var3;
                        l46Var.r(false);
                    } else {
                        i8cVar = i8cVar3;
                        l46Var = l46Var3;
                        he2Var = he2Var5;
                        l46Var.f0(-345390588);
                        l46Var.r(false);
                    }
                    o5c.f(l46Var, b.d(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0144: INVOKE 
                          (r12v11 'l46Var' l46)
                          (wrap j09:0x0140: INVOKE (r41v1 ?? I:??[OBJECT, ARRAY]), (32.0f float) STATIC call: androidx.compose.foundation.layout.b.d(j09, float):j09 A[MD:(j09, float):j09 (m), WRAPPED] (LINE:321))
                         STATIC call: o5c.f(l46, j09):void A[MD:(l46, j09):void (m)] (LINE:325) in method: hv9.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r41v1 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 886
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.hv9.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }

                public /* synthetic */ hv9(boolean z, a26 a26Var, AuthOption authOption, a26 a26Var2, boolean z2, l26 l26Var, x16 x16Var, use useVar, boolean z3, a26 a26Var3) {
                    this.b = z;
                    this.c = a26Var;
                    this.f = authOption;
                    this.g = a26Var2;
                    this.d = z2;
                    this.v = useVar;
                    this.e = z3;
                    this.w = a26Var3;
                }
            }

package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import android.content.res.Resources;
import android.icu.text.RelativeDateTimeFormatter;
import android.text.TextUtils;
import android.text.format.DateFormat;
import androidx.compose.foundation.layout.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import tech.chatmind.api.events.model.PopupTrackingEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rfc {
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x014a  */
    /* JADX WARN: Code duplicated, block: B:51:0x015f  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    public static final void a(final use useVar, final j09 j09Var, boolean z, mue mueVar, rpe rpeVar, final l26 l26Var, wo7 wo7Var, final ype ypeVar, ghc ghcVar, x4d x4dVar, final wne wneVar, xw9 xw9Var, l46 l46Var, final int i, final int i2) {
        final mue mueVar2;
        int i3;
        int i4;
        char c;
        boolean z2;
        final boolean z3;
        final rpe rpeVar2;
        final wo7 wo7Var2;
        final ghc ghcVar2;
        final x4d x4dVar2;
        final xw9 xw9Var2;
        ojb ojbVarV;
        mue mueVar3;
        wo7 wo7Var3;
        ghc ghcVarT;
        x4d x4dVarB;
        boolean z4;
        xw9 bx9Var;
        rpe rpeVar3;
        Object objR;
        t69 t69Var;
        long jC;
        l46Var.h0(-1717599650);
        int i5 = i | (l46Var.g(useVar) ? 4 : 2) | (l46Var.g(j09Var) ? 32 : 16) | 3456;
        if ((i2 & 16) == 0) {
            mueVar2 = mueVar;
            if (l46Var.g(mueVar2)) {
                i3 = 16384;
            }
            i4 = i5 | i3 | 907608064;
            if (l46Var.g(wneVar)) {
                c = 256;
            } else {
                c = 128;
            }
            int i6 = c | 25618;
            if ((306783379 & i4) == 306783378 || (i6 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i4 & 1, z2)) {
                l46Var.b0();
                if ((i & 1) != 0 || l46Var.C()) {
                    if ((i2 & 16) != 0) {
                        mueVar2 = (mue) l46Var.k(nte.a);
                    }
                    rpe rpeVar4 = new rpe();
                    mueVar3 = mueVar2;
                    wo7Var3 = wo7.g;
                    ghcVarT = mh3.T(l46Var);
                    x4dVarB = u5d.b(od4.n, l46Var);
                    z4 = true;
                    bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                    rpeVar3 = rpeVar4;
                } else {
                    l46Var.Z();
                    rpeVar3 = rpeVar;
                    wo7Var3 = wo7Var;
                    ghcVarT = ghcVar;
                    x4dVarB = x4dVar;
                    bx9Var = xw9Var;
                    mueVar3 = mueVar2;
                    z4 = z;
                }
                l46Var.s();
                l46Var.f0(1230824445);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = ib8.e(l46Var);
                }
                t69Var = (t69) objR;
                l46Var.r(false);
                l46Var.f0(-1345763848);
                jC = mueVar3.c();
                if (jC == 16) {
                    jC = wneVar.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
                }
                long j = jC;
                l46Var.r(false);
                mh3.a(iue.a.a(wneVar.k), af1.b0(484558238, new qpe(j09Var, wneVar, useVar, z4, ypeVar, t69Var, rpeVar3, l26Var, bx9Var, mueVar3.e(new mue(j, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVarT, x4dVarB), l46Var), l46Var, 56);
                ghc ghcVar3 = ghcVarT;
                xw9Var2 = bx9Var;
                ghcVar2 = ghcVar3;
                z3 = z4;
                rpeVar2 = rpeVar3;
                wo7Var2 = wo7Var3;
                x4dVar2 = x4dVarB;
                mueVar2 = mueVar3;
            } else {
                l46Var.Z();
                z3 = z;
                rpeVar2 = rpeVar;
                wo7Var2 = wo7Var;
                ghcVar2 = ghcVar;
                x4dVar2 = x4dVar;
                xw9Var2 = xw9Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26(j09Var, z3, mueVar2, rpeVar2, l26Var, wo7Var2, ypeVar, ghcVar2, x4dVar2, wneVar, xw9Var2, i, i2) { // from class: ppe
                    public final /* synthetic */ int X;
                    public final /* synthetic */ j09 b;
                    public final /* synthetic */ boolean c;
                    public final /* synthetic */ mue d;
                    public final /* synthetic */ rpe e;
                    public final /* synthetic */ l26 f;
                    public final /* synthetic */ wo7 g;
                    public final /* synthetic */ ype v;
                    public final /* synthetic */ ghc w;
                    public final /* synthetic */ x4d x;
                    public final /* synthetic */ wne y;
                    public final /* synthetic */ xw9 z;

                    {
                        this.X = i2;
                    }

                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(12582913);
                        rfc.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, (l46) obj, iP, this.X);
                        return wef.a;
                    }
                };
            }
        }
        mueVar2 = mueVar;
        i3 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        i4 = i5 | i3 | 907608064;
        if (l46Var.g(wneVar)) {
            c = 256;
        } else {
            c = 128;
        }
        int i7 = c | 25618;
        if ((306783379 & i4) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (l46Var.W(i4 & 1, z2)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if ((i2 & 16) != 0) {
                    mueVar2 = (mue) l46Var.k(nte.a);
                }
                rpe rpeVar5 = new rpe();
                mueVar3 = mueVar2;
                wo7Var3 = wo7.g;
                ghcVarT = mh3.T(l46Var);
                x4dVarB = u5d.b(od4.n, l46Var);
                z4 = true;
                bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                rpeVar3 = rpeVar5;
            } else {
                if ((i2 & 16) != 0) {
                    mueVar2 = (mue) l46Var.k(nte.a);
                }
                rpe rpeVar6 = new rpe();
                mueVar3 = mueVar2;
                wo7Var3 = wo7.g;
                ghcVarT = mh3.T(l46Var);
                x4dVarB = u5d.b(od4.n, l46Var);
                z4 = true;
                bx9Var = new bx9(16.0f, 16.0f, 16.0f, 16.0f);
                rpeVar3 = rpeVar6;
            }
            l46Var.s();
            l46Var.f0(1230824445);
            objR = l46Var.R();
            if (objR == sf2.a) {
                objR = ib8.e(l46Var);
            }
            t69Var = (t69) objR;
            l46Var.r(false);
            l46Var.f0(-1345763848);
            jC = mueVar3.c();
            if (jC == 16) {
                jC = wneVar.d(z4, false, ((Boolean) z7f.w(t69Var, l46Var, 0).getValue()).booleanValue());
            }
            long j2 = jC;
            l46Var.r(false);
            mh3.a(iue.a.a(wneVar.k), af1.b0(484558238, new qpe(j09Var, wneVar, useVar, z4, ypeVar, t69Var, rpeVar3, l26Var, bx9Var, mueVar3.e(new mue(j2, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, null, 16777214)), wo7Var3, ghcVarT, x4dVarB), l46Var), l46Var, 56);
            ghc ghcVar4 = ghcVarT;
            xw9Var2 = bx9Var;
            ghcVar2 = ghcVar4;
            z3 = z4;
            rpeVar2 = rpeVar3;
            wo7Var2 = wo7Var3;
            x4dVar2 = x4dVarB;
            mueVar2 = mueVar3;
        } else {
            l46Var.Z();
            z3 = z;
            rpeVar2 = rpeVar;
            wo7Var2 = wo7Var;
            ghcVar2 = ghcVar;
            x4dVar2 = x4dVar;
            xw9Var2 = xw9Var;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(j09Var, z3, mueVar2, rpeVar2, l26Var, wo7Var2, ypeVar, ghcVar2, x4dVar2, wneVar, xw9Var2, i, i2) { // from class: ppe
                public final /* synthetic */ int X;
                public final /* synthetic */ j09 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ mue d;
                public final /* synthetic */ rpe e;
                public final /* synthetic */ l26 f;
                public final /* synthetic */ wo7 g;
                public final /* synthetic */ ype v;
                public final /* synthetic */ ghc w;
                public final /* synthetic */ x4d x;
                public final /* synthetic */ wne y;
                public final /* synthetic */ xw9 z;

                {
                    this.X = i2;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(12582913);
                    rfc.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, (l46) obj, iP, this.X);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0239  */
    /* JADX WARN: Code duplicated, block: B:154:0x0265  */
    /* JADX WARN: Code duplicated, block: B:155:0x0269  */
    /* JADX WARN: Code duplicated, block: B:160:0x0284  */
    /* JADX WARN: Code duplicated, block: B:162:0x029e  */
    /* JADX WARN: Code duplicated, block: B:164:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:166:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:175:0x0312  */
    /* JADX WARN: Code duplicated, block: B:178:0x032b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0330  */
    /* JADX WARN: Code duplicated, block: B:183:0x0335  */
    /* JADX WARN: Code duplicated, block: B:185:0x033a  */
    /* JADX WARN: Code duplicated, block: B:188:0x0341  */
    /* JADX WARN: Code duplicated, block: B:190:0x037c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0380  */
    /* JADX WARN: Code duplicated, block: B:196:0x039b  */
    /* JADX WARN: Code duplicated, block: B:198:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:200:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:202:0x0403  */
    /* JADX WARN: Code duplicated, block: B:203:0x0407  */
    /* JADX WARN: Code duplicated, block: B:208:0x0422  */
    /* JADX WARN: Code duplicated, block: B:210:0x043e  */
    /* JADX WARN: Code duplicated, block: B:213:0x045a  */
    /* JADX WARN: Code duplicated, block: B:215:0x046b  */
    /* JADX WARN: Code duplicated, block: B:217:0x046f  */
    /* JADX WARN: Code duplicated, block: B:220:0x0478  */
    /* JADX WARN: Code duplicated, block: B:222:0x047c  */
    /* JADX WARN: Code duplicated, block: B:226:0x0485  */
    /* JADX WARN: Code duplicated, block: B:228:0x0489  */
    /* JADX WARN: Code duplicated, block: B:231:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:232:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:235:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:237:0x04de  */
    /* JADX WARN: Code duplicated, block: B:240:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:243:0x0517  */
    /* JADX WARN: Code duplicated, block: B:244:0x051a  */
    /* JADX WARN: Code duplicated, block: B:246:0x051e  */
    /* JADX WARN: Code duplicated, block: B:247:0x0521  */
    /* JADX WARN: Code duplicated, block: B:250:0x052f  */
    /* JADX WARN: Code duplicated, block: B:251:0x0551  */
    /* JADX WARN: Code duplicated, block: B:254:0x057f  */
    /* JADX WARN: Code duplicated, block: B:255:0x0583  */
    /* JADX WARN: Code duplicated, block: B:260:0x059e  */
    /* JADX WARN: Code duplicated, block: B:263:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:265:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:266:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:271:0x0611  */
    /* JADX WARN: Code duplicated, block: B:273:0x062d  */
    public static final void b(l26 l26Var, l26 l26Var2, n26 n26Var, l26 l26Var3, l26 l26Var4, l26 l26Var5, l26 l26Var6, boolean z, rpe rpeVar, mpe mpeVar, dd2 dd2Var, l26 l26Var7, xw9 xw9Var, l46 l46Var, int i, int i2) {
        int i3;
        int i4;
        l26 l26Var8;
        n26 n26Var2;
        mpe mpeVar2;
        lx0 lx0Var;
        he2 he2Var;
        xv8 xv8Var;
        boolean z2;
        float fB;
        float fA;
        float fP;
        float f;
        float f2;
        lx0 lx0Var2;
        j09 j09VarD0;
        float f3;
        float f4;
        j09 j09VarD1;
        int iW;
        boolean z3;
        int iW2;
        boolean z4;
        Object objR;
        int iW3;
        int iW4;
        int iW5;
        int iW6;
        int iW7;
        l26 l26Var9 = l26Var;
        xw9 xw9Var2 = xw9Var;
        lx0 lx0Var3 = ndb.f;
        lx0 lx0Var4 = ndb.b;
        l46Var.h0(-1086465551);
        int i5 = i & 6;
        g09 g09Var = g09.a;
        if (i5 == 0) {
            i3 = i | (l46Var.g(g09Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.i(l26Var9) ? 32 : 16;
        }
        int i6 = i & 384;
        int i7 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i6 == 0) {
            i3 |= l46Var.i(l26Var2) ? 256 : 128;
        }
        int i8 = i & 3072;
        int i9 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i8 == 0) {
            i3 |= l46Var.i(n26Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= l46Var.i(l26Var3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i3 |= l46Var.i(l26Var4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= l46Var.i(l26Var5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= l46Var.i(l26Var6) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= l46Var.h(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= l46Var.g(rpeVar) ? 536870912 : 268435456;
        }
        int i10 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? l46Var.g(mpeVar) : l46Var.i(mpeVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.i(dd2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (l46Var.i(l26Var7)) {
                i7 = 256;
            }
            i4 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (l46Var.g(xw9Var2)) {
                i9 = 2048;
            }
            i4 |= i9;
        }
        int i11 = i4;
        if (l46Var.W(i10 & 1, ((i10 & 306783379) == 306783378 && (i11 & 1171) == 1170) ? false : true)) {
            float fO = iec.o(l46Var);
            int i12 = i11 & 14;
            boolean zD = ((i11 & 7168) == 2048) | ((i10 & 234881024) == 67108864) | ((i10 & 1879048192) == 536870912) | (i12 == 4 || ((i11 & 8) != 0 && l46Var.g(mpeVar))) | l46Var.d(fO);
            Object objR2 = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zD || objR2 == i8cVar) {
                hqe hqeVar = new hqe(z, rpeVar, mpeVar, xw9Var2, fO);
                l46Var.p0(hqeVar);
                objR2 = hqeVar;
            }
            hqe hqeVar2 = (hqe) objR2;
            cv7 cv7Var = (cv7) l46Var.k(zg2.n);
            int iW8 = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01e4: INVOKE (r14v7 'j09VarJ' j09) = (r53v0 'l46Var' l46), (r26v0 ?? I:??[OBJECT, ARRAY]) STATIC call: m93.J(l46, j09):j09 A[DECLARE_VAR, MD:(l46, j09):j09 (m)] (LINE:485) in method: rfc.b(l26, l26, n26, l26, l26, l26, l26, boolean, rpe, mpe, dd2, l26, xw9, l46, int, int):void, file: classes.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1648
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rfc.b(l26, l26, n26, l26, l26, l26, l26, boolean, rpe, mpe, dd2, l26, xw9, l46, int, int):void");
        }

        public static final void c(boolean z, xzf xzfVar, wp9 wp9Var, a26 a26Var, x16 x16Var, l46 l46Var, int i) {
            xzf xzfVar2;
            xzf xzfVar3;
            a26Var.getClass();
            x16Var.getClass();
            l46Var.h0(-2088992260);
            int i2 = i | (l46Var.h(z) ? 4 : 2) | 16 | (l46Var.g(wp9Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
            if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
                l46Var.b0();
                if ((i & 1) == 0 || l46Var.C()) {
                    pwf pwfVarA = qd8.a(l46Var);
                    if (pwfVarA == null) {
                        qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                    xzfVar3 = (xzf) z5c.G(job.a.b(xzf.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
                } else {
                    l46Var.Z();
                    xzfVar3 = xzfVar;
                }
                l46Var.s();
                whb whbVar = xzfVar3.e;
                xzf xzfVar4 = xzfVar3;
                lmg.J(b.c, af1.b0(-759224283, new jt(x16Var, z, wp9Var, jzb.i(whbVar, whbVar.getValue(), l46Var, 0, 0), xzfVar4, a26Var), l46Var), l46Var, 54);
                xzfVar2 = xzfVar4;
            } else {
                l46Var.Z();
                xzfVar2 = xzfVar;
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l30(z, xzfVar2, wp9Var, a26Var, x16Var, i);
            }
        }

        public static final void d(w79 w79Var, Object obj, Object obj2) {
            int iF = w79Var.f(obj);
            boolean z = iF < 0;
            Object obj3 = z ? null : w79Var.c[iF];
            if (obj3 != null) {
                if (obj3 instanceof x79) {
                    ((x79) obj3).e(obj2);
                } else if (obj3 != obj2) {
                    x79 x79Var = new x79();
                    x79Var.e(obj3);
                    x79Var.e(obj2);
                    obj2 = x79Var;
                }
                obj2 = obj3;
            }
            if (!z) {
                w79Var.c[iF] = obj2;
                return;
            }
            int i = ~iF;
            w79Var.b[i] = obj;
            w79Var.c[i] = obj2;
        }

        public static final float e(long j) {
            int i = (int) (j >> 32);
            if (Float.intBitsToFloat(i) == 0.0f && Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) {
                return 0.0f;
            }
            return ((-((float) Math.atan2(Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
        }

        public static boolean f(int i) {
            return i == 2 || i == 7 || i == 3;
        }

        public static boolean g(int i, int i2) {
            if (i == 5) {
                if (i2 != 5) {
                    return true;
                }
                i = 5;
            }
            if (i == 6) {
                if (i2 != 6 && i2 != 5) {
                    return true;
                }
                i = 6;
            }
            if (i == 4 && i2 != 4) {
                return true;
            }
            if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
                return true;
            }
            if (i == 2) {
                return i2 == 1 || i2 == 8;
            }
            return false;
        }

        public static final long h(hia hiaVar, boolean z) {
            List list = hiaVar.a;
            int size = list.size();
            long jG = 0;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                oia oiaVar = (oia) list.get(i2);
                if (oiaVar.d && oiaVar.h) {
                    jG = hl9.g(jG, z ? oiaVar.c : oiaVar.g);
                    i++;
                }
            }
            if (i == 0) {
                return 9205357640488583168L;
            }
            return hl9.b(jG, i);
        }

        public static final float i(hia hiaVar, boolean z) {
            long jH = h(hiaVar, z);
            float fD = 0.0f;
            if (hl9.c(jH, 9205357640488583168L)) {
                return 0.0f;
            }
            List list = hiaVar.a;
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                oia oiaVar = (oia) list.get(i2);
                if (oiaVar.d && oiaVar.h) {
                    i++;
                    fD = hl9.d(hl9.f(z ? oiaVar.c : oiaVar.g, jH)) + fD;
                }
            }
            return fD / i;
        }

        public static w79 j() {
            long[] jArr = jec.a;
            return new w79();
        }

        public static String k(Context context, String str) {
            Object dzbVar;
            String str2;
            Instant instantNow = Instant.now();
            instantNow.getClass();
            context.getClass();
            if (str == null) {
                return null;
            }
            try {
                dzbVar = Instant.parse(str);
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            if (dzbVar instanceof dzb) {
                dzbVar = null;
            }
            Instant instant = (Instant) dzbVar;
            if (instant == null) {
                return null;
            }
            Date dateFrom = Date.from(instant);
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            long jBetween = ChronoUnit.DAYS.between(instantNow.atZone(zoneIdSystemDefault).toLocalDate(), instant.atZone(zoneIdSystemDefault).toLocalDate());
            RelativeDateTimeFormatter relativeDateTimeFormatter = RelativeDateTimeFormatter.getInstance(context.getResources().getConfiguration().getLocales().get(0));
            if (jBetween == -1) {
                str2 = relativeDateTimeFormatter.format(RelativeDateTimeFormatter.Direction.LAST, RelativeDateTimeFormatter.AbsoluteUnit.DAY);
            } else if (jBetween == 0) {
                str2 = relativeDateTimeFormatter.format(RelativeDateTimeFormatter.Direction.THIS, RelativeDateTimeFormatter.AbsoluteUnit.DAY);
            } else {
                str2 = jBetween == 1 ? relativeDateTimeFormatter.format(RelativeDateTimeFormatter.Direction.NEXT, RelativeDateTimeFormatter.AbsoluteUnit.DAY) : DateFormat.getMediumDateFormat(context).format(dateFrom);
            }
            return relativeDateTimeFormatter.combineDateAndTime(str2, DateFormat.getTimeFormat(context).format(dateFrom));
        }

        public static String l(String str, Object... objArr) {
            int iIndexOf;
            String string;
            String strValueOf = String.valueOf(str);
            int i = 0;
            for (int i2 = 0; i2 < objArr.length; i2++) {
                Object obj = objArr[i2];
                if (obj == null) {
                    string = "null";
                } else {
                    try {
                        string = obj.toString();
                    } catch (Exception e) {
                        String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                        Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                        StringBuilder sbP = tec.p("<", str2, " threw ");
                        sbP.append(e.getClass().getName());
                        sbP.append(">");
                        string = sbP.toString();
                    }
                }
                objArr[i2] = string;
            }
            StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
            int i3 = 0;
            while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
                sb.append((CharSequence) strValueOf, i3, iIndexOf);
                sb.append(objArr[i]);
                i3 = iIndexOf + 2;
                i++;
            }
            sb.append((CharSequence) strValueOf, i3, strValueOf.length());
            if (i < objArr.length) {
                sb.append(" [");
                sb.append(objArr[i]);
                for (int i4 = i + 1; i4 < objArr.length; i4++) {
                    sb.append(", ");
                    sb.append(objArr[i4]);
                }
                sb.append(']');
            }
            return sb.toString();
        }

        public static final PopupTrackingEvent m(PopupTrackingEvent popupTrackingEvent, String str, Map map) {
            if (pa7.t(popupTrackingEvent != null ? popupTrackingEvent.getEvent() : null, str)) {
                if (!map.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!pa7.t(popupTrackingEvent.getProperties().get((String) entry.getKey()), (String) entry.getValue())) {
                        }
                    }
                }
                return popupTrackingEvent;
            }
            return null;
        }

        public static final boolean n(boolean z, l46 l46Var, int i, int i2) {
            boolean zBooleanValue;
            l46Var.f0(-1032390060);
            boolean z2 = (i2 & 1) != 0 ? true : z;
            int i3 = 2;
            dmd dmdVar = (i2 & 2) != 0 ? dmd.CardDraw : dmd.History;
            if (!z2) {
                l46Var.r(false);
                return true;
            }
            Object objK = l46Var.k(snd.b);
            Object obj = sf2.a;
            if (objK != null) {
                l46Var.f0(328775183);
                Object objR = l46Var.R();
                if (objR == obj) {
                    objR = new ead(20);
                    l46Var.p0(objR);
                }
                zBooleanValue = mh3.S(null, (x16) objR, l46Var, 48, 1);
                l46Var.r(false);
            } else {
                l46Var.f0(328835726);
                l46Var.r(false);
                nfc nfcVarB = kr7.b(l46Var);
                boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
                Object objR2 = l46Var.R();
                if (zG || objR2 == obj) {
                    objR2 = nfcVarB.b(job.a.b(kmd.class), null, null);
                    l46Var.p0(objR2);
                }
                kmd kmdVar = (kmd) objR2;
                nfc nfcVarB2 = kr7.b(l46Var);
                boolean zG2 = l46Var.g(null) | l46Var.g(nfcVarB2);
                Object objR3 = l46Var.R();
                if (zG2 || objR3 == obj) {
                    objR3 = nfcVarB2.b(job.a.b(cmd.class), null, null);
                    l46Var.p0(objR3);
                }
                TarotSkinIdentify tarotSkinIdentify = ((die) l46Var.k(snd.a)).a;
                whb whbVar = ((ys3) ((cmd) objR3)).x;
                e89 e89VarI = jzb.i(whbVar, whbVar.getValue(), l46Var, 0, 0);
                Object[] objArr = new Object[0];
                Object objR4 = l46Var.R();
                if (objR4 == obj) {
                    objR4 = new ead(21);
                    l46Var.p0(objR4);
                }
                e89 e89Var = (e89) vfh.I(objArr, (x16) objR4, l46Var, 48);
                Object[] objArr2 = new Object[0];
                Object objR5 = l46Var.R();
                if (objR5 == obj) {
                    objR5 = new ead(22);
                    l46Var.p0(objR5);
                }
                e89 e89Var2 = (e89) vfh.I(objArr2, (x16) objR5, l46Var, 48);
                Object objR6 = l46Var.R();
                if (objR6 == obj) {
                    objR6 = q1c.f(null);
                    l46Var.p0(objR6);
                }
                e89 e89Var3 = (e89) objR6;
                Integer numValueOf = Integer.valueOf(((Number) e89VarI.getValue()).intValue());
                boolean zE = l46Var.e(tarotSkinIdentify.ordinal()) | l46Var.i(kmdVar) | l46Var.g(e89Var2) | l46Var.g(e89Var);
                Object objR7 = l46Var.R();
                if (zE || objR7 == obj) {
                    Object zldVar = new zld(tarotSkinIdentify, kmdVar, e89Var3, e89Var2, e89Var, null);
                    l46Var.p0(zldVar);
                    objR7 = zldVar;
                }
                af1.p(tarotSkinIdentify, numValueOf, (l26) objR7, l46Var);
                if (((Boolean) e89Var2.getValue()).booleanValue()) {
                    l46Var.f0(10634717);
                    TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) e89Var3.getValue();
                    if (tarotSkinIdentify2 == null) {
                        l46Var.f0(329676228);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(329676229);
                        Object objR8 = l46Var.R();
                        if (objR8 == obj) {
                            objR8 = af1.E(l46Var);
                            l46Var.p0(objR8);
                        }
                        aw2 aw2Var = (aw2) objR8;
                        nfc nfcVarB3 = kr7.b(l46Var);
                        boolean zG3 = l46Var.g(null) | l46Var.g(nfcVarB3);
                        Object objR9 = l46Var.R();
                        if (zG3 || objR9 == obj) {
                            objR9 = nfcVarB3.b(job.a.b(gpf.class), null, null);
                            l46Var.p0(objR9);
                        }
                        gpf gpfVar = (gpf) objR9;
                        nfc nfcVarB4 = kr7.b(l46Var);
                        boolean zG4 = l46Var.g(null) | l46Var.g(nfcVarB4);
                        Object objR10 = l46Var.R();
                        if (zG4 || objR10 == obj) {
                            objR10 = nfcVarB4.b(job.a.b(xof.class), null, null);
                            l46Var.p0(objR10);
                        }
                        xof xofVar = (xof) objR10;
                        boolean zG5 = l46Var.g(e89Var2) | l46Var.g(e89Var);
                        Object objR11 = l46Var.R();
                        if (zG5 || objR11 == obj) {
                            objR11 = new yr2(e89Var2, e89Var, i3);
                            l46Var.p0(objR11);
                        }
                        x16 x16Var = (x16) objR11;
                        boolean zI = l46Var.i(aw2Var) | l46Var.i(gpfVar) | l46Var.i(xofVar) | l46Var.g(e89Var2) | l46Var.g(e89Var);
                        Object objR12 = l46Var.R();
                        if (zI || objR12 == obj) {
                            Object kfVar = new kf(aw2Var, gpfVar, xofVar, e89Var2, e89Var);
                            e89Var = e89Var;
                            l46Var.p0(kfVar);
                            objR12 = kfVar;
                        }
                        sfc.c(tarotSkinIdentify2, dmdVar, x16Var, (a26) objR12, l46Var, i & 112);
                        l46Var.r(false);
                    }
                    l46Var.r(false);
                } else {
                    l46Var.f0(330457646);
                    l46Var.r(false);
                }
                zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
            }
            l46Var.r(false);
            return zBooleanValue;
        }

        public static final boolean o(w79 w79Var, Object obj, Object obj2) {
            Object objG = w79Var.g(obj);
            if (objG == null) {
                return false;
            }
            if (!(objG instanceof x79)) {
                if (!objG.equals(obj2)) {
                    return false;
                }
                w79Var.k(obj);
                return true;
            }
            x79 x79Var = (x79) objG;
            boolean zM = x79Var.m(obj2);
            if (zM && x79Var.c()) {
                w79Var.k(obj);
            }
            return zM;
        }

        public static final void p(w79 w79Var, Object obj) {
            boolean zC;
            long[] jArr = w79Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = w79Var.b[i4];
                            Object obj3 = w79Var.c[i4];
                            if (obj3 instanceof x79) {
                                x79 x79Var = (x79) obj3;
                                x79Var.m(obj);
                                zC = x79Var.c();
                            } else {
                                zC = obj3 == obj;
                            }
                            if (zC) {
                                w79Var.l(i4);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        }

        public static void q(PopupTrackingEvent popupTrackingEvent) {
            String event;
            if (popupTrackingEvent == null || (event = popupTrackingEvent.getEvent()) == null) {
                return;
            }
            if (v4e.Q(event)) {
                event = null;
            }
            if (event == null) {
                return;
            }
            r05 r05Var = new r05(event);
            ckb ckbVar = new ckb(19, popupTrackingEvent);
            x1f x1fVar = x1f.a;
            x1f.g(r05Var, m1f.c, ckbVar);
        }

        public static final PopupTrackingEvent r(PopupTrackingEvent popupTrackingEvent) {
            return m(popupTrackingEvent, "button_click", bm8.H(new iy9("btn", "close"), new iy9("popup", "weekend_free_credit"), new iy9("page_name", "homepage")));
        }

        public static final PopupTrackingEvent s(PopupTrackingEvent popupTrackingEvent) {
            return m(popupTrackingEvent, "button_click", bm8.H(new iy9("btn", "enter_reading"), new iy9("popup", "weekend_free_credit"), new iy9("page_name", "homepage")));
        }

        public static String t(Context context, String str) {
            oa7.A(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(str)) {
                str = ndc.n(context);
            }
            int identifier = resources.getIdentifier("google_app_id", "string", str);
            if (identifier == 0) {
                return null;
            }
            try {
                return resources.getString(identifier);
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }

        public static String u(String str, String[] strArr, String[] strArr2) {
            int iMin = Math.min(strArr.length, strArr2.length);
            for (int i = 0; i < iMin; i++) {
                String str2 = strArr[i];
                if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                    return strArr2[i];
                }
            }
            return null;
        }
    }

package defpackage;

import ai.askquin.R;
import ai.askquin.data.QuotaBlockReason;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.feedback.FeedbackUiState;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lt2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(tr2 tr2Var, final kzd kzdVar, final x16 x16Var, l46 l46Var, int i) {
        final tr2 tr2Var2;
        x16 x16Var2;
        kzd kzdVar2;
        Object next;
        pwf pwfVarH;
        Object ss2Var;
        p3c p3cVar;
        e89 e89Var;
        e89 e89Var2;
        Context context;
        boolean z;
        Boolean bool;
        Object it2Var;
        xn5 xn5Var;
        final vsd vsdVar;
        int i2;
        Object obj;
        use useVar;
        boolean z2;
        boolean z3;
        p3c p3cVar2;
        Context context2;
        r0 r0Var;
        boolean z4;
        l46 l46Var2;
        e89 e89Var3;
        int i3;
        e89 e89Var4;
        r0 r0Var2;
        int i4;
        Object m8Var;
        l46 l46Var3 = l46Var;
        l46Var3.h0(-233123111);
        int i5 = i | (l46Var3.i(tr2Var) ? 4 : 2) | (l46Var3.g(g09.a) ? 32 : 16) | (l46Var3.i(kzdVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var3.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var3.W(i5 & 1, (i5 & 1171) != 1170)) {
            r0 r0Var3 = tr2Var.c;
            p3c p3cVar3 = tr2Var.e;
            e89 e89VarT = tm7.t(p3cVar3.e, l46Var3);
            nfc nfcVarB = kr7.b(l46Var3);
            boolean zG = l46Var3.g(null) | l46Var3.g(nfcVarB);
            Object objR = l46Var3.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = nfcVarB.b(job.a.b(za0.class), null, null);
                l46Var3.p0(objR);
            }
            final za0 za0Var = (za0) objR;
            nfc nfcVarB2 = kr7.b(l46Var3);
            if (((Boolean) l46Var3.k(h57.a)).booleanValue()) {
                pwfVarH = ib8.h(l46Var3, 1471494079, l46Var3, false);
            } else {
                l46Var3.f0(1471494731);
                Object objK = l46Var3.k(uq.b);
                Object objR2 = l46Var3.R();
                if (objR2 == i8cVar) {
                    objR2 = zo1.K0;
                    l46Var3.p0(objR2);
                }
                Iterator it = fyc.u((a26) objR2, objK).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Context) next) instanceof pwf));
                pwfVarH = (pwf) next;
                l46Var3.r(false);
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            gy2 gy2VarR = b21.r(pwfVarH);
            kob kobVar = job.a;
            final mma mmaVar = (mma) z5c.G(kobVar.b(mma.class), pwfVarH.g(), null, gy2VarR, nfcVarB2, null);
            Context context3 = (Context) l46Var3.k(uq.b);
            nfc nfcVarB3 = kr7.b(l46Var3);
            boolean zG2 = l46Var3.g(null) | l46Var3.g(nfcVarB3);
            Object objR3 = l46Var3.R();
            if (zG2 || objR3 == i8cVar) {
                objR3 = nfcVarB3.b(kobVar.b(t7.class), null, null);
                l46Var3.p0(objR3);
            }
            final t7 t7Var = (t7) objR3;
            whb whbVarN = if9.n(((a58) ((x48) l46Var3.k(cb8.a)).k()).j);
            e89 e89VarI = jzb.i(whbVarN, whbVarN.getValue(), l46Var3, 0, 0);
            boolean zG3 = l46Var3.g(p3cVar3);
            Object objR4 = l46Var3.R();
            if (zG3 || objR4 == i8cVar) {
                objR4 = q1c.f(Boolean.FALSE);
                l46Var3.p0(objR4);
            }
            e89 e89Var5 = (e89) objR4;
            boolean zQ = r0Var3.Q();
            vz9 vz9Var = r0Var3.e1;
            boolean z5 = (!zQ || r0Var3.s0() || !r0Var3.e0() || r0Var3.l0() || r0Var3.h0()) ? false : true;
            Boolean boolValueOf = Boolean.valueOf(z5);
            Boolean boolValueOf2 = Boolean.valueOf(r0Var3.j0());
            g48 g48Var = (g48) e89VarI.getValue();
            boolean zI = l46Var3.i(p3cVar3) | l46Var3.h(z5) | l46Var3.g(e89VarI) | l46Var3.i(r0Var3);
            Object objR5 = l46Var3.R();
            if (zI || objR5 == i8cVar) {
                ss2Var = new ss2(p3cVar3, z5, r0Var3, e89VarI, null);
                p3cVar = p3cVar3;
                r0Var3 = r0Var3;
                l46Var3.p0(ss2Var);
            } else {
                ss2Var = objR5;
                p3cVar = p3cVar3;
            }
            af1.q(boolValueOf, boolValueOf2, g48Var, (l26) ss2Var, l46Var3);
            Boolean boolValueOf3 = Boolean.valueOf(((d3c) e89VarT.getValue()).b);
            Boolean bool2 = (Boolean) e89Var5.getValue();
            bool2.getClass();
            g48 g48Var2 = (g48) e89VarI.getValue();
            boolean zG4 = l46Var3.g(e89VarT) | l46Var3.g(e89Var5) | l46Var3.g(e89VarI) | l46Var3.i(p3cVar);
            p3c p3cVar4 = p3cVar;
            Object objR6 = l46Var3.R();
            if (zG4 || objR6 == i8cVar) {
                objR6 = new dt2(p3cVar4, e89VarT, e89Var5, e89VarI, null);
                e89Var = e89VarT;
                e89Var2 = e89Var5;
                l46Var3.p0(objR6);
            } else {
                e89Var2 = e89Var5;
                e89Var = e89VarT;
            }
            af1.q(boolValueOf3, bool2, g48Var2, (l26) objR6, l46Var3);
            String str = r0Var3.V() == null ? "reading_general" : "scene";
            Object objR7 = l46Var3.R();
            if (objR7 == i8cVar) {
                objR7 = af1.E(l46Var3);
                l46Var3.p0(objR7);
            }
            aw2 aw2Var = (aw2) objR7;
            Object objR8 = l46Var3.R();
            if (objR8 == i8cVar) {
                objR8 = q1c.f(Boolean.FALSE);
                l46Var3.p0(objR8);
            }
            e89 e89Var6 = (e89) objR8;
            boolean z6 = !r0Var3.m0() && (r0Var3.Q() && !r0Var3.s0());
            if (!pa7.t(r0Var3.a0(), cd4.a) || r0Var3.H() == null || r0Var3.r0()) {
                l46Var3.f0(-5915863);
                l46Var3.r(false);
            } else {
                l46Var3.f0(-6386753);
                boolean zI2 = l46Var3.i(r0Var3) | l46Var3.i(context3) | l46Var3.g(str);
                Object objR9 = l46Var3.R();
                if (zI2 || objR9 == i8cVar) {
                    objR9 = new js2(r0Var3, context3, str, 1);
                    l46Var3.p0(objR9);
                }
                hgc.a("shuffle_result", str, (x16) objR9, l46Var3, 6);
                l46Var3.r(false);
            }
            if (z6) {
                l46Var3.f0(-5865922);
                boolean zI3 = l46Var3.i(context3) | l46Var3.i(r0Var3) | l46Var3.i(aw2Var) | l46Var3.g(str);
                Object objR10 = l46Var3.R();
                if (zI3 || objR10 == i8cVar) {
                    r0 r0Var4 = r0Var3;
                    m8Var = new m8(4, e89Var6, context3, r0Var4, aw2Var, str);
                    context = context3;
                    r0Var3 = r0Var4;
                    l46Var3.p0(m8Var);
                } else {
                    m8Var = objR10;
                    context = context3;
                }
                hgc.a("reading", str, (x16) m8Var, l46Var3, 6);
                l46Var3.r(false);
            } else {
                context = context3;
                e89Var6 = e89Var6;
                l46Var3.f0(-5086551);
                l46Var3.r(false);
            }
            boolean zI4 = l46Var3.i(r0Var3);
            Object objR11 = l46Var3.R();
            if (zI4 || objR11 == i8cVar) {
                z = true;
                objR11 = new dl(r0Var3, 1);
                l46Var3.p0(objR11);
            } else {
                z = true;
            }
            int i6 = r0.j2;
            af1.g(r0Var3, (a26) objR11, l46Var3);
            boolean zI5 = l46Var3.i(p3cVar4);
            Object objR12 = l46Var3.R();
            if (zI5 || objR12 == i8cVar) {
                objR12 = new ot1(5, p3cVar4);
                l46Var3.p0(objR12);
            }
            int i7 = p3c.L0;
            af1.g(p3cVar4, (a26) objR12, l46Var3);
            use useVarO = n3d.o((String) vz9Var.getValue(), l46Var3, 2);
            String str2 = (String) vz9Var.getValue();
            boolean zI6 = l46Var3.i(r0Var3) | l46Var3.g(useVarO);
            Object objR13 = l46Var3.R();
            if (zI6 || objR13 == i8cVar) {
                objR13 = new ft2(r0Var3, useVarO, null);
                l46Var3.p0(objR13);
            }
            af1.o((l26) objR13, l46Var3, str2);
            Boolean boolValueOf4 = Boolean.valueOf(r0Var3.m0());
            boolean zI7 = l46Var3.i(r0Var3) | l46Var3.g(useVarO);
            Object objR14 = l46Var3.R();
            if (zI7 || objR14 == i8cVar) {
                objR14 = new ht2(r0Var3, useVarO, null);
                l46Var3.p0(objR14);
            }
            af1.o((l26) objR14, l46Var3, boolValueOf4);
            Object objR15 = l46Var3.R();
            if (objR15 == i8cVar) {
                objR15 = q1c.f(Boolean.FALSE);
                l46Var3.p0(objR15);
            }
            final e89 e89Var7 = (e89) objR15;
            Object objR16 = l46Var3.R();
            if (objR16 == i8cVar) {
                objR16 = q1c.f(Boolean.FALSE);
                l46Var3.p0(objR16);
            }
            final e89 e89Var8 = (e89) objR16;
            boolean zG5 = l46Var3.g(r0Var3);
            Object objR17 = l46Var3.R();
            if (zG5 || objR17 == i8cVar) {
                w27 w27VarO = r0Var3.O();
                objR17 = q1c.f(Boolean.valueOf((w27VarO == null || w27VarO.d != null) ? false : z));
                l46Var3.p0(objR17);
            }
            final e89 e89Var9 = (e89) objR17;
            xn5 xn5Var2 = (xn5) l46Var3.k(zg2.i);
            vsd vsdVar2 = (vsd) l46Var3.k(zg2.q);
            Boolean boolValueOf5 = Boolean.valueOf(r0Var3.h0());
            Boolean boolValueOf6 = Boolean.valueOf(r0Var3.e0());
            boolean zI8 = l46Var3.i(r0Var3) | l46Var3.i(xn5Var2) | l46Var3.g(vsdVar2);
            Object objR18 = l46Var3.R();
            if (zI8 || objR18 == i8cVar) {
                bool = boolValueOf6;
                it2Var = new it2(r0Var3, xn5Var2, vsdVar2, e89Var8, e89Var7, null);
                xn5Var = xn5Var2;
                vsdVar = vsdVar2;
                i2 = 4;
                l46Var3.p0(it2Var);
            } else {
                it2Var = objR18;
                bool = boolValueOf6;
                xn5Var = xn5Var2;
                vsdVar = vsdVar2;
                i2 = 4;
            }
            af1.p(boolValueOf5, bool, (l26) it2Var, l46Var3);
            TarotSkinIdentify tarotSkinIdentify = ((die) l46Var3.k(snd.a)).a;
            Object objR19 = l46Var3.R();
            if (objR19 == i8cVar) {
                obj = null;
                objR19 = q1c.f(null);
                l46Var3.p0(objR19);
            } else {
                obj = null;
            }
            e89 e89Var10 = (e89) objR19;
            Object objR20 = l46Var3.R();
            if (objR20 == i8cVar) {
                objR20 = q1c.f(obj);
                l46Var3.p0(objR20);
            }
            final e89 e89Var11 = (e89) objR20;
            String strU = r0Var3.U();
            boolean zI9 = l46Var3.i(r0Var3);
            final String str3 = str;
            Object objR21 = l46Var3.R();
            if (zI9 || objR21 == i8cVar) {
                objR21 = new ts2(r0Var3, null);
                l46Var3.p0(objR21);
            }
            af1.o((l26) objR21, l46Var3, strU);
            s4g s4gVar = (s4g) e89Var10.getValue();
            if (s4gVar == null) {
                l46Var3.f0(-1264159);
                z2 = false;
                l46Var3.r(false);
                useVar = useVarO;
            } else {
                l46Var3.f0(-1264158);
                boolean zI10 = l46Var3.i(s4gVar);
                Object objR22 = l46Var3.R();
                if (zI10 || objR22 == i8cVar) {
                    objR22 = new us2(s4gVar, null);
                    l46Var3.p0(objR22);
                }
                af1.o((l26) objR22, l46Var3, s4gVar);
                Object objR23 = l46Var3.R();
                if (objR23 == i8cVar) {
                    objR23 = new yr2(e89Var11, e89Var10, 0);
                    l46Var3.p0(objR23);
                }
                x16 x16Var3 = (x16) objR23;
                boolean zI11 = l46Var3.i(s4gVar);
                Object objR24 = l46Var3.R();
                if (zI11 || objR24 == i8cVar) {
                    objR24 = new yr2(s4gVar, e89Var11, e89Var10);
                    l46Var3.p0(objR24);
                }
                x16 x16Var4 = (x16) objR24;
                boolean zI12 = l46Var3.i(context);
                Object objR25 = l46Var3.R();
                if (zI12 || objR25 == i8cVar) {
                    objR25 = new j8((Object) context, e89Var11, (Object) e89Var10, 12);
                    l46Var3.p0(objR25);
                }
                useVar = useVarO;
                v2c.g(s4gVar, x16Var3, x16Var4, (x16) objR25, l46Var3, 48);
                z2 = false;
                l46Var3.r(false);
            }
            Object objR26 = l46Var3.R();
            if (objR26 == i8cVar) {
                objR26 = q1c.f(Boolean.FALSE);
                l46Var3.p0(objR26);
            }
            e89 e89Var12 = (e89) objR26;
            if (((Boolean) e89Var12.getValue()).booleanValue()) {
                l46Var3.f0(-794942);
                String strQ = afc.q(R.string.alert_exit_title, l46Var3);
                String strQ2 = afc.q(R.string.button_confirm, l46Var3);
                dd2 dd2Var = mh3.b;
                Object objR27 = l46Var3.R();
                if (objR27 == i8cVar) {
                    objR27 = new i8(e89Var12, 24);
                    l46Var3.p0(objR27);
                }
                x16 x16Var5 = (x16) objR27;
                boolean zI13 = l46Var3.i(r0Var3) | ((i5 & 14) == i2 || l46Var3.i(tr2Var)) | ((i5 & 7168) == 2048);
                Object objR28 = l46Var3.R();
                if (zI13 || objR28 == i8cVar) {
                    objR28 = new jr(r0Var3, tr2Var, x16Var, e89Var12);
                    l46Var3.p0(objR28);
                }
                x16 x16Var6 = (x16) objR28;
                p3cVar2 = p3cVar4;
                e89Var3 = e89Var10;
                context2 = context;
                z4 = true;
                r0Var = r0Var3;
                z3 = false;
                kj0.F(strQ, dd2Var, strQ2, null, false, false, null, null, x16Var5, x16Var6, l46Var3, 100663344, 248);
                l46Var2 = l46Var3;
                l46Var2.r(false);
            } else {
                z3 = z2;
                p3cVar2 = p3cVar4;
                context2 = context;
                r0Var = r0Var3;
                z4 = true;
                l46Var2 = l46Var3;
                e89Var3 = e89Var10;
                l46Var2.f0(-322967);
                l46Var2.r(z3);
            }
            boolean z7 = (r0Var.p0() && r0Var.Q() && ((s4g) e89Var3.getValue()) == null) ? z4 : z3;
            int i8 = i5 & 7168;
            boolean zE = (((i5 & 14) == 4 || l46Var2.i(tr2Var)) ? z4 : false) | l46Var2.e(tarotSkinIdentify.ordinal()) | (i8 == 2048 ? z4 : z3) | l46Var2.i(mmaVar) | l46Var2.i(context2) | l46Var2.i(r0Var);
            Object objR29 = l46Var2.R();
            if (zE || objR29 == i8cVar) {
                i3 = 0;
                zr2 zr2Var = new zr2(tr2Var, x16Var, mmaVar, context2, r0Var, tarotSkinIdentify, e89Var3, e89Var11);
                l46Var2.p0(zr2Var);
                objR29 = zr2Var;
            } else {
                i3 = 0;
            }
            rxg.a(z7, (x16) objR29, l46Var2, i3, i3);
            boolean z8 = (!(r0Var.p0() && r0Var.Q()) && ((s4g) e89Var3.getValue()) == null) ? 1 : i3;
            int i9 = ((((l46Var2.i(r0Var) ? 1 : 0) | (i8 == 2048 ? 1 : i3)) | (l46Var2.i(mmaVar) ? 1 : 0)) == true ? 1 : 0) | (l46Var2.i(context2) ? 1 : 0) | (l46Var2.e(tarotSkinIdentify.ordinal()) ? 1 : 0);
            Object objR30 = l46Var2.R();
            if (i9 != 0 || objR30 == i8cVar) {
                r0 r0Var5 = r0Var;
                e89 e89Var13 = e89Var3;
                e89Var4 = e89Var12;
                qs2 qs2Var = new qs2(r0Var5, x16Var, mmaVar, context2, tarotSkinIdentify, e89Var13, e89Var11, e89Var4);
                r0Var2 = r0Var5;
                e89Var3 = e89Var13;
                tarotSkinIdentify = tarotSkinIdentify;
                l46Var2.p0(qs2Var);
                objR30 = qs2Var;
            } else {
                e89Var4 = e89Var12;
                r0Var2 = r0Var;
            }
            rxg.a(z8, (x16) objR30, l46Var2, i3, i3);
            boolean zM0 = r0Var2.m0();
            Object objR31 = l46Var2.R();
            if (objR31 == i8cVar) {
                i4 = 1;
                objR31 = new os2(1);
                l46Var2.p0(objR31);
            } else {
                i4 = 1;
            }
            rxg.a(zM0, (x16) objR31, l46Var2, 48, i3);
            final boolean z9 = ((r0Var2.j0() && r0Var2.l0()) || r0Var2.k0()) ? i4 : i3;
            int i10 = (r0Var2.l0() || r0Var2.k0()) ? i4 : i3;
            tr2Var2 = tr2Var;
            final Context context4 = context2;
            final e89 e89Var14 = e89Var3;
            final e89 e89Var15 = e89Var4;
            final r0 r0Var6 = r0Var2;
            final use useVar2 = useVar;
            final e89 e89Var16 = e89Var;
            final boolean z10 = z6;
            final e89 e89Var17 = e89Var6;
            final xn5 xn5Var3 = xn5Var;
            final p3c p3cVar5 = p3cVar2;
            final TarotSkinIdentify tarotSkinIdentify2 = tarotSkinIdentify;
            int i11 = i3;
            final e89 e89Var18 = e89Var2;
            n26 n26Var = new n26() { // from class: rs2
                @Override // defpackage.n26
                public final Object m(Object obj2, Object obj3, Object obj4) {
                    g7g m58Var;
                    l46 l46Var4 = (l46) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((c31) obj2).getClass();
                    boolean z11 = true;
                    boolean zW = l46Var4.W(iIntValue & 1, (iIntValue & 17) != 16);
                    wef wefVar = wef.a;
                    if (!zW) {
                        l46Var4.Z();
                        return wefVar;
                    }
                    if (z9) {
                        l46Var4.f0(-907854159);
                        rs0.f(b.c, false, mh3.c, l46Var4, 384, 2);
                        l46Var4.r(false);
                        return wefVar;
                    }
                    l46Var4.f0(-907765747);
                    l46Var4.r(false);
                    final e89 e89Var19 = e89Var8;
                    boolean zBooleanValue = ((Boolean) e89Var19.getValue()).booleanValue();
                    final r0 r0Var7 = r0Var6;
                    boolean z12 = zBooleanValue && !r0Var7.h0() && r0Var7.e0();
                    boolean zH0 = r0Var7.h0();
                    boolean zBooleanValue2 = ((Boolean) r0Var7.Q1.getValue()).booleanValue();
                    boolean zBooleanValue3 = ((Boolean) r0Var7.R1.getValue()).booleanValue();
                    boolean zS0 = r0Var7.s0();
                    if (zH0 || (!z12 && !zBooleanValue2 && (!zBooleanValue3 || zS0))) {
                        z11 = false;
                    }
                    final p3c p3cVar6 = p3cVar5;
                    final Context context5 = context4;
                    final dd2 dd2VarB0 = af1.b0(-907793376, new x6(p3cVar6, context5, e89Var18, 14), l46Var4);
                    final boolean z13 = r0Var7.a0() instanceof id4;
                    final ii6 ii6VarB0 = g21.b0(l46Var4);
                    final boolean z14 = z12;
                    FillElement fillElement = b.c;
                    long j = y72.j;
                    if (z13) {
                        l46Var4.f0(-906354968);
                        WeakHashMap weakHashMap = m8g.w;
                        m58Var = new m58(q7c.k(l46Var4).l, 16 | 15);
                        l46Var4.r(false);
                    } else {
                        l46Var4.f0(-906250653);
                        WeakHashMap weakHashMap2 = m8g.w;
                        m58Var = q7c.k(l46Var4).l;
                        l46Var4.r(false);
                    }
                    x16 x16Var7 = x16Var;
                    mma mmaVar2 = mmaVar;
                    TarotSkinIdentify tarotSkinIdentify3 = tarotSkinIdentify2;
                    g7g g7gVar = m58Var;
                    final tr2 tr2Var3 = tr2Var2;
                    final e89 e89Var20 = e89Var17;
                    dd2 dd2VarB1 = af1.b0(1724426833, new as2(r0Var7, x16Var7, mmaVar2, context5, tarotSkinIdentify3, tr2Var3, e89Var20, e89Var14, e89Var11, e89Var15, z10, str3), l46Var4);
                    final t7 t7Var2 = t7Var;
                    final e89 e89Var21 = e89Var16;
                    final use useVar3 = useVar2;
                    final e89 e89Var22 = e89Var9;
                    final kzd kzdVar3 = kzdVar;
                    final xn5 xn5Var4 = xn5Var3;
                    final vsd vsdVar3 = vsdVar;
                    final e89 e89Var23 = e89Var7;
                    final boolean z15 = z11;
                    dd2 dd2VarB2 = af1.b0(-1669472528, new l26() { // from class: bs2
                        @Override // defpackage.l26
                        public final Object z(Object obj5, Object obj6) {
                            boolean z16;
                            g09 g09Var;
                            e92 e92Var;
                            l46 l46Var5 = (l46) obj5;
                            int iIntValue2 = ((Integer) obj6).intValue();
                            boolean zW2 = l46Var5.W(iIntValue2 & 1, (iIntValue2 & 3) != 2);
                            wef wefVar2 = wef.a;
                            if (!zW2) {
                                l46Var5.Z();
                                return wefVar2;
                            }
                            if (z13) {
                                return wefVar2;
                            }
                            final r0 r0Var8 = r0Var7;
                            e89 e89VarJ = jzb.j(r0Var8.p1, l46Var5);
                            boolean z17 = ((w6f) e89VarJ.getValue()).b != d6f.a;
                            g09 g09Var2 = g09.a;
                            final boolean z18 = z14;
                            j09 j09VarN = z18 ? b.c : mh3.N(g09Var2);
                            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var5, 0);
                            int iHashCode = Long.hashCode(l46Var5.T);
                            u8a u8aVarM = l46Var5.m();
                            j09 j09VarJ = m93.J(l46Var5, j09VarN);
                            lf2.q.getClass();
                            l46Var5.j0();
                            if (l46Var5.S) {
                                l46Var5.l(LayoutNode.h1);
                            } else {
                                l46Var5.s0();
                            }
                            dec.l(hj6.z, l46Var5, c92VarA);
                            dec.l(hj6.y, l46Var5, u8aVarM);
                            dec.l(hj6.X, l46Var5, Integer.valueOf(iHashCode));
                            dec.k(l46Var5);
                            dec.l(hj6.x, l46Var5, j09VarJ);
                            if (z18 && z17) {
                                l46Var5.f0(-1442626601);
                                o5c.f(l46Var5, b.d(mh3.W(g09Var2), 64.0f));
                                l46Var5.r(false);
                            } else {
                                l46Var5.f0(-1442518008);
                                l46Var5.r(false);
                            }
                            dd2 dd2VarB3 = af1.b0(-311510814, new w7(13, r0Var8, e89VarJ), l46Var5);
                            e92 e92Var2 = e92.a;
                            m93.b(e92Var2, z17, null, null, null, null, dd2VarB3, l46Var5, 1572870, 30);
                            final boolean z19 = z17;
                            boolean zM1 = r0Var8.m0();
                            final t7 t7Var3 = t7Var2;
                            if (zM1 && r0Var8.Q()) {
                                l46Var5.f0(-1442085217);
                                String strQ3 = afc.q(R.string.button_continue, l46Var5);
                                boolean zI14 = l46Var5.i(r0Var8) | l46Var5.i(t7Var3);
                                Context context6 = context5;
                                boolean zI15 = zI14 | l46Var5.i(context6);
                                Object objR32 = l46Var5.R();
                                if (zI15 || objR32 == sf2.a) {
                                    objR32 = new j8(r0Var8, t7Var3, context6, 14);
                                    l46Var5.p0(objR32);
                                }
                                z16 = false;
                                g09Var = g09Var2;
                                nk8.i(strQ3, (x16) objR32, mh3.N(ynb.a0(b.c(g09Var2, 1.0f), 24.0f, 12.0f)), 0.0f, 0.0f, 0.0f, false, null, null, null, false, l46Var5, 0, 0, 4088);
                                l46Var5 = l46Var5;
                                l46Var5.r(false);
                            } else {
                                z16 = false;
                                g09Var = g09Var2;
                                l46Var5.f0(-1441000248);
                                l46Var5.r(false);
                            }
                            if (r0Var8.e0()) {
                                l46Var5.f0(-1440782101);
                                boolean z20 = z15;
                                final e89 e89Var24 = e89Var21;
                                if (z20) {
                                    l46Var5.f0(-1440741925);
                                    e92Var = e92Var2;
                                    m93.b(e92Var, ((d3c) e89Var24.getValue()).b, null, null, null, null, af1.b0(-649573836, new ec(dd2VarB0, 3), l46Var5), l46Var5, 1572870, 30);
                                    l46Var5.r(z16);
                                } else {
                                    e92Var = e92Var2;
                                    l46Var5.f0(-1440268152);
                                    l46Var5.r(z16);
                                }
                                g09 g09Var3 = g09Var;
                                j09 j09VarA = z18 != 0 ? d92.a(e92Var, g09Var3, 1.0f) : g09Var3;
                                kx0 kx0Var = ndb.X;
                                cx4 cx4VarE = rw4.e(null, kx0Var, 13);
                                f45 f45VarL = rw4.l(null, kx0Var, 13);
                                final tr2 tr2Var4 = tr2Var3;
                                final use useVar4 = useVar3;
                                final e89 e89Var25 = e89Var22;
                                final kzd kzdVar4 = kzdVar3;
                                final xn5 xn5Var5 = xn5Var4;
                                final vsd vsdVar4 = vsdVar3;
                                final e89 e89Var26 = e89Var19;
                                final e89 e89Var27 = e89Var23;
                                dd2 dd2VarB4 = af1.b0(367602543, new n26() { // from class: gs2
                                    /* JADX WARN: Code duplicated, block: B:101:0x01f1  */
                                    /* JADX WARN: Code duplicated, block: B:111:0x020d  */
                                    /* JADX WARN: Code duplicated, block: B:115:0x0227  */
                                    /* JADX WARN: Code duplicated, block: B:119:0x0262  */
                                    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
                                    /* JADX WARN: Code duplicated, block: B:55:0x0111  */
                                    /* JADX WARN: Code duplicated, block: B:66:0x0157  */
                                    /* JADX WARN: Code duplicated, block: B:78:0x01a4  */
                                    /* JADX WARN: Code duplicated, block: B:82:0x01bb A[DONT_INVERT] */
                                    /* JADX WARN: Code duplicated, block: B:83:0x01bd  */
                                    /* JADX WARN: Code duplicated, block: B:84:0x01c1 A[DONT_INVERT] */
                                    /* JADX WARN: Code duplicated, block: B:85:0x01c3  */
                                    /* JADX WARN: Code duplicated, block: B:87:0x01cd  */
                                    /* JADX WARN: Code duplicated, block: B:96:0x01de  */
                                    @Override // defpackage.n26
                                    public final Object m(Object obj7, Object obj8, Object obj9) {
                                        x16 x16Var8;
                                        x16 x16Var9;
                                        int i12;
                                        QuotaBlockReason quotaBlockReason;
                                        boolean z21;
                                        r0 r0Var9;
                                        dd2 dd2VarB5;
                                        boolean zH1;
                                        e89 e89Var28;
                                        boolean z22;
                                        boolean z23;
                                        boolean z24;
                                        int i13;
                                        int i14;
                                        boolean zI16;
                                        Object objR33;
                                        e89 e89Var29;
                                        boolean zG6;
                                        Object objR34;
                                        e89 e89Var30;
                                        kzd kzdVar5;
                                        r0 r0Var10;
                                        xn5 xn5Var6;
                                        vsd vsdVar5;
                                        use useVar5;
                                        boolean zG7;
                                        Object ms2Var;
                                        boolean z25;
                                        boolean z26;
                                        l46 l46Var6 = (l46) obj8;
                                        int iIntValue3 = ((Integer) obj9).intValue();
                                        ((oz) obj7).getClass();
                                        boolean z27 = true;
                                        if (l46Var6.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            r0 r0Var11 = r0Var8;
                                            jd4 jd4VarA0 = r0Var11.a0();
                                            vz9 vz9Var2 = r0Var11.M1;
                                            QuotaBlockReason quotaBlockReasonN = r0Var11.N();
                                            boolean z28 = jd4VarA0 instanceof bd4;
                                            if (!z28) {
                                                quotaBlockReasonN = null;
                                            }
                                            boolean z29 = jd4VarA0 instanceof hd4;
                                            boolean z30 = z29 && r0Var11.H() == null && r0Var11.f0();
                                            boolean z31 = quotaBlockReasonN != null || z30;
                                            j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, ynb.b0(24.0f, 0.0f, b.c(g09.a, 1.0f), 2));
                                            ep5 ep5Var = r0Var11.Y() ? ep5.b : ep5.a;
                                            sp5 sp5Var = r0Var11.i0() ? sp5.b : sp5.a;
                                            int i15 = quotaBlockReasonN == null ? -1 : kt2.a[quotaBlockReasonN.ordinal()];
                                            tr2 tr2Var5 = tr2Var4;
                                            ep5 ep5Var2 = ep5Var;
                                            t7 t7Var4 = t7Var3;
                                            i8c i8cVar2 = sf2.a;
                                            if (i15 != 1) {
                                                if (i15 != 2) {
                                                    l46Var6.f0(-917468498);
                                                    l46Var6.r(false);
                                                    x16Var9 = null;
                                                } else {
                                                    l46Var6.f0(-917523212);
                                                    boolean zI17 = l46Var6.i(tr2Var5) | l46Var6.i(t7Var4) | l46Var6.i(r0Var11);
                                                    Object objR35 = l46Var6.R();
                                                    if (zI17 || objR35 == i8cVar2) {
                                                        objR35 = new zs2(tr2Var5, t7Var4, r0Var11);
                                                        l46Var6.p0(objR35);
                                                    }
                                                    l46Var6.r(false);
                                                    x16Var8 = (x16) ((ym7) objR35);
                                                }
                                                if (quotaBlockReasonN == null) {
                                                    i12 = -1;
                                                } else {
                                                    i12 = kt2.a[quotaBlockReasonN.ordinal()];
                                                }
                                                if (i12 != 1 || i12 == 2 || i12 == 3) {
                                                    l46Var6.f0(-917173842);
                                                    quotaBlockReason = quotaBlockReasonN;
                                                    z21 = z28;
                                                    r0Var9 = r0Var11;
                                                    dd2VarB5 = af1.b0(-9041311, new ug(quotaBlockReason, tr2Var5, t7Var4, r0Var9, j09VarD0, ep5Var2, sp5Var, 1), l46Var6);
                                                    l46Var6.r(false);
                                                } else {
                                                    l46Var6.f0(1078810525);
                                                    if (z30) {
                                                        l46Var6.f0(-916585493);
                                                        dd2VarB5 = af1.b0(545461565, new h8(22, r0Var11, j09VarD0), l46Var6);
                                                        z26 = false;
                                                        l46Var6.r(false);
                                                    } else {
                                                        z26 = false;
                                                        l46Var6.f0(-916356466);
                                                        l46Var6.r(false);
                                                        dd2VarB5 = null;
                                                    }
                                                    l46Var6.r(z26);
                                                    r0Var9 = r0Var11;
                                                    quotaBlockReason = quotaBlockReasonN;
                                                    z21 = z28;
                                                }
                                                dd2 dd2Var2 = dd2VarB5;
                                                zH1 = r0Var9.h0();
                                                e89Var28 = e89Var25;
                                                if (!zH1 || (!((Boolean) e89Var28.getValue()).booleanValue() && (((Boolean) vz9Var2.getValue()).booleanValue() || z29 || z21 || (jd4VarA0 instanceof fd4)))) {
                                                    z22 = false;
                                                } else {
                                                    z22 = true;
                                                }
                                                z23 = jd4VarA0 instanceof fd4;
                                                boolean z32 = !z31;
                                                z24 = ((d3c) e89Var24.getValue()).b;
                                                i13 = R.string.pre_reading_input_daily_limit;
                                                if (!z30) {
                                                    if (z23) {
                                                        i13 = R.string.chat_share_more;
                                                    } else if (quotaBlockReason != null) {
                                                        i14 = hp5.a[quotaBlockReason.ordinal()];
                                                        if (i14 != 1) {
                                                            i13 = R.string.follow_up_input_placeholder;
                                                            if (i14 != 2 && i14 != 3 && i14 != 4) {
                                                                ap.c();
                                                                return null;
                                                            }
                                                        }
                                                    } else if (!((Boolean) vz9Var2.getValue()).booleanValue() || z21) {
                                                        i13 = R.string.chat_continue_chat_placeholder;
                                                    } else {
                                                        i13 = R.string.chat_input_placeholder;
                                                    }
                                                }
                                                int i16 = i13;
                                                if (z18 && z19) {
                                                    z27 = false;
                                                }
                                                zI16 = l46Var6.i(r0Var9);
                                                objR33 = l46Var6.R();
                                                e89Var29 = e89Var26;
                                                if (zI16 || objR33 == i8cVar2) {
                                                    objR33 = new ks2(0, r0Var9, e89Var29);
                                                    l46Var6.p0(objR33);
                                                }
                                                a26 a26Var = (a26) objR33;
                                                zG6 = l46Var6.g(e89Var28);
                                                objR34 = l46Var6.R();
                                                e89Var30 = e89Var27;
                                                if (zG6 || objR34 == i8cVar2) {
                                                    objR34 = new ls2(e89Var30, e89Var28, 0);
                                                    l46Var6.p0(objR34);
                                                }
                                                a26 a26Var2 = (a26) objR34;
                                                boolean zI18 = l46Var6.i(r0Var9);
                                                kzdVar5 = kzdVar4;
                                                boolean zI19 = zI18 | l46Var6.i(kzdVar5);
                                                r0Var10 = r0Var9;
                                                xn5Var6 = xn5Var5;
                                                boolean zI20 = zI19 | l46Var6.i(xn5Var6);
                                                vsdVar5 = vsdVar4;
                                                boolean zG8 = zI20 | l46Var6.g(vsdVar5);
                                                useVar5 = useVar4;
                                                zG7 = zG8 | l46Var6.g(useVar5);
                                                Object objR36 = l46Var6.R();
                                                if (!zG7 || objR36 == i8cVar2) {
                                                    z25 = z24;
                                                    ms2Var = new ms2(r0Var10, kzdVar5, useVar5, xn5Var6, vsdVar5, e89Var29, e89Var30);
                                                    l46Var6.p0(ms2Var);
                                                } else {
                                                    ms2Var = objR36;
                                                    z25 = z24;
                                                }
                                                vd0.g(tr2Var5, null, useVar5, z22, z23, z32, z32, z32, z25, dd2Var2, x16Var9, i16, z27, a26Var, a26Var2, (a26) ms2Var, l46Var6, 8);
                                            } else {
                                                l46Var6.f0(-917608617);
                                                boolean zI21 = l46Var6.i(tr2Var5);
                                                Object objR37 = l46Var6.R();
                                                if (zI21 || objR37 == i8cVar2) {
                                                    objR37 = new ys2(tr2Var5);
                                                    l46Var6.p0(objR37);
                                                }
                                                l46Var6.r(false);
                                                x16Var8 = (x16) ((ym7) objR37);
                                            }
                                            x16Var9 = x16Var8;
                                            if (quotaBlockReasonN == null) {
                                                i12 = -1;
                                            } else {
                                                i12 = kt2.a[quotaBlockReasonN.ordinal()];
                                            }
                                            if (i12 != 1) {
                                                l46Var6.f0(-917173842);
                                                quotaBlockReason = quotaBlockReasonN;
                                                z21 = z28;
                                                r0Var9 = r0Var11;
                                                dd2VarB5 = af1.b0(-9041311, new ug(quotaBlockReason, tr2Var5, t7Var4, r0Var9, j09VarD0, ep5Var2, sp5Var, 1), l46Var6);
                                                l46Var6.r(false);
                                            } else {
                                                l46Var6.f0(-917173842);
                                                quotaBlockReason = quotaBlockReasonN;
                                                z21 = z28;
                                                r0Var9 = r0Var11;
                                                dd2VarB5 = af1.b0(-9041311, new ug(quotaBlockReason, tr2Var5, t7Var4, r0Var9, j09VarD0, ep5Var2, sp5Var, 1), l46Var6);
                                                l46Var6.r(false);
                                            }
                                            dd2 dd2Var3 = dd2VarB5;
                                            zH1 = r0Var9.h0();
                                            e89Var28 = e89Var25;
                                            if (zH1) {
                                                z22 = false;
                                            } else {
                                                z22 = false;
                                            }
                                            z23 = jd4VarA0 instanceof fd4;
                                            boolean z33 = !z31;
                                            z24 = ((d3c) e89Var24.getValue()).b;
                                            i13 = R.string.pre_reading_input_daily_limit;
                                            if (!z30) {
                                                if (z23) {
                                                    i13 = R.string.chat_share_more;
                                                } else if (quotaBlockReason != null) {
                                                    i14 = hp5.a[quotaBlockReason.ordinal()];
                                                    if (i14 != 1) {
                                                        i13 = R.string.follow_up_input_placeholder;
                                                        if (i14 != 2) {
                                                            ap.c();
                                                            return null;
                                                        }
                                                    }
                                                } else if (((Boolean) vz9Var2.getValue()).booleanValue()) {
                                                    i13 = R.string.chat_continue_chat_placeholder;
                                                } else {
                                                    i13 = R.string.chat_continue_chat_placeholder;
                                                }
                                            }
                                            int i17 = i13;
                                            if (z18) {
                                                z27 = false;
                                            }
                                            zI16 = l46Var6.i(r0Var9);
                                            objR33 = l46Var6.R();
                                            e89Var29 = e89Var26;
                                            if (zI16) {
                                                objR33 = new ks2(0, r0Var9, e89Var29);
                                                l46Var6.p0(objR33);
                                            } else {
                                                objR33 = new ks2(0, r0Var9, e89Var29);
                                                l46Var6.p0(objR33);
                                            }
                                            a26 a26Var3 = (a26) objR33;
                                            zG6 = l46Var6.g(e89Var28);
                                            objR34 = l46Var6.R();
                                            e89Var30 = e89Var27;
                                            if (zG6) {
                                                objR34 = new ls2(e89Var30, e89Var28, 0);
                                                l46Var6.p0(objR34);
                                            } else {
                                                objR34 = new ls2(e89Var30, e89Var28, 0);
                                                l46Var6.p0(objR34);
                                            }
                                            a26 a26Var4 = (a26) objR34;
                                            boolean zI110 = l46Var6.i(r0Var9);
                                            kzdVar5 = kzdVar4;
                                            boolean zI111 = zI110 | l46Var6.i(kzdVar5);
                                            r0Var10 = r0Var9;
                                            xn5Var6 = xn5Var5;
                                            boolean zI22 = zI111 | l46Var6.i(xn5Var6);
                                            vsdVar5 = vsdVar4;
                                            boolean zG9 = zI22 | l46Var6.g(vsdVar5);
                                            useVar5 = useVar4;
                                            zG7 = zG9 | l46Var6.g(useVar5);
                                            Object objR38 = l46Var6.R();
                                            if (zG7) {
                                                z25 = z24;
                                                ms2Var = new ms2(r0Var10, kzdVar5, useVar5, xn5Var6, vsdVar5, e89Var29, e89Var30);
                                                l46Var6.p0(ms2Var);
                                            } else {
                                                z25 = z24;
                                                ms2Var = new ms2(r0Var10, kzdVar5, useVar5, xn5Var6, vsdVar5, e89Var29, e89Var30);
                                                l46Var6.p0(ms2Var);
                                            }
                                            vd0.g(tr2Var5, null, useVar5, z22, z23, z33, z33, z33, z25, dd2Var3, x16Var9, i17, z27, a26Var3, a26Var4, (a26) ms2Var, l46Var6, 8);
                                        } else {
                                            l46Var6.Z();
                                        }
                                        return wef.a;
                                    }
                                }, l46Var5);
                                l46 l46Var6 = l46Var5;
                                m93.b(e92Var, z20, j09VarA, cx4VarE, f45VarL, null, dd2VarB4, l46Var6, 1600518, 16);
                                l46Var5 = l46Var6;
                                l46Var5.r(z16);
                            } else {
                                l46Var5.f0(-1434972856);
                                l46Var5.r(z16);
                            }
                            l46Var5.r(true);
                            return wefVar2;
                        }
                    }, l46Var4);
                    final za0 za0Var2 = za0Var;
                    xdc.a(fillElement, dd2VarB1, dd2VarB2, null, null, 0, j, 0L, g7gVar, af1.b0(-618373018, new n26() { // from class: cs2
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r13v2 */
                        /* JADX WARN: Type inference failed for: r13v3, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r13v4 */
                        @Override // defpackage.n26
                        public final Object m(Object obj5, Object obj6, Object obj7) {
                            ?? r13;
                            final xw9 xw9Var = (xw9) obj5;
                            l46 l46Var5 = (l46) obj6;
                            int iIntValue2 = ((Integer) obj7).intValue();
                            xw9Var.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= l46Var5.g(xw9Var) ? 4 : 2;
                            }
                            if (l46Var5.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                FillElement fillElement2 = b.c;
                                boolean z16 = z13;
                                final ii6 ii6Var = ii6VarB0;
                                j09 j09VarG = k8b.g(fillElement2, new zk(z16, ii6Var, 1), l46Var5, 0);
                                final r0 r0Var8 = r0Var7;
                                final boolean z17 = z15;
                                final use useVar4 = useVar3;
                                final tr2 tr2Var4 = tr2Var3;
                                final kzd kzdVar4 = kzdVar3;
                                final t7 t7Var3 = t7Var2;
                                final e89 e89Var24 = e89Var23;
                                final e89 e89Var25 = e89Var20;
                                final e89 e89Var26 = e89Var21;
                                final dd2 dd2Var2 = dd2VarB0;
                                rs0.f(j09VarG, false, af1.b0(1635473251, new n26() { // from class: es2
                                    @Override // defpackage.n26
                                    public final Object m(Object obj8, Object obj9, Object obj10) {
                                        c31 c31Var = (c31) obj8;
                                        l46 l46Var6 = (l46) obj9;
                                        int iIntValue3 = ((Integer) obj10).intValue();
                                        c31Var.getClass();
                                        if ((iIntValue3 & 6) == 0) {
                                            iIntValue3 |= l46Var6.g(c31Var) ? 4 : 2;
                                        }
                                        int i12 = iIntValue3;
                                        if (l46Var6.W(i12 & 1, (i12 & 19) != 18)) {
                                            FillElement fillElement3 = b.c;
                                            xw9 xw9Var2 = xw9Var;
                                            s21.a(ynb.Y(fillElement3, xw9Var2), l46Var6, 0);
                                            r0 r0Var9 = r0Var8;
                                            Boolean bool3 = (Boolean) r0Var9.Q1.getValue();
                                            bool3.booleanValue();
                                            cn1.f(bool3, fillElement3, null, "content", af1.b0(-1655454588, new ns2(useVar4, tr2Var4, xw9Var2, kzdVar4, ii6Var, r0Var9, t7Var3, e89Var24, e89Var25, 0), l46Var6), l46Var6, 27696, 4);
                                            if (z17) {
                                                l46Var6.f0(276456863);
                                                l46Var6.r(false);
                                            } else {
                                                l46Var6.f0(276261780);
                                                lt2.e(c31Var, r0Var9.e0() && ((d3c) e89Var26.getValue()).b, af1.b0(-2076209642, new qx1(dd2Var2, 2), l46Var6), l46Var6, (i12 & 14) | 384);
                                                l46Var6.r(false);
                                            }
                                        } else {
                                            l46Var6.Z();
                                        }
                                        return wef.a;
                                    }
                                }, l46Var5), l46Var5, 384, 2);
                                boolean z18 = ((FeedbackUiState) r0Var8.i2.getValue()) == FeedbackUiState.INPUT;
                                boolean zI14 = l46Var5.i(r0Var8);
                                Object objR32 = l46Var5.R();
                                Object obj8 = sf2.a;
                                if (zI14 || objR32 == obj8) {
                                    objR32 = new qj2(r0Var8, 2);
                                    l46Var5.p0(objR32);
                                }
                                x16 x16Var8 = (x16) objR32;
                                boolean zI15 = l46Var5.i(r0Var8);
                                Object objR33 = l46Var5.R();
                                if (zI15 || objR33 == obj8) {
                                    r13 = 0;
                                    objR33 = new fs2(r0Var8, 0);
                                    l46Var5.p0(objR33);
                                } else {
                                    r13 = 0;
                                }
                                af1.l(z18, x16Var8, (n26) objR33, l46Var5, r13);
                                boolean zBooleanValue4 = ((Boolean) r0Var8.u1.getValue()).booleanValue();
                                List list = (List) r0Var8.v1.getValue();
                                boolean zI16 = l46Var5.i(r0Var8);
                                Object objR34 = l46Var5.R();
                                if (zI16 || objR34 == obj8) {
                                    objR34 = new qj2(r0Var8, 3);
                                    l46Var5.p0(objR34);
                                }
                                x16 x16Var9 = (x16) objR34;
                                boolean zI17 = l46Var5.i(r0Var8);
                                Object objR35 = l46Var5.R();
                                if (zI17 || objR35 == obj8) {
                                    objR35 = new i1(10, r0Var8);
                                    l46Var5.p0(objR35);
                                }
                                jfb.c(zBooleanValue4, list, x16Var9, (l26) objR35, l46Var5, 0);
                                if (((d3c) e89Var26.getValue()).a) {
                                    l46Var5.f0(-833041285);
                                    p3c p3cVar7 = p3cVar6;
                                    boolean zI18 = l46Var5.i(p3cVar7);
                                    Object objR36 = l46Var5.R();
                                    if (zI18 || objR36 == obj8) {
                                        hl hlVar = new hl(0, p3cVar7, p3c.class, "dismissReviewRewardPrompt", "dismissReviewRewardPrompt()V", 0, 23);
                                        l46Var5.p0(hlVar);
                                        objR36 = hlVar;
                                    }
                                    x16 x16Var10 = (x16) ((ym7) objR36);
                                    boolean zI19 = l46Var5.i(p3cVar7);
                                    za0 za0Var3 = za0Var2;
                                    boolean zI20 = zI19 | l46Var5.i(za0Var3);
                                    Context context6 = context5;
                                    boolean zI21 = zI20 | l46Var5.i(context6);
                                    Object objR37 = l46Var5.R();
                                    if (zI21 || objR37 == obj8) {
                                        objR37 = new j8(p3cVar7, za0Var3, context6, 13);
                                        l46Var5.p0(objR37);
                                    }
                                    q1c.c(x16Var10, (x16) objR37, l46Var5, r13);
                                    l46Var5.r(r13);
                                } else {
                                    l46Var5.f0(-832579044);
                                    l46Var5.r(r13);
                                }
                            } else {
                                l46Var5.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var4), l46Var4, 806879664, 184);
                    return wefVar;
                }
            };
            x16Var2 = x16Var;
            kzdVar2 = kzdVar;
            l46Var3 = l46Var;
            bzd.l(null, i10, 0L, null, null, af1.b0(-564167531, n26Var, l46Var3), l46Var3, 1572864, 61);
            e00.a(48, af1.b0(-37005589, new fs2(r0Var6, 1), l46Var3), l46Var3, ((FeedbackUiState) r0Var6.i2.getValue()) == FeedbackUiState.SUCCESS ? 1 : i11);
        } else {
            tr2Var2 = tr2Var;
            x16Var2 = x16Var;
            kzdVar2 = kzdVar;
            l46Var3.Z();
        }
        ojb ojbVarV = l46Var3.v();
        if (ojbVarV != null) {
            ojbVarV.d = new xr2(tr2Var2, kzdVar2, x16Var2, i);
        }
    }

    public static final void b(e89 e89Var, e89 e89Var2) {
        x16 x16Var = (x16) e89Var.getValue();
        e89Var2.setValue(null);
        e89Var.setValue(null);
        if (x16Var != null) {
            x16Var.invoke();
        }
    }

    public static final void c(mma mmaVar, Context context, r0 r0Var, TarotSkinIdentify tarotSkinIdentify, e89 e89Var, e89 e89Var2, x16 x16Var) {
        String str;
        if (mmaVar.f.h()) {
            List list = g6g.a;
            if (!g6g.c(context)) {
                int i = r0.j2;
                r0Var.g1(null);
                x16Var.invoke();
                return;
            }
        }
        boolean zQ = r0Var.Q();
        vz9 vz9Var = r0Var.E1;
        if (!zQ) {
            str = null;
        } else if (r0Var.V() != null) {
            String str2 = r0Var.x1;
            if (str2 != null) {
                switch (str2) {
                    case "shopping-decision":
                        str = "shopping";
                        break;
                    case "choose-between-two":
                        str = "two_choice";
                        break;
                    case "yes-or-no":
                        str = "yes_no";
                        break;
                    case "choose-from-three":
                        str = "three_choice";
                        break;
                    default:
                        str = null;
                        break;
                }
            } else {
                str = null;
            }
        } else {
            str = ((Boolean) vz9Var.getValue()).booleanValue() ? "main_ask" : null;
        }
        if (str != null) {
            v4g v4gVarH = u3c.h(context, r4g.QuickDecision);
            String str3 = v4gVarH.c;
            boolean z = v4gVarH.b;
            boolean z2 = v4gVarH.a;
            boolean z3 = (z2 || z || pa7.t(str3, u3c.j())) ? false : true;
            hf8.Q.getClass();
            m8b m8bVarA = ef8.a("WidgetGuide");
            boolean zBooleanValue = ((Boolean) vz9Var.getValue()).booleanValue();
            StringBuilder sb = new StringBuilder("QuickDecision back gate: scenario=");
            sb.append(str);
            sb.append(", eligible=");
            sb.append(zBooleanValue);
            sb.append(", installed=");
            ib8.w(sb, z2, ", optedOut=", z, ", lastAnySheetDate=");
            sb.append(str3);
            sb.append(", shouldShow=");
            sb.append(z3);
            m8bVarA.e(sb.toString());
            if (z3) {
                e89Var.setValue(new s4g(tarotSkinIdentify, str));
                e89Var2.setValue(x16Var);
                return;
            }
        }
        r0Var.g1(null);
        x16Var.invoke();
    }

    public static final void d(tr2 tr2Var, j09 j09Var, kzd kzdVar, x16 x16Var, l46 l46Var, int i) {
        j09 j09Var2;
        kzdVar.getClass();
        x16Var.getClass();
        l46Var.h0(869981334);
        int i2 = (l46Var.i(tr2Var) ? 4 : 2) | i | 48 | (l46Var.i(kzdVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            snd.a(tr2Var.c.R(), af1.b0(-413468129, new xr2(tr2Var, kzdVar, x16Var, 0, (byte) 0), l46Var), l46Var, MixedDeckSnapshot.$stable | 48);
            j09Var2 = g09.a;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q8(i, 6, tr2Var, j09Var2, kzdVar, x16Var);
        }
    }

    public static final void e(c31 c31Var, boolean z, dd2 dd2Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(1399348734);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(c31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(dd2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            m93.d(z, b.c(mh3.N(c31Var.a(g09.a, ndb.w)), 1.0f), null, null, null, af1.b0(1032312870, new ec(dd2Var, 2), l46Var), l46Var, ((i2 >> 3) & 14) | 196608, 28);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i30(c31Var, z, dd2Var, i, 2);
        }
    }
}

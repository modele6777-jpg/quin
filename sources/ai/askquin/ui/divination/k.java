package ai.askquin.ui.divination;

import ai.askquin.R;
import ai.askquin.data.QuotaBlockReason;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.ClarifyingCardDrawActionState;
import ai.askquin.ui.conversation.ClarifyingCardSkipActionState;
import ai.askquin.ui.conversation.FailReason;
import ai.askquin.ui.conversation.SceneTarot;
import ai.askquin.ui.conversation.dialogue.ClarifyingCardState;
import ai.askquin.ui.conversation.dialogue.NewReadingState;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.divination.OverviewItem;
import ai.askquin.ui.divination.k;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.router.AppRoute;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.a26;
import defpackage.a7c;
import defpackage.ad4;
import defpackage.af1;
import defpackage.afc;
import defpackage.ap;
import defpackage.aw2;
import defpackage.bd4;
import defpackage.bm8;
import defpackage.bw2;
import defpackage.bw9;
import defpackage.bx9;
import defpackage.c18;
import defpackage.c4a;
import defpackage.c78;
import defpackage.ca2;
import defpackage.cd4;
import defpackage.cgb;
import defpackage.cgg;
import defpackage.d6f;
import defpackage.da9;
import defpackage.db9;
import defpackage.dd4;
import defpackage.die;
import defpackage.e89;
import defpackage.e8b;
import defpackage.eab;
import defpackage.eb3;
import defpackage.ep5;
import defpackage.et8;
import defpackage.eze;
import defpackage.fc5;
import defpackage.fd4;
import defpackage.ft8;
import defpackage.g21;
import defpackage.gd4;
import defpackage.ggb;
import defpackage.gt8;
import defpackage.h0e;
import defpackage.hd4;
import defpackage.hgb;
import defpackage.ht8;
import defpackage.i8c;
import defpackage.id4;
import defpackage.ii6;
import defpackage.iif;
import defpackage.ip5;
import defpackage.iy9;
import defpackage.j09;
import defpackage.j18;
import defpackage.j4a;
import defpackage.jd4;
import defpackage.jme;
import defpackage.job;
import defpackage.jsd;
import defpackage.jt8;
import defpackage.jv9;
import defpackage.jzb;
import defpackage.k8b;
import defpackage.k95;
import defpackage.kr7;
import defpackage.kv1;
import defpackage.l26;
import defpackage.l46;
import defpackage.l8b;
import defpackage.m82;
import defpackage.mo3;
import defpackage.mue;
import defpackage.mv0;
import defpackage.mv9;
import defpackage.mx3;
import defpackage.n25;
import defpackage.nfc;
import defpackage.nk8;
import defpackage.nt8;
import defpackage.nte;
import defpackage.o82;
import defpackage.ojb;
import defpackage.ot8;
import defpackage.p05;
import defpackage.pa7;
import defpackage.pp5;
import defpackage.pr4;
import defpackage.pu4;
import defpackage.pue;
import defpackage.pv9;
import defpackage.q1c;
import defpackage.q9b;
import defpackage.qc0;
import defpackage.ql6;
import defpackage.qt8;
import defpackage.qv9;
import defpackage.rk6;
import defpackage.rp3;
import defpackage.rp5;
import defpackage.ru9;
import defpackage.rv9;
import defpackage.s72;
import defpackage.sf2;
import defpackage.sfb;
import defpackage.shb;
import defpackage.snd;
import defpackage.sp5;
import defpackage.sv9;
import defpackage.t12;
import defpackage.t68;
import defpackage.t7;
import defpackage.t72;
import defpackage.te3;
import defpackage.tec;
import defpackage.tm7;
import defpackage.tr2;
import defpackage.tt1;
import defpackage.ub3;
import defpackage.uc0;
import defpackage.v4e;
import defpackage.v51;
import defpackage.vt1;
import defpackage.vz9;
import defpackage.wef;
import defpackage.wg;
import defpackage.whb;
import defpackage.x12;
import defpackage.x16;
import defpackage.x1f;
import defpackage.x57;
import defpackage.xn9;
import defpackage.xw9;
import defpackage.y6c;
import defpackage.y72;
import defpackage.ycc;
import defpackage.ym7;
import defpackage.ynb;
import defpackage.zc4;
import defpackage.zn2;
import defpackage.zrd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final void a(int i, l46 l46Var) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-662436726);
        if (l46Var2.W(i & 1, i != 0)) {
            ca2.a.getClass();
            if (ca2.c) {
                l46Var2.f0(722471832);
                l46Var2.r(false);
            } else {
                l46Var2.f0(722279508);
                String strQ = afc.q(R.string.ai_generated_disclaimer, l46Var2);
                mue mueVar = pue.a;
                nte.b(strQ, null, ((e8b) l46Var2.k(l8b.a)).s, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 1, 0, null, pue.j(l46Var2), l46Var, 0, 24576, 113658);
                l46Var2 = l46Var;
                l46Var2.r(false);
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new db9(i, 10);
        }
    }

    public static final void b(final j09 j09Var, final long j, float f, float f2, l46 l46Var, final int i) {
        final float f3;
        final float f4;
        float f5;
        float f6;
        l46Var.h0(1320278744);
        int i2 = i | (l46Var.f(j) ? 32 : 16) | 28032;
        boolean z = true;
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                f5 = 4.0f;
                f6 = 8.0f;
            } else {
                l46Var.Z();
                f5 = f;
                f6 = f2;
            }
            l46Var.s();
            j09 j09VarD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(j09Var, 1.0f), 0.0f);
            if ((((i2 & 112) ^ 48) <= 32 || !l46Var.f(j)) && (i2 & 48) != 32) {
                z = false;
            }
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = new kv1(f6, f5, j);
                l46Var.p0(objR);
            }
            nk8.e(0, (a26) objR, l46Var, j09VarD);
            f3 = f5;
            f4 = f6;
        } else {
            l46Var.Z();
            f3 = f;
            f4 = f2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(j, f3, f4, i) { // from class: iv9
                public final /* synthetic */ long b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(7);
                    k.b(this.a, this.b, this.c, this.d, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void c(final j18 j18Var, final ru9 ru9Var, final boolean z, final boolean z2, final boolean z3, final x16 x16Var, l46 l46Var, final int i) {
        e89 e89Var;
        e89 e89Var2;
        j18Var.getClass();
        ru9Var.getClass();
        x16Var.getClass();
        l46Var.h0(1029501137);
        int i2 = i | (l46Var.g(j18Var) ? 4 : 2) | (l46Var.g(ru9Var) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.h(z3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var) ? 131072 : 65536);
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            e89 e89VarI = q1c.i(Boolean.valueOf(z), l46Var);
            e89 e89VarI2 = q1c.i(Boolean.valueOf(z2), l46Var);
            e89 e89VarI3 = q1c.i(Boolean.valueOf(z3), l46Var);
            e89 e89VarI4 = q1c.i(x16Var, l46Var);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = zrd.b(new te3(j18Var, 6));
                l46Var.p0(objR);
            }
            h0e h0eVar = (h0e) objR;
            int i3 = i2 & 112;
            boolean z4 = i3 == 32;
            Object objR2 = l46Var.R();
            if (z4 || objR2 == obj) {
                objR2 = new jv9(h0eVar, ru9Var, null);
                l46Var.p0(objR2);
            }
            wef wefVar = wef.a;
            af1.o((l26) objR2, l46Var, wefVar);
            int i4 = i2 & 14;
            boolean zG = l46Var.g(e89VarI) | l46Var.g(e89VarI2) | (i3 == 32) | (i4 == 4) | l46Var.g(e89VarI4);
            Object objR3 = l46Var.R();
            if (zG || objR3 == obj) {
                e89Var = e89VarI;
                e89Var2 = e89VarI3;
                objR3 = new mv9(e89Var, e89VarI2, ru9Var, j18Var, e89VarI4, null);
                l46Var.p0(objR3);
            } else {
                e89Var = e89VarI;
                e89Var2 = e89VarI3;
            }
            af1.o((l26) objR3, l46Var, wefVar);
            boolean zG2 = l46Var.g(e89Var) | l46Var.g(e89Var2) | (i3 == 32) | (i4 == 4);
            Object objR4 = l46Var.R();
            if (zG2 || objR4 == obj) {
                Object pv9Var = new pv9(ru9Var, j18Var, e89Var, e89Var2, null);
                l46Var.p0(pv9Var);
                objR4 = pv9Var;
            }
            af1.o((l26) objR4, l46Var, wefVar);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(ru9Var, z, z2, z3, x16Var, i) { // from class: xu9
                public final /* synthetic */ ru9 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ x16 f;

                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = k99.P(1);
                    k.c(this.a, this.b, this.c, this.d, this.e, this.f, (l46) obj2, iP);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:239:0x039d  */
    /* JADX WARN: Code duplicated, block: B:247:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:250:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:256:0x03de A[EDGE_INSN: B:256:0x03de->B:257:0x03df BREAK  A[LOOP:0: B:248:0x03ba->B:255:0x03d9]] */
    /* JADX WARN: Code duplicated, block: B:263:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:266:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:268:0x0402  */
    /* JADX WARN: Code duplicated, block: B:274:0x0414  */
    /* JADX WARN: Code duplicated, block: B:278:0x0439 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:279:0x043b  */
    /* JADX WARN: Code duplicated, block: B:282:0x0444  */
    /* JADX WARN: Code duplicated, block: B:288:0x0463  */
    /* JADX WARN: Code duplicated, block: B:292:0x046b  */
    /* JADX WARN: Code duplicated, block: B:297:0x0481  */
    /* JADX WARN: Code duplicated, block: B:303:0x0493  */
    /* JADX WARN: Code duplicated, block: B:309:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:312:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:313:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:317:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:321:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:323:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:325:0x0508  */
    /* JADX WARN: Code duplicated, block: B:327:0x0512  */
    /* JADX WARN: Code duplicated, block: B:329:0x0520  */
    /* JADX WARN: Code duplicated, block: B:331:0x0524  */
    /* JADX WARN: Code duplicated, block: B:332:0x0536  */
    /* JADX WARN: Code duplicated, block: B:334:0x053a  */
    /* JADX WARN: Code duplicated, block: B:335:0x0563  */
    /* JADX WARN: Code duplicated, block: B:337:0x0567  */
    /* JADX WARN: Code duplicated, block: B:340:0x0577  */
    /* JADX WARN: Code duplicated, block: B:345:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:347:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:349:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:351:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:353:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:354:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:355:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:362:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:364:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:367:0x0613  */
    /* JADX WARN: Code duplicated, block: B:368:0x0615  */
    /* JADX WARN: Code duplicated, block: B:370:0x0619  */
    /* JADX WARN: Code duplicated, block: B:376:0x0628  */
    /* JADX WARN: Code duplicated, block: B:379:0x0631  */
    /* JADX WARN: Code duplicated, block: B:382:0x063b  */
    /* JADX WARN: Code duplicated, block: B:385:0x064a  */
    /* JADX WARN: Code duplicated, block: B:390:0x066c A[EDGE_INSN: B:390:0x066c->B:391:0x066e BREAK  A[LOOP:2: B:383:0x0640->B:572:0x0640]] */
    /* JADX WARN: Code duplicated, block: B:401:0x0693  */
    /* JADX WARN: Code duplicated, block: B:402:0x0696  */
    /* JADX WARN: Code duplicated, block: B:408:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:415:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:418:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:419:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:422:0x0707  */
    /* JADX WARN: Code duplicated, block: B:423:0x0709  */
    /* JADX WARN: Code duplicated, block: B:426:0x071c  */
    /* JADX WARN: Code duplicated, block: B:427:0x071e  */
    /* JADX WARN: Code duplicated, block: B:430:0x0728  */
    /* JADX WARN: Code duplicated, block: B:431:0x072a  */
    /* JADX WARN: Code duplicated, block: B:434:0x0735  */
    /* JADX WARN: Code duplicated, block: B:435:0x0737  */
    /* JADX WARN: Code duplicated, block: B:438:0x0751  */
    /* JADX WARN: Code duplicated, block: B:439:0x0753  */
    /* JADX WARN: Code duplicated, block: B:442:0x075d  */
    /* JADX WARN: Code duplicated, block: B:443:0x075f  */
    /* JADX WARN: Code duplicated, block: B:446:0x076c  */
    /* JADX WARN: Code duplicated, block: B:447:0x076e  */
    /* JADX WARN: Code duplicated, block: B:450:0x0779  */
    /* JADX WARN: Code duplicated, block: B:451:0x077b  */
    /* JADX WARN: Code duplicated, block: B:454:0x0786  */
    /* JADX WARN: Code duplicated, block: B:455:0x0788  */
    /* JADX WARN: Code duplicated, block: B:458:0x0793  */
    /* JADX WARN: Code duplicated, block: B:459:0x0795  */
    /* JADX WARN: Code duplicated, block: B:462:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:463:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:466:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:467:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:470:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:471:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:474:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:475:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:478:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:479:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:482:0x081e  */
    /* JADX WARN: Code duplicated, block: B:483:0x0820  */
    /* JADX WARN: Code duplicated, block: B:486:0x082b  */
    /* JADX WARN: Code duplicated, block: B:487:0x082d  */
    /* JADX WARN: Code duplicated, block: B:490:0x083b  */
    /* JADX WARN: Code duplicated, block: B:491:0x083d  */
    /* JADX WARN: Code duplicated, block: B:494:0x0845  */
    /* JADX WARN: Code duplicated, block: B:495:0x0847  */
    /* JADX WARN: Code duplicated, block: B:498:0x084f  */
    /* JADX WARN: Code duplicated, block: B:499:0x0851  */
    /* JADX WARN: Code duplicated, block: B:502:0x0859  */
    /* JADX WARN: Code duplicated, block: B:503:0x085b  */
    /* JADX WARN: Code duplicated, block: B:506:0x0863  */
    /* JADX WARN: Code duplicated, block: B:507:0x0865  */
    /* JADX WARN: Code duplicated, block: B:510:0x086c  */
    /* JADX WARN: Code duplicated, block: B:511:0x086e  */
    /* JADX WARN: Code duplicated, block: B:514:0x0876  */
    /* JADX WARN: Code duplicated, block: B:515:0x0878  */
    /* JADX WARN: Code duplicated, block: B:518:0x0880  */
    /* JADX WARN: Code duplicated, block: B:519:0x0882  */
    /* JADX WARN: Code duplicated, block: B:522:0x088a  */
    /* JADX WARN: Code duplicated, block: B:523:0x088c  */
    /* JADX WARN: Code duplicated, block: B:526:0x0894  */
    /* JADX WARN: Code duplicated, block: B:527:0x0896  */
    /* JADX WARN: Code duplicated, block: B:530:0x089e  */
    /* JADX WARN: Code duplicated, block: B:531:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:534:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:535:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:538:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:539:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:542:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:543:0x08be  */
    /* JADX WARN: Code duplicated, block: B:547:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:551:0x0951  */
    /* JADX WARN: Code duplicated, block: B:554:0x095a  */
    /* JADX WARN: Code duplicated, block: B:556:0x03de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:560:0x05f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:0x05ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:0x05e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118, types: [l46] */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v121 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v152 */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v182 */
    /* JADX WARN: Type inference failed for: r103v0, types: [l46] */
    /* JADX WARN: Type inference failed for: r12v9, types: [l46] */
    /* JADX WARN: Type inference failed for: r37v10 */
    /* JADX WARN: Type inference failed for: r37v3 */
    /* JADX WARN: Type inference failed for: r37v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v16, types: [boolean] */
    public static final void d(final j09 j09Var, final boolean z, final FailReason failReason, final bd4 bd4Var, final List list, final pp5 pp5Var, final l26 l26Var, final List list2, final boolean z2, final a26 a26Var, final a26 a26Var2, final a26 a26Var3, final a26 a26Var4, final a26 a26Var5, final a26 a26Var6, final a26 a26Var7, final a26 a26Var8, final QuotaBlockReason quotaBlockReason, final QuotaBlockReason quotaBlockReason2, final ip5 ip5Var, final a26 a26Var9, final a26 a26Var10, final j18 j18Var, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, final x16 x16Var4, final boolean z3, final xw9 xw9Var, final ii6 ii6Var, final boolean z4, final x16 x16Var5, final x16 x16Var6, final sfb sfbVar, final boolean z5, final a26 a26Var11, final x16 x16Var7, final d6f d6fVar, final x16 x16Var8, final boolean z6, final QuotaBlockReason quotaBlockReason3, final x16 x16Var9, final a26 a26Var12, final boolean z7, final boolean z8, final String str, final x16 x16Var10, l46 l46Var, final int i, final int i2) {
        int i3;
        boolean z9;
        boolean z10;
        ojb ojbVarV;
        ArrayList arrayList;
        int i4;
        Iterable iterableSubList;
        int i5;
        boolean z11;
        boolean z12;
        Object obj;
        h0e h0eVar;
        boolean zG;
        boolean z13;
        Object obj2;
        boolean zBooleanValue;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        final boolean z18;
        boolean z19;
        final boolean zF;
        ?? r37;
        final boolean z20;
        int i6;
        boolean z21;
        boolean z22;
        Object obj3;
        final e89 e89Var;
        c78 c78VarW;
        Iterator it;
        int i7;
        final boolean z23;
        final boolean z24;
        final c78 c78VarN;
        final boolean z25;
        float f;
        ?? r0;
        Integer numValueOf;
        boolean z26;
        boolean z27;
        Object obj4;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        boolean z38;
        boolean z39;
        boolean z40;
        boolean z41;
        boolean z42;
        boolean z43;
        boolean z44;
        final ?? r5;
        final float f2;
        boolean z45;
        boolean z46;
        boolean z47;
        boolean z48;
        boolean z49;
        boolean z50;
        boolean z51;
        boolean z52;
        boolean z53;
        boolean z54;
        boolean z55;
        boolean z56;
        boolean z57;
        boolean z58;
        boolean z59;
        boolean z60;
        boolean z61;
        Object obj5;
        int i8;
        ?? r1;
        ListIterator listIterator;
        ql6 ql6Var;
        OverviewItem overviewItem;
        Object next;
        int i9;
        ot8 ot8Var;
        jt8 jt8Var;
        String str2;
        String str3;
        t68 t68Var;
        ht8 ht8Var;
        String str4;
        t12 t12Var;
        ft8 ft8Var;
        TarotCardChoice tarotCardChoice;
        List list3;
        String strE;
        Iterator it2;
        int i10;
        ot8 ot8Var2;
        int i11;
        dd4 dd4Var = bd4Var.b;
        list.getClass();
        l26Var.getClass();
        list2.getClass();
        a26Var.getClass();
        a26Var2.getClass();
        a26Var3.getClass();
        a26Var4.getClass();
        a26Var5.getClass();
        a26Var6.getClass();
        a26Var7.getClass();
        a26Var8.getClass();
        a26Var9.getClass();
        a26Var10.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        x16Var4.getClass();
        x16Var5.getClass();
        x16Var6.getClass();
        a26Var11.getClass();
        d6fVar.getClass();
        x16Var8.getClass();
        x16Var9.getClass();
        a26Var12.getClass();
        x16Var10.getClass();
        l46Var.h0(-753662762);
        int i12 = i | (l46Var.g(j09Var) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.g(failReason) ? 256 : 128) | (l46Var.i(bd4Var) ? 2048 : 1024) | (l46Var.g(list) ? 16384 : 8192) | (l46Var.g(pp5Var) ? 131072 : 65536) | (l46Var.i(l26Var) ? 1048576 : 524288) | (l46Var.g(list2) ? 8388608 : 4194304) | (l46Var.h(z2) ? 67108864 : 33554432) | (l46Var.i(a26Var) ? 536870912 : 268435456);
        int i13 = (l46Var.i(a26Var2) ? (char) 4 : (char) 2) | (l46Var.i(a26Var3) ? ' ' : (char) 16) | (l46Var.i(a26Var4) ? 256 : 128) | (l46Var.i(a26Var5) ? 2048 : 1024) | (l46Var.i(a26Var6) ? 16384 : 8192) | (l46Var.i(a26Var7) ? 131072 : 65536) | (l46Var.i(a26Var8) ? 1048576 : 524288) | (l46Var.e(quotaBlockReason == null ? -1 : quotaBlockReason.ordinal()) ? 8388608 : 4194304) | (l46Var.e(quotaBlockReason2 == null ? -1 : quotaBlockReason2.ordinal()) ? 67108864 : 33554432) | (l46Var.g(ip5Var) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i3 = i2 | (l46Var.i(a26Var9) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(a26Var10) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.g(j18Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.i(x16Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var.i(x16Var2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= l46Var.i(x16Var3) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= l46Var.i(x16Var4) ? 1048576 : 524288;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= l46Var.g(xw9Var) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= l46Var.g(ii6Var) ? 536870912 : 268435456;
        }
        int i14 = i3;
        int i15 = (l46Var.h(z4) ? (char) 4 : (char) 2) | (l46Var.i(x16Var5) ? ' ' : (char) 16) | (l46Var.i(x16Var6) ? 256 : 128) | (l46Var.e(sfbVar == null ? -1 : sfbVar.ordinal()) ? 2048 : 1024) | (l46Var.h(z5) ? 16384 : 8192) | (l46Var.i(a26Var11) ? 131072 : 65536) | (l46Var.i(x16Var7) ? 1048576 : 524288) | (l46Var.e(d6fVar.ordinal()) ? (char) 0 : (char) 0) | (l46Var.i(x16Var8) ? (char) 0 : (char) 0) | (l46Var.h(z6) ? (char) 0 : (char) 0);
        int i16 = (l46Var.e(quotaBlockReason3 == null ? -1 : quotaBlockReason3.ordinal()) ? (char) 4 : (char) 2) | (l46Var.i(x16Var9) ? ' ' : (char) 16) | (l46Var.i(a26Var12) ? (char) 256 : (char) 128) | (l46Var.h(z7) ? (char) 2048 : (char) 1024) | (l46Var.h(z8) ? (char) 16384 : (char) 8192) | (l46Var.g(str) ? (char) 0 : (char) 0) | (l46Var.i(x16Var10) ? (char) 0 : (char) 0);
        if ((i12 & 306783379) == 306783378 && (i13 & 306783379) == 306783378) {
            z9 = true;
            if ((302589075 & i14) == 302589074 && (i15 & 306783379) == 306783378 && (i16 & 599187) == 599186) {
                z10 = false;
            }
            if (l46Var.W(i12 & 1, z10)) {
                l46Var.b0();
                if ((i & 1) != 0 && !l46Var.C()) {
                    l46Var.Z();
                }
                l46Var.s();
                arrayList = pp5Var.a;
                if (z4) {
                    i4 = -1;
                    break;
                }
                it2 = arrayList.iterator();
                i10 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    Iterator it3 = it2;
                    ot8Var2 = (ot8) it2.next();
                    i11 = i10;
                    if (!(ot8Var2 instanceof et8) && ((et8) ot8Var2).c) {
                        i4 = i11;
                        break;
                    } else {
                        i10 = i11 + 1;
                        it2 = it3;
                    }
                }
                if (i4 != arrayList.size() - 1 || i4 == -1) {
                    iterableSubList = pu4.a;
                } else {
                    iterableSubList = arrayList.subList(i4 + 1, arrayList.size());
                }
                i5 = i15 & 14;
                if (i5 == 4) {
                    z11 = z9;
                } else {
                    z11 = false;
                }
                Iterable iterable = iterableSubList;
                Object objR = l46Var.R();
                z12 = z11;
                i8c i8cVar = sf2.a;
                if (!z12 || objR == i8cVar) {
                    mx3 mx3VarB = zrd.b(new mv0(z4, list, 5));
                    l46Var.p0(mx3VarB);
                    obj = mx3VarB;
                } else {
                    obj = objR;
                }
                h0eVar = (h0e) obj;
                zG = l46Var.g(((ad4) dd4Var).a.a);
                Object objR2 = l46Var.R();
                obj2 = objR2;
                if (zG || objR2 == i8cVar) {
                    if (!z8 || k(list)) {
                        z13 = false;
                    } else {
                        z13 = z9;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z13);
                    l46Var.p0(boolValueOf);
                    obj2 = boolValueOf;
                }
                zBooleanValue = ((Boolean) obj2).booleanValue();
                if (((Boolean) h0eVar.getValue()).booleanValue() || z7) {
                    z14 = false;
                } else {
                    z14 = z9;
                }
                if (z2 && z14) {
                    z15 = z9;
                } else {
                    z15 = false;
                }
                z16 = !z2;
                if (((Boolean) h0eVar.getValue()).booleanValue() || z7) {
                    z17 = false;
                } else {
                    z17 = z9;
                }
                int size = list2.size();
                z18 = z15;
                if (z2 && z17 && size == 3) {
                    z19 = z9;
                } else {
                    z19 = false;
                }
                zF = k8b.f((e8b) l46Var.k(l8b.a));
                if (z18 || zF) {
                    r37 = 0;
                } else {
                    r37 = z9;
                }
                z20 = z19;
                boolean zG2 = l46Var.g(((ad4) dd4Var).a.a);
                i6 = i12 & 29360128;
                if (i6 != 8388608) {
                    z21 = false;
                } else {
                    z21 = z9;
                }
                z22 = zG2 | z21;
                Object objR3 = l46Var.R();
                obj3 = objR3;
                if (z22 || objR3 == i8cVar) {
                    vz9 vz9VarF = q1c.f(Boolean.TRUE);
                    l46Var.p0(vz9VarF);
                    obj3 = vz9VarF;
                }
                e89Var = (e89) obj3;
                c78VarW = t72.w();
                it = iterable.iterator();
                i7 = 0;
                while (true) {
                    z23 = zBooleanValue;
                    if (it.hasNext()) {
                        z24 = z16;
                        if (z) {
                            c78VarW.add(OverviewItem.Loading.INSTANCE);
                        }
                        if (failReason != null) {
                            c78VarW.add(OverviewItem.FailReason.INSTANCE);
                        }
                        c78VarN = c78VarW.n();
                        boolean zQ = v4e.Q(bd4Var.a);
                        z25 = !zQ;
                        if (zF) {
                            f = 0.0f;
                        } else {
                            f = 20.0f;
                        }
                        float f3 = zF ? 24.0f : 0.0f;
                        int i17 = (dd4Var instanceof ad4 ? 1 : 0) + 1;
                        if (z6 && zQ) {
                            r0 = 0;
                        } else {
                            r0 = z9;
                        }
                        int i18 = i17 + r0 + r37 + (z20 ? 1 : 0);
                        if (str != null) {
                            numValueOf = null;
                            break;
                        }
                        c78VarN.getClass();
                        if (c78VarN.isEmpty()) {
                            listIterator = c78VarN.listIterator(0);
                            while (true) {
                                ql6Var = (ql6) listIterator;
                                if (ql6Var.hasNext()) {
                                    numValueOf = null;
                                    break;
                                }
                                overviewItem = (OverviewItem) ql6Var.next();
                                if (!(overviewItem instanceof OverviewItem.ClarifyingCardItem) && pa7.t(((OverviewItem.ClarifyingCardItem) overviewItem).getMessageId(), str)) {
                                    numValueOf = Integer.valueOf((c78VarN.c() - 1) + i18);
                                    break;
                                }
                            }
                        } else {
                            numValueOf = null;
                            break;
                        }
                        boolean zG3 = (((((i14 & 896) ^ 384) > 256 || !l46Var.g(j18Var)) && (i14 & 384) != 256) ? false : z9) | l46Var.g(numValueOf);
                        if ((i16 & 3670016) == 1048576) {
                            z26 = z9;
                        } else {
                            z26 = false;
                        }
                        z27 = zG3 | z26;
                        Object objR4 = l46Var.R();
                        if (!z27 || objR4 == i8cVar) {
                            qv9 qv9Var = new qv9(numValueOf, j18Var, x16Var10, null);
                            l46Var.p0(qv9Var);
                            obj4 = qv9Var;
                        } else {
                            obj4 = objR4;
                        }
                        af1.p(str, numValueOf, (l26) obj4, l46Var);
                        j09 j09VarY = ynb.Y(g21.P(j09Var.D(androidx.compose.foundation.layout.b.c), ii6Var), xw9Var);
                        uc0 uc0Var = new uc0(12.0f, z9, new qc0(0));
                        bx9 bx9Var = new bx9(f, 24.0f, f, 12.0f);
                        if ((i12 & 7168) != 2048 || l46Var.i(bd4Var)) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        if ((i12 & 458752) != 131072) {
                            z29 = false;
                        } else {
                            z29 = true;
                        }
                        boolean z62 = z29 | z28;
                        if ((i12 & 3670016) == 1048576) {
                            z30 = true;
                        } else {
                            z30 = false;
                        }
                        boolean zH = z62 | z30 | l46Var.h(z24);
                        if ((i15 & 1879048192) == 536870912) {
                            z31 = true;
                        } else {
                            z31 = false;
                        }
                        boolean z63 = zH | z31;
                        if ((i16 & 14) == 4) {
                            z32 = true;
                        } else {
                            z32 = false;
                        }
                        boolean z64 = z63 | z32;
                        if ((i16 & 112) == 32) {
                            z33 = true;
                        } else {
                            z33 = false;
                        }
                        boolean zH2 = z64 | z33 | l46Var.h(z25) | l46Var.h(z23);
                        if ((i16 & 896) == 256) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        boolean z65 = zH2 | z34;
                        if (i5 == 4) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean z66 = z65 | z35;
                        if ((i12 & 234881024) == 67108864) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        boolean z67 = z66 | z36;
                        if ((i15 & 29360128) == 8388608) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        boolean z68 = z67 | z37;
                        if ((i14 & 3670016) == 1048576) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        boolean z69 = z68 | z38;
                        if ((i14 & 458752) == 131072) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        boolean zH3 = z69 | z39 | l46Var.h(zF) | l46Var.h(z18);
                        if ((i15 & 234881024) == 67108864) {
                            z40 = true;
                        } else {
                            z40 = false;
                        }
                        boolean z70 = zH3 | z40;
                        if ((i15 & 7168) == 2048) {
                            z41 = true;
                        } else {
                            z41 = false;
                        }
                        boolean z71 = z70 | z41;
                        if ((i15 & 57344) == 16384) {
                            z42 = true;
                        } else {
                            z42 = false;
                        }
                        boolean z72 = z71 | z42;
                        if ((i15 & 458752) == 131072) {
                            z43 = true;
                        } else {
                            z43 = false;
                        }
                        boolean z73 = z72 | z43;
                        if ((i15 & 3670016) == 1048576) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        r5 = r37;
                        boolean zH4 = z73 | z44 | l46Var.h(r5) | l46Var.d(f3) | l46Var.h(z20) | l46Var.g(e89Var);
                        f2 = f3;
                        if (i6 != 8388608) {
                            z45 = false;
                        } else {
                            z45 = true;
                        }
                        boolean z74 = zH4 | z45;
                        if ((i12 & 1879048192) == 536870912) {
                            z46 = true;
                        } else {
                            z46 = false;
                        }
                        boolean zI = z74 | z46 | l46Var.i(c78VarN);
                        if ((i12 & 896) != 256) {
                            z47 = false;
                        } else {
                            z47 = true;
                        }
                        boolean z75 = zI | z47;
                        if ((i14 & 7168) == 2048) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                        boolean z76 = z75 | z48;
                        if ((i14 & 57344) == 16384) {
                            z49 = true;
                        } else {
                            z49 = false;
                        }
                        boolean z77 = z76 | z49;
                        if ((i15 & 112) == 32) {
                            z50 = true;
                        } else {
                            z50 = false;
                        }
                        boolean z78 = z77 | z50;
                        if ((i15 & 896) == 256) {
                            z51 = true;
                        } else {
                            z51 = false;
                        }
                        boolean z79 = z78 | z51;
                        if ((i13 & 14) == 4) {
                            z52 = true;
                        } else {
                            z52 = false;
                        }
                        boolean z80 = z79 | z52;
                        if ((i13 & 57344) == 16384) {
                            z53 = true;
                        } else {
                            z53 = false;
                        }
                        boolean z81 = z80 | z53;
                        if ((i13 & 458752) == 131072) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        boolean z82 = z81 | z54;
                        if ((i13 & 3670016) == 1048576) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                        boolean z83 = z82 | z55;
                        if ((i13 & 29360128) == 8388608) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        boolean z84 = z83 | z56;
                        if ((i13 & 234881024) == 67108864) {
                            z57 = true;
                        } else {
                            z57 = false;
                        }
                        boolean z85 = z84 | z57;
                        if ((i13 & 1879048192) != 536870912) {
                            z58 = false;
                        } else {
                            z58 = true;
                        }
                        boolean z86 = z85 | z58;
                        if ((i14 & 14) == 4) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                        boolean z87 = z86 | z59;
                        if ((i14 & 112) == 32) {
                            z60 = true;
                        } else {
                            z60 = false;
                        }
                        z61 = z87 | z60;
                        Object objR5 = l46Var.R();
                        if (!z61 || objR5 == i8cVar) {
                            ?? r2 = l46Var;
                            i8 = i14;
                            obj5 = new a26() { // from class: vu9
                                /* JADX WARN: Code duplicated, block: B:14:0x00b4  */
                                /* JADX WARN: Code duplicated, block: B:17:0x00d0  */
                                /* JADX WARN: Code duplicated, block: B:21:0x00f5  */
                                /* JADX WARN: Code duplicated, block: B:23:0x00fd  */
                                /* JADX WARN: Code duplicated, block: B:28:0x010f  */
                                /* JADX WARN: Code duplicated, block: B:31:0x0120  */
                                /* JADX WARN: Code duplicated, block: B:33:0x0138  */
                                /* JADX WARN: Code duplicated, block: B:35:0x0140  */
                                /* JADX WARN: Code duplicated, block: B:36:0x0148  */
                                /* JADX WARN: Code duplicated, block: B:38:0x014c  */
                                /* JADX WARN: Code duplicated, block: B:39:0x0166  */
                                /* JADX WARN: Code duplicated, block: B:41:0x016a  */
                                /* JADX WARN: Code duplicated, block: B:42:0x0183  */
                                /* JADX WARN: Code duplicated, block: B:44:0x0187  */
                                /* JADX WARN: Code duplicated, block: B:45:0x01b2  */
                                /* JADX WARN: Code duplicated, block: B:47:0x01b6  */
                                /* JADX WARN: Code duplicated, block: B:49:0x01ff  */
                                /* JADX WARN: Code duplicated, block: B:51:0x0207  */
                                /* JADX WARN: Code duplicated, block: B:52:0x0220  */
                                /* JADX WARN: Code duplicated, block: B:54:0x0229  */
                                /* JADX WARN: Code duplicated, block: B:55:0x0251  */
                                /* JADX WARN: Code duplicated, block: B:57:0x025b  */
                                /* JADX WARN: Code duplicated, block: B:66:0x027c A[SYNTHETIC] */
                                /* JADX WARN: Code duplicated, block: B:67:0x0277 A[SYNTHETIC] */
                                @Override // defpackage.a26
                                public final Object d(Object obj6) {
                                    x16 x16Var11;
                                    sfb sfbVar2;
                                    boolean z88;
                                    final x16 x16Var12;
                                    int i19;
                                    boolean z89;
                                    final float f4;
                                    List list4;
                                    int i20;
                                    int i21;
                                    OverviewItem overviewItem2;
                                    OverviewItem overviewItem3;
                                    boolean z90;
                                    bx9 bx9VarQ;
                                    boolean zT;
                                    x16 x16Var13;
                                    boolean z91;
                                    boolean z92;
                                    v08 v08Var = (v08) obj6;
                                    v08Var.getClass();
                                    bd4 bd4Var2 = bd4Var;
                                    int i22 = 0;
                                    v08.W(v08Var, null, new dd2(new yu9(bd4Var2, i22), true, 1561532129), 3);
                                    if (bd4Var2.b instanceof ad4) {
                                        v08.W(v08Var, null, new dd2(new zu9(bd4Var2, pp5Var, l26Var, z24, 0), true, -2040408666), 3);
                                    }
                                    boolean z93 = z6;
                                    sfb sfbVar3 = sfbVar;
                                    final boolean z94 = z5;
                                    final a26 a26Var13 = a26Var11;
                                    x16 x16Var14 = x16Var7;
                                    a26 a26Var14 = a26Var12;
                                    boolean z95 = z4;
                                    final d6f d6fVar2 = d6fVar;
                                    x16 x16Var15 = x16Var8;
                                    if (!z93) {
                                        if (z25) {
                                            x16Var11 = x16Var15;
                                            sfbVar2 = sfbVar3;
                                            z88 = true;
                                            x16Var12 = x16Var14;
                                            i19 = 3;
                                            v08.W(v08Var, null, new dd2(new cv9(zF, z18, sfbVar2, z94, a26Var13, x16Var14, bd4Var2, z23, a26Var14, z95, z2, d6fVar2, x16Var4, x16Var3, x16Var11, 0), true, 926788038), 3);
                                        }
                                        z89 = r5;
                                        f4 = f2;
                                        if (z89) {
                                            final sfb sfbVar4 = sfbVar2;
                                            final x16 x16Var16 = x16Var11;
                                            v08Var.V("ReadingFeedback", "ReadingFeedback", new dd2(new n26() { // from class: dv9
                                                @Override // defpackage.n26
                                                public final Object m(Object obj7, Object obj8, Object obj9) {
                                                    l46 l46Var2 = (l46) obj8;
                                                    int iIntValue = ((Integer) obj9).intValue();
                                                    ((mx7) obj7).getClass();
                                                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                        j09 j09VarB0 = ynb.b0(f4, 0.0f, g09.a, 2);
                                                        dd2 dd2VarB0 = af1.b0(-198723970, new ev9(d6fVar2, x16Var16, 0), l46Var2);
                                                        a26 a26Var15 = a26Var13;
                                                        boolean zG4 = l46Var2.g(a26Var15);
                                                        Object objR6 = l46Var2.R();
                                                        i8c i8cVar2 = sf2.a;
                                                        if (zG4 || objR6 == i8cVar2) {
                                                            objR6 = new zh1(a26Var15, 22);
                                                            l46Var2.p0(objR6);
                                                        }
                                                        x16 x16Var17 = (x16) objR6;
                                                        boolean zG5 = l46Var2.g(a26Var15);
                                                        Object objR7 = l46Var2.R();
                                                        if (zG5 || objR7 == i8cVar2) {
                                                            objR7 = new zh1(a26Var15, 23);
                                                            l46Var2.p0(objR7);
                                                        }
                                                        x16 x16Var18 = (x16) objR7;
                                                        boolean zG6 = l46Var2.g(a26Var15);
                                                        Object objR8 = l46Var2.R();
                                                        if (zG6 || objR8 == i8cVar2) {
                                                            objR8 = new zh1(a26Var15, 24);
                                                            l46Var2.p0(objR8);
                                                        }
                                                        dj6.v(j09VarB0, dd2VarB0, sfbVar4, z94, x16Var17, x16Var18, (x16) objR8, x16Var12, l46Var2, 48);
                                                    } else {
                                                        l46Var2.Z();
                                                    }
                                                    return wef.a;
                                                }
                                            }, z88, -1186389458));
                                        }
                                        if (z20) {
                                            v08Var.V("recommended-follow-ups", "recommended-follow-ups", new dd2(new j43(f4, list2, a26Var, e89Var), z88, 1767000205));
                                        }
                                        list4 = c78VarN;
                                        i20 = 0;
                                        for (Object obj7 : list4) {
                                            i21 = i20 + 1;
                                            if (i20 >= 0) {
                                                t72.Z();
                                                throw null;
                                            }
                                            overviewItem2 = (OverviewItem) obj7;
                                            overviewItem3 = (OverviewItem) s72.y0(i21, list4);
                                            if (!(overviewItem3 instanceof OverviewItem.NewReadingItem) || (overviewItem3 instanceof OverviewItem.ClarifyingCardItem)) {
                                                z90 = false;
                                            } else {
                                                z90 = z88;
                                            }
                                            bx9VarQ = ynb.q(f4, 0.0f, 2);
                                            zT = pa7.t(overviewItem2, OverviewItem.Share.INSTANCE);
                                            x16Var13 = x16Var2;
                                            if (zT) {
                                                v08Var.V("share", "share", new dd2(new s19(i19, bx9VarQ, x16Var13), z88, -1975332514));
                                            } else if (pa7.t(overviewItem2, OverviewItem.Divider.INSTANCE)) {
                                                v08Var.V("divider", "divider", tm7.t);
                                            } else if (overviewItem2 instanceof OverviewItem.UserMessageItem) {
                                                OverviewItem.UserMessageItem userMessageItem = (OverviewItem.UserMessageItem) overviewItem2;
                                                v08Var.V(userMessageItem.getId(), "UserMessageItem", new dd2(new s19(4, bx9VarQ, userMessageItem), z88, -1025908650));
                                            } else if (overviewItem2 instanceof OverviewItem.ServerMessageItem) {
                                                OverviewItem.ServerMessageItem serverMessageItem = (OverviewItem.ServerMessageItem) overviewItem2;
                                                v08Var.V(serverMessageItem.getId(), "ServerMessageItem", new dd2(new ck(z90, bx9VarQ, serverMessageItem, a26Var14), z88, -1329766185));
                                            } else {
                                                if (overviewItem2 instanceof OverviewItem.NewReadingItem) {
                                                    OverviewItem.NewReadingItem newReadingItem = (OverviewItem.NewReadingItem) overviewItem2;
                                                    v08Var.V(ub3.i("new-reading:", newReadingItem.getMessageId()), "NewReadingItem", new dd2(new sz7(bx9VarQ, newReadingItem, quotaBlockReason, a26Var2, 11), z88, -1633623720));
                                                } else {
                                                    if (overviewItem2 instanceof OverviewItem.ClarifyingCardItem) {
                                                        OverviewItem.ClarifyingCardItem clarifyingCardItem = (OverviewItem.ClarifyingCardItem) overviewItem2;
                                                        v08Var.V(ub3.i("clarifying-card:", clarifyingCardItem.getMessageId()), "ClarifyingCardItem", new dd2(new ns2(bx9VarQ, clarifyingCardItem, quotaBlockReason2, ip5Var, a26Var6, a26Var7, a26Var8, a26Var9, a26Var10, 1), true, -1937481255));
                                                        z91 = z95;
                                                    } else if (pa7.t(overviewItem2, OverviewItem.ContinuationChatSlice.INSTANCE)) {
                                                        v08Var.V("ContinuationChatSlice", "ContinuationChatSlice", new dd2(new fv9(bx9VarQ, x16Var, x16Var13, 0), true, 2053628506));
                                                        z91 = z95;
                                                    } else if (pa7.t(overviewItem2, OverviewItem.FailReason.INSTANCE)) {
                                                        z91 = z95;
                                                        v08Var.V("FailReason", "FailReason", new dd2(new cl(failReason, bx9VarQ, z91, x16Var5, x16Var6, 6), true, 1749770971));
                                                    } else {
                                                        z91 = z95;
                                                        if (pa7.t(overviewItem2, OverviewItem.Loading.INSTANCE)) {
                                                            ap.c();
                                                            return null;
                                                        }
                                                        z92 = true;
                                                        v08Var.V("Loading", "Loading", new dd2(new g20(24, bx9VarQ), true, 1445913436));
                                                    }
                                                    z92 = true;
                                                }
                                                i20 = i21;
                                                z88 = z92;
                                                z95 = z91;
                                                i19 = 3;
                                            }
                                            z92 = z88;
                                            z91 = z95;
                                            i20 = i21;
                                            z88 = z92;
                                            z95 = z91;
                                            i19 = 3;
                                        }
                                        return wef.a;
                                    }
                                    v08.W(v08Var, null, new dd2(new av9(quotaBlockReason3, x16Var9, i22), true, 155188175), 3);
                                    x16Var12 = x16Var14;
                                    x16Var11 = x16Var15;
                                    z88 = true;
                                    i19 = 3;
                                    sfbVar2 = sfbVar3;
                                    z89 = r5;
                                    f4 = f2;
                                    if (z89) {
                                        final sfb sfbVar5 = sfbVar2;
                                        final x16 x16Var17 = x16Var11;
                                        v08Var.V("ReadingFeedback", "ReadingFeedback", new dd2(new n26() { // from class: dv9
                                            @Override // defpackage.n26
                                            public final Object m(Object obj8, Object obj9, Object obj10) {
                                                l46 l46Var2 = (l46) obj9;
                                                int iIntValue = ((Integer) obj10).intValue();
                                                ((mx7) obj8).getClass();
                                                if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    j09 j09VarB0 = ynb.b0(f4, 0.0f, g09.a, 2);
                                                    dd2 dd2VarB0 = af1.b0(-198723970, new ev9(d6fVar2, x16Var17, 0), l46Var2);
                                                    a26 a26Var15 = a26Var13;
                                                    boolean zG4 = l46Var2.g(a26Var15);
                                                    Object objR6 = l46Var2.R();
                                                    i8c i8cVar2 = sf2.a;
                                                    if (zG4 || objR6 == i8cVar2) {
                                                        objR6 = new zh1(a26Var15, 22);
                                                        l46Var2.p0(objR6);
                                                    }
                                                    x16 x16Var18 = (x16) objR6;
                                                    boolean zG5 = l46Var2.g(a26Var15);
                                                    Object objR7 = l46Var2.R();
                                                    if (zG5 || objR7 == i8cVar2) {
                                                        objR7 = new zh1(a26Var15, 23);
                                                        l46Var2.p0(objR7);
                                                    }
                                                    x16 x16Var19 = (x16) objR7;
                                                    boolean zG6 = l46Var2.g(a26Var15);
                                                    Object objR8 = l46Var2.R();
                                                    if (zG6 || objR8 == i8cVar2) {
                                                        objR8 = new zh1(a26Var15, 24);
                                                        l46Var2.p0(objR8);
                                                    }
                                                    dj6.v(j09VarB0, dd2VarB0, sfbVar5, z94, x16Var18, x16Var19, (x16) objR8, x16Var12, l46Var2, 48);
                                                } else {
                                                    l46Var2.Z();
                                                }
                                                return wef.a;
                                            }
                                        }, z88, -1186389458));
                                    }
                                    if (z20) {
                                        v08Var.V("recommended-follow-ups", "recommended-follow-ups", new dd2(new j43(f4, list2, a26Var, e89Var), z88, 1767000205));
                                    }
                                    list4 = c78VarN;
                                    i20 = 0;
                                    while (r6.hasNext()) {
                                        i21 = i20 + 1;
                                        if (i20 >= 0) {
                                            t72.Z();
                                            throw null;
                                        }
                                        overviewItem2 = (OverviewItem) obj7;
                                        overviewItem3 = (OverviewItem) s72.y0(i21, list4);
                                        if (overviewItem3 instanceof OverviewItem.NewReadingItem) {
                                            z90 = false;
                                        } else {
                                            z90 = false;
                                        }
                                        bx9VarQ = ynb.q(f4, 0.0f, 2);
                                        zT = pa7.t(overviewItem2, OverviewItem.Share.INSTANCE);
                                        x16Var13 = x16Var2;
                                        if (zT) {
                                            v08Var.V("share", "share", new dd2(new s19(i19, bx9VarQ, x16Var13), z88, -1975332514));
                                        } else if (pa7.t(overviewItem2, OverviewItem.Divider.INSTANCE)) {
                                            v08Var.V("divider", "divider", tm7.t);
                                        } else if (overviewItem2 instanceof OverviewItem.UserMessageItem) {
                                            OverviewItem.UserMessageItem userMessageItem2 = (OverviewItem.UserMessageItem) overviewItem2;
                                            v08Var.V(userMessageItem2.getId(), "UserMessageItem", new dd2(new s19(4, bx9VarQ, userMessageItem2), z88, -1025908650));
                                        } else if (overviewItem2 instanceof OverviewItem.ServerMessageItem) {
                                            OverviewItem.ServerMessageItem serverMessageItem2 = (OverviewItem.ServerMessageItem) overviewItem2;
                                            v08Var.V(serverMessageItem2.getId(), "ServerMessageItem", new dd2(new ck(z90, bx9VarQ, serverMessageItem2, a26Var14), z88, -1329766185));
                                        } else {
                                            if (overviewItem2 instanceof OverviewItem.NewReadingItem) {
                                                OverviewItem.NewReadingItem newReadingItem2 = (OverviewItem.NewReadingItem) overviewItem2;
                                                v08Var.V(ub3.i("new-reading:", newReadingItem2.getMessageId()), "NewReadingItem", new dd2(new sz7(bx9VarQ, newReadingItem2, quotaBlockReason, a26Var2, 11), z88, -1633623720));
                                            } else {
                                                if (overviewItem2 instanceof OverviewItem.ClarifyingCardItem) {
                                                    OverviewItem.ClarifyingCardItem clarifyingCardItem2 = (OverviewItem.ClarifyingCardItem) overviewItem2;
                                                    v08Var.V(ub3.i("clarifying-card:", clarifyingCardItem2.getMessageId()), "ClarifyingCardItem", new dd2(new ns2(bx9VarQ, clarifyingCardItem2, quotaBlockReason2, ip5Var, a26Var6, a26Var7, a26Var8, a26Var9, a26Var10, 1), true, -1937481255));
                                                    z91 = z95;
                                                } else if (pa7.t(overviewItem2, OverviewItem.ContinuationChatSlice.INSTANCE)) {
                                                    v08Var.V("ContinuationChatSlice", "ContinuationChatSlice", new dd2(new fv9(bx9VarQ, x16Var, x16Var13, 0), true, 2053628506));
                                                    z91 = z95;
                                                } else if (pa7.t(overviewItem2, OverviewItem.FailReason.INSTANCE)) {
                                                    z91 = z95;
                                                    v08Var.V("FailReason", "FailReason", new dd2(new cl(failReason, bx9VarQ, z91, x16Var5, x16Var6, 6), true, 1749770971));
                                                } else {
                                                    z91 = z95;
                                                    if (pa7.t(overviewItem2, OverviewItem.Loading.INSTANCE)) {
                                                        ap.c();
                                                        return null;
                                                    }
                                                    z92 = true;
                                                    v08Var.V("Loading", "Loading", new dd2(new g20(24, bx9VarQ), true, 1445913436));
                                                }
                                                z92 = true;
                                            }
                                            i20 = i21;
                                            z88 = z92;
                                            z95 = z91;
                                            i19 = 3;
                                        }
                                        z92 = z88;
                                        z91 = z95;
                                        i20 = i21;
                                        z88 = z92;
                                        z95 = z91;
                                        i19 = 3;
                                    }
                                    return wef.a;
                                }
                            };
                            r2.p0(obj5);
                            r1 = r2;
                        } else {
                            obj5 = objR5;
                            i8 = i14;
                            r1 = l46Var;
                        }
                        af1.s(j09VarY, j18Var, bx9Var, uc0Var, null, null, false, null, (a26) obj5, r1, ((i8 >> 3) & 112) | 27648, 480);
                        break;
                    }
                    next = it.next();
                    i9 = i7 + 1;
                    if (i7 >= 0) {
                        t72.Z();
                        throw null;
                    }
                    ot8Var = (ot8) next;
                    boolean z88 = z16;
                    if (ot8Var instanceof nt8) {
                        nt8 nt8Var = (nt8) ot8Var;
                        String str5 = nt8Var.a;
                        strE = nt8Var.b;
                        if (strE == null) {
                            strE = tec.e(i7, "user_");
                        }
                        c78VarW.add(new OverviewItem.UserMessageItem(str5, strE));
                    } else if (ot8Var instanceof et8) {
                        et8 et8Var = (et8) ot8Var;
                        c78VarW.add(new OverviewItem.ServerMessageItem(et8Var.b, et8Var.a, et8Var.c));
                    } else if (ot8Var instanceof gt8) {
                        gt8 gt8Var = (gt8) ot8Var;
                        String str6 = gt8Var.b;
                        String strI = ub3.i("clarifying-card-interpretation:", gt8Var.d);
                        ClarifyingCardDrawActionState clarifyingCardDrawActionState = (ClarifyingCardDrawActionState) a26Var3.d(gt8Var.d);
                        clarifyingCardDrawActionState.getClass();
                        c78VarW.add(new OverviewItem.ServerMessageItem(str6, strI, !clarifyingCardDrawActionState.equals(ClarifyingCardDrawActionState.Loading.INSTANCE)));
                    } else if (ot8Var instanceof ht8) {
                        LinkedHashMap linkedHashMap = pp5Var.b;
                        ht8Var = (ht8) ot8Var;
                        str4 = ht8Var.a;
                        t12Var = (t12) linkedHashMap.get(str4);
                        if (t12Var == null) {
                            ClarifyingCardDrawActionState clarifyingCardDrawActionState2 = (ClarifyingCardDrawActionState) a26Var3.d(str4);
                            ClarifyingCardSkipActionState clarifyingCardSkipActionState = (ClarifyingCardSkipActionState) a26Var4.d(str4);
                            String str7 = ht8Var.a;
                            String str8 = ht8Var.b;
                            ClarifyingCardState clarifyingCardState = t12Var.d;
                            ft8Var = t12Var.b;
                            if (ft8Var != null || (list3 = ft8Var.b) == null) {
                                tarotCardChoice = null;
                            } else {
                                tarotCardChoice = (TarotCardChoice) s72.x0(list3);
                            }
                            c78VarW.add(new OverviewItem.ClarifyingCardItem(str7, str8, clarifyingCardState, tarotCardChoice, (TarotCardChoice) a26Var5.d(str4), clarifyingCardDrawActionState2, clarifyingCardSkipActionState));
                        }
                    } else if (ot8Var instanceof jt8) {
                        jt8Var = (jt8) ot8Var;
                        String str9 = jt8Var.a;
                        String str10 = jt8Var.b;
                        str2 = jt8Var.c;
                        if (str2 == null) {
                            t68Var = jt8Var.d;
                            if (t68Var != null) {
                                str3 = t68Var.a;
                            } else {
                                str3 = null;
                            }
                        } else {
                            str3 = str2;
                        }
                        c78VarW.add(new OverviewItem.NewReadingItem(str9, str10, str3, (NewReadingState) bm8.B(pp5Var.d, str9)));
                    }
                    z16 = z88;
                    zBooleanValue = z23;
                    i7 = i9;
                }
            } else {
                l46Var.Z();
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26(z, failReason, bd4Var, list, pp5Var, l26Var, list2, z2, a26Var, a26Var2, a26Var3, a26Var4, a26Var5, a26Var6, a26Var7, a26Var8, quotaBlockReason, quotaBlockReason2, ip5Var, a26Var9, a26Var10, j18Var, x16Var, x16Var2, x16Var3, x16Var4, z3, xw9Var, ii6Var, z4, x16Var5, x16Var6, sfbVar, z5, a26Var11, x16Var7, d6fVar, x16Var8, z6, quotaBlockReason3, x16Var9, a26Var12, z7, z8, str, x16Var10, i, i2) { // from class: wu9
                    public final /* synthetic */ a26 E0;
                    public final /* synthetic */ a26 F0;
                    public final /* synthetic */ QuotaBlockReason G0;
                    public final /* synthetic */ QuotaBlockReason H0;
                    public final /* synthetic */ ip5 I0;
                    public final /* synthetic */ a26 J0;
                    public final /* synthetic */ a26 K0;
                    public final /* synthetic */ j18 L0;
                    public final /* synthetic */ x16 M0;
                    public final /* synthetic */ x16 N0;
                    public final /* synthetic */ x16 O0;
                    public final /* synthetic */ x16 P0;
                    public final /* synthetic */ boolean Q0;
                    public final /* synthetic */ xw9 R0;
                    public final /* synthetic */ ii6 S0;
                    public final /* synthetic */ boolean T0;
                    public final /* synthetic */ x16 U0;
                    public final /* synthetic */ x16 V0;
                    public final /* synthetic */ sfb W0;
                    public final /* synthetic */ a26 X;
                    public final /* synthetic */ boolean X0;
                    public final /* synthetic */ a26 Y;
                    public final /* synthetic */ a26 Y0;
                    public final /* synthetic */ a26 Z;
                    public final /* synthetic */ x16 Z0;
                    public final /* synthetic */ d6f a1;
                    public final /* synthetic */ boolean b;
                    public final /* synthetic */ x16 b1;
                    public final /* synthetic */ FailReason c;
                    public final /* synthetic */ boolean c1;
                    public final /* synthetic */ bd4 d;
                    public final /* synthetic */ QuotaBlockReason d1;
                    public final /* synthetic */ List e;
                    public final /* synthetic */ x16 e1;
                    public final /* synthetic */ pp5 f;
                    public final /* synthetic */ a26 f1;
                    public final /* synthetic */ l26 g;
                    public final /* synthetic */ boolean g1;
                    public final /* synthetic */ boolean h1;
                    public final /* synthetic */ String i1;
                    public final /* synthetic */ x16 j1;
                    public final /* synthetic */ int k1;
                    public final /* synthetic */ List v;
                    public final /* synthetic */ boolean w;
                    public final /* synthetic */ a26 x;
                    public final /* synthetic */ a26 y;
                    public final /* synthetic */ a26 z;

                    {
                        this.k1 = i2;
                    }

                    @Override // defpackage.l26
                    public final Object z(Object obj6, Object obj7) {
                        ((Integer) obj7).getClass();
                        int iP = k99.P(4097);
                        int iP2 = k99.P(this.k1);
                        k.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, this.Z, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, this.N0, this.O0, this.P0, this.Q0, this.R0, this.S0, this.T0, this.U0, this.V0, this.W0, this.X0, this.Y0, this.Z0, this.a1, this.b1, this.c1, this.d1, this.e1, this.f1, this.g1, this.h1, this.i1, this.j1, (l46) obj6, iP, iP2);
                        return wef.a;
                    }
                };
            }
        }
        z9 = true;
        z10 = z9;
        if (l46Var.W(i12 & 1, z10)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                l46Var.Z();
            }
            l46Var.s();
            arrayList = pp5Var.a;
            if (z4) {
                i4 = -1;
                break;
            }
            it2 = arrayList.iterator();
            i10 = 0;
            while (true) {
                if (it2.hasNext()) {
                    i4 = -1;
                    break;
                }
                Iterator it4 = it2;
                ot8Var2 = (ot8) it2.next();
                i11 = i10;
                if (!(ot8Var2 instanceof et8)) {
                }
                i10 = i11 + 1;
                it2 = it4;
            }
            if (i4 != arrayList.size() - 1) {
                iterableSubList = pu4.a;
            } else {
                iterableSubList = pu4.a;
            }
            i5 = i15 & 14;
            if (i5 == 4) {
                z11 = z9;
            } else {
                z11 = false;
            }
            Iterable iterable2 = iterableSubList;
            Object objR6 = l46Var.R();
            z12 = z11;
            i8c i8cVar2 = sf2.a;
            if (z12) {
                mx3 mx3VarB2 = zrd.b(new mv0(z4, list, 5));
                l46Var.p0(mx3VarB2);
                obj = mx3VarB2;
            } else {
                mx3 mx3VarB3 = zrd.b(new mv0(z4, list, 5));
                l46Var.p0(mx3VarB3);
                obj = mx3VarB3;
            }
            h0eVar = (h0e) obj;
            zG = l46Var.g(((ad4) dd4Var).a.a);
            Object objR7 = l46Var.R();
            obj2 = objR7;
            if (zG) {
                if (z8) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z13);
                l46Var.p0(boolValueOf2);
                obj2 = boolValueOf2;
            } else {
                if (z8) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                Boolean boolValueOf3 = Boolean.valueOf(z13);
                l46Var.p0(boolValueOf3);
                obj2 = boolValueOf3;
            }
            zBooleanValue = ((Boolean) obj2).booleanValue();
            if (((Boolean) h0eVar.getValue()).booleanValue()) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (z2) {
                z15 = false;
            } else {
                z15 = false;
            }
            z16 = !z2;
            if (((Boolean) h0eVar.getValue()).booleanValue()) {
                z17 = false;
            } else {
                z17 = false;
            }
            int size2 = list2.size();
            z18 = z15;
            if (z2) {
                z19 = false;
            } else {
                z19 = false;
            }
            zF = k8b.f((e8b) l46Var.k(l8b.a));
            if (z18) {
                r37 = 0;
            } else {
                r37 = 0;
            }
            z20 = z19;
            boolean zG4 = l46Var.g(((ad4) dd4Var).a.a);
            i6 = i12 & 29360128;
            if (i6 != 8388608) {
                z21 = false;
            } else {
                z21 = z9;
            }
            z22 = zG4 | z21;
            Object objR8 = l46Var.R();
            obj3 = objR8;
            if (z22) {
                vz9 vz9VarF2 = q1c.f(Boolean.TRUE);
                l46Var.p0(vz9VarF2);
                obj3 = vz9VarF2;
            } else {
                vz9 vz9VarF3 = q1c.f(Boolean.TRUE);
                l46Var.p0(vz9VarF3);
                obj3 = vz9VarF3;
            }
            e89Var = (e89) obj3;
            c78VarW = t72.w();
            it = iterable2.iterator();
            i7 = 0;
            while (true) {
                z23 = zBooleanValue;
                if (it.hasNext()) {
                    z24 = z16;
                    if (z) {
                        c78VarW.add(OverviewItem.Loading.INSTANCE);
                    }
                    if (failReason != null) {
                        c78VarW.add(OverviewItem.FailReason.INSTANCE);
                    }
                    c78VarN = c78VarW.n();
                    boolean zQ2 = v4e.Q(bd4Var.a);
                    z25 = !zQ2;
                    if (zF) {
                        f = 0.0f;
                    } else {
                        f = 20.0f;
                    }
                    if (zF) {
                    }
                    int i19 = (dd4Var instanceof ad4 ? 1 : 0) + 1;
                    if (z6) {
                        r0 = z9;
                    } else {
                        r0 = z9;
                    }
                    int i110 = i19 + r0 + r37 + (z20 ? 1 : 0);
                    if (str != null) {
                        numValueOf = null;
                        break;
                    }
                    c78VarN.getClass();
                    if (c78VarN.isEmpty()) {
                        listIterator = c78VarN.listIterator(0);
                        while (true) {
                            ql6Var = (ql6) listIterator;
                            if (ql6Var.hasNext()) {
                                numValueOf = null;
                                break;
                            } else {
                                overviewItem = (OverviewItem) ql6Var.next();
                                if (!(overviewItem instanceof OverviewItem.ClarifyingCardItem)) {
                                }
                            }
                        }
                    } else {
                        numValueOf = null;
                        break;
                    }
                    boolean zG5 = (((((i14 & 896) ^ 384) > 256 || !l46Var.g(j18Var)) && (i14 & 384) != 256) ? false : z9) | l46Var.g(numValueOf);
                    if ((i16 & 3670016) == 1048576) {
                        z26 = z9;
                    } else {
                        z26 = false;
                    }
                    z27 = zG5 | z26;
                    Object objR9 = l46Var.R();
                    if (z27) {
                        qv9 qv9Var2 = new qv9(numValueOf, j18Var, x16Var10, null);
                        l46Var.p0(qv9Var2);
                        obj4 = qv9Var2;
                    } else {
                        qv9 qv9Var3 = new qv9(numValueOf, j18Var, x16Var10, null);
                        l46Var.p0(qv9Var3);
                        obj4 = qv9Var3;
                    }
                    af1.p(str, numValueOf, (l26) obj4, l46Var);
                    j09 j09VarY2 = ynb.Y(g21.P(j09Var.D(androidx.compose.foundation.layout.b.c), ii6Var), xw9Var);
                    uc0 uc0Var2 = new uc0(12.0f, z9, new qc0(0));
                    bx9 bx9Var2 = new bx9(f, 24.0f, f, 12.0f);
                    if ((i12 & 7168) != 2048) {
                        z28 = true;
                    } else {
                        z28 = true;
                    }
                    if ((i12 & 458752) != 131072) {
                        z29 = false;
                    } else {
                        z29 = true;
                    }
                    boolean z610 = z29 | z28;
                    if ((i12 & 3670016) == 1048576) {
                        z30 = true;
                    } else {
                        z30 = false;
                    }
                    boolean zH5 = z610 | z30 | l46Var.h(z24);
                    if ((i15 & 1879048192) == 536870912) {
                        z31 = true;
                    } else {
                        z31 = false;
                    }
                    boolean z611 = zH5 | z31;
                    if ((i16 & 14) == 4) {
                        z32 = true;
                    } else {
                        z32 = false;
                    }
                    boolean z612 = z611 | z32;
                    if ((i16 & 112) == 32) {
                        z33 = true;
                    } else {
                        z33 = false;
                    }
                    boolean zH6 = z612 | z33 | l46Var.h(z25) | l46Var.h(z23);
                    if ((i16 & 896) == 256) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean z613 = zH6 | z34;
                    if (i5 == 4) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z614 = z613 | z35;
                    if ((i12 & 234881024) == 67108864) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    boolean z615 = z614 | z36;
                    if ((i15 & 29360128) == 8388608) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    boolean z616 = z615 | z37;
                    if ((i14 & 3670016) == 1048576) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    boolean z617 = z616 | z38;
                    if ((i14 & 458752) == 131072) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    boolean zH7 = z617 | z39 | l46Var.h(zF) | l46Var.h(z18);
                    if ((i15 & 234881024) == 67108864) {
                        z40 = true;
                    } else {
                        z40 = false;
                    }
                    boolean z710 = zH7 | z40;
                    if ((i15 & 7168) == 2048) {
                        z41 = true;
                    } else {
                        z41 = false;
                    }
                    boolean z711 = z710 | z41;
                    if ((i15 & 57344) == 16384) {
                        z42 = true;
                    } else {
                        z42 = false;
                    }
                    boolean z712 = z711 | z42;
                    if ((i15 & 458752) == 131072) {
                        z43 = true;
                    } else {
                        z43 = false;
                    }
                    boolean z713 = z712 | z43;
                    if ((i15 & 3670016) == 1048576) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    r5 = r37;
                    boolean zH8 = z713 | z44 | l46Var.h(r5) | l46Var.d(f3) | l46Var.h(z20) | l46Var.g(e89Var);
                    f2 = f3;
                    if (i6 != 8388608) {
                        z45 = false;
                    } else {
                        z45 = true;
                    }
                    boolean z714 = zH8 | z45;
                    if ((i12 & 1879048192) == 536870912) {
                        z46 = true;
                    } else {
                        z46 = false;
                    }
                    boolean zI2 = z714 | z46 | l46Var.i(c78VarN);
                    if ((i12 & 896) != 256) {
                        z47 = false;
                    } else {
                        z47 = true;
                    }
                    boolean z715 = zI2 | z47;
                    if ((i14 & 7168) == 2048) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                    boolean z716 = z715 | z48;
                    if ((i14 & 57344) == 16384) {
                        z49 = true;
                    } else {
                        z49 = false;
                    }
                    boolean z717 = z716 | z49;
                    if ((i15 & 112) == 32) {
                        z50 = true;
                    } else {
                        z50 = false;
                    }
                    boolean z718 = z717 | z50;
                    if ((i15 & 896) == 256) {
                        z51 = true;
                    } else {
                        z51 = false;
                    }
                    boolean z719 = z718 | z51;
                    if ((i13 & 14) == 4) {
                        z52 = true;
                    } else {
                        z52 = false;
                    }
                    boolean z89 = z719 | z52;
                    if ((i13 & 57344) == 16384) {
                        z53 = true;
                    } else {
                        z53 = false;
                    }
                    boolean z810 = z89 | z53;
                    if ((i13 & 458752) == 131072) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    boolean z811 = z810 | z54;
                    if ((i13 & 3670016) == 1048576) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                    boolean z812 = z811 | z55;
                    if ((i13 & 29360128) == 8388608) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    boolean z813 = z812 | z56;
                    if ((i13 & 234881024) == 67108864) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    boolean z814 = z813 | z57;
                    if ((i13 & 1879048192) != 536870912) {
                        z58 = false;
                    } else {
                        z58 = true;
                    }
                    boolean z815 = z814 | z58;
                    if ((i14 & 14) == 4) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                    boolean z816 = z815 | z59;
                    if ((i14 & 112) == 32) {
                        z60 = true;
                    } else {
                        z60 = false;
                    }
                    z61 = z816 | z60;
                    Object objR10 = l46Var.R();
                    if (z61) {
                        ?? r3 = l46Var;
                        i8 = i14;
                        obj5 = new a26() { // from class: vu9
                            /* JADX WARN: Code duplicated, block: B:14:0x00b4  */
                            /* JADX WARN: Code duplicated, block: B:17:0x00d0  */
                            /* JADX WARN: Code duplicated, block: B:21:0x00f5  */
                            /* JADX WARN: Code duplicated, block: B:23:0x00fd  */
                            /* JADX WARN: Code duplicated, block: B:28:0x010f  */
                            /* JADX WARN: Code duplicated, block: B:31:0x0120  */
                            /* JADX WARN: Code duplicated, block: B:33:0x0138  */
                            /* JADX WARN: Code duplicated, block: B:35:0x0140  */
                            /* JADX WARN: Code duplicated, block: B:36:0x0148  */
                            /* JADX WARN: Code duplicated, block: B:38:0x014c  */
                            /* JADX WARN: Code duplicated, block: B:39:0x0166  */
                            /* JADX WARN: Code duplicated, block: B:41:0x016a  */
                            /* JADX WARN: Code duplicated, block: B:42:0x0183  */
                            /* JADX WARN: Code duplicated, block: B:44:0x0187  */
                            /* JADX WARN: Code duplicated, block: B:45:0x01b2  */
                            /* JADX WARN: Code duplicated, block: B:47:0x01b6  */
                            /* JADX WARN: Code duplicated, block: B:49:0x01ff  */
                            /* JADX WARN: Code duplicated, block: B:51:0x0207  */
                            /* JADX WARN: Code duplicated, block: B:52:0x0220  */
                            /* JADX WARN: Code duplicated, block: B:54:0x0229  */
                            /* JADX WARN: Code duplicated, block: B:55:0x0251  */
                            /* JADX WARN: Code duplicated, block: B:57:0x025b  */
                            /* JADX WARN: Code duplicated, block: B:66:0x027c A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:67:0x0277 A[SYNTHETIC] */
                            @Override // defpackage.a26
                            public final Object d(Object obj6) {
                                x16 x16Var11;
                                sfb sfbVar2;
                                boolean z817;
                                final x16 x16Var12;
                                int i111;
                                boolean z818;
                                final float f4;
                                List list4;
                                int i20;
                                int i21;
                                OverviewItem overviewItem2;
                                OverviewItem overviewItem3;
                                boolean z90;
                                bx9 bx9VarQ;
                                boolean zT;
                                x16 x16Var13;
                                boolean z91;
                                boolean z92;
                                v08 v08Var = (v08) obj6;
                                v08Var.getClass();
                                bd4 bd4Var2 = bd4Var;
                                int i22 = 0;
                                v08.W(v08Var, null, new dd2(new yu9(bd4Var2, i22), true, 1561532129), 3);
                                if (bd4Var2.b instanceof ad4) {
                                    v08.W(v08Var, null, new dd2(new zu9(bd4Var2, pp5Var, l26Var, z24, 0), true, -2040408666), 3);
                                }
                                boolean z93 = z6;
                                sfb sfbVar3 = sfbVar;
                                final boolean z94 = z5;
                                final a26 a26Var13 = a26Var11;
                                x16 x16Var14 = x16Var7;
                                a26 a26Var14 = a26Var12;
                                boolean z95 = z4;
                                final d6f d6fVar2 = d6fVar;
                                x16 x16Var15 = x16Var8;
                                if (!z93) {
                                    if (z25) {
                                        x16Var11 = x16Var15;
                                        sfbVar2 = sfbVar3;
                                        z817 = true;
                                        x16Var12 = x16Var14;
                                        i111 = 3;
                                        v08.W(v08Var, null, new dd2(new cv9(zF, z18, sfbVar2, z94, a26Var13, x16Var14, bd4Var2, z23, a26Var14, z95, z2, d6fVar2, x16Var4, x16Var3, x16Var11, 0), true, 926788038), 3);
                                    }
                                    z818 = r5;
                                    f4 = f2;
                                    if (z818) {
                                        final sfb sfbVar5 = sfbVar2;
                                        final x16 x16Var17 = x16Var11;
                                        v08Var.V("ReadingFeedback", "ReadingFeedback", new dd2(new n26() { // from class: dv9
                                            @Override // defpackage.n26
                                            public final Object m(Object obj8, Object obj9, Object obj10) {
                                                l46 l46Var2 = (l46) obj9;
                                                int iIntValue = ((Integer) obj10).intValue();
                                                ((mx7) obj8).getClass();
                                                if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    j09 j09VarB0 = ynb.b0(f4, 0.0f, g09.a, 2);
                                                    dd2 dd2VarB0 = af1.b0(-198723970, new ev9(d6fVar2, x16Var17, 0), l46Var2);
                                                    a26 a26Var15 = a26Var13;
                                                    boolean zG6 = l46Var2.g(a26Var15);
                                                    Object objR11 = l46Var2.R();
                                                    i8c i8cVar3 = sf2.a;
                                                    if (zG6 || objR11 == i8cVar3) {
                                                        objR11 = new zh1(a26Var15, 22);
                                                        l46Var2.p0(objR11);
                                                    }
                                                    x16 x16Var18 = (x16) objR11;
                                                    boolean zG7 = l46Var2.g(a26Var15);
                                                    Object objR12 = l46Var2.R();
                                                    if (zG7 || objR12 == i8cVar3) {
                                                        objR12 = new zh1(a26Var15, 23);
                                                        l46Var2.p0(objR12);
                                                    }
                                                    x16 x16Var19 = (x16) objR12;
                                                    boolean zG8 = l46Var2.g(a26Var15);
                                                    Object objR13 = l46Var2.R();
                                                    if (zG8 || objR13 == i8cVar3) {
                                                        objR13 = new zh1(a26Var15, 24);
                                                        l46Var2.p0(objR13);
                                                    }
                                                    dj6.v(j09VarB0, dd2VarB0, sfbVar5, z94, x16Var18, x16Var19, (x16) objR13, x16Var12, l46Var2, 48);
                                                } else {
                                                    l46Var2.Z();
                                                }
                                                return wef.a;
                                            }
                                        }, z817, -1186389458));
                                    }
                                    if (z20) {
                                        v08Var.V("recommended-follow-ups", "recommended-follow-ups", new dd2(new j43(f4, list2, a26Var, e89Var), z817, 1767000205));
                                    }
                                    list4 = c78VarN;
                                    i20 = 0;
                                    for (Object obj7 : list4) {
                                        i21 = i20 + 1;
                                        if (i20 >= 0) {
                                            t72.Z();
                                            throw null;
                                        }
                                        overviewItem2 = (OverviewItem) obj7;
                                        overviewItem3 = (OverviewItem) s72.y0(i21, list4);
                                        if (!(overviewItem3 instanceof OverviewItem.NewReadingItem) || (overviewItem3 instanceof OverviewItem.ClarifyingCardItem)) {
                                            z90 = false;
                                        } else {
                                            z90 = z817;
                                        }
                                        bx9VarQ = ynb.q(f4, 0.0f, 2);
                                        zT = pa7.t(overviewItem2, OverviewItem.Share.INSTANCE);
                                        x16Var13 = x16Var2;
                                        if (zT) {
                                            v08Var.V("share", "share", new dd2(new s19(i111, bx9VarQ, x16Var13), z817, -1975332514));
                                        } else if (pa7.t(overviewItem2, OverviewItem.Divider.INSTANCE)) {
                                            v08Var.V("divider", "divider", tm7.t);
                                        } else if (overviewItem2 instanceof OverviewItem.UserMessageItem) {
                                            OverviewItem.UserMessageItem userMessageItem2 = (OverviewItem.UserMessageItem) overviewItem2;
                                            v08Var.V(userMessageItem2.getId(), "UserMessageItem", new dd2(new s19(4, bx9VarQ, userMessageItem2), z817, -1025908650));
                                        } else if (overviewItem2 instanceof OverviewItem.ServerMessageItem) {
                                            OverviewItem.ServerMessageItem serverMessageItem2 = (OverviewItem.ServerMessageItem) overviewItem2;
                                            v08Var.V(serverMessageItem2.getId(), "ServerMessageItem", new dd2(new ck(z90, bx9VarQ, serverMessageItem2, a26Var14), z817, -1329766185));
                                        } else {
                                            if (overviewItem2 instanceof OverviewItem.NewReadingItem) {
                                                OverviewItem.NewReadingItem newReadingItem2 = (OverviewItem.NewReadingItem) overviewItem2;
                                                v08Var.V(ub3.i("new-reading:", newReadingItem2.getMessageId()), "NewReadingItem", new dd2(new sz7(bx9VarQ, newReadingItem2, quotaBlockReason, a26Var2, 11), z817, -1633623720));
                                            } else {
                                                if (overviewItem2 instanceof OverviewItem.ClarifyingCardItem) {
                                                    OverviewItem.ClarifyingCardItem clarifyingCardItem2 = (OverviewItem.ClarifyingCardItem) overviewItem2;
                                                    v08Var.V(ub3.i("clarifying-card:", clarifyingCardItem2.getMessageId()), "ClarifyingCardItem", new dd2(new ns2(bx9VarQ, clarifyingCardItem2, quotaBlockReason2, ip5Var, a26Var6, a26Var7, a26Var8, a26Var9, a26Var10, 1), true, -1937481255));
                                                    z91 = z95;
                                                } else if (pa7.t(overviewItem2, OverviewItem.ContinuationChatSlice.INSTANCE)) {
                                                    v08Var.V("ContinuationChatSlice", "ContinuationChatSlice", new dd2(new fv9(bx9VarQ, x16Var, x16Var13, 0), true, 2053628506));
                                                    z91 = z95;
                                                } else if (pa7.t(overviewItem2, OverviewItem.FailReason.INSTANCE)) {
                                                    z91 = z95;
                                                    v08Var.V("FailReason", "FailReason", new dd2(new cl(failReason, bx9VarQ, z91, x16Var5, x16Var6, 6), true, 1749770971));
                                                } else {
                                                    z91 = z95;
                                                    if (pa7.t(overviewItem2, OverviewItem.Loading.INSTANCE)) {
                                                        ap.c();
                                                        return null;
                                                    }
                                                    z92 = true;
                                                    v08Var.V("Loading", "Loading", new dd2(new g20(24, bx9VarQ), true, 1445913436));
                                                }
                                                z92 = true;
                                            }
                                            i20 = i21;
                                            z817 = z92;
                                            z95 = z91;
                                            i111 = 3;
                                        }
                                        z92 = z817;
                                        z91 = z95;
                                        i20 = i21;
                                        z817 = z92;
                                        z95 = z91;
                                        i111 = 3;
                                    }
                                    return wef.a;
                                }
                                v08.W(v08Var, null, new dd2(new av9(quotaBlockReason3, x16Var9, i22), true, 155188175), 3);
                                x16Var12 = x16Var14;
                                x16Var11 = x16Var15;
                                z817 = true;
                                i111 = 3;
                                sfbVar2 = sfbVar3;
                                z818 = r5;
                                f4 = f2;
                                if (z818) {
                                    final sfb sfbVar6 = sfbVar2;
                                    final x16 x16Var18 = x16Var11;
                                    v08Var.V("ReadingFeedback", "ReadingFeedback", new dd2(new n26() { // from class: dv9
                                        @Override // defpackage.n26
                                        public final Object m(Object obj8, Object obj9, Object obj10) {
                                            l46 l46Var2 = (l46) obj9;
                                            int iIntValue = ((Integer) obj10).intValue();
                                            ((mx7) obj8).getClass();
                                            if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                j09 j09VarB0 = ynb.b0(f4, 0.0f, g09.a, 2);
                                                dd2 dd2VarB0 = af1.b0(-198723970, new ev9(d6fVar2, x16Var18, 0), l46Var2);
                                                a26 a26Var15 = a26Var13;
                                                boolean zG6 = l46Var2.g(a26Var15);
                                                Object objR11 = l46Var2.R();
                                                i8c i8cVar3 = sf2.a;
                                                if (zG6 || objR11 == i8cVar3) {
                                                    objR11 = new zh1(a26Var15, 22);
                                                    l46Var2.p0(objR11);
                                                }
                                                x16 x16Var19 = (x16) objR11;
                                                boolean zG7 = l46Var2.g(a26Var15);
                                                Object objR12 = l46Var2.R();
                                                if (zG7 || objR12 == i8cVar3) {
                                                    objR12 = new zh1(a26Var15, 23);
                                                    l46Var2.p0(objR12);
                                                }
                                                x16 x16Var110 = (x16) objR12;
                                                boolean zG8 = l46Var2.g(a26Var15);
                                                Object objR13 = l46Var2.R();
                                                if (zG8 || objR13 == i8cVar3) {
                                                    objR13 = new zh1(a26Var15, 24);
                                                    l46Var2.p0(objR13);
                                                }
                                                dj6.v(j09VarB0, dd2VarB0, sfbVar6, z94, x16Var19, x16Var110, (x16) objR13, x16Var12, l46Var2, 48);
                                            } else {
                                                l46Var2.Z();
                                            }
                                            return wef.a;
                                        }
                                    }, z817, -1186389458));
                                }
                                if (z20) {
                                    v08Var.V("recommended-follow-ups", "recommended-follow-ups", new dd2(new j43(f4, list2, a26Var, e89Var), z817, 1767000205));
                                }
                                list4 = c78VarN;
                                i20 = 0;
                                while (r6.hasNext()) {
                                    i21 = i20 + 1;
                                    if (i20 >= 0) {
                                        t72.Z();
                                        throw null;
                                    }
                                    overviewItem2 = (OverviewItem) obj7;
                                    overviewItem3 = (OverviewItem) s72.y0(i21, list4);
                                    if (overviewItem3 instanceof OverviewItem.NewReadingItem) {
                                        z90 = false;
                                    } else {
                                        z90 = false;
                                    }
                                    bx9VarQ = ynb.q(f4, 0.0f, 2);
                                    zT = pa7.t(overviewItem2, OverviewItem.Share.INSTANCE);
                                    x16Var13 = x16Var2;
                                    if (zT) {
                                        v08Var.V("share", "share", new dd2(new s19(i111, bx9VarQ, x16Var13), z817, -1975332514));
                                    } else if (pa7.t(overviewItem2, OverviewItem.Divider.INSTANCE)) {
                                        v08Var.V("divider", "divider", tm7.t);
                                    } else if (overviewItem2 instanceof OverviewItem.UserMessageItem) {
                                        OverviewItem.UserMessageItem userMessageItem3 = (OverviewItem.UserMessageItem) overviewItem2;
                                        v08Var.V(userMessageItem3.getId(), "UserMessageItem", new dd2(new s19(4, bx9VarQ, userMessageItem3), z817, -1025908650));
                                    } else if (overviewItem2 instanceof OverviewItem.ServerMessageItem) {
                                        OverviewItem.ServerMessageItem serverMessageItem3 = (OverviewItem.ServerMessageItem) overviewItem2;
                                        v08Var.V(serverMessageItem3.getId(), "ServerMessageItem", new dd2(new ck(z90, bx9VarQ, serverMessageItem3, a26Var14), z817, -1329766185));
                                    } else {
                                        if (overviewItem2 instanceof OverviewItem.NewReadingItem) {
                                            OverviewItem.NewReadingItem newReadingItem3 = (OverviewItem.NewReadingItem) overviewItem2;
                                            v08Var.V(ub3.i("new-reading:", newReadingItem3.getMessageId()), "NewReadingItem", new dd2(new sz7(bx9VarQ, newReadingItem3, quotaBlockReason, a26Var2, 11), z817, -1633623720));
                                        } else {
                                            if (overviewItem2 instanceof OverviewItem.ClarifyingCardItem) {
                                                OverviewItem.ClarifyingCardItem clarifyingCardItem3 = (OverviewItem.ClarifyingCardItem) overviewItem2;
                                                v08Var.V(ub3.i("clarifying-card:", clarifyingCardItem3.getMessageId()), "ClarifyingCardItem", new dd2(new ns2(bx9VarQ, clarifyingCardItem3, quotaBlockReason2, ip5Var, a26Var6, a26Var7, a26Var8, a26Var9, a26Var10, 1), true, -1937481255));
                                                z91 = z95;
                                            } else if (pa7.t(overviewItem2, OverviewItem.ContinuationChatSlice.INSTANCE)) {
                                                v08Var.V("ContinuationChatSlice", "ContinuationChatSlice", new dd2(new fv9(bx9VarQ, x16Var, x16Var13, 0), true, 2053628506));
                                                z91 = z95;
                                            } else if (pa7.t(overviewItem2, OverviewItem.FailReason.INSTANCE)) {
                                                z91 = z95;
                                                v08Var.V("FailReason", "FailReason", new dd2(new cl(failReason, bx9VarQ, z91, x16Var5, x16Var6, 6), true, 1749770971));
                                            } else {
                                                z91 = z95;
                                                if (pa7.t(overviewItem2, OverviewItem.Loading.INSTANCE)) {
                                                    ap.c();
                                                    return null;
                                                }
                                                z92 = true;
                                                v08Var.V("Loading", "Loading", new dd2(new g20(24, bx9VarQ), true, 1445913436));
                                            }
                                            z92 = true;
                                        }
                                        i20 = i21;
                                        z817 = z92;
                                        z95 = z91;
                                        i111 = 3;
                                    }
                                    z92 = z817;
                                    z91 = z95;
                                    i20 = i21;
                                    z817 = z92;
                                    z95 = z91;
                                    i111 = 3;
                                }
                                return wef.a;
                            }
                        };
                        r3.p0(obj5);
                        r1 = r3;
                    } else {
                        ?? r4 = l46Var;
                        i8 = i14;
                        obj5 = new a26() { // from class: vu9
                            /* JADX WARN: Code duplicated, block: B:14:0x00b4  */
                            /* JADX WARN: Code duplicated, block: B:17:0x00d0  */
                            /* JADX WARN: Code duplicated, block: B:21:0x00f5  */
                            /* JADX WARN: Code duplicated, block: B:23:0x00fd  */
                            /* JADX WARN: Code duplicated, block: B:28:0x010f  */
                            /* JADX WARN: Code duplicated, block: B:31:0x0120  */
                            /* JADX WARN: Code duplicated, block: B:33:0x0138  */
                            /* JADX WARN: Code duplicated, block: B:35:0x0140  */
                            /* JADX WARN: Code duplicated, block: B:36:0x0148  */
                            /* JADX WARN: Code duplicated, block: B:38:0x014c  */
                            /* JADX WARN: Code duplicated, block: B:39:0x0166  */
                            /* JADX WARN: Code duplicated, block: B:41:0x016a  */
                            /* JADX WARN: Code duplicated, block: B:42:0x0183  */
                            /* JADX WARN: Code duplicated, block: B:44:0x0187  */
                            /* JADX WARN: Code duplicated, block: B:45:0x01b2  */
                            /* JADX WARN: Code duplicated, block: B:47:0x01b6  */
                            /* JADX WARN: Code duplicated, block: B:49:0x01ff  */
                            /* JADX WARN: Code duplicated, block: B:51:0x0207  */
                            /* JADX WARN: Code duplicated, block: B:52:0x0220  */
                            /* JADX WARN: Code duplicated, block: B:54:0x0229  */
                            /* JADX WARN: Code duplicated, block: B:55:0x0251  */
                            /* JADX WARN: Code duplicated, block: B:57:0x025b  */
                            /* JADX WARN: Code duplicated, block: B:66:0x027c A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:67:0x0277 A[SYNTHETIC] */
                            @Override // defpackage.a26
                            public final Object d(Object obj6) {
                                x16 x16Var11;
                                sfb sfbVar2;
                                boolean z817;
                                final x16 x16Var12;
                                int i111;
                                boolean z818;
                                final float f4;
                                List list4;
                                int i20;
                                int i21;
                                OverviewItem overviewItem2;
                                OverviewItem overviewItem3;
                                boolean z90;
                                bx9 bx9VarQ;
                                boolean zT;
                                x16 x16Var13;
                                boolean z91;
                                boolean z92;
                                v08 v08Var = (v08) obj6;
                                v08Var.getClass();
                                bd4 bd4Var2 = bd4Var;
                                int i22 = 0;
                                v08.W(v08Var, null, new dd2(new yu9(bd4Var2, i22), true, 1561532129), 3);
                                if (bd4Var2.b instanceof ad4) {
                                    v08.W(v08Var, null, new dd2(new zu9(bd4Var2, pp5Var, l26Var, z24, 0), true, -2040408666), 3);
                                }
                                boolean z93 = z6;
                                sfb sfbVar3 = sfbVar;
                                final boolean z94 = z5;
                                final a26 a26Var13 = a26Var11;
                                x16 x16Var14 = x16Var7;
                                a26 a26Var14 = a26Var12;
                                boolean z95 = z4;
                                final d6f d6fVar2 = d6fVar;
                                x16 x16Var15 = x16Var8;
                                if (!z93) {
                                    if (z25) {
                                        x16Var11 = x16Var15;
                                        sfbVar2 = sfbVar3;
                                        z817 = true;
                                        x16Var12 = x16Var14;
                                        i111 = 3;
                                        v08.W(v08Var, null, new dd2(new cv9(zF, z18, sfbVar2, z94, a26Var13, x16Var14, bd4Var2, z23, a26Var14, z95, z2, d6fVar2, x16Var4, x16Var3, x16Var11, 0), true, 926788038), 3);
                                    }
                                    z818 = r5;
                                    f4 = f2;
                                    if (z818) {
                                        final sfb sfbVar6 = sfbVar2;
                                        final x16 x16Var18 = x16Var11;
                                        v08Var.V("ReadingFeedback", "ReadingFeedback", new dd2(new n26() { // from class: dv9
                                            @Override // defpackage.n26
                                            public final Object m(Object obj8, Object obj9, Object obj10) {
                                                l46 l46Var2 = (l46) obj9;
                                                int iIntValue = ((Integer) obj10).intValue();
                                                ((mx7) obj8).getClass();
                                                if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    j09 j09VarB0 = ynb.b0(f4, 0.0f, g09.a, 2);
                                                    dd2 dd2VarB0 = af1.b0(-198723970, new ev9(d6fVar2, x16Var18, 0), l46Var2);
                                                    a26 a26Var15 = a26Var13;
                                                    boolean zG6 = l46Var2.g(a26Var15);
                                                    Object objR11 = l46Var2.R();
                                                    i8c i8cVar3 = sf2.a;
                                                    if (zG6 || objR11 == i8cVar3) {
                                                        objR11 = new zh1(a26Var15, 22);
                                                        l46Var2.p0(objR11);
                                                    }
                                                    x16 x16Var19 = (x16) objR11;
                                                    boolean zG7 = l46Var2.g(a26Var15);
                                                    Object objR12 = l46Var2.R();
                                                    if (zG7 || objR12 == i8cVar3) {
                                                        objR12 = new zh1(a26Var15, 23);
                                                        l46Var2.p0(objR12);
                                                    }
                                                    x16 x16Var110 = (x16) objR12;
                                                    boolean zG8 = l46Var2.g(a26Var15);
                                                    Object objR13 = l46Var2.R();
                                                    if (zG8 || objR13 == i8cVar3) {
                                                        objR13 = new zh1(a26Var15, 24);
                                                        l46Var2.p0(objR13);
                                                    }
                                                    dj6.v(j09VarB0, dd2VarB0, sfbVar6, z94, x16Var19, x16Var110, (x16) objR13, x16Var12, l46Var2, 48);
                                                } else {
                                                    l46Var2.Z();
                                                }
                                                return wef.a;
                                            }
                                        }, z817, -1186389458));
                                    }
                                    if (z20) {
                                        v08Var.V("recommended-follow-ups", "recommended-follow-ups", new dd2(new j43(f4, list2, a26Var, e89Var), z817, 1767000205));
                                    }
                                    list4 = c78VarN;
                                    i20 = 0;
                                    for (Object obj7 : list4) {
                                        i21 = i20 + 1;
                                        if (i20 >= 0) {
                                            t72.Z();
                                            throw null;
                                        }
                                        overviewItem2 = (OverviewItem) obj7;
                                        overviewItem3 = (OverviewItem) s72.y0(i21, list4);
                                        if (!(overviewItem3 instanceof OverviewItem.NewReadingItem) || (overviewItem3 instanceof OverviewItem.ClarifyingCardItem)) {
                                            z90 = false;
                                        } else {
                                            z90 = z817;
                                        }
                                        bx9VarQ = ynb.q(f4, 0.0f, 2);
                                        zT = pa7.t(overviewItem2, OverviewItem.Share.INSTANCE);
                                        x16Var13 = x16Var2;
                                        if (zT) {
                                            v08Var.V("share", "share", new dd2(new s19(i111, bx9VarQ, x16Var13), z817, -1975332514));
                                        } else if (pa7.t(overviewItem2, OverviewItem.Divider.INSTANCE)) {
                                            v08Var.V("divider", "divider", tm7.t);
                                        } else if (overviewItem2 instanceof OverviewItem.UserMessageItem) {
                                            OverviewItem.UserMessageItem userMessageItem3 = (OverviewItem.UserMessageItem) overviewItem2;
                                            v08Var.V(userMessageItem3.getId(), "UserMessageItem", new dd2(new s19(4, bx9VarQ, userMessageItem3), z817, -1025908650));
                                        } else if (overviewItem2 instanceof OverviewItem.ServerMessageItem) {
                                            OverviewItem.ServerMessageItem serverMessageItem3 = (OverviewItem.ServerMessageItem) overviewItem2;
                                            v08Var.V(serverMessageItem3.getId(), "ServerMessageItem", new dd2(new ck(z90, bx9VarQ, serverMessageItem3, a26Var14), z817, -1329766185));
                                        } else {
                                            if (overviewItem2 instanceof OverviewItem.NewReadingItem) {
                                                OverviewItem.NewReadingItem newReadingItem3 = (OverviewItem.NewReadingItem) overviewItem2;
                                                v08Var.V(ub3.i("new-reading:", newReadingItem3.getMessageId()), "NewReadingItem", new dd2(new sz7(bx9VarQ, newReadingItem3, quotaBlockReason, a26Var2, 11), z817, -1633623720));
                                            } else {
                                                if (overviewItem2 instanceof OverviewItem.ClarifyingCardItem) {
                                                    OverviewItem.ClarifyingCardItem clarifyingCardItem3 = (OverviewItem.ClarifyingCardItem) overviewItem2;
                                                    v08Var.V(ub3.i("clarifying-card:", clarifyingCardItem3.getMessageId()), "ClarifyingCardItem", new dd2(new ns2(bx9VarQ, clarifyingCardItem3, quotaBlockReason2, ip5Var, a26Var6, a26Var7, a26Var8, a26Var9, a26Var10, 1), true, -1937481255));
                                                    z91 = z95;
                                                } else if (pa7.t(overviewItem2, OverviewItem.ContinuationChatSlice.INSTANCE)) {
                                                    v08Var.V("ContinuationChatSlice", "ContinuationChatSlice", new dd2(new fv9(bx9VarQ, x16Var, x16Var13, 0), true, 2053628506));
                                                    z91 = z95;
                                                } else if (pa7.t(overviewItem2, OverviewItem.FailReason.INSTANCE)) {
                                                    z91 = z95;
                                                    v08Var.V("FailReason", "FailReason", new dd2(new cl(failReason, bx9VarQ, z91, x16Var5, x16Var6, 6), true, 1749770971));
                                                } else {
                                                    z91 = z95;
                                                    if (pa7.t(overviewItem2, OverviewItem.Loading.INSTANCE)) {
                                                        ap.c();
                                                        return null;
                                                    }
                                                    z92 = true;
                                                    v08Var.V("Loading", "Loading", new dd2(new g20(24, bx9VarQ), true, 1445913436));
                                                }
                                                z92 = true;
                                            }
                                            i20 = i21;
                                            z817 = z92;
                                            z95 = z91;
                                            i111 = 3;
                                        }
                                        z92 = z817;
                                        z91 = z95;
                                        i20 = i21;
                                        z817 = z92;
                                        z95 = z91;
                                        i111 = 3;
                                    }
                                    return wef.a;
                                }
                                v08.W(v08Var, null, new dd2(new av9(quotaBlockReason3, x16Var9, i22), true, 155188175), 3);
                                x16Var12 = x16Var14;
                                x16Var11 = x16Var15;
                                z817 = true;
                                i111 = 3;
                                sfbVar2 = sfbVar3;
                                z818 = r5;
                                f4 = f2;
                                if (z818) {
                                    final sfb sfbVar7 = sfbVar2;
                                    final x16 x16Var19 = x16Var11;
                                    v08Var.V("ReadingFeedback", "ReadingFeedback", new dd2(new n26() { // from class: dv9
                                        @Override // defpackage.n26
                                        public final Object m(Object obj8, Object obj9, Object obj10) {
                                            l46 l46Var2 = (l46) obj9;
                                            int iIntValue = ((Integer) obj10).intValue();
                                            ((mx7) obj8).getClass();
                                            if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                j09 j09VarB0 = ynb.b0(f4, 0.0f, g09.a, 2);
                                                dd2 dd2VarB0 = af1.b0(-198723970, new ev9(d6fVar2, x16Var19, 0), l46Var2);
                                                a26 a26Var15 = a26Var13;
                                                boolean zG6 = l46Var2.g(a26Var15);
                                                Object objR11 = l46Var2.R();
                                                i8c i8cVar3 = sf2.a;
                                                if (zG6 || objR11 == i8cVar3) {
                                                    objR11 = new zh1(a26Var15, 22);
                                                    l46Var2.p0(objR11);
                                                }
                                                x16 x16Var110 = (x16) objR11;
                                                boolean zG7 = l46Var2.g(a26Var15);
                                                Object objR12 = l46Var2.R();
                                                if (zG7 || objR12 == i8cVar3) {
                                                    objR12 = new zh1(a26Var15, 23);
                                                    l46Var2.p0(objR12);
                                                }
                                                x16 x16Var111 = (x16) objR12;
                                                boolean zG8 = l46Var2.g(a26Var15);
                                                Object objR13 = l46Var2.R();
                                                if (zG8 || objR13 == i8cVar3) {
                                                    objR13 = new zh1(a26Var15, 24);
                                                    l46Var2.p0(objR13);
                                                }
                                                dj6.v(j09VarB0, dd2VarB0, sfbVar7, z94, x16Var110, x16Var111, (x16) objR13, x16Var12, l46Var2, 48);
                                            } else {
                                                l46Var2.Z();
                                            }
                                            return wef.a;
                                        }
                                    }, z817, -1186389458));
                                }
                                if (z20) {
                                    v08Var.V("recommended-follow-ups", "recommended-follow-ups", new dd2(new j43(f4, list2, a26Var, e89Var), z817, 1767000205));
                                }
                                list4 = c78VarN;
                                i20 = 0;
                                while (r6.hasNext()) {
                                    i21 = i20 + 1;
                                    if (i20 >= 0) {
                                        t72.Z();
                                        throw null;
                                    }
                                    overviewItem2 = (OverviewItem) obj7;
                                    overviewItem3 = (OverviewItem) s72.y0(i21, list4);
                                    if (overviewItem3 instanceof OverviewItem.NewReadingItem) {
                                        z90 = false;
                                    } else {
                                        z90 = false;
                                    }
                                    bx9VarQ = ynb.q(f4, 0.0f, 2);
                                    zT = pa7.t(overviewItem2, OverviewItem.Share.INSTANCE);
                                    x16Var13 = x16Var2;
                                    if (zT) {
                                        v08Var.V("share", "share", new dd2(new s19(i111, bx9VarQ, x16Var13), z817, -1975332514));
                                    } else if (pa7.t(overviewItem2, OverviewItem.Divider.INSTANCE)) {
                                        v08Var.V("divider", "divider", tm7.t);
                                    } else if (overviewItem2 instanceof OverviewItem.UserMessageItem) {
                                        OverviewItem.UserMessageItem userMessageItem4 = (OverviewItem.UserMessageItem) overviewItem2;
                                        v08Var.V(userMessageItem4.getId(), "UserMessageItem", new dd2(new s19(4, bx9VarQ, userMessageItem4), z817, -1025908650));
                                    } else if (overviewItem2 instanceof OverviewItem.ServerMessageItem) {
                                        OverviewItem.ServerMessageItem serverMessageItem4 = (OverviewItem.ServerMessageItem) overviewItem2;
                                        v08Var.V(serverMessageItem4.getId(), "ServerMessageItem", new dd2(new ck(z90, bx9VarQ, serverMessageItem4, a26Var14), z817, -1329766185));
                                    } else {
                                        if (overviewItem2 instanceof OverviewItem.NewReadingItem) {
                                            OverviewItem.NewReadingItem newReadingItem4 = (OverviewItem.NewReadingItem) overviewItem2;
                                            v08Var.V(ub3.i("new-reading:", newReadingItem4.getMessageId()), "NewReadingItem", new dd2(new sz7(bx9VarQ, newReadingItem4, quotaBlockReason, a26Var2, 11), z817, -1633623720));
                                        } else {
                                            if (overviewItem2 instanceof OverviewItem.ClarifyingCardItem) {
                                                OverviewItem.ClarifyingCardItem clarifyingCardItem4 = (OverviewItem.ClarifyingCardItem) overviewItem2;
                                                v08Var.V(ub3.i("clarifying-card:", clarifyingCardItem4.getMessageId()), "ClarifyingCardItem", new dd2(new ns2(bx9VarQ, clarifyingCardItem4, quotaBlockReason2, ip5Var, a26Var6, a26Var7, a26Var8, a26Var9, a26Var10, 1), true, -1937481255));
                                                z91 = z95;
                                            } else if (pa7.t(overviewItem2, OverviewItem.ContinuationChatSlice.INSTANCE)) {
                                                v08Var.V("ContinuationChatSlice", "ContinuationChatSlice", new dd2(new fv9(bx9VarQ, x16Var, x16Var13, 0), true, 2053628506));
                                                z91 = z95;
                                            } else if (pa7.t(overviewItem2, OverviewItem.FailReason.INSTANCE)) {
                                                z91 = z95;
                                                v08Var.V("FailReason", "FailReason", new dd2(new cl(failReason, bx9VarQ, z91, x16Var5, x16Var6, 6), true, 1749770971));
                                            } else {
                                                z91 = z95;
                                                if (pa7.t(overviewItem2, OverviewItem.Loading.INSTANCE)) {
                                                    ap.c();
                                                    return null;
                                                }
                                                z92 = true;
                                                v08Var.V("Loading", "Loading", new dd2(new g20(24, bx9VarQ), true, 1445913436));
                                            }
                                            z92 = true;
                                        }
                                        i20 = i21;
                                        z817 = z92;
                                        z95 = z91;
                                        i111 = 3;
                                    }
                                    z92 = z817;
                                    z91 = z95;
                                    i20 = i21;
                                    z817 = z92;
                                    z95 = z91;
                                    i111 = 3;
                                }
                                return wef.a;
                            }
                        };
                        r4.p0(obj5);
                        r1 = r4;
                    }
                    af1.s(j09VarY2, j18Var, bx9Var2, uc0Var2, null, null, false, null, (a26) obj5, r1, ((i8 >> 3) & 112) | 27648, 480);
                    break;
                }
                next = it.next();
                i9 = i7 + 1;
                if (i7 >= 0) {
                    t72.Z();
                    throw null;
                }
                ot8Var = (ot8) next;
                boolean z817 = z16;
                if (ot8Var instanceof nt8) {
                    nt8 nt8Var2 = (nt8) ot8Var;
                    String str11 = nt8Var2.a;
                    strE = nt8Var2.b;
                    if (strE == null) {
                        strE = tec.e(i7, "user_");
                    }
                    c78VarW.add(new OverviewItem.UserMessageItem(str11, strE));
                } else if (ot8Var instanceof et8) {
                    et8 et8Var2 = (et8) ot8Var;
                    c78VarW.add(new OverviewItem.ServerMessageItem(et8Var2.b, et8Var2.a, et8Var2.c));
                } else if (ot8Var instanceof gt8) {
                    gt8 gt8Var2 = (gt8) ot8Var;
                    String str12 = gt8Var2.b;
                    String strI2 = ub3.i("clarifying-card-interpretation:", gt8Var2.d);
                    ClarifyingCardDrawActionState clarifyingCardDrawActionState3 = (ClarifyingCardDrawActionState) a26Var3.d(gt8Var2.d);
                    clarifyingCardDrawActionState3.getClass();
                    c78VarW.add(new OverviewItem.ServerMessageItem(str12, strI2, !clarifyingCardDrawActionState3.equals(ClarifyingCardDrawActionState.Loading.INSTANCE)));
                } else if (ot8Var instanceof ht8) {
                    LinkedHashMap linkedHashMap2 = pp5Var.b;
                    ht8Var = (ht8) ot8Var;
                    str4 = ht8Var.a;
                    t12Var = (t12) linkedHashMap2.get(str4);
                    if (t12Var == null) {
                        ClarifyingCardDrawActionState clarifyingCardDrawActionState4 = (ClarifyingCardDrawActionState) a26Var3.d(str4);
                        ClarifyingCardSkipActionState clarifyingCardSkipActionState2 = (ClarifyingCardSkipActionState) a26Var4.d(str4);
                        String str13 = ht8Var.a;
                        String str14 = ht8Var.b;
                        ClarifyingCardState clarifyingCardState2 = t12Var.d;
                        ft8Var = t12Var.b;
                        if (ft8Var != null) {
                            tarotCardChoice = null;
                        } else {
                            tarotCardChoice = null;
                        }
                        c78VarW.add(new OverviewItem.ClarifyingCardItem(str13, str14, clarifyingCardState2, tarotCardChoice, (TarotCardChoice) a26Var5.d(str4), clarifyingCardDrawActionState4, clarifyingCardSkipActionState2));
                    }
                } else if (ot8Var instanceof jt8) {
                    jt8Var = (jt8) ot8Var;
                    String str15 = jt8Var.a;
                    String str16 = jt8Var.b;
                    str2 = jt8Var.c;
                    if (str2 == null) {
                        t68Var = jt8Var.d;
                        if (t68Var != null) {
                            str3 = t68Var.a;
                        } else {
                            str3 = null;
                        }
                    } else {
                        str3 = str2;
                    }
                    c78VarW.add(new OverviewItem.NewReadingItem(str15, str16, str3, (NewReadingState) bm8.B(pp5Var.d, str15)));
                }
                z16 = z817;
                zBooleanValue = z23;
                i7 = i9;
            }
        } else {
            l46Var.Z();
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(z, failReason, bd4Var, list, pp5Var, l26Var, list2, z2, a26Var, a26Var2, a26Var3, a26Var4, a26Var5, a26Var6, a26Var7, a26Var8, quotaBlockReason, quotaBlockReason2, ip5Var, a26Var9, a26Var10, j18Var, x16Var, x16Var2, x16Var3, x16Var4, z3, xw9Var, ii6Var, z4, x16Var5, x16Var6, sfbVar, z5, a26Var11, x16Var7, d6fVar, x16Var8, z6, quotaBlockReason3, x16Var9, a26Var12, z7, z8, str, x16Var10, i, i2) { // from class: wu9
                public final /* synthetic */ a26 E0;
                public final /* synthetic */ a26 F0;
                public final /* synthetic */ QuotaBlockReason G0;
                public final /* synthetic */ QuotaBlockReason H0;
                public final /* synthetic */ ip5 I0;
                public final /* synthetic */ a26 J0;
                public final /* synthetic */ a26 K0;
                public final /* synthetic */ j18 L0;
                public final /* synthetic */ x16 M0;
                public final /* synthetic */ x16 N0;
                public final /* synthetic */ x16 O0;
                public final /* synthetic */ x16 P0;
                public final /* synthetic */ boolean Q0;
                public final /* synthetic */ xw9 R0;
                public final /* synthetic */ ii6 S0;
                public final /* synthetic */ boolean T0;
                public final /* synthetic */ x16 U0;
                public final /* synthetic */ x16 V0;
                public final /* synthetic */ sfb W0;
                public final /* synthetic */ a26 X;
                public final /* synthetic */ boolean X0;
                public final /* synthetic */ a26 Y;
                public final /* synthetic */ a26 Y0;
                public final /* synthetic */ a26 Z;
                public final /* synthetic */ x16 Z0;
                public final /* synthetic */ d6f a1;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ x16 b1;
                public final /* synthetic */ FailReason c;
                public final /* synthetic */ boolean c1;
                public final /* synthetic */ bd4 d;
                public final /* synthetic */ QuotaBlockReason d1;
                public final /* synthetic */ List e;
                public final /* synthetic */ x16 e1;
                public final /* synthetic */ pp5 f;
                public final /* synthetic */ a26 f1;
                public final /* synthetic */ l26 g;
                public final /* synthetic */ boolean g1;
                public final /* synthetic */ boolean h1;
                public final /* synthetic */ String i1;
                public final /* synthetic */ x16 j1;
                public final /* synthetic */ int k1;
                public final /* synthetic */ List v;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ a26 x;
                public final /* synthetic */ a26 y;
                public final /* synthetic */ a26 z;

                {
                    this.k1 = i2;
                }

                @Override // defpackage.l26
                public final Object z(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int iP = k99.P(4097);
                    int iP2 = k99.P(this.k1);
                    k.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, this.Z, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, this.N0, this.O0, this.P0, this.Q0, this.R0, this.S0, this.T0, this.U0, this.V0, this.W0, this.X0, this.Y0, this.Z0, this.a1, this.b1, this.c1, this.d1, this.e1, this.f1, this.g1, this.h1, this.i1, this.j1, (l46) obj6, iP, iP2);
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0310  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v141 */
    /* JADX WARN: Type inference failed for: r0v146, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [cgb] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r3v107 */
    /* JADX WARN: Type inference failed for: r3v108 */
    /* JADX WARN: Type inference failed for: r3v121 */
    /* JADX WARN: Type inference failed for: r3v122 */
    /* JADX WARN: Type inference failed for: r3v129 */
    /* JADX WARN: Type inference failed for: r3v130 */
    /* JADX WARN: Type inference failed for: r3v140 */
    /* JADX WARN: Type inference failed for: r3v141 */
    /* JADX WARN: Type inference failed for: r3v159 */
    /* JADX WARN: Type inference failed for: r3v161 */
    /* JADX WARN: Type inference failed for: r3v163 */
    /* JADX WARN: Type inference failed for: r3v165 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r6v20, types: [l46] */
    /* JADX WARN: Type inference failed for: r6v21, types: [l46] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    public static final void e(final tr2 tr2Var, final j09 j09Var, final xw9 xw9Var, final a26 a26Var, l46 l46Var, final int i) {
        ojb ojbVarV;
        l26 l26Var;
        e89 e89VarI;
        e89 e89VarI2;
        boolean z;
        String str;
        vz9 vz9Var;
        Object next;
        String str2;
        bd4 bd4Var;
        TarotSkinIdentify tarotSkinIdentify;
        String str3;
        ?? cgbVar;
        String str4;
        r0 r0Var;
        j4a j4aVar;
        ArrayList arrayList;
        shb shbVar;
        LinkedHashMap linkedHashMap;
        boolean z2;
        r0 r0Var2;
        r0 r0Var3;
        ru9 ru9Var;
        boolean z3;
        l46 l46Var2;
        ym7 ym7Var;
        MixedDeckSnapshot mixedDeckSnapshot;
        shb shbVar2;
        String str5;
        tr2 tr2Var2;
        tt1 tt1Var;
        LinkedHashMap linkedHashMap2;
        Object ms2Var;
        t7 t7Var;
        shb shbVar3;
        e89 e89Var;
        shb shbVar4;
        int i2;
        LinkedHashMap linkedHashMap3;
        String str6;
        final MixedDeckSnapshot mixedDeckSnapshot2;
        final TarotSkinIdentify tarotSkinIdentify2;
        shb shbVar5;
        int i3;
        float f;
        ?? r6;
        String spreadId;
        ycc yccVarA;
        ycc yccVarA2;
        l46 l46Var3 = l46Var;
        j09Var.getClass();
        a26Var.getClass();
        l46Var3.h0(1305471768);
        int i4 = i | (l46Var3.i(tr2Var) ? 4 : 2) | (l46Var3.g(xw9Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var3.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var3.W(i4 & 1, (i4 & 1171) != 1170)) {
            r0 r0Var4 = tr2Var.c;
            MixedDeckSnapshot mixedDeckSnapshot3 = (MixedDeckSnapshot) l46Var3.k(snd.b);
            nfc nfcVarB = kr7.b(l46Var3);
            boolean zG = l46Var3.g(null) | l46Var3.g(nfcVarB);
            Object objR = l46Var3.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                objR = nfcVarB.b(job.a.b(q9b.class), null, null);
                l46Var3.p0(objR);
            }
            q9b q9bVar = (q9b) objR;
            nfc nfcVarB2 = kr7.b(l46Var3);
            boolean zG2 = l46Var3.g(null) | l46Var3.g(nfcVarB2);
            Object objR2 = l46Var3.R();
            if (zG2 || objR2 == i8cVar) {
                objR2 = nfcVarB2.b(job.a.b(t7.class), null, null);
                l46Var3.p0(objR2);
            }
            t7 t7Var2 = (t7) objR2;
            nfc nfcVarB3 = kr7.b(l46Var3);
            boolean zG3 = l46Var3.g(null) | l46Var3.g(nfcVarB3);
            Object objR3 = l46Var3.R();
            if (zG3 || objR3 == i8cVar) {
                objR3 = nfcVarB3.b(job.a.b(j4a.class), null, null);
                l46Var3.p0(objR3);
            }
            j4a j4aVar2 = (j4a) objR3;
            Object objR4 = l46Var3.R();
            if (objR4 == i8cVar) {
                objR4 = af1.E(l46Var3);
                l46Var3.p0(objR4);
            }
            aw2 aw2Var = (aw2) objR4;
            Object objR5 = l46Var3.R();
            if (objR5 == i8cVar) {
                objR5 = q1c.f(Boolean.FALSE);
                l46Var3.p0(objR5);
            }
            e89 e89Var2 = (e89) objR5;
            da9 da9VarH = tr2Var.a.b.h();
            whb whbVarB = (da9VarH == null || (yccVarA2 = da9VarH.a()) == null) ? null : yccVarA2.b("paywall_unlock_reading", Boolean.FALSE);
            if (whbVarB == null) {
                l46Var3.f0(381337561);
                l46Var3.r(false);
                e89VarI = null;
            } else {
                l46Var3.f0(427943208);
                e89VarI = jzb.i(whbVarB, whbVarB.getValue(), l46Var3, 0, 0);
                l46Var3.r(false);
            }
            if (e89VarI == null) {
                l46Var3.f0(381357960);
                Object objR6 = l46Var3.R();
                if (objR6 == i8cVar) {
                    objR6 = q1c.f(Boolean.FALSE);
                    l46Var3.p0(objR6);
                }
                e89VarI = (e89) objR6;
            } else {
                l46Var3.f0(427939929);
            }
            l46Var3.r(false);
            Boolean bool = (Boolean) e89VarI.getValue();
            bool.getClass();
            int i5 = i4 & 14;
            boolean zG4 = (i5 == 4 || l46Var3.i(tr2Var)) | l46Var3.g(e89VarI) | l46Var3.i(r0Var4);
            Object objR7 = l46Var3.R();
            if (zG4 || objR7 == i8cVar) {
                objR7 = new rv9(tr2Var, r0Var4, e89VarI, null);
                l46Var3.p0(objR7);
            }
            af1.o((l26) objR7, l46Var3, bool);
            da9 da9VarH2 = tr2Var.b.b.h();
            whb whbVarB2 = (da9VarH2 == null || (yccVarA = da9VarH2.a()) == null) ? null : yccVarA.b("clarifying_card_return_request_id", null);
            if (whbVarB2 == null) {
                l46Var3.f0(381746265);
                l46Var3.r(false);
                e89VarI2 = null;
            } else {
                l46Var3.f0(427956392);
                e89VarI2 = jzb.i(whbVarB2, whbVarB2.getValue(), l46Var3, 0, 0);
                l46Var3.r(false);
            }
            if (e89VarI2 == null) {
                l46Var3.f0(381766633);
                Object objR8 = l46Var3.R();
                if (objR8 == i8cVar) {
                    str = null;
                    objR8 = q1c.f(null);
                    l46Var3.p0(objR8);
                } else {
                    str = null;
                }
                e89VarI2 = (e89) objR8;
                z = false;
            } else {
                z = false;
                str = null;
                l46Var3.f0(427952368);
            }
            l46Var3.r(z);
            jd4 jd4VarA0 = r0Var4.a0();
            vz9 vz9Var2 = r0Var4.N1;
            vz9 vz9Var3 = r0Var4.l1;
            vz9 vz9Var4 = r0Var4.k1;
            jsd jsdVar = r0Var4.R0;
            if (!(jd4VarA0 instanceof bd4)) {
                if (jd4VarA0 instanceof ad4) {
                    ListIterator listIterator = jsdVar.listIterator();
                    while (true) {
                        ql6 ql6Var = (ql6) listIterator;
                        if (!ql6Var.hasNext()) {
                            vz9Var = vz9Var4;
                            next = str;
                            break;
                        }
                        next = ql6Var.next();
                        ListIterator listIterator2 = listIterator;
                        ot8 ot8Var = (ot8) next;
                        vz9Var = vz9Var4;
                        if ((ot8Var instanceof et8) && !((et8) ot8Var).c) {
                            break;
                        }
                        listIterator = listIterator2;
                        vz9Var4 = vz9Var;
                    }
                    et8 et8Var = (et8) next;
                    ad4 ad4Var = (ad4) jd4VarA0;
                    if (et8Var == null || (str2 = et8Var.b) == null) {
                        str2 = "";
                    }
                    bd4Var = new bd4(str2, ad4Var);
                } else {
                    if (!(jd4VarA0 instanceof zc4) && !(jd4VarA0 instanceof gd4) && !(jd4VarA0 instanceof fd4) && !pa7.t(jd4VarA0, hd4.a) && !(jd4VarA0 instanceof id4) && !pa7.t(jd4VarA0, cd4.a)) {
                        ap.c();
                        return;
                    }
                    ojbVarV = l46Var3.v();
                    if (ojbVarV == null) {
                        return;
                    }
                    final int i6 = 1;
                    l26Var = new l26(tr2Var, j09Var, xw9Var, a26Var, i, i6) { // from class: tu9
                        public final /* synthetic */ int a;
                        public final /* synthetic */ tr2 b;
                        public final /* synthetic */ j09 c;
                        public final /* synthetic */ xw9 d;
                        public final /* synthetic */ a26 e;

                        {
                            this.a = i6;
                        }

                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i7 = this.a;
                            wef wefVar = wef.a;
                            switch (i7) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(57);
                                    k.e(this.b, this.c, this.d, this.e, (l46) obj, iP);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP2 = k99.P(57);
                                    k.e(this.b, this.c, this.d, this.e, (l46) obj, iP2);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                }
                ojbVarV.d = l26Var;
            }
            bd4Var = (bd4) jd4VarA0;
            vz9Var = vz9Var4;
            TarotSkinIdentify tarotSkinIdentify3 = ((die) l46Var3.k(snd.a)).a;
            tt1 tt1Var2 = (tt1) l46Var3.k(vt1.a);
            String str7 = r0Var4.V() == null ? "reading_general" : "scene";
            final pp5 pp5VarP = r0Var4.P();
            ArrayList arrayList2 = pp5VarP.a;
            LinkedHashMap linkedHashMapS = cgg.s(jsdVar);
            SceneTarot sceneTarotV = r0Var4.V();
            if (sceneTarotV == null || (spreadId = sceneTarotV.getSpreadId()) == null) {
                tarotSkinIdentify = tarotSkinIdentify3;
                str3 = r0Var4.y1;
                if (str3 == null) {
                    str3 = "general";
                }
            } else {
                tarotSkinIdentify = tarotSkinIdentify3;
                str3 = spreadId;
            }
            String str8 = str7;
            shb shbVar6 = new shb(str3, r0Var4.E());
            String str9 = r0Var4.p0() ? "camera_divination" : "conversation";
            boolean zBooleanValue = ((Boolean) vz9Var.getValue()).booleanValue();
            String strE = r0Var4.E();
            QuotaBlockReason quotaBlockReason = (QuotaBlockReason) vz9Var3.getValue();
            String str10 = r0Var4.q0() ? "quick_draw" : str;
            strE.getClass();
            if (zBooleanValue) {
                int i7 = quotaBlockReason == null ? -1 : hgb.a[quotaBlockReason.ordinal()];
                if (i7 == -1) {
                    cgbVar = str;
                } else if (i7 == 1 || i7 == 2) {
                    cgbVar = new cgb(strE, str9, quotaBlockReason, str10);
                } else {
                    if (i7 != 3 && i7 != 4) {
                        ap.c();
                        return;
                    }
                    cgbVar = str;
                }
            } else {
                cgbVar = str;
            }
            Object objR9 = l46Var3.R();
            if (objR9 == i8cVar) {
                objR9 = new ggb();
                l46Var3.p0(objR9);
            }
            j(cgbVar, (ggb) objR9, l46Var3, 64);
            boolean zG5 = l46Var3.g(r0Var4.E());
            Object objR10 = l46Var3.R();
            if (zG5 || objR10 == i8cVar) {
                objR10 = new qt8();
                l46Var3.p0(objR10);
            }
            qt8 qt8Var = (qt8) objR10;
            ip5 ip5Var = new ip5(r0Var4.G(), r0Var4.Y() ? ep5.b : ep5.a, r0Var4.i0() ? sp5.b : sp5.a);
            boolean zI = l46Var3.i(r0Var4) | l46Var3.i(j4aVar2) | l46Var3.i(t7Var2) | (i5 == 4 || l46Var3.i(tr2Var));
            Object objR11 = l46Var3.R();
            if (zI || objR11 == i8cVar) {
                str4 = str9;
                r0Var = r0Var4;
                j4aVar = j4aVar2;
                sv9 sv9Var = new sv9(r0Var, j4aVar, t7Var2, tr2Var, null);
                t7Var2 = t7Var2;
                l46Var3.p0(sv9Var);
                objR11 = sv9Var;
            } else {
                r0Var = r0Var4;
                j4aVar = j4aVar2;
                str4 = str9;
            }
            int i8 = r0.j2;
            af1.o((l26) objR11, l46Var3, r0Var);
            boolean zI2 = l46Var3.i(arrayList2) | l46Var3.i(qt8Var) | l46Var3.i(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x03e0: ARITH (r0v54 'zI2' boolean) = (wrap boolean:0x03db: ARITH (wrap boolean:0x03d6: ARITH (wrap boolean:0x03ce: INVOKE (r6v0 'l46Var3' l46), (r8v1 'arrayList2' java.util.ArrayList) VIRTUAL call: l46.i(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED] (LINE:141)) | (wrap boolean:0x03d2: INVOKE (r6v0 'l46Var3' l46), (r10v17 'qt8Var' qt8) VIRTUAL call: l46.i(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED]) A[DONT_WRAP, WRAPPED] (LINE:141)) | (wrap boolean:0x03d7: INVOKE (r6v0 'l46Var3' l46), (r34v0 shb) VIRTUAL call: l46.i(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED]) A[DONT_WRAP, WRAPPED] (LINE:141)) | (wrap boolean:0x03dc: INVOKE (r6v0 'l46Var3' l46), (r35v0 java.util.LinkedHashMap) VIRTUAL call: l46.i(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (m), WRAPPED]) A[DECLARE_VAR] (LINE:141) in method: ai.askquin.ui.divination.k.e(tr2, j09, xw9, a26, l46, int):void, file: classes.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r34v0 shb
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 3411
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.askquin.ui.divination.k.e(tr2, j09, xw9, a26, l46, int):void");
        }

        public static final void f(e89 e89Var) {
            e89Var.setValue(Boolean.FALSE);
        }

        public static final void g(j4a j4aVar, t7 t7Var, r0 r0Var, tr2 tr2Var, QuotaBlockReason quotaBlockReason, String str) {
            Object paywall;
            String strA = ((mo3) t7Var).a();
            String strE = r0Var.E();
            j4aVar.getClass();
            quotaBlockReason.getClass();
            str.getClass();
            int i = c4a.a[quotaBlockReason.ordinal()];
            String str2 = "followup_action_paywall";
            if (i == 1) {
                QuotaUsage quotaUsageB = ((eab) j4aVar.a).b();
                if (quotaUsageB == null || !quotaUsageB.getHasSubscription()) {
                    paywall = new AppRoute.Paywall(str, false, false, false, 14, (rp3) null);
                } else {
                    paywall = new PaywallRoute.AddonPaywall(str, quotaBlockReason.getAnalyticsValue(), str2, false, 8, (rp3) null);
                }
            } else if (i == 2) {
                paywall = ai.askquin.ui.paywall.g.b(PaywallRoute.Companion, false, 2);
            } else if (i == 3) {
                PaywallRoute.Companion.getClass();
                paywall = new PaywallRoute.InterceptPaywall("followup_restricted", iif.NoSubscription.a(), "followup_action_paywall", strA, strE);
            } else {
                if (i != 4) {
                    ap.c();
                    return;
                }
                paywall = null;
            }
            if (paywall != null) {
                ai.askquin.ui.paywall.d.b(tr2Var.a, paywall);
            }
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00bf  */
        public static final void h(r0 r0Var, MixedDeckSnapshot mixedDeckSnapshot, TarotSkinIdentify tarotSkinIdentify, shb shbVar, tt1 tt1Var, LinkedHashMap linkedHashMap, String str, tr2 tr2Var, TarotCardChoice tarotCardChoice, String str2, k95 k95Var) {
            x12 x12Var;
            if (((Boolean) r0Var.k1.getValue()).booleanValue()) {
                return;
            }
            if (mixedDeckSnapshot == null || (tarotSkinIdentify = mixedDeckSnapshot.skinFor(tarotCardChoice.getCard().getCardKey())) != null) {
                TarotSkinIdentify tarotSkinIdentify2 = tarotSkinIdentify;
                if (k95Var != null) {
                    Object obj = null;
                    for (Object obj2 : linkedHashMap.values()) {
                        x12 x12Var2 = (x12) obj2;
                        if (pa7.t(x12Var2.d, tarotCardChoice) && x12Var2.c != null) {
                            obj = obj2;
                        }
                    }
                    x12Var = (x12) obj;
                } else {
                    x12Var = null;
                }
                if (k95Var == null) {
                    x1f x1fVar = x1f.a;
                    wg wgVar = new wg(str, str2, (Object) tarotSkinIdentify2, (Object) tarotCardChoice, 25);
                    tarotSkinIdentify2 = tarotSkinIdentify2;
                    x1f.k(p05.a, wgVar, 2);
                } else if ((x12Var != null ? x12Var.c : null) != null) {
                    Integer num = x12Var.c;
                    num.getClass();
                    String str3 = x12Var.a;
                    str3.getClass();
                    cgg.x(new rp5("button_click", bm8.H((iy9[]) Arrays.copyOf(new iy9[]{new iy9("btn", "extra_zoom"), new iy9("pathway", "reading_general"), new iy9("parent_session_id", shbVar.b), new iy9("card_id", tarotCardChoice.getCard().getCardKey()), new iy9("card_label", str3), new iy9("extra_n", num), new iy9("entry", k95Var.a())}, 7))));
                } else {
                    x1f x1fVar2 = x1f.a;
                    wg wgVar2 = new wg(str, str2, (Object) tarotSkinIdentify2, (Object) tarotCardChoice, 25);
                    tarotSkinIdentify2 = tarotSkinIdentify2;
                    x1f.k(p05.a, wgVar2, 2);
                }
                tt1.c(tt1Var, tarotCardChoice.getCard(), tarotSkinIdentify2, 0, true, new n25(tr2Var, tarotSkinIdentify2, tarotCardChoice, 17), null, null, mixedDeckSnapshot != null, 96);
            }
        }

        public static final void i(int i, x16 x16Var, l46 l46Var, j09 j09Var) {
            y6c y6cVar;
            l46Var.h0(-1662695789);
            int i2 = 4;
            int i3 = (l46Var.g(j09Var) ? 4 : 2) | i | (l46Var.i(x16Var) ? 32 : 16);
            if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
                pr4 pr4Var = l8b.a;
                if (k8b.f((e8b) l46Var.k(pr4Var))) {
                    l46Var.f0(-122813031);
                    y6cVar = eze.a(l46Var).a.j;
                    l46Var.r(false);
                } else {
                    l46Var.f0(-122812642);
                    l46Var.r(false);
                    y6cVar = a7c.a;
                }
                y6c y6cVar2 = y6cVar;
                bx9 bx9Var = v51.a;
                cgg.a(x16Var, j09Var, false, y6cVar2, v51.a(y72.j, ((m82) l46Var.k(o82.a)).o, 0L, 0L, l46Var, 12), null, x57.b(((e8b) l46Var.k(pr4Var)).s, 1.0f), null, tm7.v, l46Var, ((i3 >> 3) & 14) | 805306368 | ((i3 << 3) & 112), 420);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new fc5(j09Var, x16Var, i, i2);
            }
        }

        public static final void j(cgb cgbVar, ggb ggbVar, l46 l46Var, int i) {
            ggbVar.getClass();
            l46Var.h0(1928162621);
            int i2 = 16;
            int i3 = (l46Var.g(cgbVar) ? 4 : 2) | i | (l46Var.i(ggbVar) ? 32 : 16);
            if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
                boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32 || l46Var.i(ggbVar));
                Object objR = l46Var.R();
                if (z || objR == sf2.a) {
                    objR = new bw9(null, cgbVar, ggbVar);
                    l46Var.p0(objR);
                }
                af1.o((l26) objR, l46Var, cgbVar);
            } else {
                l46Var.Z();
            }
            ojb ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new rk6(cgbVar, ggbVar, i, i2);
            }
        }

        public static final boolean k(List list) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof et8) {
                    arrayList.add(obj);
                }
            }
            et8 et8Var = (et8) s72.x0(arrayList);
            return et8Var != null && et8Var.c;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:51:0x00bc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static final Object l(j18 j18Var, int i, zn2 zn2Var) {
            j jVar;
            j18 j18Var2;
            int i2;
            ListIterator listIterator;
            Object objPrevious;
            c18 c18Var;
            int i3;
            if (zn2Var instanceof j) {
                jVar = (j) zn2Var;
                int i4 = jVar.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    jVar.label = i4 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(zn2Var);
                }
            } else {
                jVar = new j(zn2Var);
            }
            Object obj = jVar.result;
            int i5 = jVar.label;
            wef wefVar = wef.a;
            bw2 bw2Var = bw2.a;
            if (i5 == 0) {
                jzb.q(obj);
                List list = j18Var.h().l;
                if (list.isEmpty()) {
                    jVar.L$0 = j18Var;
                    jVar.I$0 = i;
                    jVar.label = 1;
                    if (j18Var.j(i, 0, jVar) != bw2Var) {
                    }
                } else {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            jVar.L$0 = j18Var;
                            jVar.I$0 = i;
                            jVar.label = 1;
                            if (j18Var.j(i, 0, jVar) != bw2Var) {
                            }
                        } else if (((c18) it.next()).a == i) {
                        }
                    }
                }
                return bw2Var;
            }
            if (i5 == 1) {
                i = jVar.I$0;
                j18Var = (j18) jVar.L$0;
                jzb.q(obj);
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jzb.q(obj);
                    return wefVar;
                }
                i2 = jVar.I$0;
                j18Var2 = (j18) jVar.L$0;
                jzb.q(obj);
            }
            List list2 = j18Var2.h().l;
            listIterator = list2.listIterator(list2.size());
            do {
                if (listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (((c18) objPrevious).a != i2);
            c18Var = (c18) objPrevious;
            if (c18Var != null && (i3 = (c18Var.o + c18Var.p) - j18Var2.h().n) > 0) {
                jVar.L$0 = null;
                jVar.L$1 = null;
                jVar.I$0 = i2;
                jVar.I$1 = i3;
                jVar.label = 3;
                if (eb3.S(j18Var2, i3, jVar) == bw2Var) {
                    return bw2Var;
                }
            }
            return wefVar;
            xn9 xn9Var = new xn9(14);
            jVar.L$0 = j18Var;
            jVar.I$0 = i;
            jVar.label = 2;
            if (tm7.Q(xn9Var, jVar) != bw2Var) {
                int i6 = i;
                j18Var2 = j18Var;
                i2 = i6;
                List list3 = j18Var2.h().l;
                listIterator = list3.listIterator(list3.size());
                do {
                    if (listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (((c18) objPrevious).a != i2);
                c18Var = (c18) objPrevious;
                if (c18Var != null) {
                    jVar.L$0 = null;
                    jVar.L$1 = null;
                    jVar.I$0 = i2;
                    jVar.I$1 = i3;
                    jVar.label = 3;
                    if (eb3.S(j18Var2, i3, jVar) == bw2Var) {
                    }
                }
                return wefVar;
            }
            return bw2Var;
        }
    }

package defpackage;

import ai.askquin.ui.conversation.ConversationRoute;
import ai.askquin.ui.conversation.SceneTarot;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.draw.navhost.CameraPreviewRoute;
import ai.askquin.ui.draw.navhost.CardPickerRoute;
import ai.askquin.ui.draw.navhost.ClarifyingCardDrawingRoute;
import ai.askquin.ui.draw.navhost.DeckSelectionRoute;
import ai.askquin.ui.draw.navhost.EmptyPhotoPatternRoute;
import ai.askquin.ui.draw.navhost.OnSiteDialogRoute;
import ai.askquin.ui.draw.navhost.PhotoPatternRoute;
import ai.askquin.ui.draw.navhost.PostDrawInfoRoute;
import ai.askquin.ui.draw.navhost.UnifiedDrawingRoute;
import ai.askquin.ui.router.AppRoute;
import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;
import tech.chatmind.api.events.model.PopupAction;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class no2 implements a26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ no2(r38 r38Var, boolean z, e7g e7gVar, cre creVar, zse zseVar, sl9 sl9Var) {
        this.c = r38Var;
        this.b = z;
        this.d = e7gVar;
        this.e = creVar;
        this.f = zseVar;
        this.g = sl9Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        jte jteVar;
        bv7 bv7Var;
        bv7 bv7Var2;
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = 3;
        boolean z = this.b;
        final int i3 = 1;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.g;
        Object obj6 = this.c;
        final int i4 = 0;
        switch (i) {
            case 0:
                x48 x48Var = (x48) obj6;
                final dc9 dc9Var = (dc9) obj4;
                final mma mmaVar = (mma) obj3;
                final q7b q7bVar = (q7b) obj2;
                final e89 e89Var = (e89) obj5;
                ((ra4) obj).getClass();
                final boolean z2 = this.b;
                u48 u48Var = new u48() { // from class: yo2
                    @Override // defpackage.u48
                    public final void h(x48 x48Var2, f48 f48Var) {
                        Boolean boolValueOf;
                        ua9 ua9Var;
                        f48 f48Var2 = f48.ON_STOP;
                        dc9 dc9Var2 = dc9Var;
                        mma mmaVar2 = mmaVar;
                        if (f48Var == f48Var2) {
                            dc9Var2.y.setValue(Boolean.FALSE);
                            mmaVar2.k();
                        }
                        if (f48Var == f48.ON_START) {
                            e89 e89Var2 = e89Var;
                            if (((Boolean) e89Var2.getValue()).booleanValue()) {
                                Boolean bool = Boolean.FALSE;
                                e89Var2.setValue(bool);
                                if (z2) {
                                    mmaVar2.E(bool);
                                    return;
                                }
                            }
                            if (dc9Var2.f()) {
                                mmaVar2.E(Boolean.FALSE);
                                return;
                            }
                            if (((Boolean) mmaVar2.Q0.a.getValue()).booleanValue() || ua0.a() != null) {
                                mmaVar2.E(Boolean.FALSE);
                                return;
                            }
                            da9 da9VarH = q7bVar.a.b.h();
                            if (da9VarH == null || (ua9Var = da9VarH.b) == null) {
                                boolValueOf = null;
                            } else {
                                int i5 = ua9.e;
                                boolValueOf = Boolean.valueOf(kj0.k0(ua9Var, job.a.b(AppRoute.Main.class)));
                            }
                            mmaVar2.E(boolValueOf);
                        }
                    }
                };
                x48Var.k().a(u48Var);
                return new oe0(6, x48Var, u48Var);
            case 1:
                cb9 cb9Var = (cb9) obj6;
                final cb9 cb9Var2 = (cb9) obj4;
                final dr2 dr2Var = (dr2) obj3;
                tr2 tr2Var = (tr2) obj2;
                za9 za9Var = (za9) obj;
                za9Var.getClass();
                dd2 dd2Var = new dd2(new kr2(tr2Var, cb9Var, (x16) obj5, z), true, 887827784);
                kob kobVar = job.a;
                em7 em7VarB = kobVar.b(ConversationRoute.Conversation.class);
                qu4 qu4Var = qu4.a;
                rs0.o(za9Var, em7VarB, qu4Var, null, null, null, null, dd2Var);
                rs0.o(za9Var, kobVar.b(ConversationRoute.InvitationDialog.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var2, i4), true, 1000890353));
                final r0 r0Var = tr2Var.c;
                mr2 mr2Var = new mr2(cb9Var, i4);
                hl4 hl4Var = new hl4(i2);
                dr2Var.getClass();
                r0Var.getClass();
                rs0.o(za9Var, kobVar.b(DeckSelectionRoute.class), qu4Var, null, null, null, null, new dd2(new o91(r0Var, cb9Var2, mr2Var, dr2Var), true, 1073983968));
                rs0.o(za9Var, kobVar.b(UnifiedDrawingRoute.class), qu4Var, null, null, null, null, new dd2(new o26() { // from class: mo4
                    @Override // defpackage.o26
                    public final Object t(Object obj7, Object obj8, Object obj9, Object obj10) {
                        Object obj11;
                        ArrayList arrayList;
                        Object tarotCardChoice;
                        Boolean bool;
                        ka9 ka9Var;
                        ArrayList arrayList2;
                        Object tarotCardChoice2;
                        Boolean bool2;
                        Object obj12;
                        ka9 ka9Var2;
                        Object obj13;
                        soa soaVar;
                        fo4 fo4Var;
                        DrawCardSaves drawCardSaves;
                        int i5 = i4;
                        final fo4 fo4Var2 = dr2Var;
                        i8c i8cVar = sf2.a;
                        wef wefVar2 = wef.a;
                        boolean z3 = true;
                        switch (i5) {
                            case 0:
                                da9 da9Var = (da9) obj8;
                                l46 l46Var = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                da9Var.getClass();
                                kob kobVar2 = job.a;
                                UnifiedDrawingRoute unifiedDrawingRoute = (UnifiedDrawingRoute) vfh.S(da9Var, kobVar2.b(UnifiedDrawingRoute.class));
                                int i6 = r0.j2;
                                r0 r0Var2 = r0Var;
                                ka9 ka9Var3 = cb9Var2;
                                final DrawCardSaves drawCardSavesC = bp4.c(r0Var2, ka9Var3, l46Var);
                                if (drawCardSavesC == null) {
                                    return wefVar2;
                                }
                                boolean zI = l46Var.i(drawCardSavesC);
                                Object objR = l46Var.R();
                                if (zI || objR == i8cVar) {
                                    obj11 = objR;
                                    final int i7 = 0;
                                    x16 x16Var = new x16() { // from class: jo4
                                        @Override // defpackage.x16
                                        public final Object invoke() {
                                            int i8 = i7;
                                            DrawCardSaves drawCardSaves2 = drawCardSavesC;
                                            switch (i8) {
                                                case 0:
                                                    return db6.A0(drawCardSaves2);
                                                default:
                                                    return db6.A0(drawCardSaves2.getChatId());
                                            }
                                        }
                                    };
                                    l46Var.p0(x16Var);
                                    obj11 = x16Var;
                                }
                                x16 x16Var2 = (x16) obj11;
                                pwf pwfVarA = qd8.a(l46Var);
                                if (pwfVarA == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                rcf rcfVar = (rcf) z5c.G(kobVar2.b(rcf.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var2);
                                nfc nfcVarB = kr7.b(l46Var);
                                boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
                                Object objR2 = l46Var.R();
                                if (zG || objR2 == i8cVar) {
                                    objR2 = nfcVarB.b(kobVar2.b(fcb.class), null, null);
                                    l46Var.p0(objR2);
                                }
                                fcb fcbVar = (fcb) objR2;
                                Object objR3 = l46Var.R();
                                Object obj14 = objR3;
                                if (objR3 == i8cVar) {
                                    vz9 vz9VarF = q1c.f(null);
                                    l46Var.p0(vz9VarF);
                                    obj14 = vz9VarF;
                                }
                                e89 e89Var2 = (e89) obj14;
                                boolean zI2 = l46Var.i(r0Var2) | l46Var.i(rcfVar);
                                Object objR4 = l46Var.R();
                                Object obj15 = objR4;
                                if (zI2 || objR4 == i8cVar) {
                                    uo4 uo4Var = new uo4(null, rcfVar, r0Var2);
                                    l46Var.p0(uo4Var);
                                    obj15 = uo4Var;
                                }
                                af1.o((l26) obj15, l46Var, wefVar2);
                                boolean zI3 = l46Var.i(rcfVar) | l46Var.i(r0Var2);
                                Object objR5 = l46Var.R();
                                Object obj16 = objR5;
                                if (zI3 || objR5 == i8cVar) {
                                    wo4 wo4Var = new wo4(null, rcfVar, r0Var2);
                                    l46Var.p0(wo4Var);
                                    obj16 = wo4Var;
                                }
                                int i8 = rcf.x;
                                af1.o((l26) obj16, l46Var, rcfVar);
                                Boolean boolValueOf = Boolean.valueOf(r0Var2.m0());
                                boolean zI4 = l46Var.i(r0Var2) | l46Var.i(rcfVar);
                                Object objR6 = l46Var.R();
                                Object obj17 = objR6;
                                if (zI4 || objR6 == i8cVar) {
                                    xo4 xo4Var = new xo4(null, rcfVar, r0Var2);
                                    l46Var.p0(xo4Var);
                                    obj17 = xo4Var;
                                }
                                af1.o((l26) obj17, l46Var, boolValueOf);
                                MixedDeckSnapshot mixedDeckSnapshot = (MixedDeckSnapshot) rcfVar.c.getValue();
                                fo4 fo4Var3 = dr2Var;
                                snd.a(mixedDeckSnapshot, af1.b0(-1238849888, new ko4(rcfVar, r0Var2, unifiedDrawingRoute, fcbVar, ka9Var3, fo4Var3, e89Var2, 0), l46Var), l46Var, 48 | MixedDeckSnapshot.$stable);
                                DrawCardSaves drawCardSaves2 = (DrawCardSaves) e89Var2.getValue();
                                boolean z4 = !r0Var2.g0() || rcfVar.k() || (r0Var2.q0() && !rcfVar.f.isEmpty());
                                Object objR7 = l46Var.R();
                                Object obj18 = objR7;
                                if (objR7 == i8cVar) {
                                    ok3 ok3Var = new ok3(e89Var2, 13);
                                    l46Var.p0(ok3Var);
                                    obj18 = ok3Var;
                                }
                                x16 x16Var3 = (x16) obj18;
                                boolean zI5 = l46Var.i(r0Var2) | l46Var.i(fo4Var3);
                                Object objR8 = l46Var.R();
                                Object obj19 = objR8;
                                if (zI5 || objR8 == i8cVar) {
                                    lo4 lo4Var = new lo4(r0Var2, fo4Var3, 0);
                                    l46Var.p0(lo4Var);
                                    obj19 = lo4Var;
                                }
                                bp4.a(drawCardSaves2, z4, x16Var3, (a26) obj19, l46Var, DrawCardSaves.$stable | 384, 0);
                                return wefVar2;
                            case 1:
                                da9 da9Var2 = (da9) obj8;
                                l46 l46Var2 = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                da9Var2.getClass();
                                int i9 = r0.j2;
                                final r0 r0Var3 = r0Var;
                                ka9 ka9Var4 = cb9Var2;
                                final DrawCardSaves drawCardSavesC2 = bp4.c(r0Var3, ka9Var4, l46Var2);
                                if (drawCardSavesC2 == null) {
                                    return wefVar2;
                                }
                                List<PatternData> patterns = drawCardSavesC2.getPatterns();
                                ycc yccVarA = da9Var2.a();
                                List list = (List) yccVarA.a("camera_result_cards");
                                List list2 = (List) yccVarA.a("camera_result_reversed");
                                boolean zG2 = l46Var2.g(list);
                                Object objR9 = l46Var2.R();
                                if (zG2 || objR9 == i8cVar) {
                                    if (list != null) {
                                        arrayList = new ArrayList();
                                        int i10 = 0;
                                        for (Object obj20 : list) {
                                            int i11 = i10 + 1;
                                            if (i10 < 0) {
                                                t72.Z();
                                                throw null;
                                            }
                                            try {
                                                tarotCardChoice = new TarotCardChoice(TarotCardType.valueOf((String) obj20), (list2 == null || (bool = (Boolean) s72.y0(i10, list2)) == null) ? false : bool.booleanValue(), (String) null, 4, (rp3) null);
                                            } catch (Throwable th) {
                                                tarotCardChoice = new dzb(th);
                                            }
                                            boolean z5 = tarotCardChoice instanceof dzb;
                                            Object obj21 = tarotCardChoice;
                                            if (z5) {
                                                obj21 = null;
                                            }
                                            TarotCardChoice tarotCardChoice3 = (TarotCardChoice) obj21;
                                            if (tarotCardChoice3 != null) {
                                                arrayList.add(tarotCardChoice3);
                                            }
                                            i10 = i11;
                                        }
                                    } else {
                                        arrayList = null;
                                    }
                                    l46Var2.p0(arrayList);
                                    objR9 = arrayList;
                                }
                                List list3 = (List) objR9;
                                boolean zI6 = l46Var2.i(patterns);
                                Object objR10 = l46Var2.R();
                                Object obj22 = objR10;
                                if (zI6 || objR10 == i8cVar) {
                                    h53 h53Var = new h53(patterns, 4);
                                    l46Var2.p0(h53Var);
                                    obj22 = h53Var;
                                }
                                x16 x16Var4 = (x16) obj22;
                                pwf pwfVarA2 = qd8.a(l46Var2);
                                if (pwfVarA2 == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                final eda edaVar = (eda) z5c.G(job.a.b(eda.class), pwfVarA2.g(), null, b21.r(pwfVarA2), kr7.b(l46Var2), x16Var4);
                                int size = patterns.size();
                                int i12 = r0.j2;
                                int i13 = eda.e;
                                bp4.b(r0Var3, edaVar, size, l46Var2, 72);
                                boolean zF0 = r0Var3.f0();
                                String strG = r0Var3.G();
                                boolean zI7 = l46Var2.i(ka9Var4);
                                Object objR11 = l46Var2.R();
                                if (zI7 || objR11 == i8cVar) {
                                    objR11 = new a9(0, ka9Var4, ka9.class, "popBackStack", "popBackStack()Z", 8, 12);
                                    ka9Var = ka9Var4;
                                    l46Var2.p0(objR11);
                                } else {
                                    ka9Var = ka9Var4;
                                }
                                x16 x16Var5 = (x16) objR11;
                                boolean zI8 = l46Var2.i(ka9Var);
                                Object objR12 = l46Var2.R();
                                Object obj23 = objR12;
                                if (zI8 || objR12 == i8cVar) {
                                    u14 u14Var = new u14(ka9Var, 4);
                                    l46Var2.p0(u14Var);
                                    obj23 = u14Var;
                                }
                                l26 l26Var = (l26) obj23;
                                boolean zI9 = l46Var2.i(fo4Var2) | l46Var2.i(drawCardSavesC2) | l46Var2.i(edaVar);
                                Object objR13 = l46Var2.R();
                                Object obj24 = objR13;
                                if (zI9 || objR13 == i8cVar) {
                                    final int i14 = 1;
                                    a26 a26Var = new a26() { // from class: go4
                                        @Override // defpackage.a26
                                        public final Object d(Object obj25) {
                                            int i15 = i14;
                                            wef wefVar3 = wef.a;
                                            pu4 pu4Var = pu4.a;
                                            eda edaVar2 = edaVar;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC2;
                                            fo4 fo4Var4 = fo4Var2;
                                            List list4 = (List) obj25;
                                            switch (i15) {
                                                case 0:
                                                    list4.getClass();
                                                    ((dr2) fo4Var4).a(nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar2.c.a.getValue()).a, list4, pu4Var));
                                                    break;
                                                default:
                                                    list4.getClass();
                                                    ((dr2) fo4Var4).a(nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar2.c.a.getValue()).a, list4, pu4Var));
                                                    break;
                                            }
                                            return wefVar3;
                                        }
                                    };
                                    l46Var2.p0(a26Var);
                                    obj24 = a26Var;
                                }
                                a26 a26Var2 = (a26) obj24;
                                boolean zI10 = l46Var2.i(r0Var3) | l46Var2.i(drawCardSavesC2) | l46Var2.i(edaVar) | l46Var2.i(ka9Var);
                                Object objR14 = l46Var2.R();
                                if (zI10 || objR14 == i8cVar) {
                                    final int i15 = 1;
                                    final ka9 ka9Var5 = ka9Var;
                                    objR14 = new a26() { // from class: ho4
                                        @Override // defpackage.a26
                                        public final Object d(Object obj25) {
                                            int i16 = i15;
                                            wef wefVar3 = wef.a;
                                            pu4 pu4Var = pu4.a;
                                            ka9 ka9Var6 = ka9Var5;
                                            eda edaVar2 = edaVar;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC2;
                                            r0 r0Var4 = r0Var3;
                                            List list4 = (List) obj25;
                                            switch (i16) {
                                                case 0:
                                                    list4.getClass();
                                                    DrawCardSaves drawCardSavesB = nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar2.c.a.getValue()).a, list4, pu4Var);
                                                    r0Var4.getClass();
                                                    r0Var4.z1(drawCardSavesB);
                                                    ka9.e(ka9Var6, PostDrawInfoRoute.INSTANCE, null, 6);
                                                    break;
                                                default:
                                                    list4.getClass();
                                                    DrawCardSaves drawCardSavesB2 = nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar2.c.a.getValue()).a, list4, pu4Var);
                                                    r0Var4.getClass();
                                                    r0Var4.z1(drawCardSavesB2);
                                                    ka9.e(ka9Var6, PostDrawInfoRoute.INSTANCE, null, 6);
                                                    break;
                                            }
                                            return wefVar3;
                                        }
                                    };
                                    l46Var2.p0(objR14);
                                }
                                a26 a26Var3 = (a26) objR14;
                                boolean zI11 = l46Var2.i(yccVarA);
                                Object objR15 = l46Var2.R();
                                Object obj25 = objR15;
                                if (zI11 || objR15 == i8cVar) {
                                    io4 io4Var = new io4(yccVarA, 1);
                                    l46Var2.p0(io4Var);
                                    obj25 = io4Var;
                                }
                                vfh.i(pu4.a, patterns, l26Var, a26Var2, x16Var5, a26Var3, list3, (x16) obj25, false, false, zF0, strG, 0, l46Var2, 805306374, 4352);
                                return wefVar2;
                            case 2:
                                da9 da9Var3 = (da9) obj8;
                                l46 l46Var3 = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                da9Var3.getClass();
                                PhotoPatternRoute photoPatternRoute = (PhotoPatternRoute) vfh.S(da9Var3, job.a.b(PhotoPatternRoute.class));
                                int i16 = r0.j2;
                                final r0 r0Var4 = r0Var;
                                ka9 ka9Var6 = cb9Var2;
                                final DrawCardSaves drawCardSavesC3 = bp4.c(r0Var4, ka9Var6, l46Var3);
                                if (drawCardSavesC3 == null) {
                                    return wefVar2;
                                }
                                List<PatternData> patterns2 = drawCardSavesC3.getPatterns();
                                ycc yccVarA2 = da9Var3.a();
                                List list4 = (List) yccVarA2.a("camera_result_cards");
                                List list5 = (List) yccVarA2.a("camera_result_reversed");
                                boolean zG3 = l46Var3.g(list4);
                                Object objR16 = l46Var3.R();
                                if (zG3 || objR16 == i8cVar) {
                                    if (list4 != null) {
                                        arrayList2 = new ArrayList();
                                        int i17 = 0;
                                        for (Object obj26 : list4) {
                                            int i18 = i17 + 1;
                                            if (i17 < 0) {
                                                t72.Z();
                                                throw null;
                                            }
                                            try {
                                                tarotCardChoice2 = new TarotCardChoice(TarotCardType.valueOf((String) obj26), (list5 == null || (bool2 = (Boolean) s72.y0(i17, list5)) == null) ? false : bool2.booleanValue(), (String) null, 4, (rp3) null);
                                            } catch (Throwable th2) {
                                                tarotCardChoice2 = new dzb(th2);
                                            }
                                            boolean z6 = tarotCardChoice2 instanceof dzb;
                                            Object obj27 = tarotCardChoice2;
                                            if (z6) {
                                                obj27 = null;
                                            }
                                            TarotCardChoice tarotCardChoice4 = (TarotCardChoice) obj27;
                                            if (tarotCardChoice4 != null) {
                                                arrayList2.add(tarotCardChoice4);
                                            }
                                            list5 = list5;
                                            i17 = i18;
                                        }
                                    } else {
                                        arrayList2 = null;
                                    }
                                    l46Var3.p0(arrayList2);
                                    obj12 = arrayList2;
                                }
                                List list6 = (List) obj12;
                                boolean zI12 = l46Var3.i(photoPatternRoute) | l46Var3.i(patterns2);
                                Object objR17 = l46Var3.R();
                                Object obj28 = objR17;
                                if (zI12 || objR17 == i8cVar) {
                                    jt3 jt3Var = new jt3(11, photoPatternRoute, patterns2);
                                    l46Var3.p0(jt3Var);
                                    obj28 = jt3Var;
                                }
                                x16 x16Var6 = (x16) obj28;
                                pwf pwfVarA3 = qd8.a(l46Var3);
                                if (pwfVarA3 == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                final eda edaVar2 = (eda) z5c.G(job.a.b(eda.class), pwfVarA3.g(), null, b21.r(pwfVarA3), kr7.b(l46Var3), x16Var6);
                                int size2 = patterns2.size();
                                int i19 = r0.j2;
                                int i20 = eda.e;
                                bp4.b(r0Var4, edaVar2, size2, l46Var3, 72);
                                boolean zF1 = r0Var4.f0();
                                String strG2 = r0Var4.G();
                                List<TarotCardChoice> selectedTarotCards = photoPatternRoute.getSelectedTarotCards();
                                boolean zI13 = l46Var3.i(ka9Var6);
                                Object objR18 = l46Var3.R();
                                if (zI13 || objR18 == i8cVar) {
                                    a9 a9Var = new a9(0, ka9Var6, ka9.class, "popBackStack", "popBackStack()Z", 8, 9);
                                    ka9Var2 = ka9Var6;
                                    l46Var3.p0(a9Var);
                                    objR18 = a9Var;
                                } else {
                                    ka9Var2 = ka9Var6;
                                }
                                x16 x16Var7 = (x16) objR18;
                                boolean zI14 = l46Var3.i(ka9Var2);
                                Object objR19 = l46Var3.R();
                                Object obj29 = objR19;
                                if (zI14 || objR19 == i8cVar) {
                                    u14 u14Var2 = new u14(ka9Var2, 3);
                                    l46Var3.p0(u14Var2);
                                    obj29 = u14Var2;
                                }
                                l26 l26Var2 = (l26) obj29;
                                boolean zI15 = l46Var3.i(fo4Var2) | l46Var3.i(drawCardSavesC3) | l46Var3.i(edaVar2);
                                Object objR20 = l46Var3.R();
                                Object obj30 = objR20;
                                if (zI15 || objR20 == i8cVar) {
                                    final int i21 = 0;
                                    a26 a26Var4 = new a26() { // from class: go4
                                        @Override // defpackage.a26
                                        public final Object d(Object obj210) {
                                            int i110 = i21;
                                            wef wefVar3 = wef.a;
                                            pu4 pu4Var = pu4.a;
                                            eda edaVar3 = edaVar2;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC3;
                                            fo4 fo4Var4 = fo4Var2;
                                            List list7 = (List) obj210;
                                            switch (i110) {
                                                case 0:
                                                    list7.getClass();
                                                    ((dr2) fo4Var4).a(nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var));
                                                    break;
                                                default:
                                                    list7.getClass();
                                                    ((dr2) fo4Var4).a(nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var));
                                                    break;
                                            }
                                            return wefVar3;
                                        }
                                    };
                                    l46Var3.p0(a26Var4);
                                    obj30 = a26Var4;
                                }
                                a26 a26Var5 = (a26) obj30;
                                boolean zI16 = l46Var3.i(r0Var4) | l46Var3.i(drawCardSavesC3) | l46Var3.i(edaVar2) | l46Var3.i(ka9Var2);
                                Object objR21 = l46Var3.R();
                                Object obj31 = objR21;
                                if (zI16 || objR21 == i8cVar) {
                                    final int i22 = 0;
                                    final ka9 ka9Var7 = ka9Var2;
                                    a26 a26Var6 = new a26() { // from class: ho4
                                        @Override // defpackage.a26
                                        public final Object d(Object obj210) {
                                            int i110 = i22;
                                            wef wefVar3 = wef.a;
                                            pu4 pu4Var = pu4.a;
                                            ka9 ka9Var8 = ka9Var7;
                                            eda edaVar3 = edaVar2;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC3;
                                            r0 r0Var5 = r0Var4;
                                            List list7 = (List) obj210;
                                            switch (i110) {
                                                case 0:
                                                    list7.getClass();
                                                    DrawCardSaves drawCardSavesB = nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var);
                                                    r0Var5.getClass();
                                                    r0Var5.z1(drawCardSavesB);
                                                    ka9.e(ka9Var8, PostDrawInfoRoute.INSTANCE, null, 6);
                                                    break;
                                                default:
                                                    list7.getClass();
                                                    DrawCardSaves drawCardSavesB2 = nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var);
                                                    r0Var5.getClass();
                                                    r0Var5.z1(drawCardSavesB2);
                                                    ka9.e(ka9Var8, PostDrawInfoRoute.INSTANCE, null, 6);
                                                    break;
                                            }
                                            return wefVar3;
                                        }
                                    };
                                    l46Var3.p0(a26Var6);
                                    obj31 = a26Var6;
                                }
                                a26 a26Var7 = (a26) obj31;
                                boolean zI17 = l46Var3.i(yccVarA2);
                                Object objR22 = l46Var3.R();
                                Object obj32 = objR22;
                                if (zI17 || objR22 == i8cVar) {
                                    io4 io4Var2 = new io4(yccVarA2, 0);
                                    l46Var3.p0(io4Var2);
                                    obj32 = io4Var2;
                                }
                                vfh.i(selectedTarotCards, patterns2, l26Var2, a26Var5, x16Var7, a26Var7, list6, (x16) obj32, false, false, zF1, strG2, 0, l46Var3, 805306368, 4352);
                                return wefVar2;
                            default:
                                l46 l46Var4 = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                ((da9) obj8).getClass();
                                int i23 = r0.j2;
                                r0 r0Var5 = r0Var;
                                ka9 ka9Var8 = cb9Var2;
                                final DrawCardSaves drawCardSavesC4 = bp4.c(r0Var5, ka9Var8, l46Var4);
                                if (drawCardSavesC4 == null) {
                                    return wefVar2;
                                }
                                boolean zI18 = l46Var4.i(drawCardSavesC4);
                                Object objR23 = l46Var4.R();
                                if (zI18 || objR23 == i8cVar) {
                                    obj13 = objR23;
                                    final boolean z7 = z3 ? 1 : 0;
                                    x16 x16Var8 = new x16() { // from class: jo4
                                        @Override // defpackage.x16
                                        public final Object invoke() {
                                            int i24 = z7;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC4;
                                            switch (i24) {
                                                case 0:
                                                    return db6.A0(drawCardSaves3);
                                                default:
                                                    return db6.A0(drawCardSaves3.getChatId());
                                            }
                                        }
                                    };
                                    l46Var4.p0(x16Var8);
                                    obj13 = x16Var8;
                                }
                                x16 x16Var9 = (x16) obj13;
                                pwf pwfVarA4 = qd8.a(l46Var4);
                                if (pwfVarA4 == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                gy2 gy2VarR = b21.r(pwfVarA4);
                                nfc nfcVarB2 = kr7.b(l46Var4);
                                kob kobVar3 = job.a;
                                soa soaVar2 = (soa) z5c.G(kobVar3.b(soa.class), pwfVarA4.g(), null, gy2VarR, nfcVarB2, x16Var9);
                                nfc nfcVarB3 = kr7.b(l46Var4);
                                boolean zG4 = l46Var4.g(null) | l46Var4.g(nfcVarB3);
                                Object objR24 = l46Var4.R();
                                if (zG4 || objR24 == i8cVar) {
                                    objR24 = nfcVarB3.b(kobVar3.b(j4a.class), null, null);
                                    l46Var4.p0(objR24);
                                }
                                j4a j4aVar = (j4a) objR24;
                                boolean zI19 = l46Var4.i(r0Var5) | l46Var4.i(j4aVar) | l46Var4.i(soaVar2);
                                fo4 fo4Var4 = dr2Var;
                                boolean zI20 = zI19 | l46Var4.i(fo4Var4) | l46Var4.i(drawCardSavesC4);
                                Object objR25 = l46Var4.R();
                                if (zI20 || objR25 == i8cVar) {
                                    ro4 ro4Var = new ro4(r0Var5, j4aVar, soaVar2, fo4Var4, drawCardSavesC4, null);
                                    soaVar = soaVar2;
                                    fo4Var = fo4Var4;
                                    drawCardSaves = drawCardSavesC4;
                                    l46Var4.p0(ro4Var);
                                    objR25 = ro4Var;
                                } else {
                                    fo4Var = fo4Var4;
                                    drawCardSaves = drawCardSavesC4;
                                    soaVar = soaVar2;
                                }
                                af1.o((l26) objR25, l46Var4, wefVar2);
                                rx8.a(48, af1.b0(-613987671, new cm(soaVar, r0Var5, fo4Var, drawCardSaves, ka9Var8, 10), l46Var4), l46Var4, drawCardSaves.getMixedDeck() != null);
                                return wefVar2;
                        }
                    }
                }, true, 76468297));
                do7 do7Var = do7.c;
                yn7 yn7VarD = job.d(List.class, db6.b0(job.c(TarotCardChoice.class)));
                kaf kafVar = db6.g;
                rs0.o(za9Var, kobVar.b(ClarifyingCardDrawingRoute.class), bm8.G(new iy9(yn7VarD, kafVar)), null, null, null, null, new dd2(new o26() { // from class: oo4
                    @Override // defpackage.o26
                    public final Object t(Object obj7, Object obj8, Object obj9, Object obj10) {
                        String spreadId;
                        int i5 = i4;
                        wef wefVar2 = wef.a;
                        i8c i8cVar = sf2.a;
                        switch (i5) {
                            case 0:
                                da9 da9Var = (da9) obj8;
                                l46 l46Var = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                da9Var.getClass();
                                kob kobVar2 = job.a;
                                ClarifyingCardDrawingRoute clarifyingCardDrawingRoute = (ClarifyingCardDrawingRoute) vfh.S(da9Var, kobVar2.b(ClarifyingCardDrawingRoute.class));
                                boolean zI = l46Var.i(clarifyingCardDrawingRoute);
                                r0 r0Var2 = r0Var;
                                boolean zI2 = zI | l46Var.i(r0Var2);
                                Object objR = l46Var.R();
                                if (zI2 || objR == i8cVar) {
                                    objR = new jt3(12, clarifyingCardDrawingRoute, r0Var2);
                                    l46Var.p0(objR);
                                }
                                x16 x16Var = (x16) objR;
                                pwf pwfVarA = qd8.a(l46Var);
                                if (pwfVarA == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                r12 r12Var = (r12) z5c.G(kobVar2.b(r12.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var);
                                ArrayList arrayListD = r0Var2.D();
                                boolean zI3 = l46Var.i(r12Var) | l46Var.i(arrayListD);
                                Object objR2 = l46Var.R();
                                if (zI3 || objR2 == i8cVar) {
                                    objR2 = new yo4(r12Var, arrayListD, null);
                                    l46Var.p0(objR2);
                                }
                                af1.o((l26) objR2, l46Var, arrayListD);
                                x12 x12Var = (x12) cgg.s(r0Var2.R0).get(clarifyingCardDrawingRoute.getRequestMessageId());
                                SceneTarot sceneTarotV = r0Var2.V();
                                if ((sceneTarotV == null || (spreadId = sceneTarotV.getSpreadId()) == null) && (spreadId = r0Var2.y1) == null) {
                                    spreadId = "general";
                                }
                                w12 w12VarS = x12Var != null ? cgg.S(x12Var, new shb(spreadId, r0Var2.E())) : null;
                                String requestMessageId = clarifyingCardDrawingRoute.getRequestMessageId();
                                boolean zI4 = l46Var.i(w12VarS);
                                Object objR3 = l46Var.R();
                                if (zI4 || objR3 == i8cVar) {
                                    objR3 = new zo4(w12VarS, null);
                                    l46Var.p0(objR3);
                                }
                                af1.o((l26) objR3, l46Var, requestMessageId);
                                snd.a(r12Var.d, af1.b0(1015442303, new cm(r12Var, r0Var2, clarifyingCardDrawingRoute, cb9Var2, w12VarS, 9), l46Var), l46Var, MixedDeckSnapshot.$stable | 48);
                                return wefVar2;
                            default:
                                l46 l46Var2 = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                ((da9) obj8).getClass();
                                int i6 = r0.j2;
                                r0 r0Var3 = r0Var;
                                ka9 ka9Var = cb9Var2;
                                DrawCardSaves drawCardSavesC = bp4.c(r0Var3, ka9Var, l46Var2);
                                if (drawCardSavesC != null) {
                                    Integer numValueOf = Integer.valueOf(drawCardSavesC.getPatterns().size());
                                    boolean zI5 = l46Var2.i(ka9Var);
                                    Object objR4 = l46Var2.R();
                                    if (zI5 || objR4 == i8cVar) {
                                        objR4 = new z8(ka9Var, 9);
                                        l46Var2.p0(objR4);
                                    }
                                    a26 a26Var = (a26) objR4;
                                    boolean zI6 = l46Var2.i(ka9Var);
                                    Object objR5 = l46Var2.R();
                                    if (zI6 || objR5 == i8cVar) {
                                        objR5 = new a9(0, ka9Var, ka9.class, "popBackStack", "popBackStack()Z", 8, 10);
                                        l46Var2.p0(objR5);
                                    }
                                    qn4.h(numValueOf, a26Var, (x16) objR5, l46Var2, 0);
                                }
                                return wefVar2;
                        }
                    }
                }, true, -1964206808));
                rs0.t(za9Var, kobVar.b(OnSiteDialogRoute.class), new s84(false, false, 7), new dd2(new j41(r0Var, cb9Var2, hl4Var, 4), true, 2066012317));
                rs0.o(za9Var, kobVar.b(CameraPreviewRoute.class), qu4Var, null, null, null, null, new dd2(new o26() { // from class: oo4
                    @Override // defpackage.o26
                    public final Object t(Object obj7, Object obj8, Object obj9, Object obj10) {
                        String spreadId;
                        int i5 = i3;
                        wef wefVar2 = wef.a;
                        i8c i8cVar = sf2.a;
                        switch (i5) {
                            case 0:
                                da9 da9Var = (da9) obj8;
                                l46 l46Var = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                da9Var.getClass();
                                kob kobVar2 = job.a;
                                ClarifyingCardDrawingRoute clarifyingCardDrawingRoute = (ClarifyingCardDrawingRoute) vfh.S(da9Var, kobVar2.b(ClarifyingCardDrawingRoute.class));
                                boolean zI = l46Var.i(clarifyingCardDrawingRoute);
                                r0 r0Var2 = r0Var;
                                boolean zI2 = zI | l46Var.i(r0Var2);
                                Object objR = l46Var.R();
                                if (zI2 || objR == i8cVar) {
                                    objR = new jt3(12, clarifyingCardDrawingRoute, r0Var2);
                                    l46Var.p0(objR);
                                }
                                x16 x16Var = (x16) objR;
                                pwf pwfVarA = qd8.a(l46Var);
                                if (pwfVarA == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                r12 r12Var = (r12) z5c.G(kobVar2.b(r12.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var);
                                ArrayList arrayListD = r0Var2.D();
                                boolean zI3 = l46Var.i(r12Var) | l46Var.i(arrayListD);
                                Object objR2 = l46Var.R();
                                if (zI3 || objR2 == i8cVar) {
                                    objR2 = new yo4(r12Var, arrayListD, null);
                                    l46Var.p0(objR2);
                                }
                                af1.o((l26) objR2, l46Var, arrayListD);
                                x12 x12Var = (x12) cgg.s(r0Var2.R0).get(clarifyingCardDrawingRoute.getRequestMessageId());
                                SceneTarot sceneTarotV = r0Var2.V();
                                if ((sceneTarotV == null || (spreadId = sceneTarotV.getSpreadId()) == null) && (spreadId = r0Var2.y1) == null) {
                                    spreadId = "general";
                                }
                                w12 w12VarS = x12Var != null ? cgg.S(x12Var, new shb(spreadId, r0Var2.E())) : null;
                                String requestMessageId = clarifyingCardDrawingRoute.getRequestMessageId();
                                boolean zI4 = l46Var.i(w12VarS);
                                Object objR3 = l46Var.R();
                                if (zI4 || objR3 == i8cVar) {
                                    objR3 = new zo4(w12VarS, null);
                                    l46Var.p0(objR3);
                                }
                                af1.o((l26) objR3, l46Var, requestMessageId);
                                snd.a(r12Var.d, af1.b0(1015442303, new cm(r12Var, r0Var2, clarifyingCardDrawingRoute, cb9Var2, w12VarS, 9), l46Var), l46Var, MixedDeckSnapshot.$stable | 48);
                                return wefVar2;
                            default:
                                l46 l46Var2 = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                ((da9) obj8).getClass();
                                int i6 = r0.j2;
                                r0 r0Var3 = r0Var;
                                ka9 ka9Var = cb9Var2;
                                DrawCardSaves drawCardSavesC = bp4.c(r0Var3, ka9Var, l46Var2);
                                if (drawCardSavesC != null) {
                                    Integer numValueOf = Integer.valueOf(drawCardSavesC.getPatterns().size());
                                    boolean zI5 = l46Var2.i(ka9Var);
                                    Object objR4 = l46Var2.R();
                                    if (zI5 || objR4 == i8cVar) {
                                        objR4 = new z8(ka9Var, 9);
                                        l46Var2.p0(objR4);
                                    }
                                    a26 a26Var = (a26) objR4;
                                    boolean zI6 = l46Var2.i(ka9Var);
                                    Object objR5 = l46Var2.R();
                                    if (zI6 || objR5 == i8cVar) {
                                        objR5 = new a9(0, ka9Var, ka9.class, "popBackStack", "popBackStack()Z", 8, 10);
                                        l46Var2.p0(objR5);
                                    }
                                    qn4.h(numValueOf, a26Var, (x16) objR5, l46Var2, 0);
                                }
                                return wefVar2;
                        }
                    }
                }, true, 290085383));
                rs0.o(za9Var, kobVar.b(CardPickerRoute.class), bm8.G(new iy9(job.d(List.class, db6.b0(job.c(TarotCardChoice.class))), kafVar)), null, null, null, null, new dd2(new p93(r0Var, cb9Var2, hl4Var), true, -1750589722));
                rs0.o(za9Var, kobVar.b(EmptyPhotoPatternRoute.class), qu4Var, null, null, null, null, new dd2(new o26() { // from class: mo4
                    @Override // defpackage.o26
                    public final Object t(Object obj7, Object obj8, Object obj9, Object obj10) {
                        Object obj11;
                        ArrayList arrayList;
                        Object tarotCardChoice;
                        Boolean bool;
                        ka9 ka9Var;
                        ArrayList arrayList2;
                        Object tarotCardChoice2;
                        Boolean bool2;
                        Object obj12;
                        ka9 ka9Var2;
                        Object obj13;
                        soa soaVar;
                        fo4 fo4Var;
                        DrawCardSaves drawCardSaves;
                        int i5 = i3;
                        final fo4 fo4Var2 = dr2Var;
                        i8c i8cVar = sf2.a;
                        wef wefVar2 = wef.a;
                        boolean z3 = true;
                        switch (i5) {
                            case 0:
                                da9 da9Var = (da9) obj8;
                                l46 l46Var = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                da9Var.getClass();
                                kob kobVar2 = job.a;
                                UnifiedDrawingRoute unifiedDrawingRoute = (UnifiedDrawingRoute) vfh.S(da9Var, kobVar2.b(UnifiedDrawingRoute.class));
                                int i6 = r0.j2;
                                r0 r0Var2 = r0Var;
                                ka9 ka9Var3 = cb9Var2;
                                final DrawCardSaves drawCardSavesC = bp4.c(r0Var2, ka9Var3, l46Var);
                                if (drawCardSavesC == null) {
                                    return wefVar2;
                                }
                                boolean zI = l46Var.i(drawCardSavesC);
                                Object objR = l46Var.R();
                                if (zI || objR == i8cVar) {
                                    obj11 = objR;
                                    final int i7 = 0;
                                    x16 x16Var = new x16() { // from class: jo4
                                        @Override // defpackage.x16
                                        public final Object invoke() {
                                            int i24 = i7;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC;
                                            switch (i24) {
                                                case 0:
                                                    return db6.A0(drawCardSaves3);
                                                default:
                                                    return db6.A0(drawCardSaves3.getChatId());
                                            }
                                        }
                                    };
                                    l46Var.p0(x16Var);
                                    obj11 = x16Var;
                                }
                                x16 x16Var2 = (x16) obj11;
                                pwf pwfVarA = qd8.a(l46Var);
                                if (pwfVarA == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                rcf rcfVar = (rcf) z5c.G(kobVar2.b(rcf.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var2);
                                nfc nfcVarB = kr7.b(l46Var);
                                boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
                                Object objR2 = l46Var.R();
                                if (zG || objR2 == i8cVar) {
                                    objR2 = nfcVarB.b(kobVar2.b(fcb.class), null, null);
                                    l46Var.p0(objR2);
                                }
                                fcb fcbVar = (fcb) objR2;
                                Object objR3 = l46Var.R();
                                Object obj14 = objR3;
                                if (objR3 == i8cVar) {
                                    vz9 vz9VarF = q1c.f(null);
                                    l46Var.p0(vz9VarF);
                                    obj14 = vz9VarF;
                                }
                                e89 e89Var2 = (e89) obj14;
                                boolean zI2 = l46Var.i(r0Var2) | l46Var.i(rcfVar);
                                Object objR4 = l46Var.R();
                                Object obj15 = objR4;
                                if (zI2 || objR4 == i8cVar) {
                                    uo4 uo4Var = new uo4(null, rcfVar, r0Var2);
                                    l46Var.p0(uo4Var);
                                    obj15 = uo4Var;
                                }
                                af1.o((l26) obj15, l46Var, wefVar2);
                                boolean zI3 = l46Var.i(rcfVar) | l46Var.i(r0Var2);
                                Object objR5 = l46Var.R();
                                Object obj16 = objR5;
                                if (zI3 || objR5 == i8cVar) {
                                    wo4 wo4Var = new wo4(null, rcfVar, r0Var2);
                                    l46Var.p0(wo4Var);
                                    obj16 = wo4Var;
                                }
                                int i8 = rcf.x;
                                af1.o((l26) obj16, l46Var, rcfVar);
                                Boolean boolValueOf = Boolean.valueOf(r0Var2.m0());
                                boolean zI4 = l46Var.i(r0Var2) | l46Var.i(rcfVar);
                                Object objR6 = l46Var.R();
                                Object obj17 = objR6;
                                if (zI4 || objR6 == i8cVar) {
                                    xo4 xo4Var = new xo4(null, rcfVar, r0Var2);
                                    l46Var.p0(xo4Var);
                                    obj17 = xo4Var;
                                }
                                af1.o((l26) obj17, l46Var, boolValueOf);
                                MixedDeckSnapshot mixedDeckSnapshot = (MixedDeckSnapshot) rcfVar.c.getValue();
                                fo4 fo4Var3 = dr2Var;
                                snd.a(mixedDeckSnapshot, af1.b0(-1238849888, new ko4(rcfVar, r0Var2, unifiedDrawingRoute, fcbVar, ka9Var3, fo4Var3, e89Var2, 0), l46Var), l46Var, 48 | MixedDeckSnapshot.$stable);
                                DrawCardSaves drawCardSaves2 = (DrawCardSaves) e89Var2.getValue();
                                boolean z4 = !r0Var2.g0() || rcfVar.k() || (r0Var2.q0() && !rcfVar.f.isEmpty());
                                Object objR7 = l46Var.R();
                                Object obj18 = objR7;
                                if (objR7 == i8cVar) {
                                    ok3 ok3Var = new ok3(e89Var2, 13);
                                    l46Var.p0(ok3Var);
                                    obj18 = ok3Var;
                                }
                                x16 x16Var3 = (x16) obj18;
                                boolean zI5 = l46Var.i(r0Var2) | l46Var.i(fo4Var3);
                                Object objR8 = l46Var.R();
                                Object obj19 = objR8;
                                if (zI5 || objR8 == i8cVar) {
                                    lo4 lo4Var = new lo4(r0Var2, fo4Var3, 0);
                                    l46Var.p0(lo4Var);
                                    obj19 = lo4Var;
                                }
                                bp4.a(drawCardSaves2, z4, x16Var3, (a26) obj19, l46Var, DrawCardSaves.$stable | 384, 0);
                                return wefVar2;
                            case 1:
                                da9 da9Var2 = (da9) obj8;
                                l46 l46Var2 = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                da9Var2.getClass();
                                int i9 = r0.j2;
                                final r0 r0Var3 = r0Var;
                                ka9 ka9Var4 = cb9Var2;
                                final DrawCardSaves drawCardSavesC2 = bp4.c(r0Var3, ka9Var4, l46Var2);
                                if (drawCardSavesC2 == null) {
                                    return wefVar2;
                                }
                                List<PatternData> patterns = drawCardSavesC2.getPatterns();
                                ycc yccVarA = da9Var2.a();
                                List list = (List) yccVarA.a("camera_result_cards");
                                List list2 = (List) yccVarA.a("camera_result_reversed");
                                boolean zG2 = l46Var2.g(list);
                                Object objR9 = l46Var2.R();
                                if (zG2 || objR9 == i8cVar) {
                                    if (list != null) {
                                        arrayList = new ArrayList();
                                        int i10 = 0;
                                        for (Object obj20 : list) {
                                            int i11 = i10 + 1;
                                            if (i10 < 0) {
                                                t72.Z();
                                                throw null;
                                            }
                                            try {
                                                tarotCardChoice = new TarotCardChoice(TarotCardType.valueOf((String) obj20), (list2 == null || (bool = (Boolean) s72.y0(i10, list2)) == null) ? false : bool.booleanValue(), (String) null, 4, (rp3) null);
                                            } catch (Throwable th) {
                                                tarotCardChoice = new dzb(th);
                                            }
                                            boolean z5 = tarotCardChoice instanceof dzb;
                                            Object obj21 = tarotCardChoice;
                                            if (z5) {
                                                obj21 = null;
                                            }
                                            TarotCardChoice tarotCardChoice3 = (TarotCardChoice) obj21;
                                            if (tarotCardChoice3 != null) {
                                                arrayList.add(tarotCardChoice3);
                                            }
                                            i10 = i11;
                                        }
                                    } else {
                                        arrayList = null;
                                    }
                                    l46Var2.p0(arrayList);
                                    objR9 = arrayList;
                                }
                                List list3 = (List) objR9;
                                boolean zI6 = l46Var2.i(patterns);
                                Object objR10 = l46Var2.R();
                                Object obj22 = objR10;
                                if (zI6 || objR10 == i8cVar) {
                                    h53 h53Var = new h53(patterns, 4);
                                    l46Var2.p0(h53Var);
                                    obj22 = h53Var;
                                }
                                x16 x16Var4 = (x16) obj22;
                                pwf pwfVarA2 = qd8.a(l46Var2);
                                if (pwfVarA2 == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                final eda edaVar = (eda) z5c.G(job.a.b(eda.class), pwfVarA2.g(), null, b21.r(pwfVarA2), kr7.b(l46Var2), x16Var4);
                                int size = patterns.size();
                                int i12 = r0.j2;
                                int i13 = eda.e;
                                bp4.b(r0Var3, edaVar, size, l46Var2, 72);
                                boolean zF0 = r0Var3.f0();
                                String strG = r0Var3.G();
                                boolean zI7 = l46Var2.i(ka9Var4);
                                Object objR11 = l46Var2.R();
                                if (zI7 || objR11 == i8cVar) {
                                    objR11 = new a9(0, ka9Var4, ka9.class, "popBackStack", "popBackStack()Z", 8, 12);
                                    ka9Var = ka9Var4;
                                    l46Var2.p0(objR11);
                                } else {
                                    ka9Var = ka9Var4;
                                }
                                x16 x16Var5 = (x16) objR11;
                                boolean zI8 = l46Var2.i(ka9Var);
                                Object objR12 = l46Var2.R();
                                Object obj23 = objR12;
                                if (zI8 || objR12 == i8cVar) {
                                    u14 u14Var = new u14(ka9Var, 4);
                                    l46Var2.p0(u14Var);
                                    obj23 = u14Var;
                                }
                                l26 l26Var = (l26) obj23;
                                boolean zI9 = l46Var2.i(fo4Var2) | l46Var2.i(drawCardSavesC2) | l46Var2.i(edaVar);
                                Object objR13 = l46Var2.R();
                                Object obj24 = objR13;
                                if (zI9 || objR13 == i8cVar) {
                                    final int i14 = 1;
                                    a26 a26Var = new a26() { // from class: go4
                                        @Override // defpackage.a26
                                        public final Object d(Object obj210) {
                                            int i110 = i14;
                                            wef wefVar3 = wef.a;
                                            pu4 pu4Var = pu4.a;
                                            eda edaVar3 = edaVar;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC2;
                                            fo4 fo4Var4 = fo4Var2;
                                            List list7 = (List) obj210;
                                            switch (i110) {
                                                case 0:
                                                    list7.getClass();
                                                    ((dr2) fo4Var4).a(nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var));
                                                    break;
                                                default:
                                                    list7.getClass();
                                                    ((dr2) fo4Var4).a(nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var));
                                                    break;
                                            }
                                            return wefVar3;
                                        }
                                    };
                                    l46Var2.p0(a26Var);
                                    obj24 = a26Var;
                                }
                                a26 a26Var2 = (a26) obj24;
                                boolean zI10 = l46Var2.i(r0Var3) | l46Var2.i(drawCardSavesC2) | l46Var2.i(edaVar) | l46Var2.i(ka9Var);
                                Object objR14 = l46Var2.R();
                                if (zI10 || objR14 == i8cVar) {
                                    final int i15 = 1;
                                    final ka9 ka9Var5 = ka9Var;
                                    objR14 = new a26() { // from class: ho4
                                        @Override // defpackage.a26
                                        public final Object d(Object obj210) {
                                            int i110 = i15;
                                            wef wefVar3 = wef.a;
                                            pu4 pu4Var = pu4.a;
                                            ka9 ka9Var8 = ka9Var5;
                                            eda edaVar3 = edaVar;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC2;
                                            r0 r0Var5 = r0Var3;
                                            List list7 = (List) obj210;
                                            switch (i110) {
                                                case 0:
                                                    list7.getClass();
                                                    DrawCardSaves drawCardSavesB = nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var);
                                                    r0Var5.getClass();
                                                    r0Var5.z1(drawCardSavesB);
                                                    ka9.e(ka9Var8, PostDrawInfoRoute.INSTANCE, null, 6);
                                                    break;
                                                default:
                                                    list7.getClass();
                                                    DrawCardSaves drawCardSavesB2 = nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var);
                                                    r0Var5.getClass();
                                                    r0Var5.z1(drawCardSavesB2);
                                                    ka9.e(ka9Var8, PostDrawInfoRoute.INSTANCE, null, 6);
                                                    break;
                                            }
                                            return wefVar3;
                                        }
                                    };
                                    l46Var2.p0(objR14);
                                }
                                a26 a26Var3 = (a26) objR14;
                                boolean zI11 = l46Var2.i(yccVarA);
                                Object objR15 = l46Var2.R();
                                Object obj25 = objR15;
                                if (zI11 || objR15 == i8cVar) {
                                    io4 io4Var = new io4(yccVarA, 1);
                                    l46Var2.p0(io4Var);
                                    obj25 = io4Var;
                                }
                                vfh.i(pu4.a, patterns, l26Var, a26Var2, x16Var5, a26Var3, list3, (x16) obj25, false, false, zF0, strG, 0, l46Var2, 805306374, 4352);
                                return wefVar2;
                            case 2:
                                da9 da9Var3 = (da9) obj8;
                                l46 l46Var3 = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                da9Var3.getClass();
                                PhotoPatternRoute photoPatternRoute = (PhotoPatternRoute) vfh.S(da9Var3, job.a.b(PhotoPatternRoute.class));
                                int i16 = r0.j2;
                                final r0 r0Var4 = r0Var;
                                ka9 ka9Var6 = cb9Var2;
                                final DrawCardSaves drawCardSavesC3 = bp4.c(r0Var4, ka9Var6, l46Var3);
                                if (drawCardSavesC3 == null) {
                                    return wefVar2;
                                }
                                List<PatternData> patterns2 = drawCardSavesC3.getPatterns();
                                ycc yccVarA2 = da9Var3.a();
                                List list4 = (List) yccVarA2.a("camera_result_cards");
                                List list5 = (List) yccVarA2.a("camera_result_reversed");
                                boolean zG3 = l46Var3.g(list4);
                                Object objR16 = l46Var3.R();
                                if (zG3 || objR16 == i8cVar) {
                                    if (list4 != null) {
                                        arrayList2 = new ArrayList();
                                        int i17 = 0;
                                        for (Object obj26 : list4) {
                                            int i18 = i17 + 1;
                                            if (i17 < 0) {
                                                t72.Z();
                                                throw null;
                                            }
                                            try {
                                                tarotCardChoice2 = new TarotCardChoice(TarotCardType.valueOf((String) obj26), (list5 == null || (bool2 = (Boolean) s72.y0(i17, list5)) == null) ? false : bool2.booleanValue(), (String) null, 4, (rp3) null);
                                            } catch (Throwable th2) {
                                                tarotCardChoice2 = new dzb(th2);
                                            }
                                            boolean z6 = tarotCardChoice2 instanceof dzb;
                                            Object obj27 = tarotCardChoice2;
                                            if (z6) {
                                                obj27 = null;
                                            }
                                            TarotCardChoice tarotCardChoice4 = (TarotCardChoice) obj27;
                                            if (tarotCardChoice4 != null) {
                                                arrayList2.add(tarotCardChoice4);
                                            }
                                            list5 = list5;
                                            i17 = i18;
                                        }
                                    } else {
                                        arrayList2 = null;
                                    }
                                    l46Var3.p0(arrayList2);
                                    obj12 = arrayList2;
                                }
                                List list6 = (List) obj12;
                                boolean zI12 = l46Var3.i(photoPatternRoute) | l46Var3.i(patterns2);
                                Object objR17 = l46Var3.R();
                                Object obj28 = objR17;
                                if (zI12 || objR17 == i8cVar) {
                                    jt3 jt3Var = new jt3(11, photoPatternRoute, patterns2);
                                    l46Var3.p0(jt3Var);
                                    obj28 = jt3Var;
                                }
                                x16 x16Var6 = (x16) obj28;
                                pwf pwfVarA3 = qd8.a(l46Var3);
                                if (pwfVarA3 == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                final eda edaVar2 = (eda) z5c.G(job.a.b(eda.class), pwfVarA3.g(), null, b21.r(pwfVarA3), kr7.b(l46Var3), x16Var6);
                                int size2 = patterns2.size();
                                int i19 = r0.j2;
                                int i20 = eda.e;
                                bp4.b(r0Var4, edaVar2, size2, l46Var3, 72);
                                boolean zF1 = r0Var4.f0();
                                String strG2 = r0Var4.G();
                                List<TarotCardChoice> selectedTarotCards = photoPatternRoute.getSelectedTarotCards();
                                boolean zI13 = l46Var3.i(ka9Var6);
                                Object objR18 = l46Var3.R();
                                if (zI13 || objR18 == i8cVar) {
                                    a9 a9Var = new a9(0, ka9Var6, ka9.class, "popBackStack", "popBackStack()Z", 8, 9);
                                    ka9Var2 = ka9Var6;
                                    l46Var3.p0(a9Var);
                                    objR18 = a9Var;
                                } else {
                                    ka9Var2 = ka9Var6;
                                }
                                x16 x16Var7 = (x16) objR18;
                                boolean zI14 = l46Var3.i(ka9Var2);
                                Object objR19 = l46Var3.R();
                                Object obj29 = objR19;
                                if (zI14 || objR19 == i8cVar) {
                                    u14 u14Var2 = new u14(ka9Var2, 3);
                                    l46Var3.p0(u14Var2);
                                    obj29 = u14Var2;
                                }
                                l26 l26Var2 = (l26) obj29;
                                boolean zI15 = l46Var3.i(fo4Var2) | l46Var3.i(drawCardSavesC3) | l46Var3.i(edaVar2);
                                Object objR20 = l46Var3.R();
                                Object obj30 = objR20;
                                if (zI15 || objR20 == i8cVar) {
                                    final int i21 = 0;
                                    a26 a26Var4 = new a26() { // from class: go4
                                        @Override // defpackage.a26
                                        public final Object d(Object obj210) {
                                            int i110 = i21;
                                            wef wefVar3 = wef.a;
                                            pu4 pu4Var = pu4.a;
                                            eda edaVar3 = edaVar2;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC3;
                                            fo4 fo4Var4 = fo4Var2;
                                            List list7 = (List) obj210;
                                            switch (i110) {
                                                case 0:
                                                    list7.getClass();
                                                    ((dr2) fo4Var4).a(nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var));
                                                    break;
                                                default:
                                                    list7.getClass();
                                                    ((dr2) fo4Var4).a(nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var));
                                                    break;
                                            }
                                            return wefVar3;
                                        }
                                    };
                                    l46Var3.p0(a26Var4);
                                    obj30 = a26Var4;
                                }
                                a26 a26Var5 = (a26) obj30;
                                boolean zI16 = l46Var3.i(r0Var4) | l46Var3.i(drawCardSavesC3) | l46Var3.i(edaVar2) | l46Var3.i(ka9Var2);
                                Object objR21 = l46Var3.R();
                                Object obj31 = objR21;
                                if (zI16 || objR21 == i8cVar) {
                                    final int i22 = 0;
                                    final ka9 ka9Var7 = ka9Var2;
                                    a26 a26Var6 = new a26() { // from class: ho4
                                        @Override // defpackage.a26
                                        public final Object d(Object obj210) {
                                            int i110 = i22;
                                            wef wefVar3 = wef.a;
                                            pu4 pu4Var = pu4.a;
                                            ka9 ka9Var8 = ka9Var7;
                                            eda edaVar3 = edaVar2;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC3;
                                            r0 r0Var5 = r0Var4;
                                            List list7 = (List) obj210;
                                            switch (i110) {
                                                case 0:
                                                    list7.getClass();
                                                    DrawCardSaves drawCardSavesB = nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var);
                                                    r0Var5.getClass();
                                                    r0Var5.z1(drawCardSavesB);
                                                    ka9.e(ka9Var8, PostDrawInfoRoute.INSTANCE, null, 6);
                                                    break;
                                                default:
                                                    list7.getClass();
                                                    DrawCardSaves drawCardSavesB2 = nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var);
                                                    r0Var5.getClass();
                                                    r0Var5.z1(drawCardSavesB2);
                                                    ka9.e(ka9Var8, PostDrawInfoRoute.INSTANCE, null, 6);
                                                    break;
                                            }
                                            return wefVar3;
                                        }
                                    };
                                    l46Var3.p0(a26Var6);
                                    obj31 = a26Var6;
                                }
                                a26 a26Var7 = (a26) obj31;
                                boolean zI17 = l46Var3.i(yccVarA2);
                                Object objR22 = l46Var3.R();
                                Object obj32 = objR22;
                                if (zI17 || objR22 == i8cVar) {
                                    io4 io4Var2 = new io4(yccVarA2, 0);
                                    l46Var3.p0(io4Var2);
                                    obj32 = io4Var2;
                                }
                                vfh.i(selectedTarotCards, patterns2, l26Var2, a26Var5, x16Var7, a26Var7, list6, (x16) obj32, false, false, zF1, strG2, 0, l46Var3, 805306368, 4352);
                                return wefVar2;
                            default:
                                l46 l46Var4 = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                ((da9) obj8).getClass();
                                int i23 = r0.j2;
                                r0 r0Var5 = r0Var;
                                ka9 ka9Var8 = cb9Var2;
                                final DrawCardSaves drawCardSavesC4 = bp4.c(r0Var5, ka9Var8, l46Var4);
                                if (drawCardSavesC4 == null) {
                                    return wefVar2;
                                }
                                boolean zI18 = l46Var4.i(drawCardSavesC4);
                                Object objR23 = l46Var4.R();
                                if (zI18 || objR23 == i8cVar) {
                                    obj13 = objR23;
                                    final int z7 = z3 ? 1 : 0;
                                    x16 x16Var8 = new x16() { // from class: jo4
                                        @Override // defpackage.x16
                                        public final Object invoke() {
                                            int i24 = z7;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC4;
                                            switch (i24) {
                                                case 0:
                                                    return db6.A0(drawCardSaves3);
                                                default:
                                                    return db6.A0(drawCardSaves3.getChatId());
                                            }
                                        }
                                    };
                                    l46Var4.p0(x16Var8);
                                    obj13 = x16Var8;
                                }
                                x16 x16Var9 = (x16) obj13;
                                pwf pwfVarA4 = qd8.a(l46Var4);
                                if (pwfVarA4 == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                gy2 gy2VarR = b21.r(pwfVarA4);
                                nfc nfcVarB2 = kr7.b(l46Var4);
                                kob kobVar3 = job.a;
                                soa soaVar2 = (soa) z5c.G(kobVar3.b(soa.class), pwfVarA4.g(), null, gy2VarR, nfcVarB2, x16Var9);
                                nfc nfcVarB3 = kr7.b(l46Var4);
                                boolean zG4 = l46Var4.g(null) | l46Var4.g(nfcVarB3);
                                Object objR24 = l46Var4.R();
                                if (zG4 || objR24 == i8cVar) {
                                    objR24 = nfcVarB3.b(kobVar3.b(j4a.class), null, null);
                                    l46Var4.p0(objR24);
                                }
                                j4a j4aVar = (j4a) objR24;
                                boolean zI19 = l46Var4.i(r0Var5) | l46Var4.i(j4aVar) | l46Var4.i(soaVar2);
                                fo4 fo4Var4 = dr2Var;
                                boolean zI20 = zI19 | l46Var4.i(fo4Var4) | l46Var4.i(drawCardSavesC4);
                                Object objR25 = l46Var4.R();
                                if (zI20 || objR25 == i8cVar) {
                                    ro4 ro4Var = new ro4(r0Var5, j4aVar, soaVar2, fo4Var4, drawCardSavesC4, null);
                                    soaVar = soaVar2;
                                    fo4Var = fo4Var4;
                                    drawCardSaves = drawCardSavesC4;
                                    l46Var4.p0(ro4Var);
                                    objR25 = ro4Var;
                                } else {
                                    fo4Var = fo4Var4;
                                    drawCardSaves = drawCardSavesC4;
                                    soaVar = soaVar2;
                                }
                                af1.o((l26) objR25, l46Var4, wefVar2);
                                rx8.a(48, af1.b0(-613987671, new cm(soaVar, r0Var5, fo4Var, drawCardSaves, ka9Var8, 10), l46Var4), l46Var4, drawCardSaves.getMixedDeck() != null);
                                return wefVar2;
                        }
                    }
                }, true, 503702469));
                final int i5 = 2;
                rs0.o(za9Var, kobVar.b(PhotoPatternRoute.class), bm8.G(new iy9(job.d(List.class, db6.b0(job.c(TarotCardChoice.class))), kafVar)), null, null, null, null, new dd2(new o26() { // from class: mo4
                    @Override // defpackage.o26
                    public final Object t(Object obj7, Object obj8, Object obj9, Object obj10) {
                        Object obj11;
                        ArrayList arrayList;
                        Object tarotCardChoice;
                        Boolean bool;
                        ka9 ka9Var;
                        ArrayList arrayList2;
                        Object tarotCardChoice2;
                        Boolean bool2;
                        Object obj12;
                        ka9 ka9Var2;
                        Object obj13;
                        soa soaVar;
                        fo4 fo4Var;
                        DrawCardSaves drawCardSaves;
                        int i6 = i5;
                        final fo4 fo4Var2 = dr2Var;
                        i8c i8cVar = sf2.a;
                        wef wefVar2 = wef.a;
                        boolean z3 = true;
                        switch (i6) {
                            case 0:
                                da9 da9Var = (da9) obj8;
                                l46 l46Var = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                da9Var.getClass();
                                kob kobVar2 = job.a;
                                UnifiedDrawingRoute unifiedDrawingRoute = (UnifiedDrawingRoute) vfh.S(da9Var, kobVar2.b(UnifiedDrawingRoute.class));
                                int i7 = r0.j2;
                                r0 r0Var2 = r0Var;
                                ka9 ka9Var3 = cb9Var2;
                                final DrawCardSaves drawCardSavesC = bp4.c(r0Var2, ka9Var3, l46Var);
                                if (drawCardSavesC == null) {
                                    return wefVar2;
                                }
                                boolean zI = l46Var.i(drawCardSavesC);
                                Object objR = l46Var.R();
                                if (zI || objR == i8cVar) {
                                    obj11 = objR;
                                    final int i8 = 0;
                                    x16 x16Var = new x16() { // from class: jo4
                                        @Override // defpackage.x16
                                        public final Object invoke() {
                                            int i24 = i8;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC;
                                            switch (i24) {
                                                case 0:
                                                    return db6.A0(drawCardSaves3);
                                                default:
                                                    return db6.A0(drawCardSaves3.getChatId());
                                            }
                                        }
                                    };
                                    l46Var.p0(x16Var);
                                    obj11 = x16Var;
                                }
                                x16 x16Var2 = (x16) obj11;
                                pwf pwfVarA = qd8.a(l46Var);
                                if (pwfVarA == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                rcf rcfVar = (rcf) z5c.G(kobVar2.b(rcf.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var2);
                                nfc nfcVarB = kr7.b(l46Var);
                                boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
                                Object objR2 = l46Var.R();
                                if (zG || objR2 == i8cVar) {
                                    objR2 = nfcVarB.b(kobVar2.b(fcb.class), null, null);
                                    l46Var.p0(objR2);
                                }
                                fcb fcbVar = (fcb) objR2;
                                Object objR3 = l46Var.R();
                                Object obj14 = objR3;
                                if (objR3 == i8cVar) {
                                    vz9 vz9VarF = q1c.f(null);
                                    l46Var.p0(vz9VarF);
                                    obj14 = vz9VarF;
                                }
                                e89 e89Var2 = (e89) obj14;
                                boolean zI2 = l46Var.i(r0Var2) | l46Var.i(rcfVar);
                                Object objR4 = l46Var.R();
                                Object obj15 = objR4;
                                if (zI2 || objR4 == i8cVar) {
                                    uo4 uo4Var = new uo4(null, rcfVar, r0Var2);
                                    l46Var.p0(uo4Var);
                                    obj15 = uo4Var;
                                }
                                af1.o((l26) obj15, l46Var, wefVar2);
                                boolean zI3 = l46Var.i(rcfVar) | l46Var.i(r0Var2);
                                Object objR5 = l46Var.R();
                                Object obj16 = objR5;
                                if (zI3 || objR5 == i8cVar) {
                                    wo4 wo4Var = new wo4(null, rcfVar, r0Var2);
                                    l46Var.p0(wo4Var);
                                    obj16 = wo4Var;
                                }
                                int i9 = rcf.x;
                                af1.o((l26) obj16, l46Var, rcfVar);
                                Boolean boolValueOf = Boolean.valueOf(r0Var2.m0());
                                boolean zI4 = l46Var.i(r0Var2) | l46Var.i(rcfVar);
                                Object objR6 = l46Var.R();
                                Object obj17 = objR6;
                                if (zI4 || objR6 == i8cVar) {
                                    xo4 xo4Var = new xo4(null, rcfVar, r0Var2);
                                    l46Var.p0(xo4Var);
                                    obj17 = xo4Var;
                                }
                                af1.o((l26) obj17, l46Var, boolValueOf);
                                MixedDeckSnapshot mixedDeckSnapshot = (MixedDeckSnapshot) rcfVar.c.getValue();
                                fo4 fo4Var3 = dr2Var;
                                snd.a(mixedDeckSnapshot, af1.b0(-1238849888, new ko4(rcfVar, r0Var2, unifiedDrawingRoute, fcbVar, ka9Var3, fo4Var3, e89Var2, 0), l46Var), l46Var, 48 | MixedDeckSnapshot.$stable);
                                DrawCardSaves drawCardSaves2 = (DrawCardSaves) e89Var2.getValue();
                                boolean z4 = !r0Var2.g0() || rcfVar.k() || (r0Var2.q0() && !rcfVar.f.isEmpty());
                                Object objR7 = l46Var.R();
                                Object obj18 = objR7;
                                if (objR7 == i8cVar) {
                                    ok3 ok3Var = new ok3(e89Var2, 13);
                                    l46Var.p0(ok3Var);
                                    obj18 = ok3Var;
                                }
                                x16 x16Var3 = (x16) obj18;
                                boolean zI5 = l46Var.i(r0Var2) | l46Var.i(fo4Var3);
                                Object objR8 = l46Var.R();
                                Object obj19 = objR8;
                                if (zI5 || objR8 == i8cVar) {
                                    lo4 lo4Var = new lo4(r0Var2, fo4Var3, 0);
                                    l46Var.p0(lo4Var);
                                    obj19 = lo4Var;
                                }
                                bp4.a(drawCardSaves2, z4, x16Var3, (a26) obj19, l46Var, DrawCardSaves.$stable | 384, 0);
                                return wefVar2;
                            case 1:
                                da9 da9Var2 = (da9) obj8;
                                l46 l46Var2 = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                da9Var2.getClass();
                                int i10 = r0.j2;
                                final r0 r0Var3 = r0Var;
                                ka9 ka9Var4 = cb9Var2;
                                final DrawCardSaves drawCardSavesC2 = bp4.c(r0Var3, ka9Var4, l46Var2);
                                if (drawCardSavesC2 == null) {
                                    return wefVar2;
                                }
                                List<PatternData> patterns = drawCardSavesC2.getPatterns();
                                ycc yccVarA = da9Var2.a();
                                List list = (List) yccVarA.a("camera_result_cards");
                                List list2 = (List) yccVarA.a("camera_result_reversed");
                                boolean zG2 = l46Var2.g(list);
                                Object objR9 = l46Var2.R();
                                if (zG2 || objR9 == i8cVar) {
                                    if (list != null) {
                                        arrayList = new ArrayList();
                                        int i11 = 0;
                                        for (Object obj20 : list) {
                                            int i12 = i11 + 1;
                                            if (i11 < 0) {
                                                t72.Z();
                                                throw null;
                                            }
                                            try {
                                                tarotCardChoice = new TarotCardChoice(TarotCardType.valueOf((String) obj20), (list2 == null || (bool = (Boolean) s72.y0(i11, list2)) == null) ? false : bool.booleanValue(), (String) null, 4, (rp3) null);
                                            } catch (Throwable th) {
                                                tarotCardChoice = new dzb(th);
                                            }
                                            boolean z5 = tarotCardChoice instanceof dzb;
                                            Object obj21 = tarotCardChoice;
                                            if (z5) {
                                                obj21 = null;
                                            }
                                            TarotCardChoice tarotCardChoice3 = (TarotCardChoice) obj21;
                                            if (tarotCardChoice3 != null) {
                                                arrayList.add(tarotCardChoice3);
                                            }
                                            i11 = i12;
                                        }
                                    } else {
                                        arrayList = null;
                                    }
                                    l46Var2.p0(arrayList);
                                    objR9 = arrayList;
                                }
                                List list3 = (List) objR9;
                                boolean zI6 = l46Var2.i(patterns);
                                Object objR10 = l46Var2.R();
                                Object obj22 = objR10;
                                if (zI6 || objR10 == i8cVar) {
                                    h53 h53Var = new h53(patterns, 4);
                                    l46Var2.p0(h53Var);
                                    obj22 = h53Var;
                                }
                                x16 x16Var4 = (x16) obj22;
                                pwf pwfVarA2 = qd8.a(l46Var2);
                                if (pwfVarA2 == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                final eda edaVar = (eda) z5c.G(job.a.b(eda.class), pwfVarA2.g(), null, b21.r(pwfVarA2), kr7.b(l46Var2), x16Var4);
                                int size = patterns.size();
                                int i13 = r0.j2;
                                int i14 = eda.e;
                                bp4.b(r0Var3, edaVar, size, l46Var2, 72);
                                boolean zF0 = r0Var3.f0();
                                String strG = r0Var3.G();
                                boolean zI7 = l46Var2.i(ka9Var4);
                                Object objR11 = l46Var2.R();
                                if (zI7 || objR11 == i8cVar) {
                                    objR11 = new a9(0, ka9Var4, ka9.class, "popBackStack", "popBackStack()Z", 8, 12);
                                    ka9Var = ka9Var4;
                                    l46Var2.p0(objR11);
                                } else {
                                    ka9Var = ka9Var4;
                                }
                                x16 x16Var5 = (x16) objR11;
                                boolean zI8 = l46Var2.i(ka9Var);
                                Object objR12 = l46Var2.R();
                                Object obj23 = objR12;
                                if (zI8 || objR12 == i8cVar) {
                                    u14 u14Var = new u14(ka9Var, 4);
                                    l46Var2.p0(u14Var);
                                    obj23 = u14Var;
                                }
                                l26 l26Var = (l26) obj23;
                                boolean zI9 = l46Var2.i(fo4Var2) | l46Var2.i(drawCardSavesC2) | l46Var2.i(edaVar);
                                Object objR13 = l46Var2.R();
                                Object obj24 = objR13;
                                if (zI9 || objR13 == i8cVar) {
                                    final int i15 = 1;
                                    a26 a26Var = new a26() { // from class: go4
                                        @Override // defpackage.a26
                                        public final Object d(Object obj210) {
                                            int i110 = i15;
                                            wef wefVar3 = wef.a;
                                            pu4 pu4Var = pu4.a;
                                            eda edaVar3 = edaVar;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC2;
                                            fo4 fo4Var4 = fo4Var2;
                                            List list7 = (List) obj210;
                                            switch (i110) {
                                                case 0:
                                                    list7.getClass();
                                                    ((dr2) fo4Var4).a(nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var));
                                                    break;
                                                default:
                                                    list7.getClass();
                                                    ((dr2) fo4Var4).a(nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var));
                                                    break;
                                            }
                                            return wefVar3;
                                        }
                                    };
                                    l46Var2.p0(a26Var);
                                    obj24 = a26Var;
                                }
                                a26 a26Var2 = (a26) obj24;
                                boolean zI10 = l46Var2.i(r0Var3) | l46Var2.i(drawCardSavesC2) | l46Var2.i(edaVar) | l46Var2.i(ka9Var);
                                Object objR14 = l46Var2.R();
                                if (zI10 || objR14 == i8cVar) {
                                    final int i16 = 1;
                                    final ka9 ka9Var5 = ka9Var;
                                    objR14 = new a26() { // from class: ho4
                                        @Override // defpackage.a26
                                        public final Object d(Object obj210) {
                                            int i110 = i16;
                                            wef wefVar3 = wef.a;
                                            pu4 pu4Var = pu4.a;
                                            ka9 ka9Var8 = ka9Var5;
                                            eda edaVar3 = edaVar;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC2;
                                            r0 r0Var5 = r0Var3;
                                            List list7 = (List) obj210;
                                            switch (i110) {
                                                case 0:
                                                    list7.getClass();
                                                    DrawCardSaves drawCardSavesB = nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var);
                                                    r0Var5.getClass();
                                                    r0Var5.z1(drawCardSavesB);
                                                    ka9.e(ka9Var8, PostDrawInfoRoute.INSTANCE, null, 6);
                                                    break;
                                                default:
                                                    list7.getClass();
                                                    DrawCardSaves drawCardSavesB2 = nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var);
                                                    r0Var5.getClass();
                                                    r0Var5.z1(drawCardSavesB2);
                                                    ka9.e(ka9Var8, PostDrawInfoRoute.INSTANCE, null, 6);
                                                    break;
                                            }
                                            return wefVar3;
                                        }
                                    };
                                    l46Var2.p0(objR14);
                                }
                                a26 a26Var3 = (a26) objR14;
                                boolean zI11 = l46Var2.i(yccVarA);
                                Object objR15 = l46Var2.R();
                                Object obj25 = objR15;
                                if (zI11 || objR15 == i8cVar) {
                                    io4 io4Var = new io4(yccVarA, 1);
                                    l46Var2.p0(io4Var);
                                    obj25 = io4Var;
                                }
                                vfh.i(pu4.a, patterns, l26Var, a26Var2, x16Var5, a26Var3, list3, (x16) obj25, false, false, zF0, strG, 0, l46Var2, 805306374, 4352);
                                return wefVar2;
                            case 2:
                                da9 da9Var3 = (da9) obj8;
                                l46 l46Var3 = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                da9Var3.getClass();
                                PhotoPatternRoute photoPatternRoute = (PhotoPatternRoute) vfh.S(da9Var3, job.a.b(PhotoPatternRoute.class));
                                int i17 = r0.j2;
                                final r0 r0Var4 = r0Var;
                                ka9 ka9Var6 = cb9Var2;
                                final DrawCardSaves drawCardSavesC3 = bp4.c(r0Var4, ka9Var6, l46Var3);
                                if (drawCardSavesC3 == null) {
                                    return wefVar2;
                                }
                                List<PatternData> patterns2 = drawCardSavesC3.getPatterns();
                                ycc yccVarA2 = da9Var3.a();
                                List list4 = (List) yccVarA2.a("camera_result_cards");
                                List list5 = (List) yccVarA2.a("camera_result_reversed");
                                boolean zG3 = l46Var3.g(list4);
                                Object objR16 = l46Var3.R();
                                if (zG3 || objR16 == i8cVar) {
                                    if (list4 != null) {
                                        arrayList2 = new ArrayList();
                                        int i18 = 0;
                                        for (Object obj26 : list4) {
                                            int i19 = i18 + 1;
                                            if (i18 < 0) {
                                                t72.Z();
                                                throw null;
                                            }
                                            try {
                                                tarotCardChoice2 = new TarotCardChoice(TarotCardType.valueOf((String) obj26), (list5 == null || (bool2 = (Boolean) s72.y0(i18, list5)) == null) ? false : bool2.booleanValue(), (String) null, 4, (rp3) null);
                                            } catch (Throwable th2) {
                                                tarotCardChoice2 = new dzb(th2);
                                            }
                                            boolean z6 = tarotCardChoice2 instanceof dzb;
                                            Object obj27 = tarotCardChoice2;
                                            if (z6) {
                                                obj27 = null;
                                            }
                                            TarotCardChoice tarotCardChoice4 = (TarotCardChoice) obj27;
                                            if (tarotCardChoice4 != null) {
                                                arrayList2.add(tarotCardChoice4);
                                            }
                                            list5 = list5;
                                            i18 = i19;
                                        }
                                    } else {
                                        arrayList2 = null;
                                    }
                                    l46Var3.p0(arrayList2);
                                    obj12 = arrayList2;
                                }
                                List list6 = (List) obj12;
                                boolean zI12 = l46Var3.i(photoPatternRoute) | l46Var3.i(patterns2);
                                Object objR17 = l46Var3.R();
                                Object obj28 = objR17;
                                if (zI12 || objR17 == i8cVar) {
                                    jt3 jt3Var = new jt3(11, photoPatternRoute, patterns2);
                                    l46Var3.p0(jt3Var);
                                    obj28 = jt3Var;
                                }
                                x16 x16Var6 = (x16) obj28;
                                pwf pwfVarA3 = qd8.a(l46Var3);
                                if (pwfVarA3 == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                final eda edaVar2 = (eda) z5c.G(job.a.b(eda.class), pwfVarA3.g(), null, b21.r(pwfVarA3), kr7.b(l46Var3), x16Var6);
                                int size2 = patterns2.size();
                                int i110 = r0.j2;
                                int i20 = eda.e;
                                bp4.b(r0Var4, edaVar2, size2, l46Var3, 72);
                                boolean zF1 = r0Var4.f0();
                                String strG2 = r0Var4.G();
                                List<TarotCardChoice> selectedTarotCards = photoPatternRoute.getSelectedTarotCards();
                                boolean zI13 = l46Var3.i(ka9Var6);
                                Object objR18 = l46Var3.R();
                                if (zI13 || objR18 == i8cVar) {
                                    a9 a9Var = new a9(0, ka9Var6, ka9.class, "popBackStack", "popBackStack()Z", 8, 9);
                                    ka9Var2 = ka9Var6;
                                    l46Var3.p0(a9Var);
                                    objR18 = a9Var;
                                } else {
                                    ka9Var2 = ka9Var6;
                                }
                                x16 x16Var7 = (x16) objR18;
                                boolean zI14 = l46Var3.i(ka9Var2);
                                Object objR19 = l46Var3.R();
                                Object obj29 = objR19;
                                if (zI14 || objR19 == i8cVar) {
                                    u14 u14Var2 = new u14(ka9Var2, 3);
                                    l46Var3.p0(u14Var2);
                                    obj29 = u14Var2;
                                }
                                l26 l26Var2 = (l26) obj29;
                                boolean zI15 = l46Var3.i(fo4Var2) | l46Var3.i(drawCardSavesC3) | l46Var3.i(edaVar2);
                                Object objR20 = l46Var3.R();
                                Object obj30 = objR20;
                                if (zI15 || objR20 == i8cVar) {
                                    final int i21 = 0;
                                    a26 a26Var4 = new a26() { // from class: go4
                                        @Override // defpackage.a26
                                        public final Object d(Object obj210) {
                                            int i111 = i21;
                                            wef wefVar3 = wef.a;
                                            pu4 pu4Var = pu4.a;
                                            eda edaVar3 = edaVar2;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC3;
                                            fo4 fo4Var4 = fo4Var2;
                                            List list7 = (List) obj210;
                                            switch (i111) {
                                                case 0:
                                                    list7.getClass();
                                                    ((dr2) fo4Var4).a(nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var));
                                                    break;
                                                default:
                                                    list7.getClass();
                                                    ((dr2) fo4Var4).a(nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var));
                                                    break;
                                            }
                                            return wefVar3;
                                        }
                                    };
                                    l46Var3.p0(a26Var4);
                                    obj30 = a26Var4;
                                }
                                a26 a26Var5 = (a26) obj30;
                                boolean zI16 = l46Var3.i(r0Var4) | l46Var3.i(drawCardSavesC3) | l46Var3.i(edaVar2) | l46Var3.i(ka9Var2);
                                Object objR21 = l46Var3.R();
                                Object obj31 = objR21;
                                if (zI16 || objR21 == i8cVar) {
                                    final int i22 = 0;
                                    final ka9 ka9Var7 = ka9Var2;
                                    a26 a26Var6 = new a26() { // from class: ho4
                                        @Override // defpackage.a26
                                        public final Object d(Object obj210) {
                                            int i111 = i22;
                                            wef wefVar3 = wef.a;
                                            pu4 pu4Var = pu4.a;
                                            ka9 ka9Var8 = ka9Var7;
                                            eda edaVar3 = edaVar2;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC3;
                                            r0 r0Var5 = r0Var4;
                                            List list7 = (List) obj210;
                                            switch (i111) {
                                                case 0:
                                                    list7.getClass();
                                                    DrawCardSaves drawCardSavesB = nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var);
                                                    r0Var5.getClass();
                                                    r0Var5.z1(drawCardSavesB);
                                                    ka9.e(ka9Var8, PostDrawInfoRoute.INSTANCE, null, 6);
                                                    break;
                                                default:
                                                    list7.getClass();
                                                    DrawCardSaves drawCardSavesB2 = nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var);
                                                    r0Var5.getClass();
                                                    r0Var5.z1(drawCardSavesB2);
                                                    ka9.e(ka9Var8, PostDrawInfoRoute.INSTANCE, null, 6);
                                                    break;
                                            }
                                            return wefVar3;
                                        }
                                    };
                                    l46Var3.p0(a26Var6);
                                    obj31 = a26Var6;
                                }
                                a26 a26Var7 = (a26) obj31;
                                boolean zI17 = l46Var3.i(yccVarA2);
                                Object objR22 = l46Var3.R();
                                Object obj32 = objR22;
                                if (zI17 || objR22 == i8cVar) {
                                    io4 io4Var2 = new io4(yccVarA2, 0);
                                    l46Var3.p0(io4Var2);
                                    obj32 = io4Var2;
                                }
                                vfh.i(selectedTarotCards, patterns2, l26Var2, a26Var5, x16Var7, a26Var7, list6, (x16) obj32, false, false, zF1, strG2, 0, l46Var3, 805306368, 4352);
                                return wefVar2;
                            default:
                                l46 l46Var4 = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                ((da9) obj8).getClass();
                                int i23 = r0.j2;
                                r0 r0Var5 = r0Var;
                                ka9 ka9Var8 = cb9Var2;
                                final DrawCardSaves drawCardSavesC4 = bp4.c(r0Var5, ka9Var8, l46Var4);
                                if (drawCardSavesC4 == null) {
                                    return wefVar2;
                                }
                                boolean zI18 = l46Var4.i(drawCardSavesC4);
                                Object objR23 = l46Var4.R();
                                if (zI18 || objR23 == i8cVar) {
                                    obj13 = objR23;
                                    final int z7 = z3 ? 1 : 0;
                                    x16 x16Var8 = new x16() { // from class: jo4
                                        @Override // defpackage.x16
                                        public final Object invoke() {
                                            int i24 = z7;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC4;
                                            switch (i24) {
                                                case 0:
                                                    return db6.A0(drawCardSaves3);
                                                default:
                                                    return db6.A0(drawCardSaves3.getChatId());
                                            }
                                        }
                                    };
                                    l46Var4.p0(x16Var8);
                                    obj13 = x16Var8;
                                }
                                x16 x16Var9 = (x16) obj13;
                                pwf pwfVarA4 = qd8.a(l46Var4);
                                if (pwfVarA4 == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                gy2 gy2VarR = b21.r(pwfVarA4);
                                nfc nfcVarB2 = kr7.b(l46Var4);
                                kob kobVar3 = job.a;
                                soa soaVar2 = (soa) z5c.G(kobVar3.b(soa.class), pwfVarA4.g(), null, gy2VarR, nfcVarB2, x16Var9);
                                nfc nfcVarB3 = kr7.b(l46Var4);
                                boolean zG4 = l46Var4.g(null) | l46Var4.g(nfcVarB3);
                                Object objR24 = l46Var4.R();
                                if (zG4 || objR24 == i8cVar) {
                                    objR24 = nfcVarB3.b(kobVar3.b(j4a.class), null, null);
                                    l46Var4.p0(objR24);
                                }
                                j4a j4aVar = (j4a) objR24;
                                boolean zI19 = l46Var4.i(r0Var5) | l46Var4.i(j4aVar) | l46Var4.i(soaVar2);
                                fo4 fo4Var4 = dr2Var;
                                boolean zI20 = zI19 | l46Var4.i(fo4Var4) | l46Var4.i(drawCardSavesC4);
                                Object objR25 = l46Var4.R();
                                if (zI20 || objR25 == i8cVar) {
                                    ro4 ro4Var = new ro4(r0Var5, j4aVar, soaVar2, fo4Var4, drawCardSavesC4, null);
                                    soaVar = soaVar2;
                                    fo4Var = fo4Var4;
                                    drawCardSaves = drawCardSavesC4;
                                    l46Var4.p0(ro4Var);
                                    objR25 = ro4Var;
                                } else {
                                    fo4Var = fo4Var4;
                                    drawCardSaves = drawCardSavesC4;
                                    soaVar = soaVar2;
                                }
                                af1.o((l26) objR25, l46Var4, wefVar2);
                                rx8.a(48, af1.b0(-613987671, new cm(soaVar, r0Var5, fo4Var, drawCardSaves, ka9Var8, 10), l46Var4), l46Var4, drawCardSaves.getMixedDeck() != null);
                                return wefVar2;
                        }
                    }
                }, true, -1536972636));
                final int i6 = 3;
                rs0.o(za9Var, kobVar.b(PostDrawInfoRoute.class), qu4Var, null, null, null, null, new dd2(new o26() { // from class: mo4
                    @Override // defpackage.o26
                    public final Object t(Object obj7, Object obj8, Object obj9, Object obj10) {
                        Object obj11;
                        ArrayList arrayList;
                        Object tarotCardChoice;
                        Boolean bool;
                        ka9 ka9Var;
                        ArrayList arrayList2;
                        Object tarotCardChoice2;
                        Boolean bool2;
                        Object obj12;
                        ka9 ka9Var2;
                        Object obj13;
                        soa soaVar;
                        fo4 fo4Var;
                        DrawCardSaves drawCardSaves;
                        int i7 = i6;
                        final fo4 fo4Var2 = dr2Var;
                        i8c i8cVar = sf2.a;
                        wef wefVar2 = wef.a;
                        boolean z3 = true;
                        switch (i7) {
                            case 0:
                                da9 da9Var = (da9) obj8;
                                l46 l46Var = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                da9Var.getClass();
                                kob kobVar2 = job.a;
                                UnifiedDrawingRoute unifiedDrawingRoute = (UnifiedDrawingRoute) vfh.S(da9Var, kobVar2.b(UnifiedDrawingRoute.class));
                                int i8 = r0.j2;
                                r0 r0Var2 = r0Var;
                                ka9 ka9Var3 = cb9Var2;
                                final DrawCardSaves drawCardSavesC = bp4.c(r0Var2, ka9Var3, l46Var);
                                if (drawCardSavesC == null) {
                                    return wefVar2;
                                }
                                boolean zI = l46Var.i(drawCardSavesC);
                                Object objR = l46Var.R();
                                if (zI || objR == i8cVar) {
                                    obj11 = objR;
                                    final int i9 = 0;
                                    x16 x16Var = new x16() { // from class: jo4
                                        @Override // defpackage.x16
                                        public final Object invoke() {
                                            int i24 = i9;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC;
                                            switch (i24) {
                                                case 0:
                                                    return db6.A0(drawCardSaves3);
                                                default:
                                                    return db6.A0(drawCardSaves3.getChatId());
                                            }
                                        }
                                    };
                                    l46Var.p0(x16Var);
                                    obj11 = x16Var;
                                }
                                x16 x16Var2 = (x16) obj11;
                                pwf pwfVarA = qd8.a(l46Var);
                                if (pwfVarA == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                rcf rcfVar = (rcf) z5c.G(kobVar2.b(rcf.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var2);
                                nfc nfcVarB = kr7.b(l46Var);
                                boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
                                Object objR2 = l46Var.R();
                                if (zG || objR2 == i8cVar) {
                                    objR2 = nfcVarB.b(kobVar2.b(fcb.class), null, null);
                                    l46Var.p0(objR2);
                                }
                                fcb fcbVar = (fcb) objR2;
                                Object objR3 = l46Var.R();
                                Object obj14 = objR3;
                                if (objR3 == i8cVar) {
                                    vz9 vz9VarF = q1c.f(null);
                                    l46Var.p0(vz9VarF);
                                    obj14 = vz9VarF;
                                }
                                e89 e89Var2 = (e89) obj14;
                                boolean zI2 = l46Var.i(r0Var2) | l46Var.i(rcfVar);
                                Object objR4 = l46Var.R();
                                Object obj15 = objR4;
                                if (zI2 || objR4 == i8cVar) {
                                    uo4 uo4Var = new uo4(null, rcfVar, r0Var2);
                                    l46Var.p0(uo4Var);
                                    obj15 = uo4Var;
                                }
                                af1.o((l26) obj15, l46Var, wefVar2);
                                boolean zI3 = l46Var.i(rcfVar) | l46Var.i(r0Var2);
                                Object objR5 = l46Var.R();
                                Object obj16 = objR5;
                                if (zI3 || objR5 == i8cVar) {
                                    wo4 wo4Var = new wo4(null, rcfVar, r0Var2);
                                    l46Var.p0(wo4Var);
                                    obj16 = wo4Var;
                                }
                                int i10 = rcf.x;
                                af1.o((l26) obj16, l46Var, rcfVar);
                                Boolean boolValueOf = Boolean.valueOf(r0Var2.m0());
                                boolean zI4 = l46Var.i(r0Var2) | l46Var.i(rcfVar);
                                Object objR6 = l46Var.R();
                                Object obj17 = objR6;
                                if (zI4 || objR6 == i8cVar) {
                                    xo4 xo4Var = new xo4(null, rcfVar, r0Var2);
                                    l46Var.p0(xo4Var);
                                    obj17 = xo4Var;
                                }
                                af1.o((l26) obj17, l46Var, boolValueOf);
                                MixedDeckSnapshot mixedDeckSnapshot = (MixedDeckSnapshot) rcfVar.c.getValue();
                                fo4 fo4Var3 = dr2Var;
                                snd.a(mixedDeckSnapshot, af1.b0(-1238849888, new ko4(rcfVar, r0Var2, unifiedDrawingRoute, fcbVar, ka9Var3, fo4Var3, e89Var2, 0), l46Var), l46Var, 48 | MixedDeckSnapshot.$stable);
                                DrawCardSaves drawCardSaves2 = (DrawCardSaves) e89Var2.getValue();
                                boolean z4 = !r0Var2.g0() || rcfVar.k() || (r0Var2.q0() && !rcfVar.f.isEmpty());
                                Object objR7 = l46Var.R();
                                Object obj18 = objR7;
                                if (objR7 == i8cVar) {
                                    ok3 ok3Var = new ok3(e89Var2, 13);
                                    l46Var.p0(ok3Var);
                                    obj18 = ok3Var;
                                }
                                x16 x16Var3 = (x16) obj18;
                                boolean zI5 = l46Var.i(r0Var2) | l46Var.i(fo4Var3);
                                Object objR8 = l46Var.R();
                                Object obj19 = objR8;
                                if (zI5 || objR8 == i8cVar) {
                                    lo4 lo4Var = new lo4(r0Var2, fo4Var3, 0);
                                    l46Var.p0(lo4Var);
                                    obj19 = lo4Var;
                                }
                                bp4.a(drawCardSaves2, z4, x16Var3, (a26) obj19, l46Var, DrawCardSaves.$stable | 384, 0);
                                return wefVar2;
                            case 1:
                                da9 da9Var2 = (da9) obj8;
                                l46 l46Var2 = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                da9Var2.getClass();
                                int i11 = r0.j2;
                                final r0 r0Var3 = r0Var;
                                ka9 ka9Var4 = cb9Var2;
                                final DrawCardSaves drawCardSavesC2 = bp4.c(r0Var3, ka9Var4, l46Var2);
                                if (drawCardSavesC2 == null) {
                                    return wefVar2;
                                }
                                List<PatternData> patterns = drawCardSavesC2.getPatterns();
                                ycc yccVarA = da9Var2.a();
                                List list = (List) yccVarA.a("camera_result_cards");
                                List list2 = (List) yccVarA.a("camera_result_reversed");
                                boolean zG2 = l46Var2.g(list);
                                Object objR9 = l46Var2.R();
                                if (zG2 || objR9 == i8cVar) {
                                    if (list != null) {
                                        arrayList = new ArrayList();
                                        int i12 = 0;
                                        for (Object obj20 : list) {
                                            int i13 = i12 + 1;
                                            if (i12 < 0) {
                                                t72.Z();
                                                throw null;
                                            }
                                            try {
                                                tarotCardChoice = new TarotCardChoice(TarotCardType.valueOf((String) obj20), (list2 == null || (bool = (Boolean) s72.y0(i12, list2)) == null) ? false : bool.booleanValue(), (String) null, 4, (rp3) null);
                                            } catch (Throwable th) {
                                                tarotCardChoice = new dzb(th);
                                            }
                                            boolean z5 = tarotCardChoice instanceof dzb;
                                            Object obj21 = tarotCardChoice;
                                            if (z5) {
                                                obj21 = null;
                                            }
                                            TarotCardChoice tarotCardChoice3 = (TarotCardChoice) obj21;
                                            if (tarotCardChoice3 != null) {
                                                arrayList.add(tarotCardChoice3);
                                            }
                                            i12 = i13;
                                        }
                                    } else {
                                        arrayList = null;
                                    }
                                    l46Var2.p0(arrayList);
                                    objR9 = arrayList;
                                }
                                List list3 = (List) objR9;
                                boolean zI6 = l46Var2.i(patterns);
                                Object objR10 = l46Var2.R();
                                Object obj22 = objR10;
                                if (zI6 || objR10 == i8cVar) {
                                    h53 h53Var = new h53(patterns, 4);
                                    l46Var2.p0(h53Var);
                                    obj22 = h53Var;
                                }
                                x16 x16Var4 = (x16) obj22;
                                pwf pwfVarA2 = qd8.a(l46Var2);
                                if (pwfVarA2 == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                final eda edaVar = (eda) z5c.G(job.a.b(eda.class), pwfVarA2.g(), null, b21.r(pwfVarA2), kr7.b(l46Var2), x16Var4);
                                int size = patterns.size();
                                int i14 = r0.j2;
                                int i15 = eda.e;
                                bp4.b(r0Var3, edaVar, size, l46Var2, 72);
                                boolean zF0 = r0Var3.f0();
                                String strG = r0Var3.G();
                                boolean zI7 = l46Var2.i(ka9Var4);
                                Object objR11 = l46Var2.R();
                                if (zI7 || objR11 == i8cVar) {
                                    objR11 = new a9(0, ka9Var4, ka9.class, "popBackStack", "popBackStack()Z", 8, 12);
                                    ka9Var = ka9Var4;
                                    l46Var2.p0(objR11);
                                } else {
                                    ka9Var = ka9Var4;
                                }
                                x16 x16Var5 = (x16) objR11;
                                boolean zI8 = l46Var2.i(ka9Var);
                                Object objR12 = l46Var2.R();
                                Object obj23 = objR12;
                                if (zI8 || objR12 == i8cVar) {
                                    u14 u14Var = new u14(ka9Var, 4);
                                    l46Var2.p0(u14Var);
                                    obj23 = u14Var;
                                }
                                l26 l26Var = (l26) obj23;
                                boolean zI9 = l46Var2.i(fo4Var2) | l46Var2.i(drawCardSavesC2) | l46Var2.i(edaVar);
                                Object objR13 = l46Var2.R();
                                Object obj24 = objR13;
                                if (zI9 || objR13 == i8cVar) {
                                    final int i16 = 1;
                                    a26 a26Var = new a26() { // from class: go4
                                        @Override // defpackage.a26
                                        public final Object d(Object obj210) {
                                            int i111 = i16;
                                            wef wefVar3 = wef.a;
                                            pu4 pu4Var = pu4.a;
                                            eda edaVar3 = edaVar;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC2;
                                            fo4 fo4Var4 = fo4Var2;
                                            List list7 = (List) obj210;
                                            switch (i111) {
                                                case 0:
                                                    list7.getClass();
                                                    ((dr2) fo4Var4).a(nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var));
                                                    break;
                                                default:
                                                    list7.getClass();
                                                    ((dr2) fo4Var4).a(nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var));
                                                    break;
                                            }
                                            return wefVar3;
                                        }
                                    };
                                    l46Var2.p0(a26Var);
                                    obj24 = a26Var;
                                }
                                a26 a26Var2 = (a26) obj24;
                                boolean zI10 = l46Var2.i(r0Var3) | l46Var2.i(drawCardSavesC2) | l46Var2.i(edaVar) | l46Var2.i(ka9Var);
                                Object objR14 = l46Var2.R();
                                if (zI10 || objR14 == i8cVar) {
                                    final int i17 = 1;
                                    final ka9 ka9Var5 = ka9Var;
                                    objR14 = new a26() { // from class: ho4
                                        @Override // defpackage.a26
                                        public final Object d(Object obj210) {
                                            int i111 = i17;
                                            wef wefVar3 = wef.a;
                                            pu4 pu4Var = pu4.a;
                                            ka9 ka9Var8 = ka9Var5;
                                            eda edaVar3 = edaVar;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC2;
                                            r0 r0Var5 = r0Var3;
                                            List list7 = (List) obj210;
                                            switch (i111) {
                                                case 0:
                                                    list7.getClass();
                                                    DrawCardSaves drawCardSavesB = nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var);
                                                    r0Var5.getClass();
                                                    r0Var5.z1(drawCardSavesB);
                                                    ka9.e(ka9Var8, PostDrawInfoRoute.INSTANCE, null, 6);
                                                    break;
                                                default:
                                                    list7.getClass();
                                                    DrawCardSaves drawCardSavesB2 = nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var);
                                                    r0Var5.getClass();
                                                    r0Var5.z1(drawCardSavesB2);
                                                    ka9.e(ka9Var8, PostDrawInfoRoute.INSTANCE, null, 6);
                                                    break;
                                            }
                                            return wefVar3;
                                        }
                                    };
                                    l46Var2.p0(objR14);
                                }
                                a26 a26Var3 = (a26) objR14;
                                boolean zI11 = l46Var2.i(yccVarA);
                                Object objR15 = l46Var2.R();
                                Object obj25 = objR15;
                                if (zI11 || objR15 == i8cVar) {
                                    io4 io4Var = new io4(yccVarA, 1);
                                    l46Var2.p0(io4Var);
                                    obj25 = io4Var;
                                }
                                vfh.i(pu4.a, patterns, l26Var, a26Var2, x16Var5, a26Var3, list3, (x16) obj25, false, false, zF0, strG, 0, l46Var2, 805306374, 4352);
                                return wefVar2;
                            case 2:
                                da9 da9Var3 = (da9) obj8;
                                l46 l46Var3 = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                da9Var3.getClass();
                                PhotoPatternRoute photoPatternRoute = (PhotoPatternRoute) vfh.S(da9Var3, job.a.b(PhotoPatternRoute.class));
                                int i18 = r0.j2;
                                final r0 r0Var4 = r0Var;
                                ka9 ka9Var6 = cb9Var2;
                                final DrawCardSaves drawCardSavesC3 = bp4.c(r0Var4, ka9Var6, l46Var3);
                                if (drawCardSavesC3 == null) {
                                    return wefVar2;
                                }
                                List<PatternData> patterns2 = drawCardSavesC3.getPatterns();
                                ycc yccVarA2 = da9Var3.a();
                                List list4 = (List) yccVarA2.a("camera_result_cards");
                                List list5 = (List) yccVarA2.a("camera_result_reversed");
                                boolean zG3 = l46Var3.g(list4);
                                Object objR16 = l46Var3.R();
                                if (zG3 || objR16 == i8cVar) {
                                    if (list4 != null) {
                                        arrayList2 = new ArrayList();
                                        int i19 = 0;
                                        for (Object obj26 : list4) {
                                            int i110 = i19 + 1;
                                            if (i19 < 0) {
                                                t72.Z();
                                                throw null;
                                            }
                                            try {
                                                tarotCardChoice2 = new TarotCardChoice(TarotCardType.valueOf((String) obj26), (list5 == null || (bool2 = (Boolean) s72.y0(i19, list5)) == null) ? false : bool2.booleanValue(), (String) null, 4, (rp3) null);
                                            } catch (Throwable th2) {
                                                tarotCardChoice2 = new dzb(th2);
                                            }
                                            boolean z6 = tarotCardChoice2 instanceof dzb;
                                            Object obj27 = tarotCardChoice2;
                                            if (z6) {
                                                obj27 = null;
                                            }
                                            TarotCardChoice tarotCardChoice4 = (TarotCardChoice) obj27;
                                            if (tarotCardChoice4 != null) {
                                                arrayList2.add(tarotCardChoice4);
                                            }
                                            list5 = list5;
                                            i19 = i110;
                                        }
                                    } else {
                                        arrayList2 = null;
                                    }
                                    l46Var3.p0(arrayList2);
                                    obj12 = arrayList2;
                                }
                                List list6 = (List) obj12;
                                boolean zI12 = l46Var3.i(photoPatternRoute) | l46Var3.i(patterns2);
                                Object objR17 = l46Var3.R();
                                Object obj28 = objR17;
                                if (zI12 || objR17 == i8cVar) {
                                    jt3 jt3Var = new jt3(11, photoPatternRoute, patterns2);
                                    l46Var3.p0(jt3Var);
                                    obj28 = jt3Var;
                                }
                                x16 x16Var6 = (x16) obj28;
                                pwf pwfVarA3 = qd8.a(l46Var3);
                                if (pwfVarA3 == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                final eda edaVar2 = (eda) z5c.G(job.a.b(eda.class), pwfVarA3.g(), null, b21.r(pwfVarA3), kr7.b(l46Var3), x16Var6);
                                int size2 = patterns2.size();
                                int i111 = r0.j2;
                                int i20 = eda.e;
                                bp4.b(r0Var4, edaVar2, size2, l46Var3, 72);
                                boolean zF1 = r0Var4.f0();
                                String strG2 = r0Var4.G();
                                List<TarotCardChoice> selectedTarotCards = photoPatternRoute.getSelectedTarotCards();
                                boolean zI13 = l46Var3.i(ka9Var6);
                                Object objR18 = l46Var3.R();
                                if (zI13 || objR18 == i8cVar) {
                                    a9 a9Var = new a9(0, ka9Var6, ka9.class, "popBackStack", "popBackStack()Z", 8, 9);
                                    ka9Var2 = ka9Var6;
                                    l46Var3.p0(a9Var);
                                    objR18 = a9Var;
                                } else {
                                    ka9Var2 = ka9Var6;
                                }
                                x16 x16Var7 = (x16) objR18;
                                boolean zI14 = l46Var3.i(ka9Var2);
                                Object objR19 = l46Var3.R();
                                Object obj29 = objR19;
                                if (zI14 || objR19 == i8cVar) {
                                    u14 u14Var2 = new u14(ka9Var2, 3);
                                    l46Var3.p0(u14Var2);
                                    obj29 = u14Var2;
                                }
                                l26 l26Var2 = (l26) obj29;
                                boolean zI15 = l46Var3.i(fo4Var2) | l46Var3.i(drawCardSavesC3) | l46Var3.i(edaVar2);
                                Object objR20 = l46Var3.R();
                                Object obj30 = objR20;
                                if (zI15 || objR20 == i8cVar) {
                                    final int i21 = 0;
                                    a26 a26Var4 = new a26() { // from class: go4
                                        @Override // defpackage.a26
                                        public final Object d(Object obj210) {
                                            int i112 = i21;
                                            wef wefVar3 = wef.a;
                                            pu4 pu4Var = pu4.a;
                                            eda edaVar3 = edaVar2;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC3;
                                            fo4 fo4Var4 = fo4Var2;
                                            List list7 = (List) obj210;
                                            switch (i112) {
                                                case 0:
                                                    list7.getClass();
                                                    ((dr2) fo4Var4).a(nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var));
                                                    break;
                                                default:
                                                    list7.getClass();
                                                    ((dr2) fo4Var4).a(nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var));
                                                    break;
                                            }
                                            return wefVar3;
                                        }
                                    };
                                    l46Var3.p0(a26Var4);
                                    obj30 = a26Var4;
                                }
                                a26 a26Var5 = (a26) obj30;
                                boolean zI16 = l46Var3.i(r0Var4) | l46Var3.i(drawCardSavesC3) | l46Var3.i(edaVar2) | l46Var3.i(ka9Var2);
                                Object objR21 = l46Var3.R();
                                Object obj31 = objR21;
                                if (zI16 || objR21 == i8cVar) {
                                    final int i22 = 0;
                                    final ka9 ka9Var7 = ka9Var2;
                                    a26 a26Var6 = new a26() { // from class: ho4
                                        @Override // defpackage.a26
                                        public final Object d(Object obj210) {
                                            int i112 = i22;
                                            wef wefVar3 = wef.a;
                                            pu4 pu4Var = pu4.a;
                                            ka9 ka9Var8 = ka9Var7;
                                            eda edaVar3 = edaVar2;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC3;
                                            r0 r0Var5 = r0Var4;
                                            List list7 = (List) obj210;
                                            switch (i112) {
                                                case 0:
                                                    list7.getClass();
                                                    DrawCardSaves drawCardSavesB = nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var);
                                                    r0Var5.getClass();
                                                    r0Var5.z1(drawCardSavesB);
                                                    ka9.e(ka9Var8, PostDrawInfoRoute.INSTANCE, null, 6);
                                                    break;
                                                default:
                                                    list7.getClass();
                                                    DrawCardSaves drawCardSavesB2 = nm4.b(DrawCardSaves.Companion, drawCardSaves3.getChatId(), ((dda) edaVar3.c.a.getValue()).a, list7, pu4Var);
                                                    r0Var5.getClass();
                                                    r0Var5.z1(drawCardSavesB2);
                                                    ka9.e(ka9Var8, PostDrawInfoRoute.INSTANCE, null, 6);
                                                    break;
                                            }
                                            return wefVar3;
                                        }
                                    };
                                    l46Var3.p0(a26Var6);
                                    obj31 = a26Var6;
                                }
                                a26 a26Var7 = (a26) obj31;
                                boolean zI17 = l46Var3.i(yccVarA2);
                                Object objR22 = l46Var3.R();
                                Object obj32 = objR22;
                                if (zI17 || objR22 == i8cVar) {
                                    io4 io4Var2 = new io4(yccVarA2, 0);
                                    l46Var3.p0(io4Var2);
                                    obj32 = io4Var2;
                                }
                                vfh.i(selectedTarotCards, patterns2, l26Var2, a26Var5, x16Var7, a26Var7, list6, (x16) obj32, false, false, zF1, strG2, 0, l46Var3, 805306368, 4352);
                                return wefVar2;
                            default:
                                l46 l46Var4 = (l46) obj9;
                                ((Integer) obj10).getClass();
                                ((ly) obj7).getClass();
                                ((da9) obj8).getClass();
                                int i23 = r0.j2;
                                r0 r0Var5 = r0Var;
                                ka9 ka9Var8 = cb9Var2;
                                final DrawCardSaves drawCardSavesC4 = bp4.c(r0Var5, ka9Var8, l46Var4);
                                if (drawCardSavesC4 == null) {
                                    return wefVar2;
                                }
                                boolean zI18 = l46Var4.i(drawCardSavesC4);
                                Object objR23 = l46Var4.R();
                                if (zI18 || objR23 == i8cVar) {
                                    obj13 = objR23;
                                    final int z7 = z3 ? 1 : 0;
                                    x16 x16Var8 = new x16() { // from class: jo4
                                        @Override // defpackage.x16
                                        public final Object invoke() {
                                            int i24 = z7;
                                            DrawCardSaves drawCardSaves3 = drawCardSavesC4;
                                            switch (i24) {
                                                case 0:
                                                    return db6.A0(drawCardSaves3);
                                                default:
                                                    return db6.A0(drawCardSaves3.getChatId());
                                            }
                                        }
                                    };
                                    l46Var4.p0(x16Var8);
                                    obj13 = x16Var8;
                                }
                                x16 x16Var9 = (x16) obj13;
                                pwf pwfVarA4 = qd8.a(l46Var4);
                                if (pwfVarA4 == null) {
                                    qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                gy2 gy2VarR = b21.r(pwfVarA4);
                                nfc nfcVarB2 = kr7.b(l46Var4);
                                kob kobVar3 = job.a;
                                soa soaVar2 = (soa) z5c.G(kobVar3.b(soa.class), pwfVarA4.g(), null, gy2VarR, nfcVarB2, x16Var9);
                                nfc nfcVarB3 = kr7.b(l46Var4);
                                boolean zG4 = l46Var4.g(null) | l46Var4.g(nfcVarB3);
                                Object objR24 = l46Var4.R();
                                if (zG4 || objR24 == i8cVar) {
                                    objR24 = nfcVarB3.b(kobVar3.b(j4a.class), null, null);
                                    l46Var4.p0(objR24);
                                }
                                j4a j4aVar = (j4a) objR24;
                                boolean zI19 = l46Var4.i(r0Var5) | l46Var4.i(j4aVar) | l46Var4.i(soaVar2);
                                fo4 fo4Var4 = dr2Var;
                                boolean zI20 = zI19 | l46Var4.i(fo4Var4) | l46Var4.i(drawCardSavesC4);
                                Object objR25 = l46Var4.R();
                                if (zI20 || objR25 == i8cVar) {
                                    ro4 ro4Var = new ro4(r0Var5, j4aVar, soaVar2, fo4Var4, drawCardSavesC4, null);
                                    soaVar = soaVar2;
                                    fo4Var = fo4Var4;
                                    drawCardSaves = drawCardSavesC4;
                                    l46Var4.p0(ro4Var);
                                    objR25 = ro4Var;
                                } else {
                                    fo4Var = fo4Var4;
                                    drawCardSaves = drawCardSavesC4;
                                    soaVar = soaVar2;
                                }
                                af1.o((l26) objR25, l46Var4, wefVar2);
                                rx8.a(48, af1.b0(-613987671, new cm(soaVar, r0Var5, fo4Var, drawCardSaves, ka9Var8, 10), l46Var4), l46Var4, drawCardSaves.getMixedDeck() != null);
                                return wefVar2;
                        }
                    }
                }, true, 717319555));
                return wefVar;
            case 2:
                r38 r38Var = (r38) obj6;
                vz9 vz9Var = r38Var.o;
                e7g e7gVar = (e7g) obj4;
                cre creVar = (cre) obj3;
                zse zseVar = (zse) obj2;
                sl9 sl9Var = (sl9) obj5;
                bv7 bv7Var3 = (bv7) obj;
                r38Var.h = bv7Var3;
                tte tteVarD = r38Var.d();
                if (tteVarD != null) {
                    tteVarD.b = bv7Var3;
                }
                if (z) {
                    if (r38Var.a() == ug6.b) {
                        if (((Boolean) r38Var.l.getValue()).booleanValue() && ((b28) e7gVar).a()) {
                            creVar.s();
                        } else {
                            creVar.m();
                        }
                        r38Var.m.setValue(Boolean.valueOf(aic.n(creVar, true)));
                        r38Var.n.setValue(Boolean.valueOf(aic.n(creVar, false)));
                        vz9Var.setValue(Boolean.valueOf(eue.d(zseVar.b)));
                    } else if (r38Var.a() == ug6.c) {
                        vz9Var.setValue(Boolean.valueOf(aic.n(creVar, true)));
                    }
                    lmg.n0(r38Var, zseVar, sl9Var);
                    tte tteVarD2 = r38Var.d();
                    if (tteVarD2 != null && (jteVar = r38Var.e) != null && r38Var.b() && (bv7Var = tteVarD2.b) != null && bv7Var.h() && (bv7Var2 = tteVarD2.c) != null) {
                        ste steVar = tteVarD2.a;
                        ymb ymbVar = new ymb(7, bv7Var);
                        hkb hkbVarZ = dj6.Z(bv7Var);
                        hkb hkbVarM = bv7Var.M(bv7Var2, false);
                        if (pa7.t((jte) jteVar.a.b.get(), jteVar)) {
                            jteVar.b.d(zseVar, sl9Var, steVar, ymbVar, hkbVarZ, hkbVarM);
                        }
                    }
                }
                return wefVar;
            default:
                a26 a26Var = (a26) obj6;
                e89 e89Var2 = (e89) obj5;
                aw2 aw2Var = (aw2) obj4;
                ted tedVar = (ted) obj3;
                e89 e89Var3 = (e89) obj2;
                PopupAction popupAction = (PopupAction) obj;
                popupAction.getClass();
                if (z && !((Boolean) e89Var2.getValue()).booleanValue()) {
                    e89Var2.setValue(Boolean.TRUE);
                    ynb.V(aw2Var, null, null, new nka(tedVar, e89Var3, null), 3);
                    a26Var.d(popupAction);
                }
                return wefVar;
        }
    }

    public /* synthetic */ no2(x48 x48Var, dc9 dc9Var, mma mmaVar, boolean z, q7b q7bVar, e89 e89Var) {
        this.c = x48Var;
        this.d = dc9Var;
        this.e = mmaVar;
        this.b = z;
        this.f = q7bVar;
        this.g = e89Var;
    }

    public /* synthetic */ no2(cb9 cb9Var, cb9 cb9Var2, dr2 dr2Var, tr2 tr2Var, x16 x16Var, boolean z) {
        this.c = cb9Var;
        this.d = cb9Var2;
        this.e = dr2Var;
        this.f = tr2Var;
        this.g = x16Var;
        this.b = z;
    }

    public /* synthetic */ no2(boolean z, a26 a26Var, e89 e89Var, aw2 aw2Var, ted tedVar, e89 e89Var2) {
        this.b = z;
        this.c = a26Var;
        this.g = e89Var;
        this.d = aw2Var;
        this.e = tedVar;
        this.f = e89Var2;
    }
}

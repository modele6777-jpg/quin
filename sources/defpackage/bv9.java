package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.account.component.AuthOption;
import ai.askquin.ui.annual.AnnualEntry;
import ai.askquin.ui.annual.AnnualIntroRoute;
import ai.askquin.ui.annual.AnnualReportGeneratingRoute;
import ai.askquin.ui.annual.AnnualShareURLRoute;
import ai.askquin.ui.conversation.ClarifyingCardDrawActionState;
import ai.askquin.ui.conversation.ClarifyingCardSkipActionState;
import ai.askquin.ui.conversation.FailReason;
import ai.askquin.ui.conversation.dialogue.ClarifyingCardState;
import ai.askquin.ui.conversation.g;
import ai.askquin.ui.conversation.n0;
import ai.askquin.ui.conversation.o0;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.dailycard.o;
import ai.askquin.ui.divination.OverviewItem;
import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.draw.photo.homepage.DrawnCardsConfirmRoute;
import ai.askquin.ui.draw.photo.homepage.PhysicalDeckCameraRoute;
import ai.askquin.ui.draw.photo.homepage.PhysicalDeckCardConfirmRoute;
import ai.askquin.ui.draw.photo.homepage.PhysicalDeckReadingRoute;
import ai.askquin.ui.draw.photo.homepage.QuestionInputRoute;
import ai.askquin.ui.draw.photo.homepage.SpreadInfoEntryRoute;
import ai.askquin.ui.draw.photo.homepage.SpreadInfoInputRoute;
import ai.askquin.ui.draw.photo.homepage.SpreadPreviewRoute;
import ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute$DeckCarousel;
import ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute$Detail;
import ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute$GraphEntry;
import ai.askquin.ui.fourseasons.FourSeasonsEntry;
import ai.askquin.ui.fourseasons.FourSeasonsIntroRoute;
import ai.askquin.ui.fourseasons.SeasonalGenderRoute;
import ai.askquin.ui.fourseasons.SeasonalSpreadEntry;
import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$AnalysisHistoryRoute;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$AnalysisQuestionRoute;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$Analyzing;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$LockedReport;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$PersonalityIntroRoute;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$Report;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$Share;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$ShareMyReport;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$StartAnalysisRoute;
import ai.askquin.ui.quickdecision.QuickDecisionDetailRoute;
import ai.askquin.ui.router.AppRoute;
import ai.askquin.ui.router.GiftCardPerspective;
import ai.askquin.ui.seasonal.SeasonalEntry;
import ai.askquin.ui.seasonal.SeasonalFollowUpRoute;
import ai.askquin.ui.seasonal.SeasonalLoadingRoute;
import ai.askquin.ui.settings.profile.AccountProfileRoute$AccountEntry;
import ai.askquin.ui.settings.profile.AccountProfileRoute$AccountProfile;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinGraphEntryRoute;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinMallRoute;
import android.content.Context;
import android.content.res.Resources;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;
import tech.chatmind.api.events.model.PopupAction;
import tech.chatmind.api.events.model.PopupActionType;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bv9 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bv9(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final Object a(Object obj) {
        final q7b q7bVar = (q7b) this.b;
        final cb9 cb9Var = (cb9) this.c;
        final j4a j4aVar = (j4a) this.d;
        za9 za9Var = (za9) obj;
        za9Var.getClass();
        final int i = 2;
        final int i2 = 1;
        dd2 dd2Var = new dd2(new o26() { // from class: nr2
            @Override // defpackage.o26
            public final Object t(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i3 = i;
                wef wefVar = wef.a;
                ly lyVar = (ly) obj2;
                switch (i3) {
                    case 0:
                        da9 da9Var = (da9) obj3;
                        int iIntValue = ((Integer) obj5).intValue();
                        lyVar.getClass();
                        da9Var.getClass();
                        g.a(q7bVar, da9Var, null, true, (l46) obj4, (iIntValue & 112) | 3456);
                        break;
                    case 1:
                        da9 da9Var2 = (da9) obj3;
                        int iIntValue2 = ((Integer) obj5).intValue();
                        lyVar.getClass();
                        da9Var2.getClass();
                        AppRoute.FollowUpConversation followUpConversation = (AppRoute.FollowUpConversation) vfh.S(da9Var2, job.a.b(AppRoute.FollowUpConversation.class));
                        q7b q7bVar2 = q7bVar;
                        g.a(q7bVar2, da9Var2, new w27(followUpConversation.getParentChatId(), followUpConversation.getTriggerMessageId(), followUpConversation.getPrefilledQuestion(), followUpConversation.getChildChatId()), false, (l46) obj4, (iIntValue2 & 112) | 3072);
                        break;
                    default:
                        l46 l46Var = (l46) obj4;
                        ib8.u((Integer) obj5, lyVar, (da9) obj3);
                        um6.b(q7bVar, l46Var, 0);
                        qn4.o(0, l46Var);
                        break;
                }
                return wefVar;
            }
        }, true, 1800623289);
        kob kobVar = job.a;
        em7 em7VarB = kobVar.b(AppRoute.Main.class);
        qu4 qu4Var = qu4.a;
        rs0.o(za9Var, em7VarB, qu4Var, null, null, null, null, dd2Var);
        final int i3 = 0;
        rs0.o(za9Var, kobVar.b(AppRoute.Conversation.class), qu4Var, null, null, null, null, new dd2(new o26() { // from class: nr2
            @Override // defpackage.o26
            public final Object t(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i4 = i3;
                wef wefVar = wef.a;
                ly lyVar = (ly) obj2;
                switch (i4) {
                    case 0:
                        da9 da9Var = (da9) obj3;
                        int iIntValue = ((Integer) obj5).intValue();
                        lyVar.getClass();
                        da9Var.getClass();
                        g.a(q7bVar, da9Var, null, true, (l46) obj4, (iIntValue & 112) | 3456);
                        break;
                    case 1:
                        da9 da9Var2 = (da9) obj3;
                        int iIntValue2 = ((Integer) obj5).intValue();
                        lyVar.getClass();
                        da9Var2.getClass();
                        AppRoute.FollowUpConversation followUpConversation = (AppRoute.FollowUpConversation) vfh.S(da9Var2, job.a.b(AppRoute.FollowUpConversation.class));
                        q7b q7bVar2 = q7bVar;
                        g.a(q7bVar2, da9Var2, new w27(followUpConversation.getParentChatId(), followUpConversation.getTriggerMessageId(), followUpConversation.getPrefilledQuestion(), followUpConversation.getChildChatId()), false, (l46) obj4, (iIntValue2 & 112) | 3072);
                        break;
                    default:
                        l46 l46Var = (l46) obj4;
                        ib8.u((Integer) obj5, lyVar, (da9) obj3);
                        um6.b(q7bVar, l46Var, 0);
                        qn4.o(0, l46Var);
                        break;
                }
                return wefVar;
            }
        }, true, 782166203));
        rs0.o(za9Var, kobVar.b(AppRoute.FollowUpConversation.class), qu4Var, null, null, null, null, new dd2(new o26() { // from class: nr2
            @Override // defpackage.o26
            public final Object t(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i4 = i2;
                wef wefVar = wef.a;
                ly lyVar = (ly) obj2;
                switch (i4) {
                    case 0:
                        da9 da9Var = (da9) obj3;
                        int iIntValue = ((Integer) obj5).intValue();
                        lyVar.getClass();
                        da9Var.getClass();
                        g.a(q7bVar, da9Var, null, true, (l46) obj4, (iIntValue & 112) | 3456);
                        break;
                    case 1:
                        da9 da9Var2 = (da9) obj3;
                        int iIntValue2 = ((Integer) obj5).intValue();
                        lyVar.getClass();
                        da9Var2.getClass();
                        AppRoute.FollowUpConversation followUpConversation = (AppRoute.FollowUpConversation) vfh.S(da9Var2, job.a.b(AppRoute.FollowUpConversation.class));
                        q7b q7bVar2 = q7bVar;
                        g.a(q7bVar2, da9Var2, new w27(followUpConversation.getParentChatId(), followUpConversation.getTriggerMessageId(), followUpConversation.getPrefilledQuestion(), followUpConversation.getChildChatId()), false, (l46) obj4, (iIntValue2 & 112) | 3072);
                        break;
                    default:
                        l46 l46Var = (l46) obj4;
                        ib8.u((Integer) obj5, lyVar, (da9) obj3);
                        um6.b(q7bVar, l46Var, 0);
                        qn4.o(0, l46Var);
                        break;
                }
                return wefVar;
            }
        }, true, 997287076));
        final int i4 = 6;
        rs0.o(za9Var, kobVar.b(AppRoute.AllHistory.class), qu4Var, null, null, null, null, new dd2(new p50(i4, q7bVar, cb9Var), true, -1512951262));
        final byte b = 0 == true ? 1 : 0;
        rs0.o(za9Var, kobVar.b(AppRoute.MyAccount.class), qu4Var, null, null, null, null, new dd2(new o26() { // from class: m7b
            /* JADX WARN: Code duplicated, block: B:63:0x020f  */
            @Override // defpackage.o26
            public final Object t(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i5 = b;
                boolean z = false;
                wef wefVar = wef.a;
                i8c i8cVar = sf2.a;
                cb9 cb9Var2 = cb9Var;
                switch (i5) {
                    case 0:
                        l46 l46Var = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        LocalDateTime localDateTimeNow = LocalDateTime.now(ZoneId.systemDefault());
                        localDateTimeNow.getClass();
                        hs3 hs3Var = xqa.u;
                        if (((Boolean) z5c.I(nu4.a, new x10(hs3Var.a, hs3Var.b, null))).booleanValue()) {
                            z = true;
                        } else {
                            LocalDateTime localDateTimeOf = LocalDateTime.of(2025, 12, 22, 0, 0);
                            LocalDateTime localDateTimeOf2 = LocalDateTime.of(2026, 12, 31, 23, 59);
                            if (!localDateTimeNow.isBefore(localDateTimeOf) && !localDateTimeNow.isAfter(localDateTimeOf2)) {
                                z = true;
                            }
                        }
                        boolean z2 = z;
                        LocalDateTime localDateTime = xs5.a;
                        mic.a.getClass();
                        mic micVar = mic.b;
                        yic yicVarC = rmc.c(micVar);
                        FourSeasonsEntry.Companion.getClass();
                        FourSeasonsEntry fourSeasonsEntryA = ss5.a(micVar, "account");
                        boolean zI = l46Var.i(cb9Var2);
                        Object objR = l46Var.R();
                        if (zI || objR == i8cVar) {
                            objR = new n7b(cb9Var2, 17);
                            l46Var.p0(objR);
                        }
                        x16 x16Var = (x16) objR;
                        boolean zI2 = l46Var.i(cb9Var2);
                        Object objR2 = l46Var.R();
                        if (zI2 || objR2 == i8cVar) {
                            objR2 = new n7b(cb9Var2, 18);
                            l46Var.p0(objR2);
                        }
                        x16 x16Var2 = (x16) objR2;
                        boolean zI3 = l46Var.i(cb9Var2) | l46Var.i(fourSeasonsEntryA);
                        Object objR3 = l46Var.R();
                        if (zI3 || objR3 == i8cVar) {
                            objR3 = new ek9(22, cb9Var2, fourSeasonsEntryA);
                            l46Var.p0(objR3);
                        }
                        yic yicVar = yic.c;
                        b4d.k(x16Var, z2, x16Var2, yicVarC, (x16) objR3, l46Var, 0);
                        break;
                    case 1:
                        l46 l46Var2 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI4 = l46Var2.i(cb9Var2);
                        Object objR4 = l46Var2.R();
                        if (zI4 || objR4 == i8cVar) {
                            objR4 = new r14(cb9Var2, 16);
                            l46Var2.p0(objR4);
                        }
                        pi9.a((x16) objR4, l46Var2, 0);
                        break;
                    case 2:
                        l46 l46Var3 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI5 = l46Var3.i(cb9Var2);
                        Object objR5 = l46Var3.R();
                        if (zI5 || objR5 == i8cVar) {
                            objR5 = new r14(cb9Var2, 17);
                            l46Var3.p0(objR5);
                        }
                        qn4.m((x16) objR5, null, l46Var3, 0);
                        break;
                    case 3:
                        l46 l46Var4 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI6 = l46Var4.i(cb9Var2);
                        Object objR6 = l46Var4.R();
                        if (zI6 || objR6 == i8cVar) {
                            objR6 = new r14(cb9Var2, 18);
                            l46Var4.p0(objR6);
                        }
                        hkg.I((x16) objR6, l46Var4, 0);
                        break;
                    case 4:
                        l46 l46Var5 = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        boolean zI7 = l46Var5.i(cb9Var2);
                        Object objR7 = l46Var5.R();
                        if (zI7 || objR7 == i8cVar) {
                            objR7 = new n7b(cb9Var2, 6);
                            l46Var5.p0(objR7);
                        }
                        x16 x16Var3 = (x16) objR7;
                        boolean zI8 = l46Var5.i(cb9Var2);
                        Object objR8 = l46Var5.R();
                        if (zI8 || objR8 == i8cVar) {
                            objR8 = new n7b(cb9Var2, 7);
                            l46Var5.p0(objR8);
                        }
                        x16 x16Var4 = (x16) objR8;
                        boolean zI9 = l46Var5.i(cb9Var2);
                        Object objR9 = l46Var5.R();
                        if (zI9 || objR9 == i8cVar) {
                            objR9 = new n7b(cb9Var2, 8);
                            l46Var5.p0(objR9);
                        }
                        x16 x16Var5 = (x16) objR9;
                        boolean zI10 = l46Var5.i(cb9Var2);
                        Object objR10 = l46Var5.R();
                        if (zI10 || objR10 == i8cVar) {
                            objR10 = new mr2(cb9Var2, 5);
                            l46Var5.p0(objR10);
                        }
                        pa6.o(x16Var3, x16Var4, x16Var5, (a26) objR10, l46Var5, 0);
                        break;
                    case 5:
                        l46 l46Var6 = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        boolean zI11 = l46Var6.i(cb9Var2);
                        Object objR11 = l46Var6.R();
                        if (zI11 || objR11 == i8cVar) {
                            objR11 = new n7b(cb9Var2, 22);
                            l46Var6.p0(objR11);
                        }
                        x16 x16Var6 = (x16) objR11;
                        boolean zI12 = l46Var6.i(cb9Var2);
                        Object objR12 = l46Var6.R();
                        if (zI12 || objR12 == i8cVar) {
                            objR12 = new s14(cb9Var2);
                            l46Var6.p0(objR12);
                        }
                        pa6.k(x16Var6, (l26) objR12, l46Var6, 0);
                        break;
                    default:
                        da9 da9Var = (da9) obj3;
                        l46 l46Var7 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, da9Var);
                        AppRoute.GiftCardDetail giftCardDetail = (AppRoute.GiftCardDetail) vfh.S(da9Var, job.a.b(AppRoute.GiftCardDetail.class));
                        String cardId = giftCardDetail.getCardId();
                        GiftCardPerspective perspective = giftCardDetail.getPerspective();
                        boolean purchaseSuccess = giftCardDetail.getPurchaseSuccess();
                        boolean zI13 = l46Var7.i(cb9Var2);
                        Object objR13 = l46Var7.R();
                        if (zI13 || objR13 == i8cVar) {
                            objR13 = new r14(cb9Var2, 29);
                            l46Var7.p0(objR13);
                        }
                        pa6.d(cardId, perspective, purchaseSuccess, (x16) objR13, l46Var7, 0);
                        break;
                }
                return wefVar;
            }
        }, true, -1754648575));
        rs0.o(za9Var, kobVar.b(AppRoute.FriendCoupon.class), qu4Var, null, null, null, null, new dd2(new o26() { // from class: m7b
            /* JADX WARN: Code duplicated, block: B:63:0x020f  */
            @Override // defpackage.o26
            public final Object t(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i5 = i;
                boolean z = false;
                wef wefVar = wef.a;
                i8c i8cVar = sf2.a;
                cb9 cb9Var2 = cb9Var;
                switch (i5) {
                    case 0:
                        l46 l46Var = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        LocalDateTime localDateTimeNow = LocalDateTime.now(ZoneId.systemDefault());
                        localDateTimeNow.getClass();
                        hs3 hs3Var = xqa.u;
                        if (((Boolean) z5c.I(nu4.a, new x10(hs3Var.a, hs3Var.b, null))).booleanValue()) {
                            z = true;
                        } else {
                            LocalDateTime localDateTimeOf = LocalDateTime.of(2025, 12, 22, 0, 0);
                            LocalDateTime localDateTimeOf2 = LocalDateTime.of(2026, 12, 31, 23, 59);
                            if (!localDateTimeNow.isBefore(localDateTimeOf) && !localDateTimeNow.isAfter(localDateTimeOf2)) {
                                z = true;
                            }
                        }
                        boolean z2 = z;
                        LocalDateTime localDateTime = xs5.a;
                        mic.a.getClass();
                        mic micVar = mic.b;
                        yic yicVarC = rmc.c(micVar);
                        FourSeasonsEntry.Companion.getClass();
                        FourSeasonsEntry fourSeasonsEntryA = ss5.a(micVar, "account");
                        boolean zI = l46Var.i(cb9Var2);
                        Object objR = l46Var.R();
                        if (zI || objR == i8cVar) {
                            objR = new n7b(cb9Var2, 17);
                            l46Var.p0(objR);
                        }
                        x16 x16Var = (x16) objR;
                        boolean zI2 = l46Var.i(cb9Var2);
                        Object objR2 = l46Var.R();
                        if (zI2 || objR2 == i8cVar) {
                            objR2 = new n7b(cb9Var2, 18);
                            l46Var.p0(objR2);
                        }
                        x16 x16Var2 = (x16) objR2;
                        boolean zI3 = l46Var.i(cb9Var2) | l46Var.i(fourSeasonsEntryA);
                        Object objR3 = l46Var.R();
                        if (zI3 || objR3 == i8cVar) {
                            objR3 = new ek9(22, cb9Var2, fourSeasonsEntryA);
                            l46Var.p0(objR3);
                        }
                        yic yicVar = yic.c;
                        b4d.k(x16Var, z2, x16Var2, yicVarC, (x16) objR3, l46Var, 0);
                        break;
                    case 1:
                        l46 l46Var2 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI4 = l46Var2.i(cb9Var2);
                        Object objR4 = l46Var2.R();
                        if (zI4 || objR4 == i8cVar) {
                            objR4 = new r14(cb9Var2, 16);
                            l46Var2.p0(objR4);
                        }
                        pi9.a((x16) objR4, l46Var2, 0);
                        break;
                    case 2:
                        l46 l46Var3 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI5 = l46Var3.i(cb9Var2);
                        Object objR5 = l46Var3.R();
                        if (zI5 || objR5 == i8cVar) {
                            objR5 = new r14(cb9Var2, 17);
                            l46Var3.p0(objR5);
                        }
                        qn4.m((x16) objR5, null, l46Var3, 0);
                        break;
                    case 3:
                        l46 l46Var4 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI6 = l46Var4.i(cb9Var2);
                        Object objR6 = l46Var4.R();
                        if (zI6 || objR6 == i8cVar) {
                            objR6 = new r14(cb9Var2, 18);
                            l46Var4.p0(objR6);
                        }
                        hkg.I((x16) objR6, l46Var4, 0);
                        break;
                    case 4:
                        l46 l46Var5 = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        boolean zI7 = l46Var5.i(cb9Var2);
                        Object objR7 = l46Var5.R();
                        if (zI7 || objR7 == i8cVar) {
                            objR7 = new n7b(cb9Var2, 6);
                            l46Var5.p0(objR7);
                        }
                        x16 x16Var3 = (x16) objR7;
                        boolean zI8 = l46Var5.i(cb9Var2);
                        Object objR8 = l46Var5.R();
                        if (zI8 || objR8 == i8cVar) {
                            objR8 = new n7b(cb9Var2, 7);
                            l46Var5.p0(objR8);
                        }
                        x16 x16Var4 = (x16) objR8;
                        boolean zI9 = l46Var5.i(cb9Var2);
                        Object objR9 = l46Var5.R();
                        if (zI9 || objR9 == i8cVar) {
                            objR9 = new n7b(cb9Var2, 8);
                            l46Var5.p0(objR9);
                        }
                        x16 x16Var5 = (x16) objR9;
                        boolean zI10 = l46Var5.i(cb9Var2);
                        Object objR10 = l46Var5.R();
                        if (zI10 || objR10 == i8cVar) {
                            objR10 = new mr2(cb9Var2, 5);
                            l46Var5.p0(objR10);
                        }
                        pa6.o(x16Var3, x16Var4, x16Var5, (a26) objR10, l46Var5, 0);
                        break;
                    case 5:
                        l46 l46Var6 = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        boolean zI11 = l46Var6.i(cb9Var2);
                        Object objR11 = l46Var6.R();
                        if (zI11 || objR11 == i8cVar) {
                            objR11 = new n7b(cb9Var2, 22);
                            l46Var6.p0(objR11);
                        }
                        x16 x16Var6 = (x16) objR11;
                        boolean zI12 = l46Var6.i(cb9Var2);
                        Object objR12 = l46Var6.R();
                        if (zI12 || objR12 == i8cVar) {
                            objR12 = new s14(cb9Var2);
                            l46Var6.p0(objR12);
                        }
                        pa6.k(x16Var6, (l26) objR12, l46Var6, 0);
                        break;
                    default:
                        da9 da9Var = (da9) obj3;
                        l46 l46Var7 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, da9Var);
                        AppRoute.GiftCardDetail giftCardDetail = (AppRoute.GiftCardDetail) vfh.S(da9Var, job.a.b(AppRoute.GiftCardDetail.class));
                        String cardId = giftCardDetail.getCardId();
                        GiftCardPerspective perspective = giftCardDetail.getPerspective();
                        boolean purchaseSuccess = giftCardDetail.getPurchaseSuccess();
                        boolean zI13 = l46Var7.i(cb9Var2);
                        Object objR13 = l46Var7.R();
                        if (zI13 || objR13 == i8cVar) {
                            objR13 = new r14(cb9Var2, 29);
                            l46Var7.p0(objR13);
                        }
                        pa6.d(cardId, perspective, purchaseSuccess, (x16) objR13, l46Var7, 0);
                        break;
                }
                return wefVar;
            }
        }, true, -1996345888));
        final int i5 = 3;
        final int i6 = 8;
        rs0.t(za9Var, kobVar.b(AppRoute.FriendCouponGrantPreview.class), new s84((boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), i5), new dd2(new n26() { // from class: r4a
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:193:0x0590  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v8 java.lang.Object, still in use, count: 2, list:
                  (r9v8 java.lang.Object) from 0x0274: PHI (r9 I:??) = (r9v6 java.lang.Object), (r9v8 java.lang.Object) binds: [B:88:0x0273, B:201:0x0274] A[DONT_GENERATE, DONT_INLINE]
                  (r9v8 java.lang.Object) from 0x026c: CHECK_CAST (android.content.Context) (r9v8 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            @Override // defpackage.n26
            public final java.lang.Object m(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
                /*
                    Method dump skipped, instruction units count: 1556
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r4a.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, true, 629671542));
        rs0.o(za9Var, kobVar.b(AppRoute.AutoRenew.class), qu4Var, null, null, null, null, new dd2(new o26() { // from class: m7b
            /* JADX WARN: Code duplicated, block: B:63:0x020f  */
            @Override // defpackage.o26
            public final Object t(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i7 = i5;
                boolean z = false;
                wef wefVar = wef.a;
                i8c i8cVar = sf2.a;
                cb9 cb9Var2 = cb9Var;
                switch (i7) {
                    case 0:
                        l46 l46Var = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        LocalDateTime localDateTimeNow = LocalDateTime.now(ZoneId.systemDefault());
                        localDateTimeNow.getClass();
                        hs3 hs3Var = xqa.u;
                        if (((Boolean) z5c.I(nu4.a, new x10(hs3Var.a, hs3Var.b, null))).booleanValue()) {
                            z = true;
                        } else {
                            LocalDateTime localDateTimeOf = LocalDateTime.of(2025, 12, 22, 0, 0);
                            LocalDateTime localDateTimeOf2 = LocalDateTime.of(2026, 12, 31, 23, 59);
                            if (!localDateTimeNow.isBefore(localDateTimeOf) && !localDateTimeNow.isAfter(localDateTimeOf2)) {
                                z = true;
                            }
                        }
                        boolean z2 = z;
                        LocalDateTime localDateTime = xs5.a;
                        mic.a.getClass();
                        mic micVar = mic.b;
                        yic yicVarC = rmc.c(micVar);
                        FourSeasonsEntry.Companion.getClass();
                        FourSeasonsEntry fourSeasonsEntryA = ss5.a(micVar, "account");
                        boolean zI = l46Var.i(cb9Var2);
                        Object objR = l46Var.R();
                        if (zI || objR == i8cVar) {
                            objR = new n7b(cb9Var2, 17);
                            l46Var.p0(objR);
                        }
                        x16 x16Var = (x16) objR;
                        boolean zI2 = l46Var.i(cb9Var2);
                        Object objR2 = l46Var.R();
                        if (zI2 || objR2 == i8cVar) {
                            objR2 = new n7b(cb9Var2, 18);
                            l46Var.p0(objR2);
                        }
                        x16 x16Var2 = (x16) objR2;
                        boolean zI3 = l46Var.i(cb9Var2) | l46Var.i(fourSeasonsEntryA);
                        Object objR3 = l46Var.R();
                        if (zI3 || objR3 == i8cVar) {
                            objR3 = new ek9(22, cb9Var2, fourSeasonsEntryA);
                            l46Var.p0(objR3);
                        }
                        yic yicVar = yic.c;
                        b4d.k(x16Var, z2, x16Var2, yicVarC, (x16) objR3, l46Var, 0);
                        break;
                    case 1:
                        l46 l46Var2 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI4 = l46Var2.i(cb9Var2);
                        Object objR4 = l46Var2.R();
                        if (zI4 || objR4 == i8cVar) {
                            objR4 = new r14(cb9Var2, 16);
                            l46Var2.p0(objR4);
                        }
                        pi9.a((x16) objR4, l46Var2, 0);
                        break;
                    case 2:
                        l46 l46Var3 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI5 = l46Var3.i(cb9Var2);
                        Object objR5 = l46Var3.R();
                        if (zI5 || objR5 == i8cVar) {
                            objR5 = new r14(cb9Var2, 17);
                            l46Var3.p0(objR5);
                        }
                        qn4.m((x16) objR5, null, l46Var3, 0);
                        break;
                    case 3:
                        l46 l46Var4 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI6 = l46Var4.i(cb9Var2);
                        Object objR6 = l46Var4.R();
                        if (zI6 || objR6 == i8cVar) {
                            objR6 = new r14(cb9Var2, 18);
                            l46Var4.p0(objR6);
                        }
                        hkg.I((x16) objR6, l46Var4, 0);
                        break;
                    case 4:
                        l46 l46Var5 = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        boolean zI7 = l46Var5.i(cb9Var2);
                        Object objR7 = l46Var5.R();
                        if (zI7 || objR7 == i8cVar) {
                            objR7 = new n7b(cb9Var2, 6);
                            l46Var5.p0(objR7);
                        }
                        x16 x16Var3 = (x16) objR7;
                        boolean zI8 = l46Var5.i(cb9Var2);
                        Object objR8 = l46Var5.R();
                        if (zI8 || objR8 == i8cVar) {
                            objR8 = new n7b(cb9Var2, 7);
                            l46Var5.p0(objR8);
                        }
                        x16 x16Var4 = (x16) objR8;
                        boolean zI9 = l46Var5.i(cb9Var2);
                        Object objR9 = l46Var5.R();
                        if (zI9 || objR9 == i8cVar) {
                            objR9 = new n7b(cb9Var2, 8);
                            l46Var5.p0(objR9);
                        }
                        x16 x16Var5 = (x16) objR9;
                        boolean zI10 = l46Var5.i(cb9Var2);
                        Object objR10 = l46Var5.R();
                        if (zI10 || objR10 == i8cVar) {
                            objR10 = new mr2(cb9Var2, 5);
                            l46Var5.p0(objR10);
                        }
                        pa6.o(x16Var3, x16Var4, x16Var5, (a26) objR10, l46Var5, 0);
                        break;
                    case 5:
                        l46 l46Var6 = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        boolean zI11 = l46Var6.i(cb9Var2);
                        Object objR11 = l46Var6.R();
                        if (zI11 || objR11 == i8cVar) {
                            objR11 = new n7b(cb9Var2, 22);
                            l46Var6.p0(objR11);
                        }
                        x16 x16Var6 = (x16) objR11;
                        boolean zI12 = l46Var6.i(cb9Var2);
                        Object objR12 = l46Var6.R();
                        if (zI12 || objR12 == i8cVar) {
                            objR12 = new s14(cb9Var2);
                            l46Var6.p0(objR12);
                        }
                        pa6.k(x16Var6, (l26) objR12, l46Var6, 0);
                        break;
                    default:
                        da9 da9Var = (da9) obj3;
                        l46 l46Var7 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, da9Var);
                        AppRoute.GiftCardDetail giftCardDetail = (AppRoute.GiftCardDetail) vfh.S(da9Var, job.a.b(AppRoute.GiftCardDetail.class));
                        String cardId = giftCardDetail.getCardId();
                        GiftCardPerspective perspective = giftCardDetail.getPerspective();
                        boolean purchaseSuccess = giftCardDetail.getPurchaseSuccess();
                        boolean zI13 = l46Var7.i(cb9Var2);
                        Object objR13 = l46Var7.R();
                        if (zI13 || objR13 == i8cVar) {
                            objR13 = new r14(cb9Var2, 29);
                            l46Var7.p0(objR13);
                        }
                        pa6.d(cardId, perspective, purchaseSuccess, (x16) objR13, l46Var7, 0);
                        break;
                }
                return wefVar;
            }
        }, true, 2056924095));
        final int i7 = 4;
        rs0.o(za9Var, kobVar.b(AppRoute.GiftCardPurchase.class), qu4Var, null, null, null, null, new dd2(new o26() { // from class: m7b
            /* JADX WARN: Code duplicated, block: B:63:0x020f  */
            @Override // defpackage.o26
            public final Object t(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i8 = i7;
                boolean z = false;
                wef wefVar = wef.a;
                i8c i8cVar = sf2.a;
                cb9 cb9Var2 = cb9Var;
                switch (i8) {
                    case 0:
                        l46 l46Var = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        LocalDateTime localDateTimeNow = LocalDateTime.now(ZoneId.systemDefault());
                        localDateTimeNow.getClass();
                        hs3 hs3Var = xqa.u;
                        if (((Boolean) z5c.I(nu4.a, new x10(hs3Var.a, hs3Var.b, null))).booleanValue()) {
                            z = true;
                        } else {
                            LocalDateTime localDateTimeOf = LocalDateTime.of(2025, 12, 22, 0, 0);
                            LocalDateTime localDateTimeOf2 = LocalDateTime.of(2026, 12, 31, 23, 59);
                            if (!localDateTimeNow.isBefore(localDateTimeOf) && !localDateTimeNow.isAfter(localDateTimeOf2)) {
                                z = true;
                            }
                        }
                        boolean z2 = z;
                        LocalDateTime localDateTime = xs5.a;
                        mic.a.getClass();
                        mic micVar = mic.b;
                        yic yicVarC = rmc.c(micVar);
                        FourSeasonsEntry.Companion.getClass();
                        FourSeasonsEntry fourSeasonsEntryA = ss5.a(micVar, "account");
                        boolean zI = l46Var.i(cb9Var2);
                        Object objR = l46Var.R();
                        if (zI || objR == i8cVar) {
                            objR = new n7b(cb9Var2, 17);
                            l46Var.p0(objR);
                        }
                        x16 x16Var = (x16) objR;
                        boolean zI2 = l46Var.i(cb9Var2);
                        Object objR2 = l46Var.R();
                        if (zI2 || objR2 == i8cVar) {
                            objR2 = new n7b(cb9Var2, 18);
                            l46Var.p0(objR2);
                        }
                        x16 x16Var2 = (x16) objR2;
                        boolean zI3 = l46Var.i(cb9Var2) | l46Var.i(fourSeasonsEntryA);
                        Object objR3 = l46Var.R();
                        if (zI3 || objR3 == i8cVar) {
                            objR3 = new ek9(22, cb9Var2, fourSeasonsEntryA);
                            l46Var.p0(objR3);
                        }
                        yic yicVar = yic.c;
                        b4d.k(x16Var, z2, x16Var2, yicVarC, (x16) objR3, l46Var, 0);
                        break;
                    case 1:
                        l46 l46Var2 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI4 = l46Var2.i(cb9Var2);
                        Object objR4 = l46Var2.R();
                        if (zI4 || objR4 == i8cVar) {
                            objR4 = new r14(cb9Var2, 16);
                            l46Var2.p0(objR4);
                        }
                        pi9.a((x16) objR4, l46Var2, 0);
                        break;
                    case 2:
                        l46 l46Var3 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI5 = l46Var3.i(cb9Var2);
                        Object objR5 = l46Var3.R();
                        if (zI5 || objR5 == i8cVar) {
                            objR5 = new r14(cb9Var2, 17);
                            l46Var3.p0(objR5);
                        }
                        qn4.m((x16) objR5, null, l46Var3, 0);
                        break;
                    case 3:
                        l46 l46Var4 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI6 = l46Var4.i(cb9Var2);
                        Object objR6 = l46Var4.R();
                        if (zI6 || objR6 == i8cVar) {
                            objR6 = new r14(cb9Var2, 18);
                            l46Var4.p0(objR6);
                        }
                        hkg.I((x16) objR6, l46Var4, 0);
                        break;
                    case 4:
                        l46 l46Var5 = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        boolean zI7 = l46Var5.i(cb9Var2);
                        Object objR7 = l46Var5.R();
                        if (zI7 || objR7 == i8cVar) {
                            objR7 = new n7b(cb9Var2, 6);
                            l46Var5.p0(objR7);
                        }
                        x16 x16Var3 = (x16) objR7;
                        boolean zI8 = l46Var5.i(cb9Var2);
                        Object objR8 = l46Var5.R();
                        if (zI8 || objR8 == i8cVar) {
                            objR8 = new n7b(cb9Var2, 7);
                            l46Var5.p0(objR8);
                        }
                        x16 x16Var4 = (x16) objR8;
                        boolean zI9 = l46Var5.i(cb9Var2);
                        Object objR9 = l46Var5.R();
                        if (zI9 || objR9 == i8cVar) {
                            objR9 = new n7b(cb9Var2, 8);
                            l46Var5.p0(objR9);
                        }
                        x16 x16Var5 = (x16) objR9;
                        boolean zI10 = l46Var5.i(cb9Var2);
                        Object objR10 = l46Var5.R();
                        if (zI10 || objR10 == i8cVar) {
                            objR10 = new mr2(cb9Var2, 5);
                            l46Var5.p0(objR10);
                        }
                        pa6.o(x16Var3, x16Var4, x16Var5, (a26) objR10, l46Var5, 0);
                        break;
                    case 5:
                        l46 l46Var6 = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        boolean zI11 = l46Var6.i(cb9Var2);
                        Object objR11 = l46Var6.R();
                        if (zI11 || objR11 == i8cVar) {
                            objR11 = new n7b(cb9Var2, 22);
                            l46Var6.p0(objR11);
                        }
                        x16 x16Var6 = (x16) objR11;
                        boolean zI12 = l46Var6.i(cb9Var2);
                        Object objR12 = l46Var6.R();
                        if (zI12 || objR12 == i8cVar) {
                            objR12 = new s14(cb9Var2);
                            l46Var6.p0(objR12);
                        }
                        pa6.k(x16Var6, (l26) objR12, l46Var6, 0);
                        break;
                    default:
                        da9 da9Var = (da9) obj3;
                        l46 l46Var7 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, da9Var);
                        AppRoute.GiftCardDetail giftCardDetail = (AppRoute.GiftCardDetail) vfh.S(da9Var, job.a.b(AppRoute.GiftCardDetail.class));
                        String cardId = giftCardDetail.getCardId();
                        GiftCardPerspective perspective = giftCardDetail.getPerspective();
                        boolean purchaseSuccess = giftCardDetail.getPurchaseSuccess();
                        boolean zI13 = l46Var7.i(cb9Var2);
                        Object objR13 = l46Var7.R();
                        if (zI13 || objR13 == i8cVar) {
                            objR13 = new r14(cb9Var2, 29);
                            l46Var7.p0(objR13);
                        }
                        pa6.d(cardId, perspective, purchaseSuccess, (x16) objR13, l46Var7, 0);
                        break;
                }
                return wefVar;
            }
        }, true, 1815226782));
        final int i8 = 5;
        rs0.o(za9Var, kobVar.b(AppRoute.GiftCardList.class), qu4Var, null, null, null, null, new dd2(new o26() { // from class: m7b
            /* JADX WARN: Code duplicated, block: B:63:0x020f  */
            @Override // defpackage.o26
            public final Object t(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i9 = i8;
                boolean z = false;
                wef wefVar = wef.a;
                i8c i8cVar = sf2.a;
                cb9 cb9Var2 = cb9Var;
                switch (i9) {
                    case 0:
                        l46 l46Var = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        LocalDateTime localDateTimeNow = LocalDateTime.now(ZoneId.systemDefault());
                        localDateTimeNow.getClass();
                        hs3 hs3Var = xqa.u;
                        if (((Boolean) z5c.I(nu4.a, new x10(hs3Var.a, hs3Var.b, null))).booleanValue()) {
                            z = true;
                        } else {
                            LocalDateTime localDateTimeOf = LocalDateTime.of(2025, 12, 22, 0, 0);
                            LocalDateTime localDateTimeOf2 = LocalDateTime.of(2026, 12, 31, 23, 59);
                            if (!localDateTimeNow.isBefore(localDateTimeOf) && !localDateTimeNow.isAfter(localDateTimeOf2)) {
                                z = true;
                            }
                        }
                        boolean z2 = z;
                        LocalDateTime localDateTime = xs5.a;
                        mic.a.getClass();
                        mic micVar = mic.b;
                        yic yicVarC = rmc.c(micVar);
                        FourSeasonsEntry.Companion.getClass();
                        FourSeasonsEntry fourSeasonsEntryA = ss5.a(micVar, "account");
                        boolean zI = l46Var.i(cb9Var2);
                        Object objR = l46Var.R();
                        if (zI || objR == i8cVar) {
                            objR = new n7b(cb9Var2, 17);
                            l46Var.p0(objR);
                        }
                        x16 x16Var = (x16) objR;
                        boolean zI2 = l46Var.i(cb9Var2);
                        Object objR2 = l46Var.R();
                        if (zI2 || objR2 == i8cVar) {
                            objR2 = new n7b(cb9Var2, 18);
                            l46Var.p0(objR2);
                        }
                        x16 x16Var2 = (x16) objR2;
                        boolean zI3 = l46Var.i(cb9Var2) | l46Var.i(fourSeasonsEntryA);
                        Object objR3 = l46Var.R();
                        if (zI3 || objR3 == i8cVar) {
                            objR3 = new ek9(22, cb9Var2, fourSeasonsEntryA);
                            l46Var.p0(objR3);
                        }
                        yic yicVar = yic.c;
                        b4d.k(x16Var, z2, x16Var2, yicVarC, (x16) objR3, l46Var, 0);
                        break;
                    case 1:
                        l46 l46Var2 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI4 = l46Var2.i(cb9Var2);
                        Object objR4 = l46Var2.R();
                        if (zI4 || objR4 == i8cVar) {
                            objR4 = new r14(cb9Var2, 16);
                            l46Var2.p0(objR4);
                        }
                        pi9.a((x16) objR4, l46Var2, 0);
                        break;
                    case 2:
                        l46 l46Var3 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI5 = l46Var3.i(cb9Var2);
                        Object objR5 = l46Var3.R();
                        if (zI5 || objR5 == i8cVar) {
                            objR5 = new r14(cb9Var2, 17);
                            l46Var3.p0(objR5);
                        }
                        qn4.m((x16) objR5, null, l46Var3, 0);
                        break;
                    case 3:
                        l46 l46Var4 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI6 = l46Var4.i(cb9Var2);
                        Object objR6 = l46Var4.R();
                        if (zI6 || objR6 == i8cVar) {
                            objR6 = new r14(cb9Var2, 18);
                            l46Var4.p0(objR6);
                        }
                        hkg.I((x16) objR6, l46Var4, 0);
                        break;
                    case 4:
                        l46 l46Var5 = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        boolean zI7 = l46Var5.i(cb9Var2);
                        Object objR7 = l46Var5.R();
                        if (zI7 || objR7 == i8cVar) {
                            objR7 = new n7b(cb9Var2, 6);
                            l46Var5.p0(objR7);
                        }
                        x16 x16Var3 = (x16) objR7;
                        boolean zI8 = l46Var5.i(cb9Var2);
                        Object objR8 = l46Var5.R();
                        if (zI8 || objR8 == i8cVar) {
                            objR8 = new n7b(cb9Var2, 7);
                            l46Var5.p0(objR8);
                        }
                        x16 x16Var4 = (x16) objR8;
                        boolean zI9 = l46Var5.i(cb9Var2);
                        Object objR9 = l46Var5.R();
                        if (zI9 || objR9 == i8cVar) {
                            objR9 = new n7b(cb9Var2, 8);
                            l46Var5.p0(objR9);
                        }
                        x16 x16Var5 = (x16) objR9;
                        boolean zI10 = l46Var5.i(cb9Var2);
                        Object objR10 = l46Var5.R();
                        if (zI10 || objR10 == i8cVar) {
                            objR10 = new mr2(cb9Var2, 5);
                            l46Var5.p0(objR10);
                        }
                        pa6.o(x16Var3, x16Var4, x16Var5, (a26) objR10, l46Var5, 0);
                        break;
                    case 5:
                        l46 l46Var6 = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        boolean zI11 = l46Var6.i(cb9Var2);
                        Object objR11 = l46Var6.R();
                        if (zI11 || objR11 == i8cVar) {
                            objR11 = new n7b(cb9Var2, 22);
                            l46Var6.p0(objR11);
                        }
                        x16 x16Var6 = (x16) objR11;
                        boolean zI12 = l46Var6.i(cb9Var2);
                        Object objR12 = l46Var6.R();
                        if (zI12 || objR12 == i8cVar) {
                            objR12 = new s14(cb9Var2);
                            l46Var6.p0(objR12);
                        }
                        pa6.k(x16Var6, (l26) objR12, l46Var6, 0);
                        break;
                    default:
                        da9 da9Var = (da9) obj3;
                        l46 l46Var7 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, da9Var);
                        AppRoute.GiftCardDetail giftCardDetail = (AppRoute.GiftCardDetail) vfh.S(da9Var, job.a.b(AppRoute.GiftCardDetail.class));
                        String cardId = giftCardDetail.getCardId();
                        GiftCardPerspective perspective = giftCardDetail.getPerspective();
                        boolean purchaseSuccess = giftCardDetail.getPurchaseSuccess();
                        boolean zI13 = l46Var7.i(cb9Var2);
                        Object objR13 = l46Var7.R();
                        if (zI13 || objR13 == i8cVar) {
                            objR13 = new r14(cb9Var2, 29);
                            l46Var7.p0(objR13);
                        }
                        pa6.d(cardId, perspective, purchaseSuccess, (x16) objR13, l46Var7, 0);
                        break;
                }
                return wefVar;
            }
        }, true, 1573529469));
        rs0.o(za9Var, kobVar.b(AppRoute.GiftCardDetail.class), qu4Var, null, null, null, null, new dd2(new o26() { // from class: m7b
            /* JADX WARN: Code duplicated, block: B:63:0x020f  */
            @Override // defpackage.o26
            public final Object t(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i9 = i4;
                boolean z = false;
                wef wefVar = wef.a;
                i8c i8cVar = sf2.a;
                cb9 cb9Var2 = cb9Var;
                switch (i9) {
                    case 0:
                        l46 l46Var = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        LocalDateTime localDateTimeNow = LocalDateTime.now(ZoneId.systemDefault());
                        localDateTimeNow.getClass();
                        hs3 hs3Var = xqa.u;
                        if (((Boolean) z5c.I(nu4.a, new x10(hs3Var.a, hs3Var.b, null))).booleanValue()) {
                            z = true;
                        } else {
                            LocalDateTime localDateTimeOf = LocalDateTime.of(2025, 12, 22, 0, 0);
                            LocalDateTime localDateTimeOf2 = LocalDateTime.of(2026, 12, 31, 23, 59);
                            if (!localDateTimeNow.isBefore(localDateTimeOf) && !localDateTimeNow.isAfter(localDateTimeOf2)) {
                                z = true;
                            }
                        }
                        boolean z2 = z;
                        LocalDateTime localDateTime = xs5.a;
                        mic.a.getClass();
                        mic micVar = mic.b;
                        yic yicVarC = rmc.c(micVar);
                        FourSeasonsEntry.Companion.getClass();
                        FourSeasonsEntry fourSeasonsEntryA = ss5.a(micVar, "account");
                        boolean zI = l46Var.i(cb9Var2);
                        Object objR = l46Var.R();
                        if (zI || objR == i8cVar) {
                            objR = new n7b(cb9Var2, 17);
                            l46Var.p0(objR);
                        }
                        x16 x16Var = (x16) objR;
                        boolean zI2 = l46Var.i(cb9Var2);
                        Object objR2 = l46Var.R();
                        if (zI2 || objR2 == i8cVar) {
                            objR2 = new n7b(cb9Var2, 18);
                            l46Var.p0(objR2);
                        }
                        x16 x16Var2 = (x16) objR2;
                        boolean zI3 = l46Var.i(cb9Var2) | l46Var.i(fourSeasonsEntryA);
                        Object objR3 = l46Var.R();
                        if (zI3 || objR3 == i8cVar) {
                            objR3 = new ek9(22, cb9Var2, fourSeasonsEntryA);
                            l46Var.p0(objR3);
                        }
                        yic yicVar = yic.c;
                        b4d.k(x16Var, z2, x16Var2, yicVarC, (x16) objR3, l46Var, 0);
                        break;
                    case 1:
                        l46 l46Var2 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI4 = l46Var2.i(cb9Var2);
                        Object objR4 = l46Var2.R();
                        if (zI4 || objR4 == i8cVar) {
                            objR4 = new r14(cb9Var2, 16);
                            l46Var2.p0(objR4);
                        }
                        pi9.a((x16) objR4, l46Var2, 0);
                        break;
                    case 2:
                        l46 l46Var3 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI5 = l46Var3.i(cb9Var2);
                        Object objR5 = l46Var3.R();
                        if (zI5 || objR5 == i8cVar) {
                            objR5 = new r14(cb9Var2, 17);
                            l46Var3.p0(objR5);
                        }
                        qn4.m((x16) objR5, null, l46Var3, 0);
                        break;
                    case 3:
                        l46 l46Var4 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI6 = l46Var4.i(cb9Var2);
                        Object objR6 = l46Var4.R();
                        if (zI6 || objR6 == i8cVar) {
                            objR6 = new r14(cb9Var2, 18);
                            l46Var4.p0(objR6);
                        }
                        hkg.I((x16) objR6, l46Var4, 0);
                        break;
                    case 4:
                        l46 l46Var5 = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        boolean zI7 = l46Var5.i(cb9Var2);
                        Object objR7 = l46Var5.R();
                        if (zI7 || objR7 == i8cVar) {
                            objR7 = new n7b(cb9Var2, 6);
                            l46Var5.p0(objR7);
                        }
                        x16 x16Var3 = (x16) objR7;
                        boolean zI8 = l46Var5.i(cb9Var2);
                        Object objR8 = l46Var5.R();
                        if (zI8 || objR8 == i8cVar) {
                            objR8 = new n7b(cb9Var2, 7);
                            l46Var5.p0(objR8);
                        }
                        x16 x16Var4 = (x16) objR8;
                        boolean zI9 = l46Var5.i(cb9Var2);
                        Object objR9 = l46Var5.R();
                        if (zI9 || objR9 == i8cVar) {
                            objR9 = new n7b(cb9Var2, 8);
                            l46Var5.p0(objR9);
                        }
                        x16 x16Var5 = (x16) objR9;
                        boolean zI10 = l46Var5.i(cb9Var2);
                        Object objR10 = l46Var5.R();
                        if (zI10 || objR10 == i8cVar) {
                            objR10 = new mr2(cb9Var2, 5);
                            l46Var5.p0(objR10);
                        }
                        pa6.o(x16Var3, x16Var4, x16Var5, (a26) objR10, l46Var5, 0);
                        break;
                    case 5:
                        l46 l46Var6 = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        boolean zI11 = l46Var6.i(cb9Var2);
                        Object objR11 = l46Var6.R();
                        if (zI11 || objR11 == i8cVar) {
                            objR11 = new n7b(cb9Var2, 22);
                            l46Var6.p0(objR11);
                        }
                        x16 x16Var6 = (x16) objR11;
                        boolean zI12 = l46Var6.i(cb9Var2);
                        Object objR12 = l46Var6.R();
                        if (zI12 || objR12 == i8cVar) {
                            objR12 = new s14(cb9Var2);
                            l46Var6.p0(objR12);
                        }
                        pa6.k(x16Var6, (l26) objR12, l46Var6, 0);
                        break;
                    default:
                        da9 da9Var = (da9) obj3;
                        l46 l46Var7 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, da9Var);
                        AppRoute.GiftCardDetail giftCardDetail = (AppRoute.GiftCardDetail) vfh.S(da9Var, job.a.b(AppRoute.GiftCardDetail.class));
                        String cardId = giftCardDetail.getCardId();
                        GiftCardPerspective perspective = giftCardDetail.getPerspective();
                        boolean purchaseSuccess = giftCardDetail.getPurchaseSuccess();
                        boolean zI13 = l46Var7.i(cb9Var2);
                        Object objR13 = l46Var7.R();
                        if (zI13 || objR13 == i8cVar) {
                            objR13 = new r14(cb9Var2, 29);
                            l46Var7.p0(objR13);
                        }
                        pa6.d(cardId, perspective, purchaseSuccess, (x16) objR13, l46Var7, 0);
                        break;
                }
                return wefVar;
            }
        }, true, 1331832156));
        final int i9 = 9;
        dd2 dd2Var2 = new dd2(new n26() { // from class: r4a
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:193:0x0590  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v8 java.lang.Object, still in use, count: 2, list:
                  (r9v8 java.lang.Object) from 0x0274: PHI (r9 I:??) = (r9v6 java.lang.Object), (r9v8 java.lang.Object) binds: [B:88:0x0273, B:201:0x0274] A[DONT_GENERATE, DONT_INLINE]
                  (r9v8 java.lang.Object) from 0x026c: CHECK_CAST (android.content.Context) (r9v8 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                */
            @Override // defpackage.n26
            public final java.lang.Object m(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
                /*
                    Method dump skipped, instruction units count: 1556
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r4a.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, true, -1516148577);
        final int i10 = 7;
        rs0.t(za9Var, kobVar.b(AppRoute.GiftCardGuidePreview.class), new s84((boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), i10), dd2Var2);
        rs0.o(za9Var, kobVar.b(AppRoute.GiftCardGenerationFailedPreview.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 14), true, 1090134843));
        rs0.o(za9Var, kobVar.b(AppRoute.GiftCardFixture.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 15), true, 848437530));
        rs0.o(za9Var, kobVar.b(AppRoute.FAQ.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 16), true, 914812940));
        rs0.o(za9Var, kobVar.b(AppRoute.ThemeSelection.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 17), true, 673115627));
        rs0.o(za9Var, kobVar.b(AppRoute.WidgetOnboardingRoute.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 18), true, 431418314));
        rs0.o(za9Var, kobVar.b(AppRoute.WidgetGuideTodayDebugRoute.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 19), true, 189721001));
        rs0.o(za9Var, kobVar.b(AppRoute.WidgetGuideQdDebugRoute.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 20), true, -51976312));
        rs0.o(za9Var, kobVar.b(AppRoute.CardDetailQaRoute.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 21), true, -293673625));
        rs0.o(za9Var, kobVar.b(AppRoute.About.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 22), true, -535370938));
        dd2 dd2Var3 = new dd2(new l7b(q7bVar, cb9Var, 0 == true ? 1 : 0), true, -1757845890);
        rs0.t(za9Var, kobVar.b(AppRoute.InputInvitationCode.class), new s84((boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), i10), dd2Var3);
        rs0.o(za9Var, kobVar.b(AppRoute.Invitation.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 23), true, -777068251));
        rs0.o(za9Var, kobVar.b(AppRoute.InAppMessageRoute.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 24), true, -1018765564));
        rs0.o(za9Var, kobVar.b(AppRoute.Dev.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 25), true, -1260462877));
        rs0.o(za9Var, kobVar.b(AppRoute.ExifTest.class), qu4Var, null, null, null, null, cgg.f);
        rs0.o(za9Var, kobVar.b(AppRoute.CardLayoutDebug.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 26), true, 1770433516));
        rs0.o(za9Var, kobVar.b(AppRoute.DailyCardSkinPickerQaRoute.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 27), true, 1528736203));
        rs0.o(za9Var, kobVar.b(AppRoute.NotificationOnboardingQaRoute.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 28), true, 1287038890));
        rs0.o(za9Var, kobVar.b(AppRoute.DailyFortuneReminderQaRoute.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 29), true, 1045341577));
        rs0.t(za9Var, kobVar.b(AppRoute.TomorrowFortuneReminderGuideQaRoute.class), new s84(false, false, false, false, 229), new dd2(new n26() { // from class: r4a
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:193:0x0590  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v8 java.lang.Object, still in use, count: 2, list:
                  (r9v8 java.lang.Object) from 0x0274: PHI (r9 I:??) = (r9v6 java.lang.Object), (r9v8 java.lang.Object) binds: [B:88:0x0273, B:201:0x0274] A[DONT_GENERATE, DONT_INLINE]
                  (r9v8 java.lang.Object) from 0x026c: CHECK_CAST (android.content.Context) (r9v8 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                */
            @Override // defpackage.n26
            public final java.lang.Object m(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
                /*
                    Method dump skipped, instruction units count: 1556
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r4a.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, true, -1999543203));
        dd2 dd2Var4 = new dd2(new l7b(q7bVar, cb9Var, i2), true, 2053726780);
        rs0.t(za9Var, kobVar.b(AppRoute.FreeCountDialog.class), new s84((boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), i10), dd2Var4);
        final int i11 = 5;
        dd2 dd2Var5 = new dd2(new n26() { // from class: r4a
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:193:0x0590  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v8 java.lang.Object, still in use, count: 2, list:
                  (r9v8 java.lang.Object) from 0x0274: PHI (r9 I:??) = (r9v6 java.lang.Object), (r9v8 java.lang.Object) binds: [B:88:0x0273, B:201:0x0274] A[DONT_GENERATE, DONT_INLINE]
                  (r9v8 java.lang.Object) from 0x026c: CHECK_CAST (android.content.Context) (r9v8 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                */
            @Override // defpackage.n26
            public final java.lang.Object m(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
                /*
                    Method dump skipped, instruction units count: 1556
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r4a.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, true, 1812029467);
        rs0.t(za9Var, kobVar.b(AppRoute.NewTarotSkinsDialog.class), new s84((boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), i10), dd2Var5);
        dd2 dd2Var6 = new dd2(new l7b(cb9Var, q7bVar), true, 1570332154);
        rs0.t(za9Var, kobVar.b(AppRoute.MayDayFreeDeckDialog.class), new s84((boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), i10), dd2Var6);
        rs0.o(za9Var, kobVar.b(AppRoute.NotificationSettingsRoute.class), qu4Var, null, null, null, null, new dd2(new o26() { // from class: m7b
            /* JADX WARN: Code duplicated, block: B:63:0x020f  */
            @Override // defpackage.o26
            public final Object t(Object obj2, Object obj3, Object obj4, Object obj5) {
                int i12 = i2;
                boolean z = false;
                wef wefVar = wef.a;
                i8c i8cVar = sf2.a;
                cb9 cb9Var2 = cb9Var;
                switch (i12) {
                    case 0:
                        l46 l46Var = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        LocalDateTime localDateTimeNow = LocalDateTime.now(ZoneId.systemDefault());
                        localDateTimeNow.getClass();
                        hs3 hs3Var = xqa.u;
                        if (((Boolean) z5c.I(nu4.a, new x10(hs3Var.a, hs3Var.b, null))).booleanValue()) {
                            z = true;
                        } else {
                            LocalDateTime localDateTimeOf = LocalDateTime.of(2025, 12, 22, 0, 0);
                            LocalDateTime localDateTimeOf2 = LocalDateTime.of(2026, 12, 31, 23, 59);
                            if (!localDateTimeNow.isBefore(localDateTimeOf) && !localDateTimeNow.isAfter(localDateTimeOf2)) {
                                z = true;
                            }
                        }
                        boolean z2 = z;
                        LocalDateTime localDateTime = xs5.a;
                        mic.a.getClass();
                        mic micVar = mic.b;
                        yic yicVarC = rmc.c(micVar);
                        FourSeasonsEntry.Companion.getClass();
                        FourSeasonsEntry fourSeasonsEntryA = ss5.a(micVar, "account");
                        boolean zI = l46Var.i(cb9Var2);
                        Object objR = l46Var.R();
                        if (zI || objR == i8cVar) {
                            objR = new n7b(cb9Var2, 17);
                            l46Var.p0(objR);
                        }
                        x16 x16Var = (x16) objR;
                        boolean zI2 = l46Var.i(cb9Var2);
                        Object objR2 = l46Var.R();
                        if (zI2 || objR2 == i8cVar) {
                            objR2 = new n7b(cb9Var2, 18);
                            l46Var.p0(objR2);
                        }
                        x16 x16Var2 = (x16) objR2;
                        boolean zI3 = l46Var.i(cb9Var2) | l46Var.i(fourSeasonsEntryA);
                        Object objR3 = l46Var.R();
                        if (zI3 || objR3 == i8cVar) {
                            objR3 = new ek9(22, cb9Var2, fourSeasonsEntryA);
                            l46Var.p0(objR3);
                        }
                        yic yicVar = yic.c;
                        b4d.k(x16Var, z2, x16Var2, yicVarC, (x16) objR3, l46Var, 0);
                        break;
                    case 1:
                        l46 l46Var2 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI4 = l46Var2.i(cb9Var2);
                        Object objR4 = l46Var2.R();
                        if (zI4 || objR4 == i8cVar) {
                            objR4 = new r14(cb9Var2, 16);
                            l46Var2.p0(objR4);
                        }
                        pi9.a((x16) objR4, l46Var2, 0);
                        break;
                    case 2:
                        l46 l46Var3 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI5 = l46Var3.i(cb9Var2);
                        Object objR5 = l46Var3.R();
                        if (zI5 || objR5 == i8cVar) {
                            objR5 = new r14(cb9Var2, 17);
                            l46Var3.p0(objR5);
                        }
                        qn4.m((x16) objR5, null, l46Var3, 0);
                        break;
                    case 3:
                        l46 l46Var4 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, (da9) obj3);
                        boolean zI6 = l46Var4.i(cb9Var2);
                        Object objR6 = l46Var4.R();
                        if (zI6 || objR6 == i8cVar) {
                            objR6 = new r14(cb9Var2, 18);
                            l46Var4.p0(objR6);
                        }
                        hkg.I((x16) objR6, l46Var4, 0);
                        break;
                    case 4:
                        l46 l46Var5 = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        boolean zI7 = l46Var5.i(cb9Var2);
                        Object objR7 = l46Var5.R();
                        if (zI7 || objR7 == i8cVar) {
                            objR7 = new n7b(cb9Var2, 6);
                            l46Var5.p0(objR7);
                        }
                        x16 x16Var3 = (x16) objR7;
                        boolean zI8 = l46Var5.i(cb9Var2);
                        Object objR8 = l46Var5.R();
                        if (zI8 || objR8 == i8cVar) {
                            objR8 = new n7b(cb9Var2, 7);
                            l46Var5.p0(objR8);
                        }
                        x16 x16Var4 = (x16) objR8;
                        boolean zI9 = l46Var5.i(cb9Var2);
                        Object objR9 = l46Var5.R();
                        if (zI9 || objR9 == i8cVar) {
                            objR9 = new n7b(cb9Var2, 8);
                            l46Var5.p0(objR9);
                        }
                        x16 x16Var5 = (x16) objR9;
                        boolean zI10 = l46Var5.i(cb9Var2);
                        Object objR10 = l46Var5.R();
                        if (zI10 || objR10 == i8cVar) {
                            objR10 = new mr2(cb9Var2, 5);
                            l46Var5.p0(objR10);
                        }
                        pa6.o(x16Var3, x16Var4, x16Var5, (a26) objR10, l46Var5, 0);
                        break;
                    case 5:
                        l46 l46Var6 = (l46) obj4;
                        ((Integer) obj5).getClass();
                        ((ly) obj2).getClass();
                        ((da9) obj3).getClass();
                        boolean zI11 = l46Var6.i(cb9Var2);
                        Object objR11 = l46Var6.R();
                        if (zI11 || objR11 == i8cVar) {
                            objR11 = new n7b(cb9Var2, 22);
                            l46Var6.p0(objR11);
                        }
                        x16 x16Var6 = (x16) objR11;
                        boolean zI12 = l46Var6.i(cb9Var2);
                        Object objR12 = l46Var6.R();
                        if (zI12 || objR12 == i8cVar) {
                            objR12 = new s14(cb9Var2);
                            l46Var6.p0(objR12);
                        }
                        pa6.k(x16Var6, (l26) objR12, l46Var6, 0);
                        break;
                    default:
                        da9 da9Var = (da9) obj3;
                        l46 l46Var7 = (l46) obj4;
                        ib8.u((Integer) obj5, (ly) obj2, da9Var);
                        AppRoute.GiftCardDetail giftCardDetail = (AppRoute.GiftCardDetail) vfh.S(da9Var, job.a.b(AppRoute.GiftCardDetail.class));
                        String cardId = giftCardDetail.getCardId();
                        GiftCardPerspective perspective = giftCardDetail.getPerspective();
                        boolean purchaseSuccess = giftCardDetail.getPurchaseSuccess();
                        boolean zI13 = l46Var7.i(cb9Var2);
                        Object objR13 = l46Var7.R();
                        if (zI13 || objR13 == i8cVar) {
                            objR13 = new r14(cb9Var2, 29);
                            l46Var7.p0(objR13);
                        }
                        pa6.d(cardId, perspective, purchaseSuccess, (x16) objR13, l46Var7, 0);
                        break;
                }
                return wefVar;
            }
        }, true, 803644264));
        final int i12 = 6;
        dd2 dd2Var7 = new dd2(new n26() { // from class: r4a
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:193:0x0590  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v8 java.lang.Object, still in use, count: 2, list:
                  (r9v8 java.lang.Object) from 0x0274: PHI (r9 I:??) = (r9v6 java.lang.Object), (r9v8 java.lang.Object) binds: [B:88:0x0273, B:201:0x0274] A[DONT_GENERATE, DONT_INLINE]
                  (r9v8 java.lang.Object) from 0x026c: CHECK_CAST (android.content.Context) (r9v8 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                */
            @Override // defpackage.n26
            public final java.lang.Object m(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
                /*
                    Method dump skipped, instruction units count: 1556
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r4a.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, true, 1328634841);
        rs0.t(za9Var, kobVar.b(AppRoute.MarketingActivityPopup.class), new s84((boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), i10), dd2Var7);
        dd2 dd2Var8 = new dd2(new n26() { // from class: r4a
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:193:0x0590  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v8 java.lang.Object, still in use, count: 2, list:
                  (r9v8 java.lang.Object) from 0x0274: PHI (r9 I:??) = (r9v6 java.lang.Object), (r9v8 java.lang.Object) binds: [B:88:0x0273, B:201:0x0274] A[DONT_GENERATE, DONT_INLINE]
                  (r9v8 java.lang.Object) from 0x026c: CHECK_CAST (android.content.Context) (r9v8 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                */
            @Override // defpackage.n26
            public final java.lang.Object m(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
                /*
                    Method dump skipped, instruction units count: 1556
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r4a.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, true, 1086937528);
        rs0.t(za9Var, kobVar.b(AppRoute.AnnualFortuneMemberDialog.class), new s84((boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), i10), dd2Var8);
        rs0.o(za9Var, kobVar.b(PaywallRoute.UpgradePaywall.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 11), true, -784927446));
        rs0.o(za9Var, kobVar.b(AppRoute.Paywall.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 12), true, -974221229));
        rs0.o(za9Var, kobVar.b(PaywallRoute.Congratulation.class), qu4Var, null, null, null, null, new dd2(new lr2(cb9Var, 13), true, -2120761742));
        final byte b2 = 0 == true ? 1 : 0;
        dd2 dd2Var9 = new dd2(new n26() { // from class: r4a
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:193:0x0590  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v8 java.lang.Object, still in use, count: 2, list:
                  (r9v8 java.lang.Object) from 0x0274: PHI (r9 I:??) = (r9v6 java.lang.Object), (r9v8 java.lang.Object) binds: [B:88:0x0273, B:201:0x0274] A[DONT_GENERATE, DONT_INLINE]
                  (r9v8 java.lang.Object) from 0x026c: CHECK_CAST (android.content.Context) (r9v8 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                */
            @Override // defpackage.n26
            public final java.lang.Object m(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
                /*
                    Method dump skipped, instruction units count: 1556
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r4a.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, true, 1681665959);
        rs0.t(za9Var, kobVar.b(PaywallRoute.UpgradeWaring.class), new s84((boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), i10), dd2Var9);
        dd2 dd2Var10 = new dd2(new n26() { // from class: r4a
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:193:0x0590  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v8 java.lang.Object, still in use, count: 2, list:
                  (r9v8 java.lang.Object) from 0x0274: PHI (r9 I:??) = (r9v6 java.lang.Object), (r9v8 java.lang.Object) binds: [B:88:0x0273, B:201:0x0274] A[DONT_GENERATE, DONT_INLINE]
                  (r9v8 java.lang.Object) from 0x026c: CHECK_CAST (android.content.Context) (r9v8 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                */
            @Override // defpackage.n26
            public final java.lang.Object m(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
                /*
                    Method dump skipped, instruction units count: 1556
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r4a.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, true, -1399906416);
        rs0.t(za9Var, kobVar.b(PaywallRoute.Paywall520.class), new s84((boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), i10), dd2Var10);
        final int i13 = 2;
        dd2 dd2Var11 = new dd2(new n26() { // from class: r4a
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:193:0x0590  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v8 java.lang.Object, still in use, count: 2, list:
                  (r9v8 java.lang.Object) from 0x0274: PHI (r9 I:??) = (r9v6 java.lang.Object), (r9v8 java.lang.Object) binds: [B:88:0x0273, B:201:0x0274] A[DONT_GENERATE, DONT_INLINE]
                  (r9v8 java.lang.Object) from 0x026c: CHECK_CAST (android.content.Context) (r9v8 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                */
            @Override // defpackage.n26
            public final java.lang.Object m(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
                /*
                    Method dump skipped, instruction units count: 1556
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r4a.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, true, 1748520367);
        rs0.t(za9Var, kobVar.b(PaywallRoute.AddonPaywall.class), new s84((boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), i10), dd2Var11);
        final int i14 = 3;
        dd2 dd2Var12 = new dd2(new n26() { // from class: r4a
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:193:0x0590  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v8 java.lang.Object, still in use, count: 2, list:
                  (r9v8 java.lang.Object) from 0x0274: PHI (r9 I:??) = (r9v6 java.lang.Object), (r9v8 java.lang.Object) binds: [B:88:0x0273, B:201:0x0274] A[DONT_GENERATE, DONT_INLINE]
                  (r9v8 java.lang.Object) from 0x026c: CHECK_CAST (android.content.Context) (r9v8 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                */
            @Override // defpackage.n26
            public final java.lang.Object m(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
                /*
                    Method dump skipped, instruction units count: 1556
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r4a.m(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, true, 601979854);
        rs0.t(za9Var, kobVar.b(PaywallRoute.InterceptPaywall.class), new s84((boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), i10), dd2Var12);
        b21.I(za9Var, kobVar.b(AccountProfileRoute$AccountEntry.class), AccountProfileRoute$AccountProfile.INSTANCE, new z8(cb9Var, i2));
        rs0.o(za9Var, kobVar.b(PersonalityRoutes$PersonalityIntroRoute.class), qu4Var, null, null, null, null, new dd2(new xw5(cb9Var, i2), true, -1367555518));
        rs0.o(za9Var, kobVar.b(PersonalityRoutes$AnalysisHistoryRoute.class), qu4Var, null, null, null, null, new dd2(new xw5(cb9Var, i14), true, -731045461));
        q4a q4aVar = new q4a(16);
        rs0.o(za9Var, kobVar.b(PersonalityRoutes$StartAnalysisRoute.class), qu4Var, null, q4aVar, null, q4aVar, new dd2(new xw5(cb9Var, i7), true, -1023431286));
        rs0.o(za9Var, kobVar.b(PersonalityRoutes$AnalysisQuestionRoute.class), qu4Var, null, null, null, null, new dd2(new xw5(cb9Var, 5), true, -1315817111));
        rs0.o(za9Var, kobVar.b(PersonalityRoutes$Analyzing.class), qu4Var, null, null, null, null, new dd2(new xw5(cb9Var, 6), true, -1608202936));
        rs0.o(za9Var, kobVar.b(PersonalityRoutes$LockedReport.class), qu4Var, null, null, null, null, new dd2(new xw5(cb9Var, i10), true, -1900588761));
        rs0.o(za9Var, kobVar.b(PersonalityRoutes$Report.class), qu4Var, null, null, null, null, new dd2(new xw5(cb9Var, 8), true, 2101992710));
        q4a q4aVar2 = new q4a(17);
        q4a q4aVar3 = new q4a(18);
        int i15 = 2;
        rs0.o(za9Var, kobVar.b(PersonalityRoutes$ShareMyReport.class), qu4Var, q4aVar2, q4aVar3, q4aVar2, q4aVar3, new dd2(new xw5(cb9Var, i15), true, 1809606885));
        dd2 dd2Var13 = new dd2(new b40(cb9Var, i15), true, -1426629121);
        rs0.t(za9Var, kobVar.b(PersonalityRoutes$Share.class), new s84(false, (boolean) (0 == true ? 1 : 0), i10), dd2Var13);
        b21.I(za9Var, kobVar.b(SkinNavigationRoute$SkinGraphEntryRoute.class), new SkinNavigationRoute$SkinMallRoute((boolean) (0 == true ? 1 : 0), (TarotSkinIdentify) null, i14, (rp3) (0 == true ? 1 : 0)), new z8(cb9Var, 22));
        za9 za9Var2 = new za9(za9Var.g, kobVar.b(ExploreTarotRoute$DeckCarousel.class), kobVar.b(ExploreTarotRoute$GraphEntry.class));
        rs0.o(za9Var2, kobVar.b(ExploreTarotRoute$DeckCarousel.class), qu4Var, null, null, null, null, new dd2(new y8(cb9Var, 20), true, 1114986537));
        rs0.o(za9Var2, kobVar.b(ExploreTarotRoute$Detail.class), qu4Var, null, null, null, null, new dd2(new y8(cb9Var, 21), true, -188764256));
        za9Var.j.add(za9Var2.a());
        int i16 = 8;
        Class<cb9> cls = cb9.class;
        o.c(za9Var, cb9Var, new dba(0, cb9Var, cls, "popBackStack", "popBackStack()Z", i16, 4), new wl6(q7bVar, i14));
        rs0.o(za9Var, kobVar.b(QuickDecisionDetailRoute.class), qu4Var, null, null, null, null, new dd2(new p93((Object) new dba(0, cb9Var, cls, "popBackStack", "popBackStack()Z", i16, 5), (Object) new ro2(q7bVar, 8), (ka9) cb9Var, 5), true, -622729222));
        b21.I(za9Var, kobVar.b(AnnualEntry.class), AnnualIntroRoute.INSTANCE, new z8(cb9Var, 5));
        int i17 = 14;
        rs0.o(za9Var, kobVar.b(AnnualReportGeneratingRoute.class), qu4Var, null, null, null, null, new dd2(new y8(cb9Var, i17), true, 1178408479));
        dd2 dd2Var14 = new dd2(new b40(cb9Var, 0 == true ? 1 : 0), true, -558263166);
        rs0.t(za9Var, kobVar.b(AnnualShareURLRoute.class), new s84((boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), i10), dd2Var14);
        int i18 = 12;
        b21.I(za9Var, kobVar.b(FourSeasonsEntry.class), FourSeasonsIntroRoute.INSTANCE, new z8(cb9Var, i18));
        b21.I(za9Var, kobVar.b(SeasonalEntry.class), new SeasonalLoadingRoute(0, "", true, false, 8, (rp3) null), new z8(cb9Var, 19));
        b21.I(za9Var, kobVar.b(SeasonalSpreadEntry.class), SeasonalGenderRoute.INSTANCE, new z8(cb9Var, i17));
        jr2 jr2Var = q7bVar.b;
        jr2Var.getClass();
        j4aVar.getClass();
        rs0.o(za9Var, kobVar.b(PhysicalDeckCameraRoute.class), qu4Var, null, null, null, null, new dd2(new xw5(cb9Var, 9), true, 1943735538));
        final byte b3 = 0 == true ? 1 : 0;
        rs0.o(za9Var, kobVar.b(PhysicalDeckCardConfirmRoute.class), qu4Var, null, null, null, null, new dd2(new o26() { // from class: mda
            @Override // defpackage.o26
            public final Object t(Object obj2, Object obj3, Object obj4, Object obj5) {
                Object dzbVar;
                Boolean bool;
                int iIntValue;
                int i19 = b3;
                wef wefVar = wef.a;
                i8c i8cVar = sf2.a;
                ka9 ka9Var = cb9Var;
                j4a j4aVar2 = j4aVar;
                ly lyVar = (ly) obj2;
                switch (i19) {
                    case 0:
                        da9 da9Var = (da9) obj3;
                        l46 l46Var = (l46) obj4;
                        ((Integer) obj5).getClass();
                        lyVar.getClass();
                        da9Var.getClass();
                        ycc yccVarA = da9Var.a();
                        List list = (List) yccVarA.a("camera_result_cards");
                        List list2 = (List) yccVarA.a("camera_result_reversed");
                        Integer num = (Integer) yccVarA.a("camera_result_count");
                        boolean zG = l46Var.g(list);
                        Object objR = l46Var.R();
                        if (zG || objR == i8cVar) {
                            if (list != null) {
                                ArrayList arrayList = new ArrayList();
                                int i20 = 0;
                                for (Object obj6 : list) {
                                    int i21 = i20 + 1;
                                    if (i20 < 0) {
                                        t72.Z();
                                        throw null;
                                    }
                                    try {
                                        dzbVar = new TarotCardChoice(TarotCardType.valueOf((String) obj6), (list2 == null || (bool = (Boolean) s72.y0(i20, list2)) == null) ? false : bool.booleanValue(), (String) null, 4, (rp3) null);
                                    } catch (Throwable th) {
                                        dzbVar = new dzb(th);
                                    }
                                    if (dzbVar instanceof dzb) {
                                        dzbVar = null;
                                    }
                                    TarotCardChoice tarotCardChoice = (TarotCardChoice) dzbVar;
                                    if (tarotCardChoice != null) {
                                        arrayList.add(tarotCardChoice);
                                    }
                                    i20 = i21;
                                }
                                objR = arrayList;
                            } else {
                                objR = null;
                            }
                            l46Var.p0(objR);
                        }
                        List list3 = (List) objR;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            Integer numValueOf = list3 != null ? Integer.valueOf(list3.size()) : null;
                            iIntValue = numValueOf != null ? numValueOf.intValue() : 5;
                        }
                        boolean zE = l46Var.e(iIntValue);
                        Object objR2 = l46Var.R();
                        Object obj7 = objR2;
                        if (zE || objR2 == i8cVar) {
                            z67 z67Var = new z67(1, iIntValue, 1);
                            ArrayList arrayList2 = new ArrayList(t72.u(z67Var, 10));
                            Iterator it = z67Var.iterator();
                            while (((y67) it).c) {
                                ((q67) it).nextInt();
                                arrayList2.add(new PatternData("", ""));
                            }
                            l46Var.p0(arrayList2);
                            obj7 = arrayList2;
                        }
                        List list4 = (List) obj7;
                        boolean zI = tq.I(j4aVar2, iIntValue);
                        String strC = j4aVar2.c();
                        boolean zI2 = l46Var.i(ka9Var);
                        Object objR3 = l46Var.R();
                        if (zI2 || objR3 == i8cVar) {
                            objR3 = new u14(ka9Var, 6);
                            l46Var.p0(objR3);
                        }
                        l26 l26Var = (l26) objR3;
                        boolean zI3 = l46Var.i(ka9Var);
                        Object objR4 = l46Var.R();
                        if (zI3 || objR4 == i8cVar) {
                            objR4 = new z8(ka9Var, 18);
                            l46Var.p0(objR4);
                        }
                        a26 a26Var = (a26) objR4;
                        boolean zI4 = l46Var.i(ka9Var);
                        Object objR5 = l46Var.R();
                        if (zI4 || objR5 == i8cVar) {
                            objR5 = new vw5(ka9Var, 28);
                            l46Var.p0(objR5);
                        }
                        x16 x16Var = (x16) objR5;
                        boolean zI5 = l46Var.i(yccVarA);
                        Object objR6 = l46Var.R();
                        if (zI5 || objR6 == i8cVar) {
                            objR6 = new io4(yccVarA, 3);
                            l46Var.p0(objR6);
                        }
                        vfh.i(pu4.a, list4, l26Var, a26Var, x16Var, null, list3, (x16) objR6, true, false, zI, strC, R.string.button_continue, l46Var, 100663302, 544);
                        return wefVar;
                    case 1:
                        da9 da9Var2 = (da9) obj3;
                        l46 l46Var2 = (l46) obj4;
                        ((Integer) obj5).getClass();
                        lyVar.getClass();
                        da9Var2.getClass();
                        SpreadPreviewRoute spreadPreviewRoute = (SpreadPreviewRoute) vfh.S(da9Var2, job.a.b(SpreadPreviewRoute.class));
                        boolean zI6 = tq.I(j4aVar2, spreadPreviewRoute.getCards().size());
                        String strC2 = j4aVar2.c();
                        List<TarotCardChoice> cards = spreadPreviewRoute.getCards();
                        List<String> meanings = spreadPreviewRoute.getMeanings();
                        boolean zI7 = l46Var2.i(ka9Var) | l46Var2.i(spreadPreviewRoute);
                        Object objR7 = l46Var2.R();
                        if (zI7 || objR7 == i8cVar) {
                            objR7 = new kz8(22, ka9Var, spreadPreviewRoute);
                            l46Var2.p0(objR7);
                        }
                        a26 a26Var2 = (a26) objR7;
                        boolean zI8 = l46Var2.i(ka9Var) | l46Var2.i(spreadPreviewRoute);
                        Object objR8 = l46Var2.R();
                        if (zI8 || objR8 == i8cVar) {
                            objR8 = new ek9(16, ka9Var, spreadPreviewRoute);
                            l46Var2.p0(objR8);
                        }
                        x16 x16Var2 = (x16) objR8;
                        boolean zI9 = l46Var2.i(ka9Var);
                        Object objR9 = l46Var2.R();
                        if (zI9 || objR9 == i8cVar) {
                            objR9 = new vw5(ka9Var, 26);
                            l46Var2.p0(objR9);
                        }
                        p8c.l(cards, meanings, false, zI6, strC2, a26Var2, x16Var2, (x16) objR9, l46Var2, 384);
                        return wefVar;
                    default:
                        da9 da9Var3 = (da9) obj3;
                        l46 l46Var3 = (l46) obj4;
                        ib8.u((Integer) obj5, lyVar, da9Var3);
                        DrawnCardsConfirmRoute drawnCardsConfirmRoute = (DrawnCardsConfirmRoute) vfh.S(da9Var3, job.a.b(DrawnCardsConfirmRoute.class));
                        boolean zI10 = tq.I(j4aVar2, drawnCardsConfirmRoute.getCards().size());
                        String strC3 = j4aVar2.c();
                        List<TarotCardChoice> cards2 = drawnCardsConfirmRoute.getCards();
                        List<String> meanings2 = drawnCardsConfirmRoute.getMeanings();
                        Object objR10 = l46Var3.R();
                        if (objR10 == i8cVar) {
                            objR10 = new q4a(25);
                            l46Var3.p0(objR10);
                        }
                        a26 a26Var3 = (a26) objR10;
                        boolean zI11 = l46Var3.i(ka9Var) | l46Var3.i(drawnCardsConfirmRoute);
                        Object objR11 = l46Var3.R();
                        if (zI11 || objR11 == i8cVar) {
                            objR11 = new ek9(15, ka9Var, drawnCardsConfirmRoute);
                            l46Var3.p0(objR11);
                        }
                        x16 x16Var3 = (x16) objR11;
                        boolean zI12 = l46Var3.i(ka9Var);
                        Object objR12 = l46Var3.R();
                        if (zI12 || objR12 == i8cVar) {
                            objR12 = new vw5(ka9Var, 24);
                            l46Var3.p0(objR12);
                        }
                        p8c.l(cards2, meanings2, true, zI10, strC3, a26Var3, x16Var3, (x16) objR12, l46Var3, 196992);
                        return wefVar;
                }
            }
        }, true, -1847271397));
        rs0.o(za9Var, kobVar.b(PhysicalDeckReadingRoute.class), qu4Var, null, null, null, null, new dd2(new xw5(cb9Var, 10), true, 1464702522));
        do7 do7Var = do7.c;
        yn7 yn7VarD = job.d(List.class, db6.b0(job.c(TarotCardChoice.class)));
        kaf kafVar = bzd.j;
        rs0.o(za9Var, kobVar.b(SpreadInfoEntryRoute.class), bm8.G(new iy9(yn7VarD, kafVar)), null, null, null, null, new dd2(new xw5(cb9Var, 11), true, 481709145));
        iy9 iy9Var = new iy9(job.d(List.class, db6.b0(job.c(TarotCardChoice.class))), kafVar);
        yn7 yn7VarD2 = job.d(List.class, db6.b0(job.c(String.class)));
        kaf kafVar2 = bzd.k;
        rs0.o(za9Var, kobVar.b(SpreadInfoInputRoute.class), bm8.H(iy9Var, new iy9(yn7VarD2, kafVar2)), null, null, null, null, new dd2(new xw5(cb9Var, i18), true, -501284232));
        final int i19 = 1;
        rs0.o(za9Var, kobVar.b(SpreadPreviewRoute.class), bm8.H(new iy9(job.d(List.class, db6.b0(job.c(TarotCardChoice.class))), kafVar), new iy9(job.d(List.class, db6.b0(job.c(String.class))), kafVar2)), null, null, null, null, new dd2(new o26() { // from class: mda
            @Override // defpackage.o26
            public final Object t(Object obj2, Object obj3, Object obj4, Object obj5) {
                Object dzbVar;
                Boolean bool;
                int iIntValue;
                int i110 = i19;
                wef wefVar = wef.a;
                i8c i8cVar = sf2.a;
                ka9 ka9Var = cb9Var;
                j4a j4aVar2 = j4aVar;
                ly lyVar = (ly) obj2;
                switch (i110) {
                    case 0:
                        da9 da9Var = (da9) obj3;
                        l46 l46Var = (l46) obj4;
                        ((Integer) obj5).getClass();
                        lyVar.getClass();
                        da9Var.getClass();
                        ycc yccVarA = da9Var.a();
                        List list = (List) yccVarA.a("camera_result_cards");
                        List list2 = (List) yccVarA.a("camera_result_reversed");
                        Integer num = (Integer) yccVarA.a("camera_result_count");
                        boolean zG = l46Var.g(list);
                        Object objR = l46Var.R();
                        if (zG || objR == i8cVar) {
                            if (list != null) {
                                ArrayList arrayList = new ArrayList();
                                int i20 = 0;
                                for (Object obj6 : list) {
                                    int i21 = i20 + 1;
                                    if (i20 < 0) {
                                        t72.Z();
                                        throw null;
                                    }
                                    try {
                                        dzbVar = new TarotCardChoice(TarotCardType.valueOf((String) obj6), (list2 == null || (bool = (Boolean) s72.y0(i20, list2)) == null) ? false : bool.booleanValue(), (String) null, 4, (rp3) null);
                                    } catch (Throwable th) {
                                        dzbVar = new dzb(th);
                                    }
                                    if (dzbVar instanceof dzb) {
                                        dzbVar = null;
                                    }
                                    TarotCardChoice tarotCardChoice = (TarotCardChoice) dzbVar;
                                    if (tarotCardChoice != null) {
                                        arrayList.add(tarotCardChoice);
                                    }
                                    i20 = i21;
                                }
                                objR = arrayList;
                            } else {
                                objR = null;
                            }
                            l46Var.p0(objR);
                        }
                        List list3 = (List) objR;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            Integer numValueOf = list3 != null ? Integer.valueOf(list3.size()) : null;
                            iIntValue = numValueOf != null ? numValueOf.intValue() : 5;
                        }
                        boolean zE = l46Var.e(iIntValue);
                        Object objR2 = l46Var.R();
                        Object obj7 = objR2;
                        if (zE || objR2 == i8cVar) {
                            z67 z67Var = new z67(1, iIntValue, 1);
                            ArrayList arrayList2 = new ArrayList(t72.u(z67Var, 10));
                            Iterator it = z67Var.iterator();
                            while (((y67) it).c) {
                                ((q67) it).nextInt();
                                arrayList2.add(new PatternData("", ""));
                            }
                            l46Var.p0(arrayList2);
                            obj7 = arrayList2;
                        }
                        List list4 = (List) obj7;
                        boolean zI = tq.I(j4aVar2, iIntValue);
                        String strC = j4aVar2.c();
                        boolean zI2 = l46Var.i(ka9Var);
                        Object objR3 = l46Var.R();
                        if (zI2 || objR3 == i8cVar) {
                            objR3 = new u14(ka9Var, 6);
                            l46Var.p0(objR3);
                        }
                        l26 l26Var = (l26) objR3;
                        boolean zI3 = l46Var.i(ka9Var);
                        Object objR4 = l46Var.R();
                        if (zI3 || objR4 == i8cVar) {
                            objR4 = new z8(ka9Var, 18);
                            l46Var.p0(objR4);
                        }
                        a26 a26Var = (a26) objR4;
                        boolean zI4 = l46Var.i(ka9Var);
                        Object objR5 = l46Var.R();
                        if (zI4 || objR5 == i8cVar) {
                            objR5 = new vw5(ka9Var, 28);
                            l46Var.p0(objR5);
                        }
                        x16 x16Var = (x16) objR5;
                        boolean zI5 = l46Var.i(yccVarA);
                        Object objR6 = l46Var.R();
                        if (zI5 || objR6 == i8cVar) {
                            objR6 = new io4(yccVarA, 3);
                            l46Var.p0(objR6);
                        }
                        vfh.i(pu4.a, list4, l26Var, a26Var, x16Var, null, list3, (x16) objR6, true, false, zI, strC, R.string.button_continue, l46Var, 100663302, 544);
                        return wefVar;
                    case 1:
                        da9 da9Var2 = (da9) obj3;
                        l46 l46Var2 = (l46) obj4;
                        ((Integer) obj5).getClass();
                        lyVar.getClass();
                        da9Var2.getClass();
                        SpreadPreviewRoute spreadPreviewRoute = (SpreadPreviewRoute) vfh.S(da9Var2, job.a.b(SpreadPreviewRoute.class));
                        boolean zI6 = tq.I(j4aVar2, spreadPreviewRoute.getCards().size());
                        String strC2 = j4aVar2.c();
                        List<TarotCardChoice> cards = spreadPreviewRoute.getCards();
                        List<String> meanings = spreadPreviewRoute.getMeanings();
                        boolean zI7 = l46Var2.i(ka9Var) | l46Var2.i(spreadPreviewRoute);
                        Object objR7 = l46Var2.R();
                        if (zI7 || objR7 == i8cVar) {
                            objR7 = new kz8(22, ka9Var, spreadPreviewRoute);
                            l46Var2.p0(objR7);
                        }
                        a26 a26Var2 = (a26) objR7;
                        boolean zI8 = l46Var2.i(ka9Var) | l46Var2.i(spreadPreviewRoute);
                        Object objR8 = l46Var2.R();
                        if (zI8 || objR8 == i8cVar) {
                            objR8 = new ek9(16, ka9Var, spreadPreviewRoute);
                            l46Var2.p0(objR8);
                        }
                        x16 x16Var2 = (x16) objR8;
                        boolean zI9 = l46Var2.i(ka9Var);
                        Object objR9 = l46Var2.R();
                        if (zI9 || objR9 == i8cVar) {
                            objR9 = new vw5(ka9Var, 26);
                            l46Var2.p0(objR9);
                        }
                        p8c.l(cards, meanings, false, zI6, strC2, a26Var2, x16Var2, (x16) objR9, l46Var2, 384);
                        return wefVar;
                    default:
                        da9 da9Var3 = (da9) obj3;
                        l46 l46Var3 = (l46) obj4;
                        ib8.u((Integer) obj5, lyVar, da9Var3);
                        DrawnCardsConfirmRoute drawnCardsConfirmRoute = (DrawnCardsConfirmRoute) vfh.S(da9Var3, job.a.b(DrawnCardsConfirmRoute.class));
                        boolean zI10 = tq.I(j4aVar2, drawnCardsConfirmRoute.getCards().size());
                        String strC3 = j4aVar2.c();
                        List<TarotCardChoice> cards2 = drawnCardsConfirmRoute.getCards();
                        List<String> meanings2 = drawnCardsConfirmRoute.getMeanings();
                        Object objR10 = l46Var3.R();
                        if (objR10 == i8cVar) {
                            objR10 = new q4a(25);
                            l46Var3.p0(objR10);
                        }
                        a26 a26Var3 = (a26) objR10;
                        boolean zI11 = l46Var3.i(ka9Var) | l46Var3.i(drawnCardsConfirmRoute);
                        Object objR11 = l46Var3.R();
                        if (zI11 || objR11 == i8cVar) {
                            objR11 = new ek9(15, ka9Var, drawnCardsConfirmRoute);
                            l46Var3.p0(objR11);
                        }
                        x16 x16Var3 = (x16) objR11;
                        boolean zI12 = l46Var3.i(ka9Var);
                        Object objR12 = l46Var3.R();
                        if (zI12 || objR12 == i8cVar) {
                            objR12 = new vw5(ka9Var, 24);
                            l46Var3.p0(objR12);
                        }
                        p8c.l(cards2, meanings2, true, zI10, strC3, a26Var3, x16Var3, (x16) objR12, l46Var3, 196992);
                        return wefVar;
                }
            }
        }, true, -1484277609));
        Map mapH = bm8.H(new iy9(job.d(List.class, db6.b0(job.c(TarotCardChoice.class))), kafVar), new iy9(job.d(List.class, db6.b0(job.c(String.class))), kafVar2));
        final int i20 = 2;
        rs0.o(za9Var, kobVar.b(DrawnCardsConfirmRoute.class), mapH, null, null, null, null, new dd2(new o26() { // from class: mda
            @Override // defpackage.o26
            public final Object t(Object obj2, Object obj3, Object obj4, Object obj5) {
                Object dzbVar;
                Boolean bool;
                int iIntValue;
                int i110 = i20;
                wef wefVar = wef.a;
                i8c i8cVar = sf2.a;
                ka9 ka9Var = cb9Var;
                j4a j4aVar2 = j4aVar;
                ly lyVar = (ly) obj2;
                switch (i110) {
                    case 0:
                        da9 da9Var = (da9) obj3;
                        l46 l46Var = (l46) obj4;
                        ((Integer) obj5).getClass();
                        lyVar.getClass();
                        da9Var.getClass();
                        ycc yccVarA = da9Var.a();
                        List list = (List) yccVarA.a("camera_result_cards");
                        List list2 = (List) yccVarA.a("camera_result_reversed");
                        Integer num = (Integer) yccVarA.a("camera_result_count");
                        boolean zG = l46Var.g(list);
                        Object objR = l46Var.R();
                        if (zG || objR == i8cVar) {
                            if (list != null) {
                                ArrayList arrayList = new ArrayList();
                                int i21 = 0;
                                for (Object obj6 : list) {
                                    int i22 = i21 + 1;
                                    if (i21 < 0) {
                                        t72.Z();
                                        throw null;
                                    }
                                    try {
                                        dzbVar = new TarotCardChoice(TarotCardType.valueOf((String) obj6), (list2 == null || (bool = (Boolean) s72.y0(i21, list2)) == null) ? false : bool.booleanValue(), (String) null, 4, (rp3) null);
                                    } catch (Throwable th) {
                                        dzbVar = new dzb(th);
                                    }
                                    if (dzbVar instanceof dzb) {
                                        dzbVar = null;
                                    }
                                    TarotCardChoice tarotCardChoice = (TarotCardChoice) dzbVar;
                                    if (tarotCardChoice != null) {
                                        arrayList.add(tarotCardChoice);
                                    }
                                    i21 = i22;
                                }
                                objR = arrayList;
                            } else {
                                objR = null;
                            }
                            l46Var.p0(objR);
                        }
                        List list3 = (List) objR;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            Integer numValueOf = list3 != null ? Integer.valueOf(list3.size()) : null;
                            iIntValue = numValueOf != null ? numValueOf.intValue() : 5;
                        }
                        boolean zE = l46Var.e(iIntValue);
                        Object objR2 = l46Var.R();
                        Object obj7 = objR2;
                        if (zE || objR2 == i8cVar) {
                            z67 z67Var = new z67(1, iIntValue, 1);
                            ArrayList arrayList2 = new ArrayList(t72.u(z67Var, 10));
                            Iterator it = z67Var.iterator();
                            while (((y67) it).c) {
                                ((q67) it).nextInt();
                                arrayList2.add(new PatternData("", ""));
                            }
                            l46Var.p0(arrayList2);
                            obj7 = arrayList2;
                        }
                        List list4 = (List) obj7;
                        boolean zI = tq.I(j4aVar2, iIntValue);
                        String strC = j4aVar2.c();
                        boolean zI2 = l46Var.i(ka9Var);
                        Object objR3 = l46Var.R();
                        if (zI2 || objR3 == i8cVar) {
                            objR3 = new u14(ka9Var, 6);
                            l46Var.p0(objR3);
                        }
                        l26 l26Var = (l26) objR3;
                        boolean zI3 = l46Var.i(ka9Var);
                        Object objR4 = l46Var.R();
                        if (zI3 || objR4 == i8cVar) {
                            objR4 = new z8(ka9Var, 18);
                            l46Var.p0(objR4);
                        }
                        a26 a26Var = (a26) objR4;
                        boolean zI4 = l46Var.i(ka9Var);
                        Object objR5 = l46Var.R();
                        if (zI4 || objR5 == i8cVar) {
                            objR5 = new vw5(ka9Var, 28);
                            l46Var.p0(objR5);
                        }
                        x16 x16Var = (x16) objR5;
                        boolean zI5 = l46Var.i(yccVarA);
                        Object objR6 = l46Var.R();
                        if (zI5 || objR6 == i8cVar) {
                            objR6 = new io4(yccVarA, 3);
                            l46Var.p0(objR6);
                        }
                        vfh.i(pu4.a, list4, l26Var, a26Var, x16Var, null, list3, (x16) objR6, true, false, zI, strC, R.string.button_continue, l46Var, 100663302, 544);
                        return wefVar;
                    case 1:
                        da9 da9Var2 = (da9) obj3;
                        l46 l46Var2 = (l46) obj4;
                        ((Integer) obj5).getClass();
                        lyVar.getClass();
                        da9Var2.getClass();
                        SpreadPreviewRoute spreadPreviewRoute = (SpreadPreviewRoute) vfh.S(da9Var2, job.a.b(SpreadPreviewRoute.class));
                        boolean zI6 = tq.I(j4aVar2, spreadPreviewRoute.getCards().size());
                        String strC2 = j4aVar2.c();
                        List<TarotCardChoice> cards = spreadPreviewRoute.getCards();
                        List<String> meanings = spreadPreviewRoute.getMeanings();
                        boolean zI7 = l46Var2.i(ka9Var) | l46Var2.i(spreadPreviewRoute);
                        Object objR7 = l46Var2.R();
                        if (zI7 || objR7 == i8cVar) {
                            objR7 = new kz8(22, ka9Var, spreadPreviewRoute);
                            l46Var2.p0(objR7);
                        }
                        a26 a26Var2 = (a26) objR7;
                        boolean zI8 = l46Var2.i(ka9Var) | l46Var2.i(spreadPreviewRoute);
                        Object objR8 = l46Var2.R();
                        if (zI8 || objR8 == i8cVar) {
                            objR8 = new ek9(16, ka9Var, spreadPreviewRoute);
                            l46Var2.p0(objR8);
                        }
                        x16 x16Var2 = (x16) objR8;
                        boolean zI9 = l46Var2.i(ka9Var);
                        Object objR9 = l46Var2.R();
                        if (zI9 || objR9 == i8cVar) {
                            objR9 = new vw5(ka9Var, 26);
                            l46Var2.p0(objR9);
                        }
                        p8c.l(cards, meanings, false, zI6, strC2, a26Var2, x16Var2, (x16) objR9, l46Var2, 384);
                        return wefVar;
                    default:
                        da9 da9Var3 = (da9) obj3;
                        l46 l46Var3 = (l46) obj4;
                        ib8.u((Integer) obj5, lyVar, da9Var3);
                        DrawnCardsConfirmRoute drawnCardsConfirmRoute = (DrawnCardsConfirmRoute) vfh.S(da9Var3, job.a.b(DrawnCardsConfirmRoute.class));
                        boolean zI10 = tq.I(j4aVar2, drawnCardsConfirmRoute.getCards().size());
                        String strC3 = j4aVar2.c();
                        List<TarotCardChoice> cards2 = drawnCardsConfirmRoute.getCards();
                        List<String> meanings2 = drawnCardsConfirmRoute.getMeanings();
                        Object objR10 = l46Var3.R();
                        if (objR10 == i8cVar) {
                            objR10 = new q4a(25);
                            l46Var3.p0(objR10);
                        }
                        a26 a26Var3 = (a26) objR10;
                        boolean zI11 = l46Var3.i(ka9Var) | l46Var3.i(drawnCardsConfirmRoute);
                        Object objR11 = l46Var3.R();
                        if (zI11 || objR11 == i8cVar) {
                            objR11 = new ek9(15, ka9Var, drawnCardsConfirmRoute);
                            l46Var3.p0(objR11);
                        }
                        x16 x16Var3 = (x16) objR11;
                        boolean zI12 = l46Var3.i(ka9Var);
                        Object objR12 = l46Var3.R();
                        if (zI12 || objR12 == i8cVar) {
                            objR12 = new vw5(ka9Var, 24);
                            l46Var3.p0(objR12);
                        }
                        p8c.l(cards2, meanings2, true, zI10, strC3, a26Var3, x16Var3, (x16) objR12, l46Var3, 196992);
                        return wefVar;
                }
            }
        }, true, 1827696310));
        rs0.o(za9Var, kobVar.b(QuestionInputRoute.class), bm8.H(new iy9(job.d(List.class, db6.b0(job.c(TarotCardChoice.class))), kafVar), new iy9(job.d(List.class, db6.b0(job.c(String.class))), kafVar2)), null, null, null, null, new dd2(new p93((Object) j4aVar, (Object) jr2Var, (ka9) cb9Var, 4), true, 844702933));
        return wef.a;
    }

    private final Object e(Object obj) {
        final cre creVar = (cre) this.b;
        aw2 aw2Var = (aw2) this.c;
        Context context = (Context) this.d;
        rme rmeVar = (rme) obj;
        rmeVar.a();
        boolean z = false;
        z = false;
        final int i = 1;
        ynb.i0(rmeVar, context.getResources(), cne.a, (eue.d(creVar.l().b) || !creVar.h() || creVar.g == null) ? false : true, new hwc(new fre(aw2Var, new hre(creVar, null), z ? 1 : 0), null, 1));
        ynb.i0(rmeVar, context.getResources(), cne.b, (eue.d(creVar.l().b) || creVar.g == null) ? false : true, new hwc(new fre(aw2Var, new ire(creVar, null), z ? 1 : 0), null, 1));
        ynb.i0(rmeVar, context.getResources(), cne.c, creVar.h() && ((Boolean) creVar.w.getValue()).booleanValue() && creVar.g != null, new hwc(new fre(aw2Var, new jre(creVar, null), z ? 1 : 0), null, 1));
        cne cneVar = cne.d;
        boolean z2 = eue.e(creVar.l().b) != creVar.l().a.b.length();
        final int i2 = z ? 1 : 0;
        ynb.i0(rmeVar, context.getResources(), cneVar, z2, new hwc(new x16() { // from class: gre
            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i;
                wef wefVar = wef.a;
                cre creVar2 = creVar;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(!creVar2.A);
                    case 1:
                        zse zseVarB = cre.b(creVar2.l().a, u3c.b(0, creVar2.l().a.b.length()));
                        creVar2.c.d(zseVarB);
                        long j = zseVarB.b;
                        creVar2.v = new eue(j);
                        creVar2.t = zse.a(creVar2.t, null, j, 5);
                        creVar2.e(true);
                        return wefVar;
                    default:
                        x16 x16Var = creVar2.f;
                        if (x16Var != null) {
                            x16Var.invoke();
                        }
                        return wefVar;
                }
            }
        }, new x16() { // from class: gre
            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i2;
                wef wefVar = wef.a;
                cre creVar2 = creVar;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(!creVar2.A);
                    case 1:
                        zse zseVarB = cre.b(creVar2.l().a, u3c.b(0, creVar2.l().a.b.length()));
                        creVar2.c.d(zseVarB);
                        long j = zseVarB.b;
                        creVar2.v = new eue(j);
                        creVar2.t = zse.a(creVar2.t, null, j, 5);
                        creVar2.e(true);
                        return wefVar;
                    default:
                        x16 x16Var = creVar2.f;
                        if (x16Var != null) {
                            x16Var.invoke();
                        }
                        return wefVar;
                }
            }
        }, 1));
        cne cneVar2 = cne.e;
        if (creVar.h() && eue.d(creVar.l().b)) {
            z = true;
        }
        final int i3 = 2;
        ynb.i0(rmeVar, context.getResources(), cneVar2, z, new hwc(new x16() { // from class: gre
            @Override // defpackage.x16
            public final Object invoke() {
                int i4 = i3;
                wef wefVar = wef.a;
                cre creVar2 = creVar;
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(!creVar2.A);
                    case 1:
                        zse zseVarB = cre.b(creVar2.l().a, u3c.b(0, creVar2.l().a.b.length()));
                        creVar2.c.d(zseVarB);
                        long j = zseVarB.b;
                        creVar2.v = new eue(j);
                        creVar2.t = zse.a(creVar2.t, null, j, 5);
                        creVar2.e(true);
                        return wefVar;
                    default:
                        x16 x16Var = creVar2.f;
                        if (x16Var != null) {
                            x16Var.invoke();
                        }
                        return wefVar;
                }
            }
        }, null, 1));
        rmeVar.a();
        return wef.a;
    }

    private final Object f(Object obj) {
        lmb lmbVar = (lmb) this.b;
        jse jseVar = (jse) this.c;
        lmb lmbVar2 = (lmb) this.d;
        lmbVar.element = svc.a(jseVar.k().c());
        lmbVar2.element = 0L;
        jseVar.v(true);
        bv7 bv7VarQ = jseVar.q();
        jseVar.n.setValue(new hl9(bv7VarQ != null ? bv7VarQ.c(0L) : 9205357640488583168L));
        jseVar.A(sg6.a, lmbVar.element);
        return wef.a;
    }

    private final Object g(Object obj) {
        x16 x16Var = (x16) this.b;
        jse jseVar = (jse) this.c;
        koe koeVar = (koe) this.d;
        hl9 hl9Var = (hl9) obj;
        x16Var.invoke();
        boolean z = jseVar.i;
        ute uteVar = jseVar.b;
        if (z && jseVar.h) {
            koeVar.invoke();
            if (jseVar.a.d().c.length() > 0) {
                jseVar.w(true);
            }
            jseVar.x(sue.a);
            jseVar.u(xxb.p(uteVar, uteVar.a(hl9Var.a)));
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0092  */
    private final Object h(Object obj) {
        boolean z;
        jse jseVar = (jse) this.b;
        aw2 aw2Var = (aw2) this.c;
        Context context = (Context) this.d;
        rme rmeVar = (rme) obj;
        rmeVar.a();
        cne cneVar = cne.a;
        boolean z2 = false;
        int i = 1;
        boolean z3 = !eue.d(jseVar.a.d().d) && jseVar.m();
        Object obj2 = null;
        fre freVar = new fre(aw2Var, new nse(jseVar, null), i);
        Resources resources = context.getResources();
        int i2 = 5;
        sue sueVar = sue.a;
        ynb.i0(rmeVar, resources, cneVar, z3, new wca(freVar, obj2, jseVar, sueVar, i2));
        ynb.i0(rmeVar, context.getResources(), cne.b, !eue.d(jseVar.a.d().d), new wca(new fre(aw2Var, new ose(jseVar, null), i), obj2, jseVar, sueVar, i2));
        cne cneVar2 = cne.c;
        if (jseVar.m()) {
            if (!jseVar.y.b) {
                x16 x16Var = jseVar.m;
                if ((x16Var != null ? (yib) x16Var.invoke() : null) == null || !jseVar.y.a) {
                    z = false;
                }
            }
            z = true;
        } else {
            z = false;
        }
        ynb.i0(rmeVar, context.getResources(), cneVar2, z, new wca(new fre(aw2Var, new pse(jseVar, null), i), obj2, jseVar, sueVar, 5));
        cne cneVar3 = cne.d;
        z2f z2fVar = jseVar.a;
        boolean z4 = eue.e(z2fVar.d().d) != z2fVar.d().c.length();
        ynb.i0(rmeVar, context.getResources(), cneVar3, z4, new wca(new hv0(jseVar, 8), new hv0(jseVar, 7), jseVar, sue.c, 5));
        cne cneVar4 = cne.e;
        if (jseVar.m() && eue.d(jseVar.a.d().d)) {
            z2 = true;
        }
        ynb.i0(rmeVar, context.getResources(), cneVar4, z2, new wca(new hv0(jseVar, 9), obj2, jseVar, sueVar, 5));
        rmeVar.a();
        return wef.a;
    }

    private final Object i(Object obj) {
        a26 a26Var = (a26) this.b;
        Context context = (Context) this.c;
        qmf qmfVar = (qmf) this.d;
        AuthOption authOption = (AuthOption) obj;
        authOption.getClass();
        if8 loginWay = authOption.getLoginWay();
        int i = loginWay == null ? -1 : clf.a[loginWay.ordinal()];
        if (i == -1) {
            int i2 = qmf.Z;
            qmfVar.n("", authOption);
        } else if (i != 1) {
            vb2 vb2VarH = kn2.H(context);
            if (vb2VarH != null) {
                if (a26Var != null) {
                    a26Var.d(feg.K(authOption));
                }
                xkf xkfVar = new xkf(qmfVar, vb2VarH, authOption, 0);
                if (((Boolean) qmfVar.y.getValue()).booleanValue()) {
                    xkfVar.invoke();
                } else {
                    qmfVar.z.setValue(xkfVar);
                }
            }
        } else {
            if (a26Var != null) {
                a26Var.d(feg.K(authOption));
            }
            vb2 vb2VarH2 = kn2.H(context);
            if (vb2VarH2 != null) {
                awe aweVarW = af1.W(if8.c, vb2VarH2);
                if (aweVarW == null) {
                    jcc.k(1, Integer.valueOf(R.string.auth_login_code_send_unknown_error));
                } else {
                    aweVarW.a(vb2VarH2);
                }
            }
        }
        return wef.a;
    }

    private final Object j(Object obj) {
        bxf bxfVar = (bxf) this.b;
        Surface surface = (Surface) this.c;
        Surface surface2 = (Surface) this.d;
        ((bae) bxfVar.d).a();
        if (!pa7.t(surface, surface2)) {
            surface.release();
        }
        return wef.a;
    }

    private final Object k(Object obj) {
        pxf pxfVar = (pxf) this.b;
        a26 a26Var = (a26) this.c;
        e89 e89Var = (e89) this.d;
        jxf jxfVar = new jxf(pxfVar);
        a26Var.d(jxfVar);
        ((nu0) obj).b = new nxf(jxfVar, e89Var, null);
        return wef.a;
    }

    private final Object l(Object obj) {
        r4g r4gVar = (r4g) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        l1f l1fVar = (l1f) obj;
        l1fVar.a(r4gVar.a(), "widget");
        l1fVar.a(str, "source");
        if (!str.equals("organic") && !v4e.Q(str2)) {
            l1fVar.a(str2, "scenario");
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:305:0x0742  */
    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        t12 t12Var;
        FailReason reason;
        g48 g48Var;
        ycc yccVarA;
        ua9 ua9Var;
        String str;
        j00 j00Var;
        Integer numE;
        Integer numD;
        Integer numD2;
        Integer numE2;
        ste steVar;
        ste steVar2;
        tte tteVar;
        tte tteVar2;
        ste steVar3;
        ste steVar4;
        tte tteVar3;
        tte tteVar4;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        zse zseVar;
        vea veaVar;
        zse zseVar2;
        int i = this.a;
        int i2 = 17;
        int i3 = 5;
        int i4 = 18;
        int i5 = 6;
        int i6 = 4;
        int i7 = 2;
        int i8 = 3;
        boolean z = false;
        int i9 = 1;
        wef wefVar = wef.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                r0 r0Var = (r0) obj3;
                shb shbVar = (shb) obj2;
                OverviewItem.ClarifyingCardItem clarifyingCardItem = (OverviewItem.ClarifyingCardItem) obj;
                clarifyingCardItem.getClass();
                x12 x12Var = (x12) ((LinkedHashMap) obj4).get(clarifyingCardItem.getMessageId());
                if (x12Var != null) {
                    cgg.x(hkg.n0(cgg.S(x12Var, shbVar), "button_click", new iy9("btn", "skip_extra_open")));
                }
                String messageId = clarifyingCardItem.getMessageId();
                r0Var.getClass();
                messageId.getClass();
                if (pa7.t(r0Var.P().e, messageId) && (t12Var = (t12) r0Var.P().b.get(messageId)) != null) {
                    ClarifyingCardState clarifyingCardState = t12Var.d;
                    boolean zContainsKey = r0Var.V0.containsKey(messageId);
                    if (zContainsKey && clarifyingCardState == ClarifyingCardState.Drawing) {
                        ClarifyingCardDrawActionState clarifyingCardDrawActionStateN = r0Var.n(messageId);
                        ClarifyingCardDrawActionState.Failed failed = clarifyingCardDrawActionStateN instanceof ClarifyingCardDrawActionState.Failed ? (ClarifyingCardDrawActionState.Failed) clarifyingCardDrawActionStateN : null;
                        if (failed != null && (reason = failed.getReason()) != null && (reason.equals(FailReason.Network.INSTANCE) || (reason instanceof FailReason.IllegalContent))) {
                            z = true;
                        }
                    }
                    if ((!zContainsKey || z) && (clarifyingCardState == ClarifyingCardState.PendingDecision || z)) {
                        ClarifyingCardSkipActionState clarifyingCardSkipActionStateO = r0Var.o(messageId);
                        ClarifyingCardSkipActionState.Loading loading = ClarifyingCardSkipActionState.Loading.INSTANCE;
                        if (!pa7.t(clarifyingCardSkipActionStateO, loading)) {
                            r0Var.S0.put(messageId, loading);
                            yt6 yt6Var = r0Var.d;
                            fc4 fc4Var = r0Var.H0;
                            if (fc4Var == null) {
                                pa7.g0("divinationKey");
                                throw null;
                            }
                            String str2 = fc4Var.a;
                            uke ukeVar = (uke) yt6Var;
                            ukeVar.getClass();
                            str2.getClass();
                            ok8.C(new sk5(new kl5(ndc.f(new lke(ukeVar, str2, messageId, null)), new n0(r0Var, messageId, t12Var, null), 1), new o0(r0Var, messageId, null)), r0Var.m1);
                        }
                    }
                }
                return wefVar;
            case 1:
                bwa bwaVar = (bwa) obj4;
                x5a x5aVar = (x5a) obj3;
                y3a y3aVar = (y3a) obj2;
                t7 t7Var = y3aVar.P0;
                ((t7) obj).getClass();
                if (!(bwaVar instanceof z6e)) {
                    if (!(bwaVar instanceof n07)) {
                        ap.c();
                        return null;
                    }
                    y3aVar.H(bwaVar, ((mo3) t7Var).a());
                } else if (x5aVar.e && (y3aVar.x instanceof s2a)) {
                    String strA = ((mo3) t7Var).a();
                    strA.getClass();
                    y3aVar.f(new f4(y3aVar, (z6e) bwaVar, strA, null));
                } else {
                    y3aVar.H(bwaVar, ((mo3) t7Var).a());
                }
                return wefVar;
            case 2:
                ka9 ka9Var = (ka9) obj4;
                da9 da9Var = (da9) obj3;
                e89 e89Var = (e89) obj2;
                List list = (List) obj;
                list.getClass();
                ma9 ma9Var = ka9Var.b;
                da9 da9VarH = ma9Var.h();
                boolean z2 = da9VarH == da9Var;
                if (da9VarH == null || (g48Var = da9VarH.v.j.i) == null) {
                    g48Var = g48.a;
                }
                if (!((Boolean) e89Var.getValue()).booleanValue() && z2 && g48Var.compareTo(g48.e) >= 0) {
                    e89Var.setValue(Boolean.TRUE);
                    da9 da9VarC = ka9Var.c();
                    if (da9VarC == null || (ua9Var = da9VarC.b) == null || (str = (String) ua9Var.b.f) == null || !v4e.F(str, "PhysicalDeckCardConfirmRoute", false)) {
                        ka9Var.d(new q4a(26), PhysicalDeckCardConfirmRoute.INSTANCE);
                        da9 da9VarH2 = ma9Var.h();
                        if (da9VarH2 != null && (yccVarA = da9VarH2.a()) != null) {
                            ArrayList arrayList = new ArrayList(t72.u(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((TarotCardChoice) it.next()).getCard().name());
                            }
                            yccVarA.d("camera_result_cards", arrayList);
                            ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(Boolean.valueOf(((TarotCardChoice) it2.next()).isReversed()));
                            }
                            yccVarA.d("camera_result_reversed", arrayList2);
                            yccVarA.d("camera_result_count", Integer.valueOf(list.size()));
                        }
                    } else {
                        ycc yccVarA2 = da9VarC.a();
                        ArrayList arrayList3 = new ArrayList(t72.u(list, 10));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((TarotCardChoice) it3.next()).getCard().name());
                        }
                        yccVarA2.d("camera_result_cards", arrayList3);
                        ArrayList arrayList4 = new ArrayList(t72.u(list, 10));
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(Boolean.valueOf(((TarotCardChoice) it4.next()).isReversed()));
                        }
                        yccVarA2.d("camera_result_reversed", arrayList4);
                        yccVarA2.d("camera_result_count", Integer.valueOf(list.size()));
                        ka9Var.g();
                    }
                }
                return wefVar;
            case 3:
                a26 a26Var = (a26) obj4;
                uma umaVar = (uma) obj3;
                fla flaVar = (fla) obj2;
                PopupAction popupAction = (PopupAction) obj;
                popupAction.getClass();
                if (popupAction.getType() != PopupActionType.SKIP) {
                    x1f x1fVar = x1f.a;
                    x1f.g(new r05("popup_activity"), m1f.b, new p59(17, umaVar));
                    String url = popupAction.getUrl();
                    if (url == null) {
                        url = umaVar.a;
                    }
                    a26Var.d(url);
                }
                String str3 = umaVar.a;
                str3.getClass();
                a62 a62VarA = hwf.a(flaVar);
                js3 js3Var = ga4.a;
                ynb.V(a62VarA, hr3.c, null, new uka(flaVar, str3, null), 2);
                return wefVar;
            case 4:
                return a(obj);
            case 5:
                rcc rccVar = (rcc) obj4;
                xcc xccVar = (xcc) obj2;
                w79 w79Var = rccVar.b;
                if (w79Var.b(obj3)) {
                    cva.u(obj3, " was used multiple times ", "Key ");
                    return null;
                }
                rccVar.a.remove(obj3);
                w79Var.m(obj3, xccVar);
                return new z6(rccVar, obj3, xccVar, 7);
            case 6:
                klc klcVar = (klc) obj4;
                String str4 = (String) obj3;
                x16 x16Var = (x16) obj2;
                if (!((Boolean) obj).booleanValue() && klcVar.a.equals(str4)) {
                    x16Var.invoke();
                }
                return wefVar;
            case 7:
                orc orcVar = (orc) obj4;
                SeasonalFollowUpRoute seasonalFollowUpRoute = (SeasonalFollowUpRoute) obj3;
                SolarTerm solarTerm = (SolarTerm) obj2;
                String str5 = (String) obj;
                str5.getClass();
                int year = seasonalFollowUpRoute.getYear();
                boolean analyticsEnabled = seasonalFollowUpRoute.getAnalyticsEnabled();
                s0e s0eVar = orcVar.F0;
                String strE = n3d.e(year, solarTerm);
                hrc hrcVarF = orcVar.f(year, solarTerm);
                if (hrcVarF == null || strE == null) {
                    s0eVar.n(null, new brc(str5));
                } else if (!(s0eVar.getValue() instanceof drc)) {
                    s0eVar.n(null, new drc(str5));
                    orcVar.x = ynb.V(hwf.a(orcVar), null, null, new krc(orcVar, year, solarTerm, str5, orcVar.g(hrcVarF), analyticsEnabled, strE, null), 3);
                }
                return wefVar;
            case 8:
                l1f l1fVar = (l1f) obj;
                kv2.y(l1fVar, "btn", (String) obj4, "pathway", (String) obj3);
                l1fVar.a((String) obj2, "seasonal_period");
                return wefVar;
            case 9:
                imb imbVar = (imb) obj2;
                oia oiaVar = (oia) obj;
                if (((v39) obj4).d(oiaVar.c, (wuc) obj3)) {
                    oiaVar.a();
                    imbVar.element = true;
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                aw2 aw2Var = (aw2) obj4;
                egd egdVar = (egd) obj3;
                zk1 zk1Var = (zk1) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (!egdVar.b() && egdVar.a() == hgd.b) {
                    egdVar.d(true);
                    egdVar.f.setValue(Boolean.TRUE);
                    ynb.V(aw2Var, null, null, new bgd(zBooleanValue, egdVar, zk1Var, null), 3);
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                qv2 qv2Var = (qv2) obj2;
                Throwable th = (Throwable) obj;
                ((ot1) obj4).d(th);
                r41 r41Var = ((vid) obj3).c;
                r41Var.e(th, false);
                while (true) {
                    Object objB = rw1.b(r41Var.k());
                    if (objB == null) {
                        return wefVar;
                    }
                    qv2Var.z(objB, th);
                }
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                List list2 = (List) obj4;
                v08 v08Var = (v08) obj;
                v08Var.getClass();
                v08.Y(v08Var, list2.size(), null, new dd2(new p93((yx9) obj3, list2, (aw2) obj2, 7), true, -1173738617), 6);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                l1fVar2.a(ym8.I((bwa) obj4), "action");
                l1fVar2.a(((and) obj3).g1.a(), "pathway");
                l1fVar2.a((String) obj2, "product_id");
                return wefVar;
            case 14:
                String str6 = (String) obj3;
                r0 r0Var2 = ((kzd) obj2).b;
                l1f l1fVar3 = (l1f) obj;
                l1fVar3.getClass();
                l1fVar3.a(((DrawCardSaves) obj4).getChatId(), "conversation_id");
                if (str6 == null) {
                    str6 = "";
                }
                l1fVar3.a(str6, "spread");
                if (!r0Var2.q0()) {
                    l1fVar3.a("default", "is_default");
                }
                az1 az1VarC = r0Var2.C();
                if (az1VarC != null) {
                    bm8.H(new iy9("triggered_by", "new_reading"), new iy9("divination_type", az1VarC.a.a), new iy9("session_id", az1VarC.b)).forEach(new al(new v5c(2, l1fVar3, l1f.class, "param", "param(Ljava/lang/String;Ljava/lang/Object;)V", 0, 8), 13));
                }
                return wefVar;
            case 15:
                imb imbVar2 = (imb) obj4;
                j00 j00Var2 = (j00) obj3;
                xtd xtdVar = (xtd) obj2;
                j00 j00Var3 = (j00) obj;
                if (imbVar2.element) {
                    Object obj5 = j00Var3.a;
                    int i10 = j00Var3.c;
                    int i11 = j00Var3.b;
                    if ((obj5 instanceof xtd) && i11 == j00Var2.b && i10 == j00Var2.c) {
                        if (xtdVar == null) {
                            xtdVar = new xtd(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                        }
                        j00Var = new j00(xtdVar, i11, i10);
                    } else {
                        j00Var = j00Var3;
                    }
                } else {
                    j00Var = j00Var3;
                }
                imbVar2.element = j00Var2.equals(j00Var3);
                return j00Var;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                a26 a26Var2 = (a26) obj3;
                jte jteVar = (jte) ((mmb) obj2).element;
                zse zseVarJ = ((fz3) obj4).j((List) obj);
                if (jteVar != null) {
                    jteVar.a(null, zseVarJ);
                }
                a26Var2.d(zseVarJ);
                return wefVar;
            case 17:
                npe npeVar = (npe) obj3;
                imb imbVar3 = (imb) obj2;
                iqe iqeVar = (iqe) obj;
                switch (((lo7) obj4).ordinal()) {
                    case 0:
                        iqeVar.e.a = null;
                        if (iqeVar.g.b.length() > 0) {
                            if (!eue.d(iqeVar.f)) {
                                boolean zF = iqeVar.f();
                                long j = iqeVar.f;
                                if (!zF) {
                                    int iF = eue.f(j);
                                    iqeVar.q(iF, iF);
                                } else {
                                    int iG = eue.g(j);
                                    iqeVar.q(iG, iG);
                                }
                            } else {
                                iqeVar.i();
                            }
                        }
                        break;
                    case 1:
                        iqeVar.e.a = null;
                        if (iqeVar.g.b.length() > 0) {
                            if (!eue.d(iqeVar.f)) {
                                boolean zF2 = iqeVar.f();
                                long j2 = iqeVar.f;
                                if (!zF2) {
                                    int iG2 = eue.g(j2);
                                    iqeVar.q(iG2, iG2);
                                } else {
                                    int iF2 = eue.f(j2);
                                    iqeVar.q(iF2, iF2);
                                }
                            } else {
                                iqeVar.m();
                            }
                        }
                        break;
                    case 2:
                        due dueVar = iqeVar.e;
                        dueVar.a = null;
                        k00 k00Var = iqeVar.g;
                        String str7 = k00Var.b;
                        String str8 = k00Var.b;
                        if (str7.length() > 0) {
                            if (!iqeVar.f()) {
                                dueVar.a = null;
                                if (str8.length() > 0 && (numE = iqeVar.e()) != null) {
                                    int iIntValue = numE.intValue();
                                    iqeVar.q(iIntValue, iIntValue);
                                }
                            } else {
                                dueVar.a = null;
                                if (str8.length() > 0 && (numD = iqeVar.d()) != null) {
                                    int iIntValue2 = numD.intValue();
                                    iqeVar.q(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        break;
                    case 3:
                        due dueVar2 = iqeVar.e;
                        dueVar2.a = null;
                        k00 k00Var2 = iqeVar.g;
                        String str9 = k00Var2.b;
                        String str10 = k00Var2.b;
                        if (str9.length() > 0) {
                            if (!iqeVar.f()) {
                                dueVar2.a = null;
                                if (str10.length() > 0 && (numD2 = iqeVar.d()) != null) {
                                    int iIntValue3 = numD2.intValue();
                                    iqeVar.q(iIntValue3, iIntValue3);
                                }
                            } else {
                                dueVar2.a = null;
                                if (str10.length() > 0 && (numE2 = iqeVar.e()) != null) {
                                    int iIntValue4 = numE2.intValue();
                                    iqeVar.q(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        break;
                    case 4:
                        iqeVar.j();
                        break;
                    case 5:
                        iqeVar.l();
                        break;
                    case 6:
                        iqeVar.o();
                        break;
                    case 7:
                        iqeVar.n();
                        break;
                    case 8:
                        iqeVar.e.a = null;
                        if (iqeVar.g.b.length() > 0) {
                            if (!iqeVar.f()) {
                                iqeVar.n();
                            } else {
                                iqeVar.o();
                            }
                        }
                        break;
                    case 9:
                        iqeVar.e.a = null;
                        if (iqeVar.g.b.length() > 0) {
                            if (!iqeVar.f()) {
                                iqeVar.o();
                            } else {
                                iqeVar.n();
                            }
                        }
                        break;
                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        if (iqeVar.g.b.length() > 0 && (steVar = iqeVar.c) != null) {
                            int iG3 = iqeVar.g(steVar, -1);
                            iqeVar.q(iG3, iG3);
                        }
                        break;
                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        if (iqeVar.g.b.length() > 0 && (steVar2 = iqeVar.c) != null) {
                            int iG4 = iqeVar.g(steVar2, 1);
                            iqeVar.q(iG4, iG4);
                        }
                        break;
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    case z7c.f /* 48 */:
                        break;
                    case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        if (iqeVar.g.b.length() > 0 && (tteVar = iqeVar.i) != null) {
                            int iH = iqeVar.h(tteVar, -1);
                            iqeVar.q(iH, iH);
                        }
                        break;
                    case 14:
                        if (iqeVar.g.b.length() > 0 && (tteVar2 = iqeVar.i) != null) {
                            int iH2 = iqeVar.h(tteVar2, 1);
                            iqeVar.q(iH2, iH2);
                        }
                        break;
                    case 15:
                        iqeVar.e.a = null;
                        if (iqeVar.g.b.length() > 0) {
                            iqeVar.q(0, 0);
                        }
                        break;
                    case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                        iqeVar.e.a = null;
                        k00 k00Var3 = iqeVar.g;
                        if (k00Var3.b.length() > 0) {
                            int length = k00Var3.b.length();
                            iqeVar.q(length, length);
                        }
                        break;
                    case 17:
                        npeVar.b.a(false);
                        break;
                    case 18:
                        npeVar.b.o();
                        break;
                    case 19:
                        npeVar.b.c();
                        break;
                    case 20:
                        List listA = iqeVar.a(new ule(2));
                        if (listA != null) {
                            npeVar.a(listA);
                        }
                        break;
                    case 21:
                        List listA2 = iqeVar.a(new ule(i8));
                        if (listA2 != null) {
                            npeVar.a(listA2);
                        }
                        break;
                    case 22:
                        List listA3 = iqeVar.a(new ule(4));
                        if (listA3 != null) {
                            npeVar.a(listA3);
                        }
                        break;
                    case 23:
                        List listA4 = iqeVar.a(new ule(i3));
                        if (listA4 != null) {
                            npeVar.a(listA4);
                        }
                        break;
                    case 24:
                        List listA5 = iqeVar.a(new ule(i5));
                        if (listA5 != null) {
                            npeVar.a(listA5);
                        }
                        break;
                    case 25:
                        List listA6 = iqeVar.a(new ule(7));
                        if (listA6 != null) {
                            npeVar.a(listA6);
                        }
                        break;
                    case 26:
                        iqeVar.e.a = null;
                        k00 k00Var4 = iqeVar.g;
                        if (k00Var4.b.length() > 0) {
                            iqeVar.q(0, k00Var4.b.length());
                        }
                        break;
                    case 27:
                        iqeVar.i();
                        iqeVar.p();
                        break;
                    case 28:
                        iqeVar.m();
                        iqeVar.p();
                        break;
                    case 29:
                        if (iqeVar.g.b.length() > 0 && (steVar3 = iqeVar.c) != null) {
                            int iG5 = iqeVar.g(steVar3, -1);
                            iqeVar.q(iG5, iG5);
                        }
                        iqeVar.p();
                        break;
                    case 30:
                        if (iqeVar.g.b.length() > 0 && (steVar4 = iqeVar.c) != null) {
                            int iG6 = iqeVar.g(steVar4, 1);
                            iqeVar.q(iG6, iG6);
                        }
                        iqeVar.p();
                        break;
                    case 31:
                        if (iqeVar.g.b.length() > 0 && (tteVar3 = iqeVar.i) != null) {
                            int iH3 = iqeVar.h(tteVar3, -1);
                            iqeVar.q(iH3, iH3);
                        }
                        iqeVar.p();
                        break;
                    case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                        if (iqeVar.g.b.length() > 0 && (tteVar4 = iqeVar.i) != null) {
                            int iH4 = iqeVar.h(tteVar4, 1);
                            iqeVar.q(iH4, iH4);
                        }
                        iqeVar.p();
                        break;
                    case 33:
                        iqeVar.e.a = null;
                        if (iqeVar.g.b.length() > 0) {
                            iqeVar.q(0, 0);
                        }
                        iqeVar.p();
                        break;
                    case 34:
                        iqeVar.e.a = null;
                        k00 k00Var5 = iqeVar.g;
                        if (k00Var5.b.length() > 0) {
                            int length2 = k00Var5.b.length();
                            iqeVar.q(length2, length2);
                        }
                        iqeVar.p();
                        break;
                    case 35:
                        due dueVar3 = iqeVar.e;
                        dueVar3.a = null;
                        k00 k00Var6 = iqeVar.g;
                        String str11 = k00Var6.b;
                        String str12 = k00Var6.b;
                        if (str11.length() > 0) {
                            if (iqeVar.f()) {
                                dueVar3.a = null;
                                if (str12.length() > 0 && (numE3 = iqeVar.e()) != null) {
                                    int iIntValue5 = numE3.intValue();
                                    iqeVar.q(iIntValue5, iIntValue5);
                                }
                            } else {
                                dueVar3.a = null;
                                if (str12.length() > 0 && (numD3 = iqeVar.d()) != null) {
                                    int iIntValue6 = numD3.intValue();
                                    iqeVar.q(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        iqeVar.p();
                        break;
                    case 36:
                        due dueVar4 = iqeVar.e;
                        dueVar4.a = null;
                        k00 k00Var7 = iqeVar.g;
                        String str13 = k00Var7.b;
                        String str14 = k00Var7.b;
                        if (str13.length() > 0) {
                            if (iqeVar.f()) {
                                dueVar4.a = null;
                                if (str14.length() > 0 && (numD4 = iqeVar.d()) != null) {
                                    int iIntValue7 = numD4.intValue();
                                    iqeVar.q(iIntValue7, iIntValue7);
                                }
                            } else {
                                dueVar4.a = null;
                                if (str14.length() > 0 && (numE4 = iqeVar.e()) != null) {
                                    int iIntValue8 = numE4.intValue();
                                    iqeVar.q(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        iqeVar.p();
                        break;
                    case 37:
                        iqeVar.j();
                        iqeVar.p();
                        break;
                    case 38:
                        iqeVar.l();
                        iqeVar.p();
                        break;
                    case 39:
                        iqeVar.o();
                        iqeVar.p();
                        break;
                    case 40:
                        iqeVar.n();
                        iqeVar.p();
                        break;
                    case 41:
                        iqeVar.e.a = null;
                        if (iqeVar.g.b.length() > 0) {
                            if (iqeVar.f()) {
                                iqeVar.o();
                            } else {
                                iqeVar.n();
                            }
                        }
                        iqeVar.p();
                        break;
                    case 42:
                        iqeVar.e.a = null;
                        if (iqeVar.g.b.length() > 0) {
                            if (iqeVar.f()) {
                                iqeVar.n();
                            } else {
                                iqeVar.o();
                            }
                        }
                        iqeVar.p();
                        break;
                    case 43:
                        iqeVar.e.a = null;
                        if (iqeVar.g.b.length() > 0) {
                            long j3 = iqeVar.f;
                            int i12 = eue.c;
                            int i13 = (int) (j3 & 4294967295L);
                            iqeVar.q(i13, i13);
                        }
                        break;
                    case 44:
                        if (!npeVar.e) {
                            npeVar.a(t72.H(new ba2("\n", 1)));
                        } else {
                            imbVar3.element = npeVar.a.x.b.r.u(npeVar.k);
                        }
                        break;
                    case 45:
                        if (!npeVar.e) {
                            npeVar.a(t72.H(new ba2("\t", 1)));
                        } else {
                            imbVar3.element = false;
                        }
                        break;
                    case 46:
                        npeVar.h.a(zse.a(iqeVar.h, iqeVar.g, iqeVar.f, 4));
                        jbf jbfVar = npeVar.h;
                        vea veaVar2 = jbfVar.a;
                        if (veaVar2 == null || (veaVar = (vea) veaVar2.b) == null) {
                            zseVar = null;
                        } else {
                            jbfVar.a = veaVar;
                            jbfVar.c -= ((zse) veaVar2.c).a.b.length();
                            jbfVar.b = new vea(i4, jbfVar.b, (zse) veaVar2.c);
                            zseVar = (zse) veaVar.c;
                        }
                        if (zseVar != null) {
                            npeVar.j.d(zseVar);
                        }
                        break;
                    case 47:
                        jbf jbfVar2 = npeVar.h;
                        vea veaVar3 = jbfVar2.b;
                        if (veaVar3 != null) {
                            jbfVar2.b = (vea) veaVar3.b;
                            zse zseVar3 = (zse) veaVar3.c;
                            jbfVar2.a = new vea(i4, jbfVar2.a, zseVar3);
                            jbfVar2.c = zseVar3.a.b.length() + jbfVar2.c;
                            zseVar2 = (zse) veaVar3.c;
                        } else {
                            zseVar2 = null;
                        }
                        if (zseVar2 != null) {
                            npeVar.j.d(zseVar2);
                        }
                        break;
                    default:
                        ap.c();
                        return null;
                }
                return wefVar;
            case 18:
                return e(obj);
            case 19:
                return f(obj);
            case 20:
                return g(obj);
            case 21:
                return h(obj);
            case 22:
                return i(obj);
            case 23:
                ExoPlayer exoPlayer = (ExoPlayer) obj4;
                ((ra4) obj).getClass();
                auf aufVar = new auf((e89) obj3, (e89) obj2);
                ((y45) exoPlayer).m.a(aufVar);
                return new ozc(12, exoPlayer, aufVar);
            case 24:
                return j(obj);
            case 25:
                return k(obj);
            case 26:
                return l(obj);
            default:
                List list3 = (List) obj3;
                nbg nbgVar = (nbg) obj2;
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                x8c x8cVarW0 = q8cVar.W0((String) obj4);
                try {
                    Iterator it5 = list3.iterator();
                    int i14 = 1;
                    while (it5.hasNext()) {
                        x8cVarW0.Q(i14, (String) it5.next());
                        i14++;
                    }
                    kd0 kd0Var = new kd0(0);
                    kd0 kd0Var2 = new kd0(0);
                    while (x8cVarW0.R0()) {
                        String strT0 = x8cVarW0.t0(0);
                        if (!kd0Var.containsKey(strT0)) {
                            kd0Var.put(strT0, new ArrayList());
                        }
                        String strT1 = x8cVarW0.t0(0);
                        if (!kd0Var2.containsKey(strT1)) {
                            kd0Var2.put(strT1, new ArrayList());
                        }
                    }
                    x8cVarW0.reset();
                    nbgVar.b(q8cVar, kd0Var);
                    nbgVar.a(q8cVar, kd0Var2);
                    ArrayList arrayList5 = new ArrayList();
                    while (x8cVarW0.R0()) {
                        String strT2 = x8cVarW0.t0(0);
                        vag vagVarU = gcc.u((int) x8cVarW0.getLong(i9));
                        byte[] blob = x8cVarW0.getBlob(i7);
                        bb3 bb3Var = bb3.b;
                        bb3 bb3VarW = bm8.w(blob);
                        int i15 = (int) x8cVarW0.getLong(3);
                        int i16 = (int) x8cVarW0.getLong(i6);
                        long j4 = x8cVarW0.getLong(14);
                        long j5 = x8cVarW0.getLong(15);
                        long j6 = x8cVarW0.getLong(16);
                        us0 us0VarR = gcc.r((int) x8cVarW0.getLong(i2));
                        long j7 = x8cVarW0.getLong(18);
                        long j8 = x8cVarW0.getLong(19);
                        int i17 = (int) x8cVarW0.getLong(20);
                        long j9 = x8cVarW0.getLong(21);
                        int i18 = (int) x8cVarW0.getLong(22);
                        jl2 jl2Var = new jl2(gcc.F(x8cVarW0.getBlob(6)), gcc.s((int) x8cVarW0.getLong(5)), ((int) x8cVarW0.getLong(7)) != 0, ((int) x8cVarW0.getLong(8)) != 0, ((int) x8cVarW0.getLong(9)) != 0, ((int) x8cVarW0.getLong(10)) != 0, x8cVarW0.getLong(11), x8cVarW0.getLong(12), gcc.e(x8cVarW0.getBlob(13)));
                        Object objB2 = bm8.B(kd0Var, x8cVarW0.t0(0));
                        objB2.getClass();
                        List list4 = (List) objB2;
                        Object objB3 = bm8.B(kd0Var2, x8cVarW0.t0(0));
                        objB3.getClass();
                        arrayList5.add(new kbg(strT2, vagVarU, bb3VarW, j4, j5, j6, jl2Var, i15, us0VarR, j7, j8, i17, i16, j9, i18, list4, (List) objB3));
                        i2 = 17;
                        i9 = 1;
                        i6 = 4;
                        i7 = 2;
                        break;
                    }
                    return arrayList5;
                } finally {
                    x8cVarW0.close();
                }
        }
    }
}

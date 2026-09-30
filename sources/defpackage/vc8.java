package defpackage;

import ai.askquin.datastore.model.InternalAnnualReportProgress;
import ai.askquin.datastore.model.LocalStorage;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vc8 implements xj5 {
    public final /* synthetic */ xj5 a;

    public vc8(xj5 xj5Var, gd8 gd8Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        uc8 uc8Var;
        p40 p40Var;
        if (xn2Var instanceof uc8) {
            uc8Var = (uc8) xn2Var;
            int i = uc8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uc8Var.label = i - Integer.MIN_VALUE;
            } else {
                uc8Var = new uc8(this, xn2Var);
            }
        } else {
            uc8Var = new uc8(this, xn2Var);
        }
        Object obj2 = uc8Var.result;
        int i2 = uc8Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            LocalStorage localStorage = (LocalStorage) obj;
            List<String> visitedDays = localStorage.getVisitedDays();
            List<String> visitedEventIds = localStorage.getVisitedEventIds();
            List<String> consumedDailyMonthEventIds = localStorage.getConsumedDailyMonthEventIds();
            List<String> drawFreeSingleCardDays = localStorage.getDrawFreeSingleCardDays();
            boolean hasNewMessage = localStorage.getHasNewMessage();
            int openTimes = localStorage.getOpenTimes();
            boolean visitedSkinBanner = localStorage.getVisitedSkinBanner();
            String lastExpirationAlertDate = localStorage.getLastExpirationAlertDate();
            ma8 ma8VarA = lastExpirationAlertDate != null ? ka8.a(ma8.Companion, lastExpirationAlertDate) : null;
            String discountStartDateTime = localStorage.getDiscountStartDateTime();
            va8 va8VarA = discountStartDateTime != null ? ta8.a(va8.Companion, discountStartDateTime) : null;
            boolean visitedGuide = localStorage.getVisitedGuide();
            List<String> divinationCompletedDates = localStorage.getDivinationCompletedDates();
            int dailyFortuneCompletedCount = localStorage.getDailyFortuneCompletedCount();
            String lastDailyFortuneCompletedDate = localStorage.getLastDailyFortuneCompletedDate();
            ma8 ma8VarA2 = lastDailyFortuneCompletedDate != null ? ka8.a(ma8.Companion, lastDailyFortuneCompletedDate) : null;
            List listJ1 = s72.j1(s72.n1(s72.Q0(localStorage.getDailyFortuneCompletedDates(), t72.J(localStorage.getLastDailyFortuneCompletedDate()))));
            String lastDailyFortuneCompletionEventDate = localStorage.getLastDailyFortuneCompletionEventDate();
            ma8 ma8VarA3 = lastDailyFortuneCompletionEventDate != null ? ka8.a(ma8.Companion, lastDailyFortuneCompletionEventDate) : null;
            boolean firstDailyFortuneCompleted = localStorage.getFirstDailyFortuneCompleted();
            boolean firstDivinationCompletedSinceUpdate = localStorage.getFirstDivinationCompletedSinceUpdate();
            InternalAnnualReportProgress annualReportProgress = localStorage.getAnnualReportProgress();
            if (annualReportProgress != null) {
                String routeKey = annualReportProgress.getRouteKey();
                w57 w57Var = w57.a;
                p40Var = new p40(routeKey, mh3.x(annualReportProgress.getSavedAt()));
            } else {
                p40Var = null;
            }
            lb8 lb8Var = new lb8(visitedDays, visitedEventIds, consumedDailyMonthEventIds, drawFreeSingleCardDays, hasNewMessage, openTimes, visitedSkinBanner, ma8VarA, va8VarA, visitedGuide, divinationCompletedDates, dailyFortuneCompletedCount, ma8VarA2, listJ1, ma8VarA3, firstDailyFortuneCompleted, firstDivinationCompletedSinceUpdate, p40Var, localStorage.getDailyFortuneSkinType(), localStorage.getSkinUsageHistory(), localStorage.getDailyFortuneSkinPerDate(), localStorage.getDailyFortuneSkinBackfilled());
            uc8Var.L$0 = null;
            uc8Var.L$1 = null;
            uc8Var.L$2 = null;
            uc8Var.L$3 = null;
            uc8Var.label = 1;
            Object objA = this.a.a(lb8Var, uc8Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}

package ai.askquin.datastore.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.eg8;
import defpackage.ib8;
import defpackage.kb8;
import defpackage.lw7;
import defpackage.n3d;
import defpackage.nyc;
import defpackage.ov7;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.qh6;
import defpackage.qu4;
import defpackage.rp3;
import defpackage.s72;
import defpackage.t72;
import defpackage.tec;
import defpackage.tyc;
import defpackage.u87;
import defpackage.ub3;
import defpackage.w72;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u001e\n\u0002\b)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0081\b\u0018\u0000 \u007f2\u00020\u0001:\u0004\u0080\u0001\u0081\u0001B«\u0002\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 B£\u0002\b\u0010\u0012\u0006\u0010!\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0003¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0003¢\u0006\u0004\b)\u0010'J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0003¢\u0006\u0004\b*\u0010'J\u0015\u0010+\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0003¢\u0006\u0004\b+\u0010'J\r\u0010,\u001a\u00020\u0000¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0003¢\u0006\u0004\b.\u0010'J\r\u0010/\u001a\u00020\u0000¢\u0006\u0004\b/\u0010-J\u0015\u00100\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0003¢\u0006\u0004\b0\u0010'J\u001b\u00103\u001a\u00020\u00002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000301¢\u0006\u0004\b3\u00104J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b5\u00106J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b7\u00106J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b8\u00106J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b9\u00106J\u0010\u0010:\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b>\u0010;J\u0012\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bA\u0010@J\u0010\u0010B\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bB\u0010;J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\bC\u00106J\u0010\u0010D\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bD\u0010=J\u0012\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bE\u0010@J\u0016\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\bF\u00106J\u0012\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bG\u0010@J\u0010\u0010H\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bH\u0010;J\u0010\u0010I\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bI\u0010;J\u0012\u0010J\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bL\u0010@J\u001c\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0003¢\u0006\u0004\bM\u0010NJ\u001c\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003¢\u0006\u0004\bO\u0010NJ\u0010\u0010P\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bP\u0010;J´\u0002\u0010Q\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001a2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\bHÆ\u0001¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bS\u0010@J\u0010\u0010T\u001a\u00020\nHÖ\u0001¢\u0006\u0004\bT\u0010=J\u001a\u0010V\u001a\u00020\b2\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bV\u0010WJ\u0013\u0010X\u001a\u00020\b*\u00020\nH\u0002¢\u0006\u0004\bX\u0010YJ'\u0010b\u001a\u00020_2\u0006\u0010Z\u001a\u00020\u00002\u0006\u0010\\\u001a\u00020[2\u0006\u0010^\u001a\u00020]H\u0001¢\u0006\u0004\b`\u0010aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010c\u001a\u0004\bd\u00106R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010c\u001a\u0004\be\u00106R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010c\u001a\u0004\bf\u00106R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010c\u001a\u0004\bg\u00106R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010h\u001a\u0004\bi\u0010;R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010j\u001a\u0004\bk\u0010=R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010h\u001a\u0004\bl\u0010;R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010m\u001a\u0004\bn\u0010@R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010m\u001a\u0004\bo\u0010@R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010h\u001a\u0004\bp\u0010;R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010c\u001a\u0004\bq\u00106R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010j\u001a\u0004\br\u0010=R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010m\u001a\u0004\bs\u0010@R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010c\u001a\u0004\bt\u00106R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010m\u001a\u0004\bu\u0010@R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010h\u001a\u0004\bv\u0010;R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010h\u001a\u0004\bw\u0010;R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010x\u001a\u0004\by\u0010KR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010m\u001a\u0004\bz\u0010@R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010{\u001a\u0004\b|\u0010NR#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001a8\u0006¢\u0006\f\n\u0004\b\u001d\u0010{\u001a\u0004\b}\u0010NR\u0017\u0010\u001e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010h\u001a\u0004\b~\u0010;¨\u0006\u0082\u0001"}, d2 = {"Lai/askquin/datastore/model/LocalStorage;", "", "", "", "visitedDays", "visitedEventIds", "consumedDailyMonthEventIds", "drawFreeSingleCardDays", "", "hasNewMessage", "", "openTimes", "visitedSkinBanner", "lastExpirationAlertDate", "discountStartDateTime", "visitedGuide", "divinationCompletedDates", "dailyFortuneCompletedCount", "lastDailyFortuneCompletedDate", "dailyFortuneCompletedDates", "lastDailyFortuneCompletionEventDate", "firstDailyFortuneCompleted", "firstDivinationCompletedSinceUpdate", "Lai/askquin/datastore/model/InternalAnnualReportProgress;", "annualReportProgress", "dailyFortuneSkinType", "", "", "skinUsageHistory", "dailyFortuneSkinPerDate", "dailyFortuneSkinBackfilled", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZIZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;ZZLai/askquin/datastore/model/InternalAnnualReportProgress;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Z)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZIZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;ZZLai/askquin/datastore/model/InternalAnnualReportProgress;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ZLxyc;)V", "date", "addVisitedDate", "(Ljava/lang/String;)Lai/askquin/datastore/model/LocalStorage;", "eventId", "addVisitedEventId", "addConsumedDailyMonthEventId", "addDrawFreeSingleCardDay", "increaseOpenTimeAndUpdateEventIds", "()Lai/askquin/datastore/model/LocalStorage;", "addDivinationCompletedDate", "incDailyFortuneCompletedCount", "addDailyFortuneCompletedDate", "", "dates", "mergeDailyFortuneCompletedDates", "(Ljava/util/Collection;)Lai/askquin/datastore/model/LocalStorage;", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "()Z", "component6", "()I", "component7", "component8", "()Ljava/lang/String;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "()Lai/askquin/datastore/model/InternalAnnualReportProgress;", "component19", "component20", "()Ljava/util/Map;", "component21", "component22", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZIZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;ZZLai/askquin/datastore/model/InternalAnnualReportProgress;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Z)Lai/askquin/datastore/model/LocalStorage;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "isPowerOf2", "(I)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_datastore_release", "(Lai/askquin/datastore/model/LocalStorage;Lag2;Lnyc;)V", "write$Self", "Ljava/util/List;", "getVisitedDays", "getVisitedEventIds", "getConsumedDailyMonthEventIds", "getDrawFreeSingleCardDays", "Z", "getHasNewMessage", "I", "getOpenTimes", "getVisitedSkinBanner", "Ljava/lang/String;", "getLastExpirationAlertDate", "getDiscountStartDateTime", "getVisitedGuide", "getDivinationCompletedDates", "getDailyFortuneCompletedCount", "getLastDailyFortuneCompletedDate", "getDailyFortuneCompletedDates", "getLastDailyFortuneCompletionEventDate", "getFirstDailyFortuneCompleted", "getFirstDivinationCompletedSinceUpdate", "Lai/askquin/datastore/model/InternalAnnualReportProgress;", "getAnnualReportProgress", "getDailyFortuneSkinType", "Ljava/util/Map;", "getSkinUsageHistory", "getDailyFortuneSkinPerDate", "getDailyFortuneSkinBackfilled", "Companion", "kb8", "jb8", "Quin.core:datastore_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class LocalStorage {
    private static final lw7[] $childSerializers;
    public static final kb8 Companion = new kb8();
    private static final int MAX_DAILY_FORTUNE_DATES = 90;
    private static final int MAX_DIVINATION_DATES = 90;
    private final InternalAnnualReportProgress annualReportProgress;
    private final List<String> consumedDailyMonthEventIds;
    private final int dailyFortuneCompletedCount;
    private final List<String> dailyFortuneCompletedDates;
    private final boolean dailyFortuneSkinBackfilled;
    private final Map<String, String> dailyFortuneSkinPerDate;
    private final String dailyFortuneSkinType;
    private final String discountStartDateTime;
    private final List<String> divinationCompletedDates;
    private final List<String> drawFreeSingleCardDays;
    private final boolean firstDailyFortuneCompleted;
    private final boolean firstDivinationCompletedSinceUpdate;
    private final boolean hasNewMessage;
    private final String lastDailyFortuneCompletedDate;
    private final String lastDailyFortuneCompletionEventDate;
    private final String lastExpirationAlertDate;
    private final int openTimes;
    private final Map<String, Long> skinUsageHistory;
    private final List<String> visitedDays;
    private final List<String> visitedEventIds;
    private final boolean visitedGuide;
    private final boolean visitedSkinBanner;

    static {
        ov7 ov7Var = new ov7(17);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{eb3.N(z18Var, ov7Var), eb3.N(z18Var, new ov7(18)), eb3.N(z18Var, new ov7(19)), eb3.N(z18Var, new ov7(20)), null, null, null, null, null, null, eb3.N(z18Var, new ov7(21)), null, null, eb3.N(z18Var, new ov7(22)), null, null, null, null, null, eb3.N(z18Var, new ov7(23)), eb3.N(z18Var, new ov7(24)), null};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LocalStorage(List list, List list2, List list3, List list4, boolean z, int i, boolean z2, String str, String str2, boolean z3, List list5, int i2, String str3, List list6, String str4, boolean z4, boolean z5, InternalAnnualReportProgress internalAnnualReportProgress, String str5, Map map, Map map2, boolean z6, int i3, rp3 rp3Var) {
        int i4 = i3 & 1;
        List list7 = pu4.a;
        List list8 = i4 != 0 ? list7 : list;
        List list9 = (i3 & 2) != 0 ? list7 : list2;
        List list10 = (i3 & 4) != 0 ? list7 : list3;
        List list11 = (i3 & 8) != 0 ? list7 : list4;
        boolean z7 = (i3 & 16) != 0 ? false : z;
        int i5 = (i3 & 32) != 0 ? 0 : i;
        boolean z8 = (i3 & 64) != 0 ? false : z2;
        String str6 = (i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : str;
        String str7 = (i3 & 256) != 0 ? null : str2;
        boolean z9 = (i3 & 512) != 0 ? false : z3;
        List list12 = (i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? list7 : list5;
        int i6 = (i3 & 2048) != 0 ? 0 : i2;
        String str8 = (i3 & 4096) != 0 ? null : str3;
        list7 = (i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0 ? list6 : list7;
        String str9 = (i3 & 16384) != 0 ? null : str4;
        boolean z10 = (i3 & 32768) != 0 ? false : z4;
        boolean z11 = (i3 & 65536) != 0 ? false : z5;
        InternalAnnualReportProgress internalAnnualReportProgress2 = (i3 & 131072) != 0 ? null : internalAnnualReportProgress;
        String str10 = (i3 & 262144) != 0 ? null : str5;
        int i7 = i3 & 524288;
        Map map3 = qu4.a;
        this(list8, list9, list10, list11, z7, i5, z8, str6, str7, z9, list12, i6, str8, list7, str9, z10, z11, internalAnnualReportProgress2, str10, i7 != 0 ? map3 : map, (i3 & 1048576) == 0 ? map2 : map3, (i3 & 2097152) != 0 ? false : z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(p4e.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(p4e.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$1() {
        return new dd0(p4e.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$2() {
        return new dd0(p4e.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$3() {
        return new dd0(p4e.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$4() {
        return new dd0(p4e.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$5() {
        return new qh6(p4e.a, eg8.a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$6() {
        p4e p4eVar = p4e.a;
        return new qh6(p4eVar, p4eVar, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalStorage copy$default(LocalStorage localStorage, List list, List list2, List list3, List list4, boolean z, int i, boolean z2, String str, String str2, boolean z3, List list5, int i2, String str3, List list6, String str4, boolean z4, boolean z5, InternalAnnualReportProgress internalAnnualReportProgress, String str5, Map map, Map map2, boolean z6, int i3, Object obj) {
        boolean z7;
        Map map3;
        List list7 = (i3 & 1) != 0 ? localStorage.visitedDays : list;
        List list8 = (i3 & 2) != 0 ? localStorage.visitedEventIds : list2;
        List list9 = (i3 & 4) != 0 ? localStorage.consumedDailyMonthEventIds : list3;
        List list10 = (i3 & 8) != 0 ? localStorage.drawFreeSingleCardDays : list4;
        boolean z8 = (i3 & 16) != 0 ? localStorage.hasNewMessage : z;
        int i4 = (i3 & 32) != 0 ? localStorage.openTimes : i;
        boolean z9 = (i3 & 64) != 0 ? localStorage.visitedSkinBanner : z2;
        String str6 = (i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? localStorage.lastExpirationAlertDate : str;
        String str7 = (i3 & 256) != 0 ? localStorage.discountStartDateTime : str2;
        boolean z10 = (i3 & 512) != 0 ? localStorage.visitedGuide : z3;
        List list11 = (i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? localStorage.divinationCompletedDates : list5;
        int i5 = (i3 & 2048) != 0 ? localStorage.dailyFortuneCompletedCount : i2;
        String str8 = (i3 & 4096) != 0 ? localStorage.lastDailyFortuneCompletedDate : str3;
        List list12 = (i3 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? localStorage.dailyFortuneCompletedDates : list6;
        List list13 = list7;
        String str9 = (i3 & 16384) != 0 ? localStorage.lastDailyFortuneCompletionEventDate : str4;
        boolean z11 = (i3 & 32768) != 0 ? localStorage.firstDailyFortuneCompleted : z4;
        boolean z12 = (i3 & 65536) != 0 ? localStorage.firstDivinationCompletedSinceUpdate : z5;
        InternalAnnualReportProgress internalAnnualReportProgress2 = (i3 & 131072) != 0 ? localStorage.annualReportProgress : internalAnnualReportProgress;
        String str10 = (i3 & 262144) != 0 ? localStorage.dailyFortuneSkinType : str5;
        Map map4 = (i3 & 524288) != 0 ? localStorage.skinUsageHistory : map;
        Map map5 = (i3 & 1048576) != 0 ? localStorage.dailyFortuneSkinPerDate : map2;
        if ((i3 & 2097152) != 0) {
            map3 = map5;
            z7 = localStorage.dailyFortuneSkinBackfilled;
        } else {
            z7 = z6;
            map3 = map5;
        }
        return localStorage.copy(list13, list8, list9, list10, z8, i4, z9, str6, str7, z10, list11, i5, str8, list12, str9, z11, z12, internalAnnualReportProgress2, str10, map4, map3, z7);
    }

    private final boolean isPowerOf2(int i) {
        return i >= 0 && i < Integer.MAX_VALUE && (i & (i + (-1))) == 0;
    }

    public static final /* synthetic */ void write$Self$Quin_core_datastore_release(LocalStorage self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        boolean zG = output.g(serialDesc);
        pu4 pu4Var = pu4.a;
        if (zG || !pa7.t(self.visitedDays, pu4Var)) {
            output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.visitedDays);
        }
        if (output.g(serialDesc) || !pa7.t(self.visitedEventIds, pu4Var)) {
            output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.visitedEventIds);
        }
        if (output.g(serialDesc) || !pa7.t(self.consumedDailyMonthEventIds, pu4Var)) {
            output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.consumedDailyMonthEventIds);
        }
        if (output.g(serialDesc) || !pa7.t(self.drawFreeSingleCardDays, pu4Var)) {
            output.p(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.drawFreeSingleCardDays);
        }
        if (output.g(serialDesc) || self.hasNewMessage) {
            output.o(serialDesc, 4, self.hasNewMessage);
        }
        if (output.g(serialDesc) || self.openTimes != 0) {
            output.v(5, self.openTimes, serialDesc);
        }
        if (output.g(serialDesc) || self.visitedSkinBanner) {
            output.o(serialDesc, 6, self.visitedSkinBanner);
        }
        if (output.g(serialDesc) || self.lastExpirationAlertDate != null) {
            output.A(serialDesc, 7, p4e.a, self.lastExpirationAlertDate);
        }
        if (output.g(serialDesc) || self.discountStartDateTime != null) {
            output.A(serialDesc, 8, p4e.a, self.discountStartDateTime);
        }
        if (output.g(serialDesc) || self.visitedGuide) {
            output.o(serialDesc, 9, self.visitedGuide);
        }
        if (output.g(serialDesc) || !pa7.t(self.divinationCompletedDates, pu4Var)) {
            output.p(serialDesc, 10, (xn7) lw7VarArr[10].getValue(), self.divinationCompletedDates);
        }
        if (output.g(serialDesc) || self.dailyFortuneCompletedCount != 0) {
            output.v(11, self.dailyFortuneCompletedCount, serialDesc);
        }
        if (output.g(serialDesc) || self.lastDailyFortuneCompletedDate != null) {
            output.A(serialDesc, 12, p4e.a, self.lastDailyFortuneCompletedDate);
        }
        if (output.g(serialDesc) || !pa7.t(self.dailyFortuneCompletedDates, pu4Var)) {
            output.p(serialDesc, 13, (xn7) lw7VarArr[13].getValue(), self.dailyFortuneCompletedDates);
        }
        if (output.g(serialDesc) || self.lastDailyFortuneCompletionEventDate != null) {
            output.A(serialDesc, 14, p4e.a, self.lastDailyFortuneCompletionEventDate);
        }
        if (output.g(serialDesc) || self.firstDailyFortuneCompleted) {
            output.o(serialDesc, 15, self.firstDailyFortuneCompleted);
        }
        if (output.g(serialDesc) || self.firstDivinationCompletedSinceUpdate) {
            output.o(serialDesc, 16, self.firstDivinationCompletedSinceUpdate);
        }
        if (output.g(serialDesc) || self.annualReportProgress != null) {
            output.A(serialDesc, 17, u87.a, self.annualReportProgress);
        }
        if (output.g(serialDesc) || self.dailyFortuneSkinType != null) {
            output.A(serialDesc, 18, p4e.a, self.dailyFortuneSkinType);
        }
        boolean zG2 = output.g(serialDesc);
        qu4 qu4Var = qu4.a;
        if (zG2 || !pa7.t(self.skinUsageHistory, qu4Var)) {
            output.p(serialDesc, 19, (xn7) lw7VarArr[19].getValue(), self.skinUsageHistory);
        }
        if (output.g(serialDesc) || !pa7.t(self.dailyFortuneSkinPerDate, qu4Var)) {
            output.p(serialDesc, 20, (xn7) lw7VarArr[20].getValue(), self.dailyFortuneSkinPerDate);
        }
        if (output.g(serialDesc) || self.dailyFortuneSkinBackfilled) {
            output.o(serialDesc, 21, self.dailyFortuneSkinBackfilled);
        }
    }

    public final LocalStorage addConsumedDailyMonthEventId(String eventId) {
        eventId.getClass();
        ArrayList arrayList = new ArrayList(s72.d1(50, this.consumedDailyMonthEventIds));
        if (!this.consumedDailyMonthEventIds.contains(eventId)) {
            arrayList.add(eventId);
        }
        return copy$default(this, null, null, arrayList, null, false, 0, false, null, null, false, null, 0, null, null, null, false, false, null, null, null, null, false, 4194299, null);
    }

    public final LocalStorage addDailyFortuneCompletedDate(String date) {
        date.getClass();
        Set setO1 = s72.o1(s72.Q0(this.dailyFortuneCompletedDates, t72.J(this.lastDailyFortuneCompletedDate)));
        if (setO1.contains(date)) {
            return this;
        }
        LocalStorage localStorageIncDailyFortuneCompletedCount = incDailyFortuneCompletedCount();
        List listD1 = s72.d1(90, s72.a1(n3d.n(setO1, date)));
        String str = this.lastDailyFortuneCompletedDate;
        if (str == null) {
            str = date;
        }
        return copy$default(localStorageIncDailyFortuneCompletedCount, null, null, null, null, false, 0, false, null, null, false, null, 0, str.compareTo(date) >= 0 ? str : date, listD1, null, false, false, null, null, null, null, false, 4182015, null);
    }

    public final LocalStorage addDivinationCompletedDate(String date) {
        date.getClass();
        return this.divinationCompletedDates.contains(date) ? this : copy$default(this, null, null, null, null, false, 0, false, null, null, false, s72.d1(90, s72.a1(s72.R0(this.divinationCompletedDates, date))), 0, null, null, null, false, false, null, null, null, null, false, 4193279, null);
    }

    public final LocalStorage addDrawFreeSingleCardDay(String date) {
        date.getClass();
        ArrayList arrayList = new ArrayList(s72.d1(50, this.drawFreeSingleCardDays));
        if (!this.drawFreeSingleCardDays.contains(date)) {
            arrayList.add(date);
        }
        return copy$default(this, null, null, null, arrayList, false, 0, false, null, null, false, null, 0, null, null, null, false, false, null, null, null, null, false, 4194295, null);
    }

    public final LocalStorage addVisitedDate(String date) {
        date.getClass();
        ArrayList arrayListL1 = s72.l1(this.visitedDays);
        if (!this.visitedDays.contains(date)) {
            arrayListL1.add(date);
        }
        w72.e0(arrayListL1);
        if (arrayListL1.size() > 2) {
            arrayListL1.remove(0);
        }
        return copy$default(this, arrayListL1, null, null, null, false, 0, false, null, null, false, null, 0, null, null, null, false, false, null, null, null, null, false, 4194302, null);
    }

    public final LocalStorage addVisitedEventId(String eventId) {
        eventId.getClass();
        ArrayList arrayListL1 = s72.l1(this.visitedEventIds);
        if (!this.visitedEventIds.contains(eventId)) {
            arrayListL1.add(eventId);
        }
        return copy$default(this, null, arrayListL1, null, null, false, 0, false, null, null, false, null, 0, null, null, null, false, false, null, null, null, null, false, 4194301, null);
    }

    public final List<String> component1() {
        return this.visitedDays;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getVisitedGuide() {
        return this.visitedGuide;
    }

    public final List<String> component11() {
        return this.divinationCompletedDates;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getDailyFortuneCompletedCount() {
        return this.dailyFortuneCompletedCount;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLastDailyFortuneCompletedDate() {
        return this.lastDailyFortuneCompletedDate;
    }

    public final List<String> component14() {
        return this.dailyFortuneCompletedDates;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getLastDailyFortuneCompletionEventDate() {
        return this.lastDailyFortuneCompletionEventDate;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getFirstDailyFortuneCompleted() {
        return this.firstDailyFortuneCompleted;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getFirstDivinationCompletedSinceUpdate() {
        return this.firstDivinationCompletedSinceUpdate;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final InternalAnnualReportProgress getAnnualReportProgress() {
        return this.annualReportProgress;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getDailyFortuneSkinType() {
        return this.dailyFortuneSkinType;
    }

    public final List<String> component2() {
        return this.visitedEventIds;
    }

    public final Map<String, Long> component20() {
        return this.skinUsageHistory;
    }

    public final Map<String, String> component21() {
        return this.dailyFortuneSkinPerDate;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getDailyFortuneSkinBackfilled() {
        return this.dailyFortuneSkinBackfilled;
    }

    public final List<String> component3() {
        return this.consumedDailyMonthEventIds;
    }

    public final List<String> component4() {
        return this.drawFreeSingleCardDays;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getHasNewMessage() {
        return this.hasNewMessage;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getOpenTimes() {
        return this.openTimes;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getVisitedSkinBanner() {
        return this.visitedSkinBanner;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLastExpirationAlertDate() {
        return this.lastExpirationAlertDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDiscountStartDateTime() {
        return this.discountStartDateTime;
    }

    public final LocalStorage copy(List<String> visitedDays, List<String> visitedEventIds, List<String> consumedDailyMonthEventIds, List<String> drawFreeSingleCardDays, boolean hasNewMessage, int openTimes, boolean visitedSkinBanner, String lastExpirationAlertDate, String discountStartDateTime, boolean visitedGuide, List<String> divinationCompletedDates, int dailyFortuneCompletedCount, String lastDailyFortuneCompletedDate, List<String> dailyFortuneCompletedDates, String lastDailyFortuneCompletionEventDate, boolean firstDailyFortuneCompleted, boolean firstDivinationCompletedSinceUpdate, InternalAnnualReportProgress annualReportProgress, String dailyFortuneSkinType, Map<String, Long> skinUsageHistory, Map<String, String> dailyFortuneSkinPerDate, boolean dailyFortuneSkinBackfilled) {
        visitedDays.getClass();
        visitedEventIds.getClass();
        consumedDailyMonthEventIds.getClass();
        drawFreeSingleCardDays.getClass();
        divinationCompletedDates.getClass();
        dailyFortuneCompletedDates.getClass();
        skinUsageHistory.getClass();
        dailyFortuneSkinPerDate.getClass();
        return new LocalStorage(visitedDays, visitedEventIds, consumedDailyMonthEventIds, drawFreeSingleCardDays, hasNewMessage, openTimes, visitedSkinBanner, lastExpirationAlertDate, discountStartDateTime, visitedGuide, divinationCompletedDates, dailyFortuneCompletedCount, lastDailyFortuneCompletedDate, dailyFortuneCompletedDates, lastDailyFortuneCompletionEventDate, firstDailyFortuneCompleted, firstDivinationCompletedSinceUpdate, annualReportProgress, dailyFortuneSkinType, skinUsageHistory, dailyFortuneSkinPerDate, dailyFortuneSkinBackfilled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalStorage)) {
            return false;
        }
        LocalStorage localStorage = (LocalStorage) other;
        return pa7.t(this.visitedDays, localStorage.visitedDays) && pa7.t(this.visitedEventIds, localStorage.visitedEventIds) && pa7.t(this.consumedDailyMonthEventIds, localStorage.consumedDailyMonthEventIds) && pa7.t(this.drawFreeSingleCardDays, localStorage.drawFreeSingleCardDays) && this.hasNewMessage == localStorage.hasNewMessage && this.openTimes == localStorage.openTimes && this.visitedSkinBanner == localStorage.visitedSkinBanner && pa7.t(this.lastExpirationAlertDate, localStorage.lastExpirationAlertDate) && pa7.t(this.discountStartDateTime, localStorage.discountStartDateTime) && this.visitedGuide == localStorage.visitedGuide && pa7.t(this.divinationCompletedDates, localStorage.divinationCompletedDates) && this.dailyFortuneCompletedCount == localStorage.dailyFortuneCompletedCount && pa7.t(this.lastDailyFortuneCompletedDate, localStorage.lastDailyFortuneCompletedDate) && pa7.t(this.dailyFortuneCompletedDates, localStorage.dailyFortuneCompletedDates) && pa7.t(this.lastDailyFortuneCompletionEventDate, localStorage.lastDailyFortuneCompletionEventDate) && this.firstDailyFortuneCompleted == localStorage.firstDailyFortuneCompleted && this.firstDivinationCompletedSinceUpdate == localStorage.firstDivinationCompletedSinceUpdate && pa7.t(this.annualReportProgress, localStorage.annualReportProgress) && pa7.t(this.dailyFortuneSkinType, localStorage.dailyFortuneSkinType) && pa7.t(this.skinUsageHistory, localStorage.skinUsageHistory) && pa7.t(this.dailyFortuneSkinPerDate, localStorage.dailyFortuneSkinPerDate) && this.dailyFortuneSkinBackfilled == localStorage.dailyFortuneSkinBackfilled;
    }

    public final InternalAnnualReportProgress getAnnualReportProgress() {
        return this.annualReportProgress;
    }

    public final List<String> getConsumedDailyMonthEventIds() {
        return this.consumedDailyMonthEventIds;
    }

    public final int getDailyFortuneCompletedCount() {
        return this.dailyFortuneCompletedCount;
    }

    public final List<String> getDailyFortuneCompletedDates() {
        return this.dailyFortuneCompletedDates;
    }

    public final boolean getDailyFortuneSkinBackfilled() {
        return this.dailyFortuneSkinBackfilled;
    }

    public final Map<String, String> getDailyFortuneSkinPerDate() {
        return this.dailyFortuneSkinPerDate;
    }

    public final String getDailyFortuneSkinType() {
        return this.dailyFortuneSkinType;
    }

    public final String getDiscountStartDateTime() {
        return this.discountStartDateTime;
    }

    public final List<String> getDivinationCompletedDates() {
        return this.divinationCompletedDates;
    }

    public final List<String> getDrawFreeSingleCardDays() {
        return this.drawFreeSingleCardDays;
    }

    public final boolean getFirstDailyFortuneCompleted() {
        return this.firstDailyFortuneCompleted;
    }

    public final boolean getFirstDivinationCompletedSinceUpdate() {
        return this.firstDivinationCompletedSinceUpdate;
    }

    public final boolean getHasNewMessage() {
        return this.hasNewMessage;
    }

    public final String getLastDailyFortuneCompletedDate() {
        return this.lastDailyFortuneCompletedDate;
    }

    public final String getLastDailyFortuneCompletionEventDate() {
        return this.lastDailyFortuneCompletionEventDate;
    }

    public final String getLastExpirationAlertDate() {
        return this.lastExpirationAlertDate;
    }

    public final int getOpenTimes() {
        return this.openTimes;
    }

    public final Map<String, Long> getSkinUsageHistory() {
        return this.skinUsageHistory;
    }

    public final List<String> getVisitedDays() {
        return this.visitedDays;
    }

    public final List<String> getVisitedEventIds() {
        return this.visitedEventIds;
    }

    public final boolean getVisitedGuide() {
        return this.visitedGuide;
    }

    public final boolean getVisitedSkinBanner() {
        return this.visitedSkinBanner;
    }

    public int hashCode() {
        int iD = ub3.d(ub3.b(this.openTimes, ub3.d(tec.a(tec.a(tec.a(this.visitedDays.hashCode() * 31, 31, this.visitedEventIds), 31, this.consumedDailyMonthEventIds), 31, this.drawFreeSingleCardDays), 31, this.hasNewMessage), 31), 31, this.visitedSkinBanner);
        String str = this.lastExpirationAlertDate;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.discountStartDateTime;
        int iB = ub3.b(this.dailyFortuneCompletedCount, tec.a(ub3.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.visitedGuide), 31, this.divinationCompletedDates), 31);
        String str3 = this.lastDailyFortuneCompletedDate;
        int iA = tec.a((iB + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.dailyFortuneCompletedDates);
        String str4 = this.lastDailyFortuneCompletionEventDate;
        int iD2 = ub3.d(ub3.d((iA + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.firstDailyFortuneCompleted), 31, this.firstDivinationCompletedSinceUpdate);
        InternalAnnualReportProgress internalAnnualReportProgress = this.annualReportProgress;
        int iHashCode2 = (iD2 + (internalAnnualReportProgress == null ? 0 : internalAnnualReportProgress.hashCode())) * 31;
        String str5 = this.dailyFortuneSkinType;
        return Boolean.hashCode(this.dailyFortuneSkinBackfilled) + ib8.c(this.dailyFortuneSkinPerDate, ib8.c(this.skinUsageHistory, (iHashCode2 + (str5 != null ? str5.hashCode() : 0)) * 31, 31), 31);
    }

    public final LocalStorage incDailyFortuneCompletedCount() {
        int i = this.dailyFortuneCompletedCount;
        return copy$default(this, null, null, null, null, false, 0, false, null, null, false, null, i < Integer.MAX_VALUE ? i + 1 : Integer.MAX_VALUE, null, null, null, false, false, null, null, null, null, false, 4192255, null);
    }

    public final LocalStorage increaseOpenTimeAndUpdateEventIds() {
        int i = this.openTimes + 1;
        int i2 = i > Integer.MAX_VALUE ? Integer.MAX_VALUE : i;
        if (!isPowerOf2(i2)) {
            return copy$default(this, null, null, null, null, false, i2, false, null, null, false, null, 0, null, null, null, false, false, null, null, null, null, false, 4194271, null);
        }
        if (!this.visitedEventIds.contains("popup_invite-new-user")) {
            return copy$default(this, null, null, null, null, false, i2, false, null, null, false, null, 0, null, null, null, false, false, null, null, null, null, false, 4194271, null);
        }
        ArrayList arrayListL1 = s72.l1(this.visitedEventIds);
        arrayListL1.remove("popup_invite-new-user");
        return copy$default(this, null, arrayListL1, null, null, false, i2, false, null, null, false, null, 0, null, null, null, false, false, null, null, null, null, false, 4194269, null);
    }

    public final LocalStorage mergeDailyFortuneCompletedDates(Collection<String> dates) {
        dates.getClass();
        if (!dates.isEmpty()) {
            List listD1 = s72.d1(90, s72.a1(s72.j1(s72.n1(s72.Q0(s72.Q0(this.dailyFortuneCompletedDates, t72.J(this.lastDailyFortuneCompletedDate)), dates)))));
            if (!listD1.equals(this.dailyFortuneCompletedDates)) {
                return copy$default(this, null, null, null, null, false, 0, false, null, null, false, null, 0, null, listD1, null, false, false, null, null, null, null, false, 4186111, null);
            }
        }
        return this;
    }

    public String toString() {
        List<String> list = this.visitedDays;
        List<String> list2 = this.visitedEventIds;
        List<String> list3 = this.consumedDailyMonthEventIds;
        List<String> list4 = this.drawFreeSingleCardDays;
        boolean z = this.hasNewMessage;
        int i = this.openTimes;
        boolean z2 = this.visitedSkinBanner;
        String str = this.lastExpirationAlertDate;
        String str2 = this.discountStartDateTime;
        boolean z3 = this.visitedGuide;
        List<String> list5 = this.divinationCompletedDates;
        int i2 = this.dailyFortuneCompletedCount;
        String str3 = this.lastDailyFortuneCompletedDate;
        List<String> list6 = this.dailyFortuneCompletedDates;
        String str4 = this.lastDailyFortuneCompletionEventDate;
        boolean z4 = this.firstDailyFortuneCompleted;
        boolean z5 = this.firstDivinationCompletedSinceUpdate;
        InternalAnnualReportProgress internalAnnualReportProgress = this.annualReportProgress;
        String str5 = this.dailyFortuneSkinType;
        Map<String, Long> map = this.skinUsageHistory;
        Map<String, String> map2 = this.dailyFortuneSkinPerDate;
        boolean z6 = this.dailyFortuneSkinBackfilled;
        StringBuilder sb = new StringBuilder("LocalStorage(visitedDays=");
        sb.append(list);
        sb.append(", visitedEventIds=");
        sb.append(list2);
        sb.append(", consumedDailyMonthEventIds=");
        sb.append(list3);
        sb.append(", drawFreeSingleCardDays=");
        sb.append(list4);
        sb.append(", hasNewMessage=");
        sb.append(z);
        sb.append(", openTimes=");
        sb.append(i);
        sb.append(", visitedSkinBanner=");
        sb.append(z2);
        sb.append(", lastExpirationAlertDate=");
        sb.append(str);
        sb.append(", discountStartDateTime=");
        sb.append(str2);
        sb.append(", visitedGuide=");
        sb.append(z3);
        sb.append(", divinationCompletedDates=");
        sb.append(list5);
        sb.append(", dailyFortuneCompletedCount=");
        sb.append(i2);
        sb.append(", lastDailyFortuneCompletedDate=");
        ib8.v(sb, str3, ", dailyFortuneCompletedDates=", list6, ", lastDailyFortuneCompletionEventDate=");
        sb.append(str4);
        sb.append(", firstDailyFortuneCompleted=");
        sb.append(z4);
        sb.append(", firstDivinationCompletedSinceUpdate=");
        sb.append(z5);
        sb.append(", annualReportProgress=");
        sb.append(internalAnnualReportProgress);
        sb.append(", dailyFortuneSkinType=");
        sb.append(str5);
        sb.append(", skinUsageHistory=");
        sb.append(map);
        sb.append(", dailyFortuneSkinPerDate=");
        sb.append(map2);
        sb.append(", dailyFortuneSkinBackfilled=");
        sb.append(z6);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ LocalStorage(int i, List list, List list2, List list3, List list4, boolean z, int i2, boolean z2, String str, String str2, boolean z3, List list5, int i3, String str3, List list6, String str4, boolean z4, boolean z5, InternalAnnualReportProgress internalAnnualReportProgress, String str5, Map map, Map map2, boolean z6, xyc xycVar) {
        int i4 = i & 1;
        pu4 pu4Var = pu4.a;
        if (i4 == 0) {
            this.visitedDays = pu4Var;
        } else {
            this.visitedDays = list;
        }
        if ((i & 2) == 0) {
            this.visitedEventIds = pu4Var;
        } else {
            this.visitedEventIds = list2;
        }
        if ((i & 4) == 0) {
            this.consumedDailyMonthEventIds = pu4Var;
        } else {
            this.consumedDailyMonthEventIds = list3;
        }
        if ((i & 8) == 0) {
            this.drawFreeSingleCardDays = pu4Var;
        } else {
            this.drawFreeSingleCardDays = list4;
        }
        if ((i & 16) == 0) {
            this.hasNewMessage = false;
        } else {
            this.hasNewMessage = z;
        }
        if ((i & 32) == 0) {
            this.openTimes = 0;
        } else {
            this.openTimes = i2;
        }
        if ((i & 64) == 0) {
            this.visitedSkinBanner = false;
        } else {
            this.visitedSkinBanner = z2;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.lastExpirationAlertDate = null;
        } else {
            this.lastExpirationAlertDate = str;
        }
        if ((i & 256) == 0) {
            this.discountStartDateTime = null;
        } else {
            this.discountStartDateTime = str2;
        }
        if ((i & 512) == 0) {
            this.visitedGuide = false;
        } else {
            this.visitedGuide = z3;
        }
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
            this.divinationCompletedDates = pu4Var;
        } else {
            this.divinationCompletedDates = list5;
        }
        if ((i & 2048) == 0) {
            this.dailyFortuneCompletedCount = 0;
        } else {
            this.dailyFortuneCompletedCount = i3;
        }
        if ((i & 4096) == 0) {
            this.lastDailyFortuneCompletedDate = null;
        } else {
            this.lastDailyFortuneCompletedDate = str3;
        }
        if ((i & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) {
            this.dailyFortuneCompletedDates = pu4Var;
        } else {
            this.dailyFortuneCompletedDates = list6;
        }
        if ((i & 16384) == 0) {
            this.lastDailyFortuneCompletionEventDate = null;
        } else {
            this.lastDailyFortuneCompletionEventDate = str4;
        }
        if ((32768 & i) == 0) {
            this.firstDailyFortuneCompleted = false;
        } else {
            this.firstDailyFortuneCompleted = z4;
        }
        if ((65536 & i) == 0) {
            this.firstDivinationCompletedSinceUpdate = false;
        } else {
            this.firstDivinationCompletedSinceUpdate = z5;
        }
        if ((131072 & i) == 0) {
            this.annualReportProgress = null;
        } else {
            this.annualReportProgress = internalAnnualReportProgress;
        }
        if ((262144 & i) == 0) {
            this.dailyFortuneSkinType = null;
        } else {
            this.dailyFortuneSkinType = str5;
        }
        int i5 = 524288 & i;
        qu4 qu4Var = qu4.a;
        if (i5 == 0) {
            this.skinUsageHistory = qu4Var;
        } else {
            this.skinUsageHistory = map;
        }
        if ((1048576 & i) == 0) {
            this.dailyFortuneSkinPerDate = qu4Var;
        } else {
            this.dailyFortuneSkinPerDate = map2;
        }
        if ((i & 2097152) == 0) {
            this.dailyFortuneSkinBackfilled = false;
        } else {
            this.dailyFortuneSkinBackfilled = z6;
        }
    }

    public LocalStorage(List<String> list, List<String> list2, List<String> list3, List<String> list4, boolean z, int i, boolean z2, String str, String str2, boolean z3, List<String> list5, int i2, String str3, List<String> list6, String str4, boolean z4, boolean z5, InternalAnnualReportProgress internalAnnualReportProgress, String str5, Map<String, Long> map, Map<String, String> map2, boolean z6) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        map.getClass();
        map2.getClass();
        this.visitedDays = list;
        this.visitedEventIds = list2;
        this.consumedDailyMonthEventIds = list3;
        this.drawFreeSingleCardDays = list4;
        this.hasNewMessage = z;
        this.openTimes = i;
        this.visitedSkinBanner = z2;
        this.lastExpirationAlertDate = str;
        this.discountStartDateTime = str2;
        this.visitedGuide = z3;
        this.divinationCompletedDates = list5;
        this.dailyFortuneCompletedCount = i2;
        this.lastDailyFortuneCompletedDate = str3;
        this.dailyFortuneCompletedDates = list6;
        this.lastDailyFortuneCompletionEventDate = str4;
        this.firstDailyFortuneCompleted = z4;
        this.firstDivinationCompletedSinceUpdate = z5;
        this.annualReportProgress = internalAnnualReportProgress;
        this.dailyFortuneSkinType = str5;
        this.skinUsageHistory = map;
        this.dailyFortuneSkinPerDate = map2;
        this.dailyFortuneSkinBackfilled = z6;
    }

    public LocalStorage() {
        this((List) null, (List) null, (List) null, (List) null, false, 0, false, (String) null, (String) null, false, (List) null, 0, (String) null, (List) null, (String) null, false, false, (InternalAnnualReportProgress) null, (String) null, (Map) null, (Map) null, false, 4194303, (rp3) null);
    }
}
